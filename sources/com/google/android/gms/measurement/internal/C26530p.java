package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C26530p {

    /* renamed from: A */
    public static C26338dq<Long> f62462A = m52537a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C26252al.f61692a);

    /* renamed from: B */
    public static C26338dq<Long> f62463B = m52537a("measurement.upload.retry_time", 1800000L, 1800000L, C26251ak.f61691a);

    /* renamed from: C */
    public static C26338dq<Integer> f62464C = m52537a("measurement.upload.retry_count", 6, 6, C26254an.f61694a);

    /* renamed from: D */
    public static C26338dq<Long> f62465D = m52537a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C26253am.f61693a);

    /* renamed from: E */
    public static C26338dq<Integer> f62466E = m52537a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C26256ap.f61696a);

    /* renamed from: F */
    public static C26338dq<Integer> f62467F = m52537a("measurement.audience.filter_result_max_count", 200, 200, C26258ar.f61698a);

    /* renamed from: G */
    public static C26338dq<Integer> f62468G = m52537a("measurement.upload.max_public_user_properties", 25, 25, null);

    /* renamed from: H */
    public static C26338dq<Integer> f62469H = m52537a("measurement.upload.max_event_name_cardinality", 500, 500, null);

    /* renamed from: I */
    public static C26338dq<Integer> f62470I = m52537a("measurement.upload.max_public_event_params", 25, 25, null);

    /* renamed from: J */
    public static C26338dq<Long> f62471J = m52537a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C26257aq.f61697a);

    /* renamed from: K */
    public static C26338dq<Boolean> f62472K = m52537a("measurement.test.boolean_flag", false, false, C26260at.f61700a);

    /* renamed from: L */
    public static C26338dq<String> f62473L = m52537a("measurement.test.string_flag", "---", "---", C26259as.f61699a);

    /* renamed from: M */
    public static C26338dq<Long> f62474M = m52537a("measurement.test.long_flag", -1L, -1L, C26262av.f61702a);

    /* renamed from: N */
    public static C26338dq<Integer> f62475N = m52537a("measurement.test.int_flag", -2, -2, C26261au.f61701a);

    /* renamed from: O */
    public static C26338dq<Double> f62476O;

    /* renamed from: P */
    public static C26338dq<Integer> f62477P = m52537a("measurement.experiment.max_ids", 50, 50, C26263aw.f61703a);

    /* renamed from: Q */
    public static C26338dq<Integer> f62478Q = m52537a("measurement.max_bundles_per_iteration", 2, 2, C26266az.f61706a);

    /* renamed from: R */
    public static C26338dq<Boolean> f62479R = m52537a("measurement.validation.internal_limits_internal_event_params", false, false, C26265ay.f61705a);

    /* renamed from: S */
    public static C26338dq<Boolean> f62480S = m52537a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", true, true, C26269bb.f61710a);

    /* renamed from: T */
    public static C26338dq<Boolean> f62481T = m52537a("measurement.collection.firebase_global_collection_flag_enabled", true, true, C26272be.f61713a);

    /* renamed from: U */
    public static C26338dq<Boolean> f62482U = m52537a("measurement.collection.efficient_engagement_reporting_enabled_2", true, true, C26271bd.f61712a);

    /* renamed from: V */
    public static C26338dq<Boolean> f62483V = m52537a("measurement.collection.redundant_engagement_removal_enabled", false, false, C26274bg.f61715a);

    /* renamed from: W */
    public static C26338dq<Boolean> f62484W = m52537a("measurement.client.freeride_engagement_fix", true, true, C26273bf.f61714a);

    /* renamed from: X */
    public static C26338dq<Boolean> f62485X = m52537a("measurement.experiment.enable_experiment_reporting", true, true, C26276bi.f61717a);

    /* renamed from: Y */
    public static C26338dq<Boolean> f62486Y = m52537a("measurement.collection.log_event_and_bundle_v2", true, true, C26275bh.f61716a);

    /* renamed from: Z */
    public static C26338dq<Boolean> f62487Z = m52537a("measurement.quality.checksum", false, false, null);

    /* renamed from: a */
    static List<C26338dq<?>> f62488a = Collections.synchronizedList(new ArrayList());

    /* renamed from: aA */
    public static C26338dq<Boolean> f62489aA = m52537a("measurement.engagement_time_main_thread", true, true, C26310cp.f61750a);

    /* renamed from: aB */
    public static C26338dq<Boolean> f62490aB = m52537a("measurement.sdk.referrer.delayed_install_referrer_api", false, false, C26309co.f61749a);

    /* renamed from: aC */
    public static C26338dq<Boolean> f62491aC = m52537a("measurement.sdk.screen.disabling_automatic_reporting", false, false, C26312cr.f61752a);

    /* renamed from: aD */
    public static C26338dq<Boolean> f62492aD = m52537a("measurement.sdk.screen.manual_screen_view_logging", false, false, C26311cq.f61751a);

    /* renamed from: aE */
    public static C26338dq<Boolean> f62493aE = m52537a("measurement.gold.enhanced_ecommerce.format_logs", true, true, C26314ct.f61754a);

    /* renamed from: aF */
    public static C26338dq<Boolean> f62494aF = m52537a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true, true, C26313cs.f61753a);

    /* renamed from: aG */
    public static C26338dq<Boolean> f62495aG = m52537a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true, true, C26315cu.f61755a);

    /* renamed from: aH */
    public static C26338dq<Boolean> f62496aH = m52537a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true, true, C26318cx.f61758a);

    /* renamed from: aI */
    public static C26338dq<Boolean> f62497aI = m52537a("measurement.gold.enhanced_ecommerce.updated_schema.client", true, true, C26317cw.f61757a);

    /* renamed from: aJ */
    public static C26338dq<Boolean> f62498aJ = m52537a("measurement.gold.enhanced_ecommerce.updated_schema.service", true, true, C26320cz.f61760a);

    /* renamed from: aK */
    public static C26338dq<Boolean> f62499aK = m52537a("measurement.service.configurable_service_limits", true, true, C26323db.f61767a);

    /* renamed from: aL */
    public static C26338dq<Boolean> f62500aL = m52537a("measurement.client.configurable_service_limits", false, false, C26322da.f61766a);

    /* renamed from: aM */
    public static C26338dq<Boolean> f62501aM = m52537a("measurement.androidId.delete_feature", true, true, C26326de.f61771a);

    /* renamed from: aN */
    public static C26338dq<Boolean> f62502aN = m52537a("measurement.client.global_params.dev", false, false, C26325dd.f61770a);

    /* renamed from: aO */
    public static C26338dq<Boolean> f62503aO = m52537a("measurement.service.global_params", false, false, C26328dg.f61773a);

    /* renamed from: aP */
    public static C26338dq<Boolean> f62504aP = m52537a("measurement.service.global_params_in_payload", true, true, C26330di.f61775a);

    /* renamed from: aQ */
    public static C26338dq<Boolean> f62505aQ = m52537a("measurement.client.string_reader", true, true, C26329dh.f61774a);

    /* renamed from: aR */
    public static C26338dq<Boolean> f62506aR = m52537a("measurement.sdk.attribution.cache", true, true, C26332dk.f61777a);

    /* renamed from: aS */
    public static C26338dq<Long> f62507aS = m52537a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C26331dj.f61776a);

    /* renamed from: aT */
    public static C26338dq<Boolean> f62508aT = m52537a("measurement.service.database_return_empty_collection", true, true, C26334dm.f61779a);

    /* renamed from: aU */
    private static Set<C26338dq<?>> f62509aU = Collections.synchronizedSet(new HashSet());

    /* renamed from: aV */
    private static C26338dq<Boolean> f62510aV = m52537a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", true, true, C26282bo.f61723a);

    /* renamed from: aW */
    private static C26338dq<Boolean> f62511aW = m52537a("measurement.collection.synthetic_data_mitigation", false, false, C26319cy.f61759a);

    /* renamed from: aX */
    private static C26338dq<Boolean> f62512aX = m52537a("measurement.service.ssaid_removal", true, true, C26333dl.f61778a);

    /* renamed from: aY */
    private static C26338dq<Boolean> f62513aY = m52537a("measurement.client.consent_state_v1.dev", false, false, C26336do.f61781a);

    /* renamed from: aZ */
    private static C26338dq<Boolean> f62514aZ = m52537a("measurement.service.consent_state_v1", false, false, C26335dn.f61780a);

    /* renamed from: aa */
    public static C26338dq<Boolean> f62515aa = m52537a("measurement.sdk.dynamite.allow_remote_dynamite2", false, false, C26278bk.f61719a);

    /* renamed from: ab */
    public static C26338dq<Boolean> f62516ab = m52537a("measurement.sdk.collection.validate_param_names_alphabetical", true, true, C26277bj.f61718a);

    /* renamed from: ac */
    public static C26338dq<Boolean> f62517ac = m52537a("measurement.collection.event_safelist", true, true, C26280bm.f61721a);

    /* renamed from: ad */
    public static C26338dq<Boolean> f62518ad = m52537a("measurement.service.audience.fix_skip_audience_with_failed_filters", true, true, C26281bn.f61722a);

    /* renamed from: ae */
    public static C26338dq<Boolean> f62519ae = m52537a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, C26284bq.f61725a);

    /* renamed from: af */
    public static C26338dq<Boolean> f62520af = m52537a("measurement.audience.refresh_event_count_filters_timestamp", false, false, C26283bp.f61724a);

    /* renamed from: ag */
    public static C26338dq<Boolean> f62521ag = m52537a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, C26286bs.f61727a);

    /* renamed from: ah */
    public static C26338dq<Boolean> f62522ah = m52537a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, C26285br.f61726a);

    /* renamed from: ai */
    public static C26338dq<Boolean> f62523ai = m52537a("measurement.sdk.collection.last_deep_link_referrer2", true, true, C26288bu.f61729a);

    /* renamed from: aj */
    public static C26338dq<Boolean> f62524aj = m52537a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, C26287bt.f61728a);

    /* renamed from: ak */
    public static C26338dq<Boolean> f62525ak = m52537a("measurement.sdk.collection.last_gclid_from_referrer2", false, false, C26290bw.f61731a);

    /* renamed from: al */
    public static C26338dq<Boolean> f62526al = m52537a("measurement.sdk.collection.enable_extend_user_property_size", true, true, C26289bv.f61730a);

    /* renamed from: am */
    public static C26338dq<Boolean> f62527am = m52537a("measurement.upload.file_lock_state_check", false, false, C26291bx.f61732a);

    /* renamed from: an */
    public static C26338dq<Boolean> f62528an = m52537a("measurement.sampling.calculate_bundle_timestamp_before_sampling", true, true, C26295ca.f61736a);

    /* renamed from: ao */
    public static C26338dq<Boolean> f62529ao = m52537a("measurement.ga.ga_app_id", false, false, C26293bz.f61734a);

    /* renamed from: ap */
    public static C26338dq<Boolean> f62530ap = m52537a("measurement.lifecycle.app_backgrounded_tracking", true, true, C26298cd.f61738a);

    /* renamed from: aq */
    public static C26338dq<Boolean> f62531aq = m52537a("measurement.lifecycle.app_in_background_parameter", false, false, C26297cc.f61737a);

    /* renamed from: ar */
    public static C26338dq<Boolean> f62532ar = m52537a("measurement.integration.disable_firebase_instance_id", false, false, C26300cf.f61740a);

    /* renamed from: as */
    public static C26338dq<Boolean> f62533as = m52537a("measurement.lifecycle.app_backgrounded_engagement", false, false, C26299ce.f61739a);

    /* renamed from: at */
    public static C26338dq<Boolean> f62534at = m52537a("measurement.collection.service.update_with_analytics_fix", false, false, C26302ch.f61742a);

    /* renamed from: au */
    public static C26338dq<Boolean> f62535au = m52537a("measurement.service.use_appinfo_modified", false, false, C26301cg.f61741a);

    /* renamed from: av */
    public static C26338dq<Boolean> f62536av = m52537a("measurement.client.firebase_feature_rollout.v1.enable", true, true, C26304cj.f61744a);

    /* renamed from: aw */
    public static C26338dq<Boolean> f62537aw = m52537a("measurement.client.sessions.check_on_reset_and_enable2", true, true, C26306cl.f61746a);

    /* renamed from: ax */
    public static C26338dq<Boolean> f62538ax = m52537a("measurement.config.string.always_update_disk_on_set", true, true, C26305ck.f61745a);

    /* renamed from: ay */
    public static C26338dq<Boolean> f62539ay = m52537a("measurement.scheduler.task_thread.cleanup_on_exit", false, false, C26308cn.f61748a);

    /* renamed from: az */
    public static C26338dq<Boolean> f62540az = m52537a("measurement.upload.file_truncate_fix", false, false, C26307cm.f61747a);

    /* renamed from: b */
    public static C26338dq<Long> f62541b = m52537a("measurement.ad_id_cache_time", 10000L, 10000L, C26533s.f62567a);

    /* renamed from: c */
    public static C26338dq<Long> f62542c = m52537a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C26532r.f62566a);

    /* renamed from: d */
    public static C26338dq<Long> f62543d = m52537a("measurement.config.cache_time", 86400000L, 3600000L, C26246af.f61686a);

    /* renamed from: e */
    public static C26338dq<String> f62544e = m52537a("measurement.config.url_scheme", "https", "https", C26255ao.f61695a);

    /* renamed from: f */
    public static C26338dq<String> f62545f = m52537a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C26270bc.f61711a);

    /* renamed from: g */
    public static C26338dq<Integer> f62546g = m52537a("measurement.upload.max_bundles", 100, 100, C26279bl.f61720a);

    /* renamed from: h */
    public static C26338dq<Integer> f62547h = m52537a("measurement.upload.max_batch_size", 65536, 65536, C26292by.f61733a);

    /* renamed from: i */
    public static C26338dq<Integer> f62548i = m52537a("measurement.upload.max_bundle_size", 65536, 65536, C26303ci.f61743a);

    /* renamed from: j */
    public static C26338dq<Integer> f62549j = m52537a("measurement.upload.max_events_per_bundle", 1000, 1000, C26316cv.f61756a);

    /* renamed from: k */
    public static C26338dq<Integer> f62550k = m52537a("measurement.upload.max_events_per_day", 100000, 100000, C26327df.f61772a);

    /* renamed from: l */
    public static C26338dq<Integer> f62551l = m52537a("measurement.upload.max_error_events_per_day", 1000, 1000, C26535u.f62569a);

    /* renamed from: m */
    public static C26338dq<Integer> f62552m = m52537a("measurement.upload.max_public_events_per_day", 50000, 50000, C26534t.f62568a);

    /* renamed from: n */
    public static C26338dq<Integer> f62553n = m52537a("measurement.upload.max_conversions_per_day", 10000, 10000, C26537w.f62571a);

    /* renamed from: o */
    public static C26338dq<Integer> f62554o = m52537a("measurement.upload.max_realtime_events_per_day", 10, 10, C26536v.f62570a);

    /* renamed from: p */
    public static C26338dq<Integer> f62555p = m52537a("measurement.store.max_stored_events_per_app", 100000, 100000, C26539y.f62573a);

    /* renamed from: q */
    public static C26338dq<String> f62556q = m52537a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C26538x.f62572a);

    /* renamed from: r */
    public static C26338dq<Long> f62557r = m52537a("measurement.upload.backoff_period", 43200000L, 43200000L, C26242ab.f61682a);

    /* renamed from: s */
    public static C26338dq<Long> f62558s = m52537a("measurement.upload.window_interval", 3600000L, 3600000L, C26241aa.f61681a);

    /* renamed from: t */
    public static C26338dq<Long> f62559t = m52537a("measurement.upload.interval", 3600000L, 3600000L, C26244ad.f61684a);

    /* renamed from: u */
    public static C26338dq<Long> f62560u = m52537a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C26243ac.f61683a);

    /* renamed from: v */
    public static C26338dq<Long> f62561v = m52537a("measurement.upload.debug_upload_interval", 1000L, 1000L, C26245ae.f61685a);

    /* renamed from: w */
    public static C26338dq<Long> f62562w = m52537a("measurement.upload.minimum_delay", 500L, 500L, C26248ah.f61688a);

    /* renamed from: x */
    public static C26338dq<Long> f62563x = m52537a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C26247ag.f61687a);

    /* renamed from: y */
    public static C26338dq<Long> f62564y = m52537a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C26250aj.f61690a);

    /* renamed from: z */
    public static C26338dq<Long> f62565z = m52537a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C26249ai.f61689a);

    static {
        Covode.recordClassIndex(31952);
        Double valueOf = Double.valueOf(-3.0d);
        f62476O = m52537a("measurement.test.double_flag", valueOf, valueOf, C26264ax.f61704a);
    }

    /* renamed from: a */
    private static <V> C26338dq<V> m52537a(String str, V v, V v2, AbstractC26337dp<V> dpVar) {
        C26338dq<V> dqVar = new C26338dq<>(str, v, v2, dpVar, (byte) 0);
        f62488a.add(dqVar);
        return dqVar;
    }
}
