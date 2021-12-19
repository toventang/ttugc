package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39260s;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79705a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.o */
public final class C39805o extends AbstractC39751a {

    /* renamed from: a */
    public final PrivacySettingViewModel f93712a;

    /* renamed from: b */
    private final AbstractC89244h f93713b = C89250i.m154773a((AbstractC89171a) C39806a.f93716a);

    /* renamed from: c */
    private final int f93714c;

    /* renamed from: d */
    private final int f93715d;

    static {
        Covode.recordClassIndex(47535);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return (C39256o) this.f93713b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93714c;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.o$a */
    static final class C39806a extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39806a f93716a = new C39806a();

        static {
            Covode.recordClassIndex(47536);
        }

        C39806a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "upvote");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: h */
    public final Integer mo69124h() {
        return Integer.valueOf(this.f93715d);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: d */
    public final boolean mo69103d() {
        if (!super.mo69103d() || !C79705a.m138533a()) {
            return false;
        }
        return true;
    }

    public C39805o(PrivacySettingViewModel privacySettingViewModel) {
        int i;
        int i2;
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93712a = privacySettingViewModel;
        if (C79705a.m138534b()) {
            i = R.string.f73;
        } else {
            i = R.string.fb1;
        }
        this.f93714c = i;
        if (C79705a.m138534b()) {
            i2 = R.raw.icon_raising_star;
        } else {
            i2 = R.raw.icon_repost;
        }
        this.f93715d = i2;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_recommend_permission", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        SmartRouter.buildRoute(context, "aweme://recommend/settings").open();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        C39260s sVar;
        Integer valueOf;
        Integer valueOf2;
        C89219l.m154721d(hVar, "");
        super.mo69095a(hVar, i);
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        AbstractC23293c.AbstractC23296b accessory = ((TuxTextCell) view.findViewById(R.id.bqp)).getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
        AbstractC23293c.C23302f fVar = (AbstractC23293c.C23302f) accessory;
        C39258q b = C39659b.m80540b();
        String str = null;
        if (!(b == null || (sVar = b.f92748g) == null || (valueOf = Integer.valueOf(sVar.f92751a)) == null)) {
            if (valueOf.intValue() == 1) {
                valueOf2 = Integer.valueOf((int) R.string.dkl);
            } else if (valueOf.intValue() == 2) {
                valueOf2 = Integer.valueOf((int) R.string.dkc);
            }
            if (valueOf2 != null) {
                int intValue = valueOf2.intValue();
                View view2 = hVar.itemView;
                C89219l.m154716b(view2, "");
                str = view2.getContext().getString(intValue);
            }
        }
        fVar.mo37964a(str);
    }
}
