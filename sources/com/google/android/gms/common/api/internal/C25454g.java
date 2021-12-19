package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C25523ap;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.C25571t;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.gms.common.api.internal.g */
public final class C25454g {

    /* renamed from: b */
    private static final Object f60441b = new Object();

    /* renamed from: c */
    private static C25454g f60442c;

    /* renamed from: a */
    public final String f60443a;

    /* renamed from: d */
    private final Status f60444d;

    /* renamed from: e */
    private final boolean f60445e;

    /* renamed from: f */
    private final boolean f60446f;

    static {
        Covode.recordClassIndex(30853);
    }

    /* renamed from: a */
    public static boolean m49119a() {
        return m49118a("isMeasurementExplicitlyDisabled").f60446f;
    }

    /* renamed from: a */
    public static Status m49117a(Context context) {
        Status status;
        MethodCollector.m26663i(6641);
        C25565r.m49315a(context, "Context must not be null.");
        synchronized (f60441b) {
            try {
                if (f60442c == null) {
                    f60442c = new C25454g(context);
                }
                status = f60442c.f60444d;
            } finally {
                MethodCollector.m26664o(6641);
            }
        }
        return status;
    }

    private C25454g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.ano));
        boolean z = false;
        boolean z2 = true;
        if (identifier != 0) {
            z = m49116a(resources, identifier) != 0 ? true : z;
            this.f60446f = !z;
            z2 = z;
        } else {
            this.f60446f = false;
        }
        this.f60445e = z2;
        C25523ap.m49217a(context);
        String str = C25523ap.f60537a;
        str = str == null ? new C25571t(context).mo41831a("google_app_id") : str;
        if (TextUtils.isEmpty(str)) {
            this.f60444d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f60443a = null;
            return;
        }
        this.f60443a = str;
        this.f60444d = Status.f60100a;
    }

    /* renamed from: a */
    public static C25454g m49118a(String str) {
        C25454g gVar;
        MethodCollector.m26663i(6644);
        synchronized (f60441b) {
            try {
                gVar = f60442c;
                if (gVar == null) {
                    IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34).append("Initialize must be called before ").append(str).append(".").toString());
                    MethodCollector.m26664o(6644);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.m26664o(6644);
            }
        }
        return gVar;
    }

    /* renamed from: a */
    private static int m49116a(Resources resources, int i) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }
}
