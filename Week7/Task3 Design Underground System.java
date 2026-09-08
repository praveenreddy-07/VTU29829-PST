Problem Statement:
An underground railway system is keeping track of customer travel times between different stations. 
They are using this data to calculate the average time it takes to travel from one station to another.

  
Program:
import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    private Map<Integer, CheckInInfo> customerCheckIns;
    private Map<String, TravelInfo> travelStats;

    public UndergroundSystem() {
        customerCheckIns = new HashMap<>();
        travelStats = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        customerCheckIns.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInInfo checkInInfo = customerCheckIns.remove(id);
        String startStation = checkInInfo.stationName;
        int startTime = checkInInfo.time;
        String travelKey = startStation + "->" + stationName;

        TravelInfo stats = travelStats.getOrDefault(travelKey, new TravelInfo());
        stats.totalTime += (t - startTime);
        stats.tripCount++;
        travelStats.put(travelKey, stats);
    }

    public double getAverageTime(String startStation, String endStation) {
        String travelKey = startStation + "->" + endStation;
        TravelInfo stats = travelStats.get(travelKey);
        return (double) stats.totalTime / stats.tripCount;
    }

    private static class CheckInInfo {
        String stationName;
        int time;

        CheckInInfo(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    private static class TravelInfo {
        long totalTime = 0;
        int tripCount = 0;
    }
}
