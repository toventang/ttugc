package androidx.appcompat.widget;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.ao */
public final class View$OnAttachStateChangeListenerC0410ao implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: j */
    private static View$OnAttachStateChangeListenerC0410ao f1610j;

    /* renamed from: k */
    private static View$OnAttachStateChangeListenerC0410ao f1611k;

    /* renamed from: a */
    private final View f1612a;

    /* renamed from: b */
    private final CharSequence f1613b;

    /* renamed from: c */
    private final int f1614c;

    /* renamed from: d */
    private final Runnable f1615d = new Runnable() {
        /* class androidx.appcompat.widget.View$OnAttachStateChangeListenerC0410ao.RunnableC04111 */

        static {
            Covode.recordClassIndex(476);
        }

        public final void run() {
            View$OnAttachStateChangeListenerC0410ao.this.mo1869a(false);
        }
    };

    /* renamed from: e */
    private final Runnable f1616e = new Runnable() {
        /* class androidx.appcompat.widget.View$OnAttachStateChangeListenerC0410ao.RunnableC04122 */

        static {
            Covode.recordClassIndex(477);
        }

        public final void run() {
            View$OnAttachStateChangeListenerC0410ao.this.mo1868a();
        }
    };

    /* renamed from: f */
    private int f1617f;

    /* renamed from: g */
    private int f1618g;

    /* renamed from: h */
    private C0413ap f1619h;

    /* renamed from: i */
    private boolean f1620i;

    static {
        Covode.recordClassIndex(475);
    }

    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: c */
    private void m1525c() {
        this.f1612a.removeCallbacks(this.f1615d);
    }

    /* renamed from: d */
    private void m1526d() {
        this.f1617f = Integer.MAX_VALUE;
        this.f1618g = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    private void m1524b() {
        this.f1612a.postDelayed(this.f1615d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1868a() {
        if (f1611k == this) {
            f1611k = null;
            C0413ap apVar = this.f1619h;
            if (apVar != null) {
                apVar.mo1876a();
                this.f1619h = null;
                m1526d();
                this.f1612a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1610j == this) {
            m1523a((View$OnAttachStateChangeListenerC0410ao) null);
        }
        this.f1612a.removeCallbacks(this.f1616e);
    }

    public final void onViewDetachedFromWindow(View view) {
        mo1868a();
    }

    /* renamed from: a */
    private static void m1523a(View$OnAttachStateChangeListenerC0410ao aoVar) {
        View$OnAttachStateChangeListenerC0410ao aoVar2 = f1610j;
        if (aoVar2 != null) {
            aoVar2.m1525c();
        }
        f1610j = aoVar;
        if (aoVar != null) {
            aoVar.m1524b();
        }
    }

    public final boolean onLongClick(View view) {
        this.f1617f = view.getWidth() / 2;
        this.f1618g = view.getHeight() / 2;
        mo1869a(true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1869a(boolean z) {
        long j;
        int longPressTimeout;
        long j2;
        if (C0792v.m2791y(this.f1612a)) {
            m1523a((View$OnAttachStateChangeListenerC0410ao) null);
            View$OnAttachStateChangeListenerC0410ao aoVar = f1611k;
            if (aoVar != null) {
                aoVar.mo1868a();
            }
            f1611k = this;
            this.f1620i = z;
            C0413ap apVar = new C0413ap(this.f1612a.getContext());
            this.f1619h = apVar;
            apVar.mo1877a(this.f1612a, this.f1617f, this.f1618g, this.f1620i, this.f1613b);
            this.f1612a.addOnAttachStateChangeListener(this);
            if (this.f1620i) {
                j2 = 2500;
            } else {
                if ((C0792v.m2779m(this.f1612a) & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - ((long) longPressTimeout);
            }
            this.f1612a.removeCallbacks(this.f1616e);
            this.f1612a.postDelayed(this.f1616e, j2);
        }
    }

    private View$OnAttachStateChangeListenerC0410ao(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f1612a = view;
        this.f1613b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = viewConfiguration.getScaledHoverSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1614c = scaledTouchSlop;
        m1526d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m1522a(View view, CharSequence charSequence) {
        View$OnAttachStateChangeListenerC0410ao aoVar = f1610j;
        if (aoVar != null && aoVar.f1612a == view) {
            m1523a((View$OnAttachStateChangeListenerC0410ao) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnAttachStateChangeListenerC0410ao aoVar2 = f1611k;
            if (aoVar2 != null && aoVar2.f1612a == view) {
                aoVar2.mo1868a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnAttachStateChangeListenerC0410ao(view, charSequence);
    }

    /* renamed from: a */
    private static Object m1521a(Context context, String str) {
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

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1619h != null && this.f1620i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) m1521a(this.f1612a.getContext(), "accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1526d();
                mo1868a();
            }
        } else if (this.f1612a.isEnabled() && this.f1619h == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f1617f) > this.f1614c || Math.abs(y - this.f1618g) > this.f1614c) {
                this.f1617f = x;
                this.f1618g = y;
                m1523a(this);
            }
        }
        return false;
    }
}
