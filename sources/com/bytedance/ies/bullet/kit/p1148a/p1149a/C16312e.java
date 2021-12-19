package com.bytedance.ies.bullet.kit.p1148a.p1149a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.p1148a.AbstractC16340d;
import com.bytedance.ies.bullet.kit.p1148a.C16336c;
import com.bytedance.ies.bullet.kit.p1148a.C16342f;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.C16361l;
import com.bytedance.ies.bullet.kit.p1148a.C16362m;
import com.bytedance.ies.bullet.kit.p1148a.C16365p;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.EnumC16609ao;
import com.bytedance.ies.bullet.service.base.EnumC16613ar;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16663f;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
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

/* renamed from: com.bytedance.ies.bullet.kit.a.a.e */
public class C16312e extends AbstractC16310c {

    /* renamed from: a */
    public static final C16313a f39183a = new C16313a((byte) 0);

    /* renamed from: b */
    private final String f39184b = "GECKO";

    static {
        Covode.recordClassIndex(18605);
    }

    @Override // com.bytedance.ies.bullet.kit.p1148a.p1149a.AbstractC16310c, com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void cancelLoad() {
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$a */
    public static final class C16313a {
        static {
            Covode.recordClassIndex(18606);
        }

        private C16313a() {
        }

        public /* synthetic */ C16313a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public String getTAG() {
        return this.f39184b;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$k */
    public static final class C16323k implements AbstractC16663f {

        /* renamed from: a */
        final /* synthetic */ C16312e f39214a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39215b;

        /* renamed from: c */
        final /* synthetic */ C16365p f39216c;

        /* renamed from: d */
        final /* synthetic */ String f39217d;

        /* renamed from: e */
        final /* synthetic */ String f39218e;

        /* renamed from: f */
        final /* synthetic */ String f39219f;

        /* renamed from: g */
        final /* synthetic */ boolean f39220g;

        /* renamed from: h */
        final /* synthetic */ C16311d f39221h;

        /* renamed from: i */
        final /* synthetic */ AbstractC89172b f39222i;

        /* renamed from: j */
        final /* synthetic */ AbstractC89172b f39223j;

        static {
            Covode.recordClassIndex(18616);
        }

        /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$k$a */
        static final class CallableC16324a<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C16323k f39224a;

            static {
                Covode.recordClassIndex(18617);
            }

            CallableC16324a(C16323k kVar) {
                this.f39224a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                this.f39224a.f39214a.mo25899a(this.f39224a.f39215b, (C16667j) this.f39224a.f39221h, this.f39224a.f39218e, this.f39224a.f39219f, false, this.f39224a.f39222i, this.f39224a.f39223j);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$k$b */
        static final class CallableC16325b<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C16323k f39225a;

            static {
                Covode.recordClassIndex(18618);
            }

            CallableC16325b(C16323k kVar) {
                this.f39225a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                this.f39225a.f39214a.mo25899a(this.f39225a.f39215b, (C16667j) this.f39225a.f39221h, this.f39225a.f39218e, this.f39225a.f39219f, false, this.f39225a.f39222i, this.f39225a.f39223j);
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16663f
        /* renamed from: a */
        public final void mo25900a(List<String> list) {
            C89219l.m154719c(list, "");
            JSONObject jSONObject = this.f39215b.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("g_update", this.f39216c.mo25949a());
            }
            AbstractC16576j.C16578b.m30778a(this.f39214a, "download success with dynamic=" + this.f39217d + " , channel=" + this.f39218e + ",bundle=" + this.f39219f, null, null, 6);
            if (this.f39220g) {
                AbstractC16576j.C16578b.m30778a(this.f39214a, "success, skip callbacks when onlyLocal is true", null, null, 6);
            } else {
                C1731i.m5640b(new CallableC16325b(this), C1731i.f5564c);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16663f
        /* renamed from: a */
        public final void mo25901a(List<String> list, Throwable th) {
            String str;
            C89219l.m154719c(list, "");
            JSONObject jSONObject = this.f39215b.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("g_update", this.f39216c.mo25949a());
            }
            C16312e eVar = this.f39214a;
            StringBuilder append = new StringBuilder("download failed with dynamic=").append(this.f39217d).append(" ,channel = ").append(this.f39218e).append(",bundle = ").append(this.f39219f).append(',');
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            AbstractC16576j.C16578b.m30778a(eVar, append.append(str).toString(), null, null, 6);
            C16610ap apVar = this.f39215b;
            if (apVar instanceof C16342f) {
                ((C16342f) apVar).f39274a = "gecko CheckUpdate Failed ";
            }
            if (this.f39220g) {
                AbstractC16576j.C16578b.m30778a(this.f39214a, "failed, skip callbacks when onlyLocal is true", null, null, 6);
            } else {
                C1731i.m5640b(new CallableC16324a(this), C1731i.f5564c);
            }
        }

        C16323k(C16312e eVar, C16610ap apVar, C16365p pVar, String str, String str2, String str3, boolean z, C16311d dVar, AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f39214a = eVar;
            this.f39215b = apVar;
            this.f39216c = pVar;
            this.f39217d = str;
            this.f39218e = str2;
            this.f39219f = str3;
            this.f39220g = z;
            this.f39221h = dVar;
            this.f39222i = bVar;
            this.f39223j = bVar2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$j */
    static final class C16322j extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f39213a;

        static {
            Covode.recordClassIndex(18615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16322j(CountDownLatch countDownLatch) {
            super(1);
            this.f39213a = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154719c(th, "");
            this.f39213a.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$i */
    static final class C16321i extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f39211a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f39212b;

        static {
            Covode.recordClassIndex(18614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16321i(C89233z.C89238e eVar, CountDownLatch countDownLatch) {
            super(1);
            this.f39211a = eVar;
            this.f39212b = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.bullet.service.base.ap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            C89219l.m154719c(apVar, "");
            this.f39211a.element = apVar;
            this.f39212b.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$c */
    static final class C16315c extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16312e f39189a;

        /* renamed from: b */
        final /* synthetic */ C16365p f39190b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f39191c;

        /* renamed from: d */
        final /* synthetic */ C16610ap f39192d;

        static {
            Covode.recordClassIndex(18608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16315c(C16312e eVar, C16365p pVar, AbstractC89172b bVar, C16610ap apVar) {
            super(1);
            this.f39189a = eVar;
            this.f39190b = pVar;
            this.f39191c = bVar;
            this.f39192d = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            JSONObject jSONObject = apVar2.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.f39190b.mo25950b());
            }
            AbstractC89172b bVar = this.f39191c;
            C16610ap apVar3 = this.f39192d;
            JSONArray jSONArray = apVar3.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f39189a.getTAG());
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            bVar.invoke(apVar3);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$e */
    public static final class C16317e implements AbstractC16663f {

        /* renamed from: a */
        final /* synthetic */ C16312e f39197a;

        /* renamed from: b */
        final /* synthetic */ int f39198b;

        /* renamed from: c */
        final /* synthetic */ String f39199c;

        /* renamed from: d */
        final /* synthetic */ String f39200d;

        static {
            Covode.recordClassIndex(18610);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16663f
        /* renamed from: a */
        public final void mo25900a(List<String> list) {
            C89219l.m154719c(list, "");
            AbstractC16576j.C16578b.m30778a(this.f39197a, "download success with dynamic=" + this.f39198b + " , channel=" + this.f39199c + ",bundle=" + this.f39200d, null, null, 6);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16663f
        /* renamed from: a */
        public final void mo25901a(List<String> list, Throwable th) {
            String str;
            C89219l.m154719c(list, "");
            C16312e eVar = this.f39197a;
            StringBuilder append = new StringBuilder("download failed with dynamic=").append(this.f39198b).append(" ,channel = ").append(this.f39199c).append(",bundle = ").append(this.f39200d).append(",errorMessage=");
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            AbstractC16576j.C16578b.m30778a(eVar, append.append(str).toString(), null, null, 6);
        }

        C16317e(C16312e eVar, int i, String str, String str2) {
            this.f39197a = eVar;
            this.f39198b = i;
            this.f39199c = str;
            this.f39200d = str2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$f */
    static final class C16318f extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16312e f39201a;

        /* renamed from: b */
        final /* synthetic */ C16365p f39202b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f39203c;

        static {
            Covode.recordClassIndex(18611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16318f(C16312e eVar, C16365p pVar, AbstractC89172b bVar) {
            super(1);
            this.f39201a = eVar;
            this.f39202b = pVar;
            this.f39203c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            JSONObject jSONObject = apVar2.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.f39202b.mo25950b());
            }
            JSONArray jSONArray = apVar2.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f39201a.getTAG());
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            this.f39203c.invoke(apVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$h */
    static final class C16320h extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16312e f39208a;

        /* renamed from: b */
        final /* synthetic */ C16365p f39209b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f39210c;

        static {
            Covode.recordClassIndex(18613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16320h(C16312e eVar, C16365p pVar, AbstractC89172b bVar) {
            super(1);
            this.f39208a = eVar;
            this.f39209b = pVar;
            this.f39210c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            JSONObject jSONObject = apVar2.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.f39209b.mo25950b());
            }
            JSONArray jSONArray = apVar2.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f39208a.getTAG());
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            this.f39210c.invoke(apVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final String m30319a(C16667j jVar) {
        GeckoConfig a = C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(getService()), jVar.f39857y);
        if (!(a.getLoaderDepender() instanceof AbstractC16340d)) {
            return "";
        }
        AbstractC16661d loaderDepender = a.getLoaderDepender();
        if (loaderDepender != null) {
            return ((AbstractC16340d) loaderDepender).mo25881a();
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$b */
    static final class C16314b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16312e f39185a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39186b;

        /* renamed from: c */
        final /* synthetic */ C16365p f39187c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f39188d;

        static {
            Covode.recordClassIndex(18607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16314b(C16312e eVar, C16610ap apVar, C16365p pVar, AbstractC89172b bVar) {
            super(1);
            this.f39185a = eVar;
            this.f39186b = apVar;
            this.f39187c = pVar;
            this.f39188d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            JSONObject jSONObject = this.f39186b.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.f39187c.mo25950b());
            }
            JSONArray jSONArray = this.f39186b.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f39185a.getTAG());
            jSONObject2.put("status", "failed");
            jSONObject2.put("detail", th2.getMessage());
            jSONArray.put(jSONObject2);
            this.f39188d.invoke(th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$d */
    static final class C16316d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16312e f39193a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39194b;

        /* renamed from: c */
        final /* synthetic */ C16365p f39195c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f39196d;

        static {
            Covode.recordClassIndex(18609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16316d(C16312e eVar, C16610ap apVar, C16365p pVar, AbstractC89172b bVar) {
            super(1);
            this.f39193a = eVar;
            this.f39194b = apVar;
            this.f39195c = pVar;
            this.f39196d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            JSONObject jSONObject = this.f39194b.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.f39195c.mo25950b());
            }
            AbstractC89172b bVar = this.f39196d;
            JSONArray jSONArray = this.f39194b.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f39193a.getTAG());
            jSONObject2.put("status", "failed");
            jSONObject2.put("detail", th2.getMessage());
            jSONArray.put(jSONObject2);
            bVar.invoke(th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$g */
    static final class C16319g extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16312e f39204a;

        /* renamed from: b */
        final /* synthetic */ C16610ap f39205b;

        /* renamed from: c */
        final /* synthetic */ C16365p f39206c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f39207d;

        static {
            Covode.recordClassIndex(18612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16319g(C16312e eVar, C16610ap apVar, C16365p pVar, AbstractC89172b bVar) {
            super(1);
            this.f39204a = eVar;
            this.f39205b = apVar;
            this.f39206c = pVar;
            this.f39207d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            JSONObject jSONObject = this.f39205b.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.f39206c.mo25950b());
            }
            JSONArray jSONArray = this.f39205b.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.f39204a.getTAG());
            jSONObject2.put("status", "failed");
            jSONObject2.put("detail", th2.getMessage());
            jSONArray.put(jSONObject2);
            this.f39207d.invoke(th2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.p1148a.p1149a.AbstractC16310c
    /* renamed from: a */
    public final C16610ap mo25895a(C16610ap apVar, C16311d dVar) {
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(dVar, "");
        AbstractC16576j.C16578b.m30778a(this, "start to loadSync load  channel = " + dVar.f39844l + ",bundle = " + dVar.f39845m + " from gecko", null, null, 6);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(apVar, dVar, new C16321i(eVar, countDownLatch), new C16322j(countDownLatch));
        countDownLatch.await(dVar.f39841i, TimeUnit.MILLISECONDS);
        return eVar.element;
    }

    /* renamed from: a */
    private final void m30320a(Uri uri, C16667j jVar, AbstractC16663f fVar) {
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
                    C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(getService()), jVar.f39857y).getLoaderDepender().mo25884a(jVar, arrayList, fVar);
                    return;
                }
            }
            fVar.mo25901a(new ArrayList(), new Exception("update failed because channel is null"));
        }
    }

    /* renamed from: a */
    private final C16361l m30318a(Uri uri, C16667j jVar, String str) {
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
                    String str3 = jVar.f39857y;
                    GeckoConfig a = C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(getService()), jVar.f39857y);
                    String b = a.getLoaderDepender().mo25886b(a.getOfflineDir(), str3, str2);
                    AbstractC16576j.C16578b.m30778a(this, "using gecko info [accessKey=" + str3 + ",filePath=" + b + ']', null, null, 6);
                    if (b == null || b.length() == 0) {
                        return null;
                    }
                    file = new File(b);
                }
                C16361l lVar = new C16361l(uri);
                AbstractC16576j.C16578b.m30778a(this, "load from gecko success", null, null, 6);
                C16336c cVar = new C16336c(file);
                cVar.f39247d = EnumC16609ao.GECKO;
                GeckoConfig a2 = C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(getService()), jVar.f39857y);
                if (a2.getLoaderDepender() instanceof AbstractC16340d) {
                    AbstractC16661d loaderDepender = a2.getLoaderDepender();
                    if (loaderDepender != null) {
                        cVar.f39245b = Long.valueOf(((AbstractC16340d) loaderDepender).mo25879a(a2.getOfflineDir(), jVar.f39857y, str));
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                lVar.f39347a = cVar;
                return lVar;
            }
            throw new FileNotFoundException(uri + " not found");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b1, code lost:
        if (r4 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f8, code lost:
        if (r8 != null) goto L_0x01fa;
     */
    @Override // com.bytedance.ies.bullet.kit.p1148a.p1149a.AbstractC16310c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25896a(com.bytedance.ies.bullet.service.base.C16610ap r21, com.bytedance.ies.bullet.kit.p1148a.p1149a.C16311d r22, p4600h.p4611f.p4612a.AbstractC89172b<? super com.bytedance.ies.bullet.service.base.C16610ap, p4600h.C89391z> r23, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Throwable, p4600h.C89391z> r24) {
        /*
        // Method dump skipped, instructions count: 649
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p1148a.p1149a.C16312e.mo25896a(com.bytedance.ies.bullet.service.base.ap, com.bytedance.ies.bullet.kit.a.a.d, h.f.a.b, h.f.a.b):void");
    }

    /* renamed from: a */
    private final void m30321a(C16610ap apVar, C16311d dVar, String str, String str2, String str3, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        boolean z;
        C16365p pVar = new C16365p();
        if (C89219l.m154714a((Object) apVar.f39754n.getQueryParameter("onlyLocal"), (Object) "1") || dVar.f39843k) {
            z = true;
            if (apVar instanceof C16342f) {
                ((C16342f) apVar).f39274a = "gecko only local";
                JSONArray jSONArray = apVar.f39753m;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, getTAG());
                jSONObject.put("status", "failed");
                jSONObject.put("detail", apVar);
                jSONArray.put(jSONObject);
            }
            bVar2.invoke(new Exception("gecko only local"));
        } else {
            z = false;
        }
        Uri a = C16362m.m30381a(str);
        dVar.f39182f = 1;
        m30320a(a, dVar, new C16323k(this, apVar, pVar, str3, str, str2, z, dVar, bVar, bVar2));
    }

    /* renamed from: a */
    public final void mo25899a(C16610ap apVar, C16667j jVar, String str, String str2, boolean z, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C16336c cVar;
        String concat;
        C16342f fVar;
        String str3;
        Long l;
        MethodCollector.m26663i(7506);
        C16365p pVar = new C16365p();
        Uri a = C16362m.m30381a(C16326f.m30332a(str, str2));
        C16361l a2 = m30318a(a, jVar, str);
        if (a2 != null) {
            cVar = a2.mo25947a();
        } else {
            cVar = null;
        }
        JSONObject jSONObject = apVar.f39752l.f39743h;
        long j = 0;
        if (jSONObject != null) {
            try {
                l = C89379q.m157068constructorimpl(Long.valueOf(jSONObject.getLong("g_local")));
            } catch (Throwable th) {
                l = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(l)) {
                l = 0L;
            }
            jSONObject.put("g_local", ((Number) l).longValue() + pVar.mo25949a());
        }
        if (cVar == null || !cVar.f39246c.exists()) {
            boolean z2 = apVar instanceof C16342f;
            if (z2) {
                if (jVar.f39857y.length() == 0 && ((str3 = (fVar = (C16342f) apVar).f39274a) == null || str3.length() == 0)) {
                    fVar.f39274a = "gecko accessKey invalid";
                } else {
                    ((C16342f) apVar).f39274a = "gecko File Not Found";
                }
            }
            if (z2) {
                concat = ((C16342f) apVar).f39274a;
            } else {
                concat = "file not find ".concat(String.valueOf(a));
            }
            bVar2.invoke(new FileNotFoundException(concat));
            MethodCollector.m26664o(7506);
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(cVar.f39246c);
            if (fileInputStream.available() == 0) {
                if (apVar instanceof C16342f) {
                    ((C16342f) apVar).f39274a = "gecko size 0";
                }
                bVar2.invoke(new FileNotFoundException("size 0"));
                fileInputStream.close();
                MethodCollector.m26664o(7506);
                return;
            }
            fileInputStream.close();
            C89379q.m157068constructorimpl(C89391z.f203057a);
            apVar.f39755o = cVar.f39246c.getAbsolutePath();
            apVar.f39756p = EnumC16613ar.DISK;
            apVar.f39757q = EnumC16609ao.GECKO;
            Long l2 = cVar.f39245b;
            if (l2 != null) {
                j = l2.longValue();
            }
            apVar.f39759s = j;
            apVar.f39758r = z;
            JSONArray jSONArray = apVar.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, getTAG());
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            apVar.mo26374e(m30319a(jVar));
            bVar.invoke(apVar);
            MethodCollector.m26664o(7506);
        } catch (Throwable th2) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th2));
        }
    }
}
