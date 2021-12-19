package com.p2082ss.android.ugc.aweme.video.simplayer;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.webkit.CookieManager;
import com.C1764a;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C27910f;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.player.C62933c;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.player.p3549ab.C62907a;
import com.p2082ss.android.ugc.aweme.player.p3549ab.C62930b;
import com.p2082ss.android.ugc.aweme.player.p3549ab.abs.VolumeBalanceData;
import com.p2082ss.android.ugc.aweme.player.p3549ab.abs.buffer.PlayeAbBufferConfigData;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74676a;
import com.p2082ss.android.ugc.aweme.video.C80779o;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80672ad;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80673ae;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80689o;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80703w;
import com.p2082ss.android.ugc.aweme.video.util.BothHWDecDeviceList;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.a */
public final class C80990a {

    /* renamed from: a */
    private static AbstractC63037g f181028a;

    /* renamed from: b */
    private static Boolean f181029b;

    /* renamed from: c */
    private static Boolean f181030c = false;

    static {
        Covode.recordClassIndex(94308);
    }

    /* renamed from: a */
    private static String m140519a(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        IOException e;
        MethodCollector.m26663i(2060);
        InputStream inputStream2 = null;
        try {
            inputStream = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                C13609b.m24451a(inputStream);
                MethodCollector.m26664o(2060);
                return str2;
            } catch (IOException e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    C13609b.m24451a(inputStream);
                    MethodCollector.m26664o(2060);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    C13609b.m24451a(inputStream2);
                    MethodCollector.m26664o(2060);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            e.printStackTrace();
            C13609b.m24451a(inputStream);
            MethodCollector.m26664o(2060);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C13609b.m24451a(inputStream2);
            MethodCollector.m26664o(2060);
            throw th;
        }
    }

