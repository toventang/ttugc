package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44071a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44083l;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44088q;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a.C44048c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44057a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44058b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44059c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44060d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44061e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44062f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44063g;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44064h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44065i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44066j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44173b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44180d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44185a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44201b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44207c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44219d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44232h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44240i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44253j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44267m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.EnumC44227f;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4621l.C89309k;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter */
public final class PaymentAdapter extends AbstractC34489c<Object> {

    /* renamed from: d */
    public final AbstractC1204m f102515d;

    static {
        Covode.recordClassIndex(52261);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder */
    public final class CardNumberElementViewHolder extends JediSimpleViewHolder<C44059c> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102533f;

        /* renamed from: g */
        private final AbstractC89244h f102534g;

        static {
            Covode.recordClassIndex(52270);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102534g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$e */
        static final class C43980e extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ CardNumberElementViewHolder f102545a;

            /* renamed from: b */
            final /* synthetic */ C44059c f102546b;

            static {
                Covode.recordClassIndex(52275);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43980e(CardNumberElementViewHolder cardNumberElementViewHolder, C44059c cVar) {
                super(0);
                this.f102545a = cardNumberElementViewHolder;
                this.f102546b = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ C89391z invoke() {
                this.f102546b.f102701a = null;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$a */
        public static final class C43976a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102535a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102536b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102537c;

            static {
                Covode.recordClassIndex(52271);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43976a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102535a = jediViewHolder;
                this.f102536b = cVar;
                this.f102537c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.CardNumberElementViewHolder.C43976a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$CardNumberElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86858x98db5765(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$c */
        static final class C43978c extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ CardNumberElementViewHolder f102540a;

            /* renamed from: b */
            final /* synthetic */ C44059c f102541b;

            static {
                Covode.recordClassIndex(52273);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43978c(CardNumberElementViewHolder cardNumberElementViewHolder, C44059c cVar) {
                super(1);
                this.f102540a = cardNumberElementViewHolder;
                this.f102541b = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
                List<? extends C44084m> list2 = list;
                String str = "";
                C89219l.m154721d(list2, str);
                PaymentViewModel m = this.f102540a.mo63351m();
                C44086o oVar = this.f102541b.f102704c;
                String str2 = this.f102541b.f102703b.f102742a;
                if (str2 != null) {
                    str = str2;
                }
                m.mo74862a(oVar, str, (List<C44084m>) list2);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$b */
        static final class C43977b extends AbstractC89220m implements AbstractC89172b<C44086o, C89391z> {

            /* renamed from: a */
            final /* synthetic */ CardNumberElementViewHolder f102538a;

            /* renamed from: b */
            final /* synthetic */ C44059c f102539b;

            static {
                Covode.recordClassIndex(52272);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43977b(CardNumberElementViewHolder cardNumberElementViewHolder, C44059c cVar) {
                super(1);
                this.f102538a = cardNumberElementViewHolder;
                this.f102539b = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C44086o oVar) {
                C44086o oVar2 = oVar;
                if (!(oVar2 == null || oVar2.mo74949a() == null)) {
                    PaymentViewModel m = this.f102538a.mo63351m();
                    C44086o oVar3 = this.f102539b.f102704c;
                    C89219l.m154721d(oVar3, "");
                    C89219l.m154721d(oVar2, "");
                    m.mo74862a(oVar3, "card_type_element", C89070n.m154522b(new C44084m("card_id_element", "card_id_element", oVar2.f102794a, null, null, 24, null), new C44084m("card_token_element", "card_token_element", oVar2.f102809p, null, null, 24, null)));
                    m.mo33689c(new PaymentViewModel.C44030b(oVar3, oVar2));
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$d */
        static final class C43979d extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, String> {

            /* renamed from: a */
            final /* synthetic */ C44207c f102542a;

            /* renamed from: b */
            final /* synthetic */ CardNumberElementViewHolder f102543b;

            /* renamed from: c */
            final /* synthetic */ C44059c f102544c;

            static {
                Covode.recordClassIndex(52274);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43979d(C44207c cVar, CardNumberElementViewHolder cardNumberElementViewHolder, C44059c cVar2) {
                super(1);
                this.f102542a = cVar;
                this.f102543b = cardNumberElementViewHolder;
                this.f102544c = cVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ String invoke(List<? extends C44084m> list) {
                C44161t tVar;
                boolean z;
                List<? extends C44084m> list2 = list;
                C89219l.m154721d(list2, "");
                String a = C44048c.m86895a(this.f102544c.f102703b, this.f102544c.f102704c, list2);
                String str = null;
                if (a != null) {
                    C44161t.f102954h[0] = ",card_number";
                } else {
                    C44161t.f102954h[0] = null;
                }
                if (!C44207c.f103100d && (tVar = this.f102543b.mo63351m().f102650d) != null) {
                    String c = this.f102544c.f102704c.mo74952c();
                    if (a == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str2 = this.f102544c.f102703b.f102742a;
                    if (str2 != null) {
                        str = C89361p.m154869a(str2, "eg_ccdc_global_", "", false);
                    }
                    tVar.mo75010a(c, z, str, this.f102542a.getMInputType());
                }
                return a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44059c cVar) {
            C44173b.C44175b bVar;
            int i;
            C44059c cVar2 = cVar;
            String str = "";
            C89219l.m154721d(cVar2, str);
            if (this.f102533f.mo33762a(this.f48794i + 1) != null) {
                boolean z = this.f102533f.mo33762a(this.f48794i + 1) instanceof C44061e;
                if (this.f102533f.mo33762a(this.f48794i + 1) instanceof C44057a) {
                    i = C45563h.f106110f;
                } else {
                    i = C45563h.f106109e;
                }
                bVar = new C44173b.C44175b(i, 0, 0, 0, false, z, 30);
            } else {
                bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            C89219l.m154716b(view, str);
            C44173b.C44174a.m86963a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.CardNumberElement");
            C44207c cVar3 = (C44207c) view2;
            cVar3.setOnPaymentMethodIdentify(new C43977b(this, cVar2));
            cVar3.setOnValueChange(new C43978c(this, cVar2));
            cVar3.setOnVerify(new C43979d(cVar3, this, cVar2));
            cVar3.setOnErrorClear(new C43980e(this, cVar2));
            C44075e eVar = cVar2.f102703b;
            C44086o oVar = cVar2.f102704c;
            PaymentViewModel m = mo63351m();
            C44086o oVar2 = cVar2.f102704c;
            String str2 = cVar2.f102703b.f102742a;
            if (str2 != null) {
                str = str2;
            }
            cVar3.mo75055a(eVar, oVar, m.mo74864b(oVar2, str), cVar2.f102701a);
            cVar3.setPaymentLogger(mo63351m().f102650d);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CardNumberElementViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102533f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102534g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.CardNumberElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder */
    public final class DateElementViewHolder extends JediSimpleViewHolder<C44060d> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102547f;

        /* renamed from: g */
        private final AbstractC89244h f102548g;

        static {
            Covode.recordClassIndex(52276);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102548g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder$d */
        static final class C43984d extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ DateElementViewHolder f102557a;

            /* renamed from: b */
            final /* synthetic */ C44060d f102558b;

            static {
                Covode.recordClassIndex(52280);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43984d(DateElementViewHolder dateElementViewHolder, C44060d dVar) {
                super(0);
                this.f102557a = dateElementViewHolder;
                this.f102558b = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ C89391z invoke() {
                this.f102558b.f102702a = null;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder$a */
        public static final class C43981a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102549a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102550b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102551c;

            static {
                Covode.recordClassIndex(52277);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43981a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102549a = jediViewHolder;
                this.f102550b = cVar;
                this.f102551c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.DateElementViewHolder.C43981a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$DateElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86861x6f4bb290(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder$b */
        static final class C43982b extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ DateElementViewHolder f102552a;

            /* renamed from: b */
            final /* synthetic */ C44060d f102553b;

            static {
                Covode.recordClassIndex(52278);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43982b(DateElementViewHolder dateElementViewHolder, C44060d dVar) {
                super(1);
                this.f102552a = dateElementViewHolder;
                this.f102553b = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
                List<? extends C44084m> list2 = list;
                String str = "";
                C89219l.m154721d(list2, str);
                PaymentViewModel m = this.f102552a.mo63351m();
                C44086o oVar = this.f102553b.f102704c;
                String str2 = this.f102553b.f102703b.f102742a;
                if (str2 != null) {
                    str = str2;
                }
                m.mo74862a(oVar, str, (List<C44084m>) list2);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder$c */
        static final class C43983c extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, String> {

            /* renamed from: a */
            final /* synthetic */ C44219d f102554a;

            /* renamed from: b */
            final /* synthetic */ DateElementViewHolder f102555b;

            /* renamed from: c */
            final /* synthetic */ C44060d f102556c;

            static {
                Covode.recordClassIndex(52279);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43983c(C44219d dVar, DateElementViewHolder dateElementViewHolder, C44060d dVar2) {
                super(1);
                this.f102554a = dVar;
                this.f102555b = dateElementViewHolder;
                this.f102556c = dVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ String invoke(List<? extends C44084m> list) {
                List<? extends C44084m> list2 = list;
                C89219l.m154721d(list2, "");
                String a = C44048c.m86895a(this.f102556c.f102703b, this.f102556c.f102704c, list2);
                boolean z = true;
                if (a != null) {
                    C44161t.f102954h[1] = ",date";
                } else {
                    C44161t.f102954h[1] = null;
                }
                C44161t tVar = this.f102555b.mo63351m().f102650d;
                if (tVar != null) {
                    String c = this.f102556c.f102704c.mo74952c();
                    if (a != null) {
                        z = false;
                    }
                    tVar.mo75010a(c, z, C44161t.m86945d(this.f102556c.f102703b.f102747f), this.f102554a.getMInputType());
                    tVar.mo75006a(C44161t.m86945d(this.f102556c.f102703b.f102747f), tVar.mo75011b(C89204ab.m154669a(DateElementViewHolder.class).mo143613b()), this.f102554a.getMInputType());
                }
                return a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44060d dVar) {
            C44173b.C44175b bVar;
            int i;
            C44060d dVar2 = dVar;
            String str = "";
            C89219l.m154721d(dVar2, str);
            if (this.f102547f.mo33762a(this.f48794i + 1) != null) {
                boolean z = this.f102547f.mo33762a(this.f48794i + 1) instanceof C44061e;
                if (this.f102547f.mo33762a(this.f48794i + 1) instanceof C44057a) {
                    i = C45563h.f106110f;
                } else {
                    i = C45563h.f106109e;
                }
                bVar = new C44173b.C44175b(i, 0, 0, 0, false, z, 30);
            } else {
                bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            C89219l.m154716b(view, str);
            C44173b.C44174a.m86963a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.DateElement");
            C44219d dVar3 = (C44219d) view2;
            dVar3.setOnValueChange(new C43982b(this, dVar2));
            dVar3.setOnVerify(new C43983c(dVar3, this, dVar2));
            dVar3.setOnErrorClear(new C43984d(this, dVar2));
            C44075e eVar = dVar2.f102703b;
            C44086o oVar = dVar2.f102704c;
            PaymentViewModel m = mo63351m();
            C44086o oVar2 = dVar2.f102704c;
            String str2 = dVar2.f102703b.f102742a;
            if (str2 != null) {
                str = str2;
            }
            dVar3.mo75055a(eVar, oVar, m.mo74864b(oVar2, str), dVar2.f102702a);
            dVar3.setPaymentLogger(mo63351m().f102650d);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DateElementViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102547f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102548g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.DateElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder */
    public final class NormalElementViewHolder extends JediSimpleViewHolder<C44062f> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102559f;

        /* renamed from: g */
        private final AbstractC89244h f102560g;

        static {
            Covode.recordClassIndex(52281);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102560g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$d */
        static final class C43988d extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ NormalElementViewHolder f102569a;

            /* renamed from: b */
            final /* synthetic */ C44062f f102570b;

            static {
                Covode.recordClassIndex(52285);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43988d(NormalElementViewHolder normalElementViewHolder, C44062f fVar) {
                super(0);
                this.f102569a = normalElementViewHolder;
                this.f102570b = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ C89391z invoke() {
                this.f102570b.f102705a = null;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$a */
        public static final class C43985a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102561a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102562b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102563c;

            static {
                Covode.recordClassIndex(52282);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43985a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102561a = jediViewHolder;
                this.f102562b = cVar;
                this.f102563c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.NormalElementViewHolder.C43985a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$NormalElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86864xe40cb537(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$b */
        static final class C43986b extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ NormalElementViewHolder f102564a;

            /* renamed from: b */
            final /* synthetic */ C44062f f102565b;

            static {
                Covode.recordClassIndex(52283);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43986b(NormalElementViewHolder normalElementViewHolder, C44062f fVar) {
                super(1);
                this.f102564a = normalElementViewHolder;
                this.f102565b = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
                List<? extends C44084m> list2 = list;
                String str = "";
                C89219l.m154721d(list2, str);
                PaymentViewModel m = this.f102564a.mo63351m();
                C44086o oVar = this.f102565b.f102704c;
                String str2 = this.f102565b.f102703b.f102742a;
                if (str2 != null) {
                    str = str2;
                }
                m.mo74862a(oVar, str, (List<C44084m>) list2);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$e */
        static final class C43989e extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C44232h f102571a;

            /* renamed from: b */
            final /* synthetic */ NormalElementViewHolder f102572b;

            /* renamed from: c */
            final /* synthetic */ C44062f f102573c;

            static {
                Covode.recordClassIndex(52286);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43989e(C44232h hVar, NormalElementViewHolder normalElementViewHolder, C44062f fVar) {
                super(1);
                this.f102571a = hVar;
                this.f102572b = normalElementViewHolder;
                this.f102573c = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                NormalElementViewHolder normalElementViewHolder = this.f102572b;
                Integer num = ((C44061e) normalElementViewHolder.aQ_()).f102703b.f102744c;
                int ordinal = EnumC44227f.Email.ordinal();
                if (num != null && num.intValue() == ordinal) {
                    normalElementViewHolder.mo63351m().mo74865b(booleanValue);
                }
                C44161t tVar = this.f102572b.mo63351m().f102650d;
                if (tVar != null) {
                    String str = null;
                    if (booleanValue) {
                        C44075e elementDTO = this.f102571a.getElementDTO();
                        if (elementDTO != null) {
                            str = elementDTO.f102747f;
                        }
                        tVar.mo75012c(C44161t.m86945d(str));
                        tVar.mo75005a(C89204ab.m154669a(NormalElementViewHolder.class).mo143613b());
                    } else {
                        C44075e elementDTO2 = this.f102571a.getElementDTO();
                        if (elementDTO2 != null) {
                            str = elementDTO2.f102747f;
                        }
                        tVar.mo75006a(C44161t.m86945d(str), tVar.mo75011b(C89204ab.m154669a(NormalElementViewHolder.class).mo143613b()), this.f102571a.getMInputMethod());
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$c */
        static final class C43987c extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, String> {

            /* renamed from: a */
            final /* synthetic */ C44232h f102566a;

            /* renamed from: b */
            final /* synthetic */ NormalElementViewHolder f102567b;

            /* renamed from: c */
            final /* synthetic */ C44062f f102568c;

            static {
                Covode.recordClassIndex(52284);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43987c(C44232h hVar, NormalElementViewHolder normalElementViewHolder, C44062f fVar) {
                super(1);
                this.f102566a = hVar;
                this.f102567b = normalElementViewHolder;
                this.f102568c = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
                if (r2 == null) goto L_0x0052;
             */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.String invoke(java.util.List<? extends com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m> r8) {
                /*
                // Method dump skipped, instructions count: 253
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.NormalElementViewHolder.C43987c.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44062f fVar) {
            C44173b.C44175b bVar;
            int i;
            C44062f fVar2 = fVar;
            String str = "";
            C89219l.m154721d(fVar2, str);
            if (this.f102559f.mo33762a(this.f48794i + 1) != null) {
                boolean z = this.f102559f.mo33762a(this.f48794i + 1) instanceof C44061e;
                if (this.f102559f.mo33762a(this.f48794i + 1) instanceof C44057a) {
                    i = C45563h.f106110f;
                } else {
                    i = C45563h.f106109e;
                }
                bVar = new C44173b.C44175b(i, 0, 0, 0, false, z, 30);
            } else {
                bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            C89219l.m154716b(view, str);
            C44173b.C44174a.m86963a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.NormalElement");
            C44232h hVar = (C44232h) view2;
            hVar.setOnValueChange(new C43986b(this, fVar2));
            hVar.setOnVerify(new C43987c(hVar, this, fVar2));
            hVar.setOnErrorClear(new C43988d(this, fVar2));
            hVar.setOnFocusChange(new C43989e(hVar, this, fVar2));
            C44075e eVar = fVar2.f102703b;
            C44086o oVar = fVar2.f102704c;
            PaymentViewModel m = mo63351m();
            C44086o oVar2 = fVar2.f102704c;
            String str2 = fVar2.f102703b.f102742a;
            if (str2 != null) {
                str = str2;
            }
            hVar.mo75055a(eVar, oVar, m.mo74864b(oVar2, str), fVar2.f102705a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NormalElementViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102559f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102560g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.NormalElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder */
    public final class PhoneElementViewHolder extends JediSimpleViewHolder<C44065i> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102591f;

        /* renamed from: g */
        private final AbstractC89244h f102592g;

        static {
            Covode.recordClassIndex(52294);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102592g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder$d */
        static final class C43998d extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ PhoneElementViewHolder f102600a;

            /* renamed from: b */
            final /* synthetic */ C44065i f102601b;

            static {
                Covode.recordClassIndex(52298);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43998d(PhoneElementViewHolder phoneElementViewHolder, C44065i iVar) {
                super(0);
                this.f102600a = phoneElementViewHolder;
                this.f102601b = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ C89391z invoke() {
                this.f102601b.f102710a = null;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder$a */
        public static final class C43995a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102593a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102594b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102595c;

            static {
                Covode.recordClassIndex(52295);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43995a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102593a = jediViewHolder;
                this.f102594b = cVar;
                this.f102595c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PhoneElementViewHolder.C43995a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$PhoneElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86873x3c18e790(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder$b */
        static final class C43996b extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ PhoneElementViewHolder f102596a;

            /* renamed from: b */
            final /* synthetic */ C44065i f102597b;

            static {
                Covode.recordClassIndex(52296);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43996b(PhoneElementViewHolder phoneElementViewHolder, C44065i iVar) {
                super(1);
                this.f102596a = phoneElementViewHolder;
                this.f102597b = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
                List<? extends C44084m> list2 = list;
                String str = "";
                C89219l.m154721d(list2, str);
                PaymentViewModel m = this.f102596a.mo63351m();
                C44086o oVar = this.f102597b.f102704c;
                String str2 = this.f102597b.f102703b.f102742a;
                if (str2 != null) {
                    str = str2;
                }
                m.mo74862a(oVar, str, (List<C44084m>) list2);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder$c */
        static final class C43997c extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, String> {

            /* renamed from: a */
            final /* synthetic */ PhoneElementViewHolder f102598a;

            /* renamed from: b */
            final /* synthetic */ C44065i f102599b;

            static {
                Covode.recordClassIndex(52297);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43997c(PhoneElementViewHolder phoneElementViewHolder, C44065i iVar) {
                super(1);
                this.f102598a = phoneElementViewHolder;
                this.f102599b = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ String invoke(List<? extends C44084m> list) {
                boolean z;
                List<? extends C44084m> list2 = list;
                C89219l.m154721d(list2, "");
                String a = C44048c.m86895a(this.f102599b.f102703b, this.f102599b.f102704c, list2);
                C44161t tVar = this.f102598a.mo63351m().f102650d;
                if (tVar != null) {
                    String c = this.f102599b.f102704c.mo74952c();
                    if (a == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tVar.mo75010a((C44161t) c, (String) z, (boolean) this.f102599b.f102703b.f102742a, (String) null);
                }
                return a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44065i iVar) {
            C44173b.C44175b bVar;
            int i;
            C44065i iVar2 = iVar;
            String str = "";
            C89219l.m154721d(iVar2, str);
            if (this.f102591f.mo33762a(this.f48794i + 1) != null) {
                boolean z = this.f102591f.mo33762a(this.f48794i + 1) instanceof C44061e;
                if (this.f102591f.mo33762a(this.f48794i + 1) instanceof C44057a) {
                    i = C45563h.f106110f;
                } else {
                    i = C45563h.f106109e;
                }
                bVar = new C44173b.C44175b(i, 0, 0, 0, false, z, 30);
            } else {
                bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            C89219l.m154716b(view, str);
            C44173b.C44174a.m86963a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.PhoneElement");
            C44253j jVar = (C44253j) view2;
            jVar.setOnValueChange(new C43996b(this, iVar2));
            jVar.setOnVerify(new C43997c(this, iVar2));
            jVar.setOnErrorClear(new C43998d(this, iVar2));
            C44075e eVar = iVar2.f102703b;
            C44086o oVar = iVar2.f102704c;
            PaymentViewModel m = mo63351m();
            C44086o oVar2 = iVar2.f102704c;
            String str2 = iVar2.f102703b.f102742a;
            if (str2 != null) {
                str = str2;
            }
            jVar.mo75055a(eVar, oVar, m.mo74864b(oVar2, str), iVar2.f102710a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PhoneElementViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102591f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102592g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PhoneElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AddressElementViewHolder */
    public final class AddressElementViewHolder extends JediSimpleViewHolder<C44057a> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102516f;

        /* renamed from: g */
        private final AbstractC89244h f102517g;

        static {
            Covode.recordClassIndex(52262);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102517g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AddressElementViewHolder$a */
        public static final class C43971a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102518a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102519b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102520c;

            static {
                Covode.recordClassIndex(52263);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43971a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102518a = jediViewHolder;
                this.f102519b = cVar;
                this.f102520c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.AddressElementViewHolder.C43971a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$AddressElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86851x47c6a4a(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AddressElementViewHolder$c */
        static final class C43973c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AddressElementViewHolder f102523a;

            /* renamed from: b */
            final /* synthetic */ C44057a f102524b;

            static {
                Covode.recordClassIndex(52265);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43973c(AddressElementViewHolder addressElementViewHolder, C44057a aVar) {
                super(1);
                this.f102523a = addressElementViewHolder;
                this.f102524b = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                this.f102523a.mo63351m().f102651e = bool.booleanValue();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AddressElementViewHolder$b */
        static final class C43972b extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AddressElementViewHolder f102521a;

            /* renamed from: b */
            final /* synthetic */ C44057a f102522b;

            static {
                Covode.recordClassIndex(52264);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43972b(AddressElementViewHolder addressElementViewHolder, C44057a aVar) {
                super(1);
                this.f102521a = addressElementViewHolder;
                this.f102522b = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
                List<? extends C44084m> list2 = list;
                String str = "";
                C89219l.m154721d(list2, str);
                PaymentViewModel m = this.f102521a.mo63351m();
                C44086o oVar = this.f102522b.f102704c;
                String str2 = this.f102522b.f102703b.f102742a;
                if (str2 != null) {
                    str = str2;
                }
                m.mo74862a(oVar, str, (List<C44084m>) list2);
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44057a aVar) {
            C44173b.C44175b bVar;
            C44057a aVar2 = aVar;
            String str = "";
            C89219l.m154721d(aVar2, str);
            if (this.f102516f.mo33762a(this.f48794i + 1) != null) {
                bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, this.f102516f.mo33762a(this.f48794i + 1) instanceof C44061e, 30);
            } else {
                bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            C89219l.m154716b(view, str);
            C44173b.C44174a.m86963a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AddressElement");
            C44185a aVar3 = (C44185a) view2;
            aVar3.setOnValueChange(new C43972b(this, aVar2));
            aVar3.setOnUseShippingAddressChange(new C43973c(this, aVar2));
            aVar3.setOnRegionPanelStatus(mo63351m().f102647a);
            aVar3.setShippingAddress(mo63351m().f102648b);
            aVar3.setUseShippingAddress(mo63351m().f102651e);
            aVar3.setLogger(mo63351m().f102650d);
            C44075e eVar = aVar2.f102703b;
            C44086o oVar = aVar2.f102704c;
            PaymentViewModel m = mo63351m();
            C44086o oVar2 = aVar2.f102704c;
            String str2 = aVar2.f102703b.f102742a;
            if (str2 != null) {
                str = str2;
            }
            aVar3.mo75055a(eVar, oVar, m.mo74864b(oVar2, str), aVar2.f102699a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddressElementViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102516f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AddressElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AddressElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102517g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.AddressElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$BalanceElementViewHolder */
    public final class BalanceElementViewHolder extends JediSimpleViewHolder<C44058b> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102526f;

        /* renamed from: g */
        private final AbstractC89244h f102527g;

        static {
            Covode.recordClassIndex(52267);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102527g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$BalanceElementViewHolder$a */
        public static final class C43974a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102528a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102529b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102530c;

            static {
                Covode.recordClassIndex(52268);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43974a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102528a = jediViewHolder;
                this.f102529b = cVar;
                this.f102530c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.BalanceElementViewHolder.C43974a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$BalanceElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86855xf99c1262(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$BalanceElementViewHolder$b */
        static final class C43975b extends AbstractC89220m implements AbstractC89172b<String, String> {

            /* renamed from: a */
            final /* synthetic */ BalanceElementViewHolder f102531a;

            /* renamed from: b */
            final /* synthetic */ C44058b f102532b;

            static {
                Covode.recordClassIndex(52269);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43975b(BalanceElementViewHolder balanceElementViewHolder, C44058b bVar) {
                super(1);
                this.f102531a = balanceElementViewHolder;
                this.f102532b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ String invoke(String str) {
                boolean z;
                T t;
                String paymentMethodBindUrl;
                String str2 = str;
                PaymentViewModel m = this.f102531a.mo63351m();
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return null;
                }
                m.f102655l = str2;
                Iterator<T> it = m.f102654k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.getPaymentMethodId(), (Object) str2)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null && (paymentMethodBindUrl = t2.getPaymentMethodBindUrl()) != null && paymentMethodBindUrl.length() != 0) {
                    return paymentMethodBindUrl;
                }
                m.mo33689c(PaymentViewModel.C44032d.f102660a);
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44058b bVar) {
            C44058b bVar2 = bVar;
            String str = "";
            C89219l.m154721d(bVar2, str);
            View view = this.itemView;
            C89219l.m154716b(view, str);
            C44173b.C44174a.m86963a(view, new C44173b.C44175b(0, 0, 0, 0, true, false, 47));
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.BalanceElement");
            C44201b bVar3 = (C44201b) view2;
            bVar3.setGetBindUrl(new C43975b(this, bVar2));
            C44075e eVar = bVar2.f102703b;
            C44086o oVar = bVar2.f102704c;
            PaymentViewModel m = mo63351m();
            C44086o oVar2 = bVar2.f102704c;
            String str2 = bVar2.f102703b.f102742a;
            if (str2 != null) {
                str = str2;
            }
            bVar3.mo75055a(eVar, oVar, m.mo74864b(oVar2, str), bVar2.f102700a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public BalanceElementViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102526f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$BalanceElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$BalanceElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102527g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.BalanceElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$OptionElementViewHolder */
    public final class OptionElementViewHolder extends JediSimpleViewHolder<C44063g> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102574f;

        /* renamed from: g */
        private final AbstractC89244h f102575g;

        static {
            Covode.recordClassIndex(52287);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102575g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$OptionElementViewHolder$a */
        public static final class C43990a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102576a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102577b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102578c;

            static {
                Covode.recordClassIndex(52288);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43990a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102576a = jediViewHolder;
                this.f102577b = cVar;
                this.f102578c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.OptionElementViewHolder.C43990a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$OptionElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86867xf89339e9(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$OptionElementViewHolder$b */
        static final class C43991b extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ OptionElementViewHolder f102579a;

            /* renamed from: b */
            final /* synthetic */ C44063g f102580b;

            static {
                Covode.recordClassIndex(52289);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43991b(OptionElementViewHolder optionElementViewHolder, C44063g gVar) {
                super(1);
                this.f102579a = optionElementViewHolder;
                this.f102580b = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
                String str;
                List<? extends C44084m> list2 = list;
                String str2 = "";
                C89219l.m154721d(list2, str2);
                PaymentViewModel m = this.f102579a.mo63351m();
                C44086o oVar = this.f102580b.f102704c;
                String str3 = this.f102580b.f102703b.f102742a;
                if (str3 != null) {
                    str2 = str3;
                }
                m.mo74862a(oVar, str2, (List<C44084m>) list2);
                C44161t tVar = this.f102579a.mo63351m().f102650d;
                if (tVar != null) {
                    String c = this.f102580b.f102704c.mo74952c();
                    String str4 = this.f102580b.f102703b.f102742a;
                    C44084m mVar = (C44084m) C89070n.m154561b((List) list2, 0);
                    if (mVar != null) {
                        str = mVar.getParamValue();
                    } else {
                        str = null;
                    }
                    tVar.mo75010a(c, true, str4, str);
                }
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44063g gVar) {
            C44173b.C44175b bVar;
            C44063g gVar2 = gVar;
            String str = "";
            C89219l.m154721d(gVar2, str);
            if (this.f102574f.mo33762a(this.f48794i + 1) != null) {
                bVar = null;
            } else {
                bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            C89219l.m154716b(view, str);
            C44173b.C44174a.m86963a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.OptionElement");
            C44240i iVar = (C44240i) view2;
            iVar.setOnValueChange(new C43991b(this, gVar2));
            C44075e eVar = gVar2.f102703b;
            C44086o oVar = gVar2.f102704c;
            PaymentViewModel m = mo63351m();
            C44086o oVar2 = gVar2.f102704c;
            String str2 = gVar2.f102703b.f102742a;
            if (str2 != null) {
                str = str2;
            }
            iVar.mo75055a(eVar, oVar, m.mo74864b(oVar2, str), gVar2.f102706a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public OptionElementViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102574f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$OptionElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$OptionElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102575g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.OptionElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PaymentMethodViewHolder */
    public final class PaymentMethodViewHolder extends JediSimpleViewHolder<C44064h> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102581f;

        /* renamed from: g */
        private final AbstractC89244h f102582g;

        static {
            Covode.recordClassIndex(52290);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102582g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PaymentMethodViewHolder$a */
        public static final class C43992a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102583a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102584b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102585c;

            static {
                Covode.recordClassIndex(52291);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43992a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102583a = jediViewHolder;
                this.f102584b = cVar;
                this.f102585c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PaymentMethodViewHolder.C43992a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$PaymentMethodViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86870x8116dba9(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PaymentMethodViewHolder$b */
        static final class C43993b extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ PaymentMethodViewHolder f102586a;

            /* renamed from: b */
            final /* synthetic */ C44064h f102587b;

            static {
                Covode.recordClassIndex(52292);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43993b(PaymentMethodViewHolder paymentMethodViewHolder, C44064h hVar) {
                super(1);
                this.f102586a = paymentMethodViewHolder;
                this.f102587b = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                PaymentViewModel m = this.f102586a.mo63351m();
                m.mo33689c(new PaymentViewModel.C44039j(m, this.f102587b.f102707a));
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44064h hVar) {
            C44064h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.PaymentMethodView");
            C44180d dVar = (C44180d) view;
            dVar.setPaymentMethod(hVar2.f102707a);
            dVar.setOnCheckedListener(new C43993b(this, hVar2));
            withState(mo63351m(), new C43994c(dVar, this, hVar2));
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PaymentMethodViewHolder$c */
        static final class C43994c extends AbstractC89220m implements AbstractC89172b<PaymentState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C44180d f102588a;

            /* renamed from: b */
            final /* synthetic */ PaymentMethodViewHolder f102589b;

            /* renamed from: c */
            final /* synthetic */ C44064h f102590c;

            static {
                Covode.recordClassIndex(52293);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43994c(C44180d dVar, PaymentMethodViewHolder paymentMethodViewHolder, C44064h hVar) {
                super(1);
                this.f102588a = dVar;
                this.f102589b = paymentMethodViewHolder;
                this.f102590c = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(PaymentState paymentState) {
                C44173b.C44175b bVar;
                boolean z;
                List<C44075e> a;
                PaymentState paymentState2 = paymentState;
                C89219l.m154721d(paymentState2, "");
                boolean a2 = C44083l.m86908a(this.f102590c.f102707a, paymentState2.getCheckedPaymentMethod());
                C44071a aVar = this.f102590c.f102707a.f102813t;
                if (aVar != null && C89219l.m154714a((Object) false, (Object) aVar.f102725a)) {
                    a2 = false;
                }
                this.f102588a.setChecked(a2);
                this.f102588a.setPaymentViewModel(this.f102589b.mo63351m());
                if (this.f102589b.f102581f.mo33762a(this.f102589b.f48794i + 1) != null) {
                    if (!(this.f102589b.f102581f.mo33762a(this.f102589b.f48794i + 1) instanceof C44064h) || (a2 && (a = this.f102590c.f102707a.mo74949a()) != null && !a.isEmpty())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bVar = new C44173b.C44175b(0, 0, 0, 0, z, false, 47);
                } else {
                    bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, true, 30);
                }
                View view = this.f102589b.itemView;
                C89219l.m154716b(view, "");
                C44173b.C44174a.m86963a(view, bVar);
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PaymentMethodViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102581f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PaymentMethodViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PaymentMethodViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102582g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PaymentMethodViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SaveElementViewHolder */
    public final class SaveElementViewHolder extends JediSimpleViewHolder<C44066j> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102607f;

        /* renamed from: g */
        private final AbstractC89244h f102608g;

        static {
            Covode.recordClassIndex(52301);
        }

        /* renamed from: m */
        public final PaymentViewModel mo63351m() {
            return (PaymentViewModel) this.f102608g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SaveElementViewHolder$a */
        public static final class C44000a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102609a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102610b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102611c;

            static {
                Covode.recordClassIndex(52302);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44000a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102609a = jediViewHolder;
                this.f102610b = cVar;
                this.f102611c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.SaveElementViewHolder.C44000a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$SaveElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86877xddd93fe1(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SaveElementViewHolder$b */
        static final class C44001b extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ SaveElementViewHolder f102612a;

            /* renamed from: b */
            final /* synthetic */ C44066j f102613b;

            static {
                Covode.recordClassIndex(52303);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44001b(SaveElementViewHolder saveElementViewHolder, C44066j jVar) {
                super(1);
                this.f102612a = saveElementViewHolder;
                this.f102613b = jVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
                List<? extends C44084m> list2 = list;
                String str = "";
                C89219l.m154721d(list2, str);
                PaymentViewModel m = this.f102612a.mo63351m();
                C44086o oVar = this.f102613b.f102704c;
                String str2 = this.f102613b.f102703b.f102742a;
                if (str2 != null) {
                    str = str2;
                }
                m.mo74862a(oVar, str, (List<C44084m>) list2);
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44066j jVar) {
            C44066j jVar2 = jVar;
            String str = "";
            C89219l.m154721d(jVar2, str);
            View view = this.itemView;
            C89219l.m154716b(view, str);
            C44173b.C44174a.m86963a(view, new C44173b.C44175b(C45563h.f106109e, 0, 80, 0, false, true, 26));
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.SaveElement");
            C44267m mVar = (C44267m) view2;
            mVar.setOnValueChange(new C44001b(this, jVar2));
            C44075e eVar = jVar2.f102703b;
            C44086o oVar = jVar2.f102704c;
            PaymentViewModel m = mo63351m();
            C44086o oVar2 = jVar2.f102704c;
            String str2 = jVar2.f102703b.f102742a;
            if (str2 != null) {
                str = str2;
            }
            mVar.mo75055a(eVar, oVar, m.mo74864b(oVar2, str), jVar2.f102711a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SaveElementViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                r3.f102607f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m
                android.content.Context r1 = r5.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SaveElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SaveElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r3.f102608g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.SaveElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SeeMoreViewHolder */
    public final class SeeMoreViewHolder extends JediSimpleViewHolder<C44052aa> implements AbstractC33974au {

        /* renamed from: f */
        final AbstractC89244h f102614f;

        /* renamed from: g */
        final /* synthetic */ PaymentAdapter f102615g;

        static {
            Covode.recordClassIndex(52304);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SeeMoreViewHolder$a */
        public static final class C44002a extends AbstractC89220m implements AbstractC89171a<PaymentViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f102616a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f102617b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f102618c;

            static {
                Covode.recordClassIndex(52305);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44002a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f102616a = jediViewHolder;
                this.f102617b = cVar;
                this.f102618c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.SeeMoreViewHolder.C44002a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$SeeMoreViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86879xcb45e16a(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SeeMoreViewHolder$b */
        static final class View$OnClickListenerC44003b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SeeMoreViewHolder f102619a;

            /* renamed from: b */
            final /* synthetic */ C44052aa f102620b;

            static {
                Covode.recordClassIndex(52306);
            }

            View$OnClickListenerC44003b(SeeMoreViewHolder seeMoreViewHolder, C44052aa aaVar) {
                this.f102619a = seeMoreViewHolder;
                this.f102620b = aaVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C44052aa aaVar = this.f102620b;
                C89219l.m154721d(aaVar, "");
                ((JediViewModel) this.f102619a.f102614f.getValue()).mo33689c(new PaymentViewModel.C44038i(aaVar));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44052aa aaVar) {
            C44052aa aaVar2 = aaVar;
            C89219l.m154721d(aaVar2, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dtq);
            C89219l.m154716b(tuxTextView, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            tuxTextView.setText(view2.getContext().getString(R.string.bih));
            this.itemView.setOnClickListener(new View$OnClickListenerC44003b(this, aaVar2));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SeeMoreViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f102615g = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558994(0x7f0d0252, float:1.874332E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SeeMoreViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SeeMoreViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r4.f102614f = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.SeeMoreViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$b */
    static final class C44005b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102622a;

        static {
            Covode.recordClassIndex(52308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44005b(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102622a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new AddressElementViewHolder(this.f102622a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$d */
    static final class C44007d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102624a;

        static {
            Covode.recordClassIndex(52310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44007d(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102624a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new DateElementViewHolder(this.f102624a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$f */
    static final class C44009f extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102626a;

        static {
            Covode.recordClassIndex(52312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44009f(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102626a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new NormalElementViewHolder(this.f102626a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$h */
    static final class C44011h extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102628a;

        static {
            Covode.recordClassIndex(52314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44011h(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102628a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new OptionElementViewHolder(this.f102628a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$j */
    static final class C44013j extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102630a;

        static {
            Covode.recordClassIndex(52316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44013j(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102630a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new SaveElementViewHolder(this.f102630a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$l */
    static final class C44015l extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102632a;

        static {
            Covode.recordClassIndex(52318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44015l(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102632a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new AreaTitleViewHolder(this.f102632a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$m */
    static final class C44016m extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102633a;

        static {
            Covode.recordClassIndex(52319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44016m(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102633a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PhoneElementViewHolder(this.f102633a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$o */
    static final class C44018o extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102635a;

        static {
            Covode.recordClassIndex(52321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44018o(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102635a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PolicyViewHolder(this.f102635a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$q */
    static final class C44020q extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102637a;

        static {
            Covode.recordClassIndex(52323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44020q(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102637a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new BalanceElementViewHolder(this.f102637a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$s */
    static final class C44022s extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102639a;

        static {
            Covode.recordClassIndex(52325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44022s(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102639a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new SeeMoreViewHolder(this.f102639a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$u */
    static final class C44024u extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102641a;

        static {
            Covode.recordClassIndex(52327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44024u(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102641a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PaymentMethodViewHolder(this.f102641a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$w */
    static final class C44026w extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102643a;

        static {
            Covode.recordClassIndex(52329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44026w(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102643a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new CardNumberElementViewHolder(this.f102643a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PolicyViewHolder */
    public final class PolicyViewHolder extends JediSimpleViewHolder<C44088q> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102602f;

        static {
            Covode.recordClassIndex(52299);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PolicyViewHolder$a */
        public static final class C43999a extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ int f102603a;

            /* renamed from: b */
            final /* synthetic */ PolicyViewHolder f102604b;

            /* renamed from: c */
            final /* synthetic */ SpannableStringBuilder f102605c;

            /* renamed from: d */
            final /* synthetic */ C44088q f102606d;

            static {
                Covode.recordClassIndex(52300);
            }

            public final void updateDrawState(TextPaint textPaint) {
                C89219l.m154721d(textPaint, "");
                View view = this.f102604b.itemView;
                C89219l.m154716b(view, "");
                textPaint.setColor(C0643b.m2378c(view.getContext(), R.color.bx));
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                String str;
                C89219l.m154721d(view, "");
                List<String> list = this.f102606d.f102820b;
                if (list != null && (str = (String) C89070n.m154561b((List) list, this.f102603a)) != null) {
                    IBulletService f = BulletService.m71938f();
                    View view2 = this.f102604b.itemView;
                    C89219l.m154716b(view2, "");
                    Context context = view2.getContext();
                    C89219l.m154716b(context, "");
                    String uri = C45264j.m87841a(str, PolicyVH.C43917b.m86824a(null, true)).build().toString();
                    C89219l.m154716b(uri, "");
                    f.mo61852a(context, uri);
                }
            }

            C43999a(int i, PolicyViewHolder policyViewHolder, SpannableStringBuilder spannableStringBuilder, C44088q qVar) {
                this.f102603a = i;
                this.f102604b = policyViewHolder;
                this.f102605c = spannableStringBuilder;
                this.f102606d = qVar;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44088q qVar) {
            C44088q qVar2 = qVar;
            C89219l.m154721d(qVar2, "");
            String str = qVar2.f102819a;
            if (str != null) {
                int i = 0;
                C44173b.C44175b bVar = null;
                int size = C89309k.m154813g(C89350l.findAll$default(new C89350l("\\{"), str, 0, 2, null)).size();
                ArrayList arrayList = new ArrayList();
                Iterator it = C89271h.m154766a(0, size).iterator();
                while (it.hasNext()) {
                    ((AbstractC89040af) it).mo143429a();
                    int a = C89361p.m154888a((CharSequence) str, "{", 0, false, 6);
                    str = C89361p.m154873b(C89361p.m154873b(str, "{", "", false), "}", "", false);
                    arrayList.add(C89387v.m154943a(Integer.valueOf(a), Integer.valueOf(C89361p.m154888a((CharSequence) str, "}", 0, false, 6) - 1)));
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    C89378p pVar = (C89378p) obj;
                    spannableStringBuilder.setSpan(new StyleSpan(1), ((Number) pVar.getFirst()).intValue(), ((Number) pVar.getSecond()).intValue(), 17);
                    spannableStringBuilder.setSpan(new C43999a(i, this, spannableStringBuilder, qVar2), ((Number) pVar.getFirst()).intValue(), ((Number) pVar.getSecond()).intValue(), 17);
                    i = i2;
                }
                View view = this.itemView;
                C89219l.m154716b(view, "");
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.d3k);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(spannableStringBuilder);
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.d3k);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setClickable(true);
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                TuxTextView tuxTextView3 = (TuxTextView) view3.findViewById(R.id.d3k);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
                if (this.f102602f.mo33762a(this.f48794i + 1) == null) {
                    bVar = new C44173b.C44175b(C45563h.f106109e, 0, 0, 0, false, true, 30);
                }
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                C44173b.C44174a.m86963a(view4, bVar);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PolicyViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f102602f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558997(0x7f0d0255, float:1.8743326E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PolicyViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$a */
    static final class C44004a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102621a;

        static {
            Covode.recordClassIndex(52307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44004a(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102621a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102621a.mo33762a(num.intValue()) instanceof C44045a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$c */
    static final class C44006c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102623a;

        static {
            Covode.recordClassIndex(52309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44006c(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102623a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102623a.mo33762a(num.intValue()) instanceof C44060d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$e */
    static final class C44008e extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102625a;

        static {
            Covode.recordClassIndex(52311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44008e(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102625a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102625a.mo33762a(num.intValue()) instanceof C44062f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$g */
    static final class C44010g extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102627a;

        static {
            Covode.recordClassIndex(52313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44010g(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102627a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102627a.mo33762a(num.intValue()) instanceof C44063g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$i */
    static final class C44012i extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102629a;

        static {
            Covode.recordClassIndex(52315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44012i(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102629a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102629a.mo33762a(num.intValue()) instanceof C44066j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$k */
    static final class C44014k extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102631a;

        static {
            Covode.recordClassIndex(52317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44014k(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102631a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102631a.mo33762a(num.intValue()) instanceof C44065i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$n */
    static final class C44017n extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102634a;

        static {
            Covode.recordClassIndex(52320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44017n(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102634a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102634a.mo33762a(num.intValue()) instanceof C44088q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$p */
    static final class C44019p extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102636a;

        static {
            Covode.recordClassIndex(52322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44019p(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102636a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102636a.mo33762a(num.intValue()) instanceof C44058b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$r */
    static final class C44021r extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102638a;

        static {
            Covode.recordClassIndex(52324);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44021r(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102638a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102638a.mo33762a(num.intValue()) instanceof C44052aa);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$t */
    static final class C44023t extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102640a;

        static {
            Covode.recordClassIndex(52326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44023t(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102640a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102640a.mo33762a(num.intValue()) instanceof C44064h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$v */
    static final class C44025v extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102642a;

        static {
            Covode.recordClassIndex(52328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44025v(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102642a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102642a.mo33762a(num.intValue()) instanceof C44059c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$x */
    static final class C44027x extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PaymentAdapter f102644a;

        static {
            Covode.recordClassIndex(52330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44027x(PaymentAdapter paymentAdapter) {
            super(1);
            this.f102644a = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102644a.mo33762a(num.intValue()) instanceof C44057a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentAdapter(AbstractC1204m mVar) {
        super(mVar, new C44056b(), 4);
        C89219l.m154721d(mVar, "");
        this.f102515d = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AreaTitleViewHolder */
    public final class AreaTitleViewHolder extends JediSimpleViewHolder<C44045a> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ PaymentAdapter f102525f;

        static {
            Covode.recordClassIndex(52266);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44045a aVar) {
            C44045a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            ((TuxTextView) view).setText(((TuxTextView) view2).getContext().getString(aVar2.f102677a));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AreaTitleViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f102525f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558993(0x7f0d0251, float:1.8743317E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.AreaTitleViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(new C44004a(this), null, new C44015l(this));
        AbstractC20638g unused2 = gVar.mo33893a(new C44021r(this), null, new C44022s(this));
        AbstractC20638g unused3 = gVar.mo33893a(new C44023t(this), null, new C44024u(this));
        AbstractC20638g unused4 = gVar.mo33893a(new C44025v(this), null, new C44026w(this));
        AbstractC20638g unused5 = gVar.mo33893a(new C44027x(this), null, new C44005b(this));
        AbstractC20638g unused6 = gVar.mo33893a(new C44006c(this), null, new C44007d(this));
        AbstractC20638g unused7 = gVar.mo33893a(new C44008e(this), null, new C44009f(this));
        AbstractC20638g unused8 = gVar.mo33893a(new C44010g(this), null, new C44011h(this));
        AbstractC20638g unused9 = gVar.mo33893a(new C44012i(this), null, new C44013j(this));
        AbstractC20638g unused10 = gVar.mo33893a(new C44014k(this), null, new C44016m(this));
        AbstractC20638g unused11 = gVar.mo33893a(new C44017n(this), null, new C44018o(this));
        AbstractC20638g unused12 = gVar.mo33893a(new C44019p(this), null, new C44020q(this));
    }
}
