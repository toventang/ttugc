package p4628j.p4629a.p4630a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.Collections;
import java.util.List;

/* renamed from: j.a.a.f */
public class C89399f extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public List<?> f203060b;

    /* renamed from: c */
    public AbstractC89404k f203061c;

    static {
        Covode.recordClassIndex(105483);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m154960a(this, viewGroup, i);
    }

    public C89399f() {
        this(Collections.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f203060b.size();
    }

    /* renamed from: a */
    public void mo17153a(List<?> list) {
        this.f203060b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        m154961a(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        m154961a(viewHolder).mo11656a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        m154961a(viewHolder).mo11658b(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        m154961a(viewHolder).mo11659c(viewHolder);
    }

    private C89399f(List<?> list) {
        this(list, new C89400g());
    }

    /* renamed from: a */
    private AbstractC89396c m154961a(RecyclerView.ViewHolder viewHolder) {
        return this.f203061c.mo143772a(viewHolder.getItemViewType());
    }

    /* renamed from: a */
    public final void mo143770a(Class<?> cls) {
        if (this.f203061c.mo143774a(cls)) {
            cls.getSimpleName();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        this.f203060b.get(i);
        this.f203061c.mo143772a(getItemViewType(i));
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        Object obj = this.f203060b.get(i);
        int b = this.f203061c.mo143775b(obj.getClass());
        if (b != -1) {
            return b + this.f203061c.mo143776b(b).mo60826a(obj);
        }
        throw new C89394a(obj.getClass());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        throw new IllegalAccessError("You should not call this method. Call RecyclerView.Adapter#onBindViewHolder(holder, position, payloads) instead.");
    }

    private C89399f(List<?> list, AbstractC89404k kVar) {
        this.f203060b = list;
        this.f203061c = kVar;
    }

    /* renamed from: a */
    public final <T> void mo143771a(Class<? extends T> cls, AbstractC89396c<T, ?> cVar) {
        mo143770a(cls);
        this.f203061c.mo143773a(cls, cVar, new C89395b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        this.f203061c.mo143772a(viewHolder.getItemViewType()).mo10468a(viewHolder, this.f203060b.get(i), list);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m154960a(C89399f fVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3690);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        AbstractC89396c<?, ?> a2 = fVar.f203061c.mo143772a(i);
        a2.f203059e = fVar;
        RecyclerView.ViewHolder a3 = a2.mo10368a(from, viewGroup);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a3.getClass().getName();
        MethodCollector.m26664o(3690);
        return a3;
    }
}
