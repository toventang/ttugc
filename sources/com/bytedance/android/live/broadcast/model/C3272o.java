package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.model.o */
public final class C3272o {
    @AbstractC27891c(mo46611a = "cover")

    /* renamed from: a */
    public ImageModel f9366a;
    @AbstractC27891c(mo46611a = "cover_audit_status")

    /* renamed from: b */
    public long f9367b;
    @AbstractC27891c(mo46611a = "last_room_id")

    /* renamed from: c */
    public long f9368c;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    public String f9369d;
    @AbstractC27891c(mo46611a = "go_live_prompt")

    /* renamed from: e */
    public String f9370e;
    @AbstractC27891c(mo46611a = "live_scenario")

    /* renamed from: f */
    public C3258e f9371f;
    @AbstractC27891c(mo46611a = "never_go_live_flag")

    /* renamed from: g */
    public int f9372g;
    @AbstractC27891c(mo46611a = "anchor_prompt_type")

    /* renamed from: h */
    public int f9373h;
    @AbstractC27891c(mo46611a = "live_additional_prompt")

    /* renamed from: i */
    public String f9374i;
    @AbstractC27891c(mo46611a = "anchor_fans_info")

    /* renamed from: j */
    public C3253a f9375j;
    @AbstractC27891c(mo46611a = "ban_status")

    /* renamed from: k */
    public C3257d f9376k;
    @AbstractC27891c(mo46611a = "use_avatar_as_cover")

    /* renamed from: l */
    public boolean f9377l;
    @AbstractC27891c(mo46611a = "live_house_status")

    /* renamed from: m */
    public Long f9378m;
    @AbstractC27891c(mo46611a = "donation_sticker")

    /* renamed from: n */
    int f9379n;
    @AbstractC27891c(mo46611a = "hashtag")

    /* renamed from: o */
    public Hashtag f9380o;
    @AbstractC27891c(mo46611a = "event_info")

    /* renamed from: p */
    public C3262h f9381p = new C3262h();
    @AbstractC27891c(mo46611a = "push_stream_info")

    /* renamed from: q */
    public Map<Long, C3270n> f9382q;
    @AbstractC27891c(mo46611a = "show_game_tags")

    /* renamed from: r */
    public boolean f9383r = false;
    @AbstractC27891c(mo46611a = "guide_status")

    /* renamed from: s */
    public int f9384s;

    static {
        Covode.recordClassIndex(3754);
    }

    /* renamed from: a */
    public final boolean mo8625a() {
        if (this.f9379n == 1) {
            return true;
        }
        return false;
    }
}
