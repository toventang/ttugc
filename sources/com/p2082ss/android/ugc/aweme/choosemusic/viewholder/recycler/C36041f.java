package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1392ac;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36030a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36034b;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.f */
public final class C36041f extends C33937a {

    /* renamed from: k */
    public static final AbstractC89244h f85130k = C89250i.m154773a((AbstractC89171a) C36044b.f85149a);

    /* renamed from: l */
    public static final C36043a f85131l = new C36043a((byte) 0);

    /* renamed from: b */
    final RecyclerView f85132b;

    /* renamed from: c */
    public final C36045c f85133c;

    /* renamed from: d */
    public AbstractC35989s f85134d;

    /* renamed from: e */
    public ViewPager.AbstractC1579e f85135e;

    /* renamed from: f */
    public AbstractC60731k<C35757c> f85136f;

    /* renamed from: g */
    public boolean f85137g;

    /* renamed from: h */
    public int f85138h;

    /* renamed from: i */
    public int f85139i;

    /* renamed from: j */
    public C35754b f85140j;

    /* renamed from: m */
    private final View f85141m;

    /* renamed from: n */
    private final TextView f85142n;

    /* renamed from: o */
    private final TuxTextView f85143o;

    /* renamed from: p */
    private final AbstractC1392ac f85144p;

    /* renamed from: q */
    private final AbstractC36039d f85145q;

    /* renamed from: r */
    private final View f85146r;

    /* renamed from: s */
    private final int f85147s;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.f$a */
    public static final class C36043a {
        static {
            Covode.recordClassIndex(43291);
        }

        /* renamed from: a */
        public static int m73481a() {
            return ((Number) C36041f.f85130k.getValue()).intValue();
        }

        private C36043a() {
        }

        public /* synthetic */ C36043a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.f$c */
    public final class C36045c extends RecyclerView.AbstractC1350a<C36050s> {

        /* renamed from: a */
        public final int f85150a;

        /* renamed from: c */
        private List<C36038c> f85152c = new ArrayList();

        static {
            Covode.recordClassIndex(43293);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C36050s onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m73482a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f85152c.size();
        }

        /* renamed from: a */
        public final C36038c mo63207a(int i) {
            return (C36038c) C89070n.m154561b((List) this.f85152c, i);
        }

        /* renamed from: a */
        public final void mo63209a(List<? extends MusicModel> list) {
            this.f85152c.clear();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.f85152c.add(new C36038c(it.next()));
                }
            }
            C36038c cVar = (C36038c) C89070n.m154561b((List) this.f85152c, C36041f.this.f85139i);
            if (cVar != null) {
                C36041f.this.f85133c.mo63208a(C36041f.this.f85139i, C36038c.m73465a(cVar, null, null, AbstractC36034b.C36036b.f85122a, 3));
            }
        }

        public C36045c(int i) {
            this.f85150a = i;
        }

