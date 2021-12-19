package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.survey.p637b.C10796a;
import com.bytedance.android.livesdk.survey.p638ui.C10805a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.a */
public abstract class AbstractC10819a {

    /* renamed from: a */
    public final long f26029a = 10;

    /* renamed from: b */
    public long f26030b = -1;

    /* renamed from: c */
    public final C10796a f26031c = new C10796a(1, new C10822c(this));

    /* renamed from: d */
    public final C10796a f26032d = new C10796a(10, new C10823d(this));

    /* renamed from: e */
    public final C10796a f26033e = new C10796a(1, new C10821b(this));

    /* renamed from: f */
    public EnumC10820a f26034f = EnumC10820a.HOLD;

    /* renamed from: g */
    public boolean f26035g;

    /* renamed from: h */
    public final DataChannel f26036h;

    /* renamed from: i */
    private final long f26037i = 1;

    /* renamed from: j */
    private final AbstractC89172b<Boolean, C89391z> f26038j;

    /* renamed from: k */
    private final AbstractC89171a<C89391z> f26039k;

    /* renamed from: l */
    private final AbstractC89171a<C89391z> f26040l;

    /* renamed from: m */
    private final AbstractC89172b<C10805a.C10806a.EnumC10807a, C89391z> f26041m;

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.a$a */
    public enum EnumC10820a {
        HOLD,
        QUESTION,
        FEEDBACK,
        DISMISSED;

        static {
            Covode.recordClassIndex(12422);
        }
    }

    static {
        Covode.recordClassIndex(12421);
    }

    /* renamed from: e */
    public abstract void mo17725e();

    /* renamed from: f */
    public abstract boolean mo17726f();

    /* renamed from: g */
    public abstract void mo17727g();

    /* renamed from: h */
    public abstract void mo17728h();

    /* renamed from: i */
    public abstract void mo17729i();

    /* renamed from: j */
    public abstract void mo17730j();

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.a$b */
    static final class C10821b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10819a f26043a;

        static {
            Covode.recordClassIndex(12423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10821b(AbstractC10819a aVar) {
            super(0);
            this.f26043a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f26043a.mo17730j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.a$c */
    static final class C10822c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10819a f26044a;

        static {
            Covode.recordClassIndex(12424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10822c(AbstractC10819a aVar) {
            super(0);
            this.f26044a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f26044a.mo17728h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.a$d */
    static final class C10823d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10819a f26045a;

        static {
            Covode.recordClassIndex(12425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10823d(AbstractC10819a aVar) {
            super(0);
            this.f26045a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f26045a.mo17729i();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo17724d() {
        if (this.f26035g) {
            this.f26039k.invoke();
        }
    }

    /* renamed from: c */
    public final void mo17723c() {
        mo17720a(EnumC10820a.FEEDBACK);
        this.f26032d.mo17711c();
        this.f26033e.mo17709a(this.f26037i);
        this.f26033e.mo17708a();
    }

    /* renamed from: b */
    public final void mo17722b() {
        m19406b(C10805a.C10806a.EnumC10807a.NOT_LOG);
        this.f26035g = false;
        int i = C10824b.f26047b[this.f26034f.ordinal()];
        if (i == 1) {
            this.f26031c.mo17710b();
        } else if (i == 2) {
            this.f26032d.mo17710b();
        } else if (i == 3) {
            this.f26033e.mo17710b();
        }
    }

    /* renamed from: a */
    public final void mo17718a() {
        this.f26035g = true;
        int i = C10824b.f26046a[this.f26034f.ordinal()];
        if (i == 1) {
            m19406b(C10805a.C10806a.EnumC10807a.NOT_LOG);
            if (this.f26030b >= 0) {
                this.f26031c.mo17708a();
            }
        } else if (i == 2) {
            this.f26032d.mo17708a();
            mo17721a(false);
            mo17724d();
        } else if (i != 3) {
            m19406b(C10805a.C10806a.EnumC10807a.NOT_LOG);
        } else {
            this.f26032d.mo17711c();
            this.f26033e.mo17708a();
            mo17721a(false);
            if (this.f26035g) {
                this.f26040l.invoke();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17720a(EnumC10820a aVar) {
        C89219l.m154721d(aVar, "");
        this.f26034f = aVar;
    }

    /* renamed from: b */
    private void m19406b(C10805a.C10806a.EnumC10807a aVar) {
        C89219l.m154721d(aVar, "");
        if (this.f26035g) {
            this.f26041m.invoke(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17721a(boolean z) {
        if (this.f26035g) {
            this.f26038j.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo17719a(C10805a.C10806a.EnumC10807a aVar) {
        C89219l.m154721d(aVar, "");
        if (this.f26034f != EnumC10820a.DISMISSED) {
            this.f26031c.mo17711c();
            this.f26032d.mo17711c();
            this.f26033e.mo17711c();
            mo17720a(EnumC10820a.DISMISSED);
            m19406b(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: h.f.a.b<? super com.bytedance.android.livesdk.survey.ui.a$a$a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC10819a(DataChannel dataChannel, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super C10805a.C10806a.EnumC10807a, C89391z> bVar2) {
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar2, "");
        this.f26036h = dataChannel;
        this.f26038j = bVar;
        this.f26039k = aVar;
        this.f26040l = aVar2;
        this.f26041m = bVar2;
    }
}
