package com.p2082ss.android.vesdk;

import com.bef.effectsdk.EffectABConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.runtime.TEConfigCenter;
import com.p2082ss.android.vesdk.runtime.VEEffectConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.t */
public class C85568t {

    /* renamed from: b */
    private static volatile C85568t f191735b;

    /* renamed from: a */
    public final Map<String, C85573d> f191736a = new HashMap();

    static {
        Covode.recordClassIndex(99749);
    }

    /* renamed from: com.ss.android.vesdk.t$d */
    public static class C85573d {

        /* renamed from: a */
        public EnumC85572c f191741a;

        /* renamed from: b */
        public Object f191742b;

        /* renamed from: c */
        public EnumC85571b f191743c;

        /* renamed from: d */
        public String f191744d;

        /* renamed from: e */
        public EnumC85570a f191745e;

        /* renamed from: f */
        private AtomicBoolean f191746f = new AtomicBoolean(false);

        static {
            Covode.recordClassIndex(99754);
        }

        public final String toString() {
            Object obj = this.f191742b;
            if (obj != null) {
                return obj.toString();
            }
            return "";
        }

        /* renamed from: a */
        public final C85573d mo131560a(Object obj) {
            if (this.f191746f.get()) {
                return this;
            }
            this.f191742b = obj;
            return this;
        }

        public C85573d(EnumC85572c cVar, Object obj, EnumC85571b bVar, String str) {
            this.f191742b = obj;
            this.f191741a = cVar;
            this.f191743c = bVar;
            this.f191744d = str;
        }
    }

    /* renamed from: com.ss.android.vesdk.t$a */
    public enum EnumC85570a {
        FOREFFECT,
        FORCAMERA;

        static {
            Covode.recordClassIndex(99751);
        }
    }

    /* renamed from: com.ss.android.vesdk.t$b */
    public enum EnumC85571b {
        CONFIG_TYPE_AB,
        CONFIG_TYPE_SETTINGS,
        CONFIG_TYPE_DEFAULT;

        static {
            Covode.recordClassIndex(99752);
        }
    }

    /* renamed from: a */
    public static C85568t m147473a() {
        MethodCollector.m26663i(1362);
        if (f191735b == null) {
            synchronized (C85568t.class) {
                try {
                    if (f191735b == null) {
                        f191735b = new C85568t();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1362);
                    throw th;
                }
            }
        }
        C85568t tVar = f191735b;
        MethodCollector.m26664o(1362);
        return tVar;
    }

