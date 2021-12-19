package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49761n;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.LongPressLayout */
public class LongPressLayout extends View {

    /* renamed from: a */
    public float f115383a;

    /* renamed from: b */
    public float f115384b;

    /* renamed from: c */
    public boolean f115385c;

    /* renamed from: d */
    public boolean f115386d;

    /* renamed from: e */
    public AbstractC50014a f115387e;

    /* renamed from: f */
    public long f115388f;

    /* renamed from: g */
    View.OnClickListener f115389g;

    /* renamed from: h */
    View.OnClickListener f115390h;

    /* renamed from: i */
    boolean f115391i;

    /* renamed from: j */
    public AbstractC49761n f115392j;

    /* renamed from: k */
    private Context f115393k;

    /* renamed from: l */
    private float f115394l;

    /* renamed from: m */
    private float f115395m;

    /* renamed from: n */
    private int f115396n;

    /* renamed from: o */
    private int f115397o;

    /* renamed from: p */
    private View.OnTouchListener f115398p;

    /* renamed from: q */
    private Runnable f115399q;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.LongPressLayout$a */
    public interface AbstractC50014a {
        static {
            Covode.recordClassIndex(59134);
        }

        /* renamed from: a */
        void mo80347a(float f, float f2);
    }

    static {
        Covode.recordClassIndex(59131);
    }

    public AbstractC49761n getInterceptListener() {
        return this.f115392j;
    }

    public int getTimeInterval() {
        return this.f115397o;
    }

    public void setInLongPressMode(boolean z) {
        this.f115385c = z;
    }

    public void setInterceptListener(AbstractC49761n nVar) {
        this.f115392j = nVar;
    }

    public void setListener(AbstractC50014a aVar) {
        this.f115387e = aVar;
    }

    public void setScrollMode(boolean z) {
        this.f115386d = z;
    }

    public void setTapListener(View.OnTouchListener onTouchListener) {
        this.f115398p = onTouchListener;
    }

    public void setTimeInterval(int i) {
        this.f115397o = i;
    }

    public LongPressLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setDisabilityOnClickListener(View.OnClickListener onClickListener) {
        this.f115390h = onClickListener;
        super.setOnClickListener(new View$OnClickListenerC50098ba(this));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (this.f115390h == null) {
            super.setOnClickListener(onClickListener);
        }
        this.f115389g = onClickListener;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        if (!isEnabled()) {
            return false;
        }
        this.f115391i = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.f115394l = motionEvent.getX();
                    this.f115395m = motionEvent.getY();
                    float abs = Math.abs(this.f115383a - this.f115394l);
                    float abs2 = Math.abs(this.f115384b - this.f115395m);
                    int i = this.f115396n;
                    if (abs > ((float) i) || abs2 > ((float) i)) {
                        C29339a.m58755c(this.f115399q);
                    }
                    View.OnTouchListener onTouchListener2 = this.f115398p;
                    if (onTouchListener2 != null) {
                        onTouchListener2.onTouch(this, motionEvent);
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        C29339a.m58755c(this.f115399q);
                    }
                }
            }
            C29339a.m58755c(this.f115399q);
            if (SystemClock.elapsedRealtime() - this.f115388f < ((long) this.f115397o) && (onTouchListener = this.f115398p) != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        } else {
            this.f115383a = motionEvent.getX();
            this.f115384b = motionEvent.getY();
            this.f115388f = SystemClock.elapsedRealtime();
            C29339a.m58753a(this.f115399q, this.f115397o);
            View.OnTouchListener onTouchListener3 = this.f115398p;
            if (onTouchListener3 != null) {
                onTouchListener3.onTouch(this, motionEvent);
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public LongPressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LongPressLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(12924);
        this.f115396n = -1;
        this.f115397o = 500;
        this.f115399q = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout.RunnableC500132 */

            static {
                Covode.recordClassIndex(59133);
            }

            public final void run() {
                if (LongPressLayout.this.f115387e != null) {
                    ViewParent parent = LongPressLayout.this.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (LongPressLayout.this.f115392j == null || LongPressLayout.this.f115392j.mo84312a()) {
                        LongPressLayout.this.f115387e.mo80347a(LongPressLayout.this.f115383a, LongPressLayout.this.f115384b);
                    }
                }
            }
        };
        this.f115393k = context;
        this.f115396n = ViewConfiguration.get(context).getScaledTouchSlop();
        setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout.View$OnClickListenerC500121 */

            static {
                Covode.recordClassIndex(59132);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
            }
        });
        MethodCollector.m26664o(12924);
    }
}
