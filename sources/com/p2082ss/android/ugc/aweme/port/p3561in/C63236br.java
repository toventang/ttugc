package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.app.Application;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.aweme.property.C65373bm;
import com.p2082ss.android.ugc.aweme.property.C65460eo;
import com.p2082ss.android.ugc.aweme.utils.C80583iq;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85515j;
import dmt.p4542av.video.p4546c.C88243b;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.port.in.br */
public class C63236br {

    /* renamed from: a */
    public static volatile boolean f143556a;

    /* renamed from: c */
    private static volatile C63236br f143557c;

    /* renamed from: b */
    public volatile AbstractC63237a f143558b;

    /* renamed from: d */
    private Application f143559d;

    /* renamed from: e */
    private final ReentrantLock f143560e = new ReentrantLock();

    /* renamed from: f */
    private final C27910f f143561f;

    /* renamed from: g */
    private final C65460eo f143562g;

    /* renamed from: com.ss.android.ugc.aweme.port.in.br$a */
    public interface AbstractC63237a {
        static {
            Covode.recordClassIndex(74510);
        }

        /* renamed from: a */
        C85515j mo101717a();
    }

    static {
        Covode.recordClassIndex(74509);
    }

    /* renamed from: b */
    private static void m114586b() {
        if (C65373bm.m117069a()) {
            C80583iq.m139713a(true);
        }
    }

    /* renamed from: a */
    public final void mo101715a() {
        if (!f143556a) {
            mo101716a(this.f143558b.mo101717a());
        }
    }

    /* renamed from: a */
    public final void mo101716a(C85515j jVar) {
        C84911q.m145928d("VESDKLoader initVESDK start");
        if (!f143556a) {
            try {
                this.f143560e.lock();
                if (!f143556a) {
                    C88243b.f200282d.mo142775a(this.f143559d).mo142773a();
                    m114586b();
                    m114585a(DownloadableModelSupport.getInstance().getResourceFinder(), jVar);
                    C63234bq.m114583a(this.f143559d);
                    f143556a = true;
                }
            } finally {
                this.f143560e.unlock();
            }
        }
        C84911q.m145928d("VESDKLoader initVESDK end");
    }

    /* renamed from: a */
    private void m114585a(ResourceFinder resourceFinder, C85515j jVar) {
        C31012a.m63725a(new C63204b(this.f143559d, this.f143561f, this.f143562g, resourceFinder, jVar));
    }

    private C63236br(Application application, AbstractC63237a aVar, C27910f fVar, C65460eo eoVar) {
        this.f143558b = aVar;
        this.f143561f = fVar;
        this.f143562g = eoVar;
        this.f143559d = application;
        C63244g.m114602a().mo73295w();
    }

    /* renamed from: a */
    public static C63236br m114584a(Application application, AbstractC63237a aVar, C27910f fVar, C65460eo eoVar) {
        MethodCollector.m26663i(6303);
        if (f143557c == null) {
            synchronized (C63236br.class) {
                try {
                    if (f143557c == null) {
                        f143557c = new C63236br(application, aVar, fVar, eoVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6303);
                    throw th;
                }
            }
        }
        C63236br brVar = f143557c;
        MethodCollector.m26664o(6303);
        return brVar;
    }
}
