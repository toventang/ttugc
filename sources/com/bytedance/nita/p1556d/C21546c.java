package com.bytedance.nita.p1556d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.nita.p1557e.C21559c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.d.c */
public final class C21546c extends AbstractC21539a {
    static {
        Covode.recordClassIndex(25187);
    }

    /* renamed from: c */
    public final void mo35222c() {
        mo35217b();
    }

    /* renamed from: com.bytedance.nita.d.c$a */
    static final class C21547a implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ C21546c f51142a;

        static {
            Covode.recordClassIndex(25188);
        }

        C21547a(C21546c cVar) {
            this.f51142a = cVar;
        }

        public final boolean queueIdle() {
            this.f51142a.mo35222c();
            return true;
        }
    }

    /* renamed from: com.bytedance.nita.d.c$b */
    static final class C21548b implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ C21546c f51143a;

        static {
            Covode.recordClassIndex(25189);
        }

        C21548b(C21546c cVar) {
            this.f51143a = cVar;
        }

        public final boolean queueIdle() {
            this.f51143a.mo35222c();
            return true;
        }
    }

    /* renamed from: com.bytedance.nita.d.c$c */
    static final class RunnableC21549c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21546c f51144a;

        static {
            Covode.recordClassIndex(25190);
        }

        RunnableC21549c(C21546c cVar) {
            this.f51144a = cVar;
        }

        public final void run() {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(this) {
                /* class com.bytedance.nita.p1556d.C21546c.RunnableC21549c.C215501 */

                /* renamed from: a */
                final /* synthetic */ RunnableC21549c f51145a;

                static {
                    Covode.recordClassIndex(25191);
                }

                {
                    this.f51145a = r1;
                }

                public final boolean queueIdle() {
                    this.f51145a.f51144a.mo35222c();
                    return true;
                }
            });
        }
    }

    public C21546c() {
        if (Build.VERSION.SDK_INT >= 23) {
            Looper mainLooper = Looper.getMainLooper();
            C89219l.m154709a((Object) mainLooper, "");
            mainLooper.getQueue().addIdleHandler(new C21547a(this));
            return;
        }
        MessageQueue messageQueue = (MessageQueue) C21559c.m40494a(this.f51127a, "mQueue");
        if (messageQueue != null) {
            messageQueue.addIdleHandler(new C21548b(this));
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC21549c(this));
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154719c(message, "");
        mo35217b();
        return true;
    }

    @Override // com.bytedance.nita.p1556d.AbstractC21551d, com.bytedance.nita.p1556d.AbstractC21539a
    /* renamed from: a */
    public final void mo35216a(AbstractC21525c cVar, Context context, int i) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(context, "");
        super.mo35216a(cVar, context, i);
        if (this.f51128b.size() != 0 && !this.f51127a.hasMessages(1)) {
            mo35215a();
        }
    }
}
