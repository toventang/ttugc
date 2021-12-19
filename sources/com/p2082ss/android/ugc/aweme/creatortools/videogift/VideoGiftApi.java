package com.p2082ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import java.util.concurrent.ExecutionException;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi */
public final class VideoGiftApi {

    /* renamed from: a */
    public static SetGiftSettingsApi f94741a;

    /* renamed from: b */
    public static GetGiftEligibilityApi f94742b;

    /* renamed from: c */
    public static final C40489a f94743c = new C40489a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi$GetGiftEligibilityApi */
    public interface GetGiftEligibilityApi {
        static {
            Covode.recordClassIndex(48297);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/gift/eligibility/")
        AbstractC88979t<C40513e> getGiftEligibilityInfo();
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi$SetGiftSettingsApi */
    public interface SetGiftSettingsApi {
        static {
            Covode.recordClassIndex(48298);
        }

        @AbstractC22012t(mo35799a = "/tiktok/v1/gift/setting/")
        @AbstractC89721e
        AbstractC88979t<C40515g> setGiftSettings(@AbstractC21997e(mo35786a = "accept_video_gift") int i);
    }

    static {
        Covode.recordClassIndex(48296);
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi$a */
    public static final class C40489a {
        static {
            Covode.recordClassIndex(48299);
        }

        private C40489a() {
        }

        /* renamed from: a */
        public static AbstractC88979t<C40513e> m81701a() {
            try {
                if (VideoGiftApi.f94742b == null) {
                    VideoGiftApi.f94742b = (GetGiftEligibilityApi) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(GetGiftEligibilityApi.class);
                }
                GetGiftEligibilityApi getGiftEligibilityApi = VideoGiftApi.f94742b;
                if (getGiftEligibilityApi == null) {
                    C89219l.m154715b();
                }
                return getGiftEligibilityApi.getGiftEligibilityInfo();
            } catch (ExecutionException e) {
                AbstractC34479a.getCompatibleException(e);
                AbstractC88979t<C40513e> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154716b(a, "");
                return a;
            }
        }

        public /* synthetic */ C40489a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88979t<C40515g> m81702a(boolean z) {
            try {
                if (VideoGiftApi.f94741a == null) {
                    VideoGiftApi.f94741a = (SetGiftSettingsApi) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(SetGiftSettingsApi.class);
                }
                SetGiftSettingsApi setGiftSettingsApi = VideoGiftApi.f94741a;
                if (setGiftSettingsApi == null) {
                    C89219l.m154715b();
                }
                return setGiftSettingsApi.setGiftSettings(z ? 1 : 0);
            } catch (ExecutionException e) {
                AbstractC34479a.getCompatibleException(e);
                AbstractC88979t<C40515g> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154716b(a, "");
                return a;
            }
        }
    }
}
