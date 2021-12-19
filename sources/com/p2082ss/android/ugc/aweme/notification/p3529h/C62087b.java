package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.C56398e;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66621e;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.b */
public final class C62087b extends C62129p implements AbstractC66619c {

    /* renamed from: a */
    private AbstractC62100e f140930a;

    /* renamed from: b */
    private final AbstractC66617b f140931b;

    /* renamed from: c */
    private final BaseNotificationVM f140932c;

    static {
        Covode.recordClassIndex(72841);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: b */
    public final void mo91925b(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: c */
    public final void mo91926c(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        if (!this.f140932c.f141489b) {
            this.f140932c.f141489b = true;
            C62259e.m112620a("authorize_card_show", this.f140932c.mo100349h());
        }
    }

    /* renamed from: c */
    public final void mo100067c() {
        EnumC66621e eVar;
        String str;
        if (this.f140932c.mo100349h() == EnumC56508r.TOP) {
            eVar = EnumC66621e.INBOX_NORMAL;
            str = "top";
        } else {
            eVar = EnumC66621e.INBOX_SMALL;
            str = "bottom";
        }
        this.f140931b.mo61459a(EnumC66622f.CONTACT, eVar, -1);
        this.f140931b.setUFRExternalParams(C89041ag.m154412a(C89387v.m154943a("position", str)));
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: a */
    public final void mo100078a(AbstractC62100e eVar) {
        this.f140930a = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.b$a */
    static final class C62088a extends AbstractC89220m implements AbstractC89172b<C56398e.C56399a, C89391z> {

        /* renamed from: a */
        public static final C62088a f140933a = new C62088a();

        static {
            Covode.recordClassIndex(72842);
        }

        C62088a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56398e.C56399a aVar) {
            C56398e.C56399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo93389b();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final boolean onLongClick(View view) {
        AbstractC62100e eVar = this.f140930a;
        if (eVar == null) {
            return true;
        }
        eVar.mo93497a(getLayoutPosition());
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: a */
    public final void mo91924a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        EnumC56501q.CONTACTS.markAction();
        if (this.f140932c.mo100349h() == EnumC56508r.BOTTOM) {
            C56407f.m102374b(C62088a.f140933a);
        }
        C62259e.m112620a("find_friends", this.f140932c.mo100349h());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62087b(AbstractC66617b bVar, BaseNotificationVM baseNotificationVM) {
        super(bVar.getContainer());
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(baseNotificationVM, "");
        this.f140931b = bVar;
        this.f140932c = baseNotificationVM;
        bVar.setActionListener(this);
        bVar.mo9139b();
        bVar.setUFRSubscription((C88411a) baseNotificationVM.f141490c.getValue());
        bVar.setEnterFrom("notification_page");
        this.itemView.setOnLongClickListener(this);
    }
}
