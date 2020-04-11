package com.example.ssdptest;

public class SSDPConstants {
    /* New line definition */
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
}
