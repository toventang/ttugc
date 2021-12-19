package com.lynx.tasm.behavior.p2052ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28526n;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28521k;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2048a.AbstractC28464a;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28591d;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28594f;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28597i;
import com.lynx.tasm.behavior.p2052ui.p2053a.EnumC28596h;
import com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.behavior.p2052ui.scroll.AbstractC28657b;
import com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import com.lynx.tasm.behavior.p2052ui.utils.C28690e;
import com.lynx.tasm.behavior.p2052ui.utils.C28691f;
import com.lynx.tasm.behavior.p2052ui.utils.C28692g;
import com.lynx.tasm.behavior.p2052ui.utils.C28695i;
import com.lynx.tasm.behavior.p2052ui.utils.EnumC28687c;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.behavior.shadow.EnumC28540e;
import com.lynx.tasm.p2043a.p2044a.C28394a;
import com.lynx.tasm.p2043a.p2045b.C28410c;
import com.lynx.tasm.p2043a.p2046c.C28422a;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28724b;
import com.lynx.tasm.utils.C28916c;
import com.lynx.tasm.utils.C28926j;
import com.lynx.tasm.utils.C28930n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.ui.LynxBaseUI */
public abstract class LynxBaseUI implements AbstractC28464a, AbstractC28618d {
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    protected boolean hasTransformChanged;
    public int mAccessibilityElementStatus;
    private String mAccessibilityLabel;
    protected int mBackgroundColor;
    protected Bitmap.Config mBitmapConfig;
    private boolean mBlockNativeEvent;
    public int mBorderBottomWidth;
    public int mBorderLeftWidth;
    public int mBorderRightWidth;
    public int mBorderTopWidth;
    public Rect mBound;
    public int mCSSPosition;
    public final List<LynxBaseUI> mChildren;
    public boolean mClipToRadius;
    public AbstractC28520j mContext;
    public ReadableMap mDataset;
    public AbstractC28618d mDrawParent;
    protected C28579a mDrawableCallback;
    public boolean mEnableScrollMonitor;
    public Map<String, C28723a> mEvents;
    private float mExtraOffsetX;
    private float mExtraOffsetY;
    protected boolean mFocusable;
    public float mFontSize;
    public boolean mHasRadius;
    private int mHeight;
    public String mIdSelector;
    protected boolean mIgnoreFocus;
    public boolean mIsFirstAnimatedReady;
    protected boolean mIsTransformNode;
    public final Point mLastSize;
    public final Point mLatestSize;
    private int mLeft;
    public C28690e mLynxBackground;
    protected int mLynxDirection;
    public int mMarginBottom;
    public int mMarginLeft;
    public int mMarginRight;
    public int mMarginTop;
    public float mMaxHeight;
    public String mName;
    public LynxBaseUI mNextDrawUI;
    private boolean mOnResponceChain;
    private int mOriginLeft;
    private int mOriginTop;
    protected int mOverflow;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    protected Object mParam;
    public AbstractC28618d mParent;
    public LynxBaseUI mPreviousDrawUI;
    private final JavaOnlyMap mProps;
    public String mRefId;
    public String mScrollMonitorTag;
    public boolean mShouldAttachChildrenView;
    private int mSign;
    protected Sticky mSticky;
    public String mTagName;
    private String mTestTagName;
    private int mTop;
    private float mTouchSlop;
    public C28692g mTransformOrigin;
    public List<C28695i> mTransformRaw;
    private int mWidth;
    protected boolean userInteractionEnabled;

