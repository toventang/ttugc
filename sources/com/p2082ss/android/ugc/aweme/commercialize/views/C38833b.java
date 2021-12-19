package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38770z;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49418a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.b */
public final class C38833b implements OnUIPlayListener {

    /* renamed from: h */
    public static final C38835a f91701h = new C38835a((byte) 0);

    /* renamed from: l */
    private static final String f91702l = C38833b.class.getSimpleName();

    /* renamed from: a */
    public final ArrayList<OnUIPlayListener> f91703a = new ArrayList<>();

    /* renamed from: b */
    public final C49418a f91704b = new C49418a();

    /* renamed from: c */
    public final VideoViewComponent f91705c;

    /* renamed from: d */
    public final C38770z f91706d;

    /* renamed from: e */
    public final C81079v f91707e;

    /* renamed from: f */
    public boolean f91708f;

    /* renamed from: g */
    public final C38836b f91709g;

    /* renamed from: i */
    private View f91710i;

    /* renamed from: j */
    private final ViewGroup f91711j;

    /* renamed from: k */
    private final Aweme f91712k;

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.b$a */
    public static final class C38835a {
        static {
            Covode.recordClassIndex(46388);
        }

        private C38835a() {
        }

        public /* synthetic */ C38835a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(46386);
    }

    /* renamed from: b */
    public final void mo67449b() {
        C38770z zVar = this.f91706d;
        if (zVar.f91553f != null) {
            zVar.f91553f.mo123908B();
        }
        this.f91704b.f113577a = 3;
        this.f91707e.mo123916J();
    }

    /* renamed from: a */
    public final void mo67447a() {
        this.f91706d.mo67301c();
        C38770z zVar = this.f91706d;
        if (!(!zVar.mo67300b() || zVar.mo67299a() == null || zVar.f91553f == null)) {
            zVar.f91553f.mo123937a(zVar.f91551d);
            zVar.f91553f.mo123934a(zVar.f91550c.mo129313b());
            zVar.f91553f.mo123926a(zVar.f91552e.mo67208a(zVar.f91548a), zVar.f91551d);
        }
        this.f91704b.f113577a = 4;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.b$b */
    public static final class C38836b implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ C38833b f91713a;

        static {
            Covode.recordClassIndex(46389);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38836b(C38833b bVar) {
            this.f91713a = bVar;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            if (!this.f91713a.f91708f) {
                return;
            }
            if (this.f91713a.f91704b.f113577a == 0) {
                C38833b bVar = this.f91713a;
                C38770z zVar = bVar.f91706d;
                if (!(!zVar.mo67300b() || zVar.mo67299a() == null || zVar.f91553f == null)) {
                    zVar.f91553f.mo123937a(zVar.f91551d);
                    zVar.f91553f.mo123934a(zVar.f91550c.mo129313b());
                    zVar.f91553f.mo123928a(zVar.f91552e.mo67208a(zVar.f91548a), true);
                }
                bVar.f91706d.mo67301c();
                bVar.f91704b.f113577a = 2;
                return;
            }
            this.f91713a.mo67447a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onDecoderBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onPausePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onPlayFailed(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onPreparePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onRenderFirstFrame(oVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onRenderReady(nVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
        Iterator<T> it = this.f91703a.iterator();
        while (it.hasNext()) {
            it.next().onRetryOnError(lVar);
        }
    }

    /* renamed from: a */
    public final void mo67448a(int i) {
        C38770z zVar = this.f91706d;
        if (!(!zVar.mo67300b() || zVar.mo67299a() == null || zVar.f91553f == null)) {
            zVar.f91553f.mo123937a(zVar.f91551d);
            zVar.f91553f.mo123934a(zVar.f91550c.mo129313b());
            zVar.f91553f.mo123921a(zVar.f91552e.mo67208a(zVar.f91548a), i);
        }
        this.f91706d.mo67301c();
        this.f91704b.f113577a = 2;
    }

    public C38833b(ViewGroup viewGroup, Aweme aweme) {
        C89219l.m154721d(viewGroup, "");
        this.f91711j = viewGroup;
        this.f91712k = aweme;
        C38836b bVar = new C38836b(this);
        this.f91709g = bVar;
        C81079v vVar = new C81079v();
        this.f91707e = vVar;
        vVar.f181206c = new AbstractC38263a() {
            /* class com.p2082ss.android.ugc.aweme.commercialize.views.C38833b.C388341 */

            static {
                Covode.recordClassIndex(46387);
            }

            @Override // com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a
            /* renamed from: a */
            public final void mo66030a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a
            /* renamed from: b */
            public final void mo66031b() {
            }
        };
        VideoViewComponent videoViewComponent = new VideoViewComponent();
        this.f91705c = videoViewComponent;
        videoViewComponent.mo129261a(viewGroup);
        C84294j jVar = videoViewComponent.f188405b;
        C89219l.m154716b(jVar, "");
        View a = jVar.mo129311a();
        C89219l.m154716b(a, "");
        this.f91710i = a;
        C38770z zVar = new C38770z(videoViewComponent, this);
        this.f91706d = zVar;
        zVar.f91553f = vVar;
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                zVar.f91549b = aweme;
                zVar.f91548a = aweme.getForwardItem();
            } else {
                zVar.f91549b = null;
                zVar.f91548a = aweme;
            }
        }
        videoViewComponent.mo129266a(bVar);
    }
}
