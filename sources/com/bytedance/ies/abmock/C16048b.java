package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.AbstractC16056c;
import com.bytedance.ies.abmock.datacenter.AbstractC16067f;
import com.bytedance.ies.abmock.datacenter.C16053b;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.datacenter.p1118c.C16057a;
import com.google.gson.C28022o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.abmock.b */
public class C16048b {

    /* renamed from: d */
    private static volatile C16048b f38662d;

    /* renamed from: a */
    public AbstractC16056c f38663a;

    /* renamed from: b */
    public Map<String, Object> f38664b = new ConcurrentHashMap();

    /* renamed from: c */
    public C28022o f38665c;

    static {
        Covode.recordClassIndex(18319);
    }

    /* renamed from: a */
    public final boolean mo25420a(String str, boolean z) {
        try {
            return ((Boolean) m29634a(str, Boolean.valueOf(z))).booleanValue();
        } catch (Throwable unused) {
            return z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> T mo25416a(boolean z, String str, Class cls, Object obj) {
        boolean z2;
        try {
            T t = (T) mo25415a(z, str, cls);
            if (t == null) {
                if (C16065e.m29769a().f38696c) {
                    z2 = C16057a.f38676a.mo25461b(str);
                } else {
                    z2 = C16053b.f38668a.f38669b.contains(str);
                }
                if (!z2) {
                    return obj;
                }
            }
            return t;
        } catch (Throwable unused) {
            return obj;
        }
    }

    /* renamed from: a */
    public final boolean mo25419a(C28022o oVar) {
        this.f38665c = oVar;
        C16065e.m29769a().mo25495b();
        return C16088o.m29890a(oVar);
    }

    /* renamed from: a */
    public final boolean mo25421a(boolean z, String str, boolean z2) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29868a(str, z2, z);
        }
        try {
            Object b = m29636b(z, str, false);
            if (b != null) {
                C16083j.m29874a();
                return ((Boolean) b).booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(this.f38663a.mo25429a(str, z2));
            m29635a(str, z, valueOf);
            C16083j.m29874a();
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return z2;
        }
    }

    /* renamed from: a */
    public final String mo25417a(boolean z, String str, String str2) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29867a(str, str2, z);
        }
        try {
            Object b = m29636b(z, str, false);
            if (b != null) {
                C16083j.m29874a();
                return (String) b;
            }
            String a = this.f38663a.mo25427a(str, str2);
            m29635a(str, z, a);
            C16083j.m29874a();
            return a;
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public final <T> T mo25415a(boolean z, String str, Class cls) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return (T) C16073e.m29866a(str, z, false, cls);
        }
        T t = (T) m29636b(z, str, false);
        if (t != null) {
            C16083j.m29874a();
            return t;
        }
        T t2 = (T) this.f38663a.mo25426a(str, cls);
        m29635a(str, z, t2);
        C16083j.m29874a();
        return t2;
    }

    /* renamed from: a */
    public final <T> T mo25414a(boolean z, String str) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return (T) C16073e.m29865a(str, z);
        }
        T t = (T) m29636b(z, str, false);
        if (t != null) {
            C16083j.m29874a();
            return t;
        }
        T t2 = (T) this.f38663a.mo25430a(str);
        m29635a(str, z, t2);
        C16083j.m29874a();
        return t2;
    }

    private C16048b() {
    }

    /* renamed from: a */
    public static C16048b m29633a() {
        MethodCollector.m26663i(2266);
        if (f38662d == null) {
            synchronized (C16048b.class) {
                try {
                    if (f38662d == null) {
                        f38662d = new C16048b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2266);
                    throw th;
                }
            }
        }
        C16048b bVar = f38662d;
        MethodCollector.m26664o(2266);
        return bVar;
    }

    /* renamed from: a */
    public final void mo25418a(String str) {
        if (str != null) {
            this.f38664b.remove(str);
        }
    }

    /* renamed from: a */
    private <T> T m29634a(String str, T t) {
        T t2 = (T) m29636b(true, str, true);
        if (t2 != null) {
            C16083j.m29874a();
            return t2;
        }
        m29635a(str, true, (Object) t);
        C16083j.m29874a();
        return t;
    }

    /* renamed from: a */
    public final int mo25411a(String str, int i) {
        try {
            return ((Integer) m29634a(str, Integer.valueOf(i))).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    private void m29635a(String str, boolean z, Object obj) {
        if (z && obj != null) {
            this.f38664b.put(str, obj);
        }
    }

    /* renamed from: b */
    private Object m29636b(boolean z, String str, boolean z2) {
        Object obj;
        Object obj2;
        Object obj3;
        if (z2) {
            AbstractC16067f fVar = C16083j.m29874a().f38736d;
            if (!(fVar == null || fVar.mo25499c() == null || !fVar.mo25499c().enable() || !fVar.mo25497a() || (obj3 = fVar.mo25499c().get(str)) == null)) {
                return obj3;
            }
        } else if (C16083j.m29874a().mo25539d().enable() && C16083j.m29874a().mo25537b() && (obj2 = C16083j.m29874a().mo25539d().get(str)) != null) {
            C16044a.m29630a(str + " use mock data!!");
            return obj2;
        }
        if (!z || (obj = this.f38664b.get(str)) == null) {
            return null;
        }
        return obj;
    }

    /* renamed from: a */
    public final double mo25409a(boolean z, String str, double d) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29860a(str, d, z);
        }
        try {
            Object b = m29636b(z, str, false);
            if (b != null) {
                C16083j.m29874a();
                return ((Double) b).doubleValue();
            }
            Double valueOf = Double.valueOf(this.f38663a.mo25422a(str, d));
            m29635a(str, z, valueOf);
            C16083j.m29874a();
            return valueOf.doubleValue();
        } catch (Throwable unused) {
            return d;
        }
    }

    /* renamed from: a */
    public final float mo25410a(boolean z, String str, float f) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29861a(str, f, z);
        }
        try {
            Object b = m29636b(z, str, false);
            if (b != null) {
                C16083j.m29874a();
                return ((Float) b).floatValue();
            }
            Float valueOf = Float.valueOf(this.f38663a.mo25423a(str, f));
            m29635a(str, z, valueOf);
            C16083j.m29874a();
            return valueOf.floatValue();
        } catch (Throwable unused) {
            return f;
        }
    }

    /* renamed from: a */
    public final int mo25412a(boolean z, String str, int i) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29862a(str, i, z);
        }
        try {
            Object b = m29636b(z, str, false);
            if (b != null) {
                C16083j.m29874a();
                return ((Integer) b).intValue();
            }
            Integer valueOf = Integer.valueOf(this.f38663a.mo25424a(str, i));
            m29635a(str, z, valueOf);
            C16083j.m29874a();
            return valueOf.intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    public final long mo25413a(boolean z, String str, long j) {
        if (C16083j.m29874a().mo25538c()) {
            C16073e.m29864a();
            return C16073e.m29863a(str, j, z);
        }
        try {
            Object b = m29636b(z, str, false);
            if (b != null) {
                C16083j.m29874a();
                return ((Long) b).longValue();
            }
            Long valueOf = Long.valueOf(this.f38663a.mo25425a(str, j));
            m29635a(str, z, valueOf);
            C16083j.m29874a();
            return valueOf.longValue();
        } catch (Throwable unused) {
            return j;
        }
    }
}