    /* renamed from: com.ss.android.vesdk.t$1 */
    static /* synthetic */ class C855691 {

        /* renamed from: a */
        static final /* synthetic */ int[] f191737a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 99750(0x185a6, float:1.3978E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.vesdk.t$c[] r0 = com.p2082ss.android.vesdk.C85568t.EnumC85572c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.vesdk.C85568t.C855691.f191737a = r2
                com.ss.android.vesdk.t$c r0 = com.p2082ss.android.vesdk.C85568t.EnumC85572c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.vesdk.C85568t.C855691.f191737a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.vesdk.t$c r0 = com.p2082ss.android.vesdk.C85568t.EnumC85572c.INTEGER     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.vesdk.C85568t.C855691.f191737a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.vesdk.t$c r0 = com.p2082ss.android.vesdk.C85568t.EnumC85572c.LONG     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.vesdk.C85568t.C855691.f191737a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.vesdk.t$c r0 = com.p2082ss.android.vesdk.C85568t.EnumC85572c.FLOAT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.vesdk.C85568t.C855691.f191737a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.vesdk.t$c r0 = com.p2082ss.android.vesdk.C85568t.EnumC85572c.STRING     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85568t.C855691.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.vesdk.t$c */
    public enum EnumC85572c {
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING;

        static {
            Covode.recordClassIndex(99753);
        }
    }

    /* renamed from: c */
    private void m147475c() {
        C85573d dVar;
        try {
            JSONArray jSONArray = new JSONArray(EffectABConfig.requestABInfoWithLicenseArray(new String[]{"ve_record", "ve_enigma", "ve_edit", "ve_mv", "ve_detector", "ve_image"}, true));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int i2 = jSONObject.getInt("dataType");
                String string = jSONObject.getString("description");
                if (i2 == 0) {
                    dVar = new C85573d(EnumC85572c.BOOLEAN, Boolean.valueOf(jSONObject.getBoolean("defaultVal")), EnumC85571b.CONFIG_TYPE_AB, string);
                } else if (i2 == 1) {
                    dVar = new C85573d(EnumC85572c.INTEGER, Integer.valueOf(jSONObject.getInt("defaultVal")), EnumC85571b.CONFIG_TYPE_AB, string);
                } else if (i2 == 2) {
                    dVar = new C85573d(EnumC85572c.FLOAT, Float.valueOf((float) jSONObject.getDouble("defaultVal")), EnumC85571b.CONFIG_TYPE_AB, string);
                } else if (i2 == 3) {
                    dVar = new C85573d(EnumC85572c.STRING, jSONObject.getString("defaultVal"), EnumC85571b.CONFIG_TYPE_AB, string);
                }
                dVar.f191745e = EnumC85570a.FOREFFECT;
                m147472a(jSONObject.getString("key"), dVar);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m147476d() {
        C85573d dVar;
        try {
            JSONArray jSONArray = new JSONArray(C85540p.m147431a());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int i2 = jSONObject.getInt("dataType");
                String string = jSONObject.getString("description");
                if (i2 == 0) {
                    dVar = new C85573d(EnumC85572c.BOOLEAN, Boolean.valueOf(jSONObject.getBoolean("defaultVal")), EnumC85571b.CONFIG_TYPE_AB, string);
                } else if (i2 == 1) {
                    dVar = new C85573d(EnumC85572c.INTEGER, Integer.valueOf(jSONObject.getInt("defaultVal")), EnumC85571b.CONFIG_TYPE_AB, string);
                } else if (i2 == 2) {
                    dVar = new C85573d(EnumC85572c.FLOAT, Float.valueOf((float) jSONObject.getDouble("defaultVal")), EnumC85571b.CONFIG_TYPE_AB, string);
                } else if (i2 == 3) {
                    dVar = new C85573d(EnumC85572c.STRING, jSONObject.getString("defaultVal"), EnumC85571b.CONFIG_TYPE_AB, string);
                }
                dVar.f191745e = EnumC85570a.FORCAMERA;
                m147472a(jSONObject.getString("key"), dVar);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final int mo131558b() {
        MethodCollector.m26663i(1406);
        Iterator<Map.Entry<String, C85573d>> it = this.f191736a.entrySet().iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                Map.Entry<String, C85573d> next = it.next();
                if (next.getValue().f191745e == EnumC85570a.FOREFFECT) {
                    String key = next.getKey();
                    C85573d value = next.getValue();
                    if (value.f191745e == EnumC85570a.FOREFFECT) {
                        int i = C855691.f191737a[value.f191741a.ordinal()];
                        if (i == 1) {
                            VEEffectConfig.setABConfigValue(key, value.f191742b, 0);
                        } else if (i == 2 || i == 3) {
                            VEEffectConfig.setABConfigValue(key, value.f191742b, 1);
                        } else if (i == 4) {
                            VEEffectConfig.setABConfigValue(key, value.f191742b, 2);
                        } else if (i == 5) {
                            VEEffectConfig.setABConfigValue(key, value.f191742b, 3);
                        }
                    }
                } else if (next.getValue().f191745e != EnumC85570a.FORCAMERA) {
                    String key2 = next.getKey();
                    C85573d value2 = next.getValue();
                    if (value2.f191745e == EnumC85570a.FOREFFECT) {
                        z = true;
                    }
                    int ordinal = value2.f191741a.ordinal();
                    if (ordinal == 0) {
                        TEConfigCenter.nativeSetBoolConfig(key2, ((Boolean) value2.f191742b).booleanValue(), z, value2.f191743c.ordinal());
                    } else if (ordinal == 1 || ordinal == 2) {
                        TEConfigCenter.nativeSetIntConfig(key2, ((Integer) value2.f191742b).intValue(), z, value2.f191743c.ordinal());
                    } else if (ordinal == 3) {
                        TEConfigCenter.nativeSetFloatConfig(key2, ((Float) value2.f191742b).floatValue(), z, value2.f191743c.ordinal());
                    } else if (ordinal == 4) {
                        TEConfigCenter.nativeSetStringConfig(key2, (String) value2.f191742b, z, value2.f191743c.ordinal());
                    }
                }
            } else {
                MethodCollector.m26664o(1406);
                return 0;
            }
        }
    }

    private C85568t() {
        m147472a("wide_camera_id", new C85573d(EnumC85572c.STRING, "-1", EnumC85571b.CONFIG_TYPE_AB, "wide camera device id"));
        m147472a("mv_use_amazing_engine", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable using amazing engine for mv"));
        m147472a("vesdk_seek_predict_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable seek opt for predict seek accelerate speed"));
        m147472a("create_by_codec_name", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "use mediaCodec.createByCodecName"));
        m147472a("enable_android_hdr2sdr_support", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable android hdr2sdr support"));
        m147472a("enable_android_hdr_preview_support", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable android hdr preview support"));
        m147472a("crossplat_glbase_fbo", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable crossplat glbase fbo"));
        m147472a("vboost_compile", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable vboost compile"));
        m147472a("use_open_gl_three", new C85573d(EnumC85572c.INTEGER, 1, EnumC85571b.CONFIG_TYPE_AB, "use GLES3.0"));
        m147472a("vesdk_max_cache_count", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "config max cache count for input decode frame"));
        m147472a("gpu_syncobject_type", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_DEFAULT, "GPU SyncObject type: 0-glFence; 1-eglFence; 2-glFinish"));
        m147472a("compile_probe_use_byte264", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "compile_probe use libbyte264"));
        m147472a("use_byte264", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "use libbyte264"));
        m147472a("aeabtest_v2api", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "use new audiosdk api"));
        m147472a("color_space", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "color space"));
        m147472a("ve_color_space_for_2020", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "ve color space for 2020"));
        m147472a("vesdk_audiomix_replace", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "vesdk_audiomix_replace"));
        m147472a("enable_record_mpeg4", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable record mpeg4"));
        m147472a("ve_record_codec_type", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "record codec type"));
        m147472a("optimize srv_um crash", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "optimize srv um crash"));
        m147472a("vesdk_audio_hw_encoder", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "audio hw encoder"));
        EnumC85572c cVar = EnumC85572c.FLOAT;
        Float valueOf = Float.valueOf(-1.0f);
        m147472a("ve_recorder_fps_downgrade", new C85573d(cVar, valueOf, EnumC85571b.CONFIG_TYPE_AB, "Downgrading recorder fps."));
        m147472a("video_duration_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "video_duration_opt"));
        m147472a("ve_enable_face_detection", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable_face_detection"));
        m147472a("enable_render_lib", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "vesdk enable render lib"));
        m147472a("vesdk_use_agfxcontext", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "vesdk enable agfx ctx"));
        m147472a("vesdk_enable_reader_refactor", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "vesdk enable reader refactor"));
        m147472a("ve_enable_bingo_refactor", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "dmt bingo refactor"));
        m147472a("enable_duet_gl_finish", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable duet glFinish"));
        m147472a("ve_enable_preload_effect_res", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable preload effect res"));
        m147472a("ve_disable_effect_internal_setting", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "disable effect internal setting"));
        m147472a("ve_enable_titan_auto_test_log", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable titan auto test log"));
        m147472a("ve_opt_first_frame", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "opt first frame"));
        m147472a("ve_opt_first_frame_bypass_effect_frame_cnt", new C85573d(EnumC85572c.INTEGER, 3, EnumC85571b.CONFIG_TYPE_AB, "opt first frame bypass effect frame cnt"));
        m147472a("ve_camera_frame_update_independent_thread", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "camera frame update independent thread"));
        m147472a("ve_set_camera_two_output", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "ve set camera two output"));
        m147472a("ve_camera_output_and_update_strategy", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "ve camera output and update strategy"));
        m147472a("ve_enable_three_buffer", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable 3 buffer"));
        m147472a("ve_async_detection", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "effect async detection"));
        m147472a("ve_retry_count", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "camera open retry"));
        m147472a("ve_retry_start_preview_count", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "start preview retry count"));
        m147472a("ve_enable_stop_preview_optimize", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "stop preview async optimize"));
        m147472a("ve_enable_audio_gbu_refactor", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "Enable editor/compiler audio gbu refactor"));
        m147472a("ve_enable_compile_buffer_hw_encode", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "Android Hw encode compile "));
        m147472a("ve_enable_file_info_cache", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable file info cache"));
        m147472a("ve_enable_render_encode_resolution_align4", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "render and encode resolution can be align4"));
        m147472a("ve_small_window_double_thread_decode", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "ve small window double thread decode"));
        m147472a("ve_camera_enable_previewing_fallback", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_SETTINGS, "camera enable previewing fallback"));
        m147472a("ve_enable_background_strategy", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable background strategy"));
        m147472a("ve_enable_pin_refactor", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "dmt take pin refactor"));
        m147472a("ve_enable_engine_monitor_report", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable engine monitor report"));
        m147472a("ve_enable_hwdecode_dequeue_inputbuffer_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "MediaCodec dequeue video inputBuffer opt"));
        m147472a("ve_async_set_sensor_data", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "Send sensor data to effect asynchronously."));
        m147472a("remux_video_res", new C85573d(EnumC85572c.INTEGER, 921600, EnumC85571b.CONFIG_TYPE_AB, "remux video res"));
        m147472a("ve_compile_report", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "compile report state"));
        m147472a("ve_enable_compile_timeout_diagnosis", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "compile timeout diagnosis"));
        m147472a("ve_enable_refactor_audio", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable audio refactor"));
        m147472a("privacy_error_action", new C85573d(EnumC85572c.INTEGER, 2, EnumC85571b.CONFIG_TYPE_AB, "privacy_error_action"));
        m147472a("privacy_error_check_interval", new C85573d(EnumC85572c.INTEGER, 1000, EnumC85571b.CONFIG_TYPE_AB, "privacy_error_check_interval"));
        m147472a("privacy_error_check_threshold", new C85573d(EnumC85572c.INTEGER, 3000, EnumC85571b.CONFIG_TYPE_AB, "privacy_error_check_threshold"));
        m147472a("ve_enable_oes_texture_shot_screen", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable 2d texture shot screen"));
        m147472a("ve_enable_hwdecode_playback_dropframe_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "hwdecode playback dropframe opt"));
        m147472a("ve_editor_firstframe_delay", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "ve_editor_firstframe_delay"));
        m147472a("ve_record_editor_firstframe_delay", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "ve_record_editor_firstframe_delay"));
        m147472a("ve_enable_encode_bin_gl_context_reuse", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "enable encode bin gl context reuse"));
        m147472a("ve_enable_editor_compile_gl_context_reuse", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable editor compile gl context reuse"));
        m147472a("ve_enable_upload_virtual_mem_size", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable upload virtual mem size"));
        m147472a("ve_enable_mpeg24vp89_hwdecoder2", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable mpeg24 vp89 hwdecoder"));
        m147472a("ve_enable_glflush_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "glFlush usage opt"));
        m147472a("vesdk_high_speed_change_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "vesdk_high_speed_change_opt"));
        m147472a("ve_enable_p3_re_encode", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "ve_enable_p3_re_encode"));
        m147472a("ve_enable_imageAlgorithmReuseAndOptForAmazing", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "imageAlgorithm Reuse and optForAmazing"));
        m147472a("byteVC1_10bit_hardware_encoder_timeout", new C85573d(EnumC85572c.INTEGER, 10000, EnumC85571b.CONFIG_TYPE_AB, "byteVC1 10bit hardware encoder timeout params"));
        m147472a("ve_enable_memory_mode", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable low memory mode"));
        m147472a("ve_low_memory_threshold", new C85573d(EnumC85572c.INTEGER, 300, EnumC85571b.CONFIG_TYPE_AB, "low memory mode threshold"));
        m147472a("ve_compile_codec_type", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "compile support bytevc1 encode"));
        m147472a("ve_compile_hw_bytevc1_max_pixel_count", new C85573d(EnumC85572c.INTEGER, 8294400, EnumC85571b.CONFIG_TYPE_AB, "compile bytevc1 max pixel count"));
        m147472a("ve_enable_parallelDecodeMatting", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable parallel decode and matting"));
        m147472a("ve_enable_sys_karaoke", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable sys karaoke"));
        m147472a("ve_enable_common_earback", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable common earback"));
        m147472a("ve_enable_aaduio", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable aaudio"));
        m147472a("ve_enable_pip_resolution_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable pip resolution opt"));
        m147472a("ve_hardware_encode_fallback", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "config for hardware encode fallback to soft, DO NOT set NON-ZERO ON LINE"));
        m147472a("ve_asf_amount", new C85573d(EnumC85572c.FLOAT, valueOf, EnumC85571b.CONFIG_TYPE_AB, "ve_asf_amount"));
        m147472a("ve_asf_over_ratio", new C85573d(EnumC85572c.FLOAT, valueOf, EnumC85571b.CONFIG_TYPE_AB, "ve_asf_over_ratio"));
        m147472a("ve_asf_gpu_power_level", new C85573d(EnumC85572c.INTEGER, 4, EnumC85571b.CONFIG_TYPE_AB, "ve_asf_gpu_power_level"));
        m147472a("ve_asf_init_delay_frame_cnt", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "ve_asf_init_delay_frame_cnt"));
        m147472a("ve_asf_process_delay_frame_cnt", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "ve_asf_process_delay_frame_cnt"));
        EnumC85572c cVar2 = EnumC85572c.FLOAT;
        Float valueOf2 = Float.valueOf(0.0f);
        m147472a("ve_duet_audio_delay_opt", new C85573d(cVar2, valueOf2, EnumC85571b.CONFIG_TYPE_AB, "Duet audio delay optimize. 0 is no opt."));
        m147472a("ve_duet_audio_delay_mt_opt", new C85573d(EnumC85572c.FLOAT, valueOf2, EnumC85571b.CONFIG_TYPE_AB, "Duet audio delay mt optimize. 0 is no opt."));
        m147472a("ve_enable_optimize_audio_delay", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "opt audio delay when stop record"));
        m147472a("ve_enable_vboost", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "opt performance when open/close camera and stop record"));
        m147472a("ve_vboost_timeout", new C85573d(EnumC85572c.INTEGER, 500, EnumC85571b.CONFIG_TYPE_SETTINGS, "VBoost timeout"));
        m147472a("ve_enable_effect_render_without_glreadpixels", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable effect render without glreadpixels"));
        m147472a("ve_smart_trans_detect", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "smart trans detect for compile"));
        m147472a("ve_force_edit_bytevc1_swdecode", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "edit module force sw decode"));
        m147472a("ve_enable_engine_resource_opt", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "enable engine resouce can reuse between graphs"));
        m147472a("ve_enable_concurrent_preload", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "enable concurrent preload for multi clips"));
        m147472a("ve_enable_decoder_schedule_opt_hw", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "enable decoder schedule for hw"));
        m147472a("ve_enable_readermanager_refactor", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "description tevideoreader manager refactor"));
        m147472a("ve_force_compile_bytevc1_swdecode", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "compile module force sw decode"));
        m147472a("ve_hwdecode_support_rt_and_or", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "hw decode support real-time and operating-rate"));
        m147472a("ve_camera_enable_preview_fake_frame", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "ve camera enable preview fake frame"));
        m147472a("ve_camera_enable_preview_fake_frame_gaussian_blur", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "ve camera enable preview fake frame gaussian_blur"));
        m147472a("ve_titan_off_screen_before_stop", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "Titan switch off screen before stop preview"));
        m147472a("ve_mediacodec_resource_reasonable_distribute", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "mediacodec resource reasonable distribute"));
        m147472a("ve_aec_sample_rate_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "aec sample rate opt"));
        m147472a("vesdk_ffmpeg_enable_video_timestamp_monotonic", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable ffmpeg video timestamp monotonic"));
        m147472a("ve_titan_release_block_time", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "Titan release block time"));
        m147472a("ve_shotscreen_delay_max_frame", new C85573d(EnumC85572c.INTEGER, 20, EnumC85571b.CONFIG_TYPE_SETTINGS, "shotscreen delay max frame"));
        m147472a("ve_shotscreen_delay_threshold", new C85573d(EnumC85572c.INTEGER, 10, EnumC85571b.CONFIG_TYPE_SETTINGS, "shotscreen delay light frame num threshold"));
        m147472a("ve_enable_audio_reader_preload_reuse", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "support audioReader preload and reuse"));
        m147472a("ve_enable_cache_timestamp", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable cache timestamp"));
        m147472a("ve_image_enable_optimize_quality", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "VEImage enable optimize quality"));
        m147472a("ve_titan_follow_shot_independent_thread", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "follow shot independent thread."));
        m147472a("ve_enable_seek_preload_drop_frame", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "seek and preload drop frame"));
        m147472a("ve_enable_amazing_feature_handle_cache", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "amazing feature handle cache"));
        m147472a("ve_enable_amazing_feature_handle_cache", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "amazing feature handle cache"));
        m147472a("ve_enable_image_preload", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable image preload when display"));
        m147472a("ve_ban_hw_extra_data_loop", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "Ban mediacodec sps/pps loop & some opt"));
        m147472a("ve_titan_max_count_of_render_frame_buffer", new C85573d(EnumC85572c.INTEGER, 30, EnumC85571b.CONFIG_TYPE_AB, "Set max count of titan`s frame buffer cache"));
        m147472a("ve_titan_max_count_of_encode_task", new C85573d(EnumC85572c.INTEGER, 20, EnumC85571b.CONFIG_TYPE_AB, "Set max count of titan`s encode queue task"));
        m147472a("ve_enable_amazing_feature_handle_preload", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "amazing feature handle preload"));
        m147472a("ve_enable_titan_audio_graph_refactor", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable titan audio graph refactor."));
        m147472a("ve_enable_bgm_mic_delay_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable bgm mic delay opt"));
        m147472a("ve_enable_luma_detect_ec", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable luma detect ec"));
        m147472a("ve_enable_luma_detect", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "enable luma detect"));
        m147472a("ve_luma_detect_ec_exe_rate", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "luma detect ec execute rate"));
        m147472a("ve_titan_release_gpu_resource", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "titan release gpu resource."));
        m147472a("ve_enable_recorder_native_api", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable recorder native api"));
        m147472a("ve_anable_codec2_output_format_align_16", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable mediacodec output format align 16"));
        m147472a("ve_enable_canvas_handle_reuse", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable canvas blend reuse canvas handle"));
        m147472a("ve_enable_titan_engine_monitor", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable titan engine monitor"));
        m147472a("vesdk_use_bytevcremux_in_publish", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable bytevc1 remux"));
        m147472a("ve_enable_forward_ongoingseek_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable forward ongoingseek opt"));
        m147472a("ve_enable_video_reader_hw_overload_fallback_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable video reader hw_overload fallback opt"));
        m147472a("ve_enable_edit_record_unit_unify", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable transform unit unify"));
        m147472a("ve_enable_amazing_unit_unify", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_SETTINGS, "enable amazing unit unify"));
        m147472a("ve_enable_l_async_initialize", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable lens asynchronous initialization"));
        m147472a("ve_enable_tian_use_reader_factory", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable titan use reader facrory"));
        m147472a("ve_enable_adaptive_encode_level", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable adaptive encode level"));
        m147472a("ve_enable_hw_decoder_support_rotate", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable hw decoder support rotate"));
        m147472a("ve_enable_uri_convert_android_q", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "enable uri convert android q"));
        m147472a("ve_compile_gl_fence_ab", new C85573d(EnumC85572c.INTEGER, 0, EnumC85571b.CONFIG_TYPE_AB, "compile glfence, 0 - glfinish; 1 - glfence & wait on server; 2 - glfence & wait on client"));
        m147472a("veabtest_enablePreviewQualityOpt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable preview quality opt"));
        m147472a("veabtest_enableUpSamplingOpt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable upsampling opt"));
        m147472a("veabtest_enableCrossplatCanvasOpt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable crossplat canvas opt"));
        m147472a("veabtest_enableCrossplatCanvasDownscaleOpt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable crossplat canvas downscale opt"));
        m147472a("ve_enable_compile_hw_encoder_opt", new C85573d(EnumC85572c.BOOLEAN, false, EnumC85571b.CONFIG_TYPE_AB, "enable hw compile encoder optimization"));
        m147472a("ve_onekey_process_hdr", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "enable hdr"));
        m147472a("ve_onekey_process_denoise", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "enable denoise"));
        m147472a("ve_onekey_process_asf", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "enable asf"));
        m147472a("ve_onekey_process_hdr_v2", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "enable hdr v2"));
        m147472a("ve_onekey_process_async_process", new C85573d(EnumC85572c.BOOLEAN, true, EnumC85571b.CONFIG_TYPE_AB, "async process"));
        m147472a("ve_onekey_cv_detect_frame", new C85573d(EnumC85572c.INTEGER, 3, EnumC85571b.CONFIG_TYPE_AB, "cv detect frame"));
        m147472a("ve_audio_source_type", new C85573d(EnumC85572c.INTEGER, 1, EnumC85571b.CONFIG_TYPE_AB, "set recorder audio source type"));
        m147475c();
        m147476d();
    }

    /* renamed from: a */
    public final C85573d mo131556a(String str) {
        return this.f191736a.get(str);
    }

    /* renamed from: a */
    private int m147472a(String str, C85573d dVar) {
        if (this.f191736a.containsKey(str)) {
            return -100;
        }
        m147474b(str, dVar);
        return 0;
    }

    /* renamed from: b */
    private C85573d m147474b(String str, C85573d dVar) {
        return this.f191736a.put(str, dVar);
    }

    /* renamed from: b */
    public final Object mo131559b(String str, Object obj) {
        C85573d dVar = this.f191736a.get(str);
        if (dVar == null) {
            return null;
        }
        Object obj2 = dVar.f191742b;
        dVar.mo131560a(obj);
        return obj2;
    }

    /* renamed from: a */
    public final <T> T mo131557a(String str, T t) {
        C85573d dVar = this.f191736a.get(str);
        return (dVar == null || dVar.f191742b == null) ? t : (T) dVar.f191742b;
    }
}
