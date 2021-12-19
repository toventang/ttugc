package com.bytedance.ies.uikit.p1280b;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.p1283e.C18271b;
import java.util.HashMap;

/* renamed from: com.bytedance.ies.uikit.b.b */
public final class C18244b extends FrameLayout {
    static {
        Covode.recordClassIndex(20903);
    }

    /* renamed from: a */
    private static void m33944a() {
        if (C18271b.f43614b != null) {
            new HashMap();
        }
    }

    /* renamed from: b */
    private static boolean m33945b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public final void requestLayout() {
        if (!m33945b()) {
            m33944a();
        }
        super.requestLayout();
    }

    public C18244b(Context context) {
        super(context);
        MethodCollector.m26663i(11170);
        MethodCollector.m26664o(11170);
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (!m33945b()) {
            m33944a();
        }
        return super.invalidateChildInParent(iArr, rect);
    }
}
