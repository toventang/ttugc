package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.as */
public final class C62061as extends C62129p {

    /* renamed from: b */
    public static final C62062a f140889b = new C62062a((byte) 0);

    /* renamed from: a */
    public AbstractC62063b f140890a;

    /* renamed from: c */
    private final DmtStatusView f140891c;

    /* renamed from: com.ss.android.ugc.aweme.notification.h.as$b */
    public interface AbstractC62063b {
        static {
            Covode.recordClassIndex(72817);
        }

        /* renamed from: x */
        void mo99842x();
    }

    static {
        Covode.recordClassIndex(72815);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.as$a */
    public static final class C62062a {
        static {
            Covode.recordClassIndex(72816);
        }

        private C62062a() {
        }

        public /* synthetic */ C62062a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.as$c */
    static final class View$OnClickListenerC62064c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62061as f140892a;

        static {
            Covode.recordClassIndex(72818);
        }

        View$OnClickListenerC62064c(C62061as asVar) {
            this.f140892a = asVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC62063b bVar = this.f140892a.f140890a;
            if (bVar != null) {
                bVar.mo99842x();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62061as(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.ava);
        C89219l.m154716b(findViewById, "");
        this.f140891c = (DmtStatusView) findViewById;
    }

    /* renamed from: a */
    public final void mo100117a(int i, int i2, int i3) {
        Context context = this.f140983i;
        if (context == null) {
            C89219l.m154715b();
        }
        MtEmptyView a = MtEmptyView.m31926a(context);
        C17273d.C17274a c = new C17273d.C17274a(this.f140983i).mo27457a(i3).mo27462b(i).mo27464c(i2);
        C89219l.m154716b(c, "");
        if (i == R.string.cj && QnaService.m117969a().enablePublicQna()) {
            c.mo27459a(EnumC17270a.SOLID, R.string.ch, new View$OnClickListenerC62064c(this));
        }
        a.setStatus(c.f41365a);
        int c2 = C0643b.m2378c(this.f140983i, R.color.bx);
        Context context2 = this.f140983i;
        C89219l.m154716b(context2, "");
        a.mo27428a(c2, context2.getResources().getDrawable(R.drawable.n_), (int) C13628n.m24520b(this.f140983i, 30.0f), 0);
        Context context3 = this.f140983i;
        if (context3 == null) {
            C89219l.m154715b();
        }
        C17273d dVar = new C17273d.C17274a(context3).mo27462b(R.string.crk).mo27463b("").f41365a;
        DmtStatusView.C17269a a2 = DmtStatusView.C17269a.m31905a(this.f140983i).mo27397a();
        if (!C62269l.m112652a()) {
            a2.mo27406b(a);
        } else {
            a2.mo27404a(dVar);
        }
        this.f140891c.setBuilder(a2);
        this.f140891c.mo27382d();
        DmtStatusView dmtStatusView = this.f140891c;
        dmtStatusView.mo27385g();
        dmtStatusView.setFocusable(false);
        dmtStatusView.setFocusableInTouchMode(false);
    }
}
