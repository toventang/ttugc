package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f */
public interface AbstractC63755f {
    static {
        Covode.recordClassIndex(75083);
    }

    /* renamed from: a */
    C63756a mo96118a();

    /* renamed from: a */
    void mo96119a(int i);

    /* renamed from: b */
    void mo96120b();

    /* renamed from: c */
    String mo96121c();

    /* renamed from: com.ss.android.ugc.aweme.profile.f$a */
    public static final class C63756a {

        /* renamed from: a */
        public final String f144525a;

        /* renamed from: b */
        public final String f144526b;

        /* renamed from: c */
        public final String f144527c;

        /* renamed from: d */
        public final String f144528d;

        /* renamed from: e */
        public final Map<String, String> f144529e;

        static {
            Covode.recordClassIndex(75084);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63756a)) {
                return false;
            }
            C63756a aVar = (C63756a) obj;
            return C89219l.m154714a(this.f144525a, aVar.f144525a) && C89219l.m154714a(this.f144526b, aVar.f144526b) && C89219l.m154714a(this.f144527c, aVar.f144527c) && C89219l.m154714a(this.f144528d, aVar.f144528d) && C89219l.m154714a(this.f144529e, aVar.f144529e);
        }

        public final int hashCode() {
            String str = this.f144525a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f144526b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f144527c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f144528d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Map<String, String> map = this.f144529e;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            return "Config(roomId=" + this.f144525a + ", anchorId=" + this.f144526b + ", enterFromMerge=" + this.f144527c + ", enterMethod=" + this.f144528d + ", extras=" + this.f144529e + ")";
        }

        public C63756a(String str, String str2, String str3, String str4, Map<String, String> map) {
            C89219l.m154721d(map, "");
            this.f144525a = str;
            this.f144526b = str2;
            this.f144527c = str3;
            this.f144528d = str4;
            this.f144529e = map;
        }
    }
}
