package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.concurrent.ExecutionException;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi */
public final class CreatorPlusApi {

    /* renamed from: a */
    public static final AbstractC89244h f94684a = C11831d.m20835a(C40459b.f94686a);

    /* renamed from: b */
    public static final C40458a f94685b = new C40458a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi$CreatorPlusApi  reason: collision with other inner class name */
    public interface AbstractC90319CreatorPlusApi {
        static {
            Covode.recordClassIndex(48263);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/creator/plus/enroll")
        AbstractC88979t<BaseResponse> enrollForCreatorPlus();

        @AbstractC89722f(mo144276a = "/tiktok/v1/creator/plus/features")
        AbstractC88979t<C40471d> getCreatorPlusFeatures();
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi$a */
    public static final class C40458a {
        static {
            Covode.recordClassIndex(48264);
        }

        /* renamed from: c */
        private static AbstractC90319CreatorPlusApi m81694c() {
            return (AbstractC90319CreatorPlusApi) CreatorPlusApi.f94684a.getValue();
        }

        private C40458a() {
        }

        /* renamed from: a */
        public static AbstractC88979t<C40471d> m81692a() {
            try {
                return m81694c().getCreatorPlusFeatures();
            } catch (ExecutionException e) {
                AbstractC34479a.getCompatibleException(e);
                AbstractC88979t<C40471d> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154716b(a, "");
                return a;
            }
        }

        /* renamed from: b */
        public static AbstractC88979t<BaseResponse> m81693b() {
            try {
                return m81694c().enrollForCreatorPlus();
            } catch (ExecutionException e) {
                AbstractC34479a.getCompatibleException(e);
                AbstractC88979t<BaseResponse> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154716b(a, "");
                return a;
            }
        }

        public /* synthetic */ C40458a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi$b */
    static final class C40459b extends AbstractC89220m implements AbstractC89171a<AbstractC90319CreatorPlusApi> {

        /* renamed from: a */
        public static final C40459b f94686a = new C40459b();

        static {
            Covode.recordClassIndex(48265);
        }

        C40459b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC90319CreatorPlusApi invoke() {
            return RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(AbstractC90319CreatorPlusApi.class);
        }
    }

    static {
        Covode.recordClassIndex(48262);
    }
}
