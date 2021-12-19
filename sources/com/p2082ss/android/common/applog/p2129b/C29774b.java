package com.p2082ss.android.common.applog.p2129b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29799m;
import com.p2082ss.android.common.applog.C29806r;
import com.p2082ss.android.common.applog.HandlerThreadC29808t;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.common.applog.b.b */
public final class C29774b {

    /* renamed from: a */
    Context f70995a;

    static {
        Covode.recordClassIndex(36179);
    }

    /* renamed from: b */
    public final void mo52037b(C29784d dVar) {
        if (dVar != null) {
            mo52036a(dVar.mo52050a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52036a(String str) {
        if (str == null) {
            str = "";
        }
        try {
            SharedPreferences.Editor edit = C34822d.m71158a(this.f70995a, C29866a.f71244a, 0).edit();
            edit.putString("key_task_session", str);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    C29774b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f70995a = applicationContext;
        C29806r.m60039a(context);
        HandlerThreadC29808t.m60042a().mo52080a(new Runnable() {
            /* class com.p2082ss.android.common.applog.p2129b.C29774b.RunnableC297751 */

            static {
                Covode.recordClassIndex(36180);
            }

            public final void run() {
                C29784d a = C29784d.m59982a(C34822d.m71158a(C29774b.this.f70995a, C29866a.f71244a, 0).getString("key_task_session", ""));
                if (a != null) {
                    C29774b.this.mo52035a(a);
                }
                C29774b.this.mo52036a("");
            }
        });
    }

    /* renamed from: a */
    public final void mo52035a(C29784d dVar) {
        C29806r a = C29806r.m60039a(this.f70995a);
        if (dVar != null) {
            C29784d dVar2 = new C29784d();
            dVar2.f71024a = dVar.f71024a;
            dVar2.f71025b = dVar.f71025b;
            dVar2.f71026c = dVar.f71026c;
            dVar2.f71027d = dVar.f71027d;
            dVar2.f71028e = dVar.f71028e;
            dVar2.f71029f = dVar.f71029f;
            dVar2.f71030g = dVar.f71030g;
            dVar2.f71031h = dVar.f71031h;
            dVar2.f71032i = dVar.f71032i;
            C29799m mVar = new C29799m();
            mVar.f71087a = dVar2;
            AppLog instance = AppLog.getInstance(a.f71132a);
            if (instance != null) {
                instance.enqueue(mVar);
            }
        }
    }
}
