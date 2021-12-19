package com.p2082ss.android.ugc.asve.p2215d;

import android.os.Handler;
import android.os.Looper;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.medialib.p2158qr.PicScanner;
import com.p2082ss.android.medialib.p2158qr.ScanSettings;
import com.p2082ss.android.ugc.asve.context.AbstractC31040h;
import com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.p4385a.C85301d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.d.b */
public final class C31052b implements MessageCenter.Listener, AbstractC31049a {

    /* renamed from: a */
    public AbstractC31049a.AbstractC31051b f74383a;

    /* renamed from: b */
    public PicScanner f74384b;

    /* renamed from: c */
    public final String f74385c = "VEScanController";

    /* renamed from: d */
    private final Handler f74386d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final RunnableC31053a f74387e = new RunnableC31053a(this);

    /* renamed from: f */
    private final C85346av f74388f;

    /* renamed from: g */
    private final AbstractC31040h f74389g;

    static {
        Covode.recordClassIndex(37682);
    }

    /* renamed from: d */
    private final void m63943d() {
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: c */
    public final void mo56233c() {
        PicScanner picScanner = this.f74384b;
        if (picScanner != null) {
            picScanner.release();
        }
        MessageCenter.removeListener(this);
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: a */
    public final void mo56223a() {
        PicScanner picScanner = this.f74384b;
        if (picScanner != null) {
            picScanner.stop();
        }
        RunnableC31053a aVar = this.f74387e;
        if (aVar != null) {
            this.f74386d.removeCallbacks(aVar);
        }
        this.f74384b = null;
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: b */
    public final void mo56232b() {
        if (!this.f74389g.mo56179z()) {
            mo56223a();
        }
        mo56230a(false, 65536L);
    }

    /* renamed from: com.ss.android.ugc.asve.d.b$a */
    public static final class RunnableC31053a implements Runnable {

        /* renamed from: a */
        public final PicScanner f74390a;

        /* renamed from: b */
        final /* synthetic */ C31052b f74391b;

        static {
            Covode.recordClassIndex(37683);
        }

        public final void run() {
            AbstractC31049a.AbstractC31051b bVar;
            MethodCollector.m26663i(8716);
            synchronized (this.f74391b) {
                try {
                    PicScanner picScanner = this.f74390a;
                    if (picScanner != null && !(!C89219l.m154714a(picScanner, this.f74391b.f74384b))) {
                        if (this.f74390a.isValid()) {
                            if (!this.f74390a.isSuccess() && (bVar = this.f74391b.f74383a) != null) {
                                bVar.mo56234a(AbstractC31049a.C31050a.f74379b);
                            }
                            MethodCollector.m26664o(8716);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(8716);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC31053a(C31052b bVar) {
            this.f74391b = bVar;
            this.f74390a = bVar.f74384b;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: a */
    public final void mo56226a(AbstractC31049a.AbstractC31051b bVar) {
        this.f74383a = bVar;
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: a */
    public final void mo56229a(boolean z) {
        this.f74388f.mo130816k(z);
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: a */
    public final void mo56224a(float f, float f2) {
        this.f74388f.mo130770b(f, f2);
    }

    public C31052b(C85346av avVar, AbstractC31040h hVar) {
        C89219l.m154721d(avVar, "");
        C89219l.m154721d(hVar, "");
        this.f74388f = avVar;
        this.f74389g = hVar;
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: a */
    public final void mo56230a(boolean z, long j) {
        m63943d();
        this.f74388f.mo130762a(z, j);
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: a */
    public final void mo56228a(String str, ScanSettings scanSettings, long j) {
        AbstractC31049a.AbstractC31051b bVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(scanSettings, "");
        mo56223a();
        if (this.f74384b == null) {
            this.f74384b = new PicScanner();
        }
        m63943d();
        PicScanner picScanner = this.f74384b;
        if ((picScanner == null || picScanner.start(str, scanSettings) < 0) && (bVar = this.f74383a) != null) {
            bVar.mo56234a(AbstractC31049a.C31050a.f74378a);
        }
        this.f74386d.postDelayed(this.f74387e, j);
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: a */
    public final void mo56225a(float f, float f2, float f3, float f4) {
        this.f74388f.mo130723a(f, f2, f3, f4);
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: a */
    public final void mo56227a(String str, int i, int i2, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f74388f.mo130708a(str, i, i2, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a
    /* renamed from: b */
    public final int mo56231b(float f, float f2, float f3, float f4) {
        m63943d();
        C85301d dVar = new C85301d();
        dVar.f190887b = f;
        dVar.f190888f = f2;
        dVar.f190889g = f3;
        dVar.f190890h = f4;
        dVar.f190891i = true;
        dVar.f190892j = 0;
        dVar.f190893k = C85301d.f190886a;
        dVar.f190894l = 0;
        dVar.f190895m = false;
        return this.f74388f.mo130685I().mo130890a(dVar);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 24) {
            PicScanner picScanner = this.f74384b;
            if (picScanner != null) {
                AbstractC31049a.AbstractC31051b bVar = this.f74383a;
                if (bVar != null) {
                    bVar.mo56235a(picScanner.getEnigmaResult());
                    return;
                }
                return;
            }
            EnigmaResult q = this.f74388f.mo130827q();
            AbstractC31049a.AbstractC31051b bVar2 = this.f74383a;
            if (bVar2 != null) {
                bVar2.mo56235a(q);
            }
        }
    }
}
