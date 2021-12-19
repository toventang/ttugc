package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44078g;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44178c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i */
public final class C44240i extends LinearLayout implements AbstractC44225e {

    /* renamed from: a */
    private final int f103177a;

    /* renamed from: b */
    private final int f103178b;

    /* renamed from: c */
    private AbstractC89172b<? super List<C44084m>, C89391z> f103179c;

    /* renamed from: d */
    private C44086o f103180d;

    /* renamed from: e */
    private C44075e f103181e;

    static {
        Covode.recordClassIndex(52552);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final C44075e getElementDTO() {
        return this.f103181e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final AbstractC89172b<List<C44084m>, C89391z> getOnValueChange() {
        return this.f103179c;
    }

    public final C44086o getPaymentMethod() {
        return this.f103180d;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i$a */
    public static final class C44241a implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103182a;

        static {
            Covode.recordClassIndex(52553);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44240i.C44241a.C442421 */

                /* renamed from: a */
                public int f103183a;

                /* renamed from: b */
                final /* synthetic */ C44241a f103184b;

                static {
                    Covode.recordClassIndex(52554);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103183a < this.f103184b.f103182a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103184b.f103182a;
                    int i = this.f103183a;
                    this.f103183a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103184b = r1;
                }
            };
        }

        public C44241a(ViewGroup viewGroup) {
            this.f103182a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i$b */
    public static final class C44243b implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103185a;

        static {
            Covode.recordClassIndex(52555);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44240i.C44243b.C442441 */

                /* renamed from: a */
                public int f103186a;

                /* renamed from: b */
                final /* synthetic */ C44243b f103187b;

                static {
                    Covode.recordClassIndex(52556);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103186a < this.f103187b.f103185a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103187b.f103185a;
                    int i = this.f103186a;
                    this.f103186a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103187b = r1;
                }
            };
        }

        public C44243b(ViewGroup viewGroup) {
            this.f103185a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i$c */
    public static final class C44245c implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103188a;

        static {
            Covode.recordClassIndex(52557);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44240i.C44245c.C442461 */

                /* renamed from: a */
                public int f103189a;

                /* renamed from: b */
                final /* synthetic */ C44245c f103190b;

                static {
                    Covode.recordClassIndex(52558);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103189a < this.f103190b.f103188a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103190b.f103188a;
                    int i = this.f103189a;
                    this.f103189a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103190b = r1;
                }
            };
        }

        public C44245c(ViewGroup viewGroup) {
            this.f103188a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i$d */
    public static final class C44247d implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103191a;

        static {
            Covode.recordClassIndex(52559);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44240i.C44247d.C442481 */

                /* renamed from: a */
                public int f103192a;

                /* renamed from: b */
                final /* synthetic */ C44247d f103193b;

                static {
                    Covode.recordClassIndex(52560);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103192a < this.f103193b.f103191a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103193b.f103191a;
                    int i = this.f103192a;
                    this.f103192a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103193b = r1;
                }
            };
        }

        public C44247d(ViewGroup viewGroup) {
            this.f103191a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i$e */
    public static final class C44249e implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103194a;

        static {
            Covode.recordClassIndex(52561);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44240i.C44249e.C442501 */

                /* renamed from: a */
                public int f103195a;

                /* renamed from: b */
                final /* synthetic */ C44249e f103196b;

                static {
                    Covode.recordClassIndex(52562);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103195a < this.f103196b.f103194a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103196b.f103194a;
                    int i = this.f103195a;
                    this.f103195a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103196b = r1;
                }
            };
        }

        public C44249e(ViewGroup viewGroup) {
            this.f103194a = viewGroup;
        }
    }

    /* renamed from: a */
    public final void mo75149a() {
        C44243b<View> bVar = new C44243b(this);
        ArrayList<C44178c> arrayList = new ArrayList();
        for (View view : bVar) {
            if ((view instanceof C44178c) && view != null) {
                arrayList.add(view);
            }
        }
        for (C44178c cVar : arrayList) {
            if (cVar.mo75032a()) {
                cVar.setChecked(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final List<C44084m> getValue() {
        Boolean bool;
        Object obj;
        String str;
        String str2;
        String str3;
        C44245c cVar = new C44245c(this);
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.iterator();
        while (true) {
            bool = null;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            if ((view instanceof C44178c) && view != null) {
                arrayList.add(view);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((C44178c) obj).mo75032a()) {
                break;
            }
        }
        C44178c cVar2 = (C44178c) obj;
        if (cVar2 == null) {
            return C89086z.INSTANCE;
        }
        C44075e elementDTO = getElementDTO();
        if (elementDTO != null) {
            str = elementDTO.f102742a;
        } else {
            str = null;
        }
        C44075e elementDTO2 = getElementDTO();
        if (elementDTO2 != null) {
            str2 = elementDTO2.f102747f;
        } else {
            str2 = null;
        }
        C44078g option = cVar2.getOption();
        if (option != null) {
            str3 = option.f102761b;
        } else {
            str3 = null;
        }
        C44075e elementDTO3 = getElementDTO();
        if (elementDTO3 != null) {
            bool = elementDTO3.f102752k;
        }
        return C89070n.m154516a(new C44084m(str, str2, str3, bool, null, 16, null));
    }

    public final void setElementDTO(C44075e eVar) {
        this.f103181e = eVar;
    }

    public final void setPaymentMethod(C44086o oVar) {
        this.f103180d = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i$g */
    static final class C44252g extends AbstractC89220m implements AbstractC89172b<List<? extends C44084m>, C89391z> {

        /* renamed from: a */
        public static final C44252g f103199a = new C44252g();

        static {
            Covode.recordClassIndex(52564);
        }

        C44252g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C44084m> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    public final void setOnValueChange(AbstractC89172b<? super List<C44084m>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103179c = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i$f */
    static final class View$OnClickListenerC44251f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44178c f103197a;

        /* renamed from: b */
        final /* synthetic */ C44240i f103198b;

        static {
            Covode.recordClassIndex(52563);
        }

        View$OnClickListenerC44251f(C44178c cVar, C44240i iVar) {
            this.f103197a = cVar;
            this.f103198b = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f103197a.mo75032a()) {
                this.f103198b.mo75149a();
                this.f103197a.setChecked(true);
                this.f103198b.getOnValueChange().invoke(this.f103198b.getValue());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44240i(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8148);
        this.f103177a = (int) C13628n.m24520b(context, 60.0f);
        this.f103178b = (int) C13628n.m24520b(context, 6.0f);
        this.f103179c = C44252g.f103199a;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        MethodCollector.m26664o(8148);
    }

    public /* synthetic */ C44240i(Context context, byte b) {
        this(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0179, code lost:
        if (r1 == null) goto L_0x017b;
     */
    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75055a(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e r9, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o r10, java.util.List<com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m> r11, java.lang.Object r12) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.C44240i.mo75055a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, java.util.List, java.lang.Object):void");
    }
}
