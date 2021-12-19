package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.j */
public final class C41782j extends RecyclerView.ViewHolder {

    /* renamed from: d */
    public static final C41783a f97459d = new C41783a((byte) 0);

    /* renamed from: a */
    public final AbstractC42664al.AbstractC42668d f97460a;

    /* renamed from: b */
    public final SearchIntermediateViewModel f97461b;

    /* renamed from: c */
    public final Fragment f97462c;

    /* renamed from: e */
    private final AbstractC89244h f97463e = C89250i.m154773a((AbstractC89171a) new C41785c(this));

    /* renamed from: f */
    private final AbstractC89244h f97464f = C89250i.m154773a((AbstractC89171a) C41784b.f97465a);

    static {
        Covode.recordClassIndex(49697);
    }

    /* renamed from: a */
    private final C41788l m83736a() {
        return (C41788l) this.f97464f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.j$a */
    public static final class C41783a {
        static {
            Covode.recordClassIndex(49698);
        }

        private C41783a() {
        }

        public /* synthetic */ C41783a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.j$b */
    static final class C41784b extends AbstractC89220m implements AbstractC89171a<C41788l> {

        /* renamed from: a */
        public static final C41784b f97465a = new C41784b();

        static {
            Covode.recordClassIndex(49699);
        }

        C41784b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41788l invoke() {
            return new C41788l((int) C80284by.m139183a(17), C80471gb.m139483a(GlobalContext.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.j$c */
    static final class C41785c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C41782j f97466a;

        static {
            Covode.recordClassIndex(49700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41785c(C41782j jVar) {
            super(0);
            this.f97466a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            C33943c<C67678d> openSearchParam;
            C67678d value;
            C67674b searchEnterParam;
            String enterSearchFrom;
            SearchIntermediateViewModel searchIntermediateViewModel = this.f97466a.f97461b;
            if (searchIntermediateViewModel == null || (openSearchParam = searchIntermediateViewModel.getOpenSearchParam()) == null || (value = openSearchParam.getValue()) == null || (searchEnterParam = value.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) == null) {
                return "";
            }
            return enterSearchFrom;
        }
    }

    /* renamed from: a */
    private static boolean m83737a(List<Word> list) {
        float b = (((float) C34723i.m70928b(GlobalContext.getContext())) - C80284by.m139183a(49)) / 2.0f;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(C80284by.m139183a(15));
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (textPaint.measureText(it.next().getWord()) > b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70946a(TypeWords typeWords) {
        List list;
        C89219l.m154721d(typeWords, "");
        List<Word> list2 = typeWords.words;
        boolean z = true;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (!TextUtils.isEmpty(t.getWord())) {
                    arrayList.add(t);
                }
            }
            list = C89070n.m154585g((Collection) arrayList);
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(8);
        } else {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view2.setVisibility(0);
        }
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.f52);
        C89219l.m154716b(tuxTextView, "");
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            Typeface a = C17300a.m32029a().mo27610a(C17303d.f41573g);
            if (a != null) {
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                ((TuxTextView) view4.findViewById(R.id.f52)).setTypeface(a);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = (int) C80284by.m139183a(8);
                marginLayoutParams.bottomMargin = (int) C80284by.m139183a(12);
            }
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.f52);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setLayoutParams(layoutParams);
        }
        View view6 = this.itemView;
        C89219l.m154716b(view6, "");
        RecyclerView recyclerView = (RecyclerView) view6.findViewById(R.id.ebh);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(0);
        boolean a2 = m83737a(list);
        if (a2) {
            m83736a().f97468a = (int) C80284by.m139183a(12);
        } else {
            m83736a().f97468a = 0;
        }
        View view7 = this.itemView;
        C89219l.m154716b(view7, "");
        ((RecyclerView) view7.findViewById(R.id.ebh)).mo4425c(m83736a());
        View view8 = this.itemView;
        C89219l.m154716b(view8, "");
        ((RecyclerView) view8.findViewById(R.id.ebh)).mo4415b(m83736a());
        View view9 = this.itemView;
        C89219l.m154716b(view9, "");
        RecyclerView recyclerView2 = (RecyclerView) view9.findViewById(R.id.ebh);
        C89219l.m154716b(recyclerView2, "");
        View view10 = this.itemView;
        C89219l.m154716b(view10, "");
        view10.getContext();
        recyclerView2.setLayoutManager(new GridLayoutManager(2));
        C41789m mVar = new C41789m(this.f97460a, typeWords.imprId, this.f97461b, this.f97462c);
        mVar.mo67829d(false);
        View view11 = this.itemView;
        C89219l.m154716b(view11, "");
        RecyclerView recyclerView3 = (RecyclerView) view11.findViewById(R.id.ebh);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setAdapter(mVar);
        mVar.f97471a = a2;
        if (list == null) {
            list = new ArrayList();
        }
        mVar.mo62377b_(list);
        View view12 = this.itemView;
        C89219l.m154716b(view12, "");
        RecyclerView recyclerView4 = (RecyclerView) view12.findViewById(R.id.ebh);
        C89219l.m154716b(recyclerView4, "");
        ViewGroup.LayoutParams layoutParams2 = recyclerView4.getLayoutParams();
        View view13 = this.itemView;
        C89219l.m154716b(view13, "");
        RecyclerView recyclerView5 = (RecyclerView) view13.findViewById(R.id.ebh);
        C89219l.m154716b(recyclerView5, "");
        recyclerView5.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41782j(View view, AbstractC42664al.AbstractC42668d dVar, SearchIntermediateViewModel searchIntermediateViewModel, Fragment fragment) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97460a = dVar;
        this.f97461b = searchIntermediateViewModel;
        this.f97462c = fragment;
    }
}
