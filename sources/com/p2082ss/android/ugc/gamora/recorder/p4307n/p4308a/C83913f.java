package com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a;

import android.content.Context;
import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1617a.p1618a.C22118b;
import com.bytedance.scene.p1621c.C22154f;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.C37426a;
import com.p2082ss.android.ugc.aweme.property.C65499v;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73412j;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
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
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f */
public final class C83913f extends AbstractC2562j<AbstractC83912e> implements AbstractC21566a, AbstractC83912e {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f187314a = {new C89232y(C83913f.class, "recordModeLogicComponent", "getRecordModeLogicComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeLogicComponent;", 0), new C89232y(C83913f.class, "recordCommentAndQuestionPanelApi", "getRecordCommentAndQuestionPanelApi()Lcom/ss/android/ugc/aweme/commentStickerPanel/CommentAndQuestionStickerPanelApi;", 0)};

    /* renamed from: b */
    public final ShortVideoContext f187315b;

    /* renamed from: c */
    public final AbstractC83912e f187316c;

    /* renamed from: d */
    public final AbstractC2565m<Boolean> f187317d;

    /* renamed from: e */
    public final AbstractC22186b f187318e;

    /* renamed from: f */
    public final AbstractC83906b f187319f;

    /* renamed from: g */
    private final AbstractC71864a f187320g;

    /* renamed from: h */
    private final AbstractC89248d f187321h;

    /* renamed from: i */
    private final AbstractC89248d f187322i;

    /* renamed from: j */
    private final AbstractC89244h f187323j;

    /* renamed from: k */
    private final AbstractC89244h f187324k;

    /* renamed from: l */
    private final AbstractC89244h f187325l;

    /* renamed from: m */
    private final AbstractC89244h f187326m;

    /* renamed from: n */
    private final C21582f f187327n;

    /* renamed from: o */
    private final int f187328o = R.id.dg9;

    /* renamed from: p */
    private final List<C83938b> f187329p;

    /* renamed from: q */
    private final C83938b f187330q;

    /* renamed from: r */
    private final AbstractC89171a<C89391z> f187331r;

    /* renamed from: s */
    private boolean f187332s;

    static {
        Covode.recordClassIndex(97804);
    }

    /* renamed from: e */
    private final C83927h m144334e() {
        return (C83927h) this.f187326m.getValue();
    }

    /* renamed from: a */
    public final AbstractC37367d mo128809a() {
        return (AbstractC37367d) this.f187322i.mo23374a(this, f187314a[1]);
    }

    /* renamed from: b */
    public final C2563k<Boolean> mo128810b() {
        return (C2563k) this.f187323j.getValue();
    }

    /* renamed from: c */
    public final C1213t<Boolean> mo128812c() {
        return (C1213t) this.f187324k.getValue();
    }

