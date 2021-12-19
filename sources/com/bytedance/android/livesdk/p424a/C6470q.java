package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.q */
public final class C6470q extends C10935a {

    /* renamed from: d */
    public static final C6471a f16098d = new C6471a((byte) 0);

    /* renamed from: a */
    public C3265j f16099a;

    /* renamed from: b */
    public View.OnClickListener f16100b;

    /* renamed from: c */
    public AbstractC89172b<? super C3265j, C89391z> f16101c;

    /* renamed from: e */
    private HashMap f16102e;

    static {
        Covode.recordClassIndex(7206);
    }

    /* renamed from: a */
    private View m13870a(int i) {
        if (this.f16102e == null) {
            this.f16102e = new HashMap();
        }
        View view = (View) this.f16102e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16102e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.a.q$a */
    public static final class C6471a {
        static {
            Covode.recordClassIndex(7207);
        }

        private C6471a() {
        }

        public /* synthetic */ C6471a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16102e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C3265j jVar = this.f16099a;
        if (jVar != null) {
            AbstractC89172b<? super C3265j, C89391z> bVar = this.f16101c;
            if (bVar != null) {
                bVar.invoke(jVar);
            }
            this.f16099a = null;
        }
        super.onDestroy();
    }

    /* renamed from: com.bytedance.android.livesdk.a.q$b */
    static final class C6472b extends AbstractC89220m implements AbstractC89172b<C3265j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6470q f16103a;

        static {
            Covode.recordClassIndex(7208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6472b(C6470q qVar) {
            super(1);
            this.f16103a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3265j jVar) {
            final C3265j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new AbstractC88433f(this) {
                /* class com.bytedance.android.livesdk.p424a.C6470q.C6472b.C64731 */

                /* renamed from: a */
                final /* synthetic */ C6472b f16104a;

                static {
                    Covode.recordClassIndex(7209);
                }

                {
                    this.f16104a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    if (!C89219l.m154714a(obj, jVar2)) {
                        this.f16104a.f16103a.f16099a = jVar2;
                        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).setMuteDuration(jVar2);
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    /* renamed from: com.bytedance.android.livesdk.a.q$c */
    static final class C6474c extends AbstractC89220m implements AbstractC89172b<List<? extends C3265j>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6493u f16106a;

        static {
            Covode.recordClassIndex(7210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6474c(C6493u uVar) {
            super(1);
            this.f16106a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.android.livesdk.a.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C3265j> list) {
            List<? extends C3265j> list2 = list;
            C89219l.m154721d(list2, "");
            this.f16106a.mo12621a((List<C3265j>) list2);
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new AbstractC88433f(this) {
                /* class com.bytedance.android.livesdk.p424a.C6470q.C6474c.C64751 */

                /* renamed from: a */
                final /* synthetic */ C6474c f16107a;

                static {
                    Covode.recordClassIndex(7211);
                }

                {
                    this.f16107a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    C3265j jVar = (C3265j) obj;
                    C6493u uVar = this.f16107a.f16106a;
                    C89219l.m154716b(jVar, "");
                    uVar.mo12620a(jVar);
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((FrameLayout) m13870a(R.id.pf)).setOnClickListener(this.f16100b);
        RecyclerView recyclerView = (RecyclerView) m13870a(R.id.aqc);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        C6493u uVar = new C6493u(context);
        C6472b bVar = new C6472b(this);
        C89219l.m154721d(bVar, "");
        uVar.f16135d = bVar;
        RecyclerView recyclerView2 = (RecyclerView) m13870a(R.id.aqc);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(uVar);
        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).fetchMuteDurationList(new C6474c(uVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b7a, viewGroup, false);
    }
}
