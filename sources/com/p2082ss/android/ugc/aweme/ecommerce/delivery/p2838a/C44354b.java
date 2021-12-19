package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.C44348a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.C44479b;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.EnumC44478a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.C44397b;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.C44425b;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44454a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45620e;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b */
public final class C44354b extends AbstractC44374g implements AbstractC20527q {

    /* renamed from: a */
    public boolean f103459a;

    /* renamed from: b */
    public long f103460b = SystemClock.elapsedRealtime();

    static {
        Covode.recordClassIndex(52686);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: b */
    public final void mo75399b() {
        withState(this.f103483d, new C44368j(this, ActivityStack.isAppBackGround()));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: d */
    public final void mo75401d() {
        withState(this.f103483d, new C44369k(this));
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f103482c.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$b */
    static final class C44357b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103463a;

        static {
            Covode.recordClassIndex(52689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44357b(C44354b bVar) {
            super(0);
            this.f103463a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f103463a.f103483d.f103667b.invoke();
            C44348a.m87067a("close", "close", null, null, null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$c */
    static final class C44358c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103464a;

        static {
            Covode.recordClassIndex(52690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44358c(C44354b bVar) {
            super(0);
            this.f103464a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f103464a.f103483d.mo75477a(EnumC44478a.POP);
            this.f103464a.f103483d.mo75478a(C443591.f103465a);
            C44348a.m87067a("close", "return", null, null, null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$d */
    static final class C44360d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103466a;

        /* renamed from: b */
        final /* synthetic */ C45620e f103467b;

        static {
            Covode.recordClassIndex(52692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44360d(C44354b bVar, C45620e eVar) {
            super(0);
            this.f103466a = bVar;
            this.f103467b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean b = this.f103467b.mo76831b();
            if (!b) {
                this.f103466a.f103483d.mo75478a(C443611.f103468a);
            }
            return Boolean.valueOf(b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: e */
    public final void mo75402e() {
        C44720k a;
        if ((this.f103483d.f103666a instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (a = C44720k.C44721a.m87476a(this.f103482c.getContext())) != null) {
            a.mo75872b("glide_close", (Boolean) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$h */
    static final class C44366h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103473a;

        static {
            Covode.recordClassIndex(52698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44366h(C44354b bVar) {
            super(0);
            this.f103473a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C44720k a;
            if ((this.f103473a.f103483d.f103666a instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (a = C44720k.C44721a.m87476a(this.f103473a.f103482c.getContext())) != null) {
                a.mo75872b("quit", (Boolean) null);
            }
            this.f103473a.f103482c.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: c */
    public final void mo75400c() {
        this.f103482c.getChildFragmentManager().mo3552a().mo3453a(R.id.aja, new C44425b()).mo3473c();
        AbstractC88412b unused = selectSubscribe(this.f103483d, C44371d.f103479a, new C20370ah(), new C44362e(this));
        AbstractC88412b unused2 = selectSubscribe(this.f103483d, C44372e.f103480a, new C20370ah(), new C44363f(this));
        AbstractC88412b unused3 = selectSubscribe(this.f103483d, C44373f.f103481a, new C20370ah(), new C44364g(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: a */
    public final void mo75397a() {
        DeliveryPanelStarter.EnterParam enterParam;
        Object obj;
        DeliveryPanelViewModel deliveryPanelViewModel = this.f103483d;
        C44366h hVar = new C44366h(this);
        C89219l.m154721d(hVar, "");
        deliveryPanelViewModel.f103667b = hVar;
        Bundle arguments = this.f103482c.getArguments();
        if (arguments != null && (enterParam = (DeliveryPanelStarter.EnterParam) arguments.getParcelable("enter_param")) != null) {
            if (enterParam.f103409g == null) {
                this.f103483d.f103666a = new DeliveryPanelStarter.EnterParamForProductDetailPage(enterParam.f103403a, enterParam.f103404b, enterParam.f103405c, enterParam.f103406d, enterParam.f103407e, enterParam.f103408f, enterParam.f103410h);
            } else {
                this.f103483d.f103666a = new DeliveryPanelStarter.EnterParamForOrderSubmitPage(enterParam.f103409g, enterParam.f103403a, enterParam.f103410h);
            }
            try {
                obj = C45264j.m87844a().mo46670a(enterParam.f103410h, HashMap.class);
            } catch (Exception unused) {
                obj = null;
            }
            HashMap hashMap = (HashMap) obj;
            C44348a.f103431a.clear();
            C44348a.f103432b = -1;
            C44348a.f103432b = System.currentTimeMillis();
            LinkedHashMap<String, Object> linkedHashMap = C44348a.f103431a;
            if (hashMap != null) {
                linkedHashMap.putAll(hashMap);
            }
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "logistics");
            linkedHashMap.put("is_fullscreen", 0);
            linkedHashMap.remove("shipping_price");
            linkedHashMap.remove("shipping_currency");
            linkedHashMap.remove("free_shipping_condition");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$i */
    public static final class DialogInterface$OnKeyListenerC44367i implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C44354b f103474a;

        static {
            Covode.recordClassIndex(52699);
        }

        DialogInterface$OnKeyListenerC44367i(C44354b bVar) {
            this.f103474a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
                return false;
            }
            boolean booleanValue = this.f103474a.f103483d.f103668c.invoke().booleanValue();
            if (!booleanValue) {
                AbstractC0952i childFragmentManager = this.f103474a.f103482c.getChildFragmentManager();
                C89219l.m154716b(childFragmentManager, "");
                if (childFragmentManager.mo3565f().size() > 1) {
                    this.f103474a.f103483d.mo75477a(EnumC44478a.POP);
                    return true;
                }
            }
            return booleanValue;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$a */
    static final class C44355a extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103461a;

        static {
            Covode.recordClassIndex(52687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44355a(C44354b bVar) {
            super(1);
            this.f103461a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            this.f103461a.f103483d.mo75476a(this.f103461a.f103482c.getContext(), list);
            this.f103461a.f103483d.mo75478a(C443561.f103462a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: a */
    public final void mo75398a(Dialog dialog) {
        C89219l.m154721d(dialog, "");
        dialog.setOnKeyListener(new DialogInterface$OnKeyListenerC44367i(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$k */
    static final class C44369k extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103477a;

        static {
            Covode.recordClassIndex(52701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44369k(C44354b bVar) {
            super(1);
            this.f103477a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            DeliveryPanelStarter.PackedDeliverySelectResult a = this.f103477a.mo75403a(deliveryPanelState2);
            String b = C33039i.m67673a().mo46674b(a);
            if (b != null) {
                EventCenter.m87158a().mo75479a("ec_delivery_panel_close", b);
            }
            DeliveryPanelStarter.m87060a(a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo75404a(Fragment fragment) {
        AbstractC0976n a = this.f103482c.getChildFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        AbstractC0976n a2 = a.mo3452a(R.anim.aq, R.anim.ar, R.anim.aq, R.anim.ar);
        C89219l.m154716b(a2, "");
        a2.mo3453a(R.id.aja, fragment).mo3457a((String) null).mo3473c();
    }

    /* renamed from: a */
    public final DeliveryPanelStarter.PackedDeliverySelectResult mo75403a(DeliveryPanelState deliveryPanelState) {
        Address address;
        String str;
        Address address2;
        if (!deliveryPanelState.getApply()) {
            return new DeliveryPanelStarter.PackedDeliverySelectResult();
        }
        Parcelable parcelable = this.f103483d.f103666a;
        String str2 = null;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            C44457d a = deliveryPanelState.getSelectedShipToInfo().mo75409a();
            if (a == null || (address2 = a.f103650b) == null) {
                str = null;
            } else {
                str = address2.f101187a;
            }
            DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable;
            boolean z = true;
            if (!(!C89219l.m154714a((Object) str, (Object) enterParamForProductDetailPage.f103415b)) && !(!C89219l.m154714a(deliveryPanelState.getSelectedShipToInfo().mo75411b(), enterParamForProductDetailPage.f103416c))) {
                z = false;
            }
            C44720k a2 = C44720k.C44721a.m87476a(this.f103482c.getContext());
            if (a2 != null) {
                a2.mo75872b("continue", Boolean.valueOf(z));
            }
        }
        LogisticDTO selectedLogistic = deliveryPanelState.getSelectedLogistic();
        C44457d a3 = deliveryPanelState.getSelectedShipToInfo().mo75409a();
        if (!(a3 == null || (address = a3.f103650b) == null)) {
            str2 = address.f101187a;
        }
        return new DeliveryPanelStarter.PackedDeliverySelectResult(selectedLogistic, str2, deliveryPanelState.getSelectedShipToInfo().mo75411b());
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$j */
    static final class C44368j extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103475a;

        /* renamed from: b */
        final /* synthetic */ boolean f103476b;

        static {
            Covode.recordClassIndex(52700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44368j(C44354b bVar, boolean z) {
            super(1);
            this.f103475a = bVar;
            this.f103476b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
            boolean z;
            String str;
            boolean z2;
            Integer num;
            Float f;
            String str2;
            LogisticTextDTO logisticTextDTO;
            Price price;
            Price price2;
            String priceVal;
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            C44454a aVar = this.f103475a.f103483d.f103669d;
            if (aVar == null || !(!aVar.f103641b.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            if (deliveryPanelState2.getApply()) {
                str = "next";
            } else if (this.f103476b) {
                str = "close";
            } else {
                str = "return";
            }
            if (!z || deliveryPanelState2.getSelectedShipToInfo().mo75409a() == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            DeliveryPanelStarter.PackedDeliverySelectResult a = this.f103475a.mo75403a(deliveryPanelState2);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f103475a.f103460b;
            boolean z3 = this.f103475a.f103459a;
            LogisticDTO selectedLogistic = deliveryPanelState2.getSelectedLogistic();
            String str3 = null;
            if (selectedLogistic != null) {
                num = Integer.valueOf(selectedLogistic.f103614a);
            } else {
                num = null;
            }
            LogisticDTO selectedLogistic2 = deliveryPanelState2.getSelectedLogistic();
            if (selectedLogistic2 == null || (price2 = selectedLogistic2.f103619f) == null || (priceVal = price2.getPriceVal()) == null) {
                f = null;
            } else {
                f = C89361p.m154861c(priceVal);
            }
            LogisticDTO selectedLogistic3 = deliveryPanelState2.getSelectedLogistic();
            if (selectedLogistic3 == null || (price = selectedLogistic3.f103619f) == null) {
                str2 = null;
            } else {
                str2 = price.getCurrency();
            }
            LogisticDTO selectedLogistic4 = deliveryPanelState2.getSelectedLogistic();
            if (!(selectedLogistic4 == null || (logisticTextDTO = selectedLogistic4.f103623j) == null)) {
                str3 = logisticTextDTO.f103630f;
            }
            C89219l.m154721d(a, "");
            C89219l.m154721d(str, "");
            C45544c.m88081a("tiktokec_stay_page", new C44348a.C44352d(elapsedRealtime, z, str, z2, z3, a, num, f, str2, str3));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: a */
    public final View mo75396a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.oh, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$e */
    static final class C44362e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103469a;

        static {
            Covode.recordClassIndex(52694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44362e(C44354b bVar) {
            super(2);
            this.f103469a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f103469a.f103482c.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44354b(C44294a aVar, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(aVar, deliveryPanelViewModel);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(deliveryPanelViewModel, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$g */
    static final class C44364g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103471a;

        static {
            Covode.recordClassIndex(52696);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44364g(C44354b bVar) {
            super(2);
            this.f103471a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            AbstractC20477i iVar2 = iVar;
            int intValue = num.intValue();
            C89219l.m154721d(iVar2, "");
            if (intValue == -1 && !this.f103471a.f103459a) {
                iVar2.withState(this.f103471a.f103483d, new AbstractC89172b<DeliveryPanelState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.C44354b.C44364g.C443651 */

                    /* renamed from: a */
                    final /* synthetic */ C44364g f103472a;

                    static {
                        Covode.recordClassIndex(52697);
                    }

                    {
                        this.f103472a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
                        List<LogisticDTO> list;
                        boolean z;
                        DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                        C89219l.m154721d(deliveryPanelState2, "");
                        this.f103472a.f103471a.f103459a = true;
                        C44720k a = C44720k.C44721a.m87476a(this.f103472a.f103471a.f103482c.getContext());
                        if (a != null) {
                            if (deliveryPanelState2.getSelectedShipToInfo().f103498a != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a.mo75862a("logistics", Boolean.valueOf(z));
                        }
                        boolean z2 = !deliveryPanelState2.getAddressRenderData().isEmpty();
                        C44454a aVar = this.f103472a.f103471a.f103483d.f103669d;
                        if (!(aVar == null || (list = aVar.f103640a) == null)) {
                            ArrayList arrayList = new ArrayList();
                            for (T t : list) {
                                if (C89219l.m154714a((Object) t.f103616c, (Object) true)) {
                                    arrayList.add(t);
                                }
                            }
                            LogisticDTO logisticDTO = (LogisticDTO) C89070n.m154583g((List) arrayList);
                            if (logisticDTO != null) {
                                Integer.valueOf(logisticDTO.f103614a);
                            }
                        }
                        C44348a.m87064a(deliveryPanelState2, z2);
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$f */
    static final class C44363f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44479b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44354b f103470a;

        static {
            Covode.recordClassIndex(52695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44363f(C44354b bVar) {
            super(2);
            this.f103470a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44479b bVar) {
            C44479b bVar2 = bVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(bVar2, "");
            int i = C44370c.f103478a[bVar2.f103690a.ordinal()];
            if (i == 1) {
                this.f103470a.mo75404a(new C44397b());
            } else if (i == 2) {
                Parcelable parcelable = this.f103470a.f103483d.f103666a;
                if (!(parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage)) {
                    parcelable = null;
                }
                DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable;
                if (enterParamForProductDetailPage != null) {
                    C44354b bVar3 = this.f103470a;
                    C45620e a = C45620e.C45625d.m88158a(null, new OrderSKUDTO(enterParamForProductDetailPage.f103417d, enterParamForProductDetailPage.f103418e, Integer.valueOf(enterParamForProductDetailPage.f103419f), null, 0, null, null, null, null, 488), 0, false, null, 29);
                    C45620e.m88151a(a, new C44358c(bVar3), new C44357b(bVar3), new C44355a(bVar3), null, 8);
                    bVar3.f103483d.mo75478a(new C44360d(bVar3, a));
                    bVar3.mo75404a(a);
                }
            } else if (i == 3) {
                this.f103470a.f103482c.getChildFragmentManager().mo3562c();
            } else if (i == 4) {
                AbstractC0952i childFragmentManager = this.f103470a.f103482c.getChildFragmentManager();
                C89219l.m154716b(childFragmentManager, "");
                for (int size = childFragmentManager.mo3565f().size(); size >= 2; size--) {
                    this.f103470a.f103482c.getChildFragmentManager().mo3562c();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
