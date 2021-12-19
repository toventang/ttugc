package com.p2082ss.android.ugc.aweme.music.p3481ui.p3482a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a.a */
public final class C61091a implements AbstractC81914b {

    /* renamed from: a */
    public final int f138650a;

    /* renamed from: b */
    public final int f138651b;

    static {
        Covode.recordClassIndex(71694);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61091a)) {
            return false;
        }
        C61091a aVar = (C61091a) obj;
        return this.f138650a == aVar.f138650a && this.f138651b == aVar.f138651b;
    }

    public final int hashCode() {
        return (this.f138650a * 31) + this.f138651b;
    }

    public final String toString() {
        return "AwemeMusicPlayEvent(pageId=" + this.f138650a + ", senderId=" + this.f138651b + ")";
    }

    public C61091a(int i, int i2) {
        this.f138650a = i;
        this.f138651b = i2;
    }
}
