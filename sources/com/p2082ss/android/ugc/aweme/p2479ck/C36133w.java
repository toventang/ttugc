package com.p2082ss.android.ugc.aweme.p2479ck;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.deeplink.C41050m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ck.w */
public final class C36133w implements IInterceptor {

    /* renamed from: a */
    public static final C36134a f85357a = new C36134a((byte) 0);

    /* renamed from: b */
    private final ArrayList<String> f85358b = C89070n.m154525d("aweme://challenge/detail/:id", "aweme://music/detail/:id", "aweme://assmusic/category/:cid", "aweme://music/category/:mc_id", "aweme://user/profile/:uid", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type/:enter_from", "aweme://story/detail/:id", "aweme://aweme/detail/:id", "aweme://aweme/detaillist/:id", "aweme://tuwen/detail/:id", "aweme://aweme/zhima/:type", "aweme://stickers/detail/:id", "aweme://user/qna/profile/:to_user_id", "aweme://user/ask/:id", "aweme://qna/detail/:id");

    /* renamed from: c */
    private String f85359c = "";

    static {
        Covode.recordClassIndex(43386);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.w$a */
    public static final class C36134a {
        static {
            Covode.recordClassIndex(43387);
        }

        private C36134a() {
        }

        public /* synthetic */ C36134a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        if (!(str == null || (C89361p.m154874b(str, "//", false) && (str = "aweme:".concat(String.valueOf(str))) == null))) {
            str2 = C89361p.m154869a(str, C41050m.f95959a.mo70181e(), "aweme", false);
        }
        Iterator<String> it = this.f85358b.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (C36132v.m73607a(next, str2)) {
                C89219l.m154716b(next, "");
                this.f85359c = next;
                return true;
            }
        }
        this.f85359c = "";
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        Set<String> queryParameterNames;
        Uri uri;
        if (TextUtils.isEmpty(this.f85359c)) {
            return false;
        }
        List<String> b = C89361p.m154915b(this.f85359c, new String[]{"/:"});
        if ((b != null ? Integer.valueOf(b.size()) : null).intValue() > 0) {
            str = b.get(0);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C29844g gVar = new C29844g(str);
        List<String> a = C36132v.m73606a(this.f85359c);
        List<String> a2 = C36132v.m73606a((routeIntent == null || (uri = routeIntent.getUri()) == null) ? null : uri.toString());
        int size = a.size();
        for (int i = 1; i < size; i++) {
            if (i < size) {
                String str2 = a.get(i);
                C89219l.m154716b(str2, "");
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String substring = str2.substring(1);
                C89219l.m154716b(substring, "");
                gVar.mo52130a(substring, a2.get(i));
            }
        }
        if (routeIntent != null) {
            Uri uri2 = routeIntent.getUri();
            if (!(uri2 == null || (queryParameterNames = uri2.getQueryParameterNames()) == null)) {
                for (T t : queryParameterNames) {
                    if (!TextUtils.isEmpty(t)) {
                        Uri uri3 = routeIntent.getUri();
                        gVar.mo52130a(t, uri3 != null ? uri3.getQueryParameter(t) : null);
                    }
                }
            }
            routeIntent.setUrl(gVar.mo52126a());
        }
        this.f85359c = "";
        return false;
    }
}
