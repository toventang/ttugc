package org.apache.commons.net.ntp;

import com.bytedance.covode.number.Covode;
import java.net.DatagramPacket;

public interface NtpV3Packet {
    static {
        Covode.recordClassIndex(106409);
    }

    DatagramPacket getDatagramPacket();

    TimeStamp getOriginateTimeStamp();

    TimeStamp getReceiveTimeStamp();

    TimeStamp getTransmitTimeStamp();

    void setMode(int i);

    void setTransmitTime(TimeStamp timeStamp);

    void setVersion(int i);
}
