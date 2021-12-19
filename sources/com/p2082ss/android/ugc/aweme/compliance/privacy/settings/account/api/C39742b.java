package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39242c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39243d;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39246g;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39247h;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39261t;
import com.p2082ss.android.ugc.aweme.compliance.common.p2660a.C39605a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b */
public final class C39742b {

    /* renamed from: a */
    public static final C39742b f93591a = new C39742b();

    /* renamed from: b */
    private static final UserSettingsApi f93592b = ((UserSettingsApi) RetrofitFactory.m33635a().mo28816a(C39605a.f93367a).mo28858a(UserSettingsApi.class));

    private C39742b() {
    }

    static {
        Covode.recordClassIndex(47471);
    }

    /* renamed from: a */
    public static AbstractC88979t<C68348f> m80624a() {
        String b = C36145b.m73641b().mo63268b(C17867d.m33078a(), "last_user_setting_version", "");
        UserSettingsApi userSettingsApi = f93592b;
        C89219l.m154716b(b, "");
        AbstractC88979t<C68348f> a = userSettingsApi.getUserSettings(b).mo143280b(C39743a.f93593a).mo143264a(C39744b.f93594a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b$a */
    public static final class C39743a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39743a f93593a = new C39743a();

        static {
            Covode.recordClassIndex(47472);
        }

        C39743a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/aweme/v1/user/settings/", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b$b */
    public static final class C39744b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39744b f93594a = new C39744b();

        static {
            Covode.recordClassIndex(47473);
        }

        C39744b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/aweme/v1/user/settings/", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* renamed from: a */
    public static void m80625a(String str) {
        C89219l.m154721d(str, "");
        C36145b.m73641b().mo63265a(C17867d.m33078a(), "last_user_setting_version", str);
    }

    /* renamed from: a */
    public static C39258q m80623a(C68348f fVar, C39258q qVar) {
        C39258q qVar2 = qVar;
        C89219l.m154721d(fVar, "");
        C39246g gVar = new C39246g(fVar.f153000v, fVar.f152997s, fVar.f152999u, fVar.f152996r);
        C39261t tVar = new C39261t(fVar.f152972ah, fVar.f152973ai, fVar.f152974aj, fVar.f152975ak, fVar.f152976al);
        C39247h hVar = new C39247h(fVar.f152947J);
        C39242c cVar = new C39242c(fVar.f152977am);
        C39243d dVar = new C39243d(fVar.f152940C, fVar.f152943F);
        boolean b = C39631a.m80486b();
        if (qVar2 == null) {
            qVar2 = new C39258q(null, null, null, null, null, null, null, 0);
        }
        return C39258q.m79639a(qVar2, gVar, tVar, hVar, cVar, dVar, null, null, b ? 1 : 0, 96);
    }
}
