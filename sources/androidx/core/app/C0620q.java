package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.q */
public final class C0620q implements Iterable<Intent> {

    /* renamed from: a */
    public final ArrayList<Intent> f2618a = new ArrayList<>();

    /* renamed from: b */
    public final Context f2619b;

    /* renamed from: androidx.core.app.q$a */
    public interface AbstractC0621a {
        static {
            Covode.recordClassIndex(699);
        }

        Intent getSupportParentActivityIntent();
    }

    static {
        Covode.recordClassIndex(698);
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.f2618a.iterator();
    }

    public C0620q(Context context) {
        this.f2619b = context;
    }

    /* renamed from: a */
    public final C0620q mo2650a(ComponentName componentName) {
        int size = this.f2618a.size();
        try {
            Intent a = C0593g.m2226a(this.f2619b, componentName);
            while (a != null) {
                this.f2618a.add(size, a);
                a = C0593g.m2226a(this.f2619b, a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
