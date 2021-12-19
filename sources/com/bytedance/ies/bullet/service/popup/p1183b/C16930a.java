package com.bytedance.ies.bullet.service.popup.p1183b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.b.a */
public final class C16930a {

    /* renamed from: a */
    public static final C16930a f40259a = new C16930a();

    /* renamed from: b */
    private static int f40260b;

    /* renamed from: com.bytedance.ies.bullet.service.popup.b.a$a */
    public interface AbstractC16931a {
        static {
            Covode.recordClassIndex(19373);
        }

        /* renamed from: a */
        void mo26673a(int i);
    }

    private C16930a() {
    }

    static {
        Covode.recordClassIndex(19372);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.b.a$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC16932b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ Window f40261a;

        /* renamed from: b */
        final /* synthetic */ Context f40262b;

        /* renamed from: c */
        final /* synthetic */ int[] f40263c;

        /* renamed from: d */
        final /* synthetic */ AbstractC16931a f40264d;

        static {
            Covode.recordClassIndex(19374);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC16932b(Window window, Context context, int[] iArr, AbstractC16931a aVar) {
            this.f40261a = window;
            this.f40262b = context;
            this.f40263c = iArr;
            this.f40264d = aVar;
        }

        public final void onGlobalLayout() {
            int a = C16930a.m31196a(this.f40261a, this.f40262b);
            if (this.f40263c[0] != a) {
                this.f40264d.mo26673a(a);
                this.f40263c[0] = a;
            }
        }
    }

    /* renamed from: a */
    public static int m31196a(Window window, Context context) {
        View decorView = window.getDecorView();
        C89219l.m154709a((Object) decorView, "");
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        Resources resources2 = context.getResources();
        C89219l.m154709a((Object) resources2, "");
        if (abs > dimensionPixelSize + resources2.getDimensionPixelSize(resources2.getIdentifier("navigation_bar_height", "dimen", "android"))) {
            return abs - f40260b;
        }
        f40260b = abs;
        return 0;
    }

    /* renamed from: a */
    public static void m31197a(Window window, Context context, AbstractC16931a aVar) {
        C89219l.m154719c(window, "");
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(16908290);
        ViewTreeObserver$OnGlobalLayoutListenerC16932b bVar = new ViewTreeObserver$OnGlobalLayoutListenerC16932b(window, context, new int[]{m31196a(window, context)}, aVar);
        C89219l.m154709a((Object) frameLayout, "");
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
        frameLayout.setTag(-8, bVar);
    }
}
