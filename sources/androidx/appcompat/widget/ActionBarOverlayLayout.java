package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.C0787q;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class ActionBarOverlayLayout extends ViewGroup implements AbstractC0453u, AbstractC0784n {

    /* renamed from: g */
    static final int[] f1220g = {R.attr.gy, 16842841};

    /* renamed from: A */
    private final Runnable f1221A = new Runnable() {
        /* class androidx.appcompat.widget.ActionBarOverlayLayout.RunnableC03333 */

        static {
            Covode.recordClassIndex(373);
        }

        public final void run() {
            ActionBarOverlayLayout.this.mo1225a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1227e = actionBarOverlayLayout.f1223a.animate().translationY((float) (-ActionBarOverlayLayout.this.f1223a.getHeight())).setListener(ActionBarOverlayLayout.this.f1228f);
        }
    };

    /* renamed from: B */
    private final C0787q f1222B;

    /* renamed from: a */
    ActionBarContainer f1223a;

    /* renamed from: b */
    public boolean f1224b;

    /* renamed from: c */
    public boolean f1225c;

    /* renamed from: d */
    boolean f1226d;

    /* renamed from: e */
    ViewPropertyAnimator f1227e;

    /* renamed from: f */
    final AnimatorListenerAdapter f1228f = new AnimatorListenerAdapter() {
        /* class androidx.appcompat.widget.ActionBarOverlayLayout.C03311 */

        static {
            Covode.recordClassIndex(371);
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout.this.f1227e = null;
            ActionBarOverlayLayout.this.f1226d = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout.this.f1227e = null;
            ActionBarOverlayLayout.this.f1226d = false;
        }
    };

    /* renamed from: h */
    private int f1229h;

    /* renamed from: i */
    private int f1230i;

    /* renamed from: j */
    private ContentFrameLayout f1231j;

    /* renamed from: k */
    private AbstractC0454v f1232k;

    /* renamed from: l */
    private Drawable f1233l;

    /* renamed from: m */
    private boolean f1234m;

    /* renamed from: n */
    private boolean f1235n;

    /* renamed from: o */
    private int f1236o;

    /* renamed from: p */
    private int f1237p;

    /* renamed from: q */
    private final Rect f1238q = new Rect();

    /* renamed from: r */
    private final Rect f1239r = new Rect();

    /* renamed from: s */
    private final Rect f1240s = new Rect();

    /* renamed from: t */
    private final Rect f1241t = new Rect();

    /* renamed from: u */
    private final Rect f1242u = new Rect();

    /* renamed from: v */
    private final Rect f1243v = new Rect();

    /* renamed from: w */
    private final Rect f1244w = new Rect();

    /* renamed from: x */
    private AbstractC0334a f1245x;

    /* renamed from: y */
    private OverScroller f1246y;

    /* renamed from: z */
    private final Runnable f1247z = new Runnable() {
        /* class androidx.appcompat.widget.ActionBarOverlayLayout.RunnableC03322 */

        static {
            Covode.recordClassIndex(372);
        }

        public final void run() {
            ActionBarOverlayLayout.this.mo1225a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1227e = actionBarOverlayLayout.f1223a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1228f);
        }
    };

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public interface AbstractC0334a {
        static {
            Covode.recordClassIndex(374);
        }

        /* renamed from: b */
        void mo606b(int i);

        /* renamed from: e */
        void mo607e(boolean z);

        /* renamed from: k */
        void mo609k();

        /* renamed from: l */
        void mo610l();

        /* renamed from: m */
        void mo611m();
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public static class C0335b extends ViewGroup.MarginLayoutParams {
        static {
            Covode.recordClassIndex(375);
        }

        public C0335b() {
            super(-1, -1);
        }

        public C0335b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0335b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0335b();
    }

    public int getNestedScrollAxes() {
        return this.f1222B.mo2913a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1225a();
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: b */
    public final boolean mo1228b() {
        m1256i();
        return this.f1232k.mo1857f();
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: c */
    public final boolean mo1229c() {
        m1256i();
        return this.f1232k.mo1858g();
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: d */
    public final boolean mo1231d() {
        m1256i();
        return this.f1232k.mo1859h();
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: e */
    public final boolean mo1233e() {
        m1256i();
        return this.f1232k.mo1860i();
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: f */
    public final boolean mo1234f() {
        m1256i();
        return this.f1232k.mo1861j();
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: g */
    public final void mo1236g() {
        m1256i();
        this.f1232k.mo1862k();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1223a;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public CharSequence getTitle() {
        m1256i();
        return this.f1232k.mo1855e();
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: h */
    public final void mo1243h() {
        m1256i();
        this.f1232k.mo1863l();
    }

    static {
        Covode.recordClassIndex(370);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1225a() {
        removeCallbacks(this.f1247z);
        removeCallbacks(this.f1221A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1227e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    private void m1256i() {
        if (this.f1231j == null) {
            this.f1231j = (ContentFrameLayout) findViewById(R.id.by);
            this.f1223a = (ActionBarContainer) findViewById(R.id.bz);
            this.f1232k = m1253a(findViewById(R.id.bx));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0335b;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1235n = z;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0335b(layoutParams);
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: a */
    public final void mo1226a(int i) {
        m1256i();
        if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0335b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1254a(getContext());
        C0792v.m2780n(this);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1230i = i;
        AbstractC0334a aVar = this.f1245x;
        if (aVar != null) {
            aVar.mo606b(i);
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1225c) {
            this.f1225c = z;
            if (!z) {
                mo1225a();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m1256i();
        this.f1232k.mo1841a(i);
    }

    public void setLogo(int i) {
        m1256i();
        this.f1232k.mo1850b(i);
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    public void setWindowCallback(Window.Callback callback) {
        m1256i();
        this.f1232k.mo1844a(callback);
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    public void setWindowTitle(CharSequence charSequence) {
        m1256i();
        this.f1232k.mo1847a(charSequence);
    }

    public void setActionBarHideOffset(int i) {
        mo1225a();
        this.f1223a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1223a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(AbstractC0334a aVar) {
        this.f1245x = aVar;
        if (getWindowToken() != null) {
            this.f1245x.mo606b(this.f1230i);
            int i = this.f1237p;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0792v.m2780n(this);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        m1256i();
        this.f1232k.mo1842a(drawable);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f1224b = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f1234m = z2;
    }

    /* renamed from: a */
    private static AbstractC0454v m1253a(View view) {
        if (view instanceof AbstractC0454v) {
            return (AbstractC0454v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1233l != null && !this.f1234m) {
            if (this.f1223a.getVisibility() == 0) {
                i = (int) (((float) this.f1223a.getBottom()) + this.f1223a.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f1233l.setBounds(0, i, getWidth(), this.f1233l.getIntrinsicHeight() + i);
            this.f1233l.draw(canvas);
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onStopNestedScroll(View view) {
        if (this.f1225c && !this.f1226d) {
            if (this.f1236o <= this.f1223a.getHeight()) {
                mo1225a();
                postDelayed(this.f1247z, 600);
                return;
            }
            mo1225a();
            postDelayed(this.f1221A, 600);
        }
    }

    /* renamed from: a */
    private void m1254a(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1220g);
        boolean z2 = false;
        this.f1229h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1233l = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f1234m = z2;
        this.f1246y = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r3 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fitSystemWindows(android.graphics.Rect r5) {
        /*
            r4 = this;
            r4.m1256i()
            androidx.core.p037h.C0792v.m2779m(r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r4.f1223a
            r0 = 0
            boolean r3 = m1255a(r1, r5, r0)
            android.graphics.Rect r0 = r4.f1241t
            r0.set(r5)
            android.graphics.Rect r1 = r4.f1241t
            android.graphics.Rect r0 = r4.f1238q
            androidx.appcompat.widget.C0415ar.m1539a(r4, r1, r0)
            android.graphics.Rect r1 = r4.f1242u
            android.graphics.Rect r0 = r4.f1241t
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x002c
            android.graphics.Rect r1 = r4.f1242u
            android.graphics.Rect r0 = r4.f1241t
            r1.set(r0)
            r3 = 1
        L_0x002c:
            android.graphics.Rect r1 = r4.f1239r
            android.graphics.Rect r0 = r4.f1238q
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0042
            android.graphics.Rect r1 = r4.f1239r
            android.graphics.Rect r0 = r4.f1238q
            r1.set(r0)
            r0 = 1
        L_0x003e:
            r4.requestLayout()
        L_0x0041:
            return r2
        L_0x0042:
            if (r3 == 0) goto L_0x0041
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i);
        m1256i();
        int i3 = this.f1237p ^ i;
        this.f1237p = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        AbstractC0334a aVar = this.f1245x;
        if (aVar != null) {
            aVar.mo607e(!z2);
            if (z || !z2) {
                this.f1245x.mo609k();
            } else {
                this.f1245x.mo610l();
            }
        }
        if ((i3 & 256) != 0 && this.f1245x != null) {
            C0792v.m2780n(this);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1254a(context);
        this.f1222B = new C0787q();
    }

    @Override // androidx.appcompat.widget.AbstractC0453u
    /* renamed from: a */
    public final void mo1227a(Menu menu, AbstractC0318o.AbstractC0319a aVar) {
        m1256i();
        this.f1232k.mo1843a(menu, aVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        m1256i();
        measureChildWithMargins(this.f1223a, i, 0, i2, 0);
        C0335b bVar = (C0335b) this.f1223a.getLayoutParams();
        int max = Math.max(0, this.f1223a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f1223a.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1223a.getMeasuredState());
        if ((C0792v.m2779m(this) & 256) != 0) {
            z = true;
            measuredHeight = this.f1229h;
            if (this.f1235n && this.f1223a.getTabContainer() != null) {
                measuredHeight += this.f1229h;
            }
        } else {
            z = false;
            measuredHeight = this.f1223a.getVisibility() != 8 ? this.f1223a.getMeasuredHeight() : 0;
        }
        this.f1240s.set(this.f1238q);
        this.f1243v.set(this.f1241t);
        if (this.f1224b || z) {
            this.f1243v.top += measuredHeight;
            this.f1243v.bottom += 0;
        } else {
            this.f1240s.top += measuredHeight;
            this.f1240s.bottom += 0;
        }
        m1255a(this.f1231j, this.f1240s, true);
        if (!this.f1244w.equals(this.f1243v)) {
            this.f1244w.set(this.f1243v);
            this.f1231j.mo1429a(this.f1243v);
        }
        measureChildWithMargins(this.f1231j, i, 0, i2, 0);
        C0335b bVar2 = (C0335b) this.f1231j.getLayoutParams();
        int max3 = Math.max(max, this.f1231j.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f1231j.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1231j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1222B.mo2915a(i, 0);
        this.f1236o = getActionBarHideOffset();
        mo1225a();
        AbstractC0334a aVar = this.f1245x;
        if (aVar != null) {
            aVar.mo611m();
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1223a.getVisibility() != 0) {
            return false;
        }
        return this.f1225c;
    }

    /* renamed from: a */
    private static boolean m1255a(View view, Rect rect, boolean z) {
        boolean z2;
        C0335b bVar = (C0335b) view.getLayoutParams();
        if (bVar.leftMargin != rect.left) {
            bVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z2 = true;
        }
        if (bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || bVar.bottomMargin == rect.bottom) {
            return z2;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1225c || !z) {
            return false;
        }
        this.f1246y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1246y.getFinalY() > this.f1223a.getHeight()) {
            mo1225a();
            this.f1221A.run();
        } else {
            mo1225a();
            this.f1247z.run();
        }
        this.f1226d = true;
        return true;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1236o + i2;
        this.f1236o = i5;
        setActionBarHideOffset(i5);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0335b bVar = (C0335b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }
}
