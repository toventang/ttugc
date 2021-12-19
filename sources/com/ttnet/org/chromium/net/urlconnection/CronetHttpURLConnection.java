package com.ttnet.org.chromium.net.urlconnection;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.C87458g;
import com.ttnet.org.chromium.base.C87463k;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87533ac;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87545h;
import com.ttnet.org.chromium.net.AbstractC87655t;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CronetHttpURLConnection extends HttpURLConnection {

    /* renamed from: a */
    public static final String f199100a = CronetHttpURLConnection.class.getSimpleName();

    /* renamed from: A */
    private int f199101A;

    /* renamed from: B */
    private int f199102B;

    /* renamed from: C */
    private long f199103C;

    /* renamed from: b */
    public final ExecutorC87668f f199104b = new ExecutorC87668f();

    /* renamed from: c */
    public AbstractC87529ab f199105c;

    /* renamed from: d */
    public C87666d f199106d = new C87666d(this);

    /* renamed from: e */
    public AbstractC87667e f199107e;

    /* renamed from: f */
    public AbstractC87533ac f199108f;

    /* renamed from: g */
    public IOException f199109g;

    /* renamed from: h */
    public boolean f199110h;

    /* renamed from: i */
    public boolean f199111i;

    /* renamed from: j */
    public List<Map.Entry<String, String>> f199112j;

    /* renamed from: k */
    public int f199113k;

    /* renamed from: l */
    public volatile String f199114l;

    /* renamed from: m */
    public AbstractC87655t f199115m;

    /* renamed from: n */
    public CookieHandler f199116n = CookieHandler.getDefault();

    /* renamed from: o */
    public CountDownLatch f199117o = new CountDownLatch(1);

    /* renamed from: p */
    private final AbstractC87536c f199118p;

    /* renamed from: q */
    private final List<Pair<String, String>> f199119q = new ArrayList();

    /* renamed from: r */
    private boolean f199120r;

    /* renamed from: s */
    private int f199121s;

    /* renamed from: t */
    private boolean f199122t;

    /* renamed from: u */
    private int f199123u;

    /* renamed from: v */
    private Map<String, List<String>> f199124v;

    /* renamed from: w */
    private int f199125w;

    /* renamed from: x */
    private int f199126x;

    /* renamed from: y */
    private int f199127y;

    /* renamed from: z */
    private int f199128z;

    /* renamed from: i */
    private List m152480i() {
        return m152475d(this);
    }

    public boolean usingProxy() {
        return false;
    }

    /* renamed from: h */
    private boolean m152479h() {
        if (this.chunkLength > 0) {
            return true;
        }
        return false;
    }

    @Override // java.net.URLConnection
    public void connect() {
        getOutputStream();
        m152476e();
    }

    static {
        Covode.recordClassIndex(103641);
    }

    /* renamed from: a */
    public final void mo142040a() {
        AbstractC87529ab abVar = this.f199105c;
        if (abVar != null) {
            abVar.mo141693d();
        }
    }

    public void disconnect() {
        AbstractC87529ab abVar;
        if (this.connected && (abVar = this.f199105c) != null) {
            abVar.mo141692c();
        }
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            m152477f();
            return mo142044c();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        m152477f();
        return this.f199108f.mo141709a();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        m152477f();
        return this.f199108f.mo141710b();
    }

    /* renamed from: d */
    private long m152474d() {
        long j = (long) this.fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            return j2 != -1 ? j2 : j;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return j;
        }
    }

    /* renamed from: g */
    private void m152478g() {
        if (this.f199111i) {
            IOException iOException = this.f199109g;
            if (iOException == null) {
                Objects.requireNonNull(this.f199108f, "Response info is null when there is no exception.");
                return;
            }
            throw iOException;
        }
        throw new IllegalStateException("No response.");
    }

    public InputStream getErrorStream() {
        try {
            m152477f();
            if (this.f199108f.mo141709a() >= 400) {
                return this.f199106d;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private void m152477f() {
        AbstractC87667e eVar = this.f199107e;
        if (eVar != null) {
            eVar.mo142073b();
            if (m152479h()) {
                this.f199107e.close();
            }
        }
        if (!this.f199111i) {
            m152476e();
            if (C87458g.m151790a()) {
                getURL();
            }
            m152469a(getConnectTimeout() + getReadTimeout());
            this.f199111i = true;
        }
        m152478g();
    }

    /* renamed from: b */
    public final AbstractC87655t mo142043b() {
        if (this.connected && this.f199105c != null && this.f199115m == null) {
            try {
                this.f199117o.await(50, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this.f199115m;
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        m152477f();
        if (!this.instanceFollowRedirects && this.f199110h) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.f199108f.mo141709a() < 400) {
            return this.f199106d;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    /* renamed from: c */
    public final Map<String, List<String>> mo142044c() {
        Map<String, List<String>> map = this.f199124v;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : m152480i()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.f199124v = unmodifiableMap;
        return unmodifiableMap;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Pair<String, String> pair : this.f199119q) {
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pair.second);
                    treeMap.put(pair.first, Collections.unmodifiableList(arrayList));
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection$a */
    public class C87659a extends AbstractC87529ab.AbstractC87531b {
        static {
            Covode.recordClassIndex(103642);
        }

        /* renamed from: a */
        private void m152486a() {
            CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
            cronetHttpURLConnection.f199114l = cronetHttpURLConnection.f199105c.mo141694e();
            try {
                if (CronetHttpURLConnection.this.f199109g != null) {
                    String str = null;
                    if (!(CronetHttpURLConnection.this.f199115m == null || CronetHttpURLConnection.this.f199115m.mo141997b() == null || CronetHttpURLConnection.this.f199115m.mo141997b().mo141950t() == null)) {
                        str = CronetHttpURLConnection.this.f199115m.mo141997b().mo141950t() + ":" + CronetHttpURLConnection.this.f199115m.mo141997b().mo141951u();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String message = CronetHttpURLConnection.this.f199109g.getMessage();
                        StringBuilder sb = new StringBuilder();
                        StringBuilder append = sb.append(str).append("|");
                        if (message == null) {
                            message = "null";
                        }
                        append.append(message);
                        C87463k.m151800a(CronetHttpURLConnection.this.f199109g).mo141523a("detailMessage", sb.toString());
                    }
                }
            } catch (Throwable unused) {
            }
            CronetHttpURLConnection.this.f199111i = true;
            CronetHttpURLConnection.this.f199104b.mo142091b();
        }

        public C87659a() {
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141705a(String str, AbstractC87655t tVar) {
            CronetHttpURLConnection.this.f199114l = str;
            CronetHttpURLConnection.this.f199115m = tVar;
            CronetHttpURLConnection.this.f199117o.countDown();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141700a(AbstractC87529ab abVar, AbstractC87533ac acVar) {
            CronetHttpURLConnection.this.f199108f = acVar;
            if (C87458g.m151790a()) {
                CronetHttpURLConnection.this.getURL();
            }
            m152487a((IOException) null, true);
        }

        /* renamed from: a */
        private void m152487a(IOException iOException, boolean z) {
            CronetHttpURLConnection.this.f199109g = iOException;
            if (CronetHttpURLConnection.this.f199106d != null) {
                CronetHttpURLConnection.this.f199106d.mo142082a(iOException);
            }
            if (CronetHttpURLConnection.this.f199107e != null) {
                CronetHttpURLConnection.this.f199107e.mo142086a(iOException);
            }
            CronetHttpURLConnection.this.f199111i = true;
            if (!z) {
                m152486a();
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: b */
        public final void mo141706b(AbstractC87529ab abVar, AbstractC87533ac acVar) {
            CronetHttpURLConnection.this.f199108f = acVar;
            if (C87458g.m151790a()) {
                CronetHttpURLConnection.this.getURL();
            }
            if (CronetHttpURLConnection.this.f199109g == null) {
                CronetHttpURLConnection.this.f199109g = new C87669g("request canceled" + ", ErrorCode=11, InternalErrorCode=-999");
            }
            m152487a(CronetHttpURLConnection.this.f199109g, false);
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141704a(AbstractC87529ab abVar, AbstractC87655t tVar) {
            CronetHttpURLConnection.this.f199115m = tVar;
            if (C87458g.m151790a()) {
                CronetHttpURLConnection.this.getURL();
            }
            m152486a();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141703a(AbstractC87529ab abVar, AbstractC87533ac acVar, ByteBuffer byteBuffer) {
            CronetHttpURLConnection.this.f199108f = acVar;
            if (C87458g.m151790a()) {
                CronetHttpURLConnection.this.getURL();
            }
            CronetHttpURLConnection.this.f199104b.mo142091b();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: b */
        public final void mo141707b(AbstractC87529ab abVar, AbstractC87533ac acVar, String str) {
            CronetHttpURLConnection.this.f199108f = acVar;
            CronetHttpURLConnection.this.f199111i = true;
            try {
                if (CronetHttpURLConnection.this.f199108f != null) {
                    Map<String, List<String>> c = CronetHttpURLConnection.this.mo142044c();
                    if (CronetHttpURLConnection.this.f199116n == null) {
                        CronetHttpURLConnection.this.f199116n = CookieHandler.getDefault();
                    }
                    if (CronetHttpURLConnection.this.f199116n != null) {
                        if (TextUtils.isEmpty(str)) {
                            CronetHttpURLConnection.this.f199116n.put(CronetHttpURLConnection.m152466a(CronetHttpURLConnection.this.getURL()), c);
                        } else {
                            CronetHttpURLConnection.this.f199116n.put(CronetHttpURLConnection.m152466a(new URL(str)), c);
                        }
                    }
                }
            } catch (Exception e) {
                if (C87458g.m151790a()) {
                    CronetHttpURLConnection.this.getURL();
                    e.getMessage();
                }
            }
            if (C87458g.m151790a()) {
                CronetHttpURLConnection.this.getURL();
            }
            CronetHttpURLConnection.this.f199104b.mo142091b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo141701a(com.ttnet.org.chromium.net.AbstractC87529ab r5, com.ttnet.org.chromium.net.AbstractC87533ac r6, com.ttnet.org.chromium.net.AbstractC87540d r7) {
            /*
            // Method dump skipped, instructions count: 158
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.C87659a.mo141701a(com.ttnet.org.chromium.net.ab, com.ttnet.org.chromium.net.ac, com.ttnet.org.chromium.net.d):void");
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87531b
        /* renamed from: a */
        public final void mo141702a(AbstractC87529ab abVar, AbstractC87533ac acVar, String str) {
            CronetHttpURLConnection.this.f199110h = true;
            try {
                URL url = new URL(str);
                boolean equals = url.getHost().equals(CronetHttpURLConnection.this.url.getHost());
                if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                    CronetHttpURLConnection.this.url = url;
                }
                if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                    if (CronetHttpURLConnection.this.f199105c != null) {
                        if (!equals) {
                            CronetHttpURLConnection.this.f199105c.mo141695f();
                            Map<String, String> a = CronetHttpURLConnection.this.mo142039a(CronetHttpURLConnection.m152466a(new URL(str)));
                            if (!a.isEmpty()) {
                                for (Map.Entry<String, String> entry : a.entrySet()) {
                                    CronetHttpURLConnection.this.f199105c.mo141689a(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        CronetHttpURLConnection.this.f199105c.mo141691b();
                        return;
                    }
                    return;
                }
            } catch (MalformedURLException unused) {
            }
            CronetHttpURLConnection.this.f199108f = acVar;
            if (CronetHttpURLConnection.this.f199105c != null) {
                m152487a((IOException) null, false);
            }
            if (C87458g.m151790a()) {
                CronetHttpURLConnection.this.getURL();
            }
        }
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        if (this.f199107e == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (m152479h()) {
                this.f199107e = new C87662b(this, this.chunkLength, this.f199104b);
                m152476e();
            } else {
                long d = m152474d();
                if (d != -1) {
                    C87664c cVar = new C87664c(this, d, this.f199104b);
                    this.f199107e = cVar;
                    if (d == 0) {
                        setFixedLengthStreamingMode((int) cVar.mo142074c().mo141927a());
                        if (getRequestProperty("Content-Length") == null) {
                            addRequestProperty("Content-Length", Long.toString(this.f199107e.mo142074c().mo141927a()));
                        } else {
                            setRequestProperty("Content-Length", Long.toString(this.f199107e.mo142074c().mo141927a()));
                        }
                    }
                    m152476e();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.f199107e = new C87660a(this);
                    } else {
                        this.f199107e = new C87660a(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.f199107e;
    }

    /* renamed from: e */
    private void m152476e() {
        if (!this.connected) {
            if (C87458g.m151790a()) {
                getURL();
            }
            AbstractC87545h.AbstractC87546a aVar = (AbstractC87545h.AbstractC87546a) this.f199118p.mo141712a(getURL().toString(), new C87659a(), this.f199104b);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                AbstractC87667e eVar = this.f199107e;
                if (eVar != null) {
                    aVar.mo141796a(eVar.mo142074c(), this.f199104b);
                    if (getRequestProperty("Content-Length") == null && !m152479h()) {
                        addRequestProperty("Content-Length", Long.toString(this.f199107e.mo142074c().mo141927a()));
                    }
                    this.f199107e.mo142072a();
                } else if (getRequestProperty("Content-Length") == null) {
                    addRequestProperty("Content-Length", "0");
                }
                if (getRequestProperty("Content-Type") == null) {
                    addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
            }
            Map<String, String> a = mo142039a(m152466a(getURL()));
            if (!a.isEmpty()) {
                for (Map.Entry<String, String> entry : a.entrySet()) {
                    aVar.mo141798a(entry.getKey(), entry.getValue());
                }
            }
            for (Pair<String, String> pair : this.f199119q) {
                aVar.mo141798a((String) pair.first, (String) pair.second);
            }
            if (!getUseCaches()) {
                aVar.mo141794a();
            }
            aVar.mo141797a(this.method);
            if (this.f199120r) {
                aVar.mo141795a(this.f199121s);
            }
            if (this.f199122t) {
                aVar.mo141799b(this.f199123u);
            }
            aVar.mo141801c(this.f199125w);
            aVar.mo141696d(this.f199126x);
            aVar.mo141697e(this.f199127y);
            aVar.mo141698f(this.f199128z);
            aVar.mo141699g(this.f199101A);
            AbstractC87545h b = aVar.mo141800b();
            this.f199105c = b;
            int i = this.f199102B;
            if (i != 0) {
                b.mo141687a(i);
            }
            this.f199105c.mo141686a();
            long j = this.f199103C;
            if (j > 0) {
                this.f199105c.mo141688a(j);
            }
            this.connected = true;
        }
    }

    public void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
    }

    public void setInputStreamBufferSize(int i) {
        this.f199113k = i;
    }

    public void setRequestFlag(int i) {
        this.f199102B = i;
    }

    public void setRequestPriority(int i) {
        this.f199125w = i;
    }

    public void setRequestTimeout(int i) {
        this.f199101A = i;
    }

    public void setSocketConnectTimeout(int i) {
        this.f199126x = i;
    }

    public void setSocketReadTimeout(int i) {
        this.f199127y = i;
    }

    public void setSocketWriteTimeout(int i) {
        this.f199128z = i;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry<String, String> b = m152471b(i);
        if (b == null) {
            return null;
        }
        return b.getValue();
    }

    public final String getHeaderFieldKey(int i) {
        Map.Entry<String, String> b = m152471b(i);
        if (b == null) {
            return null;
        }
        return b.getKey();
    }

    public void setThrottleNetSpeed(long j) {
        this.f199103C = j;
        AbstractC87529ab abVar = this.f199105c;
        if (abVar != null) {
            abVar.mo141688a(j);
        }
    }

    /* renamed from: b */
    private Map.Entry<String, String> m152471b(int i) {
        try {
            m152477f();
            List d = m152475d(this);
            if (i >= d.size()) {
                return null;
            }
            return (Map.Entry) d.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo142041a(ByteBuffer byteBuffer) {
        AbstractC87529ab abVar = this.f199105c;
        if (abVar != null) {
            abVar.mo141690a(byteBuffer);
            m152469a(getReadTimeout());
        }
    }

    public String getRequestProperty(String str) {
        int a = m152465a(str);
        if (a >= 0) {
            return (String) this.f199119q.get(a).second;
        }
        return null;
    }

    public void setException(IOException iOException) {
        C87666d dVar = this.f199106d;
        if (dVar != null) {
            dVar.mo142082a(iOException);
        }
        AbstractC87667e eVar = this.f199107e;
        if (eVar != null) {
            eVar.mo142086a(iOException);
        }
        this.f199111i = true;
        this.f199109g = iOException;
        AbstractC87529ab abVar = this.f199105c;
        if (abVar != null) {
            abVar.mo141692c();
        }
    }

    public void setTrafficStatsTag(int i) {
        if (!this.connected) {
            this.f199120r = true;
            this.f199121s = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    public void setTrafficStatsUid(int i) {
        if (!this.connected) {
            this.f199122t = true;
            this.f199123u = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
    }

    /* renamed from: a */
    private int m152465a(String str) {
        for (int i = 0; i < this.f199119q.size(); i++) {
            if (((String) this.f199119q.get(i).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private static List m152475d(CronetHttpURLConnection cronetHttpURLConnection) {
        List<Map.Entry<String, String>> list = cronetHttpURLConnection.f199112j;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : cronetHttpURLConnection.f199108f.mo141711c()) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(entry));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            m152477f();
            Map<String, List<String>> c = mo142044c();
            if (!c.containsKey(str)) {
                return null;
            }
            List<String> list = c.get(str);
            return list.get(list.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static URI m152466a(URL url) {
        if (url == null) {
            return null;
        }
        String url2 = url.toString();
        try {
            return new URI(url2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(url2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                try {
                    return URI.create(url2.substring(0, url2.indexOf("?")));
                } catch (Exception unused2) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: a */
    private void m152469a(int i) {
        try {
            this.f199104b.mo142090a(i);
        } catch (SocketTimeoutException unused) {
            AbstractC87529ab abVar = this.f199105c;
            if (abVar != null) {
                abVar.mo141693d();
                this.f199104b.mo142089a();
                this.f199104b.mo142090a(i / 2);
            }
        } catch (Exception e) {
            setException(new IOException("Unexpected request usage, caught in CronetHttpURLConnection, caused by ".concat(String.valueOf(e))));
            if (this.f199105c != null) {
                this.f199104b.mo142089a();
                this.f199104b.mo142090a(i / 2);
            }
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo142039a(URI uri) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        List<Pair<String, String>> list = this.f199119q;
        if (list != null) {
            for (Pair<String, String> pair : list) {
                Object obj = pair.first;
                Object obj2 = pair.second;
                List list2 = (List) hashMap2.get(obj);
                if (list2 == null) {
                    list2 = new LinkedList();
                }
                list2.add(obj2);
                hashMap2.put(obj, list2);
            }
        }
        Map<String, List<String>> map = null;
        try {
            if (this.f199116n == null) {
                this.f199116n = CookieHandler.getDefault();
            }
            CookieHandler cookieHandler = this.f199116n;
            if (cookieHandler != null) {
                map = cookieHandler.get(uri, hashMap2);
            }
        } catch (Exception e) {
            if (C87458g.m151790a()) {
                getURL();
                e.getMessage();
            }
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                StringBuilder sb = new StringBuilder();
                if (("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && !entry.getValue().isEmpty()) {
                    int i = 0;
                    for (String str : entry.getValue()) {
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(str);
                        i++;
                    }
                    hashMap.put(key, sb.toString());
                }
            }
        }
        return hashMap;
    }

    public final void addRequestProperty(String str, String str2) {
        m152470a(str, str2, false);
    }

    public final void setRequestProperty(String str, String str2) {
        m152470a(str, str2, true);
    }

    public CronetHttpURLConnection(URL url, AbstractC87536c cVar) {
        super(url);
        this.f199118p = cVar;
    }

    /* renamed from: a */
    private final void m152470a(String str, String str2, boolean z) {
        if (!this.connected) {
            int a = m152465a(str);
            if (a >= 0) {
                if (z) {
                    this.f199119q.remove(a);
                } else {
                    throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
                }
            }
            this.f199119q.add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }
}
