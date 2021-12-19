package com.bytedance.tux.dialog.internal.area;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.p1712a.AbstractC23022e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class AccessoryArea extends FrameLayout {

    /* renamed from: a */
    public AbstractC23022e f54581a;

    static {
        Covode.recordClassIndex(26984);
    }

    public AccessoryArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ AccessoryArea(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AccessoryArea(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.br);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8683);
        setVisibility(8);
        MethodCollector.m26664o(8683);
    }
}
