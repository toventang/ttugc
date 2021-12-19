package com.p2082ss.android.push.window.oppo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.push.window.oppo.PushWindowScrollView */
public class PushWindowScrollView extends FrameLayout {

    /* renamed from: a */
    protected VelocityTracker f71994a;

    /* renamed from: b */
    protected int f71995b = -1;

    /* renamed from: c */
    boolean f71996c;

    /* renamed from: d */
    private AbstractC30195a f71997d;

    /* renamed from: e */
    private int f71998e;

    /* renamed from: f */
    private int f71999f;

    /* renamed from: g */
    private int f72000g;

    /* renamed from: h */
    private float f72001h;

    /* renamed from: i */
    private float f72002i;

    /* renamed from: j */
    private float f72003j;

    /* renamed from: k */
    private float f72004k;

    /* renamed from: l */
    private boolean f72005l;

    /* renamed from: m */
    private int f72006m;

    /* renamed from: n */
    private boolean f72007n;

    /* renamed from: o */
    private boolean f72008o;

    /* renamed from: p */
    private int f72009p;

    /* renamed from: com.ss.android.push.window.oppo.PushWindowScrollView$a */
    public interface AbstractC30195a {
        static {
            Covode.recordClassIndex(36700);
        }
    }

    static {
        Covode.recordClassIndex(36699);
    }

    /* renamed from: a */
    private void m61075a() {
        this.f72007n = true;
        this.f72008o = false;
        this.f71996c = false;
    }

    /* renamed from: b */
    private void m61077b() {
        this.f72008o = false;
        this.f72007n = false;
        this.f72005l = false;
        this.f71995b = -1;
        VelocityTracker velocityTracker = this.f71994a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f71994a = null;
        }
    }

    public void setOnScrollListener(AbstractC30195a aVar) {
        this.f71997d = aVar;
    }

    /* renamed from: a */
    private void m61076a(MotionEvent motionEvent) {
        int i = this.f71995b;
        int a = m61074a(motionEvent, i);
        if (i != -1 && a != -1) {
            float x = motionEvent.getX(a);
            float abs = Math.abs(x - this.f72001h);
            float y = motionEvent.getY(a);
            float abs2 = Math.abs(y - this.f72002i);
            int i2 = this.f71998e;
            if (abs2 > ((float) i2) && abs2 > abs) {
                m61075a();
                this.f72001h = x;
                this.f72002i = y;
            } else if (abs > ((float) i2)) {
                this.f72005l = true;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 1 || (action != 0 && this.f72005l)) {
            m61077b();
            return false;
        }
        int i = action & 255;
        if (i == 0) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            this.f71995b = pointerId;
            if (pointerId != -1) {
                float x = motionEvent.getX(actionIndex);
                this.f72004k = x;
                this.f72001h = x;
                float y = motionEvent.getY(actionIndex);
                this.f72002i = y;
                this.f72003j = y;
                this.f72007n = false;
                this.f72005l = false;
            }
        } else if (i == 2) {
            int a = m61074a(motionEvent, this.f71995b);
            if (this.f71995b != -1) {
                motionEvent.getY(a);
                m61076a(motionEvent);
            }
        }
        if (!this.f72007n) {
            if (this.f71994a == null) {
                this.f71994a = VelocityTracker.obtain();
            }
            this.f71994a.addMovement(motionEvent);
        }
        if (this.f72007n || this.f72008o) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f71994a == null) {
            this.f71994a = VelocityTracker.obtain();
        }
        this.f71994a.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f72007n) {
                        m61076a(motionEvent);
                        if (this.f72005l) {
                            return false;
                        }
                    }
                    if (this.f72007n) {
                        int a = m61074a(motionEvent, this.f71995b);
                        if (this.f71995b != -1) {
                            float y = motionEvent.getY(a);
                            float f = this.f72002i - y;
                            this.f72002i = y;
                            float f2 = ((float) this.f72009p) + f;
                            int i = (int) f2;
                            this.f72001h += f2 - ((float) i);
                            this.f72009p = i;
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f72002i = motionEvent.getY(actionIndex);
                        this.f72001h = motionEvent.getX(actionIndex);
                        this.f71995b = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        int a2 = m61074a(motionEvent, this.f71995b);
                        if (this.f71995b != -1) {
                            this.f72002i = motionEvent.getY(a2);
                            this.f72001h = motionEvent.getX(a2);
                        }
                    }
                }
            }
            if (this.f72007n) {
                VelocityTracker velocityTracker = this.f71994a;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f72000g);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f71995b);
                int a3 = m61074a(motionEvent, this.f71995b);
                if (this.f71995b != -1 && Math.abs((int) (motionEvent.getY(a3) - this.f72003j)) > this.f72006m) {
                    Math.abs(yVelocity);
                }
                this.f71995b = -1;
                m61077b();
            }
        } else {
            this.f71995b = motionEvent.getPointerId(motionEvent.getActionIndex());
            float y2 = motionEvent.getY();
            this.f72003j = y2;
            this.f72002i = y2;
            float x = motionEvent.getX();
            this.f72004k = x;
            this.f72001h = x;
        }
        return true;
    }

    /* renamed from: a */
    private int m61074a(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            this.f71995b = -1;
        }
        return findPointerIndex;
    }

    public PushWindowScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10893);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f71998e = viewConfiguration.getScaledTouchSlop();
        this.f71999f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f72000g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f72006m = (int) (getContext().getResources().getDisplayMetrics().density * 25.0f);
        MethodCollector.m26664o(10893);
    }
}
