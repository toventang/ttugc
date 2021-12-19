package com.p2082ss.android.ugc.aweme.specact.pendant.p3939g;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75049c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75060a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75082l;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75083m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.g.c */
public final class C75057c implements AbstractC75022c, AbstractC75056b {

    /* renamed from: b */
    public static final C75058a f168701b = new C75058a((byte) 0);

    /* renamed from: a */
    public AbstractC75026g f168702a;

    /* renamed from: c */
    private long f168703c;

    /* renamed from: d */
    private UgActivityTasks f168704d;

    /* renamed from: e */
    private boolean f168705e;

    /* renamed from: f */
    private boolean f168706f;

    /* renamed from: g */
    private final Keva f168707g = Keva.getRepo("pendant_global_timer_reducer");

    static {
        Covode.recordClassIndex(87929);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: b */
    public final void mo118151b(UgActivityTasks ugActivityTasks) {
        C89219l.m154721d(ugActivityTasks, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.g.c$a */
    public static final class C75058a {
        static {
            Covode.recordClassIndex(87930);
        }

        private C75058a() {
        }

        public /* synthetic */ C75058a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b
    /* renamed from: b */
    public final void mo118091b() {
        mo118148a();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: e */
    public final long mo118154e() {
        return this.f168703c;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.g.c$b */
    static final class RunnableC75059b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75057c f168708a;

        /* renamed from: b */
        final /* synthetic */ UgActivityTasks f168709b;

        static {
            Covode.recordClassIndex(87931);
        }

        RunnableC75059b(C75057c cVar, UgActivityTasks ugActivityTasks) {
            this.f168708a = cVar;
            this.f168709b = ugActivityTasks;
        }

        public final void run() {
            AbstractC75026g gVar = this.f168708a.f168702a;
            if (gVar != null) {
                UgActivityTasks ugActivityTasks = this.f168709b;
                C89219l.m154716b(ugActivityTasks, "");
                gVar.mo118157a((AbstractC75026g) ugActivityTasks, (UgActivityTasks) true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b
    /* renamed from: c */
    public final void mo118092c() {
        AbstractC75026g gVar;
        UgActivityTasks ugActivityTasks = this.f168704d;
        if (!(ugActivityTasks == null || (gVar = this.f168702a) == null)) {
            gVar.mo118157a(ugActivityTasks, false);
        }
        this.f168704d = null;
        this.f168703c = 0;
        mo118148a();
        AbstractC75026g gVar2 = this.f168702a;
        if (gVar2 != null) {
            gVar2.mo118155a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: d */
    public final boolean mo118153d() {
        return C75081k.m131845a(this.f168707g.getLong(C75083m.m131848a("direct_show_pendant"), 0));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: a */
    public final void mo118148a() {
        long b = C75081k.m131846b();
        this.f168707g.storeLong(C75083m.m131848a("pendant_time_name"), this.f168703c);
        this.f168707g.storeLong(C75083m.m131848a("direct_show_pendant"), b);
        C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("referral_video_task_time_left"), (Object) String.valueOf(this.f168703c));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: a */
    public final void mo118149a(UgActivityTasks ugActivityTasks) {
        C89219l.m154721d(ugActivityTasks, "");
        this.f168704d = ugActivityTasks;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: b */
    public final void mo118152b(boolean z) {
        this.f168706f = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b
    /* renamed from: a */
    public final void mo118088a(Aweme aweme) {
        UgActivityTasks ugActivityTasks;
        C89219l.m154721d(aweme, "");
        AbstractC75026g gVar = this.f168702a;
        if ((gVar == null || !gVar.mo118159c()) && this.f168706f && C75082l.m131847a(aweme) && (ugActivityTasks = this.f168704d) != null) {
            int b = C75060a.m131797b(ugActivityTasks);
            AbstractC75026g gVar2 = this.f168702a;
            if (gVar2 != null) {
                gVar2.mo118156a(this.f168703c, b);
            }
            long j = this.f168703c;
            if (j >= ((long) b)) {
                UgActivityTasks ugActivityTasks2 = this.f168704d;
                if (ugActivityTasks2 == null) {
                    C89219l.m154715b();
                }
                UgActivityTasks clone = ugActivityTasks2.clone();
                this.f168704d = null;
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC75059b(this, clone), 1000);
            } else {
                this.f168703c = j + 1;
            }
            C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("referral_video_task_time_left"), (Object) String.valueOf(this.f168703c));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: a */
    public final void mo118150a(boolean z) {
        if (this.f168705e != z) {
            this.f168705e = z;
            if (z) {
                this.f168703c = this.f168707g.getLong(C75083m.m131848a("pendant_time_name"), 0);
                if (!C75081k.m131845a(this.f168707g.getLong(C75083m.m131848a("direct_show_pendant"), 0))) {
                    this.f168703c = 0;
                    this.f168706f = false;
                    AbstractC75026g gVar = this.f168702a;
                    if (gVar != null) {
                        gVar.mo118158b();
                    }
                    mo118148a();
                }
                C75049c.m131767a(this);
                return;
            }
            C75049c.m131769b(this);
            this.f168704d = null;
            this.f168703c = 0;
        }
    }
}
