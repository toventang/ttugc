package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.assem.arch.p795b.AbstractC12659j;
import com.bytedance.assem.arch.p795b.C12666q;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22873a;
import com.bytedance.tiktok.proxy.AbstractC22874b;
import com.bytedance.tiktok.proxy.AbstractC22875c;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.feed.C48311ag;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a;
import com.p2082ss.android.ugc.aweme.feed.assem.C48442b;
import com.p2082ss.android.ugc.aweme.feed.assem.C48704f;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49533w;
import com.p2082ss.android.ugc.aweme.feed.helper.C49618d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50544l;
import com.p2082ss.android.ugc.aweme.launcher.service.mob.C58081a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56251d;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell */
public abstract class VideoBaseCell implements AbstractC1202k, AbstractC12656g, AbstractC22875c<VideoBaseCell, VideoItemParams, C48155ao<VideoBaseCell, VideoItemParams>>, AbstractC48234cd {

    /* renamed from: a */
    private final AbstractC89244h f111303a = C89250i.m154773a((AbstractC89171a) new C48043b(this));

    /* renamed from: b */
    private boolean f111304b;

    /* renamed from: c */
    private boolean f111305c;

    /* renamed from: d */
    private final AbstractC1202k f111306d;

    /* renamed from: i */
    protected VideoItemParams f111307i;

    /* renamed from: j */
    public Aweme f111308j;

    /* renamed from: k */
    public int f111309k;

    /* renamed from: l */
    protected Fragment f111310l;

    /* renamed from: m */
    public C48155ao<VideoBaseCell, VideoItemParams> f111311m;

    /* renamed from: n */
    public C48442b f111312n;

    /* renamed from: o */
    public final C48238ce f111313o;

    static {
        Covode.recordClassIndex(56776);
    }

