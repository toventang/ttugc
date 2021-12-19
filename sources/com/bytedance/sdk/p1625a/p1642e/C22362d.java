package com.bytedance.sdk.p1625a.p1642e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1642e.AbstractC22367g;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: com.bytedance.sdk.a.e.d */
public class C22362d implements AbstractC22367g {

    /* renamed from: a */
    static AbstractC22367g f52844a;

    /* renamed from: b */
    private AbstractC22369h f52845b;

    /* renamed from: c */
    private AbstractC22369h f52846c;

    /* renamed from: d */
    private AbstractC22369h f52847d;

    /* renamed from: e */
    private AbstractC22367g.AbstractC22368a f52848e;

    static {
        Covode.recordClassIndex(26178);
    }

    private C22362d() {
    }

    /* renamed from: c */
    private void m42103c() {
        if (this.f52848e == null) {
            throw new IllegalStateException("AppLogDepend is needed, please call method setAppLogDepend(AppLogDepend) first");
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22367g
    /* renamed from: b */
    public final void mo36727b() {
        AbstractC22369h hVar = this.f52845b;
        if (hVar != null) {
            hVar.mo36719b();
        }
        AbstractC22369h hVar2 = this.f52846c;
        if (hVar2 != null) {
            hVar2.mo36719b();
        }
        AbstractC22369h hVar3 = this.f52847d;
        if (hVar3 != null) {
            hVar3.mo36719b();
        }
    }

    /* renamed from: a */
    public static AbstractC22367g m42100a() {
        MethodCollector.m26663i(5391);
        if (f52844a == null) {
            synchronized (C22362d.class) {
                try {
                    if (f52844a == null) {
                        f52844a = new C22362d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5391);
                    throw th;
                }
            }
        }
        AbstractC22367g gVar = f52844a;
        MethodCollector.m26664o(5391);
        return gVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22367g
    /* renamed from: a */
    public final void mo36726a(AbstractC22367g.AbstractC22368a aVar) {
        this.f52848e = aVar;
    }

    /* renamed from: a */
    private static boolean m42102a(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m42101a(String str) {
        if (this.f52848e != null) {
            Bundle bundle = new Bundle();
            bundle.putString("gsl_action", str);
            this.f52848e.mo36733a("passport_google_smart_lock_google_service_unavailable", bundle);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22367g
    /* renamed from: a */
    public final void mo36723a(int i, int i2, Intent intent) {
        AbstractC22369h hVar;
        if (i == 101) {
            AbstractC22369h hVar2 = this.f52845b;
            if (hVar2 != null) {
                hVar2.mo36728a(i2, intent);
            }
        } else if (i == 102 && (hVar = this.f52846c) != null) {
            hVar.mo36728a(i2, intent);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22367g
    /* renamed from: a */
    public final void mo36724a(Activity activity, C22359a aVar, AbstractC22361c cVar) {
        AbstractC22369h hVar = this.f52846c;
        if (hVar != null) {
            hVar.mo36719b();
        }
        if (!m42102a(activity)) {
            cVar.mo36721a(401, 0);
            m42101a("save");
            return;
        }
        m42103c();
        C22365f fVar = new C22365f(activity);
        fVar.mo36717a(cVar);
        fVar.f52843d = this.f52848e;
        fVar.f52851e = aVar;
        fVar.mo36731d();
        this.f52846c = fVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22367g
    /* renamed from: a */
    public final void mo36725a(Activity activity, boolean z, AbstractC22361c cVar) {
        AbstractC22369h hVar = this.f52845b;
        if (hVar != null) {
            hVar.mo36719b();
        }
        if (!m42102a(activity)) {
            cVar.mo36721a(401, 0);
            m42101a("query");
            return;
        }
        m42103c();
        C22363e eVar = new C22363e(activity);
        eVar.mo36717a(cVar);
        eVar.f52843d = this.f52848e;
        eVar.f52849e = z;
        eVar.mo36731d();
        this.f52845b = eVar;
    }
}
