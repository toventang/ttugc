package com.p2082ss.android.ugc.aweme.legoImp;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.common.util.INetWorkInject;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.newmedia.p2165c.C30127a;
import com.p2082ss.android.ugc.C81908b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.NetWorkInjectImpl */
public final class NetWorkInjectImpl implements INetWorkInject {
    static {
        Covode.recordClassIndex(68344);
    }

    @Override // com.p2082ss.android.common.util.INetWorkInject
    /* renamed from: b */
    public final NetworkUtils.AbstractC29829b mo52099b() {
        return new C30127a();
    }

    @Override // com.p2082ss.android.common.util.INetWorkInject
    /* renamed from: a */
    public final Context mo52098a() {
        Application a = C17879g.m33104a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.common.util.INetWorkInject
    /* renamed from: c */
    public final String mo52100c() {
        String property = System.getProperty("http.agent");
        C89219l.m154716b(property, "");
        return property;
    }

    /* renamed from: d */
    public static INetWorkInject m105238d() {
        MethodCollector.m26663i(1482);
        Object a = C81908b.m141854a(INetWorkInject.class, false);
        if (a != null) {
            INetWorkInject iNetWorkInject = (INetWorkInject) a;
            MethodCollector.m26664o(1482);
            return iNetWorkInject;
        }
        if (C81908b.f183285ci == null) {
            synchronized (INetWorkInject.class) {
                try {
                    if (C81908b.f183285ci == null) {
                        C81908b.f183285ci = new NetWorkInjectImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1482);
                    throw th;
                }
            }
        }
        NetWorkInjectImpl netWorkInjectImpl = (NetWorkInjectImpl) C81908b.f183285ci;
        MethodCollector.m26664o(1482);
        return netWorkInjectImpl;
    }
}
