package com.p2082ss.android.ugc.aweme.setting.page.privacy;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.p3715c.C68047c;
import com.p2082ss.android.ugc.aweme.setting.p3723k.C68121c;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.BlackListPage */
public final class BlackListPage extends AbstractC68195a implements AbstractC39063h.AbstractC39067a, AbstractC39102c<User> {

    /* renamed from: e */
    public TuxStatusView f152889e;

    /* renamed from: f */
    public RecyclerView f152890f;

    /* renamed from: g */
    C68121c f152891g;

    /* renamed from: h */
    private C68047c f152892h;

    /* renamed from: i */
    private SparseArray f152893i;

    static {
        Covode.recordClassIndex(80524);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f152893i == null) {
            this.f152893i = new SparseArray();
        }
        View view = (View) this.f152893i.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f152893i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f152893i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ax5;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<User> list, boolean z) {
        C89219l.m154721d(list, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C68047c cVar = this.f152892h;
        if (cVar == null) {
            C89219l.m154715b();
        }
        cVar.ao_();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        TuxStatusView tuxStatusView = this.f152889e;
        if (tuxStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f152889e;
        if (tuxStatusView2 == null) {
            C89219l.m154710a("mStatusView");
        }
        tuxStatusView2.mo37867a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        C68121c cVar = this.f152891g;
        if (cVar == null) {
            C89219l.m154715b();
        }
        cVar.mo57616a(4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C68121c cVar = this.f152891g;
        if (cVar == null) {
            C89219l.m154715b();
        }
        cVar.mo57616a(1);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.BlackListPage$a */
    static final class C68310a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ BlackListPage f152894a;

        static {
            Covode.recordClassIndex(80525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68310a(BlackListPage blackListPage) {
            super(0);
            this.f152894a = blackListPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f152894a.mo59515b();
            BlackListPage blackListPage = this.f152894a;
            if (blackListPage.f152891g != null) {
                C68121c cVar = blackListPage.f152891g;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo57616a(1);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        C68047c cVar = this.f152892h;
        if (cVar == null) {
            C89219l.m154715b();
        }
        C68121c cVar2 = this.f152891g;
        if (cVar2 == null) {
            C89219l.m154715b();
        }
        AbstractC39100a aVar = (AbstractC39100a) cVar2.f92286h;
        C89219l.m154716b(aVar, "");
        cVar.mo62377b_(aVar.getItems());
        C68047c cVar3 = this.f152892h;
        if (cVar3 == null) {
            C89219l.m154715b();
        }
        if (cVar3.f92274v) {
            C68047c cVar4 = this.f152892h;
            if (cVar4 == null) {
                C89219l.m154715b();
            }
            cVar4.mo67829d(false);
            C68047c cVar5 = this.f152892h;
            if (cVar5 == null) {
                C89219l.m154715b();
            }
            cVar5.notifyDataSetChanged();
            C68047c cVar6 = this.f152892h;
            if (cVar6 == null) {
                C89219l.m154715b();
            }
            cVar6.ap_();
        }
        TuxStatusView tuxStatusView = this.f152889e;
        if (tuxStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        tuxStatusView.setVisibility(0);
        if (isAdded()) {
            TuxStatusView tuxStatusView2 = this.f152889e;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("mStatusView");
            }
            TuxStatusView.C23263c cVar7 = new TuxStatusView.C23263c();
            String string = getString(R.string.a66);
            C89219l.m154716b(string, "");
            tuxStatusView2.setStatus(cVar7.mo37878a((CharSequence) string));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C89219l.m154721d(exc, "");
        C68047c cVar = this.f152892h;
        if (cVar == null) {
            C89219l.m154715b();
        }
        cVar.mo67823i();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        C89219l.m154721d(exc, "");
        C68047c cVar = this.f152892h;
        if (cVar == null) {
            C89219l.m154715b();
        }
        if (cVar.f92274v) {
            C68047c cVar2 = this.f152892h;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            cVar2.mo67829d(false);
            C68047c cVar3 = this.f152892h;
            if (cVar3 == null) {
                C89219l.m154715b();
            }
            cVar3.notifyDataSetChanged();
        }
        TuxStatusView tuxStatusView = this.f152889e;
        if (tuxStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f152889e;
        if (tuxStatusView2 == null) {
            C89219l.m154710a("mStatusView");
        }
        tuxStatusView2.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C68310a(this)));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<User> list, boolean z) {
        if (list == null || list.isEmpty() || !z) {
            C68047c cVar = this.f152892h;
            if (cVar == null) {
                C89219l.m154715b();
            }
            cVar.ap_();
        } else {
            C68047c cVar2 = this.f152892h;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            cVar2.aq_();
        }
        C68047c cVar3 = this.f152892h;
        if (cVar3 == null) {
            C89219l.m154715b();
        }
        cVar3.mo62376b(list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<User> list, boolean z) {
        C89219l.m154721d(list, "");
        C68047c cVar = this.f152892h;
        if (cVar == null) {
            C89219l.m154715b();
        }
        cVar.mo67829d(true);
        if (!z) {
            C68047c cVar2 = this.f152892h;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            cVar2.ap_();
        } else {
            C68047c cVar3 = this.f152892h;
            if (cVar3 == null) {
                C89219l.m154715b();
            }
            cVar3.aq_();
        }
        C68047c cVar4 = this.f152892h;
        if (cVar4 == null) {
            C89219l.m154715b();
        }
        cVar4.mo62377b_(list);
        TuxStatusView tuxStatusView = this.f152889e;
        if (tuxStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        tuxStatusView.setVisibility(8);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.page.privacy.BlackListPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
