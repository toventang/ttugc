package com.p2082ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c */
public final class C37889c implements AbstractC37872ay, OnUIPlayListener {

    /* renamed from: e */
    public static WeakReference<AbstractC37872ay> f89389e;

    /* renamed from: f */
    public static final C37890a f89390f = new C37890a((byte) 0);

    /* renamed from: a */
    public Aweme f89391a;

    /* renamed from: b */
    public final List<Video> f89392b = new ArrayList();

    /* renamed from: c */
    public int f89393c;

    /* renamed from: d */
    public int f89394d;

    /* renamed from: g */
    private boolean f89395g;

    /* renamed from: h */
    private final OnUIPlayListener f89396h;

    /* renamed from: i */
    private final AbstractC37891b f89397i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c$b */
    public interface AbstractC37891b {
        static {
            Covode.recordClassIndex(45343);
        }

        /* renamed from: a */
        long mo65997a();

        /* renamed from: a */
        void mo65998a(int i);

        /* renamed from: a */
        void mo65999a(Video video);

        /* renamed from: a */
        void mo66000a(VideoUrlModel videoUrlModel);

        /* renamed from: b */
        long mo66001b();
    }

    static {
        Covode.recordClassIndex(45341);
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
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
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

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c$a */
    public static final class C37890a {
        static {
            Covode.recordClassIndex(45342);
        }

        private C37890a() {
        }

        /* renamed from: a */
        public static AbstractC37872ay m76706a() {
            WeakReference<AbstractC37872ay> weakReference = C37889c.f89389e;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public /* synthetic */ C37890a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m76707a(AbstractC37872ay ayVar) {
            if (ayVar == null) {
                C37889c.f89389e = null;
            } else {
                C37889c.f89389e = new WeakReference<>(ayVar);
            }
        }
    }

    /* renamed from: e */
    private final boolean m76701e() {
        if (this.f89393c == 0 && this.f89394d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Video mo65995a() {
        List<Video> list = this.f89392b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f89392b.get(this.f89393c);
    }

    /* renamed from: b */
    public final String mo65996b() {
        String str;
        Aweme aweme = this.f89391a;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        if (this.f89393c == 0) {
            return str;
        }
        return str + this.f89393c;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37872ay
    /* renamed from: c */
    public final long mo65912c() {
        boolean z;
        List<Video> list = this.f89392b;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        Iterator<T> it = this.f89392b.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) it.next().getDuration();
        }
        if (j > 0) {
            return j;
        }
        long b = this.f89397i.mo66001b();
        if (b > 0) {
            return b;
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37872ay
    /* renamed from: d */
    public final long mo65913d() {
        boolean z;
        List<Video> list = this.f89392b;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        Iterator it = C89271h.m154766a(0, this.f89393c).iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) this.f89392b.get(((AbstractC89040af) it).mo143429a()).getDuration();
        }
        long a = j + this.f89397i.mo65997a();
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        this.f89396h.onBuffering(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        this.f89396h.onDecoderBuffering(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
        this.f89396h.onPlayFailed(lVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        this.f89396h.onPlayProgressChange(f);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
        this.f89396h.onRetryOnError(lVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        if (m76701e()) {
            this.f89396h.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        this.f89397i.mo65998a(1);
        this.f89396h.onResumePlay(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        this.f89397i.mo65998a(2);
        if (this.f89395g) {
            this.f89395g = false;
        } else {
            this.f89396h.onPausePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        this.f89397i.mo65998a(0);
        if (m76701e()) {
            this.f89396h.onPreparePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        List<Video> list = this.f89392b;
        if (list != null && !list.isEmpty()) {
            this.f89393c = (this.f89393c + 1) % this.f89392b.size();
            Video a = mo65995a();
            if (a != null) {
                this.f89395g = true;
                this.f89397i.mo65999a(a);
            }
            if (this.f89393c == 0) {
                if (this.f89394d == 0) {
                    this.f89396h.onPlayCompletedFirstTime(str);
                }
                this.f89396h.onPlayCompleted(str);
                this.f89394d++;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        List<Video> list;
        VideoUrlModel playAddr;
        this.f89395g = false;
        this.f89397i.mo65998a(1);
        if (m76701e()) {
            this.f89396h.onRenderReady(nVar);
        }
        if (this.f89394d == 0 && (list = this.f89392b) != null && !list.isEmpty() && this.f89393c + 1 < this.f89392b.size() && (playAddr = this.f89392b.get(this.f89393c + 1).getPlayAddr()) != null) {
            playAddr.getUri();
            this.f89397i.mo66000a(playAddr);
        }
    }

    public C37889c(OnUIPlayListener onUIPlayListener, AbstractC37891b bVar) {
        C89219l.m154721d(onUIPlayListener, "");
        C89219l.m154721d(bVar, "");
        this.f89396h = onUIPlayListener;
        this.f89397i = bVar;
    }
}
