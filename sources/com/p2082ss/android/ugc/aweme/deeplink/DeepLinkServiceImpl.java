package com.p2082ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.deeplink.C40996a;
import com.p2082ss.android.ugc.aweme.deeplink.C41065u;
import com.p2082ss.android.ugc.aweme.deeplink.C41067v;
import com.p2082ss.android.ugc.aweme.deeplink.RequireLoginActivity;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41041e;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl */
public final class DeepLinkServiceImpl implements IDeepLinkService {
    static {
        Covode.recordClassIndex(48848);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: f */
    public final String mo70182f() {
        return C40996a.f95870b;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: e */
    public final String mo70181e() {
        return C40996a.C40997a.m82610a();
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: b */
    public final String mo70175b() {
        String name = DeepLinkHandlerActivity.class.getName();
        C89219l.m154716b(name, "");
        return name;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: c */
    public final String mo70178c() {
        String name = DeepLinkActivityV2.class.getName();
        C89219l.m154716b(name, "");
        return name;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: d */
    public final String mo70180d() {
        String name = AppLinkHandlerV2.class.getName();
        C89219l.m154716b(name, "");
        return name;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final void mo70169a() {
        C41065u.f95991a = null;
        C41065u.f95993c = false;
        C41065u.f95992b = "";
        C41065u.f95996f = null;
        AbstractC88412b bVar = C41065u.f95994d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: g */
    public static IDeepLinkService m82568g() {
        MethodCollector.m26663i(10862);
        Object a = C81908b.m141854a(IDeepLinkService.class, false);
        if (a != null) {
            IDeepLinkService iDeepLinkService = (IDeepLinkService) a;
            MethodCollector.m26664o(10862);
            return iDeepLinkService;
        }
        if (C81908b.f183166aV == null) {
            synchronized (IDeepLinkService.class) {
                try {
                    if (C81908b.f183166aV == null) {
                        C81908b.f183166aV = new DeepLinkServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10862);
                    throw th;
                }
            }
        }
        DeepLinkServiceImpl deepLinkServiceImpl = (DeepLinkServiceImpl) C81908b.f183166aV;
        MethodCollector.m26664o(10862);
        return deepLinkServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: b */
    public final String mo70176b(String str) {
        C89219l.m154721d(str, "");
        return C40996a.C40997a.m82611a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: c */
    public final boolean mo70179c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a = C40996a.C40997a.m82610a();
        if (C89219l.m154714a((Object) str, (Object) C40996a.f95869a) || C89219l.m154714a((Object) str, (Object) a) || C89219l.m154714a((Object) str, (Object) C40996a.f95872d) || C89219l.m154714a((Object) str, (Object) C40996a.f95873e)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final boolean mo70174a(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        if (C13627m.m24498a(str)) {
            return false;
        }
        if (C89219l.m154714a((Object) C40996a.f95869a, (Object) str)) {
            return true;
        }
        String a = C40996a.C40997a.m82610a();
        if (C13627m.m24498a(a) || !C89219l.m154714a((Object) a, (Object) str)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final void mo70171a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C41069w wVar = new C41069w(str, str2);
        C89219l.m154721d(wVar, "");
        C41067v.f95999a.onNext(wVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final void mo70170a(C41035d dVar, C41022c cVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C41065u.f95995e = cVar;
        C41065u.f95996f = dVar;
        if (!C41065u.f95993c) {
            if (C41065u.f95991a == null) {
                C41065u.f95991a = new C41064t(C41065u.f95995e);
                C41065u.f95993c = true;
            }
            C41065u.C41066a aVar = C41065u.C41066a.f95998a;
            C89219l.m154721d(aVar, "");
            AbstractC88412b d = C41067v.f95999a.mo143289d(new C41067v.C41068a(aVar));
            C89219l.m154716b(d, "");
            C41065u.f95994d = d;
        }
        C41063s a = C41065u.m82723a();
        if (a != null) {
            a.mo70275a(dVar, a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final void mo70172a(String str, boolean z, String str2) {
        C41041e.m82679a(str, z, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: b */
    public final void mo70177b(Activity activity, String str, boolean z) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        RequireLoginActivity.C40992a.m82601a(activity, str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final boolean mo70173a(Activity activity, String str, boolean z) {
        Uri uri;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        Intent intent = activity.getIntent();
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (!RequireLoginActivity.C40992a.m82602a(uri)) {
            return false;
        }
        RequireLoginActivity.C40992a.m82601a(activity, str, z);
        return true;
    }
}
