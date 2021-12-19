package com.p2082ss.android.ugc.aweme.mvtemplate.p3486a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.a.e */
public final class C61249e {

    /* renamed from: o */
    public static final C61250a f139081o = new C61250a((byte) 0);
    @AbstractC27891c(mo46611a = "template_id")

    /* renamed from: a */
    public final long f139082a;
    @AbstractC27891c(mo46611a = "author")

    /* renamed from: b */
    public final User f139083b;
    @AbstractC27891c(mo46611a = "music")

    /* renamed from: c */
    public final Music f139084c;
    @AbstractC27891c(mo46611a = "video")

    /* renamed from: d */
    public final Video f139085d;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: e */
    public final String f139086e;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: f */
    public final String f139087f;
    @AbstractC27891c(mo46611a = "template_url")

    /* renamed from: g */
    public final String f139088g;
    @AbstractC27891c(mo46611a = "fragment_count")

    /* renamed from: h */
    public final int f139089h;
    @AbstractC27891c(mo46611a = "usage_amount")

    /* renamed from: i */
    public final long f139090i;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: j */
    public final String f139091j;
    @AbstractC27891c(mo46611a = "is_collected")

    /* renamed from: k */
    public final boolean f139092k;
    @AbstractC27891c(mo46611a = "sdk_version")

    /* renamed from: l */
    public final String f139093l;
    @AbstractC27891c(mo46611a = "item_type")

    /* renamed from: m */
    public final int f139094m;
    @AbstractC27891c(mo46611a = "md5")

    /* renamed from: n */
    public final String f139095n;

    static {
        Covode.recordClassIndex(71862);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61249e)) {
            return false;
        }
        C61249e eVar = (C61249e) obj;
        return this.f139082a == eVar.f139082a && C89219l.m154714a(this.f139083b, eVar.f139083b) && C89219l.m154714a(this.f139084c, eVar.f139084c) && C89219l.m154714a(this.f139085d, eVar.f139085d) && C89219l.m154714a(this.f139086e, eVar.f139086e) && C89219l.m154714a(this.f139087f, eVar.f139087f) && C89219l.m154714a(this.f139088g, eVar.f139088g) && this.f139089h == eVar.f139089h && this.f139090i == eVar.f139090i && C89219l.m154714a(this.f139091j, eVar.f139091j) && this.f139092k == eVar.f139092k && C89219l.m154714a(this.f139093l, eVar.f139093l) && this.f139094m == eVar.f139094m && C89219l.m154714a(this.f139095n, eVar.f139095n);
    }

    public final String toString() {
        return "TemplateResponseItem(id=" + this.f139082a + ", author=" + this.f139083b + ", music=" + this.f139084c + ", video=" + this.f139085d + ", title=" + this.f139086e + ", description=" + this.f139087f + ", templateUrl=" + this.f139088g + ", fragmentCount=" + this.f139089h + ", usageAmount=" + this.f139090i + ", extra=" + this.f139091j + ", isCollected=" + this.f139092k + ", sdkVersion=" + this.f139093l + ", itemType=" + this.f139094m + ", md5=" + this.f139095n + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.a.e$a */
    public static final class C61250a {
        static {
            Covode.recordClassIndex(71863);
        }

        private C61250a() {
        }

        public /* synthetic */ C61250a(byte b) {
            this();
        }
    }

    private /* synthetic */ C61249e() {
        this("not_set", "not_set", "not_set", "not_set", "not_set", "not_set");
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
        long j = this.f139082a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        User user = this.f139083b;
        int i10 = 0;
        if (user != null) {
            i = user.hashCode();
        } else {
            i = 0;
        }
        int i11 = (i9 + i) * 31;
        Music music = this.f139084c;
        if (music != null) {
            i2 = music.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        Video video = this.f139085d;
        if (video != null) {
            i3 = video.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        String str = this.f139086e;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        String str2 = this.f139087f;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        String str3 = this.f139088g;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        long j2 = this.f139090i;
        int i16 = (((((i15 + i6) * 31) + this.f139089h) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str4 = this.f139091j;
        if (str4 != null) {
            i7 = str4.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        boolean z = this.f139092k;
        if (z) {
            z = true;
        }
        int i18 = z ? 1 : 0;
        int i19 = z ? 1 : 0;
        int i20 = z ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        String str5 = this.f139093l;
        if (str5 != null) {
            i8 = str5.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (((i21 + i8) * 31) + this.f139094m) * 31;
        String str6 = this.f139095n;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return i22 + i10;
    }

    private C61249e(String str, String str2, String str3, String str4, String str5, String str6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f139082a = -1;
        this.f139083b = null;
        this.f139084c = null;
        this.f139085d = null;
        this.f139086e = str;
        this.f139087f = str2;
        this.f139088g = str3;
        this.f139089h = 0;
        this.f139090i = 0;
        this.f139091j = str4;
        this.f139092k = false;
        this.f139093l = str5;
        this.f139094m = -1;
        this.f139095n = str6;
    }
}
