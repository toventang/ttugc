package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.C43587b;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.b */
public final class C45237b implements IInterceptor {
    static {
        Covode.recordClassIndex(53689);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.b$a */
    static final class C45238a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f105463a;

        /* renamed from: b */
        final /* synthetic */ Boolean f105464b;

        /* renamed from: c */
        final /* synthetic */ Object f105465c;

        static {
            Covode.recordClassIndex(53690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45238a(List list, Boolean bool, Object obj) {
            super(0);
            this.f105463a = list;
            this.f105464b = bool;
            this.f105465c = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("districts", "");
            jSONObject.put("status", 0);
            jSONObject.put("enter_method", String.valueOf(this.f105465c));
            IEventCenter a = EventCenter.m87158a();
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            a.mo75479a("ec_district_panel_changed", jSONObject2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return C89219l.m154714a((Object) str, (Object) "ec");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.b$b */
    static final class C45239b extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f105466a;

        /* renamed from: b */
        final /* synthetic */ Boolean f105467b;

        /* renamed from: c */
        final /* synthetic */ Object f105468c;

        static {
            Covode.recordClassIndex(53691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45239b(List list, Boolean bool, Object obj) {
            super(1);
            this.f105466a = list;
            this.f105467b = bool;
            this.f105468c = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("districts", new JSONArray(C80342dg.m139300a().mo46674b(list)));
            jSONObject.put("status", 2);
            jSONObject.put("enter_method", String.valueOf(this.f105468c));
            IEventCenter a = EventCenter.m87158a();
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            a.mo75479a("ec_district_panel_changed", jSONObject2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.b$c */
    static final class C45240c extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f105469a;

        /* renamed from: b */
        final /* synthetic */ Boolean f105470b;

        /* renamed from: c */
        final /* synthetic */ Object f105471c;

        static {
            Covode.recordClassIndex(53692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45240c(List list, Boolean bool, Object obj) {
            super(1);
            this.f105469a = list;
            this.f105470b = bool;
            this.f105471c = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("districts", new JSONArray(C80342dg.m139300a().mo46674b(list)));
            jSONObject.put("status", 1);
            jSONObject.put("enter_method", String.valueOf(this.f105471c));
            IEventCenter a = EventCenter.m87158a();
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            a.mo75479a("ec_district_panel_changed", jSONObject2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m87829a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        String str3;
        Boolean bool;
        int i;
        boolean z;
        Intent extra;
        Context context2 = context;
        String str4 = null;
        if (routeIntent == null || (extra = routeIntent.getExtra()) == null) {
            str = null;
        } else {
            str = m87829a(extra, "trackParams");
        }
        try {
            obj = C45264j.m87844a().mo46670a(str, HashMap.class);
        } catch (Exception unused) {
            obj = null;
        }
        HashMap hashMap = (HashMap) obj;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        Object obj3 = hashMap.get("enter_method");
        if (routeIntent != null) {
            str2 = routeIntent.getPath();
        } else {
            str2 = null;
        }
        if (str2 != null && str2.hashCode() == -1801795815 && str2.equals("/geo_select")) {
            try {
                obj2 = C45264j.m87844a().mo46670a(m87829a(routeIntent.getExtra(), "geoname_ids"), List.class);
            } catch (Exception unused2) {
                obj2 = null;
            }
            List list = (List) obj2;
            Intent extra2 = routeIntent.getExtra();
            if (extra2 != null) {
                str3 = m87829a(extra2, "order_skus");
            } else {
                str3 = null;
            }
            try {
                C45264j.m87844a().mo46670a(str3, HashMap.class);
            } catch (Exception unused3) {
            }
            Intent extra3 = routeIntent.getExtra();
            if (extra3 != null) {
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(extra3.getBooleanExtra("force_single_level", z));
            } else {
                bool = null;
            }
            if (!(context2 instanceof ActivityC0945e)) {
                context2 = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context2;
            if (eVar != null) {
                if (list != null) {
                    str4 = (String) C89070n.m154586h(list);
                }
                AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    i = 1;
                } else {
                    i = Integer.MAX_VALUE;
                }
                C43587b.C43588a.m86626a(false, str4, i, supportFragmentManager, null, new C45238a(list, bool, obj3), new C45239b(list, bool, obj3), new C45240c(list, bool, obj3), 17);
                return true;
            }
        }
        return false;
    }
}
