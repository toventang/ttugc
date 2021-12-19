package com.p2082ss.android.ugc.aweme.ecommerce.address.candinput;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a.AbstractView$OnClickListenerC43350a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a.C43351b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a.C43352c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a.C43353d;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43368d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.a */
public final class C43348a extends RecyclerView.AbstractC1350a<AbstractView$OnClickListenerC43350a> {

    /* renamed from: d */
    public static final C43349a f101177d = new C43349a((byte) 0);

    /* renamed from: a */
    public List<C43368d> f101178a;

    /* renamed from: b */
    public boolean f101179b;

    /* renamed from: c */
    AbstractC43354b f101180c;

    static {
        Covode.recordClassIndex(51568);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) i;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ AbstractView$OnClickListenerC43350a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m86468a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.a$a */
    public static final class C43349a {
        static {
            Covode.recordClassIndex(51569);
        }

        private C43349a() {
        }

        public /* synthetic */ C43349a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<C43368d> list = this.f101178a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    private final C43368d m86469a(int i) {
        List<C43368d> list = this.f101178a;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        Integer num;
        C43368d a = m86469a(i);
        if (a == null || (num = a.f101220a) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    private static View m86467a(ViewGroup viewGroup, int i) {
        return C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(AbstractView$OnClickListenerC43350a aVar, int i) {
        AbstractView$OnClickListenerC43350a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        aVar2.mo73869a(m86469a(i), getItemCount());
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m86468a(C43348a aVar, ViewGroup viewGroup, int i) {
        AbstractView$OnClickListenerC43350a bVar;
        MethodCollector.m26663i(10079);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == -2) {
            View a = m86467a(viewGroup, R.layout.nr);
            C89219l.m154716b(a, "");
            bVar = new C43351b(a);
        } else if (i == 1) {
            View a2 = m86467a(viewGroup, R.layout.ns);
            C89219l.m154716b(a2, "");
            bVar = new C43352c(a2);
        } else if (i == 2) {
            View a3 = m86467a(viewGroup, R.layout.nt);
            C89219l.m154716b(a3, "");
            bVar = new C43353d(a3);
        } else {
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(10079);
            throw assertionError;
        }
        bVar.f101181a = aVar.f101180c;
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(10079);
        return bVar;
    }
}
