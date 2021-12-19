package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.mediakit.net.AVMDLNetClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90204w;
import okhttp3.C90208y;
import okhttp3.Request;
import org.json.JSONObject;

/* renamed from: com.ss.mediakit.net.AVMDLHTTPNetwork */
public class AVMDLHTTPNetwork extends AVMDLNetClient {
    public static final C90204w JSON = C90204w.m156843b("application/json");
    private static C90208y mClient;
    private AbstractC90049e mCall;

    static {
        Covode.recordClassIndex(101226);
    }

    @Override // com.p2082ss.mediakit.net.AVMDLNetClient
    public void cancel() {
        AbstractC90049e eVar = this.mCall;
        if (eVar != null && !eVar.mo144712d()) {
            this.mCall.mo144710c();
        }
    }

    @Override // com.p2082ss.mediakit.net.AVMDLNetClient
    public void startTask(String str, Map<String, String> map, final AVMDLNetClient.CompletionListener completionListener) {
        MethodCollector.m26663i(12909);
        synchronized (AVMDLHTTPNetwork.class) {
            try {
                if (mClient == null) {
                    mClient = new C90208y().mo145086b().mo145088a(10, TimeUnit.SECONDS).mo145102c(10, TimeUnit.SECONDS).mo145098b(10, TimeUnit.SECONDS).mo145103d();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(12909);
                throw th;
            }
        }
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                a.mo144692a(str2, map.get(str2));
            }
        }
        C90022aa a2 = C90022aa.m156235a(mClient, a.mo144698a(), false);
        this.mCall = a2;
        a2.mo144708a(new AbstractC90051f() {
            /* class com.p2082ss.mediakit.net.AVMDLHTTPNetwork.C861111 */

            static {
                Covode.recordClassIndex(101227);
            }

            @Override // okhttp3.AbstractC90051f
            public void onFailure(AbstractC90049e eVar, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // okhttp3.AbstractC90051f
            public void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                JSONObject jSONObject;
                Exception e;
                AbstractC90031ad adVar = acVar.f204111g;
                try {
                    jSONObject = new JSONObject(adVar.string());
                    e = null;
                    try {
                        if (!acVar.mo144720a()) {
                            e = new Exception("http fail");
                        }
                    } catch (Throwable th) {
                        if (adVar != null) {
                            try {
                                adVar.close();
                                throw th;
                            } catch (Exception unused) {
                                throw th;
                            }
                        } else {
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    jSONObject = null;
                }
                if (adVar != null) {
                    try {
                        adVar.close();
                    } catch (Exception unused2) {
                    }
                }
                if (e == null) {
                    completionListener.onCompletion(jSONObject, null);
                } else {
                    completionListener.onCompletion(jSONObject, new Error(0, null, null, e.toString()));
                }
            }
        });
        MethodCollector.m26664o(12909);
    }

    @Override // com.p2082ss.mediakit.net.AVMDLNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, final AVMDLNetClient.CompletionListener completionListener) {
        MethodCollector.m26663i(12996);
        synchronized (AVMDLHTTPNetwork.class) {
            try {
                if (mClient == null) {
                    mClient = new C90208y().mo145086b().mo145088a(10, TimeUnit.SECONDS).mo145102c(10, TimeUnit.SECONDS).mo145098b(10, TimeUnit.SECONDS).mo145103d();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(12996);
                throw th;
            }
        }
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                a.mo144700b(str2, map.get(str2));
            }
        }
        if (i == 1) {
            a.mo144693a("POST", AbstractC90025ab.create(JSON, String.valueOf(jSONObject)));
        }
        C90022aa a2 = C90022aa.m156235a(mClient, a.mo144698a(), false);
        this.mCall = a2;
        a2.mo144708a(new AbstractC90051f() {
            /* class com.p2082ss.mediakit.net.AVMDLHTTPNetwork.C861122 */

            static {
                Covode.recordClassIndex(101228);
            }

            @Override // okhttp3.AbstractC90051f
            public void onFailure(AbstractC90049e eVar, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // okhttp3.AbstractC90051f
            public void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                JSONObject jSONObject;
                String str;
                AbstractC90031ad adVar = acVar.f204111g;
                try {
                    jSONObject = new JSONObject(adVar.string());
                    str = null;
                } catch (Exception e) {
                    str = e.toString();
                    e.printStackTrace();
                    jSONObject = null;
                } catch (Throwable th) {
                    if (adVar != null) {
                        try {
                            adVar.close();
                            throw th;
                        } catch (Exception unused) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                }
                if (!acVar.mo144720a()) {
                    str = acVar.f204108d;
                }
                if (adVar != null) {
                    try {
                        adVar.close();
                    } catch (Exception unused2) {
                    }
                }
                if (str == null) {
                    completionListener.onCompletion(jSONObject, null);
                } else {
                    completionListener.onCompletion(jSONObject, new Error(0, null, null, str.toString()));
                }
            }
        });
        MethodCollector.m26664o(12996);
    }
}
