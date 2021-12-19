package com.google.android.gms.p1934b;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.p1946e.BinderC25728a;
import com.google.android.gms.internal.p1946e.C25729b;

/* renamed from: com.google.android.gms.b.a */
public interface AbstractC25324a extends IInterface {
    static {
        Covode.recordClassIndex(30714);
    }

    /* renamed from: com.google.android.gms.b.a$a */
    public static abstract class AbstractBinderC25325a extends BinderC25728a implements AbstractC25324a {
        static {
            Covode.recordClassIndex(30715);
        }

        public AbstractBinderC25325a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
            MethodCollector.m26663i(9123);
            MethodCollector.m26664o(9123);
        }

        /* renamed from: com.google.android.gms.b.a$a$a */
        public static class C25326a extends C25729b implements AbstractC25324a {
            static {
                Covode.recordClassIndex(30716);
            }

            C25326a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
                MethodCollector.m26663i(9280);
                MethodCollector.m26664o(9280);
            }
        }

        /* renamed from: a */
        public static AbstractC25324a m48693a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof AbstractC25324a) {
                return (AbstractC25324a) queryLocalInterface;
            }
            return new C25326a(iBinder);
        }
    }
}
