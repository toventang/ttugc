package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44302b;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.c */
public final class C45241c implements IInterceptor {

    /* renamed from: a */
    public static final Uri f105472a;

    /* renamed from: b */
    public static final C45242a f105473b = new C45242a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.c$a */
    public static final class C45242a {
        static {
            Covode.recordClassIndex(53694);
        }

        private C45242a() {
        }

        public /* synthetic */ C45242a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(53693);
        Uri parse = Uri.parse("aweme://echybrid");
        C89219l.m154716b(parse, "");
        f105472a = parse;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null) {
            return false;
        }
        String scheme = uri.getScheme();
        Uri uri2 = f105472a;
        if (!TextUtils.equals(scheme, uri2.getScheme()) || !TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) || !TextUtils.equals(uri.getPath(), uri2.getPath())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        boolean z;
        float f;
        Float c;
        if (!(routeIntent == null || (uri = routeIntent.getUri()) == null)) {
            Uri.Builder encodedAuthority = new Uri.Builder().scheme("bullet").encodedAuthority("bullet");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                encodedAuthority.appendQueryParameter(t, uri.getQueryParameter(t));
            }
            Uri build = encodedAuthority.build();
            AbstractC0952i iVar = null;
            if (context instanceof ActivityC0945e) {
                ActivityC0945e eVar = (ActivityC0945e) context;
                AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
                C89219l.m154716b(supportFragmentManager, "");
                if (!supportFragmentManager.mo3566g()) {
                    AbstractC0952i supportFragmentManager2 = eVar.getSupportFragmentManager();
                    C89219l.m154716b(supportFragmentManager2, "");
                    if (!supportFragmentManager2.mo3567h()) {
                        iVar = eVar.getSupportFragmentManager();
                    }
                }
            }
            String queryParameter = uri.getQueryParameter("is_large_half");
            if (queryParameter != null) {
                z = C89219l.m154714a((Object) queryParameter, (Object) "1");
            } else {
                z = false;
            }
            String queryParameter2 = uri.getQueryParameter("container_height");
            if (queryParameter2 == null || (c = C89361p.m154861c(queryParameter2)) == null) {
                f = 1.0f;
            } else {
                c.floatValue();
                f = c.floatValue();
            }
            if (iVar != null) {
                if (z) {
                    C89219l.m154716b(build, "");
                    int i = (int) C45563h.f106107c;
                    String uri2 = build.toString();
                    C89219l.m154716b(uri2, "");
                    C44302b.C44303a.m87027a(build, i, iVar, uri2, true);
                } else if (f < 1.0f) {
                    C89219l.m154716b(build, "");
                    int i2 = (int) (((float) C45563h.f106106b) * f);
                    String uri3 = build.toString();
                    C89219l.m154716b(uri3, "");
                    C44302b.C44303a.m87027a(build, i2, iVar, uri3, true);
                }
            }
            if (context != null) {
                IBulletService f2 = BulletService.m71938f();
                String uri4 = build.toString();
                C89219l.m154716b(uri4, "");
                f2.mo61852a(context, uri4);
            }
        }
        return true;
    }
}
