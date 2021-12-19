package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.covode.number.Covode;

public class ActionMenuView extends LinearLayoutCompat implements C0302h.AbstractC0304b, AbstractC0320p {

    /* renamed from: a */
    public C0302h f1283a;

    /* renamed from: b */
    public boolean f1284b;

    /* renamed from: c */
    ActionMenuPresenter f1285c;

    /* renamed from: d */
    C0302h.AbstractC0303a f1286d;

    /* renamed from: e */
    AbstractC0348e f1287e;

    /* renamed from: h */
    private Context f1288h;

    /* renamed from: i */
    private int f1289i;

    /* renamed from: j */
    private AbstractC0318o.AbstractC0319a f1290j;

    /* renamed from: k */
    private boolean f1291k;

    /* renamed from: l */
    private int f1292l;

    /* renamed from: m */
    private int f1293m;

    /* renamed from: n */
    private int f1294n;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface AbstractC0344a {
        static {
            Covode.recordClassIndex(387);
        }

        /* renamed from: c */
        boolean mo798c();

        /* renamed from: d */
        boolean mo799d();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface AbstractC0348e {
        static {
            Covode.recordClassIndex(391);
        }

        /* renamed from: a */
        boolean mo1316a(MenuItem menuItem);
    }

    static {
        Covode.recordClassIndex(386);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0345b implements AbstractC0318o.AbstractC0319a {
        static {
            Covode.recordClassIndex(388);
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final void mo559a(C0302h hVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final boolean mo560a(C0302h hVar) {
            return false;
        }

        C0345b() {
        }
    }

    public int getPopupTheme() {
        return this.f1289i;
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0346c extends LinearLayoutCompat.C0352a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1295a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1296b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1297c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1298d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1299e;

        /* renamed from: f */
        boolean f1300f;

        static {
            Covode.recordClassIndex(389);
        }

        public C0346c() {
            super(-2, -2);
        }

        public C0346c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0346c(C0346c cVar) {
            super(cVar);
            this.f1295a = cVar.f1295a;
        }

        public C0346c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: c */
    public final /* synthetic */ LinearLayoutCompat.C0352a mo1296c() {
        return m1304a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1304a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1295b();
    }

    /* renamed from: a */
    static C0346c m1304a() {
        C0346c cVar = new C0346c();
        cVar.f1367h = 16;
        return cVar;
    }

    /* renamed from: b */
    public final void mo1295b() {
        ActionMenuPresenter actionMenuPresenter = this.f1285c;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1280h();
        }
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f1285c;
        if (actionMenuPresenter.f1254i != null) {
            return actionMenuPresenter.f1254i.getDrawable();
        }
        if (actionMenuPresenter.f1256k) {
            return actionMenuPresenter.f1255j;
        }
        return null;
    }

    public Menu getMenu() {
        if (this.f1283a == null) {
            Context context = getContext();
            C0302h hVar = new C0302h(context);
            this.f1283a = hVar;
            hVar.mo953a(new C0347d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1285c = actionMenuPresenter;
            actionMenuPresenter.mo1277d();
            ActionMenuPresenter actionMenuPresenter2 = this.f1285c;
            AbstractC0318o.AbstractC0319a aVar = this.f1290j;
            if (aVar == null) {
                aVar = new C0345b();
            }
            actionMenuPresenter2.f1023f = aVar;
            this.f1283a.mo955a(this.f1285c, this.f1288h);
            this.f1285c.mo1274a(this);
        }
        return this.f1283a;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p
    /* renamed from: a */
    public final void mo817a(C0302h hVar) {
        this.f1283a = hVar;
    }

    public void setOnMenuItemClickListener(AbstractC0348e eVar) {
        this.f1287e = eVar;
    }

    public void setOverflowReserved(boolean z) {
        this.f1284b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0347d implements C0302h.AbstractC0303a {
        static {
            Covode.recordClassIndex(390);
        }

        C0347d() {
        }

        @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
        /* renamed from: a */
        public final void mo536a(C0302h hVar) {
            if (ActionMenuView.this.f1286d != null) {
                ActionMenuView.this.f1286d.mo536a(hVar);
            }
        }

        @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
        /* renamed from: a */
        public final boolean mo539a(C0302h hVar, MenuItem menuItem) {
            if (ActionMenuView.this.f1287e == null || !ActionMenuView.this.f1287e.mo1316a(menuItem)) {
                return false;
            }
            return true;
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: b */
    public final /* synthetic */ LinearLayoutCompat.C0352a mo1294b(ViewGroup.LayoutParams layoutParams) {
        return m1305a(layoutParams);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1285c.f1258m = z;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1285c = actionMenuPresenter;
        actionMenuPresenter.mo1274a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C0346c generateLayoutParams(AttributeSet attributeSet) {
        return new C0346c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof C0346c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, androidx.appcompat.widget.LinearLayoutCompat
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1305a(layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1285c;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo895a(false);
            if (this.f1285c.mo1282j()) {
                this.f1285c.mo1279g();
                this.f1285c.mo1278e();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f1285c;
        if (actionMenuPresenter.f1254i != null) {
            actionMenuPresenter.f1254i.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.f1256k = true;
        actionMenuPresenter.f1255j = drawable;
    }

    public void setPopupTheme(int i) {
        if (this.f1289i != i) {
            this.f1289i = i;
            if (i == 0) {
                this.f1288h = getContext();
            } else {
                this.f1288h = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: a */
    protected static C0346c m1305a(ViewGroup.LayoutParams layoutParams) {
        C0346c cVar;
        if (layoutParams == null) {
            return m1304a();
        }
        if (layoutParams instanceof C0346c) {
            cVar = new C0346c((C0346c) layoutParams);
        } else {
            cVar = new C0346c(layoutParams);
        }
        if (cVar.f1367h <= 0) {
            cVar.f1367h = 16;
        }
        return cVar;
    }

    /* renamed from: b */
    private boolean m1307b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof AbstractC0344a)) {
            z = false | ((AbstractC0344a) childAt).mo799d();
        }
        if (i <= 0 || !(childAt2 instanceof AbstractC0344a)) {
            return z;
        }
        return z | ((AbstractC0344a) childAt2).mo798c();
    }

    @Override // androidx.appcompat.view.menu.C0302h.AbstractC0304b
    /* renamed from: a */
    public final boolean mo818a(C0306j jVar) {
        return this.f1283a.mo957a(jVar, (AbstractC0318o) null, 0);
    }

    /* renamed from: a */
    public final void mo1293a(AbstractC0318o.AbstractC0319a aVar, C0302h.AbstractC0303a aVar2) {
        this.f1290j = aVar;
        this.f1286d = aVar2;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1293m = (int) (56.0f * f);
        this.f1294n = (int) (f * 4.0f);
        this.f1288h = context;
        this.f1289i = 0;
    }

    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    /* renamed from: a */
    static int m1303a(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        C0346c cVar = (C0346c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.mo797b()) {
            z = false;
        } else {
            z = true;
        }
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f1295a || !z) {
            z2 = false;
        }
        cVar.f1298d = z2;
        cVar.f1296b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.f1291k) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0415ar.m1540a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0346c cVar = (C0346c) childAt.getLayoutParams();
                if (cVar.f1295a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1307b(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i6 = getPaddingLeft() + cVar.leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    m1307b(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0346c cVar2 = (C0346c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1295a) {
                    int i17 = width2 - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0346c cVar3 = (C0346c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1295a) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }
}
