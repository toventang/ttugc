package okhttp3.internal.p4657e;

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
/* renamed from: okhttp3.internal.e.d */
public final class C90112d {

    /* renamed from: a */
    static final C90110c[] f204533a;

    /* renamed from: b */
    static final Map<C89427i, Integer> f204534b;

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.e.d$a */
    public static final class C90113a {

        /* renamed from: a */
        public int f204535a;

        /* renamed from: b */
        C90110c[] f204536b;

        /* renamed from: c */
        int f204537c;

        /* renamed from: d */
        int f204538d;

        /* renamed from: e */
        int f204539e;

        /* renamed from: f */
        private final List<C90110c> f204540f;

        /* renamed from: g */
        private final AbstractC89426h f204541g;

        /* renamed from: h */
        private final int f204542h;

        static {
            Covode.recordClassIndex(106285);
        }

        /* renamed from: e */
        private int m156491e() {
            return this.f204541g.mo143824h() & 255;
        }

        /* renamed from: b */
        public final List<C90110c> mo144872b() {
            ArrayList arrayList = new ArrayList(this.f204540f);
            this.f204540f.clear();
            return arrayList;
        }

        /* renamed from: c */
        private void m156488c() {
            int i = this.f204535a;
            int i2 = this.f204539e;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m156489d();
            } else {
                m156483a(i2 - i);
            }
        }

        /* renamed from: d */
        private void m156489d() {
            Arrays.fill(this.f204536b, (Object) null);
            this.f204537c = this.f204536b.length - 1;
            this.f204538d = 0;
            this.f204539e = 0;
        }

