package p4550e.p4551a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4550e.p4553c.AbstractC88336a;
import p4550e.p4555e.AbstractC88339a;
import p4550e.p4555e.C88340b;
import p4550e.p4555e.C88342d;

/* renamed from: e.a.a */
public final class C88333a extends RecyclerView.AbstractC1350a<AbstractC88339a> {

    /* renamed from: a */
    public final List<C2972a> f200533a = new ArrayList();

    /* renamed from: b */
    public AbstractC88336a f200534b;

    /* renamed from: c */
    private final Context f200535c;

    /* renamed from: d */
    private final LayoutInflater f200536d;

    static {
        Covode.recordClassIndex(104372);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) i;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ AbstractC88339a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m153529a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f200533a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        C2972a aVar = this.f200533a.get(i);
        if (aVar == null) {
            return 2;
        }
        return aVar.f8738e;
    }

    public C88333a(Context context) {
        this.f200535c = context;
        this.f200536d = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(AbstractC88339a aVar, int i) {
        AbstractC88339a aVar2 = aVar;
        C2972a aVar3 = this.f200533a.get(i);
        if (aVar3 == null) {
            return;
        }
        if (aVar3.f8738e == 2) {
            aVar2.itemView.setVisibility(4);
            return;
        }
        aVar2.mo142856a(aVar3);
        AbstractC88336a aVar4 = this.f200534b;
        if (aVar4 != null) {
            aVar2.mo142857a(aVar4);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m153529a(C88333a aVar, ViewGroup viewGroup, int i) {
        AbstractC88339a aVar2;
        boolean a;
        MethodCollector.m26663i(9879);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) C11227ap.m19885a(aVar.f200535c, 62.0f));
        if (i != 0) {
            aVar2 = new C88340b(aVar.f200536d.inflate(R.layout.b_n, (ViewGroup) null));
            aVar2.itemView.setLayoutParams(layoutParams);
        } else {
            aVar2 = new C88342d(aVar.f200536d.inflate(R.layout.b_u, (ViewGroup) null));
            aVar2.itemView.setLayoutParams(layoutParams);
        }
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(9879);
        return aVar2;
    }
}
