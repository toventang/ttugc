package com.bytedance.p1399im.core.p1415g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20004l;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19497k;
import com.bytedance.p1399im.core.p1406b.C19505b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19517i;
import com.bytedance.p1399im.core.p1408d.C19590ap;
import com.bytedance.p1399im.core.p1408d.C19591aq;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1408d.C19678z;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81990e;
import java.util.List;

/* renamed from: com.bytedance.im.core.g.b */
public final class C19696b {

    /* renamed from: a */
    public static volatile boolean f46836a;

    /* renamed from: b */
    public static volatile boolean f46837b;

    /* renamed from: c */
    private static Handler f46838c = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m36827a(boolean z, boolean z2, long j, int i, int i2, int i3, int i4, C19672u uVar, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        if (!f46836a) {
            f46836a = true;
            C19517i a = new C19517i().mo31179a("puller_wakeup_pull").mo31180a(StringSet.type, z ? "new" : "old").mo31180a("status", z2 ? "0" : "1").mo31180a("cmd_msg_count", Integer.valueOf(i2)).mo31180a("normal_msg_count", Integer.valueOf(i)).mo31180a("conv_count", Integer.valueOf(i3)).mo31180a("unread_count", Integer.valueOf(i4)).mo31180a("total_msg_count", Integer.valueOf(i + i2)).mo31180a("is_net_available", Integer.valueOf(C19483d.m36365a().f46157b.mo27964e() ? 1 : 0)).mo31180a("duration", Long.valueOf(j)).mo31180a("is_async_save", Integer.valueOf(C19483d.m36365a().mo31141b().f46245aj ? 1 : 0)).mo31180a("build_request_time_cost", Long.valueOf(j2)).mo31180a("response_time_cost", Long.valueOf(j3)).mo31180a("save_msg_list_time_cost", Long.valueOf(j4)).mo31180a("save_conversation_list_time_cost", Long.valueOf(j5)).mo31180a("save_msg_callback_time_cost", Long.valueOf(j6)).mo31180a("local_push_time_cost", Long.valueOf(j7)).mo31180a("sp_and_check_wait_time_cost", Long.valueOf(j8));
            if (!z2 && uVar != null) {
                a.mo31180a("error_code", Integer.valueOf(uVar.f46728a));
                a.mo31180a("log_id", uVar.f46733f);
            }
            a.mo31181b();
            m36811a();
        }
    }

    /* renamed from: a */
    public static void m36823a(String str, boolean z, int i, Throwable th) {
        if (!z) {
            C19517i a = new C19517i().mo31179a("im_sdk_db_op");
            if (str == null) {
                str = "unknown";
            }
            C19517i a2 = a.mo31180a("tag", str).mo31180a("is_success", "0").mo31180a("fail_reason", String.valueOf(i));
            if (th != null) {
                a2.mo31180a("error_msg", m36810a(th));
                a2.mo31180a("error_stack", m36828b(th));
            }
            a2.mo31183d();
        } else if (C19510e.m36440a(0.002f)) {
            C19517i a3 = new C19517i().mo31179a("im_sdk_db_op");
            if (str == null) {
                str = "unknown";
            }
            a3.mo31180a("tag", str).mo31180a("is_success", "1").mo31183d();
        }
    }

    /* renamed from: a */
    public static void m36818a(String str, long j) {
        if (C19510e.m36440a(0.005f)) {
            C19517i a = new C19517i().mo31179a("im_sdk_db_op_cost");
            if (str == null) {
                str = "unknown";
            }
            a.mo31180a("tag", str).mo31180a("cost_time", Long.valueOf(j)).mo31183d();
        }
    }

