package com.bytedance.ies.xelement;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.C18938a;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28730h;
import java.util.Map;

public class LynxNestedScrollView extends AbsLynxUIScroll<C18938a> implements C18938a.AbstractC18941a {

    /* renamed from: a */
    public boolean f44771a;

    /* renamed from: b */
    private boolean f44772b;

    /* renamed from: c */
    private boolean f44773c;

    /* renamed from: d */
    private boolean f44774d;

    /* renamed from: e */
    private boolean f44775e;

    static {
        Covode.recordClassIndex(21635);
    }

    @Override // com.bytedance.ies.xelement.C18938a.AbstractC18941a
    /* renamed from: a */
    public final void mo29932a(int i) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public final void mo29934a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public final void mo29935a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2, int i) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void scrollToIndex(int i) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setLowerThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setScrollLeft(int i) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setScrollTop(int i) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setUpperThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getScrollX() {
        return ((C18938a) this.mView).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getScrollY() {
        return ((C18938a) this.mView).getScrollY();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void invalidate() {
        ((C18938a) this.mView).getLinearLayout().invalidate();
    }

    /* renamed from: a */
    private void m35102a() {
        if (this.f44772b) {
            ((C18938a) this.mView).setOrientation(1);
        } else {
            ((C18938a) this.mView).setOrientation(0);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((C18938a) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void measure() {
        boolean z;
        if (((C18938a) this.mView).getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < getChildCount(); i++) {
            LynxBaseUI childAt = getChildAt(i);
            if (z) {
                width = Math.max(width, childAt.getWidth() + childAt.getLeft());
            } else {
                height = Math.max(height, childAt.getHeight() + childAt.getTop());
            }
        }
        C18938a aVar = (C18938a) this.mView;
        aVar.f44825i = height;
        aVar.f44824h = width;
        if (aVar.f44820d != null) {
            aVar.f44820d.requestLayout();
        }
        super.measure();
    }

    public LynxNestedScrollView(AbstractC28520j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setScrollTap(boolean z) {
        this.f44771a = z;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: b */
    public final void mo29937b(boolean z) {
        this.f44772b = !z;
        m35102a();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        C18938a aVar = new C18938a(context);
        aVar.setOnScrollListener(new C18938a.AbstractC18941a() {
            /* class com.bytedance.ies.xelement.LynxNestedScrollView.C189151 */

            static {
                Covode.recordClassIndex(21638);
            }

            @Override // com.bytedance.ies.xelement.C18938a.AbstractC18941a
            /* renamed from: a */
            public final void mo29933a(int i, int i2, int i3, int i4) {
            }

            @Override // com.bytedance.ies.xelement.C18938a.AbstractC18941a
            /* renamed from: a */
            public final void mo29932a(int i) {
                if (!LynxNestedScrollView.this.f44771a) {
                    if (i != 0) {
                        LynxNestedScrollView.this.recognizeGesturere();
                    }
                } else if (i == 1) {
                    LynxNestedScrollView.this.recognizeGesturere();
                }
            }
        });
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public void setScrollBarEnable(boolean z) {
        try {
            ((C18938a) this.mView).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e) {
            LLog.m56856a(6, "UIScrollView", e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f44773c = false;
            this.f44774d = false;
            this.f44775e = false;
            if (map.containsKey("scrolltolower")) {
                this.f44774d = true;
            }
            if (map.containsKey("scrolltoupper")) {
                this.f44773c = true;
            }
            if (map.containsKey("scroll")) {
                this.f44775e = true;
            }
            if (this.f44774d || this.f44773c || this.f44775e) {
                ((C18938a) this.mView).setOnScrollListener(this);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public final void mo29936a(boolean z) {
        this.f44772b = z;
        m35102a();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        lynxFlattenUI.mo49319b(canvas);
    }

    @Override // com.bytedance.ies.xelement.C18938a.AbstractC18941a
    /* renamed from: a */
    public final void mo29933a(int i, int i2, int i3, int i4) {
        View childAt;
        if (this.f44775e) {
            m35103a(i, i2, i3, i4, "scroll");
        }
        if (i == i3 && i == 0) {
            if (i2 != 0) {
                View childAt2 = ((C18938a) this.mView).getChildAt(0);
                if (childAt2 != null && childAt2.getMeasuredHeight() == getScrollY() + ((C18938a) this.mView).getMeasuredHeight() && this.f44774d) {
                    m35103a(0, i2, i3, i4, "scrolltolower");
                }
            } else if (this.f44773c) {
                m35103a(0, 0, i3, i4, "scrolltoupper");
            }
        } else if (i2 != i4 || i2 != 0) {
        } else {
            if (i == 0 || (i > 0 && i3 == 0)) {
                if (this.f44773c) {
                    m35103a(i, 0, i3, i4, "scrolltoupper");
                }
            } else if (((C18938a) this.mView).getHScrollView() != null && (childAt = ((C18938a) this.mView).getHScrollView().getChildAt(0)) != null && i == childAt.getMeasuredWidth() - ((C18938a) this.mView).getMeasuredWidth() && this.f44774d) {
                m35103a(i, 0, i3, i4, "scrolltolower");
            }
        }
    }

    /* renamed from: a */
    private void m35103a(int i, int i2, int i3, int i4, String str) {
        C28730h a = C28730h.m57546a(getSign(), str);
        a.mo49842a(i, i2, ((C18938a) this.mView).getContentHeight(), ((C18938a) this.mView).getContentWidth(), i3 - i, i4 - i2);
        if (this.mContext != null) {
            this.mContext.f67064e.mo49834a(a);
        }
    }
}