    /* renamed from: a */
    public static C84209m m140518a(C84209m.EnumC84214e eVar, boolean z, boolean z2) {
        boolean z3;
        BothHWDecDeviceList bothHWDecDeviceList;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i2;
        boolean z13;
        boolean z14;
        int i3;
        C84209m mVar = new C84209m();
        mVar.f188060b = eVar;
        mVar.f188059a = C17867d.m33078a();
        if (eVar == C84209m.EnumC84214e.Ijk || eVar == C84209m.EnumC84214e.IjkHardware) {
            mVar.f188062d = C80994b.f181042a;
        } else if (eVar == C84209m.EnumC84214e.TT || eVar == C84209m.EnumC84214e.TT_IJK_ENGINE || eVar == C84209m.EnumC84214e.TT_HARDWARE) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseArray sparseArray = new SparseArray();
            sparseIntArray.put(80, C80695q.m139908a() ? 1 : 0);
            sparseIntArray.put(53, C16048b.m29633a().mo25412a(true, "mtk_hardware_decode_opt_height_limit", -1));
            sparseIntArray.put(54, C16048b.m29633a().mo25412a(true, "mtk_hardware_decode_opt_choose_device_limit", 0));
            sparseIntArray.put(1, z ? 1 : 0);
            sparseIntArray.put(55, C16048b.m29633a().mo25412a(true, "enable_native_yv12_render", 0));
            sparseIntArray.put(57, C16048b.m29633a().mo25412a(true, "file_play_no_buffering", 0));
            sparseIntArray.put(82, C16048b.m29633a().mo25412a(true, "player_pre_render_buffering_update", 0));
            sparseIntArray.put(83, C16048b.m29633a().mo25412a(true, "player_pre_render_buffering_update_percentage", 90));
            sparseIntArray.put(58, C16048b.m29633a().mo25412a(true, "no_buffering_update", 0));
            sparseIntArray.put(61, C16048b.m29633a().mo25412a(true, "player_position_update_interval", 0));
            sparseIntArray.put(60, C16048b.m29633a().mo25412a(true, "enable_clip_heaacv2_first_ptspkt", 0));
            sparseIntArray.put(71, C16048b.m29633a().mo25412a(true, "player_enable_opt_subload_time", 1));
            sparseIntArray.put(81, C16048b.m29633a().mo25412a(true, "player_mdl_seek_reopen", 0));
            sparseIntArray.put(84, C16048b.m29633a().mo25412a(true, "player_heaavv2_pts_ms_correction", 0));
            sparseIntArray.put(85, C16048b.m29633a().mo25412a(true, "player_enable_vc1_block_list", 1));
            sparseIntArray.put(86, C16048b.m29633a().mo25412a(true, "player_mtkhip_skip_adaptive", 0));
            sparseIntArray.put(64, C16048b.m29633a().mo25412a(true, "player_feed_packet_unitil_empty", 0));
            int a = C16048b.m29633a().mo25412a(true, "player_enable_volume_balance", 0);
            sparseIntArray.put(28, a);
            if (a == 1) {
                try {
                    VolumeBalanceData volumeBalanceData = (VolumeBalanceData) C16048b.m29633a().mo25415a(true, "player_volume_balance_data", VolumeBalanceData.class);
                    if (volumeBalanceData == null) {
                        volumeBalanceData = new VolumeBalanceData();
                    }
                    sparseArray.put(29, Float.valueOf(volumeBalanceData.getPregain()));
                    sparseArray.put(30, Float.valueOf(volumeBalanceData.getThreshold()));
                    sparseArray.put(31, Float.valueOf(volumeBalanceData.getRatio()));
                    sparseArray.put(32, Float.valueOf(volumeBalanceData.getPredelay()));
                } catch (Throwable unused) {
                }
            }
            C62930b bVar = null;
            if (C16048b.m29633a().mo25412a(true, "player_global_force_soft_decode", 0) == 1) {
                sparseIntArray.put(17, 0);
                sparseIntArray.put(16, 0);
            } else {
                try {
                    if (C16048b.m29633a().mo25412a(false, "player_enable_hw_dec_fix_list_decode", 1) == 1) {
                        if (f181029b == null) {
                            String a2 = m140519a(C17867d.m33078a(), "player/hwdec.json");
                            if (a2 == null || (bothHWDecDeviceList = (BothHWDecDeviceList) new C27910f().mo46670a(a2, BothHWDecDeviceList.class)) == null || bothHWDecDeviceList.deviceList == null || !bothHWDecDeviceList.deviceList.contains(Build.MODEL.toLowerCase())) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            f181029b = Boolean.valueOf(z3);
                        }
                        if (f181029b.booleanValue()) {
                            sparseIntArray.put(17, 1);
                            sparseIntArray.put(16, 1);
                            mVar.mo129006b();
                            mVar.mo129005a();
                        }
                    }
                } catch (Throwable unused2) {
                }
                C62907a a3 = C80779o.m140113a();
                if (a3 != null) {
                    sparseIntArray.put(17, a3.f142801c);
                    sparseIntArray.put(16, a3.f142800b);
                    if (a3.f142801c == 1) {
                        mVar.mo129006b();
                    }
                    if (a3.f142800b == 1) {
                        mVar.mo129005a();
                    }
                } else if (eVar == C84209m.EnumC84214e.TT_HARDWARE) {
                    mVar.mo129005a();
                    mVar.mo129006b();
                }
            }
            sparseIntArray.put(2, 1);
            int i4 = 1000;
            try {
                i4 = C16048b.m29633a().mo25412a(true, "player_buffer_data_time", 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            sparseIntArray.put(41, C16048b.m29633a().mo25412a(true, "enable_player_delay_buffing_update", 1));
            sparseIntArray.put(3, i4);
            sparseIntArray.put(4, C16048b.m29633a().mo25412a(true, "player_max_buffer_time", 5000));
            sparseIntArray.put(5, C16048b.m29633a().mo25412a(true, "enable_player_log", 1));
            if (C80695q.m139909b() == C80703w.f180428c) {
                i = 1;
            } else {
                i = 0;
            }
            sparseIntArray.put(15, i);
            if (C62956e.f142892a) {
                sparseIntArray.put(6, 1);
            }
            if (!z) {
                Boolean c = SharePrefCache.inst().getEableUltraResolution().mo59941c();
                Boolean c2 = SharePrefCache.inst().isInUltraResBlackList().mo59941c();
                if (!(c == null || !c.booleanValue() || c2 == null)) {
                    c2.booleanValue();
                }
            }
            if (C16048b.m29633a().mo25412a(true, "ttplayer_is_ipc", 0) == C80673ae.f180367a) {
                sparseIntArray.put(0, 1);
            }
            if (C16048b.m29633a().mo25412a(true, "ttplayer_use_sys_audio_codec", 0) == C80672ad.f180365a) {
                sparseIntArray.put(18, 1);
            }
            try {
                bVar = (C62930b) C16048b.m29633a().mo25415a(false, "player_unified_ab_config", C62930b.class);
            } catch (Throwable unused3) {
            }
            if (bVar == null) {
                bVar = new C62930b();
            }
            sparseIntArray.put(23, bVar.f142836a);
            sparseIntArray.put(24, bVar.f142837b);
            sparseIntArray.put(26, bVar.f142838c);
            sparseIntArray.put(27, bVar.f142839d);
            try {
                if (C16048b.m29633a().mo25412a(true, "player_enable_buffer_config", 0) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                mVar.f188054O = z5;
                if (z5) {
                    C84209m.C84210a aVar = new C84209m.C84210a();
                    try {
                        PlayeAbBufferConfigData playeAbBufferConfigData = (PlayeAbBufferConfigData) C16048b.m29633a().mo25415a(true, "player_buffer_config_data", PlayeAbBufferConfigData.class);
                        if (playeAbBufferConfigData != null) {
                            aVar.f188089e = playeAbBufferConfigData.getNetBlockDurationInitial();
                            aVar.f188087c = playeAbBufferConfigData.getNetBlockDurationMax();
                            aVar.f188088d = playeAbBufferConfigData.getNetBlockIncFactor();
                            aVar.f188085a = playeAbBufferConfigData.getInteractionBlockDurationPreloaded();
                            aVar.f188086b = playeAbBufferConfigData.getInteractionBlockDurationNonPreloaded();
                            aVar.f188090f = playeAbBufferConfigData.getExpType();
                        }
                    } catch (Throwable unused4) {
                    }
                    mVar.f188053N = aVar;
                }
                if (C16048b.m29633a().mo25412a(true, "player_enable_reuse_mtk_hw_workaround", 0) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                mVar.f188040A = z6;
                sparseIntArray.put(33, C16048b.m29633a().mo25412a(true, "player_option_cache", 15));
                sparseIntArray.put(34, C16048b.m29633a().mo25412a(false, "player_reuse_engine", 0));
                sparseIntArray.put(51, C16048b.m29633a().mo25412a(false, "player_reset_when_stop", 0));
                sparseIntArray.put(52, C16048b.m29633a().mo25412a(false, "player_force_close_codec", 0));
                sparseIntArray.put(40, C16048b.m29633a().mo25412a(true, "disable_player_logv2_async", 0));
                C84209m.C84211b bVar2 = new C84209m.C84211b();
                bVar2.f188093c = C16048b.m29633a().mo25412a(true, "player_dash_video_range", 1048576);
                bVar2.f188094d = C16048b.m29633a().mo25412a(true, "player_dash_audio_range", 409600);
                bVar2.f188095e = C16048b.m29633a().mo25412a(true, "player_skip_find_stream_info", 1);
                bVar2.f188096f = C16048b.m29633a().mo25412a(true, "player_dash_enable_hijack", 1);
                bVar2.f188097g = C16048b.m29633a().mo25412a(true, "player_dash_hijack_main_dns", 2);
                bVar2.f188098h = C16048b.m29633a().mo25412a(true, "player_dash_hijack_backup_dns", 0);
                bVar2.f188099i = C16048b.m29633a().mo25412a(true, "player_dash_403_fallback", 0);
                bVar2.f188100j = C16048b.m29633a().mo25412a(true, "player_dash_range_mode", 2);
                bVar2.f188101k = C16048b.m29633a().mo25412a(true, "player_dash_video_time_range", 5000);
                bVar2.f188102l = C16048b.m29633a().mo25412a(true, "player_dash_audio_time_range", 10000);
                bVar2.f188103m = C16048b.m29633a().mo25412a(true, "player_dash_read_mode", 0);
                bVar2.f188106p = C16048b.m29633a().mo25412a(true, "player_mp4_bash_read_mode", 0);
                bVar2.f188105o = C16048b.m29633a().mo25412a(true, "player_mp4_bash_video_range", 0);
                bVar2.f188104n = C16048b.m29633a().mo25412a(true, "player_mp4_bash_range_mode", 0);
                if (C16048b.m29633a().mo25412a(true, "player_get_cookie_lazy_enable", 0) == 1) {
                    mVar.f188068j = new C84209m.AbstractC84213d() {
                        /* class com.p2082ss.android.ugc.aweme.video.simplayer.C80990a.C809911 */

                        static {
                            Covode.recordClassIndex(94309);
                        }

                        @Override // com.p2082ss.android.ugc.playerkit.model.C84209m.AbstractC84213d
                        /* renamed from: b */
                        public final Map<String, String> mo124412b() {
                            return C30628d.m62921a(C29736b.f70920a);
                        }

                        @Override // com.p2082ss.android.ugc.playerkit.model.C84209m.AbstractC84213d
                        /* renamed from: a */
                        public final String mo124411a() {
                            return CookieManager.getInstance().getCookie(C29736b.f70920a);
                        }
                    };
                } else {
                    String cookie = CookieManager.getInstance().getCookie(C29736b.f70920a);
                    Map<String, String> a4 = C30628d.m62921a(C29736b.f70920a);
                    C84209m.C84212c cVar = new C84209m.C84212c();
                    cVar.f188107a = cookie;
                    cVar.f188108b = a4;
                    mVar.f188069k = cVar;
                }
                if (C16048b.m29633a().mo25412a(true, "player_enable_bash_mp4", 0) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                mVar.f188078t = z7;
                if (C16048b.m29633a().mo25412a(true, "player_use_codecpool", 0) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z8 || !z9) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mVar.f188067i = z10;
                mVar.f188080v = C16048b.m29633a().mo25412a(true, "player_enable_native_thread_pool", 1);
                if (C16048b.m29633a().mo25412a(true, "player_engine_use_ttnet", 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                mVar.f188073o = z11;
                mVar.f188065g = bVar2;
                if (C16048b.m29633a().mo25412a(true, "player_use_v2_report_block", 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                mVar.f188070l = z12;
                mVar.f188071m = C16048b.m29633a().mo25412a(true, "player_enable_seek_end", 1);
                if (C62933c.m113355h()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                mVar.f188084z = i2;
                mVar.f188072n = C16048b.m29633a().mo25412a(true, "player_enable_hardware_decode_skip_nonref", 0);
                mVar.f188079u = C16048b.m29633a().mo25412a(true, "player_vendor_frc_level", 0);
                mVar.f188075q = C16048b.m29633a().mo25412a(true, "player_enable_post_prepare", 0);
                mVar.f188076r = C16048b.m29633a().mo25412a(true, "player_enable_stop_async", 0);
                mVar.f188074p = C16048b.m29633a().mo25412a(true, "player_option_abr_cache", 60);
                mVar.f188081w = C16048b.m29633a().mo25412a(true, "player_prerender_fix_range", 512000);
                if (C16048b.m29633a().mo25412a(true, "player_use_native_render_soft_decode", 0) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                mVar.f188082x = z13;
                if (f181028a == null) {
                    f181028a = new C81019o(C18097a.m33697a(C1764a.m5928a("https://%s/", new Object[]{"tiktokv.com"})));
                }
                mVar.f188077s = f181028a;
                mVar.f188044E = C16048b.m29633a().mo25412a(true, "player_sr_max_width", 720);
                mVar.f188045F = C16048b.m29633a().mo25412a(true, "player_sr_max_height", 1280);
                mVar.f188048I = C16048b.m29633a().mo25421a(true, "player_sr_ignore_resolution_limit", false);
                if (1 == C16048b.m29633a().mo25412a(true, "surface_lifecycle_notification_enabled", 0)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                mVar.f188046G = z14;
                if (C16048b.m29633a().mo25415a(true, "super_resolution_strategy", C74676a.class) != null) {
                    if (z2) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    sparseIntArray.put(42, i3);
                    sparseIntArray.put(45, C16048b.m29633a().mo25412a(true, "player_super_resolution_algorithm_type", 1));
                }
                sparseIntArray.put(48, C16048b.m29633a().mo25412a(true, "preload_pcdn_first_frame_go_cdn_size", 0));
                sparseIntArray.put(49, C16048b.m29633a().mo25412a(true, "player_enable_heart_beat", 0));
                sparseIntArray.put(50, C16048b.m29633a().mo25412a(true, "player_enable_heart_beat_interval", 300));
            } catch (Throwable th) {
                C13468b.m24210a(th);
            }
            mVar.f188049J = C16048b.m29633a().mo25412a(true, "video_codec_buffer_stack_size", 0);
            mVar.f188051L = C16048b.m29633a().mo25412a(true, "audio_codec_buffer_stack_size", 0);
            mVar.f188050K = C16048b.m29633a().mo25412a(true, "audio_filter_stack_size", 0);
            if (1 == C16048b.m29633a().mo25412a(false, "player_render_prepare_enabled", 1)) {
                z4 = true;
            } else {
                z4 = false;
            }
            mVar.f188047H = z4;
            mVar.f188063e = sparseIntArray;
            mVar.f188064f = sparseArray;
            C62960a.f142907a = C80695q.m139908a();
            ISimPlayerService$$CC.get$$STATIC$$().mo124402c();
            int a5 = C16048b.m29633a().mo25412a(true, "videocache_loader_type", 0);
            if (a5 > 0) {
                sparseIntArray.put(39, a5);
            }
            ISimPlayerService$$CC.get$$STATIC$$().mo124398a(C16048b.m29633a().mo25412a(true, "player_enable_debug_log", 0));
        }
        mVar.f188058S = (List) C80689o.f180400d.getValue();
        return mVar;
    }
}
