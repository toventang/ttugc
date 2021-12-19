package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.language.C53451b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.a */
public final class C40180a extends RecyclerView.AbstractC1350a<C40183b> {

    /* renamed from: a */
    public ArrayList<C53451b> f94345a;

    /* renamed from: b */
    public AbstractC40182a f94346b;

    /* renamed from: c */
    private Context f94347c;

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.a$a */
    public interface AbstractC40182a {
        static {
            Covode.recordClassIndex(47974);
        }

        /* renamed from: a */
        void mo69381a(int i);
    }

    static {
        Covode.recordClassIndex(47972);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C40183b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m81280a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        ArrayList<C53451b> arrayList = this.f94345a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.a$b */
    public static class C40183b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TuxTextView f94350a;

        /* renamed from: b */
        ImageView f94351b;

        static {
            Covode.recordClassIndex(47975);
        }

        public C40183b(View view) {
            super(view);
            int i;
            this.f94350a = (TuxTextView) view.findViewById(R.id.eyc);
            this.f94351b = (ImageView) view.findViewById(R.id.bz8);
            TuxTextView tuxTextView = this.f94350a;
            Context context = view.getContext();
            if (C17175b.m31708b(view.getContext())) {
                i = R.color.ae;
            } else {
                i = R.color.a_;
            }
            tuxTextView.setTextColor(C0643b.m2378c(context, i));
        }
    }

    public C40180a(Context context, AbstractC40182a aVar) {
        this.f94347c = context;
        this.f94346b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C40183b bVar, final int i) {
        C40183b bVar2 = bVar;
        if (getItemCount() != 0) {
            C53451b bVar3 = this.f94345a.get(i);
            bVar2.f94350a.setText(bVar3.mo90015a());
            if (bVar3.f122675a) {
                bVar2.f94351b.setVisibility(0);
                bVar2.f94351b.setImageResource(2131232319);
            } else {
                bVar2.f94351b.setVisibility(8);
            }
            bVar2.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.contentlanguage.C40180a.View$OnClickListenerC401811 */

                static {
                    Covode.recordClassIndex(47973);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (C40180a.this.f94346b != null) {
                        C40180a.this.f94346b.mo69381a(i);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m81280a(C40180a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4758);
        C40183b bVar = new C40183b(C1764a.m5927a(LayoutInflater.from(aVar.f94347c), R.layout.a_i, viewGroup, false));
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
        MethodCollector.m26664o(4758);
        return bVar;
    }
}
