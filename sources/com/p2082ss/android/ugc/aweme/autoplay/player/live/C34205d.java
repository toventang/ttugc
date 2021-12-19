package com.p2082ss.android.ugc.aweme.autoplay.player.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.service.AbstractC11843a;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import com.p2082ss.android.ugc.aweme.utils.C80391ek;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88596h;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d */
public final class C34205d extends FrameLayout implements AbstractC34186b.AbstractC34192d {

    /* renamed from: f */
    public static final C34206a f80870f = new C34206a((byte) 0);

    /* renamed from: a */
    long f80871a;

    /* renamed from: b */
    long f80872b = 5000;

    /* renamed from: c */
    int f80873c;

    /* renamed from: d */
    int f80874d;

    /* renamed from: e */
    public boolean f80875e = true;

    /* renamed from: g */
    private final AbstractC89244h f80876g = C89250i.m154773a((AbstractC89171a) C34208c.f80885a);

    /* renamed from: h */
    private ImageView f80877h;

    /* renamed from: i */
    private final AbstractC89244h f80878i = C89250i.m154773a((AbstractC89171a) C34211f.f80888a);

    /* renamed from: j */
    private C34205d f80879j = this;

    /* renamed from: k */
    private final AbstractC89244h f80880k = C89250i.m154773a((AbstractC89171a) C34214i.f80891a);

    /* renamed from: l */
    private boolean f80881l;

    /* renamed from: m */
    private int f80882m;

    /* renamed from: n */
    private C11690a f80883n;

