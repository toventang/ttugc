package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3225b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.b */
public final class C55796b extends AbstractC55795a<IMContact> {

    /* renamed from: b */
    public static final C55797a f127223b = new C55797a((byte) 0);

    static {
        Covode.recordClassIndex(65582);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.b$a */
    public static final class C55797a {
        static {
            Covode.recordClassIndex(65583);
        }

        private C55797a() {
        }

        public /* synthetic */ C55797a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C55796b m101580a(C55732c cVar) {
            C89219l.m154721d(cVar, "");
            return new C55796b(cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55796b(C55732c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: a */
    public final boolean mo92658a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        if (!this.f127222a.mo92609a() && !this.f127222a.f127114e) {
            return true;
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            if (iMUser.getShareStatus() == 2) {
                C56244a.m102185a("CannotMessageFilter", "user has been filter " + iMUser.getUid() + " shareStatus:" + iMUser.getShareStatus());
                return false;
            }
        }
        if (!(iMContact instanceof IMConversation) || ((IMConversation) iMContact).getConversationMemberCount() != 0) {
            return true;
        }
        return false;
    }
}
