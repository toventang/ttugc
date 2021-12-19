package com.lynx.p2032b.p2033a.p2041h;

import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.AbstractC0790t;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.b.a.h.b  reason: invalid class name */
public final class animationInterpolatorC28243b implements Interpolator {

    /* renamed from: a */
    public static int f66201a;

    /* renamed from: b */
    public static int f66202b = 1;

    /* renamed from: c */
    public static float f66203c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: e */
    private static final float f66204e;

    /* renamed from: f */
    private static final float f66205f;

    /* renamed from: d */
    private int f66206d;

    static {
        Covode.recordClassIndex(34189);
        float b = 1.0f / m56422b(1.0f);
        f66204e = b;
        f66205f = 1.0f - (b * m56422b(1.0f));
    }

    public animationInterpolatorC28243b(int i) {
        this.f66206d = i;
    }

    /* renamed from: a */
    public static int m56416a(float f) {
        return (int) ((f * f66203c) + 0.5f);
    }

    /* renamed from: b */
    public static boolean m56423b(View view) {
        if (m56424c(view) || (view instanceof ViewPager) || (view instanceof AbstractC0784n)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m56424c(View view) {
        if ((view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof AbstractC0790t) || (view instanceof WebView) || (view instanceof AbstractC0780j)) {
            return true;
        }
        return false;
    }

    public final float getInterpolation(float f) {
        if (this.f66206d == f66202b) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float b = f66204e * m56422b(f);
        if (b > 0.0f) {
            return b + f66205f;
        }
        return b;
    }

    /* renamed from: a */
    public static int m56417a(View view) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        if (layoutParams.height > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    private static float m56422b(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp((double) (-f2))));
        }
        return 0.36787945f + ((1.0f - ((float) Math.exp((double) (1.0f - f2)))) * 0.63212055f);
    }

    /* renamed from: a */
    public static boolean m56418a(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return view.canScrollVertically(i);
    }

    /* renamed from: a */
    public static boolean m56419a(View view, PointF pointF) {
        if (m56418a(view, -1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (m56421a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                if ("fixed".equals(childAt.getTag()) || "fixed-bottom".equals(childAt.getTag())) {
                    return false;
                } else {
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean a = m56419a(childAt, pointF);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return a;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m56420a(View view, PointF pointF, boolean z) {
        if (m56418a(view, 1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !m56424c(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (m56421a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ("fixed".equals(childAt.getTag()) || "fixed-top".equals(childAt.getTag())) {
                        return false;
                    } else {
                        pointF.offset(pointF2.x, pointF2.y);
                        boolean a = m56420a(childAt, pointF, z);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return a;
                    }
                }
            }
        }
        if (z || m56418a(view, -1)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m56421a(View view, View view2, float f, float f2, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = fArr[0] + ((float) (view.getScrollX() - view2.getLeft()));
        fArr[1] = fArr[1] + ((float) (view.getScrollY() - view2.getTop()));
        if (fArr[0] < 0.0f || fArr[1] < 0.0f || fArr[0] >= ((float) view2.getWidth()) || fArr[1] >= ((float) view2.getHeight())) {
            return false;
        }
        pointF.set(fArr[0] - f, fArr[1] - f2);
        return true;
    }
}
