package com.bytedance.android.livesdk.chatroom.p488c;

import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.am */
public final class C7380am {

    /* renamed from: a */
    public int f18292a;

    /* renamed from: b */
    private boolean f18293b;

    static {
        Covode.recordClassIndex(8147);
    }

    /* renamed from: a */
    public final boolean mo13610a() {
        if (!LiveMtMockLandscapeSetting.INSTANCE.getValue()) {
            return this.f18293b;
        }
        return true;
    }

    public C7380am(boolean z, int i) {
        this.f18293b = z;
        this.f18292a = i;
    }
}
