package com.bytedance.ies.bullet.p1125a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1125a.C16117b;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.AbstractC16245e;
import com.bytedance.ies.bullet.p1129c.C16156c;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.a.a */
public abstract class AbstractC16114a {

    /* renamed from: a */
    public AbstractC16133g f38808a;

    /* renamed from: b */
    public C16117b.C16118a f38809b = new C16117b.C16118a();

    /* renamed from: c */
    private AbstractC16134h f38810c;

    static {
        Covode.recordClassIndex(18407);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C16117b.C16118a mo25650a();

    /* renamed from: com.bytedance.ies.bullet.a.a$a */
    public static final class C16115a implements AbstractC16245e {

        /* renamed from: a */
        public final /* synthetic */ C16117b f38811a;

        static {
            Covode.recordClassIndex(18408);
        }

        @Override // com.bytedance.ies.bullet.p1129c.AbstractC16245e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC16239d.AbstractC16241b mo25652a() {
            return this.f38811a;
        }

        C16115a(C16117b bVar) {
            this.f38811a = bVar;
        }
    }

    public AbstractC16114a(AbstractC16134h hVar) {
        C89219l.m154719c(hVar, "");
        this.f38810c = hVar;
    }

    /* renamed from: a */
    public C16117b mo25651a(String str) {
        C89219l.m154719c(str, "");
        C16117b.C16118a a = mo25650a();
        C16622e.C16623a.m30858a().mo26349a(str, a.f38814a.mo26385a());
        C16117b a2 = a.mo25660a();
        C16156c.m29998a(str, new C16115a(a2));
        return a2;
    }
}
