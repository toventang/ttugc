package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent */
public class ShareLiveContent extends BaseContent {
    @AbstractC27891c(mo46611a = "push_detail")
    private String pushDetail;
    @AbstractC27891c(mo46611a = "cover_url")
    private UrlModel roomCover;
    @AbstractC27891c(mo46611a = "room_description")
    private String roomDesc;
    @AbstractC27891c(mo46611a = "room_id")
    private String roomId;
    @AbstractC27891c(mo46611a = "room_owner_avatar")
    private UrlModel roomOwnerAvatar;
    @AbstractC27891c(mo46611a = "room_owner_id")
    private String roomOwnerId;
    @AbstractC27891c(mo46611a = "room_owner_name")
    private String roomOwnerName;
    @AbstractC27891c(mo46611a = "room_owner_sec_id")
    private String roomSecOwnerId;

    static {
        Covode.recordClassIndex(63464);
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public UrlModel getRoomCover() {
        return this.roomCover;
    }

    public String getRoomDesc() {
        return this.roomDesc;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public UrlModel getRoomOwnerAvatar() {
        return this.roomOwnerAvatar;
    }

    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public String getRoomOwnerName() {
        return this.roomOwnerName;
    }

    public String getRoomSecOwnerId() {
        return this.roomSecOwnerId;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return C17867d.m33078a().getString(R.string.ces, getRoomOwnerName());
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a = new SharePackage.C69654a().mo109803a("live").mo109806b(getRoomId()).mo109805a();
        Bundle bundle = a.f155492i;
        bundle.putString("live_id", getRoomOwnerId());
        bundle.putSerializable("video_cover", getRoomCover());
        bundle.putString("author_name", getRoomOwnerName());
        bundle.putSerializable("thumb_for_share", getRoomOwnerAvatar());
        if (!TextUtils.isEmpty(getRoomDesc())) {
            bundle.putString("room_title", getRoomDesc());
        }
        return a;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setRoomCover(UrlModel urlModel) {
        this.roomCover = urlModel;
    }

    public void setRoomDesc(String str) {
        this.roomDesc = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setRoomOwnerAvatar(UrlModel urlModel) {
        this.roomOwnerAvatar = urlModel;
    }

    public void setRoomOwnerId(String str) {
        this.roomOwnerId = str;
    }

    public void setRoomOwnerName(String str) {
        this.roomOwnerName = str;
    }

    public void setRoomSecOwnerId(String str) {
        this.roomSecOwnerId = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cg2);
    }

    public static ShareLiveContent fromSharePackage(SharePackage sharePackage) {
        ShareLiveContent shareLiveContent = new ShareLiveContent();
        shareLiveContent.setRoomId(sharePackage.f155488e);
        shareLiveContent.setRoomOwnerId(sharePackage.f155492i.getString("live_id"));
        shareLiveContent.setRoomSecOwnerId(sharePackage.f155492i.getString("sec_user_id"));
        shareLiveContent.setRoomOwnerName(sharePackage.f155492i.getString("author_name"));
        Serializable serializable = sharePackage.f155492i.getSerializable("thumb_for_share");
        boolean z = serializable instanceof UrlModel;
        if (z) {
            shareLiveContent.setRoomOwnerAvatar((UrlModel) serializable);
        }
        shareLiveContent.setPushDetail(sharePackage.f155492i.getString("author_name"));
        if (sharePackage.f155492i.containsKey("room_title")) {
            shareLiveContent.setRoomDesc(sharePackage.f155492i.getString("room_title"));
        }
        if (sharePackage.f155492i.getLong("room_id", 0) == 0) {
            shareLiveContent.setRoomDesc(C34722h.m70923b(R.string.fpt));
        }
        Serializable serializable2 = sharePackage.f155492i.getSerializable("video_cover");
        if (serializable2 instanceof UrlModel) {
            shareLiveContent.setRoomCover((UrlModel) serializable2);
        } else if (z) {
            shareLiveContent.setRoomCover((UrlModel) serializable);
        } else {
            shareLiveContent.setRoomCover(null);
        }
        return shareLiveContent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            return a.getString(R.string.a_i);
        }
        return a.getString(R.string.fi8);
    }
}
