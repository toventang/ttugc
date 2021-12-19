package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42912b;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge */
public final class PlayMusicBridge extends BaseBridgeMethod implements AbstractC33974au, AbstractC34259f {

    /* renamed from: b */
    public static final C42933a f100112b = new C42933a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f100113c;

    /* renamed from: d */
    private final AbstractC89244h f100114d;

    /* renamed from: e */
    private final AbstractC89244h f100115e = C89250i.m154773a((AbstractC89171a) new C42940f(this));

    /* renamed from: f */
    private final String f100116f = "playMusic";

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$b */
    public final class C42934b implements AbstractC1214u<C89378p<? extends Integer, ? extends Long>> {

        /* renamed from: a */
        public final JSONObject f100117a;

        /* renamed from: b */
        final /* synthetic */ PlayMusicBridge f100118b;

        /* renamed from: c */
        private final Music f100119c;

        static {
            Covode.recordClassIndex(51055);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$b$a */
        public static final class C42935a implements AbstractC16191p {

            /* renamed from: a */
            final /* synthetic */ C42934b f100120a;

            /* renamed from: b */
            private final String f100121b = "playMusicStart";

            /* renamed from: c */
            private final Object f100122c;

            static {
                Covode.recordClassIndex(51056);
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: a */
            public final String mo25699a() {
                return this.f100121b;
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: b */
            public final Object mo25700b() {
                return this.f100122c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C42935a(C42934b bVar) {
                this.f100120a = bVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("music_extra", bVar.f100117a);
                this.f100122c = jSONObject;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$b$b */
        public static final class C42936b implements AbstractC16191p {

            /* renamed from: a */
            final /* synthetic */ C42934b f100123a;

            /* renamed from: b */
            private final String f100124b = "playMusicEnd";

            /* renamed from: c */
            private final Object f100125c;

            static {
                Covode.recordClassIndex(51057);
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: a */
            public final String mo25699a() {
                return this.f100124b;
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: b */
            public final Object mo25700b() {
                return this.f100125c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C42936b(C42934b bVar) {
                this.f100123a = bVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("music_extra", bVar.f100117a);
                this.f100125c = jSONObject;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C89378p<? extends Integer, ? extends Long> pVar) {
            AbstractC16208i b;
            AbstractC16249c<AbstractC16208i> m;
            AbstractC16208i b2;
            C89378p<? extends Integer, ? extends Long> pVar2 = pVar;
            if (pVar2 == null) {
                return;
            }
            if (((Number) pVar2.getSecond()).longValue() != this.f100119c.getId()) {
                AbstractC16249c<AbstractC16208i> m2 = this.f100118b.mo73140m();
                if (!(m2 == null || (b = m2.mo25823b()) == null)) {
                    b.onEvent(new C42936b(this));
                }
                MusicPlayHelper n = this.f100118b.mo73141n();
                if (n != null) {
                    n.mo71129a(this);
                }
            } else if (((Number) pVar2.getFirst()).intValue() == 2 && (m = this.f100118b.mo73140m()) != null && (b2 = m.mo25823b()) != null) {
                b2.onEvent(new C42935a(this));
            }
        }

        public C42934b(PlayMusicBridge playMusicBridge, Music music, JSONObject jSONObject) {
            C89219l.m154721d(music, "");
            C89219l.m154721d(jSONObject, "");
            this.f100118b = playMusicBridge;
            this.f100119c = music;
            this.f100117a = jSONObject;
        }
    }

    static {
        Covode.recordClassIndex(51053);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
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

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    /* renamed from: g */
    public final void mo60429g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    /* renamed from: l */
    public final AbstractC16249c<Context> mo73139l() {
        return (AbstractC16249c) this.f100113c.getValue();
    }

    /* renamed from: m */
    public final AbstractC16249c<AbstractC16208i> mo73140m() {
        return (AbstractC16249c) this.f100114d.getValue();
    }

    /* renamed from: n */
    public final MusicPlayHelper mo73141n() {
        return (MusicPlayHelper) this.f100115e.getValue();
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

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPausePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayFailed(C84208l lVar) {
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

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayProgressChange(float f) {
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

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPreparePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onRenderFirstFrame(C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onResumePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onRetryOnError(C84208l lVar) {
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

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$a */
    public static final class C42933a {
        static {
            Covode.recordClassIndex(51054);
        }

        private C42933a() {
        }

        public /* synthetic */ C42933a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$c */
    public static final class C42937c extends C27895a<Music> {
        static {
            Covode.recordClassIndex(51058);
        }

        C42937c() {
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100116f;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$d */
    static final class C42938d extends AbstractC89220m implements AbstractC89171a<AbstractC16249c<? extends Context>> {

        /* renamed from: a */
        final /* synthetic */ C16248b f100126a;

        static {
            Covode.recordClassIndex(51059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42938d(C16248b bVar) {
            super(0);
            this.f100126a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16249c<? extends Context> invoke() {
            return this.f100126a.mo25830b(Context.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$e */
    static final class C42939e extends AbstractC89220m implements AbstractC89171a<AbstractC16249c<? extends AbstractC16208i>> {

        /* renamed from: a */
        final /* synthetic */ C16248b f100127a;

        static {
            Covode.recordClassIndex(51060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42939e(C16248b bVar) {
            super(0);
            this.f100127a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16249c<? extends AbstractC16208i> invoke() {
            return this.f100127a.mo25830b(AbstractC16208i.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        MusicPlayHelper n = mo73141n();
        if (n != null) {
            n.mo71126a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$f */
    static final class C42940f extends AbstractC89220m implements AbstractC89171a<MusicPlayHelper> {

        /* renamed from: a */
        final /* synthetic */ PlayMusicBridge f100128a;

        static {
            Covode.recordClassIndex(51061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42940f(PlayMusicBridge playMusicBridge) {
            super(0);
            this.f100128a = playMusicBridge;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MusicPlayHelper invoke() {
            Context context;
            AbstractC16249c<Context> l = this.f100128a.mo73139l();
            if (l != null) {
                context = l.mo25823b();
            } else {
                context = null;
            }
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (eVar != null) {
                return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(MusicPlayHelper.class);
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayMusicBridge(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f100113c = C89250i.m154773a((AbstractC89171a) new C42938d(bVar));
        this.f100114d = C89250i.m154773a((AbstractC89171a) new C42939e(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Context context;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            String optString = jSONObject.optString("music");
            JSONObject optJSONObject = jSONObject.optJSONObject("music_extra");
            if (!(optString == null || optJSONObject == null)) {
                Type type = new C42937c().type;
                GsonProvider c = GsonHolder.m138943c();
                C89219l.m154716b(c, "");
                Object a = c.mo123620b().mo46671a(optString, type);
                C89219l.m154716b(a, "");
                Music music = (Music) a;
                music.setId(optJSONObject.optLong("id"));
                MusicPlayHelper n = mo73141n();
                if (n != null) {
                    if (n.mo71130a(music.getId()) || n.mo71131b(music.getId())) {
                        C34181a.m69859b(this);
                        n.mo71126a();
                    } else {
                        AbstractC16249c<Context> l = mo73139l();
                        ActivityC0945e eVar = null;
                        if (l != null) {
                            context = l.mo25823b();
                        } else {
                            context = null;
                        }
                        if (context instanceof ActivityC0945e) {
                            eVar = context;
                        }
                        ActivityC0945e eVar2 = eVar;
                        if (eVar2 != null) {
                            C34181a.m69857a(this);
                            C34181a.m69860c(this);
                            C34181a.m69861d(this);
                            n.mo71128a(eVar2, new C42934b(this, music, optJSONObject));
                            n.mo71127a(eVar2, music, "", 0, true, true, "");
                        }
                    }
                }
            }
            aVar.mo61872a(new JSONArray());
        } catch (Exception e) {
            C42912b.m85668a(e, "ShowEasterEggMethod");
            aVar.mo61871a(0, e.getMessage());
            e.printStackTrace();
        }
    }
}