        /* renamed from: f */
        private C89427i m156492f() {
            boolean z;
            int e = m156491e();
            if ((e & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int a = m156484a(e, 127);
            if (z) {
                return C89427i.m155136of(C90143k.f204682a.mo144928a(this.f204541g.mo143836k((long) a)));
            }
            return this.f204541g.mo143823g((long) a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo144871a() {
            while (!this.f204541g.mo143815e()) {
                int h = this.f204541g.mo143824h() & 255;
                if (h == 128) {
                    throw new IOException("index == 0");
                } else if ((h & 128) == 128) {
                    int a = m156484a(h, 127) - 1;
                    if (m156490d(a)) {
                        this.f204540f.add(C90112d.f204533a[a]);
                    } else {
                        int b = m156486b(a - C90112d.f204533a.length);
                        if (b >= 0) {
                            C90110c[] cVarArr = this.f204536b;
                            if (b < cVarArr.length) {
                                this.f204540f.add(cVarArr[b]);
                            }
                        }
                        throw new IOException("Header index too large " + (a + 1));
                    }
                } else if (h == 64) {
                    m156485a(new C90110c(C90112d.m156482a(m156492f()), m156492f()));
                } else if ((h & 64) == 64) {
                    m156485a(new C90110c(m156487c(m156484a(h, 63) - 1), m156492f()));
                } else if ((h & 32) == 32) {
                    int a2 = m156484a(h, 31);
                    this.f204535a = a2;
                    if (a2 < 0 || a2 > this.f204542h) {
                        throw new IOException("Invalid dynamic table size update " + this.f204535a);
                    }
                    m156488c();
                } else if (h == 16 || h == 0) {
                    this.f204540f.add(new C90110c(C90112d.m156482a(m156492f()), m156492f()));
                } else {
                    this.f204540f.add(new C90110c(m156487c(m156484a(h, 15) - 1), m156492f()));
                }
            }
        }

        C90113a(AbstractC89408aa aaVar) {
            this(aaVar, (byte) 0);
        }

        /* renamed from: b */
        private int m156486b(int i) {
            return this.f204537c + 1 + i;
        }

        /* renamed from: d */
        private static boolean m156490d(int i) {
            if (i < 0 || i > C90112d.f204533a.length - 1) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private int m156483a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f204536b.length - 1;
                while (true) {
                    i2 = this.f204537c;
                    if (length < i2 || i <= 0) {
                        C90110c[] cVarArr = this.f204536b;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f204538d);
                        this.f204537c += i3;
                    } else {
                        i -= this.f204536b[length].f204532i;
                        this.f204539e -= this.f204536b[length].f204532i;
                        this.f204538d--;
                        i3++;
                        length--;
                    }
                }
                C90110c[] cVarArr2 = this.f204536b;
                System.arraycopy(cVarArr2, i2 + 1, cVarArr2, i2 + 1 + i3, this.f204538d);
                this.f204537c += i3;
            }
            return i3;
        }

        /* renamed from: c */
        private C89427i m156487c(int i) {
            if (m156490d(i)) {
                return C90112d.f204533a[i].f204530g;
            }
            int b = m156486b(i - C90112d.f204533a.length);
            if (b >= 0) {
                C90110c[] cVarArr = this.f204536b;
                if (b < cVarArr.length) {
                    return cVarArr[b].f204530g;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: a */
        private void m156485a(C90110c cVar) {
            this.f204540f.add(cVar);
            int i = cVar.f204532i;
            int i2 = this.f204535a;
            if (i > i2) {
                m156489d();
                return;
            }
            m156483a((this.f204539e + i) - i2);
            int i3 = this.f204538d + 1;
            C90110c[] cVarArr = this.f204536b;
            if (i3 > cVarArr.length) {
                C90110c[] cVarArr2 = new C90110c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f204537c = this.f204536b.length - 1;
                this.f204536b = cVarArr2;
            }
            int i4 = this.f204537c;
            this.f204537c = i4 - 1;
            this.f204536b[i4] = cVar;
            this.f204538d++;
            this.f204539e += i;
        }

        /* renamed from: a */
        private int m156484a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int e = m156491e();
                if ((e & 128) == 0) {
                    return i2 + (e << i4);
                }
                i2 += (e & 127) << i4;
                i4 += 7;
            }
        }

        private C90113a(AbstractC89408aa aaVar, byte b) {
            this.f204540f = new ArrayList();
            C90110c[] cVarArr = new C90110c[8];
            this.f204536b = cVarArr;
            this.f204537c = cVarArr.length - 1;
            this.f204538d = 0;
            this.f204539e = 0;
            this.f204542h = 4096;
            this.f204535a = 4096;
            this.f204541g = C89436q.m155160a(aaVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.e.d$b */
    public static final class C90114b {

        /* renamed from: a */
        int f204543a;

        /* renamed from: b */
        int f204544b;

        /* renamed from: c */
        C90110c[] f204545c;

        /* renamed from: d */
        int f204546d;

        /* renamed from: e */
        int f204547e;

        /* renamed from: f */
        int f204548f;

        /* renamed from: g */
        private final C89420f f204549g;

        /* renamed from: h */
        private final boolean f204550h;

        /* renamed from: i */
        private int f204551i;

        /* renamed from: j */
        private boolean f204552j;

        static {
            Covode.recordClassIndex(106286);
        }

        /* renamed from: a */
        private void m156495a() {
            Arrays.fill(this.f204545c, (Object) null);
            this.f204546d = this.f204545c.length - 1;
            this.f204547e = 0;
            this.f204548f = 0;
        }

        C90114b(C89420f fVar) {
            this(fVar, (byte) 0);
        }

        /* renamed from: a */
        private void m156497a(C89427i iVar) {
            if (!this.f204550h || C90143k.m156602a(iVar) >= iVar.size()) {
                m156496a(iVar.size(), 127, 0);
                this.f204549g.mo68850a(iVar);
                return;
            }
            C89420f fVar = new C89420f();
            C90143k.m156604a(iVar, fVar);
            C89427i q = fVar.mo143847q();
            m156496a(q.size(), 127, 128);
            this.f204549g.mo68850a(q);
        }

        /* renamed from: b */
        private int m156499b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f204545c.length - 1;
                while (true) {
                    i2 = this.f204546d;
                    if (length < i2 || i <= 0) {
                        C90110c[] cVarArr = this.f204545c;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f204547e);
                        C90110c[] cVarArr2 = this.f204545c;
                        int i4 = this.f204546d;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f204546d += i3;
                    } else {
                        i -= this.f204545c[length].f204532i;
                        this.f204548f -= this.f204545c[length].f204532i;
                        this.f204547e--;
                        i3++;
                        length--;
                    }
                }
                C90110c[] cVarArr3 = this.f204545c;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + i3, this.f204547e);
                C90110c[] cVarArr22 = this.f204545c;
                int i42 = this.f204546d;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f204546d += i3;
            }
            return i3;
        }

        /* renamed from: a */
        private void m156498a(C90110c cVar) {
            int i = cVar.f204532i;
            int i2 = this.f204544b;
            if (i > i2) {
                m156495a();
                return;
            }
            m156499b((this.f204548f + i) - i2);
            int i3 = this.f204547e + 1;
            C90110c[] cVarArr = this.f204545c;
            if (i3 > cVarArr.length) {
                C90110c[] cVarArr2 = new C90110c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f204546d = this.f204545c.length - 1;
                this.f204545c = cVarArr2;
            }
            int i4 = this.f204546d;
            this.f204546d = i4 - 1;
            this.f204545c[i4] = cVar;
            this.f204547e++;
            this.f204548f += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo144873a(int i) {
            this.f204543a = i;
            int min = Math.min(i, 16384);
            int i2 = this.f204544b;
            if (i2 != min) {
                if (min < i2) {
                    this.f204551i = Math.min(this.f204551i, min);
                }
                this.f204552j = true;
                this.f204544b = min;
                int i3 = this.f204548f;
                if (min >= i3) {
                    return;
                }
                if (min == 0) {
                    m156495a();
                } else {
                    m156499b(i3 - min);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
            if (r9 == -1) goto L_0x005b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo144874a(java.util.List<okhttp3.internal.p4657e.C90110c> r13) {
            /*
            // Method dump skipped, instructions count: 238
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4657e.C90112d.C90114b.mo144874a(java.util.List):void");
        }

        private C90114b(C89420f fVar, byte b) {
            this.f204551i = Integer.MAX_VALUE;
            C90110c[] cVarArr = new C90110c[8];
            this.f204545c = cVarArr;
            this.f204546d = cVarArr.length - 1;
            this.f204543a = 4096;
            this.f204544b = 4096;
            this.f204550h = true;
            this.f204549g = fVar;
        }

        /* renamed from: a */
        private void m156496a(int i, int i2, int i3) {
            if (i < i2) {
                this.f204549g.mo68847a(i | i3);
                return;
            }
            this.f204549g.mo68847a(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f204549g.mo68847a(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f204549g.mo68847a(i4);
        }
    }

    static {
        Covode.recordClassIndex(106284);
        int i = 0;
        C90110c[] cVarArr = {new C90110c(C90110c.f204529f, ""), new C90110c(C90110c.f204526c, "GET"), new C90110c(C90110c.f204526c, "POST"), new C90110c(C90110c.f204527d, "/"), new C90110c(C90110c.f204527d, "/index.html"), new C90110c(C90110c.f204528e, "http"), new C90110c(C90110c.f204528e, "https"), new C90110c(C90110c.f204525b, "200"), new C90110c(C90110c.f204525b, "204"), new C90110c(C90110c.f204525b, "206"), new C90110c(C90110c.f204525b, "304"), new C90110c(C90110c.f204525b, "400"), new C90110c(C90110c.f204525b, "404"), new C90110c(C90110c.f204525b, "500"), new C90110c("accept-charset", ""), new C90110c("accept-encoding", "gzip, deflate"), new C90110c("accept-language", ""), new C90110c("accept-ranges", ""), new C90110c("accept", ""), new C90110c("access-control-allow-origin", ""), new C90110c("age", ""), new C90110c("allow", ""), new C90110c("authorization", ""), new C90110c("cache-control", ""), new C90110c("content-disposition", ""), new C90110c("content-encoding", ""), new C90110c("content-language", ""), new C90110c("content-length", ""), new C90110c("content-location", ""), new C90110c("content-range", ""), new C90110c("content-type", ""), new C90110c("cookie", ""), new C90110c("date", ""), new C90110c("etag", ""), new C90110c("expect", ""), new C90110c("expires", ""), new C90110c("from", ""), new C90110c("host", ""), new C90110c("if-match", ""), new C90110c("if-modified-since", ""), new C90110c("if-none-match", ""), new C90110c("if-range", ""), new C90110c("if-unmodified-since", ""), new C90110c("last-modified", ""), new C90110c("link", ""), new C90110c("location", ""), new C90110c("max-forwards", ""), new C90110c("proxy-authenticate", ""), new C90110c("proxy-authorization", ""), new C90110c("range", ""), new C90110c("referer", ""), new C90110c("refresh", ""), new C90110c("retry-after", ""), new C90110c("server", ""), new C90110c("set-cookie", ""), new C90110c("strict-transport-security", ""), new C90110c("transfer-encoding", ""), new C90110c("user-agent", ""), new C90110c("vary", ""), new C90110c("via", ""), new C90110c("www-authenticate", "")};
        f204533a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        while (true) {
            C90110c[] cVarArr2 = f204533a;
            if (i < cVarArr2.length) {
                if (!linkedHashMap.containsKey(cVarArr2[i].f204530g)) {
                    linkedHashMap.put(cVarArr2[i].f204530g, Integer.valueOf(i));
                }
                i++;
            } else {
                f204534b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: a */
    static C89427i m156482a(C89427i iVar) {
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
