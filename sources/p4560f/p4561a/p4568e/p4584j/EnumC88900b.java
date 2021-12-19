package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: f.a.e.j.b */
public enum EnumC88900b implements AbstractC88434g<Object, List<Object>>, Callable<List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> AbstractC88434g<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // java.util.concurrent.Callable
    public final List<Object> call() {
        return new ArrayList();
    }

    static {
        Covode.recordClassIndex(104942);
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final List<Object> apply(Object obj) {
        return new ArrayList();
    }
}
