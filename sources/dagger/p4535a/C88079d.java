package dagger.p4535a;

import com.bytedance.covode.number.Covode;
import dagger.AbstractC88075a;

/* renamed from: dagger.a.d */
public final class C88079d<T> implements AbstractC88075a<T>, AbstractC88078c<T> {

    /* renamed from: a */
    private static final C88079d<Object> f199990a = new C88079d<>(null);

    /* renamed from: b */
    private final T f199991b;

    @Override // javax.p4631a.AbstractC89405a, dagger.AbstractC88075a
    public final T get() {
        return this.f199991b;
    }

    static {
        Covode.recordClassIndex(104105);
    }

    private C88079d(T t) {
        this.f199991b = t;
    }

    /* renamed from: a */
    public static <T> AbstractC88078c<T> m153151a(T t) {
        return new C88079d(C88081f.m153153a(t, "instance cannot be null"));
    }
}
