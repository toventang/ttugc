package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.l */
public final class C40545l {

    /* renamed from: d */
    public static final C40546a f94871d = new C40546a((byte) 0);

    /* renamed from: a */
    public final String f94872a;

    /* renamed from: b */
    public final String f94873b;

    /* renamed from: c */
    public final Integer f94874c;

    static {
        Covode.recordClassIndex(48366);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40545l)) {
            return false;
        }
        C40545l lVar = (C40545l) obj;
        return C89219l.m154714a(this.f94872a, lVar.f94872a) && C89219l.m154714a(this.f94873b, lVar.f94873b) && C89219l.m154714a(this.f94874c, lVar.f94874c);
    }

    public final int hashCode() {
        String str = this.f94872a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f94873b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f94874c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DebugUrlMessage(url=" + this.f94872a + ", message=" + this.f94873b + ", type=" + this.f94874c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.l$a */
    public static final class C40546a {
        static {
            Covode.recordClassIndex(48367);
        }

        private C40546a() {
        }

        public /* synthetic */ C40546a(byte b) {
            this();
        }
    }

    public /* synthetic */ C40545l(String str, String str2) {
        this(str, str2, 0);
    }

    private C40545l(String str, String str2, Integer num) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f94872a = str;
        this.f94873b = str2;
        this.f94874c = num;
    }
}
