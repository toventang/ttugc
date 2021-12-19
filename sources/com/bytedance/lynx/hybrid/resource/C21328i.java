package com.bytedance.lynx.hybrid.resource;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import com.lynx.tasm.provider.AbstractC28849g;
import com.lynx.tasm.provider.AbstractC28850h;
import com.lynx.tasm.provider.C28851i;
import com.lynx.tasm.provider.C28852j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.resource.i */
public final class C21328i extends AbstractC28850h<Bundle, String> {
    static {
        Covode.recordClassIndex(24946);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.resource.i$a */
    public static final class C21329a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f50645a;

        /* renamed from: b */
        final /* synthetic */ C28851i f50646b;

        /* renamed from: c */
        final /* synthetic */ AbstractC28849g f50647c;

        static {
            Covode.recordClassIndex(24947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21329a(String str, C28851i iVar, AbstractC28849g gVar) {
            super(1);
            this.f50645a = str;
            this.f50646b = iVar;
            this.f50647c = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            final C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            C1731i.m5639b((Callable) new Callable<C89391z>(this) {
                /* class com.bytedance.lynx.hybrid.resource.C21328i.C21329a.CallableC213301 */

                /* renamed from: a */
                final /* synthetic */ C21329a f50648a;

                static {
                    Covode.recordClassIndex(24948);
                }

                {
                    this.f50648a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C89391z call() {
                    MethodCollector.m26663i(4024);
                    File file = new File(eVar2.f50547n + File.separator + "/lang.json");
                    if (!file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            FileInputStream fileInputStream2 = fileInputStream;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                long unused = C89145b.m154635a(fileInputStream2, byteArrayOutputStream2, 8192);
                                this.f50648a.f50647c.mo48809a(C28852j.m57791a(byteArrayOutputStream2.toString(C89338d.f202990a.name())));
                                C89146c.m154636a(byteArrayOutputStream, null);
                                C89146c.m154636a(fileInputStream, null);
                                C89391z zVar = C89391z.f203057a;
                                MethodCollector.m26664o(4024);
                                return zVar;
                            } catch (Throwable th) {
                                C89146c.m154636a(byteArrayOutputStream, th);
                                MethodCollector.m26664o(4024);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            C89146c.m154636a(fileInputStream, th);
                            MethodCollector.m26664o(4024);
                            throw th2;
                        }
                    } else {
                        MethodCollector.m26664o(4024);
                        return null;
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.i$b */
    static final class C21331b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f50650a;

        /* renamed from: b */
        final /* synthetic */ C28851i f50651b;

        /* renamed from: c */
        final /* synthetic */ AbstractC28849g f50652c;

        static {
            Covode.recordClassIndex(24949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21331b(String str, C28851i iVar, AbstractC28849g gVar) {
            super(1);
            this.f50650a = str;
            this.f50651b = iVar;
            this.f50652c = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f50652c.mo48809a(C28852j.m57792a(th2));
            return C89391z.f203057a;
        }
    }

    @Override // com.lynx.tasm.provider.AbstractC28850h
    /* renamed from: a */
    public final void mo33453a(C28851i<Bundle> iVar, AbstractC28849g<String> gVar) {
        IResourceService iResourceService;
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(gVar, "");
        String str = iVar.f68096a;
        C89219l.m154709a((Object) str, "");
        if (!C89361p.m154874b(str, "__", false) && !C89361p.m154876c(str, "__", false) && C89361p.m154915b(str, new String[]{"__"}).size() == 3 && str != null && (iResourceService = (IResourceService) C21353c.C21354a.m40102a().mo34954a(IResourceService.class)) != null) {
            String uri = C21344o.m40087a(str).toString();
            C89219l.m154709a((Object) uri, "");
            C21284j jVar = new C21284j();
            String string = iVar.f68097b.getString("access_key");
            if (string != null) {
                C89219l.m154709a((Object) string, "");
                jVar.mo34892f(string);
            }
            jVar.mo34887a(str);
            jVar.f50514e = 1;
            iResourceService.loadAsync(uri, jVar, new C21329a(str, iVar, gVar), new C21331b(str, iVar, gVar));
        }
    }
}
