package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.frameworks.baselib.network.http.p983b.C14620c;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.token.C30629e;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.feed.api.C48331e;
import com.p2082ss.android.ugc.aweme.lancet.p3385b.C58010b;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34931a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import com.p2082ss.android.ugc.aweme.services.ApiMonitorService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

public class CallServerInterceptor<T> implements AbstractC22021a, AbstractC22058l, AbstractC22059m {
    private volatile boolean mCanceled;
    private Throwable mCreationFailure;
    private volatile boolean mExecuted;
    public Request mOriginalRequest;
    private volatile AbstractC22029d mRawCall;
    private final C22097t<T> mServiceMethod;
    private volatile long mThrottleNetSpeed;

    static {
        Covode.recordClassIndex(25653);
    }

    /* renamed from: com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m41320xdcfd2566(String str, String str2) {
        return 0;
    }

    private AbstractC22029d createRawCall(AbstractC22056j jVar, Request request) {
        return m41321x26bb5e54(this, jVar, request);
    }

    private C22028c executeCall(AbstractC22029d dVar, C22096s sVar) {
        return m41322x7402963d(this, dVar, sVar);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        return m41318x193c7c87(this, aVar);
    }

    /* access modifiers changed from: package-private */
    public C22099u parseResponse(C22028c cVar, C22096s sVar) {
        return m41323x2324185e(this, cVar, sVar);
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public Request request() {
        return this.mOriginalRequest;
    }

    public void cancel() {
        this.mCanceled = true;
        if (this.mRawCall != null) {
            this.mRawCall.mo11600b();
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22058l
    public void doCollect() {
        if (this.mRawCall instanceof AbstractC22058l) {
            ((AbstractC22058l) this.mRawCall).doCollect();
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22059m
    public Object getRequestInfo() {
        if (!(this.mRawCall instanceof AbstractC22059m)) {
            return null;
        }
        ((AbstractC22059m) this.mRawCall).getRequestInfo();
        return null;
    }

    public synchronized boolean isExecuted() {
        boolean z;
        MethodCollector.m26663i(12548);
        z = this.mExecuted;
        MethodCollector.m26664o(12548);
        return z;
    }

    public synchronized void resetExecuted() {
        MethodCollector.m26663i(12549);
        this.mExecuted = false;
        MethodCollector.m26664o(12549);
    }

    public CallServerInterceptor(C22097t<T> tVar) {
        this.mServiceMethod = tVar;
    }

    public boolean setThrottleNetSpeed(long j) {
        this.mThrottleNetSpeed = j;
        if (this.mRawCall != null) {
            return this.mRawCall.mo11599a(j);
        }
        return false;
    }

    public C22099u CallServerInterceptor__intercept$___twin___(AbstractC22021a.AbstractC22022a aVar) {
        C22028c cVar;
        C22028c a;
        MethodCollector.m26663i(12430);
        C22096s c = aVar.mo35812c();
        if (c != null) {
            c.f52182i = System.currentTimeMillis();
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        this.mOriginalRequest = aVar.mo35809a();
        synchronized (this) {
            try {
                if (!this.mExecuted) {
                    this.mExecuted = true;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already executed.");
                    MethodCollector.m26664o(12430);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.m26664o(12430);
            }
        }
        Throwable th = this.mCreationFailure;
        if (th == null) {
            this.mOriginalRequest.setMetrics(c);
            if (this.mServiceMethod.f52216o != null) {
                if (c != null) {
                    c.f52197x.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
                }
                cVar = this.mServiceMethod.f52216o.mo35778a(this.mOriginalRequest);
            } else {
                cVar = null;
            }
            if (cVar == null) {
                try {
                    this.mRawCall = createRawCall(null, this.mOriginalRequest);
                    if (this.mThrottleNetSpeed > 0) {
                        this.mRawCall.mo11599a(this.mThrottleNetSpeed);
                    }
                    if (this.mCanceled) {
                        this.mRawCall.mo11600b();
                    }
                    if (c != null) {
                        c.f52197x.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
                    }
                    cVar = executeCall(this.mRawCall, c);
                    if (!(this.mServiceMethod.f52216o == null || (a = this.mServiceMethod.f52216o.mo35779a(this.mOriginalRequest, cVar)) == null)) {
                        cVar = a;
                    }
                } catch (IOException | RuntimeException e) {
                    this.mCreationFailure = e;
                    MethodCollector.m26664o(12430);
                    throw e;
                } catch (Throwable th2) {
                    this.mCreationFailure = th2;
                    if (th2 instanceof Exception) {
                        MethodCollector.m26664o(12430);
                        throw th2;
                    }
                    Exception exc = new Exception(th2);
                    MethodCollector.m26664o(12430);
                    throw exc;
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            C22099u parseResponse = parseResponse(cVar, c);
            if (c != null) {
                c.f52198y.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
            return parseResponse;
        } else if (th instanceof IOException) {
            MethodCollector.m26664o(12430);
            throw th;
        } else {
            Exception exc2 = new Exception(this.mCreationFailure);
            MethodCollector.m26664o(12430);
            throw exc2;
        }
    }

    public AbstractC22029d CallServerInterceptor__createRawCall$___twin___(AbstractC22056j jVar, Request request) {
        return this.mServiceMethod.f52204c.get().mo11597a(request);
    }

    public C22028c CallServerInterceptor__executeCall$___twin___(AbstractC22029d dVar, C22096s sVar) {
        if (sVar != null) {
            sVar.f52193t = SystemClock.uptimeMillis();
        }
        return dVar.mo11598a();
    }

    /* renamed from: com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_intercept */
    public static C22099u m41318x193c7c87(CallServerInterceptor callServerInterceptor, AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return callServerInterceptor.CallServerInterceptor__intercept$___twin___(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(callServerInterceptor.getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u CallServerInterceptor__intercept$___twin___ = callServerInterceptor.CallServerInterceptor__intercept$___twin___(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = callServerInterceptor.getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return CallServerInterceptor__intercept$___twin___;
    }

    public C22099u<T> CallServerInterceptor__parseResponse$___twin___(C22028c cVar, C22096s sVar) {
        if (cVar != null) {
            TypedInput typedInput = cVar.f52043e;
            int i = cVar.f52040b;
            if (i < 200 || i >= 300) {
                return C22099u.m41527a(typedInput, cVar);
            }
            if (i == 204 || i == 205) {
                return C22099u.m41528a((Object) null, cVar);
            }
            if (sVar != null) {
                try {
                    sVar.f52195v = SystemClock.uptimeMillis();
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            Object a = C22097t.m41506a(this.mServiceMethod, typedInput);
            if (sVar != null) {
                sVar.f52196w = SystemClock.uptimeMillis();
            }
            return C22099u.m41528a(a, cVar);
        }
        throw new IOException("SsResponse is null");
    }

    /* renamed from: com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse */
    public static C22099u m41319xe1842159(CallServerInterceptor callServerInterceptor, C22028c cVar, C22096s sVar) {
        if ((cVar.f52044f instanceof C14612a) && ((C14612a) cVar.f52044f).f35365h > 0) {
            Request request = callServerInterceptor.mOriginalRequest;
            if (request.getMetrics() instanceof C34932b) {
                C34932b bVar = (C34932b) request.getMetrics();
                long uptimeMillis = SystemClock.uptimeMillis();
                C22099u<T> CallServerInterceptor__parseResponse$___twin___ = callServerInterceptor.CallServerInterceptor__parseResponse$___twin___(cVar, sVar);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                bVar.f82412T = uptimeMillis2 - uptimeMillis;
                bVar.f82418Z = uptimeMillis2;
                return CallServerInterceptor__parseResponse$___twin___;
            }
        }
        return callServerInterceptor.CallServerInterceptor__parseResponse$___twin___(cVar, sVar);
    }

    /* renamed from: com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_createRawCall */
    public static AbstractC22029d m41321x26bb5e54(CallServerInterceptor callServerInterceptor, AbstractC22056j jVar, Request request) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC22029d CallServerInterceptor__createRawCall$___twin___ = callServerInterceptor.CallServerInterceptor__createRawCall$___twin___(jVar, request);
        if (C58945a.C58947b.f134185a.f134176c && C58010b.m104838a(request) != -1) {
            C58945a.C58947b.f134185a.mo96423a("feed_create_sslcall", System.currentTimeMillis() - currentTimeMillis);
        }
        m41320xdcfd2566("NetworkUtilsLancet", "create ssl requestVersion:" + C58010b.m104838a(request) + ";duration:" + (System.currentTimeMillis() - currentTimeMillis));
        return CallServerInterceptor__createRawCall$___twin___;
    }

    /* renamed from: com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_parseResponse */
    public static C22099u m41323x2324185e(CallServerInterceptor callServerInterceptor, C22028c cVar, C22096s sVar) {
        int i;
        List<C22027b> headers;
        Request request = callServerInterceptor.mOriginalRequest;
        boolean z = C58945a.C58947b.f134185a.f134176c;
        if (z) {
            i = C58010b.m104838a(request);
            if (i != -1) {
                C58945a.C58947b.f134185a.mo96429b("feed_network_duration", true);
                if (!C58945a.C58947b.f134185a.mo96426a("feed_parse_duration")) {
                    C58945a.C58947b.f134185a.mo96425a("feed_parse_duration", true);
                }
            }
        } else {
            i = -1;
        }
        try {
            C22099u<?> com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse = m41319xe1842159(callServerInterceptor, cVar, sVar);
            if (z && i != -1) {
                boolean a = C58945a.C58947b.f134185a.mo96426a("feed_parse_duration");
                boolean b = C58945a.C58947b.f134185a.mo96430b("feed_parse_duration");
                if (a && !b) {
                    C58945a.C58947b.f134185a.mo96429b("feed_parse_duration", true);
                }
                if (!C58945a.C58947b.f134185a.mo96426a("feed_parse_to_ui")) {
                    C58945a.C58947b.f134185a.mo96425a("feed_parse_to_ui", true);
                }
                C58945a.C58947b.f134185a.mo96425a("feed_net_api_to_feed_api", false);
                C58945a.C58947b.f134185a.mo96423a("feed_api_type", (long) i);
            }
            if (request != null) {
                ApiMonitorService.Companion.getInstance().addALog(request.getUrl(), com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse);
            }
            return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse;
        } catch (Throwable th) {
            if ((th instanceof C34485a) && cVar != null && th.getErrorCode() == 8) {
                String str = cVar.f52039a;
                if (request == null) {
                    headers = null;
                } else {
                    headers = request.getHeaders();
                }
                C30629e.m62928a(str, headers, C31575b.m65865g().isLogin());
            }
            throw th;
        }
    }

    /* renamed from: com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_executeCall */
    public static C22028c m41322x7402963d(CallServerInterceptor callServerInterceptor, AbstractC22029d dVar, C22096s sVar) {
        String str;
        Request request = callServerInterceptor.mOriginalRequest;
        if (C58945a.C58947b.f134185a.f134176c && C48331e.m91790a(request)) {
            C58945a.C58947b.f134185a.mo96429b("feed_request_to_network", true);
            C58945a.C58947b.f134185a.mo96429b("feed_boot_to_network", false);
            if (!C58945a.C58947b.f134185a.mo96426a("feed_network_duration")) {
                C58945a.C58947b.f134185a.mo96425a("feed_network_duration", true);
            }
            if (C58945a.C58947b.f134185a.mo96426a("feed_init_ttnet_end_to_network")) {
                C58945a.C58947b.f134185a.mo96429b("feed_init_ttnet_end_to_network", false);
            }
        }
        try {
            return callServerInterceptor.CallServerInterceptor__executeCall$___twin___(dVar, sVar);
        } catch (Exception e) {
            if (request != null) {
                C89219l.m154721d(request, "");
                C89219l.m154721d(e, "");
                ArrayList<Integer> a = C34931a.m71317a();
                int hashCode = request.getPath().hashCode();
                if (a != null && a.contains(Integer.valueOf(hashCode))) {
                    try {
                        if (e instanceof C14620c) {
                            str = "status_code=" + ((C14620c) e).getStatusCode() + ",message=" + e.getMessage();
                        } else if (e instanceof C14652c) {
                            str = "status_code=" + ((C14652c) e).getStatusCode() + ",message=" + e.getMessage() + ",traceCode=" + ((C14652c) e).getTraceCode() + ",requestLog=" + ((C14652c) e).getRequestLog() + ",requestInfo=" + C34931a.f82403a.mo46674b(((C14652c) e).getRequestInfo());
                        } else {
                            str = e.getMessage();
                        }
                        if (str == null) {
                            str = "";
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("path", request.getPath());
                        jSONObject.put("response", str);
                        jSONObject.put("request", C34931a.f82403a.mo46674b(request));
                        C34611o.m70671b(C34931a.f82404b, "", jSONObject);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            throw e;
        }
    }
}
