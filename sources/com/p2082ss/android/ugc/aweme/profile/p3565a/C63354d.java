package com.p2082ss.android.ugc.aweme.profile.p3565a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.d */
public final class C63354d implements AbstractC81914b {

    /* renamed from: c */
    public static final C63355a f143849c = new C63355a((byte) 0);

    /* renamed from: a */
    public final int f143850a;

    /* renamed from: b */
    public final String f143851b;

    static {
        Covode.recordClassIndex(74645);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63354d)) {
            return false;
        }
        C63354d dVar = (C63354d) obj;
        return this.f143850a == dVar.f143850a && C89219l.m154714a(this.f143851b, dVar.f143851b);
    }

    public final int hashCode() {
        int i = this.f143850a * 31;
        String str = this.f143851b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ClickGuideCardEvent(clickCardName=" + this.f143850a + ", content=" + this.f143851b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.d$a */
    public static final class C63355a {
        static {
            Covode.recordClassIndex(74646);
        }

        private C63355a() {
        }

        public /* synthetic */ C63355a(byte b) {
            this();
        }
    }

    public C63354d(int i, String str) {
        C89219l.m154721d(str, "");
        this.f143850a = i;
        this.f143851b = str;
    }
}
