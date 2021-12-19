package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityC0580d;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43742c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSubmitInfoView;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44071a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a.C44048c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44228g;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.SuperElement;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH */
public final class PaymentInfoVH extends JediSimpleViewHolder<C43742c> implements AbstractC33974au {

    /* renamed from: g */
    public static final C43908c f102352g = new C43908c((byte) 0);

    /* renamed from: f */
    public final View f102353f;

    /* renamed from: j */
    private final AbstractC89244h f102354j;

    /* renamed from: k */
    private boolean f102355k;

    /* renamed from: l */
    private boolean f102356l;

    /* renamed from: m */
    private final int f102357m;

    /* renamed from: n */
    private final int f102358n;

    /* renamed from: o */
    private final int f102359o;

    /* renamed from: p */
    private final C20745e f102360p;

    /* renamed from: q */
    private final int f102361q;

    /* renamed from: r */
    private final int f102362r;

    /* renamed from: s */
    private KeyBoardVisibilityUtil f102363s;

    static {
        Covode.recordClassIndex(52191);
    }

    /* renamed from: m */
    public final OrderSubmitViewModel mo63351m() {
        return (OrderSubmitViewModel) this.f102354j.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH$c */
    public static final class C43908c {
        static {
            Covode.recordClassIndex(52194);
        }

        private C43908c() {
        }

        public /* synthetic */ C43908c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH$b */
    public static final class C43907b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102367a = 700;

        static {
            Covode.recordClassIndex(52193);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
        }

        public C43907b() {
            super(700);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: j */
    public final void mo33832j() {
        super.mo33832j();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.f102363s;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.mo76761a();
        }
        this.f102363s = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH$a */
    public static final class C43906a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f102364a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102365b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102366c;

        static {
            Covode.recordClassIndex(52192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43906a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102364a = jediViewHolder;
            this.f102365b = cVar;
            this.f102366c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH.C43906a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_PaymentInfoVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86813xc25207a4(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f102353f, false);
        View view = this.f102353f;
        Context context = view.getContext();
        if (context != null && (context instanceof ActivityC0218d)) {
            this.f102363s = new KeyBoardVisibilityUtil((ActivityC0580d) context, 32, new C43911f(view, this));
        }
        AbstractC88412b unused = selectSubscribe(mo63351m(), C43940e.f102452a, new C20370ah(), new C43912g(view, this));
        AbstractC88412b unused2 = selectSubscribe(mo63351m(), C43941f.f102453a, new C20370ah(), new C43913h(view, this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH$d */
    public static final class C43909d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102368a = 700;

        /* renamed from: b */
        final /* synthetic */ PaymentInfoVH f102369b;

        /* renamed from: c */
        final /* synthetic */ C43742c f102370c;

        static {
            Covode.recordClassIndex(52195);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            String str2;
            String str3;
            C44071a aVar;
            if (view != null) {
                OrderSubmitViewModel m = this.f102369b.mo63351m();
                Context context = this.f102369b.f102353f.getContext();
                C89219l.m154716b(context, "");
                m.mo74406a(context, !this.f102370c.f101974e);
                HashMap<String, Object> j = this.f102369b.mo63351m().mo74424j();
                C44086o oVar = this.f102370c.f101970a;
                String str4 = null;
                if (oVar != null) {
                    str = oVar.mo74952c();
                } else {
                    str = null;
                }
                C44086o oVar2 = this.f102370c.f101970a;
                if (oVar2 != null) {
                    str2 = oVar2.f102805l;
                } else {
                    str2 = null;
                }
                Boolean valueOf = Boolean.valueOf(C80538hl.m139614a(str2));
                C44086o oVar3 = this.f102370c.f101970a;
                if (oVar3 != null) {
                    str3 = oVar3.f102812s;
                } else {
                    str3 = null;
                }
                Boolean valueOf2 = Boolean.valueOf(C80538hl.m139614a(str3));
                C44086o oVar4 = this.f102370c.f101970a;
                if (!(oVar4 == null || (aVar = oVar4.f102813t) == null)) {
                    str4 = aVar.f102726b;
                }
                C43732h.m86726a("payment_method", j, null, null, null, null, str, valueOf, valueOf2, str4, 60);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43909d(PaymentInfoVH paymentInfoVH, C43742c cVar) {
            super(700);
            this.f102369b = paymentInfoVH;
            this.f102370c = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH$e */
    public static final class C43910e extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102371a = 700;

        /* renamed from: b */
        final /* synthetic */ PaymentInfoVH f102372b;

        /* renamed from: c */
        final /* synthetic */ C43742c f102373c;

        static {
            Covode.recordClassIndex(52196);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            if (view != null) {
                OrderSubmitViewModel m = this.f102372b.mo63351m();
                Context context = this.f102372b.f102353f.getContext();
                C89219l.m154716b(context, "");
                m.mo74406a(context, false);
                HashMap<String, Object> j = this.f102372b.mo63351m().mo74424j();
                C44086o oVar = this.f102373c.f101970a;
                String str2 = null;
                if (oVar != null) {
                    str = oVar.mo74952c();
                } else {
                    str = null;
                }
                C44086o oVar2 = this.f102373c.f101970a;
                if (oVar2 != null) {
                    str2 = oVar2.f102805l;
                }
                C43732h.m86726a("add_new_payment", j, null, null, null, null, str, Boolean.valueOf(C80538hl.m139614a(str2)), null, null, 828);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43910e(PaymentInfoVH paymentInfoVH, C43742c cVar) {
            super(700);
            this.f102372b = paymentInfoVH;
            this.f102373c = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentInfoVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f102353f = view;
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102354j = C89250i.m154773a((AbstractC89171a) new C43906a(this, a, a));
        this.f102357m = (int) C13628n.m24520b(view.getContext(), 25.6f);
        this.f102358n = (int) C13628n.m24520b(view.getContext(), 16.0f);
        this.f102359o = (int) C13628n.m24520b(view.getContext(), 4.0f);
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48961e = C13628n.m24520b(view.getContext(), 2.0f);
        C20745e a2 = aVar.mo34169a();
        C89219l.m154716b(a2, "");
        this.f102360p = a2;
        this.f102361q = (int) C13628n.m24520b(view.getContext(), 26.0f);
        this.f102362r = (int) C13628n.m24520b(view.getContext(), 14.0f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43742c cVar) {
        boolean z;
        List<String> subList;
        boolean z2;
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        C44071a aVar;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        C44071a aVar2;
        MethodCollector.m26663i(8318);
        C43742c cVar2 = cVar;
        String str11 = "";
        C89219l.m154721d(cVar2, str11);
        int i = 8;
        if (!cVar2.f101975f) {
            this.f102353f.setVisibility(8);
            MethodCollector.m26664o(8318);
            return;
        }
        this.f102353f.setVisibility(0);
        String str12 = null;
        if (!this.f102355k) {
            this.f102355k = true;
            HashMap<String, Object> j = mo63351m().mo74424j();
            C44086o oVar = cVar2.f101970a;
            if (oVar != null) {
                str7 = oVar.mo74952c();
            } else {
                str7 = null;
            }
            C44086o oVar2 = cVar2.f101970a;
            if (oVar2 != null) {
                str8 = oVar2.f102805l;
            } else {
                str8 = null;
            }
            Boolean valueOf = Boolean.valueOf(C80538hl.m139614a(str8));
            C44086o oVar3 = cVar2.f101970a;
            if (oVar3 != null) {
                str9 = oVar3.f102812s;
            } else {
                str9 = null;
            }
            Boolean valueOf2 = Boolean.valueOf(C80538hl.m139614a(str9));
            C44086o oVar4 = cVar2.f101970a;
            if (oVar4 == null || (aVar2 = oVar4.f102813t) == null) {
                str10 = null;
            } else {
                str10 = aVar2.f102726b;
            }
            C43732h.m86727a("payment_method", j, (String) null, (String) null, str7, valueOf, valueOf2, str10, 60);
        }
        View view = this.f102353f;
        String string2 = view.getContext().getString(R.string.bi5);
        C89219l.m154716b(string2, str11);
        OrderSubmitInfoView orderSubmitInfoView = (OrderSubmitInfoView) view.findViewById(R.id.czr);
        if (orderSubmitInfoView != null) {
            String string3 = view.getContext().getString(R.string.bic);
            C89219l.m154716b(string3, str11);
            orderSubmitInfoView.setTitleText(string3);
        }
        OrderSubmitInfoView orderSubmitInfoView2 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
        if (orderSubmitInfoView2 != null) {
            orderSubmitInfoView2.setTitleFont(42);
        }
        OrderSubmitInfoView orderSubmitInfoView3 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
        if (orderSubmitInfoView3 != null) {
            orderSubmitInfoView3.setDescColor(C0643b.m2378c(view.getContext(), R.color.c5));
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.qd);
        C89219l.m154716b(linearLayout, str11);
        linearLayout.setVisibility(8);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.f8u);
        C89219l.m154716b(tuxIconView, str11);
        tuxIconView.setVisibility(8);
        if (cVar2.f101974e) {
            OrderSubmitInfoView orderSubmitInfoView4 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
            C44086o oVar5 = cVar2.f101970a;
            if (!(oVar5 == null || (str6 = oVar5.f102795b) == null)) {
                string2 = str6;
            }
            orderSubmitInfoView4.setDescText(string2);
            OrderSubmitInfoView orderSubmitInfoView5 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
            if (orderSubmitInfoView5 != null) {
                C44086o oVar6 = cVar2.f101970a;
                if (oVar6 != null) {
                    str5 = oVar6.f102798e;
                } else {
                    str5 = null;
                }
                orderSubmitInfoView5.setDescImage(str5);
            }
            OrderSubmitInfoView orderSubmitInfoView6 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
            if (orderSubmitInfoView6 != null) {
                orderSubmitInfoView6.setDescImageAlpha(1.0f);
            }
            OrderSubmitInfoView orderSubmitInfoView7 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
            if (orderSubmitInfoView7 != null) {
                orderSubmitInfoView7.mo74781a(true);
            }
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.gx);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            C44086o oVar7 = cVar2.f101970a;
            if (oVar7 != null) {
                str4 = oVar7.f102812s;
            } else {
                str4 = null;
            }
            if (C80538hl.m139614a(str4)) {
                str12 = str4;
            }
            if (str12 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.qd);
                C89219l.m154716b(linearLayout3, str11);
                linearLayout3.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.qe);
                C89219l.m154716b(tuxTextView, str11);
                tuxTextView.setText(str12);
                ((TuxTextView) view.findViewById(R.id.qe)).setTextColor(C0643b.m2378c(view.getContext(), R.color.c4));
            }
            C44086o oVar8 = cVar2.f101970a;
            if (!(oVar8 == null || (aVar = oVar8.f102813t) == null || !C89219l.m154714a((Object) false, (Object) aVar.f102725a))) {
                LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.qd);
                C89219l.m154716b(linearLayout4, str11);
                linearLayout4.setVisibility(0);
                TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.f8u);
                C89219l.m154716b(tuxIconView2, str11);
                tuxIconView2.setVisibility(0);
                ((TuxTextView) view.findViewById(R.id.qe)).setTextColor(C0643b.m2378c(view.getContext(), R.color.bd));
                OrderSubmitInfoView orderSubmitInfoView8 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
                if (orderSubmitInfoView8 != null) {
                    orderSubmitInfoView8.setDescColor(C0643b.m2378c(view.getContext(), R.color.bz));
                }
                OrderSubmitInfoView orderSubmitInfoView9 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
                if (orderSubmitInfoView9 != null) {
                    orderSubmitInfoView9.setDescImageAlpha(0.3f);
                }
            }
        } else {
            if (!this.f102356l) {
                this.f102356l = true;
                HashMap<String, Object> j2 = mo63351m().mo74424j();
                C44086o oVar9 = cVar2.f101970a;
                if (oVar9 != null) {
                    str2 = oVar9.mo74952c();
                } else {
                    str2 = null;
                }
                C44086o oVar10 = cVar2.f101970a;
                if (oVar10 != null) {
                    str3 = oVar10.f102805l;
                } else {
                    str3 = null;
                }
                C43732h.m86727a("add_new_payment", j2, (String) null, (String) null, str2, Boolean.valueOf(C80538hl.m139614a(str3)), (Boolean) null, (String) null, 828);
            }
            LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.gx);
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(0);
            }
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.ait);
            if (tuxTextView2 != null) {
                C44086o oVar11 = cVar2.f101970a;
                if (oVar11 == null || (string = oVar11.f102795b) == null) {
                    string = view.getContext().getString(R.string.bic);
                }
                tuxTextView2.setText(string);
            }
            C44086o oVar12 = cVar2.f101970a;
            if (oVar12 == null || (str = oVar12.f102805l) == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.ait);
                C89219l.m154716b(tuxTextView3, str11);
                ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
                if (layoutParams != null) {
                    ((ConstraintLayout.C0547a) layoutParams).topMargin = this.f102361q;
                    TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.czs);
                    C89219l.m154716b(tuxTextView4, str11);
                    tuxTextView4.setVisibility(8);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    MethodCollector.m26664o(8318);
                    throw nullPointerException;
                }
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) view.findViewById(R.id.ait);
                C89219l.m154716b(tuxTextView5, str11);
                ViewGroup.LayoutParams layoutParams2 = tuxTextView5.getLayoutParams();
                if (layoutParams2 != null) {
                    ((ConstraintLayout.C0547a) layoutParams2).topMargin = this.f102362r;
                    TuxTextView tuxTextView6 = (TuxTextView) view.findViewById(R.id.czs);
                    C89219l.m154716b(tuxTextView6, str11);
                    tuxTextView6.setVisibility(0);
                    TuxTextView tuxTextView7 = (TuxTextView) view.findViewById(R.id.czs);
                    C89219l.m154716b(tuxTextView7, str11);
                    C44086o oVar13 = cVar2.f101970a;
                    if (oVar13 != null) {
                        str12 = oVar13.f102805l;
                    }
                    tuxTextView7.setText(str12);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    MethodCollector.m26664o(8318);
                    throw nullPointerException2;
                }
            }
            List<C44086o> list = cVar2.f101971b;
            OrderSubmitInfoView orderSubmitInfoView10 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
            if (orderSubmitInfoView10 != null) {
                if (list != null && list.size() > 1) {
                    str11 = string2;
                }
                orderSubmitInfoView10.setDescText(str11);
            }
            OrderSubmitInfoView orderSubmitInfoView11 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
            if (orderSubmitInfoView11 != null) {
                if (list == null || list.size() <= 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                orderSubmitInfoView11.mo74781a(z2);
            }
            LinearLayout linearLayout6 = (LinearLayout) view.findViewById(R.id.czw);
            if (linearLayout6 != null) {
                linearLayout6.removeAllViews();
            }
            if (list == null || list.size() == 1) {
                TuxTextView tuxTextView8 = (TuxTextView) view.findViewById(R.id.czv);
                if (tuxTextView8 != null) {
                    tuxTextView8.setVisibility(8);
                }
                LinearLayout linearLayout7 = (LinearLayout) view.findViewById(R.id.czw);
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(8);
                }
            } else {
                TuxTextView tuxTextView9 = (TuxTextView) view.findViewById(R.id.czv);
                if (tuxTextView9 != null) {
                    if (cVar2.f101973d != null) {
                        i = 0;
                    }
                    tuxTextView9.setVisibility(i);
                }
                TuxTextView tuxTextView10 = (TuxTextView) view.findViewById(R.id.czv);
                if (tuxTextView10 != null) {
                    tuxTextView10.setText(cVar2.f101973d);
                }
                LinearLayout linearLayout8 = (LinearLayout) view.findViewById(R.id.czw);
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
                List<String> list2 = cVar2.f101972c;
                if (!(list2 == null || (subList = list2.subList(0, C89271h.m154772c(6, cVar2.f101972c.size()))) == null)) {
                    Iterator<T> it = subList.iterator();
                    while (it.hasNext()) {
                        SmartImageView smartImageView = new SmartImageView(view.getContext());
                        smartImageView.setLayoutParams(new LinearLayout.LayoutParams(this.f102357m, this.f102358n));
                        C23163i.m43668b(smartImageView, null, null, Integer.valueOf(this.f102359o), null, false, 27);
                        C20766v a = C20761r.m39061a((String) it.next());
                        a.f49115l = R.drawable.a5x;
                        a.f49092E = smartImageView;
                        a.mo34186c();
                        smartImageView.setCircleOptions(this.f102360p);
                        LinearLayout linearLayout9 = (LinearLayout) view.findViewById(R.id.czw);
                        if (linearLayout9 != null) {
                            linearLayout9.addView(smartImageView);
                        }
                    }
                }
            }
        }
        if (cVar2.f101971b != null) {
            if (cVar2.f101971b.size() != 1 || cVar2.f101974e) {
                OrderSubmitInfoView orderSubmitInfoView12 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
                if (orderSubmitInfoView12 != null) {
                    orderSubmitInfoView12.setOnClickListener(new C43909d(this, cVar2));
                }
            } else {
                OrderSubmitInfoView orderSubmitInfoView13 = (OrderSubmitInfoView) view.findViewById(R.id.czr);
                if (orderSubmitInfoView13 != null) {
                    orderSubmitInfoView13.setOnClickListener(new C43907b());
                }
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.gw);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new C43910e(this, cVar2));
            MethodCollector.m26664o(8318);
            return;
        }
        MethodCollector.m26664o(8318);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH$f */
    static final class C43911f extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102374a;

        /* renamed from: b */
        final /* synthetic */ PaymentInfoVH f102375b;

        static {
            Covode.recordClassIndex(52197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43911f(View view, PaymentInfoVH paymentInfoVH) {
            super(2);
            this.f102374a = view;
            this.f102375b = paymentInfoVH;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            SuperElement superElement;
            SuperElement superElement2;
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            if (!booleanValue && (superElement = (SuperElement) this.f102374a.findViewById(R.id.ebp)) != null && superElement.hasFocus() && (superElement2 = (SuperElement) this.f102374a.findViewById(R.id.ebp)) != null) {
                superElement2.clearFocus();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH$h */
    static final class C43913h extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C43742c>, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102378a;

        /* renamed from: b */
        final /* synthetic */ PaymentInfoVH f102379b;

        static {
            Covode.recordClassIndex(52199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43913h(View view, PaymentInfoVH paymentInfoVH) {
            super(2);
            this.f102378a = view;
            this.f102379b = paymentInfoVH;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C43742c> jediSimpleViewHolder, Boolean bool) {
            C44086o oVar;
            boolean z;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(jediSimpleViewHolder, "");
            if (booleanValue) {
                SuperElement superElement = (SuperElement) this.f102378a.findViewById(R.id.ebp);
                AbstractC44225e eVar = superElement.f103039c;
                C44075e eVar2 = superElement.f103037a;
                C44085n nVar = superElement.f103038b;
                if (nVar != null) {
                    oVar = nVar.f102789b;
                } else {
                    oVar = null;
                }
                if (!(eVar == null || eVar2 == null || oVar == null)) {
                    String a = C44048c.m86895a(eVar2, oVar, eVar.getValue());
                    C44085n nVar2 = superElement.f103038b;
                    if (nVar2 != null) {
                        if (a == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        nVar2.f102791d = Boolean.valueOf(z);
                    }
                    eVar.mo75055a(eVar2, oVar, eVar.getValue(), a);
                }
                this.f102379b.mo63351m().mo74417b(false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH$g */
    static final class C43912g extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C43742c>, C44085n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102376a;

        /* renamed from: b */
        final /* synthetic */ PaymentInfoVH f102377b;

        static {
            Covode.recordClassIndex(52198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43912g(View view, PaymentInfoVH paymentInfoVH) {
            super(2);
            this.f102376a = view;
            this.f102377b = paymentInfoVH;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C43742c> jediSimpleViewHolder, C44085n nVar) {
            List<C44084m> paymentElements;
            C44075e elementDTO;
            C44075e elementDTO2;
            List<C44075e> list;
            C44085n nVar2 = nVar;
            C89219l.m154721d(jediSimpleViewHolder, "");
            if (nVar2 != null) {
                C44086o oVar = nVar2.f102789b;
                C44075e eVar = (oVar == null || (list = oVar.f102811r) == null) ? null : (C44075e) C89070n.m154583g((List) list);
                if (eVar != null) {
                    SuperElement superElement = (SuperElement) this.f102376a.findViewById(R.id.ebp);
                    C89219l.m154716b(superElement, "");
                    superElement.setVisibility(0);
                    SuperElement superElement2 = (SuperElement) this.f102376a.findViewById(R.id.ebp);
                    C89219l.m154721d(eVar, "");
                    C89219l.m154721d(nVar2, "");
                    superElement2.f103037a = eVar;
                    superElement2.f103038b = nVar2;
                    C44086o oVar2 = nVar2.f102789b;
                    if (oVar2 != null) {
                        AbstractC44225e eVar2 = superElement2.f103039c;
                        if (!C89219l.m154714a((Object) ((eVar2 == null || (elementDTO2 = eVar2.getElementDTO()) == null) ? null : elementDTO2.f102742a), (Object) eVar.f102742a)) {
                            C44086o oVar3 = nVar2.f102789b;
                            Context context = superElement2.getContext();
                            C89219l.m154716b(context, "");
                            superElement2.f103039c = AbstractC44225e.C44226a.m86984a(eVar, oVar3, context);
                            AbstractC44225e eVar3 = superElement2.f103039c;
                            String str = (eVar3 == null || (elementDTO = eVar3.getElementDTO()) == null) ? null : elementDTO.f102742a;
                            if (!C89219l.m154714a((Object) str, (Object) eVar.f102742a)) {
                                superElement2.removeAllViews();
                            }
                            AbstractC44225e eVar4 = superElement2.f103039c;
                            Objects.requireNonNull(eVar4, "null cannot be cast to non-null type android.view.View");
                            superElement2.addView((View) eVar4);
                        }
                        List<C44075e> a = eVar.mo74915a();
                        ArrayList arrayList = new ArrayList();
                        for (T t : a) {
                            C44087p pVar = nVar2.f102788a;
                            if (pVar != null && (paymentElements = pVar.getPaymentElements()) != null) {
                                Iterator<T> it = paymentElements.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (C89219l.m154714a((Object) next.getElement(), (Object) t.f102742a)) {
                                        if (next != null) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        AbstractC44225e eVar5 = superElement2.f103039c;
                        if (eVar5 != null) {
                            eVar5.mo75055a(eVar, oVar2, arrayList2, null);
                            if (eVar5 instanceof AbstractC44228g) {
                                ((AbstractC44228g) eVar5).setOnVerify(new SuperElement.C44184a(superElement2, eVar, oVar2, arrayList2));
                            }
                        }
                    }
                    this.f102377b.mo63351m().mo74420c(false);
                } else {
                    SuperElement superElement3 = (SuperElement) this.f102376a.findViewById(R.id.ebp);
                    C89219l.m154716b(superElement3, "");
                    superElement3.setVisibility(8);
                    this.f102377b.mo63351m().mo74420c(true);
                }
            }
            return C89391z.f203057a;
        }
    }
}
