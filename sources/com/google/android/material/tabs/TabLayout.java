package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0211a;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.widget.C0409an;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.C0778h;
import androidx.core.p037h.C0789s;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.C26685k;
import com.google.android.material.internal.C26686l;
import com.google.android.material.p1951a.C26555a;
import com.google.android.material.p1957f.C26630a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.AbstractC1575a
public class TabLayout extends HorizontalScrollView {
    private static final C0693f.AbstractC0694a<C26722f> tabPool = new C0693f.C0696c(16);
    private C26715a adapterChangeListener;
    private int contentInsetStart;
    private AbstractC26716b currentVpSelectedListener;
    boolean inlineLabel;
    int mode;
    private C26723g pageChangeListener;
    private PagerAdapter pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    public final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private AbstractC26716b selectedListener;
    private final ArrayList<AbstractC26716b> selectedListeners;
    private C26722f selectedTab;
    private boolean setupViewPagerImplicitly;
    private final C26719e slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabMaxWidth;
    public int tabPaddingBottom;
    public int tabPaddingEnd;
    public int tabPaddingStart;
    public int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    public final RectF tabViewContentBounds;
    private final C0693f.AbstractC0694a<TabView> tabViewPool;
    private final ArrayList<C26722f> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public interface AbstractC26716b<T extends C26722f> {
        static {
            Covode.recordClassIndex(32182);
        }

        /* renamed from: a */
        void mo9936a(T t);

        /* renamed from: b */
        void mo9937b(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface AbstractC26717c extends AbstractC26716b<C26722f> {
        static {
            Covode.recordClassIndex(32183);
        }
    }

    /* access modifiers changed from: package-private */
    public class TabView extends LinearLayout {
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines = 2;
        private ImageView iconView;
        private C26722f tab;
        private TextView textView;

        static {
            Covode.recordClassIndex(32180);
        }

        public C26722f getTab() {
            return this.tab;
        }

        /* access modifiers changed from: package-private */
        public void reset() {
            setTab(null);
            setSelected(false);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.tab.mo44370a();
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void updateOrientation() {
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            TextView textView2 = this.customTextView;
            if (textView2 == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView);
            } else {
                updateTextAndIcon(textView2, this.customIconView);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null && drawable.isStateful() && (false || this.baseBackgroundDrawable.setState(drawableState))) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentWidth() {
            int i = 0;
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            do {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i3 = Math.min(i3, view.getLeft());
                        i2 = Math.max(i2, view.getRight());
                    } else {
                        i3 = view.getLeft();
                        i2 = view.getRight();
                    }
                    z = true;
                }
                i++;
            } while (i < 3);
            return i2 - i3;
        }

        /* access modifiers changed from: package-private */
        public final void update() {
            Drawable mutate;
            View view;
            MethodCollector.m26663i(11935);
            C26722f fVar = this.tab;
            if (fVar == null || (view = fVar.f63312f) == null) {
                View view2 = this.customView;
                if (view2 != null) {
                    removeView(view2);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            } else {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.customView = view;
                TextView textView2 = this.textView;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView3 = (TextView) view.findViewById(16908308);
                this.customTextView = textView3;
                if (textView3 != null) {
                    this.defaultMaxLines = C0823h.m2903a(textView3);
                }
                this.customIconView = (ImageView) view.findViewById(16908294);
            }
            boolean z = false;
            if (this.customView == null) {
                if (this.iconView == null) {
                    ImageView imageView2 = (ImageView) C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.vm, this, false);
                    addView(imageView2, 0);
                    this.iconView = imageView2;
                }
                if (!(fVar == null || fVar.f63308b == null || (mutate = C0705a.m2506e(fVar.f63308b).mutate()) == null)) {
                    C0705a.m2496a(mutate, TabLayout.this.tabIconTint);
                    if (TabLayout.this.tabIconTintMode != null) {
                        C0705a.m2499a(mutate, TabLayout.this.tabIconTintMode);
                    }
                }
                if (this.textView == null) {
                    TextView textView4 = (TextView) C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.vn, this, false);
                    addView(textView4);
                    this.textView = textView4;
                    this.defaultMaxLines = C0823h.m2903a(textView4);
                }
                C0823h.m2907a(this.textView, TabLayout.this.tabTextAppearance);
                if (TabLayout.this.tabTextColors != null) {
                    this.textView.setTextColor(TabLayout.this.tabTextColors);
                }
                updateTextAndIcon(this.textView, this.iconView);
            } else {
                TextView textView5 = this.customTextView;
                if (!(textView5 == null && this.customIconView == null)) {
                    updateTextAndIcon(textView5, this.customIconView);
                }
            }
            if (fVar != null) {
                if (!TextUtils.isEmpty(fVar.f63310d)) {
                    setContentDescription(fVar.f63310d);
                }
                if (fVar.f63313g == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Tab not attached to a TabLayout");
                    MethodCollector.m26664o(11935);
                    throw illegalArgumentException;
                } else if (fVar.f63313g.getSelectedTabPosition() == fVar.f63311e) {
                    z = true;
                }
            }
            setSelected(z);
            MethodCollector.m26664o(11935);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0211a.AbstractC0213b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0211a.AbstractC0213b.class.getName());
        }

