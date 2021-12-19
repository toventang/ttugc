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

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.g.a */
public final class C75053a implements AbstractC75022c, AbstractC75056b {

    /* renamed from: c */
    public static final C75054a f168691c = new C75054a((byte) 0);

    /* renamed from: a */
    public long f168692a;

    /* renamed from: b */
    public AbstractC75026g f168693b;

    /* renamed from: d */
    private long f168694d;

    /* renamed from: e */
    private UgActivityTasks f168695e;

    /* renamed from: f */
    private boolean f168696f;

    /* renamed from: g */
    private boolean f168697g;

    /* renamed from: h */
    private final Keva f168698h = Keva.getRepo("pendant_global_timer");

    static {
        Covode.recordClassIndex(87925);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.g.a$a */
    public static final class C75054a {
        static {
            Covode.recordClassIndex(87926);
        }

        private C75054a() {
        }

        public /* synthetic */ C75054a(byte b) {
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
        return this.f168694d;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.g.a$b */
    static final class RunnableC75055b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75053a f168699a;

        /* renamed from: b */
        final /* synthetic */ UgActivityTasks f168700b;

        static {
            Covode.recordClassIndex(87927);
        }

        RunnableC75055b(C75053a aVar, UgActivityTasks ugActivityTasks) {
            this.f168699a = aVar;
            this.f168700b = ugActivityTasks;
        }

        public final void run() {
            this.f168699a.f168692a = 0;
            AbstractC75026g gVar = this.f168699a.f168693b;
            if (gVar != null) {
                UgActivityTasks ugActivityTasks = this.f168700b;
                C89219l.m154716b(ugActivityTasks, "");
                gVar.mo118157a((AbstractC75026g) ugActivityTasks, (UgActivityTasks) true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b
    /* renamed from: c */
    public final void mo118092c() {
        AbstractC75026g gVar;
        UgActivityTasks ugActivityTasks = this.f168695e;
        if (!(ugActivityTasks == null || (gVar = this.f168693b) == null)) {
            gVar.mo118157a(ugActivityTasks, false);
        }
        this.f168695e = null;
        this.f168692a = 0;
        this.f168694d = 0;
        mo118148a();
        AbstractC75026g gVar2 = this.f168693b;
        if (gVar2 != null) {
            gVar2.mo118155a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: d */
    public final boolean mo118153d() {
        return C75081k.m131845a(this.f168698h.getLong(C75083m.m131848a("last_active_date"), 0));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: a */
    public final void mo118148a() {
        long b = C75081k.m131846b();
        this.f168698h.storeLong(C75083m.m131848a("pendant_current_time_name"), this.f168692a);
        this.f168698h.storeLong(C75083m.m131848a("pendant_total_time_name"), this.f168694d);
        this.f168698h.storeLong(C75083m.m131848a("last_active_date"), b);
        C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("referral_video_task_time_left"), (Object) String.valueOf(this.f168694d));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: a */
    public final void mo118149a(UgActivityTasks ugActivityTasks) {
        C89219l.m154721d(ugActivityTasks, "");
        this.f168695e = ugActivityTasks;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: b */
    public final void mo118152b(boolean z) {
        this.f168697g = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: b */
    public final void mo118151b(UgActivityTasks ugActivityTasks) {
        C89219l.m154721d(ugActivityTasks, "");
        this.f168692a = 0;
        long j = this.f168694d;
        Integer time = ugActivityTasks.getTime();
        C89219l.m154716b(time, "");
        this.f168694d = j - ((long) time.intValue());
        mo118148a();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c
    /* renamed from: a */
    public final void mo118150a(boolean z) {
        if (this.f168696f != z) {
            this.f168696f = z;
            if (z) {
                this.f168692a = this.f168698h.getLong(C75083m.m131848a("pendant_current_time_name"), 0);
                this.f168694d = this.f168698h.getLong(C75083m.m131848a("pendant_total_time_name"), 0);
                if (!C75081k.m131845a(this.f168698h.getLong(C75083m.m131848a("last_active_date"), 0))) {
                    this.f168692a = 0;
                    this.f168694d = 0;
                    this.f168697g = false;
                    AbstractC75026g gVar = this.f168693b;
                    if (gVar != null) {
                        gVar.mo118158b();
                    }
                    mo118148a();
                }
                C75049c.m131767a(this);
                return;
            }
            C75049c.m131769b(this);
            this.f168695e = null;
            this.f168692a = 0;
            this.f168694d = 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b
    /* renamed from: a */
    public final void mo118088a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        AbstractC75026g gVar = this.f168693b;
        if ((gVar == null || !gVar.mo118159c()) && this.f168697g && C75082l.m131847a(aweme) && this.f168695e != null && this.f168698h.getBoolean(C75083m.m131848a("show_pendant"), true)) {
            UgActivityTasks ugActivityTasks = this.f168695e;
            if (ugActivityTasks == null) {
                C89219l.m154715b();
            }
            int b = C75060a.m131797b(ugActivityTasks);
            long j = this.f168692a + 1;
            this.f168692a = j;
            this.f168694d++;
            AbstractC75026g gVar2 = this.f168693b;
            if (gVar2 != null) {
                gVar2.mo118156a(j, b);
            }
            if (this.f168692a >= ((long) b)) {
                UgActivityTasks ugActivityTasks2 = this.f168695e;
                if (ugActivityTasks2 == null) {
                    C89219l.m154715b();
                }
                UgActivityTasks clone = ugActivityTasks2.clone();
                this.f168695e = null;
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC75055b(this, clone), 1000);
            }
            C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("referral_video_task_time_left"), (Object) String.valueOf(this.f168694d));
        }
    }
}
