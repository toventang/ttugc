package com.bytedance.android.livesdk.event;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.event.e */
public class C8452e {

    /* renamed from: a */
    public boolean f20896a;

    /* renamed from: b */
    public String f20897b;

    /* renamed from: c */
    public long f20898c;

    /* renamed from: d */
    public EnterRoomConfig f20899d;

    static {
        Covode.recordClassIndex(9300);
    }

    public C8452e(long j) {
        this.f20898c = j;
    }

    public C8452e(long j, EnterRoomConfig enterRoomConfig) {
        this.f20898c = j;
        this.f20899d = enterRoomConfig;
    }

    public C8452e(long j, EnterRoomConfig enterRoomConfig, byte b) {
        this.f20898c = j;
        this.f20899d = enterRoomConfig;
        this.f20896a = true;
    }

    public C8452e(long j, EnterRoomConfig enterRoomConfig, String str) {
        this.f20898c = j;
        this.f20899d = enterRoomConfig;
        this.f20897b = str;
    }
}
