package com.lynx.tasm.behavior.p2052ui.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.scroll.C28650a;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.p2054c.C28730h;
import com.lynx.tasm.utils.C28926j;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.ui.scroll.UIScrollView */
public class UIScrollView extends AbsLynxUIScroll<C28650a> implements AbstractC28657b {

    /* renamed from: a */
    public boolean f67476a;

    /* renamed from: b */
    public boolean f67477b;

    /* renamed from: c */
    public boolean f67478c;

    /* renamed from: d */
    public boolean f67479d;

    /* renamed from: e */
    public boolean f67480e;

    /* renamed from: f */
    public boolean f67481f;

    /* renamed from: g */
    public int f67482g = 1;

    /* renamed from: h */
    private boolean f67483h;

    /* renamed from: i */
    private boolean f67484i;

    /* renamed from: j */
    private int f67485j;

    /* renamed from: k */
    private int f67486k;

    /* renamed from: l */
    private int f67487l;

    static {
        Covode.recordClassIndex(34711);
    }

    /* renamed from: a */
    public static boolean m57303a(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: b */
    public static boolean m57304b(int i) {
        return (i & 2) != 0;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getOverflow() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbstractC28657b
    /* renamed from: a */
    public final void mo49602a() {
        this.f67481f = true;
        mo49605b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public View getRealParentView() {
        C28650a aVar = (C28650a) this.mView;
        if (aVar == null) {
            return null;
        }
        return aVar.getLinearLayout();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getScrollX() {
        return ((C28650a) this.mView).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getScrollY() {
        return ((C28650a) this.mView).getScrollY();
    }

    /* renamed from: c */
    private void m57305c() {
        if (this.f67483h) {
            ((C28650a) this.mView).setOrientation(1);
        } else {
            ((C28650a) this.mView).setOrientation(0);
        }
    }

    /* renamed from: b */
    public final void mo49605b() {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        for (int i = 0; i < this.mChildren.size(); i++) {
            ((LynxBaseUI) this.mChildren.get(i)).checkStickyOnParentScroll(scrollX, scrollY);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void invalidate() {
        ((C28650a) this.mView).getLinearLayout().invalidate();
        ((C28650a) this.mView).invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((C28650a) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void layout() {
        super.layout();
        int i = this.f67485j;
        if (i <= 0) {
            return;
        }
        if (this.f67483h && i + getHeight() <= ((C28650a) this.mView).getContentHeight()) {
            ((C28650a) this.mView).mo49615a(((C28650a) this.mView).getRealScrollX(), this.f67485j, false);
            this.f67485j = 0;
        } else if (!this.f67483h && this.f67485j + getWidth() <= ((C28650a) this.mView).getContentWidth()) {
            ((C28650a) this.mView).mo49615a(this.f67485j, ((C28650a) this.mView).getRealScrollY(), false);
            this.f67485j = 0;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void measure() {
        boolean z;
        if (((C28650a) this.mView).getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < getChildCount(); i++) {
            LynxBaseUI childAt = getChildAt(i);
            if (z) {
                width = Math.max(width, childAt.getWidth() + childAt.getLeft() + childAt.mMarginRight + this.mPaddingRight);
            } else {
                height = Math.max(height, childAt.getHeight() + childAt.getTop() + childAt.mMarginBottom);
            }
        }
        if (!(((C28650a) this.mView).getContentWidth() == width && ((C28650a) this.mView).getContentHeight() == height)) {
            float f = (float) width;
            float f2 = (float) height;
            if (this.f67484i && DisplayMetricsHolder.m57911a() != null) {
                C28725c cVar = new C28725c(getSign(), "contentsizechanged");
                cVar.mo49838a("scrollWidth", Float.valueOf(f / DisplayMetricsHolder.m57911a().density));
                cVar.mo49838a("scrollHeight", Float.valueOf(f2 / DisplayMetricsHolder.m57911a().density));
                if (this.mContext != null) {
                    this.mContext.f67064e.mo49834a(cVar);
                }
            }
        }
        C28650a aVar = (C28650a) this.mView;
        aVar.f67494f = height;
        aVar.f67493e = width;
        if (aVar.f67489a != null) {
            aVar.f67489a.requestLayout();
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setLowerThreshole(int i) {
        this.f67486k = i;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setScrollTap(boolean z) {
        this.f67480e = z;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setUpperThreshole(int i) {
        this.f67487l = i;
    }

    public UIScrollView(AbstractC28520j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: b */
    public final void mo29937b(boolean z) {
        this.f67483h = !z;
        m57305c();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        C28650a aVar = new C28650a(context);
        aVar.setOnScrollListener(new C28650a.AbstractC28654a() {
            /* class com.lynx.tasm.behavior.p2052ui.scroll.UIScrollView.C286491 */

            static {
                Covode.recordClassIndex(34714);
            }

            @Override // com.lynx.tasm.behavior.p2052ui.scroll.C28650a.AbstractC28654a
            /* renamed from: b */
            public final void mo49610b() {
                if (UIScrollView.this.f67481f) {
                    UIScrollView.this.mo49605b();
                }
            }

            @Override // com.lynx.tasm.behavior.p2052ui.scroll.C28650a.AbstractC28654a
            /* renamed from: a */
            public final void mo49607a() {
                if (UIScrollView.this.f67479d) {
                    UIScrollView uIScrollView = UIScrollView.this;
                    uIScrollView.mo49603a(uIScrollView.getScrollX(), UIScrollView.this.getScrollY(), UIScrollView.this.getScrollX(), UIScrollView.this.getScrollY(), "scrollend");
                }
            }

            @Override // com.lynx.tasm.behavior.p2052ui.scroll.C28650a.AbstractC28654a
            /* renamed from: a */
            public final void mo49608a(int i) {
                if (!UIScrollView.this.f67480e) {
                    if (i != 0) {
                        UIScrollView.this.recognizeGesturere();
                    }
                } else if (i == 1) {
                    UIScrollView.this.recognizeGesturere();
                }
            }

            @Override // com.lynx.tasm.behavior.p2052ui.scroll.C28650a.AbstractC28654a
            /* renamed from: a */
            public final void mo49609a(int i, int i2, int i3, int i4) {
                if (UIScrollView.this.f67481f) {
                    UIScrollView.this.mo49605b();
                }
                if (UIScrollView.this.f67477b || UIScrollView.this.f67476a) {
                    int a = UIScrollView.this.mo49601a(i, i2);
                    if (UIScrollView.this.f67477b && UIScrollView.m57304b(a) && !UIScrollView.m57304b(UIScrollView.this.f67482g)) {
                        UIScrollView uIScrollView = UIScrollView.this;
                        uIScrollView.mo49603a(uIScrollView.getScrollX(), UIScrollView.this.getScrollY(), UIScrollView.this.getScrollX(), UIScrollView.this.getScrollY(), "scrolltolower");
                    } else if (UIScrollView.this.f67476a && UIScrollView.m57303a(a) && !UIScrollView.m57303a(UIScrollView.this.f67482g)) {
                        UIScrollView uIScrollView2 = UIScrollView.this;
                        uIScrollView2.mo49603a(uIScrollView2.getScrollX(), UIScrollView.this.getScrollY(), UIScrollView.this.getScrollX(), UIScrollView.this.getScrollY(), "scrolltoupper");
                    }
                    UIScrollView.this.f67482g = a;
                }
                if (UIScrollView.this.f67478c) {
                    UIScrollView.this.mo49603a(i, i2, i3, i4, "scroll");
                }
            }
        });
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setEnableScroll(boolean z) {
        if (this.mView != null) {
            ((C28650a) this.mView).setEnableScroll(z);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setScrollBarEnable(boolean z) {
        try {
            ((C28650a) this.mView).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e) {
            LLog.m56856a(6, "UIScrollView", e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setScrollLeft(int i) {
        int realScrollY = ((C28650a) this.mView).getRealScrollY();
        int a = (int) C28926j.m57938a((float) i);
        if (getWidth() + a <= ((C28650a) this.mView).getContentWidth()) {
            ((C28650a) this.mView).mo49615a(a, realScrollY, false);
            this.f67485j = 0;
            return;
        }
        this.f67485j = a;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setScrollTop(int i) {
        int realScrollX = ((C28650a) this.mView).getRealScrollX();
        int a = (int) C28926j.m57938a((float) i);
        if (getHeight() + a <= ((C28650a) this.mView).getContentHeight()) {
            ((C28650a) this.mView).mo49615a(realScrollX, a, false);
            this.f67485j = 0;
            return;
        }
        this.f67485j = a;
    }

    @AbstractC28528p
    public void autoScroll(ReadableMap readableMap) {
        C28650a aVar = (C28650a) this.mView;
        double d = readableMap.getDouble("rate", 0.0d);
        if (!readableMap.getBoolean("start", true)) {
            aVar.f67503o = false;
            aVar.f67504p = 0;
        } else if (d > 0.0d && !aVar.f67503o) {
            aVar.f67503o = true;
            aVar.f67504p = (int) Math.max((double) C28926j.m57938a((float) (d / 60.0d)), 1.0d);
            aVar.f67502n = new C28650a.RunnableC28656c(aVar, (byte) 0);
            aVar.post(aVar.f67502n);
        }
    }

    @AbstractC28528p
    public void scrollTo(ReadableMap readableMap) {
        double d = readableMap.getDouble("offset", 0.0d);
        int i = readableMap.getInt("index", -1);
        double d2 = (double) DisplayMetricsHolder.m57911a().density;
        Double.isNaN(d2);
        double d3 = d * d2;
        boolean z = readableMap.getBoolean("smooth", false);
        if (this.f67483h) {
            if (i >= 0 && i < this.mChildren.size()) {
                double top = (double) ((LynxBaseUI) this.mChildren.get(i)).getTop();
                Double.isNaN(top);
                d3 += top;
            }
            ((C28650a) this.mView).mo49615a(0, (int) d3, z);
            return;
        }
        if (i >= 0 && i < this.mChildren.size()) {
            double left = (double) ((LynxBaseUI) this.mChildren.get(i)).getLeft();
            Double.isNaN(left);
            d3 += left;
        }
        ((C28650a) this.mView).mo49615a((int) d3, 0, z);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void scrollToIndex(int i) {
        if (i >= 0 && i < this.mChildren.size()) {
            if (this.f67483h) {
                ((C28650a) this.mView).mo49615a(((C28650a) this.mView).getRealScrollX(), ((LynxBaseUI) this.mChildren.get(i)).getTop(), false);
                return;
            }
            int realScrollY = ((C28650a) this.mView).getRealScrollY();
            ((C28650a) this.mView).mo49615a(((LynxBaseUI) this.mChildren.get(i)).getLeft(), realScrollY, false);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f67476a = false;
            this.f67477b = false;
            this.f67478c = false;
            this.f67479d = false;
            if (map.containsKey("scrolltolower")) {
                this.f67477b = true;
            }
            if (map.containsKey("scrolltoupper")) {
                this.f67476a = true;
            }
            if (map.containsKey("scroll")) {
                this.f67478c = true;
            }
            if (map.containsKey("scrollend")) {
                this.f67479d = true;
            }
            if (map.containsKey("contentsizechanged")) {
                this.f67484i = true;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setLynxDirection(int i) {
        this.mLynxDirection = i;
        if (i == 2) {
            ((C28650a) this.mView).setLayoutDirection(1);
            ((C28650a) this.mView).getHScrollView().setLayoutDirection(1);
            ((C28650a) this.mView).getLinearLayout().setLayoutDirection(1);
            return;
        }
        ((C28650a) this.mView).setLayoutDirection(0);
        ((C28650a) this.mView).getHScrollView().setLayoutDirection(0);
        ((C28650a) this.mView).getLinearLayout().setLayoutDirection(0);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public final void mo29936a(boolean z) {
        this.f67483h = z;
        m57305c();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        super.drawChild(lynxFlattenUI, canvas);
    }

    /* renamed from: a */
    public final int mo49601a(int i, int i2) {
        if (this.f67483h) {
            return m57302a(i2, this.f67487l, this.f67486k, 1, 2);
        }
        if (this.mLynxDirection == 2) {
            return m57302a(i, this.f67486k, this.f67487l, 2, 1);
        }
        return m57302a(i, this.f67487l, this.f67486k, 1, 2);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public final void mo29934a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
        mo29935a(lynxBaseUI, z, str, str2, 0);
    }

    /* renamed from: a */
    private int m57302a(int i, int i2, int i3, int i4, int i5) {
        int measuredWidth;
        int measuredWidth2;
        if (i <= i2) {
            return 0 | i4;
        }
        if (((C28650a) this.mView).getHScrollView() == null) {
            return 0;
        }
        View childAt = ((C28650a) this.mView).getHScrollView().getChildAt(0);
        if (this.f67483h) {
            measuredWidth = childAt.getMeasuredHeight();
            measuredWidth2 = ((C28650a) this.mView).getMeasuredHeight();
        } else {
            measuredWidth = childAt.getMeasuredWidth();
            measuredWidth2 = ((C28650a) this.mView).getMeasuredWidth();
        }
        if (i >= (measuredWidth - measuredWidth2) - i3) {
            return 0 | i5;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo49603a(int i, int i2, int i3, int i4, String str) {
        C28730h a = C28730h.m57546a(getSign(), str);
        a.mo49842a(i, i2, ((C28650a) this.mView).getContentHeight(), ((C28650a) this.mView).getContentWidth(), i - i3, i2 - i4);
        if (this.mContext != null) {
            this.mContext.f67064e.mo49834a(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29935a(com.lynx.tasm.behavior.p2052ui.LynxBaseUI r6, boolean r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.scroll.UIScrollView.mo29935a(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String, int):void");
    }
}
