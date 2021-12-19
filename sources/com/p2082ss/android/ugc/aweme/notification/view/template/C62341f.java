package com.p2082ss.android.ugc.aweme.notification.view.template;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.f */
public final class C62341f {

    /* renamed from: a */
    public final C61630e f141474a;

    /* renamed from: b */
    public final View f141475b;

    /* renamed from: c */
    public final String f141476c;

    /* renamed from: d */
    public final EnumC62343h f141477d;

    /* renamed from: e */
    public final int f141478e;

    /* renamed from: f */
    public final String f141479f;

    /* renamed from: g */
    public final String f141480g;

    /* renamed from: h */
    public final String f141481h;

    /* renamed from: i */
    public final boolean f141482i;

    static {
        Covode.recordClassIndex(73126);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62341f)) {
            return false;
        }
        C62341f fVar = (C62341f) obj;
        return C89219l.m154714a(this.f141474a, fVar.f141474a) && C89219l.m154714a(this.f141475b, fVar.f141475b) && C89219l.m154714a(this.f141476c, fVar.f141476c) && C89219l.m154714a(this.f141477d, fVar.f141477d) && this.f141478e == fVar.f141478e && C89219l.m154714a(this.f141479f, fVar.f141479f) && C89219l.m154714a(this.f141480g, fVar.f141480g) && C89219l.m154714a(this.f141481h, fVar.f141481h) && this.f141482i == fVar.f141482i;
    }

    public final int hashCode() {
        C61630e eVar = this.f141474a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        View view = this.f141475b;
        int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
        String str = this.f141476c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        EnumC62343h hVar = this.f141477d;
        int hashCode4 = (((hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f141478e) * 31;
        String str2 = this.f141479f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141480g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f141481h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z = this.f141482i;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "NoticeTemplateClickData(notice=" + this.f141474a + ", view=" + this.f141475b + ", schema=" + this.f141476c + ", position=" + this.f141477d + ", clientOrder=" + this.f141478e + ", timelineType=" + this.f141479f + ", tabName=" + this.f141480g + ", enterFrom=" + this.f141481h + ", isSecondPage=" + this.f141482i + ")";
    }

    public C62341f(C61630e eVar, View view, String str, EnumC62343h hVar, int i, String str2, String str3, String str4, boolean z) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str4, "");
        this.f141474a = eVar;
        this.f141475b = view;
        this.f141476c = str;
        this.f141477d = hVar;
        this.f141478e = i;
        this.f141479f = str2;
        this.f141480g = str3;
        this.f141481h = str4;
        this.f141482i = z;
    }
}