    static {
        Covode.recordClassIndex(41140);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    public final C34215e getDataProvider() {
        return (C34215e) this.f80876g.getValue();
    }

    public final boolean getEnableReusePlayer() {
        return ((Boolean) this.f80878i.getValue()).booleanValue();
    }

    public final C34219h getStatusDelegate() {
        return (C34219h) this.f80880k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$a */
    public static final class C34206a {
        static {
            Covode.recordClassIndex(41141);
        }

        private C34206a() {
        }

        public /* synthetic */ C34206a(byte b) {
            this();
        }
    }

    public final int getFitType() {
        return this.f80882m;
    }

    public final C11690a getLivePlayerEntranceParam() {
        return this.f80883n;
    }

    public final ImageView getMCoverView() {
        return this.f80877h;
    }

    public final boolean getMute() {
        return this.f80881l;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$c */
    static final class C34208c extends AbstractC89220m implements AbstractC89171a<C34215e> {

        /* renamed from: a */
        public static final C34208c f80885a = new C34208c();

        static {
            Covode.recordClassIndex(41143);
        }

        C34208c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34215e invoke() {
            return new C34215e((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$i */
    static final class C34214i extends AbstractC89220m implements AbstractC89171a<C34219h> {

        /* renamed from: a */
        public static final C34214i f80891a = new C34214i();

        static {
            Covode.recordClassIndex(41149);
        }

        C34214i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34219h invoke() {
            return new C34219h();
        }
    }

    private final boolean getAttached() {
        return getDataProvider().f80902k;
    }

    private final AbstractC51043a getContainerStatusProvider() {
        return getDataProvider().f80892a;
    }

    private final Aweme getMAweme() {
        return getDataProvider().f80898g;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        return getMLiveStarted();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        hashCode();
        mo60538a();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        hashCode();
        mo60538a();
    }

    public final AbstractC58608c getMLivePlayHelper() {
        return getDataProvider().f80900i;
    }

    public final boolean getMLiveStarted() {
        return getDataProvider().f80901j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$g */
    public static final class RunnableC34212g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34205d f80889a;

        static {
            Covode.recordClassIndex(41147);
        }

        RunnableC34212g(C34205d dVar) {
            this.f80889a = dVar;
        }

        public final void run() {
            this.f80889a.getStatusDelegate().mo60530h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$h */
    public static final class C34213h implements AbstractC58607b {

        /* renamed from: a */
        final /* synthetic */ C34205d f80890a;

        static {
            Covode.recordClassIndex(41148);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void onPlayerMessage(AbstractC11643g.EnumC11645b bVar, Object obj) {
            C89219l.m154721d(bVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void firstFrame() {
            C34205d dVar = this.f80890a;
            dVar.hashCode();
            dVar.getStatusDelegate().mo60365a();
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playing() {
            C34205d dVar = this.f80890a;
            dVar.hashCode();
            dVar.getStatusDelegate().mo60531i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34213h(C34205d dVar) {
            this.f80890a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playPrepared(String str) {
            C89219l.m154721d(str, "");
            C34205d dVar = this.f80890a;
            dVar.hashCode();
            dVar.getStatusDelegate().mo60530h();
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playerMediaError(String str) {
            C89219l.m154721d(str, "");
            if (!TextUtils.isEmpty(str)) {
                C34205d dVar = this.f80890a;
                dVar.hashCode();
                dVar.getStatusDelegate().mo60519a(str);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playComplete(String str) {
            C89219l.m154721d(str, "");
            C34205d dVar = this.f80890a;
            dVar.hashCode();
            dVar.hashCode();
            if (System.currentTimeMillis() - dVar.f80871a >= dVar.f80872b) {
                dVar.f80871a = System.currentTimeMillis();
                LiveRoomStruct liveRoomStruct = dVar.getLiveRoomStruct();
                if (liveRoomStruct != null) {
                    ILiveOuterService s = LiveOuterService.m107269s();
                    C89219l.m154716b(s, "");
                    s.mo95830d().mo12986a(liveRoomStruct.f114485id, new C34207b(dVar));
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void seiUpdate(String str) {
            C89219l.m154721d(str, "");
            C34210e eVar = new C34210e(this.f80890a);
            C89219l.m154721d(str, "");
            C89219l.m154721d(eVar, "");
            AbstractC88403ab c = AbstractC88403ab.m153602a(str).mo142925c(C80391ek.C80392a.f179925a);
            C80391ek.C80393b bVar = C80391ek.C80393b.f179926a;
            C88466b.m153697a((Object) bVar, "predicate is null");
            C88925a.m154169a(new C88596h(c, bVar)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143231a(new C80391ek.C80394c(eVar), C80391ek.C80395d.f179928a);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void onVideoSizeChange(TextureView textureView, int i, int i2) {
            hashCode();
            C34205d dVar = this.f80890a;
            dVar.hashCode();
            dVar.f80873c = i;
            dVar.f80874d = i2;
            AbstractC58608c mLivePlayHelper = dVar.getMLivePlayHelper();
            TextureRenderView textureRenderView = null;
            if (mLivePlayHelper != null) {
                textureRenderView = mLivePlayHelper.getTextureView();
            }
            if ((textureRenderView instanceof TextureView) && textureRenderView != null) {
                dVar.getStatusDelegate().mo60366a(textureView, i, i2);
            }
        }
    }

    /* renamed from: i */
    private final void m69932i() {
        hashCode();
        getStatusDelegate().ak_();
    }

    /* renamed from: e */
    public final void mo60541e() {
        ImageView imageView = this.f80877h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: g */
    public final void mo60542g() {
        this.f80875e = true;
        ImageView imageView = this.f80877h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final String getLivePlayerTag() {
        AbstractC58608c mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            return mLivePlayHelper.getPlayerTag();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final LiveRoomStruct getLiveRoomStruct() {
        Aweme aweme = getDataProvider().f80898g;
        if (aweme != null) {
            return aweme.getNewLiveRoomData();
        }
        return null;
    }

    public final Boolean getPlayControllerIsPlaying() {
        AbstractC58608c mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            return mLivePlayHelper.getLivePlayControllerIsPlaying();
        }
        return null;
    }

    public final String getStreamData() {
        LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
        if (liveRoomStruct != null) {
            return liveRoomStruct.getMultiStreamData();
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$f */
    static final class C34211f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C34211f f80888a = new C34211f();

        static {
            Covode.recordClassIndex(41146);
        }

        C34211f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            return s.mo95830d().mo12981a("enable_search_live_card_reuse_player", (Object) false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        hashCode();
        hashCode();
        AbstractC58608c mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.destroy();
        }
        getStatusDelegate().mo60534l();
        setMLiveStarted(false);
    }

    /* renamed from: h */
    public final void mo60556h() {
        if (this.f80875e) {
            this.f80875e = false;
            ImageView imageView = this.f80877h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
        hashCode();
        getStatusDelegate().mo60522e();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hashCode();
        this.f80875e = true;
        setAttached(false);
        getStatusDelegate().mo60533k();
        bi_();
    }

    /* renamed from: j */
    private final void m69933j() {
        hashCode();
        hashCode();
        hashCode();
        AbstractC58608c a = LiveOuterService.m107269s().mo95826a(new RunnableC34212g(this), new C34213h(this));
        C89219l.m154716b(a, "");
        setMLivePlayHelper(a);
        setMLiveStarted(false);
        getStatusDelegate().al_();
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC34209d(this));
    }

    /* renamed from: a */
    public final void mo60538a() {
        hashCode();
        setKeepScreenOn(false);
        getStatusDelegate().am_();
        setMLiveStarted(false);
        if (getEnableReusePlayer()) {
            AbstractC58608c mLivePlayHelper = getMLivePlayHelper();
            if (mLivePlayHelper != null) {
                mLivePlayHelper.pauseWithStreamData();
                return;
            }
            return;
        }
        AbstractC58608c mLivePlayHelper2 = getMLivePlayHelper();
        if (mLivePlayHelper2 != null) {
            mLivePlayHelper2.stop();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        AbstractC51043a containerStatusProvider;
        AbstractC58608c mLivePlayHelper;
        TVStationRoomStruct tVStationRoomStruct;
        hashCode();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            hashCode();
            if (getAttached() && (containerStatusProvider = getContainerStatusProvider()) != null && containerStatusProvider.mo60499c()) {
                AbstractC51043a containerStatusProvider2 = getContainerStatusProvider();
                if (containerStatusProvider2 == null || containerStatusProvider2.mo60501e()) {
                    LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
                    if ((liveRoomStruct == null || !liveRoomStruct.isFinish()) && !getMLiveStarted()) {
                        LiveRoomStruct liveRoomStruct2 = getLiveRoomStruct();
                        if (liveRoomStruct2 == null || (tVStationRoomStruct = liveRoomStruct2.tvStationRoomStruct) == null || !tVStationRoomStruct.isIdle) {
                            LiveRoomStruct liveRoomStruct3 = getLiveRoomStruct();
                            if (liveRoomStruct3 != null) {
                                C11690a aVar = this.f80883n;
                                if (!(aVar == null || (mLivePlayHelper = getMLivePlayHelper()) == null)) {
                                    mLivePlayHelper.setLivePlayerEntranceParam(aVar);
                                }
                                if (getEnableReusePlayer()) {
                                    AbstractC58608c mLivePlayHelper2 = getMLivePlayHelper();
                                    if (mLivePlayHelper2 != null) {
                                        mLivePlayHelper2.playWithStreamData(this.f80881l, liveRoomStruct3, this.f80879j);
                                    }
                                } else {
                                    AbstractC58608c mLivePlayHelper3 = getMLivePlayHelper();
                                    if (mLivePlayHelper3 != null) {
                                        mLivePlayHelper3.play(this.f80881l, liveRoomStruct3, this.f80879j);
                                    }
                                }
                            }
                            setMLiveStarted(true);
                            AbstractC51044b bVar = getDataProvider().f80893b;
                            if (bVar != null) {
                                bVar.mo60482a(getMAweme());
                            }
                            getStatusDelegate().mo60524g();
                            setKeepScreenOn(true);
                        }
                    }
                }
            }
        }
    }

    public final void setLivePlayerEntranceParam(C11690a aVar) {
        this.f80883n = aVar;
    }

    public final void setMCoverView(ImageView imageView) {
        this.f80877h = imageView;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$b */
    public static final class C34207b implements AbstractC11843a {

        /* renamed from: a */
        final /* synthetic */ C34205d f80884a;

        static {
            Covode.recordClassIndex(41142);
        }

        C34207b(C34205d dVar) {
            this.f80884a = dVar;
        }

        @Override // com.bytedance.android.livesdkapi.service.AbstractC11843a
        /* renamed from: a */
        public final void mo18942a(boolean z) {
            AbstractC58608c mLivePlayHelper;
            if (!z) {
                this.f80884a.mo60538a();
                if (this.f80884a.getEnableReusePlayer() && (mLivePlayHelper = this.f80884a.getMLivePlayHelper()) != null) {
                    mLivePlayHelper.stopWithStreamData();
                }
                this.f80884a.getStatusDelegate().mo60532j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$d */
    public static final class View$OnAttachStateChangeListenerC34209d implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C34205d f80886a;

        static {
            Covode.recordClassIndex(41144);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC34209d(C34205d dVar) {
            this.f80886a = dVar;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f80886a.onAttachedToWindow();
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f80886a.onDetachedFromWindow();
        }
    }

    private final void setAttached(boolean z) {
        getDataProvider().f80902k = z;
    }

    private final void setMAweme(Aweme aweme) {
        getDataProvider().f80898g = aweme;
    }

    private final void setMLiveStarted(boolean z) {
        getDataProvider().f80901j = z;
    }

    public final void setMLivePlayHelper(AbstractC58608c cVar) {
        getDataProvider().f80900i = cVar;
    }

    public final void setFitType(int i) {
        if (i >= 0 && i <= 1) {
            this.f80882m = i;
        }
    }

    public final void setMute(boolean z) {
        this.f80881l = z;
        AbstractC58608c mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.setMute(this.f80881l);
        }
    }

    /* renamed from: a */
    public final void mo60539a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f80875e = true;
        setMAweme(aweme);
        setTag(aweme);
        this.f80883n = null;
        getStatusDelegate().mo60523f();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$e */
    static final class C34210e extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C34205d f80887a;

        static {
            Covode.recordClassIndex(41145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34210e(C34205d dVar) {
            super(1);
            this.f80887a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            if (num.intValue() != 1) {
                if (this.f80887a.f80875e) {
                    this.f80887a.mo60556h();
                }
            } else if (!this.f80887a.f80875e) {
                this.f80887a.mo60542g();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60540a(p4600h.p4611f.p4612a.AbstractC89171a<? extends com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b> r4) {
        /*
            r3 = this;
            java.lang.String r2 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r2)
            java.lang.Object r1 = r4.invoke()
            r3.hashCode()
            if (r1 == 0) goto L_0x0015
            int r0 = r1.hashCode()
            java.lang.Integer.valueOf(r0)
        L_0x0015:
            com.ss.android.ugc.aweme.autoplay.player.live.h r0 = r3.getStatusDelegate()
            if (r1 != 0) goto L_0x001c
            return
        L_0x001c:
            p4600h.p4611f.p4613b.C89219l.m154721d(r1, r2)
            java.util.List r0 = r0.mo60579m()
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.player.live.C34205d.mo60540a(h.f.a.a):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34205d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11274);
        m69932i();
        m69933j();
        MethodCollector.m26664o(11274);
    }
}
