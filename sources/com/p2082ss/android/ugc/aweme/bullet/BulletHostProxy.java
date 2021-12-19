package com.p2082ss.android.ugc.aweme.bullet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.newmedia.AbstractC30133e;
import com.p2082ss.android.sdk.webview.AbstractC30269m;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletHostProxy;
import com.p2082ss.android.ugc.aweme.bullet.module.p2422default.C35239a;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35298a;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.BulletHostProxy */
public final class BulletHostProxy implements IBulletHostProxy {
    static {
        Covode.recordClassIndex(41977);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    /* renamed from: a */
    public final AbstractC30269m mo61834a() {
        C89219l.m154716b(AbstractC30133e.m60956a(), "");
        C81631k kVar = C81631k.f182525a;
        C89219l.m154716b(kVar, "");
        return kVar;
    }

    /* renamed from: b */
    public static IBulletHostProxy m71370b() {
        MethodCollector.m26663i(6008);
        Object a = C81908b.m141854a(IBulletHostProxy.class, false);
        if (a != null) {
            IBulletHostProxy iBulletHostProxy = (IBulletHostProxy) a;
            MethodCollector.m26664o(6008);
            return iBulletHostProxy;
        }
        if (C81908b.f183138U == null) {
            synchronized (IBulletHostProxy.class) {
                try {
                    if (C81908b.f183138U == null) {
                        C81908b.f183138U = new BulletHostProxy();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6008);
                    throw th;
                }
            }
        }
        BulletHostProxy bulletHostProxy = (BulletHostProxy) C81908b.f183138U;
        MethodCollector.m26664o(6008);
        return bulletHostProxy;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    /* renamed from: a */
    public final List<AbstractC16183k> mo61835a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return C35239a.m72172a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    /* renamed from: a */
    public final JSONObject mo61836a(String str) {
        C89219l.m154721d(str, "");
        return C35298a.m72241a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    /* renamed from: a */
    public final boolean mo61837a(Context context, String str) {
        return C33722d.C33723a.m69045a(context, str, (String) null, false);
    }
}
