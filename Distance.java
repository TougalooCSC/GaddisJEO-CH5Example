class  Distance {
    private double speed;
    private double hoursTraveled;

    public Distance( double s, double h) {
        speed = s;
        hoursTraveled = h;
    }
    public double getSpeed() {
        return speed;
    }
    public double getHoursTraveled() {
        return hoursTraveled;
    }
    public void setSpeed( double s) {
        speed = s;
    }
    public void setHoursTraveled( double h) {
        hoursTraveled = h;
    }
    public double getDistance() {
        return speed * hoursTraveled;
    }
}