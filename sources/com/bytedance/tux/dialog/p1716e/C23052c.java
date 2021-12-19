package com.bytedance.tux.dialog.p1716e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.dialog.e.c */
public final class C23052c extends AbstractC23057h {

    /* renamed from: a */
    public int f54560a;

    /* renamed from: b */
    public final View f54561b;

    static {
        Covode.recordClassIndex(26972);
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final View mo37400a() {
        MethodCollector.m26663i(8540);
        FrameLayout frameLayout = new FrameLayout(this.f54597f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setPadding(0, 0, 0, this.f54560a);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.f54567g));
        View view = this.f54561b;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        frameLayout.addView(view);
        MethodCollector.m26664o(8540);
        return frameLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23052c(Context context, View view) {
        super(context, 0);
        C89219l.m154719c(context, "");
        C89219l.m154719c(view, "");
        this.f54561b = view;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f54560a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
    }
}
