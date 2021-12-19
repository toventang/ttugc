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

/* renamed from: com.bytedance.tux.dialog.e.e */
public final class C23054e extends AbstractC23057h {

    /* renamed from: a */
    public int f54562a;

    /* renamed from: b */
    public int f54563b;

    /* renamed from: c */
    public final View f54564c;

    static {
        Covode.recordClassIndex(26974);
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final View mo37400a() {
        MethodCollector.m26663i(8388);
        View view = this.f54564c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f54562a, this.f54563b);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this.f54597f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        frameLayout.setPadding(0, a, 0, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.setBackground(new ColorDrawable(this.f54567g));
        frameLayout.addView(this.f54564c);
        MethodCollector.m26664o(8388);
        return frameLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23054e(Context context, View view) {
        super(context, 0);
        C89219l.m154719c(context, "");
        C89219l.m154719c(view, "");
        this.f54564c = view;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f54562a = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        this.f54563b = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()));
    }
}
