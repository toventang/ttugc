package com.bytedance.liko.leakdetector;

import com.bytedance.covode.number.Covode;
import java.util.List;
import okhttp3.AbstractC90031ad;
import okhttp3.C90205x;
import okhttp3.C90208y;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.AbstractC89716b;
import p4640l.AbstractC89743d;
import p4640l.C89781l;
import p4640l.C89782m;
import p4640l.p4641a.p4642a.C89710a;

/* renamed from: com.bytedance.liko.leakdetector.b */
public interface AbstractC20856b {

    /* renamed from: a */
    public static final C20857a f49312a = C20857a.f49314b;

    static {
        Covode.recordClassIndex(24435);
    }

    /* renamed from: a */
    void mo34285a(String str, List<C90205x.C90207b> list, AbstractC20851a<String> aVar);

    /* renamed from: com.bytedance.liko.leakdetector.b$a */
    public static final class C20857a {

        /* renamed from: a */
        public static AbstractC20856b f49313a;

        /* renamed from: b */
        static final /* synthetic */ C20857a f49314b = new C20857a();

        /* renamed from: c */
        private static AbstractC20856b f49315c;

        private C20857a() {
        }

        static {
            Covode.recordClassIndex(24436);
        }

        /* renamed from: a */
        public static AbstractC20856b m39211a() {
            AbstractC20856b bVar = f49313a;
            if (bVar != null) {
                return bVar;
            }
            C20858b bVar2 = new C20858b();
            f49315c = bVar2;
            return bVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.liko.leakdetector.b$b */
    public static final class C20858b implements AbstractC20856b {

        /* renamed from: b */
        public final C90208y f49316b = new C90208y();

        static {
            Covode.recordClassIndex(24437);
        }

        /* renamed from: com.bytedance.liko.leakdetector.b$b$a */
        public static final class C20859a implements AbstractC89743d<AbstractC90031ad> {

            /* renamed from: a */
            final /* synthetic */ AbstractC20851a f49317a;

            static {
                Covode.recordClassIndex(24438);
            }

            C20859a(AbstractC20851a aVar) {
                this.f49317a = aVar;
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34286a(AbstractC89716b<AbstractC90031ad> bVar, Throwable th) {
                C89219l.m154719c(bVar, "");
                C89219l.m154719c(th, "");
                this.f49317a.mo34284a(th);
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34287a(AbstractC89716b<AbstractC90031ad> bVar, C89781l<AbstractC90031ad> lVar) {
                C89219l.m154719c(bVar, "");
                C89219l.m154719c(lVar, "");
                this.f49317a.mo34283a(String.valueOf(lVar.f203561b));
            }
        }

        @Override // com.bytedance.liko.leakdetector.AbstractC20856b
        /* renamed from: a */
        public final void mo34285a(String str, List<C90205x.C90207b> list, AbstractC20851a<String> aVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            ((FileApi) new C89782m.C89784a().mo144323a(str).mo144325a(this.f49316b).mo144324a(C89710a.m155746a()).mo144326a().mo144318a(FileApi.class)).upload(str, list).mo144268a(new C20859a(aVar));
        }
    }
}
