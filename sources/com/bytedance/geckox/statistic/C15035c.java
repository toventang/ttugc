package com.bytedance.geckox.statistic;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1016d.C14904b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.model.C15039a;
import com.bytedance.geckox.statistic.model.C15040b;
import com.bytedance.geckox.statistic.model.C15041c;
import com.bytedance.geckox.statistic.model.EventMessageModel;
import com.bytedance.geckox.statistic.model.SettingsUpdateData;
import com.bytedance.geckox.statistic.p1035a.C15018a;
import com.bytedance.geckox.utils.C15044a;
import com.bytedance.geckox.utils.C15059j;
import com.bytedance.geckox.utils.C15062l;
import com.bytedance.geckox.utils.C15067n;
import com.bytedance.geckox.utils.C15068o;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.geckox.statistic.c */
public final class C15035c {

    /* renamed from: a */
    private static String f36703a;

    /* renamed from: b */
    private static long f36704b;

    static {
        Covode.recordClassIndex(17198);
    }

    /* renamed from: a */
    public static void m27684a(ArrayList<C15041c> arrayList, long j) {
        AbstractC15017a c;
        if (arrayList.size() != 0 && (c = m27688c()) != null) {
            try {
                Iterator<C15041c> it = arrayList.iterator();
                while (it.hasNext()) {
                    C15041c next = it.next();
                    JSONObject jSONObject = new JSONObject();
                    m27685a(jSONObject);
                    jSONObject.put("access_key", next.f36740a);
                    jSONObject.put("access_key_resource_usage", next.f36741b);
                    jSONObject.put("channel_count", next.f36742c);
                    jSONObject.put("gecko_total_resource_usage", j);
                    c.mo24302a("geckosdk_access_key_resource_info", jSONObject);
                }
            } catch (Exception unused) {
                C14957a.m27542a();
            }
        }
    }

    /* renamed from: a */
    private static void m27685a(JSONObject jSONObject) {
        Common b = m27686b();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("device_id", b.deviceId);
        jSONObject.put("device_model", b.deviceModel);
        jSONObject.put("os", 0);
        jSONObject.put("os_version", b.osVersion);
        jSONObject.put("region", b.region);
        jSONObject.put("app_version", b.appVersion);
        jSONObject.put("sdk_version", b.sdkVersion);
        jSONObject.put("aid", b.aid);
        jSONObject.put("ac", b.f36579ac);
    }

    /* renamed from: b */
    private static Common m27686b() {
        Context context = C14930f.m27473a().f36477c;
        Common b = C14930f.m27473a().mo24031b();
        b.f36579ac = C15059j.m27729a(context);
        b.appName = C15044a.m27705b(context);
        return b;
    }

    /* renamed from: c */
    private static AbstractC15017a m27688c() {
        GeckoGlobalConfig d = C14930f.m27473a().mo24033d();
        if (d == null) {
            return C14930f.m27473a().f36483j;
        }
        return d.getStatisticMonitor();
    }

