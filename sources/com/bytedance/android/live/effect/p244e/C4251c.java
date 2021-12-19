package com.bytedance.android.live.effect.p244e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.effect.C4142a;
import com.bytedance.android.live.effect.C4307m;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.p244e.C4244b;
import com.bytedance.android.live.effect.p245f.C4278b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.e.c */
public final class C4251c extends C10935a {

    /* renamed from: c */
    public static final C4252a f11763c = new C4252a((byte) 0);

    /* renamed from: a */
    public String f11764a;

    /* renamed from: b */
    public final C4244b f11765b = new C4244b();

    /* renamed from: d */
    private HashMap f11766d;

    static {
        Covode.recordClassIndex(4821);
    }

    /* renamed from: a */
    private View m10357a() {
        if (this.f11766d == null) {
            this.f11766d = new HashMap();
        }
        View view = (View) this.f11766d.get(Integer.valueOf((int) R.id.e36));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.e36);
        this.f11766d.put(Integer.valueOf((int) R.id.e36), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.live.effect.e.c$a */
    public static final class C4252a {
        static {
            Covode.recordClassIndex(4822);
        }

        private C4252a() {
        }

        public /* synthetic */ C4252a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f11766d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.e.c$b */
    public static final class C4253b implements C4244b.AbstractC4246b {

        /* renamed from: a */
        final /* synthetic */ C4251c f11767a;

        static {
            Covode.recordClassIndex(4823);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4253b(C4251c cVar) {
            this.f11767a = cVar;
        }

        @Override // com.bytedance.android.live.effect.p244e.C4244b.AbstractC4246b
        /* renamed from: a */
        public final void mo9944a(C11672a aVar) {
            C89219l.m154721d(aVar, "");
            DataChannel a = C17846f.m33055a(this.f11767a);
            if (a != null) {
                a.mo28320c(C4307m.class, aVar);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m10358a(C4251c cVar) {
        String str = cVar.f11764a;
        if (str == null) {
            C89219l.m154710a("effectPanelName");
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("live_effect_panel_name")) == null) {
            str = "";
        }
        this.f11764a = str;
    }

    /* renamed from: com.bytedance.android.live.effect.e.c$c */
    static final class C4254c extends AbstractC89220m implements AbstractC89172b<List<? extends C4315e<C11672a>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4251c f11768a;

        static {
            Covode.recordClassIndex(4824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4254c(C4251c cVar) {
            super(1);
            this.f11768a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C4315e<C11672a>> list) {
            T t;
            List<T> list2;
            List<? extends C4315e<C11672a>> list3 = list;
            C89219l.m154721d(list3, "");
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.f11861a, (Object) C4251c.m10358a(this.f11768a))) {
                    break;
                }
            }
            T t2 = t;
            if (!(t2 == null || (list2 = t2.f11862b) == null)) {
                C4244b bVar = this.f11768a.f11765b;
                int a = C4278b.m10377a(C4251c.m10358a(this.f11768a), list2);
                C89219l.m154721d(list2, "");
                bVar.f11753b = a;
                C1445j.C1450d a2 = C1445j.m4922a(new C4243a(bVar.f11752a, list2), true);
                C89219l.m154716b(a2, "");
                a2.mo4951a(bVar);
                bVar.f11752a.clear();
                bVar.f11752a.addAll(list2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C4244b bVar = this.f11765b;
        C4253b bVar2 = new C4253b(this);
        C89219l.m154721d(bVar2, "");
        bVar.f11754c = bVar2;
        RecyclerView recyclerView = (RecyclerView) m10357a();
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        RecyclerView recyclerView2 = (RecyclerView) m10357a();
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(this.f11765b);
        RecyclerView recyclerView3 = (RecyclerView) m10357a();
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setItemAnimator(null);
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            a.mo28313b((AbstractC1204m) this, C4142a.class, (AbstractC89172b) new C4254c(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b7t, viewGroup, false);
    }
}
