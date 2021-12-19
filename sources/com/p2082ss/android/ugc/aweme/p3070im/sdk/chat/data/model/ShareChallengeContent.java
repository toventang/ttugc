package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent */
public class ShareChallengeContent extends BaseContent {
    @AbstractC27891c(mo46611a = "challenge_id")
    private String challengeId;
    @AbstractC27891c(mo46611a = "cover_url")
    private List<UrlModel> coverUrl;
    @AbstractC27891c(mo46611a = "is_commerce")
    private boolean isCommerce;
    @AbstractC27891c(mo46611a = "push_detail")
    private String pushDetail;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = "user_count")
    private long userCount;

    static {
        Covode.recordClassIndex(63461);
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public long getUserCount() {
        return this.userCount;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        return PureDataSharePackage.C55965a.m101845a("challenge");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.PreloadFetcher, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public List<UrlModel> fetchPreload() {
        List<UrlModel> list = this.coverUrl;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.coverUrl.subList(0, Math.min(3, this.coverUrl.size()));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return C17867d.m33078a().getResources().getString(R.string.cco, this.pushDetail);
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCoverUrl(List<UrlModel> list) {
        this.coverUrl = list;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(int i) {
        this.userCount = (long) i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cg0, this.title);
    }

    public static ShareChallengeContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f155492i.getString("challenge_id");
        String string2 = sharePackage.f155492i.getString("challenge_name");
        Boolean valueOf = Boolean.valueOf(sharePackage.f155492i.getBoolean("is_commerce"));
        long j = sharePackage.f155492i.getLong("view_count");
        String string3 = sharePackage.f155492i.getString("cover_thumb");
        ShareChallengeContent shareChallengeContent = new ShareChallengeContent();
        shareChallengeContent.challengeId = string;
        shareChallengeContent.title = string2;
        shareChallengeContent.isCommerce = valueOf.booleanValue();
        shareChallengeContent.userCount = j;
        shareChallengeContent.pushDetail = "#" + shareChallengeContent.title;
        if (!TextUtils.isEmpty(string3)) {
            shareChallengeContent.coverUrl = (List) C80361dw.m139333a(string3, List.class);
        }
        return shareChallengeContent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            return a.getString(R.string.a_g, this.pushDetail);
        }
        return a.getString(R.string.fi6, this.pushDetail);
    }
}
