package com.p2082ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tools.utils.a */
public final class C84879a {
    static {
        Covode.recordClassIndex(98873);
    }

    /* renamed from: a */
    public static final String m145811a(AudioRecorderParam audioRecorderParam) {
        C89219l.m154721d(audioRecorderParam, "");
        if (C89361p.m154876c(audioRecorderParam.getAudioUrl(), "df", false)) {
            return audioRecorderParam.getAudioUrl();
        }
        return audioRecorderParam.getAudioUrl() + "df";
    }
}
