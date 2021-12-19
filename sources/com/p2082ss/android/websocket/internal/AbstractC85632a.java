package com.p2082ss.android.websocket.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.websocket.internal.a */
public interface AbstractC85632a {
    static {
        Covode.recordClassIndex(99816);
    }

    int getMethod();

    byte[] getPayload();

    String getPayloadEncoding();

    String getPayloadType();

    int getService();
}
