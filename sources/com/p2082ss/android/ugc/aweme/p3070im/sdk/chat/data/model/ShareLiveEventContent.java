package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent */
public class ShareLiveEventContent extends BaseContent {
    @AbstractC27891c(mo46611a = "event_id")
    private String eventId;
    @AbstractC27891c(mo46611a = "link_url")
    private String linkUrl;
    @AbstractC27891c(mo46611a = "organizer_avatar")
    private UrlModel organizerAvatar;
    @AbstractC27891c(mo46611a = "organizer_enterprise")
    private String organizerEnterprise;
    @AbstractC27891c(mo46611a = "organizer_id")
    private String organizerId;
    @AbstractC27891c(mo46611a = "organizer_name")
    private String organizerName;
    @AbstractC27891c(mo46611a = "organizer_verify_reason")
    private String organizerVerifyReason;
    @AbstractC27891c(mo46611a = "start_time")
    private String startTime;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(63465);
    }

    public String getEventId() {
        return this.eventId;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public UrlModel getOrganizerAvatar() {
        return this.organizerAvatar;
    }

    public String getOrganizerEnterprise() {
        return this.organizerEnterprise;
    }

    public String getOrganizerName() {
        return this.organizerName;
    }

    public String getOrganizerVerifyReason() {
        return this.organizerVerifyReason;
    }

    public String getOrganizerd() {
        return this.organizerId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("live_event");
        a.f155492i.putString("live_event_title", getTitle());
        return a;
    }

    public void setEventId(String str) {
        this.eventId = str;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setOrganizerAvatar(UrlModel urlModel) {
        this.organizerAvatar = urlModel;
    }

    public void setOrganizerEnterprise(String str) {
        this.organizerEnterprise = str;
    }

    public void setOrganizerId(String str) {
        this.organizerId = str;
    }

    public void setOrganizerName(String str) {
        this.organizerName = str;
    }

    public void setOrganizerVerifyReason(String str) {
        this.organizerVerifyReason = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cfw);
    }

    public static ShareLiveEventContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f155492i.getString("live_event_id");
        String string2 = sharePackage.f155492i.getString("live_event_title");
        String string3 = sharePackage.f155492i.getString("live_event_start_time");
        String string4 = sharePackage.f155492i.getString("live_event_internal_share_url");
        String string5 = sharePackage.f155492i.getString("live_event_author_id");
        String string6 = sharePackage.f155492i.getString("live_event_author_name");
        String string7 = sharePackage.f155492i.getString("live_event_author_verify_info");
        String string8 = sharePackage.f155492i.getString("live_event_author_enterprise");
        ShareLiveEventContent shareLiveEventContent = new ShareLiveEventContent();
        shareLiveEventContent.eventId = string;
        shareLiveEventContent.title = string2;
        shareLiveEventContent.startTime = string3;
        shareLiveEventContent.linkUrl = string4;
        shareLiveEventContent.organizerId = string5;
        shareLiveEventContent.organizerName = string6;
        shareLiveEventContent.organizerVerifyReason = string7;
        shareLiveEventContent.organizerEnterprise = string8;
        shareLiveEventContent.organizerAvatar = (UrlModel) sharePackage.f155492i.getSerializable("live_event_author_avatar");
        return shareLiveEventContent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            return a.getString(R.string.bpp);
        }
        return a.getString(R.string.bpo);
    }
}
