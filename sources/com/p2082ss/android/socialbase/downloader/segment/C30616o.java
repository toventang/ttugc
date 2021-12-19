package com.p2082ss.android.socialbase.downloader.segment;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.socialbase.downloader.segment.o */
final class C30616o {

    /* renamed from: a */
    final String f73152a;

    /* renamed from: b */
    final String f73153b;

    /* renamed from: c */
    final String f73154c;

    /* renamed from: d */
    final boolean f73155d;

    /* renamed from: e */
    final AtomicLong f73156e = new AtomicLong();

    /* renamed from: f */
    private final List<RunnableC30613l> f73157f = new ArrayList();

    /* renamed from: g */
    private int f73158g;

    /* renamed from: h */
    private boolean f73159h;

    /* renamed from: i */
    private int f73160i;

    /* renamed from: j */
    private String f73161j;

    static {
        Covode.recordClassIndex(37151);
    }

    /* renamed from: d */
    public final synchronized boolean mo54872d() {
        boolean z;
        MethodCollector.m26663i(5552);
        z = this.f73159h;
        MethodCollector.m26664o(5552);
        return z;
    }

    /* renamed from: b */
    public final synchronized void mo54869b() {
        MethodCollector.m26663i(5338);
        this.f73158g++;
        this.f73159h = true;
        MethodCollector.m26664o(5338);
    }

    /* renamed from: c */
    public final synchronized void mo54871c() {
        MethodCollector.m26663i(5441);
        this.f73159h = false;
        MethodCollector.m26664o(5441);
    }

    public final int hashCode() {
        if (this.f73160i == 0) {
            this.f73160i = m62872e().hashCode();
        }
        return this.f73160i;
    }

    /* renamed from: e */
    private String m62872e() {
        if (this.f73161j == null) {
            StringBuilder append = new StringBuilder().append(this.f73152a).append("_");
            String str = this.f73153b;
            if (str == null) {
                str = "";
            }
            this.f73161j = append.append(str).append("_").append(this.f73155d).toString();
        }
        return this.f73161j;
    }

    /* renamed from: a */
    public final synchronized int mo54867a() {
        int size;
        MethodCollector.m26663i(5335);
        size = this.f73157f.size();
        MethodCollector.m26664o(5335);
        return size;
    }

    public final String toString() {
        return "UrlRecord{url='" + this.f73152a + '\'' + ", ip='" + this.f73153b + '\'' + ", ipFamily='" + this.f73154c + '\'' + ", isMainUrl=" + this.f73155d + ", failedTimes=" + this.f73158g + ", isCurrentFailed=" + this.f73159h + '}';
    }

    /* renamed from: a */
    private static String m62871a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int lastIndexOf = str.lastIndexOf(".");
            if (lastIndexOf <= 0 || lastIndexOf >= str.length()) {
                return null;
            }
            return str.substring(0, lastIndexOf);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30616o)) {
            return false;
        }
        return m62872e().equals(((C30616o) obj).m62872e());
    }

    /* renamed from: b */
    public final synchronized void mo54870b(RunnableC30613l lVar) {
        MethodCollector.m26663i(5333);
        try {
            this.f73157f.remove(lVar);
            MethodCollector.m26664o(5333);
        } catch (Throwable unused) {
            MethodCollector.m26664o(5333);
        }
    }

    /* renamed from: a */
    public final synchronized void mo54868a(RunnableC30613l lVar) {
        MethodCollector.m26663i(5256);
        this.f73157f.add(lVar);
        MethodCollector.m26664o(5256);
    }

    public C30616o(String str, String str2) {
        this.f73152a = str;
        this.f73155d = false;
        this.f73153b = str2;
        this.f73154c = m62871a(str2);
    }

    public C30616o(String str, boolean z) {
        this.f73152a = str;
        this.f73155d = z;
        this.f73153b = null;
        this.f73154c = null;
    }
}
