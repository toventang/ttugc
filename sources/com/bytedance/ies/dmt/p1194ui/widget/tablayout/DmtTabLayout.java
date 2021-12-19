package com.bytedance.ies.dmt.p1194ui.widget.tablayout;

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
/* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout */
public class DmtTabLayout extends HorizontalScrollView {

    /* renamed from: N */
    private static final int[] f41454N = {R.attr.oj};

    /* renamed from: a */
    public static final Interpolator f41455a = new C0995b();

    /* renamed from: b */
    public static final C0693f.AbstractC0694a<C17294f> f41456b = new C0693f.C0696c(16);

    /* renamed from: A */
    private int f41457A;

    /* renamed from: B */
    private final int f41458B;

    /* renamed from: C */
    private int f41459C;

    /* renamed from: D */
    private AbstractC17289c f41460D;

    /* renamed from: E */
    private AbstractC17289c f41461E;

    /* renamed from: F */
    private ValueAnimator f41462F;

    /* renamed from: G */
    private PagerAdapter f41463G;

    /* renamed from: H */
    private DataSetObserver f41464H;

    /* renamed from: I */
    private C17287a f41465I;

    /* renamed from: J */
    private boolean f41466J;

    /* renamed from: K */
    private float f41467K;

    /* renamed from: L */
    private float f41468L;

    /* renamed from: M */
    private final C0693f.AbstractC0694a<C17296h> f41469M;

    /* renamed from: c */
    public final C17291e f41470c;

    /* renamed from: d */
    int f41471d;

    /* renamed from: e */
    int f41472e;

    /* renamed from: f */
    int f41473f;

    /* renamed from: g */
    int f41474g;

    /* renamed from: h */
    int f41475h;

    /* renamed from: i */
    ColorStateList f41476i;

    /* renamed from: j */
    float f41477j;

    /* renamed from: k */
    float f41478k;

    /* renamed from: l */
    int f41479l;

    /* renamed from: m */
    int f41480m;

    /* renamed from: n */
    int f41481n;

    /* renamed from: o */
    int f41482o;

    /* renamed from: p */
    int f41483p;

    /* renamed from: q */
    boolean f41484q;

    /* renamed from: r */
    public final ArrayList<AbstractC17289c> f41485r;

    /* renamed from: s */
    ViewPager f41486s;

    /* renamed from: t */
    C17295g f41487t;

    /* renamed from: u */
    public AbstractC17288b f41488u;

    /* renamed from: v */
    public int f41489v;

    /* renamed from: w */
    private final ArrayList<C17294f> f41490w;

    /* renamed from: x */
    private C17294f f41491x;

    /* renamed from: y */
    private int f41492y;

    /* renamed from: z */
    private int f41493z;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$b */
    public interface AbstractC17288b {
        static {
            Covode.recordClassIndex(19771);
        }

        /* renamed from: a */
        void mo27573a(C17294f fVar);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$c */
    public interface AbstractC17289c {
        static {
            Covode.recordClassIndex(19772);
        }

        /* renamed from: a */
        void mo27574a(C17294f fVar);

        /* renamed from: b */
        void mo27575b(C17294f fVar);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$h */
    public class C17296h extends LinearLayout {

        /* renamed from: b */
        private C17294f f41538b;

        /* renamed from: c */
        private TextView f41539c;

        /* renamed from: d */
        private ImageView f41540d;

        /* renamed from: e */
        private View f41541e;

        /* renamed from: f */
        private TextView f41542f;

        /* renamed from: g */
        private ImageView f41543g;

        /* renamed from: h */
        private int f41544h = 2;

        static {
            Covode.recordClassIndex(19779);
        }

        public final TextView getCustomTextView() {
            return this.f41542f;
        }

        public final C17294f getTab() {
            return this.f41538b;
        }

