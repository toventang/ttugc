package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.p025c.C0489d;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.av */
public final class View$OnClickListenerC72152av extends RecyclerView.AbstractC1350a<C72155c> implements View.OnClickListener {

    /* renamed from: a */
    public AbstractC72156d f161746a;

    /* renamed from: b */
    private ArrayList<C72153a> f161747b = new ArrayList<>();

    /* renamed from: c */
    private HashMap<String, C72153a> f161748c;

    /* renamed from: d */
    private C0489d<MvImageChooseAdapter.MyMediaModel> f161749d = new C0489d<>();

    /* renamed from: e */
    private int f161750e;

    /* renamed from: f */
    private Context f161751f;

    /* renamed from: g */
    private LayoutInflater f161752g;

    /* renamed from: h */
    private AbstractC72154b f161753h;

    /* renamed from: i */
    private C72153a f161754i = null;

    /* renamed from: j */
    private String f161755j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.av$b */
    public interface AbstractC72154b {
        static {
            Covode.recordClassIndex(84819);
        }

        /* renamed from: a */
        void mo114348a(C72153a aVar, boolean z, int i, boolean z2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.av$d */
    public interface AbstractC72156d {
        static {
            Covode.recordClassIndex(84821);
        }

        /* renamed from: a */
        void mo114350a(int i, AbstractC59174d dVar);
    }

    static {
        Covode.recordClassIndex(84817);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C72155c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m127323a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f161747b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.av$a */
    public static class C72153a {

        /* renamed from: a */
        String f161756a = "";

        /* renamed from: b */
        List<MvImageChooseAdapter.MyMediaModel> f161757b = new ArrayList();

        /* renamed from: c */
        List<MvImageChooseAdapter.MyMediaModel> f161758c = new ArrayList();

        static {
            Covode.recordClassIndex(84818);
        }

        C72153a() {
        }

        /* renamed from: a */
        public final List<MvImageChooseAdapter.MyMediaModel> mo114409a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < this.f161757b.size() && i2 < this.f161758c.size()) {
                MvImageChooseAdapter.MyMediaModel myMediaModel = this.f161757b.get(i);
                MvImageChooseAdapter.MyMediaModel myMediaModel2 = this.f161758c.get(i2);
                if (myMediaModel.f134666f >= myMediaModel2.f134666f) {
                    arrayList.add(myMediaModel);
                    i++;
                } else {
                    arrayList.add(myMediaModel2);
                    i2++;
                }
            }
            while (i < this.f161757b.size()) {
                arrayList.add(this.f161757b.get(i));
                i++;
            }
            while (i2 < this.f161758c.size()) {
                arrayList.add(this.f161758c.get(i2));
                i2++;
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    private C72153a m127324a() {
        if (this.f161747b.size() > 0) {
            return this.f161747b.get(0);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C72153a aVar = (C72153a) view.getTag();
        AbstractC72154b bVar = this.f161753h;
        if (bVar != null) {
            bVar.mo114348a(aVar, true, this.f161750e, true);
            this.f161754i = aVar;
        }
    }

    public View$OnClickListenerC72152av(Context context, AbstractC72154b bVar) {
        this.f161751f = context;
        this.f161752g = LayoutInflater.from(context);
        this.f161753h = bVar;
        C72153a aVar = new C72153a();
        String string = this.f161751f.getResources().getString(R.string.s8);
        this.f161755j = string;
        aVar.f161756a = string;
        this.f161747b.add(aVar);
        this.f161748c = new HashMap<>();
        Iterator<C72153a> it = this.f161747b.iterator();
        while (it.hasNext()) {
            C72153a next = it.next();
            this.f161748c.put(next.f161756a, next);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C72155c cVar, int i) {
        MvImageChooseAdapter.MyMediaModel myMediaModel;
        C72155c cVar2 = cVar;
        C72153a aVar = this.f161747b.get(i);
        cVar2.f161759a.setTag(aVar);
        cVar2.f161761c.setText(aVar.f161756a);
        cVar2.f161762d.setText(String.valueOf(aVar.f161757b.size() + aVar.f161758c.size()));
        if (aVar.f161757b.size() != 0 || aVar.f161758c.size() != 0) {
            if (C13617h.m24465a(aVar.f161757b)) {
                myMediaModel = aVar.f161758c.get(0);
            } else {
                myMediaModel = aVar.f161757b.get(0);
            }
            if (myMediaModel != null) {
                C84902i.m145889a(myMediaModel.f134662b, new C72157aw(cVar2, myMediaModel));
            }
        }
    }

    /* renamed from: a */
    private static void m127325a(C72153a aVar, MvImageChooseAdapter.MyMediaModel myMediaModel, int i) {
        if (myMediaModel != null) {
            if (i == 4) {
                aVar.f161758c.add(myMediaModel);
            } else if (i == 3) {
                aVar.f161757b.add(myMediaModel);
            } else if (i == 1) {
                aVar.f161757b.add(myMediaModel);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m127323a(View$OnClickListenerC72152av avVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9817);
        View a2 = C1764a.m5927a(avVar.f161752g, R.layout.aa9, viewGroup, false);
        C72155c cVar = new C72155c(a2, (AnimatedImageView) a2.findViewById(R.id.bwm), (TextView) a2.findViewById(R.id.bl_), (TextView) a2.findViewById(R.id.bl5));
        a2.setOnClickListener(avVar);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = cVar.getClass().getName();
        MethodCollector.m26664o(9817);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo114407a(List<MvImageChooseAdapter.MyMediaModel> list, int i, AbstractC59174d dVar) {
        MvImageChooseAdapter.MyMediaModel a;
        if (dVar == AbstractC59174d.C59176b.f134653a) {
            Iterator<C72153a> it = this.f161747b.iterator();
            while (it.hasNext()) {
                C72153a next = it.next();
                if (i == 4) {
                    next.f161758c.clear();
                } else if (i == 3) {
                    next.f161757b.clear();
                } else if (i == 1) {
                    next.f161757b.clear();
                }
                if (next.f161757b.size() + next.f161758c.size() == 0 && !TextUtils.equals(next.f161756a, this.f161755j)) {
                    it.remove();
                    this.f161748c.remove(next.f161756a);
                }
            }
        }
        C72153a aVar = this.f161747b.get(0);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (MvImageChooseAdapter.MyMediaModel myMediaModel : list) {
            try {
                if (dVar == AbstractC59174d.C59175a.f134652a) {
                    this.f161749d.mo2083b(Long.parseLong(myMediaModel.f134661a), myMediaModel);
                } else if (this.f161749d.mo2080b() > 0 && (a = this.f161749d.mo2077a(Long.parseLong(myMediaModel.f134661a))) != null) {
                    this.f161749d.mo2082b(Long.parseLong(myMediaModel.f134661a));
                    myMediaModel = a;
                }
            } catch (NumberFormatException unused) {
            }
            m127325a(aVar, myMediaModel, i);
            String str = myMediaModel.f134665e;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            C72153a aVar2 = this.f161748c.get(str);
            if (aVar2 == null) {
                aVar2 = new C72153a();
                aVar2.f161756a = str;
                arrayList.add(aVar2);
                this.f161748c.put(str, aVar2);
            }
            m127325a(aVar2, myMediaModel, i);
            hashSet.add(aVar2);
        }
        this.f161750e |= 1 << i;
        this.f161747b.addAll(arrayList);
        notifyDataSetChanged();
        AbstractC72154b bVar = this.f161753h;
        if (bVar != null) {
            C72153a aVar3 = this.f161754i;
            if (aVar3 == null) {
                bVar.mo114348a(m127324a(), false, this.f161750e, true);
                this.f161754i = m127324a();
            } else if (hashSet.contains(aVar3) || this.f161754i == m127324a()) {
                this.f161753h.mo114348a(this.f161754i, false, this.f161750e, false);
            }
        }
        AbstractC72156d dVar2 = this.f161746a;
        if (dVar2 != null) {
            dVar2.mo114350a(i, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.av$c */
    public static class C72155c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f161759a;

        /* renamed from: b */
        AnimatedImageView f161760b;

        /* renamed from: c */
        TextView f161761c;

        /* renamed from: d */
        TextView f161762d;

        static {
            Covode.recordClassIndex(84820);
        }

        C72155c(View view, AnimatedImageView animatedImageView, TextView textView, TextView textView2) {
            super(view);
            this.f161759a = view;
            this.f161760b = animatedImageView;
            this.f161761c = textView;
            this.f161762d = textView2;
        }
    }
}
