package com.bytedance.ies.xelement.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.AbstractC28618d;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxOverlayViewProxy extends UIGroup<C28698a> {

    /* renamed from: d */
    public static final C19302a f45612d = new C19302a((byte) 0);

    /* renamed from: a */
    public int f45613a = -1;

    /* renamed from: b */
    public int f45614b;

    /* renamed from: c */
    public int f45615c;

    /* renamed from: e */
    private final LynxOverlayView f45616e;

    static {
        Covode.recordClassIndex(22084);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy$a */
    public static final class C19302a {
        static {
            Covode.recordClassIndex(22087);
        }

        private C19302a() {
        }

        public /* synthetic */ C19302a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final LynxUI<?> getTransitionUI() {
        return this.f45616e;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public final int getChildCount() {
        return this.f45616e.getChildCount();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onAnimationUpdated() {
        this.f45616e.onAnimationUpdated();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void onDetach() {
        this.f45616e.onDetach();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final List<LynxBaseUI> getChildren() {
        List<LynxBaseUI> children = this.f45616e.getChildren();
        C89219l.m154709a((Object) children, "");
        return children;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void layout() {
        super.layout();
        this.f45616e.layout();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void measure() {
        super.measure();
        this.f45616e.measure();
    }

    /* renamed from: com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy$b */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC19303b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C19304c f45617a;

        /* renamed from: b */
        final /* synthetic */ LynxOverlayViewProxy f45618b;

        static {
            Covode.recordClassIndex(22088);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC19303b(C19304c cVar, LynxOverlayViewProxy lynxOverlayViewProxy) {
            this.f45617a = cVar;
            this.f45618b = lynxOverlayViewProxy;
        }

        public final void onGlobalLayout() {
            int[] iArr = new int[2];
            this.f45617a.getLocationOnScreen(iArr);
            if (this.f45617a.getWidth() != 0 && this.f45617a.getHeight() != 0) {
                if (iArr[0] >= this.f45618b.f45615c || iArr[0] <= 0 - this.f45617a.getWidth() || iArr[1] >= this.f45618b.f45614b || iArr[1] <= 0 - this.f45617a.getHeight()) {
                    this.f45618b.onDetach();
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void afterPropsUpdated(C28716v vVar) {
        this.f45616e.afterPropsUpdated(vVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void insertView(LynxUI<?> lynxUI) {
        this.f45616e.insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        this.f45616e.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        this.f45616e.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setBackgroundColor(int i) {
        this.f45616e.setBackgroundColor(i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        this.f45616e.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updatePropertiesInterval(C28716v vVar) {
        this.f45616e.updatePropertiesInterval(vVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final LynxBaseUI getChildAt(int i) {
        LynxBaseUI childAt = this.f45616e.getChildAt(i);
        C89219l.m154709a((Object) childAt, "");
        return childAt;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setParent(AbstractC28618d dVar) {
        super.setParent(dVar);
        this.f45616e.setParent(dVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        super.updateLayoutInfo(lynxBaseUI);
        this.f45616e.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        C89219l.m154719c(context, "");
        C19304c cVar = new C19304c(this, context, context);
        cVar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC19303b(cVar, this));
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxOverlayViewProxy(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
        LynxOverlayView lynxOverlayView = new LynxOverlayView(jVar, this);
        this.f45616e = lynxOverlayView;
        super.insertChild(lynxOverlayView, 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context baseContext = jVar.getBaseContext();
        if (baseContext != null) {
            WindowManager windowManager = ((Activity) baseContext).getWindowManager();
            C89219l.m154709a((Object) windowManager, "");
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f45614b = displayMetrics.heightPixels;
            this.f45615c = displayMetrics.widthPixels;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.f45616e.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        this.f45616e.insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setSign(int i, String str) {
        super.setSign(i, str);
        this.f45616e.setSign(i, str);
    }

    /* renamed from: com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy$c */
    public static final class C19304c extends C28698a {

        /* renamed from: a */
        final /* synthetic */ LynxOverlayViewProxy f45619a;

        /* renamed from: b */
        final /* synthetic */ Context f45620b;

        static {
            Covode.recordClassIndex(22089);
        }

        /* access modifiers changed from: protected */
        public final void onVisibilityChanged(View view, int i) {
            C89219l.m154719c(view, "");
            if (i == 8) {
                this.f45619a.onDetach();
            } else if (this.f45619a.f45613a == 8) {
                this.f45619a.onAttach();
            }
            this.f45619a.f45613a = i;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19304c(LynxOverlayViewProxy lynxOverlayViewProxy, Context context, Context context2) {
            super(context2);
            this.f45619a = lynxOverlayViewProxy;
            this.f45620b = context;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        C89219l.m154719c(rect, "");
        super.updateDrawingLayoutInfo(i, i2, rect);
        this.f45616e.updateDrawingLayoutInfo(i, i2, rect);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setLayoutData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        super.setLayoutData(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect);
        this.f45616e.setLayoutData(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        this.f45616e.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
