package com.bytedance.tux.status.refresh;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.spring.EnumC23429g;
import com.bytedance.tux.widget.spring.SpringLayout;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxRefreshLayout extends SpringLayout {
    static {
        Covode.recordClassIndex(27221);
    }

    public TuxRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ TuxRefreshLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxRefreshLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        setScrollMode(EnumC23429g.REFRESH);
        setNestedHeader(new C23272a(context, (byte) 0));
    }
}
