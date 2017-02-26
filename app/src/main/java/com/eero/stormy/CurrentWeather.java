package com.eero.stormy;


public class CurrentWeather {

    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;

    String getIcon() {
        return mIcon;
    }

    void setIcon(String icon) {
        mIcon = icon;
    }

    long getTime() {
        return mTime;
    }

    void setTime(long time) {
        mTime = time;
    }

    double getTemperature() {
        return mTemperature;
    }

    void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    double getHumidity() {
        return mHumidity;
    }

    void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    double getPrecipChance() {
        return mPrecipChance;
    }

    void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    String getSummary() {
        return mSummary;
    }

    void setSummary(String summary) {
        mSummary = summary;
    }
}
