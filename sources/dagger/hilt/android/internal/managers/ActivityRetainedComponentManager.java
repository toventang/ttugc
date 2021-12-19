package dagger.hilt.android.internal.managers;

import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.android.internal.p4538a.AbstractC88093b;
import dagger.hilt.android.p4537a.AbstractC88087b;
import dagger.hilt.p4536a.AbstractC88084b;

/* access modifiers changed from: package-private */
public final class ActivityRetainedComponentManager implements AbstractC88084b<AbstractC88087b> {

    /* renamed from: a */
    private final C1175ad f199995a;

    /* renamed from: b */
    private volatile AbstractC88087b f199996b;

    /* renamed from: c */
    private final Object f199997c = new Object();

    /* renamed from: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager$a */
    public interface AbstractC88106a {
        static {
            Covode.recordClassIndex(104134);
        }

        /* renamed from: a */
        AbstractC88093b mo60000a();
    }

    static {
        Covode.recordClassIndex(104131);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AbstractC88087b generatedComponent() {
        MethodCollector.m26663i(7460);
        if (this.f199996b == null) {
            synchronized (this.f199997c) {
                try {
                    if (this.f199996b == null) {
                        this.f199996b = ((ActivityRetainedComponentViewModel) this.f199995a.mo3983a(ActivityRetainedComponentViewModel.class)).f200000a;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7460);
                    throw th;
                }
            }
        }
        AbstractC88087b bVar = this.f199996b;
        MethodCollector.m26664o(7460);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class ActivityRetainedComponentViewModel extends AbstractC1174ac {

        /* renamed from: a */
        public final AbstractC88087b f200000a;

        static {
            Covode.recordClassIndex(104133);
        }

        ActivityRetainedComponentViewModel(AbstractC88087b bVar) {
            this.f200000a = bVar;
        }
    }

    ActivityRetainedComponentManager(final ActivityC0580d dVar) {
        this.f199995a = new C1175ad((AbstractC1183ag) dVar, new C1175ad.AbstractC1177b() {
            /* class dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.C881051 */

            static {
                Covode.recordClassIndex(104132);
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                return new ActivityRetainedComponentViewModel(((AbstractC88106a) ((AbstractC88084b) dVar.getApplication()).generatedComponent()).mo60000a().mo60001a());
            }
        });
    }
}
