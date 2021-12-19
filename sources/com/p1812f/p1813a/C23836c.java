package com.p1812f.p1813a;

import android.text.TextUtils;
import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.ttnet.C22932c;
import com.bytedance.ttnet.p1703d.C22940b;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.net.AbstractC24901d;
import com.facebook.net.C24893c;
import com.facebook.net.C24906g;
import com.facebook.net.C24907h;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.p2083a.p2084a.AbstractC29335a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.f.a.c */
public final class C23836c implements AbstractC24462c {

    /* renamed from: c */
    private static ExecutorService f56373c;

    /* renamed from: a */
    public ConcurrentHashMap<String, C23842a> f56374a;

    /* renamed from: b */
    public AbstractC24901d f56375b;

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onProducerEvent(String str, String str2, String str3) {
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final boolean requiresExtraMap(String str) {
        return true;
    }

    public C23836c() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(27947);
        ThreadFactoryC238371 r2 = new ThreadFactory() {
            /* class com.p1812f.p1813a.C23836c.ThreadFactoryC238371 */

            static {
                Covode.recordClassIndex(27948);
            }

            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "fresco-trace-monitor");
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        f56373c = C40780g.m82242a(a.mo70028a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.f.a.c$a */
    public class C23842a {

        /* renamed from: a */
        String f56389a;

        /* renamed from: b */
        long f56390b;

        /* renamed from: c */
        Map<String, Long> f56391c = new HashMap();

        /* renamed from: d */
        JSONObject f56392d;

        /* renamed from: e */
        Object f56393e;

        static {
            Covode.recordClassIndex(27953);
        }

        C23842a() {
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestCancellation(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        f56373c.submit(new Runnable() {
            /* class com.p1812f.p1813a.C23836c.RunnableC238415 */

            static {
                Covode.recordClassIndex(27952);
            }

            public final void run() {
                C23836c cVar = C23836c.this;
                String str = str;
                long j = currentTimeMillis;
                C23842a remove = cVar.f56374a.remove(str);
                if (remove != null && C23835b.f56371d) {
                    AbstractC29335a.m58732b("Fresco", C1764a.m5929a(null, "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", new Object[]{Long.valueOf(j), str, Long.valueOf(C23836c.m45044a(Long.valueOf(remove.f56390b), j))}));
                }
            }
        });
    }

    private C23836c(byte b) {
        this.f56375b = new AbstractC24901d() {
            /* class com.p1812f.p1813a.C23836c.C238382 */

            static {
                Covode.recordClassIndex(27949);
            }

            @Override // com.facebook.net.AbstractC24901d
            /* renamed from: a */
            public final void mo39303a(C24906g gVar, C22940b bVar, JSONObject jSONObject) {
                m45048c(gVar, bVar, jSONObject);
            }

            @Override // com.facebook.net.AbstractC24901d
            /* renamed from: b */
            public final void mo39304b(C24906g gVar, C22940b bVar, JSONObject jSONObject) {
                m45048c(gVar, bVar, jSONObject);
            }

            /* renamed from: c */
            private void m45048c(C24906g gVar, C22940b bVar, JSONObject jSONObject) {
                long j;
                Object remove = jSONObject.remove("requestId");
                Object remove2 = jSONObject.remove("retryCount");
                Object remove3 = jSONObject.remove("queue_time");
                Object remove4 = jSONObject.remove("fetch_time");
                try {
                    if (remove instanceof String) {
                        String str = (String) remove;
                        if (!TextUtils.isEmpty(str)) {
                            int i = -1;
                            if (remove2 instanceof Integer) {
                                i = ((Integer) remove2).intValue();
                            }
                            long j2 = -1;
                            if (remove3 instanceof Long) {
                                j = ((Long) remove3).longValue();
                            } else {
                                j = -1;
                            }
                            if (remove4 instanceof Long) {
                                j2 = ((Long) remove4).longValue();
                            }
                            C23842a aVar = C23836c.this.f56374a.get(str);
                            if (aVar != null) {
                                JSONObject jSONObject2 = aVar.f56392d;
                                jSONObject2.put("is_request_network", true);
                                jSONObject2.put("http_status", jSONObject.optInt("http_status", 0));
                                jSONObject2.put("retry_count", i);
                                jSONObject2.put("queue_duration", j);
                                jSONObject2.put("download_duration", j2);
                                C23836c.m45045a(bVar, jSONObject2);
                                C23836c.m45046a(gVar, jSONObject2);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        this.f56374a = new ConcurrentHashMap<>();
        C24893c.f59084b = this.f56375b;
    }

    /* renamed from: a */
    static boolean m45047a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("Canceled") || str.contains("canceled")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static long m45044a(Long l, long j) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onProducerStart(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        C23842a aVar = this.f56374a.get(str);
        if (aVar != null) {
            aVar.f56391c.put(str + str2, Long.valueOf(currentTimeMillis));
            JSONObject jSONObject = aVar.f56392d;
            if (jSONObject != null) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                    if (optJSONObject != null) {
                        optJSONObject.put(str2, new JSONObject());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m45046a(C24906g gVar, JSONObject jSONObject) {
        String str;
        String str2;
        try {
            String str3 = "";
            if (gVar.f59125a != null) {
                C22027b a = gVar.f59125a.f52261a.mo35844a("Nw-Session-Trace");
                C22027b a2 = gVar.f59125a.f52261a.mo35844a("x-net-info.remoteaddr");
                if (a != null) {
                    str = gVar.f59125a.f52261a.mo35844a("Nw-Session-Trace").f52038b;
                } else {
                    str = str3;
                }
                if (a2 != null) {
                    str2 = gVar.f59125a.f52261a.mo35844a("x-net-info.remoteaddr").f52038b;
                } else {
                    str2 = str3;
                }
            } else if (gVar.f59126b != null) {
                str = gVar.f59126b.mo144718a("Nw-Session-Trace", null);
                str2 = gVar.f59126b.mo144718a("x-snssdk.remoteaddr", null);
            } else {
                str2 = str3;
                str = str2;
            }
            if (str == null) {
                str = str3;
            }
            jSONObject.put("nw-session-trace", str);
            if (str2 != null) {
                str3 = str2;
            }
            jSONObject.put("server_ip", str3);
        } catch (Exception e) {
            if (C23845f.f56395a) {
                Log.getStackTraceString(e);
            }
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    protected static void m45045a(C22940b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("requestStart", bVar.f35362e);
                jSONObject2.put("responseBack", bVar.f35363f);
                jSONObject2.put("completeReadResponse", bVar.f35364g);
                jSONObject2.put("requestEnd", bVar.f35365h);
                jSONObject2.put("recycleCount", bVar.f35366i);
                if (bVar.f35379v == 0) {
                    jSONObject2.put("timing_dns", bVar.f35367j);
                    jSONObject2.put("timing_connect", bVar.f35368k);
                    jSONObject2.put("timing_ssl", bVar.f35369l);
                    jSONObject2.put("timing_send", bVar.f35370m);
                    jSONObject2.put("timing_wait", bVar.f35374q);
                    jSONObject2.put("timing_receive", bVar.f35372o);
                    jSONObject2.put("timing_total", bVar.f35375r);
                    jSONObject2.put("timing_isSocketReused", bVar.f35373p);
                    jSONObject2.put("timing_totalSendBytes", bVar.f35376s);
                    jSONObject2.put("timing_totalReceivedBytes", bVar.f35377t);
                    jSONObject2.put("timing_remoteIP", bVar.f35358a);
                    jSONObject2.put("request_log", bVar.f35382y);
                }
                if (bVar.f35383z != null) {
                    jSONObject2.put("req_info", bVar.f35383z);
                }
                jSONObject2.put("download", bVar.f35347A);
                jSONObject.put("net_timing_detail", jSONObject2);
                if (C22932c.m43218a()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
            } catch (JSONException e) {
                if (C23845f.f56395a) {
                    Log.getStackTraceString(e);
                }
                e.printStackTrace();
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestSuccess(final C24636b bVar, final String str, boolean z) {
        final long currentTimeMillis = System.currentTimeMillis();
        f56373c.submit(new Runnable() {
            /* class com.p1812f.p1813a.C23836c.RunnableC238393 */

            static {
                Covode.recordClassIndex(27950);
            }

            public final void run() {
                boolean optBoolean;
                int i;
                C23836c cVar = C23836c.this;
                C24636b bVar = bVar;
                String str = str;
                long j = currentTimeMillis;
                C24644b.m47156a();
                C23842a remove = cVar.f56374a.remove(str);
                if (remove != null) {
                    JSONObject jSONObject = remove.f56392d;
                    if (!C23835b.f56369b) {
                        optBoolean = jSONObject.optBoolean("is_request_network", false);
                    } else if (bVar.mSourceUriType == 0) {
                        optBoolean = true;
                    } else {
                        optBoolean = false;
                    }
                    if (optBoolean) {
                        try {
                            if (remove.f56393e instanceof String) {
                                jSONObject.put("scene_tag", remove.f56393e);
                            }
                            jSONObject.put("duration", C23836c.m45044a(Long.valueOf(remove.f56390b), j));
                            jSONObject.put("load_status", "success");
                            jSONObject.put("timestamp", Long.valueOf(remove.f56390b));
                            jSONObject.put("log_type", "image_monitor_v2");
                            jSONObject.put("log_version", 1);
                            jSONObject.put("uri", bVar.mSourceUri.toString());
                            jSONObject.put("image_sdk_version", "1.13.9.22");
                            if (C24907h.m47742a().mo40785b()) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            jSONObject.put("retry_open", i);
                            JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                            if (optJSONObject != null) {
                                optJSONObject.put("image_status", 0);
                                if (optJSONObject.opt("image_origin") == null) {
                                    optJSONObject.put("image_origin", 7);
                                }
                                optJSONObject.put("disk_cache_type", C23843d.m45051a(bVar.mCacheChoice));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C23835b.m45042a(true, str, jSONObject);
                    }
                    if (jSONObject.optBoolean("is_request_network", false) && C23835b.f56371d) {
                        AbstractC29335a.m58732b("Fresco", C1764a.m5929a(null, "time %d: onRequestSuccess: {url: %s, requestId: %s, elapsedTime: %d ms, scene_tag: %s}", new Object[]{Long.valueOf(j), bVar.mSourceUri.toString(), str, Long.valueOf(C23836c.m45044a(Long.valueOf(remove.f56390b), j)), jSONObject.optString("scene_tag")}));
                    }
                    C24644b.m47156a();
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r7.equals("BitmapMemoryCacheGetProducer") != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r7.equals("PostprocessedBitmapMemoryCacheProducer") != false) goto L_0x006c;
     */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUltimateProducerReached(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p1812f.p1813a.C23836c.onUltimateProducerReached(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProducerFinishWithSuccess(java.lang.String r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p1812f.p1813a.C23836c.onProducerFinishWithSuccess(java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestFailure(final C24636b bVar, final String str, final Throwable th, boolean z) {
        final long currentTimeMillis = System.currentTimeMillis();
        f56373c.submit(new Runnable() {
            /* class com.p1812f.p1813a.C23836c.RunnableC238404 */

            static {
                Covode.recordClassIndex(27951);
            }

            /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[Catch:{ JSONException -> 0x0217 }] */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca A[Catch:{ JSONException -> 0x0217 }] */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc A[Catch:{ JSONException -> 0x0217 }] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8 A[Catch:{ JSONException -> 0x0217 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 627
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p1812f.p1813a.C23836c.RunnableC238404.run():void");
            }
        });
    }

    @Override // com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestStart(C24636b bVar, Object obj, String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C24644b.m47156a();
        C23842a aVar = new C23842a();
        aVar.f56389a = str;
        aVar.f56390b = currentTimeMillis;
        aVar.f56393e = obj;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            if (C23835b.f56370c) {
                try {
                    jSONObject.put("image_monitor_data", new JSONObject());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            aVar.f56392d = jSONObject;
        }
        this.f56374a.put(str, aVar);
        C24644b.m47156a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProducerFinishWithFailure(java.lang.String r14, java.lang.String r15, java.lang.Throwable r16, java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p1812f.p1813a.C23836c.onProducerFinishWithFailure(java.lang.String, java.lang.String, java.lang.Throwable, java.util.Map):void");
    }
}
