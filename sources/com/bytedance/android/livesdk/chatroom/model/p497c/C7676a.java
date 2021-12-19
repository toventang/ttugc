package com.bytedance.android.livesdk.chatroom.model.p497c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.c.a */
public final class C7676a {
    @AbstractC27891c(mo46611a = "layout")

    /* renamed from: a */
    public int f19019a;
    @AbstractC27891c(mo46611a = "fix_mic_num")

    /* renamed from: b */
    public int f19020b;

    static {
        Covode.recordClassIndex(8458);
    }

    public C7676a(byte b) {
        this();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C7676a m15669a(int i, int i2) {
        return new C7676a(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7676a)) {
            return false;
        }
        C7676a aVar = (C7676a) obj;
        return this.f19019a == aVar.f19019a && this.f19020b == aVar.f19020b;
    }

    public final int hashCode() {
        return (this.f19019a * 31) + this.f19020b;
    }

    public final String toString() {
        return "MultiLiveAnchorPanelSettings(layoutType=" + this.f19019a + ", fixMicNumAction=" + this.f19020b + ")";
    }

    private /* synthetic */ C7676a() {
        this(0, 0);
    }

    private C7676a(int i, int i2) {
        this.f19019a = i;
        this.f19020b = i2;
    }
}
