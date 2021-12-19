package com.bytedance.ies.bullet.kit.p1148a.p1149a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.a.d */
public final class C16311d extends C16667j {

    /* renamed from: a */
    public List<String> f39177a;

    /* renamed from: b */
    public int f39178b;

    /* renamed from: c */
    public boolean f39179c;

    /* renamed from: d */
    public int f39180d;

    /* renamed from: e */
    public boolean f39181e;

    /* renamed from: f */
    public int f39182f;

    static {
        Covode.recordClassIndex(18604);
    }

    private /* synthetic */ C16311d() {
        this("");
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j
    public final String toString() {
        return super.toString() + "\n [fallbackDomains=" + this.f39177a + ",shuffle = " + this.f39178b + ",cdnNoCache=" + this.f39179c + "，maxAttempt=" + this.f39180d + "，isRemote=" + this.f39181e + ",useInteraction = " + this.f39182f + ']';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16311d(String str) {
        super(str);
        C89219l.m154719c(str, "");
        this.f39177a = new ArrayList();
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j
    /* renamed from: a */
    public final C16667j mo25897a(C16667j jVar) {
        C89219l.m154719c(jVar, "");
        if (jVar instanceof C16311d) {
            C16311d dVar = (C16311d) jVar;
            this.f39177a = dVar.f39177a;
            this.f39178b = dVar.f39178b;
            this.f39179c = dVar.f39179c;
            this.f39180d = dVar.f39180d;
            this.f39182f = dVar.f39182f;
        }
        return super.mo25897a(jVar);
    }
}
