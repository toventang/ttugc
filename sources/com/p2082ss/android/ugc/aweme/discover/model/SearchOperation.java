package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchOperation */
public final class SearchOperation implements Serializable {
    @AbstractC27891c(mo46611a = "banner")
    private UrlModel banner;
    @AbstractC27891c(mo46611a = "activity_id")
    private String cardId;
    @AbstractC27891c(mo46611a = "link_desc")
    private String desc;
    @AbstractC27891c(mo46611a = "doc_id")
    private String docId;
    private boolean isLive;
    @AbstractC27891c(mo46611a = "link_url")
    private String link;
    @AbstractC27891c(mo46611a = "live_type")
    private Integer liveType;
    private boolean recorded;
    @AbstractC27891c(mo46611a = "related_users")
    private List<? extends User> relatedUsers;
    @AbstractC27891c(mo46611a = "scale")
    private Integer scale;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(50509);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.SearchOperation */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchOperation copy$default(SearchOperation searchOperation, String str, String str2, String str3, UrlModel urlModel, String str4, List list, Integer num, Integer num2, boolean z, boolean z2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchOperation.title;
        }
        if ((i & 2) != 0) {
            str2 = searchOperation.desc;
        }
        if ((i & 4) != 0) {
            str3 = searchOperation.link;
        }
        if ((i & 8) != 0) {
            urlModel = searchOperation.banner;
        }
        if ((i & 16) != 0) {
            str4 = searchOperation.cardId;
        }
        if ((i & 32) != 0) {
            list = searchOperation.relatedUsers;
        }
        if ((i & 64) != 0) {
            num = searchOperation.scale;
        }
        if ((i & 128) != 0) {
            num2 = searchOperation.liveType;
        }
        if ((i & 256) != 0) {
            z = searchOperation.recorded;
        }
        if ((i & 512) != 0) {
            z2 = searchOperation.isLive;
        }
        if ((i & 1024) != 0) {
            str5 = searchOperation.docId;
        }
        return searchOperation.copy(str, str2, str3, urlModel, str4, list, num, num2, z, z2, str5);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component10() {
        return this.isLive;
    }

    public final String component11() {
        return this.docId;
    }

    public final String component2() {
        return this.desc;
    }

    public final String component3() {
        return this.link;
    }

    public final UrlModel component4() {
        return this.banner;
    }

    public final String component5() {
        return this.cardId;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> component6() {
        return this.relatedUsers;
    }

    public final Integer component7() {
        return this.scale;
    }

    public final Integer component8() {
        return this.liveType;
    }

    public final boolean component9() {
        return this.recorded;
    }

    public final SearchOperation copy(String str, String str2, String str3, UrlModel urlModel, String str4, List<? extends User> list, Integer num, Integer num2, boolean z, boolean z2, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str4, "");
        return new SearchOperation(str, str2, str3, urlModel, str4, list, num, num2, z, z2, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchOperation)) {
            return false;
        }
        SearchOperation searchOperation = (SearchOperation) obj;
        return C89219l.m154714a(this.title, searchOperation.title) && C89219l.m154714a(this.desc, searchOperation.desc) && C89219l.m154714a(this.link, searchOperation.link) && C89219l.m154714a(this.banner, searchOperation.banner) && C89219l.m154714a(this.cardId, searchOperation.cardId) && C89219l.m154714a(this.relatedUsers, searchOperation.relatedUsers) && C89219l.m154714a(this.scale, searchOperation.scale) && C89219l.m154714a(this.liveType, searchOperation.liveType) && this.recorded == searchOperation.recorded && this.isLive == searchOperation.isLive && C89219l.m154714a(this.docId, searchOperation.docId);
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.link;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.banner;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str4 = this.cardId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<? extends User> list = this.relatedUsers;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.scale;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.liveType;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.recorded;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode8 + i3) * 31;
        if (!this.isLive) {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str5 = this.docId;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        return "SearchOperation(title=" + this.title + ", desc=" + this.desc + ", link=" + this.link + ", banner=" + this.banner + ", cardId=" + this.cardId + ", relatedUsers=" + this.relatedUsers + ", scale=" + this.scale + ", liveType=" + this.liveType + ", recorded=" + this.recorded + ", isLive=" + this.isLive + ", docId=" + this.docId + ")";
    }

    public final UrlModel getBanner() {
        return this.banner;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final String getLink() {
        return this.link;
    }

    public final Integer getLiveType() {
        return this.liveType;
    }

    public final boolean getRecorded() {
        return this.recorded;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getRelatedUsers() {
        return this.relatedUsers;
    }

    public final Integer getScale() {
        return this.scale;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isPortraitVideo() {
        Integer num = this.liveType;
        if (num != null && num.intValue() == 2) {
            return false;
        }
        return true;
    }

    public final void setDocId(String str) {
        this.docId = str;
    }

    public final void setLive(boolean z) {
        this.isLive = z;
    }

    public final void setLiveType(Integer num) {
        this.liveType = num;
    }

    public final void setRecorded(boolean z) {
        this.recorded = z;
    }

    public final void setRelatedUsers(List<? extends User> list) {
        this.relatedUsers = list;
    }

    public final void setScale(Integer num) {
        this.scale = num;
    }

    public final void setBanner(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        this.banner = urlModel;
    }

    public final void setCardId(String str) {
        C89219l.m154721d(str, "");
        this.cardId = str;
    }

    public final void setDesc(String str) {
        C89219l.m154721d(str, "");
        this.desc = str;
    }

    public final void setLink(String str) {
        C89219l.m154721d(str, "");
        this.link = str;
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        this.title = str;
    }

    public SearchOperation(String str, String str2, String str3, UrlModel urlModel, String str4, List<? extends User> list, Integer num, Integer num2, boolean z, boolean z2, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str4, "");
        this.title = str;
        this.desc = str2;
        this.link = str3;
        this.banner = urlModel;
        this.cardId = str4;
        this.relatedUsers = list;
        this.scale = num;
        this.liveType = num2;
        this.recorded = z;
        this.isLive = z2;
        this.docId = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchOperation(String str, String str2, String str3, UrlModel urlModel, String str4, List list, Integer num, Integer num2, boolean z, boolean z2, String str5, int i, C89214g gVar) {
        this(str, str2, str3, urlModel, str4, list, num, num2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, str5);
    }
}
