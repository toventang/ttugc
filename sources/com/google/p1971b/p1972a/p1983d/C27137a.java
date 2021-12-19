package com.google.p1971b.p1972a.p1983d;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27160c;
import com.google.p1971b.p1972a.p1993g.C27185j;
import com.google.p1971b.p1972a.p1993g.p1994a.AbstractC27166b;
import com.google.p1971b.p1972a.p1993g.p1994a.C27165a;
import com.google.p1971b.p1972a.p1993g.p1994a.C27167c;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.b.a.d.a */
public final class C27137a extends C27185j {

    /* renamed from: g */
    private static final AbstractC27166b f64267g = new C27167c("=&-_.!~*'()@:$,;/?:", false);

    /* renamed from: a */
    public String f64268a;

    /* renamed from: b */
    public String f64269b;

    /* renamed from: c */
    public String f64270c;

    /* renamed from: d */
    public int f64271d;

    /* renamed from: e */
    public List<String> f64272e;

    /* renamed from: f */
    public String f64273f;

    public C27137a() {
        this.f64271d = -1;
    }

    public final String toString() {
        return mo45181a();
    }

    static {
        Covode.recordClassIndex(32717);
    }

    public final int hashCode() {
        return mo45181a().hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C27137a clone() {
        C27137a aVar = (C27137a) super.clone();
        if (this.f64272e != null) {
            aVar.f64272e = new ArrayList(this.f64272e);
        }
        return aVar;
    }

    /* renamed from: e */
    private String m53925e() {
        StringBuilder sb = new StringBuilder();
        if (this.f64272e != null) {
            m53920a(sb);
        }
        m53921a(entrySet(), sb);
        String str = this.f64273f;
        if (str != null) {
            sb.append('#').append(f64267g.mo45238a(str));
        }
        return sb.toString();
    }

    /* renamed from: d */
    private String m53924d() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) C27159b.m53980a(this.f64268a));
        sb.append("://");
        String str = this.f64270c;
        if (str != null) {
            sb.append(C27165a.f64309b.mo45238a(str)).append('@');
        }
        sb.append((String) C27159b.m53980a(this.f64269b));
        int i = this.f64271d;
        if (i != -1) {
            sb.append(':').append(i);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo45181a() {
        String valueOf = String.valueOf(m53924d());
        String valueOf2 = String.valueOf(m53925e());
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    public C27137a(String str) {
        this(m53919a(str));
    }

    /* renamed from: a */
    private static URL m53919a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof C27137a)) {
            return false;
        }
        return mo45181a().equals(((C27137a) obj).toString());
    }

    private C27137a(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    /* renamed from: a */
    private void m53920a(StringBuilder sb) {
        int size = this.f64272e.size();
        for (int i = 0; i < size; i++) {
            String str = this.f64272e.get(i);
            if (i != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                sb.append(C27165a.f64308a.mo45238a(str));
            }
        }
    }

    @Override // com.google.p1971b.p1972a.p1993g.C27185j
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C27185j mo45179b(String str, Object obj) {
        return super.mo45179b(str, obj);
    }

    /* renamed from: a */
    private static void m53921a(Set<Map.Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Map.Entry<String, Object> entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String a = C27165a.f64310c.mo45238a(entry.getKey());
                if (value instanceof Collection) {
                    for (Object obj : (Collection) value) {
                        z = m53922a(z, sb, a, obj);
                    }
                } else {
                    z = m53922a(z, sb, a, value);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m53922a(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append('&');
        }
        sb.append(str);
        String a = C27165a.f64310c.mo45238a(obj.toString());
        if (a.length() != 0) {
            sb.append('=').append(a);
        }
        return z;
    }

    private C27137a(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        ArrayList arrayList;
        String str7;
        boolean z;
        String substring;
        this.f64271d = -1;
        this.f64268a = str.toLowerCase();
        this.f64269b = str2;
        this.f64271d = i;
        String str8 = null;
        if (str3 == null || str3.length() == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            int i2 = 0;
            do {
                int indexOf = str3.indexOf(47, i2);
                if (indexOf != -1) {
                    z = true;
                    substring = str3.substring(i2, indexOf);
                } else {
                    z = false;
                    substring = str3.substring(i2);
                }
                arrayList.add(C27165a.m53995a(substring));
                i2 = indexOf + 1;
            } while (z);
        }
        this.f64272e = arrayList;
        if (str4 != null) {
            str7 = C27165a.m53995a(str4);
        } else {
            str7 = null;
        }
        this.f64273f = str7;
        if (str5 != null) {
            try {
                C27149i.m53940a(new StringReader(str5), this);
            } catch (IOException e) {
                throw C27160c.m53986a(e);
            }
        }
        this.f64270c = str6 != null ? C27165a.m53995a(str6) : str8;
    }
}
