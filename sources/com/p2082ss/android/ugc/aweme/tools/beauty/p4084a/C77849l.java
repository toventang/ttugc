package com.p2082ss.android.ugc.aweme.tools.beauty.p4084a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77859d;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.C78088b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.l */
public final class C77849l extends C77841h {

    /* renamed from: c */
    public static final C77850a f174653c = new C77850a((byte) 0);

    /* renamed from: a */
    final C78088b f174654a;

    /* renamed from: b */
    public AbstractC89172b<? super Boolean, C89391z> f174655b;

    /* renamed from: d */
    private final Context f174656d;

    static {
        Covode.recordClassIndex(90936);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.l$a */
    public static final class C77850a {
        static {
            Covode.recordClassIndex(90937);
        }

        private C77850a() {
        }

        public /* synthetic */ C77850a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.l$b */
    static final class View$OnClickListenerC77851b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77849l f174657a;

        /* renamed from: b */
        final /* synthetic */ C77848k f174658b;

        static {
            Covode.recordClassIndex(90938);
        }

        View$OnClickListenerC77851b(C77849l lVar, C77848k kVar) {
            this.f174657a = lVar;
            this.f174658b = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f174657a.f174655b;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f174658b.f174652c));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77841h
    /* renamed from: a */
    public final void mo121453a(boolean z) {
        float f;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77849l(View view, C77859d dVar) {
        super(view, dVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        this.f174654a = (C78088b) view.findViewById(R.id.brs);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f174656d = context;
    }
}
