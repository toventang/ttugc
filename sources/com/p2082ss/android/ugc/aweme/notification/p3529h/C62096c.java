package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.notification.bean.C61865a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.c */
public final class C62096c extends C62129p {

    /* renamed from: a */
    public C61865a f140949a;

    /* renamed from: b */
    public final BaseNotificationVM f140950b;

    /* renamed from: c */
    private final AbstractC51538a f140951c;

    static {
        Covode.recordClassIndex(72850);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: d */
    public final void mo100081d() {
        super.mo100081d();
        this.f140951c.mo87041b();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        this.f140951c.mo87037a();
        C61865a aVar = this.f140949a;
        if (aVar != null && aVar.f140449a == 2010) {
            this.f140950b.mo100340a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo100132a(C61865a aVar) {
        Friend friend;
        if (aVar != null && (friend = aVar.f140450b) != null) {
            this.f140951c.mo87039a(friend);
            this.f140949a = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62096c(AbstractC51538a aVar, BaseNotificationVM baseNotificationVM) {
        super((View) aVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(baseNotificationVM, "");
        this.f140951c = aVar;
        this.f140950b = baseNotificationVM;
        aVar.setOutClickListener(new AbstractC89172b<String, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.C62096c.C620971 */

            /* renamed from: a */
            final /* synthetic */ C62096c f140952a;

            static {
                Covode.recordClassIndex(72851);
            }

            {
                this.f140952a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2 = str;
                C89219l.m154721d(str2, "");
                C56407f.m102374b(C620981.f140953a);
                C61865a aVar = this.f140952a.f140949a;
                if (aVar != null) {
                    this.f140952a.f140950b.mo100341a(aVar, str2);
                }
                return C89391z.f203057a;
            }
        });
    }
}
