package com.eero.stormy;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class CurrentWeather {

    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;

    String getTimezone() {
        return mTimezone;
    }

    void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    private String mTimezone;

    String getIcon() {
        return mIcon;
    }

    void setIcon(String icon) {
        mIcon = icon;
    }

    int getIcondId() {
        int iconId = R.drawable.clear_day;

        if (mIcon.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        }
        else if (mIcon.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        }
        else if (mIcon.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (mIcon.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (mIcon.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (mIcon.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (mIcon.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (mIcon.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;
    }

    long getTime() {
        return mTime;
    }

    String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("H:mm");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date dateTime = new Date(getTime() * 1000);

        return formatter.format(dateTime);
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
