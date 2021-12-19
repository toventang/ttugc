package com.ttnet.org.chromium.net.impl;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87533ac;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ttnet.org.chromium.net.impl.r */
public final class C87642r extends AbstractC87533ac {

    /* renamed from: a */
    final C87643a f199081a;

    /* renamed from: b */
    private final List<String> f199082b;

    /* renamed from: c */
    private final int f199083c;

    /* renamed from: d */
    private final String f199084d;

    /* renamed from: e */
    private final boolean f199085e;

    /* renamed from: f */
    private final String f199086f;

    /* renamed from: g */
    private final String f199087g;

    /* renamed from: h */
    private final AtomicLong f199088h;

    static {
        Covode.recordClassIndex(103624);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87533ac
    /* renamed from: a */
    public final int mo141709a() {
        return this.f199083c;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87533ac
    /* renamed from: b */
    public final String mo141710b() {
        return this.f199084d;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87533ac
    /* renamed from: c */
    public final List<Map.Entry<String, String>> mo141711c() {
        return this.f199081a.f199089a;
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.r$a */
    public static final class C87643a extends AbstractC87533ac.AbstractC87534a {

        /* renamed from: a */
        final List<Map.Entry<String, String>> f199089a;

        /* renamed from: b */
        private Map<String, List<String>> f199090b;

        static {
            Covode.recordClassIndex(103625);
        }

        /* renamed from: a */
        public final Map<String, List<String>> mo142021a() {
            Map<String, List<String>> map = this.f199090b;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, String> entry : this.f199089a) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
            this.f199090b = unmodifiableMap;
            return unmodifiableMap;
        }

        C87643a(List<Map.Entry<String, String>> list) {
            this.f199089a = list;
        }
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        List<String> list = this.f199082b;
        return C1764a.m5929a(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), list.get(list.size() - 1), this.f199082b.toString(), Integer.valueOf(this.f199083c), this.f199084d, this.f199081a.f199089a.toString(), Boolean.valueOf(this.f199085e), this.f199086f, this.f199087g, Long.valueOf(this.f199088h.get())});
    }

    /* renamed from: a */
    public final void mo142019a(long j) {
        this.f199088h.set(j);
    }

    public C87642r(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this.f199082b = Collections.unmodifiableList(list);
        this.f199083c = i;
        this.f199084d = str;
        this.f199081a = new C87643a(Collections.unmodifiableList(list2));
        this.f199085e = z;
        this.f199086f = str2;
        this.f199087g = str3;
        this.f199088h = new AtomicLong(j);
    }
}
