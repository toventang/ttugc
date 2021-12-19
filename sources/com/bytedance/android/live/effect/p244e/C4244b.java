package com.bytedance.android.live.effect.p244e;

import android.os.Handler;
import android.os.Looper;
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
import com.bytedance.android.livesdk.p561j.C9110dv;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.e.b */
public final class C4244b extends RecyclerView.AbstractC1350a<C4245a> {

    /* renamed from: a */
    public final List<C11672a> f11752a = new ArrayList();

    /* renamed from: b */
    public int f11753b;

    /* renamed from: c */
    public AbstractC4246b f11754c;

    /* renamed from: d */
    final AbstractC89244h f11755d = C89250i.m154773a((AbstractC89171a) C4249d.f11759a);

    /* renamed from: e */
    private final C4247c f11756e = new C4247c(this);

    /* renamed from: com.bytedance.android.live.effect.e.b$b */
    public interface AbstractC4246b {
        static {
            Covode.recordClassIndex(4816);
        }

        /* renamed from: a */
        void mo9944a(C11672a aVar);
    }

    static {
        Covode.recordClassIndex(4814);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C4245a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m10353a(viewGroup, i);
    }

    /* renamed from: com.bytedance.android.live.effect.e.b$c */
    public static final class C4247c implements AbstractC4157j.AbstractC4159b {

        /* renamed from: a */
        final /* synthetic */ C4244b f11757a;

        static {
            Covode.recordClassIndex(4817);
        }

        /* renamed from: com.bytedance.android.live.effect.e.b$c$a */
        static final class RunnableC4248a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C4247c f11758a;

            static {
                Covode.recordClassIndex(4818);
            }

            RunnableC4248a(C4247c cVar) {
                this.f11758a = cVar;
            }

            public final void run() {
                this.f11758a.f11757a.notifyDataSetChanged();
            }
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4159b
        /* renamed from: a */
        public final void mo9867a() {
            ((Handler) this.f11757a.f11755d.getValue()).post(new RunnableC4248a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4247c(C4244b bVar) {
            this.f11757a = bVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f11752a.size();
    }

    /* renamed from: com.bytedance.android.live.effect.e.b$d */
    static final class C4249d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C4249d f11759a = new C4249d();

        static {
            Covode.recordClassIndex(4819);
        }

        C4249d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public final void mo9943a() {
        T t;
        Iterator<T> it = this.f11752a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f27887C) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            this.f11753b = this.f11752a.indexOf(t2);
            AbstractC4246b bVar = this.f11754c;
            if (bVar != null) {
                bVar.mo9944a(t2);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: com.bytedance.android.live.effect.e.b$a */
    public static final class C4245a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4245a(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    /* renamed from: com.bytedance.android.live.effect.e.b$e */
    static final class View$OnClickListenerC4250e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4244b f11760a;

        /* renamed from: b */
        final /* synthetic */ C4245a f11761b;

        /* renamed from: c */
        final /* synthetic */ C11672a f11762c;

        static {
            Covode.recordClassIndex(4820);
        }

        View$OnClickListenerC4250e(C4244b bVar, C4245a aVar, C11672a aVar2) {
            this.f11760a = bVar;
            this.f11761b = aVar;
            this.f11762c = aVar2;
        }

        public final void onClick(View view) {
            int adapterPosition = this.f11761b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f11760a.f11752a.size()) {
                if (!C4284g.m10392a(this.f11762c) && !C4278b.m10378a(this.f11762c)) {
                    return;
                }
                if (C4278b.m10381b(this.f11762c)) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dvj);
                    return;
                }
                this.f11760a.f11753b = adapterPosition;
                AbstractC4246b bVar = this.f11760a.f11754c;
                if (bVar != null) {
                    bVar.mo9944a(this.f11762c);
                }
                this.f11760a.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m10353a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6566);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b7v, viewGroup, false);
        C89219l.m154716b(a2, "");
        C4245a aVar = new C4245a(a2);
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
        MethodCollector.m26664o(6566);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C4245a aVar, int i) {
        C4245a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C11672a aVar3 = this.f11752a.get(i);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9110dv.class);
        if (concurrentHashMap != null) {
            String str = aVar3.f27897e;
            if (str == null) {
                C89219l.m154715b();
            }
            concurrentHashMap.put(str, new C89378p(Integer.valueOf(i), ""));
        }
        if (this.f11753b == i) {
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
        if (C4284g.m10392a(aVar3) || C4278b.m10378a(aVar3)) {
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
            C4284g.m10390a(aVar3.f27909q, this.f11756e);
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
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC4250e(this, aVar2, aVar3));
    }
}
