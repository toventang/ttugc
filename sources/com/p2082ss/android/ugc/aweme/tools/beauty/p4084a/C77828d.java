package com.p2082ss.android.ugc.aweme.tools.beauty.p4084a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77859d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77897c;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.C78088b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.d */
public final class C77828d extends C77841h {

    /* renamed from: c */
    public static final C77829a f174598c = new C77829a((byte) 0);

    /* renamed from: a */
    final C78088b f174599a = ((C78088b) this.itemView.findViewById(R.id.brs));

    /* renamed from: b */
    public AbstractC89183m<? super ComposerBeauty, ? super Integer, C89391z> f174600b;

    /* renamed from: d */
    private final ImageView f174601d = ((ImageView) this.itemView.findViewById(R.id.bt6));

    /* renamed from: m */
    private final View f174602m = this.itemView.findViewById(R.id.brt);

    /* renamed from: n */
    private final Context f174603n;

    static {
        Covode.recordClassIndex(90915);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.d$a */
    public static final class C77829a {
        static {
            Covode.recordClassIndex(90916);
        }

        private C77829a() {
        }

        public /* synthetic */ C77829a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.d$b */
    static final class View$OnClickListenerC77830b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeauty f174604a;

        /* renamed from: b */
        final /* synthetic */ C77828d f174605b;

        /* renamed from: c */
        final /* synthetic */ boolean f174606c;

        /* renamed from: d */
        final /* synthetic */ boolean f174607d;

        static {
            Covode.recordClassIndex(90917);
        }

        View$OnClickListenerC77830b(ComposerBeauty composerBeauty, C77828d dVar, boolean z, boolean z2) {
            this.f174604a = composerBeauty;
            this.f174605b = dVar;
            this.f174606c = z;
            this.f174607d = z2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f174604a.getEnable()) {
                AbstractC77897c cVar = C77886a.f174746c;
                if (cVar != null) {
                    Context context = this.f174605b.f174638j.getContext();
                    C89219l.m154716b(context, "");
                    String string = this.f174605b.f174638j.getContext().getString(R.string.fsw);
                    C89219l.m154716b(string, "");
                    cVar.mo22725a(context, string);
                    return;
                }
                return;
            }
            AbstractC89183m<? super ComposerBeauty, ? super Integer, C89391z> mVar = this.f174605b.f174600b;
            if (mVar != null) {
                mVar.invoke(this.f174604a, Integer.valueOf(this.f174605b.getLayoutPosition()));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77828d(View view, C77859d dVar) {
        super(view, dVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f174603n = context;
    }
}
