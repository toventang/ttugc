package com.p2082ss.android.ugc.aweme.challenge.p2450f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.f.b */
public final class C35519b {

    /* renamed from: a */
    public final Integer f83758a;

    /* renamed from: b */
    public final Integer f83759b;

    /* renamed from: c */
    public final Integer f83760c;

    static {
        Covode.recordClassIndex(42715);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35519b)) {
            return false;
        }
        C35519b bVar = (C35519b) obj;
        return C89219l.m154714a(this.f83758a, bVar.f83758a) && C89219l.m154714a(this.f83759b, bVar.f83759b) && C89219l.m154714a(this.f83760c, bVar.f83760c);
    }

    public final int hashCode() {
        Integer num = this.f83758a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f83759b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f83760c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TextProperty(width=" + this.f83758a + ", height=" + this.f83759b + ", lineCount=" + this.f83760c + ")";
    }

    public /* synthetic */ C35519b() {
        this(-1, -1, -1);
    }

    public C35519b(Integer num, Integer num2, Integer num3) {
        this.f83758a = num;
        this.f83759b = num2;
        this.f83760c = num3;
    }
}
