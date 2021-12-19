package com.p2082ss.android.ugc.aweme.commercialize.link.p2574a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.a.a */
public final class C38036a {

    /* renamed from: a */
    public final String f89870a;

    /* renamed from: b */
    public final C38214ac f89871b;

    /* renamed from: c */
    public final Aweme f89872c;

    /* renamed from: d */
    public final boolean f89873d;

    /* renamed from: e */
    public final boolean f89874e;

    /* renamed from: f */
    public final int f89875f;

    /* renamed from: g */
    public final long f89876g;

    /* renamed from: h */
    public final String f89877h;

    static {
        Covode.recordClassIndex(45498);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38036a)) {
            return false;
        }
        C38036a aVar = (C38036a) obj;
        return C89219l.m154714a(this.f89870a, aVar.f89870a) && C89219l.m154714a(this.f89871b, aVar.f89871b) && C89219l.m154714a(this.f89872c, aVar.f89872c) && this.f89873d == aVar.f89873d && this.f89874e == aVar.f89874e && this.f89875f == aVar.f89875f && this.f89876g == aVar.f89876g && C89219l.m154714a(this.f89877h, aVar.f89877h);
    }

    public final String toString() {
        return "AdLinkLogParams(label=" + this.f89870a + ", linkData=" + this.f89871b + ", aweme=" + this.f89872c + ", fromCommentDialog=" + this.f89873d + ", useLinkExtra=" + this.f89874e + ", visibleRatio=" + this.f89875f + ", showDuration=" + this.f89876g + ", refer=" + this.f89877h + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f89870a;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        C38214ac acVar = this.f89871b;
        if (acVar != null) {
            i2 = acVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Aweme aweme = this.f89872c;
        if (aweme != null) {
            i3 = aweme.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        boolean z = this.f89873d;
        int i8 = 1;
        if (z) {
            z = true;
        }
        int i9 = z ? 1 : 0;
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = (i7 + i9) * 31;
        if (!this.f89874e) {
            i8 = 0;
        }
        long j = this.f89876g;
        int i13 = (((((i12 + i8) * 31) + this.f89875f) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f89877h;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i13 + i4;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.a.a$a */
    public static final class C38037a {

        /* renamed from: a */
        public String f89878a = "";

        /* renamed from: b */
        public C38214ac f89879b;

        /* renamed from: c */
        public Aweme f89880c;

        /* renamed from: d */
        public boolean f89881d;

        /* renamed from: e */
        public boolean f89882e = true;

        /* renamed from: f */
        public int f89883f = -1;

        /* renamed from: g */
        public long f89884g = -1;

        /* renamed from: h */
        public String f89885h = "";

        static {
            Covode.recordClassIndex(45499);
        }

        /* renamed from: a */
        public final C38036a mo66315a() {
            return new C38036a(this.f89878a, this.f89879b, this.f89880c, this.f89881d, this.f89882e, this.f89883f, this.f89884g, this.f89885h);
        }

        /* renamed from: a */
        public final C38037a mo66309a(int i) {
            this.f89883f = i;
            return this;
        }

        /* renamed from: a */
        public final C38037a mo66310a(long j) {
            this.f89884g = j;
            return this;
        }

        /* renamed from: a */
        public final C38037a mo66311a(C38214ac acVar) {
            this.f89879b = acVar;
            return this;
        }

        /* renamed from: a */
        public final C38037a mo66312a(Aweme aweme) {
            this.f89880c = aweme;
            return this;
        }

        /* renamed from: a */
        public final C38037a mo66313a(String str) {
            if (str == null) {
                str = "";
            }
            this.f89878a = str;
            return this;
        }

        /* renamed from: a */
        public final C38037a mo66314a(boolean z) {
            this.f89881d = z;
            return this;
        }
    }

    /* renamed from: b */
    public final void mo66305b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                long j = this.f89876g;
                if (j >= 0) {
                    jSONObject.put("duration", j);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo66304a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ad_extra_data")) {
                    jSONObject2 = jSONObject.getJSONObject("ad_extra_data");
                    C89219l.m154716b(jSONObject2, "");
                } else {
                    jSONObject2 = new JSONObject();
                }
                int i = this.f89875f;
                if (i >= 0) {
                    jSONObject2.put("pixel_pct", i);
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C38036a(String str, C38214ac acVar, Aweme aweme, boolean z, boolean z2, int i, long j, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f89870a = str;
        this.f89871b = acVar;
        this.f89872c = aweme;
        this.f89873d = z;
        this.f89874e = z2;
        this.f89875f = i;
        this.f89876g = j;
        this.f89877h = str2;
    }
}
