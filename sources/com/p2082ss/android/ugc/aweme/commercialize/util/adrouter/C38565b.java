package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.feed.p2565c.C37892a;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b */
public final class C38565b {

    /* renamed from: a */
    public final C38567b f91093a;

    /* renamed from: b */
    public final C38572g f91094b;

    /* renamed from: c */
    public final C38571f f91095c;

    /* renamed from: d */
    public final C38570e f91096d;

    /* renamed from: e */
    public final C38569d f91097e;

    /* renamed from: f */
    public C38568c f91098f;

    static {
        Covode.recordClassIndex(46097);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b$b */
    public static final class C38567b {

        /* renamed from: a */
        public AwemeRawAd f91100a;

        /* renamed from: b */
        public long f91101b;

        /* renamed from: c */
        public long f91102c;

        /* renamed from: d */
        public String f91103d;

        /* renamed from: e */
        public long f91104e;

        /* renamed from: f */
        public String f91105f;

        /* renamed from: g */
        public int f91106g;

        /* renamed from: h */
        public String f91107h;

        /* renamed from: i */
        public String f91108i;

        static {
            Covode.recordClassIndex(46099);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38567b)) {
                return false;
            }
            C38567b bVar = (C38567b) obj;
            return C89219l.m154714a(this.f91100a, bVar.f91100a) && this.f91101b == bVar.f91101b && this.f91102c == bVar.f91102c && C89219l.m154714a(this.f91103d, bVar.f91103d) && this.f91104e == bVar.f91104e && C89219l.m154714a(this.f91105f, bVar.f91105f) && this.f91106g == bVar.f91106g && C89219l.m154714a(this.f91107h, bVar.f91107h) && C89219l.m154714a(this.f91108i, bVar.f91108i);
        }

        public final String toString() {
            return "CommonData(awemeRawAd=" + this.f91100a + ", adId=" + this.f91101b + ", creativeId=" + this.f91102c + ", logExtra=" + this.f91103d + ", groupId=" + this.f91104e + ", adType=" + this.f91105f + ", adSystemOrigin=" + this.f91106g + ", awemeId=" + this.f91107h + ", authorUid=" + this.f91108i + ")";
        }

