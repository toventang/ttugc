package androidx.core.p037h.p038a;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.a.c */
public final class C0730c {

    /* renamed from: androidx.core.h.a.c$a */
    public interface AbstractC0731a {
        static {
            Covode.recordClassIndex(812);
        }

        /* renamed from: a */
        void mo2824a(boolean z);
    }

    static {
        Covode.recordClassIndex(811);
    }

    /* renamed from: androidx.core.h.a.c$b  reason: invalid class name */
    public static final class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0732b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final AbstractC0731a f2835a;

        static {
            Covode.recordClassIndex(813);
        }

        public final int hashCode() {
            return this.f2835a.hashCode();
        }

        public accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0732b(AbstractC0731a aVar) {
            this.f2835a = aVar;
        }

        public final void onTouchExplorationStateChanged(boolean z) {
            this.f2835a.mo2824a(z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0732b)) {
                return false;
            }
            return this.f2835a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0732b) obj).f2835a);
        }
    }

    /* renamed from: a */
    public static boolean m2593a(AccessibilityManager accessibilityManager, AbstractC0731a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0732b(aVar));
    }
}
