package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.ApplyStatusCode;
import com.bytedance.p1399im.core.proto.ConversationApplyInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a */
public final class C54606a {

    /* renamed from: a */
    public IMUser f125158a;

    /* renamed from: b */
    public String f125159b;

    /* renamed from: c */
    public String f125160c;

    /* renamed from: d */
    public C19638h f125161d;

    /* renamed from: e */
    public long f125162e;

    /* renamed from: f */
    public ApplyStatusCode f125163f = ApplyStatusCode.INVALID;

    /* renamed from: g */
    public long f125164g;

    /* renamed from: h */
    public String f125165h;

    /* renamed from: i */
    public String f125166i;

    /* renamed from: j */
    public IMUser f125167j;

    /* renamed from: k */
    public Map<String, String> f125168k;

    static {
        Covode.recordClassIndex(64319);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a$a */
    public static final class C54607a implements AbstractC56230a {

        /* renamed from: a */
        final /* synthetic */ C54606a f125169a;

        static {
            Covode.recordClassIndex(64320);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54607a(C54606a aVar) {
            this.f125169a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91085a(IMUser iMUser) {
            this.f125169a.f125158a = iMUser;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91086a(Throwable th) {
            C89219l.m154721d(th, "");
            C89219l.m154721d(th, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a$b */
    public static final class C54608b implements AbstractC56230a {

        /* renamed from: a */
        final /* synthetic */ C54606a f125170a;

        static {
            Covode.recordClassIndex(64321);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54608b(C54606a aVar) {
            this.f125170a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91085a(IMUser iMUser) {
            this.f125170a.f125167j = iMUser;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91086a(Throwable th) {
            C89219l.m154721d(th, "");
            C89219l.m154721d(th, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a$c */
    public static final class C54609c implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ C54606a f125171a;

        static {
            Covode.recordClassIndex(64322);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54609c(C54606a aVar) {
            this.f125171a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo27861a(C19638h hVar) {
            this.f125171a.f125161d = hVar;
        }
    }

    /* renamed from: a */
    public final C54606a mo91671a(ConversationApplyInfo conversationApplyInfo) {
        String str;
        String str2;
        C89219l.m154721d(conversationApplyInfo, "");
        this.f125159b = String.valueOf(conversationApplyInfo.user_id.longValue());
        this.f125160c = conversationApplyInfo.sec_uid;
        Long l = conversationApplyInfo.apply_id;
        C89219l.m154716b(l, "");
        this.f125162e = l.longValue();
        this.f125163f = conversationApplyInfo.apply_status;
        Long l2 = conversationApplyInfo.create_time;
        C89219l.m154716b(l2, "");
        this.f125164g = l2.longValue();
        Long l3 = conversationApplyInfo.invite_user_id;
        String str3 = null;
        if (l3 != null) {
            str = String.valueOf(l3.longValue());
        } else {
            str = null;
        }
        this.f125165h = str;
        String str4 = conversationApplyInfo.sec_invite_uid;
        if (str4 != null) {
            str2 = str4.toString();
        } else {
            str2 = null;
        }
        this.f125166i = str2;
        this.f125168k = conversationApplyInfo.ext;
        if (conversationApplyInfo.user_id != null && this.f125158a == null) {
            C55085g.m100755a(this.f125159b, this.f125160c, new C54607a(this));
        }
        if (conversationApplyInfo.invite_user_id != null && this.f125167j == null) {
            C55085g.m100755a(this.f125165h, this.f125166i, new C54608b(this));
        }
        if (conversationApplyInfo.conv_short_id != null && this.f125161d == null) {
            AbstractC17420a a = AbstractC17420a.C17421a.m32276a();
            Long l4 = conversationApplyInfo.conv_short_id;
            if (l4 != null) {
                str3 = String.valueOf(l4.longValue());
            }
            a.mo27725a(str3, new C54609c(this));
        }
        return this;
    }
}
