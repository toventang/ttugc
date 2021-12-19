package com.p2082ss.android.ugc.aweme.ufr.contact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88416c;
import p4560f.p4561a.AbstractC88439e;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.contact.a */
public final class C79542a {

    /* renamed from: a */
    public static final C79542a f178511a = new C79542a();

    private C79542a() {
    }

    static {
        Covode.recordClassIndex(92746);
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.a$a */
    static final class C79543a implements AbstractC88439e {

        /* renamed from: a */
        public static final C79543a f178512a = new C79543a();

        static {
            Covode.recordClassIndex(92747);
        }

        C79543a() {
        }

        @Override // p4560f.p4561a.AbstractC88439e
        /* renamed from: a */
        public final void mo123083a(final AbstractC88416c cVar) {
            C89219l.m154721d(cVar, "");
            new ThirdPartyFriendModel("contact").uploadHashedContacts().mo5532a(new AbstractC1729g() {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.C79542a.C79543a.C795441 */

                static {
                    Covode.recordClassIndex(92748);
                }

                @Override // p077b.AbstractC1729g
                public final /* synthetic */ Object then(C1731i iVar) {
                    C89219l.m154716b(iVar, "");
                    if (iVar.mo5539b() || iVar.mo5544c()) {
                        cVar.mo142951a(iVar.mo5546e());
                    } else {
                        cVar.mo142950a();
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }
}
