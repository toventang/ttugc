package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.m */
public final class C85058m extends StyleTextView {

    /* renamed from: a */
    public boolean f190341a;

    static {
        Covode.recordClassIndex(99079);
    }

    public final boolean isFocused() {
        return this.f190341a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C85058m(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
    }

    public final void setMarqueeEnable(boolean z) {
        if (this.f190341a != z) {
            this.f190341a = z;
            onWindowFocusChanged(z);
        }
    }

    public /* synthetic */ C85058m(Context context, byte b) {
        this(context);
    }
}
