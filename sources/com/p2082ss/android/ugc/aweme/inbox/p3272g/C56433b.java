package com.p2082ss.android.ugc.aweme.inbox.p3272g;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.C56516w;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.g.b */
public final class C56433b extends AbstractC56447g<C56516w> {

    /* renamed from: g */
    private final AbstractC51540c f128703g;

    static {
        Covode.recordClassIndex(66253);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: b */
    public final void mo93407b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final void mo93405a() {
        String str;
        mo93415e();
        String b = this.f128703g.mo87052b();
        C89219l.m154721d(b, "");
        EnumC56508r rVar = EnumC56508r.BOTTOM;
        C89219l.m154721d(b, "");
        C89219l.m154721d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("platform", b);
        if (rVar == EnumC56508r.TOP) {
            str = "top";
        } else {
            str = "bottom";
        }
        linkedHashMap.put("position", str);
        C39162r.m79460a("invitation_card_show", linkedHashMap);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final /* synthetic */ void mo93406a(C56516w wVar) {
        C89219l.m154721d(wVar, "");
        this.f128703g.mo87047a();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: b */
    public final void mo93408b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        this.f128703g.mo87050a(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56433b(View view, Fragment fragment) {
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
        this.f128703g = a;
        a.mo87048a(View$OnClickListenerC564341.f128704a);
        a.mo87051a("notification_page");
        a.mo87053c().observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.inbox.p3272g.C56433b.C564362 */

            /* renamed from: a */
            final /* synthetic */ C56433b f128706a;

            static {
                Covode.recordClassIndex(66256);
            }

            {
                this.f128706a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                RecommendUserVM e = this.f128706a.mo93415e();
                C89219l.m154716b(bool, "");
                e.f128405a.postValue(Boolean.valueOf(bool.booleanValue()));
            }
        });
        mo93412a(C564373.f128707a);
    }
}
