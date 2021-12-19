package com.p2082ss.android.ugc.aweme.net.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.p979a.C14584a;
import com.bytedance.frameworks.baselib.network.p979a.C14588c;
import com.bytedance.ttnet.C22932c;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p1700a.C22898a;
import com.bytedance.ttnet.p1703d.C22940b;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.net.C61402j;
import com.p2082ss.android.ugc.aweme.net.p3490c.AbstractC61311a;
import com.toutiao.proxyserver.net.C87364f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.d */
public final class C61429d extends AbstractC61311a {
    static {
        Covode.recordClassIndex(72084);
    }

    public C61429d(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static void m111223a(JSONObject jSONObject) {
        String optString = jSONObject.optString("url", "");
        if (!TextUtils.isEmpty(optString) && !optString.endsWith("jpeg")) {
            if (optString.contains("/aweme/v") || optString.contains("/tfe/api/") || optString.contains("/user/info/") || optString.contains("/passport/") || optString.contains("/ies/speed/")) {
                C34611o.m70668a("api_libra", jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.p3490c.AbstractC61311a
    /* renamed from: a */
    public final void mo98940a(C22940b bVar, JSONObject jSONObject) {
        if (bVar != null) {
            try {
                jSONObject.put("nt_band_width", C14588c.C14589a.f35268a.mo23462a());
                jSONObject.put("cdn_nt_band_width", C14584a.C14585a.f35260a.mo23462a());
                jSONObject.put("cronet_open", C22898a.m43150a(TTNetInit.getTTNetDepend().mo37259a()).mo37239g());
                TTNetInit.getTTNetDepend();
                jSONObject.put("cronet_plugin_install", true);
            } catch (Throwable unused) {
            }
            try {
                jSONObject.put("requestStart", bVar.f35362e);
                jSONObject.put("responseBack", bVar.f35363f);
                jSONObject.put("completeReadResponse", bVar.f35364g);
                jSONObject.put("appLevelRequestStart", bVar.f35360c);
                jSONObject.put("beforeAllInterceptors", bVar.f35361d);
                jSONObject.put("requestEnd", bVar.f35365h);
                jSONObject.put("recycleCount", bVar.f35366i);
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
                if (bVar.f35383z != null) {
                    jSONObject.put("req_info", bVar.f35383z);
                }
                jSONObject.put("download", bVar.f35347A);
                if (bVar instanceof C87364f) {
                    jSONObject.put("player_id", ((C87364f) bVar).f198034O);
                    jSONObject.put("video_cache_use_ttnet", ((C87364f) bVar).f198035P);
                    jSONObject.put("video_cache_retry_count", ((C87364f) bVar).f198036Q);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.p3490c.AbstractC61311a
    /* renamed from: a */
    public final void mo98939a(long j, long j2, String str, String str2, String str3, C22940b bVar, JSONObject jSONObject) {
        try {
            if (C22932c.m43218a()) {
                jSONObject.put("netClientType", "CronetClient");
            } else {
                jSONObject.put("netClientType", "TTOkhttp3Client");
            }
            jSONObject.put("networkQuality", C14588c.C14589a.f35268a.mo23462a().toString());
            jSONObject.put("downloadSpeed", (int) C14588c.C14589a.f35268a.mo23464b());
            jSONObject.put("cronet_plugin_install", C61402j.m111178a().mo28821b().f139542o.mo99140a());
            jSONObject.put("cronet_plugin_version", C61402j.m111178a().mo28821b().f139543p.mo99140a());
            if (bVar != null) {
                jSONObject.put("addExecutorToAllInterceptors", bVar.f35361d - bVar.f35360c);
                jSONObject.put("addExecutorTime", bVar.f35360c);
                jSONObject.put("allInterceptorsTime", bVar.f35362e - bVar.f35361d);
                jSONObject.put("fallback", bVar.f35380w);
                jSONObject.put("requestHeader", bVar.f35348B);
                jSONObject.put("responseHeader", bVar.f35349C);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C34611o.m70663a(j, j2, str, str3, str2, 200, jSONObject);
        try {
            int intValue = C61402j.m111178a().mo28821b().f139541n.mo99140a().intValue();
            if (intValue > 0) {
                jSONObject.put("libra_id", intValue);
                jSONObject.put("status", "200");
                jSONObject.put("duration", j);
                jSONObject.put("url", str);
                jSONObject.put("trace_code", str2);
                m111223a(jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0370, code lost:
        if (r3 >= 0) goto L_0x0386;
     */
    @Override // com.p2082ss.android.ugc.aweme.net.p3490c.AbstractC61311a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98938a(long r15, long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.bytedance.ttnet.p1703d.C22940b r22, java.lang.Throwable r23, org.json.JSONObject r24) {
        /*
        // Method dump skipped, instructions count: 1111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.net.monitor.C61429d.mo98938a(long, long, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ttnet.d.b, java.lang.Throwable, org.json.JSONObject):void");
    }
}
