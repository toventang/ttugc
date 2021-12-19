package com.p2082ss.android.ugc.aweme.tools.beauty.p4084a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77859d;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.C78088b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.e */
public final class C77831e extends C77841h {

    /* renamed from: d */
    public static final C77832a f174608d = new C77832a((byte) 0);

    /* renamed from: a */
    final C78088b f174609a = ((C78088b) this.itemView.findViewById(R.id.brs));

    /* renamed from: b */
    C77847j f174610b;

    /* renamed from: c */
    public AbstractC89183m<? super String, ? super Boolean, C89391z> f174611c;

    /* renamed from: m */
    private final Context f174612m;

    static {
        Covode.recordClassIndex(90918);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.e$a */
    public static final class C77832a {
        static {
            Covode.recordClassIndex(90919);
        }

        private C77832a() {
        }

        public /* synthetic */ C77832a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.e$b */
    static final class View$OnClickListenerC77833b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77831e f174613a;

        /* renamed from: b */
        final /* synthetic */ C77847j f174614b;

        static {
            Covode.recordClassIndex(90920);
        }

        View$OnClickListenerC77833b(C77831e eVar, C77847j jVar) {
            this.f174613a = eVar;
            this.f174614b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89183m<? super String, ? super Boolean, C89391z> mVar = this.f174613a.f174611c;
            if (mVar != null) {
                mVar.invoke(this.f174614b.f174650c, false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77831e(View view, C77859d dVar) {
        super(view, dVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Context context = view2.getContext();
        C89219l.m154716b(context, "");
        this.f174612m = context;
    }
}
