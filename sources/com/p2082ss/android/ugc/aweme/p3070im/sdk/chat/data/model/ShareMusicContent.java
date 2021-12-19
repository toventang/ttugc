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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent */
public class ShareMusicContent extends BaseContent {
    @AbstractC27891c(mo46611a = "cover_url")
    private List<UrlModel> awemeCoverList;
    @AbstractC27891c(mo46611a = "music_cover")
    private UrlModel coverThumb;
    @AbstractC27891c(mo46611a = "music_id")
    private String musicId;
    @AbstractC27891c(mo46611a = "title")
    private String musicName;
    @AbstractC27891c(mo46611a = "push_detail")
    private String pushDetail;
    @AbstractC27891c(mo46611a = "user_count")
    private int userCount;

    static {
        Covode.recordClassIndex(63466);
    }

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public int getUserCount() {
        return this.userCount;
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
        SharePackage a = PureDataSharePackage.C55965a.m101845a("music");
        a.f155492i.putSerializable("video_cover", getCoverThumb());
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return C17867d.m33078a().getString(R.string.cfa, getMusicName());
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cg4, this.musicName);
    }

    public static ShareMusicContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f155492i.getString("music_id");
        String string2 = sharePackage.f155492i.getString("music_name");
        int i = sharePackage.f155492i.getInt("user_count");
        UrlModel urlModel = (UrlModel) sharePackage.f155492i.getSerializable("video_cover");
        UrlModel urlModel2 = (UrlModel) sharePackage.f155492i.getSerializable("cover_thumb");
        String string3 = sharePackage.f155492i.getString("aweme_cover_list");
        ShareMusicContent shareMusicContent = new ShareMusicContent();
        shareMusicContent.musicId = string;
        shareMusicContent.musicName = string2;
        shareMusicContent.pushDetail = string2;
        shareMusicContent.userCount = i;
        if (urlModel != null) {
            shareMusicContent.coverThumb = urlModel;
        } else if (urlModel2 != null) {
            shareMusicContent.coverThumb = urlModel2;
        }
        if (!TextUtils.isEmpty(string3)) {
            shareMusicContent.awemeCoverList = (List) C80361dw.m139333a(string3, List.class);
        }
        return shareMusicContent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            return a.getString(R.string.a_k);
        }
        return a.getString(R.string.fi_);
    }
}
