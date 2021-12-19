package com.p2082ss.android.ugc.aweme.autoplay.player.video;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.C1764a;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C49291c;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49444n;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51053b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59227a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.setting.C68124l;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.p4323c.C84184b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.d */
public class C34250d implements AbstractC34259f {

    /* renamed from: b */
    public static final C34253a f81012b = new C34253a((byte) 0);

    /* renamed from: a */
    public final C34246c f81013a;

    /* renamed from: c */
    private boolean f81014c;

    /* renamed from: d */
    private final AbstractC89244h f81015d;

    static {
        Covode.recordClassIndex(41187);
    }

    /* renamed from: n */
    private final AbstractC34245b m70029n() {
        return (AbstractC34245b) this.f81015d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    /* renamed from: g */
    public final void mo60429g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
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

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.d$a */
    public static final class C34253a {
        static {
            Covode.recordClassIndex(41190);
        }

        private C34253a() {
        }

        public /* synthetic */ C34253a(byte b) {
            this();
        }
    }

    /* renamed from: h */
    private final String m70023h() {
        String str;
        C34246c cVar = this.f81013a;
        if (cVar == null || (str = cVar.f81001r) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: i */
    private final int m70024i() {
        C34246c cVar = this.f81013a;
        if (cVar != null) {
            return cVar.f81005v;
        }
        return -1;
    }

    /* renamed from: j */
    private final String m70025j() {
        String str;
        C34246c cVar = this.f81013a;
        if (cVar == null || (str = cVar.f81004u) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: k */
    private final String m70026k() {
        String str;
        C34246c cVar = this.f81013a;
        if (cVar == null || (str = cVar.f81003t) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: l */
    private final String m70027l() {
        String str;
        C34246c cVar = this.f81013a;
        if (cVar == null || (str = cVar.f81002s) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    private final boolean m70028m() {
        C34246c cVar = this.f81013a;
        if (cVar == null || !cVar.f81006w) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C67568r mo60670a() {
        C34246c cVar = this.f81013a;
        if (cVar != null) {
            return cVar.f81007x;
        }
        return null;
    }

    /* renamed from: e */
    public final Aweme mo60671e() {
        C34246c cVar = this.f81013a;
        if (cVar != null) {
            return cVar.f80987d;
        }
        return null;
    }

    /* renamed from: o */
    private void m70030o() {
        C51053b a;
        C34246c cVar = this.f81013a;
        if (cVar != null) {
            cVar.f80981B = -1;
        }
        C34246c cVar2 = this.f81013a;
        if (cVar2 != null && (a = cVar2.mo60666a()) != null) {
            a.mo86389a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public void mo60424A() {
        C89219l.m154716b(C1764a.m5928a("ISearchVideoView.playVideo", Arrays.copyOf(new Object[0], 0)), "");
        m70029n();
        mo60671e();
        m70029n();
        m70029n();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        C89219l.m154716b(C1764a.m5928a("ISearchVideoView.releaseVideo", Arrays.copyOf(new Object[0], 0)), "");
        m70029n();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.d$b */
    static final class C34254b extends AbstractC89220m implements AbstractC89171a<C34244a> {

        /* renamed from: a */
        public static final C34254b f81018a = new C34254b();

        static {
            Covode.recordClassIndex(41191);
        }

        C34254b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34244a invoke() {
            C34244a aVar = new C34244a();
            C89219l.m154721d(C89041ag.m154428c(C89387v.m154943a("enter_from", "general_search"), C89387v.m154943a("bundle", "player_core")), "");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.d$c */
    static final class CallableC34255c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C34250d f81019a;

        /* renamed from: b */
        final /* synthetic */ boolean f81020b;

        static {
            Covode.recordClassIndex(41192);
        }

        CallableC34255c(C34250d dVar, boolean z) {
            this.f81019a = dVar;
            this.f81020b = z;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            String str2;
            String valueOf;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            C39163s sVar = new C39163s();
            C67568r a = this.f81019a.mo60670a();
            if (a != null) {
                str = a.f151314i;
            } else {
                str = null;
            }
            C39163s a2 = sVar.mo67941a("request_id", str);
            Aweme e = this.f81019a.mo60671e();
            if (e != null) {
                str2 = e.getAid();
            } else {
                str2 = null;
            }
            if (C49301e.m92370c(str2)) {
                valueOf = "-1";
            } else {
                valueOf = String.valueOf(C59227a.f135144a ? 1 : 0);
            }
            C39163s a3 = a2.mo67941a("is_first", valueOf);
            Aweme e2 = this.f81019a.mo60671e();
            if (e2 != null) {
                str3 = e2.getAid();
            } else {
                str3 = null;
            }
            C39163s a4 = a3.mo67941a("group_id", str3);
            String str8 = "1";
            if (this.f81020b) {
                str4 = str8;
            } else {
                str4 = "0";
            }
            C39163s a5 = a4.mo67941a("is_from_feed_cache", str4);
            C67568r a6 = this.f81019a.mo60670a();
            if (a6 != null) {
                str5 = a6.f151312g;
            } else {
                str5 = null;
            }
            C39163s a7 = a5.mo67941a("enter_from", str5);
            Context a8 = C17867d.m33078a();
            if (TextUtils.isEmpty(C58029j.f132250b) || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132250b = C13624l.m24489e(a8);
            }
            C39163s a9 = a7.mo67941a("access", C58029j.f132250b).mo67941a("top_activity", C49907s.m93688b());
            if (C37699a.m76314s(this.f81019a.mo60671e())) {
                str6 = str8;
            } else {
                str6 = "0";
            }
            C39163s a10 = a9.mo67941a("is_ad", str6);
            if (!C37699a.m76204G(this.f81019a.mo60671e())) {
                str8 = "0";
            }
            JSONObject a11 = a10.mo67941a("is_splash", str8).mo67942a();
            try {
                a11.put("preloader_type", C80695q.m139909b());
            } catch (Exception e3) {
                C13468b.m24210a(e3);
            }
            MobClick labelName = MobClick.obtain().setEventName("video_request_search").setLabelName("perf_monitor");
            Aweme e4 = this.f81019a.mo60671e();
            if (e4 != null) {
                str7 = e4.getAid();
            } else {
                str7 = null;
            }
            C39162r.onEvent(labelName.setValue(str7).setJsonObject(a11));
            C39162r.m79461a("video_request_search", a11);
            C59227a.m108848a("video_request_search", a11);
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
        m70030o();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
        m70029n().onPlayStop(str);
    }

    public C34250d(C34246c cVar) {
        this.f81013a = cVar;
        C67568r a = mo60670a();
        if (a != null) {
            a.mo106508a(new AbstractC89172b<Aweme, String>(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.player.video.C34250d.C342511 */

                /* renamed from: a */
                final /* synthetic */ C34250d f81016a;

                static {
                    Covode.recordClassIndex(41188);
                }

                {
                    this.f81016a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* bridge */ /* synthetic */ String invoke(Aweme aweme) {
                    String str;
                    C34246c cVar = this.f81016a.f81013a;
                    if (cVar == null || (str = cVar.f81009z) == null) {
                        return "";
                    }
                    return str;
                }
            }).mo106512b(C342522.f81017a);
        }
        this.f81015d = C89250i.m154773a((AbstractC89171a) C34254b.f81018a);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
        String str2;
        m70029n().onPlayPrepare(str);
        Aweme e = mo60671e();
        if (e != null) {
            str2 = e.getAid();
        } else {
            str2 = null;
        }
        C1731i.m5640b(new CallableC34255c(this, C49301e.m92370c(str2)), C39162r.m79452a());
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(C84215n nVar) {
        int i;
        C89219l.m154721d(nVar, "");
        if (mo60671e() != null) {
            Object[] objArr = new Object[2];
            Aweme e = mo60671e();
            if (e == null) {
                C89219l.m154715b();
            }
            objArr[0] = e.getAid();
            objArr[1] = Long.valueOf(nVar.f188113c);
            C89219l.m154716b(C1764a.m5928a("onRenderReady: preload, sourceId=%s, duration=%d", Arrays.copyOf(objArr, 2)), "");
        }
        String h = m70023h();
        int i2 = m70024i();
        String str = nVar.f188111a;
        Aweme e2 = mo60671e();
        if (e2 != null) {
            i = e2.getAwemeType();
        } else {
            i = 0;
        }
        C49291c.m92330a(h, i2, str, i, mo60671e(), "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 > -1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0187, code lost:
        if (r0 == null) goto L_0x0189;
     */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPausePlay(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 407
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.player.video.C34250d.onPausePlay(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        if (r0 == null) goto L_0x0133;
     */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPlayCompletedFirstTime(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.player.video.C34250d.onPlayCompletedFirstTime(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0234, code lost:
        if (r0 == null) goto L_0x0236;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b9  */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRenderFirstFrame(com.p2082ss.android.ugc.playerkit.model.C84216o r13) {
        /*
        // Method dump skipped, instructions count: 586
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.player.video.C34250d.onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
        m70029n().onBuffering(str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
        m70029n().onDecoderBuffering(str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, C84208l lVar) {
        Video video;
        String str2;
        String str3;
        VideoUrlModel videoUrlModel;
        VideoUrlModel videoUrlModel2;
        String videoUrlModel3;
        m70029n().onPlayFailed(str, lVar);
        if (lVar != null && mo60671e() != null) {
            Aweme e = mo60671e();
            VideoUrlModel videoUrlModel4 = null;
            if (e != null && e.getVideo() != null) {
                Aweme e2 = mo60671e();
                Aweme e3 = mo60671e();
                if (e3 != null) {
                    video = e3.getVideo();
                } else {
                    video = null;
                }
                HashMap hashMap = new HashMap();
                Aweme e4 = mo60671e();
                if (e4 != null) {
                    str2 = e4.getAid();
                } else {
                    str2 = null;
                }
                boolean c = C49301e.m92370c(str2);
                hashMap.put("error_code", String.valueOf(lVar.f188035d));
                hashMap.put("error_internal_code", String.valueOf(lVar.f188036e));
                hashMap.put("error_info", lVar.f188037f.toString());
                Aweme e5 = mo60671e();
                if (e5 != null) {
                    str3 = e5.getAid();
                } else {
                    str3 = null;
                }
                hashMap.put("group_id", str3);
                hashMap.put("video_id", C84184b.f187863b);
                hashMap.put("is_bytevc1", String.valueOf(lVar.f188033b ? 1 : 0));
                hashMap.put("is_dash", String.valueOf(lVar.f188034c ? 1 : 0));
                hashMap.put("is_ad", String.valueOf(C37699a.m76314s(e2) ? 1 : 0));
                hashMap.put("is_splash", String.valueOf(C37699a.m76204G(e2) ? 1 : 0));
                hashMap.put("internet_speed", String.valueOf(C84116g.m144637f()));
                if (video != null) {
                    videoUrlModel = video.getPlayAddr();
                } else {
                    videoUrlModel = null;
                }
                hashMap.put("cache_size", String.valueOf(C80662ac.m139893c(videoUrlModel)));
                if (video != null) {
                    videoUrlModel2 = video.getPlayAddr();
                } else {
                    videoUrlModel2 = null;
                }
                hashMap.put("video_size", String.valueOf(C80662ac.m139896d(videoUrlModel2)));
                if (video != null) {
                    videoUrlModel4 = video.getPlayAddr();
                }
                if (videoUrlModel4 == null) {
                    videoUrlModel3 = "null";
                } else {
                    videoUrlModel3 = video.getPlayAddr().toString();
                    C89219l.m154716b(videoUrlModel3, "");
                }
                hashMap.put("play_url", videoUrlModel3);
                hashMap.put("is_from_feed_cache", String.valueOf(c ? 1 : 0));
                hashMap.put("eco", String.valueOf(C68124l.m120414d()));
                C39162r.m79460a("video_play_failed_search", hashMap);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", String.valueOf(lVar.f188035d));
                    jSONObject.put("error_internal_code", String.valueOf(lVar.f188036e));
                    jSONObject.put("internet_speed", String.valueOf(C84116g.m144637f()));
                    String jSONObject2 = jSONObject.toString();
                    C89219l.m154716b(jSONObject2, "");
                    C49444n.m92595a("error", jSONObject2);
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }
}
