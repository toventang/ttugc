package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.widget.C0409an;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.p032a.C0637f;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.core.widget.C0823h;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class NavigationMenuItemView extends C26663d implements AbstractC0320p.AbstractC0321a {

    /* renamed from: h */
    private static final int[] f63103h = {16842912};

    /* renamed from: c */
    boolean f63104c;

    /* renamed from: d */
    final CheckedTextView f63105d;

    /* renamed from: e */
    FrameLayout f63106e;

    /* renamed from: i */
    private final int f63107i;

    /* renamed from: j */
    private boolean f63108j;

    /* renamed from: k */
    private C0306j f63109k;

    /* renamed from: l */
    private ColorStateList f63110l;

    /* renamed from: m */
    private boolean f63111m;

    /* renamed from: n */
    private Drawable f63112n;

    /* renamed from: o */
    private final C0726a f63113o;

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    /* renamed from: a */
    public final boolean mo796a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    public C0306j getItemData() {
        return this.f63109k;
    }

    static {
        Covode.recordClassIndex(32110);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f63108j = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.f63105d.setCompoundDrawablePadding(i);
    }

    public void setTextAppearance(int i) {
        C0823h.m2907a(this.f63105d, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f63105d.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f63105d.setText(charSequence);
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f63105d.setChecked(z);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0306j jVar = this.f63109k;
        if (jVar != null && jVar.isCheckable() && this.f63109k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f63103h);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f63104c != z) {
            this.f63104c = z;
            this.f63113o.mo2806a(this.f63105d, 2048);
        }
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f63110l = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f63111m = z;
        C0306j jVar = this.f63109k;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    private void setActionView(View view) {
        MethodCollector.m26663i(11129);
        if (view != null) {
            if (this.f63106e == null) {
                this.f63106e = (FrameLayout) ((ViewStub) findViewById(R.id.ajz)).inflate();
            }
            this.f63106e.removeAllViews();
            this.f63106e.addView(view);
        }
        MethodCollector.m26664o(11129);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f63111m) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0705a.m2506e(drawable).mutate();
                C0705a.m2496a(drawable, this.f63110l);
            }
            int i = this.f63107i;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f63108j) {
            if (this.f63112n == null) {
                Drawable a = C0637f.m2348a(getResources(), R.drawable.b5n, getContext().getTheme());
                this.f63112n = a;
                if (a != null) {
                    int i2 = this.f63107i;
                    a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f63112n;
        }
        C0823h.m2909a(this.f63105d, drawable);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    /* renamed from: a */
    public final void mo795a(C0306j jVar) {
        int i;
        StateListDrawable stateListDrawable;
        this.f63109k = jVar;
        if (jVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.og, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f63103h, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C0792v.m2746a(this, stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C0409an.m1520a(this, jVar.getTooltipText());
        if (this.f63109k.getTitle() == null && this.f63109k.getIcon() == null && this.f63109k.getActionView() != null) {
            this.f63105d.setVisibility(8);
            FrameLayout frameLayout = this.f63106e;
            if (frameLayout != null) {
                LinearLayoutCompat.C0352a aVar = (LinearLayoutCompat.C0352a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f63106e.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f63105d.setVisibility(0);
        FrameLayout frameLayout2 = this.f63106e;
        if (frameLayout2 != null) {
            LinearLayoutCompat.C0352a aVar2 = (LinearLayoutCompat.C0352a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f63106e.setLayoutParams(aVar2);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NavigationMenuItemView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        C266571 r3 = new C0726a() {
            /* class com.google.android.material.internal.NavigationMenuItemView.C266571 */

            static {
                Covode.recordClassIndex(32111);
            }

            @Override // androidx.core.p037h.C0726a
            /* renamed from: a */
            public final void mo2808a(View view, C0733d dVar) {
                super.mo2808a(view, dVar);
                dVar.mo2836a(NavigationMenuItemView.this.f63104c);
            }
        };
        this.f63113o = r3;
        setOrientation(0);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.vu, this, true);
        this.f63107i = context.getResources().getDimensionPixelSize(R.dimen.ht);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.ak0);
        this.f63105d = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0792v.m2747a(checkedTextView, r3);
    }
}
