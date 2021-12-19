package com.benchmark.port;

import com.bytedance.covode.number.Covode;

/* renamed from: com.benchmark.port.a */
public class C2497a {

    /* renamed from: a */
    public static C2497a f7570a = new C2497a("overall_score", EnumC2498a.FLOAT);

    /* renamed from: b */
    public static C2497a f7571b = new C2497a("cpu_score", EnumC2498a.FLOAT);

    /* renamed from: c */
    public static C2497a f7572c = new C2497a("gpu_score", EnumC2498a.FLOAT);

    /* renamed from: d */
    public static C2497a f7573d = new C2497a("memory_score", EnumC2498a.FLOAT);

    /* renamed from: e */
    public static C2497a f7574e = new C2497a("video_score", EnumC2498a.FLOAT);

    /* renamed from: f */
    public static C2497a f7575f = new C2497a("io_score", EnumC2498a.FLOAT);

    /* renamed from: g */
    public static C2497a f7576g = new C2497a("video_play_scene", EnumC2498a.FLOAT);

    /* renamed from: h */
    public static C2497a f7577h = new C2497a("app_launch_scene", EnumC2498a.FLOAT);

    /* renamed from: i */
    public static C2497a f7578i = new C2497a("video_record_scene", EnumC2498a.FLOAT);

    /* renamed from: j */
    public String f7579j;

    /* renamed from: k */
    public EnumC2498a f7580k;

    /* renamed from: com.benchmark.port.a$a */
    public enum EnumC2498a {
        INT,
        FLOAT,
        BOOLEAN,
        STRING;

        static {
            Covode.recordClassIndex(2856);
        }
    }

    static {
        Covode.recordClassIndex(2855);
    }

    private C2497a(String str, EnumC2498a aVar) {
        this.f7579j = str;
        this.f7580k = aVar;
    }
}
