package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t */
public final class C44161t {

    /* renamed from: g */
    public static final String[] f102953g;

    /* renamed from: h */
    public static final String[] f102954h;

    /* renamed from: i */
    public static final C44162a f102955i = new C44162a((byte) 0);

    /* renamed from: a */
    final LinkedHashMap<String, Object> f102956a;

    /* renamed from: b */
    final List<String> f102957b = new ArrayList();

    /* renamed from: c */
    long f102958c;

    /* renamed from: d */
    final Map<String, Long> f102959d = new LinkedHashMap();

    /* renamed from: e */
    boolean f102960e;

    /* renamed from: f */
    public final Map<String, Long> f102961f = new LinkedHashMap();

    /* renamed from: j */
    private long f102962j;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t$a */
    public static final class C44162a {
        static {
            Covode.recordClassIndex(52473);
        }

        private C44162a() {
        }

        public /* synthetic */ C44162a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t$a$a */
        public static final class C44163a extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ String f102963a;

            /* renamed from: b */
            final /* synthetic */ String f102964b;

            /* renamed from: c */
            final /* synthetic */ String f102965c;

            static {
                Covode.recordClassIndex(52474);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44163a(String str, String str2, String str3) {
                super(1);
                this.f102963a = str;
                this.f102964b = str2;
                this.f102965c = str3;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
                C45544c.C45545a aVar2 = aVar;
                String str = "";
                C89219l.m154721d(aVar2, str);
                String str2 = this.f102963a;
                if (str2 == null) {
                    str2 = str;
                }
                aVar2.mo76752b("payment_reference", str2);
                String str3 = this.f102964b;
                if (str3 == null) {
                    str3 = str;
                }
                aVar2.mo76752b("page_name", str3);
                String str4 = this.f102965c;
                if (str4 != null) {
                    str = str4;
                }
                aVar2.mo76752b("error_code", str);
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static void m86955a(String str, String str2, String str3) {
            C45544c.m88081a("rd_tiktokec_pay_error", new C44163a(str, str2, str3));
        }
    }

    static {
        Covode.recordClassIndex(52472);
        int i = 0;
        String[] strArr = new String[4];
        int i2 = 0;
        loop0:
        while (true) {
            String str = ",card_number";
            while (true) {
                strArr[i2] = str;
                i2++;
                if (i2 >= 4) {
                    break loop0;
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        str = ",date";
                    } else if (i2 != 2) {
                        str = ",card_holder";
                    } else {
                        str = ",code";
                    }
                }
            }
        }
        f102953g = strArr;
        String[] strArr2 = new String[4];
        do {
            strArr2[i] = f102953g[i];
            i++;
        } while (i < 4);
        f102954h = strArr2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t$c */
    static final class C44165c extends AbstractC89220m implements AbstractC89172b<String, CharSequence> {

        /* renamed from: a */
        public static final C44165c f102967a = new C44165c();

        static {
            Covode.recordClassIndex(52476);
        }

        C44165c() {
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
    public final void mo75005a(String str) {
        this.f102961f.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t$b */
    static final class C44164b extends AbstractC89220m implements AbstractC89172b<Map<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f102966a;

        static {
            Covode.recordClassIndex(52475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44164b(String str) {
            super(1);
            this.f102966a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            C89219l.m154721d(map2, "");
            String str = this.f102966a;
            if (str != null) {
                map2.put("payment_option", str);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t$e */
    public static final class C44167e extends AbstractC89220m implements AbstractC89172b<Map<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f102972a;

        /* renamed from: b */
        final /* synthetic */ boolean f102973b;

        static {
            Covode.recordClassIndex(52478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44167e(String str, boolean z) {
            super(1);
            this.f102972a = str;
            this.f102973b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            C89219l.m154721d(map2, "");
            String str = this.f102972a;
            if (str != null) {
                map2.put("pay_type", str);
            }
            map2.put("is_pay_saved", Integer.valueOf(this.f102973b ? 1 : 0));
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final long mo75011b(String str) {
        Long l = this.f102961f.get(str);
        if (l == null) {
            return 0;
        }
        long longValue = l.longValue();
        this.f102961f.remove(str);
        return SystemClock.elapsedRealtime() - longValue;
    }

    /* renamed from: c */
    public final void mo75012c(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f102956a);
        linkedHashMap.put("input_box_name", str);
        C45544c.m88082a("tiktokec_input_click", linkedHashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t$d */
    public static final class C44166d extends AbstractC89220m implements AbstractC89172b<Map<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f102968a;

        /* renamed from: b */
        final /* synthetic */ boolean f102969b;

        /* renamed from: c */
        final /* synthetic */ String f102970c;

        /* renamed from: d */
        final /* synthetic */ String f102971d;

        static {
            Covode.recordClassIndex(52477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44166d(String str, boolean z, String str2, String str3) {
            super(1);
            this.f102968a = str;
            this.f102969b = z;
            this.f102970c = str2;
            this.f102971d = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            String str = "";
            C89219l.m154721d(map2, str);
            Object obj = this.f102968a;
            if (obj != null) {
                map2.put("option_name", obj);
            }
            map2.put("is_valid", Integer.valueOf(this.f102969b ? 1 : 0));
            Object obj2 = this.f102970c;
            if (obj2 != null) {
                map2.put("input_name", obj2);
            }
            String str2 = this.f102971d;
            if (str2 != null) {
                str = str2;
            }
            map2.put("input_method", str);
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m86945d(java.lang.String r2) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r0 = ""
            return r0
        L_0x0005:
            int r1 = r2.hashCode()
            r0 = 98896(0x18250, float:1.38583E-40)
            if (r1 == r0) goto L_0x002d
            r0 = 98915(0x18263, float:1.3861E-40)
            if (r1 == r0) goto L_0x0024
            r0 = 766686014(0x2db2b33e, float:2.0315857E-11)
            if (r1 == r0) goto L_0x0019
        L_0x0018:
            return r2
        L_0x0019:
            java.lang.String r0 = "expiration_date"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "date"
            return r0
        L_0x0024:
            java.lang.String r0 = "cvv"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            goto L_0x0035
        L_0x002d:
            java.lang.String r0 = "cvc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
        L_0x0035:
            java.lang.String r2 = "code"
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44161t.m86945d(java.lang.String):java.lang.String");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t$f */
    static final class C44168f extends AbstractC89220m implements AbstractC89172b<Map<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f102974a;

        /* renamed from: b */
        final /* synthetic */ boolean f102975b;

        /* renamed from: c */
        final /* synthetic */ int f102976c;

        /* renamed from: d */
        final /* synthetic */ String f102977d;

        /* renamed from: e */
        final /* synthetic */ String f102978e;

        /* renamed from: f */
        final /* synthetic */ boolean f102979f;

        /* renamed from: g */
        final /* synthetic */ boolean f102980g;

        /* renamed from: h */
        final /* synthetic */ String f102981h;

        static {
            Covode.recordClassIndex(52479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44168f(String str, boolean z, int i, String str2, String str3, boolean z2, boolean z3, String str4) {
            super(1);
            this.f102974a = str;
            this.f102975b = z;
            this.f102976c = i;
            this.f102977d = str2;
            this.f102978e = str3;
            this.f102979f = z2;
            this.f102980g = z3;
            this.f102981h = str4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, Object> map) {
            String str;
            Map<String, Object> map2 = map;
            C89219l.m154721d(map2, "");
            map2.put("option_name", this.f102974a);
            map2.put("is_option_discounted", Integer.valueOf(this.f102975b ? 1 : 0));
            map2.put("rank", Integer.valueOf(this.f102976c));
            map2.put("option_type", this.f102977d);
            if (C89219l.m154714a((Object) this.f102978e, (Object) this.f102974a)) {
                str = "1";
            } else {
                str = "0";
            }
            map2.put("is_default", str);
            map2.put("is_pay_saved", Integer.valueOf(this.f102979f ? 1 : 0));
            map2.put("is_balance_shown", Integer.valueOf(this.f102980g ? 1 : 0));
            String str2 = this.f102981h;
            if (!(str2 == null || str2.length() == 0)) {
                map2.put("option_unavailable_code", this.f102981h);
            }
            return C89391z.f203057a;
        }
    }

    public C44161t(C44067c cVar) {
        C89219l.m154721d(cVar, "");
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.f102956a = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "payment_method");
        linkedHashMap.put("is_fullscreen", Integer.valueOf(!cVar.f102718f ? 1 : 0));
        HashMap<String, Object> hashMap = cVar.f102720h;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public final void mo75009a(String str, boolean z) {
        C45544c.m88083a("tiktokec_pay_order", this.f102956a, new C44167e(str, z));
    }

    /* renamed from: a */
    public final void mo75004a(long j, String str) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = this.f102956a.get("EVENT_ORIGIN_FEATURE");
        if (obj != null) {
            str2 = obj;
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", str2);
        linkedHashMap.put("page_name", "payment_method");
        linkedHashMap.put("previous_page", "order_submit");
        linkedHashMap.put("quite_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(j));
        C45544c.m88082a("tiktokec_scan_result", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo75006a(String str, long j, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f102956a);
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
    public final void mo75007a(String str, C44086o oVar, boolean z) {
        C89219l.m154721d(str, "");
        this.f102962j = SystemClock.elapsedRealtime() - this.f102958c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f102956a);
        linkedHashMap.put("stay_time", Long.valueOf(this.f102962j));
        linkedHashMap.put("is_load_data", 1);
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("is_card_save", Integer.valueOf(z ? 1 : 0));
        if (oVar != null) {
            linkedHashMap.put("pay_type", oVar.mo74952c());
        }
        C45544c.m88082a("tiktokec_stay_page", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo75010a(String str, boolean z, String str2, String str3) {
        C45544c.m88083a("tiktokec_input_result", this.f102956a, new C44166d(str, z, str2, str3));
    }

    /* renamed from: a */
    public final void mo75008a(String str, String str2, String str3, String[] strArr, Boolean bool) {
        String substring;
        C89219l.m154721d(str, "");
        C89219l.m154721d(strArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f102956a);
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("pay_type", str2);
        }
        if (C89219l.m154714a((Object) str2, (Object) "CCDC")) {
            if (str3 != null) {
                linkedHashMap.put("is_card_save", str3);
            }
            String str4 = "";
            int i = 0;
            do {
                if (!(f102954h[i] == null && strArr[i] == null)) {
                    str4 = str4 + f102953g[i];
                }
                i++;
            } while (i <= 3);
            if (str4.length() == 0) {
                substring = "1";
            } else {
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                substring = str4.substring(1);
                C89219l.m154716b(substring, "");
            }
            linkedHashMap.put("payment_info_finish", substring);
        }
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C45544c.m88082a("tiktokec_button_click", linkedHashMap);
    }
}
