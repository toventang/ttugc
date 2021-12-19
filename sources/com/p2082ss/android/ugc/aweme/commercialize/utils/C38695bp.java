package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18026g;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.C38143a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.api.FeedLiveRoomApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.response.C58730a;
import com.p2082ss.android.ugc.aweme.live.response.Extra;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.button.C33212c;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bp */
public final class C38695bp {

    /* renamed from: a */
    static boolean f91403a;

    /* renamed from: b */
    public static final C38695bp f91404b = new C38695bp();

    private C38695bp() {
    }

    static {
        Covode.recordClassIndex(46236);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bp$a */
    public static final class C38696a implements AbstractC22030d<C58730a<Room, Extra>> {

        /* renamed from: a */
        final /* synthetic */ Context f91405a;

        /* renamed from: b */
        final /* synthetic */ IAdSceneService f91406b;

        /* renamed from: c */
        final /* synthetic */ Aweme f91407c;

        /* renamed from: d */
        final /* synthetic */ int f91408d;

        /* renamed from: e */
        final /* synthetic */ User f91409e;

        /* renamed from: f */
        final /* synthetic */ AbstractC38694bo f91410f;

        static {
            Covode.recordClassIndex(46237);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bp$a$a */
        static final class C38697a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f91411a;

            /* renamed from: b */
            final /* synthetic */ C38696a f91412b;

            static {
                Covode.recordClassIndex(46238);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38697a(C38696a aVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f91412b = aVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C38697a(this.f91412b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C38697a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f91411a == 0) {
                    C89382r.m154942a(obj);
                    Context context = this.f91412b.f91405a;
                    while (true) {
                        if (context != null) {
                            if (!(context instanceof Activity)) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                Activity activity = (Activity) context;
                                if (activity != null) {
                                    new C23144b(activity).mo37632a().mo37640e(R.string.dck).mo37637b();
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bp$a$b */
        static final class C38698b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f91413a;

            /* renamed from: b */
            final /* synthetic */ C38696a f91414b;

            static {
                Covode.recordClassIndex(46239);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38698b(C38696a aVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f91414b = aVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C38698b(this.f91414b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C38698b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f91413a == 0) {
                    C89382r.m154942a(obj);
                    Context context = this.f91414b.f91405a;
                    while (true) {
                        if (context != null) {
                            if (!(context instanceof Activity)) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                Activity activity = (Activity) context;
                                if (activity != null) {
                                    new C23144b(activity).mo37640e(R.string.h0g).mo37637b();
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<C58730a<Room, Extra>> bVar, Throwable th) {
            AbstractC17897a c;
            C38695bp.f91403a = false;
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C33429a.f79465a), null, null, new C38697a(this, null), 3);
            IAdSceneService iAdSceneService = this.f91406b;
            if (!(iAdSceneService == null || (c = iAdSceneService.mo28466c()) == null)) {
                c.mo28511a(this.f91407c, this.f91405a, this.f91408d);
            }
            C38189j.m77539n(this.f91405a, this.f91407c);
            C18129a.m33746a("draw_ad", "live_show_failed", this.f91407c.getAwemeRawAd()).mo28902c();
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<C58730a<Room, Extra>> bVar, C22099u<C58730a<Room, Extra>> uVar) {
            String webUrl;
            T t;
            T t2;
            T t3;
            T t4;
            AbstractC17897a c;
            T t5;
            AwemeSplashInfo splashInfo;
            C38695bp.f91403a = false;
            AwemeRawAd awemeRawAd = this.f91407c.getAwemeRawAd();
            if (!(awemeRawAd == null || (splashInfo = awemeRawAd.getSplashInfo()) == null)) {
                splashInfo.hasUpdateLiving = true;
            }
            Long l = null;
            if (uVar == null || !uVar.f52261a.mo35845a() || (t = uVar.f52262b) == null || (t2 = t.f133660b) == null || t2.getId() <= 0 || (t3 = uVar.f52262b) == null || (t4 = t3.f133660b) == null || t4.getStatus() != 2) {
                User author = this.f91407c.getAuthor();
                if (author != null) {
                    author.roomId = 0;
                }
                if (this.f91408d != 42) {
                    AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C33429a.f79465a), null, null, new C38698b(this, null), 3);
                }
                this.f91410f.mo67267a();
                C38189j.m77539n(this.f91405a, this.f91407c);
                C18129a.m33746a("draw_ad", "live_show_failed", this.f91407c.getAwemeRawAd()).mo28902c();
                AbstractC81915c.m141874a(new C18026g(this.f91407c.getAid(), this.f91408d));
                int i = this.f91408d;
                if (i == 2 || i == 1) {
                    AwemeRawAd awemeRawAd2 = this.f91407c.getAwemeRawAd();
                    if (awemeRawAd2 == null || (webUrl = awemeRawAd2.getWebUrl()) == null || webUrl.length() == 0) {
                        AbstractC81915c.m141874a(new C33212c(this.f91407c.getAid()));
                        return;
                    }
                    return;
                }
                return;
            }
            EnterRoomConfig a = C11760a.m20718a((Room) uVar.f52262b.f133660b, false);
            C89219l.m154716b(a, "");
            User author2 = this.f91407c.getAuthor();
            if (author2 != null) {
                T t6 = uVar.f52262b;
                if (!(t6 == null || (t5 = t6.f133660b) == null)) {
                    l = Long.valueOf(t5.getId());
                }
                author2.roomId = l.longValue();
            }
            C38143a.m77301a(this.f91407c, a, this.f91408d);
            a.f28233c.f28293J = "TopViewLive";
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95835i().mo105593a(this.f91405a, this.f91409e, a);
            IAdSceneService iAdSceneService = this.f91406b;
            if (iAdSceneService != null && (c = iAdSceneService.mo28466c()) != null) {
                c.mo28511a(this.f91407c, this.f91405a, this.f91408d);
            }
        }

        C38696a(Context context, IAdSceneService iAdSceneService, Aweme aweme, int i, User user, AbstractC38694bo boVar) {
            this.f91405a = context;
            this.f91406b = iAdSceneService;
            this.f91407c = aweme;
            this.f91408d = i;
            this.f91409e = user;
            this.f91410f = boVar;
        }
    }

    /* renamed from: a */
    public static final boolean m78506a(Context context, Aweme aweme, int i, AbstractC38694bo boVar) {
        long parseLong;
        AbstractC17897a c;
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(boVar, "");
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (!C37699a.m76318w(aweme)) {
            return false;
        }
        if (f91403a) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return false;
        }
        if (TextUtils.isEmpty(author.getUid())) {
            parseLong = 0;
        } else {
            String uid = author.getUid();
            C89219l.m154716b(uid, "");
            parseLong = Long.parseLong(uid);
        }
        if (C37699a.m76320y(aweme)) {
            f91403a = true;
            FeedLiveRoomApi.m91779a(parseLong, author.getSecUid()).enqueue(new C38696a(context, f, aweme, i, author, boVar));
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 == null || !author2.isLive()) {
            return false;
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28232b.f28259c = aweme.getAid();
        EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
        User author3 = aweme.getAuthor();
        C89219l.m154716b(author3, "");
        logData.f28257a = author3.getRequestId();
        enterRoomConfig.f28233c.f28295L = "TopViewLive";
        C38143a.m77301a(aweme, enterRoomConfig, i);
        enterRoomConfig.f28233c.f28293J = "TopViewLive";
        enterRoomConfig.f28232b.f28258b = author.getUid();
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95835i().mo105593a(context, aweme.getAuthor(), enterRoomConfig);
        if (!(f == null || (c = f.mo28466c()) == null)) {
            c.mo28511a(aweme, context, i);
        }
        return true;
    }
}
