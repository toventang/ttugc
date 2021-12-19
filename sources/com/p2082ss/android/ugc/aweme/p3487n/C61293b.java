package com.p2082ss.android.ugc.aweme.p3487n;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEUtils;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.n.b */
public final class C61293b implements AbstractC61292a {

    /* renamed from: a */
    public static final C61294a f139203a = new C61294a((byte) 0);

    static {
        Covode.recordClassIndex(71912);
    }

    /* renamed from: com.ss.android.ugc.aweme.n.b$a */
    public static final class C61294a {
        static {
            Covode.recordClassIndex(71913);
        }

        private C61294a() {
        }

        public /* synthetic */ C61294a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3487n.AbstractC61292a
    /* renamed from: a */
    public final int mo98894a(String str, String str2, VERecordData vERecordData) {
        String str3;
        C89219l.m154721d(str, "");
        int audioFromRecordData = VEUtils.getAudioFromRecordData(str2, vERecordData, 1, 88200, 44100);
        boolean a = C84902i.m145892a(str2);
        StringBuilder append = new StringBuilder("outputAudio: ").append(str2).append(", outMediaFile: ");
        if (vERecordData != null) {
            str3 = vERecordData.toString();
        } else {
            str3 = null;
        }
        String sb = append.append(str3).append(", channels: 1, bitRate: 88200, sampleRate: 44100").toString();
        C84425b bVar = new C84425b();
        bVar.mo129403a("method", 4);
        bVar.mo129406a("scenario", str);
        bVar.mo129403a("status", audioFromRecordData);
        bVar.mo129407a("frame_exist", a);
        bVar.mo129406a("params", sb);
        C39162r.m79460a("ve_audio_frame", bVar.f188764a);
        return audioFromRecordData;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3487n.AbstractC61292a
    /* renamed from: a */
    public final int mo98895a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int transCodeAudio = VEUtils.transCodeAudio(str2, str3, 1, 88200);
        boolean a = C84902i.m145892a(str2);
        C84425b bVar = new C84425b();
        bVar.mo129403a("method", 2);
        bVar.mo129406a("scenario", str);
        bVar.mo129403a("status", transCodeAudio);
        bVar.mo129407a("frame_exist", a);
        bVar.mo129406a("params", "inMediaFile: " + str2 + ", outMediaFile: " + str3 + ", channels: 1, bitRate: 88200");
        C39162r.m79460a("ve_audio_frame", bVar.f188764a);
        return transCodeAudio;
    }

    /* renamed from: a */
    public static int m110947a(String str, String str2, String str3, int i, int i2, int i3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int transCodeAudio = VEUtils.transCodeAudio(str2, str3, i, i2, i3);
        boolean a = C84902i.m145892a(str2);
        C84425b bVar = new C84425b();
        bVar.mo129403a("method", 3);
        bVar.mo129406a("scenario", str);
        bVar.mo129403a("status", transCodeAudio);
        bVar.mo129407a("frame_exist", a);
        bVar.mo129406a("params", "inMediaFile: " + str2 + ", outMediaFile: " + str3 + ", channels: " + i + ", bitRate: " + i2 + ", sampleRate: " + i3);
        C39162r.m79460a("ve_audio_frame", bVar.f188764a);
        return transCodeAudio;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0102 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.p3487n.AbstractC61292a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo98896a(java.lang.String r28, java.lang.String r29, java.lang.String[] r30, long[] r31, long[] r32, long r33, long r35, float[] r37, int r38, int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3487n.C61293b.mo98896a(java.lang.String, java.lang.String, java.lang.String[], long[], long[], long, long, float[], int, int, int):int");
    }
}
