package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23998m;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.facebook.internal.c */
public class C24728c extends BroadcastReceiver {

    /* renamed from: a */
    private static C24728c f58707a;

    /* renamed from: b */
    private Context f58708b;

    static {
        Covode.recordClassIndex(28881);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (!C24677a.m47209a(this)) {
            try {
                if (!C24677a.m47209a(this)) {
                    try {
                        C0998a.m3454a(this.f58708b).mo3692a(this);
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
                super.finalize();
            } catch (Throwable th2) {
                C24677a.m47208a(th2, this);
            }
        }
    }

    private C24728c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f58708b = applicationContext;
    }

    /* renamed from: a */
    public static C24728c m47354a(Context context) {
        if (C24677a.m47209a(C24728c.class)) {
            return null;
        }
        try {
            C24728c cVar = f58707a;
            if (cVar != null) {
                return cVar;
            }
            C24728c cVar2 = new C24728c(context);
            f58707a = cVar2;
            if (!C24677a.m47209a(cVar2)) {
                try {
                    C0998a.m3454a(cVar2.f58708b).mo3693a(cVar2, new IntentFilter("com.parse.bolts.measurement_event"));
                } catch (Throwable th) {
                    C24677a.m47208a(th, cVar2);
                }
            }
            return f58707a;
        } catch (Throwable th2) {
            C24677a.m47208a(th2, C24728c.class);
            return null;
        }
    }

    /* renamed from: a */
    private static Object m47355a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m47356a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!C24677a.m47209a(this)) {
            try {
                C23998m mVar = new C23998m(context);
                m47356a(intent, "event_name");
                Bundle bundleExtra = intent.getBundleExtra("event_args");
                Context context2 = BadParcelableCrashOptimizer.getContext();
                if (!(bundleExtra == null || context2 == null)) {
                    bundleExtra.setClassLoader(context2.getClassLoader());
                }
                Bundle bundle = new Bundle();
                for (String str : bundleExtra.keySet()) {
                    bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) m47355a(bundleExtra, str));
                }
                mVar.mo39473a();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }
}
