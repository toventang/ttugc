package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c.e */
public final class C82774e extends AbstractC82771b implements Serializable {
    @AbstractC27891c(mo46611a = "ngo_id")

    /* renamed from: a */
    private Integer f185029a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    private final String f185030b;
    @AbstractC27891c(mo46611a = "name_highlights")

    /* renamed from: c */
    private List<C82776g> f185031c;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: d */
    private final String f185032d;
    @AbstractC27891c(mo46611a = "desc_highlights")

    /* renamed from: e */
    private List<C82776g> f185033e;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: f */
    private final UrlModel f185034f;
    @AbstractC27891c(mo46611a = "web_url")

    /* renamed from: g */
    private final String f185035g;
    @AbstractC27891c(mo46611a = "donation_link")

    /* renamed from: h */
    private final String f185036h;

    static {
        Covode.recordClassIndex(96624);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.sticker.donation.c.e */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C82774e copy$default(C82774e eVar, Integer num, String str, List list, String str2, List list2, UrlModel urlModel, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = eVar.getNgoId();
        }
        if ((i & 2) != 0) {
            str = eVar.getName();
        }
        if ((i & 4) != 0) {
            list = eVar.f185031c;
        }
        if ((i & 8) != 0) {
            str2 = eVar.getDesc();
        }
        if ((i & 16) != 0) {
            list2 = eVar.f185033e;
        }
        if ((i & 32) != 0) {
            urlModel = eVar.getIcon();
        }
        if ((i & 64) != 0) {
            str3 = eVar.getDetailUrl();
        }
        if ((i & 128) != 0) {
            str4 = eVar.getDonateLink();
        }
        return eVar.copy(num, str, list, str2, list2, urlModel, str3, str4);
    }

    public final Integer component1() {
        return getNgoId();
    }

    public final String component2() {
        return getName();
    }

    public final List<C82776g> component3() {
        return this.f185031c;
    }

    public final String component4() {
        return getDesc();
    }

    public final List<C82776g> component5() {
        return this.f185033e;
    }

    public final UrlModel component6() {
        return getIcon();
    }

    public final String component7() {
        return getDetailUrl();
    }

    public final String component8() {
        return getDonateLink();
    }

    public final C82774e copy(Integer num, String str, List<C82776g> list, String str2, List<C82776g> list2, UrlModel urlModel, String str3, String str4) {
        return new C82774e(num, str, list, str2, list2, urlModel, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82774e)) {
            return false;
        }
        C82774e eVar = (C82774e) obj;
        return C89219l.m154714a(getNgoId(), eVar.getNgoId()) && C89219l.m154714a(getName(), eVar.getName()) && C89219l.m154714a(this.f185031c, eVar.f185031c) && C89219l.m154714a(getDesc(), eVar.getDesc()) && C89219l.m154714a(this.f185033e, eVar.f185033e) && C89219l.m154714a(getIcon(), eVar.getIcon()) && C89219l.m154714a(getDetailUrl(), eVar.getDetailUrl()) && C89219l.m154714a(getDonateLink(), eVar.getDonateLink());
    }

    public final int hashCode() {
        Integer ngoId = getNgoId();
        int i = 0;
        int hashCode = (ngoId != null ? ngoId.hashCode() : 0) * 31;
        String name = getName();
        int hashCode2 = (hashCode + (name != null ? name.hashCode() : 0)) * 31;
        List<C82776g> list = this.f185031c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String desc = getDesc();
        int hashCode4 = (hashCode3 + (desc != null ? desc.hashCode() : 0)) * 31;
        List<C82776g> list2 = this.f185033e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        UrlModel icon = getIcon();
        int hashCode6 = (hashCode5 + (icon != null ? icon.hashCode() : 0)) * 31;
        String detailUrl = getDetailUrl();
        int hashCode7 = (hashCode6 + (detailUrl != null ? detailUrl.hashCode() : 0)) * 31;
        String donateLink = getDonateLink();
        if (donateLink != null) {
            i = donateLink.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "OrganizationSearchResultModel(ngoId=" + getNgoId() + ", name=" + getName() + ", textHighlightList=" + this.f185031c + ", desc=" + getDesc() + ", descHighlightList=" + this.f185033e + ", icon=" + getIcon() + ", detailUrl=" + getDetailUrl() + ", donateLink=" + getDonateLink() + ")";
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getDesc() {
        return this.f185032d;
    }

    public final List<C82776g> getDescHighlightList() {
        return this.f185033e;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getDetailUrl() {
        return this.f185035g;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getDonateLink() {
        return this.f185036h;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final UrlModel getIcon() {
        return this.f185034f;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getName() {
        return this.f185030b;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final Integer getNgoId() {
        return this.f185029a;
    }

    public final List<C82776g> getTextHighlightList() {
        return this.f185031c;
    }

    public final void setDescHighlightList(List<C82776g> list) {
        this.f185033e = list;
    }

    public final void setNgoId(Integer num) {
        this.f185029a = num;
    }

    public final void setTextHighlightList(List<C82776g> list) {
        this.f185031c = list;
    }

    public C82774e(Integer num, String str, List<C82776g> list, String str2, List<C82776g> list2, UrlModel urlModel, String str3, String str4) {
        this.f185029a = num;
        this.f185030b = str;
        this.f185031c = list;
        this.f185032d = str2;
        this.f185033e = list2;
        this.f185034f = urlModel;
        this.f185035g = str3;
        this.f185036h = str4;
    }
}
