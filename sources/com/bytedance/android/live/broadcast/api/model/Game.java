package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28027t;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

public class Game {
    @AbstractC27891c(mo46611a = "game_id")
    public long gameId;
    @AbstractC27891c(mo46611a = "icon")
    public ImageModel icon;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;

    static {
        Covode.recordClassIndex(3547);
    }

    public String toJsonString() {
        if (C6802e.f16869d != null) {
            return C6802e.f16869d.mo46674b(this);
        }
        return C4139e.C4140a.f11575b.mo46674b(this);
    }

    public static Game fromJson(String str) {
        try {
            if (C6802e.f16869d != null) {
                return (Game) C6802e.f16869d.mo46670a(str, Game.class);
            }
            return (Game) C4139e.C4140a.f11575b.mo46670a(str, Game.class);
        } catch (C28027t unused) {
            return null;
        }
    }
}
