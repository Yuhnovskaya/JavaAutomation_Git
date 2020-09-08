package level_2.threads.optionalTask;

public
class Runway {
    private int runwayNumber;
    private RunwayAvailability status;

    public
    Runway(int runwayNumber, RunwayAvailability runwayAvailability) {
        this.runwayNumber = runwayNumber;
        this.status = runwayAvailability;
    }

    public
    int getRunwayNumber() {
        return runwayNumber;
    }

    public
    RunwayAvailability getStatus() {
        return status;
    }

    public
    void setStatus(RunwayAvailability status) {
        this.status = status;
    }
}
