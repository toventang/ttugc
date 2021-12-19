package com.p2082ss.android.ugc.aweme.services;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.common.p2630b.AbstractC39087b;
import com.p2082ss.android.ugc.aweme.common.p2630b.C39086a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89167q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.services.AndroidAssetServiceImpl */
public final class AndroidAssetServiceImpl {
    static {
        Covode.recordClassIndex(79581);
    }

    public final <T> T convertJsonToObject(String str, Class<T> cls) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        return (T) convertJsonToObject(str, cls, new C39086a());
    }

    public final <T> T convertJsonToObject(String str, Class<T> cls, AbstractC39087b<String, T> bVar) {
        MethodCollector.m26663i(5610);
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        C89219l.m154721d(bVar, "");
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        InputStream open = application.getAssets().open(str);
        C89219l.m154716b(open, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, C89338d.f202990a), 8192);
        try {
            String a = C89167q.m154662a((Reader) bufferedReader);
            C89146c.m154636a(bufferedReader, null);
            T a2 = bVar.mo67837a(a, cls);
            MethodCollector.m26664o(5610);
            return a2;
        } catch (Throwable th) {
            C89146c.m154636a(bufferedReader, th);
            MethodCollector.m26664o(5610);
            throw th;
        }
    }
}
