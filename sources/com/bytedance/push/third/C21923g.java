package com.bytedance.push.third;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.message.AbstractC30063b;
import com.p2082ss.android.pushmanager.AbstractC30212b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.push.third.g */
public class C21923g implements AbstractC30063b {

    /* renamed from: b */
    private static volatile C21923g f51911b;

    /* renamed from: a */
    public List<AbstractC30063b> f51912a = Collections.emptyList();

    /* renamed from: c */
    private AbstractC30063b.AbstractC30064a f51913c;

    static {
        Covode.recordClassIndex(25588);
    }

    private C21923g() {
    }

    @Override // com.p2082ss.android.message.AbstractC30065c
    /* renamed from: b */
    public final void mo35688b() {
        List<AbstractC30063b> list = this.f51912a;
        if (list != null) {
            for (AbstractC30063b bVar : list) {
                try {
                    bVar.mo35688b();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static C21923g m41223a() {
        MethodCollector.m26663i(4910);
        if (f51911b == null) {
            synchronized (C21923g.class) {
                try {
                    if (f51911b == null) {
                        f51911b = new C21923g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4910);
                    throw th;
                }
            }
        }
        C21923g gVar = f51911b;
        MethodCollector.m26664o(4910);
        return gVar;
    }

    @Override // com.p2082ss.android.message.AbstractC30065c
    /* renamed from: a */
    public final void mo35684a(Context context) {
        List<AbstractC30063b> list = this.f51912a;
        if (list != null) {
            for (AbstractC30063b bVar : list) {
                try {
                    bVar.mo35684a(context);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.p2082ss.android.message.AbstractC30065c
    /* renamed from: a */
    public final void mo35687a(Intent intent) {
        List<AbstractC30063b> list = this.f51912a;
        if (list != null) {
            for (AbstractC30063b bVar : list) {
                try {
                    bVar.mo35687a(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.p2082ss.android.message.AbstractC30063b
    /* renamed from: a */
    public final void mo35685a(Context context, AbstractC30212b bVar) {
        this.f51913c = new AbstractC30063b.AbstractC30064a() {
            /* class com.bytedance.push.third.C21923g.C219241 */

            static {
                Covode.recordClassIndex(25589);
            }
        };
        List<AbstractC30063b> list = this.f51912a;
        if (list != null) {
            for (AbstractC30063b bVar2 : list) {
                try {
                    bVar2.mo35685a(context, bVar);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.p2082ss.android.message.AbstractC30063b
    /* renamed from: a */
    public final void mo35686a(Context context, Map<String, String> map) {
        List<AbstractC30063b> list = this.f51912a;
        if (list != null) {
            for (AbstractC30063b bVar : list) {
                try {
                    bVar.mo35686a(context, map);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
