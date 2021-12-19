package com.bytedance.frameworks.baselib.network.http.cronet.p986b;

import android.net.Uri;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.C14617b;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.p983b.C14621d;
import com.bytedance.frameworks.baselib.network.p980b.AbstractC14598c;
import com.bytedance.frameworks.baselib.network.p980b.C14596a;
import com.bytedance.frameworks.baselib.network.p980b.C14604f;
import com.bytedance.retrofit2.AbstractC22058l;
import com.bytedance.retrofit2.AbstractC22059m;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.a */
class C14648a implements WeakHandler.IHandler, AbstractC22029d, AbstractC22058l, AbstractC22059m {

    /* renamed from: A */
    private static boolean f35505A = false;

    /* renamed from: c */
    static final /* synthetic */ boolean f35506c = true;

    /* renamed from: d */
    private static final String f35507d = C14648a.class.getSimpleName();

    /* renamed from: u */
    private static HandlerThread f35508u = new HandlerThread("Concurrent-Handler");

    /* renamed from: y */
    private static Class f35509y;

    /* renamed from: a */
    public C22096s f35510a;

    /* renamed from: b */
    public C14612a f35511b = C14612a.m26716a();

    /* renamed from: e */
    private volatile long f35512e;

    /* renamed from: f */
    private boolean f35513f;

    /* renamed from: g */
    private String f35514g;

    /* renamed from: h */
    private volatile boolean f35515h;

    /* renamed from: i */
    private Request f35516i;

    /* renamed from: j */
    private String f35517j;

    /* renamed from: k */
    private long f35518k;

    /* renamed from: l */
    private String f35519l;

    /* renamed from: m */
    private String f35520m;

    /* renamed from: n */
    private List<String> f35521n = new ArrayList();

    /* renamed from: o */
    private final Object f35522o = new Object();

    /* renamed from: p */
    private volatile AtomicInteger f35523p = new AtomicInteger(0);

    /* renamed from: q */
    private List<HttpURLConnection> f35524q = new CopyOnWriteArrayList();

    /* renamed from: r */
    private volatile HttpURLConnection f35525r = null;

    /* renamed from: s */
    private List<C14650a> f35526s = new CopyOnWriteArrayList();

    /* renamed from: t */
    private CountDownLatch f35527t = new CountDownLatch(1);

    /* renamed from: v */
    private WeakHandler f35528v = new WeakHandler(f35508u.getLooper(), this);

    /* renamed from: w */
    private long f35529w;

    /* renamed from: x */
    private long f35530x;

    /* renamed from: z */
    private String f35531z;

    @Override // com.bytedance.retrofit2.AbstractC22059m
    public Object getRequestInfo() {
        return this.f35511b;
    }

