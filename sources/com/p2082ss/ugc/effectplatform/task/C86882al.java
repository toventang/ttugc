package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4519d.p4520a.p4521a.C87989b;
import p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b;
import p4519d.p4520a.p4522b.p4524b.C87994a;
import p4519d.p4520a.p4533f.AbstractC88062a;
import p4519d.p4520a.p4533f.AbstractC88065d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.al */
public final class C86882al {

    /* renamed from: d */
    public static final C86884b f195894d = new C86884b((byte) 0);

    /* renamed from: a */
    public final C87989b<String, AbstractC88065d> f195895a;

    /* renamed from: b */
    public boolean f195896b;

    /* renamed from: c */
    public AbstractExecutorC87997b f195897c;

    /* renamed from: e */
    private final C87989b<String, AbstractC88062a> f195898e;

    static {
        Covode.recordClassIndex(102647);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.al$b */
    public static final class C86884b {
        static {
            Covode.recordClassIndex(102649);
        }

        private C86884b() {
        }

        public /* synthetic */ C86884b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.al$a */
    public static final class C86883a {

        /* renamed from: a */
        public boolean f195899a;

        /* renamed from: b */
        public AbstractExecutorC87997b f195900b;

        static {
            Covode.recordClassIndex(102648);
        }

        /* renamed from: a */
        public final C86882al mo140602a() {
            boolean z = this.f195899a;
            AbstractExecutorC87997b bVar = this.f195900b;
            if (bVar == null) {
                bVar = new C87994a();
            }
            return new C86882al(z, bVar, (byte) 0);
        }

        /* renamed from: a */
        public final C86883a mo140601a(AbstractExecutorC87997b bVar) {
            C89219l.m154719c(bVar, "");
            this.f195900b = bVar;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.al$c */
    public static final class RunnableC86885c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C86882al f195901a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88065d f195902b;

        static {
            Covode.recordClassIndex(102650);
        }

        public final void run() {
            this.f195901a.f195895a.put(this.f195902b.getId(), this.f195902b);
            this.f195902b.run();
            this.f195901a.f195895a.remove(this.f195902b.getId());
        }

        RunnableC86885c(C86882al alVar, AbstractC88065d dVar) {
            this.f195901a = alVar;
            this.f195902b = dVar;
        }
    }

    /* renamed from: a */
    public final void mo140600a(AbstractC88065d dVar) {
        C89219l.m154719c(dVar, "");
        Iterator<T> it = this.f195898e.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().mo142620a()) {
                z = true;
            }
        }
        if (dVar instanceof AbstractC86891b) {
            ((AbstractC86891b) dVar).mo140604f();
        }
        if (!z) {
            this.f195897c.execute(new RunnableC86885c(this, dVar));
        }
    }

    private C86882al(boolean z, AbstractExecutorC87997b bVar) {
        this.f195896b = z;
        this.f195897c = bVar;
        this.f195898e = new C87989b<>();
        this.f195895a = new C87989b<>(true);
    }

    public /* synthetic */ C86882al(boolean z, AbstractExecutorC87997b bVar, byte b) {
        this(z, bVar);
    }
}
