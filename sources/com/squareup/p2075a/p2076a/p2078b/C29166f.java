package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.AbstractC29251y;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import com.squareup.p2075a.EnumC29245u;
import com.squareup.p2075a.p2076a.C29206j;
import com.squareup.p2075a.p2076a.p2077a.C29104d;
import com.squareup.p2075a.p2076a.p2077a.C29119e;
import com.squareup.p2075a.p2076a.p2077a.C29123f;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89431l;
import p4632k.AbstractC89447y;
import p4632k.C89427i;
import p4632k.C89436q;

/* renamed from: com.squareup.a.a.b.f */
public final class C29166f implements AbstractC29175j {

    /* renamed from: b */
    private static final C89427i f69043b;

    /* renamed from: c */
    private static final C89427i f69044c;

    /* renamed from: d */
    private static final C89427i f69045d;

    /* renamed from: e */
    private static final C89427i f69046e;

    /* renamed from: f */
    private static final C89427i f69047f;

    /* renamed from: g */
    private static final C89427i f69048g;

    /* renamed from: h */
    private static final C89427i f69049h;

    /* renamed from: i */
    private static final C89427i f69050i;

    /* renamed from: j */
    private static final List<C89427i> f69051j;

    /* renamed from: k */
    private static final List<C89427i> f69052k;

    /* renamed from: l */
    private static final List<C89427i> f69053l;

    /* renamed from: m */
    private static final List<C89427i> f69054m;

    /* renamed from: a */
    public final C29185s f69055a;

    /* renamed from: n */
    private final C29104d f69056n;

    /* renamed from: o */
    private C29170h f69057o;

    /* renamed from: p */
    private C29119e f69058p;

