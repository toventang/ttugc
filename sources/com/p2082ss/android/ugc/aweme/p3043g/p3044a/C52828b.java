package com.p2082ss.android.ugc.aweme.p3043g.p3044a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.g.a.b */
public final class C52828b implements AbstractC52851e {

    /* renamed from: a */
    public final Context f121541a;

    /* renamed from: b */
    public final ViewGroup f121542b;

    /* renamed from: c */
    private final View f121543c;

    /* renamed from: d */
    private final TextView f121544d;

    static {
        Covode.recordClassIndex(62228);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52851e
    /* renamed from: b */
    public final void mo88483b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        View view = this.f121543c;
        if (view != null) {
            view.clearAnimation();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            aVar.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52851e
    /* renamed from: a */
    public final void mo88482a(AbstractC89171a<C89391z> aVar) {
        MethodCollector.m26663i(10451);
        C89219l.m154721d(aVar, "");
        TextView textView = this.f121544d;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.f121543c;
        if (view != null) {
            if (view.getAnimation() == null) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.b7));
                aVar.invoke();
            }
            MethodCollector.m26664o(10451);
            return;
        }
        MethodCollector.m26664o(10451);
    }

    public C52828b(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        this.f121541a = context;
        this.f121542b = viewGroup;
        this.f121543c = viewGroup.findViewById(R.id.e6s);
        this.f121544d = (TextView) viewGroup.findViewById(R.id.e6w);
    }
}
