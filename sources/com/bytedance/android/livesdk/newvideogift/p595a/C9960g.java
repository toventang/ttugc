package com.bytedance.android.livesdk.newvideogift.p595a;

import android.content.Context;
import android.view.Surface;
import com.bytedance.android.live.broadcast.api.C3059e;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTTplayerUseHardcoreSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58529d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.ShortVideoAudioPushManager;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.ttvideoengine.AbstractC86369ba;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4430s.C86633c;

/* renamed from: com.bytedance.android.livesdk.newvideogift.a.g */
public final class C9960g extends C58555a<C9960g> {

    /* renamed from: a */
    private C86313ai f24140a;

    /* renamed from: h */
    private long f24141h;

    /* renamed from: i */
    private AudioDeviceModule.AudioRenderSink f24142i;

    /* renamed from: j */
    private AbstractC86369ba f24143j = new AbstractC86369ba() {
        /* class com.bytedance.android.livesdk.newvideogift.p595a.C9960g.C99611 */

        static {
            Covode.recordClassIndex(11513);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16745a(int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16746a(C86313ai aiVar) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16747a(C86313ai aiVar, int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16748a(C86313ai aiVar, int i, int i2) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: b */
        public final void mo16751b(C86313ai aiVar, int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: c */
        public final void mo16753c(C86313ai aiVar, int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: d */
        public final void mo16755d(C86313ai aiVar, int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: b */
        public final void mo16750b(C86313ai aiVar) {
            if (C9960g.this.f133390e != null) {
                C9960g.this.f133390e.mo16791a();
            }
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: c */
        public final void mo16752c(C86313ai aiVar) {
            if (C9960g.this.f133392g != null) {
                C9960g.this.f133392g.mo16788a();
            }
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: d */
        public final void mo16754d(C86313ai aiVar) {
            if (C9960g.this.f133389d != null) {
                C9960g.this.f133389d.mo16789a();
            }
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16749a(C86633c cVar) {
            if (C9960g.this.f133391f != null) {
                C9960g.this.f133391f.mo16792a(cVar.f195251a, cVar.f195252b, cVar.f195254d);
            }
        }
    };

    static {
        Covode.recordClassIndex(11512);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: b */
    public final void mo16736b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: f */
    public final void mo16740f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: j */
    public final String mo16744j() {
        return "TTEnginePlayerImpl";
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: i */
    public final int mo16743i() {
        return this.f24140a.mo137267s();
    }

    /* renamed from: m */
    private static LiveCore m18349m() {
        AbstractC3055a aVar = (AbstractC3055a) DataChannelGlobal.f42558d.mo28324b(C3059e.class);
        if (aVar == null) {
            return null;
        }
        return aVar.mo8302e();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: h */
    public final C58529d mo16742h() {
        return new C58529d(this.f24140a.mo137269u(), this.f24140a.mo137270v(), this.f24140a.f193376x);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: b */
    public final void mo16735b() {
        C3854a.m9453a(3, "Alpha-TTEngine", "prepareAsync() called with player : [" + this.f24140a + "]");
        this.f133390e.mo16791a();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: c */
    public final void mo16737c() {
        C3854a.m9453a(3, "Alpha-TTEngine", "start() called with player : [" + this.f24140a + "]");
        this.f24140a.mo137251k();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: d */
    public final void mo16738d() {
        C3854a.m9453a(3, "Alpha-TTEngine", "pause() called with player : [" + this.f24140a + "]");
        this.f24140a.mo137255l();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: e */
    public final void mo16739e() {
        C3854a.m9453a(3, "Alpha-TTEngine", "stop() called with player : [" + this.f24140a + "]");
        this.f24140a.mo137258m();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: g */
    public final void mo16741g() {
        C3854a.m9453a(3, "Alpha-TTEngine", "release() called with player : [" + this.f24140a + "]");
        this.f24140a.mo137261n();
    }

    /* renamed from: l */
    private void m18348l() {
        if (m18349m() != null) {
            m18349m().getADM().startPlayer();
            AudioDeviceModule.AudioRenderSink createRenderSink = m18349m().getADM().createRenderSink();
            this.f24142i = createRenderSink;
            createRenderSink.setQuirks(0);
            long audioLongAddress = ShortVideoAudioPushManager.getAudioLongAddress(this.f24142i, m18349m().getBuilder().getAudioSampleHZ(), m18349m().getBuilder().getAudioChannel());
            if (audioLongAddress < 0) {
                audioLongAddress &= 4294967295L;
            }
            this.f24141h = audioLongAddress;
            return;
        }
        this.f24141h = 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16731a() {
        C3854a.m9453a(3, "Alpha-TTEngine", "initMediaPlayer() called");
        m18348l();
        C86313ai aiVar = new C86313ai(this.f133388c, 0);
        this.f24140a = aiVar;
        if (!aiVar.mo137264p()) {
            this.f24140a.mo137230f(4, 1);
            this.f24140a.mo137230f(216, 1);
            this.f24140a.mo137230f(610, 0);
            this.f24140a.mo137173a(this.f24143j);
            if (LiveGiftTTplayerUseHardcoreSetting.INSTANCE.getValue() == 1) {
                this.f24140a.mo137230f(7, 1);
                C3854a.m9453a(3, "PlayerType", "PlayerType HARDCODE");
                return;
            }
            C3854a.m9453a(3, "PlayerType", "PlayerType SOFT DECODE");
            return;
        }
        throw new Exception("create ttVideoEngine failure");
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16734a(boolean z) {
        this.f24140a.mo137242h(z);
    }

    public C9960g(Context context) {
        super(context);
        this.f133388c = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16732a(Surface surface) {
        C3854a.m9453a(3, "Alpha-TTEngine", "setSurface() called with player : [" + this.f24140a + "]");
        this.f24140a.mo137167a(surface);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16733a(String str) {
        C3854a.m9453a(3, "Alpha-TTEngine", "setDataSource() called with player : [" + this.f24140a + "]");
        this.f24140a.mo137231f(str);
        m18348l();
        long j = this.f24141h;
        if (j != 0) {
            this.f24140a.mo137207c(440, j);
            this.f24140a.mo137230f(430, 2);
        }
    }
}
