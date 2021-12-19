package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86797f;
import com.p2082ss.ugc.effectplatform.p4451h.C86792a;
import p4519d.p4520a.p4533f.AbstractC88065d;
import p4519d.p4520a.p4534g.C88073f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.b */
public abstract class AbstractC86891b implements AbstractC88065d {

    /* renamed from: a */
    private String f195911a;

    /* renamed from: b */
    private final C86792a f195912b;

    /* renamed from: e */
    public boolean f195913e;

    static {
        Covode.recordClassIndex(102656);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo139952a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo139953b();

    /* renamed from: f */
    public void mo140604f() {
    }

    /* renamed from: com.ss.ugc.effectplatform.task.b$a */
    static final class C86892a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC86891b f195914a;

        static {
            Covode.recordClassIndex(102657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86892a(AbstractC86891b bVar) {
            super(0);
            this.f195914a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f195914a.mo139953b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.b$b */
    public static final class RunnableC86893b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f195915a;

        static {
            Covode.recordClassIndex(102658);
        }

        public final void run() {
            this.f195915a.invoke();
        }

        RunnableC86893b(AbstractC89171a aVar) {
            this.f195915a = aVar;
        }
    }

    @Override // p4519d.p4520a.p4533f.AbstractC88065d
    public String getId() {
        String str = this.f195911a;
        if (str == null) {
            return "0";
        }
        return str;
    }

    @Override // p4519d.p4520a.p4533f.AbstractC88065d
    public void cancel() {
        this.f195913e = true;
        m150523a(new C86892a(this));
    }

    @Override // p4519d.p4520a.p4533f.AbstractC88065d
    public void run() {
        AbstractC86796e eVar;
        String str = this.f195911a;
        AbstractC86796e eVar2 = null;
        if (str != null) {
            C86792a aVar = this.f195912b;
            if (aVar != null) {
                eVar = aVar.mo140035a(str);
            } else {
                eVar = null;
            }
            if (eVar instanceof AbstractC86797f) {
                ((AbstractC86797f) eVar).mo139970a();
            }
        }
        if (!this.f195913e) {
            mo139952a();
            String str2 = this.f195911a;
            if (str2 != null) {
                C86792a aVar2 = this.f195912b;
                if (aVar2 != null) {
                    eVar2 = aVar2.mo140035a(str2);
                }
                if (eVar2 instanceof AbstractC86797f) {
                    ((AbstractC86797f) eVar2).mo139971b();
                }
            }
        }
    }

    public /* synthetic */ AbstractC86891b(String str) {
        this(str, null);
    }

    /* renamed from: a */
    protected static void m150523a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        C88073f.m153147a(new RunnableC86893b(aVar));
    }

    public AbstractC86891b(String str, C86792a aVar) {
        this.f195911a = str;
        this.f195912b = aVar;
    }
}
