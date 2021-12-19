package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.epoxy.ChooseAdminController;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.a */
public final class C54614a extends C17372a {

    /* renamed from: e */
    public IMUser f125199e;

    /* renamed from: f */
    public final Activity f125200f;

    /* renamed from: g */
    public final List<IMUser> f125201g;

    /* renamed from: h */
    public final AbstractC89172b<IMUser, C89391z> f125202h;

    /* renamed from: i */
    private final AbstractC89244h f125203i = C89250i.m154773a((AbstractC89171a) new C54616b(this));

    /* renamed from: j */
    private HashMap f125204j;

    static {
        Covode.recordClassIndex(64327);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f125204j == null) {
            this.f125204j = new HashMap();
        }
        View view = (View) this.f125204j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f125204j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        HashMap hashMap = this.f125204j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final ChooseAdminController mo64296c() {
        return (ChooseAdminController) this.f125203i.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.a$b */
    static final class C54616b extends AbstractC89220m implements AbstractC89171a<ChooseAdminController> {

        /* renamed from: a */
        final /* synthetic */ C54614a f125206a;

        static {
            Covode.recordClassIndex(64329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54616b(C54614a aVar) {
            super(0);
            this.f125206a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ChooseAdminController invoke() {
            return new ChooseAdminController(this.f125206a.f125200f, new AbstractC89172b<IMUser, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a.C54614a.C54616b.C546171 */

                /* renamed from: a */
                final /* synthetic */ C54616b f125207a;

                static {
                    Covode.recordClassIndex(64330);
                }

                {
                    this.f125207a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(IMUser iMUser) {
                    final IMUser iMUser2 = iMUser;
                    C89219l.m154721d(iMUser2, "");
                    this.f125207a.f125206a.f125199e = iMUser2;
                    TuxButton tuxButton = (TuxButton) this.f125207a.f125206a.mo27715a(R.id.a50);
                    C89219l.m154716b(tuxButton, "");
                    tuxButton.setEnabled(true);
                    ((TuxButton) this.f125207a.f125206a.mo27715a(R.id.a50)).setOnClickListener(new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a.C54614a.C54616b.C546171.View$OnClickListenerC546181 */

                        /* renamed from: a */
                        final /* synthetic */ C546171 f125208a;

                        static {
                            Covode.recordClassIndex(64331);
                        }

                        {
                            this.f125208a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            this.f125208a.f125207a.f125206a.f125202h.invoke(iMUser2);
                            C23226a.C23228b.m43789a(this.f125208a.f125207a.f125206a, AbstractC23219c.C23222c.f55027a);
                        }
                    });
                    this.f125207a.f125206a.mo64296c().setData(this.f125207a.f125206a.f125201g, iMUser2);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.a$a */
    static final class View$OnClickListenerC54615a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54614a f125205a;

        static {
            Covode.recordClassIndex(64328);
        }

        View$OnClickListenerC54615a(C54614a aVar) {
            this.f125205a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43789a(this.f125205a, AbstractC23219c.C23223d.f55028a);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxIconView) mo27715a(R.id.a4z)).setOnClickListener(new View$OnClickListenerC54615a(this));
        ((EpoxyRecyclerView) mo27715a(R.id.a52)).setController(mo64296c());
        RecyclerView recyclerView = (RecyclerView) mo27715a(R.id.a52);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        mo64296c().setData(this.f125201g, this.f125199e);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a4d, viewGroup, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.IMUser, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C54614a(Activity activity, List<? extends IMUser> list, AbstractC89172b<? super IMUser, C89391z> bVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        this.f125200f = activity;
        this.f125201g = list;
        this.f125202h = bVar;
    }
}
