package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b */
public abstract class AbstractC39713b extends RecyclerView.AbstractC1350a<C39723h> {

    /* renamed from: a */
    private final SparseArray<AbstractC39714c.AbstractC39715a> f93563a = new SparseArray<>();

    /* renamed from: b */
    private final HashMap<Class<? extends AbstractC39714c>, Integer> f93564b = new HashMap<>();

    /* renamed from: c */
    public final ArrayList<AbstractC39714c> f93565c = new ArrayList<>();

    /* renamed from: d */
    public final Context f93566d;

    /* renamed from: e */
    private int f93567e;

    static {
        Covode.recordClassIndex(47440);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ C39723h onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m80596a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f93565c.size();
    }

    /* renamed from: a */
    public final void mo69092a() {
        int size = this.f93565c.size();
        for (int i = 0; i < size; i++) {
            notifyItemChanged(i, null);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewAttachedToWindow(C39723h hVar) {
        C39723h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        super.onViewAttachedToWindow(hVar2);
    }

    public AbstractC39713b(Context context) {
        C89219l.m154721d(context, "");
        this.f93566d = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        AbstractC39714c cVar = this.f93565c.get(i);
        C89219l.m154716b(cVar, "");
        return m80598b(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewDetachedFromWindow(C39723h hVar) {
        C39723h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        super.onViewDetachedFromWindow(hVar2);
        if (hVar2 instanceof AbstractC39722g) {
            ((AbstractC39722g) hVar2).mo69104a();
        }
    }

    /* renamed from: b */
    private int m80598b(AbstractC39714c cVar) {
        C89219l.m154721d(cVar, "");
        Class<?> cls = cVar.getClass();
        if (!this.f93564b.containsKey(cls)) {
            this.f93564b.put(cls, Integer.valueOf(this.f93567e));
            this.f93567e++;
        }
        Integer num = this.f93564b.get(cls);
        if (num == null) {
            C89219l.m154715b();
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69093a(AbstractC39714c cVar) {
        C89219l.m154721d(cVar, "");
        this.f93565c.add(cVar);
        if (this.f93563a.get(m80598b(cVar)) == null) {
            this.f93563a.put(m80598b(cVar), cVar.mo69094a());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m80597a(AbstractC39713b bVar, AbstractC39714c cVar) {
        C89219l.m154721d(cVar, "");
        int indexOf = bVar.f93565c.indexOf(cVar);
        if (indexOf >= 0 && indexOf < bVar.f93565c.size()) {
            bVar.notifyItemChanged(indexOf, null);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(C39723h hVar, int i) {
        C39723h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        this.f93565c.get(i).mo69095a(hVar2, i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m80596a(AbstractC39713b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        C89219l.m154721d(viewGroup, "");
        C39723h a2 = bVar.f93563a.get(i).mo69096a(bVar.f93566d, viewGroup);
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        return a2;
    }
}
