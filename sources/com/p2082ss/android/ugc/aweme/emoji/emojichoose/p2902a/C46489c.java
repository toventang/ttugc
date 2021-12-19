package com.p2082ss.android.ugc.aweme.emoji.emojichoose.p2902a;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.a.c */
public final class C46489c extends RecyclerView.AbstractC1350a<C46490a> {

    /* renamed from: a */
    public int f108343a;

    /* renamed from: b */
    public int f108344b;

    /* renamed from: c */
    public int f108345c;

    /* renamed from: d */
    public List<C46487a> f108346d = new ArrayList();

    static {
        Covode.recordClassIndex(55074);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C46490a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m89737a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f108346d.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.a.c$a */
    public static class C46490a extends C46450d<C46487a> {

        /* renamed from: a */
        private ImageView f108347a;

        /* renamed from: b */
        private int f108348b;

        /* renamed from: c */
        private int f108349c;

        static {
            Covode.recordClassIndex(55075);
        }

        C46490a(View view) {
            super(view);
            Resources resources = view.getResources();
            this.f108347a = (ImageView) view.findViewById(R.id.bwt);
            this.f108348b = resources.getDimensionPixelSize(R.dimen.je);
            this.f108349c = resources.getDimensionPixelSize(R.dimen.jf);
        }

        /* renamed from: a */
        public final void mo78980a(C46487a aVar) {
            int i;
            super.mo78980a((Object) aVar);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f108347a.getLayoutParams();
            if (aVar.f108341b == R.drawable.a7b) {
                i = this.f108349c;
            } else {
                i = this.f108348b;
            }
            layoutParams.height = i;
            layoutParams.width = i;
            this.f108347a.setLayoutParams(layoutParams);
            this.f108347a.setSelected(aVar.f108340a);
            this.f108347a.setImageResource(aVar.f108341b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C46490a aVar, int i) {
        aVar.mo78980a(this.f108346d.get(i));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m89737a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(12720);
        C46490a aVar = new C46490a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.yh, viewGroup, false));
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
        MethodCollector.m26664o(12720);
        return aVar;
    }
}
