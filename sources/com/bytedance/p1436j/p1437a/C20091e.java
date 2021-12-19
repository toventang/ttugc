package com.bytedance.p1436j.p1437a;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.monitor.lynx.jsb.C11998a;
import com.bytedance.android.monitor.lynx.p716b.C11980b;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16602ak;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.EnumC16609ao;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16629c;
import com.bytedance.ies.bullet.service.base.p1168e.C16638b;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.lynx.hybrid.C21218m;
import com.bytedance.p1436j.p1437a.p1440c.C20077c;
import com.bytedance.p1436j.p1437a.p1440c.C20083e;
import com.bytedance.p1436j.p1437a.p1442e.C20098a;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.j.a.e */
public final class C20091e implements AbstractC16629c {

    /* renamed from: h */
    public static int f47822h;

    /* renamed from: i */
    public static final C20093a f47823i = new C20093a((byte) 0);

    /* renamed from: a */
    public final C16616a f47824a;

    /* renamed from: b */
    LynxView f47825b;

    /* renamed from: c */
    String f47826c;

    /* renamed from: d */
    byte[] f47827d;

    /* renamed from: e */
    public C20072c f47828e;

    /* renamed from: f */
    public C20063a f47829f;

    /* renamed from: g */
    AbstractC16584o f47830g;

    /* renamed from: j */
    private IResourceLoaderService f47831j;

    /* renamed from: k */
    private C11980b f47832k;

    /* renamed from: l */
    private final C11998a f47833l = new C11998a();

    static {
        Covode.recordClassIndex(23599);
    }

    /* renamed from: com.bytedance.j.a.e$a */
    public static final class C20093a {
        static {
            Covode.recordClassIndex(23601);
        }

        private C20093a() {
        }

        public /* synthetic */ C20093a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16649j
    /* renamed from: a */
    public final View mo26408a() {
        return this.f47825b;
    }

