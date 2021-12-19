package com.p4501vk.api.sdk.p4502a;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.AbstractC87896h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.a.a */
public final class C87821a {

    /* renamed from: h */
    public static final List<String> f199492h = C89070n.m154522b("access_token", "expires_in", "user_id", "secret", "https_required", "created", "vk_access_token", "email", "phone", "phone_access_key");

    /* renamed from: i */
    public static final C87822a f199493i = new C87822a((byte) 0);

    /* renamed from: a */
    public final int f199494a;

    /* renamed from: b */
    public final String f199495b;

    /* renamed from: c */
    public final String f199496c;

    /* renamed from: d */
    public final long f199497d;

    /* renamed from: e */
    public final String f199498e;

    /* renamed from: f */
    public final String f199499f;

    /* renamed from: g */
    public final String f199500g;

    /* renamed from: j */
    private final boolean f199501j;

    /* renamed from: k */
    private final long f199502k;

    /* renamed from: com.vk.api.sdk.a.a$a */
    public static final class C87822a {
        static {
            Covode.recordClassIndex(103832);
        }

        private C87822a() {
        }

        public /* synthetic */ C87822a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m152833a(AbstractC87896h hVar) {
            C89219l.m154719c(hVar, "");
            Iterator<T> it = C87821a.f199492h.iterator();
            while (it.hasNext()) {
                hVar.mo142371b(it.next());
            }
        }

        /* renamed from: b */
        public static C87821a m152834b(AbstractC87896h hVar) {
            C89219l.m154719c(hVar, "");
            HashMap hashMap = new HashMap(C87821a.f199492h.size());
            for (String str : C87821a.f199492h) {
                String a = hVar.mo142369a(str);
                if (a != null) {
                    hashMap.put(str, a);
                }
            }
            if (!hashMap.containsKey("access_token") || !hashMap.containsKey("user_id")) {
                return null;
            }
            return new C87821a(hashMap);
        }
    }

    /* renamed from: a */
    public final boolean mo142298a() {
        long j = this.f199502k;
        if (j <= 0 || this.f199497d + (j * 1000) > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103831);
    }

    /* renamed from: b */
    private final Map<String, String> m152830b() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("access_token", this.f199495b);
        hashMap.put("secret", this.f199496c);
        if (this.f199501j) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("https_required", str);
        hashMap.put("created", String.valueOf(this.f199497d));
        hashMap.put("expires_in", String.valueOf(this.f199502k));
        hashMap.put("user_id", String.valueOf(this.f199494a));
        hashMap.put("email", this.f199498e);
        hashMap.put("phone", this.f199499f);
        hashMap.put("phone_access_key", this.f199500g);
        return hashMap;
    }

    /* renamed from: a */
    public final void mo142297a(AbstractC87896h hVar) {
        C89219l.m154719c(hVar, "");
        for (Map.Entry<String, String> entry : m152830b().entrySet()) {
            hVar.mo142372b(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r1 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C87821a(java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p4501vk.api.sdk.p4502a.C87821a.<init>(java.util.Map):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C87821a(int i, String str, String str2) {
        this(C89041ag.m154421a(C89387v.m154943a("user_id", String.valueOf(i)), C89387v.m154943a("access_token", str), C89387v.m154943a("secret", str2), C89387v.m154943a("https_required", "1")));
        C89219l.m154719c(str, "");
    }
}
