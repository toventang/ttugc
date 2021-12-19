package com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2647a;

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
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a */
public final class C39373a extends RecyclerView.AbstractC1350a<C39375b> {

    /* renamed from: a */
    public List<String> f92945a = new ArrayList();

    /* renamed from: b */
    public final Context f92946b;

    /* renamed from: c */
    public final AbstractC89171a<C89391z> f92947c;

    static {
        Covode.recordClassIndex(47057);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C39375b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m80085a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f92945a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a$a */
    public static final class C39374a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39373a f92948a;

        static {
            Covode.recordClassIndex(47058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39374a(C39373a aVar) {
            super(1);
            this.f92948a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C39373a aVar = this.f92948a;
            aVar.f92947c.invoke();
            C39162r.m79460a("keyword_filter_delete_ck", new C33744d().mo59983a("keyword", aVar.f92945a.get(intValue)).f79943a);
            aVar.f92945a.remove(intValue);
            aVar.notifyItemRemoved(intValue);
            aVar.notifyItemRangeChanged(intValue, aVar.getItemCount() - intValue);
            return C89391z.f203057a;
        }
    }

    public C39373a(Context context, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f92946b = context;
        this.f92947c = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C39375b bVar, int i) {
        C39375b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        String str = this.f92945a.get(i);
        C89219l.m154721d(str, "");
        bVar2.f92950b = i;
        TextView textView = bVar2.f92949a;
        C89219l.m154716b(textView, "");
        textView.setText(str);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m80085a(C39373a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9183);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.uh, viewGroup, false);
        C89219l.m154716b(a2, "");
        C39375b bVar = new C39375b(a2, aVar.f92946b, new C39374a(aVar));
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
        MethodCollector.m26664o(9183);
        return bVar;
    }
}
