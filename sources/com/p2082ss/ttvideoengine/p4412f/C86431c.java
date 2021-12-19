package com.p2082ss.ttvideoengine.p4412f;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.p2082ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.p2082ss.ttvideoengine.C86377bf;
import com.p2082ss.ttvideoengine.p4412f.C86437e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import com.p2082ss.ttvideoengine.p4430s.C86643k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.f.c */
public class C86431c implements AVMDLURLFetcherInterface {

    /* renamed from: a */
    public String f193781a;

    /* renamed from: b */
    public String f193782b;

    /* renamed from: c */
    public String[] f193783c;

    /* renamed from: d */
    public AVMDLURLFetcherListener f193784d;

    /* renamed from: e */
    public String f193785e;

    /* renamed from: f */
    private String f193786f;

    /* renamed from: g */
    private String f193787g;

    /* renamed from: h */
    private C86437e f193788h;

    /* renamed from: i */
    private Context f193789i;

    static {
        Covode.recordClassIndex(101659);
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public void close() {
        C86437e eVar = this.f193788h;
        if (eVar != null) {
            eVar.mo137469a();
            this.f193788h = null;
        }
        this.f193783c = null;
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public String[] getURLs() {
        String[] strArr = this.f193783c;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        C86641i.m150113b("MDLFetcher", "get urls from cache. + urls.length = " + this.f193783c.length);
        return this.f193783c;
    }

    /* renamed from: com.ss.ttvideoengine.f.c$a */
    static class C86432a implements C86437e.AbstractC86441a {

        /* renamed from: a */
        private final WeakReference<C86431c> f193790a;

        static {
            Covode.recordClassIndex(101660);
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137285a(C86633c cVar) {
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137286a(String str) {
        }

        public C86432a(C86431c cVar) {
            this.f193790a = new WeakReference<>(cVar);
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137283a(int i, String str) {
            C86431c cVar = this.f193790a.get();
            if (cVar == null) {
                C86641i.m150110a("MDLFetcher", "onStatusException but fetcher is null");
            } else {
                cVar.f193784d.onCompletion(i, cVar.f193781a, cVar.f193782b, null);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
            if (r8 != null) goto L_0x0033;
         */
        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo137284a(com.p2082ss.ttvideoengine.p4417j.C86535p r7, com.p2082ss.ttvideoengine.p4430s.C86633c r8) {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4412f.C86431c.C86432a.mo137284a(com.ss.ttvideoengine.j.p, com.ss.ttvideoengine.s.c):void");
        }
    }

    /* renamed from: a */
    public static boolean m149145a(String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                C86641i.m150113b("MDLFetcher", "new urls is invalid");
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String[] m149146a(C86535p pVar, String str) {
        if (pVar == null || TextUtils.isEmpty(str)) {
            C86641i.m150113b("MDLFetcher", "_getUrlsFromVideoModel videoModel is null or fileHash is empty ".concat(String.valueOf(str)));
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(15, str);
        C86534o a = pVar.mo137787a((Map<Integer, String>) hashMap);
        if (a != null) {
            String[] b = a.mo137727b();
            C86641i.m150113b("MDLFetcher", "_getUrlsFromVideoModel " + Arrays.toString(b));
            if (b == null || b.length <= 0) {
                return null;
            }
            return b;
        }
        C86641i.m150113b("MDLFetcher", "_getUrlsFromVideoModel videoInfo is null");
        return null;
    }

    public C86431c(Context context, String str, String str2) {
        this.f193789i = context;
        this.f193786f = C86643k.m150120a(str);
        this.f193787g = str2;
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        C86377bf.C86378a a;
        MethodCollector.m26663i(6555);
        C86641i.m150110a("MDLFetcher", "start rawKey " + str + ", fileKey " + str2 + ", olderUrl " + str3 + ", listener " + aVMDLURLFetcherListener);
        this.f193781a = str;
        this.f193782b = str2;
        this.f193784d = aVMDLURLFetcherListener;
        this.f193785e = str3;
        synchronized (C86431c.class) {
            try {
                a = C86377bf.m148936a().mo137342a(this.f193781a, this.f193786f);
            } finally {
                MethodCollector.m26664o(6555);
            }
        }
        if (a != null && !a.f193514c) {
            C86641i.m150110a("MDLFetcher", C1764a.m5928a("get videoModel from cache,key is %s; videoId = %s", new Object[]{this.f193782b, this.f193781a}));
            String[] a2 = m149146a(a.f193512a, this.f193782b);
            if (!TextUtils.isEmpty(str3) && a2 != null && a2.length > 0) {
                this.f193783c = a2;
                int i = 0;
                while (true) {
                    if (i >= a2.length) {
                        break;
                    } else if (a2[i].equals(str3)) {
                        this.f193783c = null;
                        synchronized (C86431c.class) {
                            try {
                                C86377bf.m148936a().mo137345b(this.f193781a, this.f193786f);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (this.f193783c != null) {
                C86641i.m150110a("MDLFetcher", "start get urls from cache " + Arrays.toString(this.f193783c));
                MethodCollector.m26664o(6555);
                return 1;
            }
        }
        C86437e eVar = new C86437e(this.f193789i, null);
        this.f193788h = eVar;
        if (this.f193789i != null) {
            eVar.mo137476a(true);
        }
        this.f193788h.f193805g = str;
        this.f193788h.f193803e = new C86432a(this);
        this.f193788h.mo137471a(Boolean.valueOf(!TextUtils.isEmpty(this.f193786f)));
        this.f193788h.mo137474a(this.f193786f, null, 0, this.f193787g);
        MethodCollector.m26664o(6555);
        return 0;
    }
}
