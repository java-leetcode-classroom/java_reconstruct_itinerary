import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    final private Solution sol = new Solution();
    @Test
    void findItineraryExample1() {
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), sol.findItinerary(
                List.of(
                        List.of("MUC", "LHR"),
                        List.of("JFK", "MUC"),
                        List.of("SFO", "SJC"),
                        List.of("LHR", "SFO")
                )));
    }

    @Test
    void findItineraryExample2() {
        assertEquals(List.of("JFK","ATL","JFK","SFO","ATL","SFO"), sol.findItinerary(
                List.of(
                        List.of("JFK","SFO"),
                        List.of("JFK","ATL"),
                        List.of("SFO","ATL"),
                        List.of("ATL","JFK"),
                        List.of("ATL","SFO")
                )));
    }
    @Test
    void findItineraryExample3() {
        assertEquals(List.of("JFK","AXA","AUA","ADL","ANU","AUA","ANU","EZE","ADL","EZE","ANU","JFK","AXA","EZE","TIA","AUA","AXA","TIA","ADL","EZE","HBA"), sol.findItinerary(
                List.of(
                        List.of("EZE","TIA"),
                        List.of("EZE","HBA"),
                        List.of("AXA","TIA"),
                        List.of("JFK","AXA"),
                        List.of("ANU","JFK"),
                        List.of("ADL","ANU"),
                        List.of("TIA","AUA"),
                        List.of("ANU","AUA"),
                        List.of("ADL","EZE"),
                        List.of("ADL","EZE"),
                        List.of("EZE","ADL"),
                        List.of("AXA","EZE"),
                        List.of("AUA","AXA"),
                        List.of("JFK","AXA"),
                        List.of("AXA","AUA"),
                        List.of("AUA","ADL"),
                        List.of("ANU","EZE"),
                        List.of("TIA","ADL"),
                        List.of("EZE","ANU"),
                        List.of("AUA","ANU")
                )
        ));
    }
}