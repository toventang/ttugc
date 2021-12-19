package com.bytedance.lynx.hybrid.resource.p1526b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.AbstractC21323h;
import com.bytedance.lynx.hybrid.resource.C21299e;
import com.bytedance.lynx.hybrid.resource.C21303f;
import com.bytedance.lynx.hybrid.resource.C21335j;
import com.bytedance.lynx.hybrid.resource.C21343n;
import com.bytedance.lynx.hybrid.resource.C21344o;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21279e;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21281g;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21293d;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21298h;
import com.bytedance.lynx.hybrid.resource.p1535i.C21334c;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.resource.b.e */
public class C21249e extends AbstractC21247c {

    /* renamed from: a */
    public static final C21250a f50431a = new C21250a((byte) 0);

    /* renamed from: b */
    private final String f50432b = "GECKO";

    static {
        Covode.recordClassIndex(24865);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader, com.bytedance.lynx.hybrid.resource.p1526b.AbstractC21247c
    public void cancelLoad() {
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$a */
    public static final class C21250a {
        static {
            Covode.recordClassIndex(24866);
        }

        private C21250a() {
        }

        public /* synthetic */ C21250a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public String getTAG() {
        return this.f50432b;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$k */
    public static final class C21260k implements AbstractC21281g {

        /* renamed from: a */
        final /* synthetic */ C21249e f50455a;

        /* renamed from: b */
        final /* synthetic */ String f50456b;

        /* renamed from: c */
        final /* synthetic */ String f50457c;

        /* renamed from: d */
        final /* synthetic */ String f50458d;

        /* renamed from: e */
        final /* synthetic */ boolean f50459e;

        /* renamed from: f */
        final /* synthetic */ C21294e f50460f;

        /* renamed from: g */
        final /* synthetic */ C21248d f50461g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89172b f50462h;

        /* renamed from: i */
        final /* synthetic */ AbstractC89172b f50463i;

        static {
            Covode.recordClassIndex(24876);
        }

        /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$k$a */
        static final class CallableC21261a<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C21260k f50464a;

            static {
                Covode.recordClassIndex(24877);
            }

            CallableC21261a(C21260k kVar) {
                this.f50464a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                this.f50464a.f50455a.mo34842a(this.f50464a.f50460f, (C21284j) this.f50464a.f50461g, this.f50464a.f50457c, this.f50464a.f50458d, false, this.f50464a.f50462h, this.f50464a.f50463i);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$k$b */
        static final class CallableC21262b<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C21260k f50465a;

            static {
                Covode.recordClassIndex(24878);
            }

            CallableC21262b(C21260k kVar) {
                this.f50465a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                this.f50465a.f50455a.mo34842a(this.f50465a.f50460f, (C21284j) this.f50465a.f50461g, this.f50465a.f50457c, this.f50465a.f50458d, false, this.f50465a.f50462h, this.f50465a.f50463i);
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21281g
        /* renamed from: a */
        public final void mo34843a(List<String> list) {
            C89219l.m154719c(list, "");
            C21210c.m39925a("download success with dynamic=" + this.f50456b + " , channel=" + this.f50457c + ",bundle=" + this.f50458d, (EnumC21209b) null, (String) null, 6);
            if (this.f50459e) {
                C21210c.m39925a("success, skip callbacks when onlyLocal is true", (EnumC21209b) null, (String) null, 6);
            } else {
                C1731i.m5636a(new CallableC21262b(this), C1731i.f5564c);
            }
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21281g
        /* renamed from: a */
        public final void mo34844a(List<String> list, Throwable th) {
            String str;
            C89219l.m154719c(list, "");
            StringBuilder append = new StringBuilder("download failed with dynamic=").append(this.f50456b).append(" ,channel = ").append(this.f50457c).append(",bundle = ").append(this.f50458d).append(',');
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            C21210c.m39925a(append.append(str).toString(), (EnumC21209b) null, (String) null, 6);
            C21294e eVar = this.f50460f;
            if (eVar instanceof C21335j) {
                ((C21335j) eVar).f50659a = "gecko CheckUpdate Failed ";
            }
            if (this.f50459e) {
                C21210c.m39925a("failed, skip callbacks when onlyLocal is true", (EnumC21209b) null, (String) null, 6);
            } else {
                C1731i.m5636a(new CallableC21261a(this), C1731i.f5564c);
            }
        }

        C21260k(C21249e eVar, String str, String str2, String str3, boolean z, C21294e eVar2, C21248d dVar, AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f50455a = eVar;
            this.f50456b = str;
            this.f50457c = str2;
            this.f50458d = str3;
            this.f50459e = z;
            this.f50460f = eVar2;
            this.f50461g = dVar;
            this.f50462h = bVar;
            this.f50463i = bVar2;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$j */
    static final class C21259j extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f50454a;

        static {
            Covode.recordClassIndex(24875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21259j(CountDownLatch countDownLatch) {
            super(1);
            this.f50454a = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154719c(th, "");
            this.f50454a.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$i */
    static final class C21258i extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f50452a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f50453b;

        static {
            Covode.recordClassIndex(24874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21258i(C89233z.C89238e eVar, CountDownLatch countDownLatch) {
            super(1);
            this.f50452a = eVar;
            this.f50453b = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.lynx.hybrid.resource.d.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            C89219l.m154719c(eVar, "");
            this.f50452a.element = eVar;
            this.f50453b.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$b */
    static final class C21251b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21249e f50433a;

        /* renamed from: b */
        final /* synthetic */ C21294e f50434b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f50435c;

        static {
            Covode.recordClassIndex(24867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21251b(C21249e eVar, C21294e eVar2, AbstractC89172b bVar) {
            super(1);
            this.f50433a = eVar;
            this.f50434b = eVar2;
            this.f50435c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            JSONArray jSONArray = this.f50434b.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50433a.getTAG());
            jSONObject.put("status", "failed");
            jSONObject.put("detail", th2.getMessage());
            jSONArray.put(jSONObject);
            this.f50435c.invoke(th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$c */
    static final class C21252c extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21249e f50436a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f50437b;

        /* renamed from: c */
        final /* synthetic */ C21294e f50438c;

        static {
            Covode.recordClassIndex(24868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21252c(C21249e eVar, AbstractC89172b bVar, C21294e eVar2) {
            super(1);
            this.f50436a = eVar;
            this.f50437b = bVar;
            this.f50438c = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            C89219l.m154719c(eVar, "");
            AbstractC89172b bVar = this.f50437b;
            C21294e eVar2 = this.f50438c;
            JSONArray jSONArray = eVar2.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50436a.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            bVar.invoke(eVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$d */
    static final class C21253d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21249e f50439a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f50440b;

        /* renamed from: c */
        final /* synthetic */ C21294e f50441c;

        static {
            Covode.recordClassIndex(24869);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21253d(C21249e eVar, AbstractC89172b bVar, C21294e eVar2) {
            super(1);
            this.f50439a = eVar;
            this.f50440b = bVar;
            this.f50441c = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            AbstractC89172b bVar = this.f50440b;
            JSONArray jSONArray = this.f50441c.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50439a.getTAG());
            jSONObject.put("status", "failed");
            jSONObject.put("detail", th2.getMessage());
            jSONArray.put(jSONObject);
            bVar.invoke(th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$e */
    public static final class C21254e implements AbstractC21281g {

        /* renamed from: a */
        final /* synthetic */ int f50442a;

        /* renamed from: b */
        final /* synthetic */ String f50443b;

        /* renamed from: c */
        final /* synthetic */ String f50444c;

        static {
            Covode.recordClassIndex(24870);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21281g
        /* renamed from: a */
        public final void mo34843a(List<String> list) {
            C89219l.m154719c(list, "");
            C21210c.m39925a("download success with dynamic=" + this.f50442a + " , channel=" + this.f50443b + ",bundle=" + this.f50444c, (EnumC21209b) null, (String) null, 6);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21281g
        /* renamed from: a */
        public final void mo34844a(List<String> list, Throwable th) {
            String str;
            C89219l.m154719c(list, "");
            StringBuilder append = new StringBuilder("download failed with dynamic=").append(this.f50442a).append(" ,channel = ").append(this.f50443b).append(",bundle = ").append(this.f50444c).append(",errorMessage=");
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            C21210c.m39925a(append.append(str).toString(), (EnumC21209b) null, (String) null, 6);
        }

        C21254e(int i, String str, String str2) {
            this.f50442a = i;
            this.f50443b = str;
            this.f50444c = str2;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$f */
    static final class C21255f extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21249e f50445a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f50446b;

        static {
            Covode.recordClassIndex(24871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21255f(C21249e eVar, AbstractC89172b bVar) {
            super(1);
            this.f50445a = eVar;
            this.f50446b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            JSONArray jSONArray = eVar2.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50445a.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            this.f50446b.invoke(eVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$g */
    static final class C21256g extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21249e f50447a;

        /* renamed from: b */
        final /* synthetic */ C21294e f50448b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f50449c;

        static {
            Covode.recordClassIndex(24872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21256g(C21249e eVar, C21294e eVar2, AbstractC89172b bVar) {
            super(1);
            this.f50447a = eVar;
            this.f50448b = eVar2;
            this.f50449c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            JSONArray jSONArray = this.f50448b.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50447a.getTAG());
            jSONObject.put("status", "failed");
            jSONObject.put("detail", th2.getMessage());
            jSONArray.put(jSONObject);
            this.f50449c.invoke(th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$h */
    static final class C21257h extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21249e f50450a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f50451b;

        static {
            Covode.recordClassIndex(24873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21257h(C21249e eVar, AbstractC89172b bVar) {
            super(1);
            this.f50450a = eVar;
            this.f50451b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            JSONArray jSONArray = eVar2.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.f50450a.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            this.f50451b.invoke(eVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final String m39956a(C21284j jVar) {
        GeckoConfig a = C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(getService()), jVar.f50529t);
        if (!(a.getGeckoDepender() instanceof AbstractC21323h)) {
            return "";
        }
        AbstractC21279e geckoDepender = a.getGeckoDepender();
        if (geckoDepender != null) {
            return ((AbstractC21323h) geckoDepender).mo34928a();
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.lynx.hybrid.resource.p1526b.AbstractC21247c
    /* renamed from: a */
    public final C21294e mo34838a(C21294e eVar, C21248d dVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        C21210c.m39925a("start to loadSync load  channel = " + dVar.f50516g + ",bundle = " + dVar.f50517h + " from gecko", (EnumC21209b) null, (String) null, 6);
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(eVar, dVar, new C21258i(eVar2, countDownLatch), new C21259j(countDownLatch));
        countDownLatch.await(dVar.f50513d, TimeUnit.MILLISECONDS);
        return eVar2.element;
    }

    /* renamed from: a */
    private final void m39957a(Uri uri, C21284j jVar, AbstractC21281g gVar) {
        if (C89219l.m154714a((Object) uri.getScheme(), (Object) "local_file") && C89219l.m154714a((Object) uri.getAuthority(), (Object) "relative")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (path.length() > 1 && C89361p.m154874b(path, "/", false)) {
                String substring = path.substring(1);
                C89219l.m154709a((Object) substring, "");
                if (substring != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(substring);
                    AbstractC21279e geckoDepender = C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(getService()), jVar.f50529t).getGeckoDepender();
                    if (geckoDepender == null) {
                        C89219l.m154707a();
                    }
                    geckoDepender.mo34882a(jVar, arrayList, gVar);
                    return;
                }
            }
            gVar.mo34844a(new ArrayList(), new Exception("update failed because channel is null"));
        }
    }

    /* renamed from: a */
    private final C21343n m39955a(Uri uri, C21284j jVar, String str) {
        File file;
        try {
            String scheme = uri.getScheme();
            if (scheme == null || scheme.hashCode() != 1303296464 || !scheme.equals("local_file")) {
                throw new FileNotFoundException(uri + " not found");
            }
            String authority = uri.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                String str2 = "";
                if (hashCode != -554435892) {
                    if (hashCode == 1728122231 && authority.equals("absolute")) {
                        String path = uri.getPath();
                        if (path != null) {
                            str2 = path;
                        }
                        file = new File(str2);
                    }
                } else if (authority.equals("relative")) {
                    String path2 = uri.getPath();
                    if (path2 != null) {
                        str2 = path2;
                    }
                    String str3 = jVar.f50529t;
                    GeckoConfig a = C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(getService()), jVar.f50529t);
                    String offlineDir = a.getOfflineDir();
                    AbstractC21279e geckoDepender = a.getGeckoDepender();
                    if (geckoDepender == null) {
                        C89219l.m154707a();
                    }
                    String b = geckoDepender.mo34885b(offlineDir, str3, str2);
                    C21210c.m39925a("using gecko info [accessKey=" + str3 + ",filePath=" + b + ']', (EnumC21209b) null, (String) null, 6);
                    if (b == null || b.length() == 0) {
                        return null;
                    }
                    file = new File(b);
                }
                C21343n nVar = new C21343n(uri);
                C21210c.m39925a("load from gecko success", (EnumC21209b) null, (String) null, 6);
                C21299e eVar = new C21299e(file);
                eVar.f50567d = EnumC21293d.GECKO;
                GeckoConfig a2 = C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(getService()), jVar.f50529t);
                if (a2.getGeckoDepender() instanceof AbstractC21323h) {
                    AbstractC21279e geckoDepender2 = a2.getGeckoDepender();
                    if (geckoDepender2 != null) {
                        eVar.f50565b = Long.valueOf(((AbstractC21323h) geckoDepender2).mo34929c(a2.getOfflineDir(), jVar.f50529t, str));
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                nVar.f50693a = eVar;
                return nVar;
            }
            throw new FileNotFoundException(uri + " not found");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01de, code lost:
        if (r6 != null) goto L_0x01e0;
     */
    @Override // com.bytedance.lynx.hybrid.resource.p1526b.AbstractC21247c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34839a(com.bytedance.lynx.hybrid.resource.p1528d.C21294e r20, com.bytedance.lynx.hybrid.resource.p1526b.C21248d r21, p4600h.p4611f.p4612a.AbstractC89172b<? super com.bytedance.lynx.hybrid.resource.p1528d.C21294e, p4600h.C89391z> r22, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Throwable, p4600h.C89391z> r23) {
        /*
        // Method dump skipped, instructions count: 625
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.p1526b.C21249e.mo34839a(com.bytedance.lynx.hybrid.resource.d.e, com.bytedance.lynx.hybrid.resource.b.d, h.f.a.b, h.f.a.b):void");
    }

    /* renamed from: a */
    private final void m39958a(C21294e eVar, C21248d dVar, String str, String str2, String str3, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        boolean z;
        new C21334c();
        if (C89219l.m154714a((Object) eVar.f50546m.getQueryParameter("onlyLocal"), (Object) "1") || dVar.f50515f) {
            z = true;
            if (eVar instanceof C21335j) {
                ((C21335j) eVar).f50659a = "gecko only local";
                JSONArray jSONArray = eVar.f50545l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, getTAG());
                jSONObject.put("status", "failed");
                jSONObject.put("detail", eVar);
                jSONArray.put(jSONObject);
            }
            bVar2.invoke(new Exception("gecko only local"));
        } else {
            z = false;
        }
        Uri a = C21344o.m40087a(str);
        dVar.f50430z = 1;
        m39957a(a, dVar, new C21260k(this, str3, str, str2, z, eVar, dVar, bVar, bVar2));
    }

    /* renamed from: a */
    public final void mo34842a(C21294e eVar, C21284j jVar, String str, String str2, boolean z, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        String concat;
        C21335j jVar2;
        String str3;
        C21299e a;
        long j;
        MethodCollector.m26663i(3602);
        new C21334c();
        Uri a2 = C21344o.m40087a(C21263f.m39967a(str, str2));
        C21343n a3 = m39955a(a2, jVar, str);
        if (a3 == null || (a = a3.mo34949a()) == null || !a.f50566c.exists()) {
            boolean z2 = eVar instanceof C21335j;
            if (z2) {
                if (jVar.f50529t.length() == 0 && ((str3 = (jVar2 = (C21335j) eVar).f50659a) == null || str3.length() == 0)) {
                    jVar2.f50659a = "gecko accessKey invalid";
                } else {
                    ((C21335j) eVar).f50659a = "gecko File Not Found";
                }
            }
            if (z2) {
                concat = ((C21335j) eVar).f50659a;
            } else {
                concat = "file not find ".concat(String.valueOf(a2));
            }
            bVar2.invoke(new FileNotFoundException(concat));
            MethodCollector.m26664o(3602);
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(a.f50566c);
            if (fileInputStream.available() == 0) {
                if (eVar instanceof C21335j) {
                    ((C21335j) eVar).f50659a = "gecko size 0";
                }
                bVar2.invoke(new FileNotFoundException("size 0"));
                fileInputStream.close();
                MethodCollector.m26664o(3602);
                return;
            }
            fileInputStream.close();
            C89379q.m157068constructorimpl(C89391z.f203057a);
            eVar.f50547n = a.f50566c.getAbsolutePath();
            eVar.f50548o = EnumC21298h.DISK;
            eVar.f50549p = EnumC21293d.GECKO;
            Long l = a.f50565b;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            eVar.f50551r = j;
            eVar.f50550q = z;
            JSONArray jSONArray = eVar.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            eVar.mo34903e(m39956a(jVar));
            bVar.invoke(eVar);
            MethodCollector.m26664o(3602);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }
}
