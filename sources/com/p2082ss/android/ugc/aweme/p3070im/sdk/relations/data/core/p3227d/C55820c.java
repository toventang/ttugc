package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3227d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.Comparator;
import java.util.Objects;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.c */
public final class C55820c extends AbstractC55816a<IMContact> {

    /* renamed from: b */
    public static final C55821a f127250b = new C55821a((byte) 0);

    static {
        Covode.recordClassIndex(65606);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.c$a */
    public static final class C55821a {
        static {
            Covode.recordClassIndex(65607);
        }

        private C55821a() {
        }

        public /* synthetic */ C55821a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55820c(C55732c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.c$b */
    public static final class C55822b<T> implements Comparator {

        /* renamed from: a */
        public static final C55822b f127251a = new C55822b();

        static {
            Covode.recordClassIndex(65608);
        }

        C55822b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            IMContact iMContact = (IMContact) obj;
            IMContact iMContact2 = (IMContact) obj2;
            Objects.requireNonNull(iMContact2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            Long valueOf = Long.valueOf(((IMUser) iMContact2).getFriendRecTime());
            Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            return C89090a.m154604a(valueOf, Long.valueOf(((IMUser) iMContact).getFriendRecTime()));
        }
    }
}
