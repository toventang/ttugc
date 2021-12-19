package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.AwemeDetailList;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3173d.C55074a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.b */
public final class C55262b {

    /* renamed from: a */
    public static final AbstractC89244h f126362a = C89250i.m154773a((AbstractC89171a) C55263a.f126365a);

    /* renamed from: b */
    public static final C55262b f126363b = new C55262b();

    /* renamed from: c */
    private static final AbstractC89244h f126364c = C89250i.m154773a((AbstractC89171a) C55264b.f126366a);

    /* renamed from: a */
    public static TikTokImApi m101019a() {
        return (TikTokImApi) f126364c.getValue();
    }

    private C55262b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.b$a */
    static final class C55263a extends AbstractC89220m implements AbstractC89171a<TikTokImApi> {

        /* renamed from: a */
        public static final C55263a f126365a = new C55263a();

        static {
            Covode.recordClassIndex(65012);
        }

        C55263a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TikTokImApi invoke() {
            return RetrofitFactory.m33635a().mo28817b(C55074a.f126043e).mo28832d().mo28858a(TikTokImApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.b$b */
    static final class C55264b extends AbstractC89220m implements AbstractC89171a<TikTokImApi> {

        /* renamed from: a */
        public static final C55264b f126366a = new C55264b();

        static {
            Covode.recordClassIndex(65013);
        }

        C55264b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TikTokImApi invoke() {
            return RetrofitFactory.m33635a().mo28817b(C55074a.f126042d).mo28832d().mo28858a(TikTokImApi.class);
        }
    }

    static {
        Covode.recordClassIndex(65011);
    }

    /* renamed from: a */
    public static AbstractC88979t<InviteCardDetailInnerResponse> m101020a(String str) {
        AbstractC88979t<InviteCardDetailInnerResponse> inviteCardDetailInner;
        if (str == null || (inviteCardDetailInner = m101019a().getInviteCardDetailInner(str)) == null) {
            return null;
        }
        return inviteCardDetailInner.mo143278b(C88925a.m154180b(C88946a.f201991c));
    }

    /* renamed from: b */
    public static AbstractC88979t<AcceptInviteCardResponse> m101022b(String str) {
        AbstractC88979t<AcceptInviteCardResponse> acceptInviteCard;
        if (str == null || (acceptInviteCard = m101019a().acceptInviteCard(str)) == null) {
            return null;
        }
        return acceptInviteCard.mo143278b(C88925a.m154180b(C88946a.f201991c));
    }

    /* renamed from: a */
    public static Object m101021a(String str, String str2, AbstractC89124d<? super AwemeDetailList> dVar) {
        return m101019a().queryAwemeList(str, str2, 0).mo144106a(dVar);
    }
}
