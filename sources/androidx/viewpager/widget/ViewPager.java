package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0643b;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    private static final Comparator<C1576b> COMPARATOR = new Comparator<C1576b>() {
        /* class androidx.viewpager.widget.ViewPager.C15701 */

        static {
            Covode.recordClassIndex(1716);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C1576b bVar, C1576b bVar2) {
            return bVar.f5165b - bVar2.f5165b;
        }
    };
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final Interpolator sInterpolator = new Interpolator() {
        /* class androidx.viewpager.widget.ViewPager.animationInterpolatorC15712 */

        static {
            Covode.recordClassIndex(1717);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final C1583i sPositionComparator = new C1583i();
    private int mActivePointerId = -1;
    PagerAdapter mAdapter;
    private List<AbstractC1578d> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new Runnable() {
        /* class androidx.viewpager.widget.ViewPager.RunnableC15723 */

        static {
            Covode.recordClassIndex(1718);
        }

        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    public boolean mFakeDragging;
    public boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private AbstractC1579e mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C1576b> mItems = new ArrayList<>();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private C1581g mObserver;
    private int mOffscreenPageLimit = 1;
    private AbstractC1579e mOnPageChangeListener;
    private List<AbstractC1579e> mOnPageChangeListeners;
    private int mPageMargin;
    private AbstractC1580f mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    public Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C1576b mTempItem = new C1576b();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    public @interface AbstractC1575a {
        static {
            Covode.recordClassIndex(1723);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    public interface AbstractC1578d {
        static {
            Covode.recordClassIndex(1726);
        }

        /* renamed from: a */
        void mo5326a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public interface AbstractC1579e {
        static {
            Covode.recordClassIndex(1727);
        }

        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    public interface AbstractC1580f {
        static {
            Covode.recordClassIndex(1728);
        }

        /* renamed from: a */
        void mo5330a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public static class C1582h implements AbstractC1579e {
        static {
            Covode.recordClassIndex(1730);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public void onPageSelected(int i) {
        }
    }

    /* renamed from: androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m5291x6d8da54f(String str, String str2) {
        return 0;
    }

    /* renamed from: androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m5292x6d8da561(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class C1576b {

        /* renamed from: a */
        Object f5164a;

        /* renamed from: b */
        int f5165b;

        /* renamed from: c */
        boolean f5166c;

        /* renamed from: d */
        float f5167d;

        /* renamed from: e */
        float f5168e;

        static {
            Covode.recordClassIndex(1724);
        }

        C1576b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public static class C1583i implements Comparator<View> {
        static {
            Covode.recordClassIndex(1731);
        }

        C1583i() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public /* synthetic */ int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f5156a == layoutParams2.f5156a) {
                return layoutParams.position - layoutParams2.position;
            }
            if (layoutParams.f5156a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f5156a;

        /* renamed from: b */
        public int f5157b;

        /* renamed from: c */
        float f5158c;

        /* renamed from: d */
        boolean f5159d;

        /* renamed from: e */
        int f5160e;
        public int position;

        static {
            Covode.recordClassIndex(1720);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f5157b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    class C1581g extends DataSetObserver {
        static {
            Covode.recordClassIndex(1729);
        }

        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }

        C1581g() {
        }
    }

    public void clearOnPageChangeListeners() {
        List<AbstractC1579e> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: package-private */
    public void populate() {
        populate(this.mCurItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.viewpager.widget.ViewPager.SavedState.C15741 */

            static {
                Covode.recordClassIndex(1722);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f5161a;

        /* renamed from: b */
        Parcelable f5162b;

        /* renamed from: e */
        ClassLoader f5163e;

        static {
            Covode.recordClassIndex(1721);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f5161a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5161a);
            parcel.writeParcelable(this.f5162b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f5161a = parcel.readInt();
            this.f5162b = parcel.readParcelable(classLoader);
            this.f5163e = classLoader;
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* access modifiers changed from: package-private */
    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    public class C1577c extends C0726a {
        static {
            Covode.recordClassIndex(1725);
        }

        /* renamed from: a */
        private boolean m5294a() {
            if (ViewPager.this.mAdapter == null || ViewPager.this.mAdapter.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C1577c() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            super.mo2808a(view, dVar);
            dVar.mo2834a((CharSequence) ViewPager.class.getName());
            dVar.mo2844d(m5294a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.mo2829a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.mo2829a(8192);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: d */
        public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2813d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m5294a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.mAdapter != null) {
                accessibilityEvent.setItemCount(ViewPager.this.mAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2809a(View view, int i, Bundle bundle) {
            if (super.mo2809a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
                return true;
            }
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f5156a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5161a = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.f5162b = pagerAdapter.saveState();
        }
        return savedState;
    }

    /* access modifiers changed from: package-private */
    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    static {
        Covode.recordClassIndex(1715);
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (this.mLeftEdge.isFinished() || this.mRightEdge.isFinished()) {
            return true;
        }
        return false;
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    private C1576b infoForCurrentScrollPosition() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = ((float) getScrollX()) / ((float) clientWidth);
            f2 = ((float) this.mPageMargin) / ((float) clientWidth);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C1576b bVar = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.mItems.size()) {
            C1576b bVar2 = this.mItems.get(i3);
            if (!z && bVar2.f5165b != (i = i2 + 1)) {
                bVar2 = this.mTempItem;
                bVar2.f5168e = f3 + f4 + f2;
                bVar2.f5165b = i;
                bVar2.f5167d = this.mAdapter.getPageWidth(bVar2.f5165b);
                i3--;
            }
            f3 = bVar2.f5168e;
            float f5 = bVar2.f5167d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i3 == this.mItems.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f5165b;
            f4 = bVar2.f5167d;
            i3++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0792v.m2764c(this);
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C1576b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f5165b, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f5168e) / infoForCurrentScrollPosition.f5167d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: package-private */
    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        C0792v.m2747a(this, new C1577c());
        if (C0792v.m2766d(this) == 0) {
            C0792v.m2740a((View) this, 1);
        }
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class androidx.viewpager.widget.ViewPager.C15734 */

            /* renamed from: b */
            private final Rect f5155b = new Rect();

            static {
                Covode.recordClassIndex(1719);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                C0753ad a = C0792v.m2737a(view, adVar);
                if (a.f2888b.mo2877b()) {
                    return a;
                }
                Rect rect = this.f5155b;
                rect.left = a.mo2865a();
                rect.top = a.mo2867b();
                rect.right = a.mo2868c();
                rect.bottom = a.mo2869d();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0753ad b = C0792v.m2757b(ViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo2865a(), rect.left);
                    rect.top = Math.min(b.mo2867b(), rect.top);
                    rect.right = Math.min(b.mo2868c(), rect.right);
                    rect.bottom = Math.min(b.mo2869d(), rect.bottom);
                }
                return a.mo2866a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void dataSetChanged() {
        boolean z;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() >= (this.mOffscreenPageLimit * 2) + 1 || this.mItems.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C1576b bVar = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(bVar.f5164a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, bVar.f5165b, bVar.f5164a);
                    if (this.mCurItem == bVar.f5165b) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (bVar.f5165b != itemPosition) {
                    if (bVar.f5165b == this.mCurItem) {
                        i = itemPosition;
                    }
                    bVar.f5165b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f5156a) {
                    layoutParams.f5158c = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public void setOnPageChangeListener(AbstractC1579e eVar) {
        this.mOnPageChangeListener = eVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void removeOnAdapterChangeListener(AbstractC1578d dVar) {
        List<AbstractC1578d> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(dVar);
        }
    }

    public void removeOnPageChangeListener(AbstractC1579e eVar) {
        List<AbstractC1579e> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public AbstractC1579e setInternalPageChangeListener(AbstractC1579e eVar) {
        AbstractC1579e eVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = eVar;
        return eVar2;
    }

    private static boolean isDecorView(View view) {
        if (view.getClass().getAnnotation(AbstractC1575a.class) != null) {
            return true;
        }
        return false;
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0643b.m2369a(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mMarginDrawable) {
            return true;
        }
        return false;
    }

    private void enableLayers(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.mPageTransformerLayerType;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    public void addOnAdapterChangeListener(AbstractC1578d dVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(dVar);
    }

    public void addOnPageChangeListener(AbstractC1579e eVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(eVar);
    }

    /* access modifiers changed from: package-private */
    public C1576b infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public C1576b infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C1576b bVar = this.mItems.get(i2);
            if (bVar.f5165b == i) {
                return bVar;
            }
        }
        return null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        boolean z;
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                enableLayers(z);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    private void dispatchOnPageSelected(int i) {
        AbstractC1579e eVar = this.mOnPageChangeListener;
        if (eVar != null) {
            eVar.onPageSelected(i);
        }
        List<AbstractC1579e> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1579e eVar2 = this.mOnPageChangeListeners.get(i2);
                if (eVar2 != null) {
                    eVar2.onPageSelected(i);
                }
            }
        }
        AbstractC1579e eVar3 = this.mInternalPageChangeListener;
        if (eVar3 != null) {
            eVar3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        AbstractC1579e eVar = this.mOnPageChangeListener;
        if (eVar != null) {
            eVar.onPageScrollStateChanged(i);
        }
        List<AbstractC1579e> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1579e eVar2 = this.mOnPageChangeListeners.get(i2);
                if (eVar2 != null) {
                    eVar2.onPageScrollStateChanged(i);
                }
            }
        }
        AbstractC1579e eVar3 = this.mInternalPageChangeListener;
        if (eVar3 != null) {
            eVar3.onPageScrollStateChanged(i);
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C1576b infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f5165b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1576b infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f5165b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public C1576b infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C1576b bVar = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, bVar.f5164a)) {
                return bVar;
            }
        }
        return null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f5162b, savedState.f5163e);
            setCurrentItemInternal(savedState.f5161a, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.f5161a;
        this.mRestoredAdapterState = savedState.f5162b;
        this.mRestoredClassLoader = savedState.f5163e;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            m5292x6d8da561("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C1576b bVar = this.mItems.get(i);
            if (bVar.f5166c) {
                bVar.f5166c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C0792v.m2750a(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() != 0) {
            C1576b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin;
            int i3 = clientWidth + i2;
            float f = (float) i2;
            float f2 = (float) clientWidth;
            int i4 = infoForCurrentScrollPosition.f5165b;
            float f3 = ((((float) i) / f2) - infoForCurrentScrollPosition.f5168e) / (infoForCurrentScrollPosition.f5167d + (f / f2));
            this.mCalledSuper = false;
            onPageScrolled(i4, f3, (int) (((float) i3) * f3));
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + (this.mLastMotionX - f);
        float clientWidth = (float) getClientWidth();
        float f2 = this.mFirstOffset * clientWidth;
        float f3 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C1576b bVar = this.mItems.get(0);
        ArrayList<C1576b> arrayList = this.mItems;
        C1576b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f5165b != 0) {
            f2 = bVar.f5168e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f5165b != this.mAdapter.getCount() - 1) {
            f3 = bVar2.f5168e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f2) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f2 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f2;
        } else if (scrollX > f3) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f3) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r8 != 2) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r8) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C0792v.m2764c(this);
                return;
            }
            return;
        }
        this.mLeftEdge.finish();
        this.mRightEdge.finish();
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C1576b bVar = this.mItems.get(0);
            ArrayList<C1576b> arrayList = this.mItems;
            C1576b bVar2 = arrayList.get(arrayList.size() - 1);
            if (bVar.f5165b != 0) {
                f2 = bVar.f5168e * clientWidth;
            }
            if (bVar2.f5165b != this.mAdapter.getCount() - 1) {
                f3 = bVar2.f5168e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = (float) width;
            float f3 = ((float) this.mPageMargin) / f2;
            int i = 0;
            C1576b bVar = this.mItems.get(0);
            float f4 = bVar.f5168e;
            int size = this.mItems.size();
            int i2 = this.mItems.get(size - 1).f5165b;
            for (int i3 = bVar.f5165b; i3 < i2; i3++) {
                while (i3 > bVar.f5165b && i < size) {
                    i++;
                    bVar = this.mItems.get(i);
                }
                if (i3 == bVar.f5165b) {
                    f = (bVar.f5168e + bVar.f5167d) * f2;
                    f4 = bVar.f5168e + bVar.f5167d + f3;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i3);
                    f = (f4 + pageWidth) * f2;
                    f4 += pageWidth + f3;
                }
                if (((float) this.mPageMargin) + f > ((float) scrollX)) {
                    this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(((float) this.mPageMargin) + f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (f > ((float) (scrollX + width))) {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C1576b bVar = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, bVar.f5165b, bVar.f5164a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new C1581g();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<AbstractC1578d> list = this.mAdapterChangeListeners;
        if (!(list == null || list.isEmpty())) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAdapterChangeListeners.get(i2).mo5326a(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.mLastMotionX;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f2 == 0.0f || isGutterDrag(this.mLastMotionX, f2) || !canScroll(this, false, (int) f2, (int) x2, (int) y2)) {
                    int i2 = this.mTouchSlop;
                    if (abs > ((float) i2) && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        if (f2 > 0.0f) {
                            f = this.mInitialMotionX + ((float) this.mTouchSlop);
                        } else {
                            f = this.mInitialMotionX - ((float) this.mTouchSlop);
                        }
                        this.mLastMotionX = f;
                        this.mLastMotionY = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) i2)) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x2)) {
                        C0792v.m2764c(this);
                    }
                } else {
                    this.mLastMotionX = x2;
                    this.mLastMotionY = y2;
                    this.mIsUnableToDrag = true;
                    return false;
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z;
        float f;
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            z = resetTouch();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.mLastMotionX);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.mLastMotionY);
                            if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                                this.mIsBeingDragged = true;
                                requestParentDisallowInterceptTouchEvent(true);
                                float f2 = this.mInitialMotionX;
                                if (x - f2 > 0.0f) {
                                    f = f2 + ((float) this.mTouchSlop);
                                } else {
                                    f = f2 - ((float) this.mTouchSlop);
                                }
                                this.mLastMotionX = f;
                                this.mLastMotionY = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.mLastMotionX = motionEvent.getX(actionIndex);
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                        this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                    }
                } else if (this.mIsBeingDragged) {
                    scrollToItem(this.mCurItem, true, 0, false);
                    z = resetTouch();
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C1576b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                float f3 = (float) clientWidth;
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f5165b, ((((float) scrollX) / f3) - infoForCurrentScrollPosition.f5168e) / (infoForCurrentScrollPosition.f5167d + (((float) this.mPageMargin) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                z = resetTouch();
            }
            if (z) {
                C0792v.m2764c(this);
            }
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x2 = motionEvent.getX();
            this.mInitialMotionX = x2;
            this.mLastMotionX = x2;
            float y2 = motionEvent.getY();
            this.mInitialMotionY = y2;
            this.mLastMotionY = y2;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r6.f5165b == r17.mCurItem) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r18) {
        /*
        // Method dump skipped, instructions count: 619
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageTransformer(boolean z, AbstractC1580f fVar) {
        setPageTransformer(z, fVar, 2);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    private boolean isGutterDrag(float f, float f2) {
        if (f < ((float) this.mGutterSize) && f2 > 0.0f) {
            return true;
        }
        if (f <= ((float) (getWidth() - this.mGutterSize)) || f2 >= 0.0f) {
            return false;
        }
        return true;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).f5160e;
    }

    /* access modifiers changed from: package-private */
    public C1576b addNewItem(int i, int i2) {
        C1576b bVar = new C1576b();
        bVar.f5165b = i;
        bVar.f5164a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        bVar.f5167d = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(bVar);
        } else {
            this.mItems.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1576b infoForChild;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f5165b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        AbstractC1579e eVar = this.mOnPageChangeListener;
        if (eVar != null) {
            eVar.onPageScrolled(i, f, i2);
        }
        List<AbstractC1579e> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC1579e eVar2 = this.mOnPageChangeListeners.get(i3);
                if (eVar2 != null) {
                    eVar2.onPageScrolled(i, f, i2);
                }
            }
        }
        AbstractC1579e eVar3 = this.mInternalPageChangeListener;
        if (eVar3 != null) {
            eVar3.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f5156a |= isDecorView(view);
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (!layoutParams2.f5156a) {
            layoutParams2.f5159d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void setPageTransformer(boolean z, AbstractC1580f fVar, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 1;
        if (fVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mPageTransformer != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPageTransformer = fVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1576b infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f5165b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f5156a) {
                    int i6 = layoutParams.f5157b & 7;
                    if (i6 == 1) {
                        i3 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    } else if (i6 == 3) {
                        i4 = childAt.getWidth() + paddingLeft;
                    } else if (i6 != 5) {
                        i4 = paddingLeft;
                    } else {
                        i3 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i4;
                }
            }
        }
        dispatchOnPageScrolled(i, f, i2);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((LayoutParams) childAt2.getLayoutParams()).f5156a) {
                    this.mPageTransformer.mo5330a(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.mCalledSuper = true;
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            if (this.mIsScrollStarted) {
                scrollX = this.mScroller.getCurrX();
            } else {
                scrollX = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i6;
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i4)) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(scrollX, scrollY, i4, i5, min);
        C0792v.m2764c(this);
    }

    private void calculatePageOffsets(C1576b bVar, int i, C1576b bVar2) {
        float f;
        float f2;
        float f3;
        C1576b bVar3;
        C1576b bVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) this.mPageMargin) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (bVar2 != null) {
            int i2 = bVar2.f5165b;
            if (i2 < bVar.f5165b) {
                float f4 = bVar2.f5168e + bVar2.f5167d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f5165b && i4 < this.mItems.size()) {
                    C1576b bVar5 = this.mItems.get(i4);
                    while (true) {
                        bVar4 = bVar5;
                        if (i3 > bVar4.f5165b && i4 < this.mItems.size() - 1) {
                            i4++;
                            bVar5 = this.mItems.get(i4);
                        }
                    }
                    while (i3 < bVar4.f5165b) {
                        f4 += this.mAdapter.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f5168e = f4;
                    f4 += bVar4.f5167d + f;
                    i3++;
                }
            } else if (i2 > bVar.f5165b) {
                int size = this.mItems.size() - 1;
                float f5 = bVar2.f5168e;
                int i5 = i2 - 1;
                while (i5 >= bVar.f5165b && size >= 0) {
                    C1576b bVar6 = this.mItems.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i5 < bVar3.f5165b && size > 0) {
                            size--;
                            bVar6 = this.mItems.get(size);
                        }
                    }
                    while (i5 > bVar3.f5165b) {
                        f5 -= this.mAdapter.getPageWidth(i5) + f;
                        i5--;
                    }
                    f5 -= bVar3.f5167d + f;
                    bVar3.f5168e = f5;
                    i5--;
                }
            }
        }
        int size2 = this.mItems.size();
        float f6 = bVar.f5168e;
        int i6 = bVar.f5165b - 1;
        if (bVar.f5165b == 0) {
            f2 = bVar.f5168e;
        } else {
            f2 = -3.4028235E38f;
        }
        this.mFirstOffset = f2;
        int i7 = count - 1;
        if (bVar.f5165b == i7) {
            f3 = (bVar.f5168e + bVar.f5167d) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.mLastOffset = f3;
        int i8 = i - 1;
        while (i8 >= 0) {
            C1576b bVar7 = this.mItems.get(i8);
            while (i6 > bVar7.f5165b) {
                f6 -= this.mAdapter.getPageWidth(i6) + f;
                i6--;
            }
            f6 -= bVar7.f5167d + f;
            bVar7.f5168e = f6;
            if (bVar7.f5165b == 0) {
                this.mFirstOffset = f6;
            }
            i8--;
            i6--;
        }
        float f7 = bVar.f5168e + bVar.f5167d + f;
        int i9 = bVar.f5165b + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            C1576b bVar8 = this.mItems.get(i10);
            while (i9 < bVar8.f5165b) {
                f7 += this.mAdapter.getPageWidth(i9) + f;
                i9++;
            }
            if (bVar8.f5165b == i7) {
                this.mLastOffset = (bVar8.f5167d + f7) - 1.0f;
            }
            bVar8.f5168e = f7;
            f7 += bVar8.f5167d + f;
            i10++;
            i9++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        C1576b infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.f5168e, this.mLastOffset)));
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(i3, 0);
        pageScrolled(i3);
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            if (i >= this.mCurItem) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        ArrayList<C1576b> arrayList = this.mItems;
        return Math.max(this.mItems.get(0).f5165b, Math.min(i, arrayList.get(arrayList.size() - 1).f5165b));
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.mItems.isEmpty()) {
            C1576b infoForPosition = infoForPosition(this.mCurItem);
            if (infoForPosition != null) {
                f = Math.min(infoForPosition.f5168e, this.mLastOffset);
            } else {
                f = 0.0f;
            }
            int paddingLeft = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                completeScroll(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.mAdapter;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).f5166c = true;
                }
            }
            if (this.mCurItem != i) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C1576b infoForChild;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f5156a) {
                    int i13 = layoutParams.f5157b & 7;
                    int i14 = layoutParams.f5157b & 112;
                    if (i13 == 1) {
                        i5 = Math.max((i9 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    } else if (i13 == 3) {
                        i6 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i13 != 5) {
                        i6 = paddingLeft;
                    } else {
                        i5 = (i9 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    }
                    if (i14 == 16) {
                        i7 = Math.max((i10 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i8 = paddingTop;
                        paddingTop = i7;
                    } else if (i14 == 48) {
                        i8 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i14 != 80) {
                        i8 = paddingTop;
                    } else {
                        i7 = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i8 = paddingTop;
                        paddingTop = i7;
                    }
                    int i15 = paddingLeft + scrollX;
                    childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                    i11++;
                    paddingTop = i8;
                    paddingLeft = i6;
                }
            }
        }
        int i16 = (i9 - paddingLeft) - paddingRight;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f5156a && (infoForChild = infoForChild(childAt2)) != null) {
                    float f = (float) i16;
                    int i18 = ((int) (infoForChild.f5168e * f)) + paddingLeft;
                    if (layoutParams2.f5159d) {
                        layoutParams2.f5159d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f5158c), 1073741824), View.MeasureSpec.makeMeasureSpec((i10 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i18, paddingTop, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i10 - paddingBottom;
        this.mDecorChildCount = i11;
        if (this.mFirstLayout) {
            z2 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }
}
