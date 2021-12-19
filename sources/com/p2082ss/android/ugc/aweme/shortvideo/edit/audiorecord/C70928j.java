package com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85615x;
import com.p2082ss.android.vesdk.VEAudioRecorder;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.j */
public final class C70928j {

    /* renamed from: a */
    final VEAudioRecorder f158818a = new VEAudioRecorder();

    static {
        Covode.recordClassIndex(83422);
    }

    /* renamed from: a */
    public final String mo112101a() {
        try {
            String a = this.f158818a.mo130153a();
            C89219l.m154716b(a, "");
            return a;
        } catch (C85615x unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final long mo112100a(PrivacyCert privacyCert) {
        return this.f158818a.mo130152a(privacyCert);
    }
}
