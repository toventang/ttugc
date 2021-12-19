package com.squareup.p2075a.p2076a.p2077a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89426h;
import p4632k.C89420f;
import p4632k.C89427i;
import p4632k.C89436q;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.a.a.a.h */
public final class C29125h {

    /* renamed from: a */
    public static final C29123f[] f68901a;

    /* renamed from: b */
    public static final Map<C89427i, Integer> f68902b;

    /* renamed from: com.squareup.a.a.a.h$a */
    static final class C29126a {

        /* renamed from: a */
        int f68903a;

        /* renamed from: b */
        public int f68904b;

        /* renamed from: c */
        C29123f[] f68905c;

        /* renamed from: d */
        int f68906d;

        /* renamed from: e */
        int f68907e;

        /* renamed from: f */
        int f68908f;

        /* renamed from: g */
        private final List<C29123f> f68909g = new ArrayList();

        /* renamed from: h */
        private final AbstractC89426h f68910h;

        static {
            Covode.recordClassIndex(35475);
        }

        /* renamed from: e */
        private int m58168e() {
            return this.f68910h.mo143824h() & 255;
        }

        /* renamed from: c */
        public final List<C29123f> mo50818c() {
            ArrayList arrayList = new ArrayList(this.f68909g);
            this.f68909g.clear();
            return arrayList;
        }

        /* renamed from: d */
        private void m58166d() {
            this.f68909g.clear();
            Arrays.fill(this.f68905c, (Object) null);
            this.f68906d = this.f68905c.length - 1;
            this.f68907e = 0;
            this.f68908f = 0;
        }

