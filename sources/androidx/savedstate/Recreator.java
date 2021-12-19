package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.savedstate.C1545a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class Recreator implements AbstractC1192f {

    /* renamed from: a */
    private final AbstractC1549c f5084a;

    static {
        Covode.recordClassIndex(1684);
    }

    public Recreator(AbstractC1549c cVar) {
        this.f5084a = cVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            mVar.getLifecycle().mo4013b(this);
            C1545a a = this.f5084a.mo368a();
            if (!a.f5088c) {
                throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            } else if (a.f5087b != null) {
                Bundle bundle = a.f5087b.getBundle("androidx.savedstate.Restarter");
                a.f5087b.remove("androidx.savedstate.Restarter");
                if (a.f5087b.isEmpty()) {
                    a.f5087b = null;
                }
                if (bundle != null) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            try {
                                Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C1545a.AbstractC1546a.class);
                                try {
                                    Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        declaredConstructor.newInstance(new Object[0]);
                                    } catch (Exception e) {
                                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(next)), e);
                                    }
                                } catch (NoSuchMethodException e2) {
                                    throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                }
                            } catch (ClassNotFoundException e3) {
                                throw new RuntimeException("Class " + next + " wasn't found", e3);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
            }
        } else {
            throw new AssertionError("Next event must be ON_CREATE");
        }
    }
}
