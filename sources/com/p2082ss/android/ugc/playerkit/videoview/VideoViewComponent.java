package com.p2082ss.android.ugc.playerkit.videoview;

import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63035e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62970h;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.playerkit.C84175a;
import com.p2082ss.android.ugc.playerkit.C84180b;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;
import com.p2082ss.android.ugc.playerkit.p4323c.C84184b;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.session.Session;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.C84249a;
import com.p2082ss.android.ugc.playerkit.videoview.p4327b.AbstractC84258c;
import com.p2082ss.android.ugc.playerkit.videoview.p4328c.C84262a;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent */
public class VideoViewComponent implements AbstractC33974au, AbstractC84291g, AbstractC84292h {

    /* renamed from: i */
    private static AbstractC84177b f188403i = new AbstractC84177b() {
        /* class com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent.C842431 */

        static {
            Covode.recordClassIndex(98158);
        }

        @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b
        public final void onEvent(JSONArray jSONArray) {
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        AppLog.recordMiscLog(C17867d.m33078a(), "video_playq", jSONArray.getJSONObject(i));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b
        /* renamed from: a */
        public final void mo124440a(JSONArray jSONArray, String str) {
            if (!(jSONArray == null || TextUtils.isEmpty(str) || !C84199c.f187979a.isEnablePlayerLogV2())) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        C39162r.m79461a(str, jSONArray.getJSONObject(i));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public AbstractC63051l f188404a;

    /* renamed from: b */
    public C84294j f188405b;

    /* renamed from: c */
    public Set<OnUIPlayListener> f188406c;

    /* renamed from: d */
    public Video f188407d;

    /* renamed from: e */
    public Session f188408e;

    /* renamed from: f */
    public volatile boolean f188409f;

    /* renamed from: g */
    public boolean f188410g;

    /* renamed from: h */
    public int f188411h;

    /* renamed from: j */
    private boolean f188412j;

    /* renamed from: k */
    private AbstractC63035e f188413k;

    /* renamed from: l */
    private C84245a f188414l;

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onPageResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPagePause();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPagePause() {
        mo129267b();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onPageResume() {
        mo129259a();
    }

    /* renamed from: a */
    public final void mo129265a(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f188405b = C84294j.m144981a(keepSurfaceTextureView);
        keepSurfaceTextureView.getContext();
        m144861k();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: a */
    public final void mo80280a(OnUIPlayListener onUIPlayListener) {
        AbstractC63051l lVar;
        this.f188406c.remove(onUIPlayListener);
        if (this.f188406c.isEmpty() && (lVar = this.f188404a) != null) {
            lVar.mo100982a((OnUIPlayListener) null);
        }
    }

    /* renamed from: a */
    public final void mo129266a(AbstractC84295k kVar) {
        this.f188405b.mo129312a(kVar);
    }

    /* renamed from: h */
    public final void mo129274h() {
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            lVar.mo101023q();
        }
    }

    /* renamed from: i */
    public final void mo129275i() {
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            lVar.mo101024r();
        }
    }

    static {
        Covode.recordClassIndex(98157);
    }

    /* renamed from: k */
    private void m144861k() {
        this.f188405b.mo129312a(new AbstractC84295k() {
            /* class com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent.C842442 */

            static {
                Covode.recordClassIndex(98159);
            }

            @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
            /* renamed from: b */
            public final void mo60627b(int i, int i2) {
            }

            @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
            public final void aJ_() {
                if (VideoViewComponent.this.f188405b.mo129317e() == 1) {
                    VideoViewComponent.this.f188404a.mo101002b((Surface) null);
                }
            }

            @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
            /* renamed from: a */
            public final void mo60625a(int i, int i2) {
                if (VideoViewComponent.this.f188405b.mo129317e() == 1) {
                    VideoViewComponent.this.f188405b.mo129318f();
                }
                if (VideoViewComponent.this.f188410g) {
                    VideoViewComponent.this.f188410g = false;
                    VideoViewComponent videoViewComponent = VideoViewComponent.this;
                    videoViewComponent.mo129263a(videoViewComponent.f188407d, VideoViewComponent.this.f188411h);
                }
            }
        });
    }

    /* renamed from: e */
    public final long mo129271e() {
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            return lVar.mo101016j();
        }
        return 0;
    }

    /* renamed from: f */
    public final long mo129272f() {
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            return lVar.mo101017k();
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean mo129273g() {
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            return lVar.mo101018l();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: j */
    public final AbstractC63042j.C63049g mo80281j() {
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            return lVar.mo101027u();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$b */
    public static class C84246b implements AbstractC84179d<Boolean> {

        /* renamed from: a */
        private VideoUrlModel f188417a;

        static {
            Covode.recordClassIndex(98161);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
        /* renamed from: a */
        public final /* synthetic */ Boolean mo124484a() {
            if (EnumC84263d.INSTANCE.cacheChecker() == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(EnumC84263d.INSTANCE.cacheChecker().mo124536a(this.f188417a));
        }

        C84246b(VideoUrlModel videoUrlModel) {
            this.f188417a = videoUrlModel;
        }
    }

    public VideoViewComponent() {
        this.f188406c = Collections.newSetFromMap(new WeakHashMap());
        this.f188411h = 0;
        this.f188413k = C84296l.f188496a;
        this.f188414l = new C84245a(this, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$c */
    public static class C84247c implements AbstractC84179d<C84223u> {

        /* renamed from: a */
        private VideoUrlModel f188418a;

        /* renamed from: b */
        private Session f188419b;

        /* renamed from: c */
        private boolean f188420c;

        static {
            Covode.recordClassIndex(98162);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
        /* renamed from: a */
        public final /* synthetic */ C84223u mo124484a() {
            C84262a aVar = C84262a.f188441a;
            String urlKey = this.f188418a.getUrlKey();
            if (aVar.f188442b == null) {
                aVar.f188442b = AbstractC74616d.m131036a().mo117296h().mo117332a();
            }
            AbstractC84258c cVar = aVar.f188442b;
            aVar.mo129284c(urlKey);
            return cVar.mo117427a().mo124206a(C84288e.m144956a(this.f188418a), this.f188419b.playerType, this.f188420c);
        }

        C84247c(VideoUrlModel videoUrlModel, Session session, boolean z) {
            this.f188418a = videoUrlModel;
            this.f188419b = session;
            this.f188420c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$d */
    public static class C84248d implements AbstractC84179d<Integer> {

        /* renamed from: a */
        private VideoUrlModel f188421a;

        static {
            Covode.recordClassIndex(98163);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
        /* renamed from: a */
        public final /* synthetic */ Integer mo124484a() {
            Integer valueOf;
            C84241i a = C84288e.m144956a(this.f188421a);
            int i = -1;
            if (a != null) {
                AbstractC81964c hitBitrate = a.getHitBitrate();
                if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
                    valueOf = -1;
                }
                i = valueOf.intValue();
            }
            return Integer.valueOf(i);
        }

        C84248d(VideoUrlModel videoUrlModel) {
            this.f188421a = videoUrlModel;
        }
    }

    /* renamed from: l */
    private void m144862l() {
        if (C62960a.f142907a) {
            C62960a.m113385a("VideoViewComponent", "render() called " + this.f188404a);
        }
        if (this.f188404a != null) {
            C84249a.C84250a.f188424a.mo129278a(this);
            this.f188409f = false;
            this.f188404a.mo101006c();
        }
    }

    /* renamed from: b */
    public final void mo129267b() {
        if (C62960a.f142907a) {
            C62960a.m113385a("VideoViewComponent", "pause() called " + this.f188404a);
        }
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            lVar.mo101012f();
        }
        C84294j jVar = this.f188405b;
        if (jVar != null) {
            jVar.mo129319g();
            AbstractC63051l lVar2 = this.f188404a;
            if (lVar2 != null) {
                lVar2.mo101026t();
            }
        }
    }

    /* renamed from: d */
    public final void mo129270d() {
        if (C62960a.f142907a) {
            C62960a.m113385a("VideoViewComponent", "release() called " + this.f188404a);
        }
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            lVar.mo101013g();
        }
        C84294j jVar = this.f188405b;
        if (jVar != null) {
            jVar.mo129320h();
        }
    }

    /* renamed from: c */
    public final void mo129269c() {
        if (C62960a.f142907a) {
            C62960a.m113385a("VideoViewComponent", "stop() called " + this.f188404a);
        }
        if (this.f188404a != null) {
            if (C84255b.f188437a && C84180b.m144762a(this.f188404a.mo101026t()) && C84199c.f187979a.isEnableBytevc1BlackList()) {
                C84255b.f188437a = this.f188404a.mo101015i();
            }
            this.f188404a.mo101011e();
        }
        C84294j jVar = this.f188405b;
        if (jVar != null) {
            jVar.mo129320h();
        }
    }

    /* renamed from: a */
    public final void mo129259a() {
        if (C62960a.f142907a) {
            C62960a.m113385a("VideoViewComponent", "resume() called " + this.f188404a);
        }
        Session session = this.f188408e;
        if (session != null && session.urlModel != null) {
            this.f188404a.mo100995a(this.f188408e.urlModel.getSourceId());
        }
    }

    /* renamed from: c */
    private static AbstractC84179d<Integer> m144859c(VideoUrlModel videoUrlModel) {
        return new C84248d(videoUrlModel);
    }

    /* renamed from: d */
    private static AbstractC84179d<Boolean> m144860d(VideoUrlModel videoUrlModel) {
        return new C84246b(videoUrlModel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$a */
    public static class C84245a implements OnUIPlayListener {

        /* renamed from: a */
        private final WeakReference<VideoViewComponent> f188416a;

        static {
            Covode.recordClassIndex(98160);
        }

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
        public final void onDecoderBuffering(boolean z) {
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

        private C84245a(VideoViewComponent videoViewComponent) {
            this.f188416a = new WeakReference<>(videoViewComponent);
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBuffering(boolean z) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (!(videoViewComponent == null || videoViewComponent.f188406c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                    onUIPlayListener.onBuffering(z);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPausePlay(String str) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (!(videoViewComponent == null || videoViewComponent.f188406c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                    onUIPlayListener.onPausePlay(str);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (!(videoViewComponent == null || videoViewComponent.f188406c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                    onUIPlayListener.onPlayCompleted(str);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompletedFirstTime(String str) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (!(videoViewComponent == null || videoViewComponent.f188406c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                    onUIPlayListener.onPlayCompletedFirstTime(str);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(float f) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (!(videoViewComponent == null || videoViewComponent.f188406c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                    onUIPlayListener.onPlayProgressChange(f);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreparePlay(String str) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (!(videoViewComponent == null || videoViewComponent.f188406c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                    onUIPlayListener.onPreparePlay(str);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(C84216o oVar) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (videoViewComponent != null) {
                videoViewComponent.f188409f = false;
                videoViewComponent.f188410g = false;
                C84249a.C84250a.f188424a.mo129278a(videoViewComponent);
                if (!videoViewComponent.f188406c.isEmpty()) {
                    for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                        onUIPlayListener.onRenderFirstFrame(oVar);
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderReady(C84215n nVar) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (!(videoViewComponent == null || videoViewComponent.f188406c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                    onUIPlayListener.onRenderReady(nVar);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onResumePlay(String str) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (!(videoViewComponent == null || videoViewComponent.f188406c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                    onUIPlayListener.onResumePlay(str);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRetryOnError(C84208l lVar) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (videoViewComponent != null) {
                videoViewComponent.f188409f = false;
                if (!videoViewComponent.f188406c.isEmpty()) {
                    for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                        onUIPlayListener.onRetryOnError(lVar);
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(C84208l lVar) {
            VideoViewComponent videoViewComponent = this.f188416a.get();
            if (videoViewComponent != null) {
                videoViewComponent.f188409f = false;
                if (!videoViewComponent.f188406c.isEmpty()) {
                    for (OnUIPlayListener onUIPlayListener : videoViewComponent.f188406c) {
                        onUIPlayListener.onPlayFailed(lVar);
                    }
                }
                if (lVar.f188033b && videoViewComponent.f188407d != null) {
                    videoViewComponent.mo129264a(videoViewComponent.f188407d.getPlayAddrH264(), true, videoViewComponent.f188411h, videoViewComponent.f188407d.isNeedSetCookie());
                }
            }
        }

        /* synthetic */ C84245a(VideoViewComponent videoViewComponent, byte b) {
            this(videoViewComponent);
        }
    }

    /* renamed from: a */
    public final void mo129260a(float f) {
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            lVar.mo100976a(f);
        }
    }

    /* renamed from: b */
    public final void mo129268b(OnUIPlayListener onUIPlayListener) {
        this.f188406c.add(onUIPlayListener);
        AbstractC63051l lVar = this.f188404a;
        if (lVar != null) {
            lVar.mo100982a(this.f188414l);
        }
    }

    /* renamed from: a */
    public final void mo129261a(ViewGroup viewGroup) {
        this.f188405b = C84294j.m144980a(viewGroup);
        viewGroup.getContext();
        m144861k();
    }

    public VideoViewComponent(byte b) {
        this.f188406c = Collections.newSetFromMap(new WeakHashMap());
        this.f188411h = 0;
        this.f188413k = C84297m.f188497a;
        this.f188414l = new C84245a(this, (byte) 0);
        this.f188412j = true;
    }

    /* renamed from: a */
    private static boolean m144857a(VideoUrlModel videoUrlModel) {
        List<String> urlList;
        boolean z = false;
        if (!(videoUrlModel == null || (urlList = videoUrlModel.getUrlList()) == null || urlList.size() <= 0)) {
            z = true;
            for (String str : urlList) {
                if (!m144856a(C17867d.m33078a(), str)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m144858b(VideoUrlModel videoUrlModel) {
        Session session;
        if (videoUrlModel != null && (session = this.f188408e) != null && session.urlModel != null && C13627m.m24499a(videoUrlModel.getUri(), this.f188408e.urlModel.getUri()) && C13627m.m24499a(videoUrlModel.getRatio(), this.f188408e.urlModel.getRatio()) && !TextUtils.isEmpty(videoUrlModel.getSourceId()) && this.f188404a.mo100998a(videoUrlModel.getSourceId(), videoUrlModel.getBitRatedRatioUri())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo129262a(Video video) {
        if (C62960a.f142907a) {
            C62960a.m113385a("VideoViewComponent", "tryResume() called " + this.f188404a);
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrBytevc1 != null || playAddrH264 != null) {
            if (m144858b(playAddrBytevc1) || m144858b(playAddrH264)) {
                mo129259a();
            } else {
                mo129263a(video, this.f188411h);
            }
        }
    }

    /* renamed from: a */
    private static boolean m144856a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("https://")) {
            try {
                if (C22898a.m43150a(context).mo23739d(URI.create(str).getHost()) != null) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo129263a(Video video, int i) {
        if (video != null) {
            this.f188407d = video;
            if (!this.f188405b.mo129315c()) {
                this.f188410g = true;
            } else if (this.f188409f) {
                m144862l();
            } else if (C84255b.m144892a(video, C84199c.f187979a.getPlayerType())) {
                mo129264a(video.getPlayAddrBytevc1(), false, i, video.isNeedSetCookie());
            } else {
                mo129264a(video.getPlayAddrH264(), false, i, video.isNeedSetCookie());
            }
        }
    }

    /* renamed from: a */
    private static AbstractC84179d<C84223u> m144855a(VideoUrlModel videoUrlModel, Session session, boolean z) {
        return new C84247c(videoUrlModel, session, z);
    }

    /* renamed from: a */
    public final void mo129264a(VideoUrlModel videoUrlModel, boolean z, int i, boolean z2) {
        if (C62960a.f142907a) {
            C62960a.m113385a("VideoViewComponent", "play() called " + this.f188404a);
        }
        if (videoUrlModel != null && C84180b.m144763a(C84288e.m144956a(videoUrlModel))) {
            String uri = videoUrlModel.getUri();
            if (TextUtils.isEmpty(uri)) {
                C13468b.m24210a(new RuntimeException("VideoUrlModel url_key is null. vid=" + videoUrlModel.getSourceId()));
            }
            this.f188408e = C84229a.f188297a.mo129054d(uri);
            this.f188411h = i;
            if (this.f188412j) {
                this.f188404a = new C62970h(new C62976i(C84199c.f187979a.getPlayerType()));
            } else {
                this.f188404a = C84262a.f188441a.mo129283b(uri);
            }
            this.f188408e.uri = uri;
            this.f188408e.urlModel = C84288e.m144956a(videoUrlModel);
            this.f188408e.playerType = this.f188404a.mo101026t();
            this.f188404a.mo100982a(this.f188414l);
            this.f188404a.mo100991a(f188403i);
            this.f188404a.mo100985a(this.f188413k);
            this.f188404a.mo100987a(EnumC84263d.INSTANCE.playInfoCallback());
            C84175a.f187857a.mo128994a(this.f188408e.uri, "player_try_play");
            C84184b.m144764a(uri);
            C84217p pVar = new C84217p(m144855a(videoUrlModel, this.f188408e, z), m144860d(videoUrlModel), C84199c.f187979a.context(), videoUrlModel.getSourceId(), true, C84199c.f187979a.prepareConfig(), false, videoUrlModel.isBytevc1(), 0, m144859c(videoUrlModel), uri, true, C84199c.f187979a.isAsyncInit(), this.f188411h, null);
            pVar.f188208v = C84199c.f187979a.getPlayerFramesWait();
            pVar.f188211y = videoUrlModel.getBitRatedRatioUri();
            C84229a.f188297a.mo129049a(pVar.f188211y, videoUrlModel.getFileCheckSum());
            pVar.f188136H = C84199c.f187979a.isUseVideoTextureRenderer();
            if (z2 && m144857a(videoUrlModel)) {
                pVar.f188137I = true;
            }
            this.f188404a.mo100980a(this.f188405b.mo129313b());
            this.f188404a.mo100993a(pVar);
            C84294j jVar = this.f188405b;
            if (jVar != null) {
                jVar.mo129320h();
            }
        }
    }
}
