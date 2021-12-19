package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;

/* renamed from: com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout */
public class CustomInterceptTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a */
    public static final int f81877a = C34728n.m70946a(8.0d);

    /* renamed from: b */
    boolean f81878b;

    /* renamed from: c */
    private AbstractC34660a f81879c;

    /* renamed from: d */
    private Runnable f81880d;

    /* renamed from: e */
    private int f81881e;

    /* renamed from: f */
    private int f81882f;

    /* renamed from: g */
    private boolean f81883g;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout$a */
    public interface AbstractC34660a {
        static {
            Covode.recordClassIndex(41636);
        }

        /* renamed from: a */
        boolean mo61296a();
    }

    static {
        Covode.recordClassIndex(41635);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        m70780a(motionEvent);
        return true;
    }

    public CustomInterceptTouchEventFrameLayout(Context context) {
        super(context);
        MethodCollector.m26663i(11067);
        MethodCollector.m26664o(11067);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        m70780a(motionEvent);
        return this.f81878b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != 3) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m70780a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r1 = r6.getAction()
            if (r1 == 0) goto L_0x0051
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L_0x004c
            r0 = 2
            if (r1 == r0) goto L_0x0013
            r0 = 3
            if (r1 == r0) goto L_0x004c
        L_0x0010:
            boolean r0 = r5.f81878b
            return r0
        L_0x0013:
            com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout$a r0 = r5.f81879c
            if (r0 == 0) goto L_0x0010
            float r1 = r6.getX()
            int r0 = r5.f81881e
            float r0 = (float) r0
            float r1 = r1 - r0
            float r3 = r6.getY()
            int r0 = r5.f81882f
            float r0 = (float) r0
            float r3 = r3 - r0
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.p2082ss.android.ugc.aweme.base.p2379ui.CustomInterceptTouchEventFrameLayout.f81877a
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x003b
            float r1 = java.lang.Math.abs(r3)
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
        L_0x003b:
            com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout$a r0 = r5.f81879c
            boolean r0 = r0.mo61296a()
            if (r0 == 0) goto L_0x0049
            java.lang.Runnable r0 = r5.f81880d
            r0.run()
            goto L_0x0010
        L_0x0049:
            r5.f81878b = r4
            goto L_0x0010
        L_0x004c:
            r5.f81878b = r4
            r5.f81883g = r4
            goto L_0x0010
        L_0x0051:
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.f81881e = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f81882f = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.p2379ui.CustomInterceptTouchEventFrameLayout.m70780a(android.view.MotionEvent):boolean");
    }

    public CustomInterceptTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11219);
        MethodCollector.m26664o(11219);
    }
}
