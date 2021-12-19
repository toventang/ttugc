package androidx.core.p037h.p038a;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: androidx.core.h.a.e */
public final class C0737e {

    /* renamed from: a */
    public final Object f2883a;

    static {
        Covode.recordClassIndex(818);
    }

    public C0737e() {
        int i = Build.VERSION.SDK_INT;
        this.f2883a = new C0739b(this);
    }

    /* renamed from: androidx.core.h.a.e$b */
    static class C0739b extends C0738a {
        static {
            Covode.recordClassIndex(820);
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            return null;
        }

        C0739b(C0737e eVar) {
            super(eVar);
        }
    }

    /* renamed from: androidx.core.h.a.e$a */
    static class C0738a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0737e f2884a;

        static {
            Covode.recordClassIndex(819);
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return false;
        }

        C0738a(C0737e eVar) {
            this.f2884a = eVar;
        }
    }

    public C0737e(Object obj) {
        this.f2883a = obj;
    }
}
