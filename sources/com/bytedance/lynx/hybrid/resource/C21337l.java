package com.bytedance.lynx.hybrid.resource;

import android.os.FileObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1527c.C21268a;
import com.bytedance.lynx.hybrid.resource.p1527c.C21274b;
import com.bytedance.lynx.hybrid.resource.p1528d.C21291b;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.C21297g;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21293d;
import com.bytedance.lynx.hybrid.resource.p1529e.C21300a;
import com.bytedance.lynx.hybrid.resource.p1530f.C21311d;
import com.bytedance.lynx.hybrid.resource.p1535i.C21334c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.lynx.hybrid.resource.l */
public final class C21337l {

    /* renamed from: a */
    public static final List<Class<? extends IHybridResourceLoader>> f50672a = new ArrayList();

    /* renamed from: b */
    public static final List<Class<? extends IHybridResourceLoader>> f50673b = new ArrayList();

    /* renamed from: c */
    static final Map<C21291b, C21311d> f50674c = new LinkedHashMap();

    /* renamed from: d */
    public static final C21337l f50675d = new C21337l();

    private C21337l() {
    }

    static {
        Covode.recordClassIndex(24955);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.l$c */
    static final class C21340c extends AbstractC89220m implements AbstractC89172b<C21297g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f50685a;

        /* renamed from: b */
        final /* synthetic */ C21284j f50686b;

        /* renamed from: c */
        final /* synthetic */ C21297g f50687c;

        static {
            Covode.recordClassIndex(24958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21340c(C89233z.C89238e eVar, C21284j jVar, C21297g gVar) {
            super(1);
            this.f50685a = eVar;
            this.f50686b = jVar;
            this.f50687c = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21297g gVar) {
            C21297g gVar2 = gVar;
            C89219l.m154719c(gVar2, "");
            this.f50685a.element = (T) gVar2.f50560b;
            C21300a.m40011a(gVar2.f50560b, this.f50686b);
            C21294e eVar = this.f50687c.f50560b;
            if (eVar != null) {
                C21337l.m40084a(gVar2, (C21335j) eVar, this.f50687c.f50561c);
                String jSONArray = gVar2.f50560b.f50545l.toString();
                C89219l.m154709a((Object) jSONArray, "");
                C21210c.m39925a(jSONArray, (EnumC21209b) null, (String) null, 6);
                return C89391z.f203057a;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.l$a */
    static final class C21338a extends AbstractC89220m implements AbstractC89172b<C21297g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21291b f50676a;

        /* renamed from: b */
        final /* synthetic */ C21334c f50677b;

        /* renamed from: c */
        final /* synthetic */ C21284j f50678c;

        /* renamed from: d */
        final /* synthetic */ C21297g f50679d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f50680e;

        static {
            Covode.recordClassIndex(24956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21338a(C21291b bVar, C21334c cVar, C21284j jVar, C21297g gVar, AbstractC89172b bVar2) {
            super(1);
            this.f50676a = bVar;
            this.f50677b = cVar;
            this.f50678c = jVar;
            this.f50679d = gVar;
            this.f50680e = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21297g gVar) {
            C21297g gVar2 = gVar;
            C89219l.m154719c(gVar2, "");
            C21337l.f50674c.remove(this.f50676a);
            this.f50677b.mo34935a();
            C21284j jVar = this.f50678c;
            String jSONArray = this.f50679d.f50560b.f50545l.toString();
            C89219l.m154709a((Object) jSONArray, "");
            jVar.mo34891e(jSONArray);
            this.f50680e.invoke(gVar2.f50560b);
            C21300a.m40011a(gVar2.f50560b, this.f50678c);
            C21294e eVar = this.f50679d.f50560b;
            if (eVar != null) {
                C21337l.m40084a(gVar2, (C21335j) eVar, this.f50679d.f50561c);
                String jSONArray2 = gVar2.f50560b.f50545l.toString();
                C89219l.m154709a((Object) jSONArray2, "");
                C21210c.m39925a(jSONArray2, (EnumC21209b) null, (String) null, 6);
                return C89391z.f203057a;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.l$b */
    static final class C21339b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21297g f50681a;

        /* renamed from: b */
        final /* synthetic */ C21291b f50682b;

        /* renamed from: c */
        final /* synthetic */ C21284j f50683c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f50684d;

        static {
            Covode.recordClassIndex(24957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21339b(C21297g gVar, C21291b bVar, C21284j jVar, AbstractC89172b bVar2) {
            super(1);
            this.f50681a = gVar;
            this.f50682b = bVar;
            this.f50683c = jVar;
            this.f50684d = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            C89219l.m154719c(th2, str);
            String jSONArray = this.f50681a.f50560b.f50545l.toString();
            C89219l.m154709a((Object) jSONArray, str);
            C21210c.m39925a(jSONArray, (EnumC21209b) null, (String) null, 6);
            C21337l.f50674c.remove(this.f50682b);
            C21284j jVar = this.f50683c;
            String jSONArray2 = this.f50681a.f50560b.f50545l.toString();
            C89219l.m154709a((Object) jSONArray2, str);
            jVar.mo34891e(jSONArray2);
            this.f50684d.invoke(th2);
            C21294e eVar = this.f50681a.f50560b;
            C21284j jVar2 = this.f50683c;
            String message = th2.getMessage();
            if (message != null) {
                str = message;
            }
            C21300a.m40012a(eVar, jVar2, str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.l$d */
    static final class C21341d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f50688a;

        /* renamed from: b */
        final /* synthetic */ C21297g f50689b;

        /* renamed from: c */
        final /* synthetic */ C21284j f50690c;

        static {
            Covode.recordClassIndex(24959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21341d(String str, C21297g gVar, C21284j jVar) {
            super(1);
            this.f50688a = str;
            this.f50689b = gVar;
            this.f50690c = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            C21210c.m39924a("loadSync: reject uri =" + this.f50688a, EnumC21209b.D, "ResourceLoader");
            C21294e eVar = this.f50689b.f50560b;
            C21284j jVar = this.f50690c;
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            C21300a.m40012a(eVar, jVar, message);
            String jSONArray = this.f50689b.f50560b.f50545l.toString();
            C89219l.m154709a((Object) jSONArray, "");
            C21210c.m39925a(jSONArray, (EnumC21209b) null, (String) null, 6);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m40084a(C21297g gVar, C21335j jVar, C21284j jVar2) {
        String str;
        if (gVar.f50560b.f50549p == EnumC21293d.GECKO && jVar.f50660b != null && jVar2.f50527r) {
            String a = C21274b.m39976a(jVar2);
            C21268a aVar = C21268a.C21270b.f50477a;
            C21294e eVar = gVar.f50560b;
            C89219l.m154719c(a, "");
            C89219l.m154719c(eVar, "");
            if (a.length() != 0 && (str = eVar.f50547n) != null && str.length() != 0) {
                try {
                    C21268a.FileObserverC21273e eVar2 = new C21268a.FileObserverC21273e(aVar, a, eVar, eVar.f50547n);
                    aVar.f50475b.put(a, eVar);
                    FileObserver fileObserver = aVar.f50476c.get(a);
                    if (fileObserver != null) {
                        fileObserver.stopWatching();
                    }
                    eVar2.startWatching();
                    aVar.f50476c.put(a, eVar2);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
