package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22988k;
import com.bytedance.tux.p1708b.p1709a.C22973a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxSwitch extends SwitchCompat implements AbstractC23176a {

    /* renamed from: a */
    private int f54870a;

    /* renamed from: b */
    private int f54871b;

    /* renamed from: c */
    private int f54872c;

    /* renamed from: d */
    private int f54873d;

    /* renamed from: e */
    private final C22988k<TextView> f54874e;

    /* renamed from: f */
    private boolean f54875f;

    /* renamed from: g */
    private AbstractC89171a<Boolean> f54876g;

    static {
        Covode.recordClassIndex(27108);
    }

    public TuxSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public final void toggle() {
        Boolean invoke;
        AbstractC89171a<Boolean> aVar = this.f54876g;
        if (aVar == null || (invoke = aVar.invoke()) == null || !invoke.booleanValue()) {
            super.toggle();
        }
    }

    @Override // com.bytedance.tux.input.AbstractC23176a
    public final void setInterceptToggleListener(AbstractC89171a<Boolean> aVar) {
        this.f54876g = aVar;
    }

    private final void setCheckedThumbColor(int i) {
        this.f54870a = i;
        m43685a(i, this.f54871b);
    }

    private final void setCheckedTrackColor(int i) {
        this.f54872c = i;
        m43686b(i, this.f54873d);
    }

    private final void setUncheckedThumbColor(int i) {
        this.f54871b = i;
        m43685a(this.f54870a, i);
    }

    private final void setUncheckedTrackColor(int i) {
        this.f54873d = i;
        m43686b(this.f54872c, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f54875f) {
            this.f54874e.mo37303a(this, (int) R.attr.fg);
        }
    }

    /* renamed from: a */
    private final void m43685a(int i, int i2) {
        C0705a.m2496a(getThumbDrawable(), new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i, i2}));
    }

    /* renamed from: b */
    private final void m43686b(int i, int i2) {
        C0705a.m2496a(getTrackDrawable(), new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i, i2}));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        C22988k<TextView> kVar = new C22988k<>(new C22973a());
        this.f54874e = kVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aou, R.attr.aov, R.attr.arp, R.attr.arq}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        setCheckedThumbColor(obtainStyledAttributes.getColor(0, 0));
        setUncheckedThumbColor(obtainStyledAttributes.getColor(2, 0));
        setCheckedTrackColor(obtainStyledAttributes.getColor(1, 0));
        setUncheckedTrackColor(obtainStyledAttributes.getColor(3, 0));
        obtainStyledAttributes.recycle();
        this.f54875f = true;
        kVar.mo37303a(this, (int) R.attr.fg);
        m43685a(this.f54870a, this.f54871b);
        m43686b(this.f54872c, this.f54873d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.c8 : i);
    }
}
