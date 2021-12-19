package com.google.android.datatransport.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.AbstractC25169q;
import com.google.android.datatransport.runtime.backends.C25136j;
import com.google.android.datatransport.runtime.backends.C25139l;
import com.google.android.datatransport.runtime.p1927d.C25149b;
import com.google.android.datatransport.runtime.p1927d.C25150c;
import com.google.android.datatransport.runtime.scheduling.C25172a;
import com.google.android.datatransport.runtime.scheduling.C25212d;
import com.google.android.datatransport.runtime.scheduling.C25214f;
import com.google.android.datatransport.runtime.scheduling.C25215g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25239s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25228h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25234n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25235o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25238r;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25180ae;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25185e;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25186f;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25209z;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88077b;
import dagger.p4535a.C88079d;
import dagger.p4535a.C88081f;
import java.util.concurrent.Executor;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.d */
final class C25146d extends AbstractC25169q {

    /* renamed from: a */
    private AbstractC89405a<Executor> f59582a;

    /* renamed from: b */
    private AbstractC89405a<Context> f59583b;

    /* renamed from: c */
    private AbstractC89405a f59584c;

    /* renamed from: d */
    private AbstractC89405a f59585d;

    /* renamed from: e */
    private AbstractC89405a f59586e;

    /* renamed from: f */
    private AbstractC89405a<C25188h> f59587f;

    /* renamed from: g */
    private AbstractC89405a<AbstractC25223g> f59588g;

    /* renamed from: h */
    private AbstractC89405a<AbstractC25239s> f59589h;

    /* renamed from: i */
    private AbstractC89405a<C25172a> f59590i;

    /* renamed from: j */
    private AbstractC89405a<C25228h> f59591j;

    /* renamed from: k */
    private AbstractC89405a<C25235o> f59592k;

    /* renamed from: l */
    private AbstractC89405a<C25168p> f59593l;

    static {
        Covode.recordClassIndex(30512);
    }

    /* renamed from: com.google.android.datatransport.runtime.d$a */
    static final class C25147a implements AbstractC25169q.AbstractC25170a {

        /* renamed from: a */
        private Context f59594a;

        static {
            Covode.recordClassIndex(30513);
        }

        private C25147a() {
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25169q.AbstractC25170a
        /* renamed from: a */
        public final AbstractC25169q mo41133a() {
            if (this.f59594a != null) {
                return new C25146d(this.f59594a, (byte) 0);
            }
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }

        /* synthetic */ C25147a(byte b) {
            this();
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25169q.AbstractC25170a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC25169q.AbstractC25170a mo41132a(Context context) {
            this.f59594a = (Context) C88081f.m153152a(context);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.AbstractC25169q
    /* renamed from: a */
    public final C25168p mo41130a() {
        return this.f59593l.get();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.AbstractC25169q
    /* renamed from: b */
    public final AbstractC25182c mo41131b() {
        return this.f59587f.get();
    }

    private C25146d(Context context) {
        this.f59582a = C88077b.m153149a(C25159i.f59601a);
        AbstractC88078c a = C88079d.m153151a(context);
        this.f59583b = a;
        C25136j jVar = new C25136j(a, C25149b.f59595a, C25150c.f59596a);
        this.f59584c = jVar;
        this.f59585d = C88077b.m153149a(new C25139l(this.f59583b, jVar));
        this.f59586e = new C25180ae(this.f59583b, C25185e.f59651a);
        this.f59587f = C88077b.m153149a(new C25209z(C25149b.f59595a, C25150c.f59596a, C25186f.f59652a, this.f59586e));
        C25214f fVar = new C25214f(C25149b.f59595a);
        this.f59588g = fVar;
        C25215g gVar = new C25215g(this.f59583b, this.f59587f, fVar, C25150c.f59596a);
        this.f59589h = gVar;
        AbstractC89405a<Executor> aVar = this.f59582a;
        AbstractC89405a aVar2 = this.f59585d;
        AbstractC89405a<C25188h> aVar3 = this.f59587f;
        this.f59590i = new C25212d(aVar, aVar2, gVar, aVar3, aVar3);
        AbstractC89405a<Context> aVar4 = this.f59583b;
        AbstractC89405a aVar5 = this.f59585d;
        AbstractC89405a<C25188h> aVar6 = this.f59587f;
        this.f59591j = new C25234n(aVar4, aVar5, aVar6, this.f59589h, this.f59582a, aVar6, C25149b.f59595a);
        AbstractC89405a<Executor> aVar7 = this.f59582a;
        AbstractC89405a<C25188h> aVar8 = this.f59587f;
        this.f59592k = new C25238r(aVar7, aVar8, this.f59589h, aVar8);
        this.f59593l = C88077b.m153149a(new C25171r(C25149b.f59595a, C25150c.f59596a, this.f59590i, this.f59591j, this.f59592k));
    }

    /* synthetic */ C25146d(Context context, byte b) {
        this(context);
    }
}
