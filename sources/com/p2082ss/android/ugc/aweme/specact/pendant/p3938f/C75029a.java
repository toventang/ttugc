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
import com.p2082ss.android.ugc.aweme.specact.p3926b.C74936a;
import com.p2082ss.android.ugc.aweme.specact.p3926b.C74939c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75022c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.C75053a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75060a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75068h;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75083m;
import java.util.Random;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a */
public final class C75029a implements AbstractC75026g {

    /* renamed from: j */
    public static final AbstractC89244h f168637j = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C75031b.f168651a);

    /* renamed from: k */
    public static final C75030a f168638k = new C75030a((byte) 0);

    /* renamed from: a */
    public UgAwemeActivitySetting f168639a;

    /* renamed from: b */
    public boolean f168640b;

    /* renamed from: c */
    public boolean f168641c;

    /* renamed from: d */
    public int f168642d;

    /* renamed from: e */
    public Boolean f168643e = false;

    /* renamed from: f */
    public Integer f168644f = 5;

    /* renamed from: g */
    public String f168645g = "coin2";

    /* renamed from: h */
    public Boolean f168646h = false;

    /* renamed from: i */
    public AbstractC75024e f168647i;

    /* renamed from: l */
    private final AbstractC89244h f168648l = C89250i.m154773a((AbstractC89171a) C75032c.f168652a);

    /* renamed from: m */
    private final AbstractC89244h f168649m = C89250i.m154773a((AbstractC89171a) new C75038i(this));

    /* renamed from: n */
    private final AbstractC89244h f168650n = C89250i.m154773a((AbstractC89171a) C75039j.f168661a);

    /* renamed from: d */
    public final Keva mo118162d() {
        return (Keva) this.f168648l.getValue();
    }

    /* renamed from: e */
    public final AbstractC75022c mo118163e() {
        return (AbstractC75022c) this.f168649m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$a */
    public static final class C75030a {
        static {
            Covode.recordClassIndex(87902);
        }

        /* renamed from: a */
        public static C75029a m131750a() {
            return (C75029a) C75029a.f168637j.getValue();
        }

        private C75030a() {
        }

        public /* synthetic */ C75030a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$b */
    static final class C75031b extends AbstractC89220m implements AbstractC89171a<C75029a> {

        /* renamed from: a */
        public static final C75031b f168651a = new C75031b();

        static {
            Covode.recordClassIndex(87903);
        }

        C75031b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75029a invoke() {
            return new C75029a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$c */
    static final class C75032c extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C75032c f168652a = new C75032c();

        static {
            Covode.recordClassIndex(87904);
        }

        C75032c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("pendant_global_timer");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$j */
    static final class C75039j extends AbstractC89220m implements AbstractC89171a<C74939c> {

        /* renamed from: a */
        public static final C75039j f168661a = new C75039j();

        static {
            Covode.recordClassIndex(87911);
        }

        C75039j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74939c invoke() {
            return new C74939c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$d */
    static final class RunnableC75033d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75029a f168653a;

        static {
            Covode.recordClassIndex(87905);
        }

        RunnableC75033d(C75029a aVar) {
            this.f168653a = aVar;
        }

        public final void run() {
            UgActivityTasks h = this.f168653a.mo118166h();
            if (h != null) {
                this.f168653a.mo118160a(h);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$f */
    static final class RunnableC75035f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75029a f168655a;

        static {
            Covode.recordClassIndex(87907);
        }

        RunnableC75035f(C75029a aVar) {
            this.f168655a = aVar;
        }

        public final void run() {
            UgActivityTasks h = this.f168655a.mo118166h();
            if (h != null) {
                this.f168655a.mo118160a(h);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$i */
    static final class C75038i extends AbstractC89220m implements AbstractC89171a<C75053a> {

        /* renamed from: a */
        final /* synthetic */ C75029a f168660a;

        static {
            Covode.recordClassIndex(87910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75038i(C75029a aVar) {
            super(0);
            this.f168660a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75053a invoke() {
            C75053a aVar = new C75053a();
            aVar.f168693b = this.f168660a;
            return aVar;
        }
    }

    /* renamed from: h */
    public final UgActivityTasks mo118166h() {
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f168639a;
        if (ugAwemeActivitySetting == null) {
            C89219l.m154715b();
        }
        return C75060a.m131804f(ugAwemeActivitySetting);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$e */
    static final class RunnableC75034e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75029a f168654a;

        static {
            Covode.recordClassIndex(87906);
        }

        RunnableC75034e(C75029a aVar) {
            this.f168654a = aVar;
        }

        public final void run() {
            this.f168654a.mo118161a(true, false);
            this.f168654a.mo118162d().storeBoolean(C75083m.m131848a("task_finish"), false);
        }
    }

    static {
        Covode.recordClassIndex(87901);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: b */
    public final void mo118158b() {
        this.f168640b = false;
        mo118162d().storeBoolean(C75083m.m131848a("new_pendant_has_active_manual"), this.f168640b);
    }

    /* renamed from: f */
    public final boolean mo118164f() {
        if (!C75083m.m131849a() || !this.f168641c || mo118159c() || !this.f168640b) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: c */
    public final boolean mo118159c() {
        if (!mo118162d().getBoolean(C75083m.m131848a("task_finish"), false) || !C75081k.m131845a(mo118162d().getLong(C75083m.m131848a("task_finish_save_timestamp"), 0))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo118165g() {
        String str;
        mo118162d().storeBoolean(C75083m.m131848a("task_finish"), true);
        mo118162d().storeLong(C75083m.m131848a("task_finish_save_timestamp"), C75081k.m131846b());
        AbstractC75024e eVar = this.f168647i;
        if (eVar != null) {
            eVar.mo118072a(false, C75060a.m131814p(this.f168639a), C75060a.m131815q(this.f168639a));
        }
        this.f168640b = false;
        mo118162d().storeBoolean(C75083m.m131848a("new_pendant_has_active_manual"), false);
        mo118163e().mo118152b(false);
        boolean a = C89219l.m154714a((Object) this.f168646h, (Object) true);
        if (mo118164f()) {
            str = "ongoing";
        } else {
            str = "finished";
        }
        C75068h.m131834a("non_tracker", a ? 1 : 0, str, this.f168639a);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: a */
    public final void mo118155a() {
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f168639a;
        if (ugAwemeActivitySetting != null && !C75060a.m131800c(ugAwemeActivitySetting)) {
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f168639a;
            if (ugAwemeActivitySetting2 == null) {
                C89219l.m154715b();
            }
            if (C75060a.m131796a(ugAwemeActivitySetting2)) {
                if (mo118159c()) {
                    this.f168640b = false;
                    mo118162d().storeBoolean(C75083m.m131848a("new_pendant_has_active_manual"), false);
                    mo118163e().mo118152b(false);
                }
                if (C89219l.m154714a((Object) this.f168643e, (Object) false)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC75033d(this), ((long) new Random().nextInt(5)) * 1000);
                } else if (mo118162d().getBoolean(C75083m.m131848a("task_finish"), false)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC75034e(this), ((long) new Random().nextInt(5)) * 1000);
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC75035f(this), ((long) new Random().nextInt(5)) * 1000);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m131735b(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("is_last_round", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static int m131736c(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optInt("display_amount");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static int m131737d(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optInt("display_cash_amount");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static int m131734a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            String optString = new JSONObject(str).optString("cold_down");
            C89219l.m154716b(optString, "");
            return Integer.parseInt(optString);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$g */
    static final class C75036g extends AbstractC89220m implements AbstractC89172b<C74936a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75029a f168656a;

        /* renamed from: b */
        final /* synthetic */ UgActivityTasks f168657b;

        static {
            Covode.recordClassIndex(87908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75036g(C75029a aVar, UgActivityTasks ugActivityTasks) {
            super(1);
            this.f168656a = aVar;
            this.f168657b = ugActivityTasks;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C74936a aVar) {
            C74936a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            int i = aVar2.f168465a;
            if (i == 10006 || i == 10009) {
                this.f168656a.mo118165g();
            } else {
                this.f168656a.mo118163e().mo118151b(this.f168657b);
                this.f168656a.mo118160a(this.f168657b);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo118160a(UgActivityTasks ugActivityTasks) {
        mo118164f();
        if (mo118164f()) {
            AbstractC75024e eVar = this.f168647i;
            if (eVar != null) {
                eVar.mo118072a(true, C75060a.m131814p(this.f168639a), C75060a.m131815q(this.f168639a));
            }
            mo118163e().mo118149a(ugActivityTasks);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$h */
    static final class C75037h extends AbstractC89220m implements AbstractC89172b<C74936a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75029a f168658a;

        /* renamed from: b */
        final /* synthetic */ UgActivityTasks f168659b;

        static {
            Covode.recordClassIndex(87909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75037h(C75029a aVar, UgActivityTasks ugActivityTasks) {
            super(1);
            this.f168658a = aVar;
            this.f168659b = ugActivityTasks;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C74936a aVar) {
            UgActivityTasks ugActivityTasks;
            C74936a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            int a = C75029a.m131734a(aVar2.f168466b);
            if (C75029a.m131735b(aVar2.f168466b)) {
                this.f168658a.mo118165g();
            } else {
                this.f168658a.mo118163e().mo118148a();
                C75029a aVar3 = this.f168658a;
                if (a > 0) {
                    ugActivityTasks = this.f168659b.clone(Integer.valueOf(a));
                } else {
                    ugActivityTasks = this.f168659b;
                }
                C89219l.m154716b(ugActivityTasks, "");
                aVar3.mo118160a(ugActivityTasks);
            }
            AbstractC75024e eVar = this.f168658a.f168647i;
            if (eVar != null) {
                eVar.mo118077e(aVar2.f168466b);
            }
            C39162r.m79460a("widget_time_tracker_1round", new C33744d().mo59980a("score_amount", C75029a.m131736c(aVar2.f168466b)).mo59980a("cash_amount", C75029a.m131737d(aVar2.f168466b)).f79943a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: a */
    public final void mo118156a(long j, int i) {
        AbstractC75024e eVar = this.f168647i;
        if (eVar != null) {
            eVar.mo118070a((int) j, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g
    /* renamed from: a */
    public final void mo118157a(UgActivityTasks ugActivityTasks, boolean z) {
        C89219l.m154721d(ugActivityTasks, "");
        if (!z) {
            AbstractC75024e eVar = this.f168647i;
            if (eVar != null) {
                eVar.mo118083q();
                return;
            }
            return;
        }
        String c = C75060a.m131799c(ugActivityTasks);
        if (!TextUtils.isEmpty(c)) {
            AbstractC75024e eVar2 = this.f168647i;
            if (eVar2 != null) {
                eVar2.mo118084r();
            }
            C75037h hVar = new C75037h(this, ugActivityTasks);
            C75036g gVar = new C75036g(this, ugActivityTasks);
            this.f168650n.getValue();
            C74939c.m131538a(c, this.f168642d, false, hVar, gVar);
        }
    }

    /* renamed from: a */
    public final void mo118161a(boolean z, boolean z2) {
        String str;
        AbstractC75024e eVar;
        AbstractC75024e eVar2 = this.f168647i;
        if (eVar2 == null || eVar2.mo118080o()) {
            AbstractC75024e eVar3 = this.f168647i;
            if (eVar3 != null && eVar3.mo118082p() && z2 && !z && (eVar = this.f168647i) != null) {
                eVar.mo118085s();
            }
            if (!this.f168640b && this.f168641c && z && !mo118159c()) {
                this.f168640b = true;
                mo118162d().storeBoolean(C75083m.m131848a("new_pendant_has_active_manual"), true);
                mo118163e().mo118152b(this.f168640b);
                AbstractC75024e eVar4 = this.f168647i;
                if (eVar4 != null) {
                    eVar4.mo118072a(true, C75060a.m131814p(this.f168639a), C75060a.m131815q(this.f168639a));
                }
                AbstractC75024e eVar5 = this.f168647i;
                if (eVar5 != null) {
                    eVar5.mo118076d(this.f168645g);
                }
                boolean a = C89219l.m154714a((Object) this.f168646h, (Object) true);
                if (mo118164f()) {
                    str = "ongoing";
                } else {
                    str = "finished";
                }
                C75068h.m131834a("tracker", a ? 1 : 0, str, this.f168639a);
            }
        }
    }
}
