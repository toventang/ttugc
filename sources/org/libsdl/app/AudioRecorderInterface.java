package org.libsdl.app;

import com.bytedance.covode.number.Covode;

public interface AudioRecorderInterface {
    static {
        Covode.recordClassIndex(106541);
    }

    int addPCMData(byte[] bArr, int i, long j);

    int closeWavFile(boolean z);

    int initWavFile(int i, int i2, double d);

    void lackPermission();

    void recordStatus(boolean z);
}