    /* renamed from: d */
    public final C83932i mo128813d() {
        return (C83932i) this.f187325l.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83912e getApiComponent() {
        return this.f187316c;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187327n;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$a */
    static final class C83914a extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C83914a f187333a = new C83914a();

        static {
            Covode.recordClassIndex(97805);
        }

        C83914a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$k */
    static final class C83925k extends AbstractC89220m implements AbstractC89171a<C2563k<Boolean>> {

        /* renamed from: a */
        public static final C83925k f187345a = new C83925k();

        static {
            Covode.recordClassIndex(97816);
        }

        C83925k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C2563k<Boolean> invoke() {
            return new C2563k();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$f */
    static final class C83919f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83913f f187339a;

        static {
            Covode.recordClassIndex(97810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83919f(C83913f fVar) {
            super(0);
            this.f187339a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f187339a.mo128813d().mo128816b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$i */
    static final class C83922i extends AbstractC89220m implements AbstractC89171a<C83927h> {

        /* renamed from: a */
        final /* synthetic */ C83913f f187342a;

        static {
            Covode.recordClassIndex(97813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83922i(C83913f fVar) {
            super(0);
            this.f187342a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83927h invoke() {
            return new C83927h(this.f187342a.f187319f, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.C83913f.C83922i.C839231 */

                /* renamed from: a */
                final /* synthetic */ C83922i f187343a;

                static {
                    Covode.recordClassIndex(97814);
                }

                {
                    this.f187343a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f187343a.f187342a.mo128807a(false);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$j */
    static final class C83924j extends AbstractC89220m implements AbstractC89171a<C83932i> {

        /* renamed from: a */
        final /* synthetic */ C83913f f187344a;

        static {
            Covode.recordClassIndex(97815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83924j(C83913f fVar) {
            super(0);
            this.f187344a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83932i invoke() {
            return new C83932i(this.f187344a.f187319f, this.f187344a.mo128810b(), this.f187344a.f187315b);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$g */
    static final class C83920g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83913f f187340a;

        static {
            Covode.recordClassIndex(97811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83920g(C83913f fVar) {
            super(0);
            this.f187340a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C83938b d;
            int e = C70636dh.m124836e(this.f187340a.mo128813d().mo36485s());
            Context s = this.f187340a.mo128813d().mo36485s();
            C89219l.m154716b(s, "");
            if (C84912r.m145934b(s, (float) e) > C83932i.f187360c && (d = this.f187340a.f187319f.mo128801d()) != null) {
                C83913f fVar = this.f187340a;
                fVar.mo128804a(fVar.f187319f.mo128799c() + 1);
                this.f187340a.mo128811b(d);
                this.f187340a.mo128813d().mo128815a().notifyDataSetChanged();
                AbstractC37367d a = this.f187340a.mo128809a();
                if (a != null) {
                    a.mo64952n();
                }
                this.f187340a.mo128813d().mo128816b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        AbstractC89171a<C89391z> aVar = this.f187331r;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f187319f.mo128795a(this.f187329p);
        this.f187319f.mo128802d(this.f187330q);
        this.f187318e.mo36387a(this.f187328o, mo128813d(), "ToolbarScene");
        this.f187320g.mo113515d().mo7036a(this, new C83917d(this));
        this.f187320g.mo113507a().mo7036a(this, new C83918e(this));
        if (!C65499v.m117223a()) {
            C37426a.f88335e.mo6997a(this, this.f187317d);
        }
        if (C65499v.m117224b()) {
            m144333a(new C83919f(this));
            AbstractC37367d a = mo128809a();
            if (a != null) {
                a.mo64952n();
            }
        }
        if (C65499v.m117225c() || C65499v.m117226d()) {
            m144333a(new C83920g(this));
        }
        ((C73412j) this.f187321h.mo23374a(this, f187314a[0])).f164938d.mo6997a(this, new C83921h(this));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83912e
    /* renamed from: a */
    public final void mo128804a(int i) {
        this.f187319f.mo128792a(i);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$b */
    static final class C83915b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83913f f187334a;

        static {
            Covode.recordClassIndex(97806);
        }

        C83915b(C83913f fVar) {
            this.f187334a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187334a.mo128812c().setValue(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$d */
    static final class C83917d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83913f f187337a;

        static {
            Covode.recordClassIndex(97808);
        }

        C83917d(C83913f fVar) {
            this.f187337a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187337a.mo128810b().mo6999a((Boolean) obj);
        }
    }

    /* renamed from: a */
    private final void m144333a(AbstractC89171a<C89391z> aVar) {
        mo128812c().observe(this, new C83916c(this, aVar));
    }

    /* renamed from: b */
    public final void mo128811b(C83938b bVar) {
        C89219l.m154721d(bVar, "");
        this.f187319f.mo128794a(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$c */
    public static final class C83916c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83913f f187335a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f187336b;

        static {
            Covode.recordClassIndex(97807);
        }

        C83916c(C83913f fVar, AbstractC89171a aVar) {
            this.f187335a = fVar;
            this.f187336b = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC37367d a = this.f187335a.mo128809a();
            if (a != null && (!a.mo64948h() || !a.mo64949i())) {
                this.f187336b.invoke();
            }
            C37426a.f88335e.mo6998a(this.f187335a.f187317d);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$e */
    static final class C83918e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83913f f187338a;

        static {
            Covode.recordClassIndex(97809);
        }

        C83918e(C83913f fVar) {
            this.f187338a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (!bool.booleanValue() || this.f187338a.f187315b.mo110018b()) {
                this.f187338a.f187318e.mo36413d(this.f187338a.mo128813d());
            } else {
                this.f187338a.f187318e.mo36417e(this.f187338a.mo128813d());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83912e
    /* renamed from: a */
    public final void mo128805a(C83938b bVar) {
        C89219l.m154721d(bVar, "");
        this.f187319f.mo128800c(bVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83912e
    /* renamed from: b */
    public final void mo128808b(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f187319f.mo128791a());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f187319f.mo128795a(arrayList);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.f$h */
    static final class C83921h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83913f f187341a;

        static {
            Covode.recordClassIndex(97812);
        }

        C83921h(C83913f fVar) {
            this.f187341a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C83938b d = this.f187341a.f187319f.mo128801d();
                if (d != null) {
                    C83913f fVar = this.f187341a;
                    C89219l.m154721d(d, "");
                    fVar.f187319f.mo128798b(d);
                }
            } else {
                C83938b d2 = this.f187341a.f187319f.mo128801d();
                if (d2 != null) {
                    this.f187341a.mo128811b(d2);
                }
                AbstractC37367d a = this.f187341a.mo128809a();
                if (a != null) {
                    a.mo64952n();
                }
            }
            this.f187341a.mo128813d().mo128815a().notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83912e
    /* renamed from: a */
    public final void mo128806a(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f187319f.mo128791a());
        arrayList.addAll(list);
        this.f187319f.mo128795a(arrayList);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83912e
    /* renamed from: a */
    public final void mo128807a(boolean z) {
        if (C22227b.m41825a(this.f187318e) != null) {
            C22239d a = C22227b.m41825a(this.f187318e);
            if (a == null) {
                C89219l.m154715b();
            }
            if (z) {
                if (mo128813d().mo36460z()) {
                    this.f187318e.mo36413d(mo128813d());
                }
                if (!C67279a.m119196a(a, m144334e())) {
                    C83927h e = m144334e();
                    C22154f.C22155a aVar = new C22154f.C22155a();
                    aVar.f52384a = true;
                    aVar.f52386c = new C22118b();
                    a.mo36537b(e, aVar.mo36338b());
                }
            } else if (!mo128813d().mo36460z()) {
                this.f187318e.mo36417e(mo128813d());
            }
        }
    }

    public C83913f(AbstractC22186b bVar, C21582f fVar, List<C83938b> list, C83938b bVar2, AbstractC89171a<C89391z> aVar, int i, AbstractC83906b bVar3, boolean z) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar3, "");
        this.f187318e = bVar;
        this.f187327n = fVar;
        this.f187329p = list;
        this.f187330q = bVar2;
        this.f187331r = aVar;
        this.f187319f = bVar3;
        this.f187332s = z;
        this.f187320g = (AbstractC71864a) getDiContainer().mo35249a(AbstractC71864a.class, (String) null);
        this.f187321h = C21572a.m40504a(getDiContainer(), C73412j.class);
        this.f187322i = C21572a.m40505b(getDiContainer(), AbstractC37367d.class);
        this.f187315b = (ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null);
        this.f187316c = this;
        this.f187323j = C89250i.m154773a((AbstractC89171a) C83925k.f187345a);
        this.f187324k = C89250i.m154773a((AbstractC89171a) C83914a.f187333a);
        this.f187317d = new C83915b(this);
        this.f187325l = C89250i.m154773a((AbstractC89171a) new C83924j(this));
        this.f187326m = C89250i.m154773a((AbstractC89171a) new C83922i(this));
        bVar3.mo128792a(i);
    }
}