    /* renamed from: a */
    public static void m36819a(String str, C19678z zVar, boolean z) {
        String str2;
        String str3;
        String str4 = "0";
        if (z) {
            try {
                new C19517i().mo31179a("im_sdk_repair_msg_by_v2").mo31180a("conversation_id", str).mo31180a("uuid", zVar.f46765a).mo31180a("is_time_out", "1").mo31182c();
            } catch (Exception e) {
                C20002j.m37781b("IMPerfMonitor monitorRepairLeakMsg", e);
            }
        } else {
            C19517i a = new C19517i().mo31179a("im_sdk_repair_msg_by_v2").mo31180a("conversation_id", str).mo31180a("uuid", zVar.f46765a).mo31180a("is_time_out", str4).mo31180a(C81990e.f183486g, Long.valueOf(zVar.f46768d));
            if (zVar.f46769e) {
                str2 = "1";
            } else {
                str2 = str4;
            }
            C19517i a2 = a.mo31180a("is_success", str2).mo31180a("is_net_available", Integer.valueOf(C19483d.m36365a().f46157b.mo27964e() ? 1 : 0)).mo31180a("origin_repaired", m36809a(zVar.f46766b)).mo31180a("result_repaired", m36809a(zVar.f46767c)).mo31180a("range_step", Integer.valueOf(zVar.f46770f)).mo31180a("range_leak", m36809a(zVar.f46771g)).mo31180a("range_leak_merge", m36809a(zVar.f46772h)).mo31180a("range_before", m36809a(zVar.f46773i)).mo31180a("range_after", m36809a(zVar.f46774j)).mo31180a("range_await", Long.valueOf(zVar.f46775k));
            if (zVar.f46777m) {
                str3 = "1";
            } else {
                str3 = str4;
            }
            C19517i a3 = a2.mo31180a("range_net", str3).mo31180a("range_net_info", zVar.f46776l).mo31180a("db_step", Integer.valueOf(zVar.f46778n)).mo31180a("max_index", Long.valueOf(zVar.f46779o)).mo31180a("base_index", Long.valueOf(zVar.f46780p)).mo31180a("db_origin_range", m36808a(zVar.f46783s));
            if (zVar.f46782r) {
                str4 = "1";
            }
            C19517i a4 = a3.mo31180a("db_range_invalid", str4).mo31180a("db_older_step", Integer.valueOf(zVar.f46784t)).mo31180a("db_older_start_index", Long.valueOf(zVar.f46785u));
            String str5 = "[]";
            C19517i a5 = a4.mo31180a("db_older_leak_list", zVar.f46786v != null ? zVar.f46786v.toString() : str5).mo31180a("db_older_leak_range_list", m36809a(zVar.f46787w)).mo31180a("db_older_before", m36809a(zVar.f46788x)).mo31180a("db_older_after", m36809a(zVar.f46789y)).mo31180a("db_older_await", Long.valueOf(zVar.f46790z)).mo31180a("db_older_net_info", zVar.f46749A).mo31180a("db_newer_step", Integer.valueOf(zVar.f46757I)).mo31180a("db_newer_start_index", Long.valueOf(zVar.f46758J));
            if (zVar.f46759K != null) {
                str5 = zVar.f46759K.toString();
            }
            C19517i a6 = a5.mo31180a("db_newer_leak_list", str5).mo31180a("db_newer_leak_range_list", m36809a(zVar.f46760L)).mo31180a("db_newer_before", m36809a(zVar.f46761M)).mo31180a("db_newer_after", m36809a(zVar.f46762N)).mo31180a("db_newer_await", Long.valueOf(zVar.f46763O)).mo31180a("db_newer_net_info", zVar.f46764P).mo31180a("db_base_step", Integer.valueOf(zVar.f46750B)).mo31180a("db_base_start_index", Long.valueOf(zVar.f46751C)).mo31180a("db_base_received_min_index", Long.valueOf(zVar.f46752D)).mo31180a("db_base_before", m36809a(zVar.f46755G)).mo31180a("db_base_after", m36809a(zVar.f46756H));
            if (zVar.f46754F != null) {
                a6.mo31180a("db_base_net_info", zVar.f46754F.toString()).mo31180a("db_base_pull_times", Integer.valueOf(zVar.f46754F.f46364d)).mo31180a("db_base_leak_count", Integer.valueOf(zVar.f46754F.f46367g));
            }
            a6.mo31182c();
        }
    }

