package com.p2082ss.ttvideoengine.p4412f.p4413a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.p2082ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.p2082ss.ttvideoengine.C86377bf;
import com.p2082ss.ttvideoengine.p4412f.C86437e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.f.a.c */
public final class C86428c implements AVMDLURLFetcherInterface {

    /* renamed from: a */
    public String f193770a;

    /* renamed from: b */
    public String f193771b;

    /* renamed from: c */
    public String[] f193772c;

    /* renamed from: d */
    public AVMDLURLFetcherListener f193773d;

    /* renamed from: e */
    public String f193774e;

    /* renamed from: f */
    private WeakReference<AbstractC86427b> f193775f;

    /* renamed from: g */
    private C86437e f193776g;

    /* renamed from: h */
    private C86535p f193777h;

    static {
        Covode.recordClassIndex(101656);
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final void close() {
        C86437e eVar = this.f193776g;
        if (eVar != null) {
            eVar.mo137469a();
            this.f193776g = null;
        }
        this.f193775f = null;
    }

    /* renamed from: a */
    public final AbstractC86427b mo137463a() {
        WeakReference<AbstractC86427b> weakReference = this.f193775f;
        if (weakReference != null) {
            return weakReference.get();
        }
        C86641i.m150113b("MDLFetcherNew", "getMDLFetcherListener is null");
        return null;
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final String[] getURLs() {
        C86641i.m150110a("MDLFetcherNew", "mdl getURLs " + Arrays.toString(this.f193772c));
        return this.f193772c;
    }

    /* renamed from: com.ss.ttvideoengine.f.a.c$a */
    static class C86429a implements C86437e.AbstractC86441a {

        /* renamed from: a */
        private final WeakReference<C86428c> f193778a;

        static {
            Covode.recordClassIndex(101657);
        }

        public C86429a(C86428c cVar) {
            this.f193778a = new WeakReference<>(cVar);
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137285a(C86633c cVar) {
            C86428c cVar2 = this.f193778a.get();
            if (cVar2 != null && cVar2.mo137463a() != null) {
                cVar2.mo137463a().mo137458a(cVar);
            }
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137286a(String str) {
            C86428c cVar = this.f193778a.get();
            if (cVar != null && cVar.mo137463a() != null) {
                cVar.mo137463a().mo137460a(str);
            }
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137283a(int i, String str) {
            C86428c cVar = this.f193778a.get();
            if (cVar == null) {
                C86641i.m150110a("MDLFetcherNew", "onStatusException but fetcher is null");
            } else {
                cVar.mo137465a(new C86633c("kTTVideoErrorDomainMDLRetry", -10005, i, str), true);
            }
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137284a(C86535p pVar, C86633c cVar) {
            C86641i.m150110a("MDLFetcherNew", "onCompletion model " + pVar + ", error " + cVar);
            C86428c cVar2 = this.f193778a.get();
            if (cVar2 == null) {
                C86641i.m150110a("MDLFetcherNew", "onCompletion but fetcher is null");
            } else if (cVar != null) {
                cVar2.mo137465a(cVar, true);
            } else if (pVar == null) {
                cVar2.mo137465a(new C86633c("kTTVideoErrorDomainMDLRetry", -9997, "fetch empty"), true);
            } else {
                cVar2.f193772c = C86428c.m149135a(pVar, cVar2.f193771b);
                C86641i.m150110a("MDLFetcherNew", "onCompletion newUrls " + Arrays.toString(cVar2.f193772c));
                if (cVar2.f193772c == null || cVar2.f193772c.length == 0) {
                    cVar2.mo137465a(new C86633c("kTTVideoErrorDomainMDLRetry", -10003, "file hash invalid"), true);
                } else if (C86428c.m149134a(cVar2.f193772c, cVar2.f193774e)) {
                    cVar2.f193773d.onCompletion(0, cVar2.f193770a, cVar2.f193771b, cVar2.f193772c);
                    cVar2.mo137464a(pVar, true);
                } else {
                    cVar2.mo137465a(new C86633c("kTTVideoErrorDomainMDLRetry", -10004, "fetch videoModel is expired"), true);
                }
            }
        }
    }

    public C86428c(AbstractC86427b bVar) {
        this.f193775f = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo137464a(C86535p pVar, boolean z) {
        AbstractC86427b a = mo137463a();
        if (a != null) {
            a.mo137457a(pVar, z, this.f193771b);
        }
        close();
    }

    /* renamed from: a */
    public static boolean m149134a(String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                C86641i.m150113b("MDLFetcherNew", "new urls is invalid");
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String[] m149135a(C86535p pVar, String str) {
        if (pVar == null || TextUtils.isEmpty(str)) {
            C86641i.m150110a("MDLFetcherNew", "getUrlsFromVideoModelByFileHash videoModel is null or fileHash is empty ".concat(String.valueOf(str)));
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(15, str);
        C86534o a = pVar.mo137787a((Map<Integer, String>) hashMap);
        if (a == null) {
            C86641i.m150110a("MDLFetcherNew", "getUrlsFromVideoModelByFileHash videoInfo is null");
            return null;
        }
        String[] b = a.mo137727b();
        C86641i.m150110a("MDLFetcherNew", "getUrlsFromVideoModelByFileHash " + Arrays.toString(b));
        return b;
    }

    /* renamed from: a */
    public final void mo137465a(C86633c cVar, boolean z) {
        if (z) {
            this.f193773d.onCompletion(cVar.f195251a, this.f193770a, this.f193771b, null);
        }
        AbstractC86427b a = mo137463a();
        if (a != null) {
            a.mo137459a(cVar, this.f193771b);
        }
        close();
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        boolean z;
        C86641i.m150110a("MDLFetcherNew", "start rawKey " + str + ", fileKey " + str2 + ", olderUrl " + str3 + ", listener " + aVMDLURLFetcherListener);
        this.f193770a = str;
        this.f193771b = str2;
        this.f193773d = aVMDLURLFetcherListener;
        this.f193774e = str3;
        AbstractC86427b a = mo137463a();
        if (a == null) {
            C86641i.m150110a("MDLFetcherNew", "start MDLFetcherListener is null return MDL_GET_URLS");
            mo137465a(new C86633c("kTTVideoErrorDomainMDLRetry", -10001, "MDLFetcherListener is empty"), false);
            return 1;
        }
        String b = a.mo137461b();
        if (TextUtils.isEmpty(b)) {
            C86641i.m150110a("MDLFetcherNew", "start fallbackApi is empty return MDL_GET_URLS");
            mo137465a(new C86633c("kTTVideoErrorDomainMDLRetry", -10002, "fallbackApi is empty"), false);
            return 1;
        }
        C86377bf.C86378a a2 = C86377bf.m148936a().mo137342a(this.f193770a, b);
        if (a2 == null || a2.f193514c) {
            C86641i.m150110a("MDLFetcherNew", "getURLsFromCache cacheInfo is null or isExpired");
        } else {
            this.f193777h = a2.f193512a;
            String[] a3 = m149135a(a2.f193512a, this.f193771b);
            if (a3 == null || a3.length <= 0) {
                C86641i.m150110a("MDLFetcherNew", "getURLsFromCache temUrls is null");
            } else if (!m149134a(a3, str3)) {
                C86377bf.m148936a().mo137345b(this.f193770a, b);
                C86641i.m150110a("MDLFetcherNew", "getURLsFromCache urls is invalid");
            } else {
                C86641i.m150110a("MDLFetcherNew", "getURLsFromCache " + Arrays.toString(a3));
                if (a3.length > 0) {
                    this.f193772c = a3;
                    C86641i.m150110a("MDLFetcherNew", "start return MDL_GET_URLS");
                    mo137464a(this.f193777h, false);
                    return 1;
                }
            }
        }
        Context c = a.mo137462c();
        C86437e eVar = new C86437e(c, null);
        this.f193776g = eVar;
        if (c != null) {
            z = true;
        } else {
            z = false;
        }
        eVar.mo137476a(z);
        this.f193776g.f193805g = str;
        this.f193776g.f193803e = new C86429a(this);
        this.f193776g.mo137471a((Boolean) true);
        this.f193776g.mo137474a(b, null, 0, null);
        C86641i.m150110a("MDLFetcherNew", "start return CALLBACK_URLS_TO_MDL");
        return 0;
    }
}
