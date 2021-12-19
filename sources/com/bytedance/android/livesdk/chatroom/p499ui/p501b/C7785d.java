package com.bytedance.android.livesdk.chatroom.p499ui.p501b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p499ui.p501b.C7786e;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.d */
public final class C7785d extends RecyclerView.AbstractC1350a<C7786e> {

    /* renamed from: a */
    final List<C9537au> f19309a = new ArrayList();

    /* renamed from: b */
    public AbstractC89172b<? super C9537au, C89391z> f19310b;

    static {
        Covode.recordClassIndex(8580);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C7786e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m15848a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f19309a.size();
    }

    public C7785d(AbstractC89172b<? super C9537au, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f19310b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C7786e eVar, int i) {
        C7786e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        C9537au auVar = this.f19309a.get(i);
        AbstractC89172b<? super C9537au, C89391z> bVar = this.f19310b;
        C89219l.m154721d(auVar, "");
        C89219l.m154721d(bVar, "");
        HSImageView hSImageView = eVar2.f19311a;
        ImageModel imageModel = auVar.f23159a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (imageModel != null && !C13603b.m24435a((Collection) imageModel.getUrls())) {
            C3951p.m9625a(hSImageView, imageModel, -1, -1, false, 0, scaleType, null);
        }
        eVar2.itemView.setOnClickListener(new C7786e.View$OnClickListenerC7787a(bVar, auVar));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m15848a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(1468);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdb, viewGroup, false);
        C89219l.m154716b(a2, "");
        C7786e eVar = new C7786e(a2);
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
        MethodCollector.m26664o(1468);
        return eVar;
    }
}
