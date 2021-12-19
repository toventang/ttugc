package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.model.t */
public class C9904t extends C9543b {
    @AbstractC27891c(mo46611a = "event_name")

    /* renamed from: A */
    public String f23984A;
    @AbstractC27891c(mo46611a = "guide_url")

    /* renamed from: B */
    public String f23985B;
    @AbstractC27891c(mo46611a = "business_text")

    /* renamed from: C */
    public String f23986C;
    @AbstractC27891c(mo46611a = "app_id")

    /* renamed from: D */
    public Long f23987D;
    @AbstractC27891c(mo46611a = "is_gray")

    /* renamed from: E */
    public Boolean f23988E;
    @AbstractC27891c(mo46611a = "gray_scheme_url")

    /* renamed from: F */
    public String f23989F;
    @AbstractC27891c(mo46611a = "gift_scene")

    /* renamed from: G */
    public Long f23990G;
    @AbstractC27891c(mo46611a = "trigger_words")

    /* renamed from: H */
    public List<String> f23991H;
    @AbstractC27891c(mo46611a = "gift_panel_banner")

    /* renamed from: I */
    public C9914v f23992I;
    @AbstractC27891c(mo46611a = "is_broadcast_gift")

    /* renamed from: J */
    public boolean f23993J;
    @AbstractC27891c(mo46611a = "tracker_params")

    /* renamed from: K */
    public Map<String, String> f23994K;
    @AbstractC27891c(mo46611a = "lock_info")

    /* renamed from: L */
    public C9905u f23995L;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    public String f23996a;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: b */
    public ImageModel f23997b;
    @AbstractC27891c(mo46611a = "describe")

    /* renamed from: c */
    public String f23998c;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: d */
    public long f23999d;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: e */
    public int f24000e;
    @AbstractC27891c(mo46611a = "diamond_count")

    /* renamed from: f */
    public int f24001f;
    @AbstractC27891c(mo46611a = "combo")

    /* renamed from: g */
    public boolean f24002g;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: h */
    public int f24003h;
    @AbstractC27891c(mo46611a = "for_linkmic")

    /* renamed from: i */
    public boolean f24004i;
    @AbstractC27891c(mo46611a = "nameColor")

    /* renamed from: j */
    public int f24005j = -1;
    @AbstractC27891c(mo46611a = "describeColor")

    /* renamed from: k */
    public int f24006k = -1711276033;
    @AbstractC27891c(mo46611a = "gift_label_icon")

    /* renamed from: l */
    public ImageModel f24007l;
    @AbstractC27891c(mo46611a = "is_displayed_on_panel")

    /* renamed from: m */
    public boolean f24008m;
    @AbstractC27891c(mo46611a = "primary_effect_id")

    /* renamed from: n */
    public long f24009n;
    @AbstractC27891c(mo46611a = "gold_effect")

    /* renamed from: o */
    public String f24010o;
    @AbstractC27891c(mo46611a = "preview_image")

    /* renamed from: p */
    public ImageModel f24011p;
    @AbstractC27891c(mo46611a = "notify")

    /* renamed from: q */
    public Boolean f24012q;
    @AbstractC27891c(mo46611a = "region")

    /* renamed from: r */
    public String f24013r;
    @AbstractC27891c(mo46611a = "manual")

    /* renamed from: s */
    public String f24014s;
    @AbstractC27891c(mo46611a = "for_custom")

    /* renamed from: t */
    public Boolean f24015t;
    @AbstractC27891c(mo46611a = "special_effects")

    /* renamed from: u */
    public Map<String, Long> f24016u;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: v */
    public ImageModel f24017v;
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: w */
    public Integer f24018w;
    @AbstractC27891c(mo46611a = "item_type")

    /* renamed from: x */
    public Integer f24019x;
    @AbstractC27891c(mo46611a = "scheme_url")

    /* renamed from: y */
    public String f24020y;
    @AbstractC27891c(mo46611a = "gift_operation")

    /* renamed from: z */
    public GiftOperation f24021z;

    static {
        Covode.recordClassIndex(11450);
    }

    /* renamed from: a */
    public final boolean mo16601a() {
        int i = this.f24000e;
        if (i == 2 || i == 4 || i == 8) {
            return true;
        }
        return false;
    }
}
