package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.e */
public final class C0425e {

    /* renamed from: a */
    private final View f1659a;

    /* renamed from: b */
    private final C0428h f1660b;

    /* renamed from: c */
    private int f1661c = -1;

    /* renamed from: d */
    private C0403aj f1662d;

    /* renamed from: e */
    private C0403aj f1663e;

    /* renamed from: f */
    private C0403aj f1664f;

    static {
        Covode.recordClassIndex(490);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1908a() {
        this.f1661c = -1;
        m1559b(null);
        mo1915d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ColorStateList mo1913b() {
        C0403aj ajVar = this.f1663e;
        if (ajVar != null) {
            return ajVar.f1580a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final PorterDuff.Mode mo1914c() {
        C0403aj ajVar = this.f1663e;
        if (ajVar != null) {
            return ajVar.f1581b;
        }
        return null;
    }

    /* renamed from: e */
    private boolean m1560e() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.f1662d != null) {
                return true;
            }
            return false;
        } else if (i == 21) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo1915d() {
        Drawable background = this.f1659a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1560e() || !m1558a(background)) {
            C0403aj ajVar = this.f1663e;
            if (ajVar != null) {
                C0428h.m1583a(background, ajVar, this.f1659a.getDrawableState());
                return;
            }
            C0403aj ajVar2 = this.f1662d;
            if (ajVar2 != null) {
                C0428h.m1583a(background, ajVar2, this.f1659a.getDrawableState());
            }
        }
    }

    C0425e(View view) {
        this.f1659a = view;
        this.f1660b = C0428h.m1581a();
    }

    /* renamed from: b */
    private void m1559b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1662d == null) {
                this.f1662d = new C0403aj();
            }
            this.f1662d.f1580a = colorStateList;
            this.f1662d.f1583d = true;
        } else {
            this.f1662d = null;
        }
        mo1915d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1909a(int i) {
        ColorStateList colorStateList;
        this.f1661c = i;
        C0428h hVar = this.f1660b;
        if (hVar != null) {
            colorStateList = hVar.mo1930b(this.f1659a.getContext(), i);
        } else {
            colorStateList = null;
        }
        m1559b(colorStateList);
        mo1915d();
    }

    /* renamed from: a */
    private boolean m1558a(Drawable drawable) {
        if (this.f1664f == null) {
            this.f1664f = new C0403aj();
        }
        C0403aj ajVar = this.f1664f;
        ajVar.mo1822a();
        ColorStateList r = C0792v.m2784r(this.f1659a);
        if (r != null) {
            ajVar.f1583d = true;
            ajVar.f1580a = r;
        }
        PorterDuff.Mode s = C0792v.m2785s(this.f1659a);
        if (s != null) {
            ajVar.f1582c = true;
            ajVar.f1581b = s;
        }
        if (!ajVar.f1583d && !ajVar.f1582c) {
            return false;
        }
        C0428h.m1583a(drawable, ajVar, this.f1659a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1910a(ColorStateList colorStateList) {
        if (this.f1663e == null) {
            this.f1663e = new C0403aj();
        }
        this.f1663e.f1580a = colorStateList;
        this.f1663e.f1583d = true;
        mo1915d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1911a(PorterDuff.Mode mode) {
        if (this.f1663e == null) {
            this.f1663e = new C0403aj();
        }
        this.f1663e.f1581b = mode;
        this.f1663e.f1582c = true;
        mo1915d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1912a(AttributeSet attributeSet, int i) {
        C0405al a = C0405al.m1466a(this.f1659a.getContext(), attributeSet, new int[]{16842964, R.attr.jf, R.attr.jg}, i, 0);
        try {
            if (a.mo1837f(0)) {
                this.f1661c = a.mo1838g(0, -1);
                ColorStateList b = this.f1660b.mo1930b(this.f1659a.getContext(), this.f1661c);
                if (b != null) {
                    m1559b(b);
                }
            }
            if (a.mo1837f(1)) {
                C0792v.m2743a(this.f1659a, a.mo1835e(1));
            }
            if (a.mo1837f(2)) {
                C0792v.m2744a(this.f1659a, C0455w.m1694a(a.mo1824a(2, -1), null));
            }
        } finally {
            a.f1585a.recycle();
        }
    }
}
