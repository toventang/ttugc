package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.NoSuchElementException;

/* renamed from: com.google.c.c.b */
public abstract class AbstractC27451b<T> extends AbstractC27479br<T> {

    /* renamed from: a */
    private EnumC27453a f64758a = EnumC27453a.NOT_READY;

    /* renamed from: b */
    private T f64759b;

    static {
        Covode.recordClassIndex(33031);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo45699a();

    protected AbstractC27451b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo45815b() {
        this.f64758a = EnumC27453a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f64758a = EnumC27453a.NOT_READY;
            T t = this.f64759b;
            this.f64759b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.b$1 */
    public static /* synthetic */ class C274521 {

        /* renamed from: a */
        static final /* synthetic */ int[] f64760a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 33032(0x8108, float:4.6288E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.c.c.b$a[] r0 = com.google.p1998c.p2001c.AbstractC27451b.EnumC27453a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.google.p1998c.p2001c.AbstractC27451b.C274521.f64760a = r2
                com.google.c.c.b$a r0 = com.google.p1998c.p2001c.AbstractC27451b.EnumC27453a.DONE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.google.p1998c.p2001c.AbstractC27451b.C274521.f64760a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.c.c.b$a r0 = com.google.p1998c.p2001c.AbstractC27451b.EnumC27453a.READY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2001c.AbstractC27451b.C274521.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.b$a */
    public enum EnumC27453a {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        static {
            Covode.recordClassIndex(33033);
        }
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f64758a != EnumC27453a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54243b(z);
        int i = C274521.f64760a[this.f64758a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        this.f64758a = EnumC27453a.FAILED;
        this.f64759b = mo45699a();
        if (this.f64758a == EnumC27453a.DONE) {
            return false;
        }
        this.f64758a = EnumC27453a.READY;
        return true;
    }
}
