package com.bytedance.ies.bullet.kit.p1148a;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16298a;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16301b;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16312e;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16326f;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16327g;
import com.bytedance.ies.bullet.kit.p1148a.p1150b.C16329a;
import com.bytedance.ies.bullet.kit.p1148a.p1150b.C16335b;
import com.bytedance.ies.bullet.kit.p1148a.p1151c.C16337a;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16600aj;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.EnumC16609ao;
import com.bytedance.ies.bullet.service.base.EnumC16636e;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.bullet.service.base.p1168e.C16639c;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.EnumC16662e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.kit.a.j */
public final class C16350j extends C16616a implements IResourceLoaderService {

    /* renamed from: c */
    public static final C16351a f39298c = new C16351a((byte) 0);

    /* renamed from: a */
    public C16666i f39299a;

    /* renamed from: b */
    public final Map<C16600aj, C16337a> f39300b = new LinkedHashMap();

    /* renamed from: f */
    private final List<Class<? extends IXResourceLoader>> f39301f = new ArrayList();

    /* renamed from: g */
    private final List<Class<? extends IXResourceLoader>> f39302g = new ArrayList();

    /* renamed from: h */
    private boolean f39303h;

    /* renamed from: i */
    private int f39304i;

    /* renamed from: j */
    private final List<EnumC16662e> f39305j = C89070n.m154524c(EnumC16662e.GECKO, EnumC16662e.BUILTIN, EnumC16662e.CDN);

    /* renamed from: k */
    private final AbstractC89244h f39306k = C89250i.m154773a((AbstractC89171a) new C16356f(this));

