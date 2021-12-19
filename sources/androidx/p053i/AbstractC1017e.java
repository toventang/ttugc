package androidx.p053i;

import androidx.p053i.AbstractC1012d;
import androidx.p053i.C1034h;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.i.e */
public abstract class AbstractC1017e<Key, Value> extends AbstractC1007b<Key, Value> {

    /* renamed from: androidx.i.e$a */
    public static abstract class AbstractC1018a<Value> {
        static {
            Covode.recordClassIndex(1111);
        }

        /* renamed from: a */
        public abstract void mo3730a(List<Value> list);
    }

    /* renamed from: androidx.i.e$c */
    public static abstract class AbstractC1020c<Value> extends AbstractC1018a<Value> {
        static {
            Covode.recordClassIndex(1113);
        }

        /* renamed from: a */
        public abstract void mo3731a(List<Value> list, int i);
    }

    static {
        Covode.recordClassIndex(1110);
    }

    /* renamed from: a */
    public abstract void mo3726a(C1022e<Key> eVar, AbstractC1020c<Value> cVar);

    /* renamed from: a */
    public abstract void mo3727a(C1023f<Key> fVar, AbstractC1018a<Value> aVar);

    /* renamed from: b */
    public abstract Key mo3728b(Value value);

    /* renamed from: b */
    public abstract void mo3729b(C1023f<Key> fVar, AbstractC1018a<Value> aVar);

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1007b
    /* renamed from: a */
    public final Key mo3702a(Value value) {
        if (value == null) {
            return null;
        }
        return mo3728b((Object) value);
    }

    /* renamed from: androidx.i.e$b */
    static class C1019b<Value> extends AbstractC1018a<Value> {

        /* renamed from: a */
        final AbstractC1012d.C1015c<Value> f3592a;

        static {
            Covode.recordClassIndex(1112);
        }

        @Override // androidx.p053i.AbstractC1017e.AbstractC1018a
        /* renamed from: a */
        public final void mo3730a(List<Value> list) {
            if (!this.f3592a.mo3724a()) {
                this.f3592a.mo3722a(new C1034h<>(list, 0, 0));
            }
        }

        C1019b(AbstractC1017e eVar, int i, Executor executor, C1034h.AbstractC1035a<Value> aVar) {
            this.f3592a = new AbstractC1012d.C1015c<>(eVar, i, executor, aVar);
        }
    }

    /* renamed from: androidx.i.e$d */
    static class C1021d<Value> extends AbstractC1020c<Value> {

        /* renamed from: a */
        final AbstractC1012d.C1015c<Value> f3593a;

        /* renamed from: b */
        private final boolean f3594b;

        static {
            Covode.recordClassIndex(1114);
        }

        @Override // androidx.p053i.AbstractC1017e.AbstractC1018a
        /* renamed from: a */
        public final void mo3730a(List<Value> list) {
            if (!this.f3593a.mo3724a()) {
                this.f3593a.mo3722a(new C1034h<>(list, 0, 0));
            }
        }

        @Override // androidx.p053i.AbstractC1017e.AbstractC1020c
        /* renamed from: a */
        public final void mo3731a(List<Value> list, int i) {
            if (this.f3593a.mo3724a()) {
                return;
            }
            if (list.size() + 0 > i) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            } else if (list.size() != 0 || i <= 0) {
                int size = (i - 0) - list.size();
                if (this.f3594b) {
                    this.f3593a.mo3722a(new C1034h<>(list, size, 0));
                } else {
                    this.f3593a.mo3722a(new C1034h<>(list));
                }
            } else {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
        }

        C1021d(AbstractC1017e eVar, boolean z, C1034h.AbstractC1035a<Value> aVar) {
            this.f3593a = new AbstractC1012d.C1015c<>(eVar, 0, null, aVar);
            this.f3594b = z;
        }
    }

    /* renamed from: androidx.i.e$f */
    public static class C1023f<Key> {

        /* renamed from: a */
        public final Key f3598a;

        /* renamed from: b */
        public final int f3599b;

        static {
            Covode.recordClassIndex(1116);
        }

        public C1023f(Key key, int i) {
            this.f3598a = key;
            this.f3599b = i;
        }
    }

    /* renamed from: androidx.i.e$e */
    public static class C1022e<Key> {

        /* renamed from: a */
        public final Key f3595a;

        /* renamed from: b */
        public final int f3596b;

        /* renamed from: c */
        public final boolean f3597c;

        static {
            Covode.recordClassIndex(1115);
        }

        public C1022e(Key key, int i, boolean z) {
            this.f3595a = key;
            this.f3596b = i;
            this.f3597c = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1007b
    /* renamed from: a */
    public final void mo3703a(Value value, int i, Executor executor, C1034h.AbstractC1035a<Value> aVar) {
        mo3727a(new C1023f<>(mo3728b((Object) value), i), new C1019b(this, 1, executor, aVar));
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1007b
    /* renamed from: b */
    public final void mo3705b(Value value, int i, Executor executor, C1034h.AbstractC1035a<Value> aVar) {
        mo3729b(new C1023f<>(mo3728b((Object) value), i), new C1019b(this, 2, executor, aVar));
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.p053i.AbstractC1007b
    /* renamed from: a */
    public final void mo3704a(Key key, int i, boolean z, Executor executor, C1034h.AbstractC1035a<Value> aVar) {
        C1021d dVar = new C1021d(this, z, aVar);
        mo3726a(new C1022e<>(key, i, z), dVar);
        dVar.f3593a.mo3723a(executor);
    }
}
