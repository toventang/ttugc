package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35895ao;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.m */
public final class C35719m extends AbstractC39060f<C35895ao> {

    /* renamed from: a */
    public int f84262a = 0;

    /* renamed from: b */
    final AbstractC35717k f84263b;

    static {
        Covode.recordClassIndex(42951);
    }

    public C35719m(AbstractC35717k kVar) {
        C89219l.m154721d(kVar, "");
        this.f84263b = kVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.a.m$a */
    static final class View$OnClickListenerC35720a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35719m f84264a;

        /* renamed from: b */
        final /* synthetic */ int f84265b;

        static {
            Covode.recordClassIndex(42952);
        }

        View$OnClickListenerC35720a(C35719m mVar, int i) {
            this.f84264a = mVar;
            this.f84265b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C35719m mVar = this.f84264a;
            Object obj = mVar.mo63369e().get(this.f84265b);
            C89219l.m154716b(obj, "");
            mVar.notifyDataSetChanged();
            mVar.f84263b.mo62761a((C35895ao) obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2n, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C35721n(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C35721n) {
            C35721n nVar = (C35721n) viewHolder;
            Object obj = mo63369e().get(i);
            C89219l.m154716b(obj, "");
            C35895ao aoVar = (C35895ao) obj;
            boolean e = CommerceMediaServiceImpl.m77578f().mo66517e();
            C89219l.m154721d(aoVar, "");
            TextView textView = nVar.f84266a;
            View view = nVar.itemView;
            C89219l.m154716b(view, "");
            textView.setText(view.getContext().getString(aoVar.f84721b));
            if (aoVar.f84720a == e) {
                nVar.f84266a.setAlpha(1.0f);
                nVar.f84267b.setVisibility(0);
            } else {
                nVar.f84266a.setAlpha(0.5f);
                nVar.f84267b.setVisibility(8);
            }
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC35720a(this, i));
        }
    }
}
