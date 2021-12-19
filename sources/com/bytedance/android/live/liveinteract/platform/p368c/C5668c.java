package com.bytedance.android.live.liveinteract.platform.p368c;

import android.view.SurfaceView;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p260a.AbstractC4383a;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4432f;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4616a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5600m;
import com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a;
import com.bytedance.android.live.liveinteract.platform.common.p370b.C5676b;
import com.bytedance.android.live.liveinteract.platform.p367b.AbstractC5663a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.bytertc.engine.livertc.LiveRTCEngine;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC4432f(mo10206a = "RTC_CONTROLLER")
/* renamed from: com.bytedance.android.live.liveinteract.platform.c.c */
public final class C5668c implements AbstractC5675a {

    /* renamed from: a */
    public LiveCore.InteractConfig f14394a;

    /* renamed from: b */
    public boolean f14395b;

    /* renamed from: c */
    public boolean f14396c;

    /* renamed from: d */
    public boolean f14397d;

    /* renamed from: e */
    public boolean f14398e;

    /* renamed from: f */
    public boolean f14399f;

    /* renamed from: g */
    public Client f14400g;

    /* renamed from: h */
    public final C5676b f14401h = new C5676b();
    @AbstractC4430d(mo10204a = "LINK_LOGGER")

    /* renamed from: i */
    public AbstractC5663a f14402i;

    /* renamed from: j */
    private boolean f14403j;

    /* renamed from: k */
    private AbstractC5666b f14404k;

    /* renamed from: l */
    private final AbstractC89244h f14405l = C89250i.m154773a((AbstractC89171a) new C5669a(this));

    static {
        Covode.recordClassIndex(6265);
    }

    /* renamed from: a */
    public final AbstractC4383a mo11445a() {
        return (AbstractC4383a) this.f14405l.getValue();
    }

    /* renamed from: a */
    public final void mo11450a(PrivacyCert privacyCert, String str) {
        C89219l.m154721d(str, "");
        if (!this.f14395b) {
            this.f14395b = true;
            if (this.f14400g != null) {
                AbstractC5663a aVar = this.f14402i;
                if (aVar == null) {
                    C89219l.m154710a("mLinkLogger");
                }
                aVar.mo11443a().mo10321e(str);
                AbstractC5666b bVar = this.f14404k;
                if (bVar != null) {
                    bVar.mo10321e(str);
                }
                if (privacyCert == null) {
                    Client client = this.f14400g;
                    if (client != null) {
                        client.stop();
                    }
                } else {
                    Client client2 = this.f14400g;
                    if (client2 != null) {
                        client2.stop(privacyCert);
                    }
                }
                Client client3 = this.f14400g;
                if (client3 != null) {
                    client3.dispose();
                }
                this.f14400g = null;
                return;
            }
            mo10322f();
        }
    }

    /* renamed from: a */
    public final void mo11451a(boolean z) {
        if (this.f14402i == null) {
            C89219l.m154710a("mLinkLogger");
        }
        Client client = this.f14400g;
        if (client != null) {
            client.enableAllRemoteRender(z, false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10299a(String str) {
        C89219l.m154721d(str, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10299a(str);
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10299a(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10301a(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10301a(str, surfaceView);
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10301a(str, surfaceView);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10300a(String str, long j) {
        C89219l.m154721d(str, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10300a(str, j);
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10300a(str, j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo11149a(String str, Boolean bool) {
        C89219l.m154721d(str, "");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            AbstractC5666b bVar = this.f14404k;
            if (bVar != null) {
                bVar.mo10303a(str, booleanValue);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10302a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10302a(str, str2);
        }
    }

    /* renamed from: d */
    public final void mo11456d() {
        Client client = this.f14400g;
        if (client != null) {
            client.invalidateSei();
        }
    }

    /* renamed from: g */
    public final void mo11458g() {
        Client client = this.f14400g;
        if (client != null) {
            client.pause();
        }
        Client client2 = this.f14400g;
        if (client2 != null) {
            client2.muteAllRemoteAudioStreams(true);
        }
    }

    public C5668c() {
        C4431e.f12034a.mo10201a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: e */
    public final void mo10320e() {
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10320e();
        this.f14403j = false;
        this.f14397d = true;
        this.f14396c = true;
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10320e();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.c.c$a */
    static final class C5669a extends AbstractC89220m implements AbstractC89171a<AbstractC4383a> {

        /* renamed from: a */
        final /* synthetic */ C5668c f14406a;

        static {
            Covode.recordClassIndex(6266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5669a(C5668c cVar) {
            super(0);
            this.f14406a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC4383a invoke() {
            AbstractC5663a aVar = this.f14406a.f14402i;
            if (aVar == null) {
                C89219l.m154710a("mLinkLogger");
            }
            if (aVar instanceof C4616a) {
                Object a = C4431e.f12034a.mo10199a("LINK_CROSS_DATA_HOLDER");
                if (!(a instanceof AbstractC4383a)) {
                    return null;
                }
                return a;
            }
            Object a2 = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
            if (!(a2 instanceof AbstractC4383a)) {
                return null;
            }
            return a2;
        }
    }

    /* renamed from: c */
    public final void mo11454c() {
        if (this.f14402i == null) {
            C89219l.m154710a("mLinkLogger");
        }
        this.f14401h.mo11460a();
        this.f14404k = null;
        Client client = this.f14400g;
        if (client != null) {
            client.setListener(null);
        }
        Client client2 = this.f14400g;
        if (client2 != null) {
            client2.stop();
        }
        Client client3 = this.f14400g;
        if (client3 != null) {
            client3.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: f */
    public final void mo10322f() {
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10322f();
        this.f14395b = false;
        this.f14397d = false;
        this.f14398e = false;
        this.f14396c = false;
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10322f();
        }
    }

    /* renamed from: b */
    public final boolean mo11453b() {
        if (this.f14400g == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo11457e(String str) {
        Client client = this.f14400g;
        if (client != null) {
            client.updateRtcExtInfo(str);
        }
    }

    /* renamed from: b */
    public final void mo11452b(boolean z) {
        Client client = this.f14400g;
        if (client != null) {
            client.resume();
        }
        Client client2 = this.f14400g;
        if (client2 != null) {
            client2.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10309b(String str) {
        C89219l.m154721d(str, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10309b(str);
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10309b(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: c */
    public final void mo10317c(String str) {
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10317c(str);
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10317c(str);
        }
    }

    /* renamed from: d */
    public final long mo11455d(String str) {
        LiveRTCEngine rtcEngine;
        C89219l.m154721d(str, "");
        Client client = this.f14400g;
        if (client == null || (rtcEngine = client.getRtcEngine()) == null) {
            return 0;
        }
        return rtcEngine.sendRoomMessage(str);
    }

    /* renamed from: a */
    public final void mo11446a(C5600m mVar) {
        C89219l.m154721d(mVar, "");
        if (this.f14397d) {
            String b = C4139e.C4140a.f11575b.mo46674b(mVar);
            C89219l.m154716b(b, "");
            mo11455d(b);
            AbstractC5666b bVar = this.f14404k;
            if (bVar != null) {
                bVar.mo10294a(mVar, b);
            }
        }
    }

    /* renamed from: a */
    public final void mo11447a(AbstractC5666b bVar) {
        C89219l.m154721d(bVar, "");
        if (this.f14402i == null) {
            C89219l.m154710a("mLinkLogger");
        }
        this.f14401h.mo11461a(this);
        this.f14404k = bVar;
    }

    /* renamed from: a */
    public final void mo11449a(PrivacyCert privacyCert) {
        Client client = this.f14400g;
        if (client != null && !this.f14398e) {
            AbstractC5663a aVar = this.f14402i;
            if (aVar == null) {
                C89219l.m154710a("mLinkLogger");
            }
            aVar.mo11443a().mo10323g();
            AbstractC5666b bVar = this.f14404k;
            if (bVar != null) {
                bVar.mo10323g();
            }
            client.startPushData();
            if (privacyCert != null) {
                client.startInteract(privacyCert);
            } else {
                client.startInteract();
            }
            this.f14398e = true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10291a(long j, int i) {
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10291a(j, i);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10307b(long j, int i) {
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10307b(j, i);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10290a(int i, String str) {
        C89219l.m154721d(str, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10290a(i, str);
        this.f14403j = false;
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10290a(i, str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10306b(int i, String str) {
        C89219l.m154721d(str, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10306b(i, str);
        this.f14395b = false;
        if (this.f14399f) {
            this.f14397d = false;
            return;
        }
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10306b(i, str);
        }
    }

    /* renamed from: b */
    public static Client m12376b(AbstractC7601b bVar, AbstractC5665a aVar) {
        LiveCore.InteractConfig interactConfig = new LiveCore.InteractConfig();
        interactConfig.setContext(C3966y.m9669e());
        interactConfig.setLogReportInterval(5);
        AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a, "");
        interactConfig.setProjectKey(((AbstractC4357d) a).getProjectKey());
        AbstractC2953a a2 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a2, "");
        interactConfig.setAppChannel(((IHostContext) a2).getChannel());
        interactConfig.setAppId(String.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).appId()));
        AbstractC2953a a3 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a3, "");
        interactConfig.setAppVersion(((IHostContext) a3).getVersionCode());
        aVar.mo10326a(interactConfig);
        return bVar.mo9069a(interactConfig);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10292a(long j, long j2) {
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10292a(j, j2);
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10292a(j, j2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: c */
    public final void mo10315c(int i, String str) {
        C89219l.m154721d(str, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10315c(i, str);
        this.f14403j = false;
        this.f14399f = true;
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10315c(i, str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10310b(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10310b(str, surfaceView);
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10310b(str, surfaceView);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo11151b(String str, Boolean bool) {
        C89219l.m154721d(str, "");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            AbstractC5666b bVar = this.f14404k;
            if (bVar != null) {
                bVar.mo10312b(str, booleanValue);
            }
        }
    }

    /* renamed from: a */
    public final void mo11448a(AbstractC7601b bVar, AbstractC5665a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        if (!this.f14397d && !this.f14403j) {
            if (this.f14402i == null) {
                C89219l.m154710a("mLinkLogger");
            }
            this.f14403j = true;
            Client b = m12376b(bVar, aVar);
            this.f14400g = b;
            if (b != null) {
                b.setListener(this.f14401h.f14412c);
            }
            AbstractC4383a a = mo11445a();
            if (a != null) {
                a.mo10144a(System.currentTimeMillis());
            }
            Client client = this.f14400g;
            if (client != null) {
                client.joinChannel();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10311b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10311b(str, str2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10289a(int i, long j, Object... objArr) {
        C89219l.m154721d(objArr, "");
        AbstractC5663a aVar = this.f14402i;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11443a().mo10289a(i, j, objArr);
        AbstractC5666b bVar = this.f14404k;
        if (bVar != null) {
            bVar.mo10289a(i, j, objArr);
        }
    }
}
