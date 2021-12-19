package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2805b;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.view.ScrollToEndRecyclerView;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67526bh;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67528bi;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.utils.C80372ec;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b */
public final class C42724b extends FrameLayout {

    /* renamed from: a */
    SparseArray f99664a;

    /* renamed from: b */
    private final AbstractC89244h f99665b;

    /* renamed from: c */
    private final AbstractC89244h f99666c;

    /* renamed from: d */
    private final AbstractC89244h f99667d;

    /* renamed from: e */
    private final AbstractC89244h f99668e;

    /* renamed from: f */
    private String f99669f;

    /* renamed from: g */
    private String f99670g;

    /* renamed from: h */
    private String f99671h;

    /* renamed from: i */
    private AbstractC42740c f99672i;

    static {
        Covode.recordClassIndex(50828);
    }

    private final C42725a getAdapter() {
        return (C42725a) this.f99666c.getValue();
    }

    private final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.f99667d.getValue();
    }

    public final HashSet<GuideSearchWord> getAlreadyMobWords() {
        return (HashSet) this.f99668e.getValue();
    }

    public final int getJsFilterId() {
        return R.layout.aws;
    }

    public final ScrollToEndRecyclerView getListView() {
        return (ScrollToEndRecyclerView) this.f99665b.getValue();
    }

    public final AbstractC42740c getItemClickListener() {
        return this.f99672i;
    }

    /* access modifiers changed from: protected */
    public final String getOriginalKeyword() {
        return this.f99670g;
    }

    /* access modifiers changed from: protected */
    public final String getOriginalSearchId() {
        return this.f99671h;
    }

    /* access modifiers changed from: protected */
    public final String getSearchLabel() {
        return this.f99669f;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$d */
    static final class C42733d extends AbstractC89220m implements AbstractC89171a<C42725a> {

        /* renamed from: a */
        final /* synthetic */ C42724b f99689a;

        static {
            Covode.recordClassIndex(50837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42733d(C42724b bVar) {
            super(0);
            this.f99689a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42725a invoke() {
            return new C42725a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$e */
    static final class C42734e extends AbstractC89220m implements AbstractC89171a<HashSet<GuideSearchWord>> {

        /* renamed from: a */
        public static final C42734e f99690a = new C42734e();

        static {
            Covode.recordClassIndex(50838);
        }

        C42734e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<GuideSearchWord> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$f */
    static final class C42735f extends AbstractC89220m implements AbstractC89171a<LinearLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ Context f99691a;

        static {
            Covode.recordClassIndex(50839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42735f(Context context) {
            super(0);
            this.f99691a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayoutManager invoke() {
            return new LinearLayoutManager(0, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$a */
    public final class C42725a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

        /* renamed from: a */
        public List<GuideSearchWord> f99673a;

        static {
            Covode.recordClassIndex(50829);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m85383a(viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            List<GuideSearchWord> list = this.f99673a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C42725a() {
        }

        /* renamed from: a */
        public final void mo73005a(List<GuideSearchWord> list) {
            this.f99673a = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            List<GuideSearchWord> list;
            C89219l.m154721d(viewHolder, "");
            GuideSearchWord guideSearchWord = ((C42727b) viewHolder).f99678a;
            if (guideSearchWord != null && (list = this.f99673a) != null) {
                int indexOf = list.indexOf(guideSearchWord);
                if (!C42724b.this.getAlreadyMobWords().contains(guideSearchWord)) {
                    C42724b.this.getAlreadyMobWords().add(guideSearchWord);
                    C1731i.m5640b(new CallableC42739j(C42724b.this, guideSearchWord, indexOf), C1731i.f5562a);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$a$a */
        static final class View$OnClickListenerC42726a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42725a f99675a;

            /* renamed from: b */
            final /* synthetic */ int f99676b;

            /* renamed from: c */
            final /* synthetic */ RecyclerView.ViewHolder f99677c;

            static {
                Covode.recordClassIndex(50830);
            }

            View$OnClickListenerC42726a(C42725a aVar, int i, RecyclerView.ViewHolder viewHolder) {
                this.f99675a = aVar;
                this.f99676b = i;
                this.f99677c = viewHolder;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                List<GuideSearchWord> list = this.f99675a.f99673a;
                if (list == null) {
                    C89219l.m154715b();
                }
                int i = 0;
                for (T t : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (t2.getSelected() && i != this.f99676b) {
                        t2.setSelected(false);
                        this.f99675a.notifyItemChanged(i);
                    }
                    i = i2;
                }
                C42725a aVar = this.f99675a;
                String str = "";
                C89219l.m154716b(view, str);
                ScrollToEndRecyclerView listView = C42724b.this.getListView();
                C89219l.m154716b(listView, str);
                C42724b.this.getListView().mo4395a((int) ((view.getX() + (((float) view.getWidth()) * 0.5f)) - (((float) listView.getWidth()) * 0.5f)), 0);
                List<GuideSearchWord> list2 = this.f99675a.f99673a;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                GuideSearchWord guideSearchWord = list2.get(this.f99676b);
                boolean selected = guideSearchWord.getSelected();
                if (selected) {
                    C42724b bVar = C42724b.this;
                    String originalKeyword = C42724b.this.getOriginalKeyword();
                    if (originalKeyword == null) {
                        originalKeyword = str;
                    }
                    String originalKeyword2 = C42724b.this.getOriginalKeyword();
                    if (originalKeyword2 != null) {
                        str = originalKeyword2;
                    }
                    bVar.mo72992a(originalKeyword, str, true);
                    C42724b bVar2 = C42724b.this;
                    List<GuideSearchWord> list3 = this.f99675a.f99673a;
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    bVar2.mo72991a(list3.get(this.f99676b), this.f99676b, "cancel");
                } else {
                    C42724b bVar3 = C42724b.this;
                    String originalKeyword3 = C42724b.this.getOriginalKeyword();
                    if (originalKeyword3 == null) {
                        originalKeyword3 = str;
                    }
                    String displayQuery = guideSearchWord.getDisplayQuery();
                    if (displayQuery != null) {
                        str = displayQuery;
                    }
                    bVar3.mo72992a(originalKeyword3, str, false);
                    C42724b bVar4 = C42724b.this;
                    List<GuideSearchWord> list4 = this.f99675a.f99673a;
                    if (list4 == null) {
                        C89219l.m154715b();
                    }
                    bVar4.mo72991a(list4.get(this.f99676b), this.f99676b, "enter");
                }
                guideSearchWord.setSelected(!selected);
                RecyclerView.ViewHolder viewHolder = this.f99677c;
                Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.guide.GuideSearchHeadView.GuideSearchViewHolder");
                C42727b bVar5 = (C42727b) viewHolder;
                List<GuideSearchWord> list5 = this.f99675a.f99673a;
                if (list5 == null) {
                    C89219l.m154715b();
                }
                bVar5.mo73007a(list5.get(this.f99676b));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            C89219l.m154721d(viewHolder, "");
            C42727b bVar = (C42727b) viewHolder;
            List<GuideSearchWord> list = this.f99673a;
            if (list == null) {
                C89219l.m154715b();
            }
            bVar.mo73007a(list.get(i));
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC42726a(this, i, viewHolder));
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m85383a(ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(6563);
            C89219l.m154721d(viewGroup, "");
            C42727b bVar = new C42727b(C67641m.m119786a(viewGroup, R.layout.aun));
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = bVar.getClass().getName();
            MethodCollector.m26664o(6563);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b */
    public static final class C42727b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public GuideSearchWord f99678a;

        /* renamed from: b */
        private final AbstractC89244h f99679b;

        /* renamed from: c */
        private final AbstractC89244h f99680c;

        /* renamed from: d */
        private final AbstractC89244h f99681d;

        /* renamed from: e */
        private final AbstractC89244h f99682e;

        static {
            Covode.recordClassIndex(50831);
        }

        /* renamed from: a */
        private final int m85385a() {
            return ((Number) this.f99679b.getValue()).intValue();
        }

        /* renamed from: b */
        private final int m85386b() {
            return ((Number) this.f99680c.getValue()).intValue();
        }

        /* renamed from: c */
        private final Drawable m85387c() {
            return (Drawable) this.f99681d.getValue();
        }

        /* renamed from: d */
        private final Drawable m85388d() {
            return (Drawable) this.f99682e.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b$a */
        static final class C42728a extends AbstractC89220m implements AbstractC89171a<Drawable> {

            /* renamed from: a */
            final /* synthetic */ View f99683a;

            static {
                Covode.recordClassIndex(50832);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C42728a(View view) {
                super(0);
                this.f99683a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Drawable invoke() {
                Context context = this.f99683a.getContext();
                C89219l.m154716b(context, "");
                return context.getResources().getDrawable(R.drawable.bcl);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b$b */
        static final class C42729b extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            final /* synthetic */ View f99684a;

            static {
                Covode.recordClassIndex(50833);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C42729b(View view) {
                super(0);
                this.f99684a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                Context context = this.f99684a.getContext();
                C89219l.m154716b(context, "");
                return Integer.valueOf(context.getResources().getColor(R.color.bh));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b$c */
        static final class C42730c extends AbstractC89220m implements AbstractC89171a<Drawable> {

            /* renamed from: a */
            final /* synthetic */ View f99685a;

            static {
                Covode.recordClassIndex(50834);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C42730c(View view) {
                super(0);
                this.f99685a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Drawable invoke() {
                Context context = this.f99685a.getContext();
                C89219l.m154716b(context, "");
                return context.getResources().getDrawable(R.drawable.bcm);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b$d */
        static final class C42731d extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            final /* synthetic */ View f99686a;

            static {
                Covode.recordClassIndex(50835);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C42731d(View view) {
                super(0);
                this.f99686a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                Context context = this.f99686a.getContext();
                C89219l.m154716b(context, "");
                return Integer.valueOf(context.getResources().getColor(R.color.c4));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42727b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f99679b = C80372ec.m139350a(new C42729b(view));
            this.f99680c = C80372ec.m139350a(new C42731d(view));
            this.f99681d = C80372ec.m139350a(new C42730c(view));
            this.f99682e = C80372ec.m139350a(new C42728a(view));
        }

        /* renamed from: a */
        public final void mo73007a(GuideSearchWord guideSearchWord) {
            C89219l.m154721d(guideSearchWord, "");
            this.f99678a = guideSearchWord;
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            ((TuxTextView) view).setText(guideSearchWord.getGsQuery());
            if (guideSearchWord.getSelected()) {
                ((TuxTextView) this.itemView).setTextColor(m85385a());
                this.itemView.setBackground(m85388d());
                return;
            }
            ((TuxTextView) this.itemView).setTextColor(m85386b());
            this.itemView.setBackground(m85387c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$g */
    static final class C42736g extends AbstractC89220m implements AbstractC89171a<ScrollToEndRecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C42724b f99692a;

        static {
            Covode.recordClassIndex(50840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42736g(C42724b bVar) {
            super(0);
            this.f99692a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ScrollToEndRecyclerView invoke() {
            C42724b bVar = this.f99692a;
            if (bVar.f99664a == null) {
                bVar.f99664a = new SparseArray();
            }
            View view = (View) bVar.f99664a.get(R.id.dgw);
            if (view != null) {
                return view;
            }
            View findViewById = bVar.findViewById(R.id.dgw);
            bVar.f99664a.put(R.id.dgw, findViewById);
            return findViewById;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$h */
    public static final class CallableC42737h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42724b f99693a;

        /* renamed from: b */
        final /* synthetic */ GuideSearchWord f99694b;

        /* renamed from: c */
        final /* synthetic */ int f99695c;

        /* renamed from: d */
        final /* synthetic */ String f99696d;

        static {
            Covode.recordClassIndex(50841);
        }

        CallableC42737h(C42724b bVar, GuideSearchWord guideSearchWord, int i, String str) {
            this.f99693a = bVar;
            this.f99694b = guideSearchWord;
            this.f99695c = i;
            this.f99696d = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            C67469ad c;
            AbstractC67567q a = C67486am.m119564a();
            if (a == null || (c = a.mo106431c()) == null || (str = c.f151151a) == null) {
                str = "";
            }
            C67540c a2 = ((C67530bj) ((C67530bj) new C67528bi().mo106453i(this.f99694b.getId())).mo106478z(this.f99694b.getQueryId()).mo106474v("guide_search").mo106471d(Integer.valueOf(this.f99695c)).mo106475w(this.f99694b.getDisplayQuery()).mo106467D(this.f99694b.getGsQuery()).mo106466C(this.f99694b.getDisplayQuery()).mo106476x(this.f99693a.getOriginalKeyword()).mo106480a(str).mo106484d(str).mo106483c(C48027ac.C48028a.f111257a.mo80057b(str))).mo106477y(this.f99693a.getSearchLabel()).mo106479a((Integer) -1);
            a2.mo106452c(C67528bi.f151232b, this.f99696d);
            a2.mo96792f();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$i */
    public static final class CallableC42738i<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42724b f99697a;

        /* renamed from: b */
        final /* synthetic */ List f99698b;

        /* renamed from: c */
        final /* synthetic */ Context f99699c;

        static {
            Covode.recordClassIndex(50842);
        }

        CallableC42738i(C42724b bVar, List list, Context context) {
            this.f99697a = bVar;
            this.f99698b = list;
            this.f99699c = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            C67530bj c = new C67526bh().mo106474v("guide_search").mo106470c(Integer.valueOf(this.f99698b.size()));
            GuideSearchWord guideSearchWord = (GuideSearchWord) C89070n.m154583g(this.f99698b);
            if (guideSearchWord != null) {
                str = guideSearchWord.getQueryId();
            } else {
                str = null;
            }
            C67530bj y = ((C67530bj) c.mo106478z(str).mo106476x(this.f99697a.getOriginalKeyword()).mo106480a(this.f99697a.getOriginalSearchId()).mo106484d(this.f99697a.getOriginalSearchId()).mo106483c(C48027ac.C48028a.f111257a.mo80057b(this.f99697a.getOriginalSearchId()))).mo106477y(this.f99697a.getSearchLabel());
            Context context = this.f99699c;
            if (context instanceof ActivityC0945e) {
                y.mo106469a(SearchEnterViewModel.C42997a.m85830a((ActivityC0945e) context).mo73185b().obtainLogData("tab_name"));
            }
            y.mo106479a((Integer) -1).mo96792f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$j */
    static final class CallableC42739j<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42724b f99700a;

        /* renamed from: b */
        final /* synthetic */ GuideSearchWord f99701b;

        /* renamed from: c */
        final /* synthetic */ int f99702c;

        static {
            Covode.recordClassIndex(50843);
        }

        CallableC42739j(C42724b bVar, GuideSearchWord guideSearchWord, int i) {
            this.f99700a = bVar;
            this.f99701b = guideSearchWord;
            this.f99702c = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ((C67530bj) ((C67530bj) new C67532bk().mo106453i(this.f99701b.getId())).mo106478z(this.f99701b.getQueryId()).mo106474v("guide_search").mo106471d(Integer.valueOf(this.f99702c)).mo106475w(this.f99701b.getDisplayQuery()).mo106467D(this.f99701b.getGsQuery()).mo106466C(this.f99701b.getDisplayQuery()).mo106476x(this.f99700a.getOriginalKeyword()).mo106480a(this.f99700a.getOriginalSearchId()).mo106484d(this.f99700a.getOriginalSearchId()).mo106483c(C48027ac.C48028a.f111257a.mo80057b(this.f99700a.getOriginalSearchId()))).mo106477y(this.f99700a.getSearchLabel()).mo106479a((Integer) -1).mo96792f();
            return C89391z.f203057a;
        }
    }

    public final void setItemClickListener(AbstractC42740c cVar) {
        this.f99672i = cVar;
    }

    /* access modifiers changed from: protected */
    public final void setOriginalKeyword(String str) {
        this.f99670g = str;
    }

    /* access modifiers changed from: protected */
    public final void setOriginalSearchId(String str) {
        this.f99671h = str;
    }

    /* access modifiers changed from: protected */
    public final void setSearchLabel(String str) {
        this.f99669f = str;
    }

    /* renamed from: a */
    private final void m85379a(List<GuideSearchWord> list) {
        C1731i.m5640b(new CallableC42738i(this, list, getContext()), C1731i.f5562a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C42724b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6576);
        this.f99665b = C80372ec.m139350a(new C42736g(this));
        this.f99666c = C80372ec.m139350a(new C42733d(this));
        this.f99667d = C80372ec.m139350a(new C42735f(context));
        this.f99668e = C80372ec.m139350a(C42734e.f99690a);
        C1764a.m5927a(LayoutInflater.from(context), getJsFilterId(), this, true);
        ScrollToEndRecyclerView listView = getListView();
        C89219l.m154716b(listView, "");
        listView.setLayoutManager(getLayoutManager());
        ScrollToEndRecyclerView listView2 = getListView();
        C89219l.m154716b(listView2, "");
        listView2.setAdapter(getAdapter());
        getListView().mo4415b(new C42732c((int) C13628n.m24520b(getContext(), 8.0f), (int) C13628n.m24520b(getContext(), 16.0f)));
        MethodCollector.m26664o(6576);
    }

    public /* synthetic */ C42724b(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$c */
    public static final class C42732c extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        private final int f99687a;

        /* renamed from: b */
        private final int f99688b;

        static {
            Covode.recordClassIndex(50836);
        }

        public C42732c(int i, int i2) {
            this.f99687a = i;
            this.f99688b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            int d = RecyclerView.m4277d(view);
            if (C80471gb.m139482a()) {
                if (d == 0) {
                    rect.right = this.f99688b;
                }
                rect.left = this.f99687a;
                return;
            }
            if (d == 0) {
                rect.left = this.f99688b;
            }
            rect.right = this.f99687a;
        }
    }

    /* renamed from: a */
    public final void mo72991a(GuideSearchWord guideSearchWord, int i, String str) {
        C1731i.m5640b(new CallableC42737h(this, guideSearchWord, i, str), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo72992a(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC42740c cVar = this.f99672i;
        if (cVar != null) {
            cVar.mo72916a(str, str2, z);
        }
    }

    /* renamed from: a */
    public final void mo72993a(List<GuideSearchWord> list, String str, String str2, String str3) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        setVisibility(0);
        getAdapter().mo73005a(list);
        getListView().mo4413b(0);
        getAlreadyMobWords().clear();
        this.f99670g = str;
        this.f99671h = str3;
        this.f99669f = str2;
        if (!C13603b.m24435a((Collection) list)) {
            m85379a(list);
        }
    }
}
