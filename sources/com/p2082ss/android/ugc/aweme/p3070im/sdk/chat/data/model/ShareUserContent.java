package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent */
public class ShareUserContent extends BaseContent {
    @AbstractC27891c(mo46611a = "avatar")
    private UrlModel avatar;
    @AbstractC27891c(mo46611a = "cover_url")
    private List<UrlModel> awemeCoverList;
    @AbstractC27891c(mo46611a = "desc")
    private String desc;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String name;
    @AbstractC27891c(mo46611a = "push_detail")
    private String pushDetail;
    @AbstractC27891c(mo46611a = "secUID")
    String secUid;
    @AbstractC27891c(mo46611a = "uid")
    private String uid;

    static {
        Covode.recordClassIndex(63476);
    }

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUid() {
        return this.uid;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.PreloadFetcher, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public List<UrlModel> fetchPreload() {
        List<UrlModel> list = this.awemeCoverList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.awemeCoverList.subList(0, Math.min(3, this.awemeCoverList.size()));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("user");
        a.f155492i.putSerializable("video_cover", getAvatar());
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return C17867d.m33078a().getString(R.string.cii, getName());
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cg3);
    }

    public static ShareUserContent fromSharePackage(SharePackage sharePackage) {
        ShareUserContent shareUserContent = new ShareUserContent();
        shareUserContent.uid = sharePackage.f155492i.getString("uid");
        shareUserContent.secUid = sharePackage.f155492i.getString("sec_user_id");
        shareUserContent.name = sharePackage.f155492i.getString(StringSet.name);
        shareUserContent.desc = sharePackage.f155492i.getString("desc");
        Serializable serializable = sharePackage.f155492i.getSerializable("video_cover");
        if (serializable instanceof UrlModel) {
            shareUserContent.avatar = (UrlModel) serializable;
        }
        shareUserContent.pushDetail = sharePackage.f155492i.getString(StringSet.name);
        String string = sharePackage.f155492i.getString("aweme_cover_list");
        if (!TextUtils.isEmpty(string)) {
            shareUserContent.awemeCoverList = (List) C80361dw.m139333a(string, List.class);
        }
        return shareUserContent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            return a.getString(R.string.a_j, getName());
        }
        return a.getString(R.string.fi9, getName());
    }
}
