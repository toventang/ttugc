package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public class ByteAudioStreamBuffer {
    public byte[] data;
    public int length;
    public ByteAudioStreamFormat streamFormat;
    public int timestamp;

    static {
        Covode.recordClassIndex(14991);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getLength() {
        return this.length;
    }

    public ByteAudioStreamFormat getStreamFormat() {
        return this.streamFormat;
    }

    public int getTimestamp() {
        return this.timestamp;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public void setTimestamp(int i) {
        this.timestamp = i;
    }

    private static ByteAudioStreamBuffer create(byte[] bArr, int i, ByteAudioStreamFormat byteAudioStreamFormat, int i2) {
        return new ByteAudioStreamBuffer(bArr, i, byteAudioStreamFormat, i2);
    }

    public ByteAudioStreamBuffer(byte[] bArr, int i, ByteAudioStreamFormat byteAudioStreamFormat, int i2) {
        this.data = bArr;
        this.length = i;
        this.streamFormat = byteAudioStreamFormat;
        this.timestamp = i2;
    }
}
