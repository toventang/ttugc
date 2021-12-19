package com.bytedance.ies.abmock;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.AbstractC16070i;
import java.util.ArrayList;
import java.util.List;

public class SettingsManager {

    /* renamed from: b */
    private static volatile SettingsManager f38655b;

    /* renamed from: a */
    public AbstractC16070i f38656a;

    /* renamed from: c */
    private List<AbstractC16082i> f38657c = new ArrayList();

    static {
        Covode.recordClassIndex(18314);
    }

    public AbstractC16070i getSettingsValueProvider() {
        return this.f38656a;
    }

    /* renamed from: a */
    public final void mo25399a(AbstractC16082i iVar) {
        MethodCollector.m26663i(1641);
        synchronized (this.f38657c) {
            try {
                this.f38657c.add(iVar);
            } finally {
                MethodCollector.m26664o(1641);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25400a(String str, boolean z) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29868a(str, z, false);
        }
        Boolean bool = (Boolean) m29617a(str);
        if (bool != null) {
            C16083j.m29874a();
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(getSettingsValueProvider().mo25522c(str, z));
        C16083j.m29874a();
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public final String mo25398a(String str, String str2) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29867a(str, str2, false);
        }
        String str3 = (String) m29617a(str);
        if (str3 != null) {
            C16083j.m29874a();
            return str3;
        }
        String d = getSettingsValueProvider().mo25523d(str, str2);
        C16083j.m29874a();
        return d;
    }

    private SettingsManager() {
    }

    /* renamed from: c */
    public final void mo25402c() {
        new Handler(Looper.getMainLooper()).post(new RunnableC16090q(this));
    }

    /* renamed from: a */
    public static SettingsManager m29616a() {
        MethodCollector.m26663i(1543);
        if (f38655b == null) {
            synchronized (SettingsManager.class) {
                try {
                    if (f38655b == null) {
                        f38655b = new SettingsManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1543);
                    throw th;
                }
            }
        }
        SettingsManager settingsManager = f38655b;
        MethodCollector.m26664o(1543);
        return settingsManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo25401b() {
        Object[] objArr;
        MethodCollector.m26663i(1725);
        synchronized (this.f38657c) {
            try {
                if (this.f38657c.size() > 0) {
                    objArr = this.f38657c.toArray();
                } else {
                    objArr = null;
                }
            } finally {
                MethodCollector.m26664o(1725);
            }
        }
        return objArr;
    }

    /* renamed from: a */
    private static <T> T m29617a(String str) {
        T t;
        if (!C16083j.m29874a().mo25537b() || !C16083j.m29874a().mo25539d().enable() || (t = (T) C16083j.m29874a().mo25539d().get(str)) == null) {
            return null;
        }
        C16044a.m29630a(str + " use mock data!!");
        return t;
    }

    /* renamed from: a */
    public final <T> T mo25396a(String str, Class cls) {
        T t = (T) m29618b(str, cls);
        C16083j.m29874a();
        return t;
    }

    /* renamed from: b */
    private <T> T m29618b(String str, Class cls) {
        T t = (T) m29617a(str);
        if (t != null) {
            return t;
        }
        if (cls == String[].class) {
            if (!C16083j.m29874a().mo25538c()) {
                return (T) getSettingsValueProvider().mo25518b(str);
            }
            C16073e.m29864a();
            return (T) C16073e.m29865a(str, false);
        } else if (!C16083j.m29874a().mo25538c()) {
            return (T) getSettingsValueProvider().mo25515b(str, cls);
        } else {
            C16073e.m29864a();
            return (T) C16073e.m29866a(str, false, false, cls);
        }
    }

    /* renamed from: a */
    public final double mo25392a(String str, double d) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29860a(str, d, false);
        }
        Double d2 = (Double) m29617a(str);
        if (d2 != null) {
            C16083j.m29874a();
            return d2.doubleValue();
        }
        Double valueOf = Double.valueOf(getSettingsValueProvider().mo25511b(str, d));
        C16083j.m29874a();
        return valueOf.doubleValue();
    }

    /* renamed from: a */
    public final float mo25393a(String str, float f) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29861a(str, f, false);
        }
        Float f2 = (Float) m29617a(str);
        if (f2 != null) {
            C16083j.m29874a();
            return f2.floatValue();
        }
        Float valueOf = Float.valueOf(getSettingsValueProvider().mo25512b(str, f));
        C16083j.m29874a();
        return valueOf.floatValue();
    }

    /* renamed from: a */
    public final int mo25394a(String str, int i) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29862a(str, i, false);
        }
        Integer num = (Integer) m29617a(str);
        if (num != null) {
            C16083j.m29874a();
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(getSettingsValueProvider().mo25519c(str, i));
        C16083j.m29874a();
        return valueOf.intValue();
    }

    /* renamed from: a */
    public final long mo25395a(String str, long j) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29863a(str, j, false);
        }
        Long l = (Long) m29617a(str);
        if (l != null) {
            C16083j.m29874a();
            return l.longValue();
        }
        Long valueOf = Long.valueOf(getSettingsValueProvider().mo25514b(str, j));
        C16083j.m29874a();
        return valueOf.longValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> T mo25397a(String str, Class cls, Object obj) {
        try {
            T t = (T) mo25396a(str, cls);
            return (t != null || this.f38656a.mo25521c(str)) ? t : obj;
        } catch (Throwable unused) {
            return obj;
        }
    }
}
