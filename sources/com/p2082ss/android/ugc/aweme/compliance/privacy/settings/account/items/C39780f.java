package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39246g;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.f */
public final class C39780f extends AbstractC39751a {

    /* renamed from: a */
    public final PrivacySettingViewModel f93656a;

    /* renamed from: b */
    private final AbstractC89244h f93657b = C89250i.m154773a((AbstractC89171a) C39781a.f93660a);

    /* renamed from: c */
    private final int f93658c = R.string.n6;

    /* renamed from: d */
    private final int f93659d = R.raw.icon_arrow_down_to_line;

    static {
        Covode.recordClassIndex(47510);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return (C39256o) this.f93657b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93658c;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.f$a */
    static final class C39781a extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39781a f93660a = new C39781a();

        static {
            Covode.recordClassIndex(47511);
        }

        C39781a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "download");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: h */
    public final Integer mo69124h() {
        return Integer.valueOf(this.f93659d);
    }

    public C39780f(PrivacySettingViewModel privacySettingViewModel) {
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93656a = privacySettingViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_download_permission", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        SmartRouter.buildRoute(context, "//setting/download").withParam("enter_from", "privacy_and_safety_setting").open(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        C39246g gVar;
        Integer valueOf;
        C89219l.m154721d(hVar, "");
        super.mo69095a(hVar, i);
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        AbstractC23293c.AbstractC23296b accessory = ((TuxTextCell) view.findViewById(R.id.bqp)).getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
        AbstractC23293c.C23302f fVar = (AbstractC23293c.C23302f) accessory;
        View view2 = hVar.itemView;
        C89219l.m154716b(view2, "");
        Context context = view2.getContext();
        C39258q b = C39659b.m80540b();
        if (!(b == null || (gVar = b.f92742a) == null || (valueOf = Integer.valueOf(gVar.f92701a)) == null)) {
            if (valueOf.intValue() == 0) {
                fVar.mo37964a(context.getString(R.string.dkl));
                return;
            } else if (valueOf.intValue() == 3) {
                fVar.mo37964a(context.getString(R.string.dkc));
                return;
            }
        }
        fVar.mo37964a((CharSequence) null);
    }
}