    static {
        Covode.recordClassIndex(18643);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void deleteResource(C16610ap apVar) {
        C89219l.m154719c(apVar, "");
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j, com.bytedance.ies.bullet.service.base.p1164b.C16616a
    public final C16587q getLoggerWrapper() {
        return (C16587q) this.f39306k.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.j$a */
    public static final class C16351a {
        static {
            Covode.recordClassIndex(18644);
        }

        private C16351a() {
        }

        public /* synthetic */ C16351a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final C16666i getResourceConfig() {
        C16666i iVar = this.f39299a;
        if (iVar == null) {
            C89219l.m154710a("mConfig");
        }
        return iVar;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.j$f */
    static final class C16356f extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ C16350j f39331a;

        static {
            Covode.recordClassIndex(18649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16356f(C16350j jVar) {
            super(0);
            this.f39331a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            return new C16587q((AbstractC16652m) C16622e.C16623a.m30858a().mo26347a(this.f39331a.f39774d, AbstractC16652m.class), "res-Service");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.a.j$h */
    public static final class CallableC16358h<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16350j f39336a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39337b;

        static {
            Covode.recordClassIndex(18651);
        }

        CallableC16358h(C16350j jVar, C16610ap apVar) {
            this.f39336a = jVar;
            this.f39337b = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            AbstractC16654o oVar;
            if (!(this.f39337b.f39752l.f39743h == null || (oVar = (AbstractC16654o) this.f39336a.mo26380a(AbstractC16654o.class)) == null)) {
                C16607an anVar = this.f39337b.f39752l;
                C16666i a = C16350j.m30370a(this.f39336a);
                String uri = this.f39337b.f39754n.toString();
                C89219l.m154709a((Object) uri, "");
                anVar.f39744i = Boolean.valueOf(C16363n.m30385a(a, uri));
                oVar.mo26319a(anVar);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final Map<String, String> getPreloadConfigs() {
        C16666i iVar = this.f39299a;
        if (iVar == null) {
            C89219l.m154710a("mConfig");
        }
        String accessKey = iVar.f39834m.getAccessKey();
        GeckoConfig a = C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(this), accessKey);
        return a.getLoaderDepender().mo25882a(a.getOfflineDir(), accessKey);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.a.j$g */
    public static final class CallableC16357g<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16350j f39332a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39333b;

        /* renamed from: c */
        final /* synthetic */ C16667j f39334c;

        /* renamed from: d */
        final /* synthetic */ String f39335d;

        static {
            Covode.recordClassIndex(18650);
        }

        CallableC16357g(C16350j jVar, C16610ap apVar, C16667j jVar2, String str) {
            this.f39332a = jVar;
            this.f39333b = apVar;
            this.f39334c = jVar2;
            this.f39335d = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            AbstractC16654o oVar;
            Object obj;
            C16363n.m30384a(this.f39333b, this.f39334c);
            if (this.f39333b.f39760t && (oVar = (AbstractC16654o) this.f39332a.mo26380a(AbstractC16654o.class)) != null) {
                String str = null;
                C16607an anVar = new C16607an("bdx_resourceloader_fetch", null, null, 254);
                try {
                    obj = C89379q.m157068constructorimpl(this.f39333b.f39754n.getQueryParameter("surl"));
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                if (!C89379q.m157073isFailureimpl(obj)) {
                    str = obj;
                }
                String str2 = str;
                if (str2 == null) {
                    str2 = this.f39333b.f39754n.toString();
                }
                anVar.f39740e = str2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_url", this.f39333b.f39754n.toString());
                jSONObject.put("res_state", "fail");
                jSONObject.put("res_message", this.f39335d);
                C16610ap apVar = this.f39333b;
                if (apVar instanceof C16342f) {
                    jSONObject.put("res_gfm", ((C16342f) apVar).f39274a);
                    jSONObject.put("res_bfm", ((C16342f) this.f39333b).f39277d);
                    jSONObject.put("res_cfm", ((C16342f) this.f39333b).f39278e);
                }
                jSONObject.put("res_tag", this.f39334c.f39852t);
                anVar.f39742g = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("res_duration", SystemClock.uptimeMillis() - this.f39333b.f39764x);
                anVar.f39743h = jSONObject2;
                C16666i a = C16350j.m30370a(this.f39332a);
                String uri = this.f39333b.f39754n.toString();
                C89219l.m154709a((Object) uri, "");
                anVar.f39744i = Boolean.valueOf(C16363n.m30385a(a, uri));
                oVar.mo26319a(anVar);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1164b.C16616a, com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c
    /* renamed from: a */
    public final void mo25929a() {
        C16343g gVar = C16343g.C16345b.f39286a;
        C89219l.m154719c(this, "");
        gVar.f39283a.remove(this);
        Map<C16600aj, C16337a> map = this.f39300b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<C16600aj, C16337a> entry : map.entrySet()) {
            entry.getValue().mo25910a();
            arrayList.add(C89391z.f203057a);
        }
        this.f39300b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.a.j$i */
    public static final class CallableC16359i<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16350j f39338a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39339b;

        /* renamed from: c */
        final /* synthetic */ C16667j f39340c;

        /* renamed from: d */
        final /* synthetic */ long f39341d;

        static {
            Covode.recordClassIndex(18652);
        }

        CallableC16359i(C16350j jVar, C16610ap apVar, C16667j jVar2, long j) {
            this.f39338a = jVar;
            this.f39339b = apVar;
            this.f39340c = jVar2;
            this.f39341d = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0175  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01df  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z call() {
            /*
            // Method dump skipped, instructions count: 806
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p1148a.C16350j.CallableC16359i.call():java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C16666i m30370a(C16350j jVar) {
        C16666i iVar = jVar.f39299a;
        if (iVar == null) {
            C89219l.m154710a("mConfig");
        }
        return iVar;
    }

    /* renamed from: a */
    private static String m30371a(String str) {
        if (C89361p.m154885a((CharSequence) str, "/") != str.length() - 1) {
            return str;
        }
        String substring = str.substring(0, str.length() - 1);
        C89219l.m154709a((Object) substring, "");
        return substring;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void cancel(C16600aj ajVar) {
        C89219l.m154719c(ajVar, "");
        C16337a aVar = this.f39300b.get(ajVar);
        if (aVar != null) {
            aVar.mo25910a();
        }
        this.f39300b.remove(ajVar);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void unRegisterConfig(String str) {
        C89219l.m154719c(str, "");
        C16666i iVar = this.f39299a;
        if (iVar == null) {
            C89219l.m154710a("mConfig");
        }
        iVar.f39835n.remove(str);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.j$e */
    static final class C16355e extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16350j f39326a;

        /* renamed from: b */
        final /* synthetic */ String f39327b;

        /* renamed from: c */
        final /* synthetic */ C16342f f39328c;

        /* renamed from: d */
        final /* synthetic */ C16667j f39329d;

        /* renamed from: e */
        final /* synthetic */ C16365p f39330e;

        static {
            Covode.recordClassIndex(18648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16355e(C16350j jVar, String str, C16342f fVar, C16667j jVar2, C16365p pVar) {
            super(1);
            this.f39326a = jVar;
            this.f39327b = str;
            this.f39328c = fVar;
            this.f39329d = jVar2;
            this.f39330e = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            C16350j jVar = this.f39326a;
            C16342f fVar = this.f39328c;
            C16667j jVar2 = this.f39329d;
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            jVar.mo25932a(fVar, jVar2, message);
            C16350j jVar3 = this.f39326a;
            String jSONArray = this.f39328c.f39753m.toString();
            C89219l.m154709a((Object) jSONArray, "");
            AbstractC16576j.C16578b.m30778a(jVar3, jSONArray, null, null, 6);
            JSONObject jSONObject = this.f39328c.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("m_total", this.f39330e.mo25950b());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo25930a(C16610ap apVar) {
        C1731i.m5640b(new CallableC16358h(this, apVar), C1731i.f5562a);
    }

    public C16350j(Application application) {
        C89219l.m154719c(application, "");
        C16343g.C16345b.f39286a.f39284b = application;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void init(C16666i iVar) {
        C89219l.m154719c(iVar, "");
        if (this.f39303h) {
            AbstractC16576j.C16578b.m30778a(this, "init# service is already init", null, null, 6);
            return;
        }
        AbstractC16576j.C16578b.m30778a(this, "init globalConfig = ".concat(String.valueOf(iVar)), null, null, 6);
        this.f39303h = true;
        C16329a aVar = C16329a.C16331b.f39233a;
        int i = iVar.f39823b;
        if (aVar.f39230a == null && i > 0) {
            aVar.f39230a = new C16329a.C16332c(i, i);
        }
        C16343g gVar = C16343g.C16345b.f39286a;
        C89219l.m154719c(this, "");
        C89219l.m154719c(iVar, "");
        gVar.f39283a.put(this, iVar);
        this.f39299a = iVar;
        registerConfig(iVar.f39834m.getAccessKey(), iVar.f39834m);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.j$b */
    static final class C16352b extends AbstractC89220m implements AbstractC89172b<C16348h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16350j f39307a;

        /* renamed from: b */
        final /* synthetic */ C16600aj f39308b;

        /* renamed from: c */
        final /* synthetic */ C16365p f39309c;

        /* renamed from: d */
        final /* synthetic */ C16667j f39310d;

        /* renamed from: e */
        final /* synthetic */ C16342f f39311e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f39312f;

        /* renamed from: g */
        final /* synthetic */ C16667j f39313g;

        static {
            Covode.recordClassIndex(18645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16352b(C16350j jVar, C16600aj ajVar, C16365p pVar, C16667j jVar2, C16342f fVar, AbstractC89172b bVar, C16667j jVar3) {
            super(1);
            this.f39307a = jVar;
            this.f39308b = ajVar;
            this.f39309c = pVar;
            this.f39310d = jVar2;
            this.f39311e = fVar;
            this.f39312f = bVar;
            this.f39313g = jVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16348h hVar) {
            AbstractC16640d dVar;
            C16348h hVar2 = hVar;
            C89219l.m154719c(hVar2, "");
            this.f39307a.f39300b.remove(this.f39308b);
            this.f39309c.mo25949a();
            C16667j jVar = this.f39310d;
            String jSONArray = this.f39311e.f39753m.toString();
            C89219l.m154709a((Object) jSONArray, "");
            jVar.mo26455e(jSONArray);
            this.f39312f.invoke(hVar2.f39290b);
            JSONObject jSONObject = this.f39311e.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("m_resolve", this.f39309c.mo25949a());
            }
            JSONObject jSONObject2 = this.f39311e.f39752l.f39743h;
            if (jSONObject2 != null) {
                jSONObject2.put("m_total", this.f39309c.mo25950b());
            }
            this.f39307a.mo25931a(hVar2.f39290b, this.f39310d, SystemClock.uptimeMillis() - this.f39311e.f39764x);
            C16350j jVar2 = this.f39307a;
            C16610ap apVar = hVar2.f39290b;
            C16607an anVar = hVar2.f39290b.f39752l;
            AbstractC16584o oVar = this.f39310d.f39851s;
            if (oVar != null) {
                dVar = (AbstractC16640d) oVar.mo25789a_(AbstractC16640d.class);
            } else {
                dVar = null;
            }
            anVar.f39738c = dVar;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("res_state", "success");
            anVar.f39742g = jSONObject3;
            jVar2.mo25930a(apVar);
            EnumC16609ao aoVar = hVar2.f39290b.f39757q;
            if (aoVar != null && C16360k.f39346e[aoVar.ordinal()] == 1 && this.f39311e.f39275b != null && this.f39310d.f39856x) {
                C16329a.C16331b.f39233a.mo25904a(C16335b.m30344a(hVar2.f39290b, this.f39313g), hVar2.f39290b);
            }
            C16350j jVar3 = this.f39307a;
            String jSONArray2 = hVar2.f39290b.f39753m.toString();
            C89219l.m154709a((Object) jSONArray2, "");
            AbstractC16576j.C16578b.m30778a(jVar3, jSONArray2, null, null, 6);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.j$c */
    static final class C16353c extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16350j f39314a;

        /* renamed from: b */
        final /* synthetic */ C16342f f39315b;

        /* renamed from: c */
        final /* synthetic */ C16365p f39316c;

        /* renamed from: d */
        final /* synthetic */ C16600aj f39317d;

        /* renamed from: e */
        final /* synthetic */ C16667j f39318e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f39319f;

        static {
            Covode.recordClassIndex(18646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16353c(C16350j jVar, C16342f fVar, C16365p pVar, C16600aj ajVar, C16667j jVar2, AbstractC89172b bVar) {
            super(1);
            this.f39314a = jVar;
            this.f39315b = fVar;
            this.f39316c = pVar;
            this.f39317d = ajVar;
            this.f39318e = jVar2;
            this.f39319f = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            C89219l.m154719c(th2, str);
            C16350j jVar = this.f39314a;
            String jSONArray = this.f39315b.f39753m.toString();
            C89219l.m154709a((Object) jSONArray, str);
            AbstractC16640d dVar = null;
            AbstractC16576j.C16578b.m30778a(jVar, jSONArray, null, null, 6);
            JSONObject jSONObject = this.f39315b.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("m_total", this.f39316c.mo25950b());
            }
            this.f39314a.f39300b.remove(this.f39317d);
            C16667j jVar2 = this.f39318e;
            String jSONArray2 = this.f39315b.f39753m.toString();
            C89219l.m154709a((Object) jSONArray2, str);
            jVar2.mo26455e(jSONArray2);
            this.f39319f.invoke(th2);
            C16350j jVar3 = this.f39314a;
            C16342f fVar = this.f39315b;
            C16667j jVar4 = this.f39318e;
            String message = th2.getMessage();
            if (message != null) {
                str = message;
            }
            jVar3.mo25932a(fVar, jVar4, str);
            C16350j jVar5 = this.f39314a;
            C16342f fVar2 = this.f39315b;
            C16607an anVar = fVar2.f39752l;
            AbstractC16584o oVar = this.f39318e.f39851s;
            if (oVar != null) {
                dVar = (AbstractC16640d) oVar.mo25789a_(AbstractC16640d.class);
            }
            anVar.f39738c = dVar;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("res_state", "failed");
            anVar.f39742g = jSONObject2;
            jVar5.mo25930a(fVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.j$d */
    static final class C16354d extends AbstractC89220m implements AbstractC89172b<C16348h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16350j f39320a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f39321b;

        /* renamed from: c */
        final /* synthetic */ C16342f f39322c;

        /* renamed from: d */
        final /* synthetic */ C16365p f39323d;

        /* renamed from: e */
        final /* synthetic */ C16667j f39324e;

        /* renamed from: f */
        final /* synthetic */ C16667j f39325f;

        static {
            Covode.recordClassIndex(18647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16354d(C16350j jVar, C89233z.C89238e eVar, C16342f fVar, C16365p pVar, C16667j jVar2, C16667j jVar3) {
            super(1);
            this.f39320a = jVar;
            this.f39321b = eVar;
            this.f39322c = fVar;
            this.f39323d = pVar;
            this.f39324e = jVar2;
            this.f39325f = jVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16348h hVar) {
            C16348h hVar2 = hVar;
            C89219l.m154719c(hVar2, "");
            this.f39321b.element = (T) hVar2.f39290b;
            JSONObject jSONObject = this.f39322c.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("m_resolve", this.f39323d.mo25949a());
            }
            JSONObject jSONObject2 = this.f39322c.f39752l.f39743h;
            if (jSONObject2 != null) {
                jSONObject2.put("m_total", this.f39323d.mo25950b());
            }
            this.f39320a.mo25931a(hVar2.f39290b, this.f39324e, SystemClock.uptimeMillis() - this.f39322c.f39764x);
            EnumC16609ao aoVar = hVar2.f39290b.f39757q;
            if (!(aoVar == null || C16360k.f39345d[aoVar.ordinal()] != 1 || this.f39322c.f39275b == null)) {
                C16329a.C16331b.f39233a.mo25904a(C16335b.m30344a(hVar2.f39290b, this.f39325f), hVar2.f39290b);
            }
            C16350j jVar = this.f39320a;
            String jSONArray = hVar2.f39290b.f39753m.toString();
            C89219l.m154709a((Object) jSONArray, "");
            AbstractC16576j.C16578b.m30778a(jVar, jSONArray, null, null, 6);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void registerCustomLoader(Class<? extends IXResourceLoader> cls, EnumC16636e eVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(eVar, "");
        int i = C16360k.f39342a[eVar.ordinal()];
        if (i != 1) {
            if (i == 2 && !this.f39301f.contains(cls)) {
                this.f39302g.add(cls);
            }
        } else if (!this.f39301f.contains(cls)) {
            this.f39301f.add(cls);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void unregisterCustomLoader(Class<? extends IXResourceLoader> cls, EnumC16636e eVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(eVar, "");
        int i = C16360k.f39343b[eVar.ordinal()];
        if (i == 1) {
            this.f39301f.remove(cls);
        } else if (i == 2) {
            this.f39302g.remove(cls);
        }
    }

    /* renamed from: a */
    private final boolean m30373a(Uri uri, C16667j jVar) {
        AbstractC16584o oVar;
        AbstractC16582m g;
        String queryParameter = uri.getQueryParameter("__dev");
        if (C89219l.m154714a((Object) queryParameter, (Object) "1") || ((queryParameter == null || queryParameter.length() == 0) && (oVar = jVar.f39851s) != null && (g = oVar.mo25792g()) != null && g.mo26328c())) {
            return false;
        }
        if (!C89219l.m154714a((Object) C16639c.m30885a(uri, "enable_memory_cache"), (Object) "1")) {
            C16666i iVar = this.f39299a;
            if (iVar == null) {
                C89219l.m154710a("mConfig");
            }
            if (iVar.f39825d) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void registerConfig(String str, GeckoConfig geckoConfig) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(geckoConfig, "");
        geckoConfig.getLoaderDepender().mo25883a(this);
        C16666i iVar = this.f39299a;
        if (iVar == null) {
            C89219l.m154710a("mConfig");
        }
        iVar.f39835n.put(str, geckoConfig);
        if (geckoConfig.getNetworkImpl() != null) {
            return;
        }
        if (geckoConfig.getLocalInfo().length() > 0) {
            C16666i iVar2 = this.f39299a;
            if (iVar2 == null) {
                C89219l.m154710a("mConfig");
            }
            geckoConfig.setNetworkImpl(iVar2.f39837p);
            return;
        }
        C16666i iVar3 = this.f39299a;
        if (iVar3 == null) {
            C89219l.m154710a("mConfig");
        }
        geckoConfig.setNetworkImpl(iVar3.f39838q);
    }

    /* renamed from: b */
    private final C16337a m30374b(Uri uri, C16667j jVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        List<? extends Class<? extends IXResourceLoader>> list = jVar.f39839g.f39814b;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.addAll(this.f39301f);
        int size = arrayList.size();
        if (jVar.f39839g.f39813a.isEmpty() && !jVar.f39839g.f39817e) {
            jVar.f39839g.mo26448a(this.f39305j);
        }
        if (m30373a(uri, jVar)) {
            arrayList.add(C16327g.class);
        }
        for (EnumC16662e eVar : jVar.f39839g.f39813a) {
            int i2 = C16360k.f39344c[eVar.ordinal()];
            if (i2 == 1) {
                arrayList.add(C16312e.class);
            } else if (i2 == 2) {
                arrayList.add(C16298a.class);
            } else if (i2 == 3) {
                arrayList.add(C16301b.class);
            }
        }
        arrayList.addAll(this.f39302g);
        List<? extends Class<? extends IXResourceLoader>> list2 = jVar.f39839g.f39815c;
        if (list2 != null) {
            i = arrayList.size();
            arrayList.addAll(list2);
        } else {
            i = -1;
        }
        List<? extends Class<? extends IXResourceLoader>> list3 = jVar.f39839g.f39816d;
        if (list3 != null) {
            arrayList.removeAll(list3);
        }
        C16337a aVar = new C16337a(arrayList, getLoggerWrapper(), this);
        aVar.f39248a = size;
        aVar.f39249b = i;
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c6  */
    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.bullet.service.base.C16610ap loadSync(java.lang.String r22, com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j r23) {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p1148a.C16350j.loadSync(java.lang.String, com.bytedance.ies.bullet.service.base.resourceloader.config.j):com.bytedance.ies.bullet.service.base.ap");
    }

    /* renamed from: a */
    public final void mo25931a(C16610ap apVar, C16667j jVar, long j) {
        boolean z;
        AbstractC16576j.C16578b.m30778a(this, "reportSuccess " + C16326f.m30331a(apVar.f39754n) + ",message=" + apVar.f39753m, null, null, 6);
        StringBuilder sb = new StringBuilder("load success: isMemory = ");
        if (apVar instanceof C16342f) {
            z = ((C16342f) apVar).f39276c;
        } else {
            z = false;
        }
        AbstractC16576j.C16578b.m30778a(this, sb.append(z).append(",duration:").append(j).append('\n').append(apVar.f39752l.f39743h).toString(), null, null, 6);
        C1731i.m5640b(new CallableC16359i(this, apVar, jVar, j), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo25932a(C16610ap apVar, C16667j jVar, String str) {
        AbstractC16576j.C16578b.m30778a(this, "reportFailed " + apVar.f39754n.getScheme() + apVar.f39754n.getAuthority() + apVar.f39754n.getHost() + apVar.f39754n.getPath(), null, null, 6);
        C1731i.m5640b(new CallableC16357g(this, apVar, jVar, str), C1731i.f5562a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0157, code lost:
        if (r0 != null) goto L_0x015a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m30372a(java.lang.String r10, com.bytedance.ies.bullet.kit.p1148a.C16342f r11, com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j r12, com.bytedance.ies.bullet.kit.p1148a.C16365p r13) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p1148a.C16350j.m30372a(java.lang.String, com.bytedance.ies.bullet.kit.a.f, com.bytedance.ies.bullet.service.base.resourceloader.config.j, com.bytedance.ies.bullet.kit.a.p):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010e  */
    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.bullet.service.base.C16600aj loadAsync(java.lang.String r21, com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j r22, p4600h.p4611f.p4612a.AbstractC89172b<? super com.bytedance.ies.bullet.service.base.C16610ap, p4600h.C89391z> r23, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Throwable, p4600h.C89391z> r24) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p1148a.C16350j.loadAsync(java.lang.String, com.bytedance.ies.bullet.service.base.resourceloader.config.j, h.f.a.b, h.f.a.b):com.bytedance.ies.bullet.service.base.aj");
    }
}
