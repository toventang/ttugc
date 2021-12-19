package com.bytedance.ies.abmock.datacenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.p1116a.AbstractC16052a;
import com.bytedance.ies.abmock.datacenter.p1117b.C16054a;
import com.bytedance.ies.abmock.datacenter.p1118c.C16057a;
import com.bytedance.ies.abmock.datacenter.p1118c.C16058b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.abmock.datacenter.e */
public class C16065e {

    /* renamed from: f */
    private static volatile C16065e f38692f;

    /* renamed from: j */
    private static final Object f38693j = new Object();

    /* renamed from: a */
    public AbstractC16052a f38694a;

    /* renamed from: b */
    public AbstractC16067f f38695b;

    /* renamed from: c */
    public boolean f38696c;

    /* renamed from: d */
    public int f38697d;

    /* renamed from: e */
    public boolean f38698e = false;

    /* renamed from: g */
    private Map<String, Object> f38699g = new ConcurrentHashMap();

    /* renamed from: h */
    private Map<String, Object> f38700h = new ConcurrentHashMap();

    /* renamed from: i */
    private C27910f f38701i = new C27910f();

    /* renamed from: a */
    public final String[] mo25494a(String str, boolean z) {
        String[] a;
        Object a2 = m29770a(str, String[].class);
        Object obj = f38693j;
        if (a2 == obj) {
            if (this.f38698e) {
                return null;
            }
            mo25492a(str);
        } else if (a2 != null) {
            return (String[]) a2;
        }
        AbstractC16067f fVar = this.f38695b;
        if (fVar == null || !fVar.mo25501e() || !C16058b.f38679a.mo25479b(str)) {
            a = C16057a.f38676a.mo25454a(str);
        } else {
            a = C16058b.f38679a.mo25472a(str);
        }
        if (a != null || !this.f38698e) {
            m29771a(str, a, z);
        } else {
            m29771a(str, obj, z);
        }
        return a;
    }

