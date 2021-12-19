package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0281g;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.widget.C0405al;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.C26685k;
import com.p2082ss.android.ugc.trill.R;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: a */
    public AbstractC26599b f62839a;

    /* renamed from: b */
    public AbstractC26598a f62840b;

    /* renamed from: c */
    private final C0302h f62841c;

    /* renamed from: d */
    private final C26602c f62842d;

    /* renamed from: e */
    private final BottomNavigationPresenter f62843e;

    /* renamed from: f */
    private MenuInflater f62844f;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public interface AbstractC26598a {
        static {
            Covode.recordClassIndex(32044);
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface AbstractC26599b {
        static {
            Covode.recordClassIndex(32045);
        }

        /* renamed from: a */
        boolean mo43930a();
    }

    static {
        Covode.recordClassIndex(32040);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f62841c;
    }

    public Drawable getItemBackground() {
        return this.f62842d.getItemBackground();
    }

    public int getItemBackgroundResource() {
        return this.f62842d.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f62842d.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f62842d.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.f62842d.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f62842d.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f62842d.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f62842d.getLabelVisibilityMode();
    }

    public int getSelectedItemId() {
        return this.f62842d.getSelectedItemId();
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationView.SavedState.C265971 */

            static {
                Covode.recordClassIndex(32043);
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
        Bundle f62846a;

        static {
            Covode.recordClassIndex(32042);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f62846a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f62846a);
        }
    }

    private MenuInflater getMenuInflater() {
        if (this.f62844f == null) {
            this.f62844f = new C0281g(getContext());
        }
        return this.f62844f;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f62846a = new Bundle();
        this.f62841c.mo952a(savedState.f62846a);
        return savedState;
    }

    public void setOnNavigationItemReselectedListener(AbstractC26598a aVar) {
        this.f62840b = aVar;
    }

    public void setOnNavigationItemSelectedListener(AbstractC26599b bVar) {
        this.f62839a = bVar;
    }

    public void setItemBackground(Drawable drawable) {
        this.f62842d.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f62842d.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f62842d.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f62842d.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f62842d.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f62842d.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f62842d.setItemTextColor(colorStateList);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        this.f62841c.mo970b(savedState.f62846a);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f62842d.f62863b != z) {
            this.f62842d.setItemHorizontalTranslationEnabled(z);
            this.f62843e.mo895a(false);
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f62842d.getLabelVisibilityMode() != i) {
            this.f62842d.setLabelVisibilityMode(i);
            this.f62843e.mo895a(false);
        }
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f62841c.findItem(i);
        if (findItem != null && !this.f62841c.mo957a(findItem, this.f62843e, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private BottomNavigationView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.ks);
        MethodCollector.m26663i(13307);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.f62843e = bottomNavigationPresenter;
        C0302h bVar = new C26601b(context);
        this.f62841c = bVar;
        C26602c cVar = new C26602c(context);
        this.f62842d = cVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        cVar.setLayoutParams(layoutParams);
        bottomNavigationPresenter.f62834a = cVar;
        bottomNavigationPresenter.f62836c = 1;
        cVar.setPresenter(bottomNavigationPresenter);
        bVar.mo954a(bottomNavigationPresenter);
        bottomNavigationPresenter.mo891a(getContext(), bVar);
        C0405al b2 = C26685k.m52981b(context, attributeSet, new int[]{R.attr.sf, R.attr.xr, R.attr.xu, R.attr.xw, R.attr.xx, R.attr.y6, R.attr.y7, R.attr.y8, R.attr.z6, R.attr.a5d}, R.attr.ks, R.style.qv, 6, 5);
        if (b2.mo1837f(4)) {
            cVar.setIconTintList(b2.mo1835e(4));
        } else {
            cVar.setIconTintList(cVar.mo43948a());
        }
        setItemIconSize(b2.mo1834e(3, getResources().getDimensionPixelSize(R.dimen.hc)));
        if (b2.mo1837f(6)) {
            setItemTextAppearanceInactive(b2.mo1838g(6, 0));
        }
        if (b2.mo1837f(5)) {
            setItemTextAppearanceActive(b2.mo1838g(5, 0));
        }
        if (b2.mo1837f(7)) {
            setItemTextColor(b2.mo1835e(7));
        }
        if (b2.mo1837f(0)) {
            C0792v.m2739a(this, (float) b2.mo1834e(0, 0));
        }
        setLabelVisibilityMode(b2.mo1830c(8, -1));
        setItemHorizontalTranslationEnabled(b2.mo1827a(2, true));
        cVar.setItemBackgroundRes(b2.mo1838g(1, 0));
        if (b2.mo1837f(9)) {
            int g = b2.mo1838g(9, 0);
            bottomNavigationPresenter.f62835b = true;
            getMenuInflater().inflate(g, bVar);
            bottomNavigationPresenter.f62835b = false;
            bottomNavigationPresenter.mo895a(true);
        }
        b2.f1585a.recycle();
        addView(cVar, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            View view = new View(context);
            view.setBackgroundColor(C0643b.m2378c(context, R.color.gx));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.hg)));
            addView(view);
        }
        bVar.mo953a(new C0302h.AbstractC0303a() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationView.C265961 */

            static {
                Covode.recordClassIndex(32041);
            }

            @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
            /* renamed from: a */
            public final void mo536a(C0302h hVar) {
            }

            @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
            /* renamed from: a */
            public final boolean mo539a(C0302h hVar, MenuItem menuItem) {
                if (BottomNavigationView.this.f62840b != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                    return true;
                }
                if (BottomNavigationView.this.f62839a == null || BottomNavigationView.this.f62839a.mo43930a()) {
                    return false;
                }
                return true;
            }
        });
        MethodCollector.m26664o(13307);
    }
}
