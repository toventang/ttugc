package com.bytedance.lynx.hybrid.resource.p1526b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.C21303f;
import com.bytedance.lynx.hybrid.resource.C21335j;
import com.bytedance.lynx.hybrid.resource.C21343n;
import com.bytedance.lynx.hybrid.resource.C21344o;
import com.bytedance.lynx.hybrid.resource.C21345p;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1528d.C21290a;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21293d;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21298h;
import com.bytedance.lynx.hybrid.resource.p1535i.C21334c;
import com.kakao.usermgmt.StringSet;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.resource.b.a */
public final class C21235a extends IHybridResourceLoader {

    /* renamed from: a */
    private final String f50395a = "BuildIn";

    static {
        Covode.recordClassIndex(24851);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final String getTAG() {
        return this.f50395a;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.a$a */
    static final class C21236a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21235a f50396a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f50397b;

        /* renamed from: c */
        final /* synthetic */ C21294e f50398c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f50399d;

        static {
            Covode.recordClassIndex(24852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21236a(C21235a aVar, C89233z.C89238e eVar, C21294e eVar2, CountDownLatch countDownLatch) {
            super(1);
            this.f50396a = aVar;
            this.f50397b = eVar;
            this.f50398c = eVar2;
            this.f50399d = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.lynx.hybrid.resource.d.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            C89219l.m154719c(eVar, "");
            this.f50397b.element = eVar;
            JSONArray jSONArray = this.f50398c.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50396a.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            this.f50399d.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.a$b */
    static final class C21237b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21235a f50400a;

        /* renamed from: b */
        final /* synthetic */ C21294e f50401b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f50402c;

        static {
            Covode.recordClassIndex(24853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21237b(C21235a aVar, C21294e eVar, CountDownLatch countDownLatch) {
            super(1);
            this.f50400a = aVar;
            this.f50401b = eVar;
            this.f50402c = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            JSONArray jSONArray = this.f50401b.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50400a.getTAG());
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            this.f50402c.countDown();
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[SYNTHETIC, Splitter:B:32:0x0086] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.lynx.hybrid.resource.C21343n m39946a(android.net.Uri r9) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.p1526b.C21235a.m39946a(android.net.Uri):com.bytedance.lynx.hybrid.resource.n");
    }

    /* renamed from: a */
    private final C21343n m39947a(String str) {
        String substring;
        C21210c.m39925a("interceptAssetRequest# url=".concat(String.valueOf(str)), (EnumC21209b) null, (String) null, 6);
        C21277c a = C21303f.C21305b.f50578a.mo34909a(getService());
        if (a.f50502i.isEmpty()) {
            Uri parse = Uri.parse(str);
            C89219l.m154709a((Object) parse, "");
            return new C21343n(parse);
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = a.f50502i;
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            if (C21263f.m39968a(t)) {
                Pattern compile = Pattern.compile(t);
                C89219l.m154709a((Object) compile, "");
                arrayList.add(compile);
            }
            arrayList2.add(C89391z.f203057a);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Matcher matcher = ((Pattern) arrayList.get(i)).matcher(str);
            if (matcher.find()) {
                int a2 = C89361p.m154888a((CharSequence) str, "?", 0, false, 6);
                int a3 = C89361p.m154888a((CharSequence) str, "#", 0, false, 6);
                int c = C89271h.m154772c(a2, a3);
                if (c == -1) {
                    c = C89271h.m154769b(a2, a3);
                }
                if (c != -1) {
                    int end = matcher.end();
                    if (str != null) {
                        substring = str.substring(end, c);
                        C89219l.m154709a((Object) substring, "");
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    int end2 = matcher.end();
                    if (str != null) {
                        substring = str.substring(end2);
                        C89219l.m154709a((Object) substring, "");
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                if (C89361p.m154876c(substring, "/", false)) {
                    substring = substring.substring(0, substring.length() - 1);
                    C89219l.m154709a((Object) substring, "");
                }
                if (!TextUtils.isEmpty(substring)) {
                    return m39946a(C21344o.m40088b(substring));
                }
            }
        }
        Uri parse2 = Uri.parse(str);
        C89219l.m154709a((Object) parse2, "");
        return new C21343n(parse2);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final C21294e loadSync(C21294e eVar, C21284j jVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(jVar, "");
        C21210c.m39925a("start to sync load from assets", (EnumC21209b) null, (String) null, 6);
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(eVar, jVar, new C21236a(this, eVar2, eVar, countDownLatch), new C21237b(this, eVar, countDownLatch));
        countDownLatch.await(jVar.f50513d, TimeUnit.MILLISECONDS);
        return eVar2.element;
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void loadAsync(C21294e eVar, C21284j jVar, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        String str;
        String str2;
        InputStream inputStream;
        String str3;
        Uri uri;
        String str4;
        Uri uri2;
        String str5 = "";
        C89219l.m154719c(eVar, str5);
        C89219l.m154719c(jVar, str5);
        C89219l.m154719c(bVar, str5);
        C89219l.m154719c(bVar2, str5);
        new C21334c();
        InputStream inputStream2 = null;
        C21210c.m39925a("start to async load from assets", (EnumC21209b) null, (String) null, 6);
        if (!jVar.f50521l) {
            if (eVar instanceof C21335j) {
                ((C21335j) eVar).mo34936a("buildIn disable");
            }
            bVar2.invoke(new Throwable("buildIn disable"));
            return;
        }
        if (jVar.f50516g.length() == 0) {
            C21290a aVar = eVar.f50554u;
            if (aVar == null || (str = aVar.mo34894a()) == null) {
                str = str5;
            }
        } else {
            str = jVar.f50516g;
        }
        if (jVar.f50517h.length() == 0) {
            C21290a aVar2 = eVar.f50554u;
            if (aVar2 == null || (str2 = aVar2.mo34895b()) == null) {
                str2 = str5;
            }
        } else {
            str2 = jVar.f50517h;
        }
        if (str.length() == 0) {
            if (eVar instanceof C21335j) {
                ((C21335j) eVar).mo34936a("buildIn Channel/Bundle invalid");
            }
            bVar2.invoke(new Exception("buildIn Channel/Bundle invalid"));
            return;
        }
        try {
            C21343n a = m39946a(C21344o.m40088b(C21263f.m39967a(str, str2)));
            C21345p b = a.mo34950b();
            if (b != null) {
                inputStream = b.f50695a;
            } else {
                inputStream = null;
            }
            if (inputStream == null) {
                String uri3 = eVar.f50546m.toString();
                C89219l.m154709a((Object) uri3, str5);
                C21343n a2 = m39947a(uri3);
                C21345p b2 = a2.mo34950b();
                if (b2 == null || b2.f50695a == null) {
                    if (eVar instanceof C21335j) {
                        ((C21335j) eVar).mo34936a("buildIn File Not Found");
                    }
                    bVar2.invoke(new FileNotFoundException("buildIn File Not Found"));
                    return;
                }
                C21345p b3 = a2.mo34950b();
                if (b3 == null || (uri2 = b3.f50697c) == null || (str4 = uri2.getPath()) == null) {
                    str4 = str5;
                }
                C89219l.m154709a((Object) str4, str5);
                if (C21263f.m39968a(str4)) {
                    String substring = str4.substring(1, str4.length());
                    C89219l.m154709a((Object) substring, str5);
                    str5 = substring;
                }
                eVar.f50547n = str5;
                if (b3 != null) {
                    inputStream2 = b3.f50695a;
                }
                eVar.f50553t = inputStream2;
                eVar.f50548o = EnumC21298h.ASSET;
                eVar.f50549p = EnumC21293d.BUILTIN;
                eVar.f50550q = true;
                JSONArray jSONArray = eVar.f50545l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, "BUILDIN");
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
                bVar.invoke(eVar);
                return;
            }
            C21345p b4 = a.mo34950b();
            JSONArray jSONArray2 = eVar.f50545l;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "BUILDIN");
            jSONObject2.put("status", "success");
            jSONArray2.put(jSONObject2);
            if (b4 == null || (uri = b4.f50697c) == null || (str3 = uri.getPath()) == null) {
                str3 = str5;
            }
            C89219l.m154709a((Object) str3, str5);
            if (C21263f.m39968a(str3)) {
                String substring2 = str3.substring(1, str3.length());
                C89219l.m154709a((Object) substring2, str5);
                str5 = substring2;
            }
            eVar.f50547n = str5;
            if (b4 != null) {
                inputStream2 = b4.f50695a;
            }
            eVar.f50553t = inputStream2;
            eVar.f50548o = EnumC21298h.ASSET;
            eVar.f50549p = EnumC21293d.BUILTIN;
            eVar.f50550q = true;
            bVar.invoke(eVar);
        } catch (Exception e) {
            if (eVar instanceof C21335j) {
                ((C21335j) eVar).mo34936a("buildIn " + e.getMessage());
            }
            bVar2.invoke(e);
        }
    }
}
