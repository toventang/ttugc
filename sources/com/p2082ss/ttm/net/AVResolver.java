package com.p2082ss.ttm.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttm.player.C86239b;
import java.net.InetAddress;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ss.ttm.net.AVResolver */
public class AVResolver {

    /* renamed from: d */
    public static int f192448d = 600000;

    /* renamed from: h */
    private static final Hashtable<String, C86224a> f192449h = new Hashtable<>();

    /* renamed from: a */
    public boolean f192450a;

    /* renamed from: b */
    public String f192451b;

    /* renamed from: c */
    public String[] f192452c;

    /* renamed from: e */
    private String f192453e;

    /* renamed from: f */
    private Thread f192454f;

    /* renamed from: g */
    private C86224a f192455g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttm.net.AVResolver$a */
    public static class C86224a {

        /* renamed from: a */
        public String f192456a;

        /* renamed from: b */
        public long f192457b;

        static {
            Covode.recordClassIndex(101371);
        }

        C86224a() {
        }
    }

    public void freeAddress() {
        Thread thread = this.f192454f;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(101370);
    }

    public int isSuccess() {
        if (!this.f192450a) {
            return 0;
        }
        String[] strArr = this.f192452c;
        if (strArr == null || strArr[0] == null) {
            return -1;
        }
        return 1;
    }

    public String getAddress() {
        String[] strArr;
        if (!this.f192450a || (strArr = this.f192452c) == null || strArr[0] == null) {
            return "parser host name: " + this.f192453e + " error.err msg:" + this.f192451b;
        }
        return strArr[0];
    }

    /* renamed from: com.ss.ttm.net.AVResolver$b */
    static class RunnableC86225b implements Runnable {

        /* renamed from: a */
        AVResolver f192458a;

        /* renamed from: b */
        String f192459b;

        static {
            Covode.recordClassIndex(101372);
        }

        public final void run() {
            InetAddress inetAddress;
            Throwable th;
            String str = null;
            try {
                inetAddress = InetAddress.getByName(this.f192459b);
                try {
                    str = inetAddress.getHostAddress();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inetAddress = null;
                this.f192458a.f192451b = th.getMessage();
                this.f192458a.f192450a = true;
                if (inetAddress != null) {
                    return;
                }
            }
            this.f192458a.f192450a = true;
            if (inetAddress != null && str != null) {
                this.f192458a.f192452c = new String[1];
                this.f192458a.f192452c[0] = str;
                C86224a aVar = new C86224a();
                aVar.f192457b = System.currentTimeMillis();
                aVar.f192456a = str;
                AVResolver.m148200a(this.f192459b, aVar);
                aVar.f192457b = System.currentTimeMillis();
            }
        }

        public RunnableC86225b(AVResolver aVResolver, String str) {
            this.f192458a = aVResolver;
            this.f192459b = str;
        }
    }

    public void getAddressInfo(String str) {
        this.f192453e = str;
        if (str == null || str.length() <= 0 || "".equals(str)) {
            this.f192450a = true;
            return;
        }
        String str2 = this.f192453e;
        if (str2.length() < 7 || str2.length() > 15 ? !(str2.charAt(0) == '[' && str2.charAt(str2.length() - 1) == ']') : !Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
            Hashtable<String, C86224a> hashtable = f192449h;
            C86224a aVar = hashtable.get(str);
            this.f192455g = aVar;
            if (aVar != null) {
                if (aVar.f192456a == null || System.currentTimeMillis() - this.f192455g.f192457b >= ((long) f192448d)) {
                    hashtable.remove(str);
                    this.f192455g = null;
                } else {
                    String[] strArr = new String[1];
                    this.f192452c = strArr;
                    strArr[0] = this.f192455g.f192456a;
                    this.f192450a = true;
                    return;
                }
            }
            try {
                C86239b.m148297a(new RunnableC86225b(this, this.f192453e));
            } catch (Exception e) {
                this.f192450a = true;
                this.f192451b = e.getMessage();
            }
        } else {
            String[] strArr2 = new String[1];
            this.f192452c = strArr2;
            strArr2[0] = this.f192453e;
            this.f192450a = true;
        }
    }

    /* renamed from: a */
    static synchronized void m148200a(String str, C86224a aVar) {
        synchronized (AVResolver.class) {
            MethodCollector.m26663i(4390);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Hashtable<String, C86224a> hashtable = f192449h;
                String str2 = null;
                if (hashtable.size() > 128) {
                    Iterator<Map.Entry<String, C86224a>> it = hashtable.entrySet().iterator();
                    C86224a aVar2 = null;
                    while (it.hasNext()) {
                        C86224a value = it.next().getValue();
                        str2 = it.next().getKey();
                        if (value != null && value.f192457b < currentTimeMillis) {
                            currentTimeMillis = value.f192457b;
                            aVar2 = value;
                        }
                    }
                    if (!(aVar2 == null || str2 == null)) {
                        f192449h.remove(str2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            f192449h.put(str, aVar);
            MethodCollector.m26664o(4390);
        }
    }
}
