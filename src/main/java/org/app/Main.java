package org.app;

import java.util.ArrayList;

class Main {

    public static int countPassengers(ArrayList<int[]> stops) {
        int length = stops.size();
        int hold=0;
        if(stops == null || stops.size() == 0) return 0;
        for(int i=1; i<length; i++){
            hold = hold + stops.get(i)[0];
        }
        return hold;
    }
}