package com.bytedance.android.live.liveinteract.multiguest.p316a.p321e;

import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.e.c */
public final class C5176c implements AbstractC5174a {

    /* renamed from: b */
    public static final C5177a f13392b = new C5177a((byte) 0);

    /* renamed from: a */
    public final AbstractC5175b f13393a;

    /* renamed from: c */
    private volatile boolean f13394c;

    static {
        Covode.recordClassIndex(5768);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.e.c$a */
    public static final class C5177a {
        static {
            Covode.recordClassIndex(5769);
        }

        private C5177a() {
        }

        public /* synthetic */ C5177a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: a */
    public final void mo10926a() {
        m11437i();
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "onReceivePermitMsg");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: b */
    public final void mo10927b() {
        m11437i();
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "onAcceptInvite");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: c */
    public final void mo10928c() {
        m11438j();
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "onRefuseInvite");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: d */
    public final void mo10929d() {
        m11438j();
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "dispose");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: e */
    public final void mo10930e() {
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "onApplySucceed");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: f */
    public final void mo10931f() {
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "onCancelApply");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: g */
    public final void mo10932g() {
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "onReceiveInviteMsg");
    }

    /* renamed from: j */
    private final void m11438j() {
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "disposeRtc");
        this.f13393a.mo10936d();
        this.f13394c = false;
    }

    /* renamed from: h */
    private final synchronized void m11436h() {
        MethodCollector.m26663i(7414);
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "initRtc enter");
        if (this.f13394c) {
            MethodCollector.m26664o(7414);
            return;
        }
        this.f13394c = true;
        this.f13393a.mo10934a(true);
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "initRtc exit");
        MethodCollector.m26664o(7414);
    }

    /* renamed from: i */
    private final void m11437i() {
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "joinRtc enter");
        if (!this.f13394c) {
            C6555i.m14021b();
            C6555i.m9462a("Guest_NormalInitStrategy", "joinRtc not init, wait...");
            m11436h();
        }
        this.f13393a.mo10935c();
        C6555i.m14021b();
        C6555i.m9462a("Guest_NormalInitStrategy", "joinRtc exit");
    }

    public C5176c(AbstractC5175b bVar) {
        C89219l.m154721d(bVar, "");
        this.f13393a = bVar;
    }
}
