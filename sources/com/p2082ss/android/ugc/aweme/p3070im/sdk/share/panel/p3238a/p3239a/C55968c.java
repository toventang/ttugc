package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c */
public final class C55968c {

    /* renamed from: d */
    public static final C55969a f127626d = new C55969a((byte) 0);

    /* renamed from: a */
    public final String f127627a;

    /* renamed from: b */
    public final int f127628b;

    /* renamed from: c */
    public final int f127629c;

    static {
        Covode.recordClassIndex(65762);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55968c)) {
            return false;
        }
        C55968c cVar = (C55968c) obj;
        return C89219l.m154714a(this.f127627a, cVar.f127627a) && this.f127628b == cVar.f127628b && this.f127629c == cVar.f127629c;
    }

    public final int hashCode() {
        String str = this.f127627a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f127628b) * 31) + this.f127629c;
    }

    public final String toString() {
        return "ShareLimitTipModel(userName=" + this.f127627a + ", limitType=" + this.f127628b + ", shareType=" + this.f127629c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c$a */
    public static final class C55969a {
        static {
            Covode.recordClassIndex(65763);
        }

        private C55969a() {
        }

        public /* synthetic */ C55969a(byte b) {
            this();
        }
    }

    public /* synthetic */ C55968c(String str, int i) {
        this(str, i, 1);
    }

    public C55968c(String str, int i, int i2) {
        C89219l.m154721d(str, "");
        this.f127627a = str;
        this.f127628b = i;
        this.f127629c = i2;
    }
}
