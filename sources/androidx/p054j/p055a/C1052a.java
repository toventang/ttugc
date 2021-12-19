package androidx.p054j.p055a;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.j.a.a */
public final class C1052a implements AbstractC1068e {

    /* renamed from: a */
    private final String f3690a;

    /* renamed from: b */
    private final Object[] f3691b;

    static {
        Covode.recordClassIndex(1145);
    }

    @Override // androidx.p054j.p055a.AbstractC1068e
    /* renamed from: b */
    public final String mo3778b() {
        return this.f3690a;
    }

    private C1052a(String str) {
        this.f3690a = str;
        this.f3691b = null;
    }

    @Override // androidx.p054j.p055a.AbstractC1068e
    /* renamed from: a */
    public final void mo3777a(AbstractC1067d dVar) {
        long j;
        Object[] objArr = this.f3691b;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    dVar.mo3803a(i);
                } else if (obj instanceof byte[]) {
                    dVar.mo3807a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dVar.mo3804a(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    dVar.mo3804a(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    dVar.mo3805a(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    dVar.mo3805a(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    dVar.mo3805a(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dVar.mo3805a(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    dVar.mo3806a(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    dVar.mo3805a(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }

    public C1052a(String str, byte b) {
        this(str);
    }
}
