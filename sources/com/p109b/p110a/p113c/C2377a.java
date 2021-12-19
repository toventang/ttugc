package com.p109b.p110a.p113c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p109b.p110a.p111a.C2374b;
import java.util.HashMap;

/* renamed from: com.b.a.c.a */
public final class C2377a extends FrameLayout {
    static {
        Covode.recordClassIndex(2655);
    }

    /* renamed from: a */
    private static void m7221a() {
        if (C2374b.f7217b != null) {
            C2374b.f7217b.mo6545a(new HashMap());
        }
    }

    /* renamed from: b */
    private static boolean m7222b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public final void requestLayout() {
        if (!m7222b()) {
            m7221a();
        }
        super.requestLayout();
    }

    public C2377a(Context context) {
        super(context);
        MethodCollector.m26663i(11246);
        MethodCollector.m26664o(11246);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C2374b.f7217b.mo6546b(this, true);
        super.dispatchDraw(canvas);
        C2374b.f7217b.mo6546b(this, false);
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (!m7222b()) {
            m7221a();
        }
        return super.invalidateChildInParent(iArr, rect);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(11403);
        C2374b.f7217b.mo6544a(this, true);
        super.onLayout(z, i, i2, i3, i4);
        C2374b.f7217b.mo6544a(this, false);
        MethodCollector.m26664o(11403);
    }
}
