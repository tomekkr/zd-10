class Room {
    private int area;
    private int currentTemp;
    private boolean airConditioning;
    private int minTemp = 15;

    public Room(int area, int currentTemp, boolean airConditioning) {
        this.area = area;
        this.currentTemp = currentTemp;
        this.airConditioning = airConditioning;
    }

    public Room() {
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public boolean decreaseTemp() {
        if ((this.airConditioning) && (this.currentTemp > minTemp)) {
            setCurrentTemp(currentTemp - 1);
            return true;
        } else {
            return false;
        }
    }

    public String getInfo() {
        return "Powierzchnia: " + area + ", temperatura: " + currentTemp + ", klimatyzacja: " + airConditioning;
    }
}
