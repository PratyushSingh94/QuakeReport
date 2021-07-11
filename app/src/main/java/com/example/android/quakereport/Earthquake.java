package com.example.android.quakereport;

public class Earthquake {

    /**Magnitude of Earthquake*/
    private Double mMagnitude;

    /**Location of Earthquake*/
    private String mLocation;

    /**Date of Earthquake*/
    private long mDate;

    /** Website URL of the earthquake */
    private String mUrl;
    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param date is the date when earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(Double magnitude,String location,long date,String url)
    {
        mMagnitude=magnitude;
        mLocation=location;
        mDate=date;
        mUrl=url;
    }

    /**
     * Returns magnitude of earthquake
     */
    public Double getMagnitude(){return mMagnitude;}

    /**
     * Returns location of earthquake
     */
    public String getLocation(){return mLocation;}

    /**
     * Returns date of earthquake
     */
    public long getDate(){return mDate;}

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