        public final TextView getTextView() {
            return this.f41539c;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f41538b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (DmtTabLayout.this.f41488u != null) {
                DmtTabLayout.this.f41488u.mo27573a(this.f41538b);
            } else {
                this.f41538b.mo27592a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo27596a() {
            View view;
            MethodCollector.m26663i(8804);
            C17294f fVar = this.f41538b;
            if (fVar == null || (view = fVar.f41525f) == null) {
                View view2 = this.f41541e;
                if (view2 != null) {
                    removeView(view2);
                    this.f41541e = null;
                }
                this.f41542f = null;
                this.f41543g = null;
            } else {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f41541e = view;
                TextView textView = this.f41539c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f41540d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f41540d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f41542f = textView2;
                if (textView2 != null) {
                    this.f41544h = C0823h.m2903a(textView2);
                }
                this.f41543g = (ImageView) view.findViewById(16908294);
            }
            boolean z = false;
            if (this.f41541e == null) {
                if (this.f41540d == null) {
                    ImageView imageView2 = (ImageView) C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.vm, this, false);
                    addView(imageView2, 0);
                    this.f41540d = imageView2;
                }
                if (this.f41539c == null) {
                    TextView textView3 = (TextView) C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bh7, this, false);
                    addView(textView3);
                    this.f41539c = textView3;
                    this.f41544h = C0823h.m2903a(textView3);
                }
                C0823h.m2907a(this.f41539c, DmtTabLayout.this.f41475h);
                if (DmtTabLayout.this.f41476i != null) {
                    this.f41539c.setTextColor(DmtTabLayout.this.f41476i);
                }
                m32021a(this.f41539c, this.f41540d);
            } else {
                TextView textView4 = this.f41542f;
                if (!(textView4 == null && this.f41543g == null)) {
                    m32021a(textView4, this.f41543g);
                }
            }
            if (fVar != null && fVar.mo27593b()) {
                z = true;
            }
            setSelected(z);
            MethodCollector.m26664o(8804);
        }

