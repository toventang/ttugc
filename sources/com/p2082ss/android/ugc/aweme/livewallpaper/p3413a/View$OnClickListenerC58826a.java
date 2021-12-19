package com.p2082ss.android.ugc.aweme.livewallpaper.p3413a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.a */
public final class View$OnClickListenerC58826a extends RecyclerView.AbstractC1350a<C58828b> implements View.OnClickListener {

    /* renamed from: c */
    private static final int f133911c = (C34723i.m70926a()[0] / 3);

    /* renamed from: d */
    private static final int f133912d = ((int) (((float) C34723i.m70926a()[0]) * 0.44f));

    /* renamed from: a */
    public List<LiveWallPaperBean> f133913a = new ArrayList();

    /* renamed from: b */
    public AbstractC58827a f133914b;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.a$a */
    public interface AbstractC58827a {
        static {
            Covode.recordClassIndex(69141);
        }

        /* renamed from: a */
        void mo96225a(LiveWallPaperBean liveWallPaperBean);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C58828b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m108040a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f133913a.size();
    }

    static {
        Covode.recordClassIndex(69140);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC58827a aVar = this.f133914b;
        if (aVar != null) {
            aVar.mo96225a((LiveWallPaperBean) view.getTag());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.a$b */
    public class C58828b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public RemoteImageView f133915a;

        static {
            Covode.recordClassIndex(69142);
        }

        public C58828b(View view) {
            super(view);
            this.f133915a = (RemoteImageView) view.findViewById(R.id.ehi);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C58828b bVar, int i) {
        LiveWallPaperBean liveWallPaperBean;
        C58828b bVar2 = bVar;
        if (i < this.f133913a.size() && i >= 0 && (liveWallPaperBean = this.f133913a.get(i)) != null) {
            if (TextUtils.isEmpty(liveWallPaperBean.getThumbnailPath())) {
                C34577e.m70593a(bVar2.f133915a, liveWallPaperBean.getThumbnailUrlModel(), f133911c, f133912d);
            } else {
                C34577e.m70608b(bVar2.f133915a, "file://" + liveWallPaperBean.getThumbnailPath(), f133911c, f133912d);
            }
            bVar2.itemView.setTag(liveWallPaperBean);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m108040a(View$OnClickListenerC58826a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5120);
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bjn, viewGroup, false);
        a2.setOnClickListener(aVar);
        C58828b bVar = new C58828b(a2);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
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
        MethodCollector.m26664o(5120);
        return bVar;
    }
}
