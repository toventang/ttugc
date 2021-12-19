package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86702f;
import com.p2082ss.ugc.effectplatform.p4449f.C86782b;
import com.p2082ss.ugc.effectplatform.p4449f.C86784d;
import com.p2082ss.ugc.effectplatform.p4449f.C86785e;
import com.p2082ss.ugc.effectplatform.p4450g.C86791c;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.C86792a;
import p4519d.p4520a.p4532e.C88060b;
import p4519d.p4520a.p4534g.C88068c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.a */
public abstract class AbstractC86851a<T, R extends AbstractC86845h<T>> extends AbstractC86891b {

    /* renamed from: a */
    public final C86792a f195800a;

    /* renamed from: b */
    public final String f195801b;

    /* renamed from: c */
    private final AbstractC86700d f195802c;

    /* renamed from: d */
    private final C86695b f195803d;

    static {
        Covode.recordClassIndex(102616);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo140547a(C86695b bVar, String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C86701e mo140550c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo140551d() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo140552e() {
        return 10002;
    }

    /* renamed from: com.ss.ugc.effectplatform.task.a$a */
    static final class C86852a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC86851a f195804a;

        static {
            Covode.recordClassIndex(102617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86852a(AbstractC86851a aVar) {
            super(0);
            this.f195804a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str = this.f195804a.f195801b;
            if (str != null) {
                this.f195804a.f195800a.mo140037b(str);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86852a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.a$b */
    public static final class C86853b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC86851a f195805a;

        /* renamed from: b */
        final /* synthetic */ C86840e f195806b;

        static {
            Covode.recordClassIndex(102618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86853b(AbstractC86851a aVar, C86840e eVar) {
            super(0);
            this.f195805a = aVar;
            this.f195806b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e<T> a = this.f195805a.f195800a.mo140035a(this.f195805a.f195801b);
            if (a != null) {
                a.onFail(null, this.f195806b);
            }
            this.f195805a.f195800a.mo140037b(this.f195805a.f195801b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.a$c */
    public static final class C86854c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC86851a f195807a;

        /* renamed from: b */
        final /* synthetic */ Object f195808b;

        static {
            Covode.recordClassIndex(102619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86854c(AbstractC86851a aVar, Object obj) {
            super(0);
            this.f195807a = aVar;
            this.f195808b = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e<T> a = this.f195807a.f195800a.mo140035a(this.f195807a.f195801b);
            if (a != null) {
                a.onSuccess((T) this.f195808b);
            }
            this.f195807a.f195800a.mo140037b(this.f195807a.f195801b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public void mo139952a() {
        C86702f fetchFromNetwork;
        long currentTimeMillis = System.currentTimeMillis();
        int d = mo140551d();
        C86701e c = mo140550c();
        String str = null;
        String str2 = null;
        while (true) {
            int i = d - 1;
            if (d != 0) {
                try {
                    if (!this.f195913e) {
                        AbstractC86700d dVar = this.f195802c;
                        if (dVar != null && (fetchFromNetwork = dVar.fetchFromNetwork(c)) != null) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            String a = C86791c.m150338a(fetchFromNetwork.f195518b);
                            if (a.length() == 0) {
                                throw new C86784d(-2, "net response returned empty response! errorMsg: " + fetchFromNetwork.f195520d);
                            }
                            C86695b bVar = this.f195803d;
                            if (bVar != null) {
                                R a2 = mo140547a(bVar, a);
                                if (a2 != null) {
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    if (a2.getStatusCode() != 0) {
                                        throw new C86785e(a2.getStatusCode(), a2.getResponseMessage());
                                    } else if (a2.checkValue()) {
                                        mo140548a(currentTimeMillis, currentTimeMillis2, currentTimeMillis3, a2);
                                        return;
                                    } else {
                                        str2 = a2.getResponseMessage();
                                        d = i;
                                    }
                                } else {
                                    throw new C86782b("json parser returned null!");
                                }
                            } else {
                                throw new RuntimeException("json converter is null");
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (i == 0 || (e instanceof C86785e)) {
                        String str3 = c.f195511a;
                        try {
                            str = C88068c.m153143a(str3);
                        } catch (Exception unused) {
                        }
                        mo140549a(str3, str, new C86840e(e));
                        C88060b.m153136a("BaseNetworkTask", "fetch from network failed", e);
                        return;
                    }
                }
            } else {
                C86840e eVar = new C86840e(mo140552e());
                if (str2 != null) {
                    eVar.f195757b = str2;
                }
                mo140549a(null, null, eVar);
                return;
            }
        }
        throw new C86784d(-2, "net response returned null!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo140549a(String str, String str2, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        if (this.f195801b != null) {
            m150523a(new C86853b(this, eVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC86851a(AbstractC86700d dVar, C86695b bVar, C86792a aVar, String str) {
        super(str, aVar);
        C89219l.m154719c(aVar, "");
        this.f195802c = dVar;
        this.f195803d = bVar;
        this.f195800a = aVar;
        this.f195801b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo140548a(long j, long j2, long j3, R r) {
        C89219l.m154719c(r, "");
        Object responseData = r.getResponseData();
        if (responseData != null && this.f195801b != null) {
            m150523a(new C86854c(this, responseData));
        }
    }
}
