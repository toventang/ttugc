package com.p2082ss.android.ugc.aweme.discover.p2767c;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1777x.p1780c.C23690a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42023j;
import com.p2082ss.android.ugc.aweme.discover.helper.C41980ab;
import com.p2082ss.android.ugc.aweme.discover.helper.C42056w;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42310c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42348c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42352e;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.p3000d.C51076a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.discover.c.e */
public final class C41902e {

    /* renamed from: a */
    static final IAwemeService f97764a = AwemeService.m70060b();

    /* renamed from: b */
    public static final C41902e f97765b = new C41902e();

    /* renamed from: c */
    private static final IRequestIdService f97766c = RequestIdService.m70076a();

    /* renamed from: d */
    private static AbstractC42023j f97767d;

    private C41902e() {
    }

    static {
        Covode.recordClassIndex(49828);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.e$a */
    static final class RunnableC41903a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C41902e f97768a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f97769b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f97770c;

        static {
            Covode.recordClassIndex(49829);
        }

        RunnableC41903a(C41902e eVar, C89233z.C89238e eVar2, C89233z.C89238e eVar3) {
            this.f97768a = eVar;
            this.f97769b = eVar2;
            this.f97770c = eVar3;
        }

        public final void run() {
            for (Aweme aweme : this.f97769b.element) {
                C41902e.f97764a.mo60677a(aweme);
            }
            for (Aweme aweme2 : this.f97770c.element) {
                C41902e.f97764a.mo60677a(aweme2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.c.e$b */
    public static final class C41904b extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ Music f97771a;

        static {
            Covode.recordClassIndex(49830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41904b(Music music) {
            super(1);
            this.f97771a = music;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            this.f97771a.getExtraParamFromPretreatment().put("rank", Integer.valueOf(num.intValue()));
            return 1;
        }
    }

    /* renamed from: a */
    private static void m83947a(C42411h hVar) {
        C42410g gVar = hVar.f98797g;
        if (gVar != null && gVar.f98787c == 2) {
            if (f97767d == null) {
                f97767d = new C41980ab();
            }
            AbstractC42023j jVar = f97767d;
            if (jVar != null) {
                jVar.mo71150a();
            }
        }
    }

    /* renamed from: a */
    public static List<C42411h> m83946a(List<? extends C42411h> list) {
        C89219l.m154721d(list, "");
        int i = 0;
        Set a = C89047am.m154438a((Object[]) new Integer[]{65465, 1048336});
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (!a.contains(Integer.valueOf(t2.getFeedType())) || (t2.getFeedType() == 1048336 && ((C42348c.m84712a() == 1 || C42348c.m84712a() == 2) && C42352e.m84720a(t2)))) {
                arrayList.add(t);
            }
        }
        List<C42411h> g = C89070n.m154585g((Collection) arrayList);
        ArrayList<Number> arrayList2 = new ArrayList();
        boolean z = false;
        int i2 = 0;
        for (T t3 : g) {
            if (!z && t3.mo71599a() && !(C16048b.m29633a().mo25412a(true, "video_title_optimization", 0) == 1 && i2 == 0)) {
                C23690a.m44774a(arrayList2, Integer.valueOf(i2));
            }
            t3.f98806p = i2;
            if (t3.mo71599a() || t3.getFeedType() == 1048336) {
                z = true;
            } else {
                z = false;
            }
            i2++;
        }
        for (Number number : arrayList2) {
            int intValue = number.intValue();
            C42411h hVar = new C42411h();
            hVar.setFeedType(65465);
            hVar.f98791a = C17867d.m33078a().getString(R.string.ff5);
            g.add(intValue + i, hVar);
            i++;
        }
        return g;
    }

    /* renamed from: a */
    public final void mo71063a(C42426m mVar) {
        int i;
        C89219l.m154721d(mVar, "");
        List<C42411h> list = mVar.f98850c;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new ArrayList();
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = (T) new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C42411h hVar = mVar.f98850c.get(i2);
            if (hVar == null) {
                C89219l.m154715b();
            }
            hVar.f98807q = mVar.logPb;
            C42310c.f98549b.mo71490a(hVar);
            if (hVar.getFeedType() == 65280) {
                eVar2.element.addAll(m83944a(hVar, mVar, i2));
            }
            if (hVar.getFeedType() == 65458) {
                for (SearchUser searchUser : hVar.f98792b) {
                    C89219l.m154716b(searchUser, "");
                    if (searchUser.user != null) {
                        User user = searchUser.user;
                        C89219l.m154716b(user, "");
                        user.setRequestId(mVar.getRequestId());
                        searchUser.mGlobalDoodleConfig = mVar.globalDoodleConfig;
                        List<Aweme> a = m83945a(searchUser, mVar.getRequestId());
                        if (a != null) {
                            eVar.element.addAll(a);
                        }
                    }
                }
            }
            if (hVar.getFeedType() == 65456) {
                C42056w.m84171a(hVar.f98794d);
                for (SearchChallenge searchChallenge : hVar.f98794d) {
                    if (searchChallenge != null) {
                        searchChallenge.setRequestId(mVar.getRequestId());
                        if (searchChallenge.getChallenge() != null) {
                            Challenge challenge = searchChallenge.getChallenge();
                            C89219l.m154716b(challenge, "");
                            challenge.setRequestId(mVar.getRequestId());
                        }
                    }
                }
            }
            if (hVar.getFeedType() == 65457) {
                m83947a(hVar);
                for (Music music : hVar.f98793c) {
                    if (music != null) {
                        m83948a(hVar, music);
                    }
                }
            }
            if (hVar.getFeedType() == 70) {
                List<Aweme> list2 = hVar.f98804n.f98893a;
                if (list2 == null) {
                    list2 = C89086z.INSTANCE;
                }
                for (Aweme aweme : list2) {
                    aweme.setRequestId(mVar.getRequestId());
                }
            }
        }
        C40780g.m82248e().submit(new RunnableC41903a(this, eVar, eVar2));
    }

    /* renamed from: a */
    private static List<Aweme> m83945a(SearchUser searchUser, String str) {
        if (searchUser == null || C13603b.m24435a((Collection) searchUser.awemeCards)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        List<Aweme> list = searchUser.awemeCards;
        C89219l.m154716b(list, "");
        for (T t : list) {
            if (t != null) {
                t.setRequestId(str);
                f97766c.mo60694a(t.getAid() + 9, str, i);
                arrayList.add(t);
            }
            i++;
        }
        searchUser.awemeCards = arrayList;
        return arrayList;
    }

    /* renamed from: a */
    private static void m83948a(C42411h hVar, Music music) {
        int i;
        music.setRequestId(hVar.getRequestId());
        C42410g gVar = hVar.f98797g;
        music.getExtraParamFromPretreatment().put(C42410g.class, hVar.f98797g);
        if (gVar != null) {
            i = gVar.f98787c;
        } else {
            i = 0;
        }
        music.setSoundsListType(i);
        AbstractC42023j jVar = f97767d;
        if (jVar != null) {
            jVar.mo71151a(new C41904b(music));
        }
    }

    /* renamed from: a */
    public static int m83943a(boolean z, List<? extends Aweme> list, int i) {
        if (z) {
            i = 0;
        }
        if (list != null) {
            for (T t : list) {
                t.setRank(i);
                t.getAid();
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static List<Aweme> m83944a(C42411h hVar, C42426m mVar, int i) {
        Aweme forwardItem;
        Aweme aweme = hVar.getAweme();
        ArrayList arrayList = new ArrayList();
        if (C51076a.m95487a(aweme)) {
            C89219l.m154716b(aweme, "");
            arrayList.add(aweme);
            IRequestIdService iRequestIdService = f97766c;
            iRequestIdService.mo60694a(aweme.getAid() + 9, mVar.getRequestId(), i);
            hVar.setAweme(aweme);
            mVar.f98850c.set(i, hVar);
            aweme.setRequestId(mVar.getRequestId());
            if (aweme.getAwemeType() == 13 && (forwardItem = aweme.getForwardItem()) != null) {
                forwardItem.setRepostFromGroupId(aweme.getAid());
                forwardItem.setRepostFromUserId(aweme.getAuthorUid());
                arrayList.add(forwardItem);
                iRequestIdService.mo60694a(forwardItem.getAid() + 1, mVar.getRequestId(), i);
                forwardItem.setRequestId(mVar.getRequestId());
            }
        }
        return arrayList;
    }
}