    /* renamed from: com.squareup.a.a.b.f$a */
    class C29167a extends AbstractC89431l {
        static {
            Covode.recordClassIndex(35516);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, p4632k.AbstractC89431l, java.lang.AutoCloseable
        public final void close() {
            C29166f.this.f69055a.mo50891a(C29166f.this);
            super.close();
        }

        public C29167a(AbstractC89408aa aaVar) {
            super(aaVar);
        }
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: b */
    public final void mo50866b() {
        this.f69058p.mo50799d().close();
    }

    static {
        Covode.recordClassIndex(35515);
        C89427i encodeUtf8 = C89427i.encodeUtf8("connection");
        f69043b = encodeUtf8;
        C89427i encodeUtf82 = C89427i.encodeUtf8("host");
        f69044c = encodeUtf82;
        C89427i encodeUtf83 = C89427i.encodeUtf8("keep-alive");
        f69045d = encodeUtf83;
        C89427i encodeUtf84 = C89427i.encodeUtf8("proxy-connection");
        f69046e = encodeUtf84;
        C89427i encodeUtf85 = C89427i.encodeUtf8("transfer-encoding");
        f69047f = encodeUtf85;
        C89427i encodeUtf86 = C89427i.encodeUtf8("te");
        f69048g = encodeUtf86;
        C89427i encodeUtf87 = C89427i.encodeUtf8("encoding");
        f69049h = encodeUtf87;
        C89427i encodeUtf88 = C89427i.encodeUtf8("upgrade");
        f69050i = encodeUtf88;
        f69051j = C29206j.m58434a(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf85, C29123f.f68891b, C29123f.f68892c, C29123f.f68893d, C29123f.f68894e, C29123f.f68895f, C29123f.f68896g);
        f69052k = C29206j.m58434a(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf85);
        f69053l = C29206j.m58434a(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf86, encodeUtf85, encodeUtf87, encodeUtf88, C29123f.f68891b, C29123f.f68892c, C29123f.f68893d, C29123f.f68894e, C29123f.f68895f, C29123f.f68896g);
        f69054m = C29206j.m58434a(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf86, encodeUtf85, encodeUtf87, encodeUtf88);
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final C29249x.C29250a mo50858a() {
        if (this.f69056n.f68800b != EnumC29245u.HTTP_2) {
            return m58287a(this.f69058p.mo50797c());
        }
        List<C29123f> c = this.f69058p.mo50797c();
        String str = null;
        C29235p.C29236a aVar = new C29235p.C29236a();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            C89427i iVar = c.get(i).f68897h;
            String utf8 = c.get(i).f68898i.utf8();
            if (iVar.equals(C29123f.f68890a)) {
                str = utf8;
            } else if (!f69054m.contains(iVar)) {
                aVar.mo50984a(iVar.utf8(), utf8);
            }
        }
        if (str != null) {
            C29184r a = C29184r.m58339a("HTTP/1.1 ".concat(String.valueOf(str)));
            C29249x.C29250a aVar2 = new C29249x.C29250a();
            aVar2.f69362b = EnumC29245u.HTTP_2;
            aVar2.f69363c = a.f69114b;
            aVar2.f69364d = a.f69115c;
            return aVar2.mo51035a(aVar.mo50985a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final void mo50862a(C29170h hVar) {
        this.f69057o = hVar;
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final void mo50863a(C29181o oVar) {
        oVar.mo50883a(this.f69058p.mo50799d());
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final AbstractC29251y mo50859a(C29249x xVar) {
        return new C29178l(xVar.f69355f, C89436q.m155160a(new C29167a(this.f69058p.f68872g)));
    }

    /* renamed from: a */
    private static C29249x.C29250a m58287a(List<C29123f> list) {
        C29235p.C29236a aVar = new C29235p.C29236a();
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i = 0; i < size; i++) {
            C89427i iVar = list.get(i).f68897h;
            String utf8 = list.get(i).f68898i.utf8();
            int i2 = 0;
            while (i2 < utf8.length()) {
                int indexOf = utf8.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = utf8.length();
                }
                String substring = utf8.substring(i2, indexOf);
                if (iVar.equals(C29123f.f68890a)) {
                    str = substring;
                } else if (iVar.equals(C29123f.f68896g)) {
                    str2 = substring;
                } else if (!f69052k.contains(iVar)) {
                    aVar.mo50984a(iVar.utf8(), substring);
                }
                i2 = indexOf + 1;
            }
        }
        if (str != null) {
            C29184r a = C29184r.m58339a(str2 + " " + str);
            C29249x.C29250a aVar2 = new C29249x.C29250a();
            aVar2.f69362b = EnumC29245u.SPDY_3;
            aVar2.f69363c = a.f69114b;
            aVar2.f69364d = a.f69115c;
            return aVar2.mo51035a(aVar.mo50985a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: b */
    private static List<C29123f> m58288b(C29246v vVar) {
        C29235p pVar = vVar.f69340c;
        ArrayList arrayList = new ArrayList((pVar.f69280a.length / 2) + 5);
        arrayList.add(new C29123f(C29123f.f68891b, vVar.f69339b));
        arrayList.add(new C29123f(C29123f.f68892c, C29180n.m58330a(vVar.f69338a)));
        arrayList.add(new C29123f(C29123f.f68896g, "HTTP/1.1"));
        arrayList.add(new C29123f(C29123f.f68895f, C29206j.m58431a(vVar.f69338a)));
        arrayList.add(new C29123f(C29123f.f68893d, vVar.f69338a.f69283a));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = pVar.f69280a.length / 2;
        for (int i = 0; i < length; i++) {
            C89427i encodeUtf8 = C89427i.encodeUtf8(pVar.mo50977a(i).toLowerCase(Locale.US));
            if (!f69051j.contains(encodeUtf8)) {
                String b = pVar.mo50979b(i);
                if (linkedHashSet.add(encodeUtf8)) {
                    arrayList.add(new C29123f(encodeUtf8, b));
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (((C29123f) arrayList.get(i2)).f68897h.equals(encodeUtf8)) {
                            arrayList.set(i2, new C29123f(encodeUtf8, ((C29123f) arrayList.get(i2)).f68898i.utf8() + (char) 0 + b));
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final void mo50865a(C29246v vVar) {
        List<C29123f> list;
        if (this.f69058p == null) {
            this.f69057o.mo50872a();
            boolean c = C29174i.m58312c(vVar.f69339b);
            if (this.f69056n.f68800b == EnumC29245u.HTTP_2) {
                C29235p pVar = vVar.f69340c;
                list = new ArrayList<>((pVar.f69280a.length / 2) + 4);
                list.add(new C29123f(C29123f.f68891b, vVar.f69339b));
                list.add(new C29123f(C29123f.f68892c, C29180n.m58330a(vVar.f69338a)));
                list.add(new C29123f(C29123f.f68894e, C29206j.m58431a(vVar.f69338a)));
                list.add(new C29123f(C29123f.f68893d, vVar.f69338a.f69283a));
                int length = pVar.f69280a.length / 2;
                for (int i = 0; i < length; i++) {
                    C89427i encodeUtf8 = C89427i.encodeUtf8(pVar.mo50977a(i).toLowerCase(Locale.US));
                    if (!f69053l.contains(encodeUtf8)) {
                        list.add(new C29123f(encodeUtf8, pVar.mo50979b(i)));
                    }
                }
            } else {
                list = m58288b(vVar);
            }
            C29119e a = this.f69056n.mo50778a(list, c);
            this.f69058p = a;
            a.f68874i.mo143784a((long) this.f69057o.f69065b.f69334y, TimeUnit.MILLISECONDS);
            this.f69058p.f68875j.mo143784a((long) this.f69057o.f69065b.f69335z, TimeUnit.MILLISECONDS);
        }
    }

    public C29166f(C29185s sVar, C29104d dVar) {
        this.f69055a = sVar;
        this.f69056n = dVar;
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final AbstractC89447y mo50861a(C29246v vVar, long j) {
        return this.f69058p.mo50799d();
    }
}
