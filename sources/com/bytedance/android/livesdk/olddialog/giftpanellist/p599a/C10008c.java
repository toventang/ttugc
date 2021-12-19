package com.bytedance.android.livesdk.olddialog.giftpanellist.p599a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.a.c */
public final class C10008c extends AbstractC10004a {
    static {
        Covode.recordClassIndex(11562);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a
    public final /* synthetic */ AbstractC10019b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m18503a(this, viewGroup, i);
    }

    public C10008c(Context context, AbstractC10004a.AbstractC10006a aVar) {
        super(context, aVar, false);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a
    /* renamed from: a */
    public final AbstractC10019b mo16817a(ViewGroup viewGroup, int i) {
        AbstractC10019b a = super.mo16817a(viewGroup, i);
        a.itemView.setLayoutParams(new ViewGroup.LayoutParams((int) C13628n.m24520b(this.f24303c, 93.0f), (int) C13628n.m24520b(this.f24303c, 110.0f)));
        return a;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m18503a(C10008c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5961);
        AbstractC10019b a2 = cVar.mo16817a(viewGroup, i);
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
        MethodCollector.m26664o(5961);
        return a2;
    }
}
