package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStickerContent */
public final class ShareStickerContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "video_cover_urls")
    private List<UrlModel> awemeCoverList;
    @AbstractC27891c(mo46611a = "cover_url")
    private UrlModel cover;
    @AbstractC27891c(mo46611a = "sticker_id")
    private String stickerId = "";
    @AbstractC27891c(mo46611a = "text")
    private String title = "";
    @AbstractC27891c(mo46611a = "user_count")
    private Long userCount = 0L;

    static {
        Covode.recordClassIndex(63472);
    }

    public static final ShareStickerContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStickerContent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63473);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final ShareStickerContent fromSharePackage(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            ShareStickerContent shareStickerContent = new ShareStickerContent();
            Bundle bundle = sharePackage.f155492i;
            shareStickerContent.setStickerId(bundle.getString("sticker_id"));
            shareStickerContent.setTitle(bundle.getString("sticker_name"));
            shareStickerContent.setUserCount(Long.valueOf(bundle.getLong("user_count")));
            Serializable serializable = bundle.getSerializable("video_cover");
            Object obj = null;
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareStickerContent.setCover((UrlModel) serializable);
            String string = bundle.getString("aweme_cover_list");
            if (!(string == null || string.length() == 0)) {
                Object a = C80361dw.m139333a(string, List.class);
                if (C89206ad.m154681c(a)) {
                    obj = a;
                }
                shareStickerContent.setAwemeCoverList((List) obj);
            }
            return shareStickerContent;
        }
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.PreloadFetcher, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final List<UrlModel> fetchPreload() {
        List<UrlModel> list = this.awemeCoverList;
        if (list == null || list.size() < 3) {
            return null;
        }
        return list;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("sticker");
        a.f155492i.putSerializable("video_cover", this.cover);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String string = C17867d.m33078a().getResources().getString(R.string.acn, this.title);
        C89219l.m154716b(string, "");
        return string;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getQuoteHint(Context context) {
        C89219l.m154721d(context, "");
        String string = context.getResources().getString(R.string.cfx, this.title);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            String string = a.getString(R.string.a_d, this.title);
            C89219l.m154716b(string, "");
            return string;
        }
        String string2 = a.getString(R.string.fi3, this.title);
        C89219l.m154716b(string2, "");
        return string2;
    }
}
