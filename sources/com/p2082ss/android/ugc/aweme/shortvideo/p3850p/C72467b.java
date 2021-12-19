package com.p2082ss.android.ugc.aweme.shortvideo.p3850p;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b */
public final class C72467b implements AbstractC72480e {

    /* renamed from: e */
    public static final C72468a f162454e = new C72468a((byte) 0);

    /* renamed from: a */
    public final String f162455a;

    /* renamed from: b */
    public final Stack<String> f162456b;

    /* renamed from: c */
    public final AtomicInteger f162457c;

    /* renamed from: d */
    public final String f162458d;

    /* renamed from: f */
    private final AbstractC89244h f162459f = C89250i.m154773a((AbstractC89171a) new C72470c(this));

    /* renamed from: g */
    private final ExecutorService f162460g;

    static {
        Covode.recordClassIndex(85142);
    }

    /* renamed from: a */
    public final Keva mo114736a() {
        return (Keva) this.f162459f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$a */
    public static final class C72468a {
        static {
            Covode.recordClassIndex(85143);
        }

        private C72468a() {
        }

        public /* synthetic */ C72468a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$f */
    static final class RunnableC72473f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72467b f162467a;

        static {
            Covode.recordClassIndex(85148);
        }

        RunnableC72473f(C72467b bVar) {
            this.f162467a = bVar;
        }

        public final void run() {
            this.f162467a.mo114736a().storeBoolean("exit_monitor_key_in_pipeline", true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$i */
    static final class RunnableC72476i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72467b f162473a;

        static {
            Covode.recordClassIndex(85151);
        }

        RunnableC72476i(C72467b bVar) {
            this.f162473a = bVar;
        }

        public final void run() {
            this.f162473a.mo114736a().storeBoolean("exit_monitor_key_in_pipeline", false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e
    /* renamed from: b */
    public final String mo114740b() {
        String string = mo114736a().getString("exit_monitor_key_last_page", "");
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e
    /* renamed from: c */
    public final void mo114741c() {
        this.f162460g.submit(new RunnableC72473f(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e
    /* renamed from: d */
    public final void mo114742d() {
        this.f162460g.submit(new RunnableC72476i(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e
    /* renamed from: e */
    public final void mo114743e() {
        this.f162460g.submit(new RunnableC72472e(this, 1));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e
    /* renamed from: f */
    public final void mo114744f() {
        this.f162460g.submit(new RunnableC72471d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$b */
    static final class RunnableC72469b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72467b f162461a;

        /* renamed from: b */
        final /* synthetic */ int f162462b;

        static {
            Covode.recordClassIndex(85144);
        }

        RunnableC72469b(C72467b bVar, int i) {
            this.f162461a = bVar;
            this.f162462b = i;
        }

        public final void run() {
            this.f162461a.mo114736a().storeInt("exit_monitor_key_publish_task", this.f162461a.f162457c.addAndGet(this.f162462b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$c */
    static final class C72470c extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        final /* synthetic */ C72467b f162463a;

        static {
            Covode.recordClassIndex(85145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72470c(C72467b bVar) {
            super(0);
            this.f162463a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo(this.f162463a.f162458d + "_studio_abnormal_exit_repo");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$e */
    static final class RunnableC72472e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72467b f162465a;

        /* renamed from: b */
        final /* synthetic */ int f162466b = 1;

        static {
            Covode.recordClassIndex(85147);
        }

        RunnableC72472e(C72467b bVar, int i) {
            this.f162465a = bVar;
        }

        public final void run() {
            this.f162465a.mo114736a().storeInt("exit_monitor_key_publish_task", this.f162465a.f162457c.addAndGet(-this.f162466b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$g */
    static final class RunnableC72474g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72467b f162468a;

        /* renamed from: b */
        final /* synthetic */ boolean f162469b;

        /* renamed from: c */
        final /* synthetic */ String f162470c;

        static {
            Covode.recordClassIndex(85149);
        }

        RunnableC72474g(C72467b bVar, boolean z, String str) {
            this.f162468a = bVar;
            this.f162469b = z;
            this.f162470c = str;
        }

        public final void run() {
            if (this.f162469b) {
                this.f162468a.f162456b.clear();
            }
            this.f162468a.f162456b.push(this.f162470c);
            this.f162468a.mo114736a().storeString("exit_monitor_key_last_page", this.f162470c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$h */
    static final class RunnableC72475h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72467b f162471a;

        /* renamed from: b */
        final /* synthetic */ String f162472b;

        static {
            Covode.recordClassIndex(85150);
        }

        RunnableC72475h(C72467b bVar, String str) {
            this.f162471a = bVar;
            this.f162472b = str;
        }

        public final void run() {
            if (C89219l.m154714a((Object) this.f162471a.f162456b.peek(), (Object) this.f162472b)) {
                this.f162471a.f162456b.pop();
                this.f162471a.mo114736a().storeString("exit_monitor_key_last_page", this.f162471a.f162456b.peek());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$d */
    static final class RunnableC72471d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72467b f162464a;

        static {
            Covode.recordClassIndex(85146);
        }

        RunnableC72471d(C72467b bVar) {
            this.f162464a = bVar;
        }

        public final void run() {
            boolean z = this.f162464a.mo114736a().getBoolean("exit_monitor_key_in_pipeline", false);
            int i = this.f162464a.mo114736a().getInt("exit_monitor_key_publish_task", 0);
            if (z || i > 0) {
                C39162r.m79460a("app_exit_from_camera", new C84425b().mo129406a("last_status", this.f162464a.mo114740b()).mo129403a("pending_task_cnt", i).mo129406a("shoot_page", this.f162464a.f162455a).f188764a);
            }
            if (C89219l.m154714a((Object) this.f162464a.mo114740b(), (Object) "after_click_publish") || C89219l.m154714a((Object) this.f162464a.f162458d, (Object) "story")) {
                this.f162464a.mo114736a().storeBoolean("exit_monitor_key_in_pipeline", false);
                this.f162464a.mo114736a().storeInt("exit_monitor_key_publish_task", 0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e
    /* renamed from: a */
    public final void mo114737a(int i) {
        this.f162460g.submit(new RunnableC72469b(this, i));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e
    /* renamed from: a */
    public final void mo114738a(String str) {
        C89219l.m154721d(str, "");
        this.f162460g.submit(new RunnableC72475h(this, str));
    }

    public C72467b(String str) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        this.f162458d = str;
        int hashCode = str.hashCode();
        if (hashCode != -1039745817) {
            if (hashCode == 109770997 && str.equals("story")) {
                str2 = "story_shoot_page";
            }
        } else if (str.equals("normal")) {
            str2 = "video_shoot_page";
        }
        this.f162455a = str2;
        this.f162460g = C40780g.m82248e();
        this.f162456b = new Stack<>();
        this.f162457c = new AtomicInteger(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e
    /* renamed from: a */
    public final void mo114739a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f162460g.submit(new RunnableC72474g(this, z, str));
    }
}
