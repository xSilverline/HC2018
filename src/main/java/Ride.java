package java;

//DTO for storing rides read from input file
public class Ride {
    //Start pos
    int start_x;
    int start_y;
    //End pos
    int end_x;
    int end_y;
    //Earliest start
    int start;
    //Latest end
    int end;

    public Ride(int start_x, int start_y, int end_x, int end_y, int start, int end) {
        this.start_x = start_x;
        this.start_y = start_y;
        this.end_x = end_x;
        this.end_y = end_y;
        this.start = start;
        this.end = end;
    }
}
