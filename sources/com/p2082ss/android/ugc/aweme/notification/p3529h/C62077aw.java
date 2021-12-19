package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationCombineVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.notification.h.aw */
public final class C62077aw extends C62129p {

    /* renamed from: a */
    public EnumC56508r f140918a = EnumC56508r.TOP;

    /* renamed from: b */
    private final AbstractC51540c f140919b;

    /* renamed from: c */
    private final AbstractC89244h f140920c;

    static {
        Covode.recordClassIndex(72831);
    }

    /* renamed from: h */
    private final NotificationCombineVM m112273h() {
        return (NotificationCombineVM) this.f140920c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: d */
    public final void mo100081d() {
        super.mo100081d();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.aw$a */
    static final class C62080a extends AbstractC89220m implements AbstractC89171a<NotificationCombineVM> {

        /* renamed from: a */
        final /* synthetic */ Fragment f140923a;

        static {
            Covode.recordClassIndex(72834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62080a(Fragment fragment) {
            super(0);
            this.f140923a = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationCombineVM invoke() {
            return NotificationCombineVM.C62352a.m112807a(this.f140923a);
        }
    }

    /* renamed from: c */
    public final void mo100067c() {
        m112274i();
        this.f140919b.mo87047a();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        if (!m112273h().f141508f) {
            m112273h().f141508f = true;
            C62259e.m112627b(this.f140919b.mo87052b(), this.f140918a);
        }
    }

    /* renamed from: i */
    private final void m112274i() {
        EnumC56508r t = m112273h().mo100364t();
        if (this.f140918a != t) {
            this.f140918a = t;
            RemoteImageView remoteImageView = (RemoteImageView) mo100077a(R.id.cuf);
            C89219l.m154716b(remoteImageView, "");
            ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
            if (t == EnumC56508r.TOP) {
                View view = this.itemView;
                C89219l.m154716b(view, "");
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics())));
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                C23163i.m43660a(view, (Integer) null, valueOf, (Integer) null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system2.getDisplayMetrics()))), false, 16);
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system3.getDisplayMetrics()));
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system4.getDisplayMetrics()));
            } else {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                Resources system5 = Resources.getSystem();
                C89219l.m154709a((Object) system5, "");
                Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system5.getDisplayMetrics())));
                Resources system6 = Resources.getSystem();
                C89219l.m154709a((Object) system6, "");
                C23163i.m43660a(view2, (Integer) null, valueOf2, (Integer) null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system6.getDisplayMetrics()))), false, 16);
                Resources system7 = Resources.getSystem();
                C89219l.m154709a((Object) system7, "");
                layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system7.getDisplayMetrics()));
                Resources system8 = Resources.getSystem();
                C89219l.m154709a((Object) system8, "");
                layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system8.getDisplayMetrics()));
            }
            remoteImageView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62077aw(View view, Fragment fragment, DmtStatusView dmtStatusView) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(dmtStatusView, "");
        AbstractC51540c a = C51648a.f118980a.mo87297a(fragment);
        View a2 = mo100077a(R.id.cuf);
        C89219l.m154716b(a2, "");
        View a3 = mo100077a(R.id.cuw);
        C89219l.m154716b(a3, "");
        View a4 = mo100077a(R.id.cu7);
        C89219l.m154716b(a4, "");
        View a5 = mo100077a(R.id.cu6);
        C89219l.m154716b(a5, "");
        a.mo87049a(dmtStatusView, (RemoteImageView) a2, (TextView) a3, (TextView) a4, (TuxButton) a5);
        this.f140919b = a;
        this.f140920c = C89250i.m154773a((AbstractC89171a) new C62080a(fragment));
        a.mo87048a(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.C62077aw.View$OnClickListenerC620781 */

            /* renamed from: a */
            final /* synthetic */ C62077aw f140921a;

            static {
                Covode.recordClassIndex(72832);
            }

            {
                this.f140921a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                EnumC56501q.THIRD_PLATFORM.markAction();
                if (this.f140921a.f140918a == EnumC56508r.BOTTOM) {
                    C56407f.m102374b(C620791.f140922a);
                }
            }
        });
        a.mo87051a("notification_page");
    }
}
