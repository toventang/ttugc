package com.p2082ss.android.ugc.aweme.search.theme;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.theme.c */
public final class C67782c {

    /* renamed from: a */
    public final String f151910a;

    /* renamed from: b */
    public final int f151911b;

    /* renamed from: c */
    public final Integer f151912c;

    /* renamed from: d */
    public final C67783a f151913d;

    /* renamed from: com.ss.android.ugc.aweme.search.theme.c$a */
    public static final class C67783a {

        /* renamed from: c */
        public static final C67784a f151914c = new C67784a((byte) 0);

        /* renamed from: a */
        public final int f151915a;

        /* renamed from: b */
        public final Float f151916b;

        static {
            Covode.recordClassIndex(79434);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C67783a)) {
                return false;
            }
            C67783a aVar = (C67783a) obj;
            return this.f151915a == aVar.f151915a && C89219l.m154714a(this.f151916b, aVar.f151916b);
        }

        public final int hashCode() {
            int i = this.f151915a * 31;
            Float f = this.f151916b;
            return i + (f != null ? f.hashCode() : 0);
        }

        public final String toString() {
            return "AnimationInfo(state=" + this.f151915a + ", animatedFraction=" + this.f151916b + ")";
        }

        /* renamed from: com.ss.android.ugc.aweme.search.theme.c$a$a */
        public static final class C67784a {
            static {
                Covode.recordClassIndex(79435);
            }

            private C67784a() {
            }

            public /* synthetic */ C67784a(byte b) {
                this();
            }
        }

        public /* synthetic */ C67783a(int i) {
            this(i, null);
        }

        public C67783a(int i, Float f) {
            this.f151915a = i;
            this.f151916b = f;
        }
    }

    static {
        Covode.recordClassIndex(79433);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67782c)) {
            return false;
        }
        C67782c cVar = (C67782c) obj;
        return C89219l.m154714a(this.f151910a, cVar.f151910a) && this.f151911b == cVar.f151911b && C89219l.m154714a(this.f151912c, cVar.f151912c) && C89219l.m154714a(this.f151913d, cVar.f151913d);
    }

    public final int hashCode() {
        String str = this.f151910a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f151911b) * 31;
        Integer num = this.f151912c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        C67783a aVar = this.f151913d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SearchThemeInfo(theme=" + this.f151910a + ", backgroundColor=" + this.f151911b + ", maxIndex=" + this.f151912c + ", animInfo=" + this.f151913d + ")";
    }

    /* renamed from: a */
    public static /* synthetic */ C67782c m119955a(C67782c cVar, C67783a aVar) {
        String str = cVar.f151910a;
        int i = cVar.f151911b;
        Integer num = cVar.f151912c;
        C89219l.m154721d(str, "");
        return new C67782c(str, i, num, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C67782c(String str, int i, Integer num, int i2) {
        this(str, i, (i2 & 4) != 0 ? null : num, (C67783a) null);
    }

    private C67782c(String str, int i, Integer num, C67783a aVar) {
        C89219l.m154721d(str, "");
        this.f151910a = str;
        this.f151911b = i;
        this.f151912c = num;
        this.f151913d = aVar;
    }
}
