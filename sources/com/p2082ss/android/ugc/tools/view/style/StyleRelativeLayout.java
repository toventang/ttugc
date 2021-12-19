package com.p2082ss.android.ugc.tools.view.style;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.StyleRelativeLayout */
public class StyleRelativeLayout extends RelativeLayout {
    static {
        Covode.recordClassIndex(98964);
    }

    public StyleRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ StyleRelativeLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleRelativeLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10287);
        GradientDrawable a = C84981g.m146054a(context, attributeSet, true);
        if (a != null) {
            setBackground(a);
            MethodCollector.m26664o(10287);
            return;
        }
        MethodCollector.m26664o(10287);
    }
}
