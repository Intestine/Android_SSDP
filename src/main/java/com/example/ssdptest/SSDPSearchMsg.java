package com.example.ssdptest;

/**
 * Msg的实体类，格式详见toString()
 */
public class SSDPSearchMsg {
    private int mMX = 5; /* seconds to delay response */
    private String mST; /* Search target */
    public static final String ADDRESS = "239.255.255.250";
    public static final int PORT = 1900;
    public static final String SL_OK = "HTTP/1.1 200 OK";
    public static final String SL_M_SEARCH = "M-SEARCH * HTTP/1.1";
    public static final String HOST = "Host:" + ADDRESS + ":" + PORT;
    public static final String MAN = "Man:\"ssdp:discover\"";
    public static final String NEWLINE = "\r\n";
    public static final String ST_Product = "ST:urn:schemas-upnp-org:device:Server:1";
    public static final String Found = "ST=urn:schemas-upnp-org:device:";
    public static final String Root = "ST: urn:schemas-upnp-org:device:Server:1";
    public static final String ALL = "ST:miivii";


    SSDPSearchMsg(String ST) {
        mST = ST;
    }

    public int getmMX() {
        return mMX;
    }

    public void setmMX(int mMX) {
        this.mMX = mMX;
    }

    public String getmST() {
        return mST;
    }

    public void setmST(String mST) {
        this.mST = mST;
    }

    /**
     * @ruturn 发送格式：
     * M-SEARCH * HTTP/1.1
     * Host:239.255.255.250:1900
     * Man:"ssdp:discover"
     * MX:5
     * ST:miivii
     */
    @Override
    public String toString() {
        return SL_M_SEARCH + NEWLINE +
                HOST + NEWLINE +
                MAN + NEWLINE +
                "MX:" + mMX + NEWLINE +
                "ST: ssdp:all" + NEWLINE +
                NEWLINE;
        /*return SL_M_SEARCH + NEWLINE +
                HOST + NEWLINE +
                MAN + NEWLINE +
                "MX:" + mMX + NEWLINE +
                mST + NEWLINE +
                NEWLINE;*/
    }
}
