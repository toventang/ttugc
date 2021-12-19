package com.p2082ss.ttvideoengine.p4430s;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4415h.C86464h;

/* renamed from: com.ss.ttvideoengine.s.e */
public final class C86635e {

    /* renamed from: a */
    public final C86634d f195259a = new C86634d();

    /* renamed from: b */
    public final C86634d f195260b = new C86634d();

    /* renamed from: c */
    public final C86634d f195261c = new C86634d();

    /* renamed from: d */
    public volatile boolean f195262d;

    /* renamed from: e */
    private final C86464h f195263e;

    /* renamed from: f */
    private final C86464h.AbstractC86466b f195264f;

    static {
        Covode.recordClassIndex(101863);
    }

    /* renamed from: c */
    public final void mo137910c() {
        this.f195259a.mo137906d();
        this.f195260b.mo137906d();
        this.f195261c.mo137906d();
    }

    /* renamed from: d */
    public final void mo137911d() {
        this.f195259a.mo137907e();
        this.f195260b.mo137907e();
        this.f195261c.mo137907e();
    }

    /* renamed from: a */
    public final void mo137908a() {
        if (this.f195262d) {
            C86641i.m150110a("PlayDurationManager", "Already started");
            return;
        }
        this.f195262d = true;
        this.f195259a.mo137903a();
        if (this.f195263e.mo137507b()) {
            this.f195260b.mo137903a();
        } else if (this.f195263e.mo137508c()) {
            this.f195261c.mo137903a();
        }
        C86641i.m150113b("PlayDurationManager", "start play");
    }

    /* renamed from: b */
    public final void mo137909b() {
        if (!this.f195262d) {
            C86641i.m150110a("PlayDurationManager", "Already stopped");
            return;
        }
        this.f195262d = false;
        this.f195259a.mo137904b();
        if (this.f195263e.mo137507b()) {
            this.f195260b.mo137904b();
        }
        if (this.f195263e.mo137508c()) {
            this.f195261c.mo137904b();
        }
        C86641i.m150113b("PlayDurationManager", C1764a.m5928a("stop: play duration: %s, wiredDuration: %s, wirelessDuration: %s", new Object[]{Integer.valueOf(this.f195259a.mo137905c()), Integer.valueOf(this.f195260b.mo137905c()), Integer.valueOf(this.f195261c.mo137905c())}));
    }

    public C86635e(C86464h hVar) {
        C866361 r1 = new C86464h.AbstractC86466b() {
            /* class com.p2082ss.ttvideoengine.p4430s.C86635e.C866361 */

            static {
                Covode.recordClassIndex(101864);
            }

            @Override // com.p2082ss.ttvideoengine.p4415h.C86464h.AbstractC86466b
            /* renamed from: a */
            public final void mo137511a(boolean z, boolean z2) {
                C86641i.m150113b("PlayDurationManager", "onHeadsetStateChanged: " + z + ", " + z2);
                if (!z) {
                    C86635e.this.f195260b.mo137904b();
                    C86635e.this.f195261c.mo137904b();
                } else if (z2) {
                    if (C86635e.this.f195262d) {
                        C86635e.this.f195261c.mo137903a();
                        C86635e.this.f195260b.mo137904b();
                    }
                } else if (C86635e.this.f195262d) {
                    C86635e.this.f195260b.mo137903a();
                    C86635e.this.f195261c.mo137904b();
                }
                C86641i.m150113b("PlayDurationManager", C1764a.m5928a("wiredDuration: %s, wirelessDuration: %s", new Object[]{Integer.valueOf(C86635e.this.f195260b.mo137905c()), Integer.valueOf(C86635e.this.f195261c.mo137905c())}));
            }
        };
        this.f195264f = r1;
        this.f195263e = hVar;
        hVar.f193908b = r1;
    }
}
