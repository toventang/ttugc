package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.router.SmartRouter;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43751d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43858l;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44067c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44170v;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.PaymentApi;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44077f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44080i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44081j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44090s;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45539b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e */
public final class C44092e {

    /* renamed from: h */
    public static final String f102836h;

    /* renamed from: i */
    public static final C44093a f102837i = new C44093a((byte) 0);

    /* renamed from: a */
    public C44081j f102838a;

    /* renamed from: b */
    public final Context f102839b;

    /* renamed from: c */
    public final String f102840c;

    /* renamed from: d */
    public final List<String> f102841d;

    /* renamed from: e */
    public final String f102842e;

    /* renamed from: f */
    public final String f102843f;

    /* renamed from: g */
    public final HashMap<String, Object> f102844g;

    /* renamed from: j */
    private final AbstractC89244h f102845j = C89250i.m154773a((AbstractC89171a) new C44095c(this));

    /* renamed from: a */
    public final DialogC81438i mo74983a() {
        return (DialogC81438i) this.f102845j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$a */
    public static final class C44093a {
        static {
            Covode.recordClassIndex(52404);
        }

        private C44093a() {
        }

        /* renamed from: a */
        public static C43858l m86919a() {
            return new C43858l(C44092e.f102836h, "0", 915455);
        }

        public /* synthetic */ C44093a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$f */
    public static final class C44101f implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C44092e f102857a;

        static {
            Covode.recordClassIndex(52412);
        }

        public C44101f(C44092e eVar) {
            this.f102857a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f102857a.mo74986b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$c */
    static final class C44095c extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ C44092e f102847a;

        static {
            Covode.recordClassIndex(52406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44095c(C44092e eVar) {
            super(0);
            this.f102847a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f102847a.f102839b);
        }
    }

    /* renamed from: b */
    public final void mo74986b() {
        try {
            mo74983a().dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        Covode.recordClassIndex(52403);
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        f102836h = uuid;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$h */
    public static final class C44105h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44092e f102862a;

        static {
            Covode.recordClassIndex(52416);
        }

        public C44105h(C44092e eVar) {
            this.f102862a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f102862a.mo74985a((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$b */
    public static final class C44094b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44092e f102846a;

        static {
            Covode.recordClassIndex(52405);
        }

        C44094b(C44092e eVar) {
            this.f102846a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            DialogC81438i a = this.f102846a.mo74983a();
            a.setCanceledOnTouchOutside(false);
            a.show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$e */
    static final class C44100e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44092e f102855a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f102856b;

        static {
            Covode.recordClassIndex(52411);
        }

        C44100e(C44092e eVar, AbstractC89171a aVar) {
            this.f102855a = eVar;
            this.f102856b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f102855a.mo74986b();
            this.f102855a.mo74985a((String) null);
            this.f102856b.invoke();
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<C22099u<C43612a<C44081j>>> mo74984a(C44080i iVar) {
        C89219l.m154721d(iVar, "");
        return ((PaymentApi) PaymentApi.C44053a.f102695a.mo28858a(PaymentApi.class)).pay(iVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143285c(new C44094b(this));
    }

    /* renamed from: a */
    public final void mo74985a(String str) {
        Resources resources;
        if (str != null || ((resources = this.f102839b.getResources()) != null && (str = resources.getString(R.string.fv9)) != null)) {
            new C79459a(this.f102839b).mo123052a(str).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$g */
    public static final class C44102g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44092e f102858a;

        static {
            Covode.recordClassIndex(52413);
        }

        public C44102g(C44092e eVar) {
            this.f102858a = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$g$a */
        static final class C44103a extends AbstractC89220m implements AbstractC89172b<C44085n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C44153r f102859a;

            /* renamed from: b */
            final /* synthetic */ C44102g f102860b;

            static {
                Covode.recordClassIndex(52414);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44103a(C44153r rVar, C44102g gVar) {
                super(1);
                this.f102859a = rVar;
                this.f102860b = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C44085n nVar) {
                Object obj;
                String c;
                C44085n nVar2 = nVar;
                String str = "";
                C89219l.m154721d(nVar2, str);
                String str2 = null;
                if (nVar2.f102788a != null) {
                    C44092e eVar = this.f102860b.f102858a;
                    C441041 r3 = new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44092e.C44102g.C44103a.C441041 */

                        /* renamed from: a */
                        final /* synthetic */ C44103a f102861a;

                        static {
                            Covode.recordClassIndex(52415);
                        }

                        {
                            this.f102861a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f102861a.f102859a.dismissAllowingStateLoss();
                            return C89391z.f203057a;
                        }
                    };
                    C44080i iVar = new C44080i(eVar.f102840c, eVar.f102841d, true, C44070d.m86906a(nVar2, false), C44276w.m87001a(null, null, eVar.f102842e, nVar2, eVar.f102844g), C44276w.m87000a(eVar.f102842e, nVar2, eVar.f102844g), C44093a.m86919a());
                    HashMap<String, Object> hashMap = eVar.f102844g;
                    if (hashMap != null) {
                        obj = hashMap.get("previous_page");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str2 = obj;
                    }
                    String str3 = str2;
                    if (str3 == null) {
                        str3 = str;
                    }
                    AbstractC88979t<C22099u<C43612a<C44081j>>> a = eVar.mo74984a(iVar);
                    if (a != null) {
                        C89378p[] pVarArr = new C89378p[2];
                        pVarArr[0] = C89387v.m154943a("order_id", String.valueOf(eVar.f102841d));
                        C44086o oVar = nVar2.f102789b;
                        if (!(oVar == null || (c = oVar.mo74952c()) == null)) {
                            str = c;
                        }
                        pVarArr[1] = C89387v.m154943a("pay_type", str);
                        AbstractC88979t a2 = C45539b.m88078a(a, str3, pVarArr);
                        if (a2 != null) {
                            a2.mo143254a(new C44096d(eVar, r3, nVar2), new C44100e(eVar, r3));
                        }
                    }
                } else {
                    this.f102860b.f102858a.mo74985a((String) null);
                    this.f102859a.dismissAllowingStateLoss();
                }
                return C89391z.f203057a;
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C44089r rVar;
            List<C44090s> list;
            T t = ((C22099u) obj).f52262b;
            this.f102858a.f102838a = t.data;
            if (!t.isCodeOK() || this.f102858a.f102838a == null) {
                this.f102858a.mo74985a(t.message);
                return;
            }
            C44153r rVar2 = new C44153r();
            Integer valueOf = Integer.valueOf(C44067c.EnumC44068a.PAY_NOW.ordinal());
            C44081j jVar = this.f102858a.f102838a;
            Address address = null;
            if (jVar != null) {
                rVar = jVar.f102779e;
            } else {
                rVar = null;
            }
            String str = this.f102858a.f102843f;
            C44081j jVar2 = this.f102858a.f102838a;
            if (jVar2 != null) {
                list = jVar2.f102780f;
            } else {
                list = null;
            }
            C44081j jVar3 = this.f102858a.f102838a;
            if (jVar3 != null) {
                address = jVar3.f102778d;
            }
            rVar2.mo75000a(new C44067c(null, null, valueOf, rVar, str, false, null, this.f102858a.f102844g, list, address, 96));
            rVar2.mo75001a(new C44103a(rVar2, this));
            Context context = this.f102858a.f102839b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC0952i supportFragmentManager = ((ActivityC0945e) context).getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            rVar2.show(supportFragmentManager, "payment_fragment");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$d */
    static final class C44096d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44092e f102848a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f102849b;

        /* renamed from: c */
        final /* synthetic */ C44085n f102850c;

        static {
            Covode.recordClassIndex(52407);
        }

        C44096d(C44092e eVar, AbstractC89171a aVar, C44085n nVar) {
            this.f102848a = eVar;
            this.f102849b = aVar;
            this.f102850c = nVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C28022o oVar;
            C44077f fVar;
            final T t = ((C22099u) obj).f52262b;
            this.f102848a.f102838a = t.data;
            if (!t.isCodeOK() || this.f102848a.f102838a == null) {
                this.f102848a.mo74983a().dismiss();
                T t2 = t.data;
                if (t2 == null || t2.f102781g == null) {
                    this.f102848a.mo74985a(t.message);
                    this.f102849b.invoke();
                    return;
                }
                C43751d.m86742a(this.f102848a.f102839b, String.valueOf(t.code), t.data.f102781g, true, C440971.f102851a, this.f102849b, null, null, null, new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44092e.C44096d.C440982 */

                    /* renamed from: a */
                    final /* synthetic */ C44096d f102852a;

                    static {
                        Covode.recordClassIndex(52409);
                    }

                    {
                        this.f102852a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        RedirectContent redirectContent;
                        ExceptionUX exceptionUX = t.data.f102781g;
                        if (!(exceptionUX == null || (redirectContent = exceptionUX.getRedirectContent()) == null)) {
                            String jumpSchema = redirectContent.getJumpSchema();
                            if (jumpSchema != null) {
                                Uri.Builder buildUpon = Uri.parse(jumpSchema).buildUpon();
                                buildUpon.appendQueryParameter("source", this.f102852a.f102848a.f102842e);
                                buildUpon.appendQueryParameter("trackParams", C80342dg.m139300a().mo46674b(this.f102852a.f102848a.f102844g));
                                SmartRouter.buildRoute(C17867d.m33078a(), buildUpon.toString()).open();
                            }
                            if (C89219l.m154714a((Object) redirectContent.getClosePage(), (Object) true)) {
                                this.f102852a.f102849b.invoke();
                            }
                        }
                        return C89391z.f203057a;
                    }
                });
                return;
            }
            C44170v.C44171a aVar = new C44170v.C44171a(this.f102848a.f102839b);
            aVar.f102996b = this.f102848a.f102841d;
            aVar.f102997c = this.f102848a.f102840c;
            C44081j jVar = this.f102848a.f102838a;
            if (!(jVar == null || (fVar = jVar.f102777c) == null)) {
                aVar.f102999e = fVar;
            }
            aVar.f103004j = this.f102848a.f102842e;
            C44081j jVar2 = this.f102848a.f102838a;
            if (!(jVar2 == null || (oVar = jVar2.f102775a) == null)) {
                aVar.f103001g = oVar;
            }
            aVar.f103002h = this.f102850c;
            aVar.mo75013a(this.f102848a.f102844g).f103000f = new AbstractC44169u(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44092e.C44096d.C440993 */

                /* renamed from: a */
                final /* synthetic */ C44096d f102854a;

                static {
                    Covode.recordClassIndex(52410);
                }

                @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.AbstractC44169u
                /* renamed from: b */
                public final void mo74429b() {
                }

                @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.AbstractC44169u
                /* renamed from: a */
                public final void mo74428a() {
                    this.f102854a.f102848a.mo74986b();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f102854a = r1;
                }
            };
            C44276w.m87003a(aVar.mo75014a());
            this.f102849b.invoke();
        }
    }

    public C44092e(Context context, String str, List<String> list, String str2, String str3, HashMap<String, Object> hashMap) {
        C89219l.m154721d(context, "");
        this.f102839b = context;
        this.f102840c = str;
        this.f102841d = list;
        this.f102842e = str2;
        this.f102843f = str3;
        this.f102844g = hashMap;
    }
}
