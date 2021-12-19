package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.widget.C0409an;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0789s;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.material.bottomnavigation.a */
public class C26600a extends FrameLayout implements AbstractC0320p.AbstractC0321a {

    /* renamed from: a */
    private static final int[] f62847a = {16842912};

    /* renamed from: b */
    private final int f62848b;

    /* renamed from: c */
    private float f62849c;

    /* renamed from: d */
    private float f62850d;

    /* renamed from: e */
    private float f62851e;

    /* renamed from: f */
    private int f62852f;

    /* renamed from: g */
    private boolean f62853g;

    /* renamed from: h */
    private ImageView f62854h;

    /* renamed from: i */
    private final TextView f62855i;

    /* renamed from: j */
    private final TextView f62856j;

    /* renamed from: k */
    private int f62857k;

    /* renamed from: l */
    private C0306j f62858l;

    /* renamed from: m */
    private ColorStateList f62859m;

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    /* renamed from: a */
    public final boolean mo796a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    public C0306j getItemData() {
        return this.f62858l;
    }

    public int getItemPosition() {
        return this.f62857k;
    }

    static {
        Covode.recordClassIndex(32046);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setItemBackground(Drawable drawable) {
        C0792v.m2746a(this, drawable);
    }

    public void setItemPosition(int i) {
        this.f62857k = i;
    }

    public C26600a(Context context) {
        this(context, (byte) 0);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f62859m = colorStateList;
        C0306j jVar = this.f62858l;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setItemBackground(int i) {
        Drawable a;
        if (i == 0) {
            a = null;
        } else {
            a = C0643b.m2369a(getContext(), i);
        }
        setItemBackground(a);
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f62855i.setTextColor(colorStateList);
            this.f62856j.setTextColor(colorStateList);
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0306j jVar = this.f62858l;
        if (jVar != null && jVar.isCheckable() && this.f62858l.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f62847a);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0705a.m2506e(drawable).mutate();
            C0705a.m2496a(drawable, this.f62859m);
        }
        this.f62854h.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f62854h.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f62854h.setLayoutParams(layoutParams);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f62852f != i) {
            this.f62852f = i;
            C0306j jVar = this.f62858l;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f62853g != z) {
            this.f62853g = z;
            C0306j jVar = this.f62858l;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C0823h.m2907a(this.f62856j, i);
        m52743a(this.f62855i.getTextSize(), this.f62856j.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C0823h.m2907a(this.f62855i, i);
        m52743a(this.f62855i.getTextSize(), this.f62856j.getTextSize());
    }

    public void setTitle(CharSequence charSequence) {
        this.f62855i.setText(charSequence);
        this.f62856j.setText(charSequence);
        C0306j jVar = this.f62858l;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f62855i.setEnabled(z);
        this.f62856j.setEnabled(z);
        this.f62854h.setEnabled(z);
        if (z) {
            C0792v.m2749a(this, C0789s.m2732a(getContext()));
        } else {
            C0792v.m2749a(this, (C0789s) null);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    /* renamed from: a */
    public final void mo795a(C0306j jVar) {
        int i;
        this.f62858l = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        C0409an.m1520a(this, jVar.getTooltipText());
        if (jVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    public void setChecked(boolean z) {
        TextView textView = this.f62856j;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f62856j;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f62855i;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f62855i;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f62852f;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m52745a(this.f62854h, this.f62848b, 49);
                    m52744a(this.f62856j, 1.0f, 1.0f, 0);
                } else {
                    m52745a(this.f62854h, this.f62848b, 17);
                    m52744a(this.f62856j, 0.5f, 0.5f, 4);
                }
                this.f62855i.setVisibility(4);
            } else if (i != 1) {
                if (i == 2) {
                    m52745a(this.f62854h, this.f62848b, 17);
                    this.f62856j.setVisibility(8);
                    this.f62855i.setVisibility(8);
                }
            } else if (z) {
                m52745a(this.f62854h, (int) (((float) this.f62848b) + this.f62849c), 49);
                m52744a(this.f62856j, 1.0f, 1.0f, 0);
                TextView textView5 = this.f62855i;
                float f = this.f62850d;
                m52744a(textView5, f, f, 4);
            } else {
                m52745a(this.f62854h, this.f62848b, 49);
                TextView textView6 = this.f62856j;
                float f2 = this.f62851e;
                m52744a(textView6, f2, f2, 4);
                m52744a(this.f62855i, 1.0f, 1.0f, 0);
            }
        } else if (this.f62853g) {
            if (z) {
                m52745a(this.f62854h, this.f62848b, 49);
                m52744a(this.f62856j, 1.0f, 1.0f, 0);
            } else {
                m52745a(this.f62854h, this.f62848b, 17);
                m52744a(this.f62856j, 0.5f, 0.5f, 4);
            }
            this.f62855i.setVisibility(4);
        } else if (z) {
            m52745a(this.f62854h, (int) (((float) this.f62848b) + this.f62849c), 49);
            m52744a(this.f62856j, 1.0f, 1.0f, 0);
            TextView textView7 = this.f62855i;
            float f3 = this.f62850d;
            m52744a(textView7, f3, f3, 4);
        } else {
            m52745a(this.f62854h, this.f62848b, 49);
            TextView textView8 = this.f62856j;
            float f4 = this.f62851e;
            m52744a(textView8, f4, f4, 4);
            m52744a(this.f62855i, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    private C26600a(Context context, byte b) {
        this(context, (char) 0);
    }

    /* renamed from: a */
    private void m52743a(float f, float f2) {
        this.f62849c = f - f2;
        this.f62850d = (f2 * 1.0f) / f;
        this.f62851e = (f * 1.0f) / f2;
    }

    private C26600a(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(11287);
        this.f62857k = -1;
        Resources resources = getResources();
        C1764a.m5927a(LayoutInflater.from(context), R.layout.vi, this, true);
        setBackgroundResource(R.drawable.a4b);
        this.f62848b = resources.getDimensionPixelSize(R.dimen.hf);
        this.f62854h = (ImageView) findViewById(R.id.bh1);
        TextView textView = (TextView) findViewById(R.id.e33);
        this.f62855i = textView;
        TextView textView2 = (TextView) findViewById(R.id.c2q);
        this.f62856j = textView2;
        C0792v.m2740a((View) textView, 2);
        C0792v.m2740a((View) textView2, 2);
        setFocusable(true);
        m52743a(textView.getTextSize(), textView2.getTextSize());
        MethodCollector.m26664o(11287);
    }

    /* renamed from: a */
    private static void m52745a(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static void m52744a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }
}
