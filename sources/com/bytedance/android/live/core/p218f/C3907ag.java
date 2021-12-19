package com.bytedance.android.live.core.p218f;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.ag */
public final class C3907ag {
    static {
        Covode.recordClassIndex(4436);
    }

    /* renamed from: com.bytedance.android.live.core.f.ag$a */
    static class C3908a extends ViewOutlineProvider {

        /* renamed from: a */
        private float f10796a;

        static {
            Covode.recordClassIndex(4437);
        }

        private C3908a(float f) {
            this.f10796a = f;
        }

        /* synthetic */ C3908a(float f, byte b) {
            this(f);
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom()), this.f10796a);
        }
    }

    /* renamed from: com.bytedance.android.live.core.f.ag$b */
    static class C3909b extends ViewOutlineProvider {

        /* renamed from: a */
        private float f10797a;

        /* renamed from: b */
        private int f10798b;

        static {
            Covode.recordClassIndex(4438);
        }

        /* synthetic */ C3909b(float f) {
            this(f, 1);
        }

        private C3909b(float f, int i) {
            this.f10798b = 1;
            this.f10797a = f;
        }

        public final void getOutline(View view, Outline outline) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int width = view.getWidth() - view.getPaddingRight();
            int height = view.getHeight() - view.getPaddingBottom();
            int i = this.f10798b;
            if (i == 1) {
                height = (int) (((float) height) + this.f10797a);
            } else if (i == 2) {
                paddingTop = (int) (((float) paddingTop) - this.f10797a);
            } else if (i == 3) {
                paddingLeft = (int) (((float) paddingLeft) - this.f10797a);
            } else if (i == 4) {
                width = (int) (((float) width) + this.f10797a);
            }
            outline.setRoundRect(new Rect(paddingLeft, paddingTop, width, height), this.f10797a);
        }
    }

    /* renamed from: a */
    public static void m9541a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new C3908a((float) i, (byte) 0));
            view.setClipToOutline(true);
        }
    }

    /* renamed from: b */
    public static void m9542b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new C3909b((float) i));
            view.setClipToOutline(true);
        }
    }
}
