package com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.d.a */
public final class C35855a {

    /* renamed from: a */
    public Map<String, String> f84633a = new HashMap();

    static {
        Covode.recordClassIndex(43094);
    }

    /* renamed from: a */
    public final C35855a mo62964a(Map<? extends String, ? extends String> map) {
        if (map != null) {
            this.f84633a.putAll(map);
        }
        return this;
    }

    /* renamed from: a */
    public final C35855a mo62963a(String str, String str2) {
        return m73247a(str, str2, C33744d.AbstractC33745a.f79944a);
    }

    /* renamed from: a */
    public final C35855a mo62961a(String str, int i) {
        return m73247a(str, String.valueOf(i), C33744d.AbstractC33745a.f79944a);
    }

    /* renamed from: a */
    public final C35855a mo62962a(String str, Object obj) {
        if (obj != null) {
            mo62963a(str, new C27910f().mo46674b(obj));
        }
        return this;
    }

    /* renamed from: a */
    private C35855a m73247a(String str, String str2, C33744d.AbstractC33745a aVar) {
        this.f84633a.put(str, aVar.mo59987a(str2));
        return this;
    }
}
