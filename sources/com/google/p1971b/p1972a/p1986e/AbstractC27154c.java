package com.google.p1971b.p1972a.p1986e;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import com.google.p1971b.p1972a.p1993g.C27174d;
import com.google.p1971b.p1972a.p1993g.C27178f;
import com.google.p1971b.p1972a.p1993g.C27179g;
import com.google.p1971b.p1972a.p1993g.C27183h;
import com.google.p1971b.p1972a.p1993g.C27184i;
import com.google.p1971b.p1972a.p1993g.C27185j;
import com.google.p1971b.p1972a.p1993g.C27192n;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.b.a.e.c */
public abstract class AbstractC27154c {
    static {
        Covode.recordClassIndex(32734);
    }

    /* renamed from: a */
    public abstract void mo45198a();

    /* renamed from: a */
    public abstract void mo45199a(double d);

    /* renamed from: a */
    public abstract void mo45200a(float f);

    /* renamed from: a */
    public abstract void mo45201a(int i);

    /* renamed from: a */
    public abstract void mo45202a(long j);

    /* renamed from: a */
    public abstract void mo45203a(String str);

    /* renamed from: a */
    public abstract void mo45204a(BigDecimal bigDecimal);

    /* renamed from: a */
    public abstract void mo45205a(BigInteger bigInteger);

    /* renamed from: a */
    public abstract void mo45206a(boolean z);

    /* renamed from: b */
    public abstract void mo45207b();

    /* renamed from: b */
    public abstract void mo45208b(String str);

    /* renamed from: c */
    public abstract void mo45209c();

    /* renamed from: d */
    public abstract void mo45210d();

    /* renamed from: e */
    public abstract void mo45211e();

    /* renamed from: f */
    public abstract void mo45212f();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo45213a(boolean z, Object obj) {
        boolean z2;
        Map gVar;
        Field field;
        boolean z3;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (C27178f.m54015a(obj)) {
                mo45212f();
            } else if (obj instanceof String) {
                mo45208b((String) obj);
            } else {
                boolean z4 = true;
                if (obj instanceof Number) {
                    if (z) {
                        mo45208b(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        mo45204a((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        mo45205a((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        mo45202a(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z4 = false;
                        }
                        C27159b.m53983a(z4);
                        mo45200a(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        mo45201a(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z4 = false;
                        }
                        C27159b.m53983a(z4);
                        mo45199a(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    mo45206a(((Boolean) obj).booleanValue());
                } else if (obj instanceof C27183h) {
                    mo45208b(((C27183h) obj).toStringRfc3339());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    mo45207b();
                    for (Object obj2 : C27192n.m54037a(obj)) {
                        mo45213a(z, obj2);
                    }
                    mo45209c();
                } else if (cls.isEnum()) {
                    String str = C27184i.m54022a((Enum<?>) ((Enum) obj)).f64367c;
                    if (str == null) {
                        mo45212f();
                    } else {
                        mo45208b(str);
                    }
                } else {
                    mo45210d();
                    boolean z5 = obj instanceof Map;
                    if (!z5 || (obj instanceof C27185j)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C27174d dVar = null;
                    if (!z2) {
                        dVar = C27174d.m54007a(cls, false);
                    }
                    if (C27178f.m54015a(obj)) {
                        gVar = Collections.emptyMap();
                    } else if (z5) {
                        gVar = (Map) obj;
                    } else {
                        gVar = new C27179g(obj, false);
                    }
                    for (Map.Entry entry : gVar.entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) entry.getKey();
                            if (z2) {
                                z3 = z;
                            } else {
                                C27184i a = dVar.mo45245a(str2);
                                if (a == null || (field = a.f64366b) == null || field.getAnnotation(AbstractC27157e.class) == null) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            }
                            mo45203a(str2);
                            mo45213a(z3, value);
                        }
                    }
                    mo45211e();
                }
            }
        }
    }
}
