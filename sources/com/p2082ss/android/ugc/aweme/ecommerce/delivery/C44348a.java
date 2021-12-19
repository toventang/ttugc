package com.p2082ss.android.ugc.aweme.ecommerce.delivery;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a */
public final class C44348a {

    /* renamed from: a */
    public static final LinkedHashMap<String, Object> f103431a = new LinkedHashMap<>();

    /* renamed from: b */
    public static long f103432b = -1;

    /* renamed from: c */
    public static final C44348a f103433c = new C44348a();

    private C44348a() {
    }

    static {
        Covode.recordClassIndex(52680);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a$a */
    static final class C44349a extends AbstractC89220m implements AbstractC89172b<Map<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f103434a;

        /* renamed from: b */
        final /* synthetic */ String f103435b;

        /* renamed from: c */
        final /* synthetic */ int f103436c;

        /* renamed from: d */
        final /* synthetic */ Float f103437d;

        /* renamed from: e */
        final /* synthetic */ String f103438e;

        /* renamed from: f */
        final /* synthetic */ String f103439f;

        static {
            Covode.recordClassIndex(52681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44349a(String str, String str2, int i, Float f, String str3, String str4) {
            super(1);
            this.f103434a = str;
            this.f103435b = str2;
            this.f103436c = i;
            this.f103437d = f;
            this.f103438e = str3;
            this.f103439f = str4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            String str = "";
            C89219l.m154721d(map2, str);
            String str2 = this.f103434a;
            if (str2 != null) {
                str = str2;
            }
            map2.put("option_name", str);
            map2.put("option_type", this.f103435b);
            map2.put("rank", Integer.valueOf(this.f103436c));
            Object obj = this.f103437d;
            if (obj != null) {
                map2.put("shipping_price", obj);
            }
            Object obj2 = this.f103438e;
            if (obj2 != null) {
                map2.put("shipping_currency", obj2);
            }
            Object obj3 = this.f103439f;
            if (obj3 != null) {
                map2.put("free_shipping_condition", obj3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a$c */
    static final class C44351c extends AbstractC89220m implements AbstractC89172b<Map<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f103442a;

        /* renamed from: b */
        final /* synthetic */ String f103443b;

        /* renamed from: c */
        final /* synthetic */ int f103444c;

        /* renamed from: d */
        final /* synthetic */ Float f103445d;

        /* renamed from: e */
        final /* synthetic */ String f103446e;

        /* renamed from: f */
        final /* synthetic */ String f103447f;

        static {
            Covode.recordClassIndex(52683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44351c(String str, String str2, int i, Float f, String str3, String str4) {
            super(1);
            this.f103442a = str;
            this.f103443b = str2;
            this.f103444c = i;
            this.f103445d = f;
            this.f103446e = str3;
            this.f103447f = str4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            String str = "";
            C89219l.m154721d(map2, str);
            String str2 = this.f103442a;
            if (str2 != null) {
                str = str2;
            }
            map2.put("option_name", str);
            map2.put("option_type", this.f103443b);
            map2.put("rank", Integer.valueOf(this.f103444c));
            Object obj = this.f103445d;
            if (obj != null) {
                map2.put("shipping_price", obj);
            }
            Object obj2 = this.f103446e;
            if (obj2 != null) {
                map2.put("shipping_currency", obj2);
            }
            Object obj3 = this.f103447f;
            if (obj3 != null) {
                map2.put("free_shipping_condition", obj3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a$b */
    static final class C44350b extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f103440a;

        /* renamed from: b */
        final /* synthetic */ DeliveryPanelState f103441b;

        static {
            Covode.recordClassIndex(52682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44350b(boolean z, DeliveryPanelState deliveryPanelState) {
            super(1);
            this.f103440a = z;
            this.f103441b = deliveryPanelState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            LogisticTextDTO logisticTextDTO;
            String str;
            Price price;
            String currency;
            Price price2;
            String priceVal;
            Float c;
            int i;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76751a(C44348a.f103431a);
            int i2 = 0;
            aVar2.mo76752b("is_fullscreen", 0);
            aVar2.mo76752b("is_delivery_info_complete", Integer.valueOf(this.f103440a ? 1 : 0));
            if (this.f103440a) {
                if (this.f103441b.getSelectedLogistic() != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                aVar2.mo76752b("is_address_deliverable", Integer.valueOf(i));
            }
            LogisticDTO selectedLogistic = this.f103441b.getSelectedLogistic();
            if (!(selectedLogistic == null || (price2 = selectedLogistic.f103619f) == null || (priceVal = price2.getPriceVal()) == null || (c = C89361p.m154861c(priceVal)) == null)) {
                aVar2.mo76752b("shipping_price", Float.valueOf(c.floatValue()));
            }
            LogisticDTO selectedLogistic2 = this.f103441b.getSelectedLogistic();
            if (!(selectedLogistic2 == null || (price = selectedLogistic2.f103619f) == null || (currency = price.getCurrency()) == null)) {
                aVar2.mo76752b("shipping_currency", currency);
            }
            LogisticDTO selectedLogistic3 = this.f103441b.getSelectedLogistic();
            if (!(selectedLogistic3 == null || (logisticTextDTO = selectedLogistic3.f103623j) == null || (str = logisticTextDTO.f103630f) == null)) {
                aVar2.mo76752b("free_shipping_condition", str);
            }
            LogisticDTO selectedLogistic4 = this.f103441b.getSelectedLogistic();
            if (selectedLogistic4 != null) {
                i2 = selectedLogistic4.f103614a;
            }
            aVar2.mo76752b("delivery_option", Integer.valueOf(i2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a$d */
    public static final class C44352d extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ long f103448a;

        /* renamed from: b */
        final /* synthetic */ boolean f103449b;

        /* renamed from: c */
        final /* synthetic */ String f103450c;

        /* renamed from: d */
        final /* synthetic */ boolean f103451d;

        /* renamed from: e */
        final /* synthetic */ boolean f103452e;

        /* renamed from: f */
        final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult f103453f;

        /* renamed from: g */
        final /* synthetic */ Integer f103454g;

        /* renamed from: h */
        final /* synthetic */ Float f103455h;

        /* renamed from: i */
        final /* synthetic */ String f103456i;

        /* renamed from: j */
        final /* synthetic */ String f103457j;

        static {
            Covode.recordClassIndex(52684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44352d(long j, boolean z, String str, boolean z2, boolean z3, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, Integer num, Float f, String str2, String str3) {
            super(1);
            this.f103448a = j;
            this.f103449b = z;
            this.f103450c = str;
            this.f103451d = z2;
            this.f103452e = z3;
            this.f103453f = packedDeliverySelectResult;
            this.f103454g = num;
            this.f103455h = f;
            this.f103456i = str2;
            this.f103457j = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            Integer num;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76751a(C44348a.f103431a);
            aVar2.mo76750a("stay_time", Long.valueOf(this.f103448a));
            aVar2.mo76752b("is_fullscreen", 0);
            aVar2.mo76752b("is_delivery_info_complete", Integer.valueOf(this.f103449b ? 1 : 0));
            aVar2.mo76752b("quit_type", this.f103450c);
            if (this.f103449b) {
                aVar2.mo76752b("is_address_deliverable", Integer.valueOf(this.f103451d ? 1 : 0));
            }
            aVar2.mo76752b("is_load_data", Integer.valueOf(this.f103452e ? 1 : 0));
            LogisticDTO logisticDTO = this.f103453f.f103421a;
            if (logisticDTO != null) {
                num = Integer.valueOf(logisticDTO.f103614a);
            } else {
                num = this.f103454g;
            }
            if (num != null) {
                aVar2.mo76752b("delivery_option", num);
            }
            Float f = this.f103455h;
            if (f != null) {
                aVar2.mo76752b("shipping_price", f);
            }
            String str = this.f103456i;
            if (str != null) {
                aVar2.mo76752b("shipping_currency", str);
            }
            String str2 = this.f103457j;
            if (str2 != null) {
                aVar2.mo76752b("free_shipping_condition", str2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m87064a(DeliveryPanelState deliveryPanelState, boolean z) {
        C89219l.m154721d(deliveryPanelState, "");
        C45544c.m88081a("tiktokec_enter_page", new C44350b(z, deliveryPanelState));
    }

    /* renamed from: a */
    public static void m87067a(String str, String str2, Float f, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f103431a);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("button_type", str2);
        if (f != null) {
            linkedHashMap.put("shipping_price", f);
        }
        if (str3 != null) {
            linkedHashMap.put("shipping_currency", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("free_shipping_condition", str4);
        }
        C45544c.m88082a("tiktokec_button_click", linkedHashMap);
    }

    /* renamed from: a */
    public static void m87066a(String str, String str2, int i, Float f, String str3, String str4) {
        C89219l.m154721d(str2, "");
        C45544c.m88083a("tiktokec_select_option", f103431a, new C44351c(str, str2, i, f, str3, str4));
    }

    /* renamed from: b */
    public static void m87068b(String str, String str2, int i, Float f, String str3, String str4) {
        C89219l.m154721d(str2, "");
        C45544c.m88083a("tiktokec_option_show", f103431a, new C44349a(str, str2, i, f, str3, str4));
    }
}
