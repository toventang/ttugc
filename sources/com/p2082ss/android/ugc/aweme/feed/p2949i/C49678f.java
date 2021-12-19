package com.p2082ss.android.ugc.aweme.feed.p2949i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.feed.i.f */
public final class C49678f implements AbstractC81914b {

    /* renamed from: a */
    public final boolean f114341a;

    /* renamed from: b */
    public final int f114342b;

    /* renamed from: c */
    public final float f114343c;

    /* renamed from: d */
    public final float f114344d;

    /* renamed from: e */
    public final int f114345e;

    /* renamed from: f */
    public final int f114346f;

    /* renamed from: g */
    public boolean f114347g;

    static {
        Covode.recordClassIndex(58525);
    }

    /* renamed from: a */
    public final boolean mo81454a() {
        if (this.f114346f == 0) {
            return true;
        }
        return false;
    }

    public C49678f(int i) {
        this(false, 1, 0.0f, 0.0f, i, 0);
    }

    public C49678f(int i, byte b) {
        this(false, 2, 0.0f, 0.0f, i, 1);
    }

    public C49678f(int i, float f, float f2, int i2) {
        this(true, i, f, f2, i2, 0);
    }

    private C49678f(boolean z, int i, float f, float f2, int i2, int i3) {
        this.f114341a = z;
        this.f114342b = i;
        this.f114343c = f;
        this.f114344d = f2;
        this.f114345e = i2;
        this.f114346f = i3;
    }
}
