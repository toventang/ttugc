package com.bytedance.android.livesdk.chatroom.detail;

import android.text.TextUtils;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.p149d.AbstractC2721d;
import com.bytedance.android.p149d.C2716a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.v */
public class C7463v implements AbstractC2721d {

    /* renamed from: h */
    static String[] f18549h = {"player_start", "player_prepare_end", "player_sdk_dns_analysis_end", "player_prepare_block_end", "player_player_dns_analysis_end", "player_tfo_fall_back_time", "player_tcp_connect_end", "player_tcp_first_package_end", "player_first_video_package_end", "player_first_audio_package_end", "player_first_frame_from_player_core", "player_first_frame_render_end", "player_video_device_open_start", "player_video_device_open_end", "player_audio_device_open_start", "player_audio_device_open_end"};

    /* renamed from: i */
    static String[] f18550i = {"start", "prepare_end", "sdk_dns_analysis_end", "prepare_block_end", "player_dns_analysis_end", "tfo_fall_back_time", "tcp_connect_end", "tcp_first_package_end", "first_video_package_end", "first_audio_package_end", "first_frame_from_player_core", "first_frame_render_end", "video_device_open_start", "video_device_open_end", "audio_device_open_start", "audio_device_open_end"};

    /* renamed from: a */
    Map<String, Long> f18551a = new ConcurrentHashMap();

    /* renamed from: b */
    Long f18552b;

    /* renamed from: c */
    C2716a f18553c;

    /* renamed from: d */
    boolean f18554d;

    /* renamed from: e */
    boolean f18555e;

    /* renamed from: f */
    boolean f18556f = false;

    /* renamed from: g */
    boolean f18557g = false;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13692a() {
        if (!this.f18557g && this.f18551a.containsKey("start") && this.f18551a.containsKey("first_frame")) {
            C6203g.m13466b(new RunnableC7464w(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo13695b() {
        long j;
        Long l = this.f18551a.get("start");
        Long l2 = this.f18551a.get("first_frame");
        if (l == null || l2 == null) {
            j = 0;
        } else {
            j = l2.longValue() - l.longValue();
        }
        C2716a aVar = this.f18553c;
        if (aVar == null || !TextUtils.equals(aVar.f8112b, "draw") || j >= 0) {
            return j;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(8233);
    }

    /* renamed from: c */
    public final boolean mo13697c(String str) {
        return this.f18551a.containsKey(str);
    }

    /* renamed from: b */
    public final long mo13696b(String str) {
        return this.f18551a.get(str).longValue();
    }

    @Override // com.bytedance.android.p149d.AbstractC2721d
    /* renamed from: a */
    public final void mo7296a(C2716a aVar) {
        this.f18553c = aVar;
        if (aVar.f8118h != -1) {
            Long valueOf = Long.valueOf(this.f18553c.f8118h);
            this.f18552b = valueOf;
            mo13694a("start", valueOf);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13693a(String str) {
        if (!mo13697c(str)) {
            mo13694a(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public final void mo13694a(String str, Long l) {
        if (str != null && l != null) {
            this.f18551a.put(str, l);
        }
    }

    /* renamed from: a */
    static void m15371a(JSONObject jSONObject, String str, Object obj) {
        if (str != null && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }
}
