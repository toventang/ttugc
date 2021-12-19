package com.p2082ss.android.ugc.aweme.video.simpreloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.player.C62890a;
import com.p2082ss.android.ugc.aweme.player.p3549ab.abs.p3550a.C62910a;
import com.p2082ss.android.ugc.aweme.video.p4208b.AbstractC80681g;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80689o;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80703w;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.p2082ss.android.ugc.aweme.video.preload.model.C80925a;
import com.p2082ss.android.ugc.aweme.video.preload.model.C80927c;
import com.p2082ss.android.ugc.aweme.video.preload.model.C80928d;
import com.p2082ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.AbstractC80808b;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.C80809c;
import com.p2082ss.android.ugc.playerkit.model.C84202f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment */
public final class PreloaderExperiment implements IPreloaderExperiment {
    public static final C81048a Companion = new C81048a((byte) 0);
    public static int videoNetworkSpeedAlgorithmExperimentValue = -1;
    private final AbstractC89244h mPreloadExpModel$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C81049b.f181167a);

    private final C80927c getMPreloadExpModel() {
        return (C80927c) this.mPreloadExpModel$delegate.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableDetailNotification() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EngineEnableMaxFileMemCacheNumExp() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EngineEnableMaxFileMemCacheSizeExp() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getBandWidthJsonString() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final double getBitrateSwitchThreshold() {
        return 0.75d;
    }

    public final C80925a getBufferPreloadStrategyConfig() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getDataLoaderMdlExtensionOpts() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getGearStrategyJsonString() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getModuleConfigJsonString() {
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment$a */
    public static final class C81048a {
        static {
            Covode.recordClassIndex(94368);
        }

        private C81048a() {
        }

        public /* synthetic */ C81048a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableGetCDNLogExperiment() {
        return AbstractC80681g.f180381a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Map getExCacheDirSizeConfig() {
        return new HashMap();
    }

    public final C80928d getPreloadPromptConfig() {
        return new C80928d((char) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final C80927c getPreloaderExpModel() {
        return getMPreloadExpModel();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int DisableVideocacheLocalServerExperiment() {
        return C16048b.m29633a().mo25412a(true, "disable_videocache_local_server", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnableDownloaderLogExpErrorExperiment() {
        return C16048b.m29633a().mo25412a(true, "enable_engine_downloader_log_exp", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnableP2pStragetyControlExperiment() {
        return C16048b.m29633a().mo25412a(true, "enable_p2p_stragety_control", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableTTnetClientInject() {
        if (C16048b.m29633a().mo25412a(false, "player_enable_ttnet_inject", 1) == 1) {
            return true;
        }
        return false;
    }

    public final long EngineDataloaderDownloadMonitorMinLoadSizeExperiment() {
        return C16048b.m29633a().mo25413a(true, "dataloader_download_monitor_min_loadsize", 0L);
    }

    public final long EngineDataloaderDownloadMonitorTimeInternalExperiment() {
        return C16048b.m29633a().mo25413a(true, "dataloader_download_monitor_time_internal", 0L);
    }

    public final int EnginePreloaderBlockHostErrIPCountExperiment() {
        return C16048b.m29633a().mo25412a(true, "block_host_err_ip_count", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderConcurrentNumExperiment() {
        return C16048b.m29633a().mo25412a(true, "engine_preloader_concurrent_num", 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderEnableNetworkChangedListenExperiment() {
        return C16048b.m29633a().mo25412a(true, "engine_preloader_enable_network_changed_listen", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockAllNetErrorExperiment() {
        return C16048b.m29633a().mo25412a(true, "enable_net_scheduler_block_all_net_error", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockDurationExperiment() {
        return C16048b.m29633a().mo25412a(true, "net_scheduler_block_duration", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockErrorCountExperiment() {
        return C16048b.m29633a().mo25412a(true, "net_scheduler_block_error_count", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerEnableExperiment() {
        return C16048b.m29633a().mo25412a(true, "enable_net_scheduler", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderOpenTimeoutExperiment() {
        return C16048b.m29633a().mo25412a(true, "engine_preloader_open_timeout", 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderPreloadStrategyExperiment() {
        return C16048b.m29633a().mo25412a(true, "engine_preloader_preload_strategy", 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderRWTimeoutExperiment() {
        return C16048b.m29633a().mo25412a(true, "engine_preloader_rw_timeout", 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderStackOrQueueExperiment() {
        return C16048b.m29633a().mo25412a(true, "engine_preloader_queue_or_stack", 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderTlsSessionTimeoutExperiment() {
        return C16048b.m29633a().mo25412a(true, "engine_preloader_tls_session_timeout", 3600);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyEnableSyndnsExperiment() {
        return C16048b.m29633a().mo25412a(true, "enable_p2p_stragety_enable_syndns", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyExpiredTimeExperiment() {
        return C16048b.m29633a().mo25412a(true, "p2p_stragety_expired_time", 120);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMaxBufferingTimeExperiment() {
        return C16048b.m29633a().mo25412a(true, "p2p_stragety_max_buffering_time", 300);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMaxLeaveWaitTimeExperiment() {
        return C16048b.m29633a().mo25412a(true, "p2p_stragety_max_leave_wait_time", 600);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMinNetSpeedExperiment() {
        return C16048b.m29633a().mo25412a(true, "p2p_stragety_min_net_speed", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMinPlayNumberExperiment() {
        return C16048b.m29633a().mo25412a(true, "p2p_stragety_min_play_num", 5);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyXyLibValueExperiment() {
        return C16048b.m29633a().mo25412a(true, "enable_p2p_stragety_xy_lib_value", 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayUse2UrlExperiment() {
        return C16048b.m29633a().mo25412a(true, "player_play_use_2_cdn_url", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayeAbUserHttp2Exp() {
        return C16048b.m29633a().mo25412a(true, "player_use_http2", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRAlgoExp() {
        return C16048b.m29633a().mo25412a(true, "player_abr_algo", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRSpeedPredictAlgoExp() {
        return C16048b.m29633a().mo25412a(true, "player_abr_speed_predict_algo", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRSpeedPredictTimeIntervalExp() {
        return C16048b.m29633a().mo25412a(true, "player_abr_speed_predict_time_interval", 500);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbBackupDnsTypeExp() {
        return C16048b.m29633a().mo25412a(true, "player_ab_backup_dns_type", 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbChecksumLevelExp() {
        return C16048b.m29633a().mo25412a(true, "checksum_level", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbDashPreloadAudioFirstExp() {
        return C16048b.m29633a().mo25412a(true, "player_dash_preload_audio_first", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbEnableDebugLogExp() {
        return C16048b.m29633a().mo25412a(true, "player_enable_debug_log", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMainDnsDelayTimeExp() {
        return C16048b.m29633a().mo25412a(true, "player_ab_main_dns_timeout", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMainDnsTypeExp() {
        return C16048b.m29633a().mo25412a(true, "player_ab_main_dns_type", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMediaLoaderCheckPreloadLevelExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_check_preload_level", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderAccessCheckLevelExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_access_check_level", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableBackupDnsIPExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_dns_backup_ip", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableBenchmarkExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_benchmark_io", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsLogExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_dns_log", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsParallelExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_dns_parallel", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsRefreshExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_dns_refresh", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableFileExtendBuffer() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_file_extend_buffer", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableFileRingBuffer() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_file_ring_buffer", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnablePreconneExp() {
        return ((Number) C62910a.f142805a.getValue()).intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableSpeedCoefficientExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_speed_coefficient", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableTLSSessionReuseExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_tls_session_reuse", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableTaskReuseExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_enable_task_reuse", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderHeaderDataMemCache() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_header_data_mem_cache", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderIpv4Num() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_ipv4_num", Integer.MAX_VALUE);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderIpv6Num() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_ipv6_num", Integer.MAX_VALUE);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderLazyBufferPoolEnableExp() {
        return C16048b.m29633a().mo25412a(true, "player_mdl_enable_lazy_buffer_pool", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderPreconnectNumExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_preconnect_num", 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderTLSVersionExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_tls_version", 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderTaskReuseParallelNextThresholdExp() {
        return C16048b.m29633a().mo25412a(true, "player_medialoader_task_reuse_parallel_next_threshold", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbPreloadSizeOffsetThresholdExp() {
        return C16048b.m29633a().mo25412a(true, "player_preload_size_offset_threshold", 0);
    }

    public final int PlayerAbSpeedSinkExp() {
        return C16048b.m29633a().mo25412a(true, "speed_monitor_sink", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbTestSpeedVersionExp() {
        return C16048b.m29633a().mo25412a(true, "player_test_speed_version", 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerDataEncryptExperiment() {
        return C16048b.m29633a().mo25412a(true, "player_data_encrpt", 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerMdlLogEnableExperiment() {
        return C16048b.m29633a().mo25412a(true, "enable_player_mdl_log", 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int RingBufferSizeMdlExperiment() {
        return C16048b.m29633a().mo25412a(true, "ring_buffer_size", -1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int UseTTNetExperiment() {
        return C16048b.m29633a().mo25412a(true, "use_ttnet", 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheLoaderTypeExperiment() {
        return C16048b.m29633a().mo25412a(true, "videocache_loader_type", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheMaxCacheSizeExperiment() {
        return C16048b.m29633a().mo25412a(true, "player_cache_max_size", -1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheP2pLevelExperiment() {
        return C16048b.m29633a().mo25412a(true, "videocache_p2p_level", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheReadBuffersizeExperiment() {
        return C16048b.m29633a().mo25412a(true, "video_cache_read_buffersize", 8192);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheTTnetPreloadTimeoutExperiment() {
        return C16048b.m29633a().mo25412a(true, "videocache_ttnet_preload_timeout", 30000);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheTTnetProxyTimeoutExperiment() {
        return C16048b.m29633a().mo25412a(true, "videocache_ttnet_proxy_timeout", 10000);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoDownloadSpeedCostTimeExperiment() {
        return C16048b.m29633a().mo25412a(true, "video_download_speed_cost_time", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoSpeedQueueSizeExperiment() {
        return C16048b.m29633a().mo25412a(true, "video_speed_queue_size", 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int enginePreloaderEnableTTnetLoader() {
        return C16048b.m29633a().mo25412a(true, "enable_ttnet_loader", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final List<C84202f> engineStaticOptionList() {
        return (List) C80689o.f180399c.getValue();
    }

    static {
        Covode.recordClassIndex(94367);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean CheckVideoCacheRequestHeaderExperiment() {
        return C16048b.m29633a().mo25421a(true, "check_video_cache_request_header", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnablePreloaderPreConnect() {
        if (C16048b.m29633a().mo25412a(true, "engine_preloader_pre_connect", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final EnginePreloaderConfig EnginePreloaderConfigExperiment() {
        Object a = C16048b.m29633a().mo25416a(true, "engine_preload_config", EnginePreloaderConfig.class, AbstractC80808b.f180736a);
        if (a == null) {
            C89219l.m154715b();
        }
        return (EnginePreloaderConfig) a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String PlayerAbMedialoaderGoogleDnsHostExp() {
        String a = C16048b.m29633a().mo25417a(true, "player_medialoader_google_dns_host", "dns.google.com");
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String PlayerAbMedialoaderOwnDnsHostExp() {
        String a = C16048b.m29633a().mo25417a(true, "player_medialoader_own_dns_host", "34.102.215.99");
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean PlayerAbUseLastIf403Exp() {
        return C16048b.m29633a().mo25421a(true, "player_use_last_url_if_403", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean PlayerPreloadLazyGetUrlsExperiment() {
        return C16048b.m29633a().mo25421a(true, "player_preload_lazy_get_urls", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean PreloadLocalCachePathVideoPlayExperiment() {
        return C16048b.m29633a().mo25421a(true, "is_preload_local_cache_path_video_play_enable", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final AbstractC80918i.EnumC80919a PreloadTypeExperiment() {
        if (C16048b.m29633a().mo25412a(true, "preloader_type", 2) == C80703w.f180428c) {
            return AbstractC80918i.EnumC80919a.MediaLoader;
        }
        return AbstractC80918i.EnumC80919a.VideoCache;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean UseVideoCacheHttpDnsExperiment() {
        return C16048b.m29633a().mo25421a(true, "use_video_cache_http_dns", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean VideoCacheAutoAdjustPreloadMaxExperiment() {
        return C16048b.m29633a().mo25421a(true, "is_video_cache_auto_adust_preload_max", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean VideoCacheWriteAsynchronousExperiment() {
        return C16048b.m29633a().mo25421a(true, "video_cache_write_asynchronous", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoNetworkSpeedAlgorithmExperiment() {
        if (!C62890a.f142627a) {
            return C16048b.m29633a().mo25412a(true, "video_network_speed_algorithm", 0);
        }
        if (videoNetworkSpeedAlgorithmExperimentValue == -1) {
            videoNetworkSpeedAlgorithmExperimentValue = C16048b.m29633a().mo25412a(true, "video_network_speed_algorithm", 0);
        }
        return videoNetworkSpeedAlgorithmExperimentValue;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment$b */
    static final class C81049b extends AbstractC89220m implements AbstractC89171a<C80927c> {

        /* renamed from: a */
        public static final C81049b f181167a = new C81049b();

        static {
            Covode.recordClassIndex(94369);
        }

        C81049b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80927c invoke() {
            C80927c cVar = new C80927c();
            cVar.f180933a = ((Number) C80809c.f180737a.getValue()).intValue();
            cVar.f180938f = ((Number) C80809c.f180742f.getValue()).intValue();
            cVar.f180936d = ((Number) C80809c.f180740d.getValue()).intValue();
            cVar.f180937e = ((Number) C80809c.f180741e.getValue()).intValue();
            cVar.f180934b = ((Number) C80809c.f180738b.getValue()).intValue();
            cVar.f180935c = ((Number) C80809c.f180739c.getValue()).intValue();
            cVar.f180939g = ((Number) C80809c.f180743g.getValue()).intValue();
            cVar.f180940h = ((Number) C80809c.f180744h.getValue()).intValue();
            cVar.f180941i = ((Number) C80809c.f180745i.getValue()).intValue();
            boolean z = true;
            if (((Number) C80809c.f180746j.getValue()).intValue() != 1) {
                z = false;
            }
            cVar.f180942j = z;
            cVar.f180944l = ((Number) C80809c.f180747k.getValue()).intValue();
            cVar.f180945m = ((Number) C80809c.f180748l.getValue()).intValue();
            cVar.f180947o = ((Number) C80809c.f180749m.getValue()).longValue();
            cVar.f180948p = ((Number) C80809c.f180750n.getValue()).longValue();
            cVar.f180946n = (HashMap) C80809c.f180751o.getValue();
            return cVar;
        }
    }
}
