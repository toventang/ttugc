package com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56582i;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.e */
public final class C56553e extends AbstractC56557f<C56582i> {

    /* renamed from: a */
    private final AbstractC51540c f128950a;

    static {
        Covode.recordClassIndex(66376);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: b */
    public final void mo93483b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    public final void bP_() {
        MultiViewModel d = mo93489d();
        String b = this.f128950a.mo87052b();
        C89219l.m154721d(b, "");
        if (!d.f128893l) {
            d.f128893l = true;
            C62259e.m112627b(b, EnumC56508r.TOP);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: b */
    public final void mo93480b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo93480b(bVar);
        this.f128950a.mo87050a(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.widget.multi.k] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: a */
    public final /* synthetic */ void mo93479a(C56582i iVar) {
        C89219l.m154721d(iVar, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        C23163i.m43660a(view, (Integer) null, valueOf, (Integer) null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()))), false, 21);
        this.f128950a.mo87047a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56553e(View view, Fragment fragment) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        AbstractC51540c a = C51648a.f118980a.mo87297a(fragment);
        View findViewById = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById, "");
        View findViewById2 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById2, "");
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        View findViewById4 = view.findViewById(R.id.cu6);
        C89219l.m154716b(findViewById4, "");
        a.mo87049a(null, (RemoteImageView) findViewById, (TextView) findViewById2, (TextView) findViewById3, (TuxButton) findViewById4);
        this.f128950a = a;
        a.mo87048a(View$OnClickListenerC565541.f128951a);
        a.mo87051a("notification_page");
        a.mo87053c().observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.C56553e.C565552 */

            /* renamed from: a */
            final /* synthetic */ C56553e f128952a;

            static {
                Covode.recordClassIndex(66378);
            }

            {
                this.f128952a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                MultiViewModel d = this.f128952a.mo93489d();
                C89219l.m154716b(bool, "");
                d.f128886e.postValue(Boolean.valueOf(bool.booleanValue()));
            }
        });
        mo93487a(C565563.f128953a);
    }
}
