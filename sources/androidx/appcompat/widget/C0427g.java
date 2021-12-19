package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.widget.C0818c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.g */
public final class C0427g {

    /* renamed from: a */
    public ColorStateList f1667a;

    /* renamed from: b */
    public PorterDuff.Mode f1668b;

    /* renamed from: c */
    private final CompoundButton f1669c;

    /* renamed from: d */
    private boolean f1670d;

    /* renamed from: e */
    private boolean f1671e;

    /* renamed from: f */
    private boolean f1672f;

    static {
        Covode.recordClassIndex(492);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1922a() {
        if (this.f1672f) {
            this.f1672f = false;
            return;
        }
        this.f1672f = true;
        m1569b();
    }

    /* renamed from: b */
    private void m1569b() {
        Drawable a = C0818c.m2886a(this.f1669c);
        if (a == null) {
            return;
        }
        if (this.f1670d || this.f1671e) {
            Drawable mutate = C0705a.m2506e(a).mutate();
            if (this.f1670d) {
                C0705a.m2496a(mutate, this.f1667a);
            }
            if (this.f1671e) {
                C0705a.m2499a(mutate, this.f1668b);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1669c.getDrawableState());
            }
            this.f1669c.setButtonDrawable(mutate);
        }
    }

    C0427g(CompoundButton compoundButton) {
        this.f1669c = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo1921a(int i) {
        int i2 = Build.VERSION.SDK_INT;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1923a(ColorStateList colorStateList) {
        this.f1667a = colorStateList;
        this.f1670d = true;
        m1569b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1924a(PorterDuff.Mode mode) {
        this.f1668b = mode;
        this.f1671e = true;
        m1569b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1925a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1669c.getContext().obtainStyledAttributes(attributeSet, new int[]{16843015, R.attr.lz, R.attr.m0}, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                CompoundButton compoundButton = this.f1669c;
                compoundButton.setButtonDrawable(C0196a.m619b(compoundButton.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                C0818c.m2887a(this.f1669c, obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                C0818c.m2888a(this.f1669c, C0455w.m1694a(obtainStyledAttributes.getInt(2, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
