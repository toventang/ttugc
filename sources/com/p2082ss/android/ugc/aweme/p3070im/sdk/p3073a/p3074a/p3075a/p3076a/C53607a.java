package com.p2082ss.android.ugc.aweme.p3070im.sdk.p3073a.p3074a.p3075a.p3076a;

import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55196f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.a.a.a.a.a */
public final class C53607a {

    /* renamed from: a */
    public final AbstractC50382f f123026a;

    static {
        Covode.recordClassIndex(63187);
    }

    public C53607a(AbstractC50382f fVar) {
        C89219l.m154721d(fVar, "");
        this.f123026a = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.a.a.a.a.a$a */
    public static final class DialogInterface$OnDismissListenerC53608a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C53607a f123027a;

        /* renamed from: b */
        final /* synthetic */ DataCenter f123028b;

        /* renamed from: c */
        final /* synthetic */ Fragment f123029c;

        static {
            Covode.recordClassIndex(63188);
        }

        public DialogInterface$OnDismissListenerC53608a(C53607a aVar, DataCenter dataCenter, Fragment fragment) {
            this.f123027a = aVar;
            this.f123028b = dataCenter;
            this.f123029c = fragment;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            int i = 0;
            this.f123028b.mo60191a("ENTER_DISLIKE_MODE", (Object) false);
            if (C55196f.m100911a(this.f123029c.getActivity())) {
                ActivityC0945e activity = this.f123029c.getActivity();
                if (activity != null) {
                    i = activity.hashCode();
                }
                C49678f fVar = new C49678f(i);
                if (C89219l.m154714a((Object) "report", (Object) this.f123027a.f123026a.mo85554d())) {
                    fVar.f114347g = true;
                }
                AbstractC81915c.m141874a(fVar);
            }
        }
    }
}
