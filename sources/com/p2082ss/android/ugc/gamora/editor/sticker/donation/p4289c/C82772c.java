package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c.c */
public final class C82772c extends AbstractC82771b implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    private final String f185017a;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: b */
    private final String f185018b;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: c */
    private final UrlModel f185019c;
    @AbstractC27891c(mo46611a = "web_url")

    /* renamed from: d */
    private final String f185020d;
    @AbstractC27891c(mo46611a = "donation_link")

    /* renamed from: e */
    private final String f185021e;
    @AbstractC27891c(mo46611a = "add_time")

    /* renamed from: f */
    private String f185022f;
    @AbstractC27891c(mo46611a = "ngo_id")

    /* renamed from: g */
    private Integer f185023g;

    static {
        Covode.recordClassIndex(96622);
    }

    public static /* synthetic */ C82772c copy$default(C82772c cVar, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.getName();
        }
        if ((i & 2) != 0) {
            str2 = cVar.getDesc();
        }
        if ((i & 4) != 0) {
            urlModel = cVar.getIcon();
        }
        if ((i & 8) != 0) {
            str3 = cVar.getDetailUrl();
        }
        if ((i & 16) != 0) {
            str4 = cVar.getDonateLink();
        }
        if ((i & 32) != 0) {
            str5 = cVar.getAddTime();
        }
        if ((i & 64) != 0) {
            num = cVar.getNgoId();
        }
        return cVar.copy(str, str2, urlModel, str3, str4, str5, num);
    }

    public final String component1() {
        return getName();
    }

    public final String component2() {
        return getDesc();
    }

    public final UrlModel component3() {
        return getIcon();
    }

    public final String component4() {
        return getDetailUrl();
    }

    public final String component5() {
        return getDonateLink();
    }

    public final String component6() {
        return getAddTime();
    }

    public final Integer component7() {
        return getNgoId();
    }

    public final C82772c copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num) {
        return new C82772c(str, str2, urlModel, str3, str4, str5, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82772c)) {
            return false;
        }
        AbstractC82771b bVar = (AbstractC82771b) obj;
        return C89219l.m154714a(getName(), bVar.getName()) && C89219l.m154714a(getDesc(), bVar.getDesc()) && C89219l.m154714a(getIcon(), bVar.getIcon()) && C89219l.m154714a(getDetailUrl(), bVar.getDetailUrl()) && C89219l.m154714a(getDonateLink(), bVar.getDonateLink()) && C89219l.m154714a(getAddTime(), bVar.getAddTime()) && C89219l.m154714a(getNgoId(), bVar.getNgoId());
    }

    public final int hashCode() {
        String name = getName();
        int i = 0;
        int hashCode = (name != null ? name.hashCode() : 0) * 31;
        String desc = getDesc();
        int hashCode2 = (hashCode + (desc != null ? desc.hashCode() : 0)) * 31;
        UrlModel icon = getIcon();
        int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 31;
        String detailUrl = getDetailUrl();
        int hashCode4 = (hashCode3 + (detailUrl != null ? detailUrl.hashCode() : 0)) * 31;
        String donateLink = getDonateLink();
        int hashCode5 = (hashCode4 + (donateLink != null ? donateLink.hashCode() : 0)) * 31;
        String addTime = getAddTime();
        int hashCode6 = (hashCode5 + (addTime != null ? addTime.hashCode() : 0)) * 31;
        Integer ngoId = getNgoId();
        if (ngoId != null) {
            i = ngoId.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "OrganizationModel(name=" + getName() + ", desc=" + getDesc() + ", icon=" + getIcon() + ", detailUrl=" + getDetailUrl() + ", donateLink=" + getDonateLink() + ", addTime=" + getAddTime() + ", ngoId=" + getNgoId() + ")";
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getAddTime() {
        return this.f185022f;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getDesc() {
        return this.f185018b;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getDetailUrl() {
        return this.f185020d;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getDonateLink() {
        return this.f185021e;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final UrlModel getIcon() {
        return this.f185019c;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final String getName() {
        return this.f185017a;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final Integer getNgoId() {
        return this.f185023g;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b
    public final void setAddTime(String str) {
        this.f185022f = str;
    }

    public final void setNgoId(Integer num) {
        this.f185023g = num;
    }

    public C82772c(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num) {
        this.f185017a = str;
        this.f185018b = str2;
        this.f185019c = urlModel;
        this.f185020d = str3;
        this.f185021e = str4;
        this.f185022f = str5;
        this.f185023g = num;
    }
}
