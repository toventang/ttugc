package com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3899c;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.tux.input.TuxRadio;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.d */
public final class C74359d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public AbstractC89183m<? super Integer, ? super View, C89391z> f167208a;

    /* renamed from: b */
    final TextView f167209b;

    /* renamed from: c */
    final TextView f167210c;

    /* renamed from: d */
    final AvatarImageView f167211d;

    /* renamed from: e */
    final TuxRadio f167212e;

    /* renamed from: f */
    final C74363a f167213f;

    /* renamed from: g */
    private final ImageView f167214g;

    /* renamed from: h */
    private final AbstractC89244h f167215h;

    static {
        Covode.recordClassIndex(87131);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo116974a() {
        return ((Number) this.f167215h.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.d$a */
    static final class C74362a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ View f167218a;

        static {
            Covode.recordClassIndex(87134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74362a(View view) {
            super(0);
            this.f167218a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f167218a.getContext(), 16.0f));
        }
    }

    /* renamed from: a */
    public final void mo116975a(View view) {
        AbstractC89183m<? super Integer, ? super View, C89391z> mVar;
        if (getAdapterPosition() != -1 && (mVar = this.f167208a) != null) {
            mVar.invoke(Integer.valueOf(getAdapterPosition()), view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74359d(C74363a aVar, View view) {
        super(view);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        this.f167213f = aVar;
        View findViewById = view.findViewById(R.id.cpq);
        C89219l.m154716b(findViewById, "");
        this.f167209b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.akb);
        C89219l.m154716b(findViewById2, "");
        this.f167210c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.fbe);
        C89219l.m154716b(findViewById3, "");
        this.f167214g = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.on);
        C89219l.m154716b(findViewById4, "");
        this.f167211d = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.a4l);
        C89219l.m154716b(findViewById5, "");
        TuxRadio tuxRadio = (TuxRadio) findViewById5;
        this.f167212e = tuxRadio;
        this.f167215h = C89250i.m154773a((AbstractC89171a) new C74362a(view));
        view.setBackground(C17177c.m31711c(view.getContext()));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3899c.C74359d.View$OnClickListenerC743601 */

            /* renamed from: a */
            final /* synthetic */ C74359d f167216a;

            static {
                Covode.recordClassIndex(87132);
            }

            {
                this.f167216a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C74359d dVar = this.f167216a;
                C89219l.m154716b(view, "");
                dVar.mo116975a(view);
            }
        });
        tuxRadio.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3899c.C74359d.View$OnClickListenerC743612 */

            /* renamed from: a */
            final /* synthetic */ C74359d f167217a;

            static {
                Covode.recordClassIndex(87133);
            }

            {
                this.f167217a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C74359d dVar = this.f167217a;
                C89219l.m154716b(view, "");
                dVar.mo116975a(view);
            }
        });
    }
}
