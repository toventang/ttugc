package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.api.AnchorApi;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.api.resp.C33543a;
import com.p2082ss.android.ugc.aweme.p2362b.AbstractC34403c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.ss.android.ugc.aweme.af */
public final class C33421af extends C31294aa {

    /* renamed from: d */
    public boolean f79453d;

    /* renamed from: e */
    public C89399f f79454e;

    /* renamed from: f */
    private List<AnchorCell> f79455f = new ArrayList();

    /* renamed from: g */
    private SparseArray f79456g;

    static {
        Covode.recordClassIndex(40278);
    }

    @Override // com.p2082ss.android.ugc.aweme.C31294aa
    /* renamed from: a */
    public final View mo57294a(int i) {
        if (this.f79456g == null) {
            this.f79456g = new SparseArray();
        }
        View view = (View) this.f79456g.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f79456g.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.C31294aa
    /* renamed from: a */
    public final void mo57295a() {
        SparseArray sparseArray = this.f79456g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.C31294aa
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57295a();
    }

    /* renamed from: com.ss.android.ugc.aweme.af$a */
    static final class View$OnClickListenerC33422a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33421af f79457a;

        static {
            Covode.recordClassIndex(40279);
        }

        View$OnClickListenerC33422a(C33421af afVar) {
            this.f79457a = afVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f79457a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.af$b */
    static final class View$OnClickListenerC33423b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33421af f79458a;

        static {
            Covode.recordClassIndex(40280);
        }

        View$OnClickListenerC33423b(C33421af afVar) {
            this.f79458a = afVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f79458a.mo59504a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.af$d */
    static final class View$OnClickListenerC33427d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33421af f79463a;

        static {
            Covode.recordClassIndex(40284);
        }

        View$OnClickListenerC33427d(C33421af afVar) {
            this.f79463a = afVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f79463a.mo59504a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.af$e */
    static final class View$OnClickListenerC33428e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33421af f79464a;

        static {
            Covode.recordClassIndex(40285);
        }

        View$OnClickListenerC33428e(C33421af afVar) {
            this.f79464a = afVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f79464a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.af$c */
    static final class View$OnClickListenerC33424c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33421af f79459a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34884bl f79460b;

        static {
            Covode.recordClassIndex(40281);
        }

        View$OnClickListenerC33424c(C33421af afVar, AbstractC34884bl blVar) {
            this.f79459a = afVar;
            this.f79460b = blVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            C17197a.C17200a aVar = new C17197a.C17200a(this.f79459a.getContext());
            Context context = this.f79459a.getContext();
            if (context != null) {
                str = context.getString(R.string.amn);
            } else {
                str = null;
            }
            aVar.f41071b = str;
            aVar.f41063I = 17;
            Context context2 = this.f79459a.getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.amm);
            } else {
                str2 = null;
            }
            aVar.mo27192a(str2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC33425a(this), false);
            Context context3 = this.f79459a.getContext();
            if (context3 != null) {
                str3 = context3.getString(R.string.aml);
            } else {
                str3 = null;
            }
            aVar.mo27196b(str3, (DialogInterface.OnClickListener) null, false);
            aVar.mo27193a().mo27185c();
        }

        /* renamed from: com.ss.android.ugc.aweme.af$c$a */
        static final class DialogInterface$OnClickListenerC33425a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC33424c f79461a;

            static {
                Covode.recordClassIndex(40282);
            }

            DialogInterface$OnClickListenerC33425a(View$OnClickListenerC33424c cVar) {
                this.f79461a = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                int type = C31294aa.f75003b.getTYPE();
                C89219l.m154721d("", "");
                ((AnchorApi.RealApi) AnchorApi.f79629a.mo28858a(AnchorApi.RealApi.class)).getAnchorDeleteHistoryResponse(type, "", true).mo5534a(new AbstractC1729g(this) {
                    /* class com.p2082ss.android.ugc.aweme.C33421af.View$OnClickListenerC33424c.DialogInterface$OnClickListenerC33425a.C334261 */

                    /* renamed from: a */
                    final /* synthetic */ DialogInterface$OnClickListenerC33425a f79462a;

                    static {
                        Covode.recordClassIndex(40283);
                    }

                    {
                        this.f79462a = r1;
                    }

                    @Override // p077b.AbstractC1729g
                    public final /* synthetic */ Object then(C1731i iVar) {
                        List<?> list;
                        C89219l.m154716b(iVar, "");
                        if (((C33543a) iVar.mo5545d()).status_code == 0) {
                            C89399f fVar = this.f79462a.f79461a.f79459a.f79454e;
                            if (!(fVar == null || (list = fVar.f203060b) == null)) {
                                list.clear();
                            }
                            C89399f fVar2 = this.f79462a.f79461a.f79459a.f79454e;
                            if (fVar2 != null) {
                                fVar2.notifyDataSetChanged();
                            }
                            AbstractC34884bl blVar = this.f79462a.f79461a.f79460b;
                            if (blVar != null) {
                                blVar.mo59599b();
                            }
                            this.f79462a.f79461a.f79459a.mo59504a(false);
                            ActivityC0945e activity = this.f79462a.f79461a.f79459a.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                        }
                        return C89391z.f203057a;
                    }
                }, C1731i.f5564c, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo59504a(boolean z) {
        this.f79453d = z;
        ViewSwitcher viewSwitcher = (ViewSwitcher) mo57294a(R.id.f8r);
        C89219l.m154716b(viewSwitcher, "");
        viewSwitcher.setDisplayedChild(z ? 1 : 0);
        ViewSwitcher viewSwitcher2 = (ViewSwitcher) mo57294a(R.id.bme);
        C89219l.m154716b(viewSwitcher2, "");
        viewSwitcher2.setDisplayedChild(z);
        Iterator<T> it = this.f79455f.iterator();
        while (it.hasNext()) {
            it.next().f79662h = z;
        }
        C89399f fVar = this.f79454e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Collection<? extends AnchorCell> collection;
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        C89399f fVar = null;
        if (arguments != null) {
            collection = arguments.getParcelableArrayList("recently_add");
        } else {
            collection = null;
        }
        this.f79455f.clear();
        List<AnchorCell> list = this.f79455f;
        if (collection == null) {
            collection = C89086z.INSTANCE;
        }
        list.addAll(collection);
        Iterator<T> it = this.f79455f.iterator();
        while (it.hasNext()) {
            it.next().f79662h = false;
        }
        ((TuxIconView) mo57294a(R.id.blj)).setOnClickListener(new View$OnClickListenerC33422a(this));
        TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.f8o);
        C89219l.m154716b(tuxTextView, "");
        Context context = getContext();
        if (context != null) {
            str = context.getString(C31294aa.f75003b.anchorInfo().mo61487b());
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        AbstractC34884bl blVar = (AbstractC34884bl) getActivity();
        if (getActivity() != null) {
            AbstractC34403c adapterFactory = C31294aa.f75003b.adapterFactory(blVar);
            if (adapterFactory != null) {
                fVar = new C89399f();
                adapterFactory.mo60824a(fVar, adapterFactory.f81321a, "recently_Add");
            }
            this.f79454e = fVar;
            if (fVar != null) {
                List<?> list2 = this.f79455f;
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                fVar.mo17153a(list2);
            }
        }
        RecyclerView recyclerView = (RecyclerView) mo57294a(R.id.dgw);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(this.f79454e);
        RecyclerView recyclerView2 = (RecyclerView) mo57294a(R.id.dgw);
        C89219l.m154716b(recyclerView2, "");
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ViewSwitcher viewSwitcher = (ViewSwitcher) mo57294a(R.id.f8r);
        C89219l.m154716b(viewSwitcher, "");
        viewSwitcher.setDisplayedChild(0);
        ((TuxTextView) mo57294a(R.id.f83)).setOnClickListener(new View$OnClickListenerC33423b(this));
        ((TuxTextView) mo57294a(R.id.f81)).setOnClickListener(new View$OnClickListenerC33424c(this, blVar));
        ((TuxIconView) mo57294a(R.id.blj)).setOnClickListener(new View$OnClickListenerC33427d(this));
        ((TuxIconView) mo57294a(R.id.bln)).setOnClickListener(new View$OnClickListenerC33428e(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0m, viewGroup, false);
    }
}
