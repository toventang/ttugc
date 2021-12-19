package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.gy */
public final class C80519gy {

    /* renamed from: a */
    public static final C80519gy f180134a = new C80519gy();

    private C80519gy() {
    }

    static {
        Covode.recordClassIndex(93792);
    }

    /* renamed from: a */
    public static final String m139578a(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (!(roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                return String.valueOf(newLiveRoomData.f114485id);
            }
        } else if (aweme.getAuthor() != null) {
            User author = aweme.getAuthor();
            C89219l.m154716b(author, "");
            if (author.isLive()) {
                return String.valueOf(aweme.getAuthor().roomId);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final String m139579b(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (!(roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                return String.valueOf(newLiveRoomData.getAnchorId());
            }
        } else if (aweme.getAuthor() != null) {
            User author = aweme.getAuthor();
            C89219l.m154716b(author, "");
            if (author.isLive()) {
                User author2 = aweme.getAuthor();
                C89219l.m154716b(author2, "");
                return author2.getUid().toString();
            }
        }
        return null;
    }
}
