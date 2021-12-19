package okhttp3.internal.p4654b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C90034ae;

/* renamed from: okhttp3.internal.b.d */
public final class C90078d {

    /* renamed from: a */
    private final Set<C90034ae> f204417a = new LinkedHashSet();

    static {
        Covode.recordClassIndex(106250);
    }

    /* renamed from: a */
    public final synchronized void mo144826a(C90034ae aeVar) {
        MethodCollector.m26663i(10446);
        this.f204417a.add(aeVar);
        MethodCollector.m26664o(10446);
    }

    /* renamed from: b */
    public final synchronized void mo144827b(C90034ae aeVar) {
        MethodCollector.m26663i(10606);
        this.f204417a.remove(aeVar);
        MethodCollector.m26664o(10606);
    }

    /* renamed from: c */
    public final synchronized boolean mo144828c(C90034ae aeVar) {
        boolean contains;
        MethodCollector.m26663i(10607);
        contains = this.f204417a.contains(aeVar);
        MethodCollector.m26664o(10607);
        return contains;
    }
}
