package com.patelheggere.locationrecorder.models;

/**
 * Created by Patel Heggere on 4/6/2018.
 */

public class LocationTrack {
    private double mLatitude;
    private double mLongitude;
    private String mPointName;
    private double mElevation;
    private Long mTime;
    private String mVillageName;
    private String mWardNumber;

    public double getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public double getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(double mLongitude) {
        this.mLongitude = mLongitude;
    }

    public String getmPointName() {
        return mPointName;
    }

    public void setmPointName(String mPointName) {
        this.mPointName = mPointName;
    }

    public double getmElevation() {
        return mElevation;
    }

    public void setmElevation(double mElevation) {
        this.mElevation = mElevation;
    }

    public Long getmTime() {
        return mTime;
    }

    public void setmTime(Long mTime) {
        this.mTime = mTime;
    }

    public String getmVillageName() {
        return mVillageName;
    }

    public void setmVillageName(String mVillageName) {
        this.mVillageName = mVillageName;
    }

    public String getmWardNumber() {
        return mWardNumber;
    }

    public void setmWardNumber(String mWardNumber) {
        this.mWardNumber = mWardNumber;
    }
}