    @Override // com.bytedance.retrofit2.AbstractC22058l
    public void doCollect() {
        C14659h.m26815a(this.f35525r, this.f35511b, this.f35510a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.a$a */
    public static class C14650a {

        /* renamed from: a */
        String f35534a;

        /* renamed from: b */
        IOException f35535b;

        static {
            Covode.recordClassIndex(16745);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONObject mo23618a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("domain", this.f35534a);
                jSONObject.put("exception", this.f35535b.getMessage());
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        C14650a(String str, IOException iOException) {
            this.f35534a = str;
            this.f35535b = iOException;
        }
    }

    /* renamed from: d */
    private void m26778d() {
        C14604f.m26689b().mo23477b(new C14596a("Concurrent-Call", AbstractC14598c.EnumC14599a.IMMEDIATE, 0, new RunnableC14651b(this), this.f35511b.f35347A));
        m26777b(this.f35529w);
    }

    static {
        Covode.recordClassIndex(16743);
        try {
            f35509y = Class.forName("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        f35508u.start();
    }

    /* renamed from: e */
    private void m26779e() {
        MethodCollector.m26663i(2145);
        this.f35528v.removeCallbacksAndMessages(null);
        synchronized (this.f35522o) {
            try {
                List<HttpURLConnection> list = this.f35524q;
                if (list != null) {
                    for (HttpURLConnection httpURLConnection : list) {
                        if (httpURLConnection != null) {
                            this.f35526s.add(new C14650a(httpURLConnection.getURL().getHost(), new IOException("Connection disconnected because of winner connection has decided.")));
                            httpURLConnection.disconnect();
                            this.f35524q.remove(httpURLConnection);
                        }
                    }
                    this.f35524q = null;
                    MethodCollector.m26664o(2145);
                }
            } finally {
                MethodCollector.m26664o(2145);
            }
        }
    }

    /* renamed from: f */
    private int m26780f() {
        if (this.f35525r != null) {
            this.f35525r.disconnect();
        }
        String url = this.f35516i.getUrl();
        try {
            this.f35525r = C14659h.m26808a(url, this.f35516i, this.f35511b, this.f35512e);
            this.f35511b.f35355I = true;
            this.f35525r.addRequestProperty("x-tt-bdturing-retry", "1");
            return C14659h.m26801a(this.f35516i, this.f35525r);
        } catch (Exception e) {
            C14659h.m26812a(url, this.f35518k, this.f35511b, this.f35514g, e, this.f35525r, this.f35510a);
            this.f35515h = true;
            if (e instanceof IOException) {
                throw e;
            }
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22029d
    /* renamed from: b */
    public final void mo11600b() {
        MethodCollector.m26663i(2385);
        this.f35527t.countDown();
        m26779e();
        synchronized (this.f35522o) {
            try {
                if (this.f35525r != null) {
                    this.f35525r.disconnect();
                    if (this.f35516i.isResponseStreaming() && !this.f35515h) {
                        doCollect();
                        this.f35511b.f35357K = C14659h.m26821b(this.f35531z);
                        this.f35511b.f35365h = System.currentTimeMillis();
                        if (this.f35511b.f35359b == null || this.f35511b.f35359b.f35413p) {
                            long j = this.f35511b.f35365h;
                            long j2 = this.f35518k;
                            C14731e.m26985a(j - j2, j2, this.f35516i.getUrl(), this.f35514g, this.f35511b);
                        }
                        C14663j.m26834a().mo23631a(this.f35516i.getUrl(), this.f35511b.f35376s, this.f35511b.f35377t, this.f35511b.f35357K, this.f35511b.f35382y);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(2385);
                throw th;
            }
        }
        this.f35515h = true;
        MethodCollector.m26664o(2385);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0198, code lost:
        r20.f35527t.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2455);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ae, code lost:
        if ((android.os.SystemClock.uptimeMillis() - r10) < (r20.f35529w * 1000)) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b0, code lost:
        r1 = android.os.Message.obtain();
        r1.what = 1;
        r1.obj = r20;
        r20.f35528v.sendMessage(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01be, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2455);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c4, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2455);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2 = com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.m26801a(r20.f35516i, r5);
        r8 = r5.getHeaderField("tt-api-source-5xx");
        r4 = r20.f35520m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r2 < 200) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r2 >= 300) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r8 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r2 < 300) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r2 >= 600) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14655e.m26792a().f35559b <= 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14655e.m26792a().mo23626a(r2, r4) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (r8.equals("1") == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        r1 = r20.f35522o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        r4 = r5.getResponseMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r15 = r20.f35516i.getMaxLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r16 = r5.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        r16 = r5.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d3, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        r1 = new java.lang.StringBuilder("reason = ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        if (r4 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dd, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        r4 = r1.append(r4).append("  exception = ").append(r3.getMessage()).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        if (r20.f35525r != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        r20.f35525r = r5;
        r20.f35517j = r9;
        r20.f35527t.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010d, code lost:
        r5.disconnect();
        r0 = r20.f35524q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        if (r0 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0114, code lost:
        r0.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2455);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0121, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0132, code lost:
        if (r5 != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0139, code lost:
        if (r20.f35524q != null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013b, code lost:
        r20.f35526s.add(new com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14648a.C14650a(r5.getURL().getHost(), m26776a(r4, r9, r5)));
        r20.f35524q.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0162, code lost:
        if (r20.f35526s.size() >= r20.f35521n.size()) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0164, code lost:
        r20.f35527t.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2455);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r0 = com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14648a.f35509y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0196, code lost:
        if (com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14655e.m26792a().mo23626a(((java.lang.Integer) com.bytedance.common.utility.reflect.Reflect.m24529on(r4).call("getCronetInternalErrorCode").get()).intValue(), r20.f35520m) != false) goto L_0x0198;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo23615c() {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14648a.mo23615c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x014e A[Catch:{ Exception -> 0x01cb, all -> 0x01c9, all -> 0x01d8 }] */
    @Override // com.bytedance.retrofit2.client.AbstractC22029d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.C22028c mo11598a() {
        /*
        // Method dump skipped, instructions count: 537
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14648a.mo11598a():com.bytedance.retrofit2.client.c");
    }

    /* renamed from: b */
    private void m26777b(long j) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = this;
        this.f35528v.sendMessageDelayed(obtain, j * 1000);
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22029d
    /* renamed from: a */
    public final boolean mo11599a(long j) {
        this.f35512e = j;
        if (this.f35525r != null) {
            try {
                Reflect.m24529on(this.f35525r).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null && (message.obj instanceof C14648a)) {
            try {
                int i = message.what;
                if (i == 0) {
                    ((C14648a) message.obj).m26778d();
                } else if (i == 1) {
                    C14648a aVar = (C14648a) message.obj;
                    if (aVar.f35528v.obtainMessage(0) != null) {
                        aVar.f35528v.removeMessages(0);
                        aVar.m26778d();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private IOException m26776a(Exception exc, String str, HttpURLConnection httpURLConnection) {
        String str2 = str;
        if ((exc instanceof IOException) && exc.getMessage() != null && exc.getMessage().startsWith("request canceled")) {
            return (IOException) exc;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f35517j;
        }
        C14659h.m26812a(str2, this.f35518k, this.f35511b, this.f35514g, exc, httpURLConnection, this.f35510a);
        try {
            C14659h.m26816a(this.f35513f, exc.getMessage());
            return new C14652c(exc, this.f35511b, this.f35514g);
        } catch (C14621d e) {
            return e;
        }
    }

    public C14648a(Request request, List<String> list, String str) {
        this.f35516i = request;
        this.f35510a = request.getMetrics();
        String url = request.getUrl();
        this.f35517j = url;
        Uri parse = Uri.parse(url);
        String scheme = parse.getScheme();
        String str2 = scheme + "://" + parse.getHost();
        String query = parse.getQuery();
        Iterator<String> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            String replaceFirst = this.f35517j.replaceFirst(str2, scheme + "://" + it.next());
            if (!TextUtils.isEmpty(query)) {
                replaceFirst = !query.contains("concurrent=") ? replaceFirst + "&concurrent=" + i : replaceFirst;
                if (i > 0 && !query.contains("is_retry=")) {
                    replaceFirst = replaceFirst + "&is_retry=1";
                }
            }
            i++;
            this.f35521n.add(replaceFirst);
        }
        if (f35506c || this.f35521n.size() >= 2) {
            this.f35519l = UUID.randomUUID().toString();
            this.f35520m = str;
            this.f35529w = (long) C14655e.m26792a().f35560c;
            this.f35530x = 30000;
            if (request.getExtraInfo() instanceof C14617b) {
                C14617b bVar = (C14617b) request.getExtraInfo();
                if (bVar.f35406i > 0) {
                    this.f35530x = bVar.f35406i;
                } else if (bVar.f35400c > 0 && bVar.f35401d > 0) {
                    this.f35530x = bVar.f35400c + bVar.f35401d;
                }
            }
            this.f35530x += 1000;
            C22096s sVar = this.f35510a;
            if (sVar != null) {
                sVar.f52177d = this.f35519l;
                this.f35510a.f52178e = true;
                this.f35511b.f35360c = this.f35510a.f52180g;
                this.f35511b.f35361d = this.f35510a.f52181h;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f35518k = currentTimeMillis;
            this.f35511b.f35362e = currentTimeMillis;
            this.f35511b.f35379v = 0;
            if (this.f35516i.isResponseStreaming()) {
                this.f35511b.f35347A = true;
            } else {
                this.f35511b.f35347A = false;
            }
            if (request.getExtraInfo() instanceof C14617b) {
                this.f35511b.f35359b = (T) ((C14617b) request.getExtraInfo());
                this.f35513f = this.f35511b.f35359b.f35408k;
                return;
            }
            return;
        }
        throw new AssertionError();
    }
}
