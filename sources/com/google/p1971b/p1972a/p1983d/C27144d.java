package com.google.p1971b.p1972a.p1983d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15418q;
import com.google.p1971b.p1972a.p1993g.AbstractC27189k;
import com.google.p1971b.p1972a.p1993g.C27185j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.google.b.a.d.d */
public class C27144d extends C27185j {
    @AbstractC27189k(mo45288a = "Accept")
    private List<String> accept;
    @AbstractC27189k(mo45288a = "Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @AbstractC27189k(mo45288a = "Age")
    private List<Long> age;
    @AbstractC27189k(mo45288a = "WWW-Authenticate")
    public List<String> authenticate;
    @AbstractC27189k(mo45288a = "Authorization")
    public List<String> authorization;
    @AbstractC27189k(mo45288a = "Cache-Control")
    private List<String> cacheControl;
    @AbstractC27189k(mo45288a = "Content-Encoding")
    private List<String> contentEncoding;
    @AbstractC27189k(mo45288a = "Content-Length")
    private List<Long> contentLength;
    @AbstractC27189k(mo45288a = "Content-MD5")
    private List<String> contentMD5;
    @AbstractC27189k(mo45288a = "Content-Range")
    private List<String> contentRange;
    @AbstractC27189k(mo45288a = "Content-Type")
    private List<String> contentType;
    @AbstractC27189k(mo45288a = "Cookie")
    private List<String> cookie;
    @AbstractC27189k(mo45288a = "Date")
    private List<String> date;
    @AbstractC27189k(mo45288a = "ETag")
    private List<String> etag;
    @AbstractC27189k(mo45288a = "Expires")
    private List<String> expires;
    @AbstractC27189k(mo45288a = "If-Match")
    private List<String> ifMatch;
    @AbstractC27189k(mo45288a = "If-Modified-Since")
    private List<String> ifModifiedSince;
    @AbstractC27189k(mo45288a = "If-None-Match")
    private List<String> ifNoneMatch;
    @AbstractC27189k(mo45288a = "If-Range")
    private List<String> ifRange;
    @AbstractC27189k(mo45288a = "If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @AbstractC27189k(mo45288a = "Last-Modified")
    private List<String> lastModified;
    @AbstractC27189k(mo45288a = C15418q.f37640b)
    private List<String> location;
    @AbstractC27189k(mo45288a = "MIME-Version")
    private List<String> mimeVersion;
    @AbstractC27189k(mo45288a = "Range")
    private List<String> range;
    @AbstractC27189k(mo45288a = "Retry-After")
    private List<String> retryAfter;
    @AbstractC27189k(mo45288a = "User-Agent")
    private List<String> userAgent;

    static {
        Covode.recordClassIndex(32724);
    }

    @Override // com.google.p1971b.p1972a.p1993g.C27185j
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C27185j mo45182b() {
        return super.clone();
    }

    @Override // java.util.AbstractMap, com.google.p1971b.p1972a.p1993g.C27185j, java.lang.Object
    public /* synthetic */ Object clone() {
        return super.clone();
    }

    public C27144d() {
        super(EnumSet.of(C27185j.EnumC27188c.IGNORE_CASE));
    }

    /* renamed from: a */
    public final String mo45188a() {
        String str;
        List<String> list = this.userAgent;
        if (list == null) {
            str = null;
        } else {
            str = list.get(0);
        }
        return str;
    }

    /* renamed from: a */
    public final C27144d mo45187a(String str) {
        this.userAgent = m53929a((Object) str);
        return this;
    }

    /* renamed from: a */
    private static <T> List<T> m53929a(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    @Override // com.google.p1971b.p1972a.p1993g.C27185j
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C27185j mo45179b(String str, Object obj) {
        return super.mo45179b(str, obj);
    }
}
