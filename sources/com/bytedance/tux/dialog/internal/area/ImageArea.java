package com.bytedance.tux.dialog.internal.area;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.p1716e.AbstractC23057h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public final class ImageArea extends FrameLayout {

    /* renamed from: a */
    public AbstractC23057h f54584a;

    static {
        Covode.recordClassIndex(26987);
    }

    public ImageArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final void mo37478a() {
        MethodCollector.m26663i(8876);
        removeAllViews();
        Space space = new Space(getContext());
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        space.setLayoutParams(new FrameLayout.LayoutParams(-1, C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()))));
        addView(space);
        MethodCollector.m26664o(8876);
    }

    private /* synthetic */ ImageArea(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ImageArea(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.br);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9178);
        mo37478a();
        MethodCollector.m26664o(9178);
    }
}
