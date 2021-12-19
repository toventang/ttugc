package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.C0792v;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.p060l.C1097b;
import androidx.p060l.C1146q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.C26683j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.material.bottomnavigation.c */
public final class C26602c extends ViewGroup implements AbstractC0320p {

    /* renamed from: i */
    private static final int[] f62860i = {16842912};

    /* renamed from: j */
    private static final int[] f62861j = {-16842910};

    /* renamed from: a */
    final C1146q f62862a;

    /* renamed from: b */
    public boolean f62863b;

    /* renamed from: c */
    int f62864c;

    /* renamed from: d */
    C26600a[] f62865d;

    /* renamed from: e */
    int f62866e;

    /* renamed from: f */
    int f62867f;

    /* renamed from: g */
    public BottomNavigationPresenter f62868g;

    /* renamed from: h */
    public C0302h f62869h;

    /* renamed from: k */
    private final int f62870k;

    /* renamed from: l */
    private final int f62871l;

    /* renamed from: m */
    private final int f62872m;

    /* renamed from: n */
    private final int f62873n;

    /* renamed from: o */
    private final int f62874o;

    /* renamed from: p */
    private final View.OnClickListener f62875p;

    /* renamed from: q */
    private final C0693f.AbstractC0694a<C26600a> f62876q;

    /* renamed from: r */
    private ColorStateList f62877r;

    /* renamed from: s */
    private int f62878s;

    /* renamed from: t */
    private ColorStateList f62879t;

    /* renamed from: u */
    private final ColorStateList f62880u;

    /* renamed from: v */
    private int f62881v;

    /* renamed from: w */
    private int f62882w;

    /* renamed from: x */
    private Drawable f62883x;

    /* renamed from: y */
    private int f62884y;

    /* renamed from: z */
    private int[] f62885z;

    /* renamed from: a */
    static boolean m52749a(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    public final int getWindowAnimations() {
        return 0;
    }

    public final ColorStateList getIconTintList() {
        return this.f62877r;
    }

    public final int getItemBackgroundRes() {
        return this.f62884y;
    }

    public final int getItemIconSize() {
        return this.f62878s;
    }

    public final int getItemTextAppearanceActive() {
        return this.f62882w;
    }

    public final int getItemTextAppearanceInactive() {
        return this.f62881v;
    }

    public final ColorStateList getItemTextColor() {
        return this.f62879t;
    }

    public final int getLabelVisibilityMode() {
        return this.f62864c;
    }

    public final int getSelectedItemId() {
        return this.f62866e;
    }

    static {
        Covode.recordClassIndex(32048);
    }

    private C26600a getNewItem() {
        C26600a acquire = this.f62876q.acquire();
        if (acquire == null) {
            return new C26600a(getContext());
        }
        return acquire;
    }

    public final Drawable getItemBackground() {
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.f62883x;
        }
        return aVarArr[0].getBackground();
    }

