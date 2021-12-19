package com.p2082ss.android.ugc.aweme.challenge.p2452h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p2082ss.android.ugc.aweme.challenge.model.MixCardStruct;
import com.p2082ss.android.ugc.aweme.challenge.model.RoomStructV2;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35671y;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.h.a */
public final class C35534a {

    /* renamed from: a */
    public static final C35534a f83798a = new C35534a();

    private C35534a() {
    }

    static {
        Covode.recordClassIndex(42730);
    }

    /* renamed from: a */
    public static List<Aweme> m72628a(ChallengeAwemeList challengeAwemeList) {
        Aweme aweme;
        C89219l.m154721d(challengeAwemeList, "");
        List<MixCardStruct> list = challengeAwemeList.mixList;
        if (list == null || list.isEmpty()) {
            return challengeAwemeList.items;
        }
        List<MixCardStruct> list2 = challengeAwemeList.mixList;
        C89219l.m154716b(list2, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list2) {
            T t2 = t;
            if (C35671y.f84158a.enableLiveChallenge()) {
                if (!(t2.getType() == 1 || t2.getType() == 2)) {
                }
            } else if (t2.getType() != 1) {
            }
            arrayList.add(t);
        }
        ArrayList<MixCardStruct> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        for (MixCardStruct mixCardStruct : arrayList2) {
            if (mixCardStruct.isLive()) {
                aweme = new Aweme();
                aweme.setAwemeType(101);
                RoomStructV2 roomInfo = mixCardStruct.getRoomInfo();
                Long l = null;
                aweme.setNewLiveRoomDataStr(roomInfo != null ? roomInfo.getRawdata() : null);
                StringBuilder sb = new StringBuilder();
                LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
                if (newLiveRoomData != null) {
                    l = Long.valueOf(newLiveRoomData.f114485id);
                }
                aweme.setAid(sb.append(l).toString());
                aweme.setRequestId(challengeAwemeList.getRequestId());
            } else {
                aweme = mixCardStruct.getAweme();
                if (aweme == null) {
                    C89219l.m154715b();
                }
            }
            arrayList3.add(aweme);
        }
        return C89070n.m154585g((Collection) arrayList3);
    }
}
