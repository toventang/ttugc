package com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1719f.C23142d;
import com.bytedance.tux.p1719f.p1720a.AbstractC23124a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tux.a.g.a */
public final class C79440a {
    static {
        Covode.recordClassIndex(92638);
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.a.g.a$d */
    public static final class C79445d extends AbstractC23124a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f178357a;

        static {
            Covode.recordClassIndex(92643);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
        }

        C79445d(AbstractC89171a aVar) {
            this.f178357a = aVar;
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f178357a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tux.a.g.a$a */
    public static final class C79441a extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f178353a;

        static {
            Covode.recordClassIndex(92639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79441a(AbstractC89171a aVar) {
            super(1);
            this.f178353a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setText(R.string.f96);
            tuxButton2.setButtonVariant(1);
            tuxButton2.setButtonSize(3);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a.C79441a.View$OnClickListenerC794421 */

                /* renamed from: a */
                final /* synthetic */ C79441a f178354a;

                static {
                    Covode.recordClassIndex(92640);
                }

                {
                    this.f178354a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f178354a.f178353a.invoke();
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tux.a.g.a$b */
    public static final class C79443b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C79443b f178355a = new C79443b();

        static {
            Covode.recordClassIndex(92641);
        }

        C79443b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_wifi_slash;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tux.a.g.a$c */
    public static final class C79444c extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C79444c f178356a = new C79444c();

        static {
            Covode.recordClassIndex(92642);
        }

        C79444c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_magnify_glass;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final TuxStatusView.C23263c m138168a(TuxStatusView.C23263c cVar) {
        C89219l.m154721d(cVar, "");
        TuxStatusView.C23263c a = cVar.mo37877a(C23005c.m43393a(C79443b.f178355a));
        String string = C17867d.m33078a().getString(R.string.dck);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a2 = a.mo37879a(string);
        String string2 = C17867d.m33078a().getString(R.string.acq);
        C89219l.m154716b(string2, "");
        return a2.mo37878a((CharSequence) string2);
    }

    /* renamed from: b */
    public static final TuxStatusView.C23263c m138170b(TuxStatusView.C23263c cVar) {
        C89219l.m154721d(cVar, "");
        TuxStatusView.C23263c a = cVar.mo37877a(C23005c.m43393a(C79444c.f178356a));
        String string = C17867d.m33078a().getString(R.string.cgx);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a2 = a.mo37879a(string);
        String string2 = C17867d.m33078a().getString(R.string.cgw);
        C89219l.m154716b(string2, "");
        return a2.mo37878a((CharSequence) string2);
    }

    /* renamed from: a */
    public static final TuxStatusView.C23263c m138169a(TuxStatusView.C23263c cVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        TuxStatusView.C23263c a = m138168a(cVar);
        a.f55132j = new C79441a(aVar);
        return a;
    }

    /* renamed from: b */
    public static final TuxStatusView.C23263c m138171b(TuxStatusView.C23263c cVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        String string = C17867d.m33078a().getString(R.string.cxj);
        C89219l.m154716b(string, "");
        C23142d dVar = new C23142d(string);
        dVar.mo37628a(51);
        dVar.setSpan(new C79445d(aVar), 0, string.length(), 18);
        return cVar.mo37878a(dVar);
    }
}
