package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18026g;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagLabelEvent;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49670ae;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49690r;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel */
public final class VideoEventDispatchViewModel extends AssemViewModel<C48198ba> implements AbstractC90252i, AbstractC90253j {

    /* renamed from: l */
    public static final C48048a f111325l = new C48048a((byte) 0);

    /* renamed from: j */
    public AbstractC89172b<? super Aweme, C89391z> f111326j;

    /* renamed from: k */
    public AbstractC89172b<? super Aweme, C89391z> f111327k;

    /* renamed from: m */
    private final boolean f111328m = true;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$a */
    public static final class C48048a {

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$a$a */
        public static final class C48049a extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
            public static final C48049a INSTANCE = new C48049a();

            static {
                Covode.recordClassIndex(56786);
            }

            public C48049a() {
                super(1);
            }

            public final C48198ba invoke(C48198ba baVar) {
                C89219l.m154719c(baVar, "");
                return baVar;
            }
        }

        static {
            Covode.recordClassIndex(56785);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$a$d */
        public static final class C48052d extends AbstractC89220m implements AbstractC89171a<AbstractC12656g> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12656g f111331a;

            static {
                Covode.recordClassIndex(56789);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48052d(AbstractC12656g gVar) {
                super(0);
                this.f111331a = gVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final AbstractC12656g invoke() {
                return this.f111331a;
            }
        }

        private C48048a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$a$c */
        public static final class C48051c extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
            public static final C48051c INSTANCE = new C48051c();

            static {
                Covode.recordClassIndex(56788);
            }

            public C48051c() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12874b<C48198ba> invoke() {
                return new C12874b<>();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$a$e */
        public static final class C48053e extends AbstractC89220m implements AbstractC89171a<C12815c> {
            public static final C48053e INSTANCE = new C48053e();

            static {
                Covode.recordClassIndex(56790);
            }

            public C48053e() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12815c invoke() {
                return new C12815c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$a$b */
        public static final class C48050b extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12656g f111329a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f111330b;

            static {
                Covode.recordClassIndex(56787);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48050b(AbstractC12656g gVar, AbstractC89277c cVar) {
                super(0);
                this.f111329a = gVar;
                this.f111330b = cVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final String invoke() {
                return C89219l.m154704a(this.f111330b.mo143613b(), (Object) String.valueOf(this.f111329a.hashCode()));
            }
        }

        public /* synthetic */ C48048a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(56784);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new RunnableC90250g(VideoEventDispatchViewModel.class, "onTopViewLiveEndEvent", C18026g.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(2, new RunnableC90250g(VideoEventDispatchViewModel.class, "onVideoEvent", C49672ag.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(3, new RunnableC90250g(VideoEventDispatchViewModel.class, "onFollowStatus", FollowStatusEvent.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(4, new RunnableC90250g(VideoEventDispatchViewModel.class, "onInteractionTagLabel", InteractionTagLabelEvent.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(5, new RunnableC90250g(VideoEventDispatchViewModel.class, "onCommentEvent", C36387c.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(6, new RunnableC90250g(VideoEventDispatchViewModel.class, "onVideoPlayerEvent", C71904j.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(7, new RunnableC90250g(VideoEventDispatchViewModel.class, "onEventDiggUpdate", C49690r.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(8, new RunnableC90250g(VideoEventDispatchViewModel.class, "onPlayerControllerVideoPlayProgressEvent", C50458e.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(9, new RunnableC90250g(VideoEventDispatchViewModel.class, "onLiveStatusEvent", C2954a.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(10, new RunnableC90250g(VideoEventDispatchViewModel.class, "onShareEndEvent", C49670ae.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(11, new RunnableC90250g(VideoEventDispatchViewModel.class, "onInteractionTagInfo", InteractionTagInfoEvent.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(12, new RunnableC90250g(VideoEventDispatchViewModel.class, "onAwesomeSplashEvent", C18017a.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(13, new RunnableC90250g(VideoEventDispatchViewModel.class, "onProfileFollowEvent", C35503c.class, ThreadMode.BACKGROUND, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean bR_() {
        return this.f111328m;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C48198ba mo20674f() {
        return new C48198ba();
    }

    public VideoEventDispatchViewModel() {
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        EventBus.m156962a().mo145395b(this);
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onAwesomeSplashEvent(C18017a aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a(new C48054b(aVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onCommentEvent(C36387c cVar) {
        mo20662a(new C48055c(cVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onEventDiggUpdate(C49690r rVar) {
        mo20662a(new C48056d(rVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        mo20662a(new C48057e(followStatusEvent));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onInteractionTagLabel(InteractionTagLabelEvent interactionTagLabelEvent) {
        Aweme aweme;
        AbstractC89172b<? super Aweme, C89391z> bVar;
        if (interactionTagLabelEvent != null && (aweme = interactionTagLabelEvent.aweme) != null && (bVar = this.f111327k) != null) {
            bVar.invoke(aweme);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onLiveStatusEvent(C2954a aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a(new C48059g(aVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onPlayerControllerVideoPlayProgressEvent(C50458e eVar) {
        C89219l.m154721d(eVar, "");
        mo20662a(new C48060h(eVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onProfileFollowEvent(C35503c cVar) {
        mo20662a(new C48061i(cVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onShareEndEvent(C49670ae aeVar) {
        mo20662a(new C48062j(aeVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onTopViewLiveEndEvent(C18026g gVar) {
        C89219l.m154721d(gVar, "");
        mo20662a(new C48063k(gVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onVideoEvent(C49672ag agVar) {
        mo20662a(new C48064l(agVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onVideoPlayerEvent(C71904j jVar) {
        C89219l.m154721d(jVar, "");
        mo20662a(new C48065m(jVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$b */
    static final class C48054b extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C18017a f111332a;

        static {
            Covode.recordClassIndex(56791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48054b(C18017a aVar) {
            super(1);
            this.f111332a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, null, null, this.f111332a, null, null, null, null, null, null, 4063);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$c */
    static final class C48055c extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C36387c f111333a;

        static {
            Covode.recordClassIndex(56792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48055c(C36387c cVar) {
            super(1);
            this.f111333a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, this.f111333a, null, null, null, null, null, null, null, null, null, null, 4093);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$d */
    static final class C48056d extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C49690r f111334a;

        static {
            Covode.recordClassIndex(56793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48056d(C49690r rVar) {
            super(1);
            this.f111334a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, this.f111334a, null, null, null, null, null, null, null, null, null, 4091);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$e */
    static final class C48057e extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ FollowStatusEvent f111335a;

        static {
            Covode.recordClassIndex(56794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48057e(FollowStatusEvent followStatusEvent) {
            super(1);
            this.f111335a = followStatusEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, null, null, null, null, null, this.f111335a, null, null, null, 3839);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$f */
    static final class C48058f extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ InteractionTagInfoEvent f111336a;

        static {
            Covode.recordClassIndex(56795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48058f(InteractionTagInfoEvent interactionTagInfoEvent) {
            super(1);
            this.f111336a = interactionTagInfoEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, null, null, null, null, null, null, null, null, this.f111336a, 2047);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$g */
    static final class C48059g extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C2954a f111337a;

        static {
            Covode.recordClassIndex(56796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48059g(C2954a aVar) {
            super(1);
            this.f111337a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, null, null, null, null, null, null, this.f111337a, null, null, 3583);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$h */
    static final class C48060h extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C50458e f111338a;

        static {
            Covode.recordClassIndex(56797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48060h(C50458e eVar) {
            super(1);
            this.f111338a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, null, null, null, null, this.f111338a, null, null, null, null, 3967);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$i */
    static final class C48061i extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C35503c f111339a;

        static {
            Covode.recordClassIndex(56798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48061i(C35503c cVar) {
            super(1);
            this.f111339a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, this.f111339a, null, null, null, null, null, null, null, null, 4087);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$j */
    static final class C48062j extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C49670ae f111340a;

        static {
            Covode.recordClassIndex(56799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48062j(C49670ae aeVar) {
            super(1);
            this.f111340a = aeVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, null, null, null, this.f111340a, null, null, null, null, null, 4031);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$k */
    static final class C48063k extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C18026g f111341a;

        static {
            Covode.recordClassIndex(56800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48063k(C18026g gVar) {
            super(1);
            this.f111341a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, null, null, null, null, null, null, null, this.f111341a, null, 3071);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$l */
    static final class C48064l extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C49672ag f111342a;

        static {
            Covode.recordClassIndex(56801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48064l(C49672ag agVar) {
            super(1);
            this.f111342a = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, this.f111342a, null, null, null, null, null, null, null, null, null, null, null, 4094);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$m */
    static final class C48065m extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {

        /* renamed from: a */
        final /* synthetic */ C71904j f111343a;

        static {
            Covode.recordClassIndex(56802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48065m(C71904j jVar) {
            super(1);
            this.f111343a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48198ba invoke(C48198ba baVar) {
            C48198ba baVar2 = baVar;
            C89219l.m154721d(baVar2, "");
            return C48198ba.m91540a(baVar2, null, null, null, null, this.f111343a, null, null, null, null, null, null, null, 4079);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onInteractionTagInfo(InteractionTagInfoEvent interactionTagInfoEvent) {
        Aweme aweme;
        AbstractC89172b<? super Aweme, C89391z> bVar;
        mo20662a(new C48058f(interactionTagInfoEvent));
        if (interactionTagInfoEvent != null && (aweme = interactionTagInfoEvent.aweme) != null && (bVar = this.f111326j) != null) {
            bVar.invoke(aweme);
        }
    }
}
