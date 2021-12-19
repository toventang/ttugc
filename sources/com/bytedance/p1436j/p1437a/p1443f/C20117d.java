package com.bytedance.p1436j.p1437a.p1443f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.p1168e.C16638b;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.lynx.tasm.provider.AbstractC28849g;
import com.lynx.tasm.provider.AbstractC28850h;
import com.lynx.tasm.provider.C28851i;
import com.lynx.tasm.provider.C28852j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.f.d */
public final class C20117d extends AbstractC28850h<Object, byte[]> {

    /* renamed from: a */
    public WeakReference<AbstractC16584o> f47876a;

    /* renamed from: b */
    public final C16616a f47877b;

    static {
        Covode.recordClassIndex(23625);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.j.a.f.d$a */
    public static final class C20118a extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20117d f47878a;

        /* renamed from: b */
        final /* synthetic */ AbstractC28849g f47879b;

        static {
            Covode.recordClassIndex(23626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20118a(C20117d dVar, AbstractC28849g gVar) {
            super(1);
            this.f47878a = dVar;
            this.f47879b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            final C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            C1731i.m5636a(new Callable<C89391z>(this) {
                /* class com.bytedance.p1436j.p1437a.p1443f.C20117d.C20118a.CallableC201191 */

                /* renamed from: a */
                final /* synthetic */ C20118a f47880a;

                static {
                    Covode.recordClassIndex(23627);
                }

                {
                    this.f47880a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C89391z call() {
                    AbstractC16584o oVar;
                    AbstractC16584o oVar2;
                    MethodCollector.m26663i(11848);
                    InputStream a = apVar2.mo25913a();
                    if (a != null) {
                        try {
                            InputStream inputStream = a;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                                this.f47880a.f47879b.mo48809a(C28852j.m57791a(byteArrayOutputStream2.toByteArray()));
                                C89146c.m154636a(byteArrayOutputStream, null);
                                C89146c.m154636a(a, null);
                                WeakReference<AbstractC16584o> weakReference = this.f47880a.f47878a.f47876a;
                                if (weakReference == null || (oVar2 = weakReference.get()) == null) {
                                    MethodCollector.m26664o(11848);
                                    return null;
                                }
                                oVar2.printLog("get external js resource success", EnumC16586p.I, "ExternalJSProvider");
                                C89391z zVar = C89391z.f203057a;
                                MethodCollector.m26664o(11848);
                                return zVar;
                            } catch (Throwable th) {
                                C89146c.m154636a(byteArrayOutputStream, th);
                                MethodCollector.m26664o(11848);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            C89146c.m154636a(a, th);
                            MethodCollector.m26664o(11848);
                            throw th2;
                        }
                    } else {
                        this.f47880a.f47879b.mo48809a(C28852j.m57792a((Throwable) new Error("InputStream is null")));
                        WeakReference<AbstractC16584o> weakReference2 = this.f47880a.f47878a.f47876a;
                        if (weakReference2 == null || (oVar = weakReference2.get()) == null) {
                            MethodCollector.m26664o(11848);
                            return null;
                        }
                        oVar.printLog("get external js resource failed: InputStream is null", EnumC16586p.E, "ExternalJSProvider");
                        C89391z zVar2 = C89391z.f203057a;
                        MethodCollector.m26664o(11848);
                        return zVar2;
                    }
                }
            }, C1731i.f5562a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.j.a.f.d$b */
    static final class C20120b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20117d f47882a;

        /* renamed from: b */
        final /* synthetic */ AbstractC28849g f47883b;

        static {
            Covode.recordClassIndex(23628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20120b(C20117d dVar, AbstractC28849g gVar) {
            super(1);
            this.f47882a = dVar;
            this.f47883b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            AbstractC16584o oVar;
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f47883b.mo48809a(C28852j.m57792a(th2));
            WeakReference<AbstractC16584o> weakReference = this.f47882a.f47876a;
            if (!(weakReference == null || (oVar = weakReference.get()) == null)) {
                oVar.printLog("get external js resource failed: " + th2.getMessage(), EnumC16586p.E, "ExternalJSProvider");
            }
            return C89391z.f203057a;
        }
    }

    public C20117d(AbstractC16584o oVar, C16616a aVar) {
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(aVar, "");
        this.f47877b = aVar;
        this.f47876a = new WeakReference<>(oVar);
    }

    @Override // com.lynx.tasm.provider.AbstractC28850h
    /* renamed from: a */
    public final void mo33453a(C28851i<Object> iVar, AbstractC28849g<byte[]> gVar) {
        IResourceLoaderService iResourceLoaderService;
        AbstractC16584o oVar;
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(gVar, "");
        String str = iVar.f68096a;
        AbstractC16584o oVar2 = null;
        if ((!TextUtils.isEmpty(str)) && str != null && (iResourceLoaderService = (IResourceLoaderService) this.f47877b.mo26380a(IResourceLoaderService.class)) != null) {
            C16667j jVar = new C16667j();
            jVar.mo26454d("external_js");
            WeakReference<AbstractC16584o> weakReference = this.f47876a;
            if (weakReference != null) {
                oVar2 = weakReference.get();
            }
            jVar.f39851s = oVar2;
            try {
                Uri parse = Uri.parse(str);
                C89219l.m154709a((Object) parse, "");
                jVar.f39855w = new C16638b(parse);
                String queryParameter = parse.getQueryParameter("surl");
                if (queryParameter != null) {
                    C89219l.m154709a((Object) queryParameter, "");
                    jVar.mo26453c(queryParameter);
                }
                String queryParameter2 = parse.getQueryParameter("channel");
                if (queryParameter2 != null) {
                    C89219l.m154709a((Object) queryParameter2, "");
                    jVar.mo26451a(queryParameter2);
                }
                String queryParameter3 = parse.getQueryParameter("bundle");
                if (queryParameter3 != null) {
                    C89219l.m154709a((Object) queryParameter3, "");
                    jVar.mo26452b(queryParameter3);
                }
                jVar.f39842j = 1;
                String queryParameter4 = parse.getQueryParameter("dynamic");
                if (queryParameter4 != null) {
                    C89219l.m154709a((Object) queryParameter4, "");
                    jVar.f39842j = Integer.valueOf(Integer.parseInt(queryParameter4));
                }
            } catch (Throwable th) {
                WeakReference<AbstractC16584o> weakReference2 = this.f47876a;
                if (!(weakReference2 == null || (oVar = weakReference2.get()) == null)) {
                    oVar.printReject(th, "ExternalJSProvider parse url error");
                }
                gVar.mo48809a(C28852j.m57792a(th));
            }
            iResourceLoaderService.loadAsync(str, jVar, new C20118a(this, gVar), new C20120b(this, gVar));
        }
    }
}
