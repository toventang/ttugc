package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContent */
public final class SystemCardContent extends BaseContent {
    @AbstractC27891c(mo46611a = "business_id")
    private String businessId;
    @AbstractC27891c(mo46611a = "extract")
    private final String extract;
    @AbstractC27891c(mo46611a = "link_cards")
    private final List<LinkCard> linkCards;
    @AbstractC27891c(mo46611a = "link_info")
    private LinkInfo linkInfo;
    @AbstractC27891c(mo46611a = "text_info")
    private TextInfo textInfo;
    @AbstractC27891c(mo46611a = "title")
    private Title title;
    @AbstractC27891c(mo46611a = "video_info")
    private VideoInfo videoInfo;

    static {
        Covode.recordClassIndex(63478);
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getExtract() {
        return this.extract;
    }

    public final List<LinkCard> getLinkCards() {
        return this.linkCards;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public final TextInfo getTextInfo() {
        return this.textInfo;
    }

    public final Title getTitle() {
        return this.title;
    }

    public final VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final void setBusinessId(String str) {
        this.businessId = str;
    }

    public final void setLinkInfo(LinkInfo linkInfo2) {
        this.linkInfo = linkInfo2;
    }

    public final void setTextInfo(TextInfo textInfo2) {
        this.textInfo = textInfo2;
    }

    public final void setTitle(Title title2) {
        this.title = title2;
    }

    public final void setVideoInfo(VideoInfo videoInfo2) {
        this.videoInfo = videoInfo2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        MessageTitle title2;
        if (C17453a.m32409b(this.extract)) {
            String str3 = this.extract;
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        C17191a.C17192a aVar = new C17191a.C17192a();
        TextInfo textInfo2 = this.textInfo;
        if (textInfo2 == null || (title2 = textInfo2.getTitle()) == null || (str2 = title2.getTitle()) == null) {
            str2 = "";
        }
        String aVar2 = aVar.mo27177a(str2).f40973a.toString();
        C89219l.m154716b(aVar2, "");
        return aVar2;
    }
}
