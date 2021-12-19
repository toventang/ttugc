package com.p2082ss.android.ugc.trill.language.p4381a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.language.C53451b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.a.a */
public final class C85091a extends RecyclerView.AbstractC1350a<C85094b> {

    /* renamed from: a */
    public ArrayList<C53451b> f190372a;

    /* renamed from: b */
    public AbstractC85093a f190373b;

    /* renamed from: c */
    private Context f190374c;

    /* renamed from: com.ss.android.ugc.trill.language.a.a$a */
    public interface AbstractC85093a {
        static {
            Covode.recordClassIndex(99116);
        }

        /* renamed from: b */
        void mo130032b(int i);
    }

    static {
        Covode.recordClassIndex(99114);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C85094b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m146311a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        ArrayList<C53451b> arrayList = this.f190372a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.trill.language.a.a$b */
    public static class C85094b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f190377a;

        /* renamed from: b */
        ImageView f190378b;

        static {
            Covode.recordClassIndex(99117);
        }

        public C85094b(View view) {
            super(view);
            int i;
            this.f190377a = (TextView) view.findViewById(R.id.eyc);
            this.f190378b = (ImageView) view.findViewById(R.id.bz8);
            TextView textView = this.f190377a;
            Context context = view.getContext();
            if (C17175b.m31708b(view.getContext())) {
                i = R.color.ae;
            } else {
                i = R.color.a_;
            }
            textView.setTextColor(C0643b.m2378c(context, i));
        }
    }

    public C85091a(Context context, AbstractC85093a aVar) {
        this.f190374c = context;
        this.f190373b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C85094b bVar, final int i) {
        C85094b bVar2 = bVar;
        if (getItemCount() != 0) {
            C53451b bVar3 = this.f190372a.get(i);
            bVar2.f190377a.setText(bVar3.mo90015a());
            if (bVar3.f122675a) {
                bVar2.f190378b.setVisibility(0);
                bVar2.f190378b.setImageResource(2131233753);
            } else {
                bVar2.f190378b.setVisibility(8);
            }
            bVar2.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.trill.language.p4381a.C85091a.View$OnClickListenerC850921 */

                static {
                    Covode.recordClassIndex(99115);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (C85091a.this.f190373b != null) {
                        C85091a.this.f190373b.mo130032b(i);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m146311a(C85091a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4557);
        C85094b bVar = new C85094b(C1764a.m5927a(LayoutInflater.from(aVar.f190374c), R.layout.ay4, viewGroup, false));
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
        MethodCollector.m26664o(4557);
        return bVar;
    }
}
