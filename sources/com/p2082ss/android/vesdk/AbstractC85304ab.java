package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.vesdk.ab */
public interface AbstractC85304ab {
    static {
        Covode.recordClassIndex(99415);
    }

    boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3);
}
