package com.benchmark.p118b;

import com.benchmark.C2410a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.benchmark.b.a */
public class C2417a {
    @AbstractC27891c(mo46611a = "overall_score")

    /* renamed from: a */
    public float f7256a = -1.0f;
    @AbstractC27891c(mo46611a = "cpu_score")

    /* renamed from: b */
    public float f7257b = -1.0f;
    @AbstractC27891c(mo46611a = "gpu_score")

    /* renamed from: c */
    public float f7258c = -1.0f;
    @AbstractC27891c(mo46611a = "memory_score")

    /* renamed from: d */
    public float f7259d = -1.0f;
    @AbstractC27891c(mo46611a = "video_score")

    /* renamed from: e */
    public float f7260e = -1.0f;
    @AbstractC27891c(mo46611a = "io_score")

    /* renamed from: f */
    public float f7261f = -1.0f;
    @AbstractC27891c(mo46611a = "video_play_scene")

    /* renamed from: g */
    public float f7262g = -1.0f;
    @AbstractC27891c(mo46611a = "video_record_scene")

    /* renamed from: h */
    public float f7263h = -1.0f;
    @AbstractC27891c(mo46611a = "app_launch_scene")

    /* renamed from: i */
    public float f7264i = -1.0f;

    static {
        Covode.recordClassIndex(2768);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.benchmark.b.a$1 */
    public static /* synthetic */ class C24181 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7265a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.p118b.C2417a.C24181.<clinit>():void");
        }
    }

    public Object clone() {
        C2417a aVar = new C2417a();
        aVar.m7262a(C2410a.EnumC2412b.SCENE_CPU_SCORE, this.f7257b);
        aVar.m7262a(C2410a.EnumC2412b.SCENE_VIDEO_PROCESSING_SCORE, this.f7260e);
        aVar.m7262a(C2410a.EnumC2412b.SCENE_IO_PROCESSING_SCORE, this.f7261f);
        aVar.m7262a(C2410a.EnumC2412b.SCENE_VIDEO_PLAY_SCORE, this.f7262g);
        aVar.m7262a(C2410a.EnumC2412b.SCENE_OVERALL_SCORE, this.f7256a);
        aVar.m7262a(C2410a.EnumC2412b.SCENE_RECORD_SCORE, this.f7263h);
        aVar.m7262a(C2410a.EnumC2412b.SCENE_MEMORY_SCORE, this.f7259d);
        aVar.m7262a(C2410a.EnumC2412b.SCENE_LAUNCH_SCORE, this.f7264i);
        aVar.m7262a(C2410a.EnumC2412b.SCENE_GPU_SCORE, this.f7258c);
        return aVar;
    }

    public String toString() {
        return "overall_score: " + this.f7256a + " --- cpu_score: " + this.f7257b + " --- gpu_score: " + this.f7258c + " --- memory_score: " + this.f7259d + " --- video_score: " + this.f7260e + " --- io_score: " + this.f7261f + " --- video_play_scene: " + this.f7262g + " --- video_record_scene: " + this.f7263h + " --- app_launch_scene: " + this.f7264i;
    }

    /* renamed from: a */
    private void m7262a(C2410a.EnumC2412b bVar, float f) {
        switch (C24181.f7265a[bVar.ordinal()]) {
            case 1:
                this.f7260e = f;
                return;
            case 2:
                this.f7261f = f;
                return;
            case 3:
                this.f7262g = f;
                return;
            case 4:
                this.f7256a = f;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                this.f7263h = f;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                this.f7259d = f;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                this.f7264i = f;
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                this.f7258c = f;
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                this.f7257b = f;
                return;
            default:
                return;
        }
    }
}
