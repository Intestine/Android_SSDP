package com.example.ssdptest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

class SSDPSocket {

    private MulticastSocket multicastSocket;
    private InetAddress inetAddress;

    SSDPSocket() throws IOException {
        //默认地址和端口：port： 1900,  address：239.255.255.250
        multicastSocket = new MulticastSocket(SSDPConstants.PORT); // Bind some random port for receiving datagram
        inetAddress = InetAddress.getByName(SSDPConstants.ADDRESS);
        multicastSocket.joinGroup(inetAddress);
    }

    /* Used to send SSDP packet */
    void send(String data) throws IOException {
        DatagramPacket dp = new DatagramPacket(data.getBytes(), data.length(), inetAddress, SSDPConstants.PORT);
        multicastSocket.send(dp);
    }

    /* Used to receive SSDP packet */
    DatagramPacket receive() throws IOException {
        byte[] buf = new byte[4096];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);


        multicastSocket.receive(dp);
        return dp;
    }

    void close() {
        if (multicastSocket != null) {
            multicastSocket.close();
        }
    }
}
