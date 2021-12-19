package com.bytedance.ies.bullet.p1129c.p1132c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1130a.C16149b;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16204e;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16206g;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.C16566a;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.o */
public abstract class AbstractC16216o<S extends AbstractC16214m, T extends AbstractC16204e, U extends AbstractC16208i, V extends AbstractC16206g> implements AbstractC16203d<S, T, U, V>, AbstractC16584o {

    /* renamed from: a */
    private final AbstractC89244h f38978a = C89250i.m154773a((AbstractC89171a) new C16217a(this));

    /* renamed from: b */
    private final AbstractC89244h f38979b = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C16219c(this));

    /* renamed from: c */
    private final AbstractC89244h f38980c = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C16218b(this));

    static {
        Covode.recordClassIndex(18509);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: d */
    public String mo25713d() {
        return "";
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: e */
    public boolean mo25714e() {
        return false;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: f */
    public final String mo25791f() {
        return (String) this.f38978a.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: g */
    public final AbstractC16582m mo25792g() {
        return (AbstractC16582m) this.f38979b.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public C16587q getLoggerWrapper() {
        return (C16587q) this.f38980c.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.o$a */
    static final class C16217a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16216o f38981a;

        static {
            Covode.recordClassIndex(18510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16217a(AbstractC16216o oVar) {
            super(0);
            this.f38981a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            C16148a aVar;
            String str;
            C16248b b = this.f38981a.mo25711b();
            if (b == null || (aVar = (C16148a) b.mo25832c(C16148a.class)) == null || (str = aVar.f38891a) == null) {
                return "default_bid";
            }
            return str;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.o$b */
    static final class C16218b extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16216o f38982a;

        static {
            Covode.recordClassIndex(18511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16218b(AbstractC16216o oVar) {
            super(0);
            this.f38982a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            AbstractC16652m mVar;
            C16248b b = this.f38982a.mo25711b();
            if (b != null) {
                mVar = (AbstractC16652m) b.mo25832c(AbstractC16652m.class);
            } else {
                mVar = null;
            }
            return new C16587q(mVar, "KitApi");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.o$c */
    static final class C16219c extends AbstractC89220m implements AbstractC89171a<C16566a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16216o f38983a;

        static {
            Covode.recordClassIndex(18512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16219c(AbstractC16216o oVar) {
            super(0);
            this.f38983a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16566a invoke() {
            Application application;
            boolean z;
            C16148a aVar;
            C16149b bVar;
            C16248b b = this.f38983a.mo25711b();
            if (b != null) {
                application = (Application) b.mo25832c(Application.class);
            } else {
                application = null;
            }
            C16248b b2 = this.f38983a.mo25711b();
            if (b2 == null || (aVar = (C16148a) b2.mo25832c(C16148a.class)) == null || (bVar = aVar.f38892b) == null) {
                z = false;
            } else {
                z = bVar.f38894a;
            }
            return new C16566a(application, z);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: a_ */
    public final <T> T mo25789a_(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) AbstractC16584o.C16585a.m30801b(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: b_ */
    public final <T extends AbstractC16568c> T mo25790b_(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) AbstractC16584o.C16585a.m30798a(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16584o.C16585a.m30800a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16584o.C16585a.m30799a(this, str, pVar, str2);
    }
}
