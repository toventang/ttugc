package com.p2082ss.android.ugc.aweme.model.api.p3459a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.a.b */
public final class C60107b implements Serializable {
    @AbstractC27891c(mo46611a = "navi_id")

    /* renamed from: a */
    private String f137008a;
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: b */
    private String f137009b;
    @AbstractC27891c(mo46611a = "background_color")

    /* renamed from: c */
    private String f137010c;
    @AbstractC27891c(mo46611a = "animated_gifs")

    /* renamed from: d */
    private List<C60106a> f137011d;
    @AbstractC27891c(mo46611a = "features")

    /* renamed from: e */
    private List<C60108c> f137012e;
    @AbstractC27891c(mo46611a = "staticImage")

    /* renamed from: f */
    private List<C60113g> f137013f;

    static {
        Covode.recordClassIndex(70618);
    }

    public C60107b() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.model.api.a.b */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C60107b copy$default(C60107b bVar, String str, String str2, String str3, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f137008a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f137009b;
        }
        if ((i & 4) != 0) {
            str3 = bVar.f137010c;
        }
        if ((i & 8) != 0) {
            list = bVar.f137011d;
        }
        if ((i & 16) != 0) {
            list2 = bVar.f137012e;
        }
        if ((i & 32) != 0) {
            list3 = bVar.f137013f;
        }
        return bVar.copy(str, str2, str3, list, list2, list3);
    }

    public final String component1() {
        return this.f137008a;
    }

    public final String component2() {
        return this.f137009b;
    }

    public final String component3() {
        return this.f137010c;
    }

    public final List<C60106a> component4() {
        return this.f137011d;
    }

    public final List<C60108c> component5() {
        return this.f137012e;
    }

    public final List<C60113g> component6() {
        return this.f137013f;
    }

    public final C60107b copy(String str, String str2, String str3, List<C60106a> list, List<C60108c> list2, List<C60113g> list3) {
        C89219l.m154721d(str3, "");
        return new C60107b(str, str2, str3, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60107b)) {
            return false;
        }
        C60107b bVar = (C60107b) obj;
        return C89219l.m154714a(this.f137008a, bVar.f137008a) && C89219l.m154714a(this.f137009b, bVar.f137009b) && C89219l.m154714a(this.f137010c, bVar.f137010c) && C89219l.m154714a(this.f137011d, bVar.f137011d) && C89219l.m154714a(this.f137012e, bVar.f137012e) && C89219l.m154714a(this.f137013f, bVar.f137013f);
    }

    public final int hashCode() {
        String str = this.f137008a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f137009b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f137010c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<C60106a> list = this.f137011d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<C60108c> list2 = this.f137012e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C60113g> list3 = this.f137013f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "ProfileNaviDataModel(navi_id=" + this.f137008a + ", user_id=" + this.f137009b + ", background_color=" + this.f137010c + ", animationList=" + this.f137011d + ", features=" + this.f137012e + ", staticImage=" + this.f137013f + ")";
    }

    public final List<C60106a> getAnimationList() {
        return this.f137011d;
    }

    public final String getBackground_color() {
        return this.f137010c;
    }

    public final List<C60108c> getFeatures() {
        return this.f137012e;
    }

    public final String getNavi_id() {
        return this.f137008a;
    }

    public final List<C60113g> getStaticImage() {
        return this.f137013f;
    }

    public final String getUser_id() {
        return this.f137009b;
    }

    public final void setAnimationList(List<C60106a> list) {
        this.f137011d = list;
    }

    public final void setFeatures(List<C60108c> list) {
        this.f137012e = list;
    }

    public final void setNavi_id(String str) {
        this.f137008a = str;
    }

    public final void setStaticImage(List<C60113g> list) {
        this.f137013f = list;
    }

    public final void setUser_id(String str) {
        this.f137009b = str;
    }

    public final void setBackground_color(String str) {
        C89219l.m154721d(str, "");
        this.f137010c = str;
    }

    public C60107b(String str, String str2, String str3, List<C60106a> list, List<C60108c> list2, List<C60113g> list3) {
        C89219l.m154721d(str3, "");
        this.f137008a = str;
        this.f137009b = str2;
        this.f137010c = str3;
        this.f137011d = list;
        this.f137012e = list2;
        this.f137013f = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60107b(String str, String str2, String str3, List list, List list2, List list3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "#A5E6FF" : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) == 0 ? list3 : null);
    }
}
