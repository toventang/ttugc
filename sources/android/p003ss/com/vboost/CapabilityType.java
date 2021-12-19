package android.p003ss.com.vboost;

import com.bytedance.covode.number.Covode;

/* JADX WARN: Init of enum TYPE_MIN can be incorrect */
/* JADX WARN: Init of enum TYPE_MAX can be incorrect */
/* renamed from: android.ss.com.vboost.CapabilityType */
public enum CapabilityType {
    CPU_FREQ_MIN("cpu_freq_min", 1),
    CPU_FREQ_MAX("cpu_freq_max", 2),
    CPU_CORE_MIN("cpu_core_min", 3),
    CPU_CORE_MAX("cpu_core_max", 4),
    GPU_FREQ_MIN("gpu_freq_min", 5),
    GPU_FREQ_MAX("gpu_freq_max", 6),
    BUS_FREQ_MIN("bus_freq_min", 7),
    BUS_FREQ_MAX("bus_freq_max", 8),
    UFS_FREQ_MIN("ufs_freq_min", 9),
    UFS_FREQ_MAX("ufs_freq_max", 10),
    TASK_PRIORITY("task_priority", 11),
    CPU_AFFINITY("cpu_affinity", 12),
    IDLE_STATE("idle_state", 13),
    IO_PRELOAD("io_preload", 14),
    NETWORK_ENHANCE("network_enhance", 15),
    PRESET_SCENE("preset_scene", 16),
    THUMB_FETCH("thumb_fetch", 17),
    VIBRATE_ENHANCE("vibrate_enhance", 18),
    TYPE_MIN(r11),
    TYPE_MAX(r0);
    

    /* renamed from: a */
    private String f1a;

    /* renamed from: b */
    private int f2b;

    public final int getIndex() {
        return this.f2b;
    }

    public final String getName() {
        return this.f1a;
    }

    static {
        Covode.recordClassIndex(4);
    }

    public static CapabilityType valueOf(int i) {
        CapabilityType[] values = values();
        for (CapabilityType capabilityType : values) {
            if (i == capabilityType.f2b) {
                return capabilityType;
            }
        }
        throw new RuntimeException("Can't find enum type for index: ".concat(String.valueOf(i)));
    }

    private CapabilityType(CapabilityType capabilityType) {
        this.f1a = capabilityType.f1a;
        this.f2b = capabilityType.f2b;
    }

    private CapabilityType(String str, int i) {
        this.f1a = str;
        this.f2b = i;
    }
}
