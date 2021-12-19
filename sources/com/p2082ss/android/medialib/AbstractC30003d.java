package com.p2082ss.android.medialib;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.d */
public interface AbstractC30003d {
    static {
        Covode.recordClassIndex(36456);
    }

    void onMarkSetCodecConfig(byte[] bArr);

    void onMarkSwapGlBuffers();

    void onMarkWriteFile(byte[] bArr, int i, int i2, int i3);

    void setColorFormatMark(int i);
}
