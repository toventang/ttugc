package com.bytedance.tux.dialog.internal.area;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.p1715d.AbstractC23047c;
import com.bytedance.tux.dialog.p1715d.C23046b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class CaptionArea extends FrameLayout {

    /* renamed from: a */
    public AbstractC23047c f54583a;

    static {
        Covode.recordClassIndex(26986);
    }

    public CaptionArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ CaptionArea(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CaptionArea(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.br);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9028);
        if (isInEditMode()) {
            C23046b bVar = new C23046b(context);
            bVar.f54549a = "I'm a title.";
            bVar.f54550b = "I'm some message";
            addView(bVar.mo37400a());
        }
        MethodCollector.m26664o(9028);
    }
}