    /* renamed from: a */
    public final ColorStateList mo43948a() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0196a.m618a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.oj, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f62861j;
        return new ColorStateList(new int[][]{iArr, f62860i, EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    /* renamed from: b */
    public final void mo43949b() {
        removeAllViews();
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr != null) {
            for (C26600a aVar : aVarArr) {
                if (aVar != null) {
                    this.f62876q.release(aVar);
                }
            }
        }
        if (this.f62869h.size() == 0) {
            this.f62866e = 0;
            this.f62867f = 0;
            this.f62865d = null;
            return;
        }
        this.f62865d = new C26600a[this.f62869h.size()];
        boolean a = m52749a(this.f62864c, this.f62869h.mo989i().size());
        for (int i = 0; i < this.f62869h.size(); i++) {
            this.f62868g.f62835b = true;
            this.f62869h.getItem(i).setCheckable(true);
            this.f62868g.f62835b = false;
            C26600a newItem = getNewItem();
            this.f62865d[i] = newItem;
            newItem.setIconTintList(this.f62877r);
            newItem.setIconSize(this.f62878s);
            newItem.setTextColor(this.f62880u);
            newItem.setTextAppearanceInactive(this.f62881v);
            newItem.setTextAppearanceActive(this.f62882w);
            newItem.setTextColor(this.f62879t);
            Drawable drawable = this.f62883x;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f62884y);
            }
            newItem.setShifting(a);
            newItem.setLabelVisibilityMode(this.f62864c);
            newItem.mo795a((C0306j) this.f62869h.getItem(i));
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f62875p);
            addView(newItem);
        }
        int min = Math.min(this.f62869h.size() - 1, this.f62867f);
        this.f62867f = min;
        this.f62869h.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p
    /* renamed from: a */
    public final void mo817a(C0302h hVar) {
        this.f62869h = hVar;
    }

    public final void setItemHorizontalTranslationEnabled(boolean z) {
        this.f62863b = z;
    }

    public final void setLabelVisibilityMode(int i) {
        this.f62864c = i;
    }

    public final void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f62868g = bottomNavigationPresenter;
    }

    public C26602c(Context context) {
        this(context, (byte) 0);
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        this.f62877r = colorStateList;
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr != null) {
            for (C26600a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public final void setItemBackground(Drawable drawable) {
        this.f62883x = drawable;
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr != null) {
            for (C26600a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public final void setItemBackgroundRes(int i) {
        this.f62884y = i;
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr != null) {
            for (C26600a aVar : aVarArr) {
                aVar.setItemBackground(i);
            }
        }
    }

    public final void setItemIconSize(int i) {
        this.f62878s = i;
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr != null) {
            for (C26600a aVar : aVarArr) {
                aVar.setIconSize(i);
            }
        }
    }

    public final void setItemTextAppearanceActive(int i) {
        this.f62882w = i;
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr != null) {
            for (C26600a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f62879t;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public final void setItemTextAppearanceInactive(int i) {
        this.f62881v = i;
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr != null) {
            for (C26600a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f62879t;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public final void setItemTextColor(ColorStateList colorStateList) {
        this.f62879t = colorStateList;
        C26600a[] aVarArr = this.f62865d;
        if (aVarArr != null) {
            for (C26600a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    private C26602c(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(11441);
        this.f62876q = new C0693f.C0696c(5);
        this.f62866e = 0;
        this.f62867f = 0;
        Resources resources = getResources();
        this.f62870k = resources.getDimensionPixelSize(R.dimen.hd);
        this.f62871l = resources.getDimensionPixelSize(R.dimen.he);
        this.f62872m = resources.getDimensionPixelSize(R.dimen.h8);
        this.f62873n = resources.getDimensionPixelSize(R.dimen.h9);
        this.f62874o = resources.getDimensionPixelSize(R.dimen.hb);
        this.f62880u = mo43948a();
        C1097b bVar = new C1097b();
        this.f62862a = bVar;
        bVar.mo3940a(0);
        bVar.mo3906a(115L);
        bVar.mo3907a(new C0995b());
        bVar.mo3941a(new C26683j());
        this.f62875p = new View.OnClickListener() {
            /* class com.google.android.material.bottomnavigation.C26602c.View$OnClickListenerC266031 */

            static {
                Covode.recordClassIndex(32049);
            }

            public final void onClick(View view) {
                C0306j itemData = ((C26600a) view).getItemData();
                if (!C26602c.this.f62869h.mo957a(itemData, C26602c.this.f62868g, 0)) {
                    itemData.setChecked(true);
                }
            }
        };
        this.f62885z = new int[5];
        MethodCollector.m26664o(11441);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f62869h.mo989i().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f62874o, 1073741824);
        if (!m52749a(this.f62864c, size2) || !this.f62863b) {
            if (size2 == 0) {
                i3 = 1;
            } else {
                i3 = size2;
            }
            int min = Math.min(size / i3, this.f62872m);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.f62885z;
                    iArr[i8] = min;
                    if (i7 > 0) {
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.f62885z[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f62867f);
            int i9 = this.f62873n;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f62872m, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i10 = size2 - i4;
            int min2 = Math.min(size - (this.f62871l * i10), Math.min(i9, this.f62872m));
            int i11 = size - min2;
            if (i10 == 0) {
                i5 = 1;
            } else {
                i5 = i10;
            }
            int min3 = Math.min(i11 / i5, this.f62870k);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.f62885z;
                    if (i13 == this.f62867f) {
                        i6 = min2;
                    } else {
                        i6 = min3;
                    }
                    iArr2[i13] = i6;
                    if (i12 > 0) {
                        iArr2[i13] = iArr2[i13] + 1;
                        i12--;
                    }
                } else {
                    this.f62885z[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f62885z[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, View.MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(this.f62874o, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C0792v.m2768e(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }
}
