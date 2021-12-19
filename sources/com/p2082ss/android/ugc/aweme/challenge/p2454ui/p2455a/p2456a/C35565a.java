package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.p2456a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.p2456a.C35566b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a.a */
public final class C35565a extends RecyclerView.AbstractC1350a<C35566b> {

    /* renamed from: a */
    public final List<Aweme> f83878a = new ArrayList();

    /* renamed from: b */
    public final C35566b.AbstractC35569b f83879b;

    /* renamed from: c */
    private final boolean f83880c = true;

    static {
        Covode.recordClassIndex(42789);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C35566b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m72674a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f83878a.size();
    }

    public C35565a(C35566b.AbstractC35569b bVar) {
        C89219l.m154721d(bVar, "");
        this.f83879b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C35566b bVar, int i) {
        C35566b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        Aweme aweme = this.f83878a.get(i);
        if (aweme != null && aweme.getVideo() != null) {
            AnimatedImageView animatedImageView = bVar2.f83882a;
            Video video = aweme.getVideo();
            C89219l.m154716b(video, "");
            C34577e.m70592a(animatedImageView, video.getCover());
            bVar2.f83883b = aweme;
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m72674a(C35565a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(1416);
        C89219l.m154721d(viewGroup, "");
        C35566b.AbstractC35569b bVar = aVar.f83879b;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(bVar, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.n6, viewGroup, false);
        C89219l.m154716b(a2, "");
        C35566b bVar2 = new C35566b(a2, bVar);
        try {
            if (bVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar2.getClass().getName();
        MethodCollector.m26664o(1416);
        return bVar2;
    }
}
