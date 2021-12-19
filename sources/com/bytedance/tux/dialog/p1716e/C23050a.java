package com.bytedance.tux.dialog.p1716e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.FlexLayout;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.dialog.e.a */
public final class C23050a extends AbstractC23057h {

    /* renamed from: a */
    public int f54557a;

    /* renamed from: b */
    private Drawable f54558b;

    /* renamed from: c */
    private int f54559c;

    static {
        Covode.recordClassIndex(26970);
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final View mo37400a() {
        FlexLayout flexLayout = new FlexLayout(this.f54597f, (AttributeSet) null, 6);
        ViewGroup.LayoutParams amVar = new FlexLayout.C23372am(-1);
        flexLayout.setPadding(0, 0, 0, this.f54557a);
        flexLayout.setLayoutParams(amVar);
        flexLayout.setBackground(new ColorDrawable(this.f54567g));
        AppCompatImageView appCompatImageView = new AppCompatImageView(flexLayout.getContext());
        Drawable drawable = this.f54558b;
        if (!(drawable == null && (drawable = C0196a.m619b(appCompatImageView.getContext(), this.f54559c)) == null)) {
            double intrinsicHeight = (double) drawable.getIntrinsicHeight();
            double intrinsicWidth = (double) drawable.getIntrinsicWidth();
            Double.isNaN(intrinsicHeight);
            Double.isNaN(intrinsicWidth);
            FlexLayout.C23372am amVar2 = new FlexLayout.C23372am(-1);
            Context context = appCompatImageView.getContext();
            C89219l.m154709a((Object) context, "");
            amVar2.f55444h = FlexLayout.C23376ao.C23377a.m44026a(context, "this.width * ".concat(String.valueOf(intrinsicHeight / intrinsicWidth)), "layout_height");
            appCompatImageView.setLayoutParams(amVar2);
            appCompatImageView.setImageDrawable(drawable);
        }
        flexLayout.addView(appCompatImageView);
        return flexLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23050a(Context context, int i) {
        super(context, 0);
        C89219l.m154719c(context, "");
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f54557a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        this.f54559c = i;
    }
}