    /* renamed from: c */
    private final void m38052c() {
        String str;
        List<String> b;
        C20072c cVar = this.f47828e;
        if (!(cVar == null || (str = cVar.f47782r) == null || str.length() == 0 || str == null || (b = C89361p.m154915b(str, new String[]{","})) == null)) {
            for (T t : b) {
                if (!C28573r.m57145a((String) t)) {
                    C28573r.m57142a(C20083e.m38036a().getAssets(), t, "font/");
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16649j
    /* renamed from: b */
    public final void mo26411b() {
        String str;
        C20072c cVar = this.f47828e;
        if (!(cVar == null || (str = cVar.f47766b) == null || str.length() == 0 || C20077c.f47795b.get(str) == null)) {
            Integer num = C20077c.f47795b.get(str);
            if (num == null) {
                C89219l.m154707a();
            }
            int intValue = num.intValue() - 1;
            if (intValue <= 0) {
                C20077c.f47794a.remove(str);
                C20077c.f47795b.remove(str);
            } else {
                C20077c.f47795b.put(str, Integer.valueOf(intValue));
            }
        }
        LynxView lynxView = this.f47825b;
        if (lynxView != null) {
            lynxView.destroy();
        }
    }

    /* renamed from: com.bytedance.j.a.e$b */
    static final class C20094b extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f47835a;

        /* renamed from: b */
        final /* synthetic */ C20091e f47836b;

        /* renamed from: c */
        final /* synthetic */ String f47837c;

        static {
            Covode.recordClassIndex(23602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20094b(C89233z.C89238e eVar, C20091e eVar2, String str) {
            super(1);
            this.f47835a = eVar;
            this.f47836b = eVar2;
            this.f47837c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            C20102f fVar;
            final C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            C20072c cVar = this.f47836b.f47828e;
            if (!(cVar == null || (fVar = cVar.f47772h) == null)) {
                fVar.mo14501a(apVar2);
            }
            C1731i.m5636a(new Callable<Object>(this) {
                /* class com.bytedance.p1436j.p1437a.C20091e.C20094b.CallableC200951 */

                /* renamed from: a */
                final /* synthetic */ C20094b f47838a;

                static {
                    Covode.recordClassIndex(23603);
                }

                {
                    this.f47838a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    MethodCollector.m26663i(10990);
                    Object obj = null;
                    try {
                        InputStream a = apVar2.mo25913a();
                        if (a != null) {
                            try {
                                final InputStream inputStream = a;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                                    final byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    Object a2 = C1731i.m5636a(new Callable<C89391z>() {
                                        /* class com.bytedance.p1436j.p1437a.C20091e.C20094b.CallableC200951.CallableC200961 */

                                        static {
                                            Covode.recordClassIndex(23604);
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        @Override // java.util.concurrent.Callable
                                        public final /* synthetic */ C89391z call() {
                                            T t;
                                            TemplateData templateData;
                                            C20098a aVar;
                                            if (apVar2.f39757q != EnumC16609ao.CDN || !this.f47838a.f47836b.f47830g.mo25792g().mo26328c()) {
                                                t = apVar2.f39755o;
                                            } else {
                                                t = this.f47838a.f47835a.element;
                                            }
                                            C20091e eVar = this.f47838a.f47836b;
                                            byte[] bArr = byteArray;
                                            C89219l.m154709a((Object) bArr, "");
                                            C89219l.m154719c(bArr, "");
                                            eVar.f47827d = bArr;
                                            eVar.f47826c = t;
                                            LynxView lynxView = eVar.f47825b;
                                            if (lynxView != null) {
                                                C20072c cVar = eVar.f47828e;
                                                if (cVar == null || (aVar = cVar.f47780p) == null || (templateData = aVar.f47846a) == null) {
                                                    C20072c cVar2 = eVar.f47828e;
                                                    if (cVar2 != null) {
                                                        templateData = cVar2.f47773i;
                                                    } else {
                                                        templateData = null;
                                                    }
                                                }
                                                lynxView.renderTemplateWithBaseUrl(bArr, templateData, t);
                                            }
                                            return C89391z.f203057a;
                                        }
                                    }, C1731i.f5564c);
                                    C89146c.m154636a(byteArrayOutputStream, null);
                                    C89146c.m154636a(a, null);
                                    obj = a2;
                                } catch (Throwable th) {
                                    C89146c.m154636a(byteArrayOutputStream, th);
                                    MethodCollector.m26664o(10990);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                C89146c.m154636a(a, th);
                                MethodCollector.m26664o(10990);
                                throw th2;
                            }
                        } else {
                            this.f47838a.f47836b.f47824a.printLog("ResourceLoader stream empty", EnumC16586p.E, "LynxKit");
                            C20063a aVar = this.f47838a.f47836b.f47829f;
                            if (aVar != null) {
                                aVar.mo19151a(new C28816j("ResourceLoader stream empty", 100));
                                obj = C89391z.f203057a;
                            }
                        }
                    } catch (Throwable th3) {
                        this.f47838a.f47836b.f47824a.printLog("ResourceLoader stream write error, " + th3.getMessage(), EnumC16586p.E, "LynxKit");
                        C20063a aVar2 = this.f47838a.f47836b.f47829f;
                        if (aVar2 != null) {
                            aVar2.mo19151a(new C28816j("ResourceLoader stream write error, " + th3.getMessage(), 100));
                            obj = C89391z.f203057a;
                        }
                    }
                    MethodCollector.m26664o(10990);
                    return obj;
                }
            }, C1731i.f5562a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.j.a.e$c */
    static final class C20097c extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20091e f47843a;

        /* renamed from: b */
        final /* synthetic */ String f47844b;

        static {
            Covode.recordClassIndex(23605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20097c(C20091e eVar, String str) {
            super(1);
            this.f47843a = eVar;
            this.f47844b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f47843a.f47824a.printLog("ResoureLoader template load error, " + th2.getMessage(), EnumC16586p.E, "LynxKit");
            C20063a aVar = this.f47843a.f47829f;
            if (aVar != null) {
                aVar.mo19151a(new C28816j("ResoureLoader template load error, " + th2.getMessage(), 100));
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.service.base.AbstractC16649j
    /* renamed from: a */
    public final void mo26409a(String str) {
        TemplateData templateData;
        C20072c cVar;
        C20098a aVar;
        C89219l.m154719c(str, "");
        if (this.f47825b == null) {
            return;
        }
        if (this.f47831j == null) {
            this.f47826c = str;
            C20072c cVar2 = this.f47828e;
            if ((cVar2 == null || (aVar = cVar2.f47780p) == null || (templateData = aVar.f47846a) == null) && ((cVar = this.f47828e) == null || (templateData = cVar.f47773i) == null)) {
                templateData = TemplateData.m56770a();
            }
            LynxView lynxView = this.f47825b;
            if (lynxView != null) {
                lynxView.renderTemplateUrl(str, templateData);
                return;
            }
            return;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = str;
        IResourceLoaderService iResourceLoaderService = this.f47831j;
        if (iResourceLoaderService != null) {
            C16667j jVar = new C16667j();
            jVar.mo26454d("template");
            jVar.f39851s = this.f47830g;
            try {
                Uri parse = Uri.parse(str);
                C89219l.m154709a((Object) parse, "");
                jVar.f39855w = new C16638b(parse);
                T t = (T) parse.getQueryParameter("surl");
                if (t != null) {
                    C89219l.m154709a((Object) t, "");
                    jVar.mo26453c(t);
                    eVar.element = t;
                }
                String queryParameter = parse.getQueryParameter("channel");
                if (queryParameter != null) {
                    C89219l.m154709a((Object) queryParameter, "");
                    jVar.mo26451a(queryParameter);
                }
                String queryParameter2 = parse.getQueryParameter("bundle");
                if (queryParameter2 != null) {
                    C89219l.m154709a((Object) queryParameter2, "");
                    jVar.mo26452b(queryParameter2);
                }
                jVar.f39842j = 1;
                String queryParameter3 = parse.getQueryParameter("dynamic");
                if (queryParameter3 != null) {
                    C89219l.m154709a((Object) queryParameter3, "");
                    jVar.f39842j = Integer.valueOf(Integer.parseInt(queryParameter3));
                }
            } catch (Throwable th) {
                this.f47824a.printReject(th, "lynxkit.load parse url error");
            }
            iResourceLoaderService.loadAsync(str, jVar, new C20094b(eVar, this, str), new C20097c(this, str));
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16649j
    /* renamed from: a */
    public final void mo26410a(String str, List<? extends Object> list) {
        C89219l.m154719c(str, "");
        LynxView lynxView = this.f47825b;
        if (lynxView != null) {
            lynxView.sendGlobalEvent(str, JavaOnlyArray.from(list));
        }
    }

    public C20091e(AbstractC16584o oVar, C16616a aVar) {
        String str;
        String str2;
        C16602ak b;
        C16602ak b2;
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(aVar, "");
        this.f47830g = oVar;
        this.f47824a = aVar;
        final AbstractC16654o oVar2 = (AbstractC16654o) aVar.mo26380a(AbstractC16654o.class);
        String str3 = null;
        if (!(oVar2 == null || (b2 = oVar2.mo26321b()) == null)) {
            str3 = b2.f39724b;
        }
        C11980b bVar = new C11980b((oVar2 == null || (b = oVar2.mo26321b()) == null || (str = b.f39723a) == null) ? "" : str, new AbstractC12009a() {
            /* class com.bytedance.p1436j.p1437a.C20091e.C200921 */

            static {
                Covode.recordClassIndex(23600);
            }

            @Override // com.bytedance.android.monitor.webview.AbstractC12009a
            /* renamed from: a */
            public final void mo13268a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                AbstractC16654o oVar = oVar2;
                if (oVar != null) {
                    oVar.mo26320a(str, i, jSONObject, jSONObject2);
                }
            }
        });
        bVar.f28682j = str3;
        if (str3 == null || str3.length() == 0) {
            str2 = "detect_when_load_success";
        } else {
            str2 = "detect_when_detach";
        }
        C89219l.m154719c(str2, "");
        bVar.f28677e = str2;
        this.f47832k = bVar;
        this.f47831j = (IResourceLoaderService) aVar.mo26380a(IResourceLoaderService.class);
        C20072c cVar = (C20072c) this.f47830g.mo25792g().mo26324a().mo26343a(C20072c.class);
        if (cVar != null) {
            this.f47828e = cVar;
            Context b3 = this.f47830g.mo25792g().mo26327b();
            if (b3 == null) {
                C89219l.m154707a();
            }
            this.f47825b = m38051a(b3, cVar);
            Map<String, Object> map = cVar.f47776l;
            if (true ^ map.containsKey("containerID")) {
                StringBuilder sb = new StringBuilder(C21218m.f50362d);
                int i = f47822h;
                f47822h = i + 1;
                map.put("containerID", sb.append(i).toString());
            }
            LynxView lynxView = this.f47825b;
            if (lynxView != null) {
                lynxView.setGlobalProps(TemplateData.m56772a(cVar.f47776l));
            }
        }
        m38052c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fe, code lost:
        if (r1 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010b, code lost:
        if (r1 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010d, code lost:
        r3.mo49942a(r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.lynx.tasm.LynxView m38051a(android.content.Context r9, com.bytedance.p1436j.p1437a.C20072c r10) {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1436j.p1437a.C20091e.m38051a(android.content.Context, com.bytedance.j.a.c):com.lynx.tasm.LynxView");
    }
}
