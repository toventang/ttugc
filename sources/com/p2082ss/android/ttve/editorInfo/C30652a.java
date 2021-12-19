package com.p2082ss.android.ttve.editorInfo;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ttve.editorInfo.a */
public class C30652a {

    /* renamed from: a */
    public static ConcurrentHashMap<String, Object> f73290a;

    /* renamed from: b */
    private static final String f73291b = C30652a.class.getSimpleName();

    /* renamed from: c */
    private static String f73292c = "main";

    static {
        Covode.recordClassIndex(37195);
    }

    /* renamed from: a */
    public static Map<String, Object> m63003a() {
        ConcurrentHashMap<String, Object> concurrentHashMap = f73290a;
        if (concurrentHashMap == null) {
            return null;
        }
        if (concurrentHashMap.containsKey("te_import_video_hw_bit_rate")) {
            f73290a.put("te_import_video_hw_profile", f73292c);
        }
        if (f73290a.containsKey("te_composition_video_encode_mode")) {
            Object obj = f73290a.get("te_composition_video_encode_mode");
            try {
                if (obj instanceof Integer) {
                    if (((Integer) obj).intValue() == 1) {
                        m63006a(new String[]{"te_composition_video_sw_preset", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_gop", "te_composition_video_sw_qpoffset"});
                    } else if (((Integer) obj).intValue() == 0) {
                        m63006a(new String[]{"te_composition_video_hw_bit_rate", "te_composition_video_hw_profile"});
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            m63006a(new String[]{"te_composition_video_hw_profile"});
        }
        if (f73290a.containsKey("te_record_video_frame_rate")) {
            m63006a(new String[]{"te_composition_video_hw_bit_rate", "te_composition_video_hw_profile", "te_composition_video_encode_mode", "te_composition_video_sw_preset", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_gop"});
        }
        if (!f73290a.containsKey("te_record_video_frame_rate") && !f73290a.containsKey("ve_use_camera")) {
            m63006a(new String[]{"te_camera_texture_size", "te_camera_preview_size", "te_lens_adaptive_sharpen"});
        }
        if (!f73290a.containsKey("te_edit_Enhance") && f73290a.containsKey("te_is_reencode")) {
            f73290a.put("te_edit_Enhance", 0);
        }
        if (!f73290a.containsKey("te_lens_adaptive_sharpen") && (f73290a.containsKey("te_record_video_frame_rate") || f73290a.containsKey("ve_use_camera"))) {
            f73290a.put("te_lens_adaptive_sharpen", 0);
        }
        m63006a(new String[]{"ve_use_camera"});
        f73290a.put("te_os", 1);
        f73290a.put("te_system", "Android " + Build.VERSION.RELEASE);
        f73290a.put("te_user_device", Build.MODEL);
        f73290a.put("te_ve_version", "10.5.0.161");
        f73290a.put("te_effect_version", "10.5.0_rel_27_mt_202112020108_bc0fd2cb7df");
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(f73290a);
        ConcurrentHashMap<String, Object> concurrentHashMap3 = f73290a;
        if (concurrentHashMap3 != null) {
            concurrentHashMap3.clear();
        }
        return concurrentHashMap2;
    }

    /* renamed from: a */
    private static void m63006a(String[] strArr) {
        if (f73290a != null) {
            for (String str : strArr) {
                f73290a.remove(str);
            }
        }
    }

    /* renamed from: a */
    public static void m63004a(String str, long j) {
        ConcurrentHashMap<String, Object> concurrentHashMap = f73290a;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static void m63005a(String str, String str2) {
        ConcurrentHashMap<String, Object> concurrentHashMap = f73290a;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, str2);
            if (str.equals("te_composition_video_hw_profile")) {
                f73292c = str2;
            }
        }
    }
}
