package com.p2082ss.android.ugc.aweme.ecommerce.address.edit;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.AddressItem;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.j */
public final class C43478j {

    /* renamed from: a */
    public Map<String, Object> f101402a = new LinkedHashMap();

    /* renamed from: b */
    public long f101403b;

    /* renamed from: c */
    boolean f101404c;

    /* renamed from: d */
    public long f101405d;

    /* renamed from: e */
    public int f101406e;

    /* renamed from: f */
    private long f101407f;

    /* renamed from: g */
    private final Map<String, Long> f101408g = new LinkedHashMap();

    /* renamed from: h */
    private final List<String> f101409h;

    static {
        Covode.recordClassIndex(51707);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.j$a */
    static final class C43479a extends AbstractC89220m implements AbstractC89172b<String, CharSequence> {

        /* renamed from: a */
        public static final C43479a f101410a = new C43479a();

        static {
            Covode.recordClassIndex(51708);
        }

        C43479a() {
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

    /* renamed from: a */
    public final void mo73995a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f101402a);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("input_box_name", str);
        C45544c.m88082a("tiktokec_input_click", linkedHashMap);
    }

    /* renamed from: c */
    public final void mo74000c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f101402a);
        linkedHashMap.put("button_name", "delete");
        if (str != null) {
            linkedHashMap.put("input_box_name", str);
        }
        C45544c.m88082a("tiktokec_button_click", linkedHashMap);
    }

    /* renamed from: d */
    public static void m86536d(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        linkedHashMap.put("popup_name", str);
        C45544c.m88082a("tiktokec_popup_show", linkedHashMap);
    }

    /* renamed from: b */
    public final void mo73999b(String str) {
        if (str != null && str.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.f101402a);
            linkedHashMap.put("page_name", "shipping_address");
            linkedHashMap.put("drop_down_list_name", str);
            linkedHashMap.put("item_num", Integer.valueOf(this.f101406e));
            linkedHashMap.put("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - this.f101405d));
            C45544c.m88082a("tiktokec_drop_down_list_staytime", linkedHashMap);
        }
    }

    public C43478j(AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
        String str;
        Object obj;
        Map<String, Object> map = this.f101402a;
        if (addressEditEnterParams != null) {
            if (addressEditEnterParams.f101133b == null) {
                str = "add";
            } else {
                str = "edit";
            }
            map.put("page_info", str);
            if (addressEditEnterParams.f101135d != null) {
                try {
                    obj = C45264j.m87844a().mo46670a(addressEditEnterParams.f101135d, HashMap.class);
                } catch (Exception unused) {
                    obj = null;
                }
                HashMap hashMap = (HashMap) obj;
                if (hashMap != null) {
                    map.putAll(hashMap);
                }
            }
            map.put("previous_page", addressEditEnterParams.f101134c);
        }
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("page_name", "shipping_address");
        this.f101409h = C89070n.m154522b(StringSet.name, "phone", "address", "zipcode", "email", "address_other_detail");
    }

    /* renamed from: a */
    private String m86534a(Address address) {
        int i;
        List<AddressItem> list;
        List<AddressItem> list2;
        StringBuilder sb = new StringBuilder();
        if (address == null || (list2 = address.f101188b) == null) {
            i = 0;
        } else {
            i = list2.size();
        }
        if (!(address == null || (list = address.f101188b) == null)) {
            for (T t : list) {
                String str = t.f101195b;
                if (!(str == null || str.length() == 0 || !C89070n.m154556a((Iterable) this.f101409h, (Object) t.f101194a))) {
                    sb.append(t.f101194a);
                    i--;
                    if (i > 0) {
                        sb.append(",");
                    }
                }
            }
        }
        if (C89361p.m154926d(sb, ",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: a */
    public static void m86535a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        linkedHashMap.put("popup_name", str);
        linkedHashMap.put("action_type", str2);
        C45544c.m88082a("tiktokec_popup_click", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo73998a(boolean z, List<String> list) {
        C89219l.m154721d(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f101402a);
        linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("fail_reason", C89070n.m154551a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C43479a.f101410a, 30));
        C45544c.m88082a("tiktokec_save_address_result", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo73996a(String str, long j, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f101402a);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("input_method", str2);
        C45544c.m88082a("tiktokec_input_staytime", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo73997a(boolean z, String str, Address address) {
        C89219l.m154721d(str, "");
        String a = m86534a(address);
        this.f101407f = SystemClock.elapsedRealtime() - this.f101403b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f101402a);
        linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(this.f101407f));
        if (C89219l.m154714a(this.f101402a.get("page_name"), (Object) "shipping_address")) {
            linkedHashMap.put("page_info", a);
        }
        C45544c.m88082a("tiktokec_stay_page", linkedHashMap);
    }
}
