package com.google.p1971b.p1972a.p1983d.p1984a;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1983d.AbstractC27148h;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: com.google.b.a.d.a.a */
public final class C27138a extends AbstractC27148h {

    /* renamed from: b */
    public final HttpClient f64274b;

    static {
        Covode.recordClassIndex(32718);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27138a() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1971b.p1972a.p1983d.p1984a.C27138a.<init>():void");
    }

    private C27138a(HttpClient httpClient) {
        this.f64274b = httpClient;
        HttpParams params = httpClient.getParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        params.setBooleanParameter("http.protocol.handle-redirects", false);
    }
}
