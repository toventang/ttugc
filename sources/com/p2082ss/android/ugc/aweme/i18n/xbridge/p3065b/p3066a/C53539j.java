package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.p1107a.AbstractC15509e;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.C53582d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47805a;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.j */
public final class C53539j implements IHostRouterDepend {

    /* renamed from: a */
    private final AbstractC89244h f122897a = C89250i.m154773a((AbstractC89171a) C53546f.f122908a);

    static {
        Covode.recordClassIndex(63115);
    }

    /* renamed from: a */
    public final IMainService mo90117a() {
        return (IMainService) this.f122897a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.j$b */
    final class C53541b extends AbstractC18464a {

        /* renamed from: c */
        public final C18742c f122900c;

        static {
            Covode.recordClassIndex(63117);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final List<EnumC18483e> mo29603a() {
            return C89070n.m154516a(EnumC18483e.ALL);
        }

        /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.j$b$a */
        static final class C53542a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ Context f122902a;

            static {
                Covode.recordClassIndex(63118);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C53542a(Context context) {
                super(1);
                this.f122902a = context;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                String str;
                Boolean bool2 = bool;
                C38182f.C38184b a = C38182f.m77418a();
                a.f90211a = "draw_ad";
                C89219l.m154716b(bool2, "");
                String str2 = "deeplink_success";
                if (bool2.booleanValue()) {
                    str = str2;
                } else {
                    str = "deeplink_failed";
                }
                a.f90212b = str;
                a.mo66495a(this.f122902a);
                if (!bool2.booleanValue()) {
                    str2 = "deeplink_failed";
                }
                C18129a.m33747a("draw_ad", str2, "0", "", "0").mo28902c();
                return C89391z.f203057a;
            }
        }

        public C53541b(C18742c cVar) {
            this.f122900c = cVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final boolean mo29604a(String str, Map<String, ? extends Object> map, Context context) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            if (!(!C89219l.m154714a(map.get("useSysBrowser"), (Object) true)) && !TextUtils.isEmpty(str)) {
                String lowerCase = str.toLowerCase();
                C89219l.m154716b(lowerCase, "");
                if (C89361p.m154874b(lowerCase, "http://", false) || C89361p.m154874b(lowerCase, "https://", false)) {
                    Context context2 = (Context) C53582d.m98794a(this.f122900c, Context.class);
                    if (context2 != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent.addFlags(268435456);
                        intent.addCategory("android.intent.category.BROWSABLE");
                        ResolveInfo resolveActivity = context2.getPackageManager().resolveActivity(intent, 65536);
                        if (resolveActivity != null) {
                            intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                            C84349a.m145093a(intent, context2);
                            context2.startActivity(intent);
                            return true;
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(StringSet.type, "webview");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", str);
                    jSONObject.put("args", jSONObject2);
                    C47805a.m90818a(context2, jSONObject);
                    return true;
                } else if (context != null) {
                    boolean openAdOpenUrl = C53539j.this.mo90117a().openAdOpenUrl(context, str, false);
                    if (!openAdOpenUrl) {
                        return openAdOpenUrl;
                    }
                    C38182f.C38184b a = C38182f.m77418a();
                    a.f90211a = "draw_ad";
                    a.f90212b = "open_url_app";
                    a.mo66495a(context);
                    C18129a.m33747a("draw_ad", "open_url_app", "0", "", "0").mo28902c();
                    C53539j.this.mo90117a().pendingDeepLinkLog(new C53542a(context));
                    return openAdOpenUrl;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.j$d */
    final class C53544d extends AbstractC18464a {
        static {
            Covode.recordClassIndex(63120);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final boolean mo29604a(String str, Map<String, ? extends Object> map, Context context) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            return false;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final List<EnumC18483e> mo29603a() {
            return C89070n.m154516a(EnumC18483e.ALL);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C53544d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.j$f */
    static final class C53546f extends AbstractC89220m implements AbstractC89171a<IMainService> {

        /* renamed from: a */
        public static final C53546f f122908a = new C53546f();

        static {
            Covode.recordClassIndex(63122);
        }

        C53546f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IMainService invoke() {
            return MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.j$a */
    final class C53540a extends AbstractC18464a {

        /* renamed from: c */
        public final C18742c f122898c;

        static {
            Covode.recordClassIndex(63116);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final List<EnumC18483e> mo29603a() {
            return C89070n.m154522b(EnumC18483e.LYNX, EnumC18483e.WEB);
        }

        public C53540a(C18742c cVar) {
            this.f122898c = cVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final boolean mo29604a(String str, Map<String, ? extends Object> map, Context context) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            Context context2 = (Context) C53582d.m98794a(this.f122898c, Context.class);
            if (!(context2 instanceof Activity)) {
                return false;
            }
            return C53539j.this.mo90117a().startAdsAppActivity(context2, C89361p.m154869a(str, "aweme", "sslocal", false), null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.j$c */
    final class C53543c extends AbstractC18464a {

        /* renamed from: c */
        public final C18742c f122903c;

        static {
            Covode.recordClassIndex(63119);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final List<EnumC18483e> mo29603a() {
            return C89070n.m154522b(EnumC18483e.LYNX, EnumC18483e.WEB);
        }

        public C53543c(C18742c cVar) {
            this.f122903c = cVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final boolean mo29604a(String str, Map<String, ? extends Object> map, Context context) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            return C53539j.this.mo90117a().handleLiveSchema(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.j$e */
    final class C53545e extends AbstractC18464a {

        /* renamed from: c */
        public final C18742c f122906c;

        static {
            Covode.recordClassIndex(63121);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final List<EnumC18483e> mo29603a() {
            return C89070n.m154522b(EnumC18483e.WEB, EnumC18483e.LYNX);
        }

        public C53545e(C18742c cVar) {
            this.f122906c = cVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.AbstractC18464a
        /* renamed from: a */
        public final boolean mo29604a(String str, Map<String, ? extends Object> map, Context context) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            Context context2 = (Context) C53582d.m98794a(this.f122906c, Context.class);
            if (context2 instanceof Activity) {
                return C53539j.m98753a(context2, str);
            }
            return C53539j.m98753a(null, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final AbstractC18464a provideRouteOpenExceptionHandler(C18742c cVar) {
        return new C53544d();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final List<AbstractC18464a> provideRouteOpenHandlerList(C18742c cVar) {
        return C89070n.m154522b(new C53541b(cVar), new C53543c(cVar), new C53545e(cVar), new C53540a(cVar));
    }

    /* renamed from: a */
    public static boolean m98753a(Context context, String str) {
        if (context instanceof Activity) {
            return C36125t.m73596a(C36125t.m73591a(), (Activity) context, str);
        }
        return C36125t.m73598a(C36125t.m73591a(), str);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final boolean closeView(C18742c cVar, EnumC18483e eVar, String str, boolean z) {
        AbstractC16239d dVar;
        AbstractC16208i a;
        AbstractC17045g z2;
        Activity a2;
        AbstractC15509e eVar2;
        C16238z a3;
        C89219l.m154721d(eVar, "");
        if (str == null || str.length() <= 0) {
            try {
                AbstractC16208i a4 = C53582d.m98793a(cVar);
                if (a4 == null || (a3 = a4.mo25762a()) == null || (str = a3.f39033a) == null) {
                    str = "";
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        Context context = (Context) C53582d.m98794a(cVar, Context.class);
        if (context != null && BulletService.m71938f().mo61859b(context, str)) {
            return true;
        }
        C21196a aVar = SparkContext.f37776d.get(str);
        if (aVar == null || (eVar2 = (AbstractC15509e) aVar.mo34746a(AbstractC15509e.class)) == null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (!(str == null || (dVar = (AbstractC16239d) C53582d.m98794a(cVar, AbstractC16239d.class)) == null || (a = dVar.mo25683a(str)) == null)) {
                if (!(a instanceof AbstractC17026c)) {
                    a = null;
                }
                AbstractC17026c cVar2 = (AbstractC17026c) a;
                if (!(cVar2 == null || (z2 = cVar2.mo26902z()) == null || (a2 = z2.mo26816a()) == null)) {
                    a2.finish();
                    if (z) {
                        a2.overridePendingTransition(R.anim.f205073do, R.anim.dx);
                    }
                }
            }
            if (!(context instanceof Activity)) {
                return false;
            }
            if (!((Activity) context).isFinishing()) {
                ((Activity) context).finish();
                if (z) {
                    ((Activity) context).overridePendingTransition(R.anim.f205073do, R.anim.dx);
                }
            }
            return true;
        }
        eVar2.mo25250a();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final boolean openSchema(C18742c cVar, String str, Map<String, ? extends Object> map, EnumC18483e eVar, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(eVar, "");
        return IHostRouterDepend.C18458a.m34335a(this, cVar, str, map, eVar);
    }
}
