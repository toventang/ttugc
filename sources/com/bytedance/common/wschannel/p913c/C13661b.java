package com.bytedance.common.wschannel.p913c;

import android.os.Handler;
import com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13703b;
import com.bytedance.common.wschannel.p913c.p914a.EnumC13659a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.common.wschannel.c.b */
public final class C13661b {

    /* renamed from: a */
    public EnumC13659a f33180a;

    /* renamed from: b */
    public AtomicBoolean f33181b = new AtomicBoolean(false);

    /* renamed from: c */
    public AbstractC13703b f33182c;

    /* renamed from: d */
    public AbstractC13663a f33183d;

    /* renamed from: e */
    public Handler f33184e;

    /* renamed from: f */
    public Runnable f33185f = new Runnable() {
        /* class com.bytedance.common.wschannel.p913c.C13661b.RunnableC136621 */

        static {
            Covode.recordClassIndex(15694);
        }

        public final void run() {
            if (C13661b.this.f33181b.getAndSet(false) && C13661b.this.f33183d != null) {
                C13661b.this.f33183d.mo21954a();
            }
        }
    };

    /* renamed from: com.bytedance.common.wschannel.c.b$a */
    public interface AbstractC13663a {
        static {
            Covode.recordClassIndex(15695);
        }

        /* renamed from: a */
        void mo21954a();
    }

    static {
        Covode.recordClassIndex(15693);
    }

    public C13661b(AbstractC13663a aVar, Handler handler) {
        this.f33183d = aVar;
        this.f33184e = handler;
    }
}
