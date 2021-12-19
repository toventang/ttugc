package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.qna.model.C66299k;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66307e;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.c */
public final class C66304c extends AbstractC1483t<C66299k, C66307e> {

    /* renamed from: b */
    private final AbstractC66363i f149082b;

    /* renamed from: c */
    private final String f149083c;

    static {
        Covode.recordClassIndex(77815);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m117973a(this, viewGroup, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66304c(AbstractC66363i iVar, String str) {
        super(C66305d.f149084a);
        C89219l.m154721d(iVar, "");
        this.f149082b = iVar;
        this.f149083c = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C66307e eVar = (C66307e) viewHolder;
        C89219l.m154721d(eVar, "");
        Object a = mo5017a(i);
        C89219l.m154716b(a, "");
        C66299k kVar = (C66299k) a;
        AbstractC66363i iVar = this.f149082b;
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(iVar, "");
        SmartImageView smartImageView = (SmartImageView) eVar.f149085a.findViewById(R.id.kf);
        smartImageView.setImageURI(Uri.parse(kVar.f149075c));
        smartImageView.setOnClickListener(new C66307e.View$OnClickListenerC66308a(eVar, iVar, kVar));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m117973a(C66304c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11056);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aq4, viewGroup, false);
        C89219l.m154716b(a2, "");
        C66307e eVar = new C66307e(a2, cVar.f149083c);
        try {
            if (eVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(eVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) eVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(eVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = eVar.getClass().getName();
        MethodCollector.m26664o(11056);
        return eVar;
    }
}
