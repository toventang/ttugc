package com.bytedance.android.livesdk.rank.impl.p619ui.tablayout;

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
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0211a;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.widget.C0409an;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.C0789s;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.AbstractC1575a
/* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout */
public class LiveTabLayout extends HorizontalScrollView {

    /* renamed from: N */
    private static final int[] f25402N = {R.attr.oj};

    /* renamed from: a */
    public static final Interpolator f25403a = new C0995b();

    /* renamed from: u */
    private static final C0693f.AbstractC0694a<C10562f> f25404u = new C0693f.C0696c(16);

    /* renamed from: A */
    private final int f25405A;

    /* renamed from: B */
    private int f25406B;

    /* renamed from: C */
    private AbstractC10557c f25407C;

    /* renamed from: D */
    private final ArrayList<AbstractC10557c> f25408D;

    /* renamed from: E */
    private AbstractC10557c f25409E;

    /* renamed from: F */
    private ValueAnimator f25410F;

    /* renamed from: G */
    private PagerAdapter f25411G;

    /* renamed from: H */
    private DataSetObserver f25412H;

    /* renamed from: I */
    private C10555a f25413I;

    /* renamed from: J */
    private boolean f25414J;

    /* renamed from: K */
    private float f25415K;

    /* renamed from: L */
    private float f25416L;

    /* renamed from: M */
    private final C0693f.AbstractC0694a<C10564h> f25417M;

    /* renamed from: b */
    public final C10559e f25418b;

    /* renamed from: c */
    int f25419c;

    /* renamed from: d */
    int f25420d;

    /* renamed from: e */
    int f25421e;

    /* renamed from: f */
    int f25422f;

    /* renamed from: g */
    int f25423g;

    /* renamed from: h */
    ColorStateList f25424h;

    /* renamed from: i */
    float f25425i;

    /* renamed from: j */
    float f25426j;

    /* renamed from: k */
    int f25427k;

    /* renamed from: l */
    int f25428l;

    /* renamed from: m */
    int f25429m;

    /* renamed from: n */
    int f25430n;

    /* renamed from: o */
    int f25431o;

    /* renamed from: p */
    boolean f25432p;

    /* renamed from: q */
    ViewPager f25433q;

    /* renamed from: r */
    C10563g f25434r;

    /* renamed from: s */
    public AbstractC10556b f25435s;

    /* renamed from: t */
    public int f25436t;

    /* renamed from: v */
    private final ArrayList<C10562f> f25437v;

    /* renamed from: w */
    private C10562f f25438w;

    /* renamed from: x */
    private int f25439x;

    /* renamed from: y */
    private int f25440y;

