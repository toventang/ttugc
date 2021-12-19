package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.C0645c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.measurement.bj */
public final class C25840bj implements AbstractC25836bf {

    /* renamed from: b */
    private static C25840bj f60960b;

    /* renamed from: a */
    final Context f60961a;

    /* renamed from: c */
    private final ContentObserver f60962c;

    static {
        Covode.recordClassIndex(31255);
    }

    private C25840bj() {
    }

    /* renamed from: a */
    public static synchronized void m50033a() {
        Context context;
        synchronized (C25840bj.class) {
            MethodCollector.m26663i(4868);
            C25840bj bjVar = f60960b;
            if (!(bjVar == null || (context = bjVar.f60961a) == null || bjVar.f60962c == null)) {
                context.getContentResolver().unregisterContentObserver(f60960b.f60962c);
            }
            f60960b = null;
            MethodCollector.m26664o(4868);
        }
    }

    private C25840bj(Context context) {
        this.f60961a = context;
        C25842bl blVar = new C25842bl();
        this.f60962c = blVar;
        context.getContentResolver().registerContentObserver(C25828ay.f60930a, true, blVar);
    }

    /* renamed from: a */
    static C25840bj m50032a(Context context) {
        C25840bj bjVar;
        C25840bj bjVar2;
        MethodCollector.m26663i(4858);
        synchronized (C25840bj.class) {
            try {
                if (f60960b == null) {
                    if (C0645c.m2379a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        bjVar2 = new C25840bj(context);
                    } else {
                        bjVar2 = new C25840bj();
                    }
                    f60960b = bjVar2;
                }
                bjVar = f60960b;
            } finally {
                MethodCollector.m26664o(4858);
            }
        }
        return bjVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String mo42187a(String str) {
        if (this.f60961a == null) {
            return null;
        }
        try {
            return (String) C25838bh.m50030a(new C25839bi(this, str));
        } catch (IllegalStateException | SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Unable to read GServices for: ".concat(valueOf);
            } else {
                new String("Unable to read GServices for: ");
            }
            return null;
        }
    }
}