    /* renamed from: a */
    public final Object mo25490a(String str, boolean z, boolean z2, Class cls) {
        Object a;
        Object a2 = m29770a(str, cls);
        Object obj = f38693j;
        if (a2 == obj) {
            if (this.f38698e) {
                return null;
            }
            mo25492a(str);
        } else if (a2 != null) {
            return a2;
        }
        AbstractC16067f fVar = this.f38695b;
        if (fVar == null || !fVar.mo25501e() || !C16058b.f38679a.mo25479b(str)) {
            a = C16057a.f38676a.mo25450a(str, cls);
        } else {
            a = C16058b.f38679a.mo25468a(str, cls);
        }
        if (a != null || !this.f38698e) {
            m29772a(str, a, z, z2);
        } else {
            m29772a(str, obj, z, z2);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo25493a(String str, boolean z, boolean z2) {
        Boolean valueOf;
        Object a = m29770a(str, (Class) null);
        if (a != null) {
            return ((Boolean) a).booleanValue();
        }
        AbstractC16067f fVar = this.f38695b;
        if (fVar == null || !fVar.mo25501e() || !C16058b.f38679a.mo25479b(str)) {
            valueOf = Boolean.valueOf(C16057a.f38676a.mo25453a(str, z));
        } else {
            valueOf = Boolean.valueOf(C16058b.f38679a.mo25471a(str, z));
        }
        m29771a(str, valueOf, z2);
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public final String mo25491a(String str, String str2, boolean z) {
        String a;
        Object a2 = m29770a(str, (Class) null);
        if (a2 != null) {
            return (String) a2;
        }
        AbstractC16067f fVar = this.f38695b;
        if (fVar == null || !fVar.mo25501e() || !C16058b.f38679a.mo25479b(str)) {
            a = C16057a.f38676a.mo25451a(str, str2);
        } else {
            a = C16058b.f38679a.mo25469a(str, str2);
        }
        m29771a(str, (Object) a, z);
        return a;
    }

    static {
        Covode.recordClassIndex(18336);
    }

    private C16065e() {
    }

    /* renamed from: a */
    public static C16065e m29769a() {
        MethodCollector.m26663i(6169);
        if (f38692f == null) {
            synchronized (C16065e.class) {
                try {
                    if (f38692f == null) {
                        f38692f = new C16065e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6169);
                    throw th;
                }
            }
        }
        C16065e eVar = f38692f;
        MethodCollector.m26664o(6169);
        return eVar;
    }

    /* renamed from: b */
    public final void mo25495b() {
        this.f38700h.clear();
        if (this.f38698e) {
            for (Map.Entry<String, Object> entry : this.f38699g.entrySet()) {
                if (!(entry == null || entry.getValue() != f38693j || entry.getKey() == null)) {
                    this.f38699g.remove(entry.getKey());
                }
            }
        }
    }

    /* renamed from: b */
    private Object m29773b(String str) {
        Object obj = this.f38699g.get(str);
        if (obj != null) {
            return obj;
        }
        return this.f38700h.get(str);
    }

    /* renamed from: a */
    public final void mo25492a(String str) {
        if (str != null) {
            this.f38699g.remove(str);
            this.f38700h.remove(str);
        }
    }

    /* renamed from: a */
    private Object m29770a(String str, Class cls) {
        Object obj;
        if (!this.f38694a.enable() || (obj = this.f38694a.get(str)) == null) {
            return m29773b(str);
        }
        if (cls == null || obj.getClass().isAssignableFrom(cls) || !(obj instanceof C28022o)) {
            return obj;
        }
        return this.f38701i.mo46667a((AbstractC28019l) obj, cls);
    }

    /* renamed from: a */
    private void m29771a(String str, Object obj, boolean z) {
        m29772a(str, obj, z, false);
    }

    /* renamed from: a */
    public final double mo25486a(String str, double d, boolean z) {
        Double valueOf;
        Object a = m29770a(str, (Class) null);
        if (a != null) {
            return ((Double) a).doubleValue();
        }
        AbstractC16067f fVar = this.f38695b;
        if (fVar == null || !fVar.mo25501e() || !C16058b.f38679a.mo25479b(str)) {
            valueOf = Double.valueOf(C16057a.f38676a.mo25445a(str, d));
        } else {
            valueOf = Double.valueOf(C16058b.f38679a.mo25463a(str, d));
        }
        m29771a(str, valueOf, z);
        return valueOf.doubleValue();
    }

    /* renamed from: a */
    public final float mo25487a(String str, float f, boolean z) {
        Float valueOf;
        Object a = m29770a(str, (Class) null);
        if (a != null) {
            return ((Float) a).floatValue();
        }
        AbstractC16067f fVar = this.f38695b;
        if (fVar == null || !fVar.mo25501e() || !C16058b.f38679a.mo25479b(str)) {
            valueOf = Float.valueOf(C16057a.f38676a.mo25446a(str, f));
        } else {
            valueOf = Float.valueOf(C16058b.f38679a.mo25464a(str, f));
        }
        m29771a(str, valueOf, z);
        return valueOf.floatValue();
    }

    /* renamed from: a */
    public final int mo25488a(String str, int i, boolean z) {
        Integer valueOf;
        Object a = m29770a(str, (Class) null);
        if (a != null) {
            return ((Integer) a).intValue();
        }
        AbstractC16067f fVar = this.f38695b;
        if (fVar == null || !fVar.mo25501e() || !C16058b.f38679a.mo25479b(str)) {
            valueOf = Integer.valueOf(C16057a.f38676a.mo25447a(str, i));
        } else {
            valueOf = Integer.valueOf(C16058b.f38679a.mo25465a(str, i));
        }
        m29771a(str, valueOf, z);
        return valueOf.intValue();
    }

    /* renamed from: a */
    public final long mo25489a(String str, long j, boolean z) {
        Long valueOf;
        Object a = m29770a(str, (Class) null);
        if (a != null) {
            return ((Long) a).longValue();
        }
        AbstractC16067f fVar = this.f38695b;
        if (fVar == null || !fVar.mo25501e() || !C16058b.f38679a.mo25479b(str)) {
            valueOf = Long.valueOf(C16057a.f38676a.mo25448a(str, j));
        } else {
            valueOf = Long.valueOf(C16058b.f38679a.mo25466a(str, j));
        }
        m29771a(str, valueOf, z);
        return valueOf.longValue();
    }

    /* renamed from: a */
    private void m29772a(String str, Object obj, boolean z, boolean z2) {
        C16054a.f38674d.mo25444a(str);
        if (z2 || obj == null) {
            return;
        }
        if (z) {
            this.f38699g.put(str, obj);
        } else {
            this.f38700h.put(str, obj);
        }
    }
}
