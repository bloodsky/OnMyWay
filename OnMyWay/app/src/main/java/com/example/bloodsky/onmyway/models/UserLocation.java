package com.example.bloodsky.onmyway.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class UserLocation implements Parcelable {

    private GeoPoint geo_Point;
    private @ServerTimestamp
    Date timestamp;
    private User user;


    public UserLocation(GeoPoint geo_point, Date timestamp, User user) {
        geo_Point = geo_point;
        this.timestamp = timestamp;
        this.user = user;
    }

    public UserLocation(){

    }

    protected UserLocation(Parcel in) {
        user = in.readParcelable(User.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(user, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<UserLocation> CREATOR = new Creator<UserLocation>() {
        @Override
        public UserLocation createFromParcel(Parcel in) {
            return new UserLocation(in);
        }

        @Override
        public UserLocation[] newArray(int size) {
            return new UserLocation[size];
        }
    };

    public GeoPoint getGeo_Point() {
        return geo_Point;
    }

    public void setGeo_Point(GeoPoint geo_Point) {
        this.geo_Point = geo_Point;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
