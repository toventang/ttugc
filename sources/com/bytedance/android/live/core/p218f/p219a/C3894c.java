package com.bytedance.android.live.core.p218f.p219a;

import android.net.Uri;
import android.os.SystemClock;
import androidx.p025c.C0484a;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1886k.C24460a;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.android.live.core.f.a.c */
public class C3894c extends C24460a {

    /* renamed from: a */
    private static ExecutorService f10784a;

    /* renamed from: b */
    private final Map<String, List<String>> f10785b = new C0484a();

    /* renamed from: c */
    private int f10786c;

    /* renamed from: d */
    private long f10787d = -1;

    static {
        Covode.recordClassIndex(4423);
    }

    /* renamed from: a */
    public static boolean m9523a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static void m9524b() {
        MethodCollector.m26663i(12759);
        if (f10784a == null) {
            synchronized (C3894c.class) {
                try {
                    if (f10784a == null) {
                        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
                            f10784a = C40780g.m82241a();
                        } else {
                            f10784a = m9522a(ThreadFactoryC3897f.f10792a);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(12759);
                }
            }
            return;
        }
        MethodCollector.m26664o(12759);
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public void onRequestCancellation(String str) {
        super.onRequestCancellation(str);
        this.f10785b.remove(str);
    }

    /* renamed from: a */
    private static ExecutorService m9522a(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public final void mo9259a(C24639c cVar) {
        this.f10786c++;
        cVar.f58564o = this;
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1889n.AbstractC24547an
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        List<String> list = this.f10785b.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public void onRequestSuccess(C24636b bVar, String str, boolean z) {
        super.onRequestSuccess(bVar, str, z);
        List<String> remove = this.f10785b.remove(str);
        if (remove != null && remove.contains("NetworkFetchProducer")) {
            Uri uri = bVar.mSourceUri;
            long j = -1;
            if (this.f10787d > 0) {
                this.f10787d = -1;
                j = SystemClock.elapsedRealtime() - this.f10787d;
            }
            m9524b();
            f10784a.submit(new RunnableC3896e(uri, j));
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public void onRequestFailure(C24636b bVar, String str, Throwable th, boolean z) {
        super.onRequestFailure(bVar, str, th, z);
        this.f10785b.remove(str);
        int i = this.f10786c - 1;
        this.f10786c = i;
        if (i == 0) {
            m9524b();
            f10784a.submit(new RunnableC3895d(th, bVar));
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
    public void onRequestStart(C24636b bVar, Object obj, String str, boolean z) {
        super.onRequestStart(bVar, obj, str, z);
        this.f10785b.put(str, new LinkedList());
        if (this.f10787d == -1) {
            this.f10787d = SystemClock.elapsedRealtime();
        }
    }
}
