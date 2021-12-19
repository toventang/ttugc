package com.p2082ss.android.ugc.aweme.effect;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.AVStatusView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.c */
public abstract class AbstractC46335c extends Fragment implements AbstractC46311b, AbstractC46380u {

    /* renamed from: h */
    public static final C46336a f108000h = new C46336a((byte) 0);

    /* renamed from: a */
    public String f108001a;

    /* renamed from: b */
    public List<? extends Effect> f108002b;

    /* renamed from: c */
    public LinearLayoutManager f108003c;

    /* renamed from: d */
    public List<? extends EffectModel> f108004d = C89086z.INSTANCE;

    /* renamed from: e */
    public boolean f108005e = true;

    /* renamed from: f */
    public C46300a f108006f;

    /* renamed from: g */
    public final ArrayList<EffectPointModel> f108007g = new ArrayList<>();

    /* renamed from: i */
    private AVStatusView f108008i;

    /* renamed from: j */
    private HashMap f108009j;

    static {
        Covode.recordClassIndex(54912);
    }

    /* renamed from: a */
    public abstract void mo78820a(C1445j.C1450d dVar, List<? extends EffectModel> list);

    /* renamed from: b */
    public View mo78822b(int i) {
        if (this.f108009j == null) {
            this.f108009j = new HashMap();
        }
        View view = (View) this.f108009j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f108009j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public void mo78827f() {
        HashMap hashMap = this.f108009j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo78827f();
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c$a */
    public static final class C46336a {
        static {
            Covode.recordClassIndex(54913);
        }

        private C46336a() {
        }

        public /* synthetic */ C46336a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46380u
    /* renamed from: d */
    public final List<EffectPointModel> mo78825d() {
        return this.f108007g;
    }

    /* renamed from: a */
    public final String mo78818a() {
        String str = this.f108001a;
        if (str == null) {
            C89219l.m154710a("mCategory");
        }
        return str;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>, java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* renamed from: b */
    public final List<Effect> mo78823b() {
        List list = this.f108002b;
        if (list == null) {
            C89219l.m154710a("mEffectList");
        }
        return list;
    }

    /* renamed from: c */
    public final LinearLayoutManager mo78824c() {
        LinearLayoutManager linearLayoutManager = this.f108003c;
        if (linearLayoutManager == null) {
            C89219l.m154710a("mLinearLayoutManager");
        }
        return linearLayoutManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C46300a aVar = this.f108006f;
        if (aVar != null) {
            aVar.mo78793b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo78826e() {
        mo78873a(true);
        List<? extends Effect> list = this.f108002b;
        if (list == null) {
            C89219l.m154710a("mEffectList");
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            String str = this.f108001a;
            if (str == null) {
                C89219l.m154710a("mCategory");
            }
            EffectModel a = C46360i.m89446a(i, t2, str);
            C89219l.m154716b(a, "");
            List<? extends EffectModel> list2 = this.f108004d;
            List<? extends EffectModel> g = C89070n.m154585g((Collection) list2);
            g.add(a);
            C1445j.C1450d a2 = C1445j.m4922a(new C46366o(list2, g), true);
            C89219l.m154716b(a2, "");
            mo78820a(a2, g);
            AVDmtPanelRecycleView aVDmtPanelRecycleView = (AVDmtPanelRecycleView) mo78822b(R.id.dh0);
            if (aVDmtPanelRecycleView != null && aVDmtPanelRecycleView.getVisibility() == 8) {
                mo78873a(false);
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final void mo78821a(List<? extends EffectModel> list) {
        C89219l.m154721d(list, "");
        this.f108004d = list;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            if (!editEffectVideoModel.mo78625b()) {
                AbstractC63278f f = C63244g.m114602a().mo73278f();
                C89219l.m154716b(activity, "");
                editEffectVideoModel.mo78624a(f.mo73331a(activity));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("effect_list");
            if (parcelableArrayList == null) {
                C89219l.m154715b();
            }
            this.f108002b = parcelableArrayList;
            String string = arguments.getString("effect_category");
            if (string == null) {
                C89219l.m154715b();
            }
            this.f108001a = string;
            this.f108005e = arguments.getBoolean("motio_toast", true);
        }
        this.f108007g.clear();
        C46300a aVar = this.f108006f;
        if (aVar != null) {
            aVar.mo78789a(this);
        }
    }

    /* renamed from: a */
    private void mo78873a(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo78822b(R.id.cfd);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(0);
            AVDmtPanelRecycleView aVDmtPanelRecycleView = (AVDmtPanelRecycleView) mo78822b(R.id.dh0);
            C89219l.m154716b(aVDmtPanelRecycleView, "");
            aVDmtPanelRecycleView.setVisibility(8);
            AVStatusView aVStatusView = this.f108008i;
            if (aVStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            aVStatusView.mo129846b();
            return;
        }
        AVStatusView aVStatusView2 = this.f108008i;
        if (aVStatusView2 == null) {
            C89219l.m154710a("mStatusView");
        }
        aVStatusView2.mo129845a();
        LinearLayout linearLayout2 = (LinearLayout) mo78822b(R.id.cfd);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setVisibility(8);
        AVDmtPanelRecycleView aVDmtPanelRecycleView2 = (AVDmtPanelRecycleView) mo78822b(R.id.dh0);
        C89219l.m154716b(aVDmtPanelRecycleView2, "");
        aVDmtPanelRecycleView2.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a, "");
            ArrayList<EffectPointModel> arrayList = this.f108007g;
            ArrayList<EffectPointModel> g = ((EditEffectVideoModel) a).mo78623a().mo78856g();
            ArrayList arrayList2 = new ArrayList();
            for (T t : g) {
                T t2 = t;
                String str = this.f108001a;
                if (str == null) {
                    C89219l.m154710a("mCategory");
                }
                if (C89219l.m154714a((Object) str, (Object) t2.getCategory())) {
                    arrayList2.add(t);
                }
            }
            arrayList.addAll(arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78819a(int i) {
        C46300a aVar;
        AbstractC46415f a;
        C63244g.m114602a().mo73295w();
        if (C63244g.m114602a().mo73278f().mo73334c() >= 0) {
            List<? extends Effect> list = this.f108002b;
            if (list == null) {
                C89219l.m154710a("mEffectList");
            }
            int size = list.size();
            for (int i2 = i + 1; i2 < size; i2++) {
                if (!(this.f108006f == null || (a = C46300a.C46301a.m89337a()) == null)) {
                    List<? extends Effect> list2 = this.f108002b;
                    if (list2 == null) {
                        C89219l.m154710a("mEffectList");
                    }
                    if (a.mo78914a((Effect) list2.get(i2))) {
                    }
                }
                if (!(i2 == -1 || (aVar = this.f108006f) == null)) {
                    List<? extends Effect> list3 = this.f108002b;
                    if (list3 == null) {
                        C89219l.m154710a("mEffectList");
                    }
                    aVar.mo78790a((Effect) list3.get(i2));
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        this.f108003c = linearLayoutManager;
        RecyclerView recyclerView = (RecyclerView) mo78822b(R.id.dh0);
        C89219l.m154716b(recyclerView, "");
        LinearLayoutManager linearLayoutManager2 = this.f108003c;
        if (linearLayoutManager2 == null) {
            C89219l.m154710a("mLinearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a0y, viewGroup, false);
        View findViewById = a.findViewById(R.id.cfy);
        C89219l.m154716b(findViewById, "");
        AVStatusView aVStatusView = (AVStatusView) findViewById;
        this.f108008i = aVStatusView;
        if (aVStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        AVStatusView.C84988a a2 = AVStatusView.C84988a.m146075a(getContext());
        a2.f190052g = 1;
        aVStatusView.setBuilder(a2);
        return a;
    }
}
