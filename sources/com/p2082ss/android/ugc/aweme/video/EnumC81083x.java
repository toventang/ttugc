package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.model.AbstractC84205i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.x */
public enum EnumC81083x implements AbstractC84205i {
    Normal(true, "prepare_time", "first_frame_time"),
    Local(true, "prepare_time", "first_frame_time"),
    Story(false, "story_prepare_time", "story_first_frame_time");
    

    /* renamed from: h */
    private static Map<String, String> f181215h;

    /* renamed from: a */
    boolean f181217a;

    /* renamed from: b */
    String f181218b;

    /* renamed from: c */
    String f181219c;

    /* renamed from: d */
    boolean f181220d = true;

    /* renamed from: e */
    boolean f181221e;

    /* renamed from: f */
    String f181222f;

    /* renamed from: g */
    String f181223g;

    public final String getSubTag() {
        return this.f181223g;
    }

    public final String getTag() {
        return this.f181222f;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.AbstractC84205i
    public final boolean isLoop() {
        return this.f181217a;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.AbstractC84205i
    public final boolean isPlayLoop() {
        return this.f181220d;
    }

    public final boolean isUseSuperResolution() {
        return this.f181221e;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.AbstractC84205i
    public final String getFirstFrameKey() {
        if (C80716a.C80717a.f180462a.mo123865b().videoBitRateEnabled()) {
            return f181215h.get(this.f181219c);
        }
        return this.f181219c;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.AbstractC84205i
    public final String getPrepareKey() {
        if (C80716a.C80717a.f180462a.mo123865b().videoBitRateEnabled()) {
            return f181215h.get(this.f181218b);
        }
        return this.f181218b;
    }

    static {
        Covode.recordClassIndex(94405);
        HashMap hashMap = new HashMap();
        f181215h = hashMap;
        hashMap.put("prepare_time", "video_bitrate_prepare_time");
        f181215h.put("story_prepare_time", "story_video_bitrate_prepare_time");
        f181215h.put("first_frame_time", "aweme_video_bitrate_first_frame_log");
        f181215h.put("story_first_frame_time", "story_video_bitrate_first_frame_time");
    }

    public final void setLoop(boolean z) {
        this.f181220d = z;
    }

    public final void setSubTag(String str) {
        this.f181223g = str;
    }

    public final void setTag(String str) {
        this.f181222f = str;
    }

    public final void setUseSuperResolution(boolean z) {
        this.f181221e = z;
    }

    private EnumC81083x(boolean z, String str, String str2) {
        this.f181217a = z;
        this.f181218b = str;
        this.f181219c = str2;
    }
}
