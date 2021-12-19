package com.bytedance.frameworks.baselib.network.http.p984c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.d */
public final class C14632d implements AbstractC14631c {

    /* renamed from: a */
    private final Map<URI, List<C14633e>> f35421a = new HashMap();

    static {
        Covode.recordClassIndex(16723);
    }

    /* renamed from: b */
    private static URI m26734b(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URI("http", uri.getHost(), null, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14631c
    /* renamed from: a */
    public final synchronized List<C14633e> mo23505a(URI uri) {
        List<C14633e> unmodifiableList;
        MethodCollector.m26663i(10506);
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            List<C14633e> list = this.f35421a.get(uri);
            if (list != null) {
                Iterator<C14633e> it = list.iterator();
                while (it.hasNext()) {
                    C14633e next = it.next();
                    if (next.mo23508a()) {
                        it.remove();
                    } else {
                        arrayList.add(next);
                    }
                }
            }
            for (Map.Entry<URI, List<C14633e>> entry : this.f35421a.entrySet()) {
                if (!uri.equals(entry.getKey())) {
                    Iterator<C14633e> it2 = entry.getValue().iterator();
                    while (it2.hasNext()) {
                        C14633e next2 = it2.next();
                        if (C14633e.m26740a(next2.f35430d, uri.getHost())) {
                            if (next2.mo23508a()) {
                                it2.remove();
                            } else if (!arrayList.contains(next2)) {
                                arrayList.add(next2);
                            }
                        }
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            MethodCollector.m26664o(10506);
        } else {
            NullPointerException nullPointerException = new NullPointerException("uri == null");
            MethodCollector.m26664o(10506);
            throw nullPointerException;
        }
        return unmodifiableList;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14631c
    /* renamed from: a */
    public final synchronized void mo23506a(URI uri, C14633e eVar) {
        MethodCollector.m26663i(10359);
        if (eVar != null) {
            URI b = m26734b(uri);
            List<C14633e> list = this.f35421a.get(b);
            if (list == null) {
                list = new ArrayList<>();
                this.f35421a.put(b, list);
            } else {
                list.remove(eVar);
            }
            list.add(eVar);
            MethodCollector.m26664o(10359);
        } else {
            NullPointerException nullPointerException = new NullPointerException("cookie == null");
            MethodCollector.m26664o(10359);
            throw nullPointerException;
        }
    }
}
