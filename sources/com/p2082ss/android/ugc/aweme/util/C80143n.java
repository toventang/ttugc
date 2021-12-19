package com.p2082ss.android.ugc.aweme.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.n */
public final class C80143n {
    static {
        Covode.recordClassIndex(93387);
    }

    /* renamed from: com.ss.android.ugc.aweme.util.n$a */
    public static final class C80144a implements IInterceptor {

        /* renamed from: com.ss.android.ugc.aweme.util.n$a$a */
        static final class C80145a<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C80145a f179567a = new C80145a();

            static {
                Covode.recordClassIndex(93389);
            }

            C80145a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.util.n$a$b */
        static final class C80146b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C80146b f179568a = new C80146b();

            static {
                Covode.recordClassIndex(93390);
            }

            C80146b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.util.n$a$c */
        static final class C80147c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C80147c f179569a = new C80147c();

            static {
                Covode.recordClassIndex(93391);
            }

            C80147c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.util.n$a$d */
        static final class C80148d<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C80148d f179570a = new C80148d();

            static {
                Covode.recordClassIndex(93392);
            }

            C80148d() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(93388);
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String str;
            if (routeIntent != null) {
                str = routeIntent.getHost();
            } else {
                str = null;
            }
            return C89219l.m154714a((Object) str, (Object) "eoy");
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            C80135k.m138901a(20, 0, "", false, true).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(C80145a.f179567a, C80146b.f179568a);
            C80141m.m138904a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(C80147c.f179569a, C80148d.f179570a);
            return false;
        }
    }
}
