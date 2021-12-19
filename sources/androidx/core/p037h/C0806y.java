package androidx.core.p037h;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.y */
public final class C0806y {
    static {
        Covode.recordClassIndex(887);
    }

    /* renamed from: a */
    public static boolean m2814a(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedPreFling");
                return false;
            }
        } else if (viewParent instanceof AbstractC0784n) {
            return ((AbstractC0784n) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m2815a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedFling");
                return false;
            }
        } else if (viewParent instanceof AbstractC0784n) {
            return ((AbstractC0784n) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m2816a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof AbstractC0785o) {
            return ((AbstractC0785o) viewParent).mo2474a(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError unused) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onStartNestedScroll");
                return false;
            }
        } else if (viewParent instanceof AbstractC0784n) {
            return ((AbstractC0784n) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m2813a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof AbstractC0785o) {
            ((AbstractC0785o) viewParent).mo2472a(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                    new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedPreScroll");
                }
            } else if (viewParent instanceof AbstractC0784n) {
                ((AbstractC0784n) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: a */
    public static void m2812a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof AbstractC0786p) {
            ((AbstractC0786p) viewParent).mo2912a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof AbstractC0785o) {
            ((AbstractC0785o) viewParent).mo2471a(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedScroll");
                }
            } else if (viewParent instanceof AbstractC0784n) {
                ((AbstractC0784n) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }
}
