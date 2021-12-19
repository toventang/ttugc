package com.appsflyer.internal.referrer;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.AndroidUtils;
import com.appsflyer.AppsFlyerLibCore;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class GoogleReferrer {
    public final Map<String, Object> newMap = new HashMap();
    public final Map<String, Object> oldMap = new HashMap();

    static {
        Covode.recordClassIndex(2596);
    }

    public void start(final Context context, final Runnable runnable) {
        try {
            final InstallReferrerClient a = InstallReferrerClient.m6882a(context).mo6233a();
            AFLogger.afDebugLog("Connecting to Install Referrer Library...");
            a.mo6229a(new InstallReferrerStateListener() {
                /* class com.appsflyer.internal.referrer.GoogleReferrer.C23281 */

                static {
                    Covode.recordClassIndex(2597);
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerServiceDisconnected() {
                    AFLogger.afDebugLog("Install Referrer service disconnected");
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerSetupFinished(int i) {
                    GoogleReferrer.this.oldMap.put("code", String.valueOf(i));
                    GoogleReferrer.this.newMap.put("source", "google");
                    GoogleReferrer.this.newMap.put("api_ver", Long.valueOf(AndroidUtils.getVersionCode(context, "com.android.vending")));
                    GoogleReferrer.this.newMap.put("api_ver_name", AndroidUtils.getVersionName(context, "com.android.vending"));
                    GoogleReferrer.this.newMap.putAll(new MandatoryFields());
                    if (i == -1) {
                        AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
                        GoogleReferrer.this.newMap.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        GoogleReferrer.this.newMap.put("response", "OK");
                        try {
                            AFLogger.afDebugLog("InstallReferrer connected");
                            if (a.mo6230a()) {
                                ReferrerDetails c = a.mo6232c();
                                String a = c.mo6236a();
                                if (a != null) {
                                    GoogleReferrer.this.oldMap.put("val", a);
                                    GoogleReferrer.this.newMap.put("referrer", a);
                                }
                                long j = c.f6798a.getLong("referrer_click_timestamp_seconds");
                                GoogleReferrer.this.oldMap.put("clk", Long.toString(j));
                                GoogleReferrer.this.newMap.put("click_ts", Long.valueOf(j));
                                long j2 = c.f6798a.getLong("install_begin_timestamp_seconds");
                                GoogleReferrer.this.oldMap.put("install", Long.toString(j2));
                                GoogleReferrer.this.newMap.put("install_begin_ts", Long.valueOf(j2));
                                try {
                                    boolean z = c.f6798a.getBoolean("google_play_instant");
                                    GoogleReferrer.this.oldMap.put("instant", Boolean.valueOf(z));
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("instant", Boolean.valueOf(z));
                                    GoogleReferrer.this.newMap.put("google_custom", hashMap);
                                } catch (NoSuchMethodError unused) {
                                }
                            } else {
                                AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                                GoogleReferrer.this.oldMap.put("err", "ReferrerClient: InstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger.afWarnLog(new StringBuilder("Failed to get install referrer: ").append(th.getMessage()).toString());
                            GoogleReferrer.this.oldMap.put("err", th.getMessage());
                        }
                    } else if (i == 1) {
                        GoogleReferrer.this.newMap.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.afWarnLog("InstallReferrer not supported");
                    } else if (i == 2) {
                        AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
                        GoogleReferrer.this.newMap.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i != 3) {
                        AFLogger.afWarnLog("responseCode not found.");
                    } else {
                        AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
                        GoogleReferrer.this.newMap.put("response", "DEVELOPER_ERROR");
                    }
                    AFLogger.afDebugLog("Install Referrer collected locally");
                    runnable.run();
                    a.mo6231b();
                }
            });
        } catch (Throwable th) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th);
        }
    }

    public static boolean allow(AppsFlyerLibCore appsFlyerLibCore, Context context) {
        if (appsFlyerLibCore.getLaunchCounter(AppsFlyerLibCore.getSharedPreferences(context), false) > 2) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AndroidUtils.isPermissionAvailable(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog(new StringBuilder("Class ").append("com.android.installreferrer.api.InstallReferrerClient").append(" not found").toString());
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }
}
