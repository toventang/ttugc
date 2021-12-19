package com.lynx.tasm.behavior.p2052ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2049b.C28466a;
import com.lynx.tasm.behavior.p2049b.C28471b;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.text.AndroidText;
import com.lynx.tasm.behavior.p2052ui.utils.C28682a;
import com.lynx.tasm.behavior.p2052ui.utils.C28692g;
import com.lynx.tasm.behavior.p2052ui.utils.C28693h;
import com.lynx.tasm.p2043a.C28393a;
import com.lynx.tasm.p2043a.C28407b;
import com.lynx.tasm.p2043a.p2044a.C28394a;
import com.lynx.tasm.p2043a.p2044a.C28397c;
import com.lynx.tasm.p2043a.p2045b.C28410c;
import com.lynx.tasm.p2043a.p2046c.C28422a;
import com.lynx.tasm.utils.C28916c;
import com.lynx.tasm.utils.C28929m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.LynxUI */
public abstract class LynxUI<T extends View> extends LynxBaseUI {
    protected static final boolean ENABLE_ZINDEX;
    public C28682a mBackgroundManager;
    public LynxBaseUI mDrawHead;
    public C28466a mHeroAnimOwner;
    private C28394a mKeyframeManager;
    private C28410c mLayoutAnimator;
    public boolean mOverlappingRendering;
    private boolean mSetVisibleByCSS;
    private C28422a mTransitionAnimator;
    public T mView;
    protected List<LynxUI> mViewChildren;
    private int mZIndex;

    /* access modifiers changed from: protected */
    public T createView(Context context) {
        return null;
    }