    public boolean canHaveFlattenChild() {
        return true;
    }

    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Boolean bool = null;
            Boolean valueOf = null;
            Integer valueOf2 = null;
            Integer valueOf3 = null;
            Integer valueOf4 = null;
            Integer valueOf5 = null;
            boolean z = true;
            int i = 3;
            int i2 = -1;
            int i3 = 0;
            boolean z2 = false;
            boolean z3 = false;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            switch (nextKey.hashCode()) {
                case -2114666131:
                    if (nextKey.equals("overflow-x")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setOverflowX(i3);
                        break;
                    } else {
                        break;
                    }
                case -2114666130:
                    if (nextKey.equals("overflow-y")) {
                        if (!readableMap.isNull(nextKey)) {
                            i11 = readableMap.getInt(nextKey, 0);
                        }
                        setOverflowY(i11);
                        break;
                    } else {
                        break;
                    }
                case -1988632153:
                    if (!nextKey.equals("scroll-monitor-tag")) {
                        break;
                    } else {
                        setScrollMonitorTag(readableMap.getString(nextKey));
                        break;
                    }
                case -1970593579:
                    if (!nextKey.equals("lynx-test-tag")) {
                        break;
                    } else {
                        setTestID(readableMap.getString(nextKey));
                        break;
                    }
                case -1820411228:
                    if (!nextKey.equals("border-bottom-right-radius")) {
                        break;
                    } else {
                        setBorderRadius(3, readableMap.getArray(nextKey));
                        break;
                    }
                case -1779213470:
                    if (!nextKey.equals("box-shadow")) {
                        break;
                    } else {
                        setBoxShadow(readableMap.getArray(nextKey));
                        break;
                    }
                case -1586082113:
                    if (nextKey.equals(C19386b.f45895b)) {
                        setFontSize(readableMap.isNull(nextKey) ? 1.0E21f : (float) readableMap.getDouble(nextKey, 1.0E21d));
                        break;
                    } else {
                        break;
                    }
                case -1138223116:
                    if (!nextKey.equals("image-config")) {
                        break;
                    } else {
                        setImageConfig(readableMap.getString(nextKey));
                        break;
                    }
                case -1124782267:
                    if (!nextKey.equals("react-ref")) {
                        break;
                    } else {
                        setRefIdSelector(readableMap.getString(nextKey));
                        break;
                    }
                case -1032412580:
                    if (!nextKey.equals("border-top-right-radius")) {
                        break;
                    } else {
                        setBorderRadius(2, readableMap.getArray(nextKey));
                        break;
                    }
                case -992853731:
                    if (nextKey.equals("ignore-focus")) {
                        if (!readableMap.isNull(nextKey)) {
                            bool = Boolean.valueOf(readableMap.getBoolean(nextKey, false));
                        }
                        setIgnoreFocus(bool);
                        break;
                    } else {
                        break;
                    }
                case -962590849:
                    if (nextKey.equals("direction")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 3);
                        }
                        setLynxDirection(i);
                        break;
                    } else {
                        break;
                    }
                case -585734562:
                    if (nextKey.equals("border-left-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf5 = Integer.valueOf(readableMap.getInt(nextKey, 0));
                        }
                        setBorderColor(0, valueOf5);
                        break;
                    } else {
                        break;
                    }
                case -570796884:
                    if (nextKey.equals("border-left-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(1, i2);
                        break;
                    } else {
                        break;
                    }
                case -567450431:
                    if (nextKey.equals("border-left-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            i10 = readableMap.getInt(nextKey, 0);
                        }
                        setBorderWidth(1, i10);
                        break;
                    } else {
                        break;
                    }
                case -91694673:
                    if (!nextKey.equals("clip-radius")) {
                        break;
                    } else {
                        setClipToRadius(readableMap.getString(nextKey));
                        break;
                    }
                case -20727064:
                    if (!nextKey.equals("background-position")) {
                        break;
                    } else {
                        setBackgroundPosition(readableMap.getArray(nextKey));
                        break;
                    }
                case 3373707:
                    if (!nextKey.equals(StringSet.name)) {
                        break;
                    } else {
                        setName(readableMap.getString(nextKey));
                        break;
                    }
                case 143851658:
                    if (nextKey.equals("border-top-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf4 = Integer.valueOf(readableMap.getInt(nextKey, 0));
                        }
                        setBorderColor(2, valueOf4);
                        break;
                    } else {
                        break;
                    }
                case 158789336:
                    if (nextKey.equals("border-top-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(3, i2);
                        break;
                    } else {
                        break;
                    }
                case 162135789:
                    if (nextKey.equals("border-top-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            i9 = readableMap.getInt(nextKey, 0);
                        }
                        setBorderWidth(3, i9);
                        break;
                    } else {
                        break;
                    }
                case 307025104:
                    if (nextKey.equals("border-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(0, i2);
                        break;
                    } else {
                        break;
                    }
                case 310371557:
                    if (nextKey.equals(C19386b.f45897d)) {
                        setBorderWidth(0, readableMap.isNull(nextKey) ? 0 : readableMap.getInt(nextKey, 0));
                        break;
                    } else {
                        break;
                    }
                case 315007413:
                    if (!nextKey.equals("accessibility-label")) {
                        break;
                    } else {
                        setAccessibilityLabel(readableMap.getDynamic(nextKey));
                        break;
                    }
                case 419144785:
                    if (nextKey.equals("border-right-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf3 = Integer.valueOf(readableMap.getInt(nextKey, 0));
                        }
                        setBorderColor(1, valueOf3);
                        break;
                    } else {
                        break;
                    }
                case 431395352:
                    if (!nextKey.equals("outline-color")) {
                        break;
                    } else {
                        int i12 = -16777216;
                        if (!readableMap.isNull(nextKey)) {
                            i12 = readableMap.getInt(nextKey, -16777216);
                        }
                        setOutlineColor(i12);
                        break;
                    }
                case 434082463:
                    if (nextKey.equals("border-right-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(2, i2);
                        break;
                    } else {
                        break;
                    }
                case 437428916:
                    if (nextKey.equals("border-right-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            i8 = readableMap.getInt(nextKey, 0);
                        }
                        setBorderWidth(2, i8);
                        break;
                    } else {
                        break;
                    }
                case 446333030:
                    if (nextKey.equals("outline-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setOutlineStyle(i2);
                        break;
                    } else {
                        break;
                    }
                case 449679483:
                    if (nextKey.equals("outline-width")) {
                        setOutlineWidth(readableMap.isNull(nextKey) ? 0.0f : (float) readableMap.getDouble(nextKey, 0.0d));
                        break;
                    } else {
                        break;
                    }
                case 474781053:
                    if (!nextKey.equals("accessibility-element")) {
                        break;
                    } else {
                        setAccessibilityElement(readableMap.getDynamic(nextKey));
                        break;
                    }
                case 529642498:
                    if (nextKey.equals("overflow")) {
                        if (!readableMap.isNull(nextKey)) {
                            i7 = readableMap.getInt(nextKey, 0);
                        }
                        setOverflow(i7);
                        break;
                    } else {
                        break;
                    }
                case 605322756:
                    if (nextKey.equals("background-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            i6 = readableMap.getInt(nextKey, 0);
                        }
                        setBackgroundColor(i6);
                        break;
                    } else {
                        break;
                    }
                case 609634231:
                    if (!nextKey.equals("border-bottom-left-radius")) {
                        break;
                    } else {
                        setBorderRadius(4, readableMap.getArray(nextKey));
                        break;
                    }
                case 610793468:
                    if (!nextKey.equals("background-image")) {
                        break;
                    } else {
                        setBackgroundImage(readableMap.getArray(nextKey));
                        break;
                    }
                case 627129881:
                    if (!nextKey.equals("intersection-observers")) {
                        break;
                    } else {
                        setIntersectionObservers(readableMap.getArray(nextKey));
                        break;
                    }
                case 738316676:
                    if (nextKey.equals("user-interaction-enabled")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setUserInteractionEnabled(z);
                        break;
                    } else {
                        break;
                    }
                case 747804969:
                    if (nextKey.equals("position")) {
                        if (!readableMap.isNull(nextKey)) {
                            i5 = readableMap.getInt(nextKey, 0);
                        }
                        setCSSPosition(i5);
                        break;
                    } else {
                        break;
                    }
                case 881039699:
                    if (!nextKey.equals("border-radius")) {
                        break;
                    } else {
                        setBorderRadius(0, readableMap.getArray(nextKey));
                        break;
                    }
                case 956705090:
                    if (nextKey.equals("border-bottom-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf2 = Integer.valueOf(readableMap.getInt(nextKey, 0));
                        }
                        setBorderColor(3, valueOf2);
                        break;
                    } else {
                        break;
                    }
                case 971642768:
                    if (nextKey.equals("border-bottom-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(4, i2);
                        break;
                    } else {
                        break;
                    }
                case 974989221:
                    if (nextKey.equals("border-bottom-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setBorderWidth(4, i4);
                        break;
                    } else {
                        break;
                    }
                case 1266449551:
                    if (!nextKey.equals("background-clip")) {
                        break;
                    } else {
                        setBackgroundClip(readableMap.getArray(nextKey));
                        break;
                    }
                case 1266923840:
                    if (!nextKey.equals("background-size")) {
                        break;
                    } else {
                        setBackgroundSize(readableMap.getArray(nextKey));
                        break;
                    }
                case 1352416423:
                    if (!nextKey.equals("transform-origin")) {
                        break;
                    } else {
                        setTransformOrigin(readableMap.getArray(nextKey));
                        break;
                    }
                case 1443214456:
                    if (!nextKey.equals("dataset")) {
                        break;
                    } else {
                        setDataset(readableMap.getMap(nextKey));
                        break;
                    }
                case 1455741924:
                    if (nextKey.equals("enable-scroll-monitor")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setEnableScrollMonitor(z3);
                        break;
                    } else {
                        break;
                    }
                case 1466337535:
                    if (!nextKey.equals("border-top-left-radius")) {
                        break;
                    } else {
                        setBorderRadius(1, readableMap.getArray(nextKey));
                        break;
                    }
                case 1629011506:
                    if (nextKey.equals("focusable")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf = Boolean.valueOf(readableMap.getBoolean(nextKey, false));
                        }
                        setFocusable(valueOf);
                        break;
                    } else {
                        break;
                    }
                case 1740315162:
                    if (!nextKey.equals("idSelector")) {
                        break;
                    } else {
                        setIdSelector(readableMap.getString(nextKey));
                        break;
                    }
                case 1901673625:
                    if (!nextKey.equals("caret-color")) {
                        break;
                    } else {
                        setCaretColor(readableMap.getString(nextKey));
                        break;
                    }
                case 1931359397:
                    if (!nextKey.equals("background-origin")) {
                        break;
                    } else {
                        setBackgroundOrigin(readableMap.getArray(nextKey));
                        break;
                    }
                case 2005447450:
                    if (!nextKey.equals("background-repeat")) {
                        break;
                    } else {
                        setBackgroundRepeat(readableMap.getArray(nextKey));
                        break;
                    }
                case 2010977956:
                    if (nextKey.equals("block-native-event")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setBlockNativeEvent(z2);
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    public boolean enableLayoutAnimation() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    public C28394a getKeyframeManager() {
        return null;
    }

    public C28410c getLayoutAnimator() {
        return null;
    }

    /* access modifiers changed from: protected */
    public float getScaleX() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getScaleY() {
        return 1.0f;
    }

    public int getScrollX() {
        return 0;
    }

    public int getScrollY() {
        return 0;
    }

    public C28422a getTransitionAnimator() {
        return null;
    }

    public float getTranslationX() {
        return 0.0f;
    }

    public float getTranslationY() {
        return 0.0f;
    }

    public float getTranslationZ() {
        return 0.0f;
    }

    public boolean getVisibility() {
        return true;
    }

    public int getZIndex() {
        return 0;
    }

    public void initTransitionAnimator(ReadableMap readableMap) {
    }

    public void initialize() {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void invalidate() {
    }

    public boolean isFlatten() {
        return false;
    }

    public long measureText(float f, EnumC28540e eVar, float f2, EnumC28540e eVar2) {
        return 0;
    }

    public boolean needCustomLayout() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public void offResponseChain() {
        this.mOnResponceChain = false;
    }

    public void onAnimationUpdated() {
    }

    public void onBeforeAnimation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public void onBorderRadiusUpdated(int i) {
    }

    /* access modifiers changed from: protected */
    public void onDrawingPositionChanged() {
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public void onFocusChanged(boolean z, boolean z2) {
    }

    public void onLayoutFinish(long j) {
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public void onResponseChain() {
        this.mOnResponceChain = true;
    }

    public void renderIfNeeded() {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void requestLayout() {
    }

    public void setAnimation(ReadableArray readableArray) {
    }

    public void setAnimationData(String[] strArr, float[] fArr) {
    }

    @AbstractC28525m(mo49059a = "caret-color")
    public void setCaretColor(String str) {
    }

    public void setInlineImageStyleData(float[] fArr, int[] iArr) {
    }

    public void setLayoutAnimationData(int i, long j, long j2, int i2, int i3, float f, float f2, float f3, float f4, int i4) {
    }

    public void setTextStyleData(int[] iArr, double[] dArr, String str) {
    }

    public void setTransitionData(float[] fArr) {
    }

    public void updateExtraData(Object obj) {
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public boolean blockNativeEvent() {
        return this.mBlockNativeEvent;
    }

    public CharSequence getAccessibilityLabel() {
        return this.mAccessibilityLabel;
    }

    public Rect getBound() {
        return this.mBound;
    }

    public List<LynxBaseUI> getChildren() {
        return this.mChildren;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public Map<String, C28723a> getEvents() {
        return this.mEvents;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getOriginLeft() {
        return this.mOriginLeft;
    }

    public int getOriginTop() {
        return this.mOriginTop;
    }

    public int getOverflow() {
        return this.mOverflow;
    }

    public JavaOnlyMap getProps() {
        return this.mProps;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public int getSign() {
        return this.mSign;
    }

    public int getTop() {
        return this.mTop;
    }

    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public boolean ignoreFocus() {
        return this.mIgnoreFocus;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public boolean isFocusable() {
        return this.mFocusable;
    }

    public boolean isOnResponseChain() {
        return this.mOnResponceChain;
    }

    public boolean isUserInteractionEnabled() {
        return this.userInteractionEnabled;
    }

    public void onPropsUpdated() {
        invalidate();
    }

    public LynxBaseUI getDrawParent() {
        return (LynxBaseUI) this.mDrawParent;
    }

    public final int getLatestHeight() {
        return this.mLatestSize.y;
    }

    public final int getLatestWidth() {
        return this.mLatestSize.x;
    }

    public String getTestID() {
        String str = this.mTestTagName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void recognizeGesturere() {
        AbstractC28520j jVar = this.mContext;
        if (jVar != null) {
            jVar.mo49037a(this);
        }
    }

    private boolean isImageConfigBadCase() {
        if (Build.VERSION.SDK_INT != 25 || !isMeizu15()) {
            return false;
        }
        return true;
    }

    public void destroy() {
        this.mContext.mo49040b().mo49056a(this);
    }

    public LynxBaseUI getParentBaseUI() {
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            return (LynxBaseUI) ((LynxBaseUI) dVar).mParent;
        }
        return (LynxBaseUI) dVar;
    }

    public final boolean hasSizeChanged() {
        if (!this.mLastSize.equals(this.mLatestSize)) {
            return true;
        }
        return false;
    }

    public boolean isStackingContextNode() {
        if (getZIndex() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public AbstractC28464a parent() {
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof AbstractC28464a) {
            return (AbstractC28464a) dVar;
        }
        return null;
    }

    private float getTouchSlop() {
        if (this.mOnResponceChain) {
            return this.mTouchSlop * this.mContext.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    private static boolean isMeizu() {
        String str = Build.BRAND;
        if (str != null && str.toLowerCase(Locale.ENGLISH).indexOf("meizu") >= 0) {
            return true;
        }
        return false;
    }

    private static boolean isMeizu15() {
        if (!isMeizu() || TextUtils.isEmpty(Build.DEVICE)) {
            return false;
        }
        return Build.DEVICE.contains("15");
    }

    public LynxUI enclosingLynxUI() {
        for (LynxBaseUI lynxBaseUI = this; lynxBaseUI != null; lynxBaseUI = (LynxBaseUI) lynxBaseUI.mParent) {
            if (lynxBaseUI instanceof LynxUI) {
                return (LynxUI) lynxBaseUI;
            }
        }
        return null;
    }

    public LynxUI enclosingStackingContextLynxUI() {
        for (LynxBaseUI lynxBaseUI = this; lynxBaseUI != null; lynxBaseUI = (LynxBaseUI) lynxBaseUI.mParent) {
            if ((lynxBaseUI instanceof LynxUI) && lynxBaseUI.isStackingContextNode()) {
                return (LynxUI) lynxBaseUI;
            }
        }
        return null;
    }

    public LynxUI enclosingTransformLynxUI() {
        for (LynxBaseUI lynxBaseUI = this; lynxBaseUI != null; lynxBaseUI = (LynxBaseUI) lynxBaseUI.mParent) {
            if ((lynxBaseUI instanceof LynxUI) && lynxBaseUI.mIsTransformNode) {
                return (LynxUI) lynxBaseUI;
            }
        }
        return null;
    }

    public void layout() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.layout();
        }
    }

    public void measure() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.measure();
        }
    }

    public void onAnimatedNodeReady() {
        if (this.mIsFirstAnimatedReady) {
            this.mIsFirstAnimatedReady = false;
        }
        this.mLastSize.x = this.mLatestSize.x;
        this.mLastSize.y = this.mLatestSize.y;
        this.hasTransformChanged = false;
    }

    static {
        Covode.recordClassIndex(34595);
    }

    private void sendLayoutChangeEvent() {
        Map<String, C28723a> map = this.mEvents;
        if (map != null && map.containsKey("layoutchange")) {
            this.mContext.f67064e.mo49834a(new C28724b(getSign(), "layoutchange", getPositionInfo()));
        }
    }

    public Rect getRectToWindow() {
        UIBody.C28581a aVar = this.mContext.f67068i.f67258a;
        if (aVar == null) {
            return new Rect();
        }
        int[] iArr = new int[2];
        aVar.getLocationInWindow(iArr);
        Rect boundingClientRect = getBoundingClientRect();
        boundingClientRect.offset(iArr[0], iArr[1]);
        return boundingClientRect;
    }

    public void onAttach() {
        C28690e eVar = this.mLynxBackground;
        if (eVar.f67659e != null) {
            for (AbstractC28590c cVar : eVar.f67659e.f67607f.f67308a) {
                cVar.mo49406d();
            }
        }
    }

    public void onDetach() {
        C28690e eVar = this.mLynxBackground;
        if (eVar.f67659e != null) {
            for (AbstractC28590c cVar : eVar.f67659e.f67607f.f67308a) {
                cVar.mo49408e();
            }
        }
    }

    public void onLayoutUpdated() {
        C28690e eVar = this.mLynxBackground;
        float f = (float) this.mPaddingTop;
        float f2 = (float) this.mPaddingRight;
        float f3 = (float) this.mPaddingBottom;
        float f4 = (float) this.mPaddingLeft;
        BackgroundDrawable backgroundDrawable = eVar.f67659e;
        if (backgroundDrawable != null) {
            backgroundDrawable.mo49750a(1, f);
            backgroundDrawable.mo49750a(2, f2);
            backgroundDrawable.mo49750a(3, f3);
            backgroundDrawable.mo49750a(0, f4);
        }
        invalidate();
        requestLayout();
    }

    public void setDefaultOverflow() {
        AbstractC28520j jVar;
        if ((this.mTagName.equals("view") || this.mTagName.equals("component")) && (jVar = this.mContext) != null && jVar.f67078s) {
            this.mOverflow = 3;
        } else {
            this.mOverflow = 0;
        }
    }

    public final boolean shouldDoTransform() {
        C28692g gVar;
        if (this.hasTransformChanged || ((C28695i.m57468a(this.mTransformRaw) || ((gVar = this.mTransformOrigin) != null && ((gVar.mo49783a() || gVar.mo49784b()) && gVar.mo49787e()))) && hasSizeChanged())) {
            return true;
        }
        return false;
    }

    private JavaOnlyMap getPositionInfo() {
        Rect boundingClientRect = getBoundingClientRect();
        float f = this.mContext.f67075p.density;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("id", this.mIdSelector);
        javaOnlyMap.putMap("dataset", new JavaOnlyMap());
        javaOnlyMap.putDouble("left", (double) (((float) boundingClientRect.left) / f));
        javaOnlyMap.putDouble("top", (double) (((float) boundingClientRect.top) / f));
        javaOnlyMap.putDouble("right", (double) (((float) boundingClientRect.right) / f));
        javaOnlyMap.putDouble("bottom", (double) (((float) boundingClientRect.bottom) / f));
        javaOnlyMap.putDouble("width", (double) (((float) boundingClientRect.width()) / f));
        javaOnlyMap.putDouble("height", (double) (((float) boundingClientRect.height()) / f));
        return javaOnlyMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: java.util.List<com.lynx.tasm.behavior.ui.LynxUI> */
    /* JADX WARN: Multi-variable type inference failed */
    public void buildLynxUITree() {
        LynxUI enclosingLynxUI;
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            if (lynxBaseUI instanceof LynxUI) {
                if (lynxBaseUI.mCSSPosition == 2 && enclosingTransformLynxUI() != null) {
                    lynxBaseUI.mCSSPosition = 1;
                }
                if ((lynxBaseUI.getZIndex() != 0 && (enclosingLynxUI = enclosingStackingContextLynxUI()) != null) || (enclosingLynxUI = enclosingLynxUI()) != null) {
                    enclosingLynxUI.mViewChildren.add(lynxBaseUI);
                }
            }
            lynxBaseUI.requestLayout();
            lynxBaseUI.buildLynxUITree();
        }
    }

    /* access modifiers changed from: protected */
    public Rect getBoundRectForOverflow() {
        int i;
        if (getOverflow() == 3) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        DisplayMetrics displayMetrics = this.mContext.f67075p;
        int i2 = 0;
        if ((getOverflow() & 1) != 0) {
            i = 0 - displayMetrics.widthPixels;
            width += displayMetrics.widthPixels * 2;
        } else {
            i = 0;
        }
        if ((getOverflow() & 2) != 0) {
            i2 = 0 - displayMetrics.heightPixels;
            height += displayMetrics.heightPixels * 2;
        }
        return new Rect(i, i2, width + i, height + i2);
    }

    /* access modifiers changed from: protected */
    public Rect getRect() {
        float originLeft = ((float) getOriginLeft()) + (((float) getWidth()) / 2.0f);
        float originTop = ((float) getOriginTop()) + (((float) getHeight()) / 2.0f);
        float width = ((float) getWidth()) * getScaleX();
        float height = ((float) getHeight()) * getScaleY();
        float translationX = (originLeft - (width / 2.0f)) + getTranslationX();
        float translationY = (originTop - (height / 2.0f)) + getTranslationY();
        return new Rect((int) translationX, (int) translationY, (int) (translationX + width), (int) (translationY + height));
    }

    public Rect getBoundingClientRect() {
        int i;
        ViewGroup viewGroup = this.mContext.f67068i.f67258a;
        int i2 = 0;
        if (viewGroup == null) {
            return new Rect(0, 0, getWidth() + 0, getHeight() + 0);
        }
        if (this instanceof LynxUI) {
            T t = ((LynxUI) this).mView;
            Rect rect = new Rect();
            View rootView = t.getRootView();
            if (viewGroup.getRootView() != rootView && (rootView instanceof ViewGroup)) {
                viewGroup = (ViewGroup) rootView;
            }
            try {
                viewGroup.offsetDescendantRectToMyCoords(t, rect);
                rect.offset(t.getScrollX(), t.getScrollY());
            } catch (IllegalArgumentException unused) {
            }
            i = rect.top;
            i2 = rect.left;
        } else if (this instanceof LynxFlattenUI) {
            AbstractC28618d dVar = this.mParent;
            if (dVar == null || dVar == this.mContext.f67068i) {
                i2 = this.mLeft;
                i = this.mTop;
            } else {
                i = 0;
                LynxBaseUI lynxBaseUI = this;
                while ((lynxBaseUI instanceof LynxFlattenUI) && lynxBaseUI != this.mContext.f67068i) {
                    i2 += lynxBaseUI.getOriginLeft();
                    i += lynxBaseUI.getOriginTop();
                    lynxBaseUI = lynxBaseUI.getParentBaseUI();
                }
                if (lynxBaseUI != null) {
                    Rect boundingClientRect = lynxBaseUI.getBoundingClientRect();
                    i2 += boundingClientRect.left - lynxBaseUI.getScrollX();
                    i += boundingClientRect.top - lynxBaseUI.getScrollY();
                }
            }
        } else {
            i = 0;
        }
        return new Rect(i2, i, getWidth() + i2, getHeight() + i);
    }

    @AbstractC28525m(mo49059a = "block-native-event", mo49064f = false)
    public void setBlockNativeEvent(boolean z) {
        this.mBlockNativeEvent = z;
    }

    public void setBorderColor(Integer num) {
        setBorderColorForAllSpacingIndex(num);
    }

    @AbstractC28525m(mo49059a = "position", mo49062d = 1.0f)
    public final void setCSSPosition(int i) {
        this.mCSSPosition = i;
    }

    @AbstractC28525m(mo49059a = "dataset")
    public void setDataset(ReadableMap readableMap) {
        this.mDataset = readableMap;
    }

    @AbstractC28525m(mo49059a = "enable-scroll-monitor")
    public void setEnableScrollMonitor(boolean z) {
        this.mEnableScrollMonitor = z;
    }

    public void setEvents(Map<String, C28723a> map) {
        this.mEvents = map;
    }

    @AbstractC28525m(mo49059a = "idSelector")
    public void setIdSelector(String str) {
        this.mIdSelector = str;
    }

    @AbstractC28525m(mo49059a = "direction", mo49063e = 3)
    public void setLynxDirection(int i) {
        this.mLynxDirection = i;
    }

    @AbstractC28525m(mo49059a = StringSet.name)
    public void setName(String str) {
        this.mName = str;
    }

    public void setParent(AbstractC28618d dVar) {
        this.mParent = dVar;
    }

    @AbstractC28525m(mo49059a = "react-ref")
    public void setRefIdSelector(String str) {
        this.mRefId = str;
    }

    @AbstractC28525m(mo49059a = "scroll-monitor-tag")
    public void setScrollMonitorTag(String str) {
        this.mScrollMonitorTag = str;
    }

    @AbstractC28525m(mo49059a = "lynx-test-tag")
    public void setTestID(String str) {
        this.mTestTagName = str;
    }

    @AbstractC28525m(mo49059a = "user-interaction-enabled", mo49064f = true)
    public void setUserInteractionEnabled(boolean z) {
        this.userInteractionEnabled = z;
    }

    public void updateAttributes(C28716v vVar) {
        updateProperties(vVar);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.LynxBaseUI$Sticky */
    public class Sticky extends RectF {

        /* renamed from: a */
        float f67251a;

        /* renamed from: b */
        float f67252b;

        static {
            Covode.recordClassIndex(34598);
        }

        public Sticky() {
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.LynxBaseUI$a */
    class C28579a implements Drawable.Callback {
        static {
            Covode.recordClassIndex(34599);
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private C28579a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            LynxBaseUI.this.invalidate();
        }

        /* synthetic */ C28579a(LynxBaseUI lynxBaseUI, byte b) {
            this();
        }
    }

    protected LynxBaseUI(Context context) {
        this((AbstractC28520j) context);
    }

    public void afterPropsUpdated(C28716v vVar) {
        onPropsUpdated();
        onAnimationUpdated();
    }

    public int getIndex(LynxBaseUI lynxBaseUI) {
        return this.mChildren.indexOf(lynxBaseUI);
    }

    public void setAttributes(C28716v vVar) {
        updateAttributes(vVar);
        onPropsUpdated();
    }

    public void setBorderColor(String str) {
        new RuntimeException("setBorderColor(String) is deprecated.This has no effect.");
    }

    public void setHeight(int i) {
        this.mHeight = i;
        onLayoutUpdated();
    }

    public void setLeft(int i) {
        this.mLeft = i;
        this.mOriginLeft = i;
        onLayoutUpdated();
    }

    @AbstractC28525m(mo49059a = "overflow", mo49063e = 0)
    public void setOverflow(int i) {
        setOverflowWithMask(3, i);
    }

    @AbstractC28525m(mo49059a = "overflow-x", mo49063e = 0)
    public void setOverflowX(int i) {
        setOverflowWithMask(1, i);
    }

    @AbstractC28525m(mo49059a = "overflow-y", mo49063e = 0)
    public void setOverflowY(int i) {
        setOverflowWithMask(2, i);
    }

    public void setTop(int i) {
        this.mTop = i;
        this.mOriginTop = i;
        onLayoutUpdated();
    }

    public void setWidth(int i) {
        this.mWidth = i;
        onLayoutUpdated();
    }

    public final void updateProperties(C28716v vVar) {
        updatePropertiesInterval(vVar);
        afterPropsUpdated(vVar);
    }

    protected LynxBaseUI(AbstractC28520j jVar) {
        this(jVar, null);
    }

    public LynxBaseUI getChildAt(int i) {
        return this.mChildren.get(i);
    }

    public void removeChild(LynxBaseUI lynxBaseUI) {
        this.mChildren.remove(lynxBaseUI);
        lynxBaseUI.setParent(null);
    }

    @AbstractC28525m(mo49059a = "box-shadow")
    public void setBoxShadow(ReadableArray readableArray) {
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setBoxShadow(readableArray);
        }
    }

    @AbstractC28525m(mo49059a = "focusable")
    public void setFocusable(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.mFocusable = z;
    }

    @AbstractC28525m(mo49059a = C19386b.f45895b, mo49062d = 1.0E21f)
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            this.mFontSize = f;
            this.mLynxBackground.f67661g = f;
        }
    }

    @AbstractC28525m(mo49059a = "ignore-focus")
    public void setIgnoreFocus(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.mIgnoreFocus = z;
    }

    @AbstractC28525m(mo49059a = "outline-color", mo49063e = -16777216)
    public void setOutlineColor(int i) {
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setOutlineColor(i);
        }
    }

    @AbstractC28525m(mo49059a = "outline-width", mo49063e = 0)
    public void setOutlineWidth(float f) {
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setOutlineWidth(f);
        }
    }

    public void setOverflowFiber(int i) {
        this.mOverflow = i;
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setOverflowFiber(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void setVisibilityData(int i) {
        if (this instanceof LynxUI) {
            ((LynxUI) this).setVisibility(i);
        }
        invalidate();
    }

    private float toPix(String str) {
        UIBody uIBody = this.mContext.f67068i;
        return C28930n.m57955a(str, uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 1.0E21f, this.mContext.f67075p);
    }

    public void copyAnimationRelatedPropFromOldUI(LynxBaseUI lynxBaseUI) {
        this.mIsFirstAnimatedReady = lynxBaseUI.mIsFirstAnimatedReady;
        this.mLastSize.set(lynxBaseUI.mLastSize.x, lynxBaseUI.mLastSize.y);
        this.mLatestSize.set(lynxBaseUI.mLatestSize.x, lynxBaseUI.mLatestSize.y);
    }

    public void removeChildFiber(LynxBaseUI lynxBaseUI) {
        if (this instanceof LynxFlattenUI) {
            this.mChildren.remove(lynxBaseUI);
            lynxBaseUI.setParent(null);
            return;
        }
        removeChild(lynxBaseUI);
    }

    public void removeChildV2(LynxBaseUI lynxBaseUI) {
        LynxUI enclosingLynxUI;
        if (this.mChildren.remove(lynxBaseUI)) {
            if ((lynxBaseUI instanceof LynxUI) && (enclosingLynxUI = enclosingLynxUI()) != null) {
                enclosingLynxUI.mViewChildren.remove(lynxBaseUI);
            }
            lynxBaseUI.setParent(null);
            this.mShouldAttachChildrenView = false;
        }
    }

    @AbstractC28525m(mo49059a = "background-image")
    public void setBackgroundImage(ReadableArray readableArray) {
        BackgroundDrawable c = this.mLynxBackground.mo49779c();
        c.f67607f.mo49416a(readableArray);
        c.invalidateSelf();
        invalidate();
    }

    @AbstractC28525m(mo49059a = "clip-radius")
    public void setClipToRadius(String str) {
        if (str == null || (!str.equalsIgnoreCase("true") && !str.equalsIgnoreCase("yes"))) {
            this.mClipToRadius = false;
        } else {
            this.mClipToRadius = true;
        }
    }

    public void setOpacity(float f) {
        if (this instanceof LynxUI) {
            ((LynxUI) this).setAlpha(f);
        }
        invalidate();
        onAnimationUpdated();
    }

    @AbstractC28525m(mo49059a = "outline-style", mo49063e = -1)
    public void setOutlineStyle(int i) {
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((UIShadowProxy) dVar).mo49393a().f67268a = EnumC28687c.parse(i);
        }
    }

    public void setTransform(ReadableArray readableArray) {
        this.hasTransformChanged = true;
        this.mTransformRaw = C28695i.m57467a(readableArray);
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((UIShadowProxy) dVar).mo49395b();
        }
    }

    private void setBorderColorForAllSpacingIndex(Integer num) {
        float intValue;
        float f = 1.0E21f;
        if (num == null) {
            intValue = 1.0E21f;
        } else {
            intValue = (float) (num.intValue() & 16777215);
            f = (float) (num.intValue() >>> 24);
        }
        int i = 1;
        do {
            this.mLynxBackground.mo49777a(SPACING_TYPES[i], intValue, f);
            i++;
        } while (i <= 4);
    }

    @AbstractC28525m(mo49059a = "accessibility-element")
    public void setAccessibilityElement(AbstractC28367a aVar) {
        boolean z = true;
        z = true;
        z = true;
        if (aVar != null) {
            ReadableType h = aVar.mo48559h();
            if (h == ReadableType.String) {
                z = Boolean.parseBoolean(aVar.mo48556e());
            } else if (h == ReadableType.Int || h == ReadableType.Number || h == ReadableType.Long) {
                if (aVar.mo48555d() == 0) {
                    z = false;
                }
            } else if (h == ReadableType.Boolean) {
                z = aVar.mo48553b();
            }
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        this.mAccessibilityElementStatus = i;
    }

    @AbstractC28525m(mo49059a = "accessibility-label")
    public void setAccessibilityLabel(AbstractC28367a aVar) {
        String str;
        if (aVar != null) {
            ReadableType h = aVar.mo48559h();
            if (h == ReadableType.String) {
                str = aVar.mo48556e();
            } else if (h == ReadableType.Int || h == ReadableType.Number || h == ReadableType.Long) {
                str = String.valueOf(aVar.mo48555d());
            } else if (h == ReadableType.Boolean) {
                str = String.valueOf(aVar.mo48553b());
            }
            this.mAccessibilityLabel = str;
        }
        str = "";
        this.mAccessibilityLabel = str;
    }

    @AbstractC28525m(mo49059a = "background-clip")
    public void setBackgroundClip(ReadableArray readableArray) {
        BackgroundDrawable c = this.mLynxBackground.mo49779c();
        C28591d dVar = c.f67607f;
        dVar.f67311d.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 < 0 || i2 > 2) {
                    dVar.f67311d.add(1);
                } else {
                    dVar.f67311d.add(Integer.valueOf(i2));
                }
            }
        }
        c.invalidateSelf();
    }

    @AbstractC28525m(mo49059a = "background-color", mo49063e = 0)
    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
        if (getKeyframeManager() != null) {
            getKeyframeManager().mo48817a("BackgroundColor", Integer.valueOf(i));
        }
        if (getTransitionAnimator() == null || !getTransitionAnimator().mo48864a(64)) {
            this.mLynxBackground.mo49776a(i);
            invalidate();
            return;
        }
        getTransitionAnimator().mo48865a(this, 64, Integer.valueOf(i));
    }

    @AbstractC28525m(mo49059a = "background-origin")
    public void setBackgroundOrigin(ReadableArray readableArray) {
        BackgroundDrawable c = this.mLynxBackground.mo49779c();
        C28591d dVar = c.f67607f;
        dVar.f67310c.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 < 0 || i2 > 2) {
                    i2 = 1;
                }
                dVar.f67310c.add(Integer.valueOf(i2));
            }
        }
        c.invalidateSelf();
        invalidate();
    }

    @AbstractC28525m(mo49059a = "background-position")
    public void setBackgroundPosition(ReadableArray readableArray) {
        BackgroundDrawable c = this.mLynxBackground.mo49779c();
        C28591d dVar = c.f67607f;
        dVar.f67309b.clear();
        if (readableArray != null) {
            readableArray.size();
            for (int i = 0; i < readableArray.size(); i++) {
                dVar.f67309b.add(new C28594f(readableArray.getDouble(i)));
            }
        }
        c.invalidateSelf();
        invalidate();
    }

    @AbstractC28525m(mo49059a = "background-repeat")
    public void setBackgroundRepeat(ReadableArray readableArray) {
        BackgroundDrawable c = this.mLynxBackground.mo49779c();
        C28591d dVar = c.f67607f;
        dVar.f67312e.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                dVar.f67312e.add(EnumC28596h.valueOf(readableArray.getInt(i)));
            }
        }
        c.invalidateSelf();
        invalidate();
    }

    @AbstractC28525m(mo49059a = "background-size")
    public void setBackgroundSize(ReadableArray readableArray) {
        BackgroundDrawable c = this.mLynxBackground.mo49779c();
        C28591d dVar = c.f67607f;
        dVar.f67313f.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                dVar.f67313f.add(new C28597i(readableArray.getDouble(i)));
            }
        }
        c.invalidateSelf();
        invalidate();
    }

    @AbstractC28525m(mo49059a = "intersection-observers")
    public void setIntersectionObservers(ReadableArray readableArray) {
        this.mContext.mo49040b().mo49056a(this);
        if (readableArray != null && this.mEvents.containsKey("intersection")) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                if (map != null) {
                    this.mContext.mo49040b().mo49055a(new C28521k(this.mContext.mo49040b(), map, this));
                }
            }
        }
    }

    @AbstractC28525m(mo49059a = "transform-origin")
    public void setTransformOrigin(ReadableArray readableArray) {
        C28692g gVar;
        this.hasTransformChanged = true;
        this.mTransformOrigin = C28692g.f67668c;
        if (readableArray != null) {
            if (readableArray.size() < 2) {
                gVar = null;
            } else {
                gVar = new C28692g(readableArray);
            }
            this.mTransformOrigin = gVar;
            if (gVar == null) {
                LLog.m56856a(6, "LynxBaseUI", "transform params error.");
                this.mTransformOrigin = C28692g.f67668c;
            }
        }
    }

    public void updateSticky(float[] fArr) {
        if (fArr == null || fArr.length < 4) {
            this.mSticky = null;
            return;
        }
        Sticky sticky = new Sticky();
        this.mSticky = sticky;
        sticky.left = fArr[0];
        this.mSticky.top = fArr[1];
        this.mSticky.right = fArr[2];
        this.mSticky.bottom = fArr[3];
        Sticky sticky2 = this.mSticky;
        sticky2.f67252b = 0.0f;
        sticky2.f67251a = 0.0f;
        LynxBaseUI parentBaseUI = getParentBaseUI();
        if (parentBaseUI instanceof AbstractC28657b) {
            ((AbstractC28657b) parentBaseUI).mo49602a();
        }
    }

    @AbstractC28528p
    public void scrollIntoView(ReadableMap readableMap) {
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        if (readableMap != null && (hashMap = (HashMap) readableMap.toHashMap().get("scrollIntoViewOptions")) != null) {
            if (hashMap.containsKey("behavior")) {
                str = (String) hashMap.get("behavior");
            } else {
                str = "auto";
            }
            if (hashMap.containsKey("block")) {
                str2 = (String) hashMap.get("block");
            } else {
                str2 = "start";
            }
            if (hashMap.containsKey("inline")) {
                str3 = (String) hashMap.get("inline");
            } else {
                str3 = "nearest";
            }
            LynxBaseUI lynxBaseUI = this;
            while (true) {
                AbstractC28618d dVar = lynxBaseUI.mParent;
                if (dVar != null && (dVar instanceof LynxBaseUI)) {
                    if (lynxBaseUI instanceof AbsLynxUIScroll) {
                        ((AbsLynxUIScroll) lynxBaseUI).mo29934a(this, str.equals("smooth"), str2, str3);
                        return;
                    }
                    lynxBaseUI = (LynxBaseUI) dVar;
                } else {
                    return;
                }
            }
        }
    }

    public void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        updateLayoutInfo(lynxBaseUI.getLeft(), lynxBaseUI.getTop(), lynxBaseUI.getWidth(), lynxBaseUI.getHeight(), lynxBaseUI.mPaddingLeft, lynxBaseUI.mPaddingTop, lynxBaseUI.mPaddingRight, lynxBaseUI.mPaddingBottom, lynxBaseUI.mMarginLeft, lynxBaseUI.mMarginTop, lynxBaseUI.mMarginRight, lynxBaseUI.mMarginBottom, lynxBaseUI.mBorderLeftWidth, lynxBaseUI.mBorderTopWidth, lynxBaseUI.mBorderRightWidth, lynxBaseUI.mBorderBottomWidth, lynxBaseUI.getBound());
        this.mOriginLeft = lynxBaseUI.getOriginLeft();
        this.mOriginTop = lynxBaseUI.getOriginTop();
    }

    @AbstractC28525m(mo49059a = "image-config")
    public void setImageConfig(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.mBitmapConfig = null;
            return;
        }
        if (str.equalsIgnoreCase("ALPHA_8")) {
            this.mBitmapConfig = Bitmap.Config.ALPHA_8;
        } else {
            if (str.equalsIgnoreCase("RGB_565")) {
                if (!isImageConfigBadCase()) {
                    this.mBitmapConfig = Bitmap.Config.RGB_565;
                } else {
                    LLog.m56856a(5, "LynxBaseUI setImageConfig warn: ", "RGB_565 can't be set on Meizu15");
                }
            } else if (str.equalsIgnoreCase("ARGB_8888")) {
                this.mBitmapConfig = Bitmap.Config.ARGB_8888;
            } else if (str.equalsIgnoreCase("RGBA_F16")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.mBitmapConfig = Bitmap.Config.RGBA_F16;
                } else {
                    LLog.m56856a(5, "LynxBaseUI setImageConfig warn: ", "RGBA_F16 requires build version >= VERSION_CODES.O");
                }
            } else if (str.equalsIgnoreCase("HARDWARE")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.mBitmapConfig = Bitmap.Config.HARDWARE;
                } else {
                    this.mBitmapConfig = null;
                    LLog.m56856a(5, "LynxBaseUI setImageConfig warn: ", "HARDWARE requires build version >= VERSION_CODES.O");
                }
            }
            this.mBitmapConfig = null;
        }
        C28690e eVar = this.mLynxBackground;
        if (eVar != null) {
            Bitmap.Config config = this.mBitmapConfig;
            BackgroundDrawable c = eVar.mo49779c();
            if (c.f67607f != null) {
                C28591d dVar = c.f67607f;
                dVar.f67314g = config;
                if (dVar.f67308a != null) {
                    for (AbstractC28590c cVar : dVar.f67308a) {
                        if (cVar != null) {
                            cVar.mo49410a(dVar.f67314g);
                        }
                    }
                }
                c.invalidateSelf();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.text.UIText") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d7, code lost:
        if (r2.equals("com.bytedance.ies.xelement.pickview.LynxPickView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        if (r2.equals("com.bytedance.lynx.tasm.ui.imageloader.UIFilterImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.swiper.XSwiperUI") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f5, code lost:
        if (r2.equals("com.lynx.tasm.ui.image.UIFilterImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxVideoManagerLite") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.text.FlattenUIText") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
        if (r2.equals("com.bytedance.ies.xelement.overlay.LynxOverlayView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011d, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.LynxBaseUI") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxImpressionView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0131, code lost:
        if (r2.equals("com.lynx.tasm.ui.image.UIImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013b, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxLottieView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0145, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxScrollView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014f, code lost:
        if (r2.equals("com.bytedance.ies.xelement.picker.LynxPickerView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0159, code lost:
        if (r2.equals("com.bytedance.ies.xelement.pickview.LynxPickerViewColumn") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0163, code lost:
        if (r2.equals("com.bytedance.lynx.tasm.ui.imageloader.UIImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016d, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
        if (r2.equals("com.lynx.tasm.ui.image.FlattenUIImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0181, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.LynxFlattenUI") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018b, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.image.AbsUIImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0195, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.list.UIList") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019f, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.view.UIView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a9, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.LynxUI") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b3, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.list.AbsLynxList") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bd, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxBounceView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c7, code lost:
        if (r2.equals("com.bytedance.ies.xelement.banner.LynxSwiperView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d1, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxAudio") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01db, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.view.UIComponent") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e5, code lost:
        if (r2.equals("com.bytedance.ies.xelement.input.LynxTextAreaView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ef, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxVideoManager") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fa, code lost:
        dispatchProperties(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updatePropertiesInterval(com.lynx.tasm.behavior.C28716v r9) {
        /*
        // Method dump skipped, instructions count: 632
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.LynxBaseUI.updatePropertiesInterval(com.lynx.tasm.behavior.v):void");
    }

    public void setBorderRadius(int i, String str) {
        new RuntimeException("setBorderWidth(int, String) is deprecated.This has no effect.");
    }

    public void setBorderWidth(int i, String str) {
        new RuntimeException("setBorderWidth(int, String) is deprecated.This has no effect.");
    }

    public void setSign(int i, String str) {
        this.mSign = i;
        this.mTagName = str;
    }

    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.mChildren.add(i, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    public void insertChildV2(LynxBaseUI lynxBaseUI, int i) {
        this.mChildren.add(i, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    @AbstractC28526n(mo49065a = {"border-left-color", "border-right-color", "border-top-color", "border-bottom-color"}, mo49066b = "Color")
    public void setBorderColor(int i, Integer num) {
        setBorderColorForSpacingIndex(SPACING_TYPES[i + 1], num);
    }

    public final void updateLayoutSize(int i, int i2) {
        this.mLatestSize.x = i;
        this.mLatestSize.y = i2;
    }

    private void setBorderColorForSpacingIndex(int i, Integer num) {
        float intValue;
        float f = 1.0E21f;
        if (num == null) {
            intValue = 1.0E21f;
        } else {
            intValue = (float) (num.intValue() & 16777215);
            f = (float) (num.intValue() >>> 24);
        }
        this.mLynxBackground.mo49777a(i, intValue, f);
    }

    @AbstractC28528p
    public void boundingClientRect(ReadableMap readableMap, Callback callback) {
        callback.invoke(0, getPositionInfo());
    }

    /* access modifiers changed from: protected */
    public void setOverflowWithMask(short s, int i) {
        int i2;
        int i3 = this.mOverflow;
        if (i == 0) {
            i2 = i3 | s;
        } else {
            i2 = i3 & (s ^ -1);
        }
        this.mOverflow = i2;
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setOverflowWithMask(s, i);
        }
    }

    public void insertChildFiber(LynxBaseUI lynxBaseUI, int i) {
        if (this instanceof UIShadowProxy) {
            ((UIShadowProxy) this).f67262a.insertChildFiber(lynxBaseUI, i);
            return;
        }
        if (i == -1) {
            i = this.mChildren.size();
        }
        if (this instanceof UIGroup) {
            AbstractC28618d dVar = lynxBaseUI.mParent;
            if (dVar != null) {
                ((LynxBaseUI) dVar).removeChildFiber(lynxBaseUI);
            }
            insertChild(lynxBaseUI, i);
            return;
        }
        throw new RuntimeException("Trying to insert to the invalid view: ".concat(String.valueOf(i)));
    }

    public void setBorderRadius(int i, float f) {
        if (!C28542g.m57093a(f) && f < 0.0f) {
            f = 1.0E21f;
        }
        C28683b.C28684a aVar = new C28683b.C28684a();
        aVar.f67650a = f;
        aVar.f67651b = f;
        aVar.f67652c = C28683b.EnumC28686c.NUMBER;
        aVar.f67653d = C28683b.EnumC28686c.NUMBER;
        if (i == 0) {
            int i2 = 1;
            do {
                this.mLynxBackground.mo49778a(i2, aVar);
                i2++;
            } while (i2 < 5);
        } else {
            this.mLynxBackground.mo49778a(i, aVar);
        }
        onBorderRadiusUpdated(i);
    }

    @AbstractC28526n(mo49065a = {"border-style", "border-left-style", "border-right-style", "border-top-style", "border-bottom-style"}, mo49069e = -1)
    public void setBorderStyle(int i, int i2) {
        C28690e eVar = this.mLynxBackground;
        int i3 = SPACING_TYPES[i];
        BackgroundDrawable c = eVar.mo49779c();
        if (i3 <= 8 && i3 >= 0) {
            if (c.f67603b == null) {
                c.f67603b = new EnumC28687c[9];
            }
            try {
                EnumC28687c parse = EnumC28687c.parse(i2);
                if (c.f67603b[i3] != parse) {
                    c.f67603b[i3] = parse;
                    c.invalidateSelf();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean childrenContainPoint(float f, float f2) {
        float scrollX = ((f + ((float) getScrollX())) - ((float) getOriginLeft())) - getTranslationX();
        float scrollY = ((f2 + ((float) getScrollY())) - ((float) getOriginTop())) - getTranslationY();
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            if (lynxBaseUI.isUserInteractionEnabled() && lynxBaseUI.containsPoint(scrollX, scrollY)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsPoint(float f, float f2) {
        float touchSlop = getTouchSlop();
        Rect rect = getRect();
        if (((float) rect.left) - touchSlop < f && ((float) rect.right) + touchSlop > f && ((float) rect.top) - touchSlop < f2 && ((float) rect.bottom) + touchSlop > f2) {
            return true;
        }
        if (getOverflow() == 0) {
            return false;
        }
        if (getOverflow() == 1) {
            if (((float) rect.top) - touchSlop >= f2 || ((float) rect.bottom) + touchSlop <= f2) {
                return false;
            }
        } else if (getOverflow() == 2 && (((float) rect.left) - touchSlop >= f || ((float) rect.right) + touchSlop <= f)) {
            return false;
        }
        return childrenContainPoint(f, f2);
    }

    @AbstractC28526n(mo49065a = {C19386b.f45897d, "border-left-width", "border-right-width", "border-top-width", "border-bottom-width"})
    public void setBorderWidth(int i, int i2) {
        C28690e eVar = this.mLynxBackground;
        int i3 = SPACING_TYPES[i];
        float f = (float) i2;
        BackgroundDrawable c = eVar.mo49779c();
        if (c.f67602a == null) {
            c.f67602a = new C28691f();
        }
        if (!C28916c.m57920a(c.f67602a.f67664a[i3], f)) {
            c.f67602a.mo49782a(i3, f);
            if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 8) {
                c.f67605d = true;
            }
            c.invalidateSelf();
        }
    }

    protected LynxBaseUI(AbstractC28520j jVar, Object obj) {
        this.mChildren = new ArrayList();
        this.mProps = new JavaOnlyMap();
        this.mDataset = new JavaOnlyMap();
        this.mHasRadius = false;
        this.mOverflow = 0;
        this.mClipToRadius = false;
        this.mFocusable = false;
        this.mIgnoreFocus = false;
        this.hasTransformChanged = false;
        this.userInteractionEnabled = true;
        this.mSticky = null;
        this.mMaxHeight = -1.0f;
        this.mBackgroundColor = 0;
        this.mShouldAttachChildrenView = false;
        this.mExtraOffsetX = 0.0f;
        this.mExtraOffsetY = 0.0f;
        this.mAccessibilityLabel = "";
        this.mAccessibilityElementStatus = -1;
        this.mDrawableCallback = new C28579a(this, (byte) 0);
        this.mBitmapConfig = null;
        this.mCSSPosition = 1;
        this.mTouchSlop = 8.0f;
        this.mOnResponceChain = false;
        this.mBlockNativeEvent = false;
        this.mIsFirstAnimatedReady = true;
        this.mLynxDirection = 3;
        this.mContext = jVar;
        this.mParam = obj;
        C28690e eVar = new C28690e(jVar);
        this.mLynxBackground = eVar;
        eVar.f67660f = this.mDrawableCallback;
        float a = C28926j.m57938a(14.0f);
        this.mFontSize = a;
        this.mLynxBackground.f67661g = a;
        this.mLatestSize = new Point();
        this.mLastSize = new Point();
        initialize();
    }

    public boolean checkStickyOnParentScroll(int i, int i2) {
        if (this.mSticky == null) {
            return false;
        }
        float left = (float) (getLeft() - i);
        float top = (float) (getTop() - i2);
        if (left < this.mSticky.left) {
            Sticky sticky = this.mSticky;
            sticky.f67251a = sticky.left - left;
        } else {
            int width = getParentBaseUI().getWidth();
            float width2 = ((float) getWidth()) + left;
            float f = (float) width;
            if (this.mSticky.right + width2 > f) {
                Sticky sticky2 = this.mSticky;
                sticky2.f67251a = Math.max((f - width2) - sticky2.right, this.mSticky.left - left);
            } else {
                this.mSticky.f67251a = 0.0f;
            }
        }
        if (top < this.mSticky.top) {
            Sticky sticky3 = this.mSticky;
            sticky3.f67252b = sticky3.top - top;
            return true;
        }
        int height = getParentBaseUI().getHeight();
        float height2 = ((float) getHeight()) + top;
        float f2 = (float) height;
        if (this.mSticky.bottom + height2 > f2) {
            Sticky sticky4 = this.mSticky;
            sticky4.f67252b = Math.max((f2 - height2) - sticky4.bottom, this.mSticky.top - top);
            return true;
        }
        this.mSticky.f67252b = 0.0f;
        return true;
    }

    public AbstractC28464a hitTest(float f, float f2) {
        int size = this.mChildren.size() - 1;
        UIGroup uIGroup = null;
        while (true) {
            if (size >= 0) {
                LynxBaseUI lynxBaseUI = this.mChildren.get(size);
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).f67262a;
                }
                if (lynxBaseUI.isUserInteractionEnabled() && lynxBaseUI.getVisibility() && lynxBaseUI.containsPoint(f, f2)) {
                    if (lynxBaseUI.isOnResponseChain()) {
                        uIGroup = lynxBaseUI;
                        break;
                    } else if (uIGroup == null || uIGroup.getZIndex() < lynxBaseUI.getZIndex() || (uIGroup.getZIndex() == lynxBaseUI.getZIndex() && uIGroup.getTranslationZ() < lynxBaseUI.getTranslationZ())) {
                        uIGroup = lynxBaseUI;
                    }
                }
                size--;
            } else if (uIGroup == null) {
                return this;
            }
        }
        if (!uIGroup.needCustomLayout() || !(uIGroup instanceof UIGroup)) {
            return uIGroup.hitTest(((f + ((float) uIGroup.getScrollX())) - ((float) uIGroup.getOriginLeft())) - uIGroup.getTranslationX(), ((f2 + ((float) uIGroup.getScrollY())) - ((float) uIGroup.getOriginTop())) - uIGroup.getTranslationY());
        }
        UIGroup uIGroup2 = uIGroup;
        return uIGroup2.findUIWithCustomLayout(f - ((float) uIGroup.getOriginLeft()), f2 - ((float) uIGroup.getOriginTop()), uIGroup2);
    }

    @AbstractC28528p
    public void requestUIInfo(ReadableMap readableMap, Callback callback) {
        ArrayList arrayList = new ArrayList();
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (readableMap.getBoolean(nextKey, false)) {
                    arrayList.add(nextKey);
                }
            }
        }
        JavaOnlyMap positionInfo = getPositionInfo();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (arrayList.contains("id")) {
            javaOnlyMap.put("id", this.mIdSelector);
        }
        if (arrayList.contains("dataset")) {
            javaOnlyMap.put("dataset", this.mDataset);
        }
        if (arrayList.contains("rect")) {
            javaOnlyMap.put("left", positionInfo.get("left"));
            javaOnlyMap.put("top", positionInfo.get("top"));
            javaOnlyMap.put("right", positionInfo.get("right"));
            javaOnlyMap.put("bottom", positionInfo.get("bottom"));
        }
        if (arrayList.contains("size")) {
            javaOnlyMap.put("width", positionInfo.get("width"));
            javaOnlyMap.put("height", positionInfo.get("height"));
        }
        if (arrayList.contains("scrollOffset")) {
            float f = this.mContext.f67075p.density;
            javaOnlyMap.put("scrollLeft", Float.valueOf(((float) getScrollX()) / f));
            javaOnlyMap.put("scrollTop", Float.valueOf(((float) getScrollY()) / f));
        }
        if (arrayList.contains("node")) {
            javaOnlyMap.put("node", new JavaOnlyMap());
        }
        callback.invoke(0, javaOnlyMap);
    }

    @AbstractC28526n(mo49065a = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i, ReadableArray readableArray) {
        int i2 = 0;
        this.mHasRadius = false;
        if (readableArray == null || readableArray.size() <= 0) {
            if (i == 0) {
                do {
                    i2++;
                    this.mLynxBackground.mo49778a(i2, new C28683b.C28684a());
                } while (i2 < 4);
            } else {
                this.mLynxBackground.mo49778a(i, new C28683b.C28684a());
            }
            onBorderRadiusUpdated(i);
            return;
        }
        this.mHasRadius = true;
        if (i == 0) {
            readableArray.size();
            do {
                int i3 = i2 + 1;
                this.mLynxBackground.mo49778a(i3, C28683b.C28684a.m57430a(readableArray, i2 * 4));
                i2 = i3;
            } while (i2 < 4);
        } else {
            readableArray.size();
            this.mLynxBackground.mo49778a(i, C28683b.C28684a.m57430a(readableArray, 0));
        }
        onBorderRadiusUpdated(i);
    }

    public void setOutlineData(float f, int i, int i2) {
        setOutlineWidth(f);
        setOutlineStyle(i);
        setOutlineColor(i2);
        invalidate();
    }

    public void updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        boolean z;
        boolean z2 = true;
        if (this.mLeft != i) {
            this.mLeft = i;
            z = true;
        } else {
            z = false;
        }
        if (this.mTop != i2) {
            this.mTop = i2;
        } else {
            z2 = z;
        }
        this.mBound = rect;
        if (z2) {
            onDrawingPositionChanged();
        }
    }

    public void setBorderRadius(int i, float f, float f2) {
        if (!C28542g.m57093a(f) && f < 0.0f) {
            f = 1.0E21f;
        }
        if (!C28542g.m57093a(f2) && f2 < 0.0f) {
            f2 = 1.0E21f;
        }
        C28683b.C28684a aVar = new C28683b.C28684a();
        aVar.f67650a = f;
        aVar.f67651b = f2;
        aVar.f67652c = C28683b.EnumC28686c.NUMBER;
        aVar.f67653d = C28683b.EnumC28686c.NUMBER;
        if (i == 0) {
            int i2 = 1;
            do {
                this.mLynxBackground.mo49778a(i2, aVar);
                i2++;
            } while (i2 < 5);
        } else {
            this.mLynxBackground.mo49778a(i, aVar);
        }
        onBorderRadiusUpdated(i);
    }

    public void setTransformData(float f, float f2, int[] iArr, float[] fArr) {
        this.hasTransformChanged = true;
        ArrayList arrayList = null;
        if (!(iArr == null || iArr.length == 0 || iArr.length * 3 != fArr.length)) {
            arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < iArr.length) {
                arrayList.add(new C28695i(iArr[i], fArr[i2], 0, fArr[i2 + 1], 0, fArr[i2 + 2], 0));
                i++;
                i2 += 3;
            }
        }
        this.mTransformRaw = arrayList;
        this.mTransformOrigin = new C28692g(f, f2);
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((UIShadowProxy) dVar).mo49395b();
        }
    }

    public void setSingleValueStyleData(int[] iArr, float f, int i, int i2, int i3) {
        for (int i4 : iArr) {
            if (i4 == 0) {
                setOpacity(f);
            } else if (i4 == 1) {
                setOverflowFiber(i);
            } else if (i4 == 2) {
                setVisibilityData(i2);
            } else if (i4 == 3) {
                setCSSPosition(i3);
            }
        }
    }

    public void setShadowData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int[] iArr, int[] iArr2) {
        int length = fArr.length;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            C28601c cVar = new C28601c();
            cVar.f67343b = fArr[i];
            cVar.f67344c = fArr2[i];
            cVar.f67345d = fArr3[i];
            cVar.f67347f = cVar.f67345d * 1.25f;
            cVar.f67346e = fArr4[i];
            cVar.f67348g = iArr2[i];
            cVar.f67342a = iArr[i];
            arrayList.add(cVar);
        }
        if (this instanceof UIShadowProxy) {
            ((UIShadowProxy) this).mo49394a(arrayList);
            return;
        }
        AbstractC28618d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((UIShadowProxy) dVar).mo49394a(arrayList);
        }
    }

    public void setBackgroundData(int i, ReadableArray readableArray, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int[] iArr3) {
        setBackgroundColor(i);
        C28690e eVar = this.mLynxBackground;
        if (!((readableArray == null || readableArray.size() == 0) && eVar.f67659e == null)) {
            BackgroundDrawable c = eVar.mo49779c();
            C28591d dVar = c.f67607f;
            dVar.f67308a.clear();
            dVar.f67309b.clear();
            dVar.f67313f.clear();
            dVar.f67310c.clear();
            dVar.f67312e.clear();
            dVar.f67311d.clear();
            if (!(readableArray == null || readableArray.size() == 0)) {
                dVar.mo49416a(readableArray);
                for (float f : fArr) {
                    dVar.f67309b.add(new C28594f((double) f));
                }
                for (float f2 : fArr2) {
                    dVar.f67313f.add(new C28597i((double) f2));
                }
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    int i3 = 1;
                    if (i2 >= length) {
                        break;
                    }
                    int i4 = iArr[i2];
                    if (i4 >= 0 && i4 <= 2) {
                        i3 = i4;
                    }
                    dVar.f67310c.add(Integer.valueOf(i3));
                    i2++;
                }
                for (int i5 : iArr2) {
                    dVar.f67312e.add(EnumC28596h.valueOf(i5));
                }
                for (int i6 : iArr3) {
                    if (i6 < 0 || i6 > 2) {
                        dVar.f67311d.add(1);
                    } else {
                        dVar.f67311d.add(Integer.valueOf(i6));
                    }
                }
            }
            c.invalidateSelf();
        }
        invalidate();
    }

    public void setLayoutData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        this.mLeft = i;
        this.mTop = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        this.mPaddingLeft = i5;
        this.mPaddingRight = i7;
        this.mPaddingBottom = i8;
        this.mPaddingTop = i6;
        this.mMarginLeft = i9;
        this.mMarginTop = i10;
        this.mMarginRight = i11;
        this.mMarginBottom = i12;
        this.mBound = rect;
        onLayoutUpdated();
        sendLayoutChangeEvent();
    }

    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, 0, 0, 0, 0, i9, i10, i11, i12, rect);
        onLayoutUpdated();
    }

    public void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.mLeft = i;
        this.mTop = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        this.mOriginTop = i2;
        this.mOriginLeft = i;
        this.mPaddingLeft = i5;
        this.mPaddingRight = i7;
        this.mPaddingBottom = i8;
        this.mPaddingTop = i6;
        this.mMarginLeft = i9;
        this.mMarginTop = i10;
        this.mMarginRight = i11;
        this.mMarginBottom = i12;
        this.mBorderTopWidth = i14;
        this.mBorderBottomWidth = i16;
        this.mBorderLeftWidth = i13;
        this.mBorderRightWidth = i15;
        this.mBound = rect;
    }

    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        if (this.mContext.f67076q) {
            setLayoutData(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect);
            return;
        }
        updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        onLayoutUpdated();
        sendLayoutChangeEvent();
    }

    public void setBorderData(float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i5, int i6, int i7, int i8) {
        int i9 = (int) f4;
        this.mBorderLeftWidth = i9;
        int i10 = (int) f2;
        this.mBorderRightWidth = i10;
        int i11 = (int) f;
        this.mBorderTopWidth = i11;
        int i12 = (int) f3;
        this.mBorderBottomWidth = i12;
        setBorderWidth(1, i9);
        setBorderWidth(2, i10);
        setBorderWidth(3, i11);
        setBorderWidth(4, i12);
        setBorderStyle(1, i4);
        setBorderStyle(2, i2);
        setBorderStyle(3, i);
        setBorderStyle(4, i3);
        setBorderRadius(1, f5, f6);
        setBorderRadius(2, f7, f8);
        setBorderRadius(3, f9, f10);
        setBorderRadius(4, f11, f12);
        setBorderColor(0, Integer.valueOf(i8));
        setBorderColor(1, Integer.valueOf(i6));
        setBorderColor(2, Integer.valueOf(i5));
        setBorderColor(3, Integer.valueOf(i7));
    }
}
