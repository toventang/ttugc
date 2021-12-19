package com.p2082ss.android.ugc.aweme.ecommerce.sku.p2859a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45553a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.a.a */
public final class C45383a {

    /* renamed from: a */
    public static final LinkedHashMap<String, Object> f105750a = new LinkedHashMap<>();

    /* renamed from: b */
    public static final C45383a f105751b = new C45383a();

    /* renamed from: a */
    public static String m87957a(int i) {
        return i <= 6 ? "no_greater_than_6" : "greater_than_6";
    }

    private C45383a() {
    }

    static {
        Covode.recordClassIndex(53857);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.a.a$a */
    public static final class C45384a extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Map f105752a;

        /* renamed from: b */
        final /* synthetic */ ProductPackStruct f105753b;

        /* renamed from: c */
        final /* synthetic */ SkuPrice f105754c;

        /* renamed from: d */
        final /* synthetic */ int f105755d;

        /* renamed from: e */
        final /* synthetic */ String f105756e;

        static {
            Covode.recordClassIndex(53858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45384a(Map map, ProductPackStruct productPackStruct, SkuPrice skuPrice, int i, String str) {
            super(1);
            this.f105752a = map;
            this.f105753b = productPackStruct;
            this.f105754c = skuPrice;
            this.f105755d = i;
            this.f105756e = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45553a.m88104a(aVar2, this.f105752a, this.f105753b, this.f105754c, this.f105755d, this.f105756e);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.a.a$d */
    public static final class C45387d extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f105777a;

        /* renamed from: b */
        final /* synthetic */ String f105778b;

        /* renamed from: c */
        final /* synthetic */ String f105779c;

        static {
            Covode.recordClassIndex(53861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45387d(int i, String str, String str2) {
            super(1);
            this.f105777a = i;
            this.f105778b = str;
            this.f105779c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, C45383a.f105750a);
            aVar2.mo76750a("page_name", "sku");
            aVar2.mo76750a("sku_show_type", C45383a.m87957a(this.f105777a));
            if (!C45383a.f105750a.containsKey("previous_page") && (str = this.f105778b) != null) {
                aVar2.mo76750a("previous_page", str);
            }
            String str2 = this.f105779c;
            if (str2 != null) {
                aVar2.mo76750a("source_button", str2);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.a.a$b */
    public static final class C45385b extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Map f105757a;

        /* renamed from: b */
        final /* synthetic */ String f105758b;

        /* renamed from: c */
        final /* synthetic */ String f105759c;

        /* renamed from: d */
        final /* synthetic */ Integer f105760d;

        /* renamed from: e */
        final /* synthetic */ String f105761e;

        /* renamed from: f */
        final /* synthetic */ String f105762f;

        /* renamed from: g */
        final /* synthetic */ String f105763g;

        static {
            Covode.recordClassIndex(53859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45385b(Map map, String str, String str2, Integer num, String str3, String str4, String str5) {
            super(1);
            this.f105757a = map;
            this.f105758b = str;
            this.f105759c = str2;
            this.f105760d = num;
            this.f105761e = str3;
            this.f105762f = str4;
            this.f105763g = str5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76751a(this.f105757a);
            String str2 = this.f105758b;
            if (str2 != null) {
                aVar2.mo76750a("source_button", str2);
            }
            String str3 = this.f105759c;
            if (str3 != null) {
                aVar2.mo76750a("sku_id", str3);
            }
            Integer num = this.f105760d;
            if (num != null) {
                num.intValue();
                aVar2.mo76750a("is_single_sku", this.f105760d);
            }
            String str4 = this.f105761e;
            if (str4 != null) {
                aVar2.mo76750a("cart_form", str4);
            }
            String str5 = this.f105762f;
            if (str5 != null) {
                aVar2.mo76750a("page_name", str5);
            }
            if (!this.f105757a.containsKey("previous_page") && (str = this.f105763g) != null) {
                aVar2.mo76750a("previous_page", str);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.a.a$e */
    public static final class C45388e extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f105780a;

        /* renamed from: b */
        final /* synthetic */ long f105781b;

        /* renamed from: c */
        final /* synthetic */ String f105782c;

        /* renamed from: d */
        final /* synthetic */ boolean f105783d;

        /* renamed from: e */
        final /* synthetic */ String f105784e;

        /* renamed from: f */
        final /* synthetic */ String f105785f;

        static {
            Covode.recordClassIndex(53862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45388e(int i, long j, String str, boolean z, String str2, String str3) {
            super(1);
            this.f105780a = i;
            this.f105781b = j;
            this.f105782c = str;
            this.f105783d = z;
            this.f105784e = str2;
            this.f105785f = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, C45383a.f105750a);
            aVar2.mo76750a("page_name", "sku");
            aVar2.mo76750a("sku_show_type", C45383a.m87957a(this.f105780a));
            aVar2.mo76750a("stay_time", Long.valueOf(this.f105781b));
            aVar2.mo76750a("quit_type", this.f105782c);
            aVar2.mo76750a("is_load_data", Integer.valueOf(this.f105783d ? 1 : 0));
            if (!C45383a.f105750a.containsKey("previous_page") && (str = this.f105784e) != null) {
                aVar2.mo76750a("previous_page", str);
            }
            String str2 = this.f105785f;
            if (str2 != null) {
                aVar2.mo76750a("source_button", str2);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r1.length() == 0) goto L_0x0053;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m87958a(com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.sku.p2859a.C45383a.m87958a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.a.a$c */
    public static final class C45386c extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Map f105764a;

        /* renamed from: b */
        final /* synthetic */ String f105765b;

        /* renamed from: c */
        final /* synthetic */ String f105766c;

        /* renamed from: d */
        final /* synthetic */ String f105767d;

        /* renamed from: e */
        final /* synthetic */ Integer f105768e;

        /* renamed from: f */
        final /* synthetic */ String f105769f;

        /* renamed from: g */
        final /* synthetic */ Integer f105770g;

        /* renamed from: h */
        final /* synthetic */ String f105771h;

        /* renamed from: i */
        final /* synthetic */ Integer f105772i;

        /* renamed from: j */
        final /* synthetic */ Integer f105773j;

        /* renamed from: k */
        final /* synthetic */ Integer f105774k;

        /* renamed from: l */
        final /* synthetic */ String f105775l;

        /* renamed from: m */
        final /* synthetic */ String f105776m;

        static {
            Covode.recordClassIndex(53860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45386c(Map map, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, Integer num4, Integer num5, String str6, String str7) {
            super(1);
            this.f105764a = map;
            this.f105765b = str;
            this.f105766c = str2;
            this.f105767d = str3;
            this.f105768e = num;
            this.f105769f = str4;
            this.f105770g = num2;
            this.f105771h = str5;
            this.f105772i = num3;
            this.f105773j = num4;
            this.f105774k = num5;
            this.f105775l = str6;
            this.f105776m = str7;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Map<String, ? extends Object> map = this.f105764a;
            if (map == null) {
                map = C45383a.f105750a;
            }
            aVar2.mo76751a(map);
            String str2 = this.f105765b;
            if (str2 != null) {
                aVar2.mo76750a("cart_item_id", str2);
            }
            String str3 = this.f105766c;
            if (str3 != null) {
                aVar2.mo76750a("source_button", str3);
            }
            String str4 = this.f105767d;
            if (str4 != null) {
                aVar2.mo76750a("sku_id", str4);
            }
            Integer num = this.f105768e;
            if (num != null) {
                num.intValue();
                aVar2.mo76750a("is_single_sku", this.f105768e);
            }
            String str5 = this.f105769f;
            if (str5 != null) {
                aVar2.mo76750a("cart_form", str5);
            }
            Integer num2 = this.f105770g;
            if (num2 != null) {
                num2.intValue();
                aVar2.mo76750a("is_success", this.f105770g);
            }
            String str6 = this.f105771h;
            if (str6 != null) {
                aVar2.mo76750a("fail_reason", str6);
            }
            Integer num3 = this.f105772i;
            if (num3 != null) {
                num3.intValue();
                aVar2.mo76750a("add_sku_num", this.f105772i);
            }
            Integer num4 = this.f105773j;
            if (num4 != null) {
                num4.intValue();
                aVar2.mo76750a("sku_num_before", this.f105773j);
            }
            Integer num5 = this.f105774k;
            if (num5 != null) {
                num5.intValue();
                aVar2.mo76750a("sku_num_after", this.f105774k);
            }
            String str7 = this.f105775l;
            if (str7 != null) {
                aVar2.mo76750a("page_name", str7);
            }
            if (!map.containsKey("previous_page") && (str = this.f105776m) != null) {
                aVar2.mo76750a("previous_page", str);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m87959a(ProductPackStruct productPackStruct, SkuPrice skuPrice, int i, Map<String, ? extends Object> map, String str) {
        Map<String, ? extends Object> map2 = map;
        if (map2 == null) {
            map2 = f105750a;
        }
        C45544c.m88081a("AddToCart", new C45384a(map2, productPackStruct, skuPrice, i, str));
    }

    /* renamed from: a */
    public static void m87961a(String str, String str2, Integer num, String str3, String str4, String str5, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        if (map2 == null) {
            map2 = f105750a;
        }
        C45544c.m88081a("tiktokec_confirm_cart", new C45385b(map2, str, str2, num, str3, str4, str5));
    }

    /* renamed from: a */
    public static void m87962a(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, Integer num4, Integer num5, String str6, String str7, Map<String, ? extends Object> map) {
        C45544c.m88081a("tiktokec_confirm_cart_result", new C45386c(map, str, str2, str3, num, str4, num2, str5, num3, num4, num5, str6, str7));
    }
}
