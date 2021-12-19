package com.p2082ss.android.ugc.aweme.autoplay.player.video;

import android.content.Context;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17892a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.C17894c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2604n.C38264b;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41859c;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41890j;
import com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42475b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49418a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51053b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51054c;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61501c;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61507g;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.shortvideo.EnumC69833ak;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import java.util.Arrays;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore */
public final class SearchPlayerCore extends KeepSurfaceTextureView implements AbstractC34186b.AbstractC34192d, OnUIPlayListener {

    /* renamed from: b */
    public static final C34226a f80920b = new C34226a((byte) 0);

    /* renamed from: A */
    private AbstractC17892a f80921A;

    /* renamed from: B */
    private final AbstractC89244h f80922B;

    /* renamed from: C */
    private final AbstractC89244h f80923C;

    /* renamed from: D */
    private final AbstractC89244h f80924D;

    /* renamed from: a */
    public int f80925a;

    /* renamed from: g */
    private AbstractC42475b f80926g;

    /* renamed from: h */
    private boolean f80927h;

    /* renamed from: i */
    private boolean f80928i;

    /* renamed from: j */
    private OnUIPlayListener f80929j;

    /* renamed from: k */
    private AbstractC34259f f80930k;

    /* renamed from: l */
    private AbstractC34186b.AbstractC34192d f80931l;

    /* renamed from: m */
    private AbstractC34186b.AbstractC34192d f80932m;

    /* renamed from: n */
    private String f80933n;

    /* renamed from: o */
    private final AbstractC89244h f80934o;

    /* renamed from: p */
    private boolean f80935p;

    /* renamed from: q */
    private final AbstractC89244h f80936q;

    /* renamed from: r */
    private final AbstractC89244h f80937r;

    /* renamed from: s */
    private boolean f80938s;

    /* renamed from: t */
    private int f80939t;

    /* renamed from: u */
    private boolean f80940u;

    /* renamed from: v */
    private boolean f80941v;

    /* renamed from: w */
    private int f80942w;

    /* renamed from: x */
    private int f80943x;

    /* renamed from: y */
    private final AbstractC89244h f80944y;

    /* renamed from: z */
    private long f80945z;

    static {
        Covode.recordClassIndex(41161);
    }

