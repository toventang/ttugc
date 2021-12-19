package com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.b */
public final class C37557b {

    /* renamed from: a */
    public static final C37557b f88760a = new C37557b();

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.b$a */
    public static final class C37558a extends C27895a<C75445g> {
        static {
            Covode.recordClassIndex(44955);
        }

        C37558a() {
        }
    }

    private C37557b() {
    }

    static {
        Covode.recordClassIndex(44954);
    }

    /* renamed from: a */
    public static final boolean m75727a(Challenge challenge) {
        if (challenge == null) {
            return false;
        }
        try {
            C75445g gVar = (C75445g) new C27910f().mo46671a(challenge.getChallengeStickerDetail(), new C37558a().type);
            if (gVar == null) {
                return false;
            }
            return CommerceStickerServiceImpl.m75788c().mo65425b().mo65428a(gVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
