package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.c */
public final class C39878c extends AbstractC39714c {
    static {
        Covode.recordClassIndex(47615);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.c$a */
    public static final class C39879a implements AbstractC39714c.AbstractC39715a {
        static {
            Covode.recordClassIndex(47616);
        }

        C39879a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.c$a$a */
        static final class View$OnTouchListenerC39880a implements View.OnTouchListener {

            /* renamed from: a */
            final /* synthetic */ View f93834a;

            static {
                Covode.recordClassIndex(47617);
            }

            View$OnTouchListenerC39880a(View view) {
                this.f93834a = view;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f93834a.clearFocus();
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c.AbstractC39715a
        /* renamed from: a */
        public final C39723h mo69096a(Context context, ViewGroup viewGroup) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(viewGroup, "");
            IComplianceBusinessService d = C39223a.m79590d();
            Context context2 = viewGroup.getContext();
            C89219l.m154716b(context2, "");
            View a = d.mo68611a(context2, viewGroup);
            if (a == null) {
                C89219l.m154715b();
            }
            a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            viewGroup.setOnTouchListener(new View$OnTouchListenerC39880a(a));
            return new C39723h(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final AbstractC39714c.AbstractC39715a mo69094a() {
        return new C39879a();
    }
}
