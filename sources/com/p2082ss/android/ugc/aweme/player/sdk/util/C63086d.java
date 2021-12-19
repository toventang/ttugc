package com.p2082ss.android.ugc.aweme.player.sdk.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d */
public final class C63086d {

    /* renamed from: a */
    public static Boolean f143386a;

    /* renamed from: b */
    public static C63092b f143387b;

    /* renamed from: c */
    public static C63092b f143388c;

    /* renamed from: d */
    private static String f143389d;

    /* renamed from: e */
    private static final C63087a f143390e = new C63087a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d$a */
    public static class C63087a {

        /* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d$a$c */
        public interface AbstractC63090c {
            static {
                Covode.recordClassIndex(73930);
            }

            /* renamed from: a */
            boolean mo101242a(MediaCodecInfo mediaCodecInfo);
        }

        static {
            Covode.recordClassIndex(73927);
        }

        private C63087a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d$a$d */
        public static class C63091d implements AbstractC63090c {

            /* renamed from: a */
            private final String f143393a;

            static {
                Covode.recordClassIndex(73931);
            }

            public C63091d(String str) {
                this.f143393a = str;
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.util.C63086d.C63087a.AbstractC63090c
            /* renamed from: a */
            public final boolean mo101242a(MediaCodecInfo mediaCodecInfo) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase(this.f143393a)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* synthetic */ C63087a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d$a$a */
        public static class C63088a implements AbstractC63090c {

            /* renamed from: a */
            private final boolean f143391a = true;

            static {
                Covode.recordClassIndex(73928);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.util.C63086d.C63087a.AbstractC63090c
            /* renamed from: a */
            public final boolean mo101242a(MediaCodecInfo mediaCodecInfo) {
                if (!this.f143391a || mediaCodecInfo.isEncoder()) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d$a$b */
        public static class C63089b implements AbstractC63090c {

            /* renamed from: a */
            private final boolean f143392a = true;

            static {
                Covode.recordClassIndex(73929);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.util.C63086d.C63087a.AbstractC63090c
            /* renamed from: a */
            public final boolean mo101242a(MediaCodecInfo mediaCodecInfo) {
                if (this.f143392a) {
                    String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.US);
                    if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || "omx.qcom.video.decoder.hevcswvdec".equals(lowerCase) || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2.")))) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a */
        public static MediaCodecInfo m114022a(AbstractC63090c... cVarArr) {
            try {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (codecInfoAt != null) {
                        boolean z = true;
                        C1764a.m5928a("selectCodec: name: %s, index:%s, type:%s", new Object[]{codecInfoAt.getName(), Integer.valueOf(i), Arrays.toString(codecInfoAt.getSupportedTypes())});
                        for (AbstractC63090c cVar : cVarArr) {
                            z = cVar.mo101242a(codecInfoAt);
                            if (!z) {
                                break;
                            }
                        }
                        if (z) {
                            return codecInfoAt;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                C62960a.m113386a("selectCodec", th);
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.util.d$b */
    public static class C63092b {

        /* renamed from: a */
        public String f143394a;

        /* renamed from: b */
        public int f143395b;

        /* renamed from: c */
        int f143396c;

        static {
            Covode.recordClassIndex(73932);
        }

        private C63092b() {
            this.f143394a = "";
            this.f143395b = -1;
            this.f143396c = -1;
        }

        /* synthetic */ C63092b(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(73926);
    }

    /* renamed from: a */
    public static String m114019a() {
        try {
            if (f143389d == null) {
                f143389d = Build.HARDWARE;
            }
        } catch (Throwable unused) {
            f143389d = null;
        }
        return f143389d;
    }

    /* renamed from: b */
    public static int m114020b() {
        if (f143387b == null) {
            f143387b = m114018a("video/avc");
        }
        C63092b bVar = f143387b;
        if (bVar != null) {
            return bVar.f143396c;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m114021c() {
        if (f143388c == null) {
            f143388c = m114018a("video/hevc");
        }
        C63092b bVar = f143388c;
        if (bVar != null) {
            return bVar.f143396c;
        }
        return -1;
    }

    /* renamed from: a */
    public static C63092b m114018a(String str) {
        Exception e;
        C63092b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.toLowerCase().equals("video/avc") && !str.toLowerCase().equals("video/hevc")) {
            return null;
        }
        try {
            MediaCodecInfo a = C63087a.m114022a(new C63087a.C63088a(), new C63087a.C63089b(), new C63087a.C63091d(str));
            if (a == null) {
                return null;
            }
            C63092b bVar2 = new C63092b((byte) 0);
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = a.getCapabilitiesForType(str);
                bVar2.f143396c = capabilitiesForType.getVideoCapabilities().getSupportedHeights().getUpper().intValue();
                bVar2.f143395b = capabilitiesForType.getVideoCapabilities().getSupportedWidths().getUpper().intValue();
                bVar2.f143394a = a.getName().toLowerCase(Locale.US);
                return bVar2;
            } catch (Exception e2) {
                e = e2;
                bVar = bVar2;
            }
        } catch (Exception e3) {
            e = e3;
            C62960a.m113386a("heightUpperLimitForByteVc1", e);
            return bVar;
        }
    }
}
