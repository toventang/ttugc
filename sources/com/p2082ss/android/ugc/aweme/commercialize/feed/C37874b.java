package com.p2082ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16312e;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.b */
public final class C37874b extends IXResourceLoader {

    /* renamed from: a */
    public static String f89375a = "";

    /* renamed from: b */
    public static final C37875a f89376b = new C37875a((byte) 0);

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.b$a */
    public static final class C37875a {
        static {
            Covode.recordClassIndex(45327);
        }

        private C37875a() {
        }

        public /* synthetic */ C37875a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(45326);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final C16610ap loadSync(C16610ap apVar, C16667j jVar) {
        C89219l.m154721d(apVar, "");
        C89219l.m154721d(jVar, "");
        C16667j a = new C16667j().mo25897a(jVar);
        a.mo26456f(f89375a);
        C16312e eVar = new C16312e();
        eVar.setService(getService());
        return eVar.loadSync(apVar, a);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(C16610ap apVar, C16667j jVar, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154721d(apVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C16667j a = new C16667j().mo25897a(jVar);
        a.mo26456f(f89375a);
        C16312e eVar = new C16312e();
        eVar.setService(getService());
        eVar.loadAsync(apVar, a, bVar, bVar2);
    }
}
