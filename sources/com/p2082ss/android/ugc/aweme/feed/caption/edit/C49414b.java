package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxCheckBox;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.b */
public final class C49414b extends LinearLayout {

    /* renamed from: a */
    private final TuxCheckBox f113568a;

    static {
        Covode.recordClassIndex(58226);
    }

    public final TuxCheckBox getCheckbox() {
        return this.f113568a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C49414b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4060);
        View findViewById = View.inflate(context, R.layout.s0, this).findViewById(R.id.asn);
        C89219l.m154716b(findViewById, "");
        this.f113568a = (TuxCheckBox) findViewById;
        MethodCollector.m26664o(4060);
    }

    public /* synthetic */ C49414b(Context context, byte b) {
        this(context);
    }
}
