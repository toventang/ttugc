package p4600h;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: h.d */
public final class C89136d<T> implements AbstractC89244h<T>, Serializable {

    /* renamed from: a */
    private final T f202846a;

    static {
        Covode.recordClassIndex(105220);
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        return true;
    }

    @Override // p4600h.AbstractC89244h
    public final T getValue() {
        return this.f202846a;
    }

    public final String toString() {
        return String.valueOf(getValue());
    }

    public C89136d(T t) {
        this.f202846a = t;
    }
}