        /* renamed from: f */
        private C89427i m58169f() {
            boolean z;
            int e = m58168e();
            if ((e & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int a = m58162a(e, 127);
            if (z) {
                return C89427i.m155136of(C29133j.f68933a.mo50824a(this.f68910h.mo143836k((long) a)));
            }
            return this.f68910h.mo143823g((long) a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo50816a() {
            int i = this.f68904b;
            int i2 = this.f68908f;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m58166d();
            } else {
                m58161a(i2 - i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo50817b() {
            while (!this.f68910h.mo143815e()) {
                int h = this.f68910h.mo143824h() & 255;
                if (h == 128) {
                    throw new IOException("index == 0");
                } else if ((h & 128) == 128) {
                    int a = m58162a(h, 127) - 1;
                    if (m58167d(a)) {
                        this.f68909g.add(C29125h.f68901a[a]);
                    } else {
                        int b = m58164b(a - C29125h.f68901a.length);
                        if (b >= 0) {
                            C29123f[] fVarArr = this.f68905c;
                            if (b <= fVarArr.length - 1) {
                                this.f68909g.add(fVarArr[b]);
                            }
                        }
                        throw new IOException("Header index too large " + (a + 1));
                    }
                } else if (h == 64) {
                    m58163a(new C29123f(C29125h.m58160a(m58169f()), m58169f()));
                } else if ((h & 64) == 64) {
                    m58163a(new C29123f(m58165c(m58162a(h, 63) - 1), m58169f()));
                } else if ((h & 32) == 32) {
                    int a2 = m58162a(h, 31);
                    this.f68904b = a2;
                    if (a2 < 0 || a2 > this.f68903a) {
                        throw new IOException("Invalid dynamic table size update " + this.f68904b);
                    }
                    mo50816a();
                } else if (h == 16 || h == 0) {
                    this.f68909g.add(new C29123f(C29125h.m58160a(m58169f()), m58169f()));
                } else {
                    this.f68909g.add(new C29123f(m58165c(m58162a(h, 15) - 1), m58169f()));
                }
            }
        }

        /* renamed from: b */
        private int m58164b(int i) {
            return this.f68906d + 1 + i;
        }

        /* renamed from: d */
        private static boolean m58167d(int i) {
            if (i < 0 || i > C29125h.f68901a.length - 1) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private C89427i m58165c(int i) {
            if (m58167d(i)) {
                return C29125h.f68901a[i].f68897h;
            }
            return this.f68905c[m58164b(i - C29125h.f68901a.length)].f68897h;
        }

        C29126a(AbstractC89408aa aaVar) {
            C29123f[] fVarArr = new C29123f[8];
            this.f68905c = fVarArr;
            this.f68906d = fVarArr.length - 1;
            this.f68907e = 0;
            this.f68908f = 0;
            this.f68903a = 4096;
            this.f68904b = 4096;
            this.f68910h = C89436q.m155160a(aaVar);
        }

        /* renamed from: a */
        private int m58161a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f68905c.length - 1;
                while (true) {
                    i2 = this.f68906d;
                    if (length < i2 || i <= 0) {
                        C29123f[] fVarArr = this.f68905c;
                        System.arraycopy(fVarArr, i2 + 1, fVarArr, i2 + 1 + i3, this.f68907e);
                        this.f68906d += i3;
                    } else {
                        i -= this.f68905c[length].f68899j;
                        this.f68908f -= this.f68905c[length].f68899j;
                        this.f68907e--;
                        i3++;
                        length--;
                    }
                }
                C29123f[] fVarArr2 = this.f68905c;
                System.arraycopy(fVarArr2, i2 + 1, fVarArr2, i2 + 1 + i3, this.f68907e);
                this.f68906d += i3;
            }
            return i3;
        }

        /* renamed from: a */
        private void m58163a(C29123f fVar) {
            this.f68909g.add(fVar);
            int i = fVar.f68899j;
            int i2 = this.f68904b;
            if (i > i2) {
                m58166d();
                return;
            }
            m58161a((this.f68908f + i) - i2);
            int i3 = this.f68907e + 1;
            C29123f[] fVarArr = this.f68905c;
            if (i3 > fVarArr.length) {
                C29123f[] fVarArr2 = new C29123f[(fVarArr.length * 2)];
                System.arraycopy(fVarArr, 0, fVarArr2, fVarArr.length, fVarArr.length);
                this.f68906d = this.f68905c.length - 1;
                this.f68905c = fVarArr2;
            }
            int i4 = this.f68906d;
            this.f68906d = i4 - 1;
            this.f68905c[i4] = fVar;
            this.f68907e++;
            this.f68908f += i;
        }

        /* renamed from: a */
        private int m58162a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int e = m58168e();
                if ((e & 128) == 0) {
                    return i2 + (e << i4);
                }
                i2 += (e & 127) << i4;
                i4 += 7;
            }
        }
    }

    static {
        Covode.recordClassIndex(35474);
        int i = 0;
        C29123f[] fVarArr = {new C29123f(C29123f.f68894e, ""), new C29123f(C29123f.f68891b, "GET"), new C29123f(C29123f.f68891b, "POST"), new C29123f(C29123f.f68892c, "/"), new C29123f(C29123f.f68892c, "/index.html"), new C29123f(C29123f.f68893d, "http"), new C29123f(C29123f.f68893d, "https"), new C29123f(C29123f.f68890a, "200"), new C29123f(C29123f.f68890a, "204"), new C29123f(C29123f.f68890a, "206"), new C29123f(C29123f.f68890a, "304"), new C29123f(C29123f.f68890a, "400"), new C29123f(C29123f.f68890a, "404"), new C29123f(C29123f.f68890a, "500"), new C29123f("accept-charset", ""), new C29123f("accept-encoding", "gzip, deflate"), new C29123f("accept-language", ""), new C29123f("accept-ranges", ""), new C29123f("accept", ""), new C29123f("access-control-allow-origin", ""), new C29123f("age", ""), new C29123f("allow", ""), new C29123f("authorization", ""), new C29123f("cache-control", ""), new C29123f("content-disposition", ""), new C29123f("content-encoding", ""), new C29123f("content-language", ""), new C29123f("content-length", ""), new C29123f("content-location", ""), new C29123f("content-range", ""), new C29123f("content-type", ""), new C29123f("cookie", ""), new C29123f("date", ""), new C29123f("etag", ""), new C29123f("expect", ""), new C29123f("expires", ""), new C29123f("from", ""), new C29123f("host", ""), new C29123f("if-match", ""), new C29123f("if-modified-since", ""), new C29123f("if-none-match", ""), new C29123f("if-range", ""), new C29123f("if-unmodified-since", ""), new C29123f("last-modified", ""), new C29123f("link", ""), new C29123f("location", ""), new C29123f("max-forwards", ""), new C29123f("proxy-authenticate", ""), new C29123f("proxy-authorization", ""), new C29123f("range", ""), new C29123f("referer", ""), new C29123f("refresh", ""), new C29123f("retry-after", ""), new C29123f("server", ""), new C29123f("set-cookie", ""), new C29123f("strict-transport-security", ""), new C29123f("transfer-encoding", ""), new C29123f("user-agent", ""), new C29123f("vary", ""), new C29123f("via", ""), new C29123f("www-authenticate", "")};
        f68901a = fVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fVarArr.length);
        while (true) {
            C29123f[] fVarArr2 = f68901a;
            if (i < fVarArr2.length) {
                if (!linkedHashMap.containsKey(fVarArr2[i].f68897h)) {
                    linkedHashMap.put(fVarArr2[i].f68897h, Integer.valueOf(i));
                }
                i++;
            } else {
                f68902b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: com.squareup.a.a.a.h$b */
    static final class C29127b {

        /* renamed from: a */
        private final C89420f f68911a;

        static {
            Covode.recordClassIndex(35476);
        }

        C29127b(C89420f fVar) {
            this.f68911a = fVar;
        }

        /* renamed from: a */
        private void m58174a(C89427i iVar) {
            m58173a(iVar.size(), 127);
            this.f68911a.mo68850a(iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo50819a(List<C29123f> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C89427i asciiLowercase = list.get(i).f68897h.toAsciiLowercase();
                Integer num = C29125h.f68902b.get(asciiLowercase);
                if (num != null) {
                    m58173a(num.intValue() + 1, 15);
                    m58174a(list.get(i).f68898i);
                } else {
                    this.f68911a.mo68847a(0);
                    m58174a(asciiLowercase);
                    m58174a(list.get(i).f68898i);
                }
            }
        }

        /* renamed from: a */
        private void m58173a(int i, int i2) {
            if (i < i2) {
                this.f68911a.mo68847a(i | 0);
                return;
            }
            this.f68911a.mo68847a(i2 | 0);
            int i3 = i - i2;
            while (i3 >= 128) {
                this.f68911a.mo68847a(128 | (i3 & 127));
                i3 >>>= 7;
            }
            this.f68911a.mo68847a(i3);
        }
    }

    /* renamed from: a */
    public static C89427i m58160a(C89427i iVar) {
        int size = iVar.size();
        for (int i = 0; i < size; i++) {
            byte b = iVar.getByte(i);
            if (b >= 65 && b <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.utf8());
            }
        }
        return iVar;
    }
}
