package dagger.hilt.android.internal.managers;

import android.content.Context;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.android.internal.p4538a.AbstractC88094c;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: dagger.hilt.android.internal.managers.c */
public final class C88110c implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile Object f200008a;

    /* renamed from: b */
    private final Object f200009b = new Object();

    /* renamed from: c */
    private final AbstractC12748a f200010c;

    /* renamed from: dagger.hilt.android.internal.managers.c$a */
    public interface AbstractC88111a {
        static {
            Covode.recordClassIndex(104139);
        }

        /* renamed from: j */
        AbstractC88094c mo60016j();
    }

    static {
        Covode.recordClassIndex(104138);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        MethodCollector.m26663i(4218);
        if (this.f200008a == null) {
            synchronized (this.f200009b) {
                try {
                    if (this.f200008a == null) {
                        Context az_ = this.f200010c.az_();
                        C88085c.m153156a(az_ instanceof AbstractC88084b, "Hilt Assems must be attached to an @AndroidEntryPoint Activity. Found: %s", az_.getClass());
                        this.f200008a = ((AbstractC88111a) ((AbstractC88084b) this.f200010c.az_()).generatedComponent()).mo60016j().mo60020a(this.f200010c).mo60019a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4218);
                    throw th;
                }
            }
        }
        Object obj = this.f200008a;
        MethodCollector.m26664o(4218);
        return obj;
    }

    public C88110c(AbstractC12748a aVar) {
        this.f200010c = aVar;
    }
}
