package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.c.a.b */
public abstract class AbstractC27227b<T> implements Iterator<T> {

    /* renamed from: a */
    private EnumC27229a f64386a = EnumC27229a.NOT_READY;

    /* renamed from: b */
    private T f64387b;

    static {
        Covode.recordClassIndex(32807);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo45310a();

    protected AbstractC27227b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo45311b() {
        this.f64386a = EnumC27229a.DONE;
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f64386a = EnumC27229a.NOT_READY;
            T t = this.f64387b;
            this.f64387b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.a.b$1 */
    public static /* synthetic */ class C272281 {

        /* renamed from: a */
        static final /* synthetic */ int[] f64388a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 32808(0x8028, float:4.5974E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.c.a.b$a[] r0 = com.google.p1998c.p1999a.AbstractC27227b.EnumC27229a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.google.p1998c.p1999a.AbstractC27227b.C272281.f64388a = r2
                com.google.c.a.b$a r0 = com.google.p1998c.p1999a.AbstractC27227b.EnumC27229a.READY     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.google.p1998c.p1999a.AbstractC27227b.C272281.f64388a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.c.a.b$a r0 = com.google.p1998c.p1999a.AbstractC27227b.EnumC27229a.DONE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p1999a.AbstractC27227b.C272281.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.a.b$a */
    public enum EnumC27229a {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        static {
            Covode.recordClassIndex(32809);
        }
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f64386a != EnumC27229a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54243b(z);
        int i = C272281.f64388a[this.f64386a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            this.f64386a = EnumC27229a.FAILED;
            this.f64387b = mo45310a();
            if (this.f64386a != EnumC27229a.DONE) {
                this.f64386a = EnumC27229a.READY;
                return true;
            }
        }
        return false;
    }
}
