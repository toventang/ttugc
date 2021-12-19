package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.widget.C0820e;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.widget.j */
public class C0435j {

    /* renamed from: a */
    private final ImageView f1688a;

    /* renamed from: b */
    private C0403aj f1689b;

    /* renamed from: c */
    private C0403aj f1690c;

    /* renamed from: d */
    private C0403aj f1691d;

    static {
        Covode.recordClassIndex(500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ColorStateList mo1937b() {
        C0403aj ajVar = this.f1690c;
        if (ajVar != null) {
            return ajVar.f1580a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final PorterDuff.Mode mo1938c() {
        C0403aj ajVar = this.f1690c;
        if (ajVar != null) {
            return ajVar.f1581b;
        }
        return null;
    }

    /* renamed from: e */
    private boolean m1602e() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.f1689b != null) {
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
    public final void mo1939d() {
        Drawable drawable = this.f1688a.getDrawable();
        if (drawable != null) {
            C0455w.m1696b(drawable);
            if (!m1602e() || !m1601a(drawable)) {
                C0403aj ajVar = this.f1690c;
                if (ajVar != null) {
                    C0428h.m1583a(drawable, ajVar, this.f1688a.getDrawableState());
                    return;
                }
                C0403aj ajVar2 = this.f1689b;
                if (ajVar2 != null) {
                    C0428h.m1583a(drawable, ajVar2, this.f1688a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo1936a() {
        Drawable background = this.f1688a.getBackground();
        if (Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public C0435j(ImageView imageView) {
        this.f1688a = imageView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1933a(ColorStateList colorStateList) {
        if (this.f1690c == null) {
            this.f1690c = new C0403aj();
        }
        this.f1690c.f1580a = colorStateList;
        this.f1690c.f1583d = true;
        mo1939d();
    }

    /* renamed from: a */
    private boolean m1601a(Drawable drawable) {
        if (this.f1691d == null) {
            this.f1691d = new C0403aj();
        }
        C0403aj ajVar = this.f1691d;
        ajVar.mo1822a();
        ColorStateList a = C0820e.m2894a(this.f1688a);
        if (a != null) {
            ajVar.f1583d = true;
            ajVar.f1580a = a;
        }
        PorterDuff.Mode b = C0820e.m2897b(this.f1688a);
        if (b != null) {
            ajVar.f1582c = true;
            ajVar.f1581b = b;
        }
        if (!ajVar.f1583d && !ajVar.f1582c) {
            return false;
        }
        C0428h.m1583a(drawable, ajVar, this.f1688a.getDrawableState());
        return true;
    }

    /* renamed from: a */
    public final void mo1932a(int i) {
        if (i != 0) {
            Drawable b = C0196a.m619b(this.f1688a.getContext(), i);
            if (b != null) {
                C0455w.m1696b(b);
            }
            this.f1688a.setImageDrawable(b);
        } else {
            this.f1688a.setImageDrawable(null);
        }
        mo1939d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1934a(PorterDuff.Mode mode) {
        if (this.f1690c == null) {
            this.f1690c = new C0403aj();
        }
        this.f1690c.f1581b = mode;
        this.f1690c.f1582c = true;
        mo1939d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c A[Catch:{ all -> 0x0060 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1935a(android.util.AttributeSet r6, int r7) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0435j.mo1935a(android.util.AttributeSet, int):void");
    }
}
