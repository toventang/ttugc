package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a.C44048c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.SuperElement */
public final class SuperElement extends FrameLayout {

    /* renamed from: a */
    public C44075e f103037a;

    /* renamed from: b */
    public C44085n f103038b;

    /* renamed from: c */
    public AbstractC44225e f103039c;

    static {
        Covode.recordClassIndex(52495);
    }

    public SuperElement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final AbstractC44225e getElement() {
        return this.f103039c;
    }

    public final C44075e getElementDTO() {
        return this.f103037a;
    }

    public final C44085n getPaymentInfo() {
        return this.f103038b;
    }

    public final void setElement(AbstractC44225e eVar) {
        this.f103039c = eVar;
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103037a = eVar;
    }

    public final void setPaymentInfo(C44085n nVar) {
        this.f103038b = nVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.SuperElement$a */
    public static final class C44184a extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, String> {

        /* renamed from: a */
        final /* synthetic */ SuperElement f103040a;

        /* renamed from: b */
        final /* synthetic */ C44075e f103041b;

        /* renamed from: c */
        final /* synthetic */ C44086o f103042c;

        /* renamed from: d */
        final /* synthetic */ List f103043d;

        static {
            Covode.recordClassIndex(52496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44184a(SuperElement superElement, C44075e eVar, C44086o oVar, List list) {
            super(1);
            this.f103040a = superElement;
            this.f103041b = eVar;
            this.f103042c = oVar;
            this.f103043d = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(List<? extends C44084m> list) {
            boolean z;
            List<C44084m> arrayList;
            C44087p pVar;
            T t;
            C44087p pVar2;
            List<C44084m> paymentElements;
            List<? extends C44084m> list2 = list;
            C89219l.m154721d(list2, "");
            String a = C44048c.m86895a(this.f103041b, this.f103042c, list2);
            SuperElement superElement = this.f103040a;
            if (a == null) {
                z = true;
            } else {
                z = false;
            }
            C44085n nVar = superElement.f103038b;
            if (nVar == null || (pVar2 = nVar.f102788a) == null || (paymentElements = pVar2.getPaymentElements()) == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = C89070n.m154585g((Collection) paymentElements);
            }
            for (T t2 : list2) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.getElement(), (Object) t2.getElement())) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    t3.setParamValue(t2.getParamValue());
                } else {
                    Boolean.valueOf(arrayList.add(t2));
                }
            }
            C44085n nVar2 = superElement.f103038b;
            if (!(nVar2 == null || (pVar = nVar2.f102788a) == null)) {
                pVar.setPaymentElements(arrayList);
            }
            C44085n nVar3 = superElement.f103038b;
            if (nVar3 != null) {
                nVar3.f102791d = Boolean.valueOf(z);
            }
            return a;
        }
    }

    private /* synthetic */ SuperElement(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SuperElement(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7759);
        MethodCollector.m26664o(7759);
    }
}
