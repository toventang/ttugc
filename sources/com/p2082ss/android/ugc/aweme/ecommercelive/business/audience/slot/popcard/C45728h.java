package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45687a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.AbstractC45709b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.C45706a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.FlashSaleViewModel;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.ProductSyncViewModel;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.PopupCardVO;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45782c;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45784e;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45790b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.EnumC45795g;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2870c.C45799c;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a.C45805b;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2874c.C45810a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.h */
public final class C45728h extends AbstractC45717b {

    /* renamed from: b */
    private boolean f106499b;

    static {
        Covode.recordClassIndex(54246);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: a */
    public final void mo77056a() {
        m88285f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.h$d */
    public static final class C45732d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45728h f106506a;

        static {
            Covode.recordClassIndex(54250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45732d(C45728h hVar) {
            super(0);
            this.f106506a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f106506a.mo77059a("user_close");
            return C89391z.f203057a;
        }
    }

    /* renamed from: f */
    private final void m88285f() {
        FlashSaleViewModel b = mo77074b();
        if (b != null) {
            b.mo76990a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.h$f */
    public static final class C45734f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45728h f106508a;

        static {
            Covode.recordClassIndex(54252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45734f(C45728h hVar) {
            super(0);
            this.f106508a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            List<AbstractC45709b> list;
            C1213t<List<AbstractC45709b>> tVar;
            C45728h hVar = this.f106508a;
            FlashSaleViewModel b = hVar.mo77074b();
            if (b == null || (tVar = b.f106421d) == null) {
                list = null;
            } else {
                list = tVar.getValue();
            }
            hVar.mo77073a(list);
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    private final void m88283d() {
        if (!this.f106499b) {
            m88284e();
            this.f106476a.f106511c.mo77063a(new C45732d(this));
            this.f106476a.f106511c.mo77064a(new C45733e(this));
            this.f106476a.f106511c.f106554g = new C45734f(this);
            this.f106499b = true;
        }
    }

    /* renamed from: c */
    public final ProductSyncViewModel mo77075c() {
        Context context;
        AbstractC6157ab.AbstractC6158a aVar = this.f106476a.f106513e;
        if (aVar != null) {
            context = aVar.mo12042a();
        } else {
            context = null;
        }
        if (!(context instanceof ActivityC0218d)) {
            context = null;
        }
        ActivityC0218d dVar = (ActivityC0218d) context;
        if (dVar != null) {
            return (ProductSyncViewModel) C1181ae.m3881a(dVar, (C1175ad.AbstractC1177b) null).mo3983a(ProductSyncViewModel.class);
        }
        return null;
    }

    /* renamed from: e */
    private final void m88284e() {
        Context context;
        C1213t<List<AbstractC45709b>> tVar;
        C1213t<List<AbstractC45709b>> tVar2;
        C1213t<List<C45687a>> tVar3;
        AbstractC6157ab.AbstractC6158a aVar = this.f106476a.f106513e;
        AbstractC1204m mVar = null;
        if (aVar != null) {
            context = aVar.mo12042a();
        } else {
            context = null;
        }
        if (context instanceof AbstractC1204m) {
            mVar = context;
        }
        AbstractC1204m mVar2 = mVar;
        if (mVar2 != null) {
            ProductSyncViewModel c = mo77075c();
            if (!(c == null || (tVar3 = c.f106434f) == null)) {
                tVar3.observe(mVar2, new C45729a(this, mVar2));
            }
            FlashSaleViewModel b = mo77074b();
            if (!(b == null || (tVar2 = b.f106420c) == null)) {
                tVar2.observe(mVar2, new C45730b(this, mVar2));
            }
            FlashSaleViewModel b2 = mo77074b();
            if (b2 != null && (tVar = b2.f106421d) != null) {
                tVar.observe(mVar2, new C45731c(this, mVar2));
            }
        }
    }

    /* renamed from: b */
    public final FlashSaleViewModel mo77074b() {
        Context context;
        AbstractC6157ab.AbstractC6158a aVar = this.f106476a.f106513e;
        if (aVar != null) {
            context = aVar.mo12042a();
        } else {
            context = null;
        }
        if (!(context instanceof ActivityC0218d)) {
            context = null;
        }
        ActivityC0218d dVar = (ActivityC0218d) context;
        if (dVar != null) {
            return (FlashSaleViewModel) C1181ae.m3881a(dVar, (C1175ad.AbstractC1177b) null).mo3983a(FlashSaleViewModel.class);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.h$c */
    public static final class C45731c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C45728h f106504a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f106505b;

        static {
            Covode.recordClassIndex(54249);
        }

        C45731c(C45728h hVar, AbstractC1204m mVar) {
            this.f106504a = hVar;
            this.f106505b = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106504a.mo77073a((List) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45728h(C45736i iVar) {
        super(iVar);
        C89219l.m154721d(iVar, "");
    }

    /* renamed from: a */
    public static String m88279a(C45706a aVar) {
        if (aVar.mo76996a()) {
            return "warm_up";
        }
        if (aVar.mo76997b()) {
            return "on_sale";
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.h$a */
    public static final class C45729a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C45728h f106500a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f106501b;

        static {
            Covode.recordClassIndex(54247);
        }

        C45729a(C45728h hVar, AbstractC1204m mVar) {
            this.f106500a = hVar;
            this.f106501b = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            C89219l.m154716b(list, "");
            if (!list.isEmpty()) {
                this.f106500a.f106476a.f106511c.mo77084a(PopupCardVO.C45715a.m88223a((C45687a) list.get(0)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.h$g */
    public static final class C45735g extends AbstractC89220m implements AbstractC89172b<AbstractC45709b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Long f106509a;

        static {
            Covode.recordClassIndex(54253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45735g(Long l) {
            super(1);
            this.f106509a = l;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC45709b bVar) {
            boolean z;
            AbstractC45709b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (bVar2 instanceof C45745k) {
                long productId = ((C45745k) bVar2).f106547a.getProductId();
                Long l = this.f106509a;
                if (l != null && productId == l.longValue()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b */
    public static String m88281b(C45706a aVar) {
        C89219l.m154721d(aVar, "");
        if (!aVar.mo76996a() && aVar.mo76997b()) {
            if (aVar.mo76998c() > 86400000) {
                return "gt_24";
            }
            if (aVar.mo76998c() > 0) {
                return "in_24";
            }
        }
        return "no_countdown";
    }

    /* renamed from: a */
    public final C45706a mo77072a(Long l) {
        AbstractC45709b a;
        FlashSaleViewModel b = mo77074b();
        if (b == null || (a = b.mo76989a(new C45735g(l))) == null) {
            return null;
        }
        return a.mo77000b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.h$b */
    public static final class C45730b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C45728h f106502a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f106503b;

        static {
            Covode.recordClassIndex(54248);
        }

        C45730b(C45728h hVar, AbstractC1204m mVar) {
            this.f106502a = hVar;
            this.f106503b = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Room room;
            ArrayList arrayList = new ArrayList();
            for (AbstractC45709b bVar : (List) obj) {
                if (bVar instanceof C45745k) {
                    arrayList.add(String.valueOf(((C45745k) bVar).f106547a.getProductId()));
                }
            }
            ProductSyncViewModel c = this.f106502a.mo77075c();
            if (!(c == null || (room = this.f106502a.f106476a.f106515g) == null)) {
                c.mo76994a(String.valueOf(room.getId()), arrayList);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: a */
    public final void mo77058a(C45805b bVar) {
        C89219l.m154721d(bVar, "");
        m88283d();
        PopupCardVO popupCardVO = this.f106476a.f106511c.f106552e;
        if (popupCardVO != null) {
            m88280a(popupCardVO, bVar.f106717b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: a */
    public final void mo77057a(C45782c cVar) {
        PopupCardVO popupCardVO;
        String str;
        m88283d();
        if (cVar != null && (popupCardVO = this.f106476a.f106511c.f106552e) != null) {
            m88280a(popupCardVO, cVar.f106663c);
            C45736i iVar = this.f106476a;
            if (iVar.f106519k > 0 && iVar.f106520l > 0 && iVar.f106521m > 0 && iVar.f106522n > 0 && iVar.f106521m > iVar.f106520l) {
                long currentTimeMillis = System.currentTimeMillis() - iVar.f106519k;
                long j = iVar.f106520l - iVar.f106519k;
                long j2 = iVar.f106521m - iVar.f106520l;
                long j3 = iVar.f106522n - iVar.f106521m;
                long currentTimeMillis2 = System.currentTimeMillis() - iVar.f106522n;
                Room room = iVar.f106515g;
                if (room != null) {
                    str = room.getIdStr();
                } else {
                    str = null;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("room_id", str);
                    jSONObject.put("total_duration", currentTimeMillis);
                    jSONObject.put("before_enter_room_interface_duration", j);
                    jSONObject.put("enter_room_interface_duration", j2);
                    jSONObject.put("live_process_data_duration", j3);
                    jSONObject.put("ec_process_data_duration", currentTimeMillis2);
                    C39162r.m79461a("rd_tiktokec_live_pop_product_show", jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: b */
    public final void mo77060b(String str) {
        Long l;
        String str2;
        C89219l.m154721d(str, "");
        PopupCardVO popupCardVO = this.f106476a.f106511c.f106552e;
        String str3 = null;
        if (popupCardVO != null) {
            l = Long.valueOf(popupCardVO.getProductId());
        } else {
            l = null;
        }
        C45706a a = mo77072a(l);
        Map<String, String> map = this.f106476a.f106517i;
        C45806a aVar = this.f106476a.f106514f;
        if (a != null) {
            str2 = m88279a(a);
            str3 = m88281b(a);
        } else {
            str2 = null;
        }
        C89219l.m154721d(aVar, "");
        C33744d a2 = C45790b.m88388a(aVar).mo59983a("stay_time", aVar.mo77118b("stay_time")).mo59983a("quit_type", aVar.mo77118b("quit_type"));
        if (str2 != null) {
            a2.mo59983a("flashsale_status", str2);
        }
        if (str3 != null) {
            a2.mo59983a("countdown_type", str3);
        }
        if (map != null) {
            a2.mo59986a(map);
        }
        C89219l.m154716b(a2, "");
        C45790b.m88389a(a2);
        C39162r.m79460a("livesdk_tiktokec_product_entrance_stay_time", a2.f79943a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.h$e */
    public static final class C45733e extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45728h f106507a;

        static {
            Covode.recordClassIndex(54251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45733e(C45728h hVar) {
            super(1);
            this.f106507a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            Long l;
            Long l2;
            String str2;
            String str3;
            Long l3;
            String str4;
            String str5;
            String str6;
            String str7 = str;
            C89219l.m154721d(str7, "");
            this.f106507a.f106476a.f106514f.mo77117a("click_area", str7, false);
            C45728h hVar = this.f106507a;
            PopupCardVO popupCardVO = hVar.f106476a.f106511c.f106552e;
            if (popupCardVO != null) {
                l = Long.valueOf(popupCardVO.getProductId());
            } else {
                l = null;
            }
            C45706a a = hVar.mo77072a(l);
            C45806a aVar = this.f106507a.f106476a.f106514f;
            Room room = this.f106507a.f106476a.f106515g;
            if (room != null) {
                l2 = Long.valueOf(room.getId());
            } else {
                l2 = null;
            }
            String valueOf = String.valueOf(l2);
            Boolean bool = this.f106507a.f106476a.f106516h;
            Map<String, String> map = this.f106507a.f106476a.f106517i;
            HashMap hashMap = new HashMap();
            Map<String, String> map2 = this.f106507a.f106476a.f106518j;
            if (map2 != null) {
                hashMap.putAll(map2);
                hashMap.put("refer", "image");
                hashMap.put("label", "user_otherclick");
            }
            if (a != null) {
                str2 = C45728h.m88279a(a);
                str3 = C45728h.m88281b(a);
            } else {
                str2 = null;
                str3 = null;
            }
            C45790b.m88393b(aVar, valueOf, bool, map, hashMap, "product_detail", str2, str3);
            C45806a aVar2 = this.f106507a.f106476a.f106514f;
            Room room2 = this.f106507a.f106476a.f106515g;
            if (room2 != null) {
                l3 = Long.valueOf(room2.getId());
            } else {
                l3 = null;
            }
            String valueOf2 = String.valueOf(l3);
            Boolean bool2 = this.f106507a.f106476a.f106516h;
            Map<String, String> map3 = this.f106507a.f106476a.f106517i;
            HashMap hashMap2 = new HashMap();
            Map<String, String> map4 = this.f106507a.f106476a.f106518j;
            if (map4 != null) {
                hashMap2.putAll(map4);
                hashMap2.put("refer", "product_detail");
                hashMap2.put("label", "user_otherclick");
            }
            if (a != null) {
                str4 = C45728h.m88279a(a);
                str5 = C45728h.m88281b(a);
            } else {
                str4 = null;
                str5 = null;
            }
            PopupCardVO popupCardVO2 = this.f106507a.f106476a.f106511c.f106552e;
            if (popupCardVO2 == null) {
                str6 = null;
            } else if (popupCardVO2.isSoldOut()) {
                str6 = "1";
            } else {
                str6 = "0";
            }
            C89219l.m154721d(aVar2, "");
            C33744d a2 = C45790b.m88388a(aVar2).mo59983a("item_order", aVar2.mo77118b("item_order")).mo59983a("click_area", aVar2.mo77118b("click_area"));
            String b = aVar2.mo77118b("list_skin_type");
            if (b == null) {
                b = "";
            }
            C33744d a3 = a2.mo59983a("list_skin_type", b);
            String b2 = aVar2.mo77118b("product_skin_type");
            if (b2 == null) {
                b2 = "";
            }
            C33744d a4 = a3.mo59983a("product_skin_type", b2);
            if (str4 != null) {
                a4.mo59983a("flashsale_status", str4);
            }
            if (str5 != null) {
                a4.mo59983a("countdown_type", str5);
            }
            if (str6 != null) {
                a4.mo59983a("is_sold_out", str6);
            }
            C89219l.m154716b(a4, "");
            C45790b.m88389a(a4);
            a4.mo59986a(map3);
            a4.mo59986a((Map<? extends String, ? extends String>) hashMap2);
            C39162r.m79460a("livesdk_tiktokec_product_click", a4.f79943a);
            if (C89219l.m154714a((Object) bool2, (Object) true)) {
                HashMap hashMap3 = new HashMap();
                if (map3 != null) {
                    hashMap3.putAll(map3);
                }
                hashMap3.put("refer", "image");
                HashMap hashMap4 = new HashMap();
                if (valueOf2 != null) {
                    hashMap4.put("room_id", valueOf2);
                }
                C11199a.m19849a("live_ad", "otherclick", hashMap3, hashMap4);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45717b
    /* renamed from: a */
    public final void mo77059a(String str) {
        Object obj;
        String str2;
        String str3;
        C1213t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        C89219l.m154721d(str, "");
        m88285f();
        IFrameSlot.SlotViewModel slotViewModel = this.f106476a.f106512d;
        if (slotViewModel == null || (tVar = slotViewModel.f15346a) == null || (value = tVar.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (C89219l.m154714a(obj, (Object) true)) {
            IFrameSlot.SlotViewModel slotViewModel2 = this.f106476a.f106512d;
            if (slotViewModel2 != null) {
                C45799c.m88408a(slotViewModel2, false);
            }
            this.f106476a.mo77077c(str);
        }
        this.f106476a.f106525q.removeMessages(0);
        this.f106476a.f106511c.f106553f = null;
        if (C89219l.m154714a((Object) str, (Object) "unpin")) {
            Room room = this.f106476a.f106515g;
            if (room == null || (str2 = String.valueOf(room.getId())) == null) {
                str2 = "0";
            }
            String h = C45736i.m88296h();
            EnumC45795g gVar = EnumC45795g.Audience;
            PopupCardVO popupCardVO = this.f106476a.f106511c.f106552e;
            if (popupCardVO == null || (str3 = String.valueOf(popupCardVO.getProductId())) == null) {
                str3 = "";
            }
            C89219l.m154721d(str2, "");
            C89219l.m154721d(h, "");
            C89219l.m154721d(gVar, "");
            C89219l.m154721d(str3, "");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("author_id", h);
                jSONObject.put("room_id", str2);
                jSONObject.put("product_id", str3);
                jSONObject.put("live_role", gVar.getRoleStr());
                C39162r.m79461a("rd_tiktokec_cancel_pin_product", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo77073a(List<? extends AbstractC45709b> list) {
        String valueOf;
        String sb;
        C45706a b;
        View view = this.f106476a.f106511c.f106553f;
        if (view instanceof AbstractC45747m) {
            boolean z = true;
            if (list == null || list.isEmpty()) {
                ((AbstractC45747m) view).setFlashSaleViewVisible(false);
                return;
            }
            AbstractC45709b bVar = (AbstractC45709b) list.get(0);
            if (!bVar.mo76999a() || (b = bVar.mo77000b()) == null || !b.mo76997b()) {
                z = false;
            }
            AbstractC45747m mVar = (AbstractC45747m) view;
            mVar.setFlashSaleViewVisible(z);
            if (z) {
                C45706a b2 = bVar.mo77000b();
                String str = "";
                if (b2 != null && b2.mo76997b()) {
                    if (b2.mo76998c() > 86400000) {
                        sb = C3966y.m9657a((int) R.string.cw0);
                    } else {
                        long c = b2.mo76998c() / 1000;
                        long j = c / 60;
                        long j2 = j / 60;
                        long j3 = c % 60;
                        long j4 = j % 60;
                        long j5 = j2 % 24;
                        StringBuilder sb2 = new StringBuilder();
                        if (j5 < 10) {
                            valueOf = "0".concat(String.valueOf(j5));
                        } else {
                            valueOf = String.valueOf(j5);
                        }
                        StringBuilder append = sb2.append(valueOf).append(':');
                        int i = (j4 > 10 ? 1 : (j4 == 10 ? 0 : -1));
                        String valueOf2 = String.valueOf(j4);
                        if (i < 0) {
                            valueOf2 = "0".concat(valueOf2);
                        }
                        StringBuilder append2 = append.append(valueOf2).append(':');
                        int i2 = (j3 > 10 ? 1 : (j3 == 10 ? 0 : -1));
                        String valueOf3 = String.valueOf(j3);
                        if (i2 < 0) {
                            valueOf3 = "0".concat(valueOf3);
                        }
                        sb = append2.append(valueOf3).toString();
                        C89219l.m154716b(sb, str);
                    }
                    if (sb != null) {
                        str = sb;
                    }
                }
                mVar.setFlashSaleInfo(str);
            }
        }
    }

    /* renamed from: b */
    private final void m88282b(PopupCardVO popupCardVO, long j) {
        FlashSaleViewModel b = mo77074b();
        if (b != null) {
            b.mo76991a(C89070n.m154516a(new C45745k(popupCardVO, j)));
        }
    }

    /* renamed from: a */
    private final void m88280a(PopupCardVO popupCardVO, long j) {
        Long l;
        int i;
        String str;
        String str2;
        Long l2;
        Long l3;
        String str3;
        String str4;
        Long l4;
        String str5;
        String str6;
        String promotionLogoLog;
        C45784e promotionSkin;
        m88282b(popupCardVO, j);
        IFrameSlot.SlotViewModel slotViewModel = this.f106476a.f106512d;
        if (slotViewModel != null) {
            C45799c.m88408a(slotViewModel, true);
        }
        this.f106476a.f106525q.sendEmptyMessageDelayed(0, C45810a.m88428b());
        C45806a aVar = this.f106476a.f106514f;
        PopupCardVO popupCardVO2 = this.f106476a.f106511c.f106552e;
        String str7 = null;
        if (popupCardVO2 != null) {
            l = Long.valueOf(popupCardVO2.getProductId());
        } else {
            l = null;
        }
        aVar.mo77117a("product_id", String.valueOf(l), false);
        C45806a aVar2 = this.f106476a.f106514f;
        PopupCardVO popupCardVO3 = this.f106476a.f106511c.f106552e;
        int i2 = -1;
        if (popupCardVO3 != null) {
            i = popupCardVO3.getPlatform();
        } else {
            i = -1;
        }
        aVar2.mo77115a("product_source", i);
        C45806a aVar3 = this.f106476a.f106514f;
        PopupCardVO popupCardVO4 = this.f106476a.f106511c.f106552e;
        if (popupCardVO4 != null) {
            i2 = popupCardVO4.getSourceFrom();
        }
        aVar3.mo77115a("source_from", i2);
        C45806a aVar4 = this.f106476a.f106514f;
        PopupCardVO popupCardVO5 = this.f106476a.f106511c.f106552e;
        String str8 = "";
        if (popupCardVO5 == null || (promotionSkin = popupCardVO5.getPromotionSkin()) == null || (str = promotionSkin.f106680b) == null) {
            str = str8;
        }
        aVar4.mo77117a("list_skin_type", str, false);
        C45806a aVar5 = this.f106476a.f106514f;
        PopupCardVO popupCardVO6 = this.f106476a.f106511c.f106552e;
        if (!(popupCardVO6 == null || (promotionLogoLog = popupCardVO6.getPromotionLogoLog()) == null)) {
            str8 = promotionLogoLog;
        }
        aVar5.mo77117a("product_skin_type", str8, false);
        C45806a aVar6 = this.f106476a.f106514f;
        PopupCardVO popupCardVO7 = this.f106476a.f106511c.f106552e;
        if (popupCardVO7 != null) {
            str2 = popupCardVO7.getSource();
        } else {
            str2 = null;
        }
        aVar6.mo77117a("source", str2, true);
        this.f106476a.f106514f.mo77116a("start_time", System.currentTimeMillis());
        PopupCardVO popupCardVO8 = this.f106476a.f106511c.f106552e;
        if (popupCardVO8 != null) {
            l2 = Long.valueOf(popupCardVO8.getProductId());
        } else {
            l2 = null;
        }
        C45706a a = mo77072a(l2);
        C45806a aVar7 = this.f106476a.f106514f;
        Room room = this.f106476a.f106515g;
        if (room != null) {
            l3 = Long.valueOf(room.getId());
        } else {
            l3 = null;
        }
        String valueOf = String.valueOf(l3);
        Boolean bool = this.f106476a.f106516h;
        Map<String, String> map = this.f106476a.f106517i;
        HashMap hashMap = new HashMap();
        Map<String, String> map2 = this.f106476a.f106518j;
        if (map2 != null) {
            hashMap.putAll(map2);
            hashMap.put("refer", "image");
            hashMap.put("label", "user_othershow");
        }
        if (a != null) {
            str3 = m88279a(a);
            str4 = m88281b(a);
        } else {
            str3 = null;
            str4 = null;
        }
        C45790b.m88391a(aVar7, valueOf, bool, map, hashMap, "product_detail", str3, str4);
        C45806a aVar8 = this.f106476a.f106514f;
        Room room2 = this.f106476a.f106515g;
        if (room2 != null) {
            l4 = Long.valueOf(room2.getId());
        } else {
            l4 = null;
        }
        String valueOf2 = String.valueOf(l4);
        Boolean bool2 = this.f106476a.f106516h;
        Map<String, String> map3 = this.f106476a.f106517i;
        HashMap hashMap2 = new HashMap();
        Map<String, String> map4 = this.f106476a.f106518j;
        if (map4 != null) {
            hashMap2.putAll(map4);
            hashMap2.put("refer", "product_detail");
            hashMap2.put("label", "user_othershow");
        }
        if (a != null) {
            str5 = m88279a(a);
            str6 = m88281b(a);
        } else {
            str5 = null;
            str6 = null;
        }
        PopupCardVO popupCardVO9 = this.f106476a.f106511c.f106552e;
        if (popupCardVO9 != null) {
            if (popupCardVO9.isSoldOut()) {
                str7 = "1";
            } else {
                str7 = "0";
            }
        }
        C45790b.m88392a(aVar8, valueOf2, bool2, map3, hashMap2, "image", str5, str6, str7);
    }
}