        /* renamed from: a */
        public final void mo27597a(C17294f fVar) {
            if (fVar != this.f41538b) {
                this.f41538b = fVar;
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
        public final void setTab(C17294f fVar) {
            if (fVar != this.f41538b) {
                this.f41538b = fVar;
                mo27596a();
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
            TextView textView = this.f41539c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f41540d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f41541e;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public C17296h(Context context) {
            super(context);
            MethodCollector.m26663i(8644);
            if (DmtTabLayout.this.f41479l != 0) {
                C0792v.m2746a(this, C0196a.m619b(context, DmtTabLayout.this.f41479l));
            }
            C0792v.m2741a(this, DmtTabLayout.this.f41471d, DmtTabLayout.this.f41472e, DmtTabLayout.this.f41473f, DmtTabLayout.this.f41474g);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0792v.m2749a(this, C0789s.m2732a(getContext()));
            MethodCollector.m26664o(8644);
        }

        /* renamed from: a */
        private void m32021a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            C17294f fVar = this.f41538b;
            CharSequence charSequence3 = null;
            if (fVar != null) {
                drawable = fVar.f41521b;
            } else {
                drawable = null;
            }
            C17294f fVar2 = this.f41538b;
            if (fVar2 != null) {
                charSequence = fVar2.f41522c;
            } else {
                charSequence = null;
            }
            C17294f fVar3 = this.f41538b;
            if (fVar3 != null) {
                charSequence2 = fVar3.f41523d;
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
                    i = DmtTabLayout.this.mo27532c(8);
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
            MethodCollector.m26663i(8648);
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = DmtTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(DmtTabLayout.this.f41480m, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f41539c != null) {
                getResources();
                float f = DmtTabLayout.this.f41477j;
                int i3 = this.f41544h;
                ImageView imageView = this.f41540d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f41539c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = DmtTabLayout.this.f41478k;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f41539c.getTextSize();
                int lineCount = this.f41539c.getLineCount();
                int a = C0823h.m2903a(this.f41539c);
                if ((f != textSize || (a >= 0 && i3 != a)) && (DmtTabLayout.this.f41482o != 1 || f <= textSize || lineCount != 1 || ((layout = this.f41539c.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))))) {
                    this.f41539c.setTextSize(0, f);
                    this.f41539c.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
            MethodCollector.m26664o(8648);
        }
    }

    public int getTabGravity() {
        return this.f41481n;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f41480m;
    }

    public int getTabMode() {
        return this.f41482o;
    }

    public ColorStateList getTabTextColors() {
        return this.f41476i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27518a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f41470c.getChildCount()) {
            if (z2) {
                this.f41470c.mo27579a(i, f);
            }
            ValueAnimator valueAnimator = this.f41462F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f41462F.cancel();
            }
            scrollTo(m31968a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public final void mo27522a(C17294f fVar) {
        m31976b(fVar, this.f41490w.isEmpty());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27520a(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f41463G;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.f41464H) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f41463G = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f41464H == null) {
                this.f41464H = new C17290d();
            }
            pagerAdapter.registerDataSetObserver(this.f41464H);
        }
        mo27517a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27517a() {
        int currentItem;
        m31979d();
        PagerAdapter pagerAdapter = this.f41463G;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                m31976b(mo27516a(this.f41483p).mo27591a(this.f41463G.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f41486s;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo27523a(mo27529b(currentItem), true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27523a(C17294f fVar, boolean z) {
        C17294f fVar2 = this.f41491x;
        if (fVar2 != fVar) {
            int i = fVar != null ? fVar.f41524e : -1;
            if (z) {
                if ((fVar2 == null || fVar2.f41524e == -1) && i != -1) {
                    m31982e(i);
                } else {
                    m31985f(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m31983e(fVar2);
            }
            this.f41491x = fVar;
            if (fVar != null) {
                m31980d(fVar);
            }
        } else if (fVar2 != null) {
            m31986g();
            m31985f(fVar.f41524e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27524a(boolean z) {
        for (int i = 0; i < this.f41470c.getChildCount(); i++) {
            View childAt = this.f41470c.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m31970a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$d */
    public class C17290d extends DataSetObserver {
        static {
            Covode.recordClassIndex(19773);
        }

        public final void onChanged() {
            DmtTabLayout.this.mo27517a();
        }

        public final void onInvalidated() {
            DmtTabLayout.this.mo27517a();
        }

        C17290d() {
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$f */
    public static final class C17294f {

        /* renamed from: a */
        public Object f41520a;

        /* renamed from: b */
        public Drawable f41521b;

        /* renamed from: c */
        public CharSequence f41522c;

        /* renamed from: d */
        public CharSequence f41523d;

        /* renamed from: e */
        public int f41524e = -1;

        /* renamed from: f */
        public View f41525f;

        /* renamed from: g */
        int f41526g = -1;

        /* renamed from: h */
        public DmtTabLayout f41527h;

        /* renamed from: i */
        public C17296h f41528i;

        static {
            Covode.recordClassIndex(19777);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo27594c() {
            C17296h hVar = this.f41528i;
            if (hVar != null) {
                hVar.mo27596a();
            }
        }

        /* renamed from: a */
        public final void mo27592a() {
            DmtTabLayout dmtTabLayout = this.f41527h;
            if (dmtTabLayout != null) {
                dmtTabLayout.mo27531b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: b */
        public final boolean mo27593b() {
            DmtTabLayout dmtTabLayout = this.f41527h;
            if (dmtTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (dmtTabLayout.getSelectedTabPosition() == this.f41524e) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        public final C17294f mo27590a(View view) {
            this.f41525f = view;
            mo27594c();
            return this;
        }

        /* renamed from: a */
        public final C17294f mo27591a(CharSequence charSequence) {
            this.f41522c = charSequence;
            mo27594c();
            return this;
        }

        /* renamed from: a */
        public final C17294f mo27589a(int i) {
            if (this.f41526g == i && this.f41525f != null) {
                return this;
            }
            this.f41526g = i;
            return mo27590a(C1764a.m5927a(LayoutInflater.from(this.f41528i.getContext()), i, this.f41528i, false));
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$g */
    public static class C17295g implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        private final WeakReference<DmtTabLayout> f41529a;

        /* renamed from: b */
        private int f41530b;

        /* renamed from: c */
        private int f41531c;

        /* renamed from: d */
        private int f41532d;

        /* renamed from: e */
        private int f41533e;

        /* renamed from: f */
        private ArgbEvaluator f41534f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f41535g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f41536h = new DecelerateInterpolator(1.6f);

        static {
            Covode.recordClassIndex(19778);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo27595a() {
            this.f41530b = 0;
            this.f41531c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f41530b = this.f41531c;
            this.f41531c = i;
        }

        public C17295g(DmtTabLayout dmtTabLayout) {
            this.f41529a = new WeakReference<>(dmtTabLayout);
            this.f41533e = dmtTabLayout.getTabTextColors().getColorForState(DmtTabLayout.SELECTED_STATE_SET, 0);
            this.f41532d = dmtTabLayout.getTabTextColors().getDefaultColor();
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            boolean z;
            DmtTabLayout dmtTabLayout = this.f41529a.get();
            if (dmtTabLayout != null && dmtTabLayout.getSelectedTabPosition() != i && i < dmtTabLayout.getTabCount()) {
                int i2 = this.f41531c;
                if (i2 == 0 || (i2 == 2 && this.f41530b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                dmtTabLayout.mo27523a(dmtTabLayout.mo27529b(i), z);
            }
        }

        /* renamed from: a */
        private static void m32019a(ImageView imageView, TextView textView, int i) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.C17295g.onPageScrolled(int, float, int):void");
        }
    }

    public int getTabCount() {
        return this.f41490w.size();
    }

    public int getTabStripLeftPadding() {
        return this.f41470c.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.f41470c.getPaddingRight();
    }

    /* renamed from: e */
    private LinearLayout.LayoutParams m31981e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m31970a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        C17291e eVar = this.f41470c;
        return ((float) eVar.f41498a) + eVar.f41499b;
    }

    private int getTabMinWidth() {
        int i = this.f41493z;
        if (i != -1) {
            return i;
        }
        if (this.f41482o == 0) {
            return this.f41458B;
        }
        return 0;
    }

    public int getSelectedTabPosition() {
        C17294f fVar = this.f41491x;
        if (fVar != null) {
            return fVar.f41524e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41466J) {
            setupWithViewPager(null);
            this.f41466J = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m31986g() {
        for (int size = this.f41485r.size() - 1; size >= 0; size--) {
            this.f41485r.get(size);
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f41470c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41486s == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m31971a((ViewPager) parent, true);
            }
        }
    }

    static {
        Covode.recordClassIndex(19768);
    }

    /* renamed from: f */
    private void m31984f() {
        if (this.f41462F == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f41462F = valueAnimator;
            valueAnimator.setInterpolator(f41455a);
            this.f41462F.setDuration(200L);
            this.f41462F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.C172861 */

                static {
                    Covode.recordClassIndex(19769);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DmtTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.f41490w.size();
        for (int i = 0; i < size; i++) {
            C17294f fVar = this.f41490w.get(i);
            if (!(fVar == null || fVar.f41521b == null || TextUtils.isEmpty(fVar.f41522c))) {
                return 72;
            }
        }
        return 48;
    }

    /* renamed from: h */
    private void m31987h() {
        int i;
        if (this.f41482o == 0) {
            i = Math.max(0, this.f41459C - this.f41471d);
        } else {
            i = 0;
        }
        C0792v.m2741a(this.f41470c, i, 0, 0, 0);
        int i2 = this.f41482o;
        if (i2 == 0) {
            this.f41470c.setGravity(8388611);
        } else if (i2 == 1) {
            this.f41470c.setGravity(1);
        }
        mo27524a(true);
    }

    /* renamed from: b */
    public final C17296h mo27530b() {
        C17296h hVar;
        C0693f.AbstractC0694a<C17296h> aVar = this.f41469M;
        if (aVar == null || (hVar = aVar.acquire()) == null) {
            hVar = new C17296h(getContext());
        }
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$e */
    public class C17291e extends LinearLayout {

        /* renamed from: a */
        int f41498a = -1;

        /* renamed from: b */
        float f41499b;

        /* renamed from: c */
        public float f41500c;

        /* renamed from: d */
        public float f41501d;

        /* renamed from: e */
        public boolean f41502e;

        /* renamed from: f */
        int f41503f;

        /* renamed from: h */
        private int f41505h;

        /* renamed from: i */
        private final Paint f41506i;

        /* renamed from: j */
        private int f41507j = -1;

        /* renamed from: k */
        private int f41508k = -1;

        /* renamed from: l */
        private int f41509l = -1;

        /* renamed from: m */
        private ValueAnimator f41510m;

        /* renamed from: n */
        private int f41511n;

        /* renamed from: o */
        private int f41512o;

        static {
            Covode.recordClassIndex(19774);
        }

        /* renamed from: a */
        private void m32007a() {
            int i;
            View childAt = getChildAt(this.f41498a);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f41499b > 0.0f && this.f41498a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f41498a + 1);
                    float f = this.f41499b;
                    i2 = (int) ((this.f41499b * ((float) childAt2.getLeft())) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((f * ((float) childAt2.getRight())) + ((1.0f - this.f41499b) * ((float) i)));
                }
            }
            mo27580a(i2, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo27581b(int i) {
            if (this.f41505h != i) {
                this.f41505h = i;
                C0792v.m2764c(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo27578a(int i) {
            if (this.f41506i.getColor() != i) {
                this.f41506i.setColor(i);
                C0792v.m2764c(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f41507j != i) {
                requestLayout();
                this.f41507j = i;
            }
        }

        public final void draw(Canvas canvas) {
            View findViewById;
            super.draw(canvas);
            int i = this.f41508k;
            if (i >= 0 && this.f41509l > i) {
                View childAt = getChildAt(DmtTabLayout.this.getSelectedTabPosition());
                if (childAt == null || (findViewById = childAt.findViewById(R.id.c76)) == null) {
                    canvas.drawRect((float) (this.f41508k + this.f41503f), (float) (getHeight() - this.f41505h), (float) (this.f41509l - this.f41503f), (float) getHeight(), this.f41506i);
                    return;
                }
                if (DmtTabLayout.this.f41486s == null || !this.f41502e) {
                    int i2 = this.f41508k;
                    float width = (float) (i2 + (((this.f41509l - i2) - findViewById.getWidth()) / 2));
                    this.f41500c = width;
                    this.f41501d = width + ((float) findViewById.getWidth());
                }
                canvas.drawRect(this.f41500c + ((float) this.f41503f), (float) (getHeight() - this.f41505h), this.f41501d - ((float) this.f41503f), (float) getHeight(), this.f41506i);
            }
        }

        C17291e(Context context) {
            super(context);
            MethodCollector.m26663i(8646);
            this.f41511n = DmtTabLayout.this.mo27532c(27);
            this.f41512o = Integer.MAX_VALUE;
            setWillNotDraw(false);
            this.f41506i = new Paint();
            MethodCollector.m26664o(8646);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo27579a(int i, float f) {
            ValueAnimator valueAnimator = this.f41510m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f41510m.cancel();
            }
            this.f41498a = i;
            this.f41499b = f;
            m32007a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo27580a(int i, int i2) {
            if (i != this.f41508k || i2 != this.f41509l) {
                this.f41508k = i;
                this.f41509l = i2;
                C0792v.m2764c(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo27582b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            ValueAnimator valueAnimator = this.f41510m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f41510m.cancel();
            }
            if (C0792v.m2768e(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m32007a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f41498a) <= 1) {
                i3 = this.f41508k;
                i4 = this.f41509l;
            } else {
                int c = DmtTabLayout.this.mo27532c(24);
                if (i >= this.f41498a ? !z : z) {
                    i3 = left - c;
                } else {
                    i3 = c + right;
                }
                i4 = i3;
            }
            if (i3 != left || i4 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f41510m = valueAnimator2;
                valueAnimator2.setInterpolator(DmtTabLayout.f41455a);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.C17291e.C172921 */

                    static {
                        Covode.recordClassIndex(19775);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C17291e.this.mo27580a(C17291e.m32006a(i3, left, animatedFraction), C17291e.m32006a(i4, right, animatedFraction));
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.C17291e.C172932 */

                    static {
                        Covode.recordClassIndex(19776);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C17291e.this.f41498a = i;
                        C17291e.this.f41499b = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
            if (r5 != false) goto L_0x0093;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r10, int r11) {
            /*
            // Method dump skipped, instructions count: 329
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.C17291e.onMeasure(int, int):void");
        }

        /* renamed from: a */
        static int m32006a(int i, int i2, float f) {
            return i + Math.round(f * ((float) (i2 - i)));
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            MethodCollector.m26663i(8946);
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f41510m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m32007a();
                MethodCollector.m26664o(8946);
                return;
            }
            this.f41510m.cancel();
            mo27582b(this.f41498a, Math.round((1.0f - this.f41510m.getAnimatedFraction()) * ((float) this.f41510m.getDuration())));
            MethodCollector.m26664o(8946);
        }
    }

    /* renamed from: d */
    private void m31979d() {
        for (int childCount = this.f41470c.getChildCount() - 1; childCount >= 0; childCount--) {
            C17296h hVar = (C17296h) this.f41470c.getChildAt(childCount);
            this.f41470c.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.f41469M.release(hVar);
            }
            requestLayout();
        }
        Iterator<C17294f> it = this.f41490w.iterator();
        while (it.hasNext()) {
            C17294f next = it.next();
            it.remove();
            next.f41527h = null;
            next.f41528i = null;
            next.f41520a = null;
            next.f41521b = null;
            next.f41522c = null;
            next.f41523d = null;
            next.f41524e = -1;
            next.f41525f = null;
            next.f41526g = -1;
            f41456b.release(next);
        }
        this.f41491x = null;
    }

    public void addView(View view) {
        m31969a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f41484q = z;
    }

    public void setContentInsetStart(int i) {
        this.f41459C = i;
    }

    public void setCustomTabViewResId(int i) {
        this.f41483p = i;
    }

    public void setOnTabClickListener(AbstractC17288b bVar) {
        this.f41488u = bVar;
    }

    public void setTabBackgroundResId(int i) {
        this.f41479l = i;
    }

    public void setTabMaxWidth(int i) {
        this.f41457A = i;
    }

    public void setTabMinWidth(int i) {
        this.f41493z = i;
    }

    public void setTabPaddingBottom(int i) {
        this.f41474g = i;
    }

    public void setTabPaddingEnd(int i) {
        this.f41473f = i;
    }

    public void setTabPaddingStart(int i) {
        this.f41471d = i;
    }

    public void setTabPaddingTop(int i) {
        this.f41472e = i;
    }

    public void setTabTextAppearance(int i) {
        this.f41475h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$a */
    public class C17287a implements ViewPager.AbstractC1578d {

        /* renamed from: a */
        public boolean f41495a;

        static {
            Covode.recordClassIndex(19770);
        }

        C17287a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1578d
        /* renamed from: a */
        public final void mo5326a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (DmtTabLayout.this.f41486s == viewPager) {
                DmtTabLayout.this.mo27520a(pagerAdapter2, this.f41495a);
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$i */
    public static class C17297i implements AbstractC17289c {

        /* renamed from: a */
        private final ViewPager f41545a;

        static {
            Covode.recordClassIndex(19780);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: b */
        public final void mo27575b(C17294f fVar) {
        }

        public C17297i(ViewPager viewPager) {
            this.f41545a = viewPager;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: a */
        public final void mo27574a(C17294f fVar) {
            this.f41545a.setCurrentItem(fVar.f41524e);
        }
    }

    public DmtTabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m31975b(AbstractC17289c cVar) {
        this.f41485r.remove(cVar);
    }

    /* renamed from: e */
    private void m31982e(int i) {
        mo27518a(i, 0.0f, true, true);
    }

    /* renamed from: d */
    public final View mo27533d(int i) {
        return this.f41470c.getChildAt(i);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.f41470c.f41503f = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f41470c.mo27578a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f41470c.mo27581b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo27520a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m31971a(viewPager, false);
    }

    /* renamed from: c */
    private void m31977c(C17294f fVar) {
        this.f41470c.addView(fVar.f41528i, fVar.f41524e, m31981e());
    }

    /* renamed from: a */
    public final void mo27521a(AbstractC17289c cVar) {
        if (!this.f41485r.contains(cVar)) {
            this.f41485r.add(cVar);
        }
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setOnTabSelectedListener(AbstractC17289c cVar) {
        AbstractC17289c cVar2 = this.f41460D;
        if (cVar2 != null) {
            m31975b(cVar2);
        }
        this.f41460D = cVar;
        if (cVar != null) {
            mo27521a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m31984f();
        this.f41462F.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f41481n != i) {
            this.f41481n = i;
            m31987h();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f41482o) {
            this.f41482o = i;
            m31987h();
        }
    }

    /* renamed from: a */
    private void m31969a(View view) {
        if (view instanceof C17298a) {
            m31974a((C17298a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: d */
    private void m31980d(C17294f fVar) {
        for (int size = this.f41485r.size() - 1; size >= 0; size--) {
            this.f41485r.get(size).mo27574a(fVar);
        }
    }

    /* renamed from: e */
    private void m31983e(C17294f fVar) {
        for (int size = this.f41485r.size() - 1; size >= 0; size--) {
            this.f41485r.get(size).mo27575b(fVar);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f41470c.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f41470c.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: b */
    public final C17294f mo27529b(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f41490w.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo27532c(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f41476i != colorStateList) {
            this.f41476i = colorStateList;
            int size = this.f41490w.size();
            for (int i = 0; i < size; i++) {
                this.f41490w.get(i).mo27594c();
            }
        }
    }

    /* renamed from: a */
    private void m31970a(LinearLayout.LayoutParams layoutParams) {
        if (this.f41482o == 1 && this.f41481n == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.f41492y;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = this.f41492y;
        }
    }

    public void setTabMargin(int i) {
        this.f41492y = mo27532c(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f41470c.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo27532c(i);
            marginLayoutParams.rightMargin = mo27532c(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public void setTabMode(String str) {
        str.hashCode();
        if (!str.equals("scrollable")) {
            if (str.equals("fixed") && this.f41482o != 1) {
                this.f41482o = 1;
                m31987h();
            }
        } else if (this.f41482o != 0) {
            this.f41482o = 0;
            m31987h();
        }
    }

    /* renamed from: f */
    private void m31985f(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C0792v.m2788v(this)) {
                C17291e eVar = this.f41470c;
                int childCount = eVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (eVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int a = m31968a(i, 0.0f);
                if (scrollX != a) {
                    m31984f();
                    this.f41462F.setIntValues(scrollX, a);
                    this.f41462F.start();
                }
                this.f41470c.mo27582b(i, 200);
                return;
            }
            m31982e(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27531b(C17294f fVar) {
        mo27523a(fVar, true);
    }

    /* renamed from: a */
    private void m31974a(C17298a aVar) {
        C17294f a = mo27516a(0);
        if (aVar.f41546a != null) {
            a.mo27591a(aVar.f41546a);
        }
        if (aVar.f41547b != null) {
            a.f41521b = aVar.f41547b;
            a.mo27594c();
        }
        if (aVar.f41548c != 0) {
            a.mo27589a(aVar.f41548c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            a.f41523d = aVar.getContentDescription();
            a.mo27594c();
        }
        mo27522a(a);
    }

    /* renamed from: a */
    public final C17294f mo27516a(int i) {
        C17294f acquire = f41456b.acquire();
        if (acquire == null) {
            acquire = new C17294f();
        }
        acquire.f41527h = this;
        if (acquire.f41528i == null) {
            acquire.f41528i = mo27530b();
        }
        if (i > 0) {
            acquire.f41528i.mo27597a(acquire);
            acquire.mo27589a(i);
        } else {
            acquire.f41528i.setTab(acquire);
        }
        return acquire;
    }

    /* renamed from: a */
    public final void mo27519a(int i, int i2) {
        this.f41470c.setPadding(i, 0, i2, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m31969a(view);
    }

    public DmtTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: b */
    private void m31976b(C17294f fVar, boolean z) {
        m31973a(fVar, this.f41490w.size(), z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m31969a(view);
    }

    /* renamed from: a */
    private int m31968a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f41482o != 0) {
            return 0;
        }
        View childAt = this.f41470c.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f41470c.getChildCount()) {
            view = this.f41470c.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3 + (this.f41492y * 4))) * 0.5f * f);
        if (C0792v.m2768e(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* renamed from: a */
    private void m31971a(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.f41486s;
        if (viewPager2 != null) {
            C17295g gVar = this.f41487t;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            C17287a aVar = this.f41465I;
            if (aVar != null) {
                this.f41486s.removeOnAdapterChangeListener(aVar);
            }
        }
        AbstractC17289c cVar = this.f41461E;
        if (cVar != null) {
            m31975b(cVar);
            this.f41461E = null;
        }
        if (viewPager != null) {
            this.f41486s = viewPager;
            if (this.f41487t == null) {
                this.f41487t = new C17295g(this);
            }
            this.f41487t.mo27595a();
            viewPager.addOnPageChangeListener(this.f41487t);
            C17297i iVar = new C17297i(viewPager);
            this.f41461E = iVar;
            mo27521a(iVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo27520a(adapter, true);
            }
            if (this.f41465I == null) {
                this.f41465I = new C17287a();
            }
            this.f41465I.f41495a = true;
            viewPager.addOnAdapterChangeListener(this.f41465I);
            m31982e(viewPager.getCurrentItem());
        } else {
            this.f41486s = null;
            mo27520a((PagerAdapter) null, false);
        }
        this.f41466J = z;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9121);
        int c = mo27532c(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(c, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(c, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f41457A;
            if (i3 <= 0) {
                i3 = size - mo27532c(56);
            }
            this.f41480m = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.f41482o;
            if (i4 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        MethodCollector.m26664o(9121);
    }

    /* renamed from: a */
    private void m31972a(C17294f fVar, int i) {
        fVar.f41524e = i;
        this.f41490w.add(i, fVar);
        int size = this.f41490w.size();
        while (true) {
            i++;
            if (i < size) {
                this.f41490w.get(i).f41524e = i;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m31969a(view);
    }

    private DmtTabLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8949);
        this.f41490w = new ArrayList<>();
        this.f41480m = Integer.MAX_VALUE;
        this.f41485r = new ArrayList<>();
        this.f41469M = new C0693f.C0695b(12);
        setHorizontalScrollBarEnabled(false);
        C17291e eVar = new C17291e(context);
        this.f41470c = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ag8, R.attr.ag9, R.attr.ag_, R.attr.aga, R.attr.agb, R.attr.agc, R.attr.agd, R.attr.age, R.attr.agf, R.attr.agg, R.attr.agh, R.attr.agj, R.attr.agk, R.attr.agl, R.attr.agm, R.attr.agn, R.attr.ago, R.attr.agp, R.attr.agq, R.attr.agr, R.attr.ags, R.attr.agt, R.attr.agv, R.attr.agw, R.attr.agx}, 0, R.style.r2);
        eVar.mo27581b(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        eVar.mo27578a(obtainStyledAttributes.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f41471d = dimensionPixelSize;
        this.f41472e = dimensionPixelSize;
        this.f41473f = dimensionPixelSize;
        this.f41474g = dimensionPixelSize;
        this.f41471d = obtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
        this.f41472e = obtainStyledAttributes.getDimensionPixelSize(19, this.f41472e);
        this.f41473f = obtainStyledAttributes.getDimensionPixelSize(17, this.f41473f);
        this.f41474g = obtainStyledAttributes.getDimensionPixelSize(16, this.f41474g);
        int resourceId = obtainStyledAttributes.getResourceId(22, R.style.jg);
        this.f41475h = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk});
        try {
            this.f41477j = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f41476i = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(23)) {
                this.f41476i = obtainStyledAttributes.getColorStateList(23);
            }
            if (obtainStyledAttributes.hasValue(21)) {
                int color = obtainStyledAttributes.getColor(21, 0);
                int defaultColor = this.f41476i.getDefaultColor();
                this.f41476i = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.f41493z = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f41457A = obtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f41479l = obtainStyledAttributes.getResourceId(0, 0);
            this.f41459C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f41482o = obtainStyledAttributes.getInt(14, 1);
            this.f41481n = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f41478k = (float) resources.getDimensionPixelSize(R.dimen.ib);
            this.f41458B = resources.getDimensionPixelSize(R.dimen.i_);
            this.f41467K = C13628n.m24520b(getContext(), 1.5f);
            this.f41468L = C13628n.m24520b(getContext(), 1.5f);
            this.f41489v = getResources().getConfiguration().orientation;
            m31987h();
            MethodCollector.m26664o(8949);
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            MethodCollector.m26664o(8949);
            throw th;
        }
    }

    /* renamed from: a */
    private void m31973a(C17294f fVar, int i, boolean z) {
        if (fVar.f41527h == this) {
            m31972a(fVar, i);
            m31977c(fVar);
            if (z) {
                fVar.mo27592a();
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
