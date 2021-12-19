package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.C27921a;
import com.google.gson.internal.C27997f;
import java.math.BigInteger;

/* renamed from: com.google.gson.r */
public final class C28025r extends AbstractC28019l {

    /* renamed from: b */
    private static final Class<?>[] f65805b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    public Object f65806a;

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC28019l mo46697i() {
        return this;
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: c */
    public final String mo46689c() {
        Object obj = this.f65806a;
        if (obj instanceof Number) {
            return mo46688b().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: d */
    public final double mo46690d() {
        if (this.f65806a instanceof Number) {
            return mo46688b().doubleValue();
        }
        return Double.parseDouble(mo46689c());
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: e */
    public final float mo46691e() {
        if (this.f65806a instanceof Number) {
            return mo46688b().floatValue();
        }
        return Float.parseFloat(mo46689c());
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: f */
    public final long mo46693f() {
        if (this.f65806a instanceof Number) {
            return mo46688b().longValue();
        }
        return Long.parseLong(mo46689c());
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: g */
    public final int mo46694g() {
        if (this.f65806a instanceof Number) {
            return mo46688b().intValue();
        }
        return Integer.parseInt(mo46689c());
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: h */
    public final boolean mo46695h() {
        Object obj = this.f65806a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(mo46689c());
    }

    @Override // com.google.gson.AbstractC28019l
    /* renamed from: b */
    public final Number mo46688b() {
        Object obj = this.f65806a;
        if (obj instanceof String) {
            return new C27997f((String) this.f65806a);
        }
        return (Number) obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f65806a == null) {
            return 31;
        }
        if (m56141a(this)) {
            doubleToLongBits = mo46688b().longValue();
        } else {
            Object obj = this.f65806a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo46688b().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    static {
        Covode.recordClassIndex(33638);
    }

    public C28025r(Boolean bool) {
        m56140a(bool);
    }

    public C28025r(Number number) {
        m56140a(number);
    }

    C28025r(Object obj) {
        m56140a(obj);
    }

    /* renamed from: a */
    private static boolean m56141a(C28025r rVar) {
        Object obj = rVar.f65806a;
        if (!(obj instanceof Number)) {
            return false;
        }
        if ((obj instanceof BigInteger) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m56142b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f65805b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public C28025r(String str) {
        m56140a(str);
    }

    /* renamed from: a */
    private void m56140a(Object obj) {
        boolean z;
        if (obj instanceof Character) {
            this.f65806a = String.valueOf(((Character) obj).charValue());
            return;
        }
        if ((obj instanceof Number) || m56142b(obj)) {
            z = true;
        } else {
            z = false;
        }
        C27921a.m55969a(z);
        this.f65806a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28025r rVar = (C28025r) obj;
        if (this.f65806a == null) {
            if (rVar.f65806a == null) {
                return true;
            }
            return false;
        } else if (!m56141a(this) || !m56141a(rVar)) {
            Object obj2 = this.f65806a;
            if (!(obj2 instanceof Number) || !(rVar.f65806a instanceof Number)) {
                return obj2.equals(rVar.f65806a);
            }
            double doubleValue = mo46688b().doubleValue();
            double doubleValue2 = rVar.mo46688b().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                return true;
            }
            return false;
        } else if (mo46688b().longValue() == rVar.mo46688b().longValue()) {
            return true;
        } else {
            return false;
        }
    }
}
