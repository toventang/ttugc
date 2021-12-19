package com.p2082ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40190d;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.setting.k */
public final class C85151k extends AbstractC34586a {

    /* renamed from: a */
    public C40190d f190510a;

    /* renamed from: b */
    public AbstractC85152a f190511b;

    /* renamed from: c */
    private SparseArray f190512c;

    /* renamed from: com.ss.android.ugc.trill.setting.k$a */
    public interface AbstractC85152a {
        static {
            Covode.recordClassIndex(99192);
        }

        /* renamed from: a */
        void mo130039a();

        /* renamed from: b */
        void mo130040b();

        /* renamed from: c */
        void mo130041c();

        /* renamed from: d */
        void mo130042d();

        /* renamed from: e */
        void mo130043e();
    }

    static {
        Covode.recordClassIndex(99191);
    }

    /* renamed from: a */
    private View m146405a(int i) {
        if (this.f190512c == null) {
            this.f190512c = new SparseArray();
        }
        View view = (View) this.f190512c.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f190512c.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f190512c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.k$b */
    static final class View$OnClickListenerC85153b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85151k f190513a;

        static {
            Covode.recordClassIndex(99193);
        }

        View$OnClickListenerC85153b(C85151k kVar) {
            this.f190513a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC85152a aVar = this.f190513a.f190511b;
            if (aVar != null) {
                aVar.mo130042d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.k$c */
    static final class View$OnClickListenerC85154c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85151k f190514a;

        static {
            Covode.recordClassIndex(99194);
        }

        View$OnClickListenerC85154c(C85151k kVar) {
            this.f190514a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f190514a.f190511b != null) {
                AbstractC85152a aVar = this.f190514a.f190511b;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                aVar.mo130039a();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C89219l.m154721d(view, "");
        ((TextView) view.findViewById(R.id.title)).setText(R.string.h76);
        ((ImageView) view.findViewById(R.id.pi)).setOnClickListener(new View$OnClickListenerC85153b(this));
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) m146405a(R.id.ejf);
        if (buttonTitleBar == null) {
            C89219l.m154715b();
        }
        ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) m146405a(R.id.ejf);
        C89219l.m154716b(buttonTitleBar2, "");
        buttonTitleBar.setBackgroundColor(C0643b.m2378c(buttonTitleBar2.getContext(), R.color.l));
        CommonItemView commonItemView = (CommonItemView) m146405a(R.id.gv);
        if (commonItemView == null) {
            C89219l.m154715b();
        }
        commonItemView.setRightIconRes(0);
        RecyclerView recyclerView = (RecyclerView) m146405a(R.id.h6);
        if (recyclerView == null) {
            C89219l.m154715b();
        }
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f190510a = new C40190d(getActivity());
        RecyclerView recyclerView2 = (RecyclerView) m146405a(R.id.h6);
        if (recyclerView2 == null) {
            C89219l.m154715b();
        }
        C40190d dVar = this.f190510a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        recyclerView2.setAdapter(dVar);
        ((CommonItemView) m146405a(R.id.gv)).setOnClickListener(new View$OnClickListenerC85154c(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a1q, viewGroup, false);
    }
}
