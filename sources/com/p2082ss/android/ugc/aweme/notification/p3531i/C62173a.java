package com.p2082ss.android.ugc.aweme.notification.p3531i;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notification.i.a */
public final class C62173a extends C62208i.C62209a {

    /* renamed from: a */
    private final AbstractC89244h f141171a = C61862a.m111996a(new C62174a(this));

    static {
        Covode.recordClassIndex(72927);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.a$a */
    static final class C62174a extends AbstractC89220m implements AbstractC89171a<NotificationVM> {

        /* renamed from: a */
        final /* synthetic */ C62173a f141172a;

        static {
            Covode.recordClassIndex(72928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62174a(C62173a aVar) {
            super(0);
            this.f141172a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.C62378a.m112820a(this.f141172a.mo100206j());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100172a() {
        Intent intent;
        ActivityC0945e activity = mo100206j().getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            String a = m112445a(intent, "label");
            String a2 = m112445a(intent, "uid");
            intent.putExtra("label", "");
            if (TextUtils.equals(a, "follow_request")) {
                mo100206j().startActivityForResult(SmartRouter.buildRoute(mo100206j().getContext(), "aweme://follow_request").withParam("label", a).withParam("uid", a2).buildIntent(), 1024);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100173a(int i) {
        if (i == 1024) {
            C62455c j = ((NotificationVM) this.f141171a.getValue()).mo100354j();
            if (!(j instanceof C62474d)) {
                j = null;
            }
            C62474d dVar = (C62474d) j;
            if (dVar != null) {
                dVar.mo100452m();
            }
        }
    }

    /* renamed from: a */
    private static String m112445a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
