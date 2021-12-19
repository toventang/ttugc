package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.u */
public final class C40555u {

    /* renamed from: a */
    View f94890a;

    /* renamed from: b */
    TextView f94891b;

    /* renamed from: c */
    ViewGroup f94892c;

    /* renamed from: d */
    private RelativeLayout f94893d;

    static {
        Covode.recordClassIndex(48376);
    }

    public C40555u(Context context) {
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6932);
        View inflate = LayoutInflater.from(context).inflate(R.layout.aie, (ViewGroup) null);
        this.f94891b = (TextView) inflate.findViewById(R.id.eu6);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dlx);
        this.f94893d = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(R.drawable.cc_);
        }
        this.f94890a = inflate;
        MethodCollector.m26664o(6932);
    }
}
