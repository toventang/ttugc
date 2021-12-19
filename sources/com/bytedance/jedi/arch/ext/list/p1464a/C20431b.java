package com.bytedance.jedi.arch.ext.list.p1464a;

import androidx.recyclerview.widget.AbstractC1485u;
import androidx.recyclerview.widget.C1415b;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.p1464a.C20435c;
import java.util.List;
import java.util.concurrent.Executor;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.b */
public final class C20431b<T> {

    /* renamed from: a */
    public final Executor f48356a;

    /* renamed from: b */
    public int f48357b;

    /* renamed from: c */
    public List<? extends T> f48358c;

    /* renamed from: d */
    public final AbstractC1485u f48359d;

    /* renamed from: e */
    public final C20435c<T> f48360e;

    /* renamed from: f */
    private final C20438e f48361f;

    static {
        Covode.recordClassIndex(23952);
    }

    /* renamed from: a */
    public final int mo33766a() {
        return this.f48358c.size();
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.b$a */
    public static final class RunnableC20432a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C20431b f48362a;

        /* renamed from: b */
        final /* synthetic */ List f48363b;

        /* renamed from: c */
        final /* synthetic */ List f48364c;

        /* renamed from: d */
        final /* synthetic */ int f48365d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f48366e;

        static {
            Covode.recordClassIndex(23953);
        }

        public RunnableC20432a(C20431b bVar, List list, List list2, int i, AbstractC89171a aVar) {
            this.f48362a = bVar;
            this.f48363b = list;
            this.f48364c = list2;
            this.f48365d = i;
            this.f48366e = aVar;
        }

        /* renamed from: com.bytedance.jedi.arch.ext.list.a.b$a$a */
        public static final class C20434a extends C1445j.AbstractC1447a {

            /* renamed from: a */
            final /* synthetic */ RunnableC20432a f48369a;

            static {
                Covode.recordClassIndex(23955);
            }

            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: a */
            public final int mo3768a() {
                return this.f48369a.f48363b.size();
            }

            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: b */
            public final int mo3770b() {
                return this.f48369a.f48364c.size();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C20434a(RunnableC20432a aVar) {
                this.f48369a = aVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: a */
            public final Object mo3769a(int i, int i2) {
                Object obj = this.f48369a.f48363b.get(i);
                Object obj2 = this.f48369a.f48364c.get(i2);
                if (obj != null && obj2 != null) {
                    return this.f48369a.f48362a.f48360e.f48371b.mo4955c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: b */
            public final boolean mo3771b(int i, int i2) {
                Object obj = this.f48369a.f48363b.get(i);
                Object obj2 = this.f48369a.f48364c.get(i2);
                if (obj != null) {
                    if (obj2 != null) {
                        return this.f48369a.f48362a.f48360e.f48371b.mo4953a(obj, obj2);
                    }
                    return false;
                } else if (obj2 == null) {
                    return true;
                } else {
                    return false;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: c */
            public final boolean mo3772c(int i, int i2) {
                Object obj = this.f48369a.f48363b.get(i);
                Object obj2 = this.f48369a.f48364c.get(i2);
                if (obj != null) {
                    if (obj2 != null) {
                        return this.f48369a.f48362a.f48360e.f48371b.mo4954b(obj, obj2);
                    }
                } else if (obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }
        }

        public final void run() {
            final C1445j.C1450d a = C1445j.m4921a(new C20434a(this));
            C89219l.m154709a((Object) a, "");
            this.f48362a.f48356a.execute(new Runnable(this) {
                /* class com.bytedance.jedi.arch.ext.list.p1464a.C20431b.RunnableC20432a.RunnableC204331 */

                /* renamed from: a */
                final /* synthetic */ RunnableC20432a f48367a;

                static {
                    Covode.recordClassIndex(23954);
                }

                {
                    this.f48367a = r1;
                }

                public final void run() {
                    if (this.f48367a.f48362a.f48357b == this.f48367a.f48365d) {
                        C20431b bVar = this.f48367a.f48362a;
                        List<? extends T> list = this.f48367a.f48364c;
                        C1445j.C1450d dVar = a;
                        AbstractC89171a aVar = this.f48367a.f48366e;
                        bVar.f48358c = list;
                        dVar.mo4952a(bVar.f48359d);
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C20431b(RecyclerView.AbstractC1350a<?> aVar, C1445j.AbstractC1451e<T> eVar) {
        this(new C1415b(aVar), new C20435c.C20436a(eVar).mo33770a(), (C20438e) null);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
    }

    /* renamed from: a */
    public final T mo33767a(int i, boolean z) {
        C20438e eVar;
        List<? extends T> list = this.f48358c;
        if (i >= list.size() || i < 0) {
            return null;
        }
        if (z && (eVar = this.f48361f) != null) {
            eVar.mo33771a(i);
        }
        return (T) list.get(i);
    }

    public /* synthetic */ C20431b(RecyclerView.AbstractC1350a aVar, C1445j.AbstractC1451e eVar, byte b) {
        this(aVar, eVar);
    }

    public C20431b(AbstractC1485u uVar, C20435c<T> cVar, C20438e eVar) {
        C89219l.m154719c(uVar, "");
        C89219l.m154719c(cVar, "");
        this.f48359d = uVar;
        this.f48360e = cVar;
        this.f48361f = eVar;
        Executor executor = cVar.f48372c;
        this.f48356a = executor == null ? new ExecutorC20441f() : executor;
        this.f48358c = C89086z.INSTANCE;
    }
}
