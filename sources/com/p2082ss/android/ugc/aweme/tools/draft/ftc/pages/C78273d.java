package com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.C26614b;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.AbstractC78335e;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78324a;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftOptionViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.d */
public final class C78273d extends C26614b {

    /* renamed from: a */
    private final AbstractC89244h f175824a = C89250i.m154773a((AbstractC89171a) new C78274a(this));

    /* renamed from: b */
    private HashMap f175825b;

    static {
        Covode.recordClassIndex(91390);
    }

    /* renamed from: a */
    private View m136758a(int i) {
        if (this.f175825b == null) {
            this.f175825b = new HashMap();
        }
        View view = (View) this.f175825b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f175825b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final KidsDraftOptionViewModel mo122165a() {
        return (KidsDraftOptionViewModel) this.f175824a.getValue();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f175825b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.d$a */
    static final class C78274a extends AbstractC89220m implements AbstractC89171a<KidsDraftOptionViewModel> {

        /* renamed from: a */
        final /* synthetic */ C78273d f175826a;

        static {
            Covode.recordClassIndex(91391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78274a(C78273d dVar) {
            super(0);
            this.f175826a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ KidsDraftOptionViewModel invoke() {
            AbstractC1174ac a = new C1175ad(this.f175826a.requireActivity(), new C1175ad.AbstractC1177b() {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78273d.C78274a.C782751 */

                static {
                    Covode.recordClassIndex(91392);
                }

                @Override // androidx.lifecycle.C1175ad.AbstractC1177b
                /* renamed from: a */
                public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                    C89219l.m154721d(cls, "");
                    return new KidsDraftOptionViewModel();
                }
            }).mo3983a(KidsDraftOptionViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: b */
    public final int mo122166b() {
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            if (arguments.containsKey("draft_selected_video_index")) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    C89219l.m154715b();
                }
                return arguments2.getInt("draft_selected_video_index", -1);
            }
        }
        return -1;
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

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.d$b */
    static final class View$OnClickListenerC78276b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78273d f175827a;

        static {
            Covode.recordClassIndex(91393);
        }

        View$OnClickListenerC78276b(C78273d dVar) {
            this.f175827a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f175827a.mo122165a().f176107a.postValue(new C78324a<>(new AbstractC78335e.C78338c(this.f175827a.mo122166b())));
            this.f175827a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.d$c */
    static final class View$OnClickListenerC78277c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78273d f175828a;

        static {
            Covode.recordClassIndex(91394);
        }

        View$OnClickListenerC78277c(C78273d dVar) {
            this.f175828a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f175828a.mo122165a().f176107a.postValue(new C78324a<>(new AbstractC78335e.C78337b(this.f175828a.mo122166b())));
            this.f175828a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.d$d */
    static final class View$OnClickListenerC78278d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78273d f175829a;

        static {
            Covode.recordClassIndex(91395);
        }

        View$OnClickListenerC78278d(C78273d dVar) {
            this.f175829a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f175829a.mo122165a().f176107a.postValue(new C78324a<>(new AbstractC78335e.C78336a(this.f175829a.mo122166b())));
            this.f175829a.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        super.onDismiss(dialogInterface);
        C84425b bVar = new C84425b();
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        Serializable serializable = null;
        if (e != null) {
            str = e.mo58660c();
        } else {
            str = null;
        }
        C84425b a = bVar.mo129406a("author_id", str);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("draft_current_video");
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        C39162r.m79460a("close_more_button", a.mo129406a("group_id", ((VideoPublishEditModel) serializable).creationId).f188764a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((LinearLayout) m136758a(R.id.cm3)).setOnClickListener(new View$OnClickListenerC78276b(this));
        ((LinearLayout) m136758a(R.id.cm2)).setOnClickListener(new View$OnClickListenerC78277c(this));
        ((LinearLayout) m136758a(R.id.cm1)).setOnClickListener(new View$OnClickListenerC78278d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.adk, viewGroup, false);
    }
}
