package com.bytedance.sdk.bdlynx.view;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.p1683f.C22614b;
import com.bytedance.sdk.bdlynx.p1685c.AbstractC22620b;
import com.bytedance.sdk.bdlynx.p1686d.AbstractC22632b;
import com.bytedance.sdk.bdlynx.p1686d.C22633c;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89332a;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.sdk.bdlynx.view.a */
public final class C22673a implements AbstractC22632b {

    /* renamed from: b */
    public static final C22674a f53559b = new C22674a((byte) 0);

    /* renamed from: c */
    private static final List<String> f53560c = C89070n.m154522b("http", "https", "file", "content", "res", "data", "asset");

    /* renamed from: a */
    public AbstractC22620b f53561a;

    /* renamed from: com.bytedance.sdk.bdlynx.view.a$a */
    public static final class C22674a {
        static {
            Covode.recordClassIndex(26493);
        }

        private C22674a() {
        }

        public /* synthetic */ C22674a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private AbstractC22620b m42743a() {
        AbstractC22620b bVar = this.f53561a;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(26492);
    }

    @Override // com.bytedance.sdk.bdlynx.p1686d.AbstractC22632b
    /* renamed from: a */
    public final void mo36912a(AbstractC22620b bVar) {
        C89219l.m154719c(bVar, "");
        this.f53561a = bVar;
    }

    /* renamed from: b */
    private static String m42744b(C22633c cVar, String str) {
        String path;
        File parentFile;
        File a;
        File h;
        Uri uri = cVar.f53456c;
        if (uri == null || (path = uri.getPath()) == null || (parentFile = new File(path).getParentFile()) == null || (a = C89159j.m154651a(parentFile, str)) == null || (h = C89159j.m154657h(a)) == null) {
            return null;
        }
        return new Uri.Builder().scheme(uri.getScheme()).path(h.getCanonicalPath()).build().toString();
    }

    @Override // com.bytedance.sdk.bdlynx.p1686d.AbstractC22632b
    /* renamed from: a */
    public final String mo36911a(C22633c cVar, String str) {
        boolean z;
        String b;
        List<String> list;
        T t;
        String b2;
        File a;
        String canonicalPath;
        C89219l.m154719c(cVar, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        m42743a();
        C22614b a2 = C22614b.m42647a();
        C22683f fVar = new C22683f(null, str, null, 13);
        Uri parse = Uri.parse(str);
        C89219l.m154709a((Object) parse, "");
        if ((C89219l.m154714a((Object) parse.getScheme(), (Object) "http") || C89219l.m154714a((Object) parse.getScheme(), (Object) "https")) && (list = cVar.f53454a) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89361p.m154874b(str, (String) t, false)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                int length = t2.length();
                if (str != null) {
                    String substring = str.substring(length);
                    C89219l.m154709a((Object) substring, "");
                    String a3 = C89361p.m154896a(substring, '?');
                    char c = File.separatorChar;
                    C89219l.m154721d(a3, "");
                    if (a3.length() > 0 && C89332a.m154831a(a3.charAt(0), c, false)) {
                        a3 = ".".concat(String.valueOf(a3));
                    }
                    String str2 = cVar.f53455b;
                    if (str2 == null || (a = C89159j.m154651a(new File(str2), a3)) == null || (canonicalPath = a.getCanonicalPath()) == null || !new File(canonicalPath).exists()) {
                        b2 = m42744b(cVar, a3);
                    } else {
                        b2 = new Uri.Builder().scheme("file").path(canonicalPath).build().toString();
                    }
                    if (b2 != null) {
                        AbstractC22620b a4 = m42743a();
                        fVar.mo36955a("success");
                        fVar.mo36956b(b2);
                        fVar.f53586d = C22614b.m42646a(a2);
                        a4.mo36881a(fVar);
                        return b2;
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
        if (!parse.isRelative() || (b = m42744b(cVar, str)) == null) {
            AbstractC22620b a5 = m42743a();
            fVar.f53586d = C22614b.m42646a(a2);
            a5.mo36881a(fVar);
            return null;
        }
        AbstractC22620b a6 = m42743a();
        fVar.mo36955a("success");
        fVar.mo36956b(b);
        fVar.f53586d = C22614b.m42646a(a2);
        a6.mo36881a(fVar);
        return b;
    }
}
