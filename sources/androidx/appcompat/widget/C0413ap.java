package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.ap */
public final class C0413ap {

    /* renamed from: a */
    private final Context f1623a;

    /* renamed from: b */
    private final View f1624b;

    /* renamed from: c */
    private final TextView f1625c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1626d;

    /* renamed from: e */
    private final Rect f1627e = new Rect();

    /* renamed from: f */
    private final int[] f1628f = new int[2];

    /* renamed from: g */
    private final int[] f1629g = new int[2];

    static {
        Covode.recordClassIndex(478);
    }

    /* renamed from: a */
    private static void m1532a(WindowManager windowManager, View view) {
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            C15346a.m28240a(null, windowManager, new Object[]{view}, 102801, "androidx_appcompat_widget_TooltipPopup_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    private static void m1533a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view, layoutParams}, 102800, "void", false, null).first).booleanValue()) {
            windowManager.addView(view, layoutParams);
            C15346a.m28240a(null, windowManager, new Object[]{view, layoutParams}, 102800, "androidx_appcompat_widget_TooltipPopup_android_view_WindowManager_addView(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V");
        }
    }

    /* renamed from: b */
    private boolean m1534b() {
        if (this.f1624b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1876a() {
        if (m1534b()) {
            m1532a((WindowManager) m1530a(this.f1623a, "window"), this.f1624b);
        }
    }

    /* renamed from: a */
    private static View m1529a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    C0413ap(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1626d = layoutParams;
        this.f1623a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.as, (ViewGroup) null);
        this.f1624b = inflate;
        this.f1625c = (TextView) inflate.findViewById(R.id.cj9);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.f;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private static Object m1530a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    private void m1531a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1623a.getResources().getDimensionPixelOffset(R.dimen.u0);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1623a.getResources().getDimensionPixelOffset(R.dimen.tz);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f1623a.getResources();
        if (z) {
            i4 = R.dimen.u3;
        } else {
            i4 = R.dimen.u2;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
        View a = m1529a(view);
        if (a != null) {
            a.getWindowVisibleDisplayFrame(this.f1627e);
            if (this.f1627e.left < 0 && this.f1627e.top < 0) {
                Resources resources2 = this.f1623a.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i5 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i5 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                this.f1627e.set(0, i5, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            a.getLocationOnScreen(this.f1629g);
            view.getLocationOnScreen(this.f1628f);
            int[] iArr = this.f1628f;
            int i6 = iArr[0];
            int[] iArr2 = this.f1629g;
            iArr[0] = i6 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f1624b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f1624b.getMeasuredHeight();
            int[] iArr3 = this.f1628f;
            int i7 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
            int i8 = iArr3[1] + height + dimensionPixelOffset3;
            if (z) {
                if (i7 < 0) {
                    layoutParams.y = i8;
                    return;
                }
            } else if (measuredHeight + i8 <= this.f1627e.height()) {
                layoutParams.y = i8;
                return;
            }
            layoutParams.y = i7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1877a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m1534b()) {
            mo1876a();
        }
        this.f1625c.setText(charSequence);
        m1531a(view, i, i2, z, this.f1626d);
        m1533a((WindowManager) m1530a(this.f1623a, "window"), this.f1624b, this.f1626d);
    }
}
