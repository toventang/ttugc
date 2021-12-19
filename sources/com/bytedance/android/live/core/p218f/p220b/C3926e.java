package com.bytedance.android.live.core.p218f.p220b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.b.e */
public final class C3926e {

    /* renamed from: a */
    public int f10805a;

    /* renamed from: b */
    public int f10806b;

    /* renamed from: c */
    public int f10807c;

    static {
        Covode.recordClassIndex(4455);
    }

    public C3926e(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3926e)) {
            return false;
        }
        C3926e eVar = (C3926e) obj;
        return this.f10805a == eVar.f10805a && this.f10806b == eVar.f10806b && this.f10807c == eVar.f10807c;
    }

    public final int hashCode() {
        return (((this.f10805a * 31) + this.f10806b) * 31) + this.f10807c;
    }

    public final String toString() {
        return "ScreenInfo(dpi=" + this.f10805a + ", width=" + this.f10806b + ", height=" + this.f10807c + ")";
    }

    private C3926e() {
        this.f10805a = -1;
        this.f10806b = -1;
        this.f10807c = -1;
    }

    private /* synthetic */ C3926e(byte b) {
        this();
    }
}
