package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.q */
public final class C0442q extends C0438m {

    /* renamed from: b */
    final SeekBar f1704b;

    /* renamed from: c */
    public Drawable f1705c;

    /* renamed from: d */
    public ColorStateList f1706d;

    /* renamed from: e */
    public PorterDuff.Mode f1707e;

    /* renamed from: f */
    private boolean f1708f;

    /* renamed from: g */
    private boolean f1709g;

    static {
        Covode.recordClassIndex(507);
    }

    /* renamed from: a */
    private void m1613a() {
        Drawable drawable = this.f1705c;
        if (drawable == null) {
            return;
        }
        if (this.f1708f || this.f1709g) {
            Drawable e = C0705a.m2506e(drawable.mutate());
            this.f1705c = e;
            if (this.f1708f) {
                C0705a.m2496a(e, this.f1706d);
            }
            if (this.f1709g) {
                C0705a.m2499a(this.f1705c, this.f1707e);
            }
            if (this.f1705c.isStateful()) {
                this.f1705c.setState(this.f1704b.getDrawableState());
            }
        }
    }

    C0442q(SeekBar seekBar) {
        super(seekBar);
        this.f1704b = seekBar;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0438m
    /* renamed from: a */
    public final void mo1949a(AttributeSet attributeSet, int i) {
        super.mo1949a(attributeSet, i);
        C0405al a = C0405al.m1466a(this.f1704b.getContext(), attributeSet, new int[]{16843074, R.attr.air, R.attr.ais, R.attr.ait}, i, 0);
        Drawable b = a.mo1829b(0);
        if (b != null) {
            this.f1704b.setThumb(b);
        }
        Drawable a2 = a.mo1826a(1);
        Drawable drawable = this.f1705c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1705c = a2;
        if (a2 != null) {
            a2.setCallback(this.f1704b);
            C0705a.m2503b(a2, C0792v.m2768e(this.f1704b));
            if (a2.isStateful()) {
                a2.setState(this.f1704b.getDrawableState());
            }
            m1613a();
        }
        this.f1704b.invalidate();
        if (a.mo1837f(3)) {
            this.f1707e = C0455w.m1694a(a.mo1824a(3, -1), this.f1707e);
            this.f1709g = true;
        }
        if (a.mo1837f(2)) {
            this.f1706d = a.mo1835e(2);
            this.f1708f = true;
        }
        a.f1585a.recycle();
        m1613a();
    }
}
