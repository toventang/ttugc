package androidx.p053i;

import androidx.p053i.AbstractC1012d;
import androidx.p053i.C1034h;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.i.g */
public abstract class AbstractC1027g<Key, Value> extends AbstractC1007b<Key, Value> {

    /* renamed from: b */
    final Object f3615b = new Object();

    /* renamed from: c */
    Key f3616c = null;

    /* renamed from: d */
    Key f3617d = null;

    /* renamed from: androidx.i.g$a */
    public static abstract class AbstractC1028a<Key, Value> {
        static {
            Covode.recordClassIndex(1121);
        }

        /* renamed from: a */
        public abstract void mo3736a(List<Value> list, Key key);
    }

    /* renamed from: androidx.i.g$c */
    public static abstract class AbstractC1030c<Key, Value> {
        static {
            Covode.recordClassIndex(1123);
        }

        /* renamed from: a */
        public abstract void mo3737a(List<Value> list, Key key);
    }

    static {
        Covode.recordClassIndex(1120);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1007b
    /* renamed from: a */
    public final Key mo3702a(Value value) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo3734a(C1032e<Key> eVar, AbstractC1030c<Key, Value> cVar);

    /* renamed from: a */
    public abstract void mo3735a(C1033f<Key> fVar, AbstractC1028a<Key, Value> aVar);

    /* renamed from: b */
    private Key mo9368b() {
        Key key;
        synchronized (this.f3615b) {
            key = this.f3617d;
        }
        return key;
    }

    /* renamed from: c */
    private Key m3501c() {
        Key key;
        synchronized (this.f3615b) {
            key = this.f3616c;
        }
        return key;
    }

    /* renamed from: androidx.i.g$e */
    public static class C1032e<Key> {

        /* renamed from: a */
        public final int f3623a;

        /* renamed from: b */
        public final boolean f3624b;

        static {
            Covode.recordClassIndex(1125);
        }

        public C1032e(int i, boolean z) {
            this.f3623a = i;
            this.f3624b = z;
        }
    }

    /* renamed from: androidx.i.g$f */
    public static class C1033f<Key> {

        /* renamed from: a */
        public final Key f3625a;

        /* renamed from: b */
        public final int f3626b;

        static {
            Covode.recordClassIndex(1126);
        }

        public C1033f(Key key, int i) {
            this.f3625a = key;
            this.f3626b = i;
        }
    }

    /* renamed from: androidx.i.g$b */
    static class C1029b<Key, Value> extends AbstractC1028a<Key, Value> {

        /* renamed from: a */
        final AbstractC1012d.C1015c<Value> f3618a;

        /* renamed from: b */
        private final AbstractC1027g<Key, Value> f3619b;

        static {
            Covode.recordClassIndex(1122);
        }

        @Override // androidx.p053i.AbstractC1027g.AbstractC1028a
        /* renamed from: a */
        public final void mo3736a(List<Value> list, Key key) {
            if (!this.f3618a.mo3724a()) {
                if (this.f3618a.f3584a == 1) {
                    AbstractC1027g<Key, Value> gVar = this.f3619b;
                    synchronized (gVar.f3615b) {
                        gVar.f3616c = key;
                    }
                } else {
                    AbstractC1027g<Key, Value> gVar2 = this.f3619b;
                    synchronized (gVar2.f3615b) {
                        gVar2.f3617d = key;
                    }
                }
                this.f3618a.mo3722a(new C1034h<>(list, 0, 0));
            }
        }

        C1029b(AbstractC1027g<Key, Value> gVar, int i, Executor executor, C1034h.AbstractC1035a<Value> aVar) {
            this.f3618a = new AbstractC1012d.C1015c<>(gVar, i, executor, aVar);
            this.f3619b = gVar;
        }
    }

    /* renamed from: androidx.i.g$d */
    static class C1031d<Key, Value> extends AbstractC1030c<Key, Value> {

        /* renamed from: a */
        final AbstractC1012d.C1015c<Value> f3620a;

        /* renamed from: b */
        private final AbstractC1027g<Key, Value> f3621b;

        /* renamed from: c */
        private final boolean f3622c;

        static {
            Covode.recordClassIndex(1124);
        }

        @Override // androidx.p053i.AbstractC1027g.AbstractC1030c
        /* renamed from: a */
        public final void mo3737a(List<Value> list, Key key) {
            if (!this.f3620a.mo3724a()) {
                AbstractC1027g<Key, Value> gVar = this.f3621b;
                synchronized (gVar.f3615b) {
                    gVar.f3617d = null;
                    gVar.f3616c = key;
                }
                this.f3620a.mo3722a(new C1034h<>(list, 0, 0));
            }
        }

        C1031d(AbstractC1027g<Key, Value> gVar, boolean z, C1034h.AbstractC1035a<Value> aVar) {
            this.f3620a = new AbstractC1012d.C1015c<>(gVar, 0, null, aVar);
            this.f3621b = gVar;
            this.f3622c = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1007b
    /* renamed from: a */
    public final void mo3703a(Value value, int i, Executor executor, C1034h.AbstractC1035a<Value> aVar) {
        Key c = m3501c();
        if (c != null) {
            mo3735a(new C1033f<>(c, i), new C1029b(this, 1, executor, aVar));
        } else {
            aVar.mo3714a(1, C1034h.f3627a);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1007b
    /* renamed from: b */
    public final void mo3705b(Value value, int i, Executor executor, C1034h.AbstractC1035a<Value> aVar) {
        Key b = mo9368b();
        if (b != null) {
            new C1033f(b, i);
            new C1029b(this, 2, executor, aVar);
            return;
        }
        aVar.mo3714a(2, C1034h.f3627a);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1007b
    /* renamed from: a */
    public final void mo3704a(Key key, int i, boolean z, Executor executor, C1034h.AbstractC1035a<Value> aVar) {
        C1031d dVar = new C1031d(this, z, aVar);
        mo3734a(new C1032e<>(i, z), dVar);
        dVar.f3620a.mo3723a(executor);
    }
}
