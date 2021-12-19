package com.p2082ss.android.ugc.aweme.qainvitation.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65844a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65845b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65846c;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65850g;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65853j;
import java.util.concurrent.ExecutionException;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI */
public final class QAInvitationAPI {

    /* renamed from: a */
    public static final AbstractC89244h f148155a = C89250i.m154773a((AbstractC89171a) C65760b.f148157a);

    /* renamed from: b */
    public static final C65759a f148156b = new C65759a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI$QAInvitationAPI  reason: collision with other inner class name */
    public interface AbstractC90320QAInvitationAPI {
        static {
            Covode.recordClassIndex(77259);
        }

        @AbstractC89722f(mo144276a = "/tiktok/interaction/mention/general/check/v1")
        AbstractC88979t<C65853j> getFilteredContacts(@AbstractC89736t(mo144292a = "mention_type") String str, @AbstractC89736t(mo144292a = "uids") String str2);

        @AbstractC89722f(mo144276a = "/tiktok/v1/forum/question/inviters/")
        AbstractC88979t<C65845b> getInvitedList(@AbstractC89736t(mo144292a = "user_id") long j, @AbstractC89736t(mo144292a = "question_id") long j2, @AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/tiktok/v1/forum/question/invitees/")
        AbstractC88979t<C65846c> getInviteeList(@AbstractC89736t(mo144292a = "question_id") long j);

        @AbstractC89722f(mo144276a = "/tiktok/interaction/mention/recent/contact/query/v1")
        AbstractC88979t<C65850g> getRecentContacts(@AbstractC89736t(mo144292a = "mention_type") int i);

        @AbstractC89731o(mo144285a = "/tiktok/v1/forum/question/invite/")
        @AbstractC89721e
        AbstractC88979t<C65844a> submitInviteeList(@AbstractC89719c(mo144273a = "question_id") long j, @AbstractC89719c(mo144273a = "invited_users") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI$a */
    public static final class C65759a {
        static {
            Covode.recordClassIndex(77260);
        }

        /* renamed from: a */
        private static AbstractC90320QAInvitationAPI m117684a() {
            return (AbstractC90320QAInvitationAPI) QAInvitationAPI.f148155a.getValue();
        }

        private C65759a() {
        }

        public /* synthetic */ C65759a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88979t<C65850g> m117685a(int i) {
            try {
                return m117684a().getRecentContacts(i);
            } catch (ExecutionException unused) {
                AbstractC88979t<C65850g> b = AbstractC88979t.m154310b(new C65850g((byte) 0));
                C89219l.m154716b(b, "");
                return b;
            }
        }

        /* renamed from: a */
        public static AbstractC88979t<C65846c> m117686a(long j) {
            try {
                return m117684a().getInviteeList(j);
            } catch (ExecutionException unused) {
                AbstractC88979t<C65846c> b = AbstractC88979t.m154310b(new C65846c((byte) 0));
                C89219l.m154716b(b, "");
                return b;
            }
        }

        /* renamed from: a */
        public static AbstractC88979t<C65844a> m117688a(long j, String str) {
            C89219l.m154721d(str, "");
            try {
                return m117684a().submitInviteeList(j, str);
            } catch (ExecutionException unused) {
                AbstractC88979t<C65844a> b = AbstractC88979t.m154310b(new C65844a((byte) 0));
                C89219l.m154716b(b, "");
                return b;
            }
        }

        /* renamed from: a */
        public static AbstractC88979t<C65853j> m117689a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            try {
                return m117684a().getFilteredContacts(str, str2);
            } catch (ExecutionException unused) {
                AbstractC88979t<C65853j> b = AbstractC88979t.m154310b(new C65853j((byte) 0));
                C89219l.m154716b(b, "");
                return b;
            }
        }

        /* renamed from: a */
        public static AbstractC88979t<C65845b> m117687a(long j, long j2, int i) {
            try {
                return m117684a().getInvitedList(j, j2, i, 30);
            } catch (ExecutionException unused) {
                AbstractC88979t<C65845b> b = AbstractC88979t.m154310b(new C65845b((byte) 0));
                C89219l.m154716b(b, "");
                return b;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI$b */
    static final class C65760b extends AbstractC89220m implements AbstractC89171a<AbstractC90320QAInvitationAPI> {

        /* renamed from: a */
        public static final C65760b f148157a = new C65760b();

        static {
            Covode.recordClassIndex(77261);
        }

        C65760b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC90320QAInvitationAPI invoke() {
            return RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(AbstractC90320QAInvitationAPI.class);
        }
    }

    static {
        Covode.recordClassIndex(77258);
    }
}
