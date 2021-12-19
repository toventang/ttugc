package com.bytedance.sdk.bdlynx.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1685c.AbstractC22620b;
import com.bytedance.sdk.bdlynx.p1686d.AbstractC22631a;
import com.bytedance.sdk.bdlynx.p1686d.AbstractC22632b;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22639b;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22640c;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.sdk.bdlynx.view.b */
public final class C22675b implements AbstractC22632b {

    /* renamed from: b */
    public static final C22676a f53562b = new C22676a((byte) 0);

    /* renamed from: e */
    private static final List<String> f53563e = C89070n.m154522b("http", "https");

    /* renamed from: a */
    public AbstractC22620b f53564a;

    /* renamed from: c */
    private C22640c f53565c;

    /* renamed from: d */
    private final AbstractC22631a f53566d;

    /* renamed from: com.bytedance.sdk.bdlynx.view.b$a */
    public static final class C22676a {
        static {
            Covode.recordClassIndex(26495);
        }

        private C22676a() {
        }

        public /* synthetic */ C22676a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private AbstractC22620b m42747a() {
        AbstractC22620b bVar = this.f53564a;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(26494);
    }

    @Override // com.bytedance.sdk.bdlynx.p1686d.AbstractC22632b
    /* renamed from: a */
    public final void mo36912a(AbstractC22620b bVar) {
        C89219l.m154719c(bVar, "");
        this.f53564a = bVar;
    }

    public C22675b(AbstractC22631a aVar) {
        C89219l.m154719c(aVar, "");
        this.f53566d = aVar;
    }

    /* renamed from: a */
    private static String m42750a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return C89361p.m154940j(str, str2);
    }

    /* renamed from: a */
    private static String m42748a(C22639b bVar, String str) {
        T t;
        List<String> list = bVar.f53472f;
        if (list != null) {
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
                    return C89361p.m154896a(substring, '?');
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0127  */
    @Override // com.bytedance.sdk.bdlynx.p1686d.AbstractC22632b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo36911a(com.bytedance.sdk.bdlynx.p1686d.C22633c r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bdlynx.view.C22675b.mo36911a(com.bytedance.sdk.bdlynx.d.c, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private final String m42749a(C22639b bVar, String str, String str2) {
        String a = m42748a(bVar, str);
        if (a != null) {
            String a2 = m42750a(a, str2);
            String a3 = this.f53566d.mo36910a();
            if (a3 != null) {
                File file = new File(a3 + File.separator + a2);
                if (file.exists()) {
                    return file.getAbsolutePath();
                }
            }
        }
        return null;
    }
}