    /* renamed from: a */
    public static void m36822a(String str, boolean z, int i, int i2) {
        C19517i a = new C19517i().mo31179a("im_sdk_repair_get").mo31180a("conversation_id", str);
        String str2 = "0";
        C19517i a2 = a.mo31180a("status", z ? str2 : "1").mo31180a("count_before", Integer.valueOf(i)).mo31180a("count_after", Integer.valueOf(i2));
        if (i2 >= i) {
            str2 = "1";
        }
        a2.mo31180a("count_ok", str2).mo31182c();
    }

    /* renamed from: a */
    public static void m36815a(int i, boolean z) {
        new C19517i().mo31179a("puller_check_conv_and").mo31180a("leak_count", Integer.valueOf(i)).mo31180a("is_pre_check", z ? "1" : "0").mo31180a("link_mode", Integer.valueOf(C20004l.m37794a().mo31880b())).mo31182c();
    }

    /* renamed from: a */
    public static void m36817a(String str, int i) {
        new C19517i().mo31179a("puller_check_conv_and_failed").mo31180a("error_msg", str).mo31180a("error_code", Integer.valueOf(i)).mo31180a("is_pre_check", "0").mo31182c();
    }

    /* renamed from: a */
    public static void m36820a(String str, String str2, int i, int i2, boolean z, long j, boolean z2) {
        C19517i a = new C19517i().mo31179a("puller_check_msg_and").mo31180a("conversation_id", str).mo31180a("leak_ids", str2).mo31180a("pre_check_leak_count", Integer.valueOf(i)).mo31180a("leak_count", Integer.valueOf(i2)).mo31180a("duration", Long.valueOf(j)).mo31180a("link_mode", Integer.valueOf(C20004l.m37794a().mo31880b()));
        String str3 = "1";
        C19517i a2 = a.mo31180a("repaired_by_v2", z ? str3 : "0");
        if (!z2) {
            str3 = "0";
        }
        a2.mo31180a("is_dup_check", str3).mo31182c();
    }

    /* renamed from: a */
    public static void m36824a(boolean z, int i, boolean z2, long j, long j2, long j3) {
        String str = "1";
        C19517i a = new C19517i().mo31179a("im_sdk_conv_async_local").mo31180a("is_partition", z ? str : "0").mo31180a("conv_count", Integer.valueOf(i));
        if (!z2) {
            str = "0";
        }
        C19517i a2 = a.mo31180a("is_first_init", str).mo31180a(C81990e.f183486g, Long.valueOf(j)).mo31180a("db_cost", Long.valueOf(j2)).mo31180a("enable_conv_box", Integer.valueOf(C19483d.m36365a().mo31141b().f46219aA ? 1 : 0));
        if (C19483d.m36365a().mo31141b().f46219aA) {
            a2.mo31180a("conv_number_in_conv_box", Integer.valueOf(C19505b.m36409a().mo31163e()));
            C20041s.m37876a();
            a2.mo31180a("conv_box_delete_time", Long.valueOf(C20041s.m37903j()));
        }
        if (z) {
            a2.mo31180a("partition_cost", Long.valueOf(j3));
        }
        a2.mo31182c();
    }