        /* access modifiers changed from: package-private */
        public void setTab(C26722f fVar) {
            if (fVar != this.tab) {
                this.tab = fVar;
                update();
            }
        }

        public void drawBackground(Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                int i = Build.VERSION.SDK_INT;
            }
            TextView textView2 = this.textView;
            if (textView2 != null) {
                textView2.setSelected(z);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void updateBackgroundDrawable(android.content.Context r8) {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.updateBackgroundDrawable(android.content.Context):void");
        }

        public TabView(Context context) {
            super(context);
            MethodCollector.m26663i(10985);
            updateBackgroundDrawable(context);
            C0792v.m2741a(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            C0792v.m2749a(this, C0789s.m2732a(getContext()));
            MethodCollector.m26664o(10985);
        }

        private void updateTextAndIcon(TextView textView2, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i;
            C26722f fVar = this.tab;
            CharSequence charSequence3 = null;
            if (fVar == null || fVar.f63308b == null) {
                drawable = null;
            } else {
                drawable = C0705a.m2506e(this.tab.f63308b).mutate();
            }
            C26722f fVar2 = this.tab;
            if (fVar2 != null) {
                charSequence = fVar2.f63309c;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView2 != null) {
                if (z) {
                    textView2.setText(charSequence);
                    textView2.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                    textView2.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i = 0;
                } else {
                    i = TabLayout.this.dpToPx(8);
                }
                if (TabLayout.this.inlineLabel) {
                    if (i != C0778h.m2704b(marginLayoutParams)) {
                        C0778h.m2705b(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    C0778h.m2705b(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C26722f fVar3 = this.tab;
            if (fVar3 != null) {
                charSequence2 = fVar3.f63310d;
            } else {
                charSequence2 = null;
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            C0409an.m1520a(this, charSequence3);
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            MethodCollector.m26663i(11285);
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.textView != null) {
                float f = TabLayout.this.tabTextSize;
                int i3 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView2 = this.textView;
                    if (textView2 != null && textView2.getLineCount() > 1) {
                        f = TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int a = C0823h.m2903a(this.textView);
                if ((f != textSize || (a >= 0 && i3 != a)) && (TabLayout.this.mode != 1 || f <= textSize || lineCount != 1 || ((layout = this.textView.getLayout()) != null && approximateLineWidth(layout, 0, f) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))))) {
                    this.textView.setTextSize(0, f);
                    this.textView.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
            MethodCollector.m26664o(11285);
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public class C26718d extends DataSetObserver {
        static {
            Covode.recordClassIndex(32184);
        }

        public final void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        public final void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }

        C26718d() {
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public static class C26722f {

        /* renamed from: a */
        public Object f63307a;

        /* renamed from: b */
        public Drawable f63308b;

        /* renamed from: c */
        public CharSequence f63309c;

        /* renamed from: d */
        public CharSequence f63310d;

        /* renamed from: e */
        public int f63311e = -1;

        /* renamed from: f */
        public View f63312f;

        /* renamed from: g */
        public TabLayout f63313g;

        /* renamed from: h */
        public TabView f63314h;

        static {
            Covode.recordClassIndex(32188);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo44371b() {
            TabView tabView = this.f63314h;
            if (tabView != null) {
                tabView.update();
            }
        }

        /* renamed from: a */
        public final void mo44370a() {
            TabLayout tabLayout = this.f63313g;
            if (tabLayout != null) {
                tabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo44372c() {
            this.f63313g = null;
            this.f63314h = null;
            this.f63307a = null;
            this.f63308b = null;
            this.f63309c = null;
            this.f63310d = null;
            this.f63311e = -1;
            this.f63312f = null;
        }

        /* renamed from: a */
        public final C26722f mo44368a(View view) {
            this.f63312f = view;
            mo44371b();
            return this;
        }

        /* renamed from: a */
        public final C26722f mo44367a(int i) {
            return mo44368a(C1764a.m5927a(LayoutInflater.from(this.f63314h.getContext()), i, this.f63314h, false));
        }

        /* renamed from: a */
        public final C26722f mo44369a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f63310d) && !TextUtils.isEmpty(charSequence)) {
                this.f63314h.setContentDescription(charSequence);
            }
            this.f63309c = charSequence;
            mo44371b();
            return this;
        }
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    static {
        Covode.recordClassIndex(32178);
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private int getTabMinWidth() {
        int i = this.requestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        if (this.mode == 0) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public C26722f createTabFromPool() {
        C26722f acquire = tabPool.acquire();
        if (acquire == null) {
            return new C26722f();
        }
        return acquire;
    }

    public int getSelectedTabPosition() {
        C26722f fVar = this.selectedTab;
        if (fVar != null) {
            return fVar.f63311e;
        }
        return -1;
    }

    public C26722f newTab() {
        C26722f createTabFromPool = createTabFromPool();
        createTabFromPool.f63313g = this;
        createTabFromPool.f63314h = createTabView(createTabFromPool);
        return createTabFromPool;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            this.tabs.get(i).mo44371b();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    private void applyModeAndGravity() {
        int i;
        if (this.mode == 0) {
            i = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        } else {
            i = 0;
        }
        C0792v.m2741a(this.slidingTabIndicator, i, 0, 0, 0);
        int i2 = this.mode;
        if (i2 == 0) {
            this.slidingTabIndicator.setGravity(8388611);
        } else if (i2 == 1) {
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(C26555a.f62656b);
            this.scrollAnimator.setDuration((long) this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.google.android.material.tabs.TabLayout.C267141 */

                static {
                    Covode.recordClassIndex(32179);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            C26722f fVar = this.tabs.get(i);
            if (fVar != null && fVar.f63308b != null && !TextUtils.isEmpty(fVar.f63309c)) {
                if (!this.inlineLabel) {
                    return 72;
                } else {
                    return 48;
                }
            }
        }
        return 48;
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<C26722f> it = this.tabs.iterator();
        while (it.hasNext()) {
            C26722f next = it.next();
            it.remove();
            next.mo44372c();
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    /* access modifiers changed from: package-private */
    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter2 = this.pagerAdapter;
        if (pagerAdapter2 != null) {
            int count = pagerAdapter2.getCount();
            for (int i = 0; i < count; i++) {
                addTab(newTab().mo44369a(this.pagerAdapter.getPageTitle(i)), false);
            }
            ViewPager viewPager2 = this.viewPager;
            if (viewPager2 != null && count > 0 && (currentItem = viewPager2.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C26719e extends LinearLayout {

        /* renamed from: a */
        int f63290a = -1;

        /* renamed from: b */
        float f63291b;

        /* renamed from: c */
        ValueAnimator f63292c;

        /* renamed from: e */
        private int f63294e;

        /* renamed from: f */
        private final Paint f63295f;

        /* renamed from: g */
        private final GradientDrawable f63296g;

        /* renamed from: h */
        private int f63297h = -1;

        /* renamed from: i */
        private int f63298i = -1;

        /* renamed from: j */
        private int f63299j = -1;

        static {
            Covode.recordClassIndex(32185);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo44356a() {
            int i;
            int i2;
            View childAt = getChildAt(this.f63290a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (!TabLayout.this.tabIndicatorFullWidth && (childAt instanceof TabView)) {
                    m53046a((TabView) childAt, TabLayout.this.tabViewContentBounds);
                    i = (int) TabLayout.this.tabViewContentBounds.left;
                    i2 = (int) TabLayout.this.tabViewContentBounds.right;
                }
                if (this.f63291b > 0.0f && this.f63290a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f63290a + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (!TabLayout.this.tabIndicatorFullWidth && (childAt2 instanceof TabView)) {
                        m53046a((TabView) childAt2, TabLayout.this.tabViewContentBounds);
                        left = (int) TabLayout.this.tabViewContentBounds.left;
                        right = (int) TabLayout.this.tabViewContentBounds.right;
                    }
                    float f = this.f63291b;
                    i = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i)));
                    i2 = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i2)));
                }
            }
            mo44358a(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo44359b(int i) {
            if (this.f63294e != i) {
                this.f63294e = i;
                C0792v.m2764c(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo44357a(int i) {
            if (this.f63295f.getColor() != i) {
                this.f63295f.setColor(i);
                C0792v.m2764c(this);
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f63297h != i) {
                requestLayout();
                this.f63297h = i;
            }
        }

        public void draw(Canvas canvas) {
            int i;
            Drawable drawable;
            int i2 = 0;
            if (TabLayout.this.tabSelectedIndicator != null) {
                i = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            } else {
                i = 0;
            }
            int i3 = this.f63294e;
            if (i3 >= 0) {
                i = i3;
            }
            int i4 = TabLayout.this.tabIndicatorGravity;
            if (i4 == 0) {
                i2 = getHeight() - i;
                i = getHeight();
            } else if (i4 == 1) {
                i2 = (getHeight() - i) / 2;
                i = (getHeight() + i) / 2;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    i = 0;
                } else {
                    i = getHeight();
                }
            }
            int i5 = this.f63298i;
            if (i5 >= 0 && this.f63299j > i5) {
                if (TabLayout.this.tabSelectedIndicator != null) {
                    drawable = TabLayout.this.tabSelectedIndicator;
                } else {
                    drawable = this.f63296g;
                }
                Drawable e = C0705a.m2506e(drawable);
                e.setBounds(this.f63298i, i2, this.f63299j, i);
                if (this.f63295f != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        e.setColorFilter(this.f63295f.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        C0705a.m2494a(e, this.f63295f.getColor());
                    }
                }
                e.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo44358a(int i, int i2) {
            if (i != this.f63298i || i2 != this.f63299j) {
                this.f63298i = i;
                this.f63299j = i2;
                C0792v.m2764c(this);
            }
        }

        C26719e(Context context) {
            super(context);
            MethodCollector.m26663i(12916);
            setWillNotDraw(false);
            this.f63295f = new Paint();
            this.f63296g = new GradientDrawable();
            MethodCollector.m26664o(12916);
        }

        /* renamed from: a */
        private void m53046a(TabView tabView, RectF rectF) {
            int contentWidth = tabView.getContentWidth();
            if (contentWidth < TabLayout.this.dpToPx(24)) {
                contentWidth = TabLayout.this.dpToPx(24);
            }
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int i = contentWidth / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo44360b(final int i, int i2) {
            ValueAnimator valueAnimator = this.f63292c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f63292c.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                mo44356a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (!TabLayout.this.tabIndicatorFullWidth && (childAt instanceof TabView)) {
                m53046a((TabView) childAt, TabLayout.this.tabViewContentBounds);
                left = (int) TabLayout.this.tabViewContentBounds.left;
                right = (int) TabLayout.this.tabViewContentBounds.right;
            }
            final int i3 = this.f63298i;
            final int i4 = this.f63299j;
            if (i3 != left || i4 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f63292c = valueAnimator2;
                valueAnimator2.setInterpolator(C26555a.f62656b);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.tabs.TabLayout.C26719e.C267201 */

                    static {
                        Covode.recordClassIndex(32186);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C26719e.this.mo44358a(C26555a.m52579a(i3, left, animatedFraction), C26555a.m52579a(i4, right, animatedFraction));
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    /* class com.google.android.material.tabs.TabLayout.C26719e.C267212 */

                    static {
                        Covode.recordClassIndex(32187);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C26719e.this.f63290a = i;
                        C26719e.this.f63291b = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
            if (r3 != false) goto L_0x0084;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r9, int r10) {
            /*
            // Method dump skipped, instructions count: 139
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C26719e.onMeasure(int, int):void");
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            MethodCollector.m26663i(13097);
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f63292c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo44356a();
                MethodCollector.m26664o(13097);
                return;
            }
            this.f63292c.cancel();
            mo44360b(this.f63290a, Math.round((1.0f - this.f63292c.getAnimatedFraction()) * ((float) this.f63292c.getDuration())));
            MethodCollector.m26664o(13097);
        }
    }

    public void addView(View view) {
        addViewInternal(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C26715a implements ViewPager.AbstractC1578d {

        /* renamed from: a */
        public boolean f63287a;

        static {
            Covode.recordClassIndex(32181);
        }

        C26715a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1578d
        /* renamed from: a */
        public final void mo5326a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.viewPager == viewPager) {
                TabLayout.this.setPagerAdapter(pagerAdapter2, this.f63287a);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C26723g implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        int f63315a;

        /* renamed from: b */
        int f63316b;

        /* renamed from: c */
        private final WeakReference<TabLayout> f63317c;

        static {
            Covode.recordClassIndex(32189);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public void onPageScrollStateChanged(int i) {
            this.f63315a = this.f63316b;
            this.f63316b = i;
        }

        public C26723g(TabLayout tabLayout) {
            this.f63317c = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = this.f63317c.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f63316b;
                if (i2 == 0 || (i2 == 2 && this.f63315a == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i), z);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            r5.setScrollPosition(r7, r8, r1, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r4 == 2) goto L_0x0018;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            if (r6.f63315a != 0) goto L_0x001c;
         */
        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPageScrolled(int r7, float r8, int r9) {
            /*
                r6 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r0 = r6.f63317c
                java.lang.Object r5 = r0.get()
                com.google.android.material.tabs.TabLayout r5 = (com.google.android.material.tabs.TabLayout) r5
                if (r5 == 0) goto L_0x0020
                int r4 = r6.f63316b
                r3 = 0
                r2 = 2
                r1 = 1
                if (r4 != r2) goto L_0x0015
                int r0 = r6.f63315a
                if (r0 != r1) goto L_0x0021
            L_0x0015:
                r1 = 1
                if (r4 != r2) goto L_0x001c
            L_0x0018:
                int r0 = r6.f63315a
                if (r0 == 0) goto L_0x001d
            L_0x001c:
                r3 = 1
            L_0x001d:
                r5.setScrollPosition(r7, r8, r1, r3)
            L_0x0020:
                return
            L_0x0021:
                r1 = 0
                goto L_0x0018
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C26723g.onPageScrolled(int, float, int):void");
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C26724h implements AbstractC26717c {

        /* renamed from: a */
        private final ViewPager f63318a;

        static {
            Covode.recordClassIndex(32190);
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: b */
        public void mo9937b(C26722f fVar) {
        }

        public C26724h(ViewPager viewPager) {
            this.f63318a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: a */
        public void mo9936a(C26722f fVar) {
            this.f63318a.setCurrentItem(fVar.f63311e);
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public boolean releaseFromTabPool(C26722f fVar) {
        return tabPool.release(fVar);
    }

    public void removeOnTabSelectedListener(AbstractC26716b bVar) {
        this.selectedListeners.remove(bVar);
    }

    /* access modifiers changed from: package-private */
    public void selectTab(C26722f fVar) {
        selectTab(fVar, true);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.slidingTabIndicator.mo44357a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.slidingTabIndicator.mo44359b(i);
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        C0792v.m2764c(this.slidingTabIndicator);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter2) {
        setPagerAdapter(pagerAdapter2, false);
    }

    public void setupWithViewPager(ViewPager viewPager2) {
        setupWithViewPager(viewPager2, true);
    }

    private void addTabView(C26722f fVar) {
        this.slidingTabIndicator.addView(fVar.f63314h, fVar.f63311e, createLayoutParamsForTabs());
    }

    public void addOnTabSelectedListener(AbstractC26716b bVar) {
        if (!this.selectedListeners.contains(bVar)) {
            this.selectedListeners.add(bVar);
        }
    }

    public void addTab(C26722f fVar) {
        addTab(fVar, this.tabs.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setOnTabSelectedListener(AbstractC26716b bVar) {
        AbstractC26716b bVar2 = this.selectedListener;
        if (bVar2 != null) {
            removeOnTabSelectedListener(bVar2);
        }
        this.selectedListener = bVar;
        if (bVar != null) {
            addOnTabSelectedListener(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.tabSelectedIndicator != drawable) {
            this.tabSelectedIndicator = drawable;
            C0792v.m2764c(this.slidingTabIndicator);
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            C0792v.m2764c(this.slidingTabIndicator);
        }
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C0196a.m618a(getContext(), i));
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C0196a.m618a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    private void addViewInternal(View view) {
        if (view instanceof C26725a) {
            addTabFromItemView((C26725a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void dispatchTabReselected(C26722f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size);
        }
    }

    private void dispatchTabSelected(C26722f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).mo9936a(fVar);
        }
    }

    private void dispatchTabUnselected(C26722f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).mo9937b(fVar);
        }
    }

    private void removeTabViewAt(int i) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i);
        this.slidingTabIndicator.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* access modifiers changed from: package-private */
    public int dpToPx(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public C26722f getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i);
    }

    public void removeTab(C26722f fVar) {
        if (fVar.f63313g == this) {
            removeTabAt(fVar.f63311e);
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C0196a.m619b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    private void addTabFromItemView(C26725a aVar) {
        C26722f newTab = newTab();
        if (aVar.f63319a != null) {
            newTab.mo44369a(aVar.f63319a);
        }
        if (aVar.f63320b != null) {
            newTab.f63308b = aVar.f63320b;
            newTab.mo44371b();
        }
        if (aVar.f63321c != 0) {
            newTab.mo44367a(aVar.f63321c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            newTab.f63310d = aVar.getContentDescription();
            newTab.mo44371b();
        }
        addTab(newTab);
    }

    private TabView createTabView(C26722f fVar) {
        TabView tabView;
        C0693f.AbstractC0694a<TabView> aVar = this.tabViewPool;
        if (aVar == null || (tabView = aVar.acquire()) == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(fVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f63310d)) {
            tabView.setContentDescription(fVar.f63309c);
        } else {
            tabView.setContentDescription(fVar.f63310d);
        }
        return tabView;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(10357);
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
        MethodCollector.m26664o(10357);
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private void animateToTab(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C0792v.m2788v(this)) {
                C26719e eVar = this.slidingTabIndicator;
                int childCount = eVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (eVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
                if (scrollX != calculateScrollXForTab) {
                    ensureScrollAnimator();
                    this.scrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                    this.scrollAnimator.start();
                }
                this.slidingTabIndicator.mo44360b(i, this.tabIndicatorAnimationDuration);
                return;
            }
            setScrollPosition(i, 0.0f, true);
        }
    }

    public void removeTabAt(int i) {
        int i2;
        C26722f fVar;
        C26722f fVar2 = this.selectedTab;
        if (fVar2 != null) {
            i2 = fVar2.f63311e;
        } else {
            i2 = 0;
        }
        removeTabViewAt(i);
        C26722f remove = this.tabs.remove(i);
        if (remove != null) {
            remove.mo44372c();
            releaseFromTabPool(remove);
        }
        int size = this.tabs.size();
        for (int i3 = i; i3 < size; i3++) {
            this.tabs.get(i3).f63311e = i3;
        }
        if (i2 == i) {
            if (this.tabs.isEmpty()) {
                fVar = null;
            } else {
                fVar = this.tabs.get(Math.max(0, i - 1));
            }
            selectTab(fVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        addViewInternal(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.agu);
    }

    public void setupWithViewPager(ViewPager viewPager2, boolean z) {
        setupWithViewPager(viewPager2, z, false);
    }

    private void configureTab(C26722f fVar, int i) {
        fVar.f63311e = i;
        this.tabs.add(i, fVar);
        int size = this.tabs.size();
        while (true) {
            i++;
            if (i < size) {
                this.tabs.get(i).f63311e = i;
            } else {
                return;
            }
        }
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void addTab(C26722f fVar, int i) {
        addTab(fVar, i, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    /* access modifiers changed from: package-private */
    public void selectTab(C26722f fVar, boolean z) {
        int i;
        C26722f fVar2 = this.selectedTab;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.f63311e;
            } else {
                i = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.f63311e == -1) && i != -1) {
                    setScrollPosition(i, 0.0f, true);
                } else {
                    animateToTab(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.selectedTab = fVar;
            if (fVar2 != null) {
                dispatchTabUnselected(fVar2);
            }
            if (fVar != null) {
                dispatchTabSelected(fVar);
            }
        } else if (fVar2 != null) {
            dispatchTabReselected(fVar);
            animateToTab(fVar.f63311e);
        }
    }

    /* access modifiers changed from: package-private */
    public void setPagerAdapter(PagerAdapter pagerAdapter2, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter3 = this.pagerAdapter;
        if (!(pagerAdapter3 == null || (dataSetObserver = this.pagerAdapterObserver) == null)) {
            pagerAdapter3.unregisterDataSetObserver(dataSetObserver);
        }
        this.pagerAdapter = pagerAdapter2;
        if (z && pagerAdapter2 != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new C26718d();
            }
            pagerAdapter2.registerDataSetObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private int calculateScrollXForTab(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.mode != 0) {
            return 0;
        }
        View childAt = this.slidingTabIndicator.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.slidingTabIndicator.getChildCount()) {
            view = this.slidingTabIndicator.getChildAt(i4);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (i2 + i3)) * 0.5f * f);
        if (C0792v.m2768e(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    public void addTab(C26722f fVar, boolean z) {
        addTab(fVar, this.tabs.size(), z);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10499);
        int dpToPx = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(dpToPx, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode2 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(dpToPx, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.requestedTabMaxWidth;
            if (i3 <= 0) {
                i3 = size - dpToPx(56);
            }
            this.tabMaxWidth = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.mode;
            if (i4 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        MethodCollector.m26664o(10499);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void addTab(C26722f fVar, int i, boolean z) {
        if (fVar.f63313g == this) {
            configureTab(fVar, i);
            addTabView(fVar);
            if (z) {
                fVar.mo44370a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private void setupWithViewPager(ViewPager viewPager2, boolean z, boolean z2) {
        ViewPager viewPager3 = this.viewPager;
        if (viewPager3 != null) {
            C26723g gVar = this.pageChangeListener;
            if (gVar != null) {
                viewPager3.removeOnPageChangeListener(gVar);
            }
            C26715a aVar = this.adapterChangeListener;
            if (aVar != null) {
                this.viewPager.removeOnAdapterChangeListener(aVar);
            }
        }
        AbstractC26716b bVar = this.currentVpSelectedListener;
        if (bVar != null) {
            removeOnTabSelectedListener(bVar);
            this.currentVpSelectedListener = null;
        }
        if (viewPager2 != null) {
            this.viewPager = viewPager2;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new C26723g(this);
            }
            C26723g gVar2 = this.pageChangeListener;
            gVar2.f63316b = 0;
            gVar2.f63315a = 0;
            viewPager2.addOnPageChangeListener(this.pageChangeListener);
            C26724h hVar = new C26724h(viewPager2);
            this.currentVpSelectedListener = hVar;
            addOnTabSelectedListener(hVar);
            PagerAdapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new C26715a();
            }
            this.adapterChangeListener.f63287a = z;
            viewPager2.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(12385);
        this.tabs = new ArrayList<>();
        this.tabViewContentBounds = new RectF();
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.selectedListeners = new ArrayList<>();
        this.tabViewPool = new C0693f.C0695b(12);
        setHorizontalScrollBarEnabled(false);
        C26719e eVar = new C26719e(context);
        this.slidingTabIndicator = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a = C26685k.m52976a(context, attributeSet, new int[]{R.attr.ag8, R.attr.ag9, R.attr.ag_, R.attr.aga, R.attr.agb, R.attr.agc, R.attr.agd, R.attr.age, R.attr.agf, R.attr.agg, R.attr.agh, R.attr.agj, R.attr.agk, R.attr.agl, R.attr.agm, R.attr.agn, R.attr.ago, R.attr.agp, R.attr.agq, R.attr.agr, R.attr.ags, R.attr.agt, R.attr.agv, R.attr.agw, R.attr.agx}, i, R.style.r2, 22);
        eVar.mo44359b(a.getDimensionPixelSize(10, -1));
        eVar.mo44357a(a.getColor(7, 0));
        setSelectedTabIndicator(C26630a.m52828b(context, a, 5));
        setSelectedTabIndicatorGravity(a.getInt(9, 0));
        setTabIndicatorFullWidth(a.getBoolean(8, true));
        int dimensionPixelSize = a.getDimensionPixelSize(15, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = a.getDimensionPixelSize(18, dimensionPixelSize);
        this.tabPaddingTop = a.getDimensionPixelSize(19, this.tabPaddingTop);
        this.tabPaddingEnd = a.getDimensionPixelSize(17, this.tabPaddingEnd);
        this.tabPaddingBottom = a.getDimensionPixelSize(16, this.tabPaddingBottom);
        int resourceId = a.getResourceId(22, R.style.jg);
        this.tabTextAppearance = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk});
        try {
            this.tabTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.tabTextColors = C26630a.m52827a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (a.hasValue(23)) {
                this.tabTextColors = C26630a.m52827a(context, a, 23);
            }
            if (a.hasValue(21)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), a.getColor(21, 0));
            }
            this.tabIconTint = C26630a.m52827a(context, a, 3);
            this.tabIconTintMode = C26686l.m52985a(a.getInt(4, -1), null);
            this.tabRippleColorStateList = C26630a.m52827a(context, a, 20);
            this.tabIndicatorAnimationDuration = a.getInt(6, 300);
            this.requestedTabMinWidth = a.getDimensionPixelSize(13, -1);
            this.requestedTabMaxWidth = a.getDimensionPixelSize(12, -1);
            this.tabBackgroundResId = a.getResourceId(0, 0);
            this.contentInsetStart = a.getDimensionPixelSize(1, 0);
            this.mode = a.getInt(14, 1);
            this.tabGravity = a.getInt(2, 0);
            this.inlineLabel = a.getBoolean(11, false);
            this.unboundedRipple = a.getBoolean(24, false);
            a.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = (float) resources.getDimensionPixelSize(R.dimen.ib);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.i_);
            applyModeAndGravity();
            MethodCollector.m26664o(12385);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.m26664o(12385);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.slidingTabIndicator.getChildCount()) {
            if (z2) {
                C26719e eVar = this.slidingTabIndicator;
                if (eVar.f63292c != null && eVar.f63292c.isRunning()) {
                    eVar.f63292c.cancel();
                }
                eVar.f63290a = i;
                eVar.f63291b = f;
                eVar.mo44356a();
            }
            ValueAnimator valueAnimator = this.scrollAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.scrollAnimator.cancel();
            }
            scrollTo(calculateScrollXForTab(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }
}
