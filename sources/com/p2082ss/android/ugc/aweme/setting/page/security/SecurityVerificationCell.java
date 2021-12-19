package com.p2082ss.android.ugc.aweme.setting.page.security;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.powerlist.PowerCell;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.page.base.C68261c;
import com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell */
public final class SecurityVerificationCell extends RightTextCell<C68337f> {

    /* renamed from: b */
    private final AbstractC89244h f152917b = C89250i.m154773a((AbstractC89171a) new C68331c(this));

    static {
        Covode.recordClassIndex(80552);
    }

    /* renamed from: b */
    private final SecurityViewModel m120616b() {
        return (SecurityViewModel) this.f152917b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell$c */
    static final class C68331c extends AbstractC89220m implements AbstractC89171a<SecurityViewModel> {

        /* renamed from: a */
        final /* synthetic */ SecurityVerificationCell f152920a;

        static {
            Covode.recordClassIndex(80555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68331c(SecurityVerificationCell securityVerificationCell) {
            super(0);
            this.f152920a = securityVerificationCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SecurityViewModel invoke() {
            return PowerCell.m32713b(this.f152920a, SecurityViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell$a */
    static final class C68329a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SecurityVerificationCell f152918a;

        static {
            Covode.recordClassIndex(80553);
        }

        C68329a(SecurityVerificationCell securityVerificationCell) {
            this.f152918a = securityVerificationCell;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Boolean> iVar) {
            int i;
            if (!C80214ai.m139043a(iVar)) {
                return null;
            }
            C89219l.m154716b(iVar, "");
            Boolean d = iVar.mo5545d();
            if (d != null) {
                C68261c cVar = (C68261c) this.f152918a.f42160d;
                if (cVar != null) {
                    if (C89219l.m154714a((Object) d, (Object) true)) {
                        i = R.string.g3j;
                    } else {
                        i = R.string.g3h;
                    }
                    cVar.f152807b = i;
                }
                this.f152918a.mo108752a();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell$b */
    static final class C68330b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SecurityVerificationCell f152919a;

        static {
            Covode.recordClassIndex(80554);
        }

        C68330b(SecurityVerificationCell securityVerificationCell) {
            this.f152919a = securityVerificationCell;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                SecurityVerificationCell securityVerificationCell = this.f152919a;
                C31575b.m65859a();
                C31575b.f75524a.mo57077m().getTwoStepVerificationStatusFromNetwork().mo5534a(new C68329a(securityVerificationCell), C1731i.f5564c, null);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final void mo28067a(Object obj) {
        SecurityViewModel b;
        C1213t<Boolean> tVar;
        super.mo28072k();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationItem");
        this.f42160d = (C68337f) obj;
        AbstractC1204m i = mo28070i();
        if (i != null && (b = m120616b()) != null && (tVar = b.f152921a) != null) {
            tVar.observe(i, new C68330b(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        String str;
        int i;
        C89219l.m154721d(view, "");
        super.onClick(view);
        View view2 = this.itemView;
        String str2 = null;
        if (!(view2 instanceof CommonItemView)) {
            view2 = null;
        }
        CommonItemView commonItemView = (CommonItemView) view2;
        if (commonItemView != null) {
            CharSequence textRight = commonItemView.getTextRight();
            Activity activity = ((RightTextCell) this).f152793a;
            if (activity != null) {
                str = activity.getString(R.string.g3j);
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) textRight, (Object) str)) {
                i = 1;
            } else {
                Activity activity2 = ((RightTextCell) this).f152793a;
                if (activity2 != null) {
                    str2 = activity2.getString(R.string.g3h);
                }
                if (C89219l.m154714a((Object) textRight, (Object) str2)) {
                    i = 0;
                } else {
                    i = -1;
                }
            }
            C39162r.m79460a("click_2_step_authentication", new C33744d().mo59980a("state", i).f79943a);
            SecurityViewModel b = m120616b();
            if (b != null) {
                b.f152922b = true;
            }
            Activity activity3 = ((RightTextCell) this).f152793a;
            if (activity3 != null) {
                C31575b.m65859a();
                C31575b.f75524a.mo57077m().openTwoStepVerificationManageActivity(activity3, "setting_security");
            }
        }
    }
}
