package com.p2082ss.android.ugc.aweme.feed.assem.generalmask;

import com.bytedance.assem.arch.extensions.C12784g;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49673ah;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM */
public final class GeneralVideoMaskVM extends FeedBaseViewModel<C48738e> {
    static {
        Covode.recordClassIndex(57489);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48738e();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM$a */
    static final class C48709a extends AbstractC89220m implements AbstractC89172b<C48738e, C48738e> {

        /* renamed from: a */
        public static final C48709a f112574a = new C48709a();

        static {
            Covode.recordClassIndex(57490);
        }

        C48709a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48738e invoke(C48738e eVar) {
            C48738e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C48738e.m92040a(new C12784g(false), eVar2.f112603b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM$g */
    static final class C48715g extends AbstractC89220m implements AbstractC89172b<AbstractC89516am, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f112583a;

        static {
            Covode.recordClassIndex(57496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48715g(String str) {
            super(1);
            this.f112583a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC89516am amVar) {
            C89219l.m154721d(amVar, "");
            AbstractC81915c.m141874a(new C49673ah(true, this.f112583a));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM$c */
    static final class C48711c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f112576a;

        /* renamed from: b */
        final /* synthetic */ GeneralVideoMaskVM f112577b;

        static {
            Covode.recordClassIndex(57492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48711c(GeneralVideoMaskVM generalVideoMaskVM, AbstractC89124d dVar) {
            super(2, dVar);
            this.f112577b = generalVideoMaskVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C48711c(this.f112577b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C48711c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            String str;
            Aweme aweme;
            if (this.f112576a == 0) {
                C89382r.m154942a(obj);
                C33744d a = new C33744d().mo59983a("scenario", "general");
                VideoItemParams videoItemParams = (VideoItemParams) this.f112577b.mo23342g();
                if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null) {
                    str = null;
                } else {
                    str = aweme.getAid();
                }
                C39162r.m79460a("tns_mask_layer_click_skip", a.mo59983a("group_id", str).f79943a);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM$d */
    static final class C48712d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f112578a;

        /* renamed from: b */
        final /* synthetic */ GeneralVideoMaskVM f112579b;

        static {
            Covode.recordClassIndex(57493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48712d(GeneralVideoMaskVM generalVideoMaskVM, AbstractC89124d dVar) {
            super(2, dVar);
            this.f112579b = generalVideoMaskVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C48712d(this.f112579b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C48712d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            String str;
            Aweme aweme;
            if (this.f112578a == 0) {
                C89382r.m154942a(obj);
                C33744d a = new C33744d().mo59983a("scenario", "general");
                VideoItemParams videoItemParams = (VideoItemParams) this.f112579b.mo23342g();
                if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null) {
                    str = null;
                } else {
                    str = aweme.getAid();
                }
                C39162r.m79460a("tns_mask_layer_click_watch", a.mo59983a("group_id", str).f79943a);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM$e */
    static final class C48713e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f112580a;

        /* renamed from: b */
        final /* synthetic */ GeneralVideoMaskVM f112581b;

        static {
            Covode.recordClassIndex(57494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48713e(GeneralVideoMaskVM generalVideoMaskVM, AbstractC89124d dVar) {
            super(2, dVar);
            this.f112581b = generalVideoMaskVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C48713e(this.f112581b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C48713e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            String str;
            Aweme aweme;
            if (this.f112580a == 0) {
                C89382r.m154942a(obj);
                C33744d a = new C33744d().mo59983a("scenario", "general");
                VideoItemParams videoItemParams = (VideoItemParams) this.f112581b.mo23342g();
                if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null) {
                    str = null;
                } else {
                    str = aweme.getAid();
                }
                C39162r.m79460a("tns_show_mask_layer", a.mo59983a("group_id", str).f79943a);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM$b */
    static final class C48710b extends AbstractC89220m implements AbstractC89172b<C48738e, C48738e> {

        /* renamed from: a */
        final /* synthetic */ GeneralVideoMaskVM f112575a;

        static {
            Covode.recordClassIndex(57491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48710b(GeneralVideoMaskVM generalVideoMaskVM) {
            super(1);
            this.f112575a = generalVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48738e invoke(C48738e eVar) {
            Aweme aweme;
            Aweme aweme2;
            VideoMaskInfo videoMaskInfo;
            Aweme aweme3;
            Aweme aweme4;
            User author;
            C48738e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) this.f112575a.mo23342g();
            Aweme aweme5 = null;
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            C80635y.m139813h(aweme);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.f112575a.mo23342g();
            if (!(videoItemParams2 == null || (aweme4 = videoItemParams2.mAweme) == null || (author = aweme4.getAuthor()) == null)) {
                author.getNickname();
            }
            VideoItemParams videoItemParams3 = (VideoItemParams) this.f112575a.mo23342g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            } else {
                aweme2 = null;
            }
            C89219l.m154714a(new C12784g(C80635y.m139813h(aweme2)), eVar2.f112602a);
            VideoItemParams videoItemParams4 = (VideoItemParams) this.f112575a.mo23342g();
            if (videoItemParams4 == null || (aweme3 = videoItemParams4.mAweme) == null) {
                videoMaskInfo = null;
            } else {
                videoMaskInfo = aweme3.getGeneralMaskInfo();
            }
            VideoItemParams videoItemParams5 = (VideoItemParams) this.f112575a.mo23342g();
            if (videoItemParams5 != null) {
                aweme5 = videoItemParams5.mAweme;
            }
            return C48738e.m92040a(new C12784g(C80635y.m139813h(aweme5)), videoMaskInfo);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM$f */
    static final class C48714f extends AbstractC89220m implements AbstractC89172b<C48738e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GeneralVideoMaskVM f112582a;

        static {
            Covode.recordClassIndex(57495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48714f(GeneralVideoMaskVM generalVideoMaskVM) {
            super(1);
            this.f112582a = generalVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48738e eVar) {
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            String aid;
            C48738e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (eVar2.f112602a.f31102a) {
                VideoItemParams videoItemParams = (VideoItemParams) this.f112582a.mo23342g();
                Aweme aweme4 = null;
                if (videoItemParams != null) {
                    aweme = videoItemParams.mAweme;
                } else {
                    aweme = null;
                }
                if (C80635y.m139811f(aweme)) {
                    GeneralVideoMaskVM generalVideoMaskVM = this.f112582a;
                    VideoItemParams videoItemParams2 = (VideoItemParams) generalVideoMaskVM.mo23342g();
                    if (videoItemParams2 != null) {
                        aweme4 = videoItemParams2.mAweme;
                    }
                    if (C37699a.m76251aW(aweme4)) {
                        AbstractC33208e a = C33205b.m68071a();
                        if (a != null) {
                            a.mo59099c();
                        }
                    } else {
                        VideoItemParams videoItemParams3 = (VideoItemParams) generalVideoMaskVM.mo23342g();
                        if (!(videoItemParams3 == null || (aweme2 = videoItemParams3.mAweme) == null)) {
                            aweme2.getAid();
                        }
                        C81079v.m140776O().mo123908B();
                    }
                    VideoItemParams videoItemParams4 = (VideoItemParams) generalVideoMaskVM.mo23342g();
                    if (!(videoItemParams4 == null || (aweme3 = videoItemParams4.mAweme) == null || (aid = aweme3.getAid()) == null)) {
                        generalVideoMaskVM.mo20672d(new C48715g(aid));
                    }
                }
            }
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

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C48738e mo80488a(C48738e eVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        C89219l.m154716b(aweme, "");
        return C48738e.m92040a(new C12784g(C80635y.m139813h(videoItemParams.mAweme)), aweme.getGeneralMaskInfo());
    }
}
