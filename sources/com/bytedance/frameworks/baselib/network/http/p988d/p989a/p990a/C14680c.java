package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.c */
public class C14680c implements Serializable, Comparable<C14680c> {

    /* renamed from: a */
    private String f35627a;

    /* renamed from: b */
    private boolean f35628b;

    /* renamed from: c */
    private long f35629c = System.currentTimeMillis();
    public AbstractC14685g mHttpDnsCallback;

    static {
        Covode.recordClassIndex(16777);
    }

    public String getHost() {
        return this.f35627a;
    }

    public boolean isLocalDnsExpired() {
        return this.f35628b;
    }

    public int compareTo(C14680c cVar) {
        long j = cVar.f35629c;
        long j2 = this.f35629c;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public C14680c(String str, AbstractC14685g gVar, boolean z) {
        this.f35627a = str;
        this.mHttpDnsCallback = gVar;
        this.f35628b = z;
    }
}
