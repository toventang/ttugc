package com.p2082ss.android.ugc.aweme.liveevent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
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
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33473aj;
import com.p2082ss.android.ugc.aweme.AbstractC34830bh;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.C31294aa;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
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

/* renamed from: com.ss.android.ugc.aweme.liveevent.l */
public final class C58814l extends C31294aa implements AbstractC33473aj, AbstractC34830bh, AbstractC49762o {

    /* renamed from: d */
    public C58808h f133865d;

    /* renamed from: e */
    public C58812j f133866e;

    /* renamed from: f */
    public C89399f f133867f;

    /* renamed from: g */
    private C58809i f133868g;

    /* renamed from: h */
    private C41731m<RecyclerView.ViewHolder> f133869h;

    /* renamed from: i */
    private View f133870i;

    /* renamed from: j */
    private SparseArray f133871j;

    static {
        Covode.recordClassIndex(69124);
    }

    @Override // com.p2082ss.android.ugc.aweme.C31294aa
    /* renamed from: a */
    public final View mo57294a(int i) {
        if (this.f133871j == null) {
            this.f133871j = new SparseArray();
        }
        View view = (View) this.f133871j.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f133871j.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.C31294aa
    /* renamed from: a */
    public final void mo57295a() {
        SparseArray sparseArray = this.f133871j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33473aj
    /* renamed from: a */
    public final void mo59546a(String str) {
        C89219l.m154721d(str, "");
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
        C41731m<RecyclerView.ViewHolder> mVar = this.f133869h;
        if (mVar != null) {
            mVar.mo70917a(1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        C41731m<RecyclerView.ViewHolder> mVar = this.f133869h;
        if (mVar == null || mVar.f97353a != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C58808h hVar = this.f133865d;
        if (hVar != null) {
            hVar.ck_();
            hVar.mo67840h();
        }
        super.onDestroy();
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.l$b */
    static final class C58816b implements SwipeRefreshLayout.AbstractC34634b {

        /* renamed from: a */
        final /* synthetic */ C58814l f133873a;

        static {
            Covode.recordClassIndex(69126);
        }

        C58816b(C58814l lVar) {
            this.f133873a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
        /* renamed from: a */
        public final void mo59551a() {
            C58808h hVar = this.f133873a.f133865d;
            if (hVar != null) {
                hVar.mo57616a(1);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        C58808h hVar = this.f133865d;
        if (hVar != null) {
            hVar.mo57616a(4);
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
        relativeLayout.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfi);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.xi);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo57294a(R.id.c40);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo57294a(R.id.cfw);
        C89219l.m154716b(doubleBallSwipeRefreshLayout, "");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        C41731m<RecyclerView.ViewHolder> mVar = this.f133869h;
        if (mVar != null) {
            mVar.mo70917a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.l$a */
    static final class View$OnClickListenerC58815a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58814l f133872a;

        static {
            Covode.recordClassIndex(69125);
        }

        View$OnClickListenerC58815a(C58814l lVar) {
            this.f133872a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f133872a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C41731m<RecyclerView.ViewHolder> mVar = this.f133869h;
        if (mVar != null) {
            mVar.mo70917a(2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        C41731m<RecyclerView.ViewHolder> mVar = this.f133869h;
        if (mVar != null) {
            mVar.mo70917a(z ? 1 : 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34830bh
    /* renamed from: b */
    public final void mo59547b(int i) {
        int i2;
        C89399f fVar = this.f133867f;
        if (fVar != null) {
            i2 = fVar.getItemCount();
        } else {
            i2 = 0;
        }
        C89399f fVar2 = this.f133867f;
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
        TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.xi);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo57294a(R.id.c40);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo57294a(R.id.cfw);
        C89219l.m154716b(doubleBallSwipeRefreshLayout, "");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        C41731m<RecyclerView.ViewHolder> mVar = this.f133869h;
        if (mVar != null) {
            mVar.mo70917a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.l$c */
    static final class View$OnClickListenerC58817c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58814l f133874a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34884bl f133875b;

        static {
            Covode.recordClassIndex(69127);
        }

        View$OnClickListenerC58817c(C58814l lVar, AbstractC34884bl blVar) {
            this.f133874a = lVar;
            this.f133875b = blVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x015e A[LOOP:1: B:53:0x0158->B:55:0x015e, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0170  */
        /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r25) {
            /*
            // Method dump skipped, instructions count: 382
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.liveevent.C58814l.View$OnClickListenerC58817c.onClick(android.view.View):void");
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.C31294aa
    public final void onActivityCreated(Bundle bundle) {
        C89399f fVar;
        ImageView imageView;
        TextView textView;
        String str;
        Resources resources;
        MethodCollector.m26663i(12483);
        super.onActivityCreated(bundle);
        this.f133868g = new C58809i(C31294aa.f75003b.getTYPE());
        C58808h hVar = new C58808h();
        this.f133865d = hVar;
        hVar.mo67839a_(this);
        C58808h hVar2 = this.f133865d;
        if (hVar2 != null) {
            hVar2.mo67838a(this.f133868g);
        }
        C58808h hVar3 = this.f133865d;
        if (hVar3 != null) {
            hVar3.f133844b = this;
        }
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfi);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
        ((DoubleBallSwipeRefreshLayout) mo57294a(R.id.cfw)).setOnRefreshListener(new C58816b(this));
        C31294aa.C31295a.m65469a(EnumC31359ab.LIVE_EVENT);
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.ea5);
        C89219l.m154716b(viewStub, "");
        viewStub.setLayoutResource(C31294aa.f75003b.anchorInfo().mo61486a());
        View inflate = ((ViewStub) getView().findViewById(R.id.ea5)).inflate();
        this.f133870i = inflate;
        if (!(inflate == null || (textView = (TextView) inflate.findViewById(R.id.f8o)) == null)) {
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.din)) == null) {
                str = "LIVE Events";
            }
            textView.setText(str);
        }
        View view = this.f133870i;
        if (!(view == null || (imageView = (ImageView) view.findViewById(R.id.blj)) == null)) {
            imageView.setOnClickListener(new View$OnClickListenerC58815a(this));
        }
        RelativeLayout relativeLayout = (RelativeLayout) mo57294a(R.id.a2x);
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.setVisibility(8);
        ActivityC0945e activity = getActivity();
        if (!(activity instanceof AbstractC34884bl)) {
            activity = null;
        }
        AbstractC34884bl blVar = (AbstractC34884bl) activity;
        AbstractC34403c adapterFactory = C31294aa.f75003b.adapterFactory(blVar);
        if (adapterFactory != null) {
            fVar = adapterFactory.mo60825a();
        } else {
            fVar = null;
        }
        this.f133867f = fVar;
        this.f133869h = C41731m.m83697a(fVar);
        RecyclerView recyclerView = (RecyclerView) mo57294a(R.id.dgw);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(this.f133869h);
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
        C20766v a = C20761r.m39056a(2131232637);
        a.f49092E = (SmartImageView) mo57294a(R.id.bhk);
        a.mo34186c();
        TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.xi);
        C89219l.m154716b(tuxTextView, "");
        Context context2 = getContext();
        if (context2 == null) {
            C89219l.m154715b();
        }
        tuxTextView.setBackground(new ColorDrawable(C0643b.m2378c(context2, R.color.g)));
        TuxTextView tuxTextView2 = (TuxTextView) mo57294a(R.id.xi);
        Context context3 = getContext();
        if (context3 == null) {
            C89219l.m154715b();
        }
        tuxTextView2.setTextColor(C0643b.m2378c(context3, R.color.bz));
        if (this.f133866e == null) {
            TuxTextView tuxTextView3 = (TuxTextView) mo57294a(R.id.xi);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setClickable(false);
        }
        ((TuxTextView) mo57294a(R.id.xi)).setOnClickListener(new View$OnClickListenerC58817c(this, blVar));
        C58808h hVar4 = this.f133865d;
        if (hVar4 != null) {
            hVar4.mo57616a(1);
            MethodCollector.m26664o(12483);
            return;
        }
        MethodCollector.m26664o(12483);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Object> list, boolean z) {
        C89399f fVar;
        if (!(list == null || list.isEmpty() || (fVar = this.f133867f) == null)) {
            fVar.mo17153a(list);
        }
        C41731m<RecyclerView.ViewHolder> mVar = this.f133869h;
        if (mVar != null) {
            mVar.mo70917a(z ? 1 : 0);
        }
        C89399f fVar2 = this.f133867f;
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
            TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.xi);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfi);
            C89219l.m154716b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo57294a(R.id.cfw);
            C89219l.m154716b(doubleBallSwipeRefreshLayout, "");
            doubleBallSwipeRefreshLayout.setRefreshing(false);
            LinearLayout linearLayout = (LinearLayout) mo57294a(R.id.c40);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            C89399f fVar = this.f133867f;
            if (fVar != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                boolean z2 = false;
                for (T t : list) {
                    if (t instanceof AnchorCell) {
                        t.f79661g = C31294aa.f75003b.getTYPE();
                    }
                    T t2 = null;
                    if (!z2) {
                        if (t instanceof C58812j) {
                            t2 = t;
                        }
                        T t3 = t2;
                        if (t3 != null) {
                            t3.f133859e = true;
                        }
                        z2 = true;
                    } else {
                        if (t instanceof C58812j) {
                            t2 = t;
                        }
                        T t4 = t2;
                        if (t4 != null) {
                            t4.f133859e = false;
                        }
                    }
                    arrayList.add(t);
                }
                fVar.mo17153a(arrayList);
            }
            C41731m<RecyclerView.ViewHolder> mVar = this.f133869h;
            if (mVar != null) {
                mVar.mo70917a(z ? 1 : 0);
            }
            C89399f fVar2 = this.f133867f;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
            C31294aa.f75003b.anchorMob();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ay, viewGroup, false);
    }
}
