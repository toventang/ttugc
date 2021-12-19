package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.notification.bean.EnumC61874i;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.j */
public final class C62116j extends C62129p {

    /* renamed from: a */
    public final Fragment f140978a;

    /* renamed from: b */
    private final AbstractC1214u<EnumC61874i> f140979b;

    static {
        Covode.recordClassIndex(72870);
    }

    /* renamed from: c */
    public final TuxStatusView mo100067c() {
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        return (TuxStatusView) view;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: d */
    public final void mo100081d() {
        super.mo100081d();
        BaseNotificationVM baseNotificationVM = this.f140768h;
        Objects.requireNonNull(baseNotificationVM, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationVM");
        ((NotificationVM) baseNotificationVM).mo100354j().mo100437c().removeObserver(this.f140979b);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        BaseNotificationVM baseNotificationVM = this.f140768h;
        Objects.requireNonNull(baseNotificationVM, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationVM");
        NotificationVM notificationVM = (NotificationVM) baseNotificationVM;
        notificationVM.mo100354j().mo100437c().observe(this.f140978a, this.f140979b);
        mo100067c().setVisibility(0);
        mo100067c().mo37867a();
        if (!notificationVM.mo100354j().mo100438d()) {
            notificationVM.mo100354j().mo100444j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.j$a */
    static final class C62117a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C62116j f140980a;

        /* renamed from: b */
        final /* synthetic */ View f140981b;

        static {
            Covode.recordClassIndex(72871);
        }

        C62117a(C62116j jVar, View view) {
            this.f140980a = jVar;
            this.f140981b = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == EnumC61874i.ERROR) {
                TuxStatusView c = this.f140980a.mo100067c();
                TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                String string = this.f140981b.getContext().getString(R.string.eyo);
                C89219l.m154716b(string, "");
                c.setStatus(cVar.mo37878a((CharSequence) string));
                View findViewById = this.f140980a.mo100067c().findViewById(R.id.er8);
                C89219l.m154716b(findViewById, "");
                findViewById.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62116j(View view, Fragment fragment) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        this.f140978a = fragment;
        this.f140979b = new C62117a(this, view);
    }
}
