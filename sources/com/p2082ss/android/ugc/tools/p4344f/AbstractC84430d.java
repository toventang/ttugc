package com.p2082ss.android.ugc.tools.p4344f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.f.d */
public interface AbstractC84430d {
    static {
        Covode.recordClassIndex(98395);
    }

    /* renamed from: a */
    String mo118962a();

    /* renamed from: a */
    void mo118963a(C84431a aVar);

    /* renamed from: a */
    void mo118964a(String str);

    /* renamed from: a */
    void mo118965a(String str, int i, String str2);

    /* renamed from: a */
    void mo118966a(String str, String str2);

    /* renamed from: a */
    void mo118967a(String str, String str2, String str3);

    /* renamed from: a */
    void mo118968a(String str, boolean z);

    /* renamed from: b */
    String mo118969b();

    /* renamed from: b */
    void mo118970b(String str, String str2);

    /* renamed from: com.ss.android.ugc.tools.f.d$a */
    public static final class C84431a {

        /* renamed from: a */
        public final String f188767a;

        /* renamed from: b */
        public final String f188768b;

        /* renamed from: c */
        public final String f188769c;

        /* renamed from: d */
        public final boolean f188770d;

        static {
            Covode.recordClassIndex(98396);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C84431a)) {
                return false;
            }
            C84431a aVar = (C84431a) obj;
            return C89219l.m154714a(this.f188767a, aVar.f188767a) && C89219l.m154714a(this.f188768b, aVar.f188768b) && C89219l.m154714a(this.f188769c, aVar.f188769c) && this.f188770d == aVar.f188770d;
        }

        public final int hashCode() {
            String str = this.f188767a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f188768b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f188769c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f188770d;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final String toString() {
            return "SelectParam(giphyId=" + this.f188767a + ", stickerId=" + this.f188768b + ", tabName=" + this.f188769c + ", isImage=" + this.f188770d + ")";
        }

        public C84431a(String str, String str2, String str3, boolean z) {
            C89219l.m154721d(str3, "");
            this.f188767a = str;
            this.f188768b = str2;
            this.f188769c = str3;
            this.f188770d = z;
        }
    }
}