        public /* synthetic */ C38567b() {
            this("", "");
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            AwemeRawAd awemeRawAd = this.f91100a;
            int i5 = 0;
            if (awemeRawAd != null) {
                i = awemeRawAd.hashCode();
            } else {
                i = 0;
            }
            long j = this.f91101b;
            long j2 = this.f91102c;
            int i6 = ((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str = this.f91103d;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            long j3 = this.f91104e;
            int i7 = (((i6 + i2) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            String str2 = this.f91105f;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (((i7 + i3) * 31) + this.f91106g) * 31;
            String str3 = this.f91107h;
            if (str3 != null) {
                i4 = str3.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            String str4 = this.f91108i;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i9 + i5;
        }

        /* renamed from: a */
        public final void mo67124a(String str) {
            C89219l.m154721d(str, "");
            this.f91103d = str;
        }

        /* renamed from: b */
        public final void mo67125b(String str) {
            C89219l.m154721d(str, "");
            this.f91105f = str;
        }

        private C38567b(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f91100a = null;
            this.f91101b = 0;
            this.f91102c = 0;
            this.f91103d = str;
            this.f91104e = 0;
            this.f91105f = str2;
            this.f91106g = 0;
            this.f91107h = null;
            this.f91108i = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b$d */
    public static final class C38569d {

        /* renamed from: a */
        public String f91121a;

        /* renamed from: b */
        public String f91122b;

        static {
            Covode.recordClassIndex(46101);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38569d)) {
                return false;
            }
            C38569d dVar = (C38569d) obj;
            return C89219l.m154714a(this.f91121a, dVar.f91121a) && C89219l.m154714a(this.f91122b, dVar.f91122b);
        }

        public final int hashCode() {
            String str = this.f91121a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f91122b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "LogData(tag=" + this.f91121a + ", refer=" + this.f91122b + ")";
        }

        public /* synthetic */ C38569d() {
            this("", "");
        }

        /* renamed from: a */
        public final void mo67139a(String str) {
            C89219l.m154721d(str, "");
            this.f91121a = str;
        }

        private C38569d(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f91121a = str;
            this.f91122b = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b$e */
    public static final class C38570e {

        /* renamed from: a */
        public String f91123a;

        /* renamed from: b */
        public Object f91124b;

        /* renamed from: c */
        public String f91125c;

        static {
            Covode.recordClassIndex(46102);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38570e)) {
                return false;
            }
            C38570e eVar = (C38570e) obj;
            return C89219l.m154714a(this.f91123a, eVar.f91123a) && C89219l.m154714a(this.f91124b, eVar.f91124b) && C89219l.m154714a(this.f91125c, eVar.f91125c);
        }

        public final int hashCode() {
            String str = this.f91123a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Object obj = this.f91124b;
            int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
            String str2 = this.f91125c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "MiniAppData(url=" + this.f91123a + ", extraParams=" + this.f91124b + ", openFrom=" + this.f91125c + ")";
        }

        public /* synthetic */ C38570e() {
            this("", "");
        }

        private C38570e(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f91123a = str;
            this.f91124b = null;
            this.f91125c = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b$f */
    public static final class C38571f {

        /* renamed from: a */
        public String f91126a;

        /* renamed from: b */
        public boolean f91127b;

        /* renamed from: c */
        public String f91128c;

        /* renamed from: d */
        public boolean f91129d;

        static {
            Covode.recordClassIndex(46103);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38571f)) {
                return false;
            }
            C38571f fVar = (C38571f) obj;
            return C89219l.m154714a(this.f91126a, fVar.f91126a) && this.f91127b == fVar.f91127b && C89219l.m154714a(this.f91128c, fVar.f91128c) && this.f91129d == fVar.f91129d;
        }

        public final int hashCode() {
            String str = this.f91126a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f91127b;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode + i3) * 31;
            String str2 = this.f91128c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i7 = (i6 + i) * 31;
            if (!this.f91129d) {
                i2 = 0;
            }
            return i7 + i2;
        }

        public final String toString() {
            return "OpenUrlData(openUrl=" + this.f91126a + ", forbiddenOpen3rdApp=" + this.f91127b + ", backUrlTag=" + this.f91128c + ", useAdxDeepLink=" + this.f91129d + ")";
        }

        public /* synthetic */ C38571f() {
            this("", "");
        }

        /* renamed from: a */
        public final void mo67146a(String str) {
            C89219l.m154721d(str, "");
            this.f91126a = str;
        }

        private C38571f(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f91126a = str;
            this.f91127b = false;
            this.f91128c = str2;
            this.f91129d = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b$a */
    public static final class C38566a {

        /* renamed from: a */
        public C38565b f91099a = new C38565b();

        static {
            Covode.recordClassIndex(46098);
        }

        /* renamed from: a */
        public final C38566a mo67078a() {
            this.f91099a.f91094b.f91147o = 1;
            return this;
        }

        /* renamed from: a */
        public final C38566a mo67079a(int i) {
            this.f91099a.f91093a.f91106g = i;
            return this;
        }

        /* renamed from: b */
        public final C38566a mo67086b(long j) {
            this.f91099a.f91093a.f91104e = j;
            return this;
        }

        /* renamed from: c */
        public final C38566a mo67089c(int i) {
            this.f91099a.f91094b.f91142j = i;
            return this;
        }

        /* renamed from: d */
        public final C38566a mo67093d(int i) {
            this.f91099a.f91094b.f91145m = i;
            return this;
        }

        /* renamed from: e */
        public final C38566a mo67096e(int i) {
            this.f91099a.f91094b.f91146n = i;
            return this;
        }

        /* renamed from: f */
        public final C38566a mo67099f(int i) {
            this.f91099a.f91094b.f91151s = i;
            return this;
        }

        /* renamed from: g */
        public final C38566a mo67101g(int i) {
            this.f91099a.f91094b.f91153u = i;
            return this;
        }

        /* renamed from: h */
        public final C38566a mo67103h(int i) {
            this.f91099a.f91094b.f91132C = i;
            return this;
        }

        /* renamed from: i */
        public final C38566a mo67105i(int i) {
            this.f91099a.f91098f.f91115g = i;
            return this;
        }

        /* renamed from: j */
        public final C38566a mo67107j(int i) {
            this.f91099a.f91098f.f91116h = i;
            return this;
        }

        /* renamed from: b */
        public final C38566a mo67085b(int i) {
            this.f91099a.f91094b.f91139g = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public final C38566a mo67090c(long j) {
            this.f91099a.f91094b.f91148p = j;
            return this;
        }

        /* renamed from: d */
        public final C38566a mo67094d(String str) {
            C38567b bVar = this.f91099a.f91093a;
            if (str == null) {
                str = "";
            }
            bVar.mo67124a(str);
            return this;
        }

        /* renamed from: e */
        public final C38566a mo67097e(String str) {
            C38567b bVar = this.f91099a.f91093a;
            if (str == null) {
                str = "";
            }
            bVar.mo67125b(str);
            return this;
        }

        /* renamed from: f */
        public final C38566a mo67100f(String str) {
            C38571f fVar = this.f91099a.f91095c;
            if (str == null) {
                str = "";
            }
            fVar.mo67146a(str);
            return this;
        }

        /* renamed from: g */
        public final C38566a mo67102g(String str) {
            C38572g gVar = this.f91099a.f91094b;
            if (str == null) {
                str = "";
            }
            gVar.mo67150a(str);
            return this;
        }

        /* renamed from: h */
        public final C38566a mo67104h(String str) {
            C38572g gVar = this.f91099a.f91094b;
            if (str == null) {
                str = "";
            }
            gVar.mo67152b(str);
            return this;
        }

        /* renamed from: i */
        public final C38566a mo67106i(String str) {
            C89219l.m154721d(str, "");
            this.f91099a.f91094b.mo67153c(str);
            return this;
        }

        /* renamed from: j */
        public final C38566a mo67108j(String str) {
            this.f91099a.f91094b.f91150r = str;
            return this;
        }

        /* renamed from: k */
        public final C38566a mo67109k(String str) {
            C89219l.m154721d(str, "");
            this.f91099a.f91094b.mo67154d(str);
            return this;
        }

        /* renamed from: l */
        public final C38566a mo67110l(String str) {
            C89219l.m154721d(str, "");
            this.f91099a.f91094b.mo67155e(str);
            return this;
        }

        /* renamed from: m */
        public final C38566a mo67111m(String str) {
            C89219l.m154721d(str, "");
            this.f91099a.f91094b.mo67157f(str);
            return this;
        }

        /* renamed from: n */
        public final C38566a mo67112n(String str) {
            C89219l.m154721d(str, "");
            this.f91099a.f91094b.mo67158g(str);
            return this;
        }

        /* renamed from: o */
        public final C38566a mo67113o(String str) {
            C89219l.m154721d(str, "");
            this.f91099a.f91094b.mo67159h(str);
            return this;
        }

        /* renamed from: p */
        public final C38566a mo67114p(String str) {
            C89219l.m154721d(str, "");
            this.f91099a.f91094b.mo67161i(str);
            return this;
        }

        /* renamed from: q */
        public final C38566a mo67115q(String str) {
            C89219l.m154721d(str, "");
            this.f91099a.f91094b.mo67162j(str);
            return this;
        }

        /* renamed from: r */
        public final C38566a mo67116r(String str) {
            this.f91099a.f91097e.mo67139a(str);
            return this;
        }

        /* renamed from: s */
        public final C38566a mo67117s(String str) {
            C38568c cVar = this.f91099a.f91098f;
            if (str == null) {
                str = "";
            }
            cVar.mo67129a(str);
            return this;
        }

        /* renamed from: t */
        public final C38566a mo67118t(String str) {
            C38568c cVar = this.f91099a.f91098f;
            if (str == null) {
                str = "";
            }
            cVar.mo67130b(str);
            return this;
        }

        /* renamed from: u */
        public final C38566a mo67119u(String str) {
            C38568c cVar = this.f91099a.f91098f;
            if (str == null) {
                str = "";
            }
            cVar.mo67131c(str);
            return this;
        }

        /* renamed from: v */
        public final C38566a mo67120v(String str) {
            C38568c cVar = this.f91099a.f91098f;
            if (str == null) {
                str = "";
            }
            cVar.mo67132d(str);
            return this;
        }

        /* renamed from: w */
        public final C38566a mo67121w(String str) {
            C38568c cVar = this.f91099a.f91098f;
            if (str == null) {
                str = "";
            }
            cVar.mo67133e(str);
            return this;
        }

        /* renamed from: x */
        public final C38566a mo67122x(String str) {
            C38568c cVar = this.f91099a.f91098f;
            if (str == null) {
                str = "";
            }
            cVar.mo67135f(str);
            return this;
        }

        /* renamed from: y */
        public final C38566a mo67123y(String str) {
            C38568c cVar = this.f91099a.f91098f;
            if (str == null) {
                str = "";
            }
            cVar.mo67136g(str);
            return this;
        }

        /* renamed from: a */
        public final C38566a mo67080a(long j) {
            this.f91099a.f91093a.f91102c = j;
            return this;
        }

        /* renamed from: b */
        public final C38566a mo67087b(String str) {
            this.f91099a.f91093a.f91108i = str;
            return this;
        }

        /* renamed from: c */
        public final C38566a mo67091c(String str) {
            if (str != null) {
                try {
                    this.f91099a.f91093a.f91102c = Long.parseLong(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return this;
        }

        /* renamed from: d */
        public final C38566a mo67095d(boolean z) {
            this.f91099a.f91098f.f91112d = z;
            return this;
        }

        /* renamed from: e */
        public final C38566a mo67098e(boolean z) {
            this.f91099a.f91098f.f91117i = z;
            return this;
        }

        /* renamed from: a */
        public final C38566a mo67081a(AwemeRawAd awemeRawAd) {
            this.f91099a.f91093a.f91100a = awemeRawAd;
            return this;
        }

        /* renamed from: b */
        public final C38566a mo67088b(boolean z) {
            this.f91099a.f91094b.f91138f = z;
            return this;
        }

        /* renamed from: c */
        public final C38566a mo67092c(boolean z) {
            this.f91099a.f91094b.f91149q = z;
            return this;
        }

        /* renamed from: a */
        public final C38566a mo67082a(String str) {
            this.f91099a.f91093a.f91107h = str;
            return this;
        }

        /* renamed from: a */
        public final C38566a mo67083a(List<String> list) {
            C89219l.m154721d(list, "");
            this.f91099a.f91094b.mo67151a(list);
            return this;
        }

        /* renamed from: a */
        public final C38566a mo67084a(boolean z) {
            this.f91099a.f91094b.f91137e = z;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b$c */
    public static final class C38568c {

        /* renamed from: a */
        public String f91109a;

        /* renamed from: b */
        public String f91110b;

        /* renamed from: c */
        public String f91111c;

        /* renamed from: d */
        public boolean f91112d;

        /* renamed from: e */
        public boolean f91113e;

        /* renamed from: f */
        public String f91114f;

        /* renamed from: g */
        public int f91115g;

        /* renamed from: h */
        public int f91116h;

        /* renamed from: i */
        public boolean f91117i;

        /* renamed from: j */
        public String f91118j;

        /* renamed from: k */
        public String f91119k;

        /* renamed from: l */
        public String f91120l;

        static {
            Covode.recordClassIndex(46100);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38568c)) {
                return false;
            }
            C38568c cVar = (C38568c) obj;
            return C89219l.m154714a(this.f91109a, cVar.f91109a) && C89219l.m154714a(this.f91110b, cVar.f91110b) && C89219l.m154714a(this.f91111c, cVar.f91111c) && this.f91112d == cVar.f91112d && this.f91113e == cVar.f91113e && C89219l.m154714a(this.f91114f, cVar.f91114f) && this.f91115g == cVar.f91115g && this.f91116h == cVar.f91116h && this.f91117i == cVar.f91117i && C89219l.m154714a(this.f91118j, cVar.f91118j) && C89219l.m154714a(this.f91119k, cVar.f91119k) && C89219l.m154714a(this.f91120l, cVar.f91120l);
        }

        public final int hashCode() {
            String str = this.f91109a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f91110b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f91111c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            boolean z = this.f91112d;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode3 + i3) * 31;
            boolean z2 = this.f91113e;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            String str4 = this.f91114f;
            int hashCode4 = (((((i10 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f91115g) * 31) + this.f91116h) * 31;
            if (!this.f91117i) {
                i2 = 0;
            }
            int i11 = (hashCode4 + i2) * 31;
            String str5 = this.f91118j;
            int hashCode5 = (i11 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f91119k;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.f91120l;
            if (str7 != null) {
                i = str7.hashCode();
            }
            return hashCode6 + i;
        }

        public final String toString() {
            return "DownloadData(downloadUrl=" + this.f91109a + ", packageName=" + this.f91110b + ", quickAppUrl=" + this.f91111c + ", disableDownloadingDialog=" + this.f91112d + ", isFromAppAd=" + this.f91113e + ", appName=" + this.f91114f + ", downloadMode=" + this.f91115g + ", linkMode=" + this.f91116h + ", isSupportMultiple=" + this.f91117i + ", webUrl=" + this.f91118j + ", webTitle=" + this.f91119k + ", openUrl=" + this.f91120l + ")";
        }

        public /* synthetic */ C38568c() {
            this("", "", "", "", "", "", "");
        }

        /* renamed from: a */
        public final void mo67129a(String str) {
            C89219l.m154721d(str, "");
            this.f91109a = str;
        }

        /* renamed from: b */
        public final void mo67130b(String str) {
            C89219l.m154721d(str, "");
            this.f91110b = str;
        }

        /* renamed from: c */
        public final void mo67131c(String str) {
            C89219l.m154721d(str, "");
            this.f91111c = str;
        }

        /* renamed from: d */
        public final void mo67132d(String str) {
            C89219l.m154721d(str, "");
            this.f91114f = str;
        }

        /* renamed from: e */
        public final void mo67133e(String str) {
            C89219l.m154721d(str, "");
            this.f91118j = str;
        }

        /* renamed from: f */
        public final void mo67135f(String str) {
            C89219l.m154721d(str, "");
            this.f91119k = str;
        }

        /* renamed from: g */
        public final void mo67136g(String str) {
            C89219l.m154721d(str, "");
            this.f91120l = str;
        }

        private C38568c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            C89219l.m154721d(str7, "");
            this.f91109a = str;
            this.f91110b = str2;
            this.f91111c = str3;
            this.f91112d = false;
            this.f91113e = false;
            this.f91114f = str4;
            this.f91115g = 0;
            this.f91116h = 0;
            this.f91117i = false;
            this.f91118j = str5;
            this.f91119k = str6;
            this.f91120l = str7;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.b$g */
    public static final class C38572g {

        /* renamed from: A */
        public String f91130A;

        /* renamed from: B */
        public List<String> f91131B;

        /* renamed from: C */
        public int f91132C;

        /* renamed from: a */
        public String f91133a;

        /* renamed from: b */
        public String f91134b;

        /* renamed from: c */
        public boolean f91135c;

        /* renamed from: d */
        public Map<String, String> f91136d;

        /* renamed from: e */
        public boolean f91137e;

        /* renamed from: f */
        public boolean f91138f;

        /* renamed from: g */
        public Integer f91139g;

        /* renamed from: h */
        public boolean f91140h;

        /* renamed from: i */
        public C37892a f91141i;

        /* renamed from: j */
        public int f91142j;

        /* renamed from: k */
        public int f91143k;

        /* renamed from: l */
        public String f91144l;

        /* renamed from: m */
        public int f91145m;

        /* renamed from: n */
        public int f91146n;

        /* renamed from: o */
        public int f91147o;

        /* renamed from: p */
        public long f91148p;

        /* renamed from: q */
        public boolean f91149q;

        /* renamed from: r */
        public String f91150r;

        /* renamed from: s */
        public int f91151s;

        /* renamed from: t */
        public String f91152t;

        /* renamed from: u */
        public int f91153u;

        /* renamed from: v */
        public String f91154v;

        /* renamed from: w */
        public String f91155w;

        /* renamed from: x */
        public String f91156x;

        /* renamed from: y */
        public String f91157y;

        /* renamed from: z */
        public String f91158z;

        static {
            Covode.recordClassIndex(46104);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38572g)) {
                return false;
            }
            C38572g gVar = (C38572g) obj;
            return C89219l.m154714a(this.f91133a, gVar.f91133a) && C89219l.m154714a(this.f91134b, gVar.f91134b) && this.f91135c == gVar.f91135c && C89219l.m154714a(this.f91136d, gVar.f91136d) && this.f91137e == gVar.f91137e && this.f91138f == gVar.f91138f && C89219l.m154714a(this.f91139g, gVar.f91139g) && this.f91140h == gVar.f91140h && C89219l.m154714a(this.f91141i, gVar.f91141i) && this.f91142j == gVar.f91142j && this.f91143k == gVar.f91143k && C89219l.m154714a(this.f91144l, gVar.f91144l) && this.f91145m == gVar.f91145m && this.f91146n == gVar.f91146n && this.f91147o == gVar.f91147o && this.f91148p == gVar.f91148p && this.f91149q == gVar.f91149q && C89219l.m154714a(this.f91150r, gVar.f91150r) && this.f91151s == gVar.f91151s && C89219l.m154714a(this.f91152t, gVar.f91152t) && this.f91153u == gVar.f91153u && C89219l.m154714a(this.f91154v, gVar.f91154v) && C89219l.m154714a(this.f91155w, gVar.f91155w) && C89219l.m154714a(this.f91156x, gVar.f91156x) && C89219l.m154714a(this.f91157y, gVar.f91157y) && C89219l.m154714a(this.f91158z, gVar.f91158z) && C89219l.m154714a(this.f91130A, gVar.f91130A) && C89219l.m154714a(this.f91131B, gVar.f91131B) && this.f91132C == gVar.f91132C;
        }

        public final String toString() {
            return "WebUrlData(webUrl=" + this.f91133a + ", webTitle=" + this.f91134b + ", hideNavBar=" + this.f91135c + ", queryParams=" + this.f91136d + ", useOrdinaryWeb=" + this.f91137e + ", showReport=" + this.f91138f + ", backgroundColor=" + this.f91139g + ", forbiddenJump=" + this.f91140h + ", preloadData=" + this.f91141i + ", preloadWeb=" + this.f91142j + ", preloadWebNew=" + this.f91143k + ", webChannelName=" + this.f91144l + ", useWebUrl=" + this.f91145m + ", webType=" + this.f91146n + ", appAdFrom=" + this.f91147o + ", userClickTime=" + this.f91148p + ", isFromLynxLandPage=" + this.f91149q + ", secondPagePreloadChannelName=" + this.f91150r + ", landingStyle=" + this.f91151s + ", landingPageInfo=" + this.f91152t + ", landingAccessStyle=" + this.f91153u + ", renderType=" + this.f91154v + ", fullScreenBgImageUrl=" + this.f91155w + ", lynxChannelName=" + this.f91156x + ", nativeSiteCustomData=" + this.f91157y + ", nativeSiteAdInfo=" + this.f91158z + ", nativeSiteAppData=" + this.f91130A + ", secondPageGeckoChannels=" + this.f91131B + ", lynxLandPageStyle=" + this.f91132C + ")";
        }

        public /* synthetic */ C38572g() {
            this("", "", C89041ag.m154415a(), "", "", "", "", "", "", "", "", C89086z.INSTANCE);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            String str = this.f91133a;
            int i15 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i16 = i * 31;
            String str2 = this.f91134b;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i17 = (i16 + i2) * 31;
            boolean z = this.f91135c;
            int i18 = 1;
            if (z) {
                z = true;
            }
            int i19 = z ? 1 : 0;
            int i20 = z ? 1 : 0;
            int i21 = z ? 1 : 0;
            int i22 = (i17 + i19) * 31;
            Map<String, String> map = this.f91136d;
            if (map != null) {
                i3 = map.hashCode();
            } else {
                i3 = 0;
            }
            int i23 = (i22 + i3) * 31;
            boolean z2 = this.f91137e;
            if (z2) {
                z2 = true;
            }
            int i24 = z2 ? 1 : 0;
            int i25 = z2 ? 1 : 0;
            int i26 = z2 ? 1 : 0;
            int i27 = (i23 + i24) * 31;
            boolean z3 = this.f91138f;
            if (z3) {
                z3 = true;
            }
            int i28 = z3 ? 1 : 0;
            int i29 = z3 ? 1 : 0;
            int i30 = z3 ? 1 : 0;
            int i31 = (i27 + i28) * 31;
            Integer num = this.f91139g;
            if (num != null) {
                i4 = num.hashCode();
            } else {
                i4 = 0;
            }
            int i32 = (i31 + i4) * 31;
            boolean z4 = this.f91140h;
            if (z4) {
                z4 = true;
            }
            int i33 = z4 ? 1 : 0;
            int i34 = z4 ? 1 : 0;
            int i35 = z4 ? 1 : 0;
            int i36 = (i32 + i33) * 31;
            C37892a aVar = this.f91141i;
            if (aVar != null) {
                i5 = aVar.hashCode();
            } else {
                i5 = 0;
            }
            int i37 = (((((i36 + i5) * 31) + this.f91142j) * 31) + this.f91143k) * 31;
            String str3 = this.f91144l;
            if (str3 != null) {
                i6 = str3.hashCode();
            } else {
                i6 = 0;
            }
            long j = this.f91148p;
            int i38 = (((((((((i37 + i6) * 31) + this.f91145m) * 31) + this.f91146n) * 31) + this.f91147o) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            if (!this.f91149q) {
                i18 = 0;
            }
            int i39 = (i38 + i18) * 31;
            String str4 = this.f91150r;
            if (str4 != null) {
                i7 = str4.hashCode();
            } else {
                i7 = 0;
            }
            int i40 = (((i39 + i7) * 31) + this.f91151s) * 31;
            String str5 = this.f91152t;
            if (str5 != null) {
                i8 = str5.hashCode();
            } else {
                i8 = 0;
            }
            int i41 = (((i40 + i8) * 31) + this.f91153u) * 31;
            String str6 = this.f91154v;
            if (str6 != null) {
                i9 = str6.hashCode();
            } else {
                i9 = 0;
            }
            int i42 = (i41 + i9) * 31;
            String str7 = this.f91155w;
            if (str7 != null) {
                i10 = str7.hashCode();
            } else {
                i10 = 0;
            }
            int i43 = (i42 + i10) * 31;
            String str8 = this.f91156x;
            if (str8 != null) {
                i11 = str8.hashCode();
            } else {
                i11 = 0;
            }
            int i44 = (i43 + i11) * 31;
            String str9 = this.f91157y;
            if (str9 != null) {
                i12 = str9.hashCode();
            } else {
                i12 = 0;
            }
            int i45 = (i44 + i12) * 31;
            String str10 = this.f91158z;
            if (str10 != null) {
                i13 = str10.hashCode();
            } else {
                i13 = 0;
            }
            int i46 = (i45 + i13) * 31;
            String str11 = this.f91130A;
            if (str11 != null) {
                i14 = str11.hashCode();
            } else {
                i14 = 0;
            }
            int i47 = (i46 + i14) * 31;
            List<String> list = this.f91131B;
            if (list != null) {
                i15 = list.hashCode();
            }
            return ((i47 + i15) * 31) + this.f91132C;
        }

        /* renamed from: a */
        public final void mo67150a(String str) {
            C89219l.m154721d(str, "");
            this.f91133a = str;
        }

        /* renamed from: b */
        public final void mo67152b(String str) {
            C89219l.m154721d(str, "");
            this.f91134b = str;
        }

        /* renamed from: c */
        public final void mo67153c(String str) {
            C89219l.m154721d(str, "");
            this.f91144l = str;
        }

        /* renamed from: d */
        public final void mo67154d(String str) {
            C89219l.m154721d(str, "");
            this.f91152t = str;
        }

        /* renamed from: e */
        public final void mo67155e(String str) {
            C89219l.m154721d(str, "");
            this.f91154v = str;
        }

        /* renamed from: f */
        public final void mo67157f(String str) {
            C89219l.m154721d(str, "");
            this.f91155w = str;
        }

        /* renamed from: g */
        public final void mo67158g(String str) {
            C89219l.m154721d(str, "");
            this.f91156x = str;
        }

        /* renamed from: h */
        public final void mo67159h(String str) {
            C89219l.m154721d(str, "");
            this.f91157y = str;
        }

        /* renamed from: i */
        public final void mo67161i(String str) {
            C89219l.m154721d(str, "");
            this.f91158z = str;
        }

        /* renamed from: j */
        public final void mo67162j(String str) {
            C89219l.m154721d(str, "");
            this.f91130A = str;
        }

        /* renamed from: a */
        public final void mo67151a(List<String> list) {
            C89219l.m154721d(list, "");
            this.f91131B = list;
        }

        private C38572g(String str, String str2, Map<String, String> map, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            C89219l.m154721d(str7, "");
            C89219l.m154721d(str8, "");
            C89219l.m154721d(str9, "");
            C89219l.m154721d(str10, "");
            C89219l.m154721d(list, "");
            this.f91133a = str;
            this.f91134b = str2;
            this.f91135c = false;
            this.f91136d = map;
            this.f91137e = true;
            this.f91138f = false;
            this.f91139g = null;
            this.f91140h = true;
            this.f91141i = null;
            this.f91142j = 0;
            this.f91143k = 0;
            this.f91144l = str3;
            this.f91145m = 0;
            this.f91146n = 0;
            this.f91147o = 0;
            this.f91148p = 0;
            this.f91149q = false;
            this.f91150r = null;
            this.f91151s = 0;
            this.f91152t = str4;
            this.f91153u = 0;
            this.f91154v = str5;
            this.f91155w = str6;
            this.f91156x = str7;
            this.f91157y = str8;
            this.f91158z = str9;
            this.f91130A = str10;
            this.f91131B = list;
            this.f91132C = 0;
        }
    }

    public /* synthetic */ C38565b() {
        this(new C38567b(), new C38572g(), new C38571f(), new C38570e(), new C38569d(), new C38568c());
    }

    private C38565b(C38567b bVar, C38572g gVar, C38571f fVar, C38570e eVar, C38569d dVar, C38568c cVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        this.f91093a = bVar;
        this.f91094b = gVar;
        this.f91095c = fVar;
        this.f91096d = eVar;
        this.f91097e = dVar;
        this.f91098f = cVar;
    }
}
