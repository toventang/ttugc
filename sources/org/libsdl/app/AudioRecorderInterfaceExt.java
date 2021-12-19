package org.libsdl.app;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.p2154a.RunnableC29977a;

public interface AudioRecorderInterfaceExt extends RunnableC29977a.AbstractC29978a, AudioRecorderInterface {
    static {
        Covode.recordClassIndex(106542);
    }

    int initAudioConfig(int i, int i2, int i3, int i4, int i5);

    @Override // com.p2082ss.android.medialib.p2154a.RunnableC29977a.AbstractC29978a
    int onProcessData(byte[] bArr, int i, long j);

    void startMicError();
}
