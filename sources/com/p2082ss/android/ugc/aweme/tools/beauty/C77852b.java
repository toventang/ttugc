package com.p2082ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.b */
public final class C77852b {

    /* renamed from: c */
    public static final C77853a f174659c = new C77853a((byte) 0);

    /* renamed from: a */
    public final String f174660a;

    /* renamed from: b */
    public final int f174661b;

    static {
        Covode.recordClassIndex(90939);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77852b)) {
            return false;
        }
        C77852b bVar = (C77852b) obj;
        return C89219l.m154714a(this.f174660a, bVar.f174660a) && this.f174661b == bVar.f174661b;
    }

    public final int hashCode() {
        String str = this.f174660a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f174661b;
    }

    public final String toString() {
        return "BeautySequence(effectId=" + this.f174660a + ", type=" + this.f174661b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.b$a */
    public static final class C77853a {
        static {
            Covode.recordClassIndex(90940);
        }

        private C77853a() {
        }

        public /* synthetic */ C77853a(byte b) {
            this();
        }
    }

    public /* synthetic */ C77852b(String str) {
        this(str, 1);
    }

    public C77852b(String str, int i) {
        C89219l.m154721d(str, "");
        this.f174660a = str;
        this.f174661b = i;
    }
}
