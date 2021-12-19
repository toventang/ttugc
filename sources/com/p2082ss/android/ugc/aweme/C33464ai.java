package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41731m;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2957n.C49763p;
import com.p2082ss.android.ugc.aweme.p2362b.AbstractC34403c;
import com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.ss.android.ugc.aweme.ai */
public final class C33464ai extends C31294aa implements AbstractC33473aj, AbstractC34830bh, AbstractC49762o {

    /* renamed from: d */
    public C33418ae f79516d;

    /* renamed from: e */
    private C33479ak f79517e;

    /* renamed from: f */
    private C89399f f79518f;

    /* renamed from: g */
    private C41731m<RecyclerView.ViewHolder> f79519g;

    /* renamed from: h */
    private View f79520h;

    /* renamed from: i */
    private SparseArray f79521i;

    static {
        Covode.recordClassIndex(40321);
    }

    @Override // com.p2082ss.android.ugc.aweme.C31294aa
    /* renamed from: a */
    public final View mo57294a(int i) {
        if (this.f79521i == null) {
            this.f79521i = new SparseArray();
        }
        View view = (View) this.f79521i.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f79521i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.C31294aa
    /* renamed from: a */
    public final void mo57295a() {
        SparseArray sparseArray = this.f79521i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<?>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Object> list, boolean z) {
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.C31294aa
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57295a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79519g;
        if (mVar != null) {
            mVar.mo70917a(1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79519g;
        if (mVar == null || mVar.f97353a != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C33418ae aeVar = this.f79516d;
        if (aeVar != null) {
            aeVar.ck_();
            aeVar.mo67840h();
        }
        super.onDestroy();
    }

    /* renamed from: com.ss.android.ugc.aweme.ai$b */
    static final class C33466b implements SwipeRefreshLayout.AbstractC34634b {

        /* renamed from: a */
        final /* synthetic */ C33464ai f79523a;

        static {
            Covode.recordClassIndex(40323);
        }

        C33466b(C33464ai aiVar) {
            this.f79523a = aiVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
        /* renamed from: a */
        public final void mo59551a() {
            C33418ae aeVar = this.f79523a.f79516d;
            if (aeVar != null) {
                aeVar.mo57616a(1);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        C33418ae aeVar = this.f79516d;
        if (aeVar != null) {
            aeVar.mo57616a(4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34830bh
    /* renamed from: c */
    public final void mo59548c() {
        RelativeLayout relativeLayout = (RelativeLayout) mo57294a(R.id.a2x);
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34830bh
    /* renamed from: d */
    public final void mo59549d() {
        RelativeLayout relativeLayout = (RelativeLayout) mo57294a(R.id.a2x);
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfi);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo57294a(R.id.c40);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo57294a(R.id.cfw);
        C89219l.m154716b(doubleBallSwipeRefreshLayout, "");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        C41731m<RecyclerView.ViewHolder> mVar = this.f79519g;
        if (mVar != null) {
            mVar.mo70917a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ai$a */
    static final class View$OnClickListenerC33465a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33464ai f79522a;

        static {
            Covode.recordClassIndex(40322);
        }

        View$OnClickListenerC33465a(C33464ai aiVar) {
            this.f79522a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f79522a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ai$c */
    static final class View$OnClickListenerC33467c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33464ai f79524a;

        static {
            Covode.recordClassIndex(40324);
        }

        View$OnClickListenerC33467c(C33464ai aiVar) {
            this.f79524a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC34884bl blVar = this.f79524a.f75005a;
            if (blVar != null) {
                blVar.mo59596a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79519g;
        if (mVar != null) {
            mVar.mo70917a(z ? 1 : 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79519g;
        if (mVar != null) {
            mVar.mo70917a(2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33473aj
    /* renamed from: a */
    public final void mo59546a(String str) {
        TextView textView;
        C89219l.m154721d(str, "");
        View view = this.f79520h;
        if (view != null && (textView = (TextView) view.findViewById(R.id.f8o)) != null) {
            textView.setText(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34830bh
    /* renamed from: b */
    public final void mo59547b(int i) {
        int i2;
        C89399f fVar = this.f79518f;
        if (fVar != null) {
            i2 = fVar.getItemCount();
        } else {
            i2 = 0;
        }
        C89399f fVar2 = this.f79518f;
        if (fVar2 != null) {
            fVar2.notifyItemRangeChanged(i, i2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfi);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo57294a(R.id.c40);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo57294a(R.id.cfw);
        C89219l.m154716b(doubleBallSwipeRefreshLayout, "");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        C41731m<RecyclerView.ViewHolder> mVar = this.f79519g;
        if (mVar != null) {
            mVar.mo70917a(0);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.C31294aa
    public final void onActivityCreated(Bundle bundle) {
        String str;
        C89399f fVar;
        ImageView imageView;
        TextView textView;
        MethodCollector.m26663i(11920);
        super.onActivityCreated(bundle);
        this.f79517e = new C33479ak(C31294aa.f75003b.getTYPE());
        C33418ae aeVar = new C33418ae();
        this.f79516d = aeVar;
        aeVar.mo67839a_(this);
        C33418ae aeVar2 = this.f79516d;
        if (aeVar2 != null) {
            aeVar2.mo67838a(this.f79517e);
        }
        C33418ae aeVar3 = this.f79516d;
        if (aeVar3 != null) {
            aeVar3.f79450b = this;
        }
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfi);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
        ((DoubleBallSwipeRefreshLayout) mo57294a(R.id.cfw)).setOnRefreshListener(new C33466b(this));
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.ea5);
        C89219l.m154716b(viewStub, "");
        viewStub.setLayoutResource(C31294aa.f75003b.anchorInfo().mo61486a());
        View inflate = ((ViewStub) getView().findViewById(R.id.ea5)).inflate();
        this.f79520h = inflate;
        if (!(inflate == null || (textView = (TextView) inflate.findViewById(R.id.f8o)) == null)) {
            textView.setText("");
        }
        View view = this.f79520h;
        if (!(view == null || (imageView = (ImageView) view.findViewById(R.id.blj)) == null)) {
            imageView.setOnClickListener(new View$OnClickListenerC33465a(this));
        }
        TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.f84);
        C89219l.m154716b(tuxTextView, "");
        Context context = getContext();
        if (context != null) {
            C31294aa.f75003b.anchorInfo();
            str = context.getString(R.string.amw);
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        ((RelativeLayout) mo57294a(R.id.a2x)).setOnClickListener(new View$OnClickListenerC33467c(this));
        ActivityC0945e activity = getActivity();
        if (!(activity instanceof AbstractC34884bl)) {
            activity = null;
        }
        AbstractC34403c adapterFactory = C31294aa.f75003b.adapterFactory((AbstractC34884bl) activity);
        if (adapterFactory != null) {
            fVar = adapterFactory.mo60825a();
        } else {
            fVar = null;
        }
        this.f79518f = fVar;
        this.f79519g = C41731m.m83697a(fVar);
        RecyclerView recyclerView = (RecyclerView) mo57294a(R.id.dgw);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(this.f79519g);
        RecyclerView recyclerView2 = (RecyclerView) mo57294a(R.id.dgw);
        C89219l.m154716b(recyclerView2, "");
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = (RecyclerView) mo57294a(R.id.dgw);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = (RecyclerView) mo57294a(R.id.dgw);
        C89219l.m154716b(recyclerView4, "");
        recyclerView4.setOnFlingListener(new C49763p((RecyclerView) mo57294a(R.id.dgw), this));
        C33418ae aeVar4 = this.f79516d;
        if (aeVar4 != null) {
            aeVar4.mo57616a(1);
            MethodCollector.m26664o(11920);
            return;
        }
        MethodCollector.m26664o(11920);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Object> list, boolean z) {
        C89399f fVar;
        if (!(list == null || list.isEmpty() || (fVar = this.f79518f) == null)) {
            fVar.mo17153a(list);
        }
        C41731m<RecyclerView.ViewHolder> mVar = this.f79519g;
        if (mVar != null) {
            mVar.mo70917a(z ? 1 : 0);
        }
        C89399f fVar2 = this.f79518f;
        if (fVar2 != null) {
            fVar2.notifyDataSetChanged();
        }
        C31294aa.f75003b.anchorMob();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Object> list, boolean z) {
        if (!(list == null || list.isEmpty())) {
            RecyclerView recyclerView = (RecyclerView) mo57294a(R.id.dgw);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setVisibility(0);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfi);
            C89219l.m154716b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo57294a(R.id.cfw);
            C89219l.m154716b(doubleBallSwipeRefreshLayout, "");
            doubleBallSwipeRefreshLayout.setRefreshing(false);
            LinearLayout linearLayout = (LinearLayout) mo57294a(R.id.c40);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            C89399f fVar = this.f79518f;
            if (fVar != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (T t : list) {
                    if (t instanceof AnchorCell) {
                        t.f79661g = C31294aa.f75003b.getTYPE();
                    }
                    arrayList.add(t);
                }
                fVar.mo17153a(arrayList);
            }
            C41731m<RecyclerView.ViewHolder> mVar = this.f79519g;
            if (mVar != null) {
                mVar.mo70917a(z ? 1 : 0);
            }
            C89399f fVar2 = this.f79518f;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
            C31294aa.f75003b.anchorMob();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ax, viewGroup, false);
    }
}
