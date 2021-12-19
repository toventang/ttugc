package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.C25602d;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public final class C25588a {

    /* renamed from: a */
    private static final Object f60680a = new Object();

    /* renamed from: b */
    private static volatile C25588a f60681b;

    /* renamed from: c */
    private static boolean f60682c = false;

    /* renamed from: d */
    private final List<String> f60683d = Collections.EMPTY_LIST;

    /* renamed from: e */
    private final List<String> f60684e = Collections.EMPTY_LIST;

    /* renamed from: f */
    private final List<String> f60685f = Collections.EMPTY_LIST;

    /* renamed from: g */
    private final List<String> f60686g = Collections.EMPTY_LIST;

    static {
        Covode.recordClassIndex(30997);
    }

    private C25588a() {
    }

    /* renamed from: a */
    public static C25588a m49390a() {
        MethodCollector.m26663i(8838);
        if (f60681b == null) {
            synchronized (f60680a) {
                try {
                    if (f60681b == null) {
                        f60681b = new C25588a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8838);
                    throw th;
                }
            }
        }
        C25588a aVar = f60681b;
        MethodCollector.m26664o(8838);
        return aVar;
    }

    /* renamed from: b */
    public static boolean m49392b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass().getName();
        return m49391a(context, intent, serviceConnection, i);
    }

    /* renamed from: a */
    public static boolean m49391a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null && C25602d.m49406a(context, component.getPackageName())) {
            return false;
        }
        return m49393c(context, intent, serviceConnection, i);
    }

    /* renamed from: c */
    private static boolean m49393c(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, i);
        }
        if (C65713d.m117625a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