    /* renamed from: a */
    public static void m36825a(boolean z, long j, int i, int i2, int i3, C19672u uVar, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        C19517i a = new C19517i().mo31179a("im_sdk_init_handler").mo31180a("is_success", z ? "1" : "0").mo31180a(C81990e.f183486g, Long.valueOf(j)).mo31180a("page_size", Integer.valueOf(i)).mo31180a("conv_count", Integer.valueOf(i2)).mo31180a("total_msg_count", Integer.valueOf(i3)).mo31180a("is_async_save", Integer.valueOf(C19483d.m36365a().mo31141b().f46237ab.initConvListPullAsyncEnable)).mo31180a("response_time_cost", Long.valueOf(j2)).mo31180a("build_request_time_cost", Long.valueOf(j3)).mo31180a("save_msg_list_time_cost", Long.valueOf(j4)).mo31180a("save_conversation_list_time_cost", Long.valueOf(j5)).mo31180a("save_msg_callback_time_cost", Long.valueOf(j6)).mo31180a("after_im_init_time_cost", Long.valueOf(j7)).mo31180a("sp_and_check_wait_time_cost", Long.valueOf(j8));
        if (!z && uVar != null) {
            a.mo31180a("error_msg", m36810a(uVar.f46735h));
            a.mo31180a("log_id", uVar.f46733f);
        }
        a.mo31182c();
    }

    /* renamed from: a */
    public static void m36826a(boolean z, Throwable th, long j, String str, Context context) {
        C19517i a = new C19517i().mo31179a("im_sdk_login_logout_err").mo31180a("is_login", z ? "1" : "0").mo31180a("init_time", Long.valueOf(j));
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        C19517i a2 = a.mo31180a("raw_ctx", str);
        if (context != null) {
            str2 = context.getClass().getName();
        }
        a2.mo31180a("app_ctx", str2).mo31180a("error_msg", m36810a(th)).mo31180a("error_stack", m36828b(th)).mo31182c();
    }

    /* renamed from: a */
    public static void m36821a(String str, Throwable th) {
        C19517i a = new C19517i().mo31179a("im_sdk_local_ext_err").mo31180a("error_msg", m36810a(th)).mo31180a("error_stack", m36828b(th));
        if (str == null) {
            a.mo31180a("local_ext", "none");
        } else {
            a.mo31180a("local_ext", str);
        }
        a.mo31182c();
    }

    static {
        Covode.recordClassIndex(22540);
    }

