package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import com.lynx.tasm.provider.AbstractC28849g;
import com.lynx.tasm.provider.AbstractC28850h;
import com.lynx.tasm.provider.C28851i;
import com.lynx.tasm.provider.C28852j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.d */
public final class C21286d extends AbstractC28850h<Object, byte[]> {
    static {
        Covode.recordClassIndex(24904);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.d$a */
    static final class C21287a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28849g f50531a;

        static {
            Covode.recordClassIndex(24905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21287a(AbstractC28849g gVar) {
            super(1);
            this.f50531a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            final C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            C1731i.m5636a(new Callable<C89391z>(this) {
                /* class com.bytedance.lynx.hybrid.resource.C21286d.C21287a.CallableC212881 */

                /* renamed from: a */
                final /* synthetic */ C21287a f50532a;

                static {
                    Covode.recordClassIndex(24906);
                }

                {
                    this.f50532a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ C89391z call() {
                    MethodCollector.m26663i(4062);
                    InputStream a = eVar2.mo34899a();
                    if (a != null) {
                        try {
                            InputStream inputStream = a;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                                this.f50532a.f50531a.mo48809a(C28852j.m57791a(byteArrayOutputStream2.toByteArray()));
                                C21210c.m39924a("get external js resource success", EnumC21209b.I, "ExternalJSProvider");
                                C89146c.m154636a(byteArrayOutputStream, null);
                                C89146c.m154636a(a, null);
                            } catch (Throwable th) {
                                C89146c.m154636a(byteArrayOutputStream, th);
                                MethodCollector.m26664o(4062);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            C89146c.m154636a(a, th);
                            MethodCollector.m26664o(4062);
                            throw th2;
                        }
                    } else {
                        this.f50532a.f50531a.mo48809a(C28852j.m57792a((Throwable) new Error("InputStream is null")));
                        C21210c.m39924a("get external js resource failed: InputStream is null", EnumC21209b.E, "ExternalJSProvider");
                    }
                    C89391z zVar = C89391z.f203057a;
                    MethodCollector.m26664o(4062);
                    return zVar;
                }
            }, C1731i.f5562a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.d$b */
    static final class C21289b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28849g f50534a;

        static {
            Covode.recordClassIndex(24907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21289b(AbstractC28849g gVar) {
            super(1);
            this.f50534a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f50534a.mo48809a(C28852j.m57792a(th2));
            C21210c.m39924a("get external js resource failed: " + th2.getMessage(), EnumC21209b.E, "ExternalJSProvider");
            return C89391z.f203057a;
        }
    }

    @Override // com.lynx.tasm.provider.AbstractC28850h
    /* renamed from: a */
    public final void mo33453a(C28851i<Object> iVar, AbstractC28849g<byte[]> gVar) {
        IResourceService iResourceService;
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(gVar, "");
        String str = iVar.f68096a;
        if ((!TextUtils.isEmpty(str)) && str != null && (iResourceService = (IResourceService) C21353c.C21354a.m40102a().mo34954a(IResourceService.class)) != null) {
            C21284j jVar = new C21284j();
            jVar.mo34890d("external_js");
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("surl");
                if (queryParameter != null) {
                    C89219l.m154709a((Object) queryParameter, "");
                    jVar.mo34889c(queryParameter);
                }
                String queryParameter2 = parse.getQueryParameter("channel");
                if (queryParameter2 != null) {
                    C89219l.m154709a((Object) queryParameter2, "");
                    jVar.mo34887a(queryParameter2);
                }
                String queryParameter3 = parse.getQueryParameter("bundle");
                if (queryParameter3 != null) {
                    C89219l.m154709a((Object) queryParameter3, "");
                    jVar.mo34888b(queryParameter3);
                }
                jVar.f50514e = 1;
                String queryParameter4 = parse.getQueryParameter("dynamic");
                if (queryParameter4 != null) {
                    C89219l.m154709a((Object) queryParameter4, "");
                    jVar.f50514e = Integer.valueOf(Integer.parseInt(queryParameter4));
                }
            } catch (Throwable th) {
                C21210c.m39927a(th, "ExternalJSProvider parse url error", (String) null, 4);
            }
            iResourceService.loadAsync(str, jVar, new C21287a(gVar), new C21289b(gVar));
        }
    }
}
