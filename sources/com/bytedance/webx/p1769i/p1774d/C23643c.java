package com.bytedance.webx.p1769i.p1774d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.p1769i.C23629a;
import com.bytedance.webx.p1769i.p1770a.AbstractC23630a;
import com.bytedance.webx.p1769i.p1772b.C23638a;
import com.bytedance.webx.p1769i.p1775e.C23652b;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.webx.i.d.c */
public class C23643c {

    /* renamed from: a */
    public static AbstractC23630a f55944a;

    /* renamed from: e */
    public static long f55945e = 3;

    /* renamed from: f */
    public static long f55946f = 1800000;

    /* renamed from: g */
    public static long f55947g = 1800000;

    /* renamed from: h */
    private static volatile C23643c f55948h;

    /* renamed from: i */
    private static ExecutorService f55949i;

    /* renamed from: b */
    public int f55950b;

    /* renamed from: c */
    public long f55951c;

    /* renamed from: d */
    public long f55952d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.webx.i.d.c$c */
    public static class C23646c implements AbstractC23630a {
        static {
            Covode.recordClassIndex(27745);
        }

        private C23646c() {
        }

        /* synthetic */ C23646c(byte b) {
            this();
        }

        /* renamed from: a */
        private static byte[] m44716a(JSONObject jSONObject) {
            String optString = jSONObject.optString("target");
            jSONObject.put("target", "temp_sec_url_tag");
            return jSONObject.toString().replace("temp_sec_url_tag", optString).getBytes("utf-8");
        }

