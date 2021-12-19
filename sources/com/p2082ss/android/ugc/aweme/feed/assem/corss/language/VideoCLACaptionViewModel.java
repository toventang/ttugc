package com.p2082ss.android.ugc.aweme.feed.assem.corss.language;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.C12784g;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.caption.C49334a;
import com.p2082ss.android.ugc.aweme.feed.caption.C49335b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel */
public final class VideoCLACaptionViewModel extends FeedBaseViewModel<C48583l> {

    /* renamed from: A */
    public long f112267A = -1;

    /* renamed from: B */
    public boolean f112268B;

    /* renamed from: C */
    public boolean f112269C;

    /* renamed from: D */
    public boolean f112270D;

    /* renamed from: k */
    public long f112271k = -1;

    /* renamed from: l */
    public boolean f112272l;

    /* renamed from: m */
    public boolean f112273m;

    /* renamed from: n */
    public boolean f112274n;

    /* renamed from: v */
    public boolean f112275v;

    /* renamed from: w */
    public boolean f112276w;

    /* renamed from: x */
    public boolean f112277x;

    /* renamed from: y */
    public String f112278y = "";

    /* renamed from: z */
    public boolean f112279z;

    static {
        Covode.recordClassIndex(57299);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48583l();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$b */
    static final class C48526b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112285a;

        static {
            Covode.recordClassIndex(57303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48526b(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(0);
            this.f112285a = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f112285a.f112276w = true;
            this.f112285a.f112277x = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: m */
    private final void m91924m() {
        mo20667b(new C48536k(this));
    }

    /* renamed from: j */
    public final boolean mo80564j() {
        if (!this.f112268B || !this.f112270D || this.f112272l) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$c */
    static final class C48527c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112286a;

        static {
            Covode.recordClassIndex(57304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48527c(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(0);
            this.f112286a = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f112286a.f112276w = false;
            if (!this.f112286a.f112277x) {
                this.f112286a.mo20662a(C485281.f112287a);
            }
            this.f112286a.f112277x = false;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo23343h() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        return C50532ah.m94725a(aweme);
    }

    /* renamed from: i */
    public final void mo80563i() {
        boolean h = mo23343h();
        this.f112274n = h;
        if (h) {
            this.f112273m = TranslatedCaptionCacheServiceImpl.m146355j().mo108890b();
        }
        this.f112268B = TranslatedCaptionCacheServiceImpl.m146355j().mo108895e();
    }

    /* renamed from: k */
    public final int mo80565k() {
        Aweme aweme;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        Long l;
        Aweme aweme2;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        if (!this.f112272l) {
            return 0;
        }
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            return 8;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
        if (videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || (video2 = aweme2.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l = null;
        } else {
            l = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Iterator<T> it = captionList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            long languageId = next.getLanguageId();
            if (l != null && languageId == l.longValue()) {
                if (next.isAutoGenerated()) {
                    return 0;
                }
            }
        }
        return 8;
    }

    /* renamed from: l */
    private final void m91923l() {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        String str;
        String str2;
        Aweme aweme5;
        Aweme aweme6;
        C33744d a = new C33744d().mo59980a("use_transl", !this.f112272l ? 1 : 0);
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        String str3 = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        C33744d a2 = a.mo59980a("have_transl", C50532ah.m94726b(aweme) ? 1 : 0);
        VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
        if (videoItemParams2 != null) {
            aweme2 = videoItemParams2.mAweme;
        } else {
            aweme2 = null;
        }
        C33744d a3 = a2.mo59983a("subtitle_type", C50532ah.m94727c(aweme2));
        VideoItemParams videoItemParams3 = (VideoItemParams) mo23342g();
        if (videoItemParams3 != null) {
            aweme3 = videoItemParams3.mAweme;
        } else {
            aweme3 = null;
        }
        C33744d a4 = a3.mo59983a("subtitle_lang", C50532ah.m94729e(aweme3)).mo59980a("have_tts", this.f112269C ? 1 : 0).mo59980a("use_tts", mo80564j() ? 1 : 0);
        boolean z = this.f112272l;
        VideoItemParams videoItemParams4 = (VideoItemParams) mo23342g();
        if (videoItemParams4 != null) {
            aweme4 = videoItemParams4.mAweme;
        } else {
            aweme4 = null;
        }
        C33744d a5 = a4.mo59980a("cla_subtitle_type", C50532ah.m94724a(z, aweme4));
        VideoItemParams videoItemParams5 = (VideoItemParams) mo23342g();
        if (videoItemParams5 == null || (aweme6 = videoItemParams5.mAweme) == null) {
            str = null;
        } else {
            str = aweme6.getAid();
        }
        C33744d a6 = a5.mo59983a("group_id", str);
        VideoItemParams videoItemParams6 = (VideoItemParams) mo23342g();
        if (videoItemParams6 == null || (aweme5 = videoItemParams6.mAweme) == null) {
            str2 = null;
        } else {
            str2 = aweme5.getAuthorUid();
        }
        C33744d a7 = a6.mo59983a("author_id", str2);
        VideoItemParams videoItemParams7 = (VideoItemParams) mo23342g();
        if (videoItemParams7 != null) {
            str3 = videoItemParams7.mEventType;
        }
        C39162r.m79460a("subtitle_intro_show", a7.mo59983a("enter_from", str3).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$d */
    static final class C48529d extends AbstractC89220m implements AbstractC89172b<C48583l, C48583l> {

        /* renamed from: a */
        public static final C48529d f112288a = new C48529d();

        static {
            Covode.recordClassIndex(57306);
        }

        C48529d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48583l invoke(C48583l lVar) {
            C48583l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            return C48583l.m91942a(lVar2, false, null, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$e */
    static final class C48530e extends AbstractC89220m implements AbstractC89172b<C48583l, C48583l> {

        /* renamed from: a */
        public static final C48530e f112289a = new C48530e();

        static {
            Covode.recordClassIndex(57307);
        }

        C48530e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48583l invoke(C48583l lVar) {
            C48583l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            return C48583l.m91942a(lVar2, true, null, 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$l */
    public static final class View$OnClickListenerC48537l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23226a f112296a;

        static {
            Covode.recordClassIndex(57314);
        }

        View$OnClickListenerC48537l(C23226a aVar) {
            this.f112296a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112296a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$m */
    public static final class View$OnClickListenerC48538m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23226a f112297a;

        static {
            Covode.recordClassIndex(57315);
        }

        View$OnClickListenerC48538m(C23226a aVar) {
            this.f112297a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112297a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$o */
    static final class C48540o extends AbstractC89220m implements AbstractC89172b<C48583l, C48583l> {

        /* renamed from: a */
        public static final C48540o f112301a = new C48540o();

        static {
            Covode.recordClassIndex(57317);
        }

        C48540o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48583l invoke(C48583l lVar) {
            C48583l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            return C48583l.m91942a(lVar2, false, new C12784g(true), 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$a */
    static final class C48523a extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112280a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f112281b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f112282c;

        static {
            Covode.recordClassIndex(57300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48523a(VideoCLACaptionViewModel videoCLACaptionViewModel, AbstractC89171a aVar, AbstractC89171a aVar2) {
            super(1);
            this.f112280a = videoCLACaptionViewModel;
            this.f112281b = aVar;
            this.f112282c = aVar2;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$a$b */
        static final class View$OnClickListenerC48525b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C48523a f112284a;

            static {
                Covode.recordClassIndex(57302);
            }

            View$OnClickListenerC48525b(C48523a aVar) {
                this.f112284a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f112284a.f112280a.f112277x = true;
                VideoCLACaptionViewModel videoCLACaptionViewModel = this.f112284a.f112280a;
                videoCLACaptionViewModel.mo20667b(new C48533h(videoCLACaptionViewModel));
                this.f112284a.f112280a.f112276w = false;
                this.f112284a.f112282c.invoke();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            Aweme aweme;
            int i;
            C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) this.f112280a.mo23342g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            if (C50532ah.m94730f(aweme)) {
                C23322d.C23324b bVar = new C23322d.C23324b();
                if (this.f112280a.f112272l) {
                    i = R.string.fhh;
                } else {
                    i = R.string.fhg;
                }
                bVar.f55282c = i;
                bVar.f55285f = new View$OnClickListenerC48524a(this);
                dVar2.mo38015a(bVar);
            }
            C23322d.C23324b bVar2 = new C23322d.C23324b();
            bVar2.f55282c = R.string.h74;
            bVar2.f55285f = new View$OnClickListenerC48525b(this);
            dVar2.mo38015a(bVar2);
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$a$a */
        static final class View$OnClickListenerC48524a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C48523a f112283a;

            static {
                Covode.recordClassIndex(57301);
            }

            View$OnClickListenerC48524a(C48523a aVar) {
                this.f112283a = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r13) {
                /*
                // Method dump skipped, instructions count: 314
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel.C48523a.View$OnClickListenerC48524a.onClick(android.view.View):void");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$f */
    static final class C48531f extends AbstractC89220m implements AbstractC89172b<C48583l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112290a;

        static {
            Covode.recordClassIndex(57308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48531f(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.f112290a = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48583l lVar) {
            String str;
            String str2;
            C89219l.m154721d(lVar, "");
            C33744d dVar = new C33744d();
            VideoItemParams videoItemParams = (VideoItemParams) this.f112290a.mo23342g();
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            C33744d a = dVar.mo59983a("enter_from", str);
            if (this.f112290a.mo80564j()) {
                str2 = "translate_tts";
            } else {
                str2 = "translate_subtitle";
            }
            C39162r.m79460a("enter_setting_page", a.mo59983a("enter_method", str2).f79943a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$n */
    public static final class View$OnClickListenerC48539n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112298a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f112299b;

        /* renamed from: c */
        final /* synthetic */ C23226a f112300c;

        static {
            Covode.recordClassIndex(57316);
        }

        View$OnClickListenerC48539n(VideoCLACaptionViewModel videoCLACaptionViewModel, ActivityC0945e eVar, C23226a aVar) {
            this.f112298a = videoCLACaptionViewModel;
            this.f112299b = eVar;
            this.f112300c = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            VideoCLACaptionViewModel videoCLACaptionViewModel = this.f112298a;
            videoCLACaptionViewModel.mo20667b(new C48531f(videoCLACaptionViewModel));
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f112299b, "aweme://setting");
            if (this.f112298a.mo80564j()) {
                str = "translate_tts";
            } else {
                str = "translate_subtitle";
            }
            buildRoute.withParam("enter_from", str).open();
            this.f112300c.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80562a(ActivityC0945e eVar) {
        if (mo80564j()) {
            m91924m();
        } else {
            m91923l();
        }
        C49334a.m92424b();
        C49335b bVar = new C49335b(eVar, (byte) 0);
        C23226a aVar = new C23226a.C23227a().mo37816a(bVar).f55057a;
        bVar.getBtnDismiss().setOnClickListener(new View$OnClickListenerC48537l(aVar));
        bVar.getIvClose().setOnClickListener(new View$OnClickListenerC48538m(aVar));
        View$OnClickListenerC48539n nVar = new View$OnClickListenerC48539n(this, eVar, aVar);
        bVar.getTvGoSetting().setOnClickListener(nVar);
        bVar.mo80921a(nVar, mo80564j());
        aVar.show(eVar.getSupportFragmentManager(), "feed_caption_intro");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$i */
    static final class C48534i extends AbstractC89220m implements AbstractC89172b<C48583l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112293a;

        static {
            Covode.recordClassIndex(57311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48534i(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.f112293a = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.assem.corss.language.C48583l r8) {
            /*
            // Method dump skipped, instructions count: 247
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel.C48534i.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$k */
    public static final class C48536k extends AbstractC89220m implements AbstractC89172b<C48583l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112295a;

        static {
            Covode.recordClassIndex(57313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48536k(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.f112295a = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48583l lVar) {
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            String str;
            String str2;
            Aweme aweme5;
            Aweme aweme6;
            C89219l.m154721d(lVar, "");
            C33744d a = new C33744d().mo59980a("use_transl", !this.f112295a.f112272l ? 1 : 0);
            VideoItemParams videoItemParams = (VideoItemParams) this.f112295a.mo23342g();
            Aweme aweme7 = null;
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            C33744d a2 = a.mo59980a("have_transl", C50532ah.m94726b(aweme) ? 1 : 0);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.f112295a.mo23342g();
            if (videoItemParams2 != null) {
                aweme2 = videoItemParams2.mAweme;
            } else {
                aweme2 = null;
            }
            C33744d a3 = a2.mo59983a("subtitle_type", C50532ah.m94727c(aweme2));
            VideoItemParams videoItemParams3 = (VideoItemParams) this.f112295a.mo23342g();
            if (videoItemParams3 != null) {
                aweme3 = videoItemParams3.mAweme;
            } else {
                aweme3 = null;
            }
            C33744d a4 = a3.mo59983a("subtitle_lang", C50532ah.m94729e(aweme3)).mo59980a("have_tts", this.f112295a.f112269C ? 1 : 0).mo59980a("use_tts", this.f112295a.mo80564j() ? 1 : 0);
            boolean z = this.f112295a.f112272l;
            VideoItemParams videoItemParams4 = (VideoItemParams) this.f112295a.mo23342g();
            if (videoItemParams4 != null) {
                aweme4 = videoItemParams4.mAweme;
            } else {
                aweme4 = null;
            }
            C33744d a5 = a4.mo59980a("cla_subtitle_type", C50532ah.m94724a(z, aweme4));
            VideoItemParams videoItemParams5 = (VideoItemParams) this.f112295a.mo23342g();
            if (videoItemParams5 == null || (aweme6 = videoItemParams5.mAweme) == null) {
                str = null;
            } else {
                str = aweme6.getAid();
            }
            C33744d a6 = a5.mo59983a("group_id", str);
            VideoItemParams videoItemParams6 = (VideoItemParams) this.f112295a.mo23342g();
            if (videoItemParams6 == null || (aweme5 = videoItemParams6.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme5.getAuthorUid();
            }
            C33744d a7 = a6.mo59983a("author_id", str2);
            VideoItemParams videoItemParams7 = (VideoItemParams) this.f112295a.mo23342g();
            if (videoItemParams7 != null) {
                aweme7 = videoItemParams7.mAweme;
            }
            C39162r.m79460a("tts_intro_show", a7.mo59982a("enter_from", aweme7).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$g */
    static final class C48532g extends AbstractC89220m implements AbstractC89172b<C48583l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112291a;

        static {
            Covode.recordClassIndex(57309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48532g(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.f112291a = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48583l lVar) {
            String str;
            String str2;
            String str3;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            Aweme aweme5;
            Aweme aweme6;
            String str4 = "";
            C89219l.m154721d(lVar, str4);
            C33744d dVar = new C33744d();
            VideoItemParams videoItemParams = (VideoItemParams) this.f112291a.mo23342g();
            Aweme aweme7 = null;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            C33744d a = dVar.mo59983a("enter_from", str);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.f112291a.mo23342g();
            if (videoItemParams2 == null || (aweme6 = videoItemParams2.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme6.getAid();
            }
            C33744d a2 = a.mo59983a("group_id", str2);
            VideoItemParams videoItemParams3 = (VideoItemParams) this.f112291a.mo23342g();
            if (videoItemParams3 == null || (aweme5 = videoItemParams3.mAweme) == null) {
                str3 = null;
            } else {
                str3 = aweme5.getAuthorUid();
            }
            C33744d a3 = a2.mo59983a("author_id", str3).mo59980a("use_transl", !this.f112291a.f112272l ? 1 : 0);
            VideoItemParams videoItemParams4 = (VideoItemParams) this.f112291a.mo23342g();
            if (videoItemParams4 != null) {
                aweme = videoItemParams4.mAweme;
            } else {
                aweme = null;
            }
            C33744d a4 = a3.mo59983a("subtitle_type", C50532ah.m94727c(aweme));
            VideoItemParams videoItemParams5 = (VideoItemParams) this.f112291a.mo23342g();
            if (videoItemParams5 != null) {
                aweme2 = videoItemParams5.mAweme;
            } else {
                aweme2 = null;
            }
            C33744d a5 = a4.mo59980a("have_transl", C50532ah.m94726b(aweme2) ? 1 : 0);
            if (this.f112291a.f112272l) {
                VideoItemParams videoItemParams6 = (VideoItemParams) this.f112291a.mo23342g();
                if (!(videoItemParams6 == null || (aweme4 = videoItemParams6.mAweme) == null || (video = aweme4.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                    str4 = languageName;
                }
            } else {
                VideoItemParams videoItemParams7 = (VideoItemParams) this.f112291a.mo23342g();
                if (videoItemParams7 != null) {
                    aweme3 = videoItemParams7.mAweme;
                } else {
                    aweme3 = null;
                }
                str4 = C50532ah.m94729e(aweme3);
            }
            C33744d a6 = a5.mo59983a("subtitle_lang", str4).mo59980a("have_tts", this.f112291a.f112269C ? 1 : 0).mo59980a("use_tts", this.f112291a.mo80564j() ? 1 : 0);
            boolean z = this.f112291a.f112272l;
            VideoItemParams videoItemParams8 = (VideoItemParams) this.f112291a.mo23342g();
            if (videoItemParams8 != null) {
                aweme7 = videoItemParams8.mAweme;
            }
            C39162r.m79460a("expand_subtitle", a6.mo59980a("cla_subtitle_type", C50532ah.m94724a(z, aweme7)).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$h */
    static final class C48533h extends AbstractC89220m implements AbstractC89172b<C48583l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112292a;

        static {
            Covode.recordClassIndex(57310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48533h(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.f112292a = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48583l lVar) {
            String str;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            String str2;
            Aweme aweme5;
            Aweme aweme6;
            Aweme aweme7;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            String str3 = "";
            C89219l.m154721d(lVar, str3);
            C33744d dVar = new C33744d();
            VideoItemParams videoItemParams = (VideoItemParams) this.f112292a.mo23342g();
            String str4 = null;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            C33744d a = dVar.mo59983a("enter_from", str).mo59980a("use_transl", !this.f112292a.f112272l ? 1 : 0);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.f112292a.mo23342g();
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            C33744d a2 = a.mo59983a("subtitle_type", C50532ah.m94727c(aweme));
            VideoItemParams videoItemParams3 = (VideoItemParams) this.f112292a.mo23342g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            } else {
                aweme2 = null;
            }
            C33744d a3 = a2.mo59980a("have_transl", C50532ah.m94726b(aweme2) ? 1 : 0);
            if (this.f112292a.f112272l) {
                VideoItemParams videoItemParams4 = (VideoItemParams) this.f112292a.mo23342g();
                if (!(videoItemParams4 == null || (aweme7 = videoItemParams4.mAweme) == null || (video = aweme7.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                    str3 = languageName;
                }
            } else {
                VideoItemParams videoItemParams5 = (VideoItemParams) this.f112292a.mo23342g();
                if (videoItemParams5 != null) {
                    aweme3 = videoItemParams5.mAweme;
                } else {
                    aweme3 = null;
                }
                str3 = C50532ah.m94729e(aweme3);
            }
            C33744d a4 = a3.mo59983a("subtitle_lang", str3).mo59980a("have_tts", this.f112292a.f112269C ? 1 : 0).mo59980a("use_tts", this.f112292a.mo80564j() ? 1 : 0);
            boolean z = this.f112292a.f112272l;
            VideoItemParams videoItemParams6 = (VideoItemParams) this.f112292a.mo23342g();
            if (videoItemParams6 != null) {
                aweme4 = videoItemParams6.mAweme;
            } else {
                aweme4 = null;
            }
            C33744d a5 = a4.mo59980a("cla_subtitle_type", C50532ah.m94724a(z, aweme4));
            VideoItemParams videoItemParams7 = (VideoItemParams) this.f112292a.mo23342g();
            if (videoItemParams7 == null || (aweme6 = videoItemParams7.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme6.getAid();
            }
            C33744d a6 = a5.mo59983a("group_id", str2);
            VideoItemParams videoItemParams8 = (VideoItemParams) this.f112292a.mo23342g();
            if (!(videoItemParams8 == null || (aweme5 = videoItemParams8.mAweme) == null)) {
                str4 = aweme5.getAuthorUid();
            }
            C39162r.m79460a("hide_subtitle", a6.mo59983a("author_id", str4).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$j */
    static final class C48535j extends AbstractC89220m implements AbstractC89172b<C48583l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCLACaptionViewModel f112294a;

        static {
            Covode.recordClassIndex(57312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48535j(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.f112294a = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48583l lVar) {
            String str;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            String e;
            Aweme aweme4;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            Aweme aweme5;
            String str2;
            Aweme aweme6;
            Aweme aweme7;
            Aweme aweme8;
            Aweme aweme9;
            Video video2;
            CaptionModel captionModel2;
            CaptionLanguage originalCaptionLanguage2;
            String str3 = "";
            C89219l.m154721d(lVar, str3);
            C33744d dVar = new C33744d();
            VideoItemParams videoItemParams = (VideoItemParams) this.f112294a.mo23342g();
            String str4 = null;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            C33744d a = dVar.mo59983a("enter_from", str);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.f112294a.mo23342g();
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            C33744d a2 = a.mo59983a("subtitle_type", C50532ah.m94727c(aweme));
            VideoItemParams videoItemParams3 = (VideoItemParams) this.f112294a.mo23342g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            } else {
                aweme2 = null;
            }
            C33744d a3 = a2.mo59980a("have_transl", C50532ah.m94726b(aweme2) ? 1 : 0).mo59980a("use_transl", !this.f112294a.f112272l ? 1 : 0);
            if (this.f112294a.f112272l) {
                VideoItemParams videoItemParams4 = (VideoItemParams) this.f112294a.mo23342g();
                if (videoItemParams4 == null || (aweme9 = videoItemParams4.mAweme) == null || (video2 = aweme9.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage2 = captionModel2.getOriginalCaptionLanguage()) == null || (e = originalCaptionLanguage2.getLanguageName()) == null) {
                    e = str3;
                }
            } else {
                VideoItemParams videoItemParams5 = (VideoItemParams) this.f112294a.mo23342g();
                if (videoItemParams5 != null) {
                    aweme3 = videoItemParams5.mAweme;
                } else {
                    aweme3 = null;
                }
                e = C50532ah.m94729e(aweme3);
            }
            C33744d a4 = a3.mo59983a("to_lang", e);
            if (this.f112294a.f112272l) {
                VideoItemParams videoItemParams6 = (VideoItemParams) this.f112294a.mo23342g();
                if (videoItemParams6 != null) {
                    aweme8 = videoItemParams6.mAweme;
                } else {
                    aweme8 = null;
                }
                str3 = C50532ah.m94729e(aweme8);
            } else {
                VideoItemParams videoItemParams7 = (VideoItemParams) this.f112294a.mo23342g();
                if (!(videoItemParams7 == null || (aweme4 = videoItemParams7.mAweme) == null || (video = aweme4.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                    str3 = languageName;
                }
            }
            C33744d a5 = a4.mo59983a("subtitle_lang", str3).mo59980a("have_tts", this.f112294a.f112269C ? 1 : 0).mo59980a("use_tts", this.f112294a.mo80564j() ? 1 : 0);
            boolean z = this.f112294a.f112272l;
            VideoItemParams videoItemParams8 = (VideoItemParams) this.f112294a.mo23342g();
            if (videoItemParams8 != null) {
                aweme5 = videoItemParams8.mAweme;
            } else {
                aweme5 = null;
            }
            C33744d a6 = a5.mo59980a("cla_subtitle_type", C50532ah.m94724a(z, aweme5));
            VideoItemParams videoItemParams9 = (VideoItemParams) this.f112294a.mo23342g();
            if (videoItemParams9 == null || (aweme7 = videoItemParams9.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme7.getAid();
            }
            C33744d a7 = a6.mo59983a("group_id", str2);
            VideoItemParams videoItemParams10 = (VideoItemParams) this.f112294a.mo23342g();
            if (!(videoItemParams10 == null || (aweme6 = videoItemParams10.mAweme) == null)) {
                str4 = aweme6.getAuthorUid();
            }
            C39162r.m79460a("change_subtitle_lang", a7.mo59983a("author_id", str4).f79943a);
            return C89391z.f203057a;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(videoItemParams, "");
        return videoItemParams;
    }
}
