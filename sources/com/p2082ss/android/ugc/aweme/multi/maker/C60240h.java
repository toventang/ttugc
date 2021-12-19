package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.p2082ss.android.ugc.aweme.metrics.C59214ai;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.p3462ui.ToolsAnchorItem;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.PhotoMvAnchorConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.UUID;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.h */
public final class C60240h extends AbstractC60267o {

    /* renamed from: d */
    public final String f137299d;

    static {
        Covode.recordClassIndex(70772);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: j */
    public final boolean mo97922j() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "app_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60240h();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.PHOTO_MV_ANCHOR.getTYPE();
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.h$a */
    static final class C60241a extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60240h f137300a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f137301b;

        /* renamed from: c */
        final /* synthetic */ C33744d f137302c;

        static {
            Covode.recordClassIndex(70773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60241a(C60240h hVar, ViewGroup viewGroup, C33744d dVar) {
            super(1);
            this.f137300a = hVar;
            this.f137301b = viewGroup;
            this.f137302c = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.h$a$a */
        static final class C60242a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ ToolsAnchorItem f137303a;

            /* renamed from: b */
            final /* synthetic */ C60241a f137304b;

            /* renamed from: c */
            final /* synthetic */ AnchorCommonStruct f137305c;

            static {
                Covode.recordClassIndex(70774);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C60242a(ToolsAnchorItem toolsAnchorItem, C60241a aVar, AnchorCommonStruct anchorCommonStruct) {
                super(0);
                this.f137303a = toolsAnchorItem;
                this.f137304b = aVar;
                this.f137305c = anchorCommonStruct;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f137304b.f137300a.mo97932e(this.f137304b.f137302c);
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorPanelAction anchorPanelAction;
            MethodCollector.m26663i(7789);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str = "";
            C89219l.m154721d(anchorCommonStruct2, str);
            Context context = this.f137301b.getContext();
            C89219l.m154716b(context, str);
            ToolsAnchorItem a = ToolsAnchorItem.C60301a.m109982a(context);
            UrlModel thumbnail = anchorCommonStruct2.getThumbnail();
            if (thumbnail != null) {
                a.setIcon(thumbnail);
            }
            String keyword = anchorCommonStruct2.getKeyword();
            if (keyword != null) {
                str = keyword;
            }
            a.setTitle(str);
            a.setSubTitle(anchorCommonStruct2.getDescription());
            List<AnchorPanelAction> actions = anchorCommonStruct2.getActions();
            if (!(actions == null || (anchorPanelAction = (AnchorPanelAction) C89070n.m154583g((List) actions)) == null)) {
                a.setButtonIcon(anchorPanelAction.getIcon());
                a.setButtonOnClickListener(new C60242a(a, this, anchorCommonStruct2));
            }
            this.f137301b.addView(a);
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7789);
            return zVar;
        }
    }

    public C60240h() {
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        this.f137299d = uuid;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        mo97932e(dVar);
    }

    /* renamed from: e */
    public final void mo97932e(C33744d dVar) {
        AbstractC60267o.m109921a(this, dVar, false, false, 4);
        C59214ai aiVar = new C59214ai();
        aiVar.f134863q = "anchor_combine_page";
        aiVar.f134857a = "anchor_combine_mv";
        aiVar.f134858b = mo97949o().getAid();
        aiVar.f134862p = this.f137299d;
        aiVar.f134859c = "sound_sync";
        aiVar.f134860d = "upload";
        aiVar.f134859c = "video";
        aiVar.mo96792f();
        mo97945a(new C60243b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.maker.h$b */
    public static final class C60243b extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60240h f137306a;

        static {
            Covode.recordClassIndex(70775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60243b(C60240h hVar) {
            super(1);
            this.f137306a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            C89219l.m154721d(anchorCommonStruct2, "");
            final Uri parse = Uri.parse(anchorCommonStruct2.getSchema());
            C89219l.m154716b(parse, "");
            if (C89361p.m154872a("studio", parse.getHost(), true) && C89361p.m154872a("/upload", parse.getPath(), true)) {
                AVExternalServiceImpl.m113114a().asyncService(this.f137306a.mo97952r(), "upload_anchor", new IExternalService.ServiceLoadCallback(this) {
                    /* class com.p2082ss.android.ugc.aweme.multi.maker.C60240h.C60243b.C602441 */

                    /* renamed from: a */
                    final /* synthetic */ C60243b f137307a;

                    static {
                        Covode.recordClassIndex(70776);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onDismiss() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onFailed() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onOK() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                    }

                    {
                        this.f137307a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j) {
                        MusicModel musicModel;
                        C89219l.m154721d(asyncAVService, "");
                        RecordConfig.Builder shootWay = new RecordConfig.Builder().creationId(this.f137307a.f137306a.f137299d).enterFrom("anchor_combine_page").shootWay("anchor_combine_mv");
                        PhotoMvAnchorConfig photoMvAnchorConfig = new PhotoMvAnchorConfig();
                        photoMvAnchorConfig.setSlideshowMvId(parse.getQueryParameter("slideshow_mv_id"));
                        Music music = this.f137307a.f137306a.mo97949o().getMusic();
                        if (music != null) {
                            musicModel = music.convertToMusicModel();
                        } else {
                            musicModel = null;
                        }
                        photoMvAnchorConfig.setMusicModel(musicModel);
                        photoMvAnchorConfig.setTemplateType(parse.getQueryParameter("template_type"));
                        asyncAVService.uiService().recordService().startRecordSlideShowPhotoMV(this.f137307a.f137306a.mo97952r(), shootWay.build(), photoMvAnchorConfig);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97890b(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        mo97945a(new C60241a(this, viewGroup, dVar));
    }
}