    /* renamed from: a */
    public static void m27677a() {
        if (C14930f.m27473a().mo24033d() != null) {
            Context context = C14930f.m27473a().mo24033d().getContext();
            if (f36703a == null) {
                f36703a = C15067n.m27740a().mo24342b(context, "gecko_resource_info", "2021-09-15");
            }
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            if (!TextUtils.equals(format, f36703a)) {
                f36703a = format;
                C15067n.m27740a().mo24341a(context, "gecko_resource_info", format);
                C14957a.m27543a("gecko_resource_info upload date: ", format);
                C15068o.m27745a().mo24343b().execute(new Runnable() {
                    /* class com.bytedance.geckox.statistic.C15035c.RunnableC150361 */

                    static {
                        Covode.recordClassIndex(17199);
                    }

                    public final void run() {
                        File[] listFiles;
                        Map<String, String> map = C14930f.m27473a().f36475a;
                        ArrayList arrayList = new ArrayList();
                        long j = 0;
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && (listFiles = new File(value, key).listFiles(new FileFilter() {
                                /* class com.bytedance.geckox.statistic.C15035c.RunnableC150361.C150371 */

                                static {
                                    Covode.recordClassIndex(17200);
                                }

                                public final boolean accept(File file) {
                                    return file.isDirectory();
                                }
                            })) != null && listFiles.length != 0) {
                                long j2 = 0;
                                for (File file : listFiles) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long[] a = C15062l.m27735a(file);
                                    j2 += a[3];
                                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                    String name = file.getName();
                                    if (C15018a.m27636a().f36689b.get()) {
                                        try {
                                            long j3 = a[0];
                                            long j4 = a[1];
                                            long j5 = a[2];
                                            long j6 = a[3];
                                            C14957a.m27543a("gecko resource info", "active_resource_usage:".concat(String.valueOf(j3)), "inactive_resource_usage:".concat(String.valueOf(j4)), "backup_resource_usage:".concat(String.valueOf(j5)), "total_resource_usage".concat(String.valueOf(j6)), "cost:".concat(String.valueOf(currentTimeMillis2)));
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("aid", String.valueOf(C14930f.m27473a().mo24031b().aid));
                                            jSONObject.put("gecko_sdk_version", "3.0.0-rc.0-mt");
                                            jSONObject.put("access_key", key);
                                            jSONObject.put("channel", name);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("inactive_resource_usage", j4);
                                            jSONObject2.put("backup_resource_usage", j5);
                                            jSONObject2.put("active_resource_usage", j3);
                                            jSONObject2.put("total_resource_usage", j6);
                                            jSONObject2.put("cost", currentTimeMillis2);
                                            C15018a.m27636a().mo24303a("geckosdk_resource_info", jSONObject, jSONObject2);
                                        } catch (Throwable unused) {
                                            C14957a.m27542a();
                                        }
                                    }
                                }
                                j += j2;
                                arrayList.add(new C15041c(key, j2, listFiles.length));
                            }
                        }
                        C15035c.m27684a(arrayList, j);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m27680a(SettingsUpdateData settingsUpdateData) {
        AbstractC15017a c = m27688c();
        if (c != null) {
            try {
                c.mo24302a("geckosdk_query_settings", new JSONObject(C14904b.f36400a.f36401b.mo46674b(settingsUpdateData)));
            } catch (Throwable unused) {
                C14957a.m27542a();
            }
        }
    }

    /* renamed from: a */
    public static void m27679a(UpdatePackage updatePackage) {
        AbstractC15017a statisticMonitor = C14930f.m27473a().mo24033d().getStatisticMonitor();
        if (statisticMonitor != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                m27685a(jSONObject);
                updatePackage.putStatisticModelToJson(jSONObject);
                statisticMonitor.mo24302a("geckosdk_update_aggr_stats", jSONObject);
            } catch (Exception unused) {
                C14957a.m27542a();
            }
        }
    }

    /* renamed from: b */
    private static JSONObject m27687b(C15039a aVar) {
        JSONObject jSONObject = new JSONObject();
        m27685a(jSONObject);
        jSONObject.put("api_version", aVar.f36727k);
        jSONObject.put("x_tt_logid", aVar.f36721e);
        jSONObject.put("http_status", aVar.f36722f);
        jSONObject.put("err_msg", aVar.f36720d);
        if (TextUtils.isEmpty(aVar.f36721e)) {
            jSONObject.put("deployments_info", aVar.f36718b);
            jSONObject.put("local_info", aVar.f36717a);
            jSONObject.put("custom_info", aVar.f36719c);
        } else {
            jSONObject.put("deployments_info", "");
            jSONObject.put("local_info", "");
            jSONObject.put("custom_info", "");
        }
        jSONObject.put("req_type", aVar.f36723g);
        jSONObject.put("is_intercept", aVar.f36724h);
        jSONObject.put("err_code", aVar.f36725i);
        if (aVar.f36726j != 0) {
            jSONObject.put("sync_task_id", aVar.f36726j);
        }
        if (aVar.f36728l != -1) {
            jSONObject.put("delay_from_launch", aVar.f36728l);
        }
        if (aVar.f36729m != -1) {
            jSONObject.put("delay_in_queue", aVar.f36729m);
        }
        if (aVar.f36730n != -1) {
            jSONObject.put("is_merged", aVar.f36730n);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m27681a(C15039a aVar) {
        AbstractC15017a c = m27688c();
        if (c != null) {
            try {
                c.mo24302a("geckosdk_query_pkgs", m27687b(aVar));
            } catch (Throwable unused) {
                C14957a.m27542a();
            }
        }
    }

    /* renamed from: a */
    public static void m27682a(C15040b bVar) {
        AbstractC15017a c = m27688c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                m27685a(jSONObject);
                bVar.mo24320a(jSONObject);
                c.mo24302a("geckosdk_clean_stats", jSONObject);
            } catch (Exception unused) {
                C14957a.m27542a();
            }
        }
    }

    /* renamed from: a */
    public static void m27678a(int i, int i2, String str, String str2) {
        AbstractC15017a c = m27688c();
        if (c != null) {
            try {
                EventMessageModel eventMessageModel = new EventMessageModel(i, i2);
                eventMessageModel.setErrMsg(str);
                eventMessageModel.setExtra(str2);
                eventMessageModel.setDuration(0);
                JSONObject jSONObject = new JSONObject(C14904b.f36400a.f36401b.mo46674b(eventMessageModel));
                m27685a(jSONObject);
                c.mo24302a("geckosdk_event_message", jSONObject);
            } catch (Throwable unused) {
                C14957a.m27542a();
            }
        }
    }

    /* renamed from: a */
    public static void m27683a(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final int i, final int i2) {
        if (C15018a.m27636a().f36689b.get()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f36704b >= 300000) {
                f36704b = currentTimeMillis;
                C15068o.m27745a().mo24343b().execute(new Runnable() {
                    /* class com.bytedance.geckox.statistic.C15035c.RunnableC150382 */

                    static {
                        Covode.recordClassIndex(17201);
                    }

                    public final void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("gecko_sdk_version", "3.0.0-rc.0-mt");
                            jSONObject.put("access_key", str);
                            jSONObject.put("gecko_channel", str2);
                            jSONObject.put("gecko_id", str3);
                            jSONObject.put(StringSet.type, str4);
                            jSONObject.put("hit_local", str5);
                            jSONObject.put("is_blacklist", str6);
                            jSONObject.put("expire_age", String.valueOf(i));
                            jSONObject.put("clean_type", String.valueOf(i2));
                            C15018a.m27636a().mo24303a("geckosdk_resource_access", jSONObject, null);
                        } catch (Throwable unused) {
                            C14957a.m27542a();
                        }
                    }
                });
            }
        }
    }
}
