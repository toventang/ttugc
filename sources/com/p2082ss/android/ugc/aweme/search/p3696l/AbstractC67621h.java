package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.search.l.h */
public abstract class AbstractC67621h {

    /* renamed from: a */
    public final Queue<RecyclerView.ViewHolder> f151504a = new LinkedList();

    /* renamed from: b */
    public int f151505b = 0;

    /* renamed from: c */
    private final Handler f151506c;

    static {
        Covode.recordClassIndex(79260);
    }

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo106620a();

    /* renamed from: b */
    public final RecyclerView.ViewHolder mo106622b() {
        return this.f151504a.poll();
    }

    public AbstractC67621h(Handler handler) {
        this.f151506c = handler;
    }

    /* renamed from: a */
    public final void mo106621a(final int i) {
        if (this.f151505b < i) {
            this.f151506c.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.search.p3696l.AbstractC67621h.RunnableC676221 */

                static {
                    Covode.recordClassIndex(79261);
                }

                public final void run() {
                    AtomicInteger atomicInteger;
                    int i = 0;
                    i = 1;
                    try {
                        if (atomicInteger.compareAndSet(i, i)) {
                            int i2 = i - AbstractC67621h.this.f151505b;
                            for (int i3 = 0; i3 < i2 && C67623i.f151509f.get() != 2; i3++) {
                                if (C67623i.f151509f.get() == i) {
                                    AbstractC67621h.this.f151504a.offer(AbstractC67621h.this.mo106620a());
                                    AbstractC67621h.this.f151505b += i;
                                }
                            }
                        }
                        C67623i.f151509f.compareAndSet(i, i);
                    } finally {
                        C67623i.f151509f.compareAndSet(i, i);
                    }
                }
            });
        }
    }
}