    /* access modifiers changed from: protected */
    public T createView(Context context, Object obj) {
        return null;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int i = 0;
            double d = 0.0d;
            switch (nextKey.hashCode()) {
                case -2005042753:
                    if (nextKey.equals("z-index")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setZIndex(i);
                        continue;
                    }
                    break;
                case -1970593579:
                    if (nextKey.equals("lynx-test-tag")) {
                        setTestID(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1796753876:
                    if (nextKey.equals("pause-transition-name")) {
                        setPauseTransitionName(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case -1613231517:
                    if (nextKey.equals("resume-transition-name")) {
                        setResumeTransitionName(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case -1297725862:
                    if (nextKey.equals("layout-animation-create-property")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setLayoutAnimationCreateProperty(i);
                        continue;
                    }
                    break;
                case -1274492040:
                    if (nextKey.equals("filter")) {
                        setFilter(readableMap.isNull(nextKey) ? 0.0f : (float) readableMap.getDouble(nextKey, 0.0d));
                        continue;
                    }
                    break;
                case -1267206133:
                    if (nextKey.equals("opacity")) {
                        setAlpha(readableMap.isNull(nextKey) ? 1.0f : (float) readableMap.getDouble(nextKey, 1.0d));
                        continue;
                    }
                    break;
                case -1091287993:
                    if (nextKey.equals("overlap")) {
                        setOverlap(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1087342188:
                    if (nextKey.equals("shared-element")) {
                        setShareElement(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1013209314:
                    if (nextKey.equals("layout-animation-create-delay")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationCreateDelay(d);
                        continue;
                    }
                    break;
                case -412530555:
                    if (nextKey.equals("layout-animation-delete-timing-function")) {
                        setLayoutAnimationDeleteTimingFunc(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case -316342365:
                    if (nextKey.equals("layout-animation-update-timing-function")) {
                        setLayoutAnimationUpdateTimingFunc(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case -49240502:
                    if (nextKey.equals("layout-animation-delete-duration")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationDeleteDuration(d);
                        continue;
                    }
                    break;
                case 315007413:
                    if (nextKey.equals("accessibility-label")) {
                        setAccessibilityLabel(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 374052076:
                    if (nextKey.equals("layout-animation-update-duration")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationUpdateDuration(d);
                        continue;
                    }
                    break;
                case 633600340:
                    if (nextKey.equals("exit-transition-name")) {
                        setExitTransitionName(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case 805728555:
                    if (nextKey.equals("layout-animation-update-delay")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationUpdateDelay(d);
                        continue;
                    }
                    break;
                case 949630603:
                    if (nextKey.equals("layout-animation-delete-property")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setLayoutAnimationDeleteProperty(i);
                        continue;
                    }
                    break;
                case 985926797:
                    if (nextKey.equals("layout-animation-delete-delay")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationDeleteDelay(d);
                        continue;
                    }
                    break;
                case 1052666732:
                    if (nextKey.equals("transform")) {
                        setTransform(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case 1372923181:
                    if (nextKey.equals("layout-animation-update-property")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setLayoutAnimationUpdateProperty(i);
                        continue;
                    }
                    break;
                case 1485345550:
                    if (nextKey.equals("enter-transition-name")) {
                        setEnterTransitionName(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case 1941332754:
                    if (nextKey.equals("visibility")) {
                        int i2 = 1;
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 1);
                        }
                        setVisibility(i2);
                        continue;
                    }
                    break;
                case 1998370329:
                    if (nextKey.equals("layout-animation-create-duration")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationCreateDuration(d);
                        continue;
                    }
                    break;
                case 2022810070:
                    if (nextKey.equals("layout-animation-create-timing-function")) {
                        setLayoutAnimationCreateTimingFunc(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    public LynxUI getTransitionUI() {
        return null;
    }

    public void setLayoutAnimationCreateTimingFunc(String str) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public C28394a getKeyframeManager() {
        return this.mKeyframeManager;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public C28410c getLayoutAnimator() {
        return this.mLayoutAnimator;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public C28422a getTransitionAnimator() {
        return this.mTransitionAnimator;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean getVisibility() {
        return this.mSetVisibleByCSS;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getZIndex() {
        return this.mZIndex;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void layout() {
        handleLayout();
    }

    public int getBackgroundColor() {
        return this.mBackgroundManager.f67662h;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getTranslationX() {
        return this.mView.getTranslationX();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getTranslationY() {
        return this.mView.getTranslationY();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void invalidate() {
        this.mView.invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void requestLayout() {
        this.mView.requestLayout();
    }

    private void prepareKeyframeManager() {
        if (this.mKeyframeManager == null) {
            this.mKeyframeManager = new C28394a(this);
        }
    }

    private void prepareLayoutAnimator() {
        if (this.mLayoutAnimator == null) {
            this.mLayoutAnimator = new C28410c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getScaleX() {
        T t = this.mView;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleX();
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getScaleY() {
        T t = this.mView;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleY();
    }

    public boolean isRtl() {
        if (this.mLynxDirection == 2) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onDrawingPositionChanged() {
        if (!this.mView.isLayoutRequested()) {
            handleLayout();
            invalidate();
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(34603);
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        ENABLE_ZINDEX = z;
    }

    private boolean shouldDoTransformTransition() {
        C28422a aVar;
        if (this.mIsFirstAnimatedReady || !this.hasTransformChanged || (aVar = this.mTransitionAnimator) == null || !aVar.mo48864a(4096)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getTranslationZ() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.mView.getTranslationZ();
        }
        return this.mBackgroundManager.f67641c;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean isUserInteractionEnabled() {
        T t;
        if (!this.userInteractionEnabled || (t = this.mView) == null || t.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean enableLayoutAnimation() {
        C28410c cVar = this.mLayoutAnimator;
        if (cVar == null || ((cVar.f66790s == null || !cVar.f66790s.mo48843a()) && ((cVar.f66792u == null || !cVar.f66792u.mo48843a()) && (cVar.f66791t == null || !cVar.f66791t.mo48843a())))) {
            return false;
        }
        return true;
    }

    public void execPauseAnim() {
        C28466a aVar = this.mHeroAnimOwner;
        if (C28471b.C28474a.f66975a.f66967f && !aVar.mo48976a() && aVar.f66950g != null) {
            aVar.f66944a.setAnimation(aVar.f66950g);
            if (aVar.f66944a.getKeyframeManager() != null) {
                aVar.f66944a.getKeyframeManager().mo48816a();
            }
        }
    }

    public void execResumeAnim() {
        C28466a aVar = this.mHeroAnimOwner;
        if (C28471b.C28474a.f66975a.f66967f && !aVar.mo48976a() && aVar.f66951h != null) {
            aVar.f66944a.setAnimation(aVar.f66951h);
            if (aVar.f66944a.getKeyframeManager() != null) {
                aVar.f66944a.getKeyframeManager().mo48816a();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void initialize() {
        super.initialize();
        T createView = createView(this.mContext, this.mParam);
        this.mView = createView;
        if (createView == null) {
            this.mView = createView(this.mContext);
        }
        if (this.mView != null) {
            this.mHeroAnimOwner = new C28466a(this);
            C28682a aVar = new C28682a(this, this.mContext);
            this.mBackgroundManager = aVar;
            this.mLynxBackground = aVar;
            this.mBackgroundManager.f67660f = this.mDrawableCallback;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void measure() {
        String str = "LynxUI." + this.mTagName + "measure";
        TraceEvent.m56864a(0, str);
        setLayoutParamsInternal();
        this.mView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        TraceEvent.m56869b(0, str);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        C28394a aVar = this.mKeyframeManager;
        if (!(aVar == null || aVar.f66719b == null)) {
            for (C28397c cVar : aVar.f66719b.values()) {
                cVar.mo48824e();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        if (getBound() != null && (getBound().width() <= 0 || getBound().height() <= 0)) {
            this.mView.setVisibility(8);
        } else if (this.mSetVisibleByCSS) {
            this.mView.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void setLayoutParamsInternal() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams generateLayoutParams;
        if (this.mParent != null && (this.mParent instanceof UIGroup) && ((LynxBaseUI) this.mParent).needCustomLayout() && (generateLayoutParams = ((LynxBaseUI) this.mParent).generateLayoutParams((layoutParams = this.mView.getLayoutParams()))) != null && layoutParams != generateLayoutParams) {
            updateLayoutParams(generateLayoutParams);
        }
    }

    public boolean hasAnimationRunning() {
        T t;
        C28394a aVar = this.mKeyframeManager;
        if (aVar != null && aVar.f66719b != null) {
            Iterator<C28397c> it = aVar.f66719b.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo48821b()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C28422a aVar2 = this.mTransitionAnimator;
        if ((aVar2 == null || aVar2.f66848u == null || !aVar2.f66848u.isRunning()) && ((t = this.mView) == null || t.getAnimation() == null)) {
            return false;
        }
        return true;
    }

    private void handleLayout() {
        String str = "LynxUI." + this.mTagName + ".layout";
        TraceEvent.m56864a(0, str);
        String str2 = str + ".mView";
        TraceEvent.m56864a(0, str2);
        this.mView.layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
        TraceEvent.m56869b(0, str2);
        if (this.mParent instanceof UIShadowProxy) {
            ((UIShadowProxy) this.mParent).mo49395b();
        }
        if (this.mView.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.mView.getParent();
            if (getOverflow() != 0) {
                viewGroup.setClipChildren(false);
            }
            C0792v.m2745a(this.mView, getBoundRectForOverflow());
            int i = Build.VERSION.SDK_INT;
        }
        if (getOverflow() != 0 && (getWidth() == 0 || getHeight() == 0)) {
            T t = this.mView;
            if (t instanceof AndroidText) {
                ((AndroidText) t).setOverflow(getOverflow());
            }
        }
        TraceEvent.m56869b(0, str);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onAnimatedNodeReady() {
        C28422a aVar;
        LynxBaseUI lynxBaseUI;
        if (shouldDoTransform()) {
            C28682a aVar2 = this.mBackgroundManager;
            C28692g gVar = this.mTransformOrigin;
            LynxUI lynxUI = aVar2.f67639a.get();
            if (!(lynxUI == null || gVar == null)) {
                C28693h a = C28693h.m57449a(gVar, (float) lynxUI.getLatestWidth(), (float) lynxUI.getLatestHeight());
                lynxUI.mView.setPivotX(a.f67675b);
                lynxUI.mView.setPivotY(a.f67676c);
                lynxUI.mView.invalidate();
            }
            if (shouldDoTransformTransition()) {
                C28422a aVar3 = this.mTransitionAnimator;
                if (aVar3.f66846s != null) {
                    lynxBaseUI = aVar3.f66846s;
                } else {
                    lynxBaseUI = this;
                }
                aVar3.mo48865a(lynxBaseUI, 4096, lynxBaseUI.mTransformRaw);
            } else {
                this.mBackgroundManager.mo49766a(this.mTransformRaw);
            }
        }
        if (!this.mIsFirstAnimatedReady && (aVar = this.mTransitionAnimator) != null && !aVar.f66847t.isEmpty() && (aVar.f66848u == null || !aVar.f66847t.equals(aVar.f66848u.getChildAnimations()))) {
            aVar.f66848u = new AnimatorSet();
            aVar.f66848u.playTogether(aVar.f66847t);
            aVar.f66848u.start();
        }
        C28394a aVar4 = this.mKeyframeManager;
        if (aVar4 != null) {
            aVar4.mo48816a();
        }
        super.onAnimatedNodeReady();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        C28394a aVar = this.mKeyframeManager;
        if (!(aVar == null || aVar.f66719b == null)) {
            for (C28397c cVar : aVar.f66719b.values()) {
                if (cVar.f66726c != null) {
                    ObjectAnimator[] objectAnimatorArr = cVar.f66726c;
                    for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                        objectAnimator.removeAllListeners();
                    }
                }
            }
        }
        C28410c cVar2 = this.mLayoutAnimator;
        if (!(cVar2 == null || cVar2.f66772a == null || cVar2.f66772a.get() == null)) {
            cVar2.f66772a.get().updateLayout(cVar2.f66773b, cVar2.f66774c, cVar2.f66775d, cVar2.f66776e, cVar2.f66777f, cVar2.f66778g, cVar2.f66779h, cVar2.f66780i, cVar2.f66785n, cVar2.f66786o, cVar2.f66787p, cVar2.f66788q, cVar2.f66781j, cVar2.f66782k, cVar2.f66783l, cVar2.f66784m, cVar2.f66789r);
        }
    }

    public LynxUI(Context context) {
        this((AbstractC28520j) context);
    }

    public void setEnterAnim(C28407b bVar) {
        this.mHeroAnimOwner.f66948e = bVar;
    }

    public void setExitAnim(C28407b bVar) {
        this.mHeroAnimOwner.f66949f = bVar;
    }

    public void setPauseAnim(C28407b bVar) {
        this.mHeroAnimOwner.f66950g = bVar;
    }

    public void setResumeAnim(C28407b bVar) {
        this.mHeroAnimOwner.f66951h = bVar;
    }

    @AbstractC28525m(mo49059a = "shared-element")
    public void setShareElement(String str) {
        this.mHeroAnimOwner.mo48975a(str);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    @AbstractC28525m(mo49059a = "lynx-test-tag")
    public void setTestID(String str) {
        this.mView.setTag(str);
    }

    public LynxUI(AbstractC28520j jVar) {
        this(jVar, null);
    }

    public void setAnimation(C28407b bVar) {
        prepareKeyframeManager();
        C28407b[] bVarArr = {bVar};
        this.mKeyframeManager.f66718a = bVarArr;
    }

    @AbstractC28525m(mo49059a = "enter-transition-name")
    public void setEnterTransitionName(ReadableArray readableArray) {
        C28407b a = C28407b.m56802a(readableArray);
        if (a != null) {
            C28471b.C28474a.f66975a.mo48981a(this, a);
        }
    }

    @AbstractC28525m(mo49059a = "exit-transition-name")
    public void setExitTransitionName(ReadableArray readableArray) {
        C28407b a = C28407b.m56802a(readableArray);
        if (a != null) {
            C28471b.C28474a.f66975a.mo48983b(this, a);
        }
    }

    @AbstractC28525m(mo49059a = "layout-animation-create-delay")
    public void setLayoutAnimationCreateDelay(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48849b().mo48841a((long) d);
    }

    @AbstractC28525m(mo49059a = "layout-animation-create-duration")
    public void setLayoutAnimationCreateDuration(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48849b().mo48845b((long) d);
    }

    @AbstractC28525m(mo49059a = "layout-animation-create-property")
    public void setLayoutAnimationCreateProperty(int i) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48849b().mo48839a(i);
    }

    @AbstractC28525m(mo49059a = "layout-animation-create-timing-function")
    public void setLayoutAnimationCreateTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48849b().mo48842a(readableArray);
    }

    @AbstractC28525m(mo49059a = "layout-animation-delete-delay")
    public void setLayoutAnimationDeleteDelay(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48851d().mo48841a((long) d);
    }

    @AbstractC28525m(mo49059a = "layout-animation-delete-duration")
    public void setLayoutAnimationDeleteDuration(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48851d().mo48845b((long) d);
    }

    @AbstractC28525m(mo49059a = "layout-animation-delete-property")
    public void setLayoutAnimationDeleteProperty(int i) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48851d().mo48839a(i);
    }

    @AbstractC28525m(mo49059a = "layout-animation-delete-timing-function")
    public void setLayoutAnimationDeleteTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48851d().mo48842a(readableArray);
    }

    @AbstractC28525m(mo49059a = "layout-animation-update-delay")
    public void setLayoutAnimationUpdateDelay(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48850c().mo48841a((long) d);
    }

    @AbstractC28525m(mo49059a = "layout-animation-update-duration")
    public void setLayoutAnimationUpdateDuration(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48850c().mo48845b((long) d);
    }

    @AbstractC28525m(mo49059a = "layout-animation-update-property")
    public void setLayoutAnimationUpdateProperty(int i) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48850c().mo48839a(i);
    }

    @AbstractC28525m(mo49059a = "layout-animation-update-timing-function")
    public void setLayoutAnimationUpdateTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.mo48850c().mo48842a(readableArray);
    }

    @AbstractC28525m(mo49059a = "overlap")
    public void setOverlap(String str) {
        this.mOverlappingRendering = !TextUtils.equals(str, "false");
    }

    @AbstractC28525m(mo49059a = "pause-transition-name")
    public void setPauseTransitionName(ReadableArray readableArray) {
        C28407b a = C28407b.m56802a(readableArray);
        if (a != null) {
            C28471b.C28474a.f66975a.mo48985d(this, a);
        }
    }

    @AbstractC28525m(mo49059a = "resume-transition-name")
    public void setResumeTransitionName(ReadableArray readableArray) {
        C28407b a = C28407b.m56802a(readableArray);
        if (a != null) {
            C28471b.C28474a.f66975a.mo48984c(this, a);
        }
    }

    public ReadableMap getKeyframes(String str) {
        if (this.mContext != null) {
            AbstractC28520j jVar = this.mContext;
            if (jVar.f67062c != null && jVar.f67062c.hasKey(str)) {
                return jVar.f67062c.getMap(str);
            }
        }
        return null;
    }

    public void onAnimationEnd(String str) {
        C28466a aVar = this.mHeroAnimOwner;
        C28397c.AbstractC28403c cVar = aVar.f66955l.get(str);
        if (cVar != null) {
            cVar.mo48831a(str);
            aVar.f66955l.remove(str);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    @AbstractC28525m(mo49059a = "accessibility-label")
    public void setAccessibilityLabel(AbstractC28367a aVar) {
        super.setAccessibilityLabel(aVar);
        T t = this.mView;
        if (t != null) {
            t.setFocusable(true);
            this.mView.setContentDescription(getAccessibilityLabel());
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    @AbstractC28525m(mo49059a = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        if (getKeyframeManager() != null) {
            getKeyframeManager().mo48817a("Transform", this.mTransformRaw);
        }
    }

    public void setVisibilityForView(int i) {
        if (i == 0) {
            this.mSetVisibleByCSS = true;
            this.mView.setVisibility(0);
        } else if (i == 4) {
            this.mSetVisibleByCSS = false;
            this.mView.setVisibility(4);
        }
    }

    @AbstractC28525m(mo49059a = "opacity", mo49062d = 1.0f)
    public void setAlpha(float f) {
        if (getKeyframeManager() != null) {
            getKeyframeManager().mo48817a("Alpha", Float.valueOf(f));
        }
        C28422a aVar = this.mTransitionAnimator;
        if (aVar == null || !aVar.mo48864a(1)) {
            if (f != this.mView.getAlpha()) {
                this.mView.setAlpha(f);
            }
            C28410c cVar = this.mLayoutAnimator;
            if (cVar != null) {
                cVar.f66794w = f;
                return;
            }
            return;
        }
        this.mTransitionAnimator.mo48865a(this, 1, Float.valueOf(f));
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setAnimation(ReadableArray readableArray) {
        prepareKeyframeManager();
        if (readableArray == null) {
            this.mKeyframeManager.mo48818b();
            return;
        }
        int size = readableArray.size();
        C28407b[] bVarArr = new C28407b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = C28407b.m56802a(readableArray.getArray(i));
        }
        this.mKeyframeManager.f66718a = bVarArr;
    }

    @AbstractC28525m(mo49059a = "filter")
    public void setFilter(float f) {
        if (this.mView != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.0f - f);
            Paint paint = new Paint(1);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.mView.setLayerType(2, paint);
        }
    }

    @AbstractC28525m(mo49059a = "z-index")
    public void setZIndex(int i) {
        if (ENABLE_ZINDEX && this.mZIndex != i) {
            this.mZIndex = i;
            if (!this.mContext.f67076q) {
                UIGroup.setViewZIndex(this.mView, i);
                LynxBaseUI lynxBaseUI = (LynxBaseUI) this.mParent;
                if (lynxBaseUI instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI).updateDrawingOrder();
                }
            }
        }
    }

    public void updateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = getWidth();
            layoutParams.height = getHeight();
            if (layoutParams != this.mView.getLayoutParams()) {
                this.mView.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        throw new RuntimeException("LayoutPrams should not be null");
    }

    public void execExitAnim(C28471b.AbstractC28476c cVar) {
        C28466a aVar = this.mHeroAnimOwner;
        if (C28471b.C28474a.f66975a.f66967f && !aVar.mo48976a() && aVar.f66949f != null) {
            aVar.f66955l.put(aVar.f66949f.f66756a, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: INVOKE  
                  (wrap: java.util.HashMap<java.lang.String, com.lynx.tasm.a.a.c$c> : 0x0017: IGET  (r1v0 java.util.HashMap<java.lang.String, com.lynx.tasm.a.a.c$c>) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a) com.lynx.tasm.behavior.b.a.l java.util.HashMap)
                  (wrap: java.lang.String : 0x0015: IGET  (r2v0 java.lang.String) = 
                  (wrap: com.lynx.tasm.a.b : 0x0013: IGET  (r0v4 com.lynx.tasm.a.b) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a) com.lynx.tasm.behavior.b.a.f com.lynx.tasm.a.b)
                 com.lynx.tasm.a.b.a java.lang.String)
                  (wrap: com.lynx.tasm.behavior.b.a$3 : 0x001b: CONSTRUCTOR  (r0v5 com.lynx.tasm.behavior.b.a$3) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a), (r6v0 'cVar' com.lynx.tasm.behavior.b.b$c) call: com.lynx.tasm.behavior.b.a.3.<init>(com.lynx.tasm.behavior.b.a, com.lynx.tasm.behavior.b.b$c):void type: CONSTRUCTOR)
                 type: VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object in method: com.lynx.tasm.behavior.ui.LynxUI.execExitAnim(com.lynx.tasm.behavior.b.b$c):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r0v5 com.lynx.tasm.behavior.b.a$3) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a), (r6v0 'cVar' com.lynx.tasm.behavior.b.b$c) call: com.lynx.tasm.behavior.b.a.3.<init>(com.lynx.tasm.behavior.b.a, com.lynx.tasm.behavior.b.b$c):void type: CONSTRUCTOR in method: com.lynx.tasm.behavior.ui.LynxUI.execExitAnim(com.lynx.tasm.behavior.b.b$c):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.lynx.tasm.behavior.b.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.LynxUI.execExitAnim(com.lynx.tasm.behavior.b.b$c):void");
        }

        @AbstractC28525m(mo49059a = "visibility", mo49063e = 1)
        public void setVisibility(int i) {
            C28422a aVar = this.mTransitionAnimator;
            if (aVar == null || !aVar.mo48864a(128)) {
                int visibility = this.mView.getVisibility();
                if (i == 1) {
                    this.mSetVisibleByCSS = true;
                    this.mView.setVisibility(0);
                    visibility = 0;
                } else if (i == 0) {
                    this.mSetVisibleByCSS = false;
                    this.mView.setVisibility(4);
                    visibility = 4;
                }
                if (this.mParent instanceof UIShadowProxy) {
                    ((LynxUI) this.mParent).setVisibilityForView(visibility);
                    return;
                }
                return;
            }
            this.mTransitionAnimator.mo48865a(this, 128, Integer.valueOf(i));
        }

        @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
        public void initTransitionAnimator(ReadableMap readableMap) {
            C28422a aVar = this.mTransitionAnimator;
            if (aVar != null) {
                aVar.mo48862a(readableMap);
            }
            C28422a aVar2 = new C28422a(getTransitionUI());
            this.mTransitionAnimator = aVar2;
            if (readableMap != null) {
                ReadableArray array = readableMap.getArray("transition");
                if (array == null) {
                    aVar2.mo48861a();
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= array.size()) {
                            break;
                        }
                        ReadableArray array2 = array.getArray(i);
                        int i2 = array2.getInt(0);
                        C28407b bVar = new C28407b();
                        bVar.f66759d = i2;
                        bVar.f66757b = (long) array2.getDouble(1);
                        bVar.f66758c = (long) array2.getDouble(bVar.mo48834a(array2, 2));
                        if (bVar.f66759d == 8177) {
                            aVar2.f66849v.clear();
                            int[] iArr = C28393a.f66717a;
                            for (int i3 : iArr) {
                                C28407b bVar2 = new C28407b(bVar);
                                bVar2.f66759d = i3;
                                aVar2.f66849v.put(bVar2.f66759d, bVar2);
                            }
                        } else {
                            aVar2.f66849v.put(bVar.f66759d, bVar);
                            i++;
                        }
                    }
                    if (aVar2.f66849v.size() != 0) {
                        return;
                    }
                }
            }
            this.mTransitionAnimator = null;
        }

        @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
        public void setTransitionData(float[] fArr) {
            C28422a aVar = this.mTransitionAnimator;
            if (aVar != null) {
                aVar.mo48862a((ReadableMap) null);
            }
            C28422a aVar2 = new C28422a(getTransitionUI());
            this.mTransitionAnimator = aVar2;
            if (fArr == null || fArr.length == 0) {
                aVar2.mo48861a();
            } else {
                int i = 0;
                while (true) {
                    if (i >= fArr.length / 9) {
                        break;
                    }
                    C28407b bVar = new C28407b();
                    int i2 = i * 9;
                    bVar.f66757b = (long) fArr[i2];
                    bVar.f66758c = (long) fArr[i2 + 1];
                    bVar.f66759d = (int) fArr[i2 + 2];
                    bVar.mo48835a((int) fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5], fArr[i2 + 6], fArr[i2 + 7], (int) fArr[i2 + 8]);
                    if (bVar.f66759d == 8177) {
                        aVar2.f66849v.clear();
                        int[] iArr = C28393a.f66717a;
                        for (int i3 : iArr) {
                            C28407b bVar2 = new C28407b(bVar);
                            bVar2.f66759d = i3;
                            aVar2.f66849v.put(bVar2.f66759d, bVar2);
                        }
                    } else {
                        aVar2.f66849v.put(bVar.f66759d, bVar);
                        i++;
                    }
                }
                if (aVar2.f66849v.size() != 0) {
                    return;
                }
            }
            this.mTransitionAnimator = null;
        }

        @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
        public void updateAttributes(C28716v vVar) {
            ReadableMap readableMap = vVar.f67715a;
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                try {
                    switch (nextKey.hashCode()) {
                        case -1970593579:
                            if (!nextKey.equals("lynx-test-tag")) {
                                break;
                            } else {
                                setTestID(readableMap.getString(nextKey));
                                break;
                            }
                        case -1091287993:
                            if (!nextKey.equals("overlap")) {
                                break;
                            } else {
                                setOverlap(readableMap.getString(nextKey));
                                break;
                            }
                        case -1087342188:
                            if (!nextKey.equals("shared-element")) {
                                break;
                            } else {
                                setShareElement(readableMap.getString(nextKey));
                                break;
                            }
                        case 315007413:
                            if (!nextKey.equals("accessibility-label")) {
                                break;
                            } else {
                                setAccessibilityLabel(readableMap.getDynamic(nextKey));
                                break;
                            }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
                }
            }
            super.updateAttributes(vVar);
        }

        public void execEnterAnim(C28471b.AbstractC28475b bVar) {
            C28466a aVar = this.mHeroAnimOwner;
            if (C28471b.C28474a.f66975a.f66967f && !aVar.mo48976a() && aVar.f66948e != null) {
                if (aVar.f66952i != null) {
                    aVar.f66953j = true;
                    View a = C28471b.C28474a.f66975a.mo48979a(aVar.f66952i, aVar.f66944a);
                    UIBody.C28581a aVar2 = aVar.f66944a.mContext.f67068i.f67258a;
                    if (aVar2 != null) {
                        T t = aVar.f66944a.mView;
                        if (a != null) {
                            t.setVisibility(a.getVisibility());
                            t.setAlpha(a.getAlpha());
                            t.setTranslationX(a.getTranslationX());
                            t.setTranslationY(a.getTranslationY());
                            t.setRotation(a.getRotation());
                            t.setRotationX(a.getRotationX());
                            t.setRotationY(a.getRotationY());
                            t.setScaleX(a.getScaleX());
                            t.setScaleY(a.getScaleY());
                            int width = a.getWidth();
                            int height = a.getHeight();
                            if (aVar2.getRootView() instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) aVar2.getRootView();
                                if (t.getParent() != null) {
                                    aVar.f66946c = (ViewGroup) t.getParent();
                                    int childCount = aVar.f66946c.getChildCount();
                                    int i = 0;
                                    while (true) {
                                        if (i >= childCount) {
                                            break;
                                        } else if (t == aVar.f66946c.getChildAt(i)) {
                                            aVar.f66945b = i;
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                    aVar.f66946c.removeView(t);
                                    aVar.f66947d = (UIGroup) aVar.f66944a.mParent;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(width, height);
                                int[] iArr = new int[2];
                                a.getLocationInWindow(iArr);
                                marginLayoutParams.setMargins(iArr[0], iArr[1], 0, 0);
                                viewGroup.addView(t, marginLayoutParams);
                                C28929m.m57947a(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d2: INVOKE  
                                      (wrap: com.lynx.tasm.behavior.b.a$1 : 0x00cf: CONSTRUCTOR  (r0v33 com.lynx.tasm.behavior.b.a$1) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a) call: com.lynx.tasm.behavior.b.a.1.<init>(com.lynx.tasm.behavior.b.a):void type: CONSTRUCTOR)
                                     type: STATIC call: com.lynx.tasm.utils.m.a(java.lang.Runnable):void in method: com.lynx.tasm.behavior.ui.LynxUI.execEnterAnim(com.lynx.tasm.behavior.b.b$b):void, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00cf: CONSTRUCTOR  (r0v33 com.lynx.tasm.behavior.b.a$1) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a) call: com.lynx.tasm.behavior.b.a.1.<init>(com.lynx.tasm.behavior.b.a):void type: CONSTRUCTOR in method: com.lynx.tasm.behavior.ui.LynxUI.execEnterAnim(com.lynx.tasm.behavior.b.b$b):void, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 43 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.lynx.tasm.behavior.b.a, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 49 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 266
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.LynxUI.execEnterAnim(com.lynx.tasm.behavior.b.b$b):void");
                            }

                            @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
                            public void setSign(int i, String str) {
                                super.setSign(i, str);
                            }

                            public LynxUI(AbstractC28520j jVar, Object obj) {
                                super(jVar, obj);
                                this.mSetVisibleByCSS = true;
                                this.mOverlappingRendering = true;
                                this.mViewChildren = new ArrayList();
                            }

                            @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
                            public boolean checkStickyOnParentScroll(int i, int i2) {
                                PointF pointF;
                                boolean checkStickyOnParentScroll = super.checkStickyOnParentScroll(i, i2);
                                if (this.mSticky != null) {
                                    pointF = new PointF(this.mSticky.f67251a, this.mSticky.f67252b);
                                } else {
                                    pointF = null;
                                }
                                C28682a aVar = this.mBackgroundManager;
                                aVar.f67640b = pointF;
                                aVar.mo49767b();
                                return checkStickyOnParentScroll;
                            }

                            public void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
                                lynxBaseUI2.mDrawParent = this;
                                if (lynxBaseUI == null) {
                                    LynxBaseUI lynxBaseUI3 = this.mDrawHead;
                                    if (lynxBaseUI3 != null) {
                                        lynxBaseUI3.mPreviousDrawUI = lynxBaseUI2;
                                        lynxBaseUI2.mNextDrawUI = this.mDrawHead;
                                    }
                                    this.mDrawHead = lynxBaseUI2;
                                    return;
                                }
                                LynxBaseUI lynxBaseUI4 = lynxBaseUI.mNextDrawUI;
                                if (lynxBaseUI4 != null) {
                                    lynxBaseUI4.mPreviousDrawUI = lynxBaseUI2;
                                    lynxBaseUI2.mNextDrawUI = lynxBaseUI4;
                                }
                                lynxBaseUI2.mPreviousDrawUI = lynxBaseUI;
                                lynxBaseUI.mNextDrawUI = lynxBaseUI2;
                            }

                            @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2048a.AbstractC28464a
                            public void onFocusChanged(boolean z, boolean z2) {
                                if (!z2) {
                                    LynxEnv b = LynxEnv.m56706b();
                                    if (b.f66651r == null) {
                                        b.f66651r = (InputMethodManager) LynxEnv.m56702a(b.f66634a, "input_method");
                                    }
                                    InputMethodManager inputMethodManager = b.f66651r;
                                    if (inputMethodManager == null) {
                                        LLog.m56856a(5, "LynxUI", "Failed to get InputMethodManager");
                                    } else if (z) {
                                        inputMethodManager.showSoftInput(this.mView, 1);
                                    } else {
                                        inputMethodManager.hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
                                    }
                                }
                            }

                            @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
                            public void setAnimationData(String[] strArr, float[] fArr) {
                                prepareKeyframeManager();
                                if (!(strArr.length == 0 || fArr.length == 0)) {
                                    if (strArr[0] != null && !C28916c.m57920a(fArr[0], 0.0f)) {
                                        C28407b[] bVarArr = new C28407b[strArr.length];
                                        for (int i = 0; i < strArr.length; i++) {
                                            C28407b bVar = new C28407b();
                                            bVar.f66756a = strArr[i];
                                            int i2 = i * 12;
                                            bVar.f66757b = (long) fArr[i2];
                                            bVar.f66758c = (long) fArr[i2 + 1];
                                            bVar.mo48835a((int) fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5], fArr[i2 + 6], (int) fArr[i2 + 7]);
                                            bVar.f66766k = ((int) fArr[i2 + 8]) - 1;
                                            bVar.f66767l = (int) fArr[i2 + 9];
                                            bVar.f66768m = (int) fArr[i2 + 10];
                                            bVar.f66769n = (int) fArr[i2 + 11];
                                            bVarArr[i] = bVar;
                                        }
                                        this.mKeyframeManager.f66718a = bVarArr;
                                        return;
                                    }
                                }
                                this.mKeyframeManager.mo48818b();
                            }

                            @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
                            public void setTransformData(float f, float f2, int[] iArr, float[] fArr) {
                                super.setTransformData(f, f2, iArr, fArr);
                                if (getKeyframeManager() != null) {
                                    getKeyframeManager().mo48817a("Transform", this.mTransformRaw);
                                }
                            }

                            public void setLayoutAnimationTimingFunc(int i, int i2, float f, float f2, float f3, float f4, int i3) {
                                prepareLayoutAnimator();
                                if (i == 0) {
                                    this.mLayoutAnimator.mo48849b().mo48840a(i2, f, f2, f3, f4, i3);
                                } else if (i == 1) {
                                    this.mLayoutAnimator.mo48850c().mo48840a(i2, f, f2, f3, f4, i3);
                                } else if (i == 2) {
                                    this.mLayoutAnimator.mo48851d().mo48840a(i2, f, f2, f3, f4, i3);
                                }
                            }

                            @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
                            public void setLayoutAnimationData(int i, long j, long j2, int i2, int i3, float f, float f2, float f3, float f4, int i4) {
                                prepareLayoutAnimator();
                                if (i == 0) {
                                    setLayoutAnimationCreateDuration((double) j);
                                    setLayoutAnimationCreateDelay((double) j2);
                                    setLayoutAnimationCreateProperty(i2);
                                } else if (i == 1) {
                                    setLayoutAnimationUpdateDuration((double) j);
                                    setLayoutAnimationUpdateDelay((double) j2);
                                    setLayoutAnimationUpdateProperty(i2);
                                } else if (i == 2) {
                                    setLayoutAnimationDeleteDuration((double) j);
                                    setLayoutAnimationDeleteDelay((double) j2);
                                    setLayoutAnimationDeleteProperty(i2);
                                }
                                setLayoutAnimationTimingFunc(i, i3, f, f2, f3, f4, i4);
                            }
                        }
