package com.p2082ss.android.ugc.aweme.p2359ay;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.p979a.C14584a;
import com.bytedance.frameworks.baselib.network.p979a.C14588c;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.C13465a;
import com.bytedance.ttnet.C22932c;
import com.bytedance.ttnet.p1700a.C22898a;
import com.bytedance.ttnet.p1703d.C22940b;
import com.bytedance.ttnet.p1703d.C22944d;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.ay.g */
public final class C34372g implements AbstractC34379k {
    static {
        Covode.recordClassIndex(41316);
    }

    /* renamed from: a */
    private static void m70347a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("nt_band_width", C14588c.C14589a.f35268a.mo23462a());
                jSONObject.put("cdn_nt_band_width", C14584a.C14585a.f35260a.mo23462a());
                jSONObject.put("cronet_open", C22898a.m43150a(C17867d.m33078a()).mo37239g());
                jSONObject.put("cronet_plugin_install", false);
                jSONObject.put("cronet_plugin_version", -1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m70346a(C22940b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            m70347a(jSONObject);
            try {
                jSONObject.put("requestStart", bVar.f35362e);
                jSONObject.put("responseBack", bVar.f35363f);
                jSONObject.put("completeReadResponse", bVar.f35364g);
                jSONObject.put("appLevelRequestStart", bVar.f35360c);
                jSONObject.put("beforeAllInterceptors", bVar.f35361d);
                jSONObject.put("requestEnd", bVar.f35365h);
                jSONObject.put("recycleCount", bVar.f35366i);
                if (C22932c.m43218a()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
                if (bVar.f35379v == 0) {
                    jSONObject.put("timing_dns", bVar.f35367j);
                    jSONObject.put("timing_connect", bVar.f35368k);
                    jSONObject.put("timing_ssl", bVar.f35369l);
                    jSONObject.put("timing_send", bVar.f35370m);
                    jSONObject.put("timing_waiting", bVar.f35374q);
                    jSONObject.put("timing_receive", bVar.f35372o);
                    jSONObject.put("timing_total", bVar.f35375r);
                    jSONObject.put("timing_isSocketReused", bVar.f35373p);
                    jSONObject.put("timing_totalSendBytes", bVar.f35376s);
                    jSONObject.put("timing_totalReceivedBytes", bVar.f35377t);
                    jSONObject.put("timing_remoteIP", bVar.f35358a);
                    jSONObject.put("request_log", bVar.f35382y);
                }
                if (bVar.f35383z != null) {
                    jSONObject.put("req_info", bVar.f35383z);
                }
                jSONObject.put("download", bVar.f35347A);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2359ay.AbstractC34379k
    /* renamed from: a */
    public final void mo60808a(final long j, final long j2, final String str, final C22940b bVar, final Throwable th) {
        C1731i.m5640b(new Callable<Object>() {
            /* class com.p2082ss.android.ugc.aweme.p2359ay.C34372g.CallableC343731 */

            /* renamed from: f */
            final /* synthetic */ JSONObject f81263f = null;

            static {
                Covode.recordClassIndex(41317);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C22940b bVar;
                C34611o.m70671b("aweme_image_api", "", C34372g.m70345a(false, j, j2, str, bVar, th));
                try {
                    String[] strArr = new String[1];
                    C16105a.m29903a(th, strArr);
                    if (C13627m.m24498a(strArr[0]) && (bVar = bVar) != null) {
                        strArr[0] = bVar.f35358a;
                    }
                    JSONObject jSONObject = this.f81263f;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    C34372g.m70346a(bVar, jSONObject);
                    C13465a.m24206a();
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2359ay.AbstractC34379k
    /* renamed from: a */
    public final void mo60809a(long j, long j2, String str, C22940b bVar, JSONObject jSONObject) {
        C34611o.m70671b("aweme_image_api", "", m70345a(true, j, j2, str, bVar, null));
        try {
            String[] strArr = new String[1];
            if (C13627m.m24498a(strArr[0]) && bVar != null) {
                strArr[0] = bVar.f35358a;
            }
            m70346a(bVar, jSONObject);
            C13465a.m24206a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static JSONObject m70345a(boolean z, long j, long j2, String str, C22940b bVar, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                if (str.contains("&config_retry=b")) {
                    jSONObject.put("log_config_retry", 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(strArr[0]) && bVar != null) {
            strArr[0] = bVar.f35358a;
            if (bVar.f35359b != null) {
                if (((C22944d) bVar.f35359b).f54237s > 0) {
                    jSONObject.put("index", ((C22944d) bVar.f35359b).f54237s);
                }
                if (((C22944d) bVar.f35359b).f54236r > 0) {
                    jSONObject.put("httpIndex", ((C22944d) bVar.f35359b).f54236r);
                }
            }
        }
        if (bVar != null) {
            jSONObject.put("requestStart", bVar.f35362e);
            jSONObject.put("responseBack", bVar.f35363f);
            jSONObject.put("completeReadResponse", bVar.f35364g);
            jSONObject.put("requestEnd", bVar.f35365h);
            jSONObject.put("recycleCount", bVar.f35366i);
            if (bVar.f35379v == 0) {
                jSONObject.put("timing_dns", bVar.f35367j);
                jSONObject.put("timing_connect", bVar.f35368k);
                jSONObject.put("timing_ssl", bVar.f35369l);
                jSONObject.put("timing_send", bVar.f35370m);
                jSONObject.put("timing_waiting", bVar.f35374q);
                jSONObject.put("timing_receive", bVar.f35372o);
                jSONObject.put("timing_total", bVar.f35375r);
                jSONObject.put("timing_isSocketReused", bVar.f35373p);
                jSONObject.put("timing_totalSendBytes", bVar.f35376s);
                jSONObject.put("timing_totalReceivedBytes", bVar.f35377t);
                jSONObject.put("timing_remoteIP", bVar.f35358a);
                jSONObject.put("request_log", bVar.f35382y);
            }
            jSONObject.put("download", bVar.f35347A);
        }
        if (C22932c.m43218a()) {
            jSONObject.put("netClientType", "CronetClient");
        } else {
            jSONObject.put("netClientType", "TTOkhttp3Client");
        }
        jSONObject.put("networkQuality", C14588c.C14589a.f35268a.mo23462a().toString());
        jSONObject.put("downloadSpeed", (int) C14588c.C14589a.f35268a.mo23464b());
        if (!z && th != null) {
            jSONObject.put("errorDesc", Log.getStackTraceString(th));
        }
        jSONObject.put("duration", j);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("uri", Uri.parse(str));
        }
        if (j2 > 0) {
            jSONObject.put("timestamp", j2);
        }
        int i = 200;
        if (!z) {
            i = C16105a.m29903a(th, strArr);
        }
        jSONObject.put("status", i);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put("ip", strArr[0]);
        }
        Context applicationContext = C17867d.m33078a().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        if (C58029j.f132255g == NetworkUtils.EnumC29835h.NONE || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132255g = NetworkUtils.getNetworkType(applicationContext);
        }
        jSONObject.put("network_type", C58029j.f132255g.getValue());
        return jSONObject;
    }
}
