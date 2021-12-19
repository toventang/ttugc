package com.p2082ss.android.ugc.aweme.ecommerce.util;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.j */
public final class C45565j {
    static {
        Covode.recordClassIndex(54058);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.util.j$a */
    public static final class C45566a extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f106119a;

        /* renamed from: b */
        final /* synthetic */ boolean f106120b;

        static {
            Covode.recordClassIndex(54059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45566a(AbstractC89171a aVar, boolean z) {
            super(1);
            this.f106119a = aVar;
            this.f106120b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.util.C45565j.C45566a.View$OnClickListenerC455671 */

                /* renamed from: a */
                final /* synthetic */ C45566a f106121a;

                static {
                    Covode.recordClassIndex(54060);
                }

                {
                    this.f106121a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f106121a.f106119a.invoke();
                }
            });
            tuxButton2.setTuxFont(42);
            tuxButton2.setText(tuxButton2.getContext().getString(R.string.bfs));
            tuxButton2.setButtonSize(3);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.util.j$b */
    public static final class C45568b extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f106122a;

        /* renamed from: b */
        final /* synthetic */ boolean f106123b;

        static {
            Covode.recordClassIndex(54061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45568b(AbstractC89171a aVar, boolean z) {
            super(1);
            this.f106122a = aVar;
            this.f106123b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.util.C45565j.C45568b.View$OnClickListenerC455691 */

                /* renamed from: a */
                final /* synthetic */ C45568b f106124a;

                static {
                    Covode.recordClassIndex(54062);
                }

                {
                    this.f106124a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f106124a.f106122a.invoke();
                }
            });
            tuxButton2.setTuxFont(42);
            tuxButton2.setText(tuxButton2.getContext().getString(R.string.bfs));
            tuxButton2.setButtonSize(3);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final TuxStatusView.C23263c m88112a(boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
        cVar.f55132j = new C45566a(aVar, z);
        String string = C17879g.m33106c().getString(R.string.bfu);
        C89219l.m154716b(string, "");
        cVar.mo37879a(string);
        String string2 = C17879g.m33106c().getString(R.string.bft);
        C89219l.m154716b(string2, "");
        cVar.mo37878a((CharSequence) string2);
        if (z) {
            cVar.mo37876a(0, R.drawable.ys);
        }
        return cVar;
    }

    /* renamed from: b */
    public static final TuxStatusView.C23263c m88113b(boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
        cVar.f55132j = new C45568b(aVar, z);
        String string = C17879g.m33106c().getString(R.string.bfr);
        C89219l.m154716b(string, "");
        cVar.mo37879a(string);
        String string2 = C17879g.m33106c().getString(R.string.bfq);
        C89219l.m154716b(string2, "");
        cVar.mo37878a((CharSequence) string2);
        if (z) {
            cVar.mo37876a(0, R.drawable.zb);
        }
        return cVar;
    }
}
