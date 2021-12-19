package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
public final class C1418d<T> {

    /* renamed from: h */
    private static final Executor f4666h = new ExecutorC1423b();

    /* renamed from: a */
    final AbstractC1485u f4667a;

    /* renamed from: b */
    final C1416c<T> f4668b;

    /* renamed from: c */
    Executor f4669c;

    /* renamed from: d */
    final List<AbstractC1422a<T>> f4670d = new CopyOnWriteArrayList();

    /* renamed from: e */
    List<T> f4671e;

    /* renamed from: f */
    public List<T> f4672f = Collections.emptyList();

    /* renamed from: g */
    int f4673g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    public interface AbstractC1422a<T> {
        static {
            Covode.recordClassIndex(1560);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    static class ExecutorC1423b implements Executor {

        /* renamed from: a */
        final Handler f4682a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(1561);
        }

        ExecutorC1423b() {
        }

        public final void execute(Runnable runnable) {
            this.f4682a.post(runnable);
        }
    }

    static {
        Covode.recordClassIndex(1556);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4888a(Runnable runnable) {
        Iterator<AbstractC1422a<T>> it = this.f4670d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public C1418d(AbstractC1485u uVar, C1416c<T> cVar) {
        this.f4667a = uVar;
        this.f4668b = cVar;
        if (cVar.f4658a != null) {
            this.f4669c = cVar.f4658a;
        } else {
            this.f4669c = f4666h;
        }
    }

    /* renamed from: a */
    public final void mo4889a(final List<T> list, final Runnable runnable) {
        final int i = this.f4673g + 1;
        this.f4673g = i;
        final List<T> list2 = this.f4671e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (list == null) {
            int size = list2.size();
            this.f4671e = null;
            this.f4672f = Collections.emptyList();
            this.f4667a.mo3775b(0, size);
            mo4888a(runnable);
        } else if (list2 == null) {
            this.f4671e = list;
            this.f4672f = Collections.unmodifiableList(list);
            this.f4667a.mo3773a(0, list.size());
            mo4888a(runnable);
        } else {
            this.f4668b.f4659b.execute(new Runnable() {
                /* class androidx.recyclerview.widget.C1418d.RunnableC14191 */

                static {
                    Covode.recordClassIndex(1557);
                }

                public final void run() {
                    final C1445j.C1450d a = C1445j.m4922a(new C1445j.AbstractC1447a() {
                        /* class androidx.recyclerview.widget.C1418d.RunnableC14191.C14201 */

                        static {
                            Covode.recordClassIndex(1558);
                        }

                        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
                        /* renamed from: a */
                        public final int mo3768a() {
                            return list2.size();
                        }

                        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
                        /* renamed from: b */
                        public final int mo3770b() {
                            return list.size();
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: androidx.recyclerview.widget.j$e<T> */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
                        /* renamed from: a */
                        public final Object mo3769a(int i, int i2) {
                            Object obj = list2.get(i);
                            Object obj2 = list.get(i2);
                            if (obj != null && obj2 != null) {
                                return C1418d.this.f4668b.f4660c.mo4955c(obj, obj2);
                            }
                            throw new AssertionError();
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: androidx.recyclerview.widget.j$e<T> */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
                        /* renamed from: b */
                        public final boolean mo3771b(int i, int i2) {
                            Object obj = list2.get(i);
                            Object obj2 = list.get(i2);
                            if (obj != null) {
                                if (obj2 != null) {
                                    return C1418d.this.f4668b.f4660c.mo4953a(obj, obj2);
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
                            Object obj = list2.get(i);
                            Object obj2 = list.get(i2);
                            if (obj != null) {
                                if (obj2 != null) {
                                    return C1418d.this.f4668b.f4660c.mo4954b(obj, obj2);
                                }
                            } else if (obj2 == null) {
                                return true;
                            }
                            throw new AssertionError();
                        }
                    }, true);
                    C1418d.this.f4669c.execute(new Runnable() {
                        /* class androidx.recyclerview.widget.C1418d.RunnableC14191.RunnableC14212 */

                        static {
                            Covode.recordClassIndex(1559);
                        }

                        public final void run() {
                            if (C1418d.this.f4673g == i) {
                                C1418d dVar = C1418d.this;
                                List<T> list = list;
                                C1445j.C1450d dVar2 = a;
                                Runnable runnable = runnable;
                                dVar.f4671e = list;
                                dVar.f4672f = Collections.unmodifiableList(list);
                                dVar2.mo4952a(dVar.f4667a);
                                dVar.mo4888a(runnable);
                            }
                        }
                    });
                }
            });
        }
    }
}
