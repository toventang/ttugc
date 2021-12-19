package com.p2082ss.android.ugc.aweme.tools.music.p4128e;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.a */
public final class C78819a implements AbstractC27235f<Challenge, AVChallenge> {

    /* renamed from: a */
    public static final C78820a f177137a = new C78820a((byte) 0);

    static {
        Covode.recordClassIndex(91962);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.a$a */
    public static final class C78820a {
        static {
            Covode.recordClassIndex(91963);
        }

        private C78820a() {
        }

        public /* synthetic */ C78820a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AVChallenge mo45319a(Challenge challenge) {
        return m137583a(challenge);
    }

    /* renamed from: a */
    public static AVChallenge m137583a(Challenge challenge) {
        AVChallenge aVChallenge = new AVChallenge();
        if (challenge == null) {
            C89219l.m154715b();
        }
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        aVChallenge.musicId = m137584b(challenge);
        aVChallenge.mvId = challenge.getMvId();
        aVChallenge.mStatus = false;
        return aVChallenge;
    }

    /* renamed from: b */
    private static String m137584b(Challenge challenge) {
        Music music;
        Music music2;
        List<Music> connectMusics;
        Music music3;
        Music music4;
        List<Music> connectMusics2;
        Music music5;
        if (challenge != null) {
            if (challenge.isCommerce()) {
                ICommerceMediaService f = CommerceMediaServiceImpl.m77578f();
                List<Music> connectMusics3 = challenge.getConnectMusics();
                if (connectMusics3 != null) {
                    music4 = (Music) C89070n.m154583g((List) connectMusics3);
                } else {
                    music4 = null;
                }
                if (f.mo66512a(music4) || (connectMusics2 = challenge.getConnectMusics()) == null || (music5 = (Music) C89070n.m154583g((List) connectMusics2)) == null) {
                    return null;
                }
                return music5.getMid();
            } else if (challenge.isStrongMusic()) {
                if (CommerceMediaServiceImpl.m77578f().mo66511a()) {
                    ICommerceMediaService f2 = CommerceMediaServiceImpl.m77578f();
                    List<Music> connectMusics4 = challenge.getConnectMusics();
                    if (connectMusics4 != null) {
                        music2 = (Music) C89070n.m154583g((List) connectMusics4);
                    } else {
                        music2 = null;
                    }
                    if (f2.mo66512a(music2) || (connectMusics = challenge.getConnectMusics()) == null || (music3 = (Music) C89070n.m154583g((List) connectMusics)) == null) {
                        return null;
                    }
                    return music3.getMid();
                }
                List<Music> connectMusics5 = challenge.getConnectMusics();
                if (!(connectMusics5 == null || (music = (Music) C89070n.m154583g((List) connectMusics5)) == null)) {
                    return music.getMid();
                }
            }
        }
        return null;
    }
}
