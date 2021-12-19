package com.bytedance.lynx.hybrid.webkit;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.AbstractC21195h;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.p1515a.C21147a;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21383d;
import com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21384e;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.webkit.d */
public final class C21394d implements AbstractC21195h {

    /* renamed from: a */
    public C21384e f50750a;

    /* renamed from: b */
    public C21383d f50751b;

    /* renamed from: c */
    public AbstractC21396f f50752c;

    /* renamed from: d */
    public Boolean f50753d;

    /* renamed from: e */
    public Integer f50754e;

    /* renamed from: f */
    public final Map<String, Object> f50755f;

    /* renamed from: g */
    public Map<String, String> f50756g;

    /* renamed from: h */
    public AbstractC21388b f50757h;

    /* renamed from: i */
    Uri f50758i;

    /* renamed from: j */
    private EnumC21149c f50759j = EnumC21149c.WEB;

    static {
        Covode.recordClassIndex(25014);
    }

    @Override // com.bytedance.lynx.hybrid.AbstractC21195h
    /* renamed from: a */
    public final EnumC21149c mo34744a() {
        return this.f50759j;
    }

    public final int hashCode() {
        Uri uri = this.f50758i;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WebKitInitParams(loadUri=" + this.f50758i + ")";
    }

    @Override // com.bytedance.lynx.hybrid.AbstractC21195h
    /* renamed from: a */
    public final void mo34745a(Map<String, ? extends Object> map) {
        if (map != null) {
            this.f50755f.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21394d) || !C89219l.m154714a(this.f50758i, ((C21394d) obj).f50758i)) {
            return false;
        }
        return true;
    }

    public C21394d(Uri uri) {
        this.f50758i = uri;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f50755f = linkedHashMap;
        this.f50756g = new LinkedHashMap();
        C21147a aVar = C21170d.C21171a.m39868a().f50223d;
        if (aVar != null) {
            linkedHashMap.putAll(aVar);
        }
    }
}
