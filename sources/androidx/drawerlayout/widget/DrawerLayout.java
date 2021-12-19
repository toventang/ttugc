package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.customview.p040a.C0827a;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    static final boolean CAN_HIDE_DESCENDANTS = true;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    private static final int[] THEME_ATTRS = {16843828};
    private final C0842b mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final C0845e mLeftCallback;
    private final C0827a mLeftDragger;
    private AbstractC0843c mListener;
    public List<AbstractC0843c> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final C0845e mRightCallback;
    private final C0827a mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public interface AbstractC0843c {
        static {
            Covode.recordClassIndex(929);
        }

        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    static final class C0842b extends C0726a {
        static {
            Covode.recordClassIndex(928);
        }

        C0842b() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            super.mo2808a(view, dVar);
            if (!DrawerLayout.includeChildForAccessibility(view)) {
                dVar.mo2832a((View) null);
            }
        }
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static class C0844d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3113a;

        /* renamed from: b */
        float f3114b;

        /* renamed from: c */
        boolean f3115c;

        /* renamed from: d */
        int f3116d;

        static {
            Covode.recordClassIndex(930);
        }

        public C0844d() {
            super(-1, -1);
        }

        public C0844d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0844d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0844d(C0844d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.f3113a = dVar.f3113a;
        }

        public C0844d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.f3113a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public class C0845e extends C0827a.AbstractC0830a {

        /* renamed from: a */
        final int f3117a;

        /* renamed from: b */
        public C0827a f3118b;

        /* renamed from: d */
        private final Runnable f3120d = new Runnable() {
            /* class androidx.drawerlayout.widget.DrawerLayout.C0845e.RunnableC08461 */

            static {
                Covode.recordClassIndex(932);
            }

            public final void run() {
                boolean z;
                View findDrawerWithGravity;
                int width;
                C0845e eVar = C0845e.this;
                int i = eVar.f3118b.f3073i;
                if (eVar.f3117a == 3) {
                    z = true;
                    findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(3);
                    if (findDrawerWithGravity != null) {
                        width = (-findDrawerWithGravity.getWidth()) + i;
                    } else {
                        return;
                    }
                } else {
                    z = false;
                    findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(5);
                    width = DrawerLayout.this.getWidth() - i;
                }
                if (findDrawerWithGravity != null) {
                    if (z) {
                        if (findDrawerWithGravity.getLeft() >= width) {
                            return;
                        }
                    } else if (findDrawerWithGravity.getLeft() <= width) {
                        return;
                    }
                    if (DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) == 0) {
                        eVar.f3118b.mo3022a(findDrawerWithGravity, width, findDrawerWithGravity.getTop());
                        ((C0844d) findDrawerWithGravity.getLayoutParams()).f3115c = true;
                        DrawerLayout.this.invalidate();
                        eVar.mo3136d();
                        DrawerLayout.this.cancelChildViewTouch();
                    }
                }
            }
        };

        static {
            Covode.recordClassIndex(931);
        }

        /* renamed from: c */
        public final void mo3135c() {
            DrawerLayout.this.removeCallbacks(this.f3120d);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3032a() {
            DrawerLayout.this.postDelayed(this.f3120d, 160);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo3136d() {
            int i = 3;
            if (this.f3117a == 3) {
                i = 5;
            }
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3030a(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3033a(int i) {
            DrawerLayout.this.updateDrawerState(this.f3117a, i, this.f3118b.f3075k);
        }

        C0845e(int i) {
            this.f3117a = i;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final boolean mo3039b(View view, int i) {
            if (!DrawerLayout.this.isDrawerView(view) || !DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.f3117a) || DrawerLayout.this.getDrawerLockMode(view) != 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: c */
        public final int mo3040c(View view, int i) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3034a(int i, int i2) {
            View findDrawerWithGravity;
            if ((i & 1) == 1) {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(3);
            } else {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(5);
            }
            if (findDrawerWithGravity != null && DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) == 0) {
                this.f3118b.mo3018a(findDrawerWithGravity, i2);
            }
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3036a(View view, int i) {
            ((C0844d) view.getLayoutParams()).f3115c = false;
            mo3136d();
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3035a(View view, float f, float f2) {
            int width;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width2 = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                width = (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width2;
            } else {
                width = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                    width -= width2;
                }
            }
            this.f3118b.mo3020a(width, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3037a(View view, int i, int i2, int i3, int i4) {
            float width;
            int i5;
            int width2 = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                width = (float) (i + width2);
            } else {
                width = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f = width / ((float) width2);
            DrawerLayout.this.setDrawerViewOffset(view, f);
            if (f == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0844d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    public void requestLayout() {
        if (!this.mInLayout) {
            super.requestLayout();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.drawerlayout.widget.DrawerLayout.SavedState.C08401 */

            static {
                Covode.recordClassIndex(926);
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
        int f3106a;

        /* renamed from: b */
        int f3107b;

        /* renamed from: e */
        int f3108e;

        /* renamed from: f */
        int f3109f;

        /* renamed from: g */
        int f3110g;

        static {
            Covode.recordClassIndex(925);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3106a);
            parcel.writeInt(this.f3107b);
            parcel.writeInt(this.f3108e);
            parcel.writeInt(this.f3109f);
            parcel.writeInt(this.f3110g);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3106a = parcel.readInt();
            this.f3107b = parcel.readInt();
            this.f3108e = parcel.readInt();
            this.f3109f = parcel.readInt();
            this.f3110g = parcel.readInt();
        }
    }

    private boolean hasVisibleDrawer() {
        if (findVisibleDrawer() != null) {
            return true;
        }
        return false;
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0844d) getChildAt(i).getLayoutParams()).f3115c) {
                return true;
            }
        }
        return false;
    }

    private Drawable resolveLeftShadow() {
        int e = C0792v.m2768e(this);
        if (e == 0) {
            Drawable drawable = this.mShadowStart;
            if (drawable != null) {
                mirror(drawable, e);
                return this.mShadowStart;
            }
        } else {
            Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                mirror(drawable2, e);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        int e = C0792v.m2768e(this);
        if (e == 0) {
            Drawable drawable = this.mShadowEnd;
            if (drawable != null) {
                mirror(drawable, e);
                return this.mShadowEnd;
            }
        } else {
            Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                mirror(drawable2, e);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    private void resolveShadowDrawables() {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            this.mShadowLeftResolved = resolveLeftShadow();
            this.mShadowRightResolved = resolveRightShadow();
        }
    }

    /* access modifiers changed from: package-private */
    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0844d) childAt.getLayoutParams()).f3116d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    static {
        Covode.recordClassIndex(923);
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        SET_DRAWER_SHADOW_FROM_ELEVATION = z;
    }

    /* access modifiers changed from: package-private */
    public void cancelChildViewTouch() {
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0844d) getChildAt(i).getLayoutParams()).f3114b);
        }
        this.mScrimOpacity = f;
        boolean c = this.mLeftDragger.mo3027c();
        boolean c2 = this.mRightDragger.mo3027c();
        if (c || c2) {
            C0792v.m2764c(this);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C0844d dVar = (C0844d) getChildAt(i).getLayoutParams();
            boolean z2 = true;
            if (dVar.f3116d == 1) {
                z = true;
            } else {
                z = false;
            }
            if (dVar.f3116d != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f3106a = dVar.f3113a;
            } else {
                i++;
            }
        }
        savedState.f3107b = this.mLockModeLeft;
        savedState.f3108e = this.mLockModeRight;
        savedState.f3109f = this.mLockModeStart;
        savedState.f3110g = this.mLockModeEnd;
        return savedState;
    }

    public void onRtlPropertiesChanged(int i) {
        resolveShadowDrawables();
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void setScrimColor(int i) {
        this.mScrimColor = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class C0841a extends C0726a {

        /* renamed from: c */
        private final Rect f3112c = new Rect();

        static {
            Covode.recordClassIndex(927);
        }

        C0841a() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: d */
        public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2813d(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: b */
        public final boolean mo2811b(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence drawerTitle;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo2811b(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
            if (findVisibleDrawer == null || (drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer))) == null) {
                return true;
            }
            text.add(drawerTitle);
            return true;
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.mo2808a(view, dVar);
            } else {
                C0733d a = C0733d.m2596a(AccessibilityNodeInfo.obtain(dVar.f2837a));
                super.mo2808a(view, a);
                dVar.f2839c = -1;
                dVar.f2837a.setSource(view);
                int i = Build.VERSION.SDK_INT;
                ViewParent parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    dVar.mo2832a((View) parentForAccessibility);
                }
                Rect rect = this.f3112c;
                a.mo2831a(rect);
                dVar.f2837a.setBoundsInParent(rect);
                a.mo2839b(rect);
                dVar.f2837a.setBoundsInScreen(rect);
                int i2 = Build.VERSION.SDK_INT;
                boolean isVisibleToUser = a.f2837a.isVisibleToUser();
                int i3 = Build.VERSION.SDK_INT;
                dVar.f2837a.setVisibleToUser(isVisibleToUser);
                dVar.f2837a.setPackageName(a.f2837a.getPackageName());
                dVar.mo2834a(a.f2837a.getClassName());
                dVar.f2837a.setContentDescription(a.f2837a.getContentDescription());
                dVar.f2837a.setEnabled(a.f2837a.isEnabled());
                dVar.f2837a.setClickable(a.f2837a.isClickable());
                dVar.mo2841b(a.f2837a.isFocusable());
                dVar.mo2843c(a.f2837a.isFocused());
                boolean a2 = a.mo2837a();
                int i4 = Build.VERSION.SDK_INT;
                dVar.f2837a.setAccessibilityFocused(a2);
                dVar.f2837a.setSelected(a.f2837a.isSelected());
                dVar.f2837a.setLongClickable(a.f2837a.isLongClickable());
                dVar.mo2829a(a.f2837a.getActions());
                a.f2837a.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (DrawerLayout.includeChildForAccessibility(childAt)) {
                        dVar.f2837a.addChild(childAt);
                    }
                }
            }
            dVar.mo2834a((CharSequence) DrawerLayout.class.getName());
            dVar.mo2841b(false);
            dVar.mo2843c(false);
            dVar.mo2842b(C0733d.C0734a.f2851a);
            dVar.mo2842b(C0733d.C0734a.f2852b);
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2810a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
                return super.mo2810a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0844d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0844d(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public float getDrawerViewOffset(View view) {
        return ((C0844d) view.getLayoutParams()).f3114b;
    }

    /* access modifiers changed from: package-private */
    public boolean isContentView(View view) {
        if (((C0844d) view.getLayoutParams()).f3113a == 0) {
            return true;
        }
        return false;
    }

    public boolean isDrawerOpen(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerVisible(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(AbstractC0843c cVar) {
        List<AbstractC0843c> list;
        if (cVar != null && (list = this.mListeners) != null) {
            list.remove(cVar);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.mDisallowInterceptRequested = z;
        if (z) {
            closeDrawers(true);
        }
    }

    public void setDrawerListener(AbstractC0843c cVar) {
        AbstractC0843c cVar2 = this.mListener;
        if (cVar2 != null) {
            removeDrawerListener(cVar2);
        }
        if (cVar != null) {
            addDrawerListener(cVar);
        }
        this.mListener = cVar;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setStatusBarBackgroundColor(int i) {
        this.mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    static String gravityToString(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    private static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    static boolean includeChildForAccessibility(View view) {
        if (C0792v.m2766d(view) == 4 || C0792v.m2766d(view) == 2) {
            return false;
        }
        return true;
    }

    public void addDrawerListener(AbstractC0843c cVar) {
        if (cVar != null) {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            this.mListeners.add(cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0844d) {
            return new C0844d((C0844d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0844d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0844d(layoutParams);
    }

    public CharSequence getDrawerTitle(int i) {
        int a = C0774e.m2693a(i, C0792v.m2768e(this));
        if (a == 3) {
            return this.mTitleLeft;
        }
        if (a == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getDrawerViewAbsoluteGravity(View view) {
        return C0774e.m2693a(((C0844d) view.getLayoutParams()).f3113a, C0792v.m2768e(this));
    }

    /* access modifiers changed from: package-private */
    public boolean isDrawerView(View view) {
        int a = C0774e.m2693a(((C0844d) view.getLayoutParams()).f3113a, C0792v.m2768e(view));
        if ((a & 3) == 0 && (a & 5) == 0) {
            return false;
        }
        return true;
    }

    public void setDrawerElevation(float f) {
        this.mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                C0792v.m2739a(childAt, this.mDrawerElevation);
            }
        }
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0643b.m2369a(getContext(), i);
        } else {
            drawable = null;
        }
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        C0844d dVar = (C0844d) view.getLayoutParams();
        if ((dVar.f3116d & 1) == 1) {
            dVar.f3116d = 0;
            List<AbstractC0843c> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerOpened(View view) {
        C0844d dVar = (C0844d) view.getLayoutParams();
        if ((dVar.f3116d & 1) == 0) {
            dVar.f3116d = 1;
            List<AbstractC0843c> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View findDrawerWithGravity(int i) {
        int a = C0774e.m2693a(i, C0792v.m2768e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public int getDrawerLockMode(View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((C0844d) view.getLayoutParams()).f3113a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerOpen(View view) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((C0844d) view.getLayoutParams()).f3116d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawerVisible(View view) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if (((C0844d) view.getLayoutParams()).f3114b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public void onDraw(Canvas canvas) {
        Object obj;
        int systemWindowInsetTop;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null && Build.VERSION.SDK_INT >= 21 && (obj = this.mLastInsets) != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    public void closeDrawers(boolean z) {
        boolean a;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0844d dVar = (C0844d) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || dVar.f3115c)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    a = this.mLeftDragger.mo3022a(childAt, -width, childAt.getTop());
                } else {
                    a = this.mRightDragger.mo3022a(childAt, getWidth(), childAt.getTop());
                }
                z2 |= a;
                dVar.f3115c = false;
            }
        }
        this.mLeftCallback.mo3135c();
        this.mRightCallback.mo3135c();
        if (z2) {
            invalidate();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public int getDrawerLockMode(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int e = C0792v.m2768e(this);
        if (i == 3) {
            int i6 = this.mLockModeLeft;
            if (i6 != 3) {
                return i6;
            }
            if (e == 0) {
                i2 = this.mLockModeStart;
            } else {
                i2 = this.mLockModeEnd;
            }
            if (i2 != 3) {
                return i2;
            }
            return 0;
        } else if (i == 5) {
            int i7 = this.mLockModeRight;
            if (i7 != 3) {
                return i7;
            }
            if (e == 0) {
                i3 = this.mLockModeEnd;
            } else {
                i3 = this.mLockModeStart;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 8388611) {
            int i8 = this.mLockModeStart;
            if (i8 != 3) {
                return i8;
            }
            if (e == 0) {
                i4 = this.mLockModeLeft;
            } else {
                i4 = this.mLockModeRight;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i9 = this.mLockModeEnd;
            if (i9 != 3) {
                return i9;
            }
            if (e == 0) {
                i5 = this.mLockModeRight;
            } else {
                i5 = this.mLockModeLeft;
            }
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View findDrawerWithGravity;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        if (!(savedState.f3106a == 0 || (findDrawerWithGravity = findDrawerWithGravity(savedState.f3106a)) == null)) {
            openDrawer(findDrawerWithGravity);
        }
        if (savedState.f3107b != 3) {
            setDrawerLockMode(savedState.f3107b, 3);
        }
        if (savedState.f3108e != 3) {
            setDrawerLockMode(savedState.f3108e, 5);
        }
        if (savedState.f3109f != 3) {
            setDrawerLockMode(savedState.f3109f, 8388611);
        }
        if (savedState.f3110g != 3) {
            setDrawerLockMode(savedState.f3110g, 8388613);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View findOpenDrawer;
        this.mLeftDragger.mo3026b(motionEvent);
        this.mRightDragger.mo3026b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View b = this.mLeftDragger.mo3023b((int) x2, (int) y2);
            if (b != null && isContentView(b)) {
                float f = x2 - this.mInitialMotionX;
                float f2 = y2 - this.mInitialMotionY;
                int i = this.mLeftDragger.f3066b;
                if (!((f * f) + (f2 * f2) >= ((float) (i * i)) || (findOpenDrawer = findOpenDrawer()) == null || getDrawerLockMode(findOpenDrawer) == 2)) {
                    z = false;
                    closeDrawers(z);
                    this.mDisallowInterceptRequested = false;
                }
            }
            z = true;
            closeDrawers(z);
            this.mDisallowInterceptRequested = false;
        } else if (action == 3) {
            closeDrawers(true);
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1 != 3) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean mirror(Drawable drawable, int i) {
        if (drawable == null || !C0705a.m2501a(drawable)) {
            return false;
        }
        C0705a.m2503b(drawable, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        if ((getDrawerViewAbsoluteGravity(view) & i) == i) {
            return true;
        }
        return false;
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(C0643b.m2369a(getContext(), i), i2);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerSlide(View view, float f) {
        List<AbstractC0843c> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onDrawerSlide(view, f);
            }
        }
    }

    public void moveDrawerToOffset(View view, float f) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !hasVisibleDrawer()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer == null) {
            return false;
        }
        if (getDrawerLockMode(findVisibleDrawer) != 0) {
            return true;
        }
        closeDrawers();
        return true;
    }

    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        if (z || getBackground() != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int a = C0774e.m2693a(i, C0792v.m2768e(this));
        if (a == 3) {
            this.mTitleLeft = charSequence;
        } else if (a == 5) {
            this.mTitleRight = charSequence;
        }
    }

    /* access modifiers changed from: package-private */
    public void setDrawerViewOffset(View view, float f) {
        C0844d dVar = (C0844d) view.getLayoutParams();
        if (f != dVar.f3114b) {
            dVar.f3114b = f;
            dispatchOnDrawerSlide(view, f);
        }
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    private void updateChildrenImportantForAccessibility(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (z ? childAt != view : isDrawerView(childAt)) {
                C0792v.m2740a(childAt, 4);
            } else {
                C0792v.m2740a(childAt, 1);
            }
        }
    }

    public void closeDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i));
    }

    public void openDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i));
    }

    public void setDrawerLockMode(int i, View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i, ((C0844d) view.getLayoutParams()).f3113a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            if ((i & 8388611) == 8388611) {
                this.mShadowStart = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.mShadowEnd = drawable;
            } else if ((i & 3) == 3) {
                this.mShadowLeft = drawable;
            } else if ((i & 5) == 5) {
                this.mShadowRight = drawable;
            } else {
                return;
            }
            resolveShadowDrawables();
            invalidate();
        }
    }

    public void closeDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            C0844d dVar = (C0844d) view.getLayoutParams();
            if (this.mFirstLayout) {
                dVar.f3114b = 0.0f;
                dVar.f3116d = 0;
            } else if (z) {
                dVar.f3116d |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.mo3022a(view, -view.getWidth(), view.getTop());
                } else {
                    this.mRightDragger.mo3022a(view, getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(dVar.f3113a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void openDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            C0844d dVar = (C0844d) view.getLayoutParams();
            if (this.mFirstLayout) {
                dVar.f3114b = 1.0f;
                dVar.f3116d = 1;
                updateChildrenImportantForAccessibility(view, true);
            } else if (z) {
                dVar.f3116d |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.mo3022a(view, 0, view.getTop());
                } else {
                    this.mRightDragger.mo3022a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 1.0f);
                updateDrawerState(dVar.f3113a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void setDrawerLockMode(int i, int i2) {
        C0827a aVar;
        View findDrawerWithGravity;
        int a = C0774e.m2693a(i2, C0792v.m2768e(this));
        if (i2 == 3) {
            this.mLockModeLeft = i;
        } else if (i2 == 5) {
            this.mLockModeRight = i;
        } else if (i2 == 8388611) {
            this.mLockModeStart = i;
        } else if (i2 == 8388613) {
            this.mLockModeEnd = i;
        }
        if (i != 0) {
            if (a == 3) {
                aVar = this.mLeftDragger;
            } else {
                aVar = this.mRightDragger;
            }
            aVar.mo3017a();
            if (i == 1) {
                View findDrawerWithGravity2 = findDrawerWithGravity(a);
                if (findDrawerWithGravity2 != null) {
                    closeDrawer(findDrawerWithGravity2);
                }
            } else if (i == 2 && (findDrawerWithGravity = findDrawerWithGravity(a)) != null) {
                openDrawer(findDrawerWithGravity);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        if (this.mLastInsets == null || !C0792v.m2781o(this)) {
            z = false;
        } else {
            z = true;
        }
        int e = C0792v.m2768e(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0844d dVar = (C0844d) childAt.getLayoutParams();
                if (z) {
                    int a = C0774e.m2693a(dVar.f3113a, e);
                    if (C0792v.m2781o(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.mLastInsets;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.mLastInsets;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - dVar.leftMargin) - dVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float k = C0792v.m2777k(childAt);
                        float f = this.mDrawerElevation;
                        if (k != f) {
                            C0792v.m2739a(childAt, f);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    if (drawerViewAbsoluteGravity == 3) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this DrawerLayout already has a drawer view along that edge");
                        }
                    } else if (!z3) {
                        z3 = true;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    childAt.measure(getChildMeasureSpec(i, this.mMinDrawerMargin + dVar.leftMargin + dVar.rightMargin, dVar.width), getChildMeasureSpec(i2, dVar.topMargin + dVar.bottomMargin, dVar.height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    private boolean isInBoundsOfChild(float f, float f2, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f, (int) f2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            C0792v.m2740a(view, 4);
        } else {
            C0792v.m2740a(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            C0792v.m2747a(view, this.mChildAccessibilityDelegate);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!isDrawerView(childAt)) {
                    this.mNonDrawerViews.add(childAt);
                } else if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.mNonDrawerViews.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.mNonDrawerViews.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.mNonDrawerViews.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateDrawerState(int i, int i2, View view) {
        int i3 = this.mLeftDragger.f3065a;
        int i4 = this.mRightDragger.f3065a;
        int i5 = 2;
        if (i3 == 1 || i4 == 1) {
            i5 = 1;
        } else if (!(i3 == 2 || i4 == 2)) {
            i5 = 0;
        }
        if (view != null && i2 == 0) {
            C0844d dVar = (C0844d) view.getLayoutParams();
            if (dVar.f3114b == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (dVar.f3114b == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i5 != this.mDrawerState) {
            this.mDrawerState = i5;
            List<AbstractC0843c> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i5);
                }
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new C0842b();
        this.mScrimColor = -1728053248;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C0845e eVar = new C0845e(3);
        this.mLeftCallback = eVar;
        C0845e eVar2 = new C0845e(5);
        this.mRightCallback = eVar2;
        C0827a a = C0827a.m2923a(this, 1.0f, eVar);
        this.mLeftDragger = a;
        a.f3074j = 1;
        a.f3072h = f2;
        eVar.f3118b = a;
        C0827a a2 = C0827a.m2923a(this, 1.0f, eVar2);
        this.mRightDragger = a2;
        a2.f3074j = 2;
        a2.f3072h = f2;
        eVar2.f3118b = a2;
        setFocusableInTouchMode(true);
        C0792v.m2740a((View) this, 1);
        C0792v.m2747a(this, new C0841a());
        setMotionEventSplittingEnabled(false);
        if (C0792v.m2781o(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    /* class androidx.drawerlayout.widget.DrawerLayout.View$OnApplyWindowInsetsListenerC08391 */

                    static {
                        Covode.recordClassIndex(924);
                    }

                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        boolean z;
                        DrawerLayout drawerLayout = (DrawerLayout) view;
                        if (windowInsets.getSystemWindowInsetTop() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        drawerLayout.setChildInsets(windowInsets, z);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
                try {
                    this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.mStatusBarBackground = null;
            }
        }
        this.mDrawerElevation = f * 10.0f;
        this.mNonDrawerViews = new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean isContentView = isContentView(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (isContentView) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.mScrimOpacity;
        if (f > 0.0f && isContentView) {
            int i4 = this.mScrimColor;
            Paint paint = this.mScrimPaint;
            paint.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.mLeftDragger.f3073i), 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.mRightDragger.f3073i), 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        boolean z2;
        int i6;
        this.mInLayout = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0844d dVar = (C0844d) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    childAt.layout(dVar.leftMargin, dVar.topMargin, dVar.leftMargin + childAt.getMeasuredWidth(), dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (dVar.f3114b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        i5 = i7 - ((int) (dVar.f3114b * f3));
                        f = ((float) (i7 - i5)) / f3;
                    }
                    if (f != dVar.f3114b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i9 = dVar.f3113a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < dVar.topMargin) {
                            i11 = dVar.topMargin;
                        } else if (i11 + measuredHeight > i10 - dVar.bottomMargin) {
                            i11 = (i10 - dVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, dVar.topMargin, measuredWidth + i5, dVar.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - dVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - dVar.bottomMargin);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f);
                    }
                    if (dVar.f3114b > 0.0f) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }
}
