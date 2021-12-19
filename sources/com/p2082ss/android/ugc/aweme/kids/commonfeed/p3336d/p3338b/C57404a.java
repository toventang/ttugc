package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3336d.p3338b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1712a.C23019c;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.C26614b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.common.response.C57356a;
import com.p2082ss.android.ugc.aweme.kids.common.response.KMReportReason;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b.C57392c;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3336d.p3337a.C57403a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.C57535d;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.C57460b;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.p3346a.C57459a;
import com.p2082ss.android.ugc.aweme.kids.homepage.compliance.KidsComplianceServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.d.b.a */
public final class C57404a extends C26614b {

    /* renamed from: a */
    public Aweme f130853a;

    /* renamed from: b */
    private C57392c f130854b;

    /* renamed from: c */
    private List<C57403a> f130855c = new ArrayList();

    /* renamed from: d */
    private HashMap f130856d;

    static {
        Covode.recordClassIndex(67324);
    }

    /* renamed from: a */
    private View m104026a(int i) {
        if (this.f130856d == null) {
            this.f130856d = new HashMap();
        }
        View view = (View) this.f130856d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f130856d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f130856d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.d.b.a$b */
    static final class View$OnClickListenerC57406b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57404a f130858a;

        static {
            Covode.recordClassIndex(67326);
        }

        View$OnClickListenerC57406b(C57404a aVar) {
            this.f130858a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130858a.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ViewParent viewParent;
        super.onActivityCreated(bundle);
        View view = getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = viewParent;
        }
        View view3 = view2;
        if (view3 != null) {
            view3.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_aweme");
        } else {
            serializable = null;
        }
        Aweme aweme = (Aweme) serializable;
        this.f130853a = aweme;
        if (aweme != null) {
            C57403a aVar = new C57403a();
            aVar.f130850a = new C57405a(this);
            this.f130855c.add(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.d.b.a$a */
    static final class C57405a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57404a f130857a;

        static {
            Covode.recordClassIndex(67325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57405a(C57404a aVar) {
            super(1);
            this.f130857a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            ActivityC0945e activity = this.f130857a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            Aweme aweme = this.f130857a.f130853a;
            if (aweme == null) {
                C89219l.m154715b();
            }
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            Aweme aweme2 = this.f130857a.f130853a;
            if (aweme2 == null) {
                C89219l.m154715b();
            }
            String authorUid = aweme2.getAuthorUid();
            C89219l.m154716b(authorUid, "");
            C89219l.m154721d(activity, "");
            C89219l.m154721d(aid, "");
            C89219l.m154721d(authorUid, "");
            C57355f.m103962a("show_report_reason", new C33743c().mo59976a("object_type", "video").mo59977a());
            KMReportReason b = KidsComplianceServiceImpl.m104360c().mo94886b();
            if (b != null) {
                for (C57356a aVar : b.getVideo()) {
                    if (!TextUtils.isEmpty(aVar.f130736b)) {
                        C57460b.f131032a.add(new C57459a(aVar.f130737c, null, aVar.f130736b, aVar.f130735a));
                    }
                }
            } else {
                List<C57459a> list = C57460b.f131032a;
                String b2 = C34722h.m70923b(R.string.csq);
                C89219l.m154716b(b2, "");
                list.add(new C57459a(null, 2131233082, b2, 99901));
                List<C57459a> list2 = C57460b.f131032a;
                String b3 = C34722h.m70923b(R.string.cso);
                C89219l.m154716b(b3, "");
                list2.add(new C57459a(null, 2131233083, b3, 99902));
                List<C57459a> list3 = C57460b.f131032a;
                String b4 = C34722h.m70923b(R.string.csn);
                C89219l.m154716b(b4, "");
                list3.add(new C57459a(null, 2131233084, b4, 99903));
            }
            C57460b.f131034c = new C57535d(activity, C57460b.f131032a);
            C23023b bVar = (C23023b) C23013a.C23015a.m43405a(activity).mo37479a(R.string.csp);
            C57535d dVar = C57460b.f131034c;
            if (dVar == null) {
                C89219l.m154710a("reportReasonReasonList");
            }
            C23013a a = ((C23023b) C23032e.m43444a(C23019c.m43408a(bVar, dVar), new C57460b.C57466d(activity, aid, authorUid)).mo37484b(C57460b.C57469e.f131049a).mo37481a(C57460b.C57471f.f131051a)).mo37405a();
            a.mo37396b().show();
            for (C57459a aVar2 : C57460b.f131032a) {
                aVar2.f131025a = new C57460b.C57463c(aVar2, a);
            }
            C57460b.f131032a.clear();
            C57460b.f131033b.clear();
            C33743c a2 = new C33743c().mo59976a("enter_from", "homepage_menu");
            Aweme aweme3 = this.f130857a.f130853a;
            if (aweme3 == null) {
                C89219l.m154715b();
            }
            C33743c a3 = a2.mo59976a("group_id", aweme3.getAid());
            Aweme aweme4 = this.f130857a.f130853a;
            if (aweme4 == null) {
                C89219l.m154715b();
            }
            C33743c a4 = a3.mo59976a("author_id", aweme4.getAuthorUid());
            Aweme aweme5 = this.f130857a.f130853a;
            if (aweme5 == null) {
                C89219l.m154715b();
            }
            C57355f.m103962a("click_report", a4.mo59976a("log_pb", aweme5.getLogPbString()).mo59977a());
            this.f130857a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        C57392c cVar = new C57392c(context);
        this.f130854b = cVar;
        List<C57403a> list = this.f130855c;
        C89219l.m154721d(list, "");
        cVar.f130837a.clear();
        cVar.f130837a.addAll(list);
        cVar.notifyDataSetChanged();
        RecyclerView recyclerView = (RecyclerView) m104026a(R.id.cly);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(this.f130854b);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((TuxTextView) m104026a(R.id.xa)).setOnClickListener(new View$OnClickListenerC57406b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(5183);
        C89219l.m154721d(layoutInflater, "");
        View inflate = View.inflate(getContext(), R.layout.aco, viewGroup);
        MethodCollector.m26664o(5183);
        return inflate;
    }
}
