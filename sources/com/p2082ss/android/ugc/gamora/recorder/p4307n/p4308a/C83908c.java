package com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70683j;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.AbstractC83904a;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.a.c */
public final class C83908c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final List<C83938b> f187305a;

    /* renamed from: b */
    private boolean f187306b = true;

    static {
        Covode.recordClassIndex(97799);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m144321a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f187305a.size();
    }

    public C83908c(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        this.f187305a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final void mo128803a(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f187305a);
        this.f187305a.clear();
        this.f187305a.addAll(list);
        C1445j.C1450d a = C1445j.m4922a(new C83911d(arrayList, this.f187305a), true);
        C89219l.m154716b(a, "");
        a.mo4951a(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.c$a */
    public final class C83909a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public SmartImageView f187307a;

        /* renamed from: b */
        public TextView f187308b;

        /* renamed from: c */
        final /* synthetic */ C83908c f187309c;

        static {
            Covode.recordClassIndex(97800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83909a(C83908c cVar, final View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f187309c = cVar;
            View findViewById = view.findViewById(R.id.bwm);
            C89219l.m154716b(findViewById, "");
            this.f187307a = (SmartImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ex1);
            C89219l.m154716b(findViewById2, "");
            this.f187308b = (TextView) findViewById2;
            view.setOnClickListener(new AbstractView$OnClickListenerC81441k(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.C83908c.C83909a.C839101 */

                /* renamed from: a */
                final /* synthetic */ C83909a f187310a;

                static {
                    Covode.recordClassIndex(97801);
                }

                @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
                /* renamed from: a */
                public final void mo78773a(View view) {
                    C89219l.m154721d(view, "");
                    int adapterPosition = this.f187310a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        C83938b bVar = this.f187310a.f187309c.f187305a.get(adapterPosition);
                        AbstractC83904a aVar = bVar.f187377e;
                        if (bVar.f187376d) {
                            if (bVar.f187381i != null) {
                                bVar.f187381i.mo70063a(this.f187310a.f187307a);
                            }
                            if (aVar != null) {
                                aVar.mo70061a(view, bVar);
                                if (bVar.f187379g) {
                                    this.f187310a.f187307a.setImageResource(bVar.f187374b);
                                    bVar.f187379g = false;
                                }
                            }
                        } else if (aVar != null) {
                            aVar.mo70062a(bVar);
                        }
                    }
                }

                {
                    this.f187310a = r3;
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        float f;
        C89219l.m154721d(viewHolder, "");
        C83938b bVar = this.f187305a.get(i);
        C83909a aVar = (C83909a) viewHolder;
        SmartImageView smartImageView = aVar.f187307a;
        if (bVar.f187375c != null) {
            C20766v a = C20761r.m39060a(bVar.f187375c);
            a.f49116m = 0;
            a.f49092E = smartImageView;
            a.mo34186c();
        } else {
            smartImageView.setImageResource(bVar.f187374b);
            if (bVar.f187374b == 2131232225 && C80471gb.m139482a()) {
                smartImageView.setScaleX(-1.0f);
            }
        }
        if (bVar.f187376d) {
            i2 = 255;
        } else {
            i2 = 127;
        }
        smartImageView.setImageAlpha(i2);
        TextView textView = aVar.f187308b;
        View view = viewHolder.itemView;
        C89219l.m154716b(view, "");
        if (bVar.f187376d) {
            f = 1.0f;
        } else {
            f = 0.49803922f;
        }
        textView.setAlpha(f);
        if (bVar.f187380h <= 0) {
            textView.setVisibility(8);
            view.setContentDescription(null);
        } else {
            textView.setVisibility(0);
            textView.setText(bVar.f187380h);
            view.setContentDescription(view.getContext().getText(bVar.f187380h));
        }
        if (bVar.f187378f && bVar.f187381i != null) {
            bVar.f187381i.mo70063a(smartImageView);
        }
        if (bVar.f187373a == 6 && this.f187306b) {
            Context context = smartImageView.getContext();
            C89219l.m154716b(context, "");
            Activity a2 = C67279a.m119194a(context);
            if (a2 != null) {
                this.f187306b = false;
                C70683j.m124920a(smartImageView, a2);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m144321a(C83908c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8943);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aak, viewGroup, false);
        C89219l.m154716b(a2, "");
        C83909a aVar = new C83909a(cVar, a2);
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
        MethodCollector.m26664o(8943);
        return aVar;
    }
}
