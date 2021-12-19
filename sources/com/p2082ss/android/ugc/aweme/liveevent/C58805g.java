package com.p2082ss.android.ugc.aweme.liveevent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxRadio;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.liveevent.g */
public final class C58805g extends AbstractC65728a<C58812j, C58806a> {

    /* renamed from: d */
    private final String f133834d;

    static {
        Covode.recordClassIndex(69115);
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.g$a */
    public final class C58806a extends AbstractC65728a<C58812j, C58806a>.C65729a {

        /* renamed from: b */
        public final SmartImageView f133835b;

        /* renamed from: c */
        public final TextView f133836c;

        /* renamed from: d */
        public final TextView f133837d;

        /* renamed from: e */
        public final TuxRadio f133838e;

        /* renamed from: f */
        public final View f133839f;

        /* renamed from: g */
        final /* synthetic */ C58805g f133840g;

        static {
            Covode.recordClassIndex(69116);
        }

        /* renamed from: com.ss.android.ugc.aweme.liveevent.g$a$a */
        static final class View$OnClickListenerC58807a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C58806a f133841a;

            /* renamed from: b */
            final /* synthetic */ C58812j f133842b;

            static {
                Covode.recordClassIndex(69117);
            }

            View$OnClickListenerC58807a(C58806a aVar, C58812j jVar) {
                this.f133841a = aVar;
                this.f133842b = jVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TuxRadio tuxRadio = this.f133841a.f133838e;
                C89219l.m154716b(tuxRadio, "");
                tuxRadio.setChecked(true);
                this.f133842b.f133858d = true;
                AbstractC34884bl blVar = this.f133841a.f133840g.f148117b;
                if (blVar != null) {
                    blVar.mo59597a(this.f133842b);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58806a(C58805g gVar, View view) {
            super(gVar, view);
            C89219l.m154721d(view, "");
            this.f133840g = gVar;
            this.f133835b = (SmartImageView) view.findViewById(R.id.bhs);
            this.f133836c = (TextView) view.findViewById(R.id.ern);
            this.f133837d = (TextView) view.findViewById(R.id.ev0);
            this.f133838e = (TuxRadio) view.findViewById(R.id.a4i);
            this.f133839f = view.findViewById(R.id.c93);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58805g(AbstractC34884bl blVar, String str) {
        super(blVar);
        C89219l.m154721d(str, "");
        this.f133834d = str;
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a96, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C58806a(this, a);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        C58806a aVar = (C58806a) viewHolder;
        C58812j jVar = (C58812j) obj;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(jVar, "");
        C20766v a = C20761r.m39056a(2131232679);
        a.f49092E = aVar.f133835b;
        a.mo34186c();
        TextView textView = aVar.f133836c;
        C89219l.m154716b(textView, "");
        textView.setText(jVar.f133857c);
        TextView textView2 = aVar.f133837d;
        C89219l.m154716b(textView2, "");
        textView2.setText(C80187aa.C80188a.m139012d(jVar.f133856b));
        TuxRadio tuxRadio = aVar.f133838e;
        C89219l.m154716b(tuxRadio, "");
        tuxRadio.setChecked(jVar.f133858d);
        if (jVar.f133859e) {
            View view = aVar.f133839f;
            C89219l.m154716b(view, "");
            view.setVisibility(8);
        }
        aVar.itemView.setOnClickListener(new C58806a.View$OnClickListenerC58807a(aVar, jVar));
    }
}
