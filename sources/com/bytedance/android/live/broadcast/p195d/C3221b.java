package com.bytedance.android.live.broadcast.p195d;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.api.p185c.C3053d;
import com.bytedance.android.live.broadcast.api.p186d.C3058c;
import com.bytedance.android.livesdk.p561j.C9108dt;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.d.b */
public final class C3221b {
    static {
        Covode.recordClassIndex(3702);
    }

    /* renamed from: b */
    public static final void m8716b(int i, long j, long j2, boolean z) {
        m8713a(i, 0, 0, "", j, j2, z);
    }

    /* renamed from: a */
    public static final void m8715a(int i, long j, long j2, boolean z) {
        if (i == 30001) {
            m8713a(10005, 30001, 0, "", j, j2, z);
        } else if (i == 50002) {
            m8713a(10006, 50002, 0, "", j, j2, z);
        } else {
            m8713a(10007, i, 0, "", j, j2, z);
        }
    }

    /* renamed from: a */
    public static final void m8714a(int i, int i2, String str, long j, long j2, boolean z) {
        C89219l.m154721d(str, "");
        m8713a(i, 0, i2, str, j, j2, z);
    }

    /* renamed from: a */
    private static final void m8713a(int i, int i2, int i3, String str, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = C3058c.m8400b(i);
        }
        DataChannelGlobal.f42558d.mo28321a(C9108dt.class, Integer.valueOf(i));
        C3053d.m8364b(C3051c.C3052a.m8360b("ttlive_video_stream_end_all").mo12635b("error_code", Integer.valueOf(i)).mo12637b("error_msg", str).mo12634b("isFirstPushStream", Boolean.valueOf(z)).mo12635b("api_error_code", Integer.valueOf(i2)).mo12635b("liveCore_error_code", Integer.valueOf(i3)).mo12636b("user_id", Long.valueOf(j)).mo12636b("room_id", Long.valueOf(j2))).mo12632a();
    }
}
