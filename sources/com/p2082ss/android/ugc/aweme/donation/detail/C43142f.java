package com.p2082ss.android.ugc.aweme.donation.detail;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.donation.C43147e;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.detail.f */
public final class C43142f extends RecyclerView.ViewHolder {

    /* renamed from: i */
    public static final int f100527i;

    /* renamed from: j */
    public static final C43143a f100528j = new C43143a((byte) 0);

    /* renamed from: a */
    public final SmartAvatarImageView f100529a;

    /* renamed from: b */
    public final TextView f100530b;

    /* renamed from: c */
    public final TextView f100531c;

    /* renamed from: d */
    public final TextView f100532d;

    /* renamed from: e */
    public final ImageView f100533e;

    /* renamed from: f */
    public final TextView f100534f;

    /* renamed from: g */
    public final TextView f100535g;

    /* renamed from: h */
    public final C43116b f100536h;

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.f$b */
    static final class View$OnClickListenerC43144b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC43144b f100537a = new View$OnClickListenerC43144b();

        static {
            Covode.recordClassIndex(51316);
        }

        View$OnClickListenerC43144b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.f$c */
    static final class View$OnClickListenerC43145c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC43145c f100538a = new View$OnClickListenerC43145c();

        static {
            Covode.recordClassIndex(51317);
        }

        View$OnClickListenerC43145c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.f$a */
    public static final class C43143a {
        static {
            Covode.recordClassIndex(51315);
        }

        private C43143a() {
        }

        public /* synthetic */ C43143a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(51314);
        Context applicationContext = C17867d.m33078a().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        f100527i = (int) C13628n.m24520b(applicationContext, 32.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.f$d */
    static final class View$OnClickListenerC43146d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43142f f100539a;

        /* renamed from: b */
        final /* synthetic */ C43147e f100540b;

        static {
            Covode.recordClassIndex(51318);
        }

        View$OnClickListenerC43146d(C43142f fVar, C43147e eVar) {
            this.f100539a = fVar;
            this.f100540b = eVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f100539a.f100536h.mo73359o();
            View view2 = this.f100539a.itemView;
            C89219l.m154716b(view2, "");
            SmartRoute buildRoute = SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/");
            User user = this.f100540b.f100541a;
            String str2 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            SmartRoute withParam = buildRoute.withParam("uid", str);
            User user2 = this.f100540b.f100541a;
            if (user2 != null) {
                str2 = user2.getSecUid();
            }
            withParam.withParam("sec_uid", str2).withParam("enter_from", this.f100539a.f100536h.mo73349a()).withParam("enter_method", this.f100539a.f100536h.mo73351c()).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43142f(View view, C43116b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f100536h = bVar;
        this.f100529a = (SmartAvatarImageView) view.findViewById(R.id.nz);
        this.f100530b = (TextView) view.findViewById(R.id.cpj);
        this.f100531c = (TextView) view.findViewById(R.id.ajd);
        this.f100532d = (TextView) view.findViewById(R.id.ehl);
        this.f100533e = (ImageView) view.findViewById(R.id.e64);
        this.f100534f = (TextView) view.findViewById(R.id.ekq);
        this.f100535g = (TextView) view.findViewById(R.id.ekr);
    }
}
