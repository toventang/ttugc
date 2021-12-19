package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashTagAnchorShowEntrance;
import com.bytedance.android.livesdk.p561j.C9025as;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.utils.o */
public final class C3737o {
    static {
        Covode.recordClassIndex(4252);
    }

    /* renamed from: a */
    public static final boolean m9246a(DataChannel dataChannel) {
        Object obj;
        if (!LiveHashTagAnchorShowEntrance.INSTANCE.getValue()) {
            return false;
        }
        if (dataChannel != null) {
            obj = dataChannel.mo28318b(C9025as.class);
        } else {
            obj = null;
        }
        if (C89219l.m154714a(obj, (Object) true)) {
            return true;
        }
        return false;
    }
}
