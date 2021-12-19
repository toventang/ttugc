package com.p2082ss.android.ugc.aweme.specact.pendant.p3938f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.specact.p3926b.C74936a;
import com.p2082ss.android.ugc.aweme.specact.p3926b.C74939c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.C75057c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75060a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75083m;
import java.util.List;
import java.util.Random;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b */
public final class C75040b implements AbstractC75026g {

    /* renamed from: g */
    public static final AbstractC89244h f168662g = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C75042b.f168673a);

    /* renamed from: h */
    public static final C75041a f168663h = new C75041a((byte) 0);

    /* renamed from: a */
    public UgAwemeActivitySetting f168664a;

    /* renamed from: b */
    public int f168665b;

    /* renamed from: c */
    public boolean f168666c;

    /* renamed from: d */
    public List<? extends UgActivityTasks> f168667d = C89086z.INSTANCE;

    /* renamed from: e */
    public boolean f168668e;

    /* renamed from: f */
    public AbstractC75024e f168669f;

    /* renamed from: i */
    private final AbstractC89244h f168670i = C89250i.m154773a((AbstractC89171a) C75043c.f168674a);

    /* renamed from: j */
    private final AbstractC89244h f168671j = C89250i.m154773a((AbstractC89171a) C75048h.f168679a);

    /* renamed from: k */
    private final AbstractC89244h f168672k = C89250i.m154773a((AbstractC89171a) new C75047g(this));

    /* renamed from: j */
    private final C74939c m131752j() {
        return (C74939c) this.f168671j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: a */
    public final void mo118156a(long j, int i) {
    }

    /* renamed from: d */
    public final Keva mo118171d() {
        return (Keva) this.f168670i.getValue();
    }

    /* renamed from: e */
    public final AbstractC75022c mo118172e() {
        return (AbstractC75022c) this.f168672k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$a */
    public static final class C75041a {
        static {
            Covode.recordClassIndex(87913);
        }

        /* renamed from: a */
        public static C75040b m131765a() {
            return (C75040b) C75040b.f168662g.getValue();
        }

        private C75041a() {
        }

        public /* synthetic */ C75041a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$b */
    static final class C75042b extends AbstractC89220m implements AbstractC89171a<C75040b> {

        /* renamed from: a */
        public static final C75042b f168673a = new C75042b();

        static {
            Covode.recordClassIndex(87914);
        }

        C75042b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75040b invoke() {
            return new C75040b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$c */
    static final class C75043c extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C75043c f168674a = new C75043c();

        static {
            Covode.recordClassIndex(87915);
        }

        C75043c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("pendant_global_timer_reducer");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$h */
    static final class C75048h extends AbstractC89220m implements AbstractC89171a<C74939c> {

        /* renamed from: a */
        public static final C75048h f168679a = new C75048h();

        static {
            Covode.recordClassIndex(87920);
        }

        C75048h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74939c invoke() {
            return new C74939c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$d */
    static final class RunnableC75044d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75040b f168675a;

        static {
            Covode.recordClassIndex(87916);
        }

        RunnableC75044d(C75040b bVar) {
            this.f168675a = bVar;
        }

        public final void run() {
            UgActivityTasks i = this.f168675a.mo118176i();
            if (i != null) {
                this.f168675a.mo118170a(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$g */
    static final class C75047g extends AbstractC89220m implements AbstractC89171a<C75057c> {

        /* renamed from: a */
        final /* synthetic */ C75040b f168678a;

        static {
            Covode.recordClassIndex(87919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75047g(C75040b bVar) {
            super(0);
            this.f168678a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75057c invoke() {
            C75057c cVar = new C75057c();
            cVar.f168702a = this.f168678a;
            return cVar;
        }
    }

    static {
        Covode.recordClassIndex(87912);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: c */
    public final boolean mo118159c() {
        if (mo118174g() == this.f168667d.size() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo118173f() {
        if (!C75083m.m131849a() || !this.f168666c || mo118159c() || !this.f168668e) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final UgActivityTasks mo118176i() {
        if (this.f168665b < this.f168667d.size()) {
            return (UgActivityTasks) this.f168667d.get(this.f168665b);
        }
        return null;
    }

    /* renamed from: g */
    public final int mo118174g() {
        if (C75081k.m131846b() != mo118171d().getLong(C75083m.m131848a("direct_show_pendant"), 0)) {
            mo118171d().storeInt(C75083m.m131848a("finished_task_stage"), -1);
        }
        return mo118171d().getInt(C75083m.m131848a("finished_task_stage"), -1);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: b */
    public final void mo118158b() {
        if (!mo118172e().mo118153d()) {
            this.f168668e = false;
            mo118171d().storeBoolean(C75083m.m131848a("pendant_has_active"), this.f168668e);
            mo118171d().storeBoolean(C75083m.m131848a("stage_task_finish"), false);
            mo118171d().storeBoolean(C75083m.m131848a("has_report_read_and_like_task"), false);
            mo118171d().storeBoolean(C75083m.m131848a("do_like_or_comment_action"), false);
            C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("do_like_or_comment_action"), (Object) "false");
        }
    }

    /* renamed from: h */
    public final void mo118175h() {
        mo118172e().mo118148a();
        mo118171d().storeInt(C75083m.m131848a("finished_task_stage"), this.f168665b);
        int i = this.f168665b + 1;
        this.f168665b = i;
        if (i < this.f168667d.size()) {
            UgActivityTasks i2 = mo118176i();
            if (i2 != null) {
                mo118170a(i2);
                return;
            }
            return;
        }
        this.f168668e = false;
        mo118171d().storeBoolean(C75083m.m131848a("pendant_has_active"), false);
        mo118172e().mo118152b(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: a */
    public final void mo118155a() {
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f168664a;
        if (ugAwemeActivitySetting != null && !C75060a.m131800c(ugAwemeActivitySetting)) {
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f168664a;
            if (ugAwemeActivitySetting2 == null) {
                C89219l.m154715b();
            }
            if (C75060a.m131796a(ugAwemeActivitySetting2)) {
                if (mo118159c()) {
                    this.f168668e = false;
                    mo118171d().storeBoolean(C75083m.m131848a("pendant_has_active"), false);
                    mo118172e().mo118152b(false);
                }
                if (m131751a(this.f168667d) != null) {
                    mo118171d().storeBoolean(C75083m.m131848a("has_report_read_and_like_task"), false);
                    mo118171d().storeBoolean(C75083m.m131848a("do_like_or_comment_action"), false);
                    C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("do_like_or_comment_action"), (Object) "false");
                }
                this.f168665b = 0;
                mo118171d().storeInt(C75083m.m131848a("finished_task_stage"), -1);
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC75044d(this), ((long) new Random().nextInt(5)) * 1000);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$f */
    static final class C75046f extends AbstractC89220m implements AbstractC89172b<C74936a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75040b f168677a;

        static {
            Covode.recordClassIndex(87918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75046f(C75040b bVar) {
            super(1);
            this.f168677a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C74936a aVar) {
            C89219l.m154721d(aVar, "");
            this.f168677a.mo118175h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo118170a(UgActivityTasks ugActivityTasks) {
        mo118173f();
        if (mo118173f()) {
            mo118172e().mo118149a(ugActivityTasks);
        }
    }

    /* renamed from: a */
    public static UgActivityTasks m131751a(List<? extends UgActivityTasks> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        for (UgActivityTasks ugActivityTasks : list) {
            if (C89219l.m154714a((Object) ugActivityTasks.getTaskId(), (Object) "read_and_like_video")) {
                return ugActivityTasks;
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$e */
    static final class C75045e extends AbstractC89220m implements AbstractC89172b<C74936a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75040b f168676a;

        static {
            Covode.recordClassIndex(87917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75045e(C75040b bVar) {
            super(1);
            this.f168676a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C74936a aVar) {
            C74936a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f168465a != 10009) {
                this.f168676a.mo118175h();
            } else {
                this.f168676a.mo118172e().mo118148a();
                if (this.f168676a.f168665b == this.f168676a.f168667d.size() - 1) {
                    this.f168676a.f168668e = false;
                    this.f168676a.mo118171d().storeBoolean(C75083m.m131848a("pendant_has_active"), false);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: a */
    public final void mo118157a(UgActivityTasks ugActivityTasks, boolean z) {
        C89219l.m154721d(ugActivityTasks, "");
        if (z) {
            String c = C75060a.m131799c(ugActivityTasks);
            int b = C75060a.m131797b(ugActivityTasks);
            if (!TextUtils.isEmpty(c)) {
                C75046f fVar = new C75046f(this);
                C75045e eVar = new C75045e(this);
                if (!C89219l.m154714a((Object) c, (Object) "read_and_like_video")) {
                    m131752j();
                    C74939c.m131538a(c, b, true, fVar, eVar);
                } else if (mo118171d().getBoolean(C75083m.m131848a("do_like_or_comment_action"), false)) {
                    m131752j();
                    C74939c.m131538a(c, b, true, fVar, eVar);
                    mo118171d().storeBoolean(C75083m.m131848a("has_report_read_and_like_task"), true);
                    C39162r.m79460a("interact_task_complete", new C33744d().mo59983a("task_name", "complete").f79943a);
                } else {
                    C39162r.m79460a("interact_task_complete", new C33744d().mo59983a("task_name", "watch_video").f79943a);
                }
            }
        }
    }
}
