package com.bytedance.frameworks.baselib.network.http.cronet.p986b;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.C14617b;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.retrofit2.AbstractC22058l;
import com.bytedance.retrofit2.AbstractC22059m;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.net.HttpURLConnection;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.d */
public class C14653d implements AbstractC22029d, AbstractC22058l, AbstractC22059m {

    /* renamed from: k */
    private static boolean f35540k;

    /* renamed from: l */
    private static final String f35541l = C14653d.class.getSimpleName();

    /* renamed from: m */
    private static ICronetClient f35542m;

    /* renamed from: a */
    HttpURLConnection f35543a;

    /* renamed from: b */
    C14612a f35544b = C14612a.m26716a();

    /* renamed from: c */
    long f35545c;

    /* renamed from: d */
    String f35546d = null;

    /* renamed from: e */
    Request f35547e;

    /* renamed from: f */
    boolean f35548f = false;

    /* renamed from: g */
    boolean f35549g = false;

    /* renamed from: h */
    C22096s f35550h;

    /* renamed from: i */
    private volatile long f35551i = 0;

    /* renamed from: j */
    private String f35552j;

    @Override // com.bytedance.retrofit2.AbstractC22059m
    public Object getRequestInfo() {
        return this.f35544b;
    }

    static {
        Covode.recordClassIndex(16748);
    }

    @Override // com.bytedance.retrofit2.AbstractC22058l
    public void doCollect() {
        C14659h.m26815a(this.f35543a, this.f35544b, this.f35550h);
    }

    /* renamed from: c */
    private int m26787c() {
        HttpURLConnection httpURLConnection = this.f35543a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        String url = this.f35547e.getUrl();
        try {
            this.f35543a = C14659h.m26808a(url, this.f35547e, this.f35544b, this.f35551i);
            this.f35544b.f35355I = true;
            this.f35543a.addRequestProperty("x-tt-bdturing-retry", "1");
            return C14659h.m26801a(this.f35547e, this.f35543a);
        } catch (Exception e) {
            C14659h.m26812a(url, this.f35545c, this.f35544b, this.f35546d, e, this.f35543a, this.f35550h);
            this.f35548f = true;
            if (e instanceof IOException) {
                throw e;
            }
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22029d
    /* renamed from: b */
    public final void mo11600b() {
        HttpURLConnection httpURLConnection = this.f35543a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            if (this.f35547e.isResponseStreaming() && !this.f35548f) {
                doCollect();
                this.f35544b.f35357K = C14659h.m26821b(this.f35552j);
                this.f35544b.f35365h = System.currentTimeMillis();
                if (this.f35544b.f35359b == null || this.f35544b.f35359b.f35413p) {
                    long j = this.f35544b.f35365h;
                    long j2 = this.f35545c;
                    C14731e.m26985a(j - j2, j2, this.f35547e.getUrl(), this.f35546d, this.f35544b);
                }
                C14663j.m26834a().mo23631a(this.f35547e.getUrl(), this.f35544b.f35376s, this.f35544b.f35377t, this.f35544b.f35357K, this.f35544b.f35382y);
            }
            this.f35548f = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe A[Catch:{ Exception -> 0x0187, all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018f A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b8 A[Catch:{ all -> 0x01e1 }] */
    @Override // com.bytedance.retrofit2.client.AbstractC22029d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.C22028c mo11598a() {
        /*
        // Method dump skipped, instructions count: 522
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14653d.mo11598a():com.bytedance.retrofit2.client.c");
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22029d
    /* renamed from: a */
    public final boolean mo11599a(long j) {
        this.f35551i = j;
        HttpURLConnection httpURLConnection = this.f35543a;
        if (httpURLConnection != null) {
            try {
                Reflect.m24529on(httpURLConnection).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public C14653d(Request request, ICronetClient iCronetClient) {
        this.f35547e = request;
        f35542m = iCronetClient;
        String url = request.getUrl();
        this.f35543a = null;
        C22096s metrics = request.getMetrics();
        this.f35550h = metrics;
        if (metrics != null) {
            this.f35544b.f35360c = metrics.f52180g;
            this.f35544b.f35361d = this.f35550h.f52181h;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f35545c = currentTimeMillis;
        this.f35544b.f35362e = currentTimeMillis;
        this.f35544b.f35379v = 0;
        if (this.f35547e.isResponseStreaming()) {
            this.f35544b.f35347A = true;
        } else {
            this.f35544b.f35347A = false;
        }
        if (request.getExtraInfo() instanceof C14617b) {
            this.f35544b.f35359b = (T) ((C14617b) request.getExtraInfo());
            this.f35549g = this.f35544b.f35359b.f35408k;
        }
        try {
            this.f35543a = C14659h.m26808a(url, request, this.f35544b, this.f35551i);
        } catch (Exception e) {
            C14659h.m26812a(url, this.f35545c, this.f35544b, this.f35546d, e, this.f35543a, this.f35550h);
            this.f35548f = true;
            if (e instanceof IOException) {
                throw e;
            }
            throw new IOException(e.getMessage(), e.getCause());
        }
    }
}
