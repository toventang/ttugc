package com.p2082ss.android.medialib;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.b */
public interface AbstractC29982b {
    static {
        Covode.recordClassIndex(36434);
    }

    int getProfile();

    int onEncoderData(int i, int i2, int i3, boolean z);

    void onEncoderData(byte[] bArr, int i, boolean z);

    Surface onInitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7);

    void onSetCodecConfig(ByteBuffer byteBuffer);

    void onSwapGlBuffers();

    void onUninitHardEncoder();

    void onWriteFile(ByteBuffer byteBuffer, int i, int i2, int i3);

    void onWriteFile(ByteBuffer byteBuffer, long j, long j2, int i, boolean z);

    void setColorFormat(int i);
}
