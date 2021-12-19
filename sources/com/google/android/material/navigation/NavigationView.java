package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.view.C0281g;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.widget.C0405al;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.C26664e;
import com.google.android.material.internal.C26665f;
import com.google.android.material.internal.C26678h;
import com.google.android.material.internal.C26685k;
import com.google.android.material.internal.NavigationMenuView;
import com.p2082ss.android.ugc.trill.R;

public class NavigationView extends C26678h {

    /* renamed from: d */
    private static final int[] f63226d = {16842912};

    /* renamed from: e */
    private static final int[] f63227e = {-16842910};

    /* renamed from: c */
    AbstractC26690a f63228c;

    /* renamed from: f */
    private final C26664e f63229f;

    /* renamed from: g */
    private final C26665f f63230g;

    /* renamed from: h */
    private final int f63231h;

    /* renamed from: i */
    private MenuInflater f63232i;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public interface AbstractC26690a {
        static {
            Covode.recordClassIndex(32148);
        }

        /* renamed from: a */
        boolean mo44219a();
    }

    public Menu getMenu() {
        return this.f63229f;
    }

    public MenuItem getCheckedItem() {
        return this.f63230g.f63188e.f63203b;
    }

    public Drawable getItemBackground() {
        return this.f63230g.f63194k;
    }

    public int getItemHorizontalPadding() {
        return this.f63230g.f63195l;
    }

    public int getItemIconPadding() {
        return this.f63230g.f63196m;
    }

    public ColorStateList getItemIconTintList() {
        return this.f63230g.f63193j;
    }

    public ColorStateList getItemTextColor() {
        return this.f63230g.f63192i;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.navigation.NavigationView.SavedState.C266891 */

            static {
                Covode.recordClassIndex(32147);
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
        public Bundle f63234a;

        static {
            Covode.recordClassIndex(32146);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f63234a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f63234a);
        }
    }

    public int getHeaderCount() {
        return this.f63230g.f63185b.getChildCount();
    }

    static {
        Covode.recordClassIndex(32144);
    }

    private MenuInflater getMenuInflater() {
        if (this.f63232i == null) {
            this.f63232i = new C0281g(getContext());
        }
        return this.f63232i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f63234a = new Bundle();
        this.f63229f.mo952a(savedState.f63234a);
        return savedState;
    }

    public void setNavigationItemSelectedListener(AbstractC26690a aVar) {
        this.f63228c = aVar;
    }

    public void setItemBackground(Drawable drawable) {
        this.f63230g.mo44173a(drawable);
    }

    public void setItemHorizontalPadding(int i) {
        this.f63230g.mo44175b(i);
    }

    public void setItemIconPadding(int i) {
        this.f63230g.mo44178c(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f63230g.mo44172a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f63230g.mo44171a(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f63230g.mo44176b(colorStateList);
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f63229f.findItem(i);
        if (findItem != null) {
            this.f63230g.mo44174a((C0306j) findItem);
        }
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0643b.m2369a(getContext(), i));
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f63230g.mo44175b(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPaddingResource(int i) {
        this.f63230g.mo44178c(getResources().getDimensionPixelSize(i));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        this.f63229f.mo970b(savedState.f63234a);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f63229f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f63230g.mo44174a((C0306j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // com.google.android.material.internal.C26678h
    /* renamed from: a */
    public final void mo44183a(C0753ad adVar) {
        C26665f fVar = this.f63230g;
        int b = adVar.mo2867b();
        if (fVar.f63197n != b) {
            fVar.f63197n = b;
            if (fVar.f63185b.getChildCount() == 0) {
                fVar.f63184a.setPadding(0, fVar.f63197n, 0, fVar.f63184a.getPaddingBottom());
            }
        }
        C0792v.m2757b(fVar.f63185b, adVar);
    }

    /* renamed from: a */
    private ColorStateList m52987a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0196a.m618a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.oj, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f63227e;
        return new ColorStateList(new int[][]{iArr, f63226d, EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f63231h), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f63231h, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    private NavigationView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.a68);
        ColorStateList a;
        int i;
        boolean z;
        MethodCollector.m26663i(10161);
        C26665f fVar = new C26665f();
        this.f63230g = fVar;
        C26664e eVar = new C26664e(context);
        this.f63229f = eVar;
        C0405al b2 = C26685k.m52981b(context, attributeSet, new int[]{16842964, 16842973, 16843039, R.attr.sf, R.attr.v9, R.attr.xr, R.attr.xt, R.attr.xv, R.attr.xx, R.attr.y5, R.attr.y8, R.attr.a5d}, R.attr.a68, R.style.qz, new int[0]);
        C0792v.m2746a(this, b2.mo1826a(0));
        if (b2.mo1837f(3)) {
            C0792v.m2739a(this, (float) b2.mo1834e(3, 0));
        }
        setFitsSystemWindows(b2.mo1827a(1, false));
        this.f63231h = b2.mo1834e(2, 0);
        if (b2.mo1837f(8)) {
            a = b2.mo1835e(8);
        } else {
            a = m52987a(16842808);
        }
        if (b2.mo1837f(9)) {
            i = b2.mo1838g(9, 0);
            z = true;
        } else {
            i = 0;
            z = false;
        }
        ColorStateList colorStateList = b2.mo1837f(10) ? b2.mo1835e(10) : null;
        if (!z && colorStateList == null) {
            colorStateList = m52987a(16842806);
        }
        Drawable a2 = b2.mo1826a(5);
        if (b2.mo1837f(6)) {
            fVar.mo44175b(b2.mo1834e(6, 0));
        }
        int e = b2.mo1834e(7, 0);
        eVar.mo953a(new C0302h.AbstractC0303a() {
            /* class com.google.android.material.navigation.NavigationView.C266881 */

            static {
                Covode.recordClassIndex(32145);
            }

            @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
            /* renamed from: a */
            public final void mo536a(C0302h hVar) {
            }

            @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
            /* renamed from: a */
            public final boolean mo539a(C0302h hVar, MenuItem menuItem) {
                if (NavigationView.this.f63228c == null || !NavigationView.this.f63228c.mo44219a()) {
                    return false;
                }
                return true;
            }
        });
        fVar.f63187d = 1;
        fVar.mo891a(context, eVar);
        fVar.mo44172a(a);
        if (z) {
            fVar.mo44171a(i);
        }
        fVar.mo44176b(colorStateList);
        fVar.mo44173a(a2);
        fVar.mo44178c(e);
        eVar.mo954a(fVar);
        if (fVar.f63184a == null) {
            fVar.f63184a = (NavigationMenuView) C1764a.m5927a(fVar.f63189f, R.layout.vt, this, false);
            if (fVar.f63188e == null) {
                fVar.f63188e = new C26665f.C26668b();
            }
            fVar.f63185b = (LinearLayout) C1764a.m5927a(fVar.f63189f, R.layout.vq, fVar.f63184a, false);
            fVar.f63184a.setAdapter(fVar.f63188e);
        }
        addView(fVar.f63184a);
        if (b2.mo1837f(11)) {
            int g = b2.mo1838g(11, 0);
            fVar.mo44177b(true);
            getMenuInflater().inflate(g, eVar);
            fVar.mo44177b(false);
            fVar.mo895a(false);
        }
        if (b2.mo1837f(4)) {
            fVar.f63185b.addView(C1764a.m5927a(fVar.f63189f, b2.mo1838g(4, 0), fVar.f63185b, false));
            fVar.f63184a.setPadding(0, 0, 0, fVar.f63184a.getPaddingBottom());
        }
        b2.f1585a.recycle();
        MethodCollector.m26664o(10161);
    }
}
