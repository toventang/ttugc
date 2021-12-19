package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3572a.C63553c;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.PronounsAPI */
public interface PronounsAPI {

    /* renamed from: a */
    public static final C63554a f144232a = C63554a.f144233a;

    static {
        Covode.recordClassIndex(74869);
    }

    @AbstractC89731o(mo144285a = "/tiktok/user/profile/pronoun/update/v1")
    @AbstractC89721e
    AbstractC88979t<C63553c> updatePronouns(@AbstractC89719c(mo144273a = "pronouns") String str);

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.PronounsAPI$a */
    public static final class C63554a {

        /* renamed from: a */
        static final /* synthetic */ C63554a f144233a = new C63554a();

        private C63554a() {
        }

        static {
            Covode.recordClassIndex(74870);
        }
    }
}
