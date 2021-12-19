package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44057a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44059c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44060d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44061e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44062f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44063g;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44065i;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e */
public interface AbstractC44225e {

    /* renamed from: f */
    public static final C44226a f103147f = C44226a.f103148a;

    static {
        Covode.recordClassIndex(52537);
    }

    /* renamed from: a */
    void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj);

    C44075e getElementDTO();

    List<C44084m> getValue();

    void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e$a */
    public static final class C44226a {

        /* renamed from: a */
        static final /* synthetic */ C44226a f103148a = new C44226a();

        private C44226a() {
        }

        static {
            Covode.recordClassIndex(52538);
        }

        /* renamed from: a */
        public static C44061e m86983a(C44075e eVar, C44086o oVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(oVar, "");
            Integer num = eVar.f102744c;
            int ordinal = EnumC44227f.Normal.ordinal();
            if (num == null || num.intValue() != ordinal) {
                int ordinal2 = EnumC44227f.Email.ordinal();
                if (num == null || num.intValue() != ordinal2) {
                    int ordinal3 = EnumC44227f.CardNumber.ordinal();
                    if (num != null && num.intValue() == ordinal3) {
                        return new C44059c(eVar, oVar);
                    }
                    int ordinal4 = EnumC44227f.Date.ordinal();
                    if (num != null && num.intValue() == ordinal4) {
                        return new C44060d(eVar, oVar);
                    }
                    int ordinal5 = EnumC44227f.CPF.ordinal();
                    if (num != null && num.intValue() == ordinal5) {
                        return new C44062f(eVar, oVar);
                    }
                    int ordinal6 = EnumC44227f.Phone.ordinal();
                    if (num != null && num.intValue() == ordinal6) {
                        return new C44065i(eVar, oVar, (byte) 0);
                    }
                    int ordinal7 = EnumC44227f.Address.ordinal();
                    if (num != null && num.intValue() == ordinal7) {
                        return new C44057a(eVar, oVar);
                    }
                    int ordinal8 = EnumC44227f.Option.ordinal();
                    if (num != null && num.intValue() == ordinal8) {
                        return new C44063g(eVar, oVar, (byte) 0);
                    }
                    return null;
                }
            }
            return new C44062f(eVar, oVar);
        }

        /* renamed from: a */
        public static AbstractC44225e m86984a(C44075e eVar, C44086o oVar, Context context) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(context, "");
            Integer num = eVar.f102744c;
            int ordinal = EnumC44227f.Normal.ordinal();
            if (num == null || num.intValue() != ordinal) {
                int ordinal2 = EnumC44227f.CPF.ordinal();
                if (num == null || num.intValue() != ordinal2) {
                    int ordinal3 = EnumC44227f.Email.ordinal();
                    if (num == null || num.intValue() != ordinal3) {
                        int ordinal4 = EnumC44227f.CardNumber.ordinal();
                        List<C44086o> list = null;
                        if (num != null && num.intValue() == ordinal4) {
                            C44207c cVar = new C44207c(context, (byte) 0);
                            if (oVar != null) {
                                list = oVar.f102801h;
                            }
                            cVar.setPaymentList(list);
                            return cVar;
                        }
                        int ordinal5 = EnumC44227f.Date.ordinal();
                        if (num != null && num.intValue() == ordinal5) {
                            return new C44219d(context, (byte) 0);
                        }
                        int ordinal6 = EnumC44227f.Region.ordinal();
                        if (num != null && num.intValue() == ordinal6) {
                            return new C44258k(context, (byte) 0);
                        }
                        int ordinal7 = EnumC44227f.Phone.ordinal();
                        if (num != null && num.intValue() == ordinal7) {
                            return new C44253j(context, (byte) 0);
                        }
                        int ordinal8 = EnumC44227f.Address.ordinal();
                        if (num != null && num.intValue() == ordinal8) {
                            return new C44185a(context, (byte) 0);
                        }
                        int ordinal9 = EnumC44227f.Option.ordinal();
                        if (num != null && num.intValue() == ordinal9) {
                            return new C44240i(context, (byte) 0);
                        }
                        return null;
                    }
                }
            }
            return new C44232h(context, (byte) 0);
        }
    }
}
