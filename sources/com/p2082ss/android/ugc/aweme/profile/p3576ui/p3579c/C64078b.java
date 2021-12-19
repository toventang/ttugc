package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c.C64079c;
import com.p2082ss.android.ugc.aweme.profile.widgets.View$OnClickListenerC64881j;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.c.b */
public final class C64078b extends RecyclerView.AbstractC1350a<C64079c.C64081b> {

    /* renamed from: a */
    final List<C80053c> f145381a = new ArrayList();

    /* renamed from: b */
    public final WeakReference<View$OnClickListenerC64881j.AbstractC64883b> f145382b;

    /* renamed from: c */
    public final C63511a f145383c;

    /* renamed from: d */
    public final ActivityC0945e f145384d;

    static {
        Covode.recordClassIndex(75522);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C64079c.C64081b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m115988a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f145381a.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C64079c.C64081b bVar, int i) {
        C64079c.C64081b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        C80053c cVar = this.f145381a.get(i);
        if (C89219l.m154714a((Object) cVar.f179384a, (Object) "-1")) {
            bVar2.f145390a.setImageResource(2131232607);
            bVar2.f145391b.setText(R.string.d5d);
            bVar2.f145392c.setVisibility(8);
        } else {
            C34577e.m70608b(bVar2.f145390a, cVar.f179388e, -1, -1);
            bVar2.f145391b.setVisibility(0);
            bVar2.f145391b.setText(cVar.mo123504a());
            bVar2.f145392c.setText(cVar.f179387d);
        }
        bVar2.f145393d.setVisibility(8);
        bVar2.f145394e.setVisibility(8);
        View view = bVar2.itemView;
        WeakReference<View$OnClickListenerC64881j.AbstractC64883b> weakReference = this.f145382b;
        View view2 = bVar2.itemView;
        C89219l.m154716b(view2, "");
        Context context = view2.getContext();
        C89219l.m154716b(context, "");
        view.setOnClickListener(new View$OnClickListenerC64881j(weakReference, cVar, context, this.f145384d, this.f145383c));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m115988a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(7738);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ann, viewGroup, false);
        C89219l.m154716b(a2, "");
        C64079c.C64081b bVar = new C64079c.C64081b(a2);
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
        MethodCollector.m26664o(7738);
        return bVar;
    }

    public C64078b(WeakReference<View$OnClickListenerC64881j.AbstractC64883b> weakReference, C63511a aVar, ActivityC0945e eVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(eVar, "");
        this.f145382b = weakReference;
        this.f145383c = aVar;
        this.f145384d = eVar;
    }
}
