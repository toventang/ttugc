package com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a;

import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1617a.p1618a.C22118b;
import com.bytedance.scene.p1621c.C22154f;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.l.a.d */
public final class C52689d extends AbstractC2562j<AbstractC52688c> implements AbstractC21566a, AbstractC52688c {

    /* renamed from: a */
    public final AbstractC52688c f121281a;

    /* renamed from: b */
    public final AbstractC22186b f121282b;

    /* renamed from: c */
    public final AbstractC52708i f121283c;

    /* renamed from: d */
    private final AbstractC71864a f121284d;

    /* renamed from: e */
    private final AbstractC89244h f121285e;

    /* renamed from: f */
    private final AbstractC89244h f121286f;

    /* renamed from: g */
    private final AbstractC89244h f121287g;

    /* renamed from: h */
    private final C21582f f121288h;

    /* renamed from: i */
    private final int f121289i;

    /* renamed from: j */
    private final List<C83938b> f121290j;

    /* renamed from: k */
    private final C83938b f121291k;

    /* renamed from: l */
    private final AbstractC89171a<C89391z> f121292l;

    static {
        Covode.recordClassIndex(62085);
    }

    /* renamed from: c */
    private final C52697f m97551c() {
        return (C52697f) this.f121287g.getValue();
    }

    /* renamed from: a */
    public final C2563k<Boolean> mo88377a() {
        return (C2563k) this.f121285e.getValue();
    }

    /* renamed from: b */
    public final C52702g mo88378b() {
        return (C52702g) this.f121286f.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC52688c getApiComponent() {
        return this.f121281a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f121288h;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.d$e */
    static final class C52695e extends AbstractC89220m implements AbstractC89171a<C2563k<Boolean>> {

        /* renamed from: a */
        public static final C52695e f121298a = new C52695e();

        static {
            Covode.recordClassIndex(62091);
        }

        C52695e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C2563k<Boolean> invoke() {
            return new C2563k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.d$c */
    static final class C52692c extends AbstractC89220m implements AbstractC89171a<C52697f> {

        /* renamed from: a */
        final /* synthetic */ C52689d f121295a;

        static {
            Covode.recordClassIndex(62088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52692c(C52689d dVar) {
            super(0);
            this.f121295a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52697f invoke() {
            return new C52697f(this.f121295a.f121283c, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.C52689d.C52692c.C526931 */

                /* renamed from: a */
                final /* synthetic */ C52692c f121296a;

                static {
                    Covode.recordClassIndex(62089);
                }

                {
                    this.f121296a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f121296a.f121295a.mo88375a(false);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.d$d */
    static final class C52694d extends AbstractC89220m implements AbstractC89171a<C52702g> {

        /* renamed from: a */
        final /* synthetic */ C52689d f121297a;

        static {
            Covode.recordClassIndex(62090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52694d(C52689d dVar) {
            super(0);
            this.f121297a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52702g invoke() {
            return new C52702g(this.f121297a.f121283c, this.f121297a.mo88377a());
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        AbstractC89171a<C89391z> aVar = this.f121292l;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f121283c.mo88383a(this.f121290j);
        this.f121283c.mo88386b(this.f121291k);
        this.f121282b.mo36387a(this.f121289i, mo88378b(), "FTCToolbarScene");
        this.f121284d.mo113515d().mo7036a(this, new C52690a(this));
        this.f121284d.mo113507a().mo7036a(this, new C52691b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52688c
    /* renamed from: a */
    public final void mo88372a(int i) {
        this.f121283c.mo88380a(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.d$a */
    static final class C52690a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52689d f121293a;

        static {
            Covode.recordClassIndex(62086);
        }

        C52690a(C52689d dVar) {
            this.f121293a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121293a.mo88377a().mo6999a((Boolean) obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52688c
    /* renamed from: a */
    public final void mo88373a(C83938b bVar) {
        C89219l.m154721d(bVar, "");
        this.f121283c.mo88382a(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.d$b */
    static final class C52691b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52689d f121294a;

        static {
            Covode.recordClassIndex(62087);
        }

        C52691b(C52689d dVar) {
            this.f121294a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f121294a.f121282b.mo36417e(this.f121294a.mo88378b());
            } else {
                this.f121294a.f121282b.mo36413d(this.f121294a.mo88378b());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52688c
    /* renamed from: a */
    public final void mo88374a(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f121283c.mo88379a());
        arrayList.addAll(list);
        this.f121283c.mo88383a(arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52688c
    /* renamed from: b */
    public final void mo88376b(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f121283c.mo88379a());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f121283c.mo88383a(arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52688c
    /* renamed from: a */
    public final void mo88375a(boolean z) {
        if (C22227b.m41825a(this.f121282b) != null) {
            C22239d a = C22227b.m41825a(this.f121282b);
            if (a == null) {
                C89219l.m154715b();
            }
            if (z) {
                if (mo88378b().mo36460z()) {
                    this.f121282b.mo36413d(mo88378b());
                }
                if (!C67279a.m119196a(a, m97551c())) {
                    C52697f c = m97551c();
                    C22154f.C22155a aVar = new C22154f.C22155a();
                    aVar.f52384a = true;
                    aVar.f52386c = new C22118b();
                    a.mo36537b(c, aVar.mo36338b());
                }
            } else if (!mo88378b().mo36460z()) {
                this.f121282b.mo36417e(mo88378b());
            }
        }
    }

    public /* synthetic */ C52689d(AbstractC22186b bVar, C21582f fVar, List list, C83938b bVar2, AbstractC89171a aVar, int i) {
        this(bVar, fVar, list, bVar2, aVar, i, new C52696e());
    }

    private C52689d(AbstractC22186b bVar, C21582f fVar, List<C83938b> list, C83938b bVar2, AbstractC89171a<C89391z> aVar, int i, AbstractC52708i iVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(iVar, "");
        this.f121282b = bVar;
        this.f121288h = fVar;
        this.f121289i = R.id.dg9;
        this.f121290j = list;
        this.f121291k = bVar2;
        this.f121292l = aVar;
        this.f121283c = iVar;
        this.f121284d = (AbstractC71864a) getDiContainer().mo35249a(AbstractC71864a.class, (String) null);
        this.f121281a = this;
        this.f121285e = C89250i.m154773a((AbstractC89171a) C52695e.f121298a);
        this.f121286f = C89250i.m154773a((AbstractC89171a) new C52694d(this));
        this.f121287g = C89250i.m154773a((AbstractC89171a) new C52692c(this));
        iVar.mo88380a(i);
    }
}
