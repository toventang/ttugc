package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.p1998c.p1999a.C27254p;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent */
public final class ShareQnAContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "cover_url")
    private List<? extends UrlModel> awemeCoverList = C89086z.INSTANCE;
    @AbstractC27891c(mo46611a = "push_detail")
    private String pushDetail;
    @AbstractC27891c(mo46611a = "qa_id")
    private long questionId;
    @AbstractC27891c(mo46611a = "title")
    private String questionName = "";
    private transient AbstractC89171a<? extends Resources> resourcesGetter = ShareQnAContent$resourcesGetter$1.INSTANCE;
    @AbstractC27891c(mo46611a = "video_count")
    private int userCount;

    static {
        Covode.recordClassIndex(63467);
    }

    public static /* synthetic */ void getResourcesGetter$im_base_release$annotations() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63468);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final ShareQnAContent fromSharePackage(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            long j = sharePackage.f155492i.getLong("qna_id");
            String string = sharePackage.f155492i.getString("qna_name");
            int i = sharePackage.f155492i.getInt("user_count");
            String string2 = sharePackage.f155492i.getString("aweme_cover_list");
            List<? extends UrlModel> list = null;
            if (string2 != null && !C27254p.m54261a(string2)) {
                list = C80361dw.m139335b(string2, UrlModel.class);
            }
            ShareQnAContent shareQnAContent = new ShareQnAContent();
            shareQnAContent.setQuestionId(j);
            shareQnAContent.setQuestionName(string);
            shareQnAContent.setUserCount(i);
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            shareQnAContent.setAwemeCoverList(list);
            shareQnAContent.setPushDetail(string);
            return shareQnAContent;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getQuestionName() {
        return this.questionName;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.a<? extends android.content.res.Resources>, h.f.a.a<android.content.res.Resources> */
    public final AbstractC89171a<Resources> getResourcesGetter$im_base_release() {
        return this.resourcesGetter;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final UrlModel getCoverThumb() {
        return (UrlModel) C89070n.m154583g((List) this.awemeCoverList);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final Map<String, String> eventParam() {
        return C89041ag.m154412a(C89387v.m154943a("question_id", String.valueOf(this.questionId)));
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.PreloadFetcher, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final List<UrlModel> fetchPreload() {
        List<? extends UrlModel> list = this.awemeCoverList;
        return list.subList(0, Math.min(3, list.size()));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("qna");
        a.f155492i.putSerializable("video_cover", getCoverThumb());
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String string = ((Resources) this.resourcesGetter.invoke()).getString(R.string.f0h, this.questionName);
        C89219l.m154716b(string, "");
        return string;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setQuestionId(long j) {
        this.questionId = j;
    }

    public final void setQuestionName(String str) {
        this.questionName = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }

    public final void setAwemeCoverList(List<? extends UrlModel> list) {
        C89219l.m154721d(list, "");
        this.awemeCoverList = list;
    }

    public final void setResourcesGetter$im_base_release(AbstractC89171a<? extends Resources> aVar) {
        C89219l.m154721d(aVar, "");
        this.resourcesGetter = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        if (z || z2) {
            String string = ((Resources) this.resourcesGetter.invoke()).getString(R.string.f0h, this.questionName);
            C89219l.m154716b(string, "");
            return string;
        }
        String string2 = ((Resources) this.resourcesGetter.invoke()).getString(R.string.f0g, this.questionName);
        C89219l.m154716b(string2, "");
        return string2;
    }
}
