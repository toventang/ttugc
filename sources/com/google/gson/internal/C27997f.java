package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;

/* renamed from: com.google.gson.internal.f */
public final class C27997f extends Number {

    /* renamed from: a */
    private final String f65767a;

    static {
        Covode.recordClassIndex(33610);
    }

    public final String toString() {
        return this.f65767a;
    }

    private Object writeReplace() {
        return new BigDecimal(this.f65767a);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f65767a);
    }

    public final float floatValue() {
        return Float.parseFloat(this.f65767a);
    }

    public final int hashCode() {
        return this.f65767a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r3.f65767a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        return new java.math.BigDecimal(r3.f65767a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f65767a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r3.f65767a     // Catch:{ NumberFormatException -> 0x000f }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r1     // Catch:{ NumberFormatException -> 0x000f }
            return r0
        L_0x000f:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r0 = r3.f65767a
            r1.<init>(r0)
            int r0 = r1.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C27997f.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f65767a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f65767a).longValue();
        }
    }

    public C27997f(String str) {
        this.f65767a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27997f)) {
            return false;
        }
        String str = this.f65767a;
        String str2 = ((C27997f) obj).f65767a;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }
}
