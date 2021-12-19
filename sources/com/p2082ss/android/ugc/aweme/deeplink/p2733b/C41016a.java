package com.p2082ss.android.ugc.aweme.deeplink.p2733b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteManager;
import com.p2082ss.android.ugc.aweme.deeplink.C41035d;
import com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.b.a */
public final class C41016a extends AbstractC41017b {
    static {
        Covode.recordClassIndex(48886);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2733b.AbstractC41017b
    /* renamed from: a */
    public final C89378p<Boolean, String> mo70236a(C41035d dVar, HashMap<String, Object> hashMap) {
        Class<?> cls;
        String targetPageName;
        String str = "";
        C89219l.m154721d(dVar, str);
        C89219l.m154721d(hashMap, str);
        Uri uri = dVar.f95922e;
        String str2 = "//" + uri.getHost() + uri.getPath();
        RouteManager instance = RouteManager.getInstance();
        C89219l.m154716b(instance, str);
        Object obj = null;
        try {
            cls = Class.forName(instance.getExternalRouteMap().get(str2));
        } catch (Throwable unused) {
            dVar.f95921d.finish();
            cls = null;
        }
        m82633a(uri, dVar, hashMap);
        if (cls != null) {
            obj = cls.newInstance();
        }
        AbstractC41008b bVar = (AbstractC41008b) obj;
        if (bVar != null) {
            bVar.open(dVar.f95921d, uri.toString(), hashMap);
        }
        if (!(bVar == null || (targetPageName = bVar.getTargetPageName()) == null)) {
            str = targetPageName;
        }
        mo70237a(str);
        this.f95902b = true;
        return new C89378p<>(Boolean.valueOf(this.f95902b), this.f95901a);
    }
}
