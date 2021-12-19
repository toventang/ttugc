package com.p2082ss.android.ugc.aweme.sticker.p3981q;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2214c.C31031b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75640p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.q.g */
public final class C75672g {
    static {
        Covode.recordClassIndex(88603);
    }

    /* renamed from: a */
    public static final PrivacyCert m132795a(AbstractC75640p.AbstractC75641a aVar) {
        C89219l.m154721d(aVar, "");
        if (C89219l.m154714a(aVar, AbstractC75640p.AbstractC75641a.C75642a.f170057a)) {
            return C31031b.f74358h;
        }
        if (C89219l.m154714a(aVar, AbstractC75640p.AbstractC75641a.C75643b.f170058a)) {
            return C31031b.f74359i;
        }
        if (C89219l.m154714a(aVar, AbstractC75640p.AbstractC75641a.C75644c.f170059a)) {
            return C31031b.f74361k;
        }
        if (C89219l.m154714a(aVar, AbstractC75640p.AbstractC75641a.C75647f.f170062a)) {
            return C31031b.f74360j;
        }
        if (C89219l.m154714a(aVar, AbstractC75640p.AbstractC75641a.C75646e.f170061a)) {
            return PrivacyCert.Builder.Companion.with("bpea-412").usage("Users can use the camera and microphone to create video works in TikTok when they are on the video shooting page.").tag("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
        } else if (C89219l.m154714a(aVar, AbstractC75640p.AbstractC75641a.C75645d.f170060a)) {
            return PrivacyCert.Builder.Companion.with("bpea-411").usage("Users can use the camera and microphone to create video works in TikTok when they are on the video shooting page.").tag("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
        } else if (aVar instanceof C75668d) {
            return ((C75668d) aVar).f170089a;
        } else {
            return null;
        }
    }
}
