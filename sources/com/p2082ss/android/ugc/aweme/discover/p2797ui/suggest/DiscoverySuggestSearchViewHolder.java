package com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67677c;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67528bi;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchViewHolder */
public final class DiscoverySuggestSearchViewHolder extends JediSimpleViewHolder<DiscoverSectionItem> implements AbstractC42664al.AbstractC42665a, AbstractC42664al.AbstractC42665a {

    /* renamed from: f */
    public final ArrayList<AbstractC17641a> f100173f = new ArrayList<>();

    /* renamed from: g */
    public SearchEnterViewModel f100174g;

    /* renamed from: j */
    private PowerList f100175j;

    /* renamed from: k */
    private TuxTextView f100176k;

    /* renamed from: l */
    private final AbstractC89244h f100177l;

    /* renamed from: m */
    private final AbstractC89244h f100178m;

    static {
        Covode.recordClassIndex(51089);
    }

    /* renamed from: m */
    private final C42959b m85756m() {
        return (C42959b) this.f100178m.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchViewHolder$c */
    static final class C42960c extends AbstractC89220m implements AbstractC89171a<C42958a> {

        /* renamed from: a */
        public static final C42960c f100181a = new C42960c();

        static {
            Covode.recordClassIndex(51092);
        }

        C42960c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42958a invoke() {
            return new C42958a(C80471gb.m139483a(GlobalContext.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchViewHolder$d */
    static final class C42961d extends AbstractC89220m implements AbstractC89171a<C42959b> {

        /* renamed from: a */
        public static final C42961d f100182a = new C42961d();

        static {
            Covode.recordClassIndex(51093);
        }

        C42961d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42959b invoke() {
            return new C42959b(C80471gb.m139483a(GlobalContext.getContext()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchViewHolder$a */
    public static final class C42958a extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        public final boolean f100179a;

        static {
            Covode.recordClassIndex(51090);
        }

        public C42958a(boolean z) {
            this.f100179a = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            super.getItemOffsets(rect, view, recyclerView, sVar);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            if (((GridLayoutManager.C1336b) layoutParams).f4324a % 2 == 0) {
                if (this.f100179a) {
                    rect.left = (int) C80284by.m139183a(8);
                } else {
                    rect.right = (int) C80284by.m139183a(8);
                }
            }
            if (RecyclerView.m4277d(view) < 2) {
                rect.bottom = (int) C80284by.m139183a(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchViewHolder$b */
    public static final class C42959b extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        public final boolean f100180a;

        static {
            Covode.recordClassIndex(51091);
        }

        public C42959b(boolean z) {
            this.f100180a = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            if (this.f100180a) {
                int d = RecyclerView.m4277d(view);
                if (d == 0) {
                    rect.right = (int) C80284by.m139183a(16);
                } else if (d != 3) {
                    rect.right = (int) C80284by.m139183a(8);
                } else {
                    rect.right = (int) C80284by.m139183a(8);
                    rect.left = (int) C80284by.m139183a(16);
                }
            } else {
                int d2 = RecyclerView.m4277d(view);
                if (d2 == 0) {
                    rect.left = (int) C80284by.m139183a(16);
                } else if (d2 != 3) {
                    rect.left = (int) C80284by.m139183a(8);
                } else {
                    rect.left = (int) C80284by.m139183a(8);
                    rect.right = (int) C80284by.m139183a(16);
                }
            }
        }
    }

    /* renamed from: a */
    private void m85752a(RecyclerView.AbstractC1361h hVar) {
        C89219l.m154721d(hVar, "");
        while (this.f100175j.getItemDecorationCount() > 0) {
            this.f100175j.mo4448e();
        }
        this.f100175j.mo4402a(hVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r0 == null) goto L_0x004b;
     */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo33817a(com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem r10) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest.DiscoverySuggestSearchViewHolder.mo33817a(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoverySuggestSearchViewHolder(View view, ActivityC0945e eVar) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.ebf);
        C89219l.m154716b(findViewById, "");
        this.f100175j = (PowerList) findViewById;
        View findViewById2 = view.findViewById(R.id.alw);
        C89219l.m154716b(findViewById2, "");
        this.f100176k = (TuxTextView) findViewById2;
        this.f100175j.setItemAnimator(null);
        this.f100175j.mo28083a(DiscoverySuggestSearchSingleLineCell.class, DiscoverySuggestSearchBreakLineCell.class);
        this.f100174g = SearchEnterViewModel.C42997a.m85830a(eVar);
        this.f100177l = C89250i.m154773a((AbstractC89171a) C42960c.f100181a);
        this.f100178m = C89250i.m154773a((AbstractC89171a) C42961d.f100182a);
    }

    /* renamed from: a */
    private void m85753a(List<Word> list, boolean z) {
        int i;
        TuxTextView tuxTextView = this.f100176k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C34729o.m70955a(tuxTextView, i);
        m85752a((RecyclerView.AbstractC1361h) m85756m());
        C23163i.m43668b(this.f100175j, 0, 0, 0, Integer.valueOf((int) C80284by.m139183a(8)), false, 16);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        this.f100175j.setLayoutManager(linearLayoutManager);
        this.f100175j.getState().mo28128a();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f100175j.getState().mo28132a(new C42963b(it.next(), 0, this));
            }
        }
    }

    /* renamed from: b */
    private void m85754b(List<Word> list, boolean z) {
        int i;
        int a;
        TuxTextView tuxTextView = this.f100176k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C34729o.m70955a(tuxTextView, i);
        m85752a((RecyclerView.AbstractC1361h) m85756m());
        PowerList powerList = this.f100175j;
        if (z) {
            a = 0;
        } else {
            a = (int) C80284by.m139183a(4);
        }
        C23163i.m43668b(powerList, 0, Integer.valueOf(a), 0, Integer.valueOf((int) C80284by.m139183a(12)), false, 16);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        this.f100175j.setLayoutManager(linearLayoutManager);
        this.f100175j.getState().mo28128a();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f100175j.getState().mo28132a(new C42962a(it.next(), this));
            }
        }
    }

    /* renamed from: c */
    private void m85755c(List<Word> list, boolean z) {
        int i;
        TuxTextView tuxTextView = this.f100176k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C34729o.m70955a(tuxTextView, i);
        m85752a((RecyclerView.AbstractC1361h) ((C42958a) this.f100177l.getValue()));
        C23163i.m43668b(this.f100175j, Integer.valueOf((int) C80284by.m139183a(16)), 0, Integer.valueOf((int) C80284by.m139183a(16)), Integer.valueOf((int) C80284by.m139183a(8)), false, 16);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.getContext();
        this.f100175j.setLayoutManager(new GridLayoutManager(2));
        this.f100175j.getState().mo28128a();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f100175j.getState().mo28132a(new C42963b(it.next(), 1, this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42665a
    /* renamed from: a */
    public final void mo72860a(int i, Word word) {
        C67674b bVar;
        if (word != null) {
            C67678d wordType = new C67678d().setSearchFrom("recom_search").setKeyword(word.getWord()).setWordType(word.getWordType());
            SearchEnterViewModel searchEnterViewModel = this.f100174g;
            if (searchEnterViewModel != null) {
                bVar = searchEnterViewModel.f100248a;
                if (bVar != null) {
                    bVar.setFromDiscoverSuggestSearch(true);
                }
            } else {
                bVar = null;
            }
            C67446h hVar = C67446h.f151111a;
            View view = this.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(wordType, "");
            hVar.mo106201a(new C67677c(context, wordType, bVar));
            C89219l.m154721d(word, "");
            ((C67540c) ((C67530bj) new C67528bi().mo106474v("recom_search").mo106471d(Integer.valueOf(i)).mo106476x("").mo106475w(word.getWord()).mo106479a((Integer) -1)).mo106477y("discovery").mo106453i(word.getId())).mo106484d(word.getImplId()).mo96792f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42665a
    /* renamed from: b */
    public final void mo72861b(int i, Word word) {
        if (word != null) {
            C89219l.m154721d(word, "");
            ((C67540c) ((C67530bj) new C67532bk().mo106474v("recom_search").mo106471d(Integer.valueOf(i)).mo106476x("").mo106475w(word.getWord()).mo106479a((Integer) -1)).mo106477y("discovery").mo106453i(word.getId())).mo106484d(word.getImplId()).mo96792f();
        }
    }
}
