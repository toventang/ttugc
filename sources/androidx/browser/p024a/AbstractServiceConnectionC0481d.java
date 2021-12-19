package androidx.browser.p024a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.support.p009a.AbstractC0070b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.browser.a.d */
public abstract class AbstractServiceConnectionC0481d implements ServiceConnection {
    static {
        Covode.recordClassIndex(546);
    }

    /* renamed from: a */
    public abstract void mo2033a(C0471b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC0070b aVar;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0070b)) {
                aVar = new AbstractC0070b.AbstractBinderC0071a.C0072a(iBinder);
            } else {
                aVar = (AbstractC0070b) queryLocalInterface;
            }
        }
        mo2033a(new C0471b(aVar, componentName) {
            /* class androidx.browser.p024a.AbstractServiceConnectionC0481d.C04821 */

            static {
                Covode.recordClassIndex(547);
            }
        });
    }
}
