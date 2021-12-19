package com.p2082ss.android.ugc.aweme.p2282ad.comment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.C33168a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.i */
public final class C33174i {

    /* renamed from: a */
    public static final AbstractC33173h f78834a = C33177c.f78836a;

    /* renamed from: b */
    public static final C33176b f78835b = new C33176b((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.i$b */
    public static final class C33176b {
        static {
            Covode.recordClassIndex(39995);
        }

        private C33176b() {
        }

        public /* synthetic */ C33176b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.i$c */
    static final class C33177c {

        /* renamed from: a */
        static final C33175a f78836a = new C33175a();

        /* renamed from: b */
        public static final C33177c f78837b = new C33177c();

        private C33177c() {
        }

        static {
            Covode.recordClassIndex(39996);
        }
    }

    static {
        Covode.recordClassIndex(39993);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.i$a */
    static final class C33175a implements AbstractC33173h {
        static {
            Covode.recordClassIndex(39994);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.AbstractC33173h
        /* renamed from: a */
        public final List<TextExtraStruct> mo59078a(C38255s sVar, AwemeRawAd awemeRawAd, AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(aVar, "");
            if (sVar.getCommentStyle() == 1) {
                IAdCommentDepend iAdCommentDepend = C33168a.f78817a;
                if (iAdCommentDepend != null) {
                    return iAdCommentDepend.mo59054a(sVar, awemeRawAd, aVar);
                }
                return null;
            }
            IAdCommentDepend iAdCommentDepend2 = C33168a.f78817a;
            if (iAdCommentDepend2 != null) {
                return iAdCommentDepend2.mo59053a(sVar);
            }
            return null;
        }
    }
}
