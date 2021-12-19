package com.p2082ss.android.ugc.aweme.notification.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.TabFragmentNode;
import com.p2082ss.android.ugc.aweme.experiment.C46722ay;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.NotificationTab */
public final class NotificationTab extends TabFragmentNode {

    /* renamed from: b */
    public final Context f141367b;

    /* renamed from: c */
    private View.OnClickListener f141368c;

    /* renamed from: d */
    private final AbstractC89244h f141369d = C89250i.m154773a((AbstractC89171a) new C62283a(this));

    static {
        Covode.recordClassIndex(73062);
    }

    /* renamed from: b */
    private final C33931ar m112680b() {
        return (C33931ar) this.f141369d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return "NOTIFICATION";
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: e */
    public final String mo25233e() {
        return "notification_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: Y_ */
    public final String mo62207Y_() {
        return m112680b().f100355i;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.NotificationTab$a */
    static final class C62283a extends AbstractC89220m implements AbstractC89171a<C33931ar> {

        /* renamed from: a */
        final /* synthetic */ NotificationTab f141370a;

        static {
            Covode.recordClassIndex(73063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62283a(NotificationTab notificationTab) {
            super(0);
            this.f141370a = notificationTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33931ar invoke() {
            return C62309h.m112710a(this.f141370a.f141367b);
        }
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return HomePageUIFrameServiceImpl.m108627e().mo89386b("NOTIFICATION");
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        Intent intent;
        Context context = this.f141367b;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return m112679a(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: h */
    public final void mo57292h() {
        if (this.f141368c == null) {
            this.f141368c = new View$OnClickListenerC62284a(this.f141367b);
        }
        View.OnClickListener onClickListener = this.f141368c;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* renamed from: a */
    private static Bundle m112679a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public NotificationTab(Context context) {
        C89219l.m154721d(context, "");
        this.f141367b = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: a */
    public final View mo62208a(AbstractC35331bz bzVar) {
        C89219l.m154721d(bzVar, "");
        if (!C46722ay.m90105a()) {
            return bzVar.mo62210a(m112680b());
        }
        View d = HomePageUIFrameServiceImpl.m108627e().mo89391d();
        if (d == null) {
            return bzVar.mo62210a(m112680b());
        }
        return d;
    }
}
