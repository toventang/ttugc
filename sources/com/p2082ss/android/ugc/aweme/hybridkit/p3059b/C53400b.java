package com.p2082ss.android.ugc.aweme.hybridkit.p3059b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.p1107a.AbstractC15513i;
import com.bytedance.hybrid.spark.p1110d.C15559l;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.hybridkit.b.b */
public final class C53400b implements AbstractC15513i {

    /* renamed from: a */
    public View f122610a;

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.b.b$a */
    static final class View$OnClickListenerC53401a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC53401a f122611a = new View$OnClickListenerC53401a();

        static {
            Covode.recordClassIndex(62967);
        }

        View$OnClickListenerC53401a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.b.b$b */
    static final class View$OnClickListenerC53402b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC53402b f122612a = new View$OnClickListenerC53402b();

        static {
            Covode.recordClassIndex(62968);
        }

        View$OnClickListenerC53402b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.b.b$c */
    static final class View$OnClickListenerC53403c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC53403c f122613a = new View$OnClickListenerC53403c();

        static {
            Covode.recordClassIndex(62969);
        }

        View$OnClickListenerC53403c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(62966);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15513i
    /* renamed from: b */
    public final void mo25262b(int i) {
        View view = this.f122610a;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        view.setBackgroundColor(i);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15513i
    /* renamed from: a */
    public final void mo25257a(int i) {
        View view = this.f122610a;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        ((TuxTextView) view.findViewById(R.id.f63)).setTextColor(i);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15513i
    /* renamed from: b */
    public final void mo25263b(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        View view = this.f122610a;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        view.findViewById(R.id.bgk).setOnClickListener(onClickListener);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15513i
    /* renamed from: a */
    public final View mo25256a(Context context) {
        MethodCollector.m26663i(980);
        C89219l.m154721d(context, "");
        View inflate = LayoutInflater.from(context).inflate(R.layout.b0e, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        this.f122610a = inflate;
        if (inflate == null) {
            C89219l.m154710a("rootView");
        }
        inflate.setMinimumHeight((int) context.getResources().getDimension(R.dimen.tn));
        View view = this.f122610a;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        MethodCollector.m26664o(980);
        return view;
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15513i
    /* renamed from: a */
    public final void mo25258a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        View view = this.f122610a;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        view.findViewById(R.id.bgj).setOnClickListener(onClickListener);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15513i
    /* renamed from: a */
    public final void mo25259a(C15559l.C15560a.EnumC15561a aVar) {
        C89219l.m154721d(aVar, "");
        View view = this.f122610a;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        View findViewById = view.findViewById(R.id.xb);
        View view2 = this.f122610a;
        if (view2 == null) {
            C89219l.m154710a("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.yn);
        View view3 = this.f122610a;
        if (view3 == null) {
            C89219l.m154710a("rootView");
        }
        View findViewById3 = view3.findViewById(R.id.yv);
        findViewById.setOnClickListener(View$OnClickListenerC53401a.f122611a);
        findViewById2.setOnClickListener(View$OnClickListenerC53402b.f122612a);
        findViewById3.setOnClickListener(View$OnClickListenerC53403c.f122613a);
        int i = C53404c.f122614a[aVar.ordinal()];
        if (i == 1) {
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(0);
        } else if (i == 2) {
            C89219l.m154716b(findViewById2, "");
            findViewById2.setVisibility(0);
        } else if (i == 3) {
            C89219l.m154716b(findViewById3, "");
            findViewById3.setVisibility(0);
        }
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15513i
    /* renamed from: a */
    public final void mo25260a(String str) {
        C89219l.m154721d(str, "");
        View view = this.f122610a;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        View findViewById = view.findViewById(R.id.f63);
        C89219l.m154716b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15513i
    /* renamed from: a */
    public final void mo25261a(boolean z) {
        int i;
        View view = this.f122610a;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        View findViewById = view.findViewById(R.id.bgk);
        C89219l.m154716b(findViewById, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
    }
}
