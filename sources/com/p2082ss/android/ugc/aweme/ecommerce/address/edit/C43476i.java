package com.p2082ss.android.ugc.aweme.ecommerce.address.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2823b.C43461b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2823b.C43462c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2823b.C43465f;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.i */
public final class C43476i {

    /* renamed from: a */
    public Map<String, Object> f101398a;

    /* renamed from: b */
    long f101399b;

    /* renamed from: c */
    long f101400c;

    static {
        Covode.recordClassIndex(51705);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.i$a */
    static final class C43477a extends AbstractC89220m implements AbstractC89172b<String, CharSequence> {

        /* renamed from: a */
        public static final C43477a f101401a = new C43477a();

        static {
            Covode.recordClassIndex(51706);
        }

        C43477a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return str2;
        }
    }

    public C43476i(AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
        String str;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f101398a = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        if (addressEditEnterParams != null) {
            if (addressEditEnterParams.f101133b == null) {
                str = "add";
            } else {
                str = "edit";
            }
            linkedHashMap.put("shipping_address_enter_type", str);
            linkedHashMap.put("previous_page", addressEditEnterParams.f101134c);
            if (addressEditEnterParams.f101135d != null) {
                try {
                    obj = C45264j.m87844a().mo46670a(addressEditEnterParams.f101135d, HashMap.class);
                } catch (Exception unused) {
                    obj = null;
                }
                HashMap hashMap = (HashMap) obj;
                if (hashMap != null) {
                    linkedHashMap.putAll(hashMap);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo73993a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        new C43462c(str, str2).mo76746c(this.f101398a);
    }

    /* renamed from: a */
    public final void mo73994a(boolean z, List<String> list) {
        C89219l.m154721d(list, "");
        new C43465f(z, C89070n.m154551a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C43477a.f101401a, 30)).mo76746c(this.f101398a);
    }

    /* renamed from: a */
    public final void mo73992a(String str, Boolean bool, String str2) {
        C89219l.m154721d(str, "");
        new C43461b(str, bool, str2).mo76746c(this.f101398a);
    }
}
