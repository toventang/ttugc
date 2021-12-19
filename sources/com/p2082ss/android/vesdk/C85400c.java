package com.p2082ss.android.vesdk;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.C13397a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;

/* renamed from: com.ss.android.vesdk.c */
public final class C85400c {
    static {
        Covode.recordClassIndex(99512);
    }

    /* renamed from: a */
    private static void m146932a(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, audioRecord, new Object[0], 100404, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            audioRecord.stop();
            C15346a.m28240a(null, audioRecord, new Object[0], 100401, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: b */
    private static void m146935b(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, audioRecord, new Object[0], 100405, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            C15346a.m28240a(null, audioRecord, new Object[0], 100403, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: c */
    private static void m146937c(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100400, "void", false, null).first).booleanValue()) {
            audioRecord.startRecording();
            C15346a.m28240a(null, audioRecord, new Object[0], 100400, "com_ss_android_vesdk_TEAudioPolicyAdapter_android_media_AudioRecord_startRecording(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: a */
    public static void m146933a(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (m146934a(privacyCert, 0)) {
            m146937c(audioRecord);
        }
    }

    /* renamed from: b */
    public static void m146936b(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (m146934a(privacyCert, 1)) {
            m146932a(audioRecord);
        }
    }

    /* renamed from: c */
    public static void m146938c(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (m146934a(privacyCert, 2)) {
            m146935b(audioRecord);
        }
    }

    /* renamed from: a */
    private static boolean m146934a(PrivacyCert privacyCert, int i) {
        boolean z = true;
        if (i == 0) {
            try {
                C13397a.C13398a.m24084b(privacyCert, "audio_start");
            } catch (C13340a e) {
                z = false;
                C85315al.m146642d("TEAudioPolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
            }
        } else if (i == 1) {
            C13397a.C13398a.m24084b(privacyCert, "audio_stop");
        } else if (i == 2) {
            C13397a.C13398a.m24084b(privacyCert, "audio_release");
        }
        C85315al.m146637a("TEAudioPolicyAdapter", "check privacy:" + z + ", check type: " + i);
        return z;
    }
}
