package com.bytedance.bdlocation.utils;

import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ActivityLifecycleUtils implements AbstractC1192f {

    /* renamed from: a */
    private static List<AbstractC13226a> f32332a = new ArrayList();

    /* renamed from: com.bytedance.bdlocation.utils.ActivityLifecycleUtils$a */
    public interface AbstractC13226a {
        static {
            Covode.recordClassIndex(15183);
        }

        /* renamed from: a */
        void mo21375a(boolean z);
    }

    static {
        Covode.recordClassIndex(15182);
    }

    /* renamed from: a */
    public static void m23781a(AbstractC13226a aVar) {
        MethodCollector.m26663i(4947);
        synchronized (ActivityLifecycleUtils.class) {
            try {
                f32332a.add(aVar);
            } finally {
                MethodCollector.m26664o(4947);
            }
        }
    }

    /* renamed from: a */
    private static void m23782a(boolean z) {
        MethodCollector.m26663i(4952);
        synchronized (ActivityLifecycleUtils.class) {
            try {
                if (!C13182f.m23710a((Collection) f32332a)) {
                    for (AbstractC13226a aVar : f32332a) {
                        aVar.mo21375a(z);
                    }
                }
            } finally {
                MethodCollector.m26664o(4952);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C13162b.m23690d("onStateChanged", "onStateChanged: event =".concat(String.valueOf(aVar)));
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            C13162b.m23688b("BDLocation", "LifecycleObserver onAppForeground");
            m23782a(false);
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            C13162b.m23688b("BDLocation", "LifecycleObserver onAppBackground");
            m23782a(true);
        }
    }
}
