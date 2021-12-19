package com.bytedance.tux.dialog.p1716e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.dialog.e.g */
public final class C23056g extends AbstractC23057h {

    /* renamed from: a */
    private Drawable f54565a;

    /* renamed from: b */
    private int f54566b;

    static {
        Covode.recordClassIndex(26976);
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final View mo37400a() {
        MethodCollector.m26663i(10422);
        FrameLayout frameLayout = new FrameLayout(this.f54597f);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        frameLayout.setPadding(0, a, 0, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.f54567g));
        ImageView imageView = new ImageView(frameLayout.getContext());
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system3.getDisplayMetrics()));
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system4.getDisplayMetrics())));
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        Drawable drawable = this.f54565a;
        int i = this.f54566b;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else if (i != 0) {
            imageView.setImageResource(i);
        }
        frameLayout.addView(imageView);
        MethodCollector.m26664o(10422);
        return frameLayout;
    }

    public /* synthetic */ C23056g(Context context) {
        this(context, 2131232460);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23056g(Context context, int i) {
        super(context, 0);
        C89219l.m154719c(context, "");
        this.f54566b = i;
    }
}
