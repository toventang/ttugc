package androidx.constraintlayout.p026a;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.constraintlayout.a.g */
final class C0542g {

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.a.g$a */
    public interface AbstractC0543a<T> {
        static {
            Covode.recordClassIndex(610);
        }

        /* renamed from: a */
        T mo2382a();

        /* renamed from: a */
        void mo2383a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo2384a(T t);
    }

    static {
        Covode.recordClassIndex(609);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.a.g$b */
    public static class C0544b<T> implements AbstractC0543a<T> {

        /* renamed from: a */
        private final Object[] f2183a = new Object[256];

        /* renamed from: b */
        private int f2184b;

        static {
            Covode.recordClassIndex(611);
        }

        C0544b() {
        }

        @Override // androidx.constraintlayout.p026a.C0542g.AbstractC0543a
        /* renamed from: a */
        public final T mo2382a() {
            int i = this.f2184b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f2183a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f2184b = i - 1;
            return t;
        }

        @Override // androidx.constraintlayout.p026a.C0542g.AbstractC0543a
        /* renamed from: a */
        public final boolean mo2384a(T t) {
            int i = this.f2184b;
            Object[] objArr = this.f2183a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2184b = i + 1;
            return true;
        }

        @Override // androidx.constraintlayout.p026a.C0542g.AbstractC0543a
        /* renamed from: a */
        public final void mo2383a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f2184b;
                Object[] objArr = this.f2183a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f2184b = i3 + 1;
                }
            }
        }
    }
}
