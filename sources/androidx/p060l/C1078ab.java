package androidx.p060l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.l.ab */
public class C1078ab implements AbstractC1081ad {

    /* renamed from: a */
    public C1079a f3719a;

    static {
        Covode.recordClassIndex(1171);
    }

    /* renamed from: androidx.l.ab$a */
    static class C1079a extends ViewGroup {

        /* renamed from: a */
        static Method f3720a;

        /* renamed from: b */
        ViewGroup f3721b;

        /* renamed from: c */
        View f3722c;

        /* renamed from: d */
        ArrayList<Drawable> f3723d;

        /* renamed from: e */
        C1078ab f3724e;

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            Covode.recordClassIndex(1172);
            try {
                f3720a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* renamed from: b */
        public final void mo3838b(View view) {
            super.removeView(view);
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f3723d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f3721b.removeView(this);
                }
            }
        }

        /* access modifiers changed from: protected */
        public final boolean verifyDrawable(Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.f3723d;
            if (arrayList == null || !arrayList.contains(drawable)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo3837a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f3721b || viewGroup.getParent() == null || !C0792v.m2791y(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f3721b.getLocationOnScreen(iArr2);
                    C0792v.m2769e(view, iArr[0] - iArr2[0]);
                    C0792v.m2767d(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: protected */
        public final void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f3721b.getLocationOnScreen(iArr);
            this.f3722c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f3722c.getWidth(), this.f3722c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f3723d;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    this.f3723d.get(i).draw(canvas);
                }
            }
        }

        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f3721b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f3721b;
            if (viewGroup instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                int[] iArr3 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                this.f3722c.getLocationOnScreen(iArr3);
                int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                rect.offset(iArr4[0], iArr4[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        C1079a(Context context, ViewGroup viewGroup, View view, C1078ab abVar) {
            super(context);
            this.f3721b = viewGroup;
            this.f3722c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f3724e = abVar;
        }
    }

    @Override // androidx.p060l.AbstractC1081ad
    /* renamed from: b */
    public final void mo3836b(Drawable drawable) {
        C1079a aVar = this.f3719a;
        if (aVar.f3723d != null) {
            aVar.f3723d.remove(drawable);
            aVar.invalidate(drawable.getBounds());
            drawable.setCallback(null);
        }
    }

    @Override // androidx.p060l.AbstractC1081ad
    /* renamed from: a */
    public final void mo3835a(Drawable drawable) {
        C1079a aVar = this.f3719a;
        if (aVar.f3723d == null) {
            aVar.f3723d = new ArrayList<>();
        }
        if (!aVar.f3723d.contains(drawable)) {
            aVar.f3723d.add(drawable);
            aVar.invalidate(drawable.getBounds());
            drawable.setCallback(aVar);
        }
    }

    /* renamed from: c */
    static C1078ab m3636c(View view) {
        View view2 = view;
        while (view2 != null) {
            if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view2;
                if (viewGroup == null) {
                    return null;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C1079a) {
                        return ((C1079a) childAt).f3724e;
                    }
                }
                return new C1154v(viewGroup.getContext(), viewGroup, view);
            } else if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        return null;
    }

    C1078ab(Context context, ViewGroup viewGroup, View view) {
        this.f3719a = new C1079a(context, viewGroup, view, this);
    }
}
