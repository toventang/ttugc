package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.au */
public final class C62068au extends C62129p {

    /* renamed from: a */
    private TuxTextView f140896a;

    /* renamed from: b */
    private TuxIconView f140897b;

    static {
        Covode.recordClassIndex(72822);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: b */
    public final void mo100121b(String str) {
        C89219l.m154721d(str, "");
        this.f140896a.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62068au(View view, final BaseNotificationVM baseNotificationVM) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(baseNotificationVM, "");
        View findViewById = view.findViewById(R.id.ezz);
        C89219l.m154716b(findViewById, "");
        this.f140896a = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ex7);
        C89219l.m154716b(findViewById2, "");
        TuxIconView tuxIconView = (TuxIconView) findViewById2;
        this.f140897b = tuxIconView;
        tuxIconView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.C62068au.View$OnClickListenerC620691 */

            /* renamed from: a */
            final /* synthetic */ C62068au f140898a;

            static {
                Covode.recordClassIndex(72823);
            }

            {
                this.f140898a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                IRecommendUsersService j = IRecommendUsersServiceImpl.m118438j();
                Context context = this.f140898a.f140983i;
                Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                j.mo105654a((ActivityC0945e) context);
                String b = baseNotificationVM.mo100343b();
                C89219l.m154721d(b, "");
                C39162r.m79460a("click_suggested_account_information", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", b).f79943a);
            }
        });
    }
}
