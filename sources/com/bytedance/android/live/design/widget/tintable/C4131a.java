package com.bytedance.android.live.design.widget.tintable;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0792v;
import com.bytedance.android.live.design.widget.p235b.AbstractC4125c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.widget.tintable.a */
public final class C4131a extends AbstractC4125c<View> {

    /* renamed from: a */
    Drawable f11561a;

    /* renamed from: b */
    private final View f11562b;

    /* renamed from: c */
    private Drawable f11563c;

    /* renamed from: d */
    private C4132a f11564d;

    static {
        Covode.recordClassIndex(4698);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.design.widget.tintable.a$a */
    public static class C4132a {

        /* renamed from: a */
        public ColorStateList f11565a;

        /* renamed from: b */
        public PorterDuff.Mode f11566b;

        /* renamed from: c */
        public boolean f11567c;

        /* renamed from: d */
        public boolean f11568d;

        static {
            Covode.recordClassIndex(4699);
        }

        private C4132a() {
        }

        /* synthetic */ C4132a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final int[] mo9513a() {
        return new int[]{R.attr.jf, R.attr.jg};
    }

    /* renamed from: c */
    public final ColorStateList mo9812c() {
        C4132a aVar = this.f11564d;
        if (aVar == null) {
            return null;
        }
        return aVar.f11565a;
    }

    /* renamed from: d */
    public final PorterDuff.Mode mo9813d() {
        C4132a aVar = this.f11564d;
        if (aVar == null) {
            return null;
        }
        return aVar.f11566b;
    }

    /* renamed from: e */
    private boolean m10073e() {
        if (this.f11561a == null || Build.VERSION.SDK_INT != 21) {
            return false;
        }
        ColorStateList r = C0792v.m2784r(this.f11562b);
        PorterDuff.Mode s = C0792v.m2785s(this.f11562b);
        if (r != null) {
            C0705a.m2496a(this.f11561a, r);
            Drawable drawable = this.f11561a;
            if (s == null) {
                s = PorterDuff.Mode.SRC_IN;
            }
            C0705a.m2499a(drawable, s);
            return true;
        }
        C0705a.m2505d(this.f11561a);
        return true;
    }

    /* renamed from: b */
    public final void mo9810b() {
        Drawable drawable;
        PorterDuff.Mode mode;
        if (!m10073e() && this.f11564d != null && (drawable = this.f11561a) != null) {
            drawable.mutate();
            if (this.f11564d.f11568d) {
                C0705a.m2496a(this.f11561a, this.f11564d.f11565a);
            }
            if (this.f11564d.f11567c) {
                Drawable drawable2 = this.f11561a;
                if (this.f11564d.f11566b != null) {
                    mode = this.f11564d.f11566b;
                } else {
                    mode = PorterDuff.Mode.SRC_IN;
                }
                C0705a.m2499a(drawable2, mode);
            }
        }
    }

    /* renamed from: a */
    public final void mo9806a(int i) {
        mo9631f(i);
    }

    public C4131a(View view) {
        super(view);
        this.f11562b = view;
    }

    /* renamed from: b */
    public final boolean mo9811b(Drawable drawable) {
        if (this.f11561a == drawable) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo9807a(ColorStateList colorStateList) {
        if (this.f11564d == null) {
            this.f11564d = new C4132a((byte) 0);
        }
        this.f11564d.f11565a = colorStateList;
        this.f11564d.f11568d = true;
        mo9810b();
    }

    /* renamed from: a */
    public final void mo9808a(PorterDuff.Mode mode) {
        if (this.f11564d == null) {
            this.f11564d = new C4132a((byte) 0);
        }
        this.f11564d.f11566b = mode;
        this.f11564d.f11567c = true;
        mo9810b();
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9512a(TypedArray typedArray) {
        ColorStateList colorStateList;
        if (typedArray.hasValue(0)) {
            int resourceId = typedArray.getResourceId(0, 0);
            if (resourceId == 0 || (colorStateList = C0196a.m618a(this.f11562b.getContext(), resourceId)) == null) {
                colorStateList = typedArray.getColorStateList(0);
            }
            C0792v.m2743a(this.f11562b, colorStateList);
        } else {
            C0792v.m2743a(this.f11562b, (ColorStateList) null);
        }
        if (typedArray.hasValue(1)) {
            C0792v.m2744a(this.f11562b, C4138g.m10090a(typedArray.getInt(1, -1), PorterDuff.Mode.SRC_IN));
        } else {
            C0792v.m2744a(this.f11562b, PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9809a(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f11563c
            if (r0 != r3) goto L_0x0005
            return
        L_0x0005:
            r2.f11563c = r3
            android.graphics.drawable.Drawable r1 = r2.f11561a
            r0 = 0
            if (r1 == 0) goto L_0x0011
            if (r1 == r3) goto L_0x0013
            r1.setCallback(r0)
        L_0x0011:
            if (r3 == 0) goto L_0x0024
        L_0x0013:
            android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.C0705a.m2506e(r3)
            r2.f11561a = r1
            if (r1 == r3) goto L_0x0020
            android.view.View r0 = r2.f11562b
            r1.setCallback(r0)
        L_0x0020:
            r2.mo9810b()
            return
        L_0x0024:
            r2.f11561a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.widget.tintable.C4131a.mo9809a(android.graphics.drawable.Drawable):void");
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9537a(AttributeSet attributeSet, int i, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f11562b.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC4133b(this));
        }
        mo9809a(this.f11562b.getBackground());
        super.mo9537a(attributeSet, i, i2);
    }
}