    public SearchPlayerCore(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final IAdSceneService getAdSceneService() {
        return (IAdSceneService) this.f80922B.getValue();
    }

    private final C17894c getSearchAdVideoPlayerDepend() {
        return (C17894c) this.f80923C.getValue();
    }

    private final C34231f.C342321 getSearchAdVideoPlayerSceneCallBack() {
        return (C34231f.C342321) this.f80924D.getValue();
    }

    public final C34246c getDataProvider() {
        return (C34246c) this.f80934o.getValue();
    }

    public final C61501c getMPlayVideoHelper() {
        return (C61501c) this.f80937r.getValue();
    }

    public final AbstractC84293i getSurfaceHolder() {
        return (AbstractC84293i) this.f80936q.getValue();
    }

    public final AbstractC84295k getVideoSurfaceLifecycleListener() {
        return (AbstractC84295k) this.f80944y.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore$a */
    public static final class C34226a {
        static {
            Covode.recordClassIndex(41162);
        }

        private C34226a() {
        }

        public /* synthetic */ C34226a(byte b) {
            this();
        }
    }

    public final long getCurrentPosition() {
        return this.f80945z;
    }

    public final boolean getFillHeight() {
        return this.f80938s;
    }

    public final int getFitType() {
        return this.f80939t;
    }

    public final boolean getMEverFullScreen() {
        return this.f80927h;
    }

    public final boolean getMIsContainerPaused() {
        return this.f80928i;
    }

    public final AbstractC34186b.AbstractC34192d getMPlayerMobListener() {
        return this.f80932m;
    }

    public final AbstractC34186b.AbstractC34192d getMPlayerViewListener() {
        return this.f80931l;
    }

    public final AbstractC42475b getMSearchAdViewCallBack() {
        return this.f80926g;
    }

    public final AbstractC34259f getMVideoMobListener() {
        return this.f80930k;
    }

    public final OnUIPlayListener getMVideoViewListener() {
        return this.f80929j;
    }

    public final boolean getMute() {
        return this.f80941v;
    }

    public final boolean getRepeat() {
        return this.f80940u;
    }

    public final String getSourceId() {
        return this.f80933n;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore$b */
    static final class C34227b extends AbstractC89220m implements AbstractC89171a<IAdSceneService> {

        /* renamed from: a */
        public static final C34227b f80946a = new C34227b();

        static {
            Covode.recordClassIndex(41163);
        }

        C34227b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAdSceneService invoke() {
            return AdSceneServiceImpl.m33210f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore$d */
    static final class C34229d extends AbstractC89220m implements AbstractC89171a<C61501c> {

        /* renamed from: a */
        final /* synthetic */ SearchPlayerCore f80948a;

        static {
            Covode.recordClassIndex(41165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34229d(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.f80948a = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61501c invoke() {
            SearchPlayerCore searchPlayerCore = this.f80948a;
            return new C61501c(searchPlayerCore, searchPlayerCore);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore$e */
    static final class C34230e extends AbstractC89220m implements AbstractC89171a<C17894c> {

        /* renamed from: a */
        public static final C34230e f80949a = new C34230e();

        static {
            Covode.recordClassIndex(41166);
        }

        C34230e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17894c invoke() {
            return new C17894c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore$f */
    static final class C34231f extends AbstractC89220m implements AbstractC89171a<C342321> {

        /* renamed from: a */
        final /* synthetic */ SearchPlayerCore f80950a;

        static {
            Covode.recordClassIndex(41167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34231f(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.f80950a = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C342321 invoke() {
            return new AbstractC17893b(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore.C34231f.C342321 */

                /* renamed from: a */
                final /* synthetic */ C34231f f80951a;

                static {
                    Covode.recordClassIndex(41168);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b
                /* renamed from: a */
                public final int mo28487a() {
                    return (int) this.f80951a.f80950a.getMPlayVideoHelper().mo99151c();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b
                /* renamed from: b */
                public final void mo28488b() {
                    AbstractC42475b mSearchAdViewCallBack = this.f80951a.f80950a.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.mo72626a();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b
                /* renamed from: c */
                public final void mo28489c() {
                    AbstractC42475b mSearchAdViewCallBack = this.f80951a.f80950a.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.mo72627b();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b
                /* renamed from: d */
                public final void mo28490d() {
                    AbstractC42475b mSearchAdViewCallBack = this.f80951a.f80950a.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.mo72628c();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b
                /* renamed from: e */
                public final void mo28491e() {
                    AbstractC42475b mSearchAdViewCallBack = this.f80951a.f80950a.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.mo72629d();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b
                /* renamed from: g */
                public final void mo28493g() {
                    AbstractC42475b mSearchAdViewCallBack = this.f80951a.f80950a.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.mo72631f();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17893b
                /* renamed from: f */
                public final Boolean mo28492f() {
                    AbstractC42475b mSearchAdViewCallBack = this.f80951a.f80950a.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        return mSearchAdViewCallBack.mo72630e();
                    }
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f80951a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore$h */
    static final class C34234h extends AbstractC89220m implements AbstractC89171a<C342351> {

        /* renamed from: a */
        final /* synthetic */ SearchPlayerCore f80953a;

        static {
            Covode.recordClassIndex(41170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34234h(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.f80953a = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C342351 invoke() {
            return new AbstractC84295k(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore.C34234h.C342351 */

                /* renamed from: a */
                final /* synthetic */ C34234h f80954a;

                static {
                    Covode.recordClassIndex(41171);
                }

                @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
                public final void aJ_() {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f80954a = r1;
                }

                @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
                /* renamed from: b */
                public final void mo60627b(int i, int i2) {
                    this.f80954a.f80953a.mo60585a(i, i2);
                }

                @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
                /* renamed from: a */
                public final void mo60625a(int i, int i2) {
                    this.f80954a.f80953a.getDataProvider().f80986c = false;
                    this.f80954a.f80953a.mo60585a(i, i2);
                }
            };
        }
    }

    private final AbstractC51043a getMContainerStatusProvider() {
        return getDataProvider().f80992i;
    }

    private final boolean getMIsAttached() {
        return getDataProvider().f80985b;
    }

    private final AbstractC51044b getMPlayVideoObserver() {
        return getDataProvider().f80991h;
    }

    public final Aweme getMAweme() {
        return getDataProvider().f80987d;
    }

    public final AbstractC80747i getMPlayer() {
        return getDataProvider().f80998o;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return getDataProvider().f80984a;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore$c */
    static final class C34228c extends AbstractC89220m implements AbstractC89171a<C34246c> {

        /* renamed from: a */
        final /* synthetic */ SearchPlayerCore f80947a;

        static {
            Covode.recordClassIndex(41164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34228c(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.f80947a = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34246c invoke() {
            C34246c cVar = new C34246c();
            cVar.f80989f = this.f80947a.getMPlayVideoHelper();
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore$g */
    static final class C34233g extends AbstractC89220m implements AbstractC89171a<C84294j> {

        /* renamed from: a */
        final /* synthetic */ SearchPlayerCore f80952a;

        static {
            Covode.recordClassIndex(41169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34233g(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.f80952a = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84294j invoke() {
            C84294j a = C84294j.m144981a(this.f80952a);
            a.mo129312a(this.f80952a.getVideoSurfaceLifecycleListener());
            return a;
        }
    }

    private final C49418a getMPlayStateHelper() {
        return (C49418a) getDataProvider().f80990g.getValue();
    }

    /* renamed from: i */
    private static boolean m69982i() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMIsAttached(true);
        hashCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        if (C41890j.m83916d()) {
            return this.f80935p;
        }
        AbstractC80747i iVar = getMPlayVideoHelper().f139608e;
        if (iVar == null || !iVar.mo123892o()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        mo60584a();
        AbstractC34186b.AbstractC34192d dVar = this.f80931l;
        if (dVar != null) {
            dVar.bi_();
        }
        AbstractC34186b.AbstractC34192d dVar2 = this.f80932m;
        if (dVar2 != null) {
            dVar2.bi_();
        }
    }

    /* renamed from: e */
    public final void mo60587e() {
        if (this.f80941v) {
            getMPlayVideoHelper().mo99156h();
        } else {
            getMPlayVideoHelper().mo99157i();
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView
    public final void onDetachedFromWindow() {
        if (getDataProvider().f80997n) {
            super.onDetachedFromWindow();
            setMIsAttached(false);
            C34256e eVar = getDataProvider().f80995l;
            if (eVar != null) {
                eVar.mo60344e();
            }
            hashCode();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        if (getDataProvider().f80988e) {
            getDataProvider().f80988e = false;
            return;
        }
        bi_();
        AbstractC34186b.AbstractC34192d dVar = this.f80931l;
        if (dVar != null) {
            dVar.bg_();
        }
        AbstractC34186b.AbstractC34192d dVar2 = this.f80932m;
        if (dVar2 != null) {
            dVar2.bg_();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (android.text.TextUtils.equals(r2, r1.getSourceId()) != false) goto L_0x0039;
     */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void an_() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.video.i r0 = r3.getMPlayer()
            if (r0 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.video.i r0 = r3.getMPlayer()
            if (r0 != 0) goto L_0x0015
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0015:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.mo123894q()
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r3.f80933n
            com.ss.android.ugc.aweme.video.i r0 = r3.getMPlayer()
            if (r0 != 0) goto L_0x0026
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0026:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.mo123894q()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            java.lang.String r0 = r1.getSourceId()
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x0049
        L_0x0039:
            com.ss.android.ugc.aweme.newfollow.c.c r1 = r3.getMPlayVideoHelper()
            r0 = 1
            r1.f139607d = r0
            com.ss.android.ugc.aweme.video.i r0 = r1.f139608e
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.video.i r0 = r1.f139608e
            r0.mo123951z()
        L_0x0049:
            com.ss.android.ugc.aweme.autoplay.player.b$d r0 = r3.f80931l
            if (r0 == 0) goto L_0x0050
            r0.an_()
        L_0x0050:
            com.ss.android.ugc.aweme.autoplay.player.b$d r0 = r3.f80932m
            if (r0 == 0) goto L_0x0057
            r0.an_()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore.an_():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        long j;
        String str;
        C84241i b;
        AbstractC80747i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        if (getMAweme() != null) {
            this.f80945z = getMPlayVideoHelper().mo99151c();
            bi_();
            if (!(getMPlayer() == null || getMAweme() == null || (b = C80662ac.m139891b(getMAweme())) == null)) {
                C80937s.m140453b().mo124089i(b);
            }
            String str2 = null;
            if (getMPlayer() != null) {
                C41859c.C41860a.f97662a.mo71026a(getMPlayer());
                getMPlayVideoHelper().mo99147a();
                setMPlayer(null);
            }
            C34246c dataProvider = getDataProvider();
            C51053b a = getDataProvider().mo60666a();
            if (a != null) {
                j = a.f117760d;
            } else {
                j = -1;
            }
            dataProvider.f80981B = j;
            if (getMAweme() != null) {
                C51054c cVar = C51054c.C51055a.f117767a;
                AbstractC51043a mContainerStatusProvider = getMContainerStatusProvider();
                if (mContainerStatusProvider != null) {
                    str = mContainerStatusProvider.mo60500d();
                } else {
                    str = null;
                }
                Aweme mAweme = getMAweme();
                if (mAweme == null) {
                    C89219l.m154715b();
                }
                String a2 = C51053b.m95442a(str, mAweme.getAid());
                if (!cVar.f117766a.isEmpty()) {
                    cVar.f117766a.remove(a2);
                }
                AbstractC51043a mContainerStatusProvider2 = getMContainerStatusProvider();
                if (mContainerStatusProvider2 != null) {
                    str2 = mContainerStatusProvider2.mo60500d();
                }
                Aweme mAweme2 = getMAweme();
                if (mAweme2 == null) {
                    C89219l.m154715b();
                }
                C51053b.m95442a(str2, mAweme2.getAid());
                Log.getStackTraceString(new Throwable());
            }
        }
        AbstractC34186b.AbstractC34192d dVar = this.f80931l;
        if (dVar != null) {
            dVar.mo60425B();
        }
        AbstractC34186b.AbstractC34192d dVar2 = this.f80932m;
        if (dVar2 != null) {
            dVar2.mo60425B();
        }
        AbstractC34259f fVar = this.f80930k;
        if (fVar != null) {
            fVar.mo60425B();
        }
    }

    /* renamed from: a */
    public final void mo60584a() {
        if (getMAweme() != null) {
            if (getMPlayer() != null) {
                AbstractC80747i mPlayer = getMPlayer();
                if (mPlayer == null) {
                    C89219l.m154715b();
                }
                if (mPlayer.mo123894q() != null) {
                    String str = this.f80933n;
                    AbstractC80747i mPlayer2 = getMPlayer();
                    if (mPlayer2 == null) {
                        C89219l.m154715b();
                    }
                    VideoUrlModel q = mPlayer2.mo123894q();
                    C89219l.m154716b(q, "");
                    if (!TextUtils.equals(str, q.getSourceId())) {
                        return;
                    }
                }
            }
            if (C38264b.m77611c() != null) {
                C38264b.m77610a(null);
                C38264b.f90431a = true;
            }
            getMPlayVideoHelper().mo99152d();
            if (C41890j.m83916d()) {
                onPausePlay(this.f80933n);
            }
            this.f80925a = (int) getMPlayVideoHelper().mo99151c();
            C80937s.m140452a().mo124080d();
            AbstractC17892a aVar = this.f80921A;
            if (aVar != null) {
                aVar.mo28486c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x027c, code lost:
        if (r2 != null) goto L_0x013b;
     */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60424A() {
        /*
        // Method dump skipped, instructions count: 654
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore.mo60424A():void");
    }

    public final void setCurrentPosition(long j) {
        this.f80945z = j;
    }

    public final void setFillHeight(boolean z) {
        this.f80938s = z;
    }

    public final void setMEverFullScreen(boolean z) {
        this.f80927h = z;
    }

    public final void setMIsContainerPaused(boolean z) {
        this.f80928i = z;
    }

    public final void setMPlayerMobListener(AbstractC34186b.AbstractC34192d dVar) {
        this.f80932m = dVar;
    }

    public final void setMPlayerViewListener(AbstractC34186b.AbstractC34192d dVar) {
        this.f80931l = dVar;
    }

    public final void setMSearchAdViewCallBack(AbstractC42475b bVar) {
        this.f80926g = bVar;
    }

    public final void setMVideoMobListener(AbstractC34259f fVar) {
        this.f80930k = fVar;
    }

    public final void setMVideoViewListener(OnUIPlayListener onUIPlayListener) {
        this.f80929j = onUIPlayListener;
    }

    public final void setMute(boolean z) {
        this.f80941v = z;
    }

    public final void setRepeat(boolean z) {
        this.f80940u = z;
    }

    public final void setSourceId(String str) {
        this.f80933n = str;
    }

    private final void setMIsAttached(boolean z) {
        getDataProvider().f80985b = z;
    }

    private final void setMPlayVideoObserver(AbstractC51044b bVar) {
        getDataProvider().f80991h = bVar;
    }

    private final void setMPlayer(AbstractC80747i iVar) {
        getDataProvider().f80998o = iVar;
    }

    public final void setMAweme(Aweme aweme) {
        getDataProvider().f80987d = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener onUIPlayListener = this.f80929j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
        AbstractC34259f fVar = this.f80930k;
        if (fVar != null) {
            fVar.onPlayProgressChange(f);
        }
    }

    public final void setContainerStatusProvider(AbstractC51043a aVar) {
        C89219l.m154721d(aVar, "");
        getDataProvider().f80992i = aVar;
    }

    public final void setFitType(int i) {
        if (i >= 0 && i <= 1) {
            this.f80939t = i;
            mo60585a(this.f80942w, this.f80943x);
        }
    }

    public final void setVideoUiListener(AbstractC34259f fVar) {
        C89219l.m154721d(fVar, "");
        getDataProvider().f81000q = fVar;
    }

    /* renamed from: a */
    private final boolean m69981a(String str) {
        String str2;
        if (getMAweme() == null) {
            return false;
        }
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            str2 = mAweme.getAid();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        AbstractC80747i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        OnUIPlayListener onUIPlayListener = this.f80929j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(z);
        }
        AbstractC34259f fVar = this.f80930k;
        if (fVar != null) {
            fVar.onBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        AbstractC80747i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        OnUIPlayListener onUIPlayListener = this.f80929j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(z);
        }
        AbstractC34259f fVar = this.f80930k;
        if (fVar != null) {
            fVar.onDecoderBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
        AbstractC80747i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        OnUIPlayListener onUIPlayListener = this.f80929j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(lVar);
        }
        AbstractC34259f fVar = this.f80930k;
        if (fVar != null) {
            fVar.onRetryOnError(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        C34256e eVar;
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompleted(str);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onPlayCompleted(str);
            }
            AbstractC17892a aVar = this.f80921A;
            if (aVar != null) {
                aVar.mo28483a();
            }
            if (!this.f80940u && (eVar = getDataProvider().f80995l) != null) {
                eVar.bi_();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompletedFirstTime(str);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onPlayCompletedFirstTime(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
        C89219l.m154721d(lVar, "");
        if (m69981a(lVar.f188032a)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayFailed(lVar);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onPlayFailed(lVar);
            }
            this.f80935p = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            AbstractC80747i mPlayer2 = getMPlayer();
            if (mPlayer2 != null) {
                Integer.valueOf(mPlayer2.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayPrepare(str);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onPlayPrepare(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayStop(str);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onPlayStop(str);
            }
            this.f80935p = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlaying(str);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onPlaying(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            C49418a mPlayStateHelper = getMPlayStateHelper();
            if (mPlayStateHelper != null) {
                mPlayStateHelper.f113577a = 1;
            }
            this.f80933n = str;
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPreparePlay(str);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onPreparePlay(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        C89219l.m154721d(oVar, "");
        String id = oVar.getId();
        if (m69981a(id)) {
            EnumC69833ak.INSTANCE.setVideoId(id);
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            AbstractC80747i mPlayer2 = getMPlayer();
            if (mPlayer2 != null) {
                mPlayer2.mo123911E();
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRenderFirstFrame(oVar);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onRenderFirstFrame(oVar);
            }
            this.f80935p = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            C49418a mPlayStateHelper = getMPlayStateHelper();
            if (mPlayStateHelper != null) {
                mPlayStateHelper.f113577a = 2;
            }
            setKeepScreenOn(true);
            this.f80933n = str;
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onResumePlay(str);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onResumePlay(str);
            }
            this.f80935p = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        if (m69981a(str)) {
            C49418a mPlayStateHelper = getMPlayStateHelper();
            if (mPlayStateHelper == null || mPlayStateHelper.f113577a != 3) {
                AbstractC80747i mPlayer = getMPlayer();
                if (mPlayer != null) {
                    Integer.valueOf(mPlayer.hashCode());
                }
                Aweme mAweme = getMAweme();
                if (mAweme != null) {
                    mAweme.getDesc();
                }
                C49418a mPlayStateHelper2 = getMPlayStateHelper();
                if (mPlayStateHelper2 != null) {
                    mPlayStateHelper2.f113577a = 3;
                }
                setKeepScreenOn(false);
                getMPlayVideoObserver();
                OnUIPlayListener onUIPlayListener = this.f80929j;
                if (onUIPlayListener != null) {
                    onUIPlayListener.onPausePlay(str);
                }
                AbstractC34259f fVar = this.f80930k;
                if (fVar != null) {
                    fVar.onPausePlay(str);
                }
                this.f80935p = false;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        Integer num;
        C89219l.m154721d(nVar, "");
        if (!this.f80928i && m69981a(nVar.f188111a)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            C62956e.m113374a();
            C49418a mPlayStateHelper = getMPlayStateHelper();
            if (mPlayStateHelper != null) {
                mPlayStateHelper.f113577a = 2;
            }
            if (getMAweme() != null) {
                StringBuilder sb = new StringBuilder("Player(");
                AbstractC80747i mPlayer2 = getMPlayer();
                String str = null;
                if (mPlayer2 != null) {
                    num = Integer.valueOf(mPlayer2.hashCode());
                } else {
                    num = null;
                }
                String sb2 = sb.append(num).append(") onRenderReady: preload, sourceId=%s, duration=%d").toString();
                Object[] objArr = new Object[2];
                Aweme mAweme = getMAweme();
                if (mAweme != null) {
                    str = mAweme.getAid();
                }
                objArr[0] = str;
                objArr[1] = Long.valueOf(nVar.f188113c);
                C89219l.m154716b(C1764a.m5928a(sb2, Arrays.copyOf(objArr, 2)), "");
            }
            setKeepScreenOn(true);
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRenderReady(nVar);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onRenderReady(nVar);
            }
            this.f80935p = true;
            AbstractC17892a aVar = this.f80921A;
            if (aVar != null) {
                aVar.mo28484a(nVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo60586a(Aweme aweme) {
        setVisibility(0);
        getMPlayVideoHelper().mo99149a(aweme);
        setMAweme(aweme);
        C49418a mPlayStateHelper = getMPlayStateHelper();
        if (mPlayStateHelper != null) {
            mPlayStateHelper.f113577a = 0;
        }
        this.f80927h = false;
        this.f80925a = 0;
        AwemeRawAd awemeRawAd = null;
        this.f80921A = null;
        if (C37699a.m76314s(aweme) && getAdSceneService() != null) {
            this.f80921A = getAdSceneService().mo28468e();
            getSearchAdVideoPlayerDepend().f42655b = getSearchAdVideoPlayerSceneCallBack();
            getSearchAdVideoPlayerDepend().f42657c = aweme;
            C17894c searchAdVideoPlayerDepend = getSearchAdVideoPlayerDepend();
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            searchAdVideoPlayerDepend.f42656a = awemeRawAd;
            AbstractC17892a aVar = this.f80921A;
            if (aVar != null) {
                aVar.mo28473a(getSearchAdVideoPlayerDepend());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C84208l lVar) {
        AbstractC80747i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        OnUIPlayListener onUIPlayListener = this.f80929j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(str, lVar);
        }
        AbstractC34259f fVar = this.f80930k;
        if (fVar != null) {
            fVar.onPlayFailed(str, lVar);
        }
        this.f80935p = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            this.f80935p = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onBufferedTimeMs(str, j);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onBufferedTimeMs(str, j);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onBuffering(str, z);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onBuffering(str, z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onCompleteLoaded(str, z);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onCompleteLoaded(str, z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onDecoderBuffering(str, z);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onDecoderBuffering(str, z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C84208l lVar) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRetryOnError(str, lVar);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onRetryOnError(str, lVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onSeekEnd(str, z);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onSeekEnd(str, z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRenderFirstFrame(str, oVar);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onRenderFirstFrame(str, oVar);
            }
            this.f80935p = true;
        }
    }

    /* renamed from: a */
    public final void mo60585a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f80942w = i;
            this.f80943x = i2;
            if (this.f80938s) {
                m69980a(i, i2, this.f80939t);
                return;
            }
            Aweme mAweme = getMAweme();
            if (mAweme != null && mAweme.getVideo() != null) {
                Aweme mAweme2 = getMAweme();
                if (mAweme2 == null) {
                    C89219l.m154715b();
                }
                Video video = mAweme2.getVideo();
                if (video == null) {
                    C89219l.m154715b();
                }
                int width = video.getWidth();
                Aweme mAweme3 = getMAweme();
                if (mAweme3 == null) {
                    C89219l.m154715b();
                }
                Video video2 = mAweme3.getVideo();
                if (video2 == null) {
                    C89219l.m154715b();
                }
                int height = video2.getHeight();
                if (width > 0 && height > 0) {
                    Matrix matrix = new Matrix();
                    matrix.setScale(1.0f, (((float) height) / ((float) width)) / (((float) i2) / ((float) i)), (float) (i / 2), (float) (i2 / 2));
                    setTransform(matrix);
                }
            }
        }
    }

    private /* synthetic */ SearchPlayerCore(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayProgressChange(str, j, j2);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onPlayProgressChange(str, j, j2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onSeekStart(str, i, f);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onSeekStart(str, i, f);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        if (m69981a(str)) {
            AbstractC80747i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f80929j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onVideoSizeChanged(str, i, i2);
            }
            AbstractC34259f fVar = this.f80930k;
            if (fVar != null) {
                fVar.onVideoSizeChanged(str, i, i2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchPlayerCore(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f80934o = C89250i.m154773a((AbstractC89171a) new C34228c(this));
        this.f80936q = C89250i.m154773a((AbstractC89171a) new C34233g(this));
        this.f80937r = C89250i.m154773a((AbstractC89171a) new C34229d(this));
        this.f80938s = true;
        this.f80940u = true;
        this.f80944y = C89250i.m154773a((AbstractC89171a) new C34234h(this));
        this.f80922B = C89250i.m154773a((AbstractC89171a) C34227b.f80946a);
        this.f80923C = C89250i.m154773a((AbstractC89171a) C34230e.f80949a);
        this.f80924D = C89250i.m154773a((AbstractC89171a) new C34231f(this));
    }

    /* renamed from: a */
    private final void m69980a(int i, int i2, int i3) {
        float f;
        Aweme mAweme = getMAweme();
        if (mAweme != null && mAweme.getVideo() != null && i > 0 && i2 > 0) {
            Aweme mAweme2 = getMAweme();
            if (mAweme2 == null) {
                C89219l.m154715b();
            }
            Video video = mAweme2.getVideo();
            if (video == null) {
                C89219l.m154715b();
            }
            int width = video.getWidth();
            Aweme mAweme3 = getMAweme();
            if (mAweme3 == null) {
                C89219l.m154715b();
            }
            Video video2 = mAweme3.getVideo();
            if (video2 == null) {
                C89219l.m154715b();
            }
            int height = video2.getHeight();
            if (width > 0 && height > 0) {
                float f2 = ((float) height) / ((float) width);
                if (i3 == 0) {
                    C61507g.m111369a(i, i2, this, f2);
                    return;
                }
                float f3 = ((float) i2) / ((float) i);
                float f4 = 1.0f;
                if (f3 > f2) {
                    f = f2 / f3;
                } else {
                    f4 = f2 / f3;
                    f = 1.0f;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(f4, f, (float) (i / 2), (float) (i2 / 2));
                setTransform(matrix);
            }
        }
    }
}
