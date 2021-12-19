package com.lynx.tasm.behavior.p2052ui;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2048a.AbstractC28464a;
import com.lynx.tasm.behavior.p2052ui.AbstractC28586a;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.list.UIList;
import com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.lynx.tasm.behavior.ui.UIGroup */
public abstract class UIGroup<T extends ViewGroup> extends LynxUI<T> implements AbstractC28586a, AbstractC28618d {
    private static final float[] mEventCoords = new float[2];
    private static final Matrix mInverseMatrix = new Matrix();
    private static final float[] mMatrixTransformCoords = new float[2];
    private static final PointF mTempPoint = new PointF();
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();
    private int mCurrentDrawIndex;
    private LynxBaseUI mCurrentDrawUI;
    private C28619e mDrawingOrderHelper;
    public boolean mIsInsertViewCalled;
    private Rect mOverflowClipRect;

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a
    public void afterDrawChild(Canvas canvas, View view, long j) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean needCustomLayout() {
        return false;
    }

    /* access modifiers changed from: protected */
    public View getRealParentView() {
        return this.mView;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a
    public boolean hasOverlappingRendering() {
        return this.mOverlappingRendering;
    }

    public int getChildCount() {
        return this.mChildren.size();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        dispatchOnAttach();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        dispatchOnDetach();
    }

    public void updateLynxUIChildrenOrder() {
        Collections.sort(this.mViewChildren, new Comparator<LynxUI>() {
            /* class com.lynx.tasm.behavior.p2052ui.UIGroup.C285821 */

            static {
                Covode.recordClassIndex(34614);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(LynxUI lynxUI, LynxUI lynxUI2) {
                LynxUI lynxUI3 = lynxUI;
                LynxUI lynxUI4 = lynxUI2;
                if (lynxUI3.getZIndex() < lynxUI4.getZIndex()) {
                    return -1;
                }
                if (lynxUI3.getZIndex() == lynxUI4.getZIndex()) {
                    return 0;
                }
                return 1;
            }
        });
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void buildLynxUITree() {
        if (!this.mViewChildren.isEmpty()) {
            this.mViewChildren.removeAll(this.mViewChildren.subList(0, this.mViewChildren.size()));
        }
        super.buildLynxUITree();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.destroy();
        }
    }

    public void dispatchOnAttach() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.onAttach();
        }
    }

