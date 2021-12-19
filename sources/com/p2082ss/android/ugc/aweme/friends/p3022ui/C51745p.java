package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.p */
final /* synthetic */ class C51745p implements AbstractC88433f {

    /* renamed from: a */
    private final ContactsActivity f119252a;

    static {
        Covode.recordClassIndex(61108);
    }

    C51745p(ContactsActivity contactsActivity) {
        this.f119252a = contactsActivity;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        ContactsActivity contactsActivity = this.f119252a;
        C79546d dVar = (C79546d) obj;
        if ((dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) && !dVar.f178517b.f178518a) {
            if (dVar.f178517b.f178520c == 1) {
                contactsActivity.f118998m = true;
            } else {
                contactsActivity.finish();
            }
        }
        if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178518a) {
            contactsActivity.mo87362d();
        }
    }
}
