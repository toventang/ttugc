package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtPanelLinearLayout */
public class AVDmtPanelLinearLayout extends LinearLayout {
    static {
        Covode.recordClassIndex(90860);
    }

    public AVDmtPanelLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ AVDmtPanelLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AVDmtPanelLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9669);
        Drawable a = C77795c.f174521d.mo121373a(context, attributeSet);
        if (a != null) {
            setBackground(a);
        }
        MethodCollector.m26664o(9669);
    }
}
