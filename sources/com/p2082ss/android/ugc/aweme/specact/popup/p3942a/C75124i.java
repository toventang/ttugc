package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.i */
public final class C75124i {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public int f168881a;
    @AbstractC27891c(mo46611a = "style")

    /* renamed from: b */
    public int f168882b;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: c */
    public String f168883c;
    @AbstractC27891c(mo46611a = "activity_id")

    /* renamed from: d */
    public String f168884d;
    @AbstractC27891c(mo46611a = "cover_img")

    /* renamed from: e */
    public String f168885e;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: f */
    public String f168886f;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: g */
    public String f168887g;
    @AbstractC27891c(mo46611a = "top_image")

    /* renamed from: h */
    public String f168888h;
    @AbstractC27891c(mo46611a = "progress_bar")

    /* renamed from: i */
    public C75122g f168889i;
    @AbstractC27891c(mo46611a = "font")

    /* renamed from: j */
    public C75119d f168890j;
    @AbstractC27891c(mo46611a = "body")

    /* renamed from: k */
    public List<C75116a> f168891k;
    @AbstractC27891c(mo46611a = "buttons")

    /* renamed from: l */
    public List<C75117b> f168892l;
    @AbstractC27891c(mo46611a = "frequency_control")

    /* renamed from: m */
    public C75120e f168893m;
    @AbstractC27891c(mo46611a = "priority")

    /* renamed from: n */
    public int f168894n;
    @AbstractC27891c(mo46611a = "others")

    /* renamed from: o */
    public C75121f f168895o;
    @AbstractC27891c(mo46611a = "activity_start_time")

    /* renamed from: p */
    public long f168896p;
    @AbstractC27891c(mo46611a = "activity_end_time")

    /* renamed from: q */
    public long f168897q;
    @AbstractC27891c(mo46611a = "colors")

    /* renamed from: r */
    public List<String> f168898r;
    @AbstractC27891c(mo46611a = "round")

    /* renamed from: s */
    public int f168899s;

    static {
        Covode.recordClassIndex(87997);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75124i)) {
            return false;
        }
        C75124i iVar = (C75124i) obj;
        return this.f168881a == iVar.f168881a && this.f168882b == iVar.f168882b && C89219l.m154714a(this.f168883c, iVar.f168883c) && C89219l.m154714a(this.f168884d, iVar.f168884d) && C89219l.m154714a(this.f168885e, iVar.f168885e) && C89219l.m154714a(this.f168886f, iVar.f168886f) && C89219l.m154714a(this.f168887g, iVar.f168887g) && C89219l.m154714a(this.f168888h, iVar.f168888h) && C89219l.m154714a(this.f168889i, iVar.f168889i) && C89219l.m154714a(this.f168890j, iVar.f168890j) && C89219l.m154714a(this.f168891k, iVar.f168891k) && C89219l.m154714a(this.f168892l, iVar.f168892l) && C89219l.m154714a(this.f168893m, iVar.f168893m) && this.f168894n == iVar.f168894n && C89219l.m154714a(this.f168895o, iVar.f168895o) && this.f168896p == iVar.f168896p && this.f168897q == iVar.f168897q && C89219l.m154714a(this.f168898r, iVar.f168898r) && this.f168899s == iVar.f168899s;
    }

    public final String toString() {
        return "SpecActPopupInfo(type=" + this.f168881a + ", style=" + this.f168882b + ", name=" + this.f168883c + ", activityId=" + this.f168884d + ", coverImg=" + this.f168885e + ", title=" + this.f168886f + ", desc=" + this.f168887g + ", topImage=" + this.f168888h + ", progressBar=" + this.f168889i + ", font=" + this.f168890j + ", body=" + this.f168891k + ", buttons=" + this.f168892l + ", frequencyControl=" + this.f168893m + ", priority=" + this.f168894n + ", others=" + this.f168895o + ", activityStartTime=" + this.f168896p + ", activityEndTime=" + this.f168897q + ", colors=" + this.f168898r + ", round=" + this.f168899s + ")";
    }

    private /* synthetic */ C75124i() {
        this("", "", "", "", "", "", new C75122g(), new C75119d(), new ArrayList(), new ArrayList(), new C75120e((byte) 0), new C75121f(), new ArrayList());
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
        int i13 = ((this.f168881a * 31) + this.f168882b) * 31;
        String str = this.f168883c;
        int i14 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i15 = (i13 + i) * 31;
        String str2 = this.f168884d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        String str3 = this.f168885e;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str4 = this.f168886f;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        String str5 = this.f168887g;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 31;
        String str6 = this.f168888h;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 31;
        C75122g gVar = this.f168889i;
        if (gVar != null) {
            i7 = gVar.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        C75119d dVar = this.f168890j;
        if (dVar != null) {
            i8 = dVar.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        List<C75116a> list = this.f168891k;
        if (list != null) {
            i9 = list.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        List<C75117b> list2 = this.f168892l;
        if (list2 != null) {
            i10 = list2.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 31;
        C75120e eVar = this.f168893m;
        if (eVar != null) {
            i11 = eVar.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (((i24 + i11) * 31) + this.f168894n) * 31;
        C75121f fVar = this.f168895o;
        if (fVar != null) {
            i12 = fVar.hashCode();
        } else {
            i12 = 0;
        }
        long j = this.f168896p;
        long j2 = this.f168897q;
        int i26 = (((((i25 + i12) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<String> list3 = this.f168898r;
        if (list3 != null) {
            i14 = list3.hashCode();
        }
        return ((i26 + i14) * 31) + this.f168899s;
    }

    private C75124i(String str, String str2, String str3, String str4, String str5, String str6, C75122g gVar, C75119d dVar, List<C75116a> list, List<C75117b> list2, C75120e eVar, C75121f fVar, List<String> list3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(list3, "");
        this.f168881a = 0;
        this.f168882b = 0;
        this.f168883c = str;
        this.f168884d = str2;
        this.f168885e = str3;
        this.f168886f = str4;
        this.f168887g = str5;
        this.f168888h = str6;
        this.f168889i = gVar;
        this.f168890j = dVar;
        this.f168891k = list;
        this.f168892l = list2;
        this.f168893m = eVar;
        this.f168894n = 0;
        this.f168895o = fVar;
        this.f168896p = 0;
        this.f168897q = 0;
        this.f168898r = list3;
        this.f168899s = 0;
    }
}
