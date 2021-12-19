package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.AbstractC25603e;

/* renamed from: com.google.android.gms.measurement.internal.eb */
public final class C26350eb extends AbstractC26400fy {

    /* renamed from: a */
    char f61825a;

    /* renamed from: b */
    long f61826b = -1;

    /* renamed from: c */
    public final C26353ee f61827c = new C26353ee(this, 6, false, false);

    /* renamed from: d */
    public final C26353ee f61828d = new C26353ee(this, 6, true, false);

    /* renamed from: e */
    public final C26353ee f61829e = new C26353ee(this, 6, false, true);

    /* renamed from: f */
    public final C26353ee f61830f = new C26353ee(this, 5, false, false);

    /* renamed from: g */
    public final C26353ee f61831g = new C26353ee(this, 5, true, false);

    /* renamed from: h */
    public final C26353ee f61832h = new C26353ee(this, 5, false, true);

    /* renamed from: i */
    public final C26353ee f61833i = new C26353ee(this, 4, false, false);

    /* renamed from: j */
    public final C26353ee f61834j = new C26353ee(this, 3, false, false);

    /* renamed from: k */
    public final C26353ee f61835k = new C26353ee(this, 2, false, false);

    /* renamed from: l */
    private String f61836l;

    static {
        Covode.recordClassIndex(31772);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26400fy
    /* renamed from: d */
    public final boolean mo43065d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo42999b() {
        super.mo42999b();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43002c() {
        super.mo43002c();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C26483j mo43010k() {
        return super.mo43010k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC25603e mo43011l() {
        return super.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43012m() {
        return super.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C26347dz mo43013n() {
        return super.mo43013n();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C26510jz mo43014o() {
        return super.mo43014o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C26372ex mo43015p() {
        return super.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26350eb mo43016q() {
        return super.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C26361em mo43017r() {
        return super.mo43017r();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C26524km mo43018s() {
        return super.mo43018s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C26523kl mo43019t() {
        return super.mo43019t();
    }

    /* renamed from: f */
    private final String m51695f() {
        String str;
        String str2;
        MethodCollector.m26663i(5306);
        synchronized (this) {
            try {
                if (this.f61836l == null) {
                    if (this.f62077z.f61999c != null) {
                        str2 = this.f62077z.f61999c;
                    } else {
                        mo43018s().mo43019t();
                        str2 = "FA";
                    }
                    this.f61836l = str2;
                }
                str = this.f61836l;
            } finally {
                MethodCollector.m26664o(5306);
            }
        }
        return str;
    }

    /* renamed from: e */
    public final String mo43118e() {
        Pair<String, Long> a = mo43017r().f61903c.mo43207a();
        if (a == null || a == C26361em.f61898a) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
    }

    /* renamed from: a */
    protected static Object m51691a(String str) {
        if (str == null) {
            return null;
        }
        return new C26352ed(str);
    }

    /* renamed from: b */
    private static String m51694b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo43117a(int i) {
        return Log.isLoggable(m51695f(), i);
    }

    C26350eb(C26381ff ffVar) {
        super(ffVar);
    }

    /* renamed from: a */
    private static String m51692a(boolean z, Object obj) {
        String th;
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return new StringBuilder(str.length() + 43 + str.length()).append(str).append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)))).append("...").append(str).append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d)).toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                if (z) {
                    th = th2.getClass().getName();
                } else {
                    th = th2.toString();
                }
                StringBuilder sb = new StringBuilder(th);
                String b = m51694b(C26381ff.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m51694b(className).equals(b)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof C26352ed) {
                return ((C26352ed) obj).f61870a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: a */
    static String m51693a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = m51692a(z, obj);
        String a2 = m51692a(z, obj2);
        String a3 = m51692a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43116a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        int i2 = i;
        if (!z && mo43117a(i2)) {
            m51693a(false, str, obj, obj2, obj3);
        }
        if (!z2 && i2 >= 5) {
            C25565r.m49314a((Object) str);
            C26372ex exVar = this.f62077z.f62003g;
            if (exVar != null && exVar.mo43287w()) {
                if (i2 < 0) {
                    i2 = 0;
                } else if (i2 >= 9) {
                    i2 = 8;
                }
                exVar.mo43220a(new RunnableC26349ea(this, i2, str, obj, obj2, obj3));
            }
        }
    }
}
