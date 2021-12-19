package com.p2082ss.android.ugc.aweme.account.p2277p.p2278a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.account.profilebadge.UserGetApi;
import com.p2082ss.android.ugc.aweme.account.profilebadge.UserGetResponse;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.p.a.g */
public final class C32925g implements AbstractC18293d {

    /* renamed from: a */
    public final WeakReference<Context> f78340a;

    /* renamed from: b */
    public final C18288a f78341b;

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.g$b */
    static final class C32927b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32927b f78343a = new C32927b();

        static {
            Covode.recordClassIndex(39715);
        }

        C32927b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39713);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.g$a */
    static final class C32926a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32926a f78342a = new C32926a();

        static {
            Covode.recordClassIndex(39714);
        }

        C32926a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            UserGetResponse userGetResponse = (UserGetResponse) obj;
            if (userGetResponse.getUser() != null) {
                AccountService.m65215a().mo57069e().updateCurUser(userGetResponse.getUser());
            }
        }
    }

    public C32925g(WeakReference<Context> weakReference, C18288a aVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        this.f78340a = weakReference;
        this.f78341b = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        UserGetApi.C32935a.m67573a().getSelf().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C32926a.f78342a, C32927b.f78343a);
    }
}
