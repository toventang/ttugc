package androidx.p053i;

import androidx.lifecycle.AbstractC1185b;
import androidx.lifecycle.LiveData;
import androidx.p012a.p013a.p014a.C0175a;
import androidx.p053i.AbstractC1012d;
import androidx.p053i.AbstractC1036i;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: androidx.i.f */
public final class C1024f<Key, Value> {

    /* renamed from: a */
    public AbstractC1036i.AbstractC1039a f3600a;

    /* renamed from: b */
    public Executor f3601b = C0175a.f467c;

    /* renamed from: c */
    private Key f3602c;

    /* renamed from: d */
    private AbstractC1036i.C1042d f3603d;

    /* renamed from: e */
    private AbstractC1012d.AbstractC1013a<Key, Value> f3604e;

    static {
        Covode.recordClassIndex(1117);
    }

    /* renamed from: a */
    public final LiveData<AbstractC1036i<Value>> mo3732a() {
        final Key key = this.f3602c;
        final AbstractC1036i.C1042d dVar = this.f3603d;
        final AbstractC1036i.AbstractC1039a aVar = this.f3600a;
        final AbstractC1012d.AbstractC1013a<Key, Value> aVar2 = this.f3604e;
        final Executor executor = C0175a.f466b;
        final Executor executor2 = this.f3601b;
        return new AbstractC1185b<AbstractC1036i<Value>>(executor2) {
            /* class androidx.p053i.C1024f.C10251 */

            /* renamed from: m */
            private AbstractC1036i<Value> f3611m;

            /* renamed from: n */
            private AbstractC1012d<Key, Value> f3612n;

            /* renamed from: o */
            private final AbstractC1012d.AbstractC1014b f3613o = new AbstractC1012d.AbstractC1014b() {
                /* class androidx.p053i.C1024f.C10251.C10261 */

                static {
                    Covode.recordClassIndex(1119);
                }

                @Override // androidx.p053i.AbstractC1012d.AbstractC1014b
                /* renamed from: a */
                public final void mo3721a() {
                    C10251 r0 = C10251.this;
                    C0175a a = C0175a.m581a();
                    Runnable runnable = r0.f3976f;
                    if (a.mo338b()) {
                        runnable.run();
                    } else {
                        a.mo337b(runnable);
                    }
                }
            };

            static {
                Covode.recordClassIndex(1118);
            }

            @Override // androidx.lifecycle.AbstractC1185b
            /* renamed from: a */
            public final /* synthetic */ Object mo3733a() {
                AbstractC1036i<Value> a;
                Key key = (Key) key;
                AbstractC1036i<Value> iVar = this.f3611m;
                if (iVar != null) {
                    key = (Key) iVar.mo3713c();
                }
                do {
                    AbstractC1012d<Key, Value> dVar = this.f3612n;
                    if (dVar != null) {
                        dVar.mo3718b(this.f3613o);
                    }
                    AbstractC1012d<Key, Value> a2 = aVar2.mo3720a();
                    this.f3612n = a2;
                    a2.mo3717a(this.f3613o);
                    AbstractC1036i.C1040b bVar = new AbstractC1036i.C1040b(this.f3612n, dVar);
                    bVar.f3653a = executor;
                    bVar.f3654b = executor2;
                    bVar.f3655c = aVar;
                    bVar.f3656d = key;
                    a = bVar.mo3755a();
                    this.f3611m = a;
                } while (a.mo3747f());
                return this.f3611m;
            }
        }.f3972b;
    }

    public C1024f(AbstractC1012d.AbstractC1013a<Key, Value> aVar, AbstractC1036i.C1042d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PagedList.Config must be provided");
        } else if (aVar != null) {
            this.f3604e = aVar;
            this.f3603d = dVar;
        } else {
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        }
    }
}
