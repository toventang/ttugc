package com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.AbstractC0790t;
import androidx.core.p037h.C0783m;
import androidx.core.p037h.C0806y;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.NestedScrollingChildFrameLayout */
public class NestedScrollingChildFrameLayout extends FrameLayout implements AbstractC0780j, AbstractC0790t {

    /* renamed from: a */
    private int f99192a;

    /* renamed from: b */
    private int f99193b = -1;

    /* renamed from: c */
    private float f99194c;

    /* renamed from: d */
    private float f99195d;

    /* renamed from: e */
    private final int[] f99196e = new int[2];

    /* renamed from: f */
    private final int[] f99197f = new int[2];

    /* renamed from: g */
    private boolean f99198g;

    /* renamed from: h */
    private final C0783m f99199h = new C0783m(this);

    /* renamed from: i */
    private AbstractC42554a f99200i;

    /* renamed from: j */
    private AbstractC0784n f99201j;

    /* renamed from: k */
    private AbstractC42555b f99202k = new AbstractC42555b() {
        /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.NestedScrollingChildFrameLayout.C425391 */

        static {
            Covode.recordClassIndex(50632);
        }
    };

    /* renamed from: l */
    private boolean f99203l = false;

    /* renamed from: m */
    private int f99204m = 0;

    /* renamed from: n */
    private boolean f99205n = false;

    static {
        Covode.recordClassIndex(50631);
    }

    public AbstractC42555b getiDispatchNestedPreFling() {
        return this.f99202k;
    }

    public boolean hasNestedScrollingParent() {
        return this.f99199h.mo2905a(0);
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public boolean isNestedScrollingEnabled() {
        return this.f99199h.f2940a;
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public void stopNestedScroll() {
        this.f99199h.mo2910b(0);
    }

    private RecyclerView getScrollingView() {
        AbstractC42554a aVar = this.f99200i;
        if (aVar == null) {
            return null;
        }
        return aVar.mo72724a();
    }

    public int computeHorizontalScrollExtent() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeHorizontalScrollExtent();
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeHorizontalScrollOffset();
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeHorizontalScrollRange();
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeVerticalScrollExtent();
        return 0;
    }

    @Override // androidx.core.p037h.AbstractC0790t
    public int computeVerticalScrollOffset() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeVerticalScrollOffset();
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeVerticalScrollRange();
        return 0;
    }

    public void setGetScrollingView(AbstractC42554a aVar) {
        this.f99200i = aVar;
    }

    public void setNestedScrollingParent(AbstractC0784n nVar) {
        this.f99201j = nVar;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f99199h.mo2902a(z);
    }

    public boolean startNestedScroll(int i) {
        return this.f99199h.mo2906a(i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r3 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            r2 = 1
            r1 = 0
            if (r3 == 0) goto L_0x003a
            if (r3 == r2) goto L_0x002a
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 3
            if (r3 == r0) goto L_0x002a
        L_0x0010:
            boolean r0 = super.dispatchTouchEvent(r5)
            return r0
        L_0x0015:
            int r0 = r4.f99193b
            float r1 = m85042a(r5, r0)
            float r0 = r4.f99194c
            float r0 = r0 - r1
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r4.f99192a
            if (r1 < r0) goto L_0x0010
            r4.f99203l = r2
            goto L_0x0010
        L_0x002a:
            boolean r0 = r4.f99203l
            if (r0 == 0) goto L_0x0035
            boolean r0 = r4.f99205n
            if (r0 == 0) goto L_0x0035
            r4.stopNestedScroll()
        L_0x0035:
            r4.f99203l = r1
            r4.f99205n = r1
            goto L_0x0010
        L_0x003a:
            r4.f99203l = r1
            int r0 = r5.getPointerId(r1)
            r4.f99193b = r0
            float r0 = m85042a(r5, r0)
            r4.f99194c = r0
            com.ss.android.ugc.aweme.discover.ui.Dialog.a r0 = r4.f99200i
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.mo72725b()
            if (r0 == 0) goto L_0x0055
        L_0x0052:
            r4.f99205n = r2
            goto L_0x0010
        L_0x0055:
            r2 = 0
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.NestedScrollingChildFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r6 != 3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.NestedScrollingChildFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private static float m85042a(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return motionEvent.getY(findPointerIndex);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return C0806y.m2814a((ViewGroup) this.f99201j, this, f, f2);
    }

    public NestedScrollingChildFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(8025);
        setNestedScrollingEnabled(true);
        this.f99192a = ViewConfiguration.get(context).getScaledTouchSlop();
        MethodCollector.m26664o(8025);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f99199h.mo2904a(f, f2, z);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f99199h.mo2908a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f99199h.mo2907a(i, i2, i3, i4, iArr);
    }
}
