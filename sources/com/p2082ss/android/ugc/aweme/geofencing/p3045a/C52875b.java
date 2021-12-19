package com.p2082ss.android.ugc.aweme.geofencing.p3045a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.geofencing.p3046b.C52880a;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.geofencing.a.b */
public final class C52875b extends RecyclerView.AbstractC1350a<C52876a> {

    /* renamed from: a */
    public final List<C52891a> f121635a;

    /* renamed from: b */
    public final C88958b<Boolean> f121636b;

    /* renamed from: c */
    private List<C52891a> f121637c;

    /* renamed from: d */
    private final List<C52891a> f121638d;

    static {
        Covode.recordClassIndex(62279);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C52876a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m97727a(viewGroup, i);
    }

    private /* synthetic */ C52875b() {
        this(C89086z.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f121637c.size();
    }

    /* renamed from: a */
    public final List<C52891a> mo88543a() {
        List<C52891a> list = this.f121635a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.getSelected()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.b$a */
    public static final class C52876a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f121639a;

        /* renamed from: b */
        public final ImageView f121640b;

        static {
            Covode.recordClassIndex(62280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52876a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.b_1);
            C89219l.m154716b(findViewById, "");
            this.f121639a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.b_2);
            C89219l.m154716b(findViewById2, "");
            this.f121640b = (ImageView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.b$b */
    public static final class C52877b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C52875b f121641a;

        static {
            Covode.recordClassIndex(62281);
        }

        public C52877b(C52875b bVar) {
            this.f121641a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            List<C52891a> list = this.f121641a.f121635a;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.getSelected()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.b$c */
    static final class View$OnClickListenerC52878c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52875b f121642a;

        /* renamed from: b */
        final /* synthetic */ C52891a f121643b;

        static {
            Covode.recordClassIndex(62282);
        }

        View$OnClickListenerC52878c(C52875b bVar, C52891a aVar) {
            this.f121642a = bVar;
            this.f121643b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C52891a aVar = this.f121643b;
            aVar.setSelected(!aVar.getSelected());
            this.f121642a.f121636b.onNext(Boolean.valueOf(this.f121643b.getSelected()));
            this.f121642a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo88544a(String str) {
        C89219l.m154721d(str, "");
        List<C52891a> list = this.f121635a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (C89361p.m154888a((CharSequence) t.getTranslation(), str, 0, true, 2) != -1) {
                arrayList.add(t);
            }
        }
        this.f121637c = arrayList;
        notifyDataSetChanged();
    }

    public C52875b(List<C52891a> list) {
        T t;
        C89219l.m154721d(list, "");
        this.f121638d = list;
        if (C52880a.f121646a.isEmpty()) {
            C52880a.m97734b();
        }
        List<C52891a> list2 = C52880a.f121646a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(C52891a.copy$default(it.next(), null, null, false, 7, null));
        }
        this.f121635a = arrayList;
        C88958b<Boolean> a = C88958b.m154214a((Object) false);
        C89219l.m154716b(a, "");
        this.f121636b = a;
        this.f121637c = arrayList;
        List<C52891a> list3 = this.f121638d;
        ArrayList<C52891a> arrayList2 = new ArrayList();
        for (T t2 : list3) {
            if (t2.getSelected()) {
                arrayList2.add(t2);
            }
        }
        for (C52891a aVar : arrayList2) {
            Iterator<T> it2 = this.f121635a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = null;
                    break;
                }
                t = it2.next();
                if (C89219l.m154714a((Object) t.getCode(), (Object) aVar.getCode())) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                t3.setSelected(true);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C52876a aVar, int i) {
        int i2;
        C52876a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C52891a aVar3 = this.f121637c.get(i);
        aVar2.f121639a.setText(aVar3.getTranslation());
        ImageView imageView = aVar2.f121640b;
        if (aVar3.getSelected()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC52878c(this, aVar3));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m97727a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10923);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_b, viewGroup, false);
        C89219l.m154716b(a2, "");
        C52876a aVar = new C52876a(a2);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(10923);
        return aVar;
    }
}
