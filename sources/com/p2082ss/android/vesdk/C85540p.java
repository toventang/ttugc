package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

/* renamed from: com.ss.android.vesdk.p */
public final class C85540p {
    static {
        Covode.recordClassIndex(99709);
    }

    /* renamed from: a */
    public static String m147431a() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray("[{\"key\" : \"ve_camera_type\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"camera type\"},{\"key\": \"ve_is_in_camera2_blocklist\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"is in camera2 blocklist\"},{\"key\": \"ve_camera_wide_angle\",\"dataType\": 1,\"defaultVal\": -1,\"description\": \"wide angle\"},{\"key\": \"ve_camera_stablization\",\"dataType\": 1,\"defaultVal\": -1,\"description\": \"stablization\"},{\"key\": \"ve_camera_fps_range\",\"dataType\": 1,\"defaultVal\": 7,\"description\": \"camera lowest fps\"},{\"key\": \"ve_camera_focus_timeout\",\"dataType\": 1,\"defaultVal\": 2500,\"description\": \"camera focus timeout in ms\"},{\"key\": \"ve_camera_enable_previewing_fallback\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"camera enable previewing fallback\"},{\"key\":\"ve_enable_wide_fov_for_samsung\",\"dataType\":0,\"defaultVal\": false,\"description\": \"enable wide fov\"},{\"key\": \"ve_camera_open_close_sync\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"camera open close sync\"},{\"key\": \"ve_force_close_camera_when_timeout\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"if force close camera when close time out\"},{\"key\": \"frame_rate_strategy\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"frame rate strategy\"},{\"key\": \"is_use_setrecordinghint\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"is use setrecordinghint\"},{\"key\": \"ve_camera_fps_max\",\"dataType\": 1,\"defaultVal\": 30,\"description\": \"camera fps max limit\"},{\"key\": \"ve_enable_open_camera1_optimize\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"enable open camera1 optimize\"},{\"key\": \"ve_enable_open_camera1_crs\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable open camera1 crash\"},{\"key\": \"ve_enable_gc_for_camera_metadata\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"enable manual gc for camera metadata\"},{\"key\": \"ve_camera_scene_diff_fps_opt\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera scene diff fps opt\"},{\"key\": \"ve_enable_refactor_camera_focus\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable refactor camera focus\"},{\"key\": \"ve_enable_camera2_zsl_capture\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera2 zsl capture\"},{\"key\": \"ve_enable_yuv_buffer_capture\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera yuv buffer capture\"},{\"key\": \"ve_enable_camera_capture_stream\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"enable take picture via camera capture stream\"},{\"key\": \"ve_enable_camera_devices_cache\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera devices cache to optimize SelectCamera\"},{\"key\": \"ve_camera_ai_augmentation\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"ai augmentation\"},{\"key\": \"ve_enable_new_create_capture_session\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable new logic for creating camera capture session\"},{\"key\": \"ve_enable_face_detection\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable face detection\"},{\"key\": \"ve_enable_camera_api2_detect\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera api2 detection\"},{\"key\": \"ve_enable_camera_metadata\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera metadata\"},{\"key\": \"ve_disable_camera_hdr\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"disable camera hdr\"},{\"key\": \"ve_enable_camera_noise_reduce\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable noise reduce for vendor camera\"},{\"key\": \"ve_enable_camera_vendor_stable\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable vendor stable function\"},{\"key\": \"ve_support_camera_multicam_zoom\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera2 multicam zoom\"},{\"key\": \"ve_camera_zoom_ratio_max\",\"dataType\": 2,\"defaultVal\": -1,\"description\": \"camera2 multicam zoom ratio max value\"},{\"key\": \"ve_camera_zoom_ratio_min\",\"dataType\": 2,\"defaultVal\": -1,\"description\": \"camera2 multicam zoom ratio min value\"}]");
            for (int i = 0; i < jSONArray2.length(); i++) {
                jSONArray.put(jSONArray2.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray.toString();
    }
}
