package com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3378a;

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
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3380c.C57951b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.a.a */
public final class C57943a extends RecyclerView.AbstractC1350a<C57945b> {

    /* renamed from: a */
    public ArrayList<C57951b> f132097a;

    /* renamed from: b */
    public final AbstractC57944a f132098b;

    /* renamed from: c */
    private final Context f132099c;

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.a.a$a */
    public interface AbstractC57944a {
        static {
            Covode.recordClassIndex(67967);
        }

        /* renamed from: a */
        void mo95290a(int i);
    }

    static {
        Covode.recordClassIndex(67966);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C57945b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m104723a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        ArrayList<C57951b> arrayList = this.f132097a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.a.a$c */
    static final class View$OnClickListenerC57946c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57943a f132102a;

        /* renamed from: b */
        final /* synthetic */ int f132103b;

        static {
            Covode.recordClassIndex(67969);
        }

        View$OnClickListenerC57946c(C57943a aVar, int i) {
            this.f132102a = aVar;
            this.f132103b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC57944a aVar = this.f132102a.f132098b;
            if (aVar != null) {
                aVar.mo95290a(this.f132103b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.a.a$b */
    public static final class C57945b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f132100a;

        /* renamed from: b */
        public ImageView f132101b;

        static {
            Covode.recordClassIndex(67968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57945b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.eyc);
            C89219l.m154716b(findViewById, "");
            this.f132100a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.bz8);
            C89219l.m154716b(findViewById2, "");
            this.f132101b = (ImageView) findViewById2;
            this.f132100a.setTextColor(C0643b.m2378c(view.getContext(), R.color.ae));
        }
    }

    public C57943a(Context context, AbstractC57944a aVar) {
        C89219l.m154721d(context, "");
        this.f132099c = context;
        this.f132098b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C57945b bVar, int i) {
        C57945b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        if (getItemCount() != 0) {
            ArrayList<C57951b> arrayList = this.f132097a;
            if (arrayList == null) {
                C89219l.m154715b();
            }
            C57951b bVar3 = arrayList.get(i);
            C89219l.m154716b(bVar3, "");
            C57951b bVar4 = bVar3;
            TextView textView = bVar2.f132100a;
            String e = bVar4.f132114a.mo90021e();
            C89219l.m154716b(e, "");
            textView.setText(e);
            if (bVar4.f132115b) {
                bVar2.f132101b.setVisibility(0);
                bVar2.f132101b.setImageResource(2131232992);
            } else {
                bVar2.f132101b.setVisibility(8);
            }
            bVar2.itemView.setOnClickListener(new View$OnClickListenerC57946c(this, i));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m104723a(C57943a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11256);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(aVar.f132099c), R.layout.abz, viewGroup, false);
        C89219l.m154716b(a2, "");
        C57945b bVar = new C57945b(a2);
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
        MethodCollector.m26664o(11256);
        return bVar;
    }
}
