package org.apache.commons.net.ntp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.DatagramPacket;
import java.util.Arrays;

public class NtpV3Impl implements NtpV3Packet {
    private final byte[] buf = new byte[48];

    /* renamed from: dp */
    private volatile DatagramPacket f204959dp;

    static {
        Covode.recordClassIndex(106408);
    }

    /* renamed from: ui */
    protected static final int m156892ui(byte b) {
        return b & 255;
    }

    /* renamed from: ul */
    protected static final long m156893ul(byte b) {
        return (long) (b & 255);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getOriginateTimeStamp() {
        return getTimestamp(24);
    }

    public int getPoll() {
        return this.buf[2];
    }

    public int getPrecision() {
        return this.buf[3];
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getReceiveTimeStamp() {
        return getTimestamp(32);
    }

    public int getReferenceId() {
        return getInt(12);
    }

    public int getRootDelay() {
        return getInt(4);
    }

    public int getRootDispersion() {
        return getInt(8);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getTransmitTimeStamp() {
        return getTimestamp(40);
    }

    public int hashCode() {
        return Arrays.hashCode(this.buf);
    }

    private String idAsHex() {
        return Integer.toHexString(getReferenceId());
    }

    public int getMode() {
        return (m156892ui(this.buf[0]) >> 0) & 7;
    }

    public double getRootDispersionInMillisDouble() {
        double rootDispersion = (double) getRootDispersion();
        Double.isNaN(rootDispersion);
        return rootDispersion / 65.536d;
    }

    public int getStratum() {
        return m156892ui(this.buf[1]);
    }

    public int getVersion() {
        return (m156892ui(this.buf[0]) >> 3) & 7;
    }

    private String idAsString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            char c = (char) this.buf[i + 12];
            if (c == 0) {
                break;
            }
            sb.append(c);
            i++;
        } while (i <= 3);
        return sb.toString();
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public synchronized DatagramPacket getDatagramPacket() {
        DatagramPacket datagramPacket;
        MethodCollector.m26663i(11806);
        if (this.f204959dp == null) {
            byte[] bArr = this.buf;
            this.f204959dp = new DatagramPacket(bArr, bArr.length);
            this.f204959dp.setPort(123);
        }
        datagramPacket = this.f204959dp;
        MethodCollector.m26664o(11806);
        return datagramPacket;
    }

    public String getReferenceIdString() {
        int version = getVersion();
        int stratum = getStratum();
        if (version == 3 || version == 4) {
            if (stratum == 0 || stratum == 1) {
                return idAsString();
            }
            if (version == 4) {
                return idAsHex();
            }
        }
        if (stratum >= 2) {
            return idAsIPAddress();
        }
        return idAsHex();
    }

    private String idAsIPAddress() {
        return m156892ui(this.buf[12]) + "." + m156892ui(this.buf[13]) + "." + m156892ui(this.buf[14]) + "." + m156892ui(this.buf[15]);
    }

    public String toString() {
        return "[version:" + getVersion() + ", mode:" + getMode() + ", poll:" + getPoll() + ", precision:" + getPrecision() + ", delay:" + getRootDelay() + ", dispersion(ms):" + getRootDispersionInMillisDouble() + ", id:" + getReferenceIdString() + ", xmitTime:" + getTransmitTimeStamp().toDateString() + " ]";
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setTransmitTime(TimeStamp timeStamp) {
        setTimestamp(40, timeStamp);
    }

    private TimeStamp getTimestamp(int i) {
        return new TimeStamp(getLong(i));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setMode(int i) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) ((i & 7) | (bArr[0] & 248));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setVersion(int i) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) (((i & 7) << 3) | (bArr[0] & 199));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.buf, ((NtpV3Impl) obj).buf);
    }

    private int getInt(int i) {
        return m156892ui(this.buf[i + 3]) | (m156892ui(this.buf[i]) << 24) | (m156892ui(this.buf[i + 1]) << 16) | (m156892ui(this.buf[i + 2]) << 8);
    }

    private long getLong(int i) {
        return (m156893ul(this.buf[i]) << 56) | (m156893ul(this.buf[i + 1]) << 48) | (m156893ul(this.buf[i + 2]) << 40) | (m156893ul(this.buf[i + 3]) << 32) | (m156893ul(this.buf[i + 4]) << 24) | (m156893ul(this.buf[i + 5]) << 16) | (m156893ul(this.buf[i + 6]) << 8) | m156893ul(this.buf[i + 7]);
    }

    private void setTimestamp(int i, TimeStamp timeStamp) {
        long ntpValue;
        if (timeStamp == null) {
            ntpValue = 0;
        } else {
            ntpValue = timeStamp.ntpValue();
        }
        int i2 = 7;
        do {
            this.buf[i + i2] = (byte) ((int) (255 & ntpValue));
            ntpValue >>>= 8;
            i2--;
        } while (i2 >= 0);
    }
}
