package com.bytedance.frameworks.baselib.network.http.cronet.p986b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.p983b.C14620c;
import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.c */
public final class C14652c extends IOException {

    /* renamed from: a */
    private C14612a f35537a;

    /* renamed from: b */
    private String f35538b;

    /* renamed from: c */
    private int f35539c;

    static {
        Covode.recordClassIndex(16747);
    }

    public final C14612a getRequestInfo() {
        return this.f35537a;
    }

    public final int getStatusCode() {
        return this.f35539c;
    }

    public final String getTraceCode() {
        return this.f35538b;
    }

    public final String getRequestLog() {
        return this.f35537a.f35382y;
    }

    public C14652c(Exception exc, C14612a aVar, String str) {
        super(exc.getMessage(), exc.getCause());
        this.f35537a = aVar;
        this.f35538b = str;
        if (exc instanceof C14620c) {
            this.f35539c = ((C14620c) exc).getStatusCode();
        }
    }
}
