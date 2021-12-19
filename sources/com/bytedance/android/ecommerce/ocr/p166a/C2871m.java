package com.bytedance.android.ecommerce.ocr.p166a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.ocr.a.m */
public class C2871m implements Comparable<C2871m> {

    /* renamed from: a */
    public final int f8535a;

    /* renamed from: b */
    public final int f8536b;

    static {
        Covode.recordClassIndex(3297);
    }

    public int hashCode() {
        return (this.f8535a * 31) + this.f8536b;
    }

    /* renamed from: a */
    public final C2871m mo7462a() {
        return new C2871m(this.f8536b, this.f8535a);
    }

    public String toString() {
        return this.f8535a + "x" + this.f8536b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C2871m mVar) {
        C2871m mVar2 = mVar;
        int i = this.f8536b * this.f8535a;
        int i2 = mVar2.f8536b * mVar2.f8535a;
        if (i2 < i) {
            return 1;
        }
        if (i2 > i) {
            return -1;
        }
        return 0;
    }

    /* renamed from: a */
    public final C2871m mo7463a(C2871m mVar) {
        if (this.f8535a * mVar.f8536b >= mVar.f8535a * this.f8536b) {
            int i = mVar.f8535a;
            return new C2871m(i, (this.f8536b * i) / this.f8535a);
        }
        int i2 = this.f8535a;
        int i3 = mVar.f8536b;
        return new C2871m((i2 * i3) / this.f8536b, i3);
    }

    /* renamed from: b */
    public final C2871m mo7464b(C2871m mVar) {
        if (this.f8535a * mVar.f8536b <= mVar.f8535a * this.f8536b) {
            int i = mVar.f8535a;
            return new C2871m(i, (this.f8536b * i) / this.f8535a);
        }
        int i2 = this.f8535a;
        int i3 = mVar.f8536b;
        return new C2871m((i2 * i3) / this.f8536b, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2871m mVar = (C2871m) obj;
            if (this.f8535a == mVar.f8535a && this.f8536b == mVar.f8536b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C2871m(int i, int i2) {
        this.f8535a = i;
        this.f8536b = i2;
    }
}
