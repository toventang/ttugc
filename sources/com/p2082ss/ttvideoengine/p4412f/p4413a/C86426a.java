package com.p2082ss.ttvideoengine.p4412f.p4413a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface;
import com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.ttvideoengine.f.a.a */
public final class C86426a implements AVMDLNewFetcherMakerInterface {

    /* renamed from: a */
    private static final List<WeakReference<AbstractC86427b>> f193769a = new ArrayList();

    static {
        Covode.recordClassIndex(101654);
    }

    /* renamed from: a */
    private static synchronized AbstractC86427b m149124a(String str) {
        synchronized (C86426a.class) {
            MethodCollector.m26663i(5180);
            for (WeakReference<AbstractC86427b> weakReference : f193769a) {
                AbstractC86427b bVar = weakReference.get();
                if (bVar != null && TextUtils.equals(str, bVar.mo137456a())) {
                    MethodCollector.m26664o(5180);
                    return bVar;
                }
            }
            MethodCollector.m26664o(5180);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m149125a(AbstractC86427b bVar) {
        synchronized (C86426a.class) {
            MethodCollector.m26663i(5153);
            if (bVar == null) {
                C86641i.m150110a("FetcherMakerNew", "storeListener fetcherListener is null");
                MethodCollector.m26664o(5153);
                return;
            }
            C86641i.m150110a("FetcherMakerNew", "storeListener ".concat(String.valueOf(bVar)));
            f193769a.add(new WeakReference<>(bVar));
            MethodCollector.m26664o(5153);
        }
    }

    /* renamed from: b */
    public static synchronized void m149126b(AbstractC86427b bVar) {
        synchronized (C86426a.class) {
            MethodCollector.m26663i(5163);
            if (bVar == null) {
                C86641i.m150110a("FetcherMakerNew", "removeListener fetcherListener is null");
                MethodCollector.m26664o(5163);
                return;
            }
            C86641i.m150110a("FetcherMakerNew", "removeListener ".concat(String.valueOf(bVar)));
            Iterator<WeakReference<AbstractC86427b>> it = f193769a.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC86427b> next = it.next();
                if (next == null || next.get() == null) {
                    it.remove();
                } else if (next.get() == bVar) {
                    it.remove();
                }
            }
            MethodCollector.m26664o(5163);
        }
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface
    public final AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3, String str4) {
        C86641i.m150110a("FetcherMakerNew", "getFetcher rawKey " + str + ", fileKey " + str2 + ", engineId " + str4);
        AbstractC86427b a = m149124a(str4);
        if (a == null) {
            C86641i.m150117e("FetcherMakerNew", "getFetcher MDLFetcherListener is null");
            return null;
        }
        C86428c cVar = new C86428c(a);
        C86641i.m150110a("FetcherMakerNew", "return fetcher to mdl ".concat(String.valueOf(cVar)));
        return cVar;
    }
}
