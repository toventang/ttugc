package com.bytedance.android.live.liveinteract.multiguest.p316a.p321e;

import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.e.e */
public final class C5180e implements AbstractC5174a {

    /* renamed from: b */
    public static final C5181a f13398b = new C5181a((byte) 0);

    /* renamed from: a */
    public final AbstractC5175b f13399a;

    /* renamed from: c */
    private volatile boolean f13400c;

    /* renamed from: d */
    private volatile boolean f13401d;

    static {
        Covode.recordClassIndex(5772);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.e.e$a */
    public static final class C5181a {
        static {
            Covode.recordClassIndex(5773);
        }

        private C5181a() {
        }

        public /* synthetic */ C5181a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: c */
    public final void mo10928c() {
        m11448h();
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "onRefuseInvite");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: d */
    public final void mo10929d() {
        m11448h();
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "dispose");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: e */
    public final void mo10930e() {
        m11447a(false);
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "onApplySucceed");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: f */
    public final void mo10931f() {
        m11448h();
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "onCancelApply");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: g */
    public final void mo10932g() {
        m11447a(false);
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "onReceiveInviteMsg");
    }

    /* renamed from: h */
    private final void m11448h() {
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "disposeRtc");
        this.f13399a.mo10936d();
        this.f13400c = false;
        this.f13401d = true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: a */
    public final void mo10926a() {
        this.f13399a.mo10933a();
        m11449i();
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "onReceivePermitMsg");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5174a
    /* renamed from: b */
    public final void mo10927b() {
        this.f13399a.mo10933a();
        m11449i();
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "onAcceptInvite");
    }

    /* renamed from: i */
    private final void m11449i() {
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "joinRtc enter");
        if (!this.f13400c || this.f13401d) {
            C6555i.m14021b();
            C6555i.m9462a("Guest_PreInitStrategy", "joinRtc not init, wait...");
            m11447a(true);
        }
        this.f13399a.mo10935c();
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "joinRtc exit");
    }

    public C5180e(AbstractC5175b bVar) {
        C89219l.m154721d(bVar, "");
        this.f13399a = bVar;
    }

    /* renamed from: a */
    private final synchronized void m11447a(boolean z) {
        MethodCollector.m26663i(5456);
        C6555i.m14021b();
        C6555i.m9462a("Guest_PreInitStrategy", "initRtc enter");
        if (!this.f13400c || this.f13401d) {
            this.f13399a.mo10934a(z);
            this.f13400c = true;
            this.f13401d = false;
            C6555i.m14021b();
            C6555i.m9462a("Guest_PreInitStrategy", "initRtc exit");
            MethodCollector.m26664o(5456);
            return;
        }
        C6555i.m14021b();
        C6555i.m9464c("Guest_PreInitStrategy", "initRtc is already init");
        MethodCollector.m26664o(5456);
    }
}
