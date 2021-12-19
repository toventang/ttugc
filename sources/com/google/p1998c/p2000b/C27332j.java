package com.google.p1998c.p2000b;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2000b.AbstractC27342o;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.google.c.b.j */
final class C27332j extends AbstractC27342o implements AbstractC27327h, Serializable {
    private static final long serialVersionUID = 7249069246863182397L;

    static {
        Covode.recordClassIndex(32912);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2000b.AbstractC27342o
    /* renamed from: a */
    public final long mo45511a(long j, long j2) {
        return j + j2;
    }

    @Override // com.google.p1998c.p2000b.AbstractC27327h
    /* renamed from: a */
    public final void mo45509a() {
        mo45510a(1);
    }

    public final double doubleValue() {
        return (double) m54590d();
    }

    public final float floatValue() {
        return (float) m54590d();
    }

    public final int intValue() {
        return (int) m54590d();
    }

    public final long longValue() {
        return m54590d();
    }

    public final String toString() {
        return Long.toString(m54590d());
    }

    /* renamed from: d */
    private long m54590d() {
        long j = this.f64614e;
        AbstractC27342o.C27344a[] aVarArr = this.f64613d;
        if (aVarArr != null) {
            for (AbstractC27342o.C27344a aVar : aVarArr) {
                if (aVar != null) {
                    j += aVar.f64618a;
                }
            }
        }
        return j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f64615f = 0;
        this.f64613d = null;
        this.f64614e = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(m54590d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a3, code lost:
        if (r13.f64613d != r7) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a5, code lost:
        r2 = new com.google.p1998c.p2000b.AbstractC27342o.C27344a[(r8 << 1)];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00aa, code lost:
        r2[r1] = r7[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b0, code lost:
        if (r1 >= r8) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b3, code lost:
        r13.f64613d = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0035 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0035 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0105 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x006d A[SYNTHETIC] */
    @Override // com.google.p1998c.p2000b.AbstractC27327h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45510a(long r14) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2000b.C27332j.mo45510a(long):void");
    }
}
