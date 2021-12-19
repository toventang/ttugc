package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Executor;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.a */
public final class C55290a<T> {

    /* renamed from: a */
    public final Executor f126404a;

    /* renamed from: b */
    public int f126405b;

    /* renamed from: c */
    List<? extends T> f126406c;

    /* renamed from: d */
    final AbstractC55303g f126407d;

    /* renamed from: e */
    public final C55298d<T> f126408e;

    static {
        Covode.recordClassIndex(65047);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.a$b */
    static final class RunnableC55292b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C55290a f126410a;

        /* renamed from: b */
        final /* synthetic */ List f126411b;

        /* renamed from: c */
        final /* synthetic */ List f126412c;

        /* renamed from: d */
        final /* synthetic */ int f126413d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f126414e = null;

        static {
            Covode.recordClassIndex(65049);
        }

        RunnableC55292b(C55290a aVar, List list, List list2, int i, AbstractC89171a aVar2) {
            this.f126410a = aVar;
            this.f126411b = list;
            this.f126412c = list2;
            this.f126413d = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.a$b$a */
        public static final class C55294a extends C1445j.AbstractC1447a {

            /* renamed from: a */
            final /* synthetic */ RunnableC55292b f126417a;

            static {
                Covode.recordClassIndex(65051);
            }

            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: a */
            public final int mo3768a() {
                return this.f126417a.f126411b.size();
            }

            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: b */
            public final int mo3770b() {
                return this.f126417a.f126412c.size();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C55294a(RunnableC55292b bVar) {
                this.f126417a = bVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: a */
            public final Object mo3769a(int i, int i2) {
                Object obj = this.f126417a.f126411b.get(i);
                Object obj2 = this.f126417a.f126412c.get(i2);
                if (obj != null && obj2 != null) {
                    return this.f126417a.f126410a.f126408e.f126420a.mo4955c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
            /* renamed from: b */
            public final boolean mo3771b(int i, int i2) {
                Object obj = this.f126417a.f126411b.get(i);
                Object obj2 = this.f126417a.f126412c.get(i2);
                if (obj != null) {
                    if (obj2 != null) {
                        return this.f126417a.f126410a.f126408e.f126420a.mo4953a(obj, obj2);
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
                Object obj = this.f126417a.f126411b.get(i);
                Object obj2 = this.f126417a.f126412c.get(i2);
                if (obj != null) {
                    if (obj2 != null) {
                        return this.f126417a.f126410a.f126408e.f126420a.mo4954b(obj, obj2);
                    }
                } else if (obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }
        }

        public final void run() {
            final C1445j.C1450d a = C1445j.m4922a(new C55294a(this), true);
            C89219l.m154716b(a, "");
            this.f126410a.f126404a.execute(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.C55290a.RunnableC55292b.RunnableC552931 */

                /* renamed from: a */
                final /* synthetic */ RunnableC55292b f126415a;

                static {
                    Covode.recordClassIndex(65050);
                }

                {
                    this.f126415a = r1;
                }

                public final void run() {
                    if (this.f126415a.f126410a.f126405b == this.f126415a.f126413d) {
                        C55290a aVar = this.f126415a.f126410a;
                        List<? extends T> list = this.f126415a.f126412c;
                        C1445j.C1450d dVar = a;
                        aVar.f126406c = list;
                        dVar.mo4952a(aVar.f126407d);
                    }
                    AbstractC89171a aVar2 = this.f126415a.f126414e;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.a$a */
    public static final class ExecutorC55291a implements Executor {

        /* renamed from: a */
        private final Handler f126409a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(65048);
        }

        public final void execute(Runnable runnable) {
            if (runnable != null) {
                this.f126409a.post(runnable);
            }
        }
    }

    public C55290a(AbstractC55303g gVar, C55298d<T> dVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(dVar, "");
        this.f126407d = gVar;
        this.f126408e = dVar;
        Executor executor = dVar.f126422c;
        this.f126404a = executor == null ? new ExecutorC55291a() : executor;
    }
}