    /* renamed from: z */
    private int f25441z;

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$b */
    public interface AbstractC10556b {
        static {
            Covode.recordClassIndex(12135);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$c */
    public interface AbstractC10557c {
        static {
            Covode.recordClassIndex(12136);
        }

        /* renamed from: a */
        void mo17450a(C10562f fVar);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$h */
    public class C10564h extends LinearLayout {

        /* renamed from: b */
        private C10562f f25486b;

        /* renamed from: c */
        private TextView f25487c;

        /* renamed from: d */
        private ImageView f25488d;

        /* renamed from: e */
        private View f25489e;

        /* renamed from: f */
        private TextView f25490f;

        /* renamed from: g */
        private ImageView f25491g;

        /* renamed from: h */
        private int f25492h = 2;

        static {
            Covode.recordClassIndex(12143);
        }

        public final TextView getCustomTextView() {
            return this.f25490f;
        }

        public final C10562f getTab() {
            return this.f25486b;
        }

        public final TextView getTextView() {
            return this.f25487c;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f25486b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (LiveTabLayout.this.f25435s == null) {
                this.f25486b.mo17466a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo17470a() {
            View view;
            MethodCollector.m26663i(2156);
            C10562f fVar = this.f25486b;
            if (fVar == null || (view = fVar.f25473f) == null) {
                View view2 = this.f25489e;
                if (view2 != null) {
                    removeView(view2);
                    this.f25489e = null;
                }
                this.f25490f = null;
                this.f25491g = null;
            } else {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f25489e = view;
                TextView textView = this.f25487c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f25488d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f25488d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f25490f = textView2;
                if (textView2 != null) {
                    this.f25492h = C0823h.m2903a(textView2);
                }
                this.f25491g = (ImageView) view.findViewById(16908294);
            }
            boolean z = false;
            if (this.f25489e == null) {
                if (this.f25488d == null) {
                    ImageView imageView2 = (ImageView) C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.vm, this, false);
                    addView(imageView2, 0);
                    this.f25488d = imageView2;
                }
                if (this.f25487c == null) {
                    TextView textView3 = (TextView) C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.vn, this, false);
                    addView(textView3);
                    this.f25487c = textView3;
                    this.f25492h = C0823h.m2903a(textView3);
                }
                C0823h.m2907a(this.f25487c, LiveTabLayout.this.f25423g);
                if (LiveTabLayout.this.f25424h != null) {
                    this.f25487c.setTextColor(LiveTabLayout.this.f25424h);
                }
                m19147a(this.f25487c, this.f25488d);
            } else {
                TextView textView4 = this.f25490f;
                if (!(textView4 == null && this.f25491g == null)) {
                    m19147a(textView4, this.f25491g);
                }
            }
            if (fVar != null && fVar.mo17467b()) {
                z = true;
            }
            setSelected(z);
            MethodCollector.m26664o(2156);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo17471a(C10562f fVar) {
            if (fVar != this.f25486b) {
                this.f25486b = fVar;
            }
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
        public final void setTab(C10562f fVar) {
            if (fVar != this.f25486b) {
                this.f25486b = fVar;
                mo17470a();
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
            TextView textView = this.f25487c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f25488d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f25489e;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public C10564h(Context context) {
            super(context);
            MethodCollector.m26663i(1123);
            if (LiveTabLayout.this.f25427k != 0) {
                C0792v.m2746a(this, C0196a.m619b(context, LiveTabLayout.this.f25427k));
            }
            C0792v.m2741a(this, LiveTabLayout.this.f25419c, LiveTabLayout.this.f25420d, LiveTabLayout.this.f25421e, LiveTabLayout.this.f25422f);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0792v.m2749a(this, C0789s.m2732a(getContext()));
            MethodCollector.m26664o(1123);
        }

        /* renamed from: a */
        private void m19147a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            C10562f fVar = this.f25486b;
            CharSequence charSequence3 = null;
            if (fVar != null) {
                drawable = fVar.f25469b;
            } else {
                drawable = null;
            }
            C10562f fVar2 = this.f25486b;
            if (fVar2 != null) {
                charSequence = fVar2.f25470c;
            } else {
                charSequence = null;
            }
            C10562f fVar3 = this.f25486b;
            if (fVar3 != null) {
                charSequence2 = fVar3.f25471d;
            } else {
                charSequence2 = null;
            }
            int i = 0;
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence2);
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = LiveTabLayout.this.mo17410b(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            C0409an.m1520a(this, charSequence3);
        }

        public final void onMeasure(int i, int i2) {
            Layout layout;
            MethodCollector.m26663i(1839);
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = LiveTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(LiveTabLayout.this.f25428l, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f25487c != null) {
                getResources();
                float f = LiveTabLayout.this.f25425i;
                int i3 = this.f25492h;
                ImageView imageView = this.f25488d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f25487c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = LiveTabLayout.this.f25426j;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f25487c.getTextSize();
                int lineCount = this.f25487c.getLineCount();
                int a = C0823h.m2903a(this.f25487c);
                if ((f != textSize || (a >= 0 && i3 != a)) && (LiveTabLayout.this.f25430n != 1 || f <= textSize || lineCount != 1 || ((layout = this.f25487c.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))))) {
                    this.f25487c.setTextSize(0, f);
                    this.f25487c.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
            MethodCollector.m26664o(1839);
        }
    }

    public int getTabGravity() {
        return this.f25429m;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f25428l;
    }

    public int getTabMode() {
        return this.f25430n;
    }

    public ColorStateList getTabTextColors() {
        return this.f25424h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17401a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f25418b.getChildCount()) {
            if (z2) {
                this.f25418b.mo17454a(i, f);
            }
            ValueAnimator valueAnimator = this.f25410F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f25410F.cancel();
            }
            scrollTo(m19102a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17402a(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f25411G;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.f25412H) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f25411G = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f25412H == null) {
                this.f25412H = new C10558d();
            }
            pagerAdapter.registerDataSetObserver(this.f25412H);
        }
        mo17400a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17404a(C10562f fVar, boolean z) {
        C10562f fVar2 = this.f25438w;
        if (fVar2 != fVar) {
            int i = fVar != null ? fVar.f25472e : -1;
            if (z) {
                if ((fVar2 == null || fVar2.f25472e == -1) && i != -1) {
                    m19114c(i);
                } else {
                    m19118e(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m19119f();
            }
            this.f25438w = fVar;
            if (fVar != null) {
                m19110b(fVar);
            }
        } else if (fVar2 != null) {
            m19120g();
            m19118e(fVar.f25472e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17405a(boolean z) {
        for (int i = 0; i < this.f25418b.getChildCount(); i++) {
            View childAt = this.f25418b.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m19104a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$d */
    public class C10558d extends DataSetObserver {
        static {
            Covode.recordClassIndex(12137);
        }

        public final void onChanged() {
            LiveTabLayout.this.mo17400a();
        }

        public final void onInvalidated() {
            LiveTabLayout.this.mo17400a();
        }

        C10558d() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$f */
    public static final class C10562f {

        /* renamed from: a */
        public Object f25468a;

        /* renamed from: b */
        public Drawable f25469b;

        /* renamed from: c */
        public CharSequence f25470c;

        /* renamed from: d */
        public CharSequence f25471d;

        /* renamed from: e */
        public int f25472e = -1;

        /* renamed from: f */
        public View f25473f;

        /* renamed from: g */
        int f25474g = -1;

        /* renamed from: h */
        LiveTabLayout f25475h;

        /* renamed from: i */
        public C10564h f25476i;

        static {
            Covode.recordClassIndex(12141);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo17468c() {
            C10564h hVar = this.f25476i;
            if (hVar != null) {
                hVar.mo17470a();
            }
        }

        C10562f() {
        }

        /* renamed from: a */
        public final void mo17466a() {
            LiveTabLayout liveTabLayout = this.f25475h;
            if (liveTabLayout != null) {
                liveTabLayout.mo17403a(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: b */
        public final boolean mo17467b() {
            LiveTabLayout liveTabLayout = this.f25475h;
            if (liveTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (liveTabLayout.getSelectedTabPosition() == this.f25472e) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        private C10562f m19139a(View view) {
            this.f25473f = view;
            mo17468c();
            return this;
        }

        /* renamed from: a */
        public final C10562f mo17465a(CharSequence charSequence) {
            this.f25470c = charSequence;
            mo17468c();
            return this;
        }

        /* renamed from: a */
        public final C10562f mo17464a(int i) {
            if (this.f25474g == i && this.f25473f != null) {
                return this;
            }
            this.f25474g = i;
            return m19139a(C1764a.m5927a(LayoutInflater.from(this.f25476i.getContext()), i, this.f25476i, false));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$g */
    public static class C10563g implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        private final WeakReference<LiveTabLayout> f25477a;

        /* renamed from: b */
        private int f25478b;

        /* renamed from: c */
        private int f25479c;

        /* renamed from: d */
        private int f25480d;

        /* renamed from: e */
        private int f25481e;

        /* renamed from: f */
        private ArgbEvaluator f25482f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f25483g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f25484h = new DecelerateInterpolator(1.6f);

        static {
            Covode.recordClassIndex(12142);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo17469a() {
            this.f25478b = 0;
            this.f25479c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f25478b = this.f25479c;
            this.f25479c = i;
        }

        public C10563g(LiveTabLayout liveTabLayout) {
            this.f25477a = new WeakReference<>(liveTabLayout);
            this.f25481e = liveTabLayout.getTabTextColors().getColorForState(LiveTabLayout.SELECTED_STATE_SET, 0);
            this.f25480d = liveTabLayout.getTabTextColors().getDefaultColor();
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            boolean z;
            LiveTabLayout liveTabLayout = this.f25477a.get();
            if (liveTabLayout != null && liveTabLayout.getSelectedTabPosition() != i && i < liveTabLayout.getTabCount()) {
                int i2 = this.f25479c;
                if (i2 == 0 || (i2 == 2 && this.f25478b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                liveTabLayout.mo17404a(liveTabLayout.mo17399a(i), z);
            }
        }

        /* renamed from: a */
        private static void m19145a(ImageView imageView, TextView textView, int i) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.p619ui.tablayout.LiveTabLayout.C10563g.onPageScrolled(int, float, int):void");
        }
    }

    public int getTabCount() {
        return this.f25437v.size();
    }

    public int getTabStripLeftPadding() {
        return this.f25418b.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.f25418b.getPaddingRight();
    }

    private float getScrollPosition() {
        C10559e eVar = this.f25418b;
        return ((float) eVar.f25446a) + eVar.f25447b;
    }

    private int getTabMinWidth() {
        int i = this.f25440y;
        if (i != -1) {
            return i;
        }
        if (this.f25430n == 0) {
            return this.f25405A;
        }
        return 0;
    }

    public int getSelectedTabPosition() {
        C10562f fVar = this.f25438w;
        if (fVar != null) {
            return fVar.f25472e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f25414J) {
            setupWithViewPager(null);
            this.f25414J = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m19119f() {
        for (int size = this.f25408D.size() - 1; size >= 0; size--) {
            this.f25408D.get(size);
        }
    }

    /* renamed from: g */
    private void m19120g() {
        for (int size = this.f25408D.size() - 1; size >= 0; size--) {
            this.f25408D.get(size);
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f25418b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25433q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m19105a((ViewPager) parent, true);
            }
        }
    }

    static {
        Covode.recordClassIndex(12132);
    }

    /* renamed from: e */
    private void m19117e() {
        if (this.f25410F == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f25410F = valueAnimator;
            valueAnimator.setInterpolator(f25403a);
            this.f25410F.setDuration(200L);
            this.f25410F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.android.livesdk.rank.impl.p619ui.tablayout.LiveTabLayout.C105541 */

                static {
                    Covode.recordClassIndex(12133);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LiveTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.f25437v.size();
        for (int i = 0; i < size; i++) {
            C10562f fVar = this.f25437v.get(i);
            if (!(fVar == null || fVar.f25469b == null || TextUtils.isEmpty(fVar.f25470c))) {
                return 72;
            }
        }
        return 48;
    }

    /* renamed from: h */
    private void m19121h() {
        int i;
        if (this.f25430n == 0) {
            i = Math.max(0, this.f25406B - this.f25419c);
        } else {
            i = 0;
        }
        C0792v.m2741a(this.f25418b, i, 0, 0, 0);
        int i2 = this.f25430n;
        if (i2 == 0) {
            this.f25418b.setGravity(8388611);
        } else if (i2 == 1) {
            this.f25418b.setGravity(1);
        }
        mo17405a(true);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$e */
    public class C10559e extends LinearLayout {

        /* renamed from: a */
        int f25446a = -1;

        /* renamed from: b */
        float f25447b;

        /* renamed from: c */
        public float f25448c;

        /* renamed from: d */
        public float f25449d;

        /* renamed from: e */
        public boolean f25450e;

        /* renamed from: f */
        int f25451f;

        /* renamed from: h */
        private int f25453h;

        /* renamed from: i */
        private final Paint f25454i;

        /* renamed from: j */
        private int f25455j = -1;

        /* renamed from: k */
        private int f25456k = -1;

        /* renamed from: l */
        private int f25457l = -1;

        /* renamed from: m */
        private ValueAnimator f25458m;

        /* renamed from: n */
        private int f25459n;

        /* renamed from: o */
        private int f25460o;

        static {
            Covode.recordClassIndex(12138);
        }

        /* renamed from: a */
        private void m19133a() {
            int i;
            View childAt = getChildAt(this.f25446a);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f25447b > 0.0f && this.f25446a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f25446a + 1);
                    float f = this.f25447b;
                    i2 = (int) ((this.f25447b * ((float) childAt2.getLeft())) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((f * ((float) childAt2.getRight())) + ((1.0f - this.f25447b) * ((float) i)));
                }
            }
            mo17455a(i2, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo17456b(int i) {
            if (this.f25453h != i) {
                this.f25453h = i;
                C0792v.m2764c(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo17453a(int i) {
            if (this.f25454i.getColor() != i) {
                this.f25454i.setColor(i);
                C0792v.m2764c(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f25455j != i) {
                requestLayout();
                this.f25455j = i;
            }
        }

        public final void draw(Canvas canvas) {
            View findViewById;
            super.draw(canvas);
            int i = this.f25456k;
            if (i >= 0 && this.f25457l > i) {
                View childAt = getChildAt(LiveTabLayout.this.getSelectedTabPosition());
                if (childAt == null || (findViewById = childAt.findViewById(R.id.c76)) == null) {
                    canvas.drawRect((float) (this.f25456k + this.f25451f), (float) (getHeight() - this.f25453h), (float) (this.f25457l - this.f25451f), (float) getHeight(), this.f25454i);
                    return;
                }
                if (LiveTabLayout.this.f25433q == null || !this.f25450e) {
                    int i2 = this.f25456k;
                    float width = (float) (i2 + (((this.f25457l - i2) - findViewById.getWidth()) / 2));
                    this.f25448c = width;
                    this.f25449d = width + ((float) findViewById.getWidth());
                }
                canvas.drawRect(this.f25448c + ((float) this.f25451f), (float) (getHeight() - this.f25453h), this.f25449d - ((float) this.f25451f), (float) getHeight(), this.f25454i);
            }
        }

        C10559e(Context context) {
            super(context);
            MethodCollector.m26663i(1040);
            this.f25459n = LiveTabLayout.this.mo17410b(27);
            this.f25460o = Integer.MAX_VALUE;
            setWillNotDraw(false);
            this.f25454i = new Paint();
            MethodCollector.m26664o(1040);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo17454a(int i, float f) {
            ValueAnimator valueAnimator = this.f25458m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f25458m.cancel();
            }
            this.f25446a = i;
            this.f25447b = f;
            m19133a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo17455a(int i, int i2) {
            if (i != this.f25456k || i2 != this.f25457l) {
                this.f25456k = i;
                this.f25457l = i2;
                C0792v.m2764c(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo17457b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            ValueAnimator valueAnimator = this.f25458m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f25458m.cancel();
            }
            if (C0792v.m2768e(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m19133a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f25446a) <= 1) {
                i3 = this.f25456k;
                i4 = this.f25457l;
            } else {
                int b = LiveTabLayout.this.mo17410b(24);
                if (i >= this.f25446a ? !z : z) {
                    i3 = left - b;
                } else {
                    i3 = b + right;
                }
                i4 = i3;
            }
            if (i3 != left || i4 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f25458m = valueAnimator2;
                valueAnimator2.setInterpolator(LiveTabLayout.f25403a);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.android.livesdk.rank.impl.p619ui.tablayout.LiveTabLayout.C10559e.C105601 */

                    static {
                        Covode.recordClassIndex(12139);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C10559e.this.mo17455a(C10559e.m19132a(i3, left, animatedFraction), C10559e.m19132a(i4, right, animatedFraction));
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.rank.impl.p619ui.tablayout.LiveTabLayout.C10559e.C105612 */

                    static {
                        Covode.recordClassIndex(12140);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C10559e.this.f25446a = i;
                        C10559e.this.f25447b = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            if (r5 != false) goto L_0x0090;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r10, int r11) {
            /*
            // Method dump skipped, instructions count: 324
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.p619ui.tablayout.LiveTabLayout.C10559e.onMeasure(int, int):void");
        }

        /* renamed from: a */
        static int m19132a(int i, int i2, float f) {
            return i + Math.round(f * ((float) (i2 - i)));
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            MethodCollector.m26663i(1991);
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f25458m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m19133a();
                MethodCollector.m26664o(1991);
                return;
            }
            this.f25458m.cancel();
            mo17457b(this.f25446a, Math.round((1.0f - this.f25458m.getAnimatedFraction()) * ((float) this.f25458m.getDuration())));
            MethodCollector.m26664o(1991);
        }
    }

    /* renamed from: c */
    private void m19113c() {
        for (int childCount = this.f25418b.getChildCount() - 1; childCount >= 0; childCount--) {
            C10564h hVar = (C10564h) this.f25418b.getChildAt(childCount);
            this.f25418b.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.f25417M.release(hVar);
            }
            requestLayout();
        }
        Iterator<C10562f> it = this.f25437v.iterator();
        while (it.hasNext()) {
            C10562f next = it.next();
            it.remove();
            next.f25475h = null;
            next.f25476i = null;
            next.f25468a = null;
            next.f25469b = null;
            next.f25470c = null;
            next.f25471d = null;
            next.f25472e = -1;
            next.f25473f = null;
            next.f25474g = -1;
            f25404u.release(next);
        }
        this.f25438w = null;
    }

    /* renamed from: d */
    private C10564h m19116d() {
        C10564h hVar;
        C0693f.AbstractC0694a<C10564h> aVar = this.f25417M;
        if (aVar == null || (hVar = aVar.acquire()) == null) {
            hVar = new C10564h(getContext());
        }
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17400a() {
        int currentItem;
        m19113c();
        PagerAdapter pagerAdapter = this.f25411G;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                m19111b(m19115d(this.f25431o).mo17465a(this.f25411G.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f25433q;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo17404a(mo17399a(currentItem), true);
            }
        }
    }

    public void addView(View view) {
        m19103a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f25432p = z;
    }

    public void setContentInsetStart(int i) {
        this.f25406B = i;
    }

    public void setCustomTabViewResId(int i) {
        this.f25431o = i;
    }

    public void setOnTabClickListener(AbstractC10556b bVar) {
        this.f25435s = bVar;
    }

    public void setTabBackgroundResId(int i) {
        this.f25427k = i;
    }

    public void setTabMaxWidth(int i) {
        this.f25441z = i;
    }

    public void setTabMinWidth(int i) {
        this.f25440y = i;
    }

    public void setTabPaddingBottom(int i) {
        this.f25422f = i;
    }

    public void setTabPaddingEnd(int i) {
        this.f25421e = i;
    }

    public void setTabPaddingStart(int i) {
        this.f25419c = i;
    }

    public void setTabPaddingTop(int i) {
        this.f25420d = i;
    }

    public void setTabTextAppearance(int i) {
        this.f25423g = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$a */
    public class C10555a implements ViewPager.AbstractC1578d {

        /* renamed from: a */
        public boolean f25443a;

        static {
            Covode.recordClassIndex(12134);
        }

        C10555a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1578d
        /* renamed from: a */
        public final void mo5326a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (LiveTabLayout.this.f25433q == viewPager) {
                LiveTabLayout.this.mo17402a(pagerAdapter2, this.f25443a);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout$i */
    public static class C10565i implements AbstractC10557c {

        /* renamed from: a */
        private final ViewPager f25493a;

        static {
            Covode.recordClassIndex(12144);
        }

        public C10565i(ViewPager viewPager) {
            this.f25493a = viewPager;
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p619ui.tablayout.LiveTabLayout.AbstractC10557c
        /* renamed from: a */
        public final void mo17450a(C10562f fVar) {
            this.f25493a.setCurrentItem(fVar.f25472e);
        }
    }

    /* renamed from: b */
    private void m19109b(AbstractC10557c cVar) {
        this.f25408D.remove(cVar);
    }

    /* renamed from: c */
    private void m19114c(int i) {
        mo17401a(i, 0.0f, true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17403a(C10562f fVar) {
        mo17404a(fVar, true);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.f25418b.f25451f = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f25418b.mo17453a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f25418b.mo17456b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo17402a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m19105a(viewPager, false);
    }

    /* renamed from: a */
    private void m19106a(AbstractC10557c cVar) {
        if (!this.f25408D.contains(cVar)) {
            this.f25408D.add(cVar);
        }
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setOnTabSelectedListener(AbstractC10557c cVar) {
        AbstractC10557c cVar2 = this.f25407C;
        if (cVar2 != null) {
            m19109b(cVar2);
        }
        this.f25407C = cVar;
        if (cVar != null) {
            m19106a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m19117e();
        this.f25410F.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f25429m != i) {
            this.f25429m = i;
            m19121h();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f25430n) {
            this.f25430n = i;
            m19121h();
        }
    }

    /* renamed from: a */
    private void m19103a(View view) {
        if (view instanceof C10566a) {
            m19108a((C10566a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: b */
    private void m19110b(C10562f fVar) {
        for (int size = this.f25408D.size() - 1; size >= 0; size--) {
            this.f25408D.get(size).mo17450a(fVar);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f25418b.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f25418b.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f25424h != colorStateList) {
            this.f25424h = colorStateList;
            int size = this.f25437v.size();
            for (int i = 0; i < size; i++) {
                this.f25437v.get(i).mo17468c();
            }
        }
    }

    /* renamed from: a */
    private void m19104a(LinearLayout.LayoutParams layoutParams) {
        if (this.f25430n == 1 && this.f25429m == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.f25439x;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = this.f25439x;
        }
    }

    /* renamed from: d */
    private C10562f m19115d(int i) {
        C10562f acquire = f25404u.acquire();
        if (acquire == null) {
            acquire = new C10562f();
        }
        acquire.f25475h = this;
        if (acquire.f25476i == null) {
            acquire.f25476i = m19116d();
        }
        if (i > 0) {
            acquire.f25476i.mo17471a(acquire);
            acquire.mo17464a(i);
        } else {
            acquire.f25476i.setTab(acquire);
        }
        return acquire;
    }

    public void setTabMargin(int i) {
        this.f25439x = mo17410b(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f25418b.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo17410b(i);
            marginLayoutParams.rightMargin = mo17410b(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public void setTabMode(String str) {
        str.hashCode();
        if (!str.equals("scrollable")) {
            if (str.equals("fixed") && this.f25430n != 1) {
                this.f25430n = 1;
                m19121h();
            }
        } else if (this.f25430n != 0) {
            this.f25430n = 0;
            m19121h();
        }
    }

    /* renamed from: e */
    private void m19118e(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C0792v.m2788v(this)) {
                C10559e eVar = this.f25418b;
                int childCount = eVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (eVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int a = m19102a(i, 0.0f);
                if (scrollX != a) {
                    m19117e();
                    this.f25410F.setIntValues(scrollX, a);
                    this.f25410F.start();
                }
                this.f25418b.mo17457b(i, 200);
                return;
            }
            m19114c(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo17410b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: a */
    private void m19108a(C10566a aVar) {
        C10562f d = m19115d(0);
        if (aVar.f25494a != null) {
            d.mo17465a(aVar.f25494a);
        }
        if (aVar.f25495b != null) {
            d.f25469b = aVar.f25495b;
            d.mo17468c();
        }
        if (aVar.f25496c != 0) {
            d.mo17464a(aVar.f25496c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            d.f25471d = aVar.getContentDescription();
            d.mo17468c();
        }
        m19111b(d, this.f25437v.isEmpty());
    }

    /* renamed from: a */
    public final C10562f mo17399a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f25437v.get(i);
    }

    public LiveTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m19103a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m19103a(view);
    }

    /* renamed from: b */
    private void m19111b(C10562f fVar, boolean z) {
        int size = this.f25437v.size();
        if (fVar.f25475h == this) {
            m19107a(fVar, size);
            C10564h hVar = fVar.f25476i;
            C10559e eVar = this.f25418b;
            int i = fVar.f25472e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            m19104a(layoutParams);
            eVar.addView(hVar, i, layoutParams);
            if (z) {
                fVar.mo17466a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: a */
    private int m19102a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f25430n != 0) {
            return 0;
        }
        View childAt = this.f25418b.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f25418b.getChildCount()) {
            view = this.f25418b.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3 + (this.f25439x * 4))) * 0.5f * f);
        if (C0792v.m2768e(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* renamed from: a */
    private void m19105a(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.f25433q;
        if (viewPager2 != null) {
            C10563g gVar = this.f25434r;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            C10555a aVar = this.f25413I;
            if (aVar != null) {
                this.f25433q.removeOnAdapterChangeListener(aVar);
            }
        }
        AbstractC10557c cVar = this.f25409E;
        if (cVar != null) {
            m19109b(cVar);
            this.f25409E = null;
        }
        if (viewPager != null) {
            this.f25433q = viewPager;
            if (this.f25434r == null) {
                this.f25434r = new C10563g(this);
            }
            this.f25434r.mo17469a();
            viewPager.addOnPageChangeListener(this.f25434r);
            C10565i iVar = new C10565i(viewPager);
            this.f25409E = iVar;
            m19106a(iVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo17402a(adapter, true);
            }
            if (this.f25413I == null) {
                this.f25413I = new C10555a();
            }
            this.f25413I.f25443a = true;
            viewPager.addOnAdapterChangeListener(this.f25413I);
            m19114c(viewPager.getCurrentItem());
        } else {
            this.f25433q = null;
            mo17402a((PagerAdapter) null, false);
        }
        this.f25414J = z;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(3431);
        int b = mo17410b(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(b, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f25441z;
            if (i3 <= 0) {
                i3 = size - mo17410b(56);
            }
            this.f25428l = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.f25430n;
            if (i4 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        MethodCollector.m26664o(3431);
    }

    /* renamed from: a */
    private void m19107a(C10562f fVar, int i) {
        fVar.f25472e = i;
        this.f25437v.add(i, fVar);
        int size = this.f25437v.size();
        while (true) {
            i++;
            if (i < size) {
                this.f25437v.get(i).f25472e = i;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m19103a(view);
    }

    private LiveTabLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(2812);
        this.f25437v = new ArrayList<>();
        this.f25428l = Integer.MAX_VALUE;
        this.f25408D = new ArrayList<>();
        this.f25417M = new C0693f.C0695b(12);
        setHorizontalScrollBarEnabled(false);
        C10559e eVar = new C10559e(context);
        this.f25418b = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ag8, R.attr.ag9, R.attr.ag_, R.attr.aga, R.attr.agb, R.attr.agc, R.attr.agd, R.attr.age, R.attr.agf, R.attr.agg, R.attr.agh, R.attr.agj, R.attr.agk, R.attr.agl, R.attr.agm, R.attr.agn, R.attr.ago, R.attr.agp, R.attr.agq, R.attr.agr, R.attr.ags, R.attr.agt, R.attr.agv, R.attr.agw, R.attr.agx}, 0, R.style.r2);
        eVar.mo17456b(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        eVar.mo17453a(obtainStyledAttributes.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f25419c = dimensionPixelSize;
        this.f25420d = dimensionPixelSize;
        this.f25421e = dimensionPixelSize;
        this.f25422f = dimensionPixelSize;
        this.f25419c = obtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
        this.f25420d = obtainStyledAttributes.getDimensionPixelSize(19, this.f25420d);
        this.f25421e = obtainStyledAttributes.getDimensionPixelSize(17, this.f25421e);
        this.f25422f = obtainStyledAttributes.getDimensionPixelSize(16, this.f25422f);
        int resourceId = obtainStyledAttributes.getResourceId(22, R.style.jg);
        this.f25423g = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk});
        try {
            this.f25425i = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f25424h = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(23)) {
                this.f25424h = obtainStyledAttributes.getColorStateList(23);
            }
            if (obtainStyledAttributes.hasValue(21)) {
                int color = obtainStyledAttributes.getColor(21, 0);
                int defaultColor = this.f25424h.getDefaultColor();
                this.f25424h = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.f25440y = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f25441z = obtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f25427k = obtainStyledAttributes.getResourceId(0, 0);
            this.f25406B = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f25430n = obtainStyledAttributes.getInt(14, 1);
            this.f25429m = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f25426j = (float) resources.getDimensionPixelSize(R.dimen.ib);
            this.f25405A = resources.getDimensionPixelSize(R.dimen.i_);
            this.f25415K = C13628n.m24520b(getContext(), 1.5f);
            this.f25416L = C13628n.m24520b(getContext(), 1.5f);
            this.f25436t = getResources().getConfiguration().orientation;
            m19121h();
            MethodCollector.m26664o(2812);
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            MethodCollector.m26664o(2812);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }
}
