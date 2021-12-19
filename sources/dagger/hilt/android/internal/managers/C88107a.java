package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.core.app.ActivityC0580d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.android.internal.p4538a.AbstractC88092a;
import dagger.hilt.android.p4537a.AbstractC88087b;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: dagger.hilt.android.internal.managers.a */
public class C88107a implements AbstractC88084b<Object> {

    /* renamed from: a */
    protected final Activity f200001a;

    /* renamed from: b */
    private volatile Object f200002b;

    /* renamed from: c */
    private final Object f200003c = new Object();

    /* renamed from: d */
    private final AbstractC88084b<AbstractC88087b> f200004d;

    /* renamed from: dagger.hilt.android.internal.managers.a$a */
    public interface AbstractC88108a {
        static {
            Covode.recordClassIndex(104136);
        }

        /* renamed from: a */
        AbstractC88092a mo60002a();
    }

    static {
        Covode.recordClassIndex(104135);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public Object generatedComponent() {
        MethodCollector.m26663i(7625);
        if (this.f200002b == null) {
            synchronized (this.f200003c) {
                try {
                    if (this.f200002b == null) {
                        if (this.f200001a.getApplication() instanceof AbstractC88084b) {
                            this.f200002b = ((AbstractC88108a) this.f200004d.generatedComponent()).mo60002a().mo60004a(this.f200001a).mo60003a();
                        } else if (Application.class.equals(this.f200001a.getApplication().getClass())) {
                            IllegalStateException illegalStateException = new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
                            MethodCollector.m26664o(7625);
                            throw illegalStateException;
                        } else {
                            IllegalStateException illegalStateException2 = new IllegalStateException("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: " + this.f200001a.getApplication().getClass());
                            MethodCollector.m26664o(7625);
                            throw illegalStateException2;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7625);
                    throw th;
                }
            }
        }
        Object obj = this.f200002b;
        MethodCollector.m26664o(7625);
        return obj;
    }

    public C88107a(Activity activity) {
        this.f200001a = activity;
        this.f200004d = new ActivityRetainedComponentManager((ActivityC0580d) activity);
    }
}
