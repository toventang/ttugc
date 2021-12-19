package com.bytedance.android.live.effect.p244e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.C4284g;
import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.p245f.C4278b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.e.d */
public final class C4255d extends RecyclerView.AbstractC1350a<C4256a> {

    /* renamed from: a */
    public List<C11672a> f11769a = new ArrayList();

    /* renamed from: b */
    public int f11770b;

    /* renamed from: c */
    public AbstractC4257b f11771c;

    /* renamed from: d */
    private final C4258c f11772d = new C4258c(this);

    /* renamed from: com.bytedance.android.live.effect.e.d$b */
    public interface AbstractC4257b {
        static {
            Covode.recordClassIndex(4827);
        }

        /* renamed from: a */
        void mo9947a(C11672a aVar);
    }

    static {
        Covode.recordClassIndex(4825);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C4256a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m10360a(viewGroup, i);
    }

    /* renamed from: com.bytedance.android.live.effect.e.d$c */
    public static final class C4258c implements AbstractC4157j.AbstractC4159b {

        /* renamed from: a */
        final /* synthetic */ C4255d f11773a;

        static {
            Covode.recordClassIndex(4828);
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4159b
        /* renamed from: a */
        public final void mo9867a() {
            this.f11773a.notifyDataSetChanged();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4258c(C4255d dVar) {
            this.f11773a = dVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f11769a.size();
    }

    /* renamed from: com.bytedance.android.live.effect.e.d$a */
    public static final class C4256a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4256a(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    /* renamed from: com.bytedance.android.live.effect.e.d$d */
    static final class View$OnClickListenerC4259d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4255d f11774a;

        /* renamed from: b */
        final /* synthetic */ C4256a f11775b;

        /* renamed from: c */
        final /* synthetic */ C11672a f11776c;

        static {
            Covode.recordClassIndex(4829);
        }

        View$OnClickListenerC4259d(C4255d dVar, C4256a aVar, C11672a aVar2) {
            this.f11774a = dVar;
            this.f11775b = aVar;
            this.f11776c = aVar2;
        }

        public final void onClick(View view) {
            int adapterPosition = this.f11775b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f11774a.f11769a.size() && C4284g.m10392a(this.f11776c)) {
                if (C4278b.m10381b(this.f11776c)) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dvj);
                    return;
                }
                this.f11774a.f11770b = adapterPosition;
                AbstractC4257b bVar = this.f11774a.f11771c;
                if (bVar != null) {
                    bVar.mo9947a(this.f11776c);
                }
                this.f11774a.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m10360a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6403);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b7v, viewGroup, false);
        C89219l.m154716b(a2, "");
        C4256a aVar = new C4256a(a2);
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
        MethodCollector.m26664o(6403);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C4256a aVar, int i) {
        C4256a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C11672a aVar3 = this.f11769a.get(i);
        if (this.f11770b == i) {
            View view = aVar2.itemView;
            C89219l.m154716b(view, "");
            view.findViewById(R.id.ty).setBackgroundResource(R.drawable.bpl);
            View view2 = aVar2.itemView;
            C89219l.m154716b(view2, "");
            ((LiveTextView) view2.findViewById(R.id.ezz)).setTextColor(C3966y.m9663b((int) R.color.uz));
        } else {
            View view3 = aVar2.itemView;
            C89219l.m154716b(view3, "");
            view3.findViewById(R.id.ty).setBackgroundResource(R.drawable.bpm);
            View view4 = aVar2.itemView;
            C89219l.m154716b(view4, "");
            ((LiveTextView) view4.findViewById(R.id.ezz)).setTextColor(C3966y.m9663b((int) R.color.x9));
        }
        C2962b bVar = aVar3.f27896d;
        if (bVar != null) {
            View view5 = aVar2.itemView;
            C89219l.m154716b(view5, "");
            C3951p.m9621a((ImageView) view5.findViewById(R.id.bt7), new ImageModel(bVar.f8711a, bVar.f8712b));
        }
        View view6 = aVar2.itemView;
        C89219l.m154716b(view6, "");
        LiveTextView liveTextView = (LiveTextView) view6.findViewById(R.id.ezz);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(aVar3.f27897e);
        if (C4284g.m10392a(aVar3)) {
            View view7 = aVar2.itemView;
            C89219l.m154716b(view7, "");
            ImageView imageView = (ImageView) view7.findViewById(R.id.bxi);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
        } else {
            View view8 = aVar2.itemView;
            C89219l.m154716b(view8, "");
            ImageView imageView2 = (ImageView) view8.findViewById(R.id.bxi);
            C89219l.m154716b(imageView2, "");
            imageView2.setVisibility(0);
            C4284g.m10390a(aVar3.f27909q, this.f11772d);
        }
        if (C4278b.m10381b(aVar3)) {
            View view9 = aVar2.itemView;
            C89219l.m154716b(view9, "");
            view9.setAlpha(0.4f);
        } else {
            View view10 = aVar2.itemView;
            C89219l.m154716b(view10, "");
            view10.setAlpha(1.0f);
        }
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC4259d(this, aVar2, aVar3));
    }
}
