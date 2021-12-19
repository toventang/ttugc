package com.bytedance.p802b.p803a;

import com.bytedance.apm.p771d.C12441a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p803a.p804a.AbstractC12921b;
import com.bytedance.p802b.p803a.p804a.C12920a;
import com.bytedance.p802b.p803a.p805b.C12922a;
import com.bytedance.p802b.p803a.p805b.C12923b;
import com.bytedance.p802b.p803a.p805b.C12925d;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p830h.AbstractC13094b;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p841k.p842a.C13114a;
import com.bytedance.p802b.p841k.p843b.C13118b;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.a.a */
public final class C12918a {

    /* renamed from: a */
    private static volatile C12920a f31440a;

    /* renamed from: b */
    private static volatile boolean f31441b;

    /* renamed from: c */
    private static C13114a<AbstractC13094b> f31442c;

    static {
        Covode.recordClassIndex(14754);
        C13114a<AbstractC13094b> aVar = new C13114a<>(1000);
        f31442c = aVar;
        aVar.f31957b = new C13114a.AbstractC13115a<AbstractC13094b>() {
            /* class com.bytedance.p802b.p803a.C12918a.C129191 */

            static {
                Covode.recordClassIndex(14755);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p802b.p841k.p842a.C13114a.AbstractC13115a
            /* renamed from: a */
            public final /* synthetic */ void mo20765a(AbstractC13094b bVar) {
                C13118b.m23586a("APM-CommonEvent", "evicted Monitorable ".concat(String.valueOf(bVar)));
            }
        };
    }

    /* renamed from: a */
    private static synchronized void m23180a() {
        AbstractC12921b bVar;
        synchronized (C12918a.class) {
            if (!f31441b && (bVar = (AbstractC12921b) C13104c.m23566a(AbstractC12921b.class)) != null) {
                m23181a(bVar.mo20769a());
                f31441b = true;
            }
        }
    }

    /* renamed from: a */
    public static void m23184a(C12925d dVar) {
        if (C13037a.m23579r()) {
            dVar.mo20772c();
        }
        C13092a.m23544a(dVar);
    }

    /* renamed from: a */
    public static synchronized void m23181a(C12920a aVar) {
        synchronized (C12918a.class) {
            if (aVar != null) {
                if (f31440a != aVar) {
                    f31440a = aVar;
                    while (!f31442c.f31956a.isEmpty()) {
                        T poll = f31442c.f31956a.poll();
                        if (poll instanceof C12922a) {
                            m23182a((C12922a) poll);
                        } else if (poll instanceof C12923b) {
                            m23183a((C12923b) poll);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23182a(C12922a aVar) {
        if (aVar != null) {
            if (f31440a == null) {
                f31442c.mo20942a(aVar);
                m23180a();
            } else if (f31440a.mo20766a(aVar.f31445a)) {
                if (C13037a.m23579r()) {
                    C12441a.m22401a("service_monitor", aVar.mo20772c(), true);
                }
                C13092a.m23544a(aVar);
                if (!C13037a.m23579r()) {
                }
            } else if (C13037a.m23579r()) {
                C12441a.m22401a("service_monitor", aVar.mo20772c(), false);
            }
        }
    }

    /* renamed from: a */
    public static void m23183a(C12923b bVar) {
        if (bVar != null) {
            if (f31440a == null) {
                f31442c.mo20942a(bVar);
                m23180a();
            } else if (f31440a.mo20767b(bVar.f31451a)) {
                if (C13037a.m23579r()) {
                    C12441a.m22401a(bVar.f31451a, bVar.mo20772c(), true);
                }
                C13092a.m23544a(bVar);
            } else if (C13037a.m23579r()) {
                C12441a.m22401a(bVar.f31451a, bVar.mo20772c(), false);
            }
        }
    }

    /* renamed from: a */
    public static void m23186a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m23187b(str, 0, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: b */
    public static void m23187b(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m23185a(str, i, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public static void m23185a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m23182a(new C12922a(str, i, null, jSONObject, jSONObject2, jSONObject3));
    }
}
