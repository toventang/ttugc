package com.bytedance.android.live.effect.p244e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.C4142a;
import com.bytedance.android.live.effect.C4307m;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.p241b.C4180c;
import com.bytedance.android.live.effect.p242c.C4207i;
import com.bytedance.android.live.effect.p244e.C4255d;
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
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.android.live.effect.e.e */
public final class C4260e extends C10935a {

    /* renamed from: g */
    public static final C4261a f11777g = new C4261a((byte) 0);

    /* renamed from: a */
    public C11672a f11778a;

    /* renamed from: b */
    public final C4255d f11779b = new C4255d();

    /* renamed from: c */
    public String f11780c = "";

    /* renamed from: d */
    public String f11781d = "";

    /* renamed from: e */
    public String f11782e = "";

    /* renamed from: f */
    public AbstractC89171a<C89391z> f11783f;

    /* renamed from: h */
    private HashMap f11784h;

    static {
        Covode.recordClassIndex(4830);
    }

    /* renamed from: a */
    public final View mo9949a(int i) {
        if (this.f11784h == null) {
            this.f11784h = new HashMap();
        }
        View view = (View) this.f11784h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f11784h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.live.effect.e.e$a */
    public static final class C4261a {
        static {
            Covode.recordClassIndex(4831);
        }

        private C4261a() {
        }

        public /* synthetic */ C4261a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f11784h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.e.e$b */
    public static final class C4262b implements C4255d.AbstractC4257b {

        /* renamed from: a */
        final /* synthetic */ C4260e f11785a;

        static {
            Covode.recordClassIndex(4832);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4262b(C4260e eVar) {
            this.f11785a = eVar;
        }

        @Override // com.bytedance.android.live.effect.p244e.C4255d.AbstractC4257b
        /* renamed from: a */
        public final void mo9947a(C11672a aVar) {
            C89219l.m154721d(aVar, "");
            this.f11785a.f11778a = aVar;
            DataChannel a = C17846f.m33055a(this.f11785a);
            if (a != null) {
                a.mo28320c(C4307m.class, aVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.effect.e.e$c */
    static final class View$OnClickListenerC4263c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4260e f11786a;

        static {
            Covode.recordClassIndex(4833);
        }

        View$OnClickListenerC4263c(C4260e eVar) {
            this.f11786a = eVar;
        }

        public final void onClick(View view) {
            AbstractC0952i fragmentManager = this.f11786a.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.mo3552a().mo3455a(this.f11786a).mo3467b();
            }
            AbstractC89171a<C89391z> aVar = this.f11786a.f11783f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("live_effect_panel_info")) == null) {
            str = str2;
        }
        this.f11780c = str;
        Bundle arguments2 = getArguments();
        if (!(arguments2 == null || (string = arguments2.getString("live_effect_panel_name")) == null)) {
            str2 = string;
        }
        this.f11782e = str2;
    }

    /* renamed from: com.bytedance.android.live.effect.e.e$d */
    static final class C4264d extends AbstractC89220m implements AbstractC89172b<List<? extends C4315e<C11672a>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4260e f11787a;

        static {
            Covode.recordClassIndex(4834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4264d(C4260e eVar) {
            super(1);
            this.f11787a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C4315e<C11672a>> list) {
            T t;
            List<T> list2;
            T t2;
            T t3;
            String str;
            List<C11672a> b;
            T t4;
            List<? extends C4315e<C11672a>> list3 = list;
            C89219l.m154721d(list3, "");
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.f11861a, (Object) this.f11787a.f11782e)) {
                    break;
                }
            }
            T t5 = t;
            if (!(t5 == null || (list2 = t5.f11862b) == null)) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it2.next();
                    if (C89219l.m154714a((Object) this.f11787a.f11780c, (Object) t2.f27895c)) {
                        break;
                    }
                }
                T t6 = t2;
                if (t6 != null) {
                    C4260e eVar = this.f11787a;
                    String str2 = t6.f27897e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    eVar.f11781d = str2;
                    LiveTextView liveTextView = (LiveTextView) this.f11787a.mo9949a(R.id.cz4);
                    C89219l.m154716b(liveTextView, "");
                    liveTextView.setText(this.f11787a.f11781d);
                    List<C11672a> list4 = t6.f27907o;
                    if (list4 != null) {
                        C4260e eVar2 = this.f11787a;
                        C4180c a = C4180c.C4181a.m10258a();
                        if (a == null || (b = a.mo9847b(C4147a.f11586d)) == null) {
                            t3 = null;
                        } else {
                            Iterator<T> it3 = b.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    t4 = null;
                                    break;
                                }
                                t4 = it3.next();
                                if (C89219l.m154714a((Object) t4.f27916x, (Object) eVar2.f11780c)) {
                                    break;
                                }
                            }
                            t3 = t4;
                        }
                        Iterator<C11672a> it4 = list4.iterator();
                        int i = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i = -1;
                                break;
                            }
                            String str3 = it4.next().f27895c;
                            if (t3 != null) {
                                str = t3.f27895c;
                            } else {
                                str = null;
                            }
                            if (C89219l.m154714a((Object) str3, (Object) str)) {
                                break;
                            }
                            i++;
                        }
                        int b2 = C89271h.m154769b(i, 0);
                        this.f11787a.f11778a = list4.get(b2);
                        C4255d dVar = this.f11787a.f11779b;
                        C89219l.m154721d(list4, "");
                        C1445j.C1450d a2 = C1445j.m4922a(new C4243a(dVar.f11769a, list4), true);
                        C89219l.m154716b(a2, "");
                        a2.mo4951a(dVar);
                        dVar.f11769a.clear();
                        dVar.f11769a.addAll(list4);
                        dVar.f11770b = b2;
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C4255d dVar = this.f11779b;
        C4262b bVar = new C4262b(this);
        C89219l.m154721d(bVar, "");
        dVar.f11771c = bVar;
        RecyclerView recyclerView = (RecyclerView) mo9949a(R.id.e36);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        RecyclerView recyclerView2 = (RecyclerView) mo9949a(R.id.e36);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(this.f11779b);
        ((RecyclerView) mo9949a(R.id.e36)).mo4402a(new C4207i());
        RecyclerView recyclerView3 = (RecyclerView) mo9949a(R.id.e36);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setItemAnimator(null);
        LiveTextView liveTextView = (LiveTextView) mo9949a(R.id.cz4);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(this.f11781d);
        ((ImageView) mo9949a(R.id.pi)).setOnClickListener(new View$OnClickListenerC4263c(this));
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            a.mo28313b((AbstractC1204m) this, C4142a.class, (AbstractC89172b) new C4264d(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b7u, viewGroup, false);
    }
}
