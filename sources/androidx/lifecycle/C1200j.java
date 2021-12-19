package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.j */
final class C1200j {

    /* renamed from: a */
    static AtomicBoolean f3987a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    static class C1201a extends C1189c {
        static {
            Covode.recordClassIndex(1308);
        }

        @Override // androidx.lifecycle.C1189c
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C1189c
        public final void onActivityStopped(Activity activity) {
        }

        C1201a() {
        }

        @Override // androidx.lifecycle.C1189c
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC1220x.m3926a(activity);
        }
    }

    static {
        Covode.recordClassIndex(1307);
    }
}
