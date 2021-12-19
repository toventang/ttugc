package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.p2902a.C46487a;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.p2902a.C46488b;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.p2902a.C46489c;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46451e;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.AbstractC46463c;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.C46462b;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46639a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46643e;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c */
public final class C46492c extends AbstractC46451e implements AbstractC46453g, AbstractC46463c {

    /* renamed from: k */
    public static int f108351k;

    /* renamed from: l */
    public static final C46494b f108352l = new C46494b((byte) 0);

    /* renamed from: c */
    final C46508h f108353c;

    /* renamed from: d */
    final C46520q f108354d;

    /* renamed from: e */
    public final C46514m f108355e;

    /* renamed from: f */
    final LinearLayoutManager f108356f;

    /* renamed from: g */
    int f108357g;

    /* renamed from: h */
    public boolean f108358h;

    /* renamed from: i */
    public final AbstractC89516am f108359i;

    /* renamed from: j */
    public final C46502d f108360j;

    /* renamed from: o */
    private final C46488b f108361o;

    /* renamed from: p */
    private final AbstractC89244h f108362p;

    /* renamed from: q */
    private final AbstractC89244h f108363q;

    /* renamed from: r */
    private final AbstractC89244h f108364r;

    /* renamed from: s */
    private final AbstractC89244h f108365s;

    /* renamed from: t */
    private final AbstractC89244h f108366t;

    /* renamed from: u */
    private final AbstractC89244h f108367u;

    /* renamed from: v */
    private final AbstractC46454h f108368v;

    static {
        Covode.recordClassIndex(55077);
    }

    /* renamed from: g */
    private SwipeControlledViewPager m89740g() {
        return (SwipeControlledViewPager) this.f108362p.getValue();
    }

