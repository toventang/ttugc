package com.bytedance.android.livesdk.chatroom.p492g.p493a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import java.util.PriorityQueue;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.a.d */
public final class C7565d {

    /* renamed from: b */
    public static C7565d f18780b;

    /* renamed from: c */
    public static final C7566a f18781c = new C7566a((byte) 0);

    /* renamed from: a */
    public boolean f18782a;

    /* renamed from: d */
    private PriorityQueue<AbstractC7563b> f18783d;

    /* renamed from: e */
    private Handler f18784e;

    /* renamed from: f */
    private AbstractC7563b f18785f;

    /* renamed from: g */
    private Runnable f18786g;

    static {
        Covode.recordClassIndex(8338);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.g.a.d$a */
    public static final class C7566a {
        static {
            Covode.recordClassIndex(8339);
        }

        private C7566a() {
        }

        /* renamed from: a */
        public static C7565d m15554a() {
            if (C7565d.f18780b == null) {
                C7565d.f18780b = new C7565d((byte) 0);
            }
            return C7565d.f18780b;
        }

        /* renamed from: b */
        public static C7565d m15555b() {
            C7565d a = m15554a();
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }

        public /* synthetic */ C7566a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.g.a.d$c */
    public static final class RunnableC7568c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC7563b f18788a;

        static {
            Covode.recordClassIndex(8341);
        }

        RunnableC7568c(AbstractC7563b bVar) {
            this.f18788a = bVar;
        }

        public final void run() {
            this.f18788a.mo13812a();
        }
    }

    /* renamed from: a */
    public final void mo13813a() {
        this.f18782a = false;
        this.f18786g = null;
        this.f18785f = null;
        m15550c();
    }

    private C7565d() {
        this.f18783d = new PriorityQueue<>(20, C7567b.f18787a);
        this.f18784e = new Handler(Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo13815b() {
        this.f18783d.clear();
        this.f18784e.removeCallbacksAndMessages(null);
        this.f18786g = null;
        this.f18785f = null;
    }

    /* renamed from: c */
    private final void m15550c() {
        if (!this.f18782a && !this.f18783d.isEmpty()) {
            AbstractC7563b poll = this.f18783d.poll();
            this.f18785f = poll;
            this.f18782a = true;
            C89219l.m154716b(poll, "");
            m15549b(poll);
        }
    }

    public /* synthetic */ C7565d(byte b) {
        this();
    }

    /* renamed from: b */
    private final void m15549b(AbstractC7563b bVar) {
        RunnableC7568c cVar = new RunnableC7568c(bVar);
        this.f18784e.postDelayed(cVar, 1000);
        this.f18786g = cVar;
    }

    /* renamed from: a */
    public final void mo13814a(AbstractC7563b bVar) {
        C89219l.m154721d(bVar, "");
        if (!this.f18783d.contains(bVar) && !C89219l.m154714a(this.f18785f, bVar)) {
            this.f18783d.offer(bVar);
            m15550c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.g.a.d$b */
    static final class C7567b<T> implements Comparator {

        /* renamed from: a */
        public static final C7567b f18787a = new C7567b();

        static {
            Covode.recordClassIndex(8340);
        }

        C7567b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return C89219l.m154703a(((AbstractC7563b) obj).mo13810b(), ((AbstractC7563b) obj2).mo13810b());
        }
    }
}
