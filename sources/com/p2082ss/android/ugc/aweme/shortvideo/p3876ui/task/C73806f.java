package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import java.util.concurrent.ConcurrentLinkedQueue;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.f */
public final class C73806f {

    /* renamed from: a */
    static final AbstractC89244h f165692a = C89250i.m154773a((AbstractC89171a) C73807a.f165700a);

    /* renamed from: b */
    static EnumC73804d f165693b = EnumC73804d.RECORD_ON_NONE;

    /* renamed from: c */
    static final ConcurrentLinkedQueue<AbstractC73799a> f165694c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    static final HandlerC73808b f165695d = new HandlerC73808b();

    /* renamed from: e */
    static final HandlerC73810d f165696e;

    /* renamed from: f */
    static final boolean f165697f = AVServiceImpl.m113116a().avSettingsService().enableTaskDegradationOpti();

    /* renamed from: g */
    public static final C73806f f165698g = new C73806f();

    /* renamed from: h */
    private static final AbstractC89244h f165699h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.f$c */
    public enum EnumC73809c {
        TASK_EXEC;

        static {
            Covode.recordClassIndex(86552);
        }
    }

    private C73806f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.f$b */
    public static final class HandlerC73808b extends Handler {
        static {
            Covode.recordClassIndex(86551);
        }

        public HandlerC73808b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            super.handleMessage(message);
            int i = message.what;
            if (i == EnumC73804d.RECORD_ON_FIRST_FRAME.ordinal()) {
                HandlerC73810d dVar = C73806f.f165696e;
                Message obtain = Message.obtain();
                obtain.what = EnumC73809c.TASK_EXEC.ordinal();
                dVar.sendMessageDelayed(obtain, 200);
            }
            if (i == EnumC73804d.RECORD_ON_DESTROY.ordinal()) {
                C73806f.f165693b = EnumC73804d.RECORD_ON_NONE;
                C73806f.f165694c.clear();
                C73806f.f165695d.removeCallbacksAndMessages(null);
                C73806f.f165696e.removeCallbacksAndMessages(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.f$a */
    static final class C73807a extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C73807a f165700a = new C73807a();

        static {
            Covode.recordClassIndex(86550);
        }

        C73807a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j;
            if (C73806f.f165697f) {
                j = 500;
            } else {
                j = 100;
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.f$e */
    static final class C73811e extends AbstractC89220m implements AbstractC89171a<HandlerThread> {

        /* renamed from: a */
        public static final C73811e f165702a = new C73811e();

        static {
            Covode.recordClassIndex(86554);
        }

        C73811e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("record_task_manager");
            handlerThread.start();
            return handlerThread;
        }
    }

    static {
        Covode.recordClassIndex(86549);
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C73811e.f165702a);
        f165699h = a;
        Looper looper = ((HandlerThread) a.getValue()).getLooper();
        C89219l.m154716b(looper, "");
        f165696e = new HandlerC73810d(looper);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.f$d */
    public static final class HandlerC73810d extends Handler {
        static {
            Covode.recordClassIndex(86553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC73810d(Looper looper) {
            super(looper);
            C89219l.m154721d(looper, "");
        }

        public final void handleMessage(Message message) {
            AbstractC73799a poll;
            C89219l.m154721d(message, "");
            super.handleMessage(message);
            if (message.what == EnumC73809c.TASK_EXEC.ordinal() && (poll = C73806f.f165694c.poll()) != null) {
                C73805e.m129871a(poll);
                HandlerC73810d dVar = C73806f.f165696e;
                Message obtain = Message.obtain();
                obtain.what = EnumC73809c.TASK_EXEC.ordinal();
                dVar.sendMessageDelayed(obtain, ((Number) C73806f.f165692a.getValue()).longValue());
            }
        }
    }

    /* renamed from: a */
    private static boolean m129874a(int i) {
        if (i == EnumC73804d.RECORD_ON_FIRST_FRAME.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m129873a(EnumC73804d dVar) {
        C89219l.m154721d(dVar, "");
        f165693b = dVar;
        HandlerC73808b bVar = f165695d;
        Message obtain = Message.obtain();
        obtain.what = f165693b.ordinal();
        bVar.sendMessage(obtain);
    }

    /* renamed from: a */
    public static final C73806f m129872a(AbstractC73799a aVar) {
        C89219l.m154721d(aVar, "");
        if (m129874a(f165693b.ordinal()) || aVar.mo88344b()) {
            C73805e.m129871a(aVar);
        } else {
            f165694c.add(aVar);
        }
        return f165698g;
    }
}