        /* renamed from: a */
        public final void mo63208a(int i, C36038c cVar) {
            C89219l.m154721d(cVar, "");
            this.f85152c.set(i, cVar);
            notifyItemChanged(i, cVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C36050s sVar, int i) {
            C36050s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            C36038c cVar = this.f85152c.get(i);
            sVar2.mo63154a(cVar.f85124a, C36041f.this.f85137g, false, C89219l.m154714a(cVar.f85126c, AbstractC36034b.C36036b.f85122a), C36041f.this.f85138h, i, C36041f.this.f85140j);
            sVar2.mo63153a(C36041f.this.f85134d, C36041f.this.f85136f);
            m73483a(sVar2, cVar);
        }

        /* renamed from: a */
        private static void m73483a(C36050s sVar, C36038c cVar) {
            Boolean bool;
            AbstractC36030a aVar = cVar.f85125b;
            Boolean bool2 = null;
            if (C89219l.m154714a(aVar, AbstractC36030a.C36032b.f85119a)) {
                bool = true;
            } else if (C89219l.m154714a(aVar, AbstractC36030a.C36031a.f85118a)) {
                bool = false;
            } else if (C89219l.m154714a(aVar, AbstractC36030a.C36033c.f85120a)) {
                bool = null;
            } else {
                throw new C89376n();
            }
            AbstractC36034b bVar = cVar.f85126c;
            if (C89219l.m154714a(bVar, AbstractC36034b.C36036b.f85122a)) {
                bool2 = true;
            } else if (C89219l.m154714a(bVar, AbstractC36034b.C36035a.f85121a)) {
                bool2 = false;
            } else if (!C89219l.m154714a(bVar, AbstractC36034b.C36037c.f85123a)) {
                throw new C89376n();
            }
            if (bool != null && bool2 != null) {
                sVar.mo63155a(bool.booleanValue(), bool2.booleanValue());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C36050s sVar, int i, List list) {
            C36050s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            C89219l.m154721d(list, "");
            if (list.isEmpty()) {
                super.onBindViewHolder(sVar2, i, list);
            } else {
                m73483a(sVar2, this.f85152c.get(i));
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m73482a(C36045c cVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(4464);
            C89219l.m154721d(viewGroup, "");
            C36050s sVar = new C36050s(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_t, viewGroup, false), cVar.f85150a);
            try {
                if (sVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(sVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) sVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(sVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = sVar.getClass().getName();
            MethodCollector.m26664o(4464);
            return sVar;
        }
    }

    /* renamed from: a */
    public final void mo63201a() {
        this.f85141m.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo63205b() {
        this.f85141m.setVisibility(4);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.f$b */
    static final class C36044b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C36044b f85149a = new C36044b();

        static {
            Covode.recordClassIndex(43292);
        }

        C36044b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(C17867d.m33078a(), 84.0f));
        }
    }

    static {
        Covode.recordClassIndex(43289);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.f$d */
    public static final class C36046d implements AbstractC36039d {

        /* renamed from: a */
        final /* synthetic */ C36041f f85153a;

        static {
            Covode.recordClassIndex(43294);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36046d(C36041f fVar) {
            this.f85153a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36039d
        /* renamed from: a */
        public final void mo63198a(int i) {
            ViewPager.AbstractC1579e eVar = this.f85153a.f85135e;
            if (eVar != null) {
                eVar.onPageSelected(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36039d
        /* renamed from: a */
        public final void mo63199a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            ViewPager.AbstractC1579e eVar = this.f85153a.f85135e;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36039d
        /* renamed from: a */
        public final void mo63200a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            ViewPager.AbstractC1579e eVar = this.f85153a.f85135e;
            if (eVar != null) {
                eVar.onPageScrolled(i, 0.0f, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo63203a(AbstractC35989s sVar, AbstractC60731k<C35757c> kVar) {
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(kVar, "");
        this.f85134d = sVar;
        this.f85136f = kVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36041f(View view, int i) {
        super(view);
        C89219l.m154721d(view, "");
        this.f85146r = view;
        this.f85147s = i;
        View findViewById = view.findViewById(R.id.fh5);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f85132b = recyclerView;
        View findViewById2 = view.findViewById(R.id.amb);
        C89219l.m154716b(findViewById2, "");
        this.f85141m = findViewById2;
        View findViewById3 = view.findViewById(R.id.f65);
        C89219l.m154716b(findViewById3, "");
        this.f85142n = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f67);
        C89219l.m154716b(findViewById4, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById4;
        this.f85143o = tuxTextView;
        C36046d dVar = new C36046d(this);
        this.f85145q = dVar;
        view.getContext();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 0);
        wrapGridLayoutManager.f4345u = 4;
        wrapGridLayoutManager.f4342r = true;
        wrapGridLayoutManager.mo4357b(C80471gb.m139483a(view.getContext()));
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        C36045c cVar = new C36045c(i);
        this.f85133c = cVar;
        recyclerView.setAdapter(cVar);
        C36040e eVar = new C36040e();
        eVar.mo4857a(recyclerView);
        this.f85144p = eVar;
        recyclerView.setRecycledViewPool(MusicRecyclerViewPoolViewModel.C36027a.m73455a(view.getContext()));
        recyclerView.mo4405a(new C36049i(eVar, dVar));
        recyclerView.setNestedScrollingEnabled(false);
        tuxTextView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.C36041f.View$OnClickListenerC360421 */

            /* renamed from: a */
            final /* synthetic */ C36041f f85148a;

            static {
                Covode.recordClassIndex(43290);
            }

            {
                this.f85148a = r1;
            }

            public final void onClick(View view) {
                AbstractC35989s sVar;
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200) && (sVar = this.f85148a.f85134d) != null) {
                    sVar.mo62753a(null, view, null, 0);
                }
            }
        });
        tuxTextView.setTuxFont(62);
    }

    /* renamed from: a */
    public final void mo63202a(int i, int i2, boolean[] zArr, boolean[] zArr2) {
        C89219l.m154721d(zArr, "");
        C89219l.m154721d(zArr2, "");
        int length = zArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f85132b.getTop() + (C36043a.m73481a() * i3) > i2 || this.f85132b.getTop() + ((i3 + 1) * C36043a.m73481a()) < i) {
                zArr[i3] = false;
                zArr2[i3] = false;
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                zArr2[i3] = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo63204a(MusicCollectionItem musicCollectionItem, List<? extends MusicModel> list, int i, int i2, int i3, C35754b bVar, boolean z) {
        boolean z2;
        C89219l.m154721d(musicCollectionItem, "");
        C89219l.m154721d(bVar, "");
        this.f85142n.setText(musicCollectionItem.mcName);
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f85132b.getLayoutParams().height = C36043a.m73481a() * C89271h.m154772c(3, list.size());
            RecyclerView.AbstractC1362i layoutManager = this.f85132b.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.WrapGridLayoutManager");
            ((GridLayoutManager) layoutManager).mo4318a(C89271h.m154772c(3, list.size()));
        }
        this.f85137g = z;
        this.f85138h = i3;
        this.f85139i = i2;
        this.f85140j = bVar;
        this.f85133c.mo63209a(list);
        this.f85133c.notifyDataSetChanged();
        RecyclerView.AbstractC1362i layoutManager2 = this.f85132b.getLayoutManager();
        Objects.requireNonNull(layoutManager2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.WrapGridLayoutManager");
        ((LinearLayoutManager) layoutManager2).mo4347a(i, 0);
    }
}