        /* renamed from: a */
        private static String m44713a(InputStream inputStream) {
            MethodCollector.m26663i(7853);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    String sb2 = sb.toString();
                    MethodCollector.m26664o(7853);
                    return sb2;
                }
            }
        }

        /* renamed from: a */
        private static URLConnection m44714a(URL url) {
            URLConnection aVar;
            URLConnection aVar2;
            C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
            if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
                R r = m.f139469b;
                if (r instanceof HttpsURLConnection) {
                    aVar2 = new C61417b(r);
                } else if (!(r instanceof HttpURLConnection)) {
                    return r;
                } else {
                    aVar2 = new C61416a(r);
                }
                return aVar2;
            } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
                URLConnection openConnection = url.openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    aVar = new C61417b((HttpsURLConnection) openConnection);
                } else if (!(openConnection instanceof HttpURLConnection)) {
                    return openConnection;
                } else {
                    aVar = new C61416a((HttpURLConnection) openConnection);
                }
                return aVar;
            } else {
                throw m.f139472e;
            }
        }

        /* renamed from: a */
        private static void m44715a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }

        /* renamed from: b */
        private static HttpURLConnection m44717b(String str, JSONObject jSONObject) {
            MethodCollector.m26663i(7851);
            HttpURLConnection httpURLConnection = (HttpURLConnection) m44714a(new URL(str));
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setRequestProperty("Charset", "utf-8");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(m44716a(jSONObject));
            outputStream.flush();
            outputStream.close();
            MethodCollector.m26664o(7851);
            return httpURLConnection;
        }

        @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23630a
        /* renamed from: a */
        public final String mo39046a(String str, JSONObject jSONObject) {
            HttpURLConnection httpURLConnection;
            Throwable th;
            Exception e;
            InputStream errorStream;
            try {
                httpURLConnection = m44717b(str, jSONObject);
                try {
                    if (httpURLConnection.getResponseCode() == 200) {
                        errorStream = httpURLConnection.getInputStream();
                    } else {
                        errorStream = httpURLConnection.getErrorStream();
                    }
                    String a = m44713a(errorStream);
                    m44715a(errorStream, httpURLConnection);
                    return a;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        String message = e.getMessage();
                        m44715a((InputStream) null, httpURLConnection);
                        return message;
                    } catch (Throwable th2) {
                        th = th2;
                        m44715a((InputStream) null, httpURLConnection);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnection = null;
                String message2 = e.getMessage();
                m44715a((InputStream) null, httpURLConnection);
                return message2;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                m44715a((InputStream) null, httpURLConnection);
                throw th;
            }
        }

        @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23630a
        /* renamed from: a */
        public final void mo39047a(String str, JSONObject jSONObject, AbstractC23630a.AbstractC23631a aVar) {
            HttpURLConnection httpURLConnection;
            Throwable th;
            Exception e;
            InputStream inputStream;
            try {
                httpURLConnection = m44717b(str, jSONObject);
                try {
                    if (httpURLConnection.getResponseCode() == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        aVar.mo39048a(m44713a(inputStream));
                    } else {
                        inputStream = httpURLConnection.getErrorStream();
                        aVar.mo39049b(m44713a(inputStream));
                    }
                    m44715a(inputStream, httpURLConnection);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        aVar.mo39049b(e.getMessage());
                        m44715a((InputStream) null, httpURLConnection);
                    } catch (Throwable th2) {
                        th = th2;
                        m44715a((InputStream) null, httpURLConnection);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnection = null;
                aVar.mo39049b(e.getMessage());
                m44715a((InputStream) null, httpURLConnection);
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                m44715a((InputStream) null, httpURLConnection);
                throw th;
            }
        }
    }

    private C23643c() {
    }

    static {
        Covode.recordClassIndex(27742);
    }

    /* renamed from: com.bytedance.webx.i.d.c$d */
    class RunnableC23647d extends AbstractC23644a implements Runnable {
        static {
            Covode.recordClassIndex(27746);
        }

        public final void run() {
            try {
                URL a = m44708a();
                if (C23643c.f55944a == null) {
                    C23643c.f55944a = new C23646c((byte) 0);
                }
                C23643c.f55944a.mo39047a(a.toString(), mo39065b(), new AbstractC23630a.AbstractC23631a() {
                    /* class com.bytedance.webx.p1769i.p1774d.C23643c.RunnableC23647d.C236481 */

                    static {
                        Covode.recordClassIndex(27747);
                    }

                    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23630a.AbstractC23631a
                    /* renamed from: b */
                    public final void mo39049b(String str) {
                        RunnableC23647d.this.mo39066b(str);
                    }

                    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23630a.AbstractC23631a
                    /* renamed from: a */
                    public final void mo39048a(String str) {
                        try {
                            RunnableC23647d.this.mo39064a(RunnableC23647d.m44707a(str));
                        } catch (JSONException e) {
                            RunnableC23647d.this.mo39066b("source:  " + str + "  case : " + e.getMessage());
                        }
                    }
                });
            } catch (Exception e) {
                mo39066b(e.getMessage());
            }
        }

        protected RunnableC23647d(C23649d dVar) {
            super(dVar);
        }
    }

    /* renamed from: a */
    public static C23643c m44704a() {
        MethodCollector.m26663i(5947);
        if (f55948h == null) {
            synchronized (C23643c.class) {
                try {
                    if (f55948h == null) {
                        f55948h = new C23643c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5947);
                    throw th;
                }
            }
        }
        C23643c cVar = f55948h;
        MethodCollector.m26664o(5947);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.webx.i.d.c$a */
    public abstract class AbstractC23644a {

        /* renamed from: a */
        protected final C23649d f55953a;

        static {
            Covode.recordClassIndex(27743);
        }

        /* renamed from: a */
        protected static URL m44708a() {
            if (C23629a.f55913b.f55937c.endsWith("/")) {
                return new URL(C23629a.f55913b.f55937c + "api/verify/v1");
            }
            return new URL(C23629a.f55913b.f55937c + "/api/verify/v1");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final JSONObject mo39065b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aid", this.f55953a.f55958a);
            jSONObject.put("scene", this.f55953a.f55959b);
            jSONObject.put("ts", this.f55953a.f55961d);
            jSONObject.put("target", this.f55953a.f55960c);
            jSONObject.put("sync", this.f55953a.f55964g);
            if (this.f55953a.f55965h < 3) {
                jSONObject.put("flag", true);
            } else {
                jSONObject.put("flag", false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f55953a.f55958a).append("|").append(this.f55953a.f55959b).append("|").append(this.f55953a.f55960c).append("|").append(this.f55953a.f55961d).append("|").append(this.f55953a.f55962e);
            jSONObject.put("token", C23652b.m44727a(sb.toString()));
            return jSONObject;
        }

        /* renamed from: a */
        protected static C23642b m44707a(String str) {
            JSONObject jSONObject = new JSONObject(str);
            C23642b bVar = new C23642b();
            bVar.f55941b = jSONObject.getInt("risk");
            bVar.f55942c = jSONObject.getBoolean("show_mid_page");
            bVar.f55943d = jSONObject.getLong("safe_duration");
            bVar.f55940a = true;
            return bVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo39066b(java.lang.String r7) {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1769i.p1774d.C23643c.AbstractC23644a.mo39066b(java.lang.String):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo39064a(C23642b bVar) {
            if (bVar.f55943d > 0) {
                long j = bVar.f55943d * 1000;
                C23638a a = C23638a.m44697a();
                if (j >= 0 && j != C23638a.f55929a) {
                    C23638a.f55929a = j;
                    a.f55931b.edit().putLong("valid_time", j).apply();
                }
            }
            if (this.f55953a.f55966i != null) {
                this.f55953a.f55966i.mo39056a(this.f55953a.f55960c, bVar);
            }
        }

        protected AbstractC23644a(C23649d dVar) {
            this.f55953a = dVar;
        }
    }

    /* renamed from: com.bytedance.webx.i.d.c$b */
    class CallableC23645b extends AbstractC23644a implements Callable<C23642b> {
        static {
            Covode.recordClassIndex(27744);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C23642b call() {
            try {
                URL a = m44708a();
                if (C23643c.f55944a == null) {
                    C23643c.f55944a = new C23646c((byte) 0);
                }
                String a2 = C23643c.f55944a.mo39046a(a.toString(), mo39065b());
                if (TextUtils.isEmpty(a2)) {
                    return new C23642b();
                }
                try {
                    return m44707a(a2);
                } catch (JSONException e) {
                    C23642b bVar = new C23642b();
                    mo39066b("source:  " + a2 + "  case : " + e.getMessage());
                    return bVar;
                }
            } catch (Exception e2) {
                C23642b bVar2 = new C23642b();
                mo39066b(e2.getMessage());
                return bVar2;
            }
        }

        protected CallableC23645b(C23649d dVar) {
            super(dVar);
        }
    }

    /* renamed from: a */
    public final void mo39062a(C23649d dVar) {
        if (f55949i == null) {
            f55949i = Executors.newCachedThreadPool();
        }
        f55949i.execute(new RunnableC23647d(dVar));
    }

    /* renamed from: b */
    public final Future<C23642b> mo39063b(C23649d dVar) {
        if (f55949i == null) {
            f55949i = Executors.newCachedThreadPool();
        }
        return f55949i.submit(new CallableC23645b(dVar));
    }
}
