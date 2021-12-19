package com.bytedance.ies.web.jsbridge2;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class TimeLineEvent implements Serializable {
    private final long elapsedTimestamp;
    private final HashMap<String, Object> extra;
    private final String label;
    private final String message;
    private final String time;
    private final long timeInMillis;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.web.jsbridge2.TimeLineEvent$1 */
    public static /* synthetic */ class C183011 {
        static {
            Covode.recordClassIndex(20973);
        }
    }

    static {
        Covode.recordClassIndex(20972);
    }

    public long getElapsedTimestamp() {
        return this.elapsedTimestamp;
    }

    public HashMap<String, Object> getExtra() {
        return this.extra;
    }

    public String getLabel() {
        return this.label;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTime() {
        return this.time;
    }

    public long getTimeInMillis() {
        return this.timeInMillis;
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.TimeLineEvent$a */
    public static class C18302a {

        /* renamed from: a */
        public String f43678a;

        /* renamed from: b */
        public String f43679b;

        /* renamed from: c */
        public String f43680c;

        /* renamed from: d */
        public long f43681d;

        /* renamed from: e */
        public long f43682e;

        /* renamed from: f */
        public HashMap<String, Object> f43683f;

        /* renamed from: g */
        private SimpleDateFormat f43684g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

        static {
            Covode.recordClassIndex(20974);
        }

        /* renamed from: b */
        public final TimeLineEvent mo29303b() {
            return new TimeLineEvent(this, null);
        }

        /* renamed from: a */
        public final C18302a mo29300a() {
            this.f43680c = this.f43684g.format(new Date());
            this.f43682e = SystemClock.elapsedRealtime();
            this.f43681d = System.currentTimeMillis();
            return this;
        }

        /* renamed from: a */
        public final TimeLineEvent mo29302a(String str, List<TimeLineEvent> list) {
            C18302a a = mo29300a();
            a.f43678a = str;
            TimeLineEvent b = a.mo29303b();
            if (list != null) {
                list.add(b);
            }
            return b;
        }

        /* renamed from: a */
        public final C18302a mo29301a(String str, Object obj) {
            if (this.f43683f == null) {
                this.f43683f = new HashMap<>();
            }
            this.f43683f.put(str, obj);
            return this;
        }
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.TimeLineEvent$b */
    public static class C18303b {

        /* renamed from: A */
        public static String f43685A = "rule_permission_group";

        /* renamed from: B */
        public static String f43686B = "rule_included_method";

        /* renamed from: C */
        public static String f43687C = "rule_excluded_method";

        /* renamed from: D */
        public static String f43688D = "validator_check";

        /* renamed from: E */
        public static String f43689E = "fetch_permission_config";

        /* renamed from: F */
        public static String f43690F = "permission_config_repository";

        /* renamed from: G */
        public static String f43691G = "exception_name";

        /* renamed from: H */
        public static String f43692H = "exception_message";

        /* renamed from: I */
        public static String f43693I = "from_injection";

        /* renamed from: J */
        public static String f43694J = "from_storage";

        /* renamed from: K */
        public static String f43695K = "from_cache";

        /* renamed from: L */
        public static String f43696L = "from_create";

        /* renamed from: M */
        public static String f43697M = "from_network";

        /* renamed from: N */
        public static String f43698N = "from_merge";

        /* renamed from: O */
        public static String f43699O = "unknown_namespace";

        /* renamed from: P */
        public static String f43700P = "not_registered_1";

        /* renamed from: Q */
        public static String f43701Q = "not_registered_2";

        /* renamed from: R */
        public static String f43702R = "url_empty";

        /* renamed from: S */
        public static String f43703S = "params_invalid";

        /* renamed from: T */
        public static String f43704T = "call_invalid_1";

        /* renamed from: U */
        public static String f43705U = "call_invalid_2";

        /* renamed from: V */
        public static String f43706V = "permission_empty_1";

        /* renamed from: W */
        public static String f43707W = "permission_empty_2";

        /* renamed from: X */
        public static String f43708X = "about:blank";

        /* renamed from: Y */
        public static String f43709Y = "about_blank_1";

        /* renamed from: Z */
        public static String f43710Z = "about_blank_2";

        /* renamed from: a */
        public static String f43711a = "url";

        /* renamed from: aA */
        public static String f43712aA = "label_permission_checker_safe_host";

        /* renamed from: aB */
        public static String f43713aB = "label_permission_checker_validator";

        /* renamed from: aC */
        public static String f43714aC = "label_permission_public_method";

        /* renamed from: aD */
        public static String f43715aD = "label_permission_checker_null_config";

        /* renamed from: aE */
        public static String f43716aE = "label_permission_checker_cache_rule";

        /* renamed from: aF */
        public static String f43717aF = "label_permission_checker_remote_config";

        /* renamed from: aG */
        public static String f43718aG = "label_permission_checker_merge_remote_config";

        /* renamed from: aH */
        public static String f43719aH = "label_permission_checker_result";

        /* renamed from: aI */
        public static String f43720aI = "label_permission_checker_fetch";

        /* renamed from: aJ */
        public static String f43721aJ = "label_call_origin_url";

        /* renamed from: aK */
        public static String f43722aK = "label_call_new_url";

        /* renamed from: aL */
        public static String f43723aL = "label_pre_call_origin_url";

        /* renamed from: aM */
        public static String f43724aM = "label_pre_callback_origin_url";

        /* renamed from: aN */
        public static String f43725aN = "label_post_callback_origin_url";

        /* renamed from: aO */
        public static String f43726aO = "label_pre_handle_origin_url";

        /* renamed from: aa */
        public static String f43727aa = "label_enable_permission_check";

        /* renamed from: ab */
        public static String f43728ab = "label_create_fetch_param_exception";

        /* renamed from: ac */
        public static String f43729ac = "label_parse_package_version";

        /* renamed from: ad */
        public static String f43730ad = "label_fetch_on_failed";

        /* renamed from: ae */
        public static String f43731ae = "label_repository_merge_config_exception";

        /* renamed from: af */
        public static String f43732af = "label_repository_parse_config";

        /* renamed from: ag */
        public static String f43733ag = "label_repository_parse_config_exception";

        /* renamed from: ah */
        public static String f43734ah = "label_repository_create_config";

        /* renamed from: ai */
        public static String f43735ai = "label_repository_update_config";

        /* renamed from: aj */
        public static String f43736aj = "label_create_jsb_environment";

        /* renamed from: ak */
        public static String f43737ak = "label_create_jsb_instance";

        /* renamed from: al */
        public static String f43738al = "label_illegal_namespace";

        /* renamed from: am */
        public static String f43739am = "label_permission_storage";

        /* renamed from: an */
        public static String f43740an = "label_parse_config";

        /* renamed from: ao */
        public static String f43741ao = "label_parse_config_exception";

        /* renamed from: ap */
        public static String f43742ap = "label_create_call_handler";

        /* renamed from: aq */
        public static String f43743aq = "label_pending_call_list";

        /* renamed from: ar */
        public static String f43744ar = "label_create_java_call";

        /* renamed from: as */
        public static String f43745as = "label_abstract_bridge_reject";

        /* renamed from: at */
        public static String f43746at = "label_invalid_callback_id";

        /* renamed from: au */
        public static String f43747au = "label_callback_url_changed";

        /* renamed from: av */
        public static String f43748av = "label_call_handler_reject";

        /* renamed from: aw */
        public static String f43749aw = "label_call_pending";

        /* renamed from: ax */
        public static String f43750ax = "label_permission_checker";

        /* renamed from: ay */
        public static String f43751ay = "label_permission_checker_filter_url";

        /* renamed from: az */
        public static String f43752az = "label_permission_checker_null_host";

        /* renamed from: b */
        public static String f43753b = "param";

        /* renamed from: c */
        public static String f43754c = "response";

        /* renamed from: d */
        public static String f43755d = "reason";

        /* renamed from: e */
        public static String f43756e = "value";

        /* renamed from: f */
        public static String f43757f = "key";

        /* renamed from: g */
        public static String f43758g = "from";

        /* renamed from: h */
        public static String f43759h = "null";

        /* renamed from: i */
        public static String f43760i = "false";

        /* renamed from: j */
        public static String f43761j = "true";

        /* renamed from: k */
        public static String f43762k = "config";

        /* renamed from: l */
        public static String f43763l = "config_repository_fetched";

        /* renamed from: m */
        public static String f43764m = "config_size";

        /* renamed from: n */
        public static String f43765n = "namespace";

        /* renamed from: o */
        public static String f43766o = "list";

        /* renamed from: p */
        public static String f43767p = "host";

        /* renamed from: q */
        public static String f43768q = "shortened_host";

        /* renamed from: r */
        public static String f43769r = "filter_url";

        /* renamed from: s */
        public static String f43770s = "safe_host_set";

        /* renamed from: t */
        public static String f43771t = "public_method_set";

        /* renamed from: u */
        public static String f43772u = "enable_permission_check";

        /* renamed from: v */
        public static String f43773v = "disable_all_permission_check";

        /* renamed from: w */
        public static String f43774w = "method_name";

        /* renamed from: x */
        public static String f43775x = "method_class";

        /* renamed from: y */
        public static String f43776y = "method_permission_group";

        /* renamed from: z */
        public static String f43777z = "call_permission_group";

        static {
            Covode.recordClassIndex(20975);
        }
    }

    private TimeLineEvent(C18302a aVar) {
        this.label = aVar.f43678a;
        this.message = aVar.f43679b;
        this.time = aVar.f43680c;
        this.extra = aVar.f43683f;
        this.elapsedTimestamp = aVar.f43682e;
        this.timeInMillis = aVar.f43681d;
    }

    /* synthetic */ TimeLineEvent(C18302a aVar, C183011 r2) {
        this(aVar);
    }
}
