package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.C54959d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a */
public final class C54956a extends AbstractC1483t<EnumC54957b, C54959d> {

    /* renamed from: b */
    private final TopChatNoticeSourceType f125799b;

    /* renamed from: c */
    private final SessionListTopNoticeViewModel f125800c;

    static {
        Covode.recordClassIndex(64680);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m100577a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) ((EnumC54957b) mo5017a(i)).hashCode();
    }

    public /* synthetic */ C54956a(TopChatNoticeSourceType topChatNoticeSourceType, SessionListTopNoticeViewModel sessionListTopNoticeViewModel) {
        this(topChatNoticeSourceType, sessionListTopNoticeViewModel, new C54958c());
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m100577a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3138);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a87, viewGroup, false);
        C89219l.m154716b(a2, "");
        C54959d dVar = new C54959d(a2);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = dVar.getClass().getName();
        MethodCollector.m26664o(3138);
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C54959d dVar = (C54959d) viewHolder;
        C89219l.m154721d(dVar, "");
        TopChatNoticeSourceType topChatNoticeSourceType = this.f125799b;
        Object a = mo5017a(i);
        C89219l.m154716b(a, "");
        EnumC54957b bVar = (EnumC54957b) a;
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel = this.f125800c;
        C89219l.m154721d(topChatNoticeSourceType, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(sessionListTopNoticeViewModel, "");
        dVar.f125808a.setOnClickListener(new C54959d.View$OnClickListenerC54961b(sessionListTopNoticeViewModel));
        dVar.f125809b.setOnClickListener(new C54959d.View$OnClickListenerC54962c(sessionListTopNoticeViewModel, topChatNoticeSourceType));
        TextView textView = dVar.f125810c;
        View view = dVar.itemView;
        C89219l.m154716b(view, "");
        textView.setText(view.getContext().getString(bVar.getTitle()));
        TextView textView2 = dVar.f125811d;
        View view2 = dVar.itemView;
        C89219l.m154716b(view2, "");
        textView2.setText(view2.getContext().getString(bVar.getDescription()));
        if (bVar.getButtonText() != 0) {
            dVar.f125808a.setVisibility(0);
            TuxButton tuxButton = dVar.f125808a;
            View view3 = dVar.itemView;
            C89219l.m154716b(view3, "");
            tuxButton.setText(view3.getContext().getString(bVar.getButtonText()));
            return;
        }
        dVar.f125808a.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C54956a(TopChatNoticeSourceType topChatNoticeSourceType, SessionListTopNoticeViewModel sessionListTopNoticeViewModel, C54958c cVar) {
        super(cVar);
        C89219l.m154721d(topChatNoticeSourceType, "");
        C89219l.m154721d(sessionListTopNoticeViewModel, "");
        C89219l.m154721d(cVar, "");
        this.f125799b = topChatNoticeSourceType;
        this.f125800c = sessionListTopNoticeViewModel;
        setHasStableIds(true);
    }
}
