package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.j */
public final class C84750j extends FrameLayout {

    /* renamed from: a */
    private final View f189377a;

    /* renamed from: b */
    private final View f189378b;

    /* renamed from: c */
    private final SimpleDraweeView f189379c;

    /* renamed from: d */
    private final TextView f189380d;

    static {
        Covode.recordClassIndex(98726);
    }

    public final View getContentView() {
        return this.f189378b;
    }

    public final SimpleDraweeView getIconImgView() {
        return this.f189379c;
    }

    public final View getRoot() {
        return this.f189377a;
    }

    public final TextView getTextView() {
        return this.f189380d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84750j(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11082);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b3q, this, true);
        C89219l.m154716b(a, "");
        this.f189377a = a;
        View findViewById = a.findViewById(R.id.bnd);
        C89219l.m154716b(findViewById, "");
        this.f189378b = findViewById;
        View findViewById2 = a.findViewById(R.id.bne);
        C89219l.m154716b(findViewById2, "");
        this.f189379c = (SimpleDraweeView) findViewById2;
        View findViewById3 = a.findViewById(R.id.bnf);
        C89219l.m154716b(findViewById3, "");
        this.f189380d = (TextView) findViewById3;
        MethodCollector.m26664o(11082);
    }

    public /* synthetic */ C84750j(Context context, byte b) {
        this(context);
    }
}
