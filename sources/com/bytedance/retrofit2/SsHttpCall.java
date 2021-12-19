package com.bytedance.retrofit2;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1612c.C22023b;
import com.bytedance.services.apm.api.C22708a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public class SsHttpCall<T> implements AbstractC21983b<T>, AbstractC22058l, AbstractC22059m {
    public static AbstractC21971a sThrottleControl;
    private long appCallTime;
    public final Object[] args;
    private final CallServerInterceptor callServerInterceptor;
    public Request originalRequest;
    public Throwable preBuildURLException;
    public final C22097t<T> serviceMethod;

    /* renamed from: com.bytedance.retrofit2.SsHttpCall$a */
    public interface AbstractC21971a {
        static {
            Covode.recordClassIndex(25660);
        }

        /* renamed from: a */
        int mo35770a(String str);

        /* renamed from: a */
        int mo35771a(String str, String str2);

        /* renamed from: a */
        boolean mo35772a();

        /* renamed from: b */
        boolean mo35773b();

        /* renamed from: b */
        boolean mo35774b(String str);
    }

    static {
        Covode.recordClassIndex(25657);
    }

    @Override // com.bytedance.retrofit2.AbstractC21983b
    public C22099u execute() {
        return m41331xda5cbb88(this);
    }

    @Override // com.bytedance.retrofit2.AbstractC21983b
    public void cancel() {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null) {
            callServerInterceptor2.cancel();
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22058l
    public void doCollect() {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null) {
            callServerInterceptor2.doCollect();
        }
    }

    public C22096s getRetrofitMetrics() {
        return this.serviceMethod.f52217p;
    }

    @Override // com.bytedance.retrofit2.AbstractC21983b, java.lang.Object
    public SsHttpCall<T> clone() {
        return new SsHttpCall<>(this.serviceMethod, this.args);
    }

    @Override // com.bytedance.retrofit2.AbstractC22059m
    public Object getRequestInfo() {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null) {
            return callServerInterceptor2.getRequestInfo();
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.AbstractC21983b
    public boolean isCanceled() {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 == null || !callServerInterceptor2.isCanceled()) {
            return false;
        }
        return true;
    }

    public synchronized boolean isExecuted() {
        MethodCollector.m26663i(12888);
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 == null || !callServerInterceptor2.isExecuted()) {
            MethodCollector.m26664o(12888);
            return false;
        }
        MethodCollector.m26664o(12888);
        return true;
    }

    /* access modifiers changed from: package-private */
    public C22099u getResponseWithInterceptorChain() {
        C22096s sVar = this.serviceMethod.f52217p;
        sVar.f52190q = SystemClock.uptimeMillis();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.serviceMethod.f52206e);
        linkedList.add(this.callServerInterceptor);
        sVar.f52180g = this.appCallTime;
        sVar.f52181h = System.currentTimeMillis();
        this.originalRequest.setMetrics(sVar);
        C22099u a = new C22023b(linkedList, 0, this.originalRequest, this, sVar).mo35810a(this.originalRequest);
        a.f52264d = sVar;
        return a;
    }

    @Override // com.bytedance.retrofit2.AbstractC21983b
    public Request request() {
        Request request;
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null && (request = callServerInterceptor2.request()) != null) {
            return request;
        }
        if (this.originalRequest == null) {
            try {
                C22096s sVar = this.serviceMethod.f52217p;
                sVar.f52191r = SystemClock.uptimeMillis();
                this.originalRequest = this.serviceMethod.mo35896a(this.args);
                sVar.f52192s = SystemClock.uptimeMillis();
            } catch (RuntimeException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Unable to create request.", e2);
            }
        }
        return this.originalRequest;
    }

    public C22099u<T> SsHttpCall__execute$___twin___() {
        Request request;
        String str;
        MethodCollector.m26663i(12804);
        C22096s sVar = this.serviceMethod.f52217p;
        sVar.f52188o = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        sVar.f52191r = SystemClock.uptimeMillis();
        this.originalRequest = this.serviceMethod.mo35896a(this.args);
        sVar.f52192s = SystemClock.uptimeMillis();
        AbstractC21971a aVar = sThrottleControl;
        if (aVar != null) {
            int i = 0;
            if (aVar.mo35772a()) {
                Request request2 = this.originalRequest;
                if (request2 != null && !TextUtils.isEmpty(request2.getPath()) && sThrottleControl.mo35774b(this.originalRequest.getPath())) {
                    i = sThrottleControl.mo35770a(this.originalRequest.getPath());
                }
            } else if (sThrottleControl.mo35773b() && (request = this.originalRequest) != null) {
                List<C22027b> headers = request.headers("x-tt-request-tag");
                if (headers == null || headers.size() <= 0 || TextUtils.isEmpty(headers.get(0).f52038b)) {
                    str = "";
                } else {
                    str = headers.get(0).f52038b;
                }
                i = sThrottleControl.mo35771a(this.originalRequest.getUrl(), str);
            }
            long j = (long) i;
            sVar.f52189p = j;
            Thread.sleep(j);
        }
        C22099u<T> responseWithInterceptorChain = getResponseWithInterceptorChain();
        MethodCollector.m26664o(12804);
        return responseWithInterceptorChain;
    }

    public static void setThrottleControl(AbstractC21971a aVar) {
        sThrottleControl = aVar;
    }

    public T toResponseBody(TypedInput typedInput) {
        return (T) C22097t.m41506a(this.serviceMethod, typedInput);
    }

    public boolean setThrottleNetSpeed(long j) {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null) {
            return callServerInterceptor2.setThrottleNetSpeed(j);
        }
        return false;
    }

    /* renamed from: com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_net_lancet_NetIOCheckLancet_execute */
    public static C22099u m41331xda5cbb88(SsHttpCall ssHttpCall) {
        String str;
        C22099u<T> SsHttpCall__execute$___twin___ = ssHttpCall.SsHttpCall__execute$___twin___();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            try {
                Field declaredField = C22099u.class.getDeclaredField("a");
                declaredField.setAccessible(true);
                str = ((C22028c) declaredField.get(SsHttpCall__execute$___twin___)).f52039a;
            } catch (Exception unused) {
                str = "";
            }
            C22708a.m42803a(new Throwable(), "do network IO on UI thread，url=".concat(String.valueOf(str)));
        }
        return SsHttpCall__execute$___twin___;
    }

    @Override // com.bytedance.retrofit2.AbstractC21983b
    public void enqueue(final AbstractC22030d<T> dVar) {
        final AbstractC22056j jVar;
        final C22096s sVar = this.serviceMethod.f52217p;
        sVar.f52187n = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        Objects.requireNonNull(dVar, "callback == null");
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 == null || !callServerInterceptor2.isExecuted()) {
            final Executor executor = this.serviceMethod.f52207f;
            if (dVar instanceof AbstractC22056j) {
                jVar = (AbstractC22056j) dVar;
            } else {
                jVar = null;
            }
            final C219691 r1 = new AbstractRunnableC22100v() {
                /* class com.bytedance.retrofit2.SsHttpCall.C219691 */

                static {
                    Covode.recordClassIndex(25658);
                }

                @Override // com.bytedance.retrofit2.AbstractRunnableC22100v
                /* renamed from: a */
                public final int mo35765a() {
                    return SsHttpCall.this.serviceMethod.f52208g;
                }

                @Override // com.bytedance.retrofit2.AbstractRunnableC22100v
                /* renamed from: b */
                public final boolean mo35766b() {
                    return SsHttpCall.this.serviceMethod.f52211j;
                }

                public final void run() {
                    try {
                        if (SsHttpCall.this.preBuildURLException == null) {
                            if (SsHttpCall.this.originalRequest == null) {
                                sVar.f52191r = SystemClock.uptimeMillis();
                                SsHttpCall ssHttpCall = SsHttpCall.this;
                                ssHttpCall.originalRequest = ssHttpCall.serviceMethod.mo35896a(SsHttpCall.this.args);
                                sVar.f52192s = SystemClock.uptimeMillis();
                            }
                            C22099u<T> responseWithInterceptorChain = SsHttpCall.this.getResponseWithInterceptorChain();
                            try {
                                dVar.mo6817a(SsHttpCall.this, responseWithInterceptorChain);
                                AbstractC22056j jVar = jVar;
                                if (jVar != null) {
                                    jVar.mo35850b(SsHttpCall.this, responseWithInterceptorChain);
                                }
                            } catch (Throwable unused) {
                            }
                        } else {
                            throw SsHttpCall.this.preBuildURLException;
                        }
                    } catch (Throwable unused2) {
                    }
                }

                @Override // com.bytedance.retrofit2.AbstractRunnableC22100v
                /* renamed from: c */
                public final int mo35767c() {
                    String str;
                    int i = 0;
                    if (SsHttpCall.sThrottleControl != null) {
                        if (SsHttpCall.sThrottleControl.mo35772a()) {
                            if (SsHttpCall.this.originalRequest != null && !TextUtils.isEmpty(SsHttpCall.this.originalRequest.getPath()) && SsHttpCall.sThrottleControl.mo35774b(SsHttpCall.this.originalRequest.getPath())) {
                                i = SsHttpCall.sThrottleControl.mo35770a(SsHttpCall.this.originalRequest.getPath());
                            }
                        } else if (SsHttpCall.sThrottleControl.mo35773b() && SsHttpCall.this.originalRequest != null) {
                            List<C22027b> headers = SsHttpCall.this.originalRequest.headers("x-tt-request-tag");
                            if (headers == null || headers.size() <= 0 || TextUtils.isEmpty(headers.get(0).f52038b)) {
                                str = "";
                            } else {
                                str = headers.get(0).f52038b;
                            }
                            i = SsHttpCall.sThrottleControl.mo35771a(SsHttpCall.this.originalRequest.getUrl(), str);
                        }
                    }
                    sVar.f52189p = (long) i;
                    return i;
                }
            };
            AbstractC21971a aVar = sThrottleControl;
            if (aVar == null || (!aVar.mo35772a() && !sThrottleControl.mo35773b())) {
                executor.execute(r1);
            } else {
                executor.execute(new AbstractRunnableC22100v() {
                    /* class com.bytedance.retrofit2.SsHttpCall.C219702 */

                    static {
                        Covode.recordClassIndex(25659);
                    }

                    @Override // com.bytedance.retrofit2.AbstractRunnableC22100v
                    /* renamed from: c */
                    public final int mo35767c() {
                        return 0;
                    }

                    @Override // com.bytedance.retrofit2.AbstractRunnableC22100v
                    /* renamed from: a */
                    public final int mo35765a() {
                        return SsHttpCall.this.serviceMethod.f52208g;
                    }

                    @Override // com.bytedance.retrofit2.AbstractRunnableC22100v
                    /* renamed from: b */
                    public final boolean mo35766b() {
                        return SsHttpCall.this.serviceMethod.f52211j;
                    }

                    public final void run() {
                        try {
                            if (SsHttpCall.this.originalRequest == null) {
                                C22096s sVar = SsHttpCall.this.serviceMethod.f52217p;
                                sVar.f52191r = SystemClock.uptimeMillis();
                                SsHttpCall ssHttpCall = SsHttpCall.this;
                                ssHttpCall.originalRequest = ssHttpCall.serviceMethod.mo35896a(SsHttpCall.this.args);
                                sVar.f52192s = SystemClock.uptimeMillis();
                            }
                        } catch (Throwable th) {
                            SsHttpCall.this.preBuildURLException = th;
                        }
                        executor.execute(r1);
                    }
                });
            }
        } else {
            throw new IllegalStateException("Already executed.");
        }
    }

    SsHttpCall(C22097t<T> tVar, Object[] objArr) {
        this.serviceMethod = tVar;
        this.args = objArr;
        this.callServerInterceptor = new CallServerInterceptor(tVar);
    }
}
