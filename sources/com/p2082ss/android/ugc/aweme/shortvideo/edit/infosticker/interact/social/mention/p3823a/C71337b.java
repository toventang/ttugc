package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3823a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.b */
public final class C71337b extends RecyclerView.AbstractC1350a<C71338a> {
    static {
        Covode.recordClassIndex(83860);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return 10;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C71338a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m126036a(this, viewGroup, i);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C71338a aVar, int i) {
        C71338a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        TextView textView = aVar2.f159881a;
        C84966b a = C84966b.C84967a.m146038a().mo129752a(0);
        Context context = aVar2.f159881a.getContext();
        C89219l.m154716b(context, "");
        textView.setBackground(a.mo129751a(C84912r.m145930a(context, 2.0f)).mo129755b(aVar2.f159881a.getResources().getColor(R.color.c9)).mo129750a());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.b$a */
    public final class C71338a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f159881a;

        /* renamed from: b */
        public final View f159882b;

        /* renamed from: c */
        public final C71337b f159883c;

        /* renamed from: d */
        final /* synthetic */ C71337b f159884d;

        static {
            Covode.recordClassIndex(83861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71338a(C71337b bVar, View view, C71337b bVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(bVar2, "");
            this.f159884d = bVar;
            this.f159882b = view;
            this.f159883c = bVar2;
            View findViewById = view.findViewById(R.id.esb);
            C89219l.m154716b(findViewById, "");
            this.f159881a = (TextView) findViewById;
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m126036a(C71337b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(12156);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9e, viewGroup, false);
        C89219l.m154716b(a2, "");
        C71338a aVar = new C71338a(bVar, a2, bVar);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(12156);
        return aVar;
    }
}
