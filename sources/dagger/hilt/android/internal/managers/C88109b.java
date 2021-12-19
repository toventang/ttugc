package dagger.hilt.android.internal.managers;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: dagger.hilt.android.internal.managers.b */
public final class C88109b implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile Object f200005a;

    /* renamed from: b */
    private final Object f200006b = new Object();

    /* renamed from: c */
    private final AbstractC88112d f200007c;

    static {
        Covode.recordClassIndex(104137);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        MethodCollector.m26663i(9830);
        if (this.f200005a == null) {
            synchronized (this.f200006b) {
                try {
                    if (this.f200005a == null) {
                        this.f200005a = this.f200007c.mo60036a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9830);
                    throw th;
                }
            }
        }
        Object obj = this.f200005a;
        MethodCollector.m26664o(9830);
        return obj;
    }

    public C88109b(AbstractC88112d dVar) {
        this.f200007c = dVar;
    }
}
