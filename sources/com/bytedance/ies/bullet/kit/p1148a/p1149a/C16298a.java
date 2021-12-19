package com.bytedance.ies.bullet.kit.p1148a.p1149a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.C16361l;
import com.bytedance.ies.bullet.kit.p1148a.C16362m;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.kakao.usermgmt.StringSet;
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

/* renamed from: com.bytedance.ies.bullet.kit.a.a.a */
public final class C16298a extends IXResourceLoader {

    /* renamed from: a */
    private final String f39144a = "BuildIn";

    static {
        Covode.recordClassIndex(18591);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final String getTAG() {
        return this.f39144a;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.a$a */
    static final class C16299a extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16298a f39145a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f39146b;

        /* renamed from: c */
        final /* synthetic */ C16610ap f39147c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f39148d;

        static {
            Covode.recordClassIndex(18592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16299a(C16298a aVar, C89233z.C89238e eVar, C16610ap apVar, CountDownLatch countDownLatch) {
            super(1);
            this.f39145a = aVar;
            this.f39146b = eVar;
            this.f39147c = apVar;
            this.f39148d = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.ies.bullet.service.base.ap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            C89219l.m154719c(apVar, "");
            this.f39146b.element = apVar;
            JSONArray jSONArray = this.f39147c.f39753m;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f39145a.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            this.f39148d.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.a$b */
    static final class C16300b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16298a f39149a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39150b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f39151c;

        static {
            Covode.recordClassIndex(18593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16300b(C16298a aVar, C16610ap apVar, CountDownLatch countDownLatch) {
            super(1);
            this.f39149a = aVar;
            this.f39150b = apVar;
            this.f39151c = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            JSONArray jSONArray = this.f39150b.f39753m;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f39149a.getTAG());
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            this.f39151c.countDown();
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[SYNTHETIC, Splitter:B:32:0x0086] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.ies.bullet.kit.p1148a.C16361l m30309a(android.net.Uri r9) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p1148a.p1149a.C16298a.m30309a(android.net.Uri):com.bytedance.ies.bullet.kit.a.l");
    }

    /* renamed from: a */
    private final C16361l m30310a(String str) {
        String substring;
        AbstractC16576j.C16578b.m30778a(this, "interceptAssetRequest# url=".concat(String.valueOf(str)), null, null, 6);
        C16666i a = C16343g.C16345b.f39286a.mo25918a(getService());
        if (a.f39830i.isEmpty()) {
            Uri parse = Uri.parse(str);
            C89219l.m154709a((Object) parse, "");
            return new C16361l(parse);
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = a.f39830i;
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            if (C16326f.m30334a((String) t)) {
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
                    return m30309a(C16362m.m30383c(substring));
                }
            }
        }
        Uri parse2 = Uri.parse(str);
        C89219l.m154709a((Object) parse2, "");
        return new C16361l(parse2);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final C16610ap loadSync(C16610ap apVar, C16667j jVar) {
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(jVar, "");
        AbstractC16576j.C16578b.m30778a(this, "start to sync load from assets", null, null, 6);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(apVar, jVar, new C16299a(this, eVar, apVar, countDownLatch), new C16300b(this, apVar, countDownLatch));
        countDownLatch.await(jVar.f39841i, TimeUnit.MILLISECONDS);
        return eVar.element;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01dc  */
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadAsync(com.bytedance.ies.bullet.service.base.C16610ap r15, com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j r16, p4600h.p4611f.p4612a.AbstractC89172b<? super com.bytedance.ies.bullet.service.base.C16610ap, p4600h.C89391z> r17, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Throwable, p4600h.C89391z> r18) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p1148a.p1149a.C16298a.loadAsync(com.bytedance.ies.bullet.service.base.ap, com.bytedance.ies.bullet.service.base.resourceloader.config.j, h.f.a.b, h.f.a.b):void");
    }
}
