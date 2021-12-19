package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49529t;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49533w;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49535x;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask */
public final class AssemInitTask implements AbstractC58264w {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<String> f132801a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public static final CopyOnWriteArraySet<C58313b> f132802b = new CopyOnWriteArraySet<>();

    /* renamed from: c */
    public static int f132803c = 10;

    /* renamed from: d */
    public static final AbstractC89244h f132804d = C89250i.m154773a((AbstractC89171a) C58316d.f132812a);

    /* renamed from: e */
    public static final C58314c f132805e = new C58314c((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$a */
    public static final class C58310a {

        /* renamed from: a */
        public static final C58310a f132806a = new C58310a();

        /* renamed from: b */
        private static final AbstractC89244h f132807b = C89250i.m154773a((AbstractC89171a) C58311a.f132808a);

        /* renamed from: a */
        public static ExecutorService m105475a() {
            return (ExecutorService) f132807b.getValue();
        }

        private C58310a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$a$a */
        static final class C58311a extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

            /* renamed from: a */
            public static final C58311a f132808a = new C58311a();

            static {
                Covode.recordClassIndex(68405);
            }

            C58311a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ExecutorService invoke() {
                C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
                a.f95504b = "assem-serial-t";
                return C40780g.m82242a(a.mo70028a());
            }
        }

        static {
            Covode.recordClassIndex(68404);
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$a$b */
        static final class RunnableC58312b implements Runnable {

            /* renamed from: a */
            public static final RunnableC58312b f132809a = new RunnableC58312b();

            static {
                Covode.recordClassIndex(68406);
            }

            RunnableC58312b() {
            }

            public final void run() {
                try {
                    if ((C49533w.m92773b() && ((Number) C49529t.f113908a.getValue()).intValue() == 1) || C49535x.f113918a) {
                        Jato.bindBigCore(Process.myTid());
                    }
                    if (C62845i.m113257a()) {
                        Process.setThreadPriority(-20);
                    } else {
                        Process.setThreadPriority(-10);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$c */
    public static final class C58314c {
        static {
            Covode.recordClassIndex(68408);
        }

        private C58314c() {
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$c$a */
        public static final class RunnableC58315a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f132811a;

            static {
                Covode.recordClassIndex(68409);
            }

            public RunnableC58315a(String str) {
                this.f132811a = str;
            }

            public final void run() {
                for (T t : AssemInitTask.f132802b) {
                    if (C89219l.m154714a((Object) t.f132810a, (Object) this.f132811a)) {
                        if (t != null && AssemInitTask.f132803c > 0) {
                            C39162r.m79460a("feed_refactor_exception_log", new C33744d().mo59983a("log", AssemInitTask.f132801a.toString()).f79943a);
                            AssemInitTask.f132803c--;
                            return;
                        }
                        return;
                    }
                }
            }
        }

        public /* synthetic */ C58314c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$e */
    public static final class C58317e implements AbstractC12789k {
        static {
            Covode.recordClassIndex(68411);
        }

        C58317e() {
        }

        @Override // com.bytedance.assem.arch.extensions.AbstractC12789k
        /* renamed from: a */
        public final void mo20639a(String str, Exception exc) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(exc, "");
            C51423a.m95788a(str, exc);
        }

        @Override // com.bytedance.assem.arch.extensions.AbstractC12789k
        /* renamed from: a */
        public final void mo20640a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C51423a.m95784a(4, str, str2);
            try {
                if (AssemInitTask.f132801a.size() <= 100) {
                    AssemInitTask.f132801a.add("Assem tag: " + str + ", msg: " + str2);
                }
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return C58444q.f133061a;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$d */
    static final class C58316d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C58316d f132812a = new C58316d();

        static {
            Covode.recordClassIndex(68410);
        }

        C58316d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(68403);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$b */
    public static final class C58313b {

        /* renamed from: a */
        public final String f132810a;

        static {
            Covode.recordClassIndex(68407);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C58313b) && C89219l.m154714a(this.f132810a, ((C58313b) obj).f132810a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f132810a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "AwemeTask(aid=" + this.f132810a + ")";
        }

        public C58313b(String str) {
            C89219l.m154721d(str, "");
            this.f132810a = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        C12787j.f31107a = false;
        C12787j.f31111e = C34671a.f81927a.mo61325a();
        C12787j.f31110d = C49533w.m92774c();
        C12787j.f31112f = C58310a.m105475a();
        C58310a.m105475a().execute(C58310a.RunnableC58312b.f132809a);
        C12787j.f31108b = new C58317e();
    }
}