    /* renamed from: n */
    private final C1205n mo80073n() {
        return (C1205n) this.f111303a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: E */
    public void mo80097E() {
    }

    /* renamed from: K */
    public boolean mo80077K() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
    /* renamed from: L */
    public void mo80098L() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
    /* renamed from: M */
    public void mo80099M() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: N */
    public AbstractC80726a mo80100N() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: P */
    public AbstractC48136a mo80101P() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: Q */
    public boolean mo80102Q() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: R */
    public C49618d mo80103R() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: S */
    public boolean mo80104S() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: T */
    public AbstractC48149ai mo80105T() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: U */
    public void mo80106U() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: V */
    public void mo80107V() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: W */
    public boolean mo80108W() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
    /* renamed from: X */
    public void mo80109X() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80110a(int i, long j, long j2, int i2, long j3, long j4, long j5, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80112a(int i, String str, long j, long j2, int i2, long j3, long j4, long j5, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80115a(C56251d dVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80116a(String str, int i, int i2, int i3, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80117a(String str, int i, int i2, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80118a(Map map) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo70616a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
    /* renamed from: ad */
    public View mo80119ad() {
        return null;
    }

    /* renamed from: ag */
    public abstract C48442b mo80122ag();

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
    /* renamed from: b */
    public void mo60627b(int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: b */
    public void mo80123b(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: c */
    public AbstractC48149ai mo80124c(String str) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: d */
    public void mo80125d(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: d */
    public void mo80126d(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: e */
    public C48311ag mo70617e() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: f */
    public void mo70618f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: h */
    public void mo80127h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: i */
    public void mo70619i() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: k */
    public void mo80128k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i, int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell$a */
    public static final class C48042a implements AbstractC22874b<VideoBaseCell, VideoItemParams> {

        /* renamed from: a */
        private C12666q f111314a;

        /* renamed from: b */
        private C48442b f111315b;

        static {
            Covode.recordClassIndex(56777);
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: a */
        public final void mo23357a(boolean z) {
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: b */
        public final void mo23358b() {
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: c */
        public final void mo23359c() {
        }

        C48042a() {
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: d */
        public final void mo23360d() {
            C12666q e = m91139e();
            if (e != null) {
                e.mo20490k();
            }
        }

        /* renamed from: e */
        private final C12666q m91139e() {
            AbstractC12659j jVar;
            C48442b bVar = this.f111315b;
            C12666q qVar = null;
            if (bVar != null) {
                jVar = bVar.f30901n;
            } else {
                jVar = null;
            }
            if (jVar instanceof C12666q) {
                qVar = jVar;
            }
            return qVar;
        }

        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: a */
        public final void mo23354a() {
            AbstractC12789k kVar = C12787j.f31108b;
            if (kVar != null) {
                kVar.mo20640a("AssemList", "cell unbindProxy " + this.f111315b + ", position=");
            }
            C12666q e = m91139e();
            if (e != null) {
                e.mo20489j();
            }
            this.f111315b = null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: a */
        public final /* synthetic */ void mo23356a(int i, VideoItemParams videoItemParams) {
            C89219l.m154721d(videoItemParams, "");
            C12666q e = m91139e();
            if (e != null) {
                e.mo20482a(i, videoItemParams);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, com.bytedance.tiktok.proxy.c, java.lang.Object, java.util.List, h.f.a.b, h.f.a.a] */
        @Override // com.bytedance.tiktok.proxy.AbstractC22874b
        /* renamed from: a */
        public final /* synthetic */ void mo23355a(int i, AbstractC22875c<VideoBaseCell, VideoItemParams, AbstractC22873a<VideoBaseCell, VideoItemParams>> cVar, VideoItemParams videoItemParams, List list, AbstractC89172b<? super VideoItemParams, C89391z> bVar, AbstractC89171a aVar) {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(videoItemParams, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(aVar, "");
            this.f111315b = ((VideoBaseCell) cVar).f111312n;
            if (this.f111314a == null) {
                this.f111314a = new C12666q();
            }
            C12666q qVar = this.f111314a;
            if (qVar != null) {
                qVar.f30823d = i;
            }
            AbstractC12789k kVar = C12787j.f31108b;
            if (kVar != null) {
                kVar.mo20640a("AssemList", "cell bindProxy: position=" + i + ", item=" + videoItemParams);
            }
            C12666q qVar2 = this.f111314a;
            if (qVar2 == null) {
                C89219l.m154715b();
            }
            C48442b bVar2 = this.f111315b;
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            qVar2.mo20483a(bVar2, videoItemParams, list, bVar, aVar);
        }
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.tiktok.proxy.AbstractC22875c
    public final /* bridge */ /* synthetic */ VideoBaseCell aO_() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell$b */
    static final class C48043b extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ VideoBaseCell f111316a;

        static {
            Covode.recordClassIndex(56778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48043b(VideoBaseCell videoBaseCell) {
            super(0);
            this.f111316a = videoBaseCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f111316a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: O */
    public Aweme mo80089O() {
        return mo80206b();
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22875c
    public final AbstractC1204m aK_() {
        return this.f111313o.f111746c;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12656g
    public final View aM_() {
        return this.f111313o.f111744a;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12656g
    public final AbstractC1204m aN_() {
        return this.f111313o.f111746c;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return mo80073n();
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public C1182af getViewModelStore() {
        return new C1182af();
    }

    /* renamed from: F */
    private final void mo80067F() {
        mo80073n().mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    /* renamed from: o */
    private final void mo80074o() {
        mo80073n().mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12656g
    public final ActivityC0945e aL_() {
        return this.f111313o.f111746c.getActivity();
    }

    /* renamed from: ae */
    public final void mo80120ae() {
        AbstractC12659j jVar;
        C48442b bVar = this.f111312n;
        if (bVar != null && (jVar = bVar.f30901n) != null) {
            jVar.mo20479f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: c */
    public void mo80080c() {
        AbstractC12659j jVar;
        C48442b bVar = this.f111312n;
        if (bVar != null && (jVar = bVar.f30901n) != null) {
            jVar.mo20480g();
        }
    }

    /* renamed from: af */
    public final void mo80121af() {
        AbstractC1196i lifecycle;
        AbstractC1196i iVar;
        AbstractC12789k kVar = C12787j.f31108b;
        if (kVar != null) {
            StringBuilder append = new StringBuilder("tryObserveLifecycle: ").append(this).append(", ");
            AbstractC1204m aK_ = aK_();
            if (aK_ != null) {
                iVar = aK_.getLifecycle();
            } else {
                iVar = null;
            }
            kVar.mo20640a("AssemList", append.append(iVar).toString());
        }
        if (!this.f111305c) {
            AbstractC1204m aK_2 = aK_();
            if (!(aK_2 == null || (lifecycle = aK_2.getLifecycle()) == null)) {
                lifecycle.mo4012a(this);
            }
            this.f111305c = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell$c */
    public static final class RunnableC48044c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoItemParams f111317a;

        /* renamed from: b */
        final /* synthetic */ VideoBaseCell f111318b;

        /* renamed from: c */
        final /* synthetic */ int f111319c;

        static {
            Covode.recordClassIndex(56779);
        }

        RunnableC48044c(VideoItemParams videoItemParams, VideoBaseCell videoBaseCell, int i) {
            this.f111317a = videoItemParams;
            this.f111318b = videoBaseCell;
            this.f111319c = i;
        }

        public final void run() {
            AbstractC12789k kVar = C12787j.f31108b;
            if (kVar != null) {
                kVar.mo20640a("AssemList", "VideoBaseCell BindProxy");
            }
            C48704f fVar = this.f111318b.f111313o.f111757n;
            if (fVar != null) {
                VideoItemParams videoItemParams = this.f111317a;
                VideoBaseCell videoBaseCell = this.f111318b;
                int i = this.f111319c;
                C89219l.m154721d(videoItemParams, "");
                C89219l.m154721d(videoBaseCell, "");
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = (T) C50544l.m94759a(videoItemParams.mAweme);
                T t = eVar.element;
                if (!(t == null || t.length() == 0)) {
                    C48155ao<VideoBaseCell, VideoItemParams> aoVar = fVar.f112565a.get(eVar.element);
                    if (aoVar == null) {
                        aoVar = new C48155ao<>(new C48042a());
                        ConcurrentHashMap<String, C48155ao<VideoBaseCell, VideoItemParams>> concurrentHashMap = fVar.f112565a;
                        String a = C50544l.m94759a(videoItemParams.mAweme);
                        if (a == null) {
                            C89219l.m154715b();
                        }
                        concurrentHashMap.put(a, aoVar);
                    }
                    C48155ao<VideoBaseCell, VideoItemParams> aoVar2 = videoBaseCell.f111311m;
                    if (aoVar2 != null) {
                        aoVar2.mo80293a();
                    }
                    C48704f.C48705a aVar = new C48704f.C48705a(aoVar, i);
                    C48704f.C48706b bVar = new C48704f.C48706b(fVar, eVar, i);
                    C89219l.m154721d(videoBaseCell, "");
                    C89219l.m154721d(aVar, "");
                    C89219l.m154721d(bVar, "");
                    aoVar.mo80293a();
                    videoBaseCell.mo28066a(aoVar);
                    aoVar.f111542a = videoBaseCell;
                    AbstractC22874b<R, ITEM> bVar2 = aoVar.f111543b;
                    if (bVar2 != null) {
                        bVar2.mo23355a(i, videoBaseCell, videoItemParams, null, aVar, bVar);
                    }
                }
            }
            if (C12787j.f31109c) {
                C34727m.m70944a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell.RunnableC48044c.RunnableC480451 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC48044c f111320a;

                    static {
                        Covode.recordClassIndex(56780);
                    }

                    {
                        this.f111320a = r1;
                    }

                    public final void run() {
                        this.f111320a.f111318b.mo80121af();
                    }
                });
                this.f111318b.mo80120ae();
                return;
            }
            C34727m.m70944a(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell.RunnableC48044c.RunnableC480462 */

                /* renamed from: a */
                final /* synthetic */ RunnableC48044c f111321a;

                static {
                    Covode.recordClassIndex(56781);
                }

                {
                    this.f111321a = r1;
                }

                public final void run() {
                    this.f111321a.f111318b.mo80121af();
                    this.f111321a.f111318b.mo80120ae();
                }
            });
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tiktok.proxy.a] */
    @Override // com.bytedance.tiktok.proxy.AbstractC22875c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28066a(C48155ao<VideoBaseCell, VideoItemParams> aoVar) {
        this.f111311m = aoVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80113a(View view) {
        C89219l.m154721d(view, "");
        this.f111312n = mo80122ag();
        C12780d.m23006a(this, new C48047d(this, view));
    }

    public VideoBaseCell(C48238ce ceVar) {
        C89219l.m154721d(ceVar, "");
        this.f111313o = ceVar;
        VideoBaseCell$dispatcher$1 videoBaseCell$dispatcher$1 = new VideoBaseCell$dispatcher$1(this);
        this.f111306d = videoBaseCell$dispatcher$1;
        getLifecycle().mo4012a(videoBaseCell$dispatcher$1);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell$d */
    static final class C48047d extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoBaseCell f111322a;

        /* renamed from: b */
        final /* synthetic */ View f111323b;

        static {
            Covode.recordClassIndex(56782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48047d(VideoBaseCell videoBaseCell, View view) {
            super(1);
            this.f111322a = videoBaseCell;
            this.f111323b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            C48442b bVar = this.f111322a.f111312n;
            if (bVar != null) {
                bVar.mo20507a(this.f111323b);
            }
            C48442b bVar2 = this.f111322a.f111312n;
            if (bVar2 != null) {
                bVar2.f30896i = true;
            }
            C48442b bVar3 = this.f111322a.f111312n;
            if (bVar3 != null) {
                AssemSupervisor a = assembler2.mo20573a(this.f111322a);
                if (a != null) {
                    bVar3.mo20587a(a);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            C48442b bVar4 = this.f111322a.f111312n;
            if (bVar4 != null) {
                bVar4.mo20586a((AbstractC1204m) this.f111322a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80114a(Aweme aweme, int i) {
        mo70615a(aweme);
    }

    /* renamed from: a */
    public final void mo80111a(int i, Aweme aweme) {
        String str;
        AbstractC12789k kVar = C12787j.f31108b;
        if (kVar != null) {
            kVar.mo20640a("AssemList", "VideoBaseCell onBind, position: ".concat(String.valueOf(i)));
        }
        if (mo80077K() && C49533w.m92773b()) {
            C58081a aVar = C58081a.f132324a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            aVar.mo60042b(str);
        }
        AbstractC12789k kVar2 = C12787j.f31108b;
        if (kVar2 != null) {
            kVar2.mo20640a("AssemList", "VideoBaseCell onBindHitAssem, position: " + i + ", " + C12787j.f31109c + ", " + C49533w.m92773b());
        }
        VideoItemParams videoItemParams = this.f111307i;
        if (videoItemParams != null) {
            AbstractC12789k kVar3 = C12787j.f31108b;
            if (kVar3 != null) {
                kVar3.mo20640a("AssemList", "VideoBaseCell isAsyncBind");
            }
            C12787j.m23009a().execute(new RunnableC48044c(videoItemParams, this, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r1 != 3) goto L_0x0040;
     */
    @Override // androidx.lifecycle.AbstractC1202k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStateChanged(androidx.lifecycle.AbstractC1204m r4, androidx.lifecycle.AbstractC1196i.EnumC1198a r5) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell.onStateChanged(androidx.lifecycle.m, androidx.lifecycle.i$a):void");
    }
}
