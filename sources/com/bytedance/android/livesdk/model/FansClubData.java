package com.bytedance.android.livesdk.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import java.util.Map;

public class FansClubData {
    @AbstractC27891c(mo46611a = "anchor_id")
    public long anchorId;
    @AbstractC27891c(mo46611a = "available_gift_ids")
    public List<Long> availableGiftIds;
    @AbstractC27891c(mo46611a = "badge")
    public UserBadge badge;
    @AbstractC27891c(mo46611a = "club_name")
    public String clubName;
    @AbstractC27891c(mo46611a = "level")
    public int level;
    @AbstractC27891c(mo46611a = "user_fans_club_status")
    public int userFansClubStatus;

    public static class UserBadge {
        @AbstractC27891c(mo46611a = "icons")
        public Map<Integer, ImageModel> icons;
        @AbstractC27891c(mo46611a = "title")
        public String title;

        static {
            Covode.recordClassIndex(11031);
        }
    }

    static {
        Covode.recordClassIndex(11030);
    }

    public static boolean isValid(FansClubData fansClubData) {
        if (fansClubData == null || TextUtils.isEmpty(fansClubData.clubName)) {
            return false;
        }
        return true;
    }
}
