package com.bytedance.android.livesdk.p433ac;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.p405s.p406a.C6096a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ac.b */
public final class C6584b extends RecyclerView.AbstractC1350a<AbstractC6583a> {

    /* renamed from: a */
    List<C6096a> f16464a = new ArrayList();

    /* renamed from: b */
    final List<C6096a> f16465b = new ArrayList();

    /* renamed from: c */
    AbstractC89172b<? super Boolean, C89391z> f16466c;

    /* renamed from: d */
    private final String f16467d;

    /* renamed from: e */
    private final long f16468e;

    /* renamed from: f */
    private final boolean f16469f;

    /* renamed from: g */
    private final long f16470g;

    static {
        Covode.recordClassIndex(7320);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ AbstractC6583a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m14079a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f16464a.size();
    }

    /* renamed from: a */
    public final void mo12740a(long j) {
        T t = null;
        for (T t2 : this.f16465b) {
            if (t2.f15231a == j) {
                t = t2;
            }
        }
        if (t != null) {
            this.f16465b.remove(t);
            this.f16464a.remove(t);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo12741a(List<C6096a> list) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.f15231a != this.f16468e) {
                    arrayList.add(t);
                }
            }
            List a = C89070n.m154553a((Iterable) arrayList, (Comparator) new C6585a());
            this.f16465b.clear();
            this.f16465b.addAll(a);
            this.f16464a.clear();
            this.f16464a.addAll(a);
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.b$a */
    public static final class C6585a<T> implements Comparator {
        static {
            Covode.recordClassIndex(7321);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(t.f15234d, t2.f15234d);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(AbstractC6583a aVar, int i) {
        AbstractC6583a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        aVar2.mo12739a(this.f16464a.get(i));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m14079a(C6584b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(1387);
        C89219l.m154721d(viewGroup, "");
        C6586c cVar = new C6586c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b9c, viewGroup, false), bVar.f16467d, bVar.f16468e, bVar.f16470g, bVar.f16469f);
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
        MethodCollector.m26664o(1387);
        return cVar;
    }

    public C6584b(String str, long j, boolean z, long j2) {
        C89219l.m154721d(str, "");
        this.f16467d = str;
        this.f16468e = j;
        this.f16469f = z;
        this.f16470g = j2;
    }
}
