package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.g */
public final class C45257g implements IInterceptor {

    /* renamed from: b */
    public static final Set<String> f105490b = C89047am.m154438a((Object[]) new String[]{"aweme://ec/pdp", "aweme://ec/sku", "aweme://ec/delivery", "aweme://ec/address/list", "aweme://ec/address/edit", "aweme://ec/order_center"});

    /* renamed from: c */
    public static final C45259a f105491c = new C45259a((byte) 0);

    /* renamed from: a */
    public volatile HashMap<String, SchemaFallbackConfig> f105492a;

    /* renamed from: d */
    private volatile boolean f105493d;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.g$a */
    public static final class C45259a {
        static {
            Covode.recordClassIndex(53711);
        }

        private C45259a() {
        }

        public /* synthetic */ C45259a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.g$b */
    static final class C45260b implements AbstractC16082i {

        /* renamed from: a */
        final /* synthetic */ C45257g f105495a;

        static {
            Covode.recordClassIndex(53712);
        }

        C45260b(C45257g gVar) {
            this.f105495a = gVar;
        }

        @Override // com.bytedance.ies.abmock.AbstractC16082i
        /* renamed from: a */
        public final void mo25536a() {
            C40780g.m82245b().execute(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.router.C45257g.C45260b.RunnableC452611 */

                /* renamed from: a */
                final /* synthetic */ C45260b f105496a;

                static {
                    Covode.recordClassIndex(53713);
                }

                {
                    this.f105496a = r1;
                }

                public final void run() {
                    this.f105496a.f105495a.mo76346a();
                }
            });
        }
    }

    public C45257g() {
        C40780g.m82245b().execute(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.router.C45257g.RunnableC452581 */

            /* renamed from: a */
            final /* synthetic */ C45257g f105494a;

            static {
                Covode.recordClassIndex(53710);
            }

            {
                this.f105494a = r1;
            }

            public final void run() {
                C45257g gVar = this.f105494a;
                gVar.mo76346a();
                SettingsManager.m29616a().mo25399a(new C45260b(gVar));
            }
        });
    }

    static {
        Covode.recordClassIndex(53709);
    }

    /* renamed from: a */
    public final void mo76346a() {
        HashMap<String, SchemaFallbackConfig> hashMap = new HashMap<>();
        SchemaFallbackConfig[] schemaFallbackConfigArr = (SchemaFallbackConfig[]) SettingsManager.m29616a().mo25397a("ecom_schema_fallback_config", SchemaFallbackConfig[].class, C45266k.f105500a);
        if (schemaFallbackConfigArr == null) {
            schemaFallbackConfigArr = C45266k.f105500a;
        }
        ArrayList<SchemaFallbackConfig> arrayList = new ArrayList();
        for (SchemaFallbackConfig schemaFallbackConfig : schemaFallbackConfigArr) {
            if (f105490b.contains(schemaFallbackConfig.getKey())) {
                arrayList.add(schemaFallbackConfig);
            }
        }
        for (SchemaFallbackConfig schemaFallbackConfig2 : arrayList) {
            hashMap.put(schemaFallbackConfig2.getKey(), schemaFallbackConfig2);
        }
        this.f105492a = hashMap;
        this.f105493d = true;
    }

    /* renamed from: a */
    public static String m87834a(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() > 0) {
            sb.append(C89219l.m154704a(uri.getScheme(), (Object) "://"));
        }
        String authority = uri.getAuthority();
        if (authority != null && authority.length() > 0) {
            sb.append(uri.getAuthority());
        }
        String path = uri.getPath();
        if (path != null && path.length() > 0) {
            sb.append(uri.getPath());
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (!(routeIntent == null || routeIntent.getUri() == null)) {
            if (!this.f105493d) {
                mo76346a();
            }
            HashMap<String, SchemaFallbackConfig> hashMap = this.f105492a;
            if (hashMap == null) {
                C89219l.m154710a("configMap");
            }
            if (hashMap.isEmpty()) {
                return false;
            }
            Uri uri = routeIntent.getUri();
            C89219l.m154716b(uri, "");
            String a = m87834a(uri);
            HashMap<String, SchemaFallbackConfig> hashMap2 = this.f105492a;
            if (hashMap2 == null) {
                C89219l.m154710a("configMap");
            }
            if (hashMap2.get(a) != null) {
                Uri uri2 = routeIntent.getUri();
                C89219l.m154716b(uri2, "");
                if (!uri2.getQueryParameterNames().contains("fallback")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (!(routeIntent == null || routeIntent.getUri() == null)) {
            Uri uri = routeIntent.getUri();
            C89219l.m154716b(uri, "");
            String a = m87834a(uri);
            HashMap<String, SchemaFallbackConfig> hashMap = this.f105492a;
            if (hashMap == null) {
                C89219l.m154710a("configMap");
            }
            SchemaFallbackConfig schemaFallbackConfig = hashMap.get(a);
            if (schemaFallbackConfig != null) {
                Uri.Builder builder = new Uri.Builder();
                Uri.Builder encodedPath = builder.scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                C89219l.m154716b(queryParameterNames, "");
                for (T t : queryParameterNames) {
                    encodedPath.appendQueryParameter(t, uri.getQueryParameter(t));
                }
                builder.appendQueryParameter("fallback", schemaFallbackConfig.getFallback());
                routeIntent.setUrl(builder.build().toString());
            }
        }
        return false;
    }
}