    public void dispatchOnDetach() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.onDetach();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void initialize() {
        super.initialize();
        this.mDrawingOrderHelper = new C28619e((ViewGroup) this.mView);
        if (this.mView instanceof AbstractC28586a.AbstractC28587a) {
            ((AbstractC28586a.AbstractC28587a) this.mView).bindDrawChildHook(this);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void layout() {
        if (((ViewGroup) this.mView).isLayoutRequested()) {
            super.layout();
            layoutChildren();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void measure() {
        if (((ViewGroup) this.mView).isLayoutRequested()) {
            measureChildren();
            super.measure();
        }
    }

    static {
        Covode.recordClassIndex(34611);
    }

    public void measureChildren() {
        if (this.mContext.f67076q) {
            for (LynxBaseUI lynxBaseUI : this.mChildren) {
                lynxBaseUI.measure();
            }
            return;
        }
        for (LynxBaseUI lynxBaseUI2 : this.mChildren) {
            lynxBaseUI2.measure();
        }
    }

    public void removeAll() {
        if (this.mContext.f67077r) {
            for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
                lynxBaseUI.mDrawParent = null;
            }
            this.mDrawHead = null;
        }
        for (LynxBaseUI lynxBaseUI2 : this.mChildren) {
            lynxBaseUI2.setParent(null);
        }
        this.mChildren.clear();
        if (this.mView != null) {
            ((ViewGroup) this.mView).removeAllViews();
        }
    }

    public void updateDrawingOrder() {
        C28619e eVar = this.mDrawingOrderHelper;
        eVar.f67350b = 0;
        for (int i = 0; i < eVar.f67349a.getChildCount(); i++) {
            if (getViewZIndex(eVar.f67349a.getChildAt(i)) != null) {
                eVar.f67350b++;
            }
        }
        eVar.f67351c = null;
        setChildrenDrawingOrderEnabledHelper(this.mDrawingOrderHelper.mo49509a());
        invalidate();
    }

    public void buildOrUpdateViewTree() {
        if (this.mView != null) {
            updateLynxUIChildrenOrder();
            if (this.mShouldAttachChildrenView) {
                ((ViewGroup) this.mView).removeAllViews();
            }
            for (LynxUI lynxUI : this.mViewChildren) {
                if (this.mShouldAttachChildrenView) {
                    if (lynxUI.mCSSPosition == 2) {
                        ((UIBody.C28581a) this.mContext.f67068i.mView).addView(lynxUI.mView);
                    } else {
                        ((ViewGroup) this.mView).addView(lynxUI.mView);
                    }
                }
                if (lynxUI instanceof UIGroup) {
                    ((UIGroup) lynxUI).buildOrUpdateViewTree();
                }
            }
            ((ViewGroup) this.mView).invalidate();
        }
    }

    public void layoutChildren() {
        if (this.mContext.f67076q) {
            for (LynxBaseUI lynxBaseUI : this.mChildren) {
                if (!needCustomLayout()) {
                    lynxBaseUI.layout();
                } else if (!lynxBaseUI.isFlatten()) {
                    ((UIGroup) lynxBaseUI).layoutChildren();
                }
            }
            return;
        }
        for (int i = 0; i < this.mChildren.size(); i++) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) this.mChildren.get(i);
            if (!needCustomLayout()) {
                if (!lynxBaseUI2.isFlatten()) {
                    lynxBaseUI2.layout();
                } else if (lynxBaseUI2.isFlatten() && this.mContext.f67077r) {
                    ((LynxFlattenUI) lynxBaseUI2).mo49317a(lynxBaseUI2.getOriginLeft(), lynxBaseUI2.getOriginTop(), null);
                }
            } else if (lynxBaseUI2 instanceof UIGroup) {
                ((UIGroup) lynxBaseUI2).layoutChildren();
            }
        }
    }

    public UIGroup(AbstractC28520j jVar) {
        this(jVar, null);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getIndex(LynxBaseUI lynxBaseUI) {
        return this.mChildren.indexOf(lynxBaseUI);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public LynxBaseUI getChildAt(int i) {
        return (LynxBaseUI) this.mChildren.get(i);
    }

    public boolean onRemoveChild(LynxBaseUI lynxBaseUI) {
        if (!this.mChildren.remove(lynxBaseUI)) {
            return false;
        }
        lynxBaseUI.setParent(null);
        return true;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void removeChild(LynxBaseUI lynxBaseUI) {
        if (onRemoveChild(lynxBaseUI)) {
            removeView(lynxBaseUI);
        }
    }

    private void setChildrenDrawingOrderEnabledHelper(boolean z) {
        if (this.mView instanceof C28698a) {
            ((C28698a) this.mView).setChildrenDrawingOrderEnabled(z);
        } else if (this.mView instanceof UIBody.C28581a) {
            ((UIBody.C28581a) this.mView).setChildrenDrawingOrderEnabled(z);
        }
    }

    private void onRemoveChildUI(LynxUI lynxUI) {
        if (ENABLE_ZINDEX) {
            C28619e eVar = this.mDrawingOrderHelper;
            if (getViewZIndex(lynxUI.mView) != null) {
                eVar.f67350b--;
            }
            eVar.f67351c = null;
            setChildrenDrawingOrderEnabledHelper(this.mDrawingOrderHelper.mo49509a());
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a
    public void afterDispatchDraw(Canvas canvas) {
        if (this.mContext.f67077r) {
            for (LynxBaseUI lynxBaseUI = this.mCurrentDrawUI; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
                if (lynxBaseUI.isFlatten() && !(lynxBaseUI instanceof UIShadowProxy)) {
                    drawChild((LynxFlattenUI) lynxBaseUI, canvas);
                }
            }
            return;
        }
        for (int i = this.mCurrentDrawIndex; i < this.mChildren.size(); i++) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) this.mChildren.get(i);
            if (lynxBaseUI2 instanceof LynxFlattenUI) {
                drawChild((LynxFlattenUI) lynxBaseUI2, canvas);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a
    public void beforeDispatchDraw(Canvas canvas) {
        BackgroundDrawable backgroundDrawable;
        Path path;
        this.mCurrentDrawUI = this.mDrawHead;
        this.mCurrentDrawIndex = 0;
        if (!(!this.mClipToRadius || this.mLynxBackground == null || (backgroundDrawable = this.mLynxBackground.f67659e) == null || !(backgroundDrawable instanceof BackgroundDrawable) || backgroundDrawable.f67608g == null || !backgroundDrawable.mo49753a() || backgroundDrawable.f67604c == null || (path = backgroundDrawable.f67604c.f67631c) == null)) {
            canvas.clipPath(path);
        }
        int i = Build.VERSION.SDK_INT;
    }

    public void removeView(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            ((ViewGroup) this.mView).removeView(lynxUI.mView);
            if (lynxBaseUI instanceof UIList) {
                ((ViewGroup) this.mView).removeView(((UIList) lynxBaseUI).f67365g);
            }
            onRemoveChildUI(lynxUI);
            return;
        }
        invalidate();
    }

    public void insertView(LynxUI lynxUI) {
        int i = -1;
        if (!this.mContext.f67077r) {
            for (Object obj : this.mChildren) {
                if (obj instanceof LynxUI) {
                    i++;
                    continue;
                }
                if (obj == lynxUI) {
                    break;
                }
            }
        } else {
            for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
                if (lynxBaseUI instanceof LynxUI) {
                    i++;
                }
                if (lynxBaseUI == lynxUI) {
                    break;
                }
            }
        }
        if (lynxUI.mView.getParent() != null && (lynxUI.mView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) lynxUI.mView.getParent()).removeView(lynxUI.mView);
            onRemoveChildUI(lynxUI);
        }
        ((ViewGroup) this.mView).addView(lynxUI.mView, i);
        onAddChildUI(lynxUI, i);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    public void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
        this.mChildren.add(i, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    public UIGroup(AbstractC28520j jVar, Object obj) {
        super(jVar, obj);
        this.mCurrentDrawUI = this.mDrawHead;
        this.mOverflowClipRect = new Rect();
        this.mIsInsertViewCalled = false;
    }

    public void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        Rect bound = lynxFlattenUI.getBound();
        if (bound == null) {
            lynxFlattenUI.mo49318a(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(bound);
        lynxFlattenUI.mo49318a(canvas);
        canvas.restore();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        onInsertChild(lynxBaseUI, i);
        if (!this.mContext.f67077r && (lynxBaseUI instanceof LynxUI)) {
            insertView((LynxUI) lynxBaseUI);
        }
        this.mIsInsertViewCalled = true;
    }

    private void onAddChildUI(LynxUI lynxUI, int i) {
        if (ENABLE_ZINDEX) {
            C28619e eVar = this.mDrawingOrderHelper;
            if (getViewZIndex(lynxUI.mView) != null) {
                eVar.f67350b++;
            }
            eVar.f67351c = null;
            setChildrenDrawingOrderEnabledHelper(this.mDrawingOrderHelper.mo49509a());
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a
    public int getChildDrawingOrder(int i, int i2) {
        C28619e eVar = this.mDrawingOrderHelper;
        if (eVar == null) {
            return i2;
        }
        if (eVar.f67351c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(eVar.f67349a.getChildAt(i3));
            }
            Collections.sort(arrayList, new Comparator<View>() {
                /* class com.lynx.tasm.behavior.p2052ui.C28619e.C286201 */

                static {
                    Covode.recordClassIndex(34667);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(View view, View view2) {
                    View view3 = view2;
                    Integer viewZIndex = UIGroup.getViewZIndex(view);
                    Integer num = 0;
                    if (viewZIndex == null) {
                        viewZIndex = num;
                    }
                    Integer viewZIndex2 = UIGroup.getViewZIndex(view3);
                    if (viewZIndex2 != null) {
                        num = viewZIndex2;
                    }
                    return viewZIndex.intValue() - num.intValue();
                }
            });
            eVar.f67351c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                eVar.f67351c[i4] = eVar.f67349a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return eVar.f67351c[i2];
    }

    private Rect drawFlattenUIBefore(Canvas canvas, View view, long j) {
        for (LynxBaseUI lynxBaseUI = this.mCurrentDrawUI; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (!lynxBaseUI.isFlatten()) {
                if (((LynxUI) lynxBaseUI).mView == view) {
                    Rect bound = lynxBaseUI.getBound();
                    this.mCurrentDrawUI = lynxBaseUI.mNextDrawUI;
                    return bound;
                }
            } else if (lynxBaseUI.isFlatten()) {
                drawChild((LynxFlattenUI) lynxBaseUI, canvas);
            }
        }
        return null;
    }

    private static LynxUI findTouchTargetOnViewChian(float[] fArr, ViewGroup viewGroup, Map<View, LynxUI> map) {
        LynxUI lynxUI = null;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            PointF pointF = mTempPoint;
            if (isTransformedTouchPointInView(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                if (map.containsKey(childAt)) {
                    lynxUI = map.get(childAt);
                } else {
                    if (childAt instanceof ViewGroup) {
                        lynxUI = findTouchTargetOnViewChian(fArr, (ViewGroup) childAt, map);
                    }
                    fArr[0] = f;
                    fArr[1] = f2;
                }
                if (lynxUI != null) {
                    return lynxUI;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
        }
        return lynxUI;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a
    public Rect beforeDrawChild(Canvas canvas, View view, long j) {
        if (this.mContext.f67077r) {
            return drawFlattenUIBefore(canvas, view, j);
        }
        for (int i = this.mCurrentDrawIndex; i < this.mChildren.size(); i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) this.mChildren.get(i);
            if (lynxBaseUI instanceof LynxUI) {
                if (((LynxUI) lynxBaseUI).mView == view) {
                    this.mCurrentDrawIndex = i + 1;
                    return lynxBaseUI.getBound();
                }
            } else if (lynxBaseUI instanceof LynxFlattenUI) {
                drawChild((LynxFlattenUI) lynxBaseUI, canvas);
                if (this.mContext.f67076q) {
                    this.mCurrentDrawIndex++;
                }
            }
        }
        return null;
    }

    public AbstractC28464a findUIWithCustomLayout(float f, float f2, UIGroup uIGroup) {
        HashMap hashMap = new HashMap();
        for (int childCount = uIGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            LynxBaseUI childAt = uIGroup.getChildAt(childCount);
            if (childAt instanceof UIShadowProxy) {
                childAt = ((UIShadowProxy) childAt).f67262a;
            }
            if (childAt instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) childAt;
                hashMap.put(lynxUI.mView, lynxUI);
            } else {
                new RuntimeException("ui that need custom layout should not have flatten child!");
            }
        }
        float[] fArr = {f, f2};
        LynxUI findTouchTargetOnViewChian = findTouchTargetOnViewChian(fArr, (ViewGroup) uIGroup.mView, hashMap);
        if (findTouchTargetOnViewChian == null) {
            return uIGroup;
        }
        if (!findTouchTargetOnViewChian.needCustomLayout() || !(findTouchTargetOnViewChian instanceof UIGroup)) {
            return findTouchTargetOnViewChian.hitTest(fArr[0] + ((float) findTouchTargetOnViewChian.getScrollX()), fArr[1] + ((float) findTouchTargetOnViewChian.getScrollY()));
        }
        UIGroup uIGroup2 = (UIGroup) findTouchTargetOnViewChian;
        return uIGroup2.findUIWithCustomLayout(fArr[0], fArr[1], uIGroup2);
    }

    private static boolean isTransformedTouchPointInView(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = mMatrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = mInverseMatrix;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (scrollX < 0.0f || scrollX >= ((float) (view.getRight() - view.getLeft())) || scrollY < 0.0f || scrollY >= ((float) (view.getBottom() - view.getTop()))) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
