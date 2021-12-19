package androidx.p053i;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.i.h */
public final class C1034h<T> {

    /* renamed from: a */
    static final C1034h f3627a = new C1034h(Collections.emptyList());

    /* renamed from: b */
    static final C1034h f3628b = new C1034h(Collections.emptyList());

    /* renamed from: c */
    public final List<T> f3629c;

    /* renamed from: d */
    public final int f3630d;

    /* renamed from: e */
    public final int f3631e;

    /* renamed from: f */
    public final int f3632f;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.i.h$a */
    public static abstract class AbstractC1035a<T> {
        static {
            Covode.recordClassIndex(1128);
        }

        /* renamed from: a */
        public abstract void mo3714a(int i, C1034h<T> hVar);

        AbstractC1035a() {
        }
    }

    static {
        Covode.recordClassIndex(1127);
    }

    public final String toString() {
        return "Result " + this.f3630d + ", " + this.f3629c + ", " + this.f3631e + ", offset " + this.f3632f;
    }

    C1034h(List<T> list) {
        this.f3629c = list;
        this.f3632f = 0;
    }

    C1034h(List<T> list, int i, int i2) {
        this.f3629c = list;
        this.f3630d = 0;
        this.f3631e = i;
        this.f3632f = 0;
    }
}
