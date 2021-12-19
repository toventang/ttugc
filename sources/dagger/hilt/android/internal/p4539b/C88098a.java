package dagger.hilt.android.internal.p4539b;

import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.covode.number.Covode;
import dagger.hilt.C88082a;
import java.util.Set;

/* renamed from: dagger.hilt.android.internal.b.a */
public final class C88098a {

    /* renamed from: dagger.hilt.android.internal.b.a$a */
    public interface AbstractC88099a {
        static {
            Covode.recordClassIndex(104125);
        }

        /* renamed from: i */
        Set<C1175ad.AbstractC1177b> mo60015i();
    }

    /* renamed from: dagger.hilt.android.internal.b.a$b */
    public interface AbstractC88100b {
        static {
            Covode.recordClassIndex(104126);
        }

        /* renamed from: a */
        Set<C1175ad.AbstractC1177b> mo60021a();
    }

    static {
        Covode.recordClassIndex(104124);
    }

    /* renamed from: a */
    public static C1175ad.AbstractC1177b m153168a(ActivityC0580d dVar) {
        return m153170a(((AbstractC88099a) C88082a.m153154a(dVar, AbstractC88099a.class)).mo60015i());
    }

    /* renamed from: a */
    public static C1175ad.AbstractC1177b m153169a(AbstractC12748a aVar) {
        return m153170a(((AbstractC88100b) C88082a.m153154a(aVar, AbstractC88100b.class)).mo60021a());
    }

    /* renamed from: a */
    private static C1175ad.AbstractC1177b m153170a(Set<C1175ad.AbstractC1177b> set) {
        if (set.isEmpty()) {
            return null;
        }
        if (set.size() <= 1) {
            C1175ad.AbstractC1177b next = set.iterator().next();
            if (next != null) {
                return next;
            }
            throw new IllegalStateException("Default view model factory must not be null.");
        }
        throw new IllegalStateException("At most one default view model factory is expected. Found ".concat(String.valueOf(set)));
    }
}
