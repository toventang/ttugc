package com.p2082ss.android.ugc.aweme.filter.repository.p2986a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.f */
public final class C50698f {

    /* renamed from: a */
    public final int f117047a;

    /* renamed from: b */
    public final String f117048b;

    /* renamed from: c */
    public final String f117049c;

    /* renamed from: d */
    public final String f117050d;

    /* renamed from: e */
    public final ToolsUrlModel f117051e;

    /* renamed from: f */
    public final List<String> f117052f;

    /* renamed from: g */
    public final String f117053g;

    /* renamed from: h */
    public final Uri f117054h;

    /* renamed from: i */
    public final String f117055i;

    static {
        Covode.recordClassIndex(59860);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50698f)) {
            return false;
        }
        C50698f fVar = (C50698f) obj;
        return this.f117047a == fVar.f117047a && C89219l.m154714a(this.f117048b, fVar.f117048b) && C89219l.m154714a(this.f117049c, fVar.f117049c) && C89219l.m154714a(this.f117050d, fVar.f117050d) && C89219l.m154714a(this.f117051e, fVar.f117051e) && C89219l.m154714a(this.f117052f, fVar.f117052f) && C89219l.m154714a(this.f117053g, fVar.f117053g) && C89219l.m154714a(this.f117054h, fVar.f117054h) && C89219l.m154714a(this.f117055i, fVar.f117055i);
    }

    public final int hashCode() {
        int i = this.f117047a * 31;
        String str = this.f117048b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f117049c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f117050d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ToolsUrlModel toolsUrlModel = this.f117051e;
        int hashCode4 = (hashCode3 + (toolsUrlModel != null ? toolsUrlModel.hashCode() : 0)) * 31;
        List<String> list = this.f117052f;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.f117053g;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Uri uri = this.f117054h;
        int hashCode7 = (hashCode6 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str5 = this.f117055i;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "FilterMeta(id=" + this.f117047a + ", resId=" + this.f117048b + ", name=" + this.f117049c + ", enName=" + this.f117050d + ", resource=" + this.f117051e + ", tags=" + this.f117052f + ", tagsUpdatedAt=" + this.f117053g + ", thumbnail=" + this.f117054h + ", extra=" + this.f117055i + ")";
    }

    public C50698f(int i, String str, String str2, String str3, ToolsUrlModel toolsUrlModel, List<String> list, String str4, Uri uri, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        this.f117047a = i;
        this.f117048b = str;
        this.f117049c = str2;
        this.f117050d = str3;
        this.f117051e = toolsUrlModel;
        this.f117052f = list;
        this.f117053g = str4;
        this.f117054h = uri;
        this.f117055i = str5;
    }
}
