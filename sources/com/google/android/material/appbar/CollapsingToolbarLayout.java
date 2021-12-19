package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p030b.C0622a;
import androidx.core.p036g.C0691d;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C26661b;
import com.google.android.material.internal.C26662c;
import com.google.android.material.internal.C26685k;
import com.google.android.material.p1951a.C26555a;
import com.p2082ss.android.ugc.trill.R;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: a */
    final C26661b f62706a;

    /* renamed from: b */
    public boolean f62707b;

    /* renamed from: c */
    Drawable f62708c;

    /* renamed from: d */
    int f62709d;

    /* renamed from: e */
    C0753ad f62710e;

    /* renamed from: f */
    private boolean f62711f;

    /* renamed from: g */
    private int f62712g;

    /* renamed from: h */
    private Toolbar f62713h;

    /* renamed from: i */
    private View f62714i;

    /* renamed from: j */
    private View f62715j;

    /* renamed from: k */
    private int f62716k;

    /* renamed from: l */
    private int f62717l;

    /* renamed from: m */
    private int f62718m;

    /* renamed from: n */
    private int f62719n;

    /* renamed from: o */
    private final Rect f62720o;

    /* renamed from: p */
    private boolean f62721p;

    /* renamed from: q */
    private Drawable f62722q;

    /* renamed from: r */
    private int f62723r;

    /* renamed from: s */
    private boolean f62724s;

    /* renamed from: t */
    private ValueAnimator f62725t;

    /* renamed from: u */
    private long f62726u;

    /* renamed from: v */
    private int f62727v;

    /* renamed from: w */
    private AppBarLayout.AbstractC26571c f62728w;

    static {
        Covode.recordClassIndex(32008);
    }

    public Drawable getContentScrim() {
        return this.f62722q;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f62719n;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f62718m;
    }

    public int getExpandedTitleMarginStart() {
        return this.f62716k;
    }

    public int getExpandedTitleMarginTop() {
        return this.f62717l;
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.f62723r;
    }

    public long getScrimAnimationDuration() {
        return this.f62726u;
    }

    public Drawable getStatusBarScrim() {
        return this.f62708c;
    }

    /* renamed from: d */
    private void m52661d() {
        setContentDescription(getTitle());
    }

    public int getCollapsedTitleGravity() {
        return this.f62706a.f63156f;
    }

    public int getExpandedTitleGravity() {
        return this.f62706a.f63155e;
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public static class C26574a extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f62731a;

        /* renamed from: b */
        public float f62732b = 0.5f;

        static {
            Covode.recordClassIndex(32011);
        }

        public C26574a() {
            super(-1, -1);
        }

        public C26574a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C26574a(FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C26574a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.zh, R.attr.zi});
            this.f62731a = obtainStyledAttributes.getInt(0, 0);
            this.f62732b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }
    }

    public Typeface getCollapsedTitleTypeface() {
        C26661b bVar = this.f62706a;
        if (bVar.f63163m != null) {
            return bVar.f63163m;
        }
        return Typeface.DEFAULT;
    }

    public Typeface getExpandedTitleTypeface() {
        C26661b bVar = this.f62706a;
        if (bVar.f63164n != null) {
            return bVar.f63164n;
        }
        return Typeface.DEFAULT;
    }

    public CharSequence getTitle() {
        if (this.f62707b) {
            return this.f62706a.f63165o;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.AbstractC26571c cVar = this.f62728w;
        if (cVar != null && (parent instanceof AppBarLayout)) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (appBarLayout.f62681e != null) {
                appBarLayout.f62681e.remove(cVar);
            }
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43759a() {
        boolean z;
        if (this.f62722q != null || this.f62708c != null) {
            if (getHeight() + this.f62709d < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.f62727v;
        if (i2 >= 0) {
            return i2;
        }
        C0753ad adVar = this.f62710e;
        if (adVar != null) {
            i = adVar.mo2867b();
        } else {
            i = 0;
        }
        int i3 = C0792v.m2775i(this);
        if (i3 > 0) {
            return Math.min((i3 * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(C0792v.m2781o((View) parent));
            if (this.f62728w == null) {
                this.f62728w = new C26575b();
            }
            ((AppBarLayout) parent).mo43717a(this.f62728w);
            C0792v.m2780n(this);
        }
    }

    /* renamed from: b */
    private void m52657b() {
        if (this.f62711f) {
            Toolbar toolbar = null;
            this.f62713h = null;
            this.f62714i = null;
            int i = this.f62712g;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.f62713h = toolbar2;
                if (toolbar2 != null) {
                    this.f62714i = m52658c(toolbar2);
                }
            }
            if (this.f62713h == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.f62713h = toolbar;
            }
            m52659c();
            this.f62711f = false;
        }
    }

    /* renamed from: c */
    private void m52659c() {
        View view;
        MethodCollector.m26663i(12460);
        if (!this.f62707b && (view = this.f62715j) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f62715j);
            }
        }
        if (this.f62707b && this.f62713h != null) {
            if (this.f62715j == null) {
                this.f62715j = new View(getContext());
            }
            if (this.f62715j.getParent() == null) {
                this.f62713h.addView(this.f62715j, -1, -1);
            }
        }
        MethodCollector.m26664o(12460);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f62708c;
        boolean z2 = false;
        if (drawable == null || !drawable.isStateful()) {
            z = false;
        } else {
            z = drawable.setState(drawableState) | false;
        }
        Drawable drawable2 = this.f62722q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C26661b bVar = this.f62706a;
        if (bVar != null) {
            bVar.f63172v = drawableState;
            if ((bVar.f63160j != null && bVar.f63160j.isStateful()) || (bVar.f63159i != null && bVar.f63159i.isStateful())) {
                bVar.mo44157c();
                z2 = true;
            }
            z |= z2;
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C26574a;
    }

    public void setScrimAnimationDuration(long j) {
        this.f62726u = j;
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    class C26575b implements AppBarLayout.AbstractC26571c {
        static {
            Covode.recordClassIndex(32012);
        }

        C26575b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC26569a
        /* renamed from: a */
        public final void mo15197a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout.this.f62709d = i;
            if (CollapsingToolbarLayout.this.f62710e != null) {
                i2 = CollapsingToolbarLayout.this.f62710e.mo2867b();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                C26574a aVar = (C26574a) childAt.getLayoutParams();
                C26580d a = CollapsingToolbarLayout.m52656a(childAt);
                int i4 = aVar.f62731a;
                if (i4 == 1) {
                    a.mo43822a(C0622a.m2312a(-i, 0, CollapsingToolbarLayout.this.mo43760b(childAt)));
                } else if (i4 == 2) {
                    a.mo43822a(Math.round(((float) (-i)) * aVar.f62732b));
                }
            }
            CollapsingToolbarLayout.this.mo43759a();
            if (CollapsingToolbarLayout.this.f62708c != null && i2 > 0) {
                C0792v.m2764c(CollapsingToolbarLayout.this);
            }
            C26661b bVar = CollapsingToolbarLayout.this.f62706a;
            float a2 = C0622a.m2311a(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - C0792v.m2775i(CollapsingToolbarLayout.this)) - i2)), 0.0f, 1.0f);
            if (a2 != bVar.f63152b) {
                bVar.f63152b = a2;
                bVar.mo44155b();
            }
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f62706a.mo44156b(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f62706a.mo44158c(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f62706a.mo44154a(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f62719n = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f62718m = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f62716k = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f62717l = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f62706a.mo44160d(i);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C26574a(layoutParams);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C26661b bVar = this.f62706a;
        if (bVar.f63160j != colorStateList) {
            bVar.f63160j = colorStateList;
            bVar.mo44157c();
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C26661b bVar = this.f62706a;
        if (bVar.f63163m != typeface) {
            bVar.f63163m = typeface;
            bVar.mo44157c();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0643b.m2369a(getContext(), i));
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C26661b bVar = this.f62706a;
        if (bVar.f63159i != colorStateList) {
            bVar.f63159i = colorStateList;
            bVar.mo44157c();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C26661b bVar = this.f62706a;
        if (bVar.f63164n != typeface) {
            bVar.f63164n = typeface;
            bVar.mo44157c();
        }
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f62727v != i) {
            this.f62727v = i;
            mo43759a();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0643b.m2369a(getContext(), i));
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f62707b) {
            this.f62707b = z;
            m52661d();
            m52659c();
            requestLayout();
        }
    }

    /* renamed from: a */
    static C26580d m52656a(View view) {
        C26580d dVar = (C26580d) view.getTag(R.id.ffm);
        if (dVar != null) {
            return dVar;
        }
        C26580d dVar2 = new C26580d(view);
        view.setTag(R.id.ffm, dVar2);
        return dVar2;
    }

    /* renamed from: c */
    private View m52658c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: d */
    private static int m52660d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo43760b(View view) {
        return ((getHeight() - m52656a(view).f62751a) - view.getHeight()) - ((C26574a) view.getLayoutParams()).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C26574a(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.f62723r) {
            if (!(this.f62722q == null || (toolbar = this.f62713h) == null)) {
                C0792v.m2764c(toolbar);
            }
            this.f62723r = i;
            C0792v.m2764c(this);
        }
    }

    public void setTitle(CharSequence charSequence) {
        C26661b bVar = this.f62706a;
        if (charSequence == null || !charSequence.equals(bVar.f63165o)) {
            bVar.f63165o = charSequence;
            bVar.f63166p = null;
            bVar.mo44159d();
            bVar.mo44157c();
        }
        m52661d();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f62722q || drawable == this.f62708c) {
            return true;
        }
        return false;
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f62722q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f62722q = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.f62722q.setCallback(this);
                this.f62722q.setAlpha(this.f62723r);
            }
            C0792v.m2764c(this);
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f62708c;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f62708c.setVisible(z, false);
        }
        Drawable drawable2 = this.f62722q;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f62722q.setVisible(z, false);
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        TimeInterpolator timeInterpolator;
        int i = 0;
        if (!C0792v.m2788v(this) || isInEditMode()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f62724s != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                m52657b();
                ValueAnimator valueAnimator = this.f62725t;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f62725t = valueAnimator2;
                    valueAnimator2.setDuration(this.f62726u);
                    ValueAnimator valueAnimator3 = this.f62725t;
                    if (i2 > this.f62723r) {
                        timeInterpolator = C26555a.f62657c;
                    } else {
                        timeInterpolator = C26555a.f62658d;
                    }
                    valueAnimator3.setInterpolator(timeInterpolator);
                    this.f62725t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.google.android.material.appbar.CollapsingToolbarLayout.C265732 */

                        static {
                            Covode.recordClassIndex(32010);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.f62725t.cancel();
                }
                this.f62725t.setIntValues(this.f62723r, i2);
                this.f62725t.start();
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.f62724s = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f62708c;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f62708c = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f62708c.setState(getDrawableState());
                }
                C0705a.m2503b(this.f62708c, C0792v.m2768e(this));
                Drawable drawable4 = this.f62708c;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f62708c.setCallback(this);
                this.f62708c.setAlpha(this.f62723r);
            }
            C0792v.m2764c(this);
        }
    }

    public void draw(Canvas canvas) {
        C0753ad adVar;
        int b;
        boolean z;
        Drawable drawable;
        super.draw(canvas);
        m52657b();
        if (this.f62713h == null && (drawable = this.f62722q) != null && this.f62723r > 0) {
            drawable.mutate().setAlpha(this.f62723r);
            this.f62722q.draw(canvas);
        }
        if (this.f62707b && this.f62721p) {
            C26661b bVar = this.f62706a;
            int save = canvas.save();
            if (bVar.f63166p != null && bVar.f63151a) {
                float f = bVar.f63161k;
                float f2 = bVar.f63162l;
                if (!bVar.f63167q || bVar.f63168r == null) {
                    z = false;
                    bVar.f63174x.ascent();
                    bVar.f63174x.descent();
                } else {
                    z = true;
                    f2 += bVar.f63170t * bVar.f63171u;
                }
                if (bVar.f63171u != 1.0f) {
                    canvas.scale(bVar.f63171u, bVar.f63171u, f, f2);
                }
                if (z) {
                    canvas.drawBitmap(bVar.f63168r, f, f2, bVar.f63169s);
                } else {
                    canvas.drawText(bVar.f63166p, 0, bVar.f63166p.length(), f, f2, bVar.f63174x);
                }
            }
            canvas.restoreToCount(save);
        }
        if (this.f62708c != null && this.f62723r > 0 && (adVar = this.f62710e) != null && (b = adVar.mo2867b()) > 0) {
            this.f62708c.setBounds(0, -this.f62709d, getWidth(), b - this.f62709d);
            this.f62708c.mutate().setAlpha(this.f62723r);
            this.f62708c.draw(canvas);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        MethodCollector.m26663i(12575);
        m52657b();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C0753ad adVar = this.f62710e;
        if (adVar != null) {
            i3 = adVar.mo2867b();
        } else {
            i3 = 0;
        }
        if (mode == 0 && i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        MethodCollector.m26664o(12575);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.f62722q;
        if (drawable == null || this.f62723r <= 0 || ((view2 = this.f62714i) == null || view2 == this ? view != this.f62713h : view != view2)) {
            z = false;
        } else {
            drawable.mutate().setAlpha(this.f62723r);
            this.f62722q.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    private CollapsingToolbarLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(12456);
        this.f62711f = true;
        this.f62720o = new Rect();
        this.f62727v = -1;
        C26661b bVar = new C26661b(this);
        this.f62706a = bVar;
        bVar.f63175y = C26555a.f62659e;
        bVar.mo44157c();
        TypedArray a = C26685k.m52976a(context, attributeSet, new int[]{R.attr.o7, R.attr.o8, R.attr.pu, R.attr.tb, R.attr.tc, R.attr.td, R.attr.te, R.attr.tf, R.attr.tg, R.attr.th, R.attr.aaq, R.attr.aas, R.attr.afj, R.attr.aiw, R.attr.aiy, R.attr.aja}, 0, R.style.qx, new int[0]);
        bVar.mo44154a(a.getInt(3, 8388691));
        bVar.mo44156b(a.getInt(0, 8388627));
        int dimensionPixelSize = a.getDimensionPixelSize(4, 0);
        this.f62719n = dimensionPixelSize;
        this.f62718m = dimensionPixelSize;
        this.f62717l = dimensionPixelSize;
        this.f62716k = dimensionPixelSize;
        if (a.hasValue(7)) {
            this.f62716k = a.getDimensionPixelSize(7, 0);
        }
        if (a.hasValue(6)) {
            this.f62718m = a.getDimensionPixelSize(6, 0);
        }
        if (a.hasValue(8)) {
            this.f62717l = a.getDimensionPixelSize(8, 0);
        }
        if (a.hasValue(5)) {
            this.f62719n = a.getDimensionPixelSize(5, 0);
        }
        this.f62707b = a.getBoolean(14, true);
        setTitle(a.getText(13));
        bVar.mo44160d(R.style.j_);
        bVar.mo44158c(R.style.ik);
        if (a.hasValue(9)) {
            bVar.mo44160d(a.getResourceId(9, 0));
        }
        if (a.hasValue(1)) {
            bVar.mo44158c(a.getResourceId(1, 0));
        }
        this.f62727v = a.getDimensionPixelSize(11, -1);
        this.f62726u = (long) a.getInt(10, 600);
        setContentScrim(a.getDrawable(2));
        setStatusBarScrim(a.getDrawable(12));
        this.f62712g = a.getResourceId(15, -1);
        a.recycle();
        setWillNotDraw(false);
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.google.android.material.appbar.CollapsingToolbarLayout.C265721 */

            static {
                Covode.recordClassIndex(32009);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                C0753ad adVar2;
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                if (C0792v.m2781o(collapsingToolbarLayout)) {
                    adVar2 = adVar;
                } else {
                    adVar2 = null;
                }
                if (!C0691d.m2448a(collapsingToolbarLayout.f62710e, adVar2)) {
                    collapsingToolbarLayout.f62710e = adVar2;
                    collapsingToolbarLayout.requestLayout();
                }
                return adVar.f2888b.mo2878c();
            }
        });
        MethodCollector.m26664o(12456);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f62722q;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        boolean z2;
        boolean z3;
        int titleMarginStart;
        int titleMarginEnd;
        int i5;
        int i6;
        MethodCollector.m26663i(12680);
        super.onLayout(z, i, i2, i3, i4);
        C0753ad adVar = this.f62710e;
        if (adVar != null) {
            int b = adVar.mo2867b();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (!C0792v.m2781o(childAt) && childAt.getTop() < b) {
                    C0792v.m2767d(childAt, b);
                }
            }
        }
        if (this.f62707b && (view = this.f62715j) != null) {
            if (!C0792v.m2791y(view) || this.f62715j.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f62721p = z2;
            if (z2) {
                if (C0792v.m2768e(this) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                View view2 = this.f62714i;
                if (view2 == null) {
                    view2 = this.f62713h;
                }
                int b2 = mo43760b(view2);
                C26662c.m52941a(this, this.f62715j, this.f62720o);
                C26661b bVar = this.f62706a;
                int i8 = this.f62720o.left;
                if (z3) {
                    titleMarginStart = this.f62713h.getTitleMarginEnd();
                } else {
                    titleMarginStart = this.f62713h.getTitleMarginStart();
                }
                int i9 = i8 + titleMarginStart;
                int titleMarginTop = this.f62720o.top + b2 + this.f62713h.getTitleMarginTop();
                int i10 = this.f62720o.right;
                if (z3) {
                    titleMarginEnd = this.f62713h.getTitleMarginStart();
                } else {
                    titleMarginEnd = this.f62713h.getTitleMarginEnd();
                }
                int i11 = i10 + titleMarginEnd;
                int titleMarginBottom = (this.f62720o.bottom + b2) - this.f62713h.getTitleMarginBottom();
                if (!C26661b.m52923a(bVar.f63154d, i9, titleMarginTop, i11, titleMarginBottom)) {
                    bVar.f63154d.set(i9, titleMarginTop, i11, titleMarginBottom);
                    bVar.f63173w = true;
                    bVar.mo44153a();
                }
                C26661b bVar2 = this.f62706a;
                if (z3) {
                    i5 = this.f62718m;
                } else {
                    i5 = this.f62716k;
                }
                int i12 = this.f62720o.top + this.f62717l;
                int i13 = i3 - i;
                if (z3) {
                    i6 = this.f62716k;
                } else {
                    i6 = this.f62718m;
                }
                int i14 = i13 - i6;
                int i15 = (i4 - i2) - this.f62719n;
                if (!C26661b.m52923a(bVar2.f63153c, i5, i12, i14, i15)) {
                    bVar2.f63153c.set(i5, i12, i14, i15);
                    bVar2.f63173w = true;
                    bVar2.mo44153a();
                }
                this.f62706a.mo44157c();
            }
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            m52656a(getChildAt(i16)).mo43821a();
        }
        if (this.f62713h != null) {
            if (this.f62707b && TextUtils.isEmpty(this.f62706a.f63165o)) {
                setTitle(this.f62713h.getTitle());
            }
            View view3 = this.f62714i;
            if (view3 == null || view3 == this) {
                setMinimumHeight(m52660d(this.f62713h));
            } else {
                setMinimumHeight(m52660d(view3));
            }
        }
        mo43759a();
        MethodCollector.m26664o(12680);
    }
}
