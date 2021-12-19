package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0324s;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.widget.z */
public abstract class AbstractView$OnAttachStateChangeListenerC0461z implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a */
    private final float f1775a;

    /* renamed from: b */
    private final int f1776b;

    /* renamed from: c */
    final View f1777c;

    /* renamed from: d */
    private final int f1778d;

    /* renamed from: e */
    private Runnable f1779e;

    /* renamed from: f */
    private Runnable f1780f;

    /* renamed from: g */
    private boolean f1781g;

    /* renamed from: h */
    private int f1782h;

    /* renamed from: i */
    private final int[] f1783i = new int[2];

    static {
        Covode.recordClassIndex(526);
    }

    /* renamed from: a */
    public abstract AbstractC0324s mo814a();

    public void onViewAttachedToWindow(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.z$b */
    public class RunnableC0463b implements Runnable {
        static {
            Covode.recordClassIndex(528);
        }

        public final void run() {
            AbstractView$OnAttachStateChangeListenerC0461z.this.mo2019d();
        }

        RunnableC0463b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.z$a */
    public class RunnableC0462a implements Runnable {
        static {
            Covode.recordClassIndex(527);
        }

        public final void run() {
            ViewParent parent = AbstractView$OnAttachStateChangeListenerC0461z.this.f1777c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        RunnableC0462a() {
        }
    }

    /* renamed from: e */
    private void m1703e() {
        Runnable runnable = this.f1780f;
        if (runnable != null) {
            this.f1777c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1779e;
        if (runnable2 != null) {
            this.f1777c.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo815b() {
        AbstractC0324s a = mo814a();
        if (a == null || a.mo919e()) {
            return true;
        }
        a.mo915c();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1291c() {
        AbstractC0324s a = mo814a();
        if (a == null || !a.mo919e()) {
            return true;
        }
        a.mo918d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo2019d() {
        m1703e();
        View view = this.f1777c;
        if (view.isEnabled() && !view.isLongClickable() && mo815b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1781g = true;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1781g = false;
        this.f1782h = -1;
        Runnable runnable = this.f1779e;
        if (runnable != null) {
            this.f1777c.removeCallbacks(runnable);
        }
    }

    public AbstractView$OnAttachStateChangeListenerC0461z(View view) {
        this.f1777c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1775a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1776b = tapTimeout;
        this.f1778d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r0 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r1 != 3) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0461z.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
