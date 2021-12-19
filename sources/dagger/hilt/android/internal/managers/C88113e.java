package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.android.internal.managers.C88116g;
import dagger.hilt.android.internal.p4538a.AbstractC88095d;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;

/* renamed from: dagger.hilt.android.internal.managers.e */
public final class C88113e implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile Object f200011a;

    /* renamed from: b */
    private final Object f200012b = new Object();

    /* renamed from: c */
    private final Fragment f200013c;

    /* renamed from: dagger.hilt.android.internal.managers.e$a */
    public interface AbstractC88114a {
        static {
            Covode.recordClassIndex(104142);
        }

        /* renamed from: k */
        AbstractC88095d mo60017k();
    }

    static {
        Covode.recordClassIndex(104141);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        MethodCollector.m26663i(7297);
        if (this.f200011a == null) {
            synchronized (this.f200012b) {
                try {
                    if (this.f200011a == null) {
                        if (this.f200013c.getHost() != null) {
                            C88085c.m153156a(this.f200013c.getHost() instanceof AbstractC88084b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f200013c.getHost().getClass());
                            this.f200011a = ((AbstractC88114a) ((AbstractC88084b) this.f200013c.getHost()).generatedComponent()).mo60017k().mo60023a(this.f200013c).mo60022a();
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("Hilt Fragments must be attached before creating the component.");
                            MethodCollector.m26664o(7297);
                            throw nullPointerException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7297);
                    throw th;
                }
            }
        }
        Object obj = this.f200011a;
        MethodCollector.m26664o(7297);
        return obj;
    }

    public C88113e(Fragment fragment) {
        this.f200013c = fragment;
    }

    /* renamed from: a */
    public static final Context m153183a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: a */
    public static ContextWrapper m153184a(Context context, Fragment fragment) {
        return new C88116g.C88117a(context, fragment);
    }

    /* renamed from: a */
    public static ContextWrapper m153185a(LayoutInflater layoutInflater, Fragment fragment) {
        return new C88116g.C88117a(layoutInflater, fragment);
    }
}
