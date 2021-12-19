package com.bytedance.tux.dialog.internal.area;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.p1713b.AbstractC23034g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class ActionArea extends FrameLayout {

    /* renamed from: a */
    public AbstractC23034g f54582a;

    static {
        Covode.recordClassIndex(26985);
    }

    public ActionArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final AbstractC23034g getAction() {
        return this.f54582a;
    }

    private /* synthetic */ ActionArea(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActionArea(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.br);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9325);
        MethodCollector.m26664o(9325);
    }
}
