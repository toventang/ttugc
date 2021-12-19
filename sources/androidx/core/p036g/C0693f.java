package androidx.core.p036g;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.g.f */
public final class C0693f {

    /* renamed from: androidx.core.g.f$a */
    public interface AbstractC0694a<T> {
        static {
            Covode.recordClassIndex(773);
        }

        T acquire();

        boolean release(T t);
    }

    static {
        Covode.recordClassIndex(772);
    }

    /* renamed from: androidx.core.g.f$c */
    public static class C0696c<T> extends C0695b<T> {

        /* renamed from: a */
        private final Object f2754a = new Object();

        static {
            Covode.recordClassIndex(775);
        }

        @Override // androidx.core.p036g.C0693f.C0695b, androidx.core.p036g.C0693f.AbstractC0694a
        public T acquire() {
            T t;
            synchronized (this.f2754a) {
                t = (T) super.acquire();
            }
            return t;
        }

        public C0696c(int i) {
            super(i);
        }

        @Override // androidx.core.p036g.C0693f.C0695b, androidx.core.p036g.C0693f.AbstractC0694a
        public boolean release(T t) {
            boolean release;
            synchronized (this.f2754a) {
                release = super.release(t);
            }
            return release;
        }
    }

    /* renamed from: androidx.core.g.f$b */
    public static class C0695b<T> implements AbstractC0694a<T> {

        /* renamed from: a */
        private final Object[] f2752a;

        /* renamed from: b */
        private int f2753b;

        static {
            Covode.recordClassIndex(774);
        }

        @Override // androidx.core.p036g.C0693f.AbstractC0694a
        public T acquire() {
            int i = this.f2753b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f2752a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f2753b = i - 1;
            return t;
        }

        public C0695b(int i) {
            if (i > 0) {
                this.f2752a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        @Override // androidx.core.p036g.C0693f.AbstractC0694a
        public boolean release(T t) {
            int i = 0;
            while (true) {
                int i2 = this.f2753b;
                if (i >= i2) {
                    Object[] objArr = this.f2752a;
                    if (i2 >= objArr.length) {
                        return false;
                    }
                    objArr[i2] = t;
                    this.f2753b = i2 + 1;
                    return true;
                } else if (this.f2752a[i] == t) {
                    throw new IllegalStateException("Already in the pool!");
                } else {
                    i++;
                }
            }
        }
    }
}
