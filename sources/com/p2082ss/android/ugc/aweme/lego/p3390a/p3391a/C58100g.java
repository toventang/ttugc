package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58232i;
import com.p2082ss.android.ugc.aweme.lego.C58233j;
import com.p2082ss.android.ugc.aweme.lego.C58234k;
import com.p2082ss.android.ugc.aweme.lego.C58235l;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.C58267z;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import com.p2082ss.android.ugc.aweme.lego.p3390a.EnumC58085a;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58141c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.g */
public final class C58100g extends AbstractC58137v implements Handler.Callback {

    /* renamed from: a */
    private HandlerC58141c f132354a = new HandlerC58141c(this);

    /* renamed from: c */
    private boolean f132355c;

    /* renamed from: d */
    private int f132356d = 1;

    static {
        Covode.recordClassIndex(68166);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final void mo95599b() {
        this.f132355c = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v
    /* renamed from: c */
    public final EnumC58151ae mo95603c() {
        return EnumC58151ae.BOOT_FINISH;
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.g$d */
    static final class RunnableC58104d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC58264w f132360a;

        static {
            Covode.recordClassIndex(68170);
        }

        RunnableC58104d(AbstractC58264w wVar) {
            this.f132360a = wVar;
        }

        public final void run() {
            C58221f.f132578b.mo95695b(this.f132360a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.g$b */
    static final class RunnableC58102b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC58264w f132358a;

        static {
            Covode.recordClassIndex(68168);
        }

        RunnableC58102b(AbstractC58264w wVar) {
            this.f132358a = wVar;
        }

        public final void run() {
            MethodCollector.m26663i(5308);
            if (C58235l.m105174b()) {
                Thread currentThread = Thread.currentThread();
                C89219l.m154716b(currentThread, "");
                int priority = currentThread.getPriority();
                if (C58235l.m105175c()) {
                    Thread currentThread2 = Thread.currentThread();
                    C89219l.m154716b(currentThread2, "");
                    currentThread2.setPriority(1);
                } else if (C58235l.m105176d()) {
                    Thread currentThread3 = Thread.currentThread();
                    C89219l.m154716b(currentThread3, "");
                    currentThread3.setPriority(2);
                } else if (C58235l.m105177e()) {
                    Thread currentThread4 = Thread.currentThread();
                    C89219l.m154716b(currentThread4, "");
                    currentThread4.setPriority(3);
                }
                C58221f.f132578b.mo95695b(this.f132358a);
                Thread currentThread5 = Thread.currentThread();
                C89219l.m154716b(currentThread5, "");
                currentThread5.setPriority(priority);
                MethodCollector.m26664o(5308);
                return;
            }
            C58221f.f132578b.mo95695b(this.f132358a);
            MethodCollector.m26664o(5308);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.g$c */
    static final class RunnableC58103c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC58264w f132359a;

        static {
            Covode.recordClassIndex(68169);
        }

        RunnableC58103c(AbstractC58264w wVar) {
            this.f132359a = wVar;
        }

        public final void run() {
            MethodCollector.m26663i(6157);
            if (C58235l.m105174b()) {
                Thread currentThread = Thread.currentThread();
                C89219l.m154716b(currentThread, "");
                int priority = currentThread.getPriority();
                Thread currentThread2 = Thread.currentThread();
                C89219l.m154716b(currentThread2, "");
                currentThread2.setPriority(1);
                C58221f.f132578b.mo95695b(this.f132359a);
                Thread currentThread3 = Thread.currentThread();
                C89219l.m154716b(currentThread3, "");
                currentThread3.setPriority(priority);
                MethodCollector.m26664o(6157);
                return;
            }
            C58221f.f132578b.mo95695b(this.f132359a);
            MethodCollector.m26664o(6157);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95597a() {
        long j;
        this.f132355c = true;
        if (!C58235l.m105174b()) {
            this.f132354a.mo95649a(1201, Keva.getRepo("ab_repo_cold_boot").getLong("lego_boot_finish_trigger_delay", C58234k.f132625a));
        } else if (!this.f132354a.hasMessages(1201)) {
            if (C58221f.f132578b.mo95692a()) {
                this.f132356d = 2;
                j = 1000;
            } else {
                this.f132356d = 1;
                j = Keva.getRepo("ab_repo_cold_boot").getLong("lego_boot_finish_trigger_delay", C58234k.f132625a);
            }
            this.f132354a.mo95649a(1201, j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.g$a */
    static final class RunnableC58101a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC58264w f132357a;

        static {
            Covode.recordClassIndex(68167);
        }

        RunnableC58101a(AbstractC58264w wVar) {
            this.f132357a = wVar;
        }

        public final void run() {
            MethodCollector.m26663i(5421);
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            int priority = currentThread.getPriority();
            if (C58235l.m105174b()) {
                if (((AbstractC58084a) this.f132357a).mo28604d() == 1) {
                    if (C58235l.m105175c()) {
                        Thread currentThread2 = Thread.currentThread();
                        C89219l.m154716b(currentThread2, "");
                        currentThread2.setPriority(1);
                    } else if (C58235l.m105176d()) {
                        Thread currentThread3 = Thread.currentThread();
                        C89219l.m154716b(currentThread3, "");
                        currentThread3.setPriority(2);
                    } else if (C58235l.m105177e()) {
                        Thread currentThread4 = Thread.currentThread();
                        C89219l.m154716b(currentThread4, "");
                        currentThread4.setPriority(3);
                    }
                }
            } else if (((AbstractC58084a) this.f132357a).mo28604d() > 1) {
                Thread currentThread5 = Thread.currentThread();
                C89219l.m154716b(currentThread5, "");
                currentThread5.setPriority(((AbstractC58084a) this.f132357a).mo28604d() + 4);
            }
            C58221f.f132578b.mo95695b(this.f132357a);
            Thread currentThread6 = Thread.currentThread();
            C89219l.m154716b(currentThread6, "");
            currentThread6.setPriority(priority);
            MethodCollector.m26664o(5421);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        if (C58140b.f132399a != EnumC58085a.COLD_BOOT_BEGIN) {
            C58221f.f132578b.mo95692a();
            if (!Keva.getRepo("ab_repo_cold_boot").getBoolean("lego_boot_finish_commit_opt", C58232i.f132621a)) {
                for (AbstractC58252n nVar : C58221f.f132578b.mo95689a(EnumC58151ae.BOOT_FINISH, list)) {
                    Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                    AbstractC58264w wVar = (AbstractC58264w) nVar;
                    C89219l.m154721d(wVar, "");
                    C58254p.m105192a(C58267z.m105224b()).execute(new RunnableC58104d(wVar));
                }
            } else if (!this.f132354a.hasMessages(1201)) {
                this.f132354a.mo95649a(1201, 0);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        ExecutorService a;
        C89219l.m154721d(message, "");
        AbstractC58264w b = C58221f.f132578b.mo95694b(EnumC58151ae.BOOT_FINISH);
        AbstractC58264w c = C58221f.f132578b.mo95696c(EnumC58151ae.BOOT_FINISH);
        if (!C58235l.m105174b() || this.f132356d != 2 || ((c instanceof AbstractC58084a) && ((AbstractC58084a) c).mo28604d() != 1)) {
            z = false;
        } else {
            this.f132356d = 1;
            z = true;
        }
        if (b != null) {
            if (b instanceof AbstractC58084a) {
                EnumC58149ac e = ((AbstractC58084a) b).mo28605e();
                if (e != null) {
                    int i = C58105h.f132361a[e.ordinal()];
                    if (i == 1) {
                        a = C40780g.m82241a();
                        C89219l.m154716b(a, "");
                    } else if (i == 2) {
                        if (C58221f.m105151c()) {
                            a = C58254p.m105194b(C58267z.m105224b());
                        } else {
                            a = C58254p.m105192a(C58267z.m105224b());
                        }
                    }
                    a.execute(new RunnableC58101a(b));
                }
                throw new C89376n();
            } else if (C58221f.m105151c()) {
                C58254p.m105194b(C58267z.m105224b()).execute(new RunnableC58102b(b));
            } else {
                C58254p.m105192a(C58267z.m105224b()).execute(new RunnableC58103c(b));
            }
            b.mo28608h();
        }
        if (C58221f.f132578b.mo95693a(EnumC58151ae.BOOT_FINISH)) {
            long j = Keva.getRepo("ab_repo_cold_boot").getLong("lego_boot_finish_sparse", C58233j.f132623a);
            if (z) {
                j += Keva.getRepo("ab_repo_cold_boot").getLong("lego_boot_finish_trigger_delay", C58234k.f132625a);
            }
            this.f132354a.mo95649a(1201, j);
        }
        return true;
    }
}