    /* renamed from: a */
    private static void m36811a() {
        C19483d.m36365a().mo31141b();
        if (C19483d.m36365a().mo31141b().f46250ao.enable == 1) {
            m36816a(new Runnable() {
                /* class com.bytedance.p1399im.core.p1415g.C19696b.RunnableC196971 */

                static {
                    Covode.recordClassIndex(22541);
                }

                public final void run() {
                    try {
                        C19983a.m37717a().execute(new Runnable() {
                            /* class com.bytedance.p1399im.core.p1415g.C19696b.RunnableC196971.RunnableC196981 */

                            static {
                                Covode.recordClassIndex(22542);
                            }

                            public final void run() {
                                int i;
                                int i2;
                                if (C19510e.m36440a(1.0f)) {
                                    C20041s.m37876a();
                                    long j = 0;
                                    long b = C20041s.f47627a.mo27994b(C20041s.m37878a("last_report_db_info_time"), (Long) 0L);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (currentTimeMillis - b >= ((long) (C19483d.m36365a().mo31141b().f46250ao.reportDurationDays * 24 * 60 * 60)) * 1000) {
                                        C20041s.m37876a();
                                        C20041s.f47627a.mo27991a(C20041s.m37878a("last_report_db_info_time"), Long.valueOf(currentTimeMillis));
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        try {
                                            C19742b.m36974a("IMPerfMonitor.monitorDBInfoReal()");
                                            List<String> a = C19749c.m37004a(false);
                                            List<String> a2 = C19749c.m37004a(true);
                                            int a3 = C19696b.m36807a(a);
                                            int a4 = C19696b.m36807a(a2);
                                            int i3 = a3 + a4;
                                            if (!C19995d.m37744a(a)) {
                                                i = 0;
                                                i2 = 0;
                                                for (String str : a) {
                                                    if (C19777i.m37204i(str)) {
                                                        i2++;
                                                    } else {
                                                        i++;
                                                    }
                                                }
                                            } else {
                                                i = 0;
                                                i2 = 0;
                                            }
                                            int a5 = C19777i.m37170a();
                                            long b2 = C19741a.m36958a().mo31683b();
                                            if (b2 >= 0) {
                                                j = b2;
                                            }
                                            C19742b.m36975a("IMPerfMonitor.monitorDBInfoReal()", true);
                                            new C19517i().mo31179a("im_sdk_db_info").mo31180a("total_conv_count", Integer.valueOf(i3)).mo31180a("normal_conv_count", Integer.valueOf(a3)).mo31180a("stranger_conv_count", Integer.valueOf(a4)).mo31180a("normal_has_msg_conv_count", Integer.valueOf(i2)).mo31180a("normal_no_msg_conv_count", Integer.valueOf(i)).mo31180a("total_msg_count", Integer.valueOf(a5)).mo31180a("db_size", Long.valueOf(j)).mo31180a("version", "38").mo31180a("cost_time", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)).mo31183d();
                                        } catch (Exception e) {
                                            C20002j.m37781b("IMPerfMonitor monitorDBInfoReal", e);
                                            C19510e.m36439a(e);
                                            C19742b.m36975a("IMPerfMonitor.monitorDBInfoReal()", false);
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static void m36816a(Runnable runnable) {
        f46838c.postDelayed(runnable, 5000);
    }

    /* renamed from: a */
    static int m36807a(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public static String m36808a(C19590ap apVar) {
        if (apVar != null) {
            return apVar.toString();
        }
        return "[]";
    }

    /* renamed from: b */
    public static String m36828b(Throwable th) {
        if (th == null) {
            return "";
        }
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString.length() > 2000) {
            return stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        return stackTraceString;
    }

    /* renamed from: a */
    public static String m36809a(C19591aq aqVar) {
        if (aqVar != null) {
            return aqVar.toString();
        }
        return "[]";
    }

    /* renamed from: a */
    public static String m36810a(Throwable th) {
        if (th == null) {
            return "";
        }
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        return "";
    }

    /* renamed from: a */
    public static void m36812a(int i, int i2) {
        String str;
        C19517i a = new C19517i().mo31179a("im_invalid_msg_pull").mo31180a("msg_source", Integer.valueOf(i)).mo31180a("link_mode", Integer.valueOf(C20004l.m37794a().mo31880b()));
        if (C20004l.m37794a().f47545b) {
            str = "1";
        } else {
            str = "0";
        }
        a.mo31180a("is_migrate", str).mo31180a("pull_reason", Integer.valueOf(i2)).mo31181b();
    }

    /* renamed from: a */
    public static void m36813a(int i, C19497k kVar) {
        long j;
        int i2;
        C19517i a = new C19517i().mo31179a("im_link_mode_migrate").mo31180a("to_link_mode", Integer.valueOf(i));
        if (kVar != null) {
            j = kVar.baseIndexV2;
        } else {
            j = -2;
        }
        C19517i a2 = a.mo31180a("base_index_v2", Long.valueOf(j));
        if (kVar != null) {
            i2 = kVar.fallbackStrategy;
        } else {
            i2 = -2;
        }
        a2.mo31180a("fallback_strategy", Integer.valueOf(i2)).mo31181b();
    }

    /* renamed from: a */
    public static void m36814a(int i, Throwable th) {
        String str = "";
        try {
            if (th.getMessage() != null) {
                str = th.getMessage();
            }
            String stackTraceString = Log.getStackTraceString(th);
            if (stackTraceString.length() > 2000) {
                stackTraceString = stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            }
            new C19517i().mo31179a("im_save_msg_error").mo31180a("msg_source", Integer.valueOf(i)).mo31180a("error_msg", str).mo31180a("error_stack", stackTraceString).mo31181b();
        } catch (Exception unused) {
        }
    }
}
