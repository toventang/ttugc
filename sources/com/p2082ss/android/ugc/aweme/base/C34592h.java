package com.p2082ss.android.ugc.aweme.base;

import android.net.Uri;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1886k.C24460a;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.ss.android.ugc.aweme.base.h */
public class C34592h extends C24460a {

    /* renamed from: a */
    private static ExecutorService f81636a;

    /* renamed from: b */
    private final Map<String, List<String>> f81637b = new C0484a();

    /* renamed from: c */
    private int f81638c;

    /* renamed from: d */
    private long f81639d = -1;

    static {
        Covode.recordClassIndex(41554);
    }

    /* renamed from: a */
    private static void m70626a() {
        MethodCollector.m26663i(13374);
        if (f81636a == null) {
            synchronized (C34592h.class) {
                try {
                    if (f81636a == null) {
                        f81636a = m70625a(ThreadFactoryC34601k.f81653a);
                    }
                } finally {
                    MethodCollector.m26664o(13374);
                }
            }
            return;
        }
        MethodCollector.m26664o(13374);
    }

    /* renamed from: a */
    public final void mo61047a(C24639c cVar) {
        this.f81638c++;
        cVar.f58564o = this;
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public void onRequestCancellation(String str) {
        super.onRequestCancellation(str);
        this.f81637b.remove(str);
    }

    /* renamed from: a */
    private static ExecutorService m70625a(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1889n.AbstractC24547an
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        List<String> list = this.f81637b.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public void onRequestSuccess(C24636b bVar, String str, boolean z) {
        super.onRequestSuccess(bVar, str, z);
        List<String> remove = this.f81637b.remove(str);
        if (remove != null) {
            boolean contains = remove.contains("NetworkFetchProducer");
            Uri uri = bVar.mSourceUri;
            long j = -1;
            if (this.f81639d > 0) {
                this.f81639d = -1;
                j = System.currentTimeMillis() - this.f81639d;
            }
            m70626a();
            f81636a.submit(new RunnableC34600j(uri, j, contains));
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public void onRequestFailure(C24636b bVar, String str, Throwable th, boolean z) {
        super.onRequestFailure(bVar, str, th, z);
        this.f81637b.remove(str);
        int i = this.f81638c - 1;
        this.f81638c = i;
        if (i == 0) {
            m70626a();
            f81636a.submit(new RunnableC34599i(bVar, th));
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public void onRequestStart(C24636b bVar, Object obj, String str, boolean z) {
        super.onRequestStart(bVar, obj, str, z);
        this.f81637b.put(str, new LinkedList());
        if (this.f81639d == -1) {
            this.f81639d = System.currentTimeMillis();
        }
    }
}
