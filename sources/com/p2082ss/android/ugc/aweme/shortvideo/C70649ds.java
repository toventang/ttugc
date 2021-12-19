package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63171ae;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.settings.C68749o;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73231j;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi;
import com.p2082ss.android.ugc.aweme.sticker.data.C75307b;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.utils.C80225as;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import dmt.p4542av.video.p4544a.C88152a;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ds */
public final class C70649ds implements AbstractC74304x<C69831ai> {

    /* renamed from: a */
    private final CountDownLatch f158130a = new CountDownLatch(2);

    /* renamed from: b */
    private final int f158131b;

    /* renamed from: c */
    private final Object f158132c;

    static {
        Covode.recordClassIndex(83115);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishCancel() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishPause() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishResume() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onProgressUpdate(int i, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onSynthetiseSuccess(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onError(C71818ev evVar) {
        String str = "";
        C89219l.m154721d(evVar, str);
        C72477c.m127864a("normal").mo114743e();
        if (this.f158131b == 0) {
            Object obj = this.f158132c;
            if (!(obj instanceof VideoPublishEditModel)) {
                obj = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel != null) {
                C71817eu.m126798i(videoPublishEditModel);
            } else {
                return;
            }
        }
        if (evVar.isRecover() && !C68749o.m121186a()) {
            if (this.f158131b == 0) {
                Object obj2 = this.f158132c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                str = ((BaseShortVideoContext) obj2).getDraftPrimaryKey();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (C68747m.m121180a()) {
                C63244g.m114602a().mo73287o().mo104793m().mo104827b(str);
            } else {
                C63244g.m114602a().mo73287o().mo104793m().mo104825a(str);
            }
        }
    }

    public C70649ds(int i, Object obj) {
        C89219l.m154721d(obj, "");
        this.f158131b = i;
        this.f158132c = obj;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onSuccess(C69831ai aiVar, boolean z) {
        AVUploadSaveModel aVUploadSaveModel;
        String str;
        IDraftService a;
        C43223c queryDraft;
        String str2;
        InteractStickerStruct interactStickerStruct;
        C75309d captionStruct;
        C89219l.m154721d(aiVar, "");
        C51423a.m95787a("args is " + this.f158132c);
        BaseShortVideoContext baseShortVideoContext = null;
        if (this.f158131b == 0) {
            Object obj = this.f158132c;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            String localFinalPath = videoPublishEditModel.getLocalFinalPath();
            if (localFinalPath == null || (str = localFinalPath.toString()) == null) {
                str = "";
            }
            aVUploadSaveModel = videoPublishEditModel.getSaveModel();
        } else {
            aVUploadSaveModel = null;
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            aiVar.mSaveModel = aVUploadSaveModel;
            C80720e.m139938e(C70638dj.f158108k);
        }
        if (!C68747m.m121180a()) {
            C88152a.m153232a("publish_page");
        }
        if (this.f158131b != 0) {
            ALog.m59866e("ShortVideoPublishCallback", "unknown video type");
        } else {
            Object obj2 = this.f158132c;
            if (!(obj2 instanceof VideoPublishEditModel)) {
                obj2 = null;
            }
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj2;
            if (videoPublishEditModel2 != null && (queryDraft = (a = C78397c.m136927a()).queryDraft(videoPublishEditModel2.getDraftPrimaryKey())) != null) {
                C89219l.m154716b(queryDraft, "");
                AbstractC63171ae aeVar = C63238c.f143598y;
                String r = queryDraft.mo73726r();
                C89219l.m154716b(r, "");
                aeVar.mo93758a(r);
                a.delete(queryDraft);
                a.notifyDraftDelete(queryDraft);
                C63253l.f143623a.mo73317m().mo70032a(aiVar, videoPublishEditModel2, this.f158130a);
                C63253l.f143623a.mo73317m().mo70034b(aiVar, videoPublishEditModel2, this.f158130a);
                C69745a a2 = C63238c.f143597x.mo93912a(aiVar);
                if (a2 != null) {
                    List<InteractStickerStruct> a3 = C71073b.m125565a(videoPublishEditModel2.getMainBusinessContext(), 11, EnumC71088d.TRACK_PAGE_EDIT);
                    C75309d dVar = a2.captionStruct;
                    if (dVar != null) {
                        String str3 = aiVar.materialId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        List<C75313h> utterances = dVar.getUtterances();
                        if (utterances == null) {
                            utterances = C89086z.INSTANCE;
                        }
                        C73231j jVar = new C73231j(str3, utterances);
                        if (a3 == null || (interactStickerStruct = (InteractStickerStruct) C89070n.m154561b((List) a3, 0)) == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null || (str2 = captionStruct.getTaskId()) == null) {
                            str2 = "";
                        }
                        AbstractC63196au C = C63244g.m114602a().mo73257C();
                        AVApi b = AVApiImpl.m123134b();
                        C89219l.m154716b(b, "");
                        String a4 = b.mo109850a();
                        C89219l.m154716b(a4, "");
                        SubtitleApi subtitleApi = (SubtitleApi) C.createRetrofit(a4, true, SubtitleApi.class);
                        String str4 = aiVar.materialId;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = a2.aid;
                        C89219l.m154716b(str5, "");
                        subtitleApi.feedback(str4, str5, str2, jVar);
                        if (dVar.getUtterances() != null) {
                            new File(C80225as.f179704a).mkdirs();
                            String str6 = C80225as.f179704a + System.currentTimeMillis();
                            C80720e.m139922a(str6, C80342dg.m139300a().mo46674b(dVar));
                            Context a5 = C40963b.m82473a();
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUrlList(C89070n.m154524c(str6));
                            AbstractC58069b currentI18nItem = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getCurrentI18nItem(a5);
                            C89219l.m154716b(currentI18nItem, "");
                            dVar.setAutoCaptions(C89070n.m154524c(new C75307b(currentI18nItem.mo90017a(), urlModel)));
                        }
                    }
                }
                C63253l.f143623a.mo73317m().mo70033a(videoPublishEditModel2, queryDraft, this.f158130a);
            } else {
                return;
            }
        }
        if (C68749o.m121186a()) {
            if (C68747m.m121180a()) {
                Object obj3 = this.f158132c;
                if (obj3 instanceof BaseShortVideoContext) {
                    baseShortVideoContext = obj3;
                }
                BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
                if (baseShortVideoContext2 != null) {
                    C63244g.m114602a().mo73287o().mo104793m().mo104828c(baseShortVideoContext2.getDraftPrimaryKey());
                } else {
                    return;
                }
            } else {
                C63244g.m114602a().mo73287o().mo104793m().mo104825a("");
            }
        }
        C72477c.m127864a("normal").mo114743e();
    }
}
