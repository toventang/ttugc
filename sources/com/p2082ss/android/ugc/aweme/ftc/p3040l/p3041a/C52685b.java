package com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.AbstractC83904a;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.l.a.b */
public final class C52685b extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final List<C83938b> f121274a;

    /* renamed from: b */
    private boolean f121275b = true;

    static {
        Covode.recordClassIndex(62081);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m97544a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f121274a.size();
    }

    public C52685b(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        this.f121274a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final void mo88370a(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f121274a);
        this.f121274a.clear();
        this.f121274a.addAll(list);
        C1445j.C1450d a = C1445j.m4922a(new C52710j(arrayList, this.f121274a), true);
        C89219l.m154716b(a, "");
        a.mo4951a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.b$a */
    public final class C52686a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public SmartImageView f121276a;

        /* renamed from: b */
        public TextView f121277b;

        /* renamed from: c */
        final /* synthetic */ C52685b f121278c;

        static {
            Covode.recordClassIndex(62082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52686a(C52685b bVar, final View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f121278c = bVar;
            View findViewById = view.findViewById(R.id.bwm);
            C89219l.m154716b(findViewById, "");
            this.f121276a = (SmartImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ex1);
            C89219l.m154716b(findViewById2, "");
            this.f121277b = (TextView) findViewById2;
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.C52685b.C52686a.View$OnClickListenerC526871 */

                /* renamed from: a */
                final /* synthetic */ C52686a f121279a;

                static {
                    Covode.recordClassIndex(62083);
                }

                {
                    this.f121279a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f121279a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        C83938b bVar = this.f121279a.f121278c.f121274a.get(adapterPosition);
                        AbstractC83904a aVar = bVar.f187377e;
                        if (bVar.f187376d) {
                            if (bVar.f187381i != null) {
                                bVar.f187381i.mo70063a(this.f121279a.f121276a);
                            }
                            if (aVar != null) {
                                aVar.mo70061a(view, bVar);
                                if (bVar.f187379g) {
                                    this.f121279a.f121276a.setImageResource(bVar.f187374b);
                                    bVar.f187379g = false;
                                }
                            }
                        } else if (aVar != null) {
                            aVar.mo70062a(bVar);
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        float f;
        C89219l.m154721d(viewHolder, "");
        C83938b bVar = this.f121274a.get(i);
        C52686a aVar = (C52686a) viewHolder;
        SmartImageView smartImageView = aVar.f121276a;
        if (bVar.f187375c != null) {
            C20766v a = C20761r.m39060a(bVar.f187375c);
            a.f49115l = bVar.f187374b;
            a.f49092E = smartImageView;
            a.mo34186c();
        } else {
            smartImageView.setImageResource(bVar.f187374b);
        }
        if (bVar.f187376d) {
            i2 = 255;
        } else {
            i2 = 127;
        }
        smartImageView.setImageAlpha(i2);
        TextView textView = aVar.f121277b;
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
        if (bVar.f187373a == 6 && this.f121275b) {
            Context context = smartImageView.getContext();
            C89219l.m154716b(context, "");
            Activity a2 = C67279a.m119194a(context);
            if (a2 != null) {
                this.f121275b = false;
                C70683j.m124920a(smartImageView, a2);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m97544a(C52685b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11372);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2z, viewGroup, false);
        C89219l.m154716b(a2, "");
        C52686a aVar = new C52686a(bVar, a2);
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
        MethodCollector.m26664o(11372);
        return aVar;
    }
}
