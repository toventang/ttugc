package com.bytedance.android.livesdk.container.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.util.f */
public final class ViewTreeObserver$OnGlobalLayoutListenerC8308f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public static int f20579b;

    /* renamed from: c */
    public static final C8309a f20580c = new C8309a((byte) 0);

    /* renamed from: a */
    final ViewGroup f20581a;

    /* renamed from: d */
    private boolean f20582d;

    static {
        Covode.recordClassIndex(9145);
    }

    /* renamed from: com.bytedance.android.livesdk.container.util.f$a */
    public static final class C8309a {
        static {
            Covode.recordClassIndex(9146);
        }

        private C8309a() {
        }

        public /* synthetic */ C8309a(byte b) {
            this();
        }
    }

    public final void onGlobalLayout() {
        boolean z;
        boolean z2 = this.f20582d;
        Rect rect = new Rect();
        this.f20581a.getWindowVisibleDisplayFrame(rect);
        View rootView = this.f20581a.getRootView();
        C89219l.m154716b(rootView, "");
        int height = rootView.getHeight();
        int i = height - rect.bottom;
        double d = (double) height;
        Double.isNaN(d);
        if (((double) i) > d * 0.25d) {
            f20579b = i;
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            this.f20582d = !this.f20582d;
        }
    }
}