    /* renamed from: h */
    private final RecyclerView m89741h() {
        return (RecyclerView) this.f108364r.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: b */
    public final C46517n mo78985b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final RecyclerView mo79005c() {
        return (RecyclerView) this.f108363q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$b */
    public static final class C46494b {
        static {
            Covode.recordClassIndex(55079);
        }

        private C46494b() {
        }

        public /* synthetic */ C46494b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: a */
    public final C46514m mo78983a() {
        return this.f108355e;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$c */
    static final class C46495c extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C46492c f108372a;

        static {
            Covode.recordClassIndex(55080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46495c(C46492c cVar) {
            super(0);
            this.f108372a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f108372a.f108227b.findViewById(R.id.au_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$d */
    static final class C46496d extends AbstractC89220m implements AbstractC89171a<SwipeControlledViewPager> {

        /* renamed from: a */
        final /* synthetic */ C46492c f108373a;

        static {
            Covode.recordClassIndex(55081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46496d(C46492c cVar) {
            super(0);
            this.f108373a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SwipeControlledViewPager invoke() {
            return this.f108373a.f108227b.findViewById(R.id.auc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$e */
    static final class C46497e extends AbstractC89220m implements AbstractC89171a<Button> {

        /* renamed from: a */
        final /* synthetic */ C46492c f108374a;

        static {
            Covode.recordClassIndex(55082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46497e(C46492c cVar) {
            super(0);
            this.f108374a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Button invoke() {
            return this.f108374a.f108227b.findViewById(R.id.auf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$f */
    static final class C46498f extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C46492c f108375a;

        static {
            Covode.recordClassIndex(55083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46498f(C46492c cVar) {
            super(0);
            this.f108375a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f108375a.f108227b.findViewById(R.id.aun);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$g */
    static final class C46499g extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C46492c f108376a;

        static {
            Covode.recordClassIndex(55084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46499g(C46492c cVar) {
            super(0);
            this.f108376a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f108376a.f108227b.findViewById(R.id.ff6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$h */
    static final class C46500h extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C46492c f108377a;

        static {
            Covode.recordClassIndex(55085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46500h(C46492c cVar) {
            super(0);
            this.f108377a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f108377a.f108227b.findViewById(R.id.c3z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo79006d() {
        this.f108368v.mo64587a(C46643e.m90037a(this.f108355e, m89740g().getCurrentItem()));
    }

    /* renamed from: e */
    public final void mo79007e() {
        List<C46447a> c;
        C46534a aVar;
        int i;
        int currentItem = m89740g().getCurrentItem();
        int a = C46643e.m90037a(this.f108355e, currentItem);
        if (a == 4 && (c = this.f108355e.mo79029c(currentItem)) != null && !c.isEmpty()) {
            AbstractC46452f fVar = this.f108355e.f108433a;
            Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.gifemoji.GifEmojiType");
            C46462b bVar = (C46462b) fVar;
            for (C46447a aVar2 : c) {
                if (!(aVar2 == null || (aVar = aVar2.f108224d) == null)) {
                    if (aVar.getStaticUrl() != null || aVar.getAnimateUrl() != null) {
                        List<C46534a> list = bVar.f108240b;
                        if (list != null) {
                            i = list.indexOf(aVar);
                        } else {
                            i = -1;
                        }
                        this.f108368v.mo64591b(aVar2, a, i);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo79008f() {
        int g;
        if (this.f108355e.f108433a.mo78975j() == 3) {
            AbstractC46452f fVar = this.f108355e.f108433a;
            C89219l.m154716b(fVar, "");
            if (fVar.mo78976k() == 0) {
                m89741h().setVisibility(4);
                return;
            }
        }
        C46488b bVar = this.f108361o;
        C46514m mVar = this.f108355e;
        if (mVar.f108433a == null) {
            g = 0;
        } else {
            g = mVar.f108433a.mo78972g();
        }
        int a = this.f108355e.mo79025a();
        int j = this.f108355e.f108433a.mo78975j();
        C46489c cVar = bVar.f108342a;
        if (!(cVar.f108343a == g && cVar.f108344b == a && cVar.f108345c == j)) {
            cVar.f108343a = g;
            cVar.f108345c = j;
            cVar.f108346d.clear();
            for (int i = 0; i < g; i++) {
                C46487a aVar = new C46487a();
                if (i == 0 && j == 4) {
                    aVar.f108341b = R.drawable.a7b;
                } else {
                    aVar.f108341b = R.drawable.a79;
                }
                cVar.f108346d.add(aVar);
                if (i == a) {
                    cVar.f108344b = a;
                    cVar.f108346d.get(a).f108340a = true;
                }
            }
            cVar.notifyDataSetChanged();
        }
        m89741h().setVisibility(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$i */
    public static final class C46501i extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ C46492c f108378a;

        static {
            Covode.recordClassIndex(55086);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46501i(C46492c cVar) {
            this.f108378a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
            if (r0.getLeft() < 0) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x018b, code lost:
            if (r0.getRight() > r5.mo79005c().getWidth()) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x018f, code lost:
            if (r3 == false) goto L_0x009e;
         */
        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageSelected(int r9) {
            /*
            // Method dump skipped, instructions count: 412
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46492c.C46501i.onPageSelected(int):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: a */
    public final void mo78984a(int i) {
        int i2;
        this.f108355e.mo79026a(i);
        C46514m mVar = this.f108355e;
        Iterator<AbstractC46452f> it = mVar.f108434b.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = 0;
                break;
            }
            AbstractC46452f next = it.next();
            if (next == mVar.f108433a) {
                i2 = mVar.f108433a.mo78971f() + i3;
                break;
            }
            i3 += next.mo78972g();
        }
        m89740g().setCurrentItem(i2, false);
        if (this.f108358h && i2 == 0) {
            this.f108358h = false;
            mo79006d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$a */
    public static final class C46493a {

        /* renamed from: a */
        public final C46502d f108369a = new C46502d();

        /* renamed from: b */
        public final AbstractC46454h f108370b;

        /* renamed from: c */
        public final ViewGroup f108371c;

        static {
            Covode.recordClassIndex(55078);
        }

        public C46493a(AbstractC46454h hVar, ViewGroup viewGroup) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(viewGroup, "");
            this.f108370b = hVar;
            this.f108371c = viewGroup;
        }
    }

    private C46492c(AbstractC46454h hVar, C46502d dVar, ViewGroup viewGroup) {
        super(viewGroup, R.layout.yw);
        boolean z;
        int i;
        this.f108368v = hVar;
        this.f108360j = dVar;
        this.f108362p = C89250i.m154773a((AbstractC89171a) new C46496d(this));
        this.f108363q = C89250i.m154773a((AbstractC89171a) new C46498f(this));
        this.f108364r = C89250i.m154773a((AbstractC89171a) new C46495c(this));
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) new C46497e(this));
        this.f108365s = a;
        AbstractC89244h a2 = C89250i.m154773a((AbstractC89171a) new C46499g(this));
        this.f108366t = a2;
        AbstractC89244h a3 = C89250i.m154773a((AbstractC89171a) new C46500h(this));
        this.f108367u = a3;
        this.f108359i = C89517an.m155448a(C89546bf.f203266a);
        if (dVar.f108381c) {
            C89219l.m154721d(this, "");
            String str = dVar.f108384f;
            C89219l.m154721d(UGCMonitor.EVENT_COMMENT, "");
            C89219l.m154721d(str, "");
            C46639a.m90020a();
        }
        this.f108355e = new C46514m(dVar);
        C46508h hVar2 = new C46508h(hVar, this, m89740g());
        this.f108353c = hVar2;
        m89740g().setAdapter(hVar2);
        mo79005c().getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f108356f = linearLayoutManager;
        mo79005c().setLayoutManager(linearLayoutManager);
        C46520q qVar = new C46520q(this);
        this.f108354d = qVar;
        mo79005c().setAdapter(qVar);
        this.f108361o = new C46488b(m89741h());
        if (dVar.f108386h.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        View view = (View) a2.getValue();
        C89219l.m154716b(view, "");
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = (View) a3.getValue();
        C89219l.m154716b(view2, "");
        view2.setVisibility(z ? 0 : i2);
        mo79008f();
        m89740g().addOnPageChangeListener(new C46501i(this));
        this.f108358h = true;
        mo78984a(f108351k);
        mo79269a((Button) a.getValue());
    }

    public /* synthetic */ C46492c(AbstractC46454h hVar, C46502d dVar, ViewGroup viewGroup, byte b) {
        this(hVar, dVar, viewGroup);
    }
}
