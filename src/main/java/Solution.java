import java.util.*;

public class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (List<String> ticket: tickets) {
            if (!map.containsKey(ticket.get(0))) {
                map.put(ticket.get(0), new PriorityQueue<String>());
            }
           map.get(ticket.get(0)).add(ticket.get(1));
        }
        dfs("JFK", map, result);
        return result;
    }
    public static void dfs(String airPort, HashMap<String, PriorityQueue<String>> map, List<String> result) {
        while(map.containsKey(airPort) && !map.get(airPort).isEmpty()) {
            PriorityQueue<String> toAirports = map.get(airPort);
            String toAirport = toAirports.poll();
            dfs(toAirport, map, result);
        }
        result.add(0, airPort);
    }
}
