package com.bytedance.tux.dialog.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.internal.C23068d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.internal.f */
public final class C23072f extends TuxButton {

    /* renamed from: e */
    private boolean f54624e = true;

    /* renamed from: f */
    private final C23068d f54625f;

    static {
        Covode.recordClassIndex(26996);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!this.f54624e) {
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23072f(Context context) {
        super(context, null, 0, 6);
        C89219l.m154719c(context, "");
        C23068d a = C23068d.C23069a.m43492a(context);
        this.f54625f = a;
        setButtonVariant(a.f54617s);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(a.f54613o));
        stateListDrawable.addState(new int[0], new ColorDrawable(a.f54609k));
        setBackground(stateListDrawable);
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        super.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{this.f54625f.f54612n, i}));
    }
}
