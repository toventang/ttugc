package com.bytedance.android.live.liveinteract.multiguest.opt.p337a;

import com.bytedance.android.live.liveinteract.api.p260a.AbstractC4383a;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4432f;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7664c;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7676a;
import com.bytedance.android.livesdk.p458b.p459a.C6896e;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC4432f(mo10206a = "MULTI_GUEST_DATA_HOLDER")
/* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a */
public final class C5271a extends AbstractC4383a {

    /* renamed from: a */
    public C6896e f13630a = new C6896e();

    /* renamed from: b */
    public boolean f13631b = true;

    /* renamed from: c */
    public boolean f13632c = true;

    /* renamed from: d */
    public boolean f13633d = true;

    /* renamed from: e */
    public int f13634e;

    /* renamed from: f */
    public boolean f13635f;

    /* renamed from: g */
    public int f13636g;

    /* renamed from: h */
    public boolean f13637h;

    /* renamed from: i */
    public C7676a f13638i;

    /* renamed from: j */
    public int f13639j = 1;

    /* renamed from: k */
    public Set<Long> f13640k = new HashSet();

    /* renamed from: l */
    public int f13641l;

    /* renamed from: m */
    public boolean f13642m;

    /* renamed from: n */
    public List<C7664c> f13643n;

    /* renamed from: o */
    public int f13644o;

    /* renamed from: p */
    public EnumC4422k f13645p = EnumC4422k.NORMAL;

    /* renamed from: q */
    public EnumC4422k f13646q = EnumC4422k.NORMAL;

    /* renamed from: r */
    public String f13647r;

    /* renamed from: s */
    public boolean f13648s;

    /* renamed from: t */
    public int f13649t = -1;

    /* renamed from: u */
    public String f13650u;

    /* renamed from: v */
    private String f13651v;

    /* renamed from: w */
    private long f13652w;

    /* renamed from: x */
    private final AbstractC89244h f13653x = C89250i.m154773a((AbstractC89171a) C5275d.f13659a);

    /* renamed from: y */
    private final AbstractC89244h f13654y = C89250i.m154773a((AbstractC89171a) C5272a.f13656a);

    /* renamed from: z */
    private final AbstractC89244h f13655z = C89250i.m154773a((AbstractC89171a) C5274c.f13658a);

    static {
        Covode.recordClassIndex(5863);
    }

    /* renamed from: a */
    public final HashMap<String, Boolean> mo11108a() {
        return (HashMap) this.f13653x.getValue();
    }

    /* renamed from: b */
    public final HashMap<String, Boolean> mo11111b() {
        return (HashMap) this.f13654y.getValue();
    }

    /* renamed from: c */
    public final HashMap<Long, String> mo11112c() {
        return (HashMap) this.f13655z.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a$a */
    static final class C5272a extends AbstractC89220m implements AbstractC89171a<HashMap<String, Boolean>> {

        /* renamed from: a */
        public static final C5272a f13656a = new C5272a();

        static {
            Covode.recordClassIndex(5864);
        }

        C5272a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, Boolean> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a$c */
    static final class C5274c extends AbstractC89220m implements AbstractC89171a<HashMap<Long, String>> {

        /* renamed from: a */
        public static final C5274c f13658a = new C5274c();

        static {
            Covode.recordClassIndex(5866);
        }

        C5274c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<Long, String> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a$d */
    static final class C5275d extends AbstractC89220m implements AbstractC89171a<HashMap<String, Boolean>> {

        /* renamed from: a */
        public static final C5275d f13659a = new C5275d();

        static {
            Covode.recordClassIndex(5867);
        }

        C5275d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, Boolean> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: d */
    public final String mo11113d() {
        if (this.f13649t == -1) {
            return "panel_Golive";
        }
        return "panel_plus";
    }

    /* renamed from: e */
    public final void mo11114e() {
        this.f13632c = true;
        this.f13633d = true;
        this.f13635f = false;
        mo11108a().clear();
        mo11111b().clear();
        this.f13644o = 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.p260a.AbstractC4383a
    /* renamed from: a */
    public final void mo10144a(long j) {
        this.f13652w = j;
    }

    @Override // com.bytedance.android.live.liveinteract.api.p260a.AbstractC4383a
    /* renamed from: b */
    public final void mo10146b(String str) {
        this.f13650u = str;
    }

    @Override // com.bytedance.android.live.liveinteract.api.p260a.AbstractC4383a
    /* renamed from: a */
    public final void mo10145a(String str) {
        this.f13651v = str;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a$b */
    static final class C5273b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5271a f13657a;

        static {
            Covode.recordClassIndex(5865);
        }

        C5273b(C5271a aVar) {
            this.f13657a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5271a aVar = this.f13657a;
            EnumC4422k kVar = aVar.f13646q;
            C89219l.m154721d(kVar, "");
            aVar.f13645p = kVar;
        }
    }

    /* renamed from: a */
    public final void mo11110a(boolean z) {
        C5714i.f14487b = z;
        this.f13637h = z;
    }

    /* renamed from: a */
    public final void mo11109a(EnumC4422k kVar) {
        C89219l.m154721d(kVar, "");
        this.f13646q = kVar;
        AbstractC88979t.m154310b((Object) 1).mo143295e(2, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C5273b(this));
    }
}
