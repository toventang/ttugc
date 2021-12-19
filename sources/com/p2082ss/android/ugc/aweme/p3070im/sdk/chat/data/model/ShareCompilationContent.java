package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent */
public final class ShareCompilationContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "author_id")
    private String authorId = "";
    @AbstractC27891c(mo46611a = "video_cover_urls")
    private List<UrlModel> awemeCoverList;
    @AbstractC27891c(mo46611a = "mix_id")
    private String compilationId = "";
    @AbstractC27891c(mo46611a = "cover_url")
    private UrlModel cover;
    @AbstractC27891c(mo46611a = "text")
    private String title = "";
    @AbstractC27891c(mo46611a = "play_count")
    private Long viewCount = 0L;

    static {
        Covode.recordClassIndex(63462);
    }

    public static final ShareCompilationContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63463);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final ShareCompilationContent fromSharePackage(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            ShareCompilationContent shareCompilationContent = new ShareCompilationContent();
            Bundle bundle = sharePackage.f155492i;
            shareCompilationContent.setCompilationId(bundle.getString("compilation_id"));
            shareCompilationContent.setAuthorId(bundle.getString("user_id"));
            shareCompilationContent.setTitle(bundle.getString("compilation_name"));
            shareCompilationContent.setViewCount(Long.valueOf(bundle.getLong("view_count")));
            Serializable serializable = bundle.getSerializable("video_cover");
            Object obj = null;
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareCompilationContent.setCover((UrlModel) serializable);
            String string = bundle.getString("aweme_cover_list");
            if (!(string == null || string.length() == 0)) {
                Object a = C80361dw.m139333a(string, List.class);
                if (C89206ad.m154681c(a)) {
                    obj = a;
                }
                shareCompilationContent.setAwemeCoverList((List) obj);
            }
            return shareCompilationContent;
        }
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getCompilationId() {
        return this.compilationId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getViewCount() {
        return this.viewCount;
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
        SharePackage a = PureDataSharePackage.C55965a.m101845a("mix");
        a.f155492i.putSerializable("video_cover", this.cover);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String string = C17867d.m33078a().getResources().getString(R.string.acm, this.title);
        C89219l.m154716b(string, "");
        return string;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCompilationId(String str) {
        this.compilationId = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setViewCount(Long l) {
        this.viewCount = l;
    }
}
