package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43855i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44071a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget */
public final class OrderSubmitBottomWidget extends JediBaseWidget implements AbstractC33974au {

    /* renamed from: j */
    public static final C43945b f102456j = new C43945b((byte) 0);

    /* renamed from: h */
    public boolean f102457h;

    /* renamed from: i */
    public String f102458i;

    /* renamed from: k */
    private final AbstractC89244h f102459k;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$k */
    static final class View$OnClickListenerC43957k implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC43957k f102482a = new View$OnClickListenerC43957k();

        static {
            Covode.recordClassIndex(52247);
        }

        View$OnClickListenerC43957k() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(52233);
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return R.layout.rd;
    }

    /* renamed from: l */
    public final OrderSubmitViewModel mo74828l() {
        return (OrderSubmitViewModel) this.f102459k.getValue();
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$b */
    public static final class C43945b {
        static {
            Covode.recordClassIndex(52235);
        }

        private C43945b() {
        }

        public /* synthetic */ C43945b(byte b) {
            this();
        }
    }

    public OrderSubmitBottomWidget() {
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102459k = C89250i.m154773a((AbstractC89171a) new C43944a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$a */
    public static final class C43944a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f102460a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102461b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102462c;

        static {
            Covode.recordClassIndex(52234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43944a(Widget widget, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102460a = widget;
            this.f102461b = cVar;
            this.f102462c = cVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget.C43944a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_widget_OrderSubmitBottomWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86837x9e95c306(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: c */
    public final void mo39080c() {
        super.mo39080c();
        View view = this.f56005e;
        if (view != null) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.emk);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(view.getContext().getString(R.string.fuw));
            AbstractC88412b unused = selectSubscribe(mo74828l(), C43959a.f102484a, new C20370ah(), new C43946c(view, this));
            AbstractC88412b unused2 = selectSubscribe(mo74828l(), C43963e.f102488a, new C20370ah(), new C43947d(view, this));
            AbstractC88412b unused3 = selectSubscribe(mo74828l(), C43964f.f102489a, C43965g.f102490a, new C20370ah(), new C43948e(view, this));
            AbstractC88412b unused4 = selectSubscribe(mo74828l(), C43966h.f102491a, new C20370ah(), new C43949f(view, this));
            AbstractC88412b unused5 = selectSubscribe(mo74828l(), C43960b.f102485a, new C20370ah(), new C43954i(view));
            AbstractC88412b unused6 = selectSubscribe(mo74828l(), C43961c.f102486a, C43962d.f102487a, new C20370ah(), new C43955j(view));
            TuxButton tuxButton = (TuxButton) view.findViewById(R.id.d2f);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setOnClickListener(new C43951g(view, this));
            View findViewById = view.findViewById(R.id.ebo);
            C89219l.m154716b(findViewById, "");
            findViewById.setOnClickListener(new C43953h(this));
            view.setOnClickListener(View$OnClickListenerC43957k.f102482a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$h */
    public static final class C43953h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102477a = 700;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitBottomWidget f102478b;

        static {
            Covode.recordClassIndex(52243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43953h(OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(700);
            this.f102478b = orderSubmitBottomWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                OrderSubmitBottomWidget orderSubmitBottomWidget = this.f102478b;
                C43732h.m86726a("total", orderSubmitBottomWidget.mo74828l().mo74424j(), null, null, null, null, null, null, null, null, 1020);
                orderSubmitBottomWidget.withState(orderSubmitBottomWidget.mo74828l(), new C43958l(orderSubmitBottomWidget));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$g */
    public static final class C43951g extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102473a = 700;

        /* renamed from: b */
        final /* synthetic */ View f102474b;

        /* renamed from: c */
        final /* synthetic */ OrderSubmitBottomWidget f102475c;

        static {
            Covode.recordClassIndex(52241);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                OrderSubmitBottomWidget orderSubmitBottomWidget = this.f102475c;
                orderSubmitBottomWidget.withState(orderSubmitBottomWidget.mo74828l(), new AbstractC89172b<OrderSubmitState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget.C43951g.C439521 */

                    /* renamed from: a */
                    final /* synthetic */ C43951g f102476a;

                    static {
                        Covode.recordClassIndex(52242);
                    }

                    {
                        this.f102476a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
                        Boolean bool;
                        C44085n userPaymentInfo;
                        C44086o oVar;
                        C44071a aVar;
                        String str;
                        String str2;
                        C44086o oVar2;
                        C44086o oVar3;
                        C44071a aVar2;
                        OrderSubmitState orderSubmitState2 = orderSubmitState;
                        C89219l.m154721d(orderSubmitState2, "");
                        if (orderSubmitState2.getReachableAny()) {
                            C44085n userPaymentInfo2 = orderSubmitState2.getUserPaymentInfo();
                            if (userPaymentInfo2 == null || (oVar3 = userPaymentInfo2.f102789b) == null || (aVar2 = oVar3.f102813t) == null) {
                                bool = null;
                            } else {
                                bool = aVar2.f102725a;
                            }
                            if (C89219l.m154714a((Object) bool, (Object) false) && (userPaymentInfo = orderSubmitState2.getUserPaymentInfo()) != null && (oVar = userPaymentInfo.f102789b) != null && (aVar = oVar.f102813t) != null && (str = aVar.f102727c) != null && C80538hl.m139614a(str)) {
                                OrderSubmitViewModel l = this.f102476a.f102475c.mo74828l();
                                Context context = this.f102476a.f102474b.getContext();
                                C89219l.m154716b(context, "");
                                C44085n userPaymentInfo3 = orderSubmitState2.getUserPaymentInfo();
                                if (userPaymentInfo3 == null || (oVar2 = userPaymentInfo3.f102789b) == null) {
                                    str2 = null;
                                } else {
                                    str2 = oVar2.mo74952c();
                                }
                                C89219l.m154721d(context, "");
                                C89219l.m154721d(str, "");
                                C43732h.m86721a("balance_insufficient", (String) null, str2);
                                ((C23023b) C23028c.m43435a(C23013a.C23015a.m43405a(context).mo37413d(str), new OrderSubmitViewModel.C43675af(l, context, str2)).mo37482a(false)).mo37405a().mo37396b().show();
                            } else if (!orderSubmitState2.getHasAddress()) {
                                this.f102476a.f102475c.mo74828l().mo74404a(this.f102476a.f102474b.getContext());
                                C43732h.m86725a("add_shipping_address", "next", this.f102476a.f102475c.mo74828l().mo74424j(), (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, 240);
                                C43732h.m86717a("bottom");
                            } else if (orderSubmitState2.getUserPaymentInfo() == null) {
                                OrderSubmitViewModel l2 = this.f102476a.f102475c.mo74828l();
                                Context context2 = this.f102476a.f102474b.getContext();
                                C89219l.m154716b(context2, "");
                                l2.mo74406a(context2, false);
                                C43732h.m86725a("add_payment_method", "confirm", this.f102476a.f102475c.mo74828l().mo74424j(), (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, 240);
                            } else {
                                if (orderSubmitState2.getOrderSummaryPanelOpened()) {
                                    this.f102476a.f102475c.mo74828l().mo74413a(false);
                                }
                                HashMap<String, Object> j = this.f102476a.f102475c.mo74828l().mo74424j();
                                C89219l.m154721d(j, "");
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.putAll(C43732h.f101921a);
                                linkedHashMap.putAll(j);
                                C45544c.m88082a("tiktokec_submit_order", linkedHashMap);
                                C43732h.m86725a("place_order", "next", this.f102476a.f102475c.mo74828l().mo74424j(), (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, 240);
                                this.f102476a.f102475c.mo74828l().mo74416b(this.f102476a.f102474b.getContext());
                            }
                        }
                        return C89391z.f203057a;
                    }
                });
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43951g(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(700);
            this.f102474b = view;
            this.f102475c = orderSubmitBottomWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$l */
    static final class C43958l extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitBottomWidget f102483a;

        static {
            Covode.recordClassIndex(52248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43958l(OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(1);
            this.f102483a = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            if (orderSubmitState2.getOrderSummaryPanelOpened()) {
                this.f102483a.mo74828l().mo74413a(false);
            } else {
                this.f102483a.mo74828l().mo74413a(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$f */
    static final class C43949f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102469a;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitBottomWidget f102470b;

        static {
            Covode.recordClassIndex(52239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43949f(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(2);
            this.f102469a = view;
            this.f102470b = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            AbstractC20477i iVar2 = iVar;
            final boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f102470b.mo74828l(), new AbstractC89172b<OrderSubmitState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget.C43949f.C439501 */

                /* renamed from: a */
                final /* synthetic */ C43949f f102471a;

                static {
                    Covode.recordClassIndex(52240);
                }

                {
                    this.f102471a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
                    Context context;
                    int i;
                    OrderSubmitState orderSubmitState2 = orderSubmitState;
                    C89219l.m154721d(orderSubmitState2, "");
                    int i2 = 0;
                    if (booleanValue) {
                        TuxIconView tuxIconView = (TuxIconView) this.f102471a.f102469a.findViewById(R.id.ejm);
                        C89219l.m154716b(tuxIconView, "");
                        tuxIconView.setVisibility(0);
                        TuxTextView tuxTextView = (TuxTextView) this.f102471a.f102469a.findViewById(R.id.emk);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setVisibility(0);
                        TuxTextView tuxTextView2 = (TuxTextView) this.f102471a.f102469a.findViewById(R.id.emj);
                        C89219l.m154716b(tuxTextView2, "");
                        tuxTextView2.setVisibility(0);
                        ((TuxButton) this.f102471a.f102469a.findViewById(R.id.d2f)).setButtonVariant(0);
                    } else {
                        TuxIconView tuxIconView2 = (TuxIconView) this.f102471a.f102469a.findViewById(R.id.ejm);
                        C89219l.m154716b(tuxIconView2, "");
                        tuxIconView2.setVisibility(8);
                        TuxTextView tuxTextView3 = (TuxTextView) this.f102471a.f102469a.findViewById(R.id.emk);
                        C89219l.m154716b(tuxTextView3, "");
                        tuxTextView3.setVisibility(8);
                        TuxTextView tuxTextView4 = (TuxTextView) this.f102471a.f102469a.findViewById(R.id.emj);
                        C89219l.m154716b(tuxTextView4, "");
                        tuxTextView4.setVisibility(8);
                        TuxTextView tuxTextView5 = (TuxTextView) this.f102471a.f102469a.findViewById(R.id.axk);
                        C89219l.m154716b(tuxTextView5, "");
                        if (orderSubmitState2.getHasAddress()) {
                            i2 = 8;
                        }
                        tuxTextView5.setVisibility(i2);
                        TuxButton tuxButton = (TuxButton) this.f102471a.f102469a.findViewById(R.id.d2f);
                        C89219l.m154716b(tuxButton, "");
                        if (orderSubmitState2.getHasAddress()) {
                            context = this.f102471a.f102469a.getContext();
                            i = R.string.fuk;
                        } else {
                            context = this.f102471a.f102469a.getContext();
                            i = R.string.fu7;
                        }
                        tuxButton.setText(context.getString(i));
                        TuxButton tuxButton2 = (TuxButton) this.f102471a.f102469a.findViewById(R.id.d2f);
                        C89219l.m154716b(tuxButton2, "");
                        tuxButton2.setBackground(C0643b.m2369a(this.f102471a.f102469a.getContext(), (int) R.drawable.xt));
                        ((TuxButton) this.f102471a.f102469a.findViewById(R.id.d2f)).setTextColor(C0643b.m2378c(this.f102471a.f102469a.getContext(), R.color.bz));
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$c */
    static final class C43946c extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102463a;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitBottomWidget f102464b;

        static {
            Covode.recordClassIndex(52236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43946c(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(2);
            this.f102463a = view;
            this.f102464b = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(str2, "");
            TuxTextView tuxTextView = (TuxTextView) this.f102463a.findViewById(R.id.emj);
            if (tuxTextView != null) {
                tuxTextView.setText(str2);
            }
            if (!this.f102464b.f102457h) {
                this.f102464b.f102457h = true;
                C43732h.m86727a("total", this.f102464b.mo74828l().mo74424j(), (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 1020);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$i */
    static final class C43954i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102479a;

        static {
            Covode.recordClassIndex(52244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43954i(View view) {
            super(2);
            this.f102479a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                TuxIconView tuxIconView = (TuxIconView) this.f102479a.findViewById(R.id.ejm);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setRotation(180.0f);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) this.f102479a.findViewById(R.id.ejm);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setRotation(0.0f);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$d */
    static final class C43947d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102465a;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitBottomWidget f102466b;

        static {
            Covode.recordClassIndex(52237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43947d(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(2);
            this.f102465a = view;
            this.f102466b = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            if (intValue > 0 && this.f102466b.mo74828l().f101782a != 0) {
                Context context = this.f102465a.getContext();
                C89219l.m154716b(context, "");
                SpannableString spannableString = new SpannableString(context.getResources().getQuantityString(R.plurals.bz, intValue, Integer.valueOf(intValue)));
                int a = C89361p.m154888a((CharSequence) spannableString, "(", 0, false, 6);
                int a2 = C89361p.m154888a((CharSequence) spannableString, ")", 0, false, 6) + 1;
                if (!(a == -1 || a2 == -1 || a >= a2)) {
                    spannableString.setSpan(new C23126b(31, true), a, a2, 33);
                }
                TuxTextView tuxTextView = (TuxTextView) this.f102465a.findViewById(R.id.emk);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(spannableString);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$e */
    static final class C43948e extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Boolean, C44085n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102467a;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitBottomWidget f102468b;

        static {
            Covode.recordClassIndex(52238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43948e(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(3);
            this.f102467a = view;
            this.f102468b = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool, C44085n nVar) {
            String str;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (!booleanValue) {
                str = "add_shipping_address";
            } else if (nVar == null) {
                str = "add_payment_method";
            } else {
                str = "place_order";
            }
            if (!C89219l.m154714a((Object) str, (Object) this.f102468b.f102458i)) {
                C43732h.m86724a(str, "next", this.f102468b.mo74828l().mo74424j(), (String) null, (String) null, (Boolean) null, 112);
                this.f102468b.f102458i = str;
            }
            if (!booleanValue) {
                TuxButton tuxButton = (TuxButton) this.f102467a.findViewById(R.id.d2f);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setText(this.f102467a.getContext().getString(R.string.fu7));
                TuxTextView tuxTextView = (TuxTextView) this.f102467a.findViewById(R.id.axk);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
            } else if (nVar == null) {
                TuxButton tuxButton2 = (TuxButton) this.f102467a.findViewById(R.id.d2f);
                C89219l.m154716b(tuxButton2, "");
                tuxButton2.setText(this.f102467a.getContext().getString(R.string.bi4));
                TuxTextView tuxTextView2 = (TuxTextView) this.f102467a.findViewById(R.id.axk);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                TuxButton tuxButton3 = (TuxButton) this.f102467a.findViewById(R.id.d2f);
                C89219l.m154716b(tuxButton3, "");
                tuxButton3.setText(this.f102467a.getContext().getString(R.string.fuk));
                TuxTextView tuxTextView3 = (TuxTextView) this.f102467a.findViewById(R.id.axk);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget$j */
    static final class C43955j extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, C43855i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102480a;

        static {
            Covode.recordClassIndex(52245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43955j(View view) {
            super(3);
            this.f102480a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C43855i iVar2, Boolean bool) {
            Set<String> keySet;
            String str;
            C43855i iVar3 = iVar2;
            final boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            C439561 r0 = new AbstractC89172b<C43855i, Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget.C43955j.C439561 */

                static {
                    Covode.recordClassIndex(52246);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Boolean invoke(C43855i iVar) {
                    return Boolean.valueOf(mo74829a(iVar));
                }

                /* renamed from: a */
                public final boolean mo74829a(C43855i iVar) {
                    HashMap<String, String> hashMap;
                    Set<String> keySet;
                    C89219l.m154721d(iVar, "");
                    String str = iVar.f102197a;
                    if (str == null || str.length() == 0 || (hashMap = iVar.f102198b) == null || hashMap.isEmpty() || (keySet = iVar.f102198b.keySet()) == null || keySet.isEmpty() || booleanValue) {
                        return true;
                    }
                    return false;
                }
            };
            if (iVar3 == null || r0.mo74829a(iVar3)) {
                TuxTextView tuxTextView = (TuxTextView) this.f102480a.findViewById(R.id.v1);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(8);
            } else {
                String str2 = iVar3.f102197a;
                HashMap<String, String> hashMap = iVar3.f102198b;
                if (!(hashMap == null || (keySet = hashMap.keySet()) == null || (str = (String) C89070n.m154559b((Iterable) keySet)) == null)) {
                    C89219l.m154716b(str, "");
                    String str3 = iVar3.f102198b.get(str);
                    if (str3 != null) {
                        C89219l.m154716b(str3, "");
                        if (str2 != null) {
                            int a = C89361p.m154888a((CharSequence) str2, str, 0, false, 6);
                            int length = str.length() + a;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            String substring = str2.substring(0, a);
                            C89219l.m154716b(substring, "");
                            spannableStringBuilder.append((CharSequence) substring);
                            SpannableString spannableString = new SpannableString(str3);
                            spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(this.f102480a.getContext(), R.color.bh)), 0, str3.length(), 33);
                            spannableStringBuilder.append((CharSequence) spannableString);
                            String substring2 = str2.substring(length);
                            C89219l.m154716b(substring2, "");
                            spannableStringBuilder.append((CharSequence) substring2);
                            TuxTextView tuxTextView2 = (TuxTextView) this.f102480a.findViewById(R.id.v1);
                            C89219l.m154716b(tuxTextView2, "");
                            tuxTextView2.setText(spannableStringBuilder);
                            TuxTextView tuxTextView3 = (TuxTextView) this.f102480a.findViewById(R.id.v1);
                            C89219l.m154716b(tuxTextView3, "");
                            tuxTextView3.setVisibility(0);
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
