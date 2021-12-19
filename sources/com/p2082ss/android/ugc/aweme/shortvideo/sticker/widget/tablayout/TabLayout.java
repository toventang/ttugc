package com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0211a;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.C0789s;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.AbstractC1575a
/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: u */
    private static final C0693f.AbstractC0694a<C73104f> f164051u = new C0693f.C0696c(16);

    /* renamed from: A */
    private final int f164052A;

    /* renamed from: B */
    private int f164053B;

    /* renamed from: C */
    private AbstractC73099c f164054C;

    /* renamed from: D */
    private final ArrayList<AbstractC73099c> f164055D;

    /* renamed from: E */
    private AbstractC73099c f164056E;

    /* renamed from: F */
    private ValueAnimator f164057F;

    /* renamed from: G */
    private PagerAdapter f164058G;

    /* renamed from: H */
    private DataSetObserver f164059H;

    /* renamed from: I */
    private C73097a f164060I;

    /* renamed from: J */
    private boolean f164061J;

    /* renamed from: K */
    private float f164062K;

    /* renamed from: L */
    private float f164063L;

    /* renamed from: M */
    private boolean f164064M;

    /* renamed from: N */
    private int f164065N;

    /* renamed from: O */
    private boolean f164066O;

    /* renamed from: P */
    private final C0693f.AbstractC0694a<C73108i> f164067P;

    /* renamed from: a */
    public C73101e f164068a;

    /* renamed from: b */
    int f164069b;

    /* renamed from: c */
    int f164070c;

    /* renamed from: d */
    int f164071d;

    /* renamed from: e */
    int f164072e;

    /* renamed from: f */
    int f164073f;

    /* renamed from: g */
    ColorStateList f164074g;

    /* renamed from: h */
    float f164075h;

    /* renamed from: i */
    float f164076i;

    /* renamed from: j */
    final int f164077j;

    /* renamed from: k */
    int f164078k;

    /* renamed from: l */
    int f164079l;

    /* renamed from: m */
    int f164080m;

    /* renamed from: n */
    boolean f164081n;

    /* renamed from: o */
    ViewPager f164082o;

    /* renamed from: p */
    C73105g f164083p;

    /* renamed from: q */
    public boolean f164084q;

    /* renamed from: r */
    public boolean f164085r;

    /* renamed from: s */
    public AbstractC73098b f164086s;

    /* renamed from: t */
    public int f164087t;

    /* renamed from: v */
    private final ArrayList<C73104f> f164088v;

    /* renamed from: w */
    private C73104f f164089w;

    /* renamed from: x */
    private int f164090x;

    /* renamed from: y */
    private final int f164091y;

    /* renamed from: z */
    private final int f164092z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$b */
    public interface AbstractC73098b {
        static {
            Covode.recordClassIndex(85807);
        }

        /* renamed from: a */
        void mo86256a(C73104f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$c */
    public interface AbstractC73099c {
        static {
            Covode.recordClassIndex(85808);
        }

        /* renamed from: a */
        void mo86253a(C73104f fVar);

        /* renamed from: b */
        void mo86254b(C73104f fVar);

        /* renamed from: c */
        void mo86255c(C73104f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$i */
    public class C73108i extends LinearLayout {

        /* renamed from: b */
        private C73104f f164148b;

        /* renamed from: c */
        private TextView f164149c;

        /* renamed from: d */
        private ImageView f164150d;

        /* renamed from: e */
        private View f164151e;

        /* renamed from: f */
        private TextView f164152f;

        /* renamed from: g */
        private ImageView f164153g;

        /* renamed from: h */
        private int f164154h = 2;

        static {
            Covode.recordClassIndex(85817);
        }

        public final C73104f getTab() {
            return this.f164148b;
        }

        public final TextView getTextView() {
            return this.f164149c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo115596a() {
            setTab(null);
            setSelected(false);
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f164148b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (TabLayout.this.f164086s != null) {
                TabLayout.this.f164086s.mo86256a(this.f164148b);
            } else {
                this.f164148b.mo115586a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo115597b() {
            boolean z;
            View view;
            MethodCollector.m26663i(6365);
            C73104f fVar = this.f164148b;
            if (fVar == null || (view = fVar.f164125f) == null) {
                View view2 = this.f164151e;
                if (view2 != null) {
                    removeView(view2);
                    this.f164151e = null;
                }
                this.f164152f = null;
                this.f164153g = null;
            } else {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f164151e = view;
                TextView textView = this.f164149c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f164150d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f164150d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f164152f = textView2;
                if (textView2 != null) {
                    this.f164154h = C0823h.m2903a(textView2);
                }
                this.f164153g = (ImageView) view.findViewById(16908294);
            }
            if (fVar == null || !fVar.mo115587b()) {
                z = false;
            } else {
                z = true;
            }
            setSelected(z);
            MethodCollector.m26664o(6365);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0211a.AbstractC0213b.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0211a.AbstractC0213b.class.getName());
        }

        /* access modifiers changed from: package-private */
        public final void setTab(C73104f fVar) {
            if (fVar != this.f164148b) {
                this.f164148b = fVar;
                mo115597b();
            }
        }

        public final void setSelected(boolean z) {
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
            TextView textView = this.f164149c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f164150d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f164151e;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public C73108i(Context context) {
            super(context);
            MethodCollector.m26663i(6051);
            if (TabLayout.this.f164077j != 0) {
                C0792v.m2746a(this, C0196a.m619b(context, TabLayout.this.f164077j));
            }
            C0792v.m2741a(this, TabLayout.this.f164069b, TabLayout.this.f164070c, TabLayout.this.f164071d, TabLayout.this.f164072e);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0792v.m2749a(this, C0789s.m2732a(getContext()));
            MethodCollector.m26664o(6051);
        }

        public final void onMeasure(int i, int i2) {
            Layout layout;
            MethodCollector.m26663i(6207);
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f164078k, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f164149c != null) {
                getResources();
                float f = TabLayout.this.f164075h;
                int i3 = this.f164154h;
                ImageView imageView = this.f164150d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f164149c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f164076i;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f164149c.getTextSize();
                int lineCount = this.f164149c.getLineCount();
                int a = C0823h.m2903a(this.f164149c);
                if ((f != textSize || (a >= 0 && i3 != a)) && (TabLayout.this.f164080m != 1 || f <= textSize || lineCount != 1 || ((layout = this.f164149c.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))))) {
                    this.f164149c.setTextSize(0, f);
                    this.f164149c.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
            MethodCollector.m26664o(6207);
        }
    }

    public C73104f getCurSelectedTab() {
        return this.f164089w;
    }

    public int getTabGravity() {
        return this.f164079l;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f164078k;
    }

    public int getTabMode() {
        return this.f164080m;
    }

    public ColorStateList getTabTextColors() {
        return this.f164074g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo115521a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f164068a.getChildCount()) {
            if (z2) {
                this.f164068a.mo115574a(i, f);
            }
            ValueAnimator valueAnimator = this.f164057F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f164057F.cancel();
            }
            scrollTo(m129057a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public final void mo115525a(C73104f fVar) {
        mo115526a(fVar, this.f164088v.isEmpty());
    }

    /* renamed from: a */
    public final void mo115526a(C73104f fVar, boolean z) {
        m129062a(fVar, this.f164088v.size(), z);
    }

    /* renamed from: a */
    public final C73104f mo115520a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f164088v.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo115523a(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f164058G;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.f164059H) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f164058G = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f164059H == null) {
                this.f164059H = new C73100d();
            }
            pagerAdapter.registerDataSetObserver(this.f164059H);
        }
        mo115537c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo115527a(boolean z) {
        for (int i = 0; i < this.f164068a.getChildCount(); i++) {
            View childAt = this.f164068a.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m129059a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$d */
    public class C73100d extends DataSetObserver {
        static {
            Covode.recordClassIndex(85809);
        }

        public final void onChanged() {
            TabLayout.this.mo115537c();
        }

        public final void onInvalidated() {
            TabLayout.this.mo115537c();
        }

        C73100d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f */
    public static final class C73104f {

        /* renamed from: a */
        public Object f164120a;

        /* renamed from: b */
        public Drawable f164121b;

        /* renamed from: c */
        public CharSequence f164122c;

        /* renamed from: d */
        public CharSequence f164123d;

        /* renamed from: e */
        public int f164124e = -1;

        /* renamed from: f */
        public View f164125f;

        /* renamed from: g */
        TabLayout f164126g;

        /* renamed from: h */
        public C73108i f164127h;

        /* renamed from: i */
        private boolean f164128i = true;

        static {
            Covode.recordClassIndex(85813);
        }

        /* renamed from: c */
        public final C73104f mo115588c() {
            this.f164128i = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo115589d() {
            C73108i iVar = this.f164127h;
            if (iVar != null) {
                iVar.mo115597b();
            }
        }

        C73104f() {
        }

        /* renamed from: a */
        public final void mo115586a() {
            TabLayout tabLayout = this.f164126g;
            if (tabLayout != null) {
                tabLayout.mo115534b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final void mo115590e() {
            this.f164126g = null;
            this.f164127h = null;
            this.f164120a = null;
            this.f164121b = null;
            this.f164122c = null;
            this.f164123d = null;
            this.f164124e = -1;
            this.f164125f = null;
        }

        /* renamed from: b */
        public final boolean mo115587b() {
            TabLayout tabLayout = this.f164126g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if ((this.f164128i || this.f164124e != -1) && tabLayout.getSelectedTabPosition() == this.f164124e) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        public final C73104f mo115584a(View view) {
            this.f164125f = view;
            mo115589d();
            return this;
        }

        /* renamed from: a */
        public final C73104f mo115585a(CharSequence charSequence) {
            this.f164122c = charSequence;
            mo115589d();
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$g */
    public static class C73105g implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        private final WeakReference<TabLayout> f164129a;

        /* renamed from: b */
        private int f164130b;

        /* renamed from: c */
        private int f164131c;

        /* renamed from: d */
        private int f164132d;

        /* renamed from: e */
        private int f164133e;

        /* renamed from: f */
        private ArgbEvaluator f164134f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f164135g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f164136h = new DecelerateInterpolator(1.6f);

        static {
            Covode.recordClassIndex(85814);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo115591a() {
            this.f164131c = 0;
            this.f164130b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f164130b = this.f164131c;
            this.f164131c = i;
        }

        public C73105g(TabLayout tabLayout) {
            this.f164129a = new WeakReference<>(tabLayout);
            this.f164133e = tabLayout.getTabTextColors().getColorForState(TabLayout.SELECTED_STATE_SET, 0);
            this.f164132d = tabLayout.getTabTextColors().getDefaultColor();
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = this.f164129a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f164131c;
                if (i2 == 0 || (i2 == 2 && this.f164130b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo115535b(tabLayout.mo115520a(i), z);
            }
        }

        /* renamed from: a */
        private static void m129114a(ImageView imageView, TextView textView, int i) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i);
                imageView.setImageAlpha(Color.alpha(i));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r6 == 2) goto L_0x0018;
         */
        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageScrolled(int r13, float r14, int r15) {
            /*
            // Method dump skipped, instructions count: 256
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C73105g.onPageScrolled(int, float, int):void");
        }
    }

    public int getTabCount() {
        return this.f164088v.size();
    }

    static {
        Covode.recordClassIndex(85804);
    }

    /* renamed from: f */
    private LinearLayout.LayoutParams mo121356f() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m129059a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        C73101e eVar = this.f164068a;
        return ((float) eVar.f164097a) + eVar.f164098b;
    }

    private int getTabMinWidth() {
        int i = this.f164091y;
        if (i != -1) {
            return i;
        }
        if (this.f164080m == 0) {
            return this.f164052A;
        }
        return 0;
    }

    public int getSelectedTabPosition() {
        C73104f fVar = this.f164089w;
        if (fVar != null) {
            return fVar.f164124e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f164061J) {
            setupWithViewPager(null);
            this.f164061J = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f164068a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: d */
    public final void mo115539d() {
        if (this.f164089w != null) {
            this.f164068a.mo115574a(-1, 0.0f);
            m129076g(this.f164089w);
            this.f164089w = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f164082o == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m129060a((ViewPager) parent, true);
            }
        }
    }

    /* renamed from: g */
    private void m129074g() {
        if (this.f164057F == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f164057F = valueAnimator;
            valueAnimator.setInterpolator(C73110a.f164157b);
            this.f164057F.setDuration(300L);
            this.f164057F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C730961 */

                static {
                    Covode.recordClassIndex(85805);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.f164088v.size();
        for (int i = 0; i < size; i++) {
            C73104f fVar = this.f164088v.get(i);
            if (!(fVar == null || fVar.f164121b == null || TextUtils.isEmpty(fVar.f164122c))) {
                return 72;
            }
        }
        return 48;
    }

    /* renamed from: h */
    private void m129077h() {
        int i;
        if (this.f164080m == 0) {
            i = Math.max(0, this.f164053B - this.f164069b);
        } else {
            i = 0;
        }
        C0792v.m2741a(this.f164068a, i, 0, 0, 0);
        int i2 = this.f164080m;
        if (i2 == 0) {
            this.f164068a.setGravity(8388611);
        } else if (i2 == 1) {
            this.f164068a.setGravity(1);
        }
        mo115527a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e */
    public class C73101e extends LinearLayout {

        /* renamed from: a */
        int f164097a = -1;

        /* renamed from: b */
        float f164098b;

        /* renamed from: c */
        float f164099c;

        /* renamed from: d */
        float f164100d;

        /* renamed from: e */
        public float f164101e;

        /* renamed from: f */
        public float f164102f;

        /* renamed from: g */
        public boolean f164103g;

        /* renamed from: i */
        private int f164105i;

        /* renamed from: j */
        private final Paint f164106j;

        /* renamed from: k */
        private int f164107k = -1;

        /* renamed from: l */
        private int f164108l = -1;

        /* renamed from: m */
        private int f164109m = -1;

        /* renamed from: n */
        private ValueAnimator f164110n;

        /* renamed from: o */
        private int f164111o;

        /* renamed from: p */
        private int f164112p;

        static {
            Covode.recordClassIndex(85810);
        }

        /* renamed from: a */
        private void m129101a() {
            int i;
            int i2;
            View childAt = getChildAt(this.f164097a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f164098b > 0.0f && this.f164097a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f164097a + 1);
                    float f = this.f164098b;
                    i = (int) ((this.f164098b * ((float) childAt2.getLeft())) + ((1.0f - f) * ((float) i)));
                    i2 = (int) ((f * ((float) childAt2.getRight())) + ((1.0f - this.f164098b) * ((float) i2)));
                }
            }
            mo115575a(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo115576b(int i) {
            if (this.f164105i != i) {
                this.f164105i = i;
                C0792v.m2764c(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo115573a(int i) {
            if (this.f164106j.getColor() != i) {
                this.f164106j.setColor(i);
                C0792v.m2764c(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f164107k != i) {
                requestLayout();
                this.f164107k = i;
            }
        }

        public final void draw(Canvas canvas) {
            View childAt;
            View findViewById;
            super.draw(canvas);
            int i = this.f164108l;
            if (i >= 0 && this.f164109m > i && !TabLayout.this.f164084q) {
                if (!TabLayout.this.f164085r || (childAt = getChildAt(TabLayout.this.getSelectedTabPosition())) == null || (findViewById = childAt.findViewById(R.id.c76)) == null) {
                    canvas.drawRoundRect(new RectF((float) this.f164108l, (float) (getHeight() - this.f164105i), (float) this.f164109m, (float) getHeight()), this.f164099c, this.f164100d, this.f164106j);
                    return;
                }
                if (TabLayout.this.f164082o == null || !this.f164103g) {
                    int i2 = this.f164108l;
                    float width = (float) (i2 + (((this.f164109m - i2) - findViewById.getWidth()) / 2));
                    this.f164101e = width;
                    this.f164102f = width + ((float) findViewById.getWidth());
                }
                canvas.drawRoundRect(new RectF(this.f164101e, (float) (getHeight() - this.f164105i), this.f164102f, (float) getHeight()), this.f164099c, this.f164100d, this.f164106j);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo115575a(int i, int i2) {
            if (i != this.f164108l || i2 != this.f164109m) {
                this.f164108l = i;
                this.f164109m = i2;
                C0792v.m2764c(this);
            }
        }

        C73101e(Context context) {
            super(context);
            MethodCollector.m26663i(5530);
            this.f164111o = TabLayout.this.mo115532b(27);
            this.f164112p = Integer.MAX_VALUE;
            setWillNotDraw(false);
            this.f164106j = new Paint();
            MethodCollector.m26664o(5530);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo115574a(int i, float f) {
            ValueAnimator valueAnimator = this.f164110n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f164110n.cancel();
            }
            this.f164097a = i;
            this.f164098b = f;
            m129101a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo115577b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            ValueAnimator valueAnimator = this.f164110n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f164110n.cancel();
            }
            if (C0792v.m2768e(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m129101a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f164097a) <= 1) {
                i3 = this.f164108l;
                i4 = this.f164109m;
            } else {
                int b = TabLayout.this.mo115532b(24);
                if (i >= this.f164097a ? !z : z) {
                    i3 = left - b;
                } else {
                    i3 = b + right;
                }
                i4 = i3;
            }
            if (i3 != left || i4 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f164110n = valueAnimator2;
                valueAnimator2.setInterpolator(C73110a.f164157b);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C73101e.C731021 */

                    static {
                        Covode.recordClassIndex(85811);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C73101e.this.mo115575a(C73110a.m129121a(i3, left, animatedFraction), C73110a.m129121a(i4, right, animatedFraction));
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C73101e.C731032 */

                    static {
                        Covode.recordClassIndex(85812);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C73101e.this.f164097a = i;
                        C73101e.this.f164098b = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            if (r2 != false) goto L_0x0090;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r11, int r12) {
            /*
            // Method dump skipped, instructions count: 340
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C73101e.onMeasure(int, int):void");
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            MethodCollector.m26663i(5652);
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f164110n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m129101a();
                MethodCollector.m26664o(5652);
                return;
            }
            this.f164110n.cancel();
            mo115577b(this.f164097a, Math.round((1.0f - this.f164110n.getAnimatedFraction()) * ((float) this.f164110n.getDuration())));
            MethodCollector.m26664o(5652);
        }
    }

    /* renamed from: b */
    public final void mo115533b() {
        for (int childCount = this.f164068a.getChildCount() - 1; childCount >= 0; childCount--) {
            m129072f(childCount);
        }
        Iterator<C73104f> it = this.f164088v.iterator();
        while (it.hasNext()) {
            C73104f next = it.next();
            it.remove();
            next.mo115590e();
            f164051u.release(next);
        }
        this.f164089w = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo115537c() {
        int currentItem;
        if (this.f164066O) {
            mo115533b();
            PagerAdapter pagerAdapter = this.f164058G;
            if (pagerAdapter != null) {
                int count = pagerAdapter.getCount();
                m129068e(count);
                for (int i = 0; i < count; i++) {
                    mo115526a(mo115519a().mo115585a(this.f164058G.getPageTitle(i)), false);
                }
                ViewPager viewPager = this.f164082o;
                if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo115535b(mo115520a(currentItem), true);
                }
            }
        }
    }

    /* renamed from: a */
    public final C73104f mo115519a() {
        C73104f acquire = f164051u.acquire();
        if (acquire == null) {
            acquire = new C73104f();
        }
        acquire.f164126g = this;
        acquire.f164127h = m129066d(acquire);
        return acquire;
    }

    public void addView(View view) {
        m129058a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f164081n = z;
    }

    public void setDefaultAddTab(boolean z) {
        this.f164066O = z;
    }

    public void setHideIndicatorView(boolean z) {
        this.f164084q = z;
    }

    public void setOnTabClickListener(AbstractC73098b bVar) {
        this.f164086s = bVar;
    }

    public void setSupportCustomIndicator(boolean z) {
        this.f164085r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$a */
    public class C73097a implements ViewPager.AbstractC1578d {

        /* renamed from: a */
        public boolean f164094a;

        static {
            Covode.recordClassIndex(85806);
        }

        C73097a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1578d
        /* renamed from: a */
        public final void mo5326a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.f164082o == viewPager) {
                TabLayout.this.mo115523a(pagerAdapter2, this.f164094a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h */
    public static class C73106h implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final boolean f164137a;

        /* renamed from: b */
        private final WeakReference<TabLayout> f164138b;

        /* renamed from: c */
        private int f164139c;

        /* renamed from: d */
        private int f164140d;

        /* renamed from: e */
        private int f164141e;

        static {
            Covode.recordClassIndex(85815);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f164139c = this.f164140d;
            this.f164140d = i;
        }

        public C73106h(TabLayout tabLayout) {
            this.f164138b = new WeakReference<>(tabLayout);
            this.f164137a = C0792v.m2768e(tabLayout) != 1 ? false : true;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = this.f164138b.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f164140d;
                if (i2 == 0 || (i2 == 2 && this.f164139c == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo115535b(tabLayout.mo115520a(i), z);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r3 == 2) goto L_0x001e;
         */
        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageScrolled(final int r9, float r10, int r11) {
            /*
                r8 = this;
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout> r0 = r8.f164138b
                java.lang.Object r5 = r0.get()
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r5 = (com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout) r5
                int r0 = r8.f164141e
                r4 = r9
                if (r0 != r4) goto L_0x000e
                return
            L_0x000e:
                if (r5 == 0) goto L_0x004f
                int r3 = r8.f164140d
                r0 = 0
                r2 = 1
                r1 = 2
                if (r3 != r1) goto L_0x001b
                int r0 = r8.f164139c
                if (r0 != r2) goto L_0x0052
            L_0x001b:
                r6 = 1
                if (r3 != r1) goto L_0x0022
            L_0x001e:
                int r0 = r8.f164139c
                if (r0 == 0) goto L_0x0050
            L_0x0022:
                r7 = 1
            L_0x0023:
                float[] r0 = new float[r1]
                r0 = {x0054: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
                android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
                r0 = 200(0xc8, double:9.9E-322)
                android.animation.ValueAnimator r0 = r2.setDuration(r0)
                int r3 = r8.f164141e
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.c r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.c
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.addUpdateListener(r1)
                r8.f164141e = r4
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h$1 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h$1
                r2 = r2
                r3 = r5
                r4 = r4
                r5 = r6
                r6 = r7
                r1.<init>(r3, r4, r5, r6)
                r0.addListener(r1)
                r0.start()
            L_0x004f:
                return
            L_0x0050:
                r7 = 0
                goto L_0x0023
            L_0x0052:
                r6 = 0
                goto L_0x001e
                fill-array 0x0054: FILL_ARRAY_DATA  , data: [0, 1065353216]
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C73106h.onPageScrolled(int, float, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$j */
    public static class C73109j implements AbstractC73099c {

        /* renamed from: a */
        private final ViewPager f164155a;

        static {
            Covode.recordClassIndex(85818);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: b */
        public final void mo86254b(C73104f fVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: c */
        public final void mo86255c(C73104f fVar) {
        }

        public C73109j(ViewPager viewPager) {
            this.f164155a = viewPager;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: a */
        public final void mo86253a(C73104f fVar) {
            this.f164155a.setCurrentItem(fVar.f164124e);
        }
    }

    /* renamed from: b */
    private void m129065b(AbstractC73099c cVar) {
        this.f164055D.remove(cVar);
    }

    /* renamed from: d */
    private void m129067d(int i) {
        mo115521a(i, 0.0f, true, true);
    }

    /* renamed from: c */
    public final View mo115536c(int i) {
        return this.f164068a.getChildAt(i);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f164068a.mo115573a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f164068a.mo115576b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo115523a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m129060a(viewPager, false);
    }

    /* renamed from: e */
    private void m129069e(C73104f fVar) {
        this.f164068a.addView(fVar.f164127h, fVar.f164124e, mo121356f());
    }

    /* renamed from: a */
    public void mo115524a(AbstractC73099c cVar) {
        if (!this.f164055D.contains(cVar)) {
            this.f164055D.add(cVar);
        }
    }

    /* renamed from: b */
    public final void mo115534b(C73104f fVar) {
        mo115535b(fVar, true);
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setOnTabSelectedListener(AbstractC73099c cVar) {
        AbstractC73099c cVar2 = this.f164054C;
        if (cVar2 != null) {
            m129065b(cVar2);
        }
        this.f164054C = cVar;
        if (cVar != null) {
            mo115524a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m129074g();
        this.f164057F.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f164079l != i) {
            this.f164079l = i;
            m129077h();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f164080m) {
            this.f164080m = i;
            m129077h();
        }
    }

    public void setTabStripLeftMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f164068a.getLayoutParams();
        layoutParams.leftMargin = i;
        this.f164068a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m129058a(View view) {
        if (view instanceof C73111b) {
            m129063a((C73111b) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: e */
    private void m129068e(int i) {
        if (!this.f164064M) {
            return;
        }
        if (i > this.f164065N) {
            setTabMode(0);
        } else {
            setTabMode(1);
        }
    }

    /* renamed from: f */
    private void m129072f(int i) {
        C73108i iVar = (C73108i) this.f164068a.getChildAt(i);
        this.f164068a.removeViewAt(i);
        if (iVar != null) {
            iVar.mo115596a();
            this.f164067P.release(iVar);
        }
        requestLayout();
    }

    /* renamed from: g */
    private void m129076g(C73104f fVar) {
        for (int size = this.f164055D.size() - 1; size >= 0; size--) {
            this.f164055D.get(size).mo86254b(fVar);
        }
    }

    /* renamed from: h */
    private void m129078h(C73104f fVar) {
        for (int size = this.f164055D.size() - 1; size >= 0; size--) {
            this.f164055D.get(size).mo86255c(fVar);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f164068a.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f164068a.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public void setSelectedTabIndicatorCornerRadius(float f) {
        C73101e eVar = this.f164068a;
        if (f >= 0.0f && f >= 0.0f) {
            if (eVar.f164099c != f || eVar.f164100d != f) {
                eVar.f164099c = f;
                eVar.f164100d = f;
                C0792v.m2764c(eVar);
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f164074g != colorStateList) {
            this.f164074g = colorStateList;
            int size = this.f164088v.size();
            for (int i = 0; i < size; i++) {
                this.f164088v.get(i).mo115589d();
            }
        }
    }

    /* renamed from: a */
    private void m129059a(LinearLayout.LayoutParams layoutParams) {
        if (this.f164080m == 1 && this.f164079l == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.f164090x;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = this.f164090x;
        }
    }

    /* renamed from: d */
    private C73108i m129066d(C73104f fVar) {
        C73108i iVar;
        C0693f.AbstractC0694a<C73108i> aVar = this.f164067P;
        if (aVar == null || (iVar = aVar.acquire()) == null) {
            iVar = new C73108i(getContext());
        }
        iVar.setTab(fVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        return iVar;
    }

    /* renamed from: f */
    private void m129073f(C73104f fVar) {
        for (int size = this.f164055D.size() - 1; size >= 0; size--) {
            this.f164055D.get(size).mo86253a(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo115532b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: c */
    public final void mo115538c(C73104f fVar) {
        int i;
        C73104f fVar2 = this.f164089w;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.f164124e;
            } else {
                i = -1;
            }
            if ((fVar2 == null || fVar2.f164124e == -1) && i != -1) {
                m129067d(i);
            } else {
                m129075g(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
            if (fVar2 != null) {
                m129076g(fVar2);
            }
            this.f164089w = fVar;
            if (fVar != null) {
                m129073f(fVar);
            }
        } else if (fVar2 != null) {
            m129078h(fVar);
            smoothScrollTo(m129057a(fVar.f164124e, 0.0f), 0);
        }
    }

    public void setTabMargin(int i) {
        this.f164090x = mo115532b(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f164068a.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo115532b(i);
            marginLayoutParams.rightMargin = mo115532b(i);
            childAt.setLayoutParams(marginLayoutParams);
            childAt.invalidate();
        }
    }

    /* renamed from: g */
    private void m129075g(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C0792v.m2788v(this)) {
                C73101e eVar = this.f164068a;
                int childCount = eVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (eVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int a = m129057a(i, 0.0f);
                if (scrollX != a) {
                    m129074g();
                    this.f164057F.setIntValues(scrollX, a);
                    this.f164057F.start();
                }
                this.f164068a.mo115577b(i, 300);
                return;
            }
            m129067d(i);
        }
    }

    /* renamed from: a */
    private void m129063a(C73111b bVar) {
        C73104f a = mo115519a();
        if (bVar.f164161a != null) {
            a.mo115585a(bVar.f164161a);
        }
        if (bVar.f164162b != null) {
            a.f164121b = bVar.f164162b;
            a.mo115589d();
        }
        if (bVar.f164163c != 0) {
            a.mo115584a(C1764a.m5927a(LayoutInflater.from(a.f164127h.getContext()), bVar.f164163c, a.f164127h, false));
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            a.f164123d = bVar.getContentDescription();
            a.mo115589d();
        }
        mo115525a(a);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo115522a(int i, int i2) {
        setTabTextColors(m129064b(i, i2));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m129058a(view);
    }

    /* renamed from: b */
    private static ColorStateList m129064b(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m129058a(view);
    }

    /* renamed from: a */
    private int m129057a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f164080m != 0) {
            return 0;
        }
        View childAt = this.f164068a.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f164068a.getChildCount()) {
            view = this.f164068a.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3 + (this.f164090x * 4))) * 0.5f * f);
        if (C0792v.m2768e(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* renamed from: a */
    private void m129060a(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.f164082o;
        if (viewPager2 != null) {
            C73105g gVar = this.f164083p;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            C73097a aVar = this.f164060I;
            if (aVar != null) {
                this.f164082o.removeOnAdapterChangeListener(aVar);
            }
        }
        AbstractC73099c cVar = this.f164056E;
        if (cVar != null) {
            m129065b(cVar);
            this.f164056E = null;
        }
        if (viewPager != null) {
            this.f164082o = viewPager;
            if (this.f164083p == null) {
                this.f164083p = new C73105g(this);
            }
            this.f164083p.mo115591a();
            viewPager.addOnPageChangeListener(this.f164083p);
            C73109j jVar = new C73109j(viewPager);
            this.f164056E = jVar;
            mo115524a(jVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo115523a(adapter, true);
            }
            if (this.f164060I == null) {
                this.f164060I = new C73097a();
            }
            this.f164060I.f164094a = true;
            viewPager.addOnAdapterChangeListener(this.f164060I);
            m129067d(viewPager.getCurrentItem());
        } else {
            this.f164082o = null;
            mo115523a((PagerAdapter) null, false);
        }
        this.f164061J = z;
    }

    /* renamed from: b */
    public final void mo115535b(C73104f fVar, boolean z) {
        int i;
        C73104f fVar2 = this.f164089w;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.f164124e;
            } else {
                i = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.f164124e == -1) && i != -1) {
                    m129067d(i);
                } else {
                    m129075g(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m129076g(fVar2);
            }
            this.f164089w = fVar;
            if (fVar != null) {
                m129073f(fVar);
            }
        } else if (fVar2 != null) {
            m129078h(fVar);
            m129075g(fVar.f164124e);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9447);
        int b = mo115532b(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(b, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f164092z;
            if (i3 <= 0) {
                i3 = size - mo115532b(56);
            }
            this.f164078k = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.f164080m;
            if (i4 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        MethodCollector.m26664o(9447);
    }

    /* renamed from: a */
    private void m129061a(C73104f fVar, int i) {
        fVar.f164124e = i;
        this.f164088v.add(i, fVar);
        int size = this.f164088v.size();
        while (true) {
            i++;
            if (i < size) {
                this.f164088v.get(i).f164124e = i;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m129058a(view);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9281);
        this.f164088v = new ArrayList<>();
        this.f164078k = Integer.MAX_VALUE;
        this.f164055D = new ArrayList<>();
        this.f164066O = true;
        this.f164085r = true;
        this.f164067P = new C0693f.C0695b(12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C73113d.f164170a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            C73101e eVar = new C73101e(context);
            this.f164068a = eVar;
            super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ag8, R.attr.ag9, R.attr.ag_, R.attr.aga, R.attr.agb, R.attr.agc, R.attr.agd, R.attr.age, R.attr.agf, R.attr.agg, R.attr.agh, R.attr.agj, R.attr.agk, R.attr.agl, R.attr.agm, R.attr.agn, R.attr.ago, R.attr.agp, R.attr.agq, R.attr.agr, R.attr.ags, R.attr.agt, R.attr.agv, R.attr.agw, R.attr.agx}, 0, R.style.r2);
            this.f164068a.mo115576b(obtainStyledAttributes2.getDimensionPixelSize(10, 0));
            this.f164068a.mo115573a(obtainStyledAttributes2.getColor(7, 0));
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, 0);
            this.f164072e = dimensionPixelSize;
            this.f164071d = dimensionPixelSize;
            this.f164070c = dimensionPixelSize;
            this.f164069b = dimensionPixelSize;
            this.f164069b = obtainStyledAttributes2.getDimensionPixelSize(18, dimensionPixelSize);
            this.f164070c = obtainStyledAttributes2.getDimensionPixelSize(19, this.f164070c);
            this.f164071d = obtainStyledAttributes2.getDimensionPixelSize(17, this.f164071d);
            this.f164072e = obtainStyledAttributes2.getDimensionPixelSize(16, this.f164072e);
            int resourceId = obtainStyledAttributes2.getResourceId(22, R.style.jg);
            this.f164073f = resourceId;
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk});
            try {
                this.f164075h = (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0);
                this.f164074g = obtainStyledAttributes3.getColorStateList(3);
                obtainStyledAttributes3.recycle();
                if (obtainStyledAttributes2.hasValue(23)) {
                    this.f164074g = obtainStyledAttributes2.getColorStateList(23);
                }
                if (obtainStyledAttributes2.hasValue(21)) {
                    this.f164074g = m129064b(this.f164074g.getDefaultColor(), obtainStyledAttributes2.getColor(21, 0));
                }
                this.f164091y = obtainStyledAttributes2.getDimensionPixelSize(13, -1);
                this.f164092z = obtainStyledAttributes2.getDimensionPixelSize(12, -1);
                this.f164077j = obtainStyledAttributes2.getResourceId(0, 0);
                this.f164053B = obtainStyledAttributes2.getDimensionPixelSize(1, 0);
                this.f164080m = obtainStyledAttributes2.getInt(14, 1);
                this.f164079l = obtainStyledAttributes2.getInt(2, 0);
                obtainStyledAttributes2.recycle();
                Resources resources = getResources();
                this.f164076i = (float) resources.getDimensionPixelSize(R.dimen.ib);
                this.f164052A = resources.getDimensionPixelSize(R.dimen.i_);
                this.f164062K = C84912r.m145930a(getContext(), 1.5f);
                this.f164063L = C84912r.m145930a(getContext(), 1.5f);
                this.f164087t = getResources().getConfiguration().orientation;
                m129077h();
                MethodCollector.m26664o(9281);
            } catch (Throwable th) {
                obtainStyledAttributes3.recycle();
                MethodCollector.m26664o(9281);
                throw th;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
            MethodCollector.m26664o(9281);
            throw illegalArgumentException;
        }
    }

    /* renamed from: a */
    private void m129062a(C73104f fVar, int i, boolean z) {
        if (fVar.f164126g == this) {
            m129061a(fVar, i);
            m129069e(fVar);
            if (z) {
                fVar.mo115586a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }
}
