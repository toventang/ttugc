package com.p2082ss.android.socialbase.downloader.p2183f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30346b;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30427s;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.C30292f;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.f.a */
public final class C30439a {
    static {
        Covode.recordClassIndex(36966);
    }

    /* renamed from: a */
    public static void m62039a(DownloadTask downloadTask, BaseException baseException, int i) {
        if (downloadTask != null) {
            try {
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo != null) {
                    AbstractC30389w monitorDepend = downloadTask.getMonitorDepend();
                    if (C30292f.m61286b(i) || m62041a(downloadInfo.getExtraMonitorStatus(), i) || (monitorDepend != null && (monitorDepend instanceof AbstractC30346b) && m62041a(((AbstractC30346b) monitorDepend).mo53878a(), i))) {
                        try {
                            IDownloadDepend depend = downloadTask.getDepend();
                            if (depend != null) {
                                depend.monitorLogSend(downloadInfo, baseException, i);
                            }
                        } catch (Throwable unused) {
                        }
                        m62034a(monitorDepend, downloadInfo, baseException, i);
                        m62035a(C30399c.f72431c, downloadInfo, baseException, i);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m62041a(int[] iArr, int i) {
        if (iArr != null && iArr.length > 0) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0130  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m62040a(java.lang.String r23, int r24, com.p2082ss.android.socialbase.downloader.p2187i.C30472a r25, com.p2082ss.android.socialbase.downloader.model.DownloadInfo r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i r30, boolean r31, boolean r32, com.p2082ss.android.socialbase.downloader.exception.BaseException r33, long r34, long r36, boolean r38, long r39, long r41, long r43) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2183f.C30439a.m62040a(java.lang.String, int, com.ss.android.socialbase.downloader.i.a, com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String, java.lang.String, com.ss.android.socialbase.downloader.g.i, boolean, boolean, com.ss.android.socialbase.downloader.exception.BaseException, long, long, boolean, long, long, long):void");
    }

    /* renamed from: a */
    public static void m62038a(C30472a aVar, DownloadInfo downloadInfo, String str, String str2, String str3, boolean z, AbstractC30462i iVar, BaseException baseException, long j, long j2) {
        m62040a("segment_io", aVar.mo54258a("monitor_segment_io", 0), aVar, downloadInfo, str, str2, str3, iVar, z, false, baseException, j, j2, false, -1, -1, -1);
    }

    /* renamed from: a */
    public static String m62031a(String str) {
        try {
            if (TextUtils.isDigitsOnly(str)) {
                return String.valueOf(Long.valueOf(str).longValue() % 100);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static void m62033a(int i, JSONObject jSONObject, DownloadInfo downloadInfo) {
        String str;
        if (i == -5) {
            str = "download_uncomplete";
        } else if (i == -4) {
            str = "download_cancel";
        } else if (i == -3) {
            double downloadSpeed = downloadInfo.getDownloadSpeed();
            if (downloadSpeed >= 0.0d) {
                jSONObject.put("download_speed", downloadSpeed);
            }
            str = "download_success";
        } else if (i == -2) {
            str = "download_pause";
        } else if (i == 0) {
            str = "download_create";
        } else if (i == 2) {
            str = "download_start";
        } else if (i != 6) {
            str = "";
        } else {
            str = "download_first_start";
        }
        jSONObject.put("status", str);
    }

    /* renamed from: a */
    public static void m62034a(AbstractC30389w wVar, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (wVar != null) {
            try {
                String eventPage = wVar.getEventPage();
                if (TextUtils.isEmpty(eventPage)) {
                    eventPage = "default";
                }
                JSONObject a = m62032a(eventPage, downloadInfo, baseException, i);
                if (a == null) {
                    a = new JSONObject();
                }
                wVar.monitorLogSend(a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m62035a(AbstractC30440b bVar, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (bVar != null && downloadInfo.isNeedSDKMonitor() && !TextUtils.isEmpty(downloadInfo.getMonitorScene())) {
            try {
                JSONObject a = m62032a(downloadInfo.getMonitorScene(), downloadInfo, baseException, i);
                if (a == null) {
                    a = new JSONObject();
                }
                if (i == -1) {
                    a.put("status", baseException.getErrorCode());
                    bVar.mo53734a("download_failed", a, null, null);
                    return;
                }
                m62033a(i, a, downloadInfo);
                bVar.mo53734a("download_common", a, null, null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m62032a(String str, DownloadInfo downloadInfo, BaseException baseException, int i) {
        JSONException e;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        int i3;
        int i4;
        int i5;
        String str6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str7;
        String str8;
        int i12;
        int i13;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                AbstractC30427s f = C30399c.m61719f();
                int i14 = 0;
                String str14 = "";
                if (f != null) {
                    str3 = f.mo54205b();
                    str4 = m62031a(str3);
                    str2 = f.mo54204a();
                    i2 = f.mo54206c();
                } else {
                    str3 = str14;
                    str4 = str3;
                    str2 = str4;
                    i2 = 0;
                }
                if (baseException == null || !(baseException instanceof DownloadTTNetException)) {
                    str5 = str14;
                } else {
                    str5 = ((DownloadTTNetException) baseException).getRequestLog();
                }
                jSONObject2.put("event_page", str);
                jSONObject2.put("app_id", str2);
                jSONObject2.put("device_id", str3);
                jSONObject2.put("device_id_postfix", str4);
                jSONObject2.put("update_version", i2);
                jSONObject2.put("download_status", i);
                if (downloadInfo != null) {
                    jSONObject2.put("setting_tag", C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null).mo54260a("setting_tag", str14));
                    jSONObject2.put("download_id", downloadInfo.getId());
                    jSONObject2.put(StringSet.name, downloadInfo.getName());
                    jSONObject2.put("url", downloadInfo.getUrl());
                    jSONObject2.put("save_path", downloadInfo.getSavePath());
                    jSONObject2.put("download_time", downloadInfo.getDownloadTime());
                    jSONObject2.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject2.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject2.put("network_quality", downloadInfo.getNetworkQuality());
                    int i15 = 1;
                    if (downloadInfo.isOnlyWifi()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    jSONObject2.put("only_wifi", i3);
                    if (downloadInfo.isNeedHttpsToHttpRetry()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    jSONObject2.put("need_https_degrade", i4);
                    if (downloadInfo.isHttpsToHttpRetryUsed()) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jSONObject2.put("https_degrade_retry_used", i5);
                    if (downloadInfo.getMd5() == null) {
                        str6 = str14;
                    } else {
                        str6 = downloadInfo.getMd5();
                    }
                    jSONObject2.put("md5", str6);
                    jSONObject2.put("chunk_count", downloadInfo.getChunkCount());
                    if (downloadInfo.isForce()) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    jSONObject2.put("is_force", i6);
                    jSONObject2.put("retry_count", downloadInfo.getRetryCount());
                    jSONObject2.put("cur_retry_time", downloadInfo.getCurRetryTime());
                    if (downloadInfo.isNeedRetryDelay()) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    jSONObject2.put("need_retry_delay", i7);
                    if (downloadInfo.isNeedReuseFirstConnection()) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    jSONObject2.put("need_reuse_first_connection", i8);
                    if (downloadInfo.isNeedDefaultHttpServiceBackUp()) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    jSONObject2.put("default_http_service_backup", i9);
                    jSONObject2.put("retry_delay_status", downloadInfo.getRetryDelayStatus().ordinal());
                    if (downloadInfo.isBackUpUrlUsed()) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    jSONObject2.put("backup_url_used", i10);
                    jSONObject2.put("download_byte_error_retry_status", downloadInfo.getByteInvalidRetryStatus().ordinal());
                    jSONObject2.put("forbidden_handler_status", downloadInfo.getAsyncHandleStatus().ordinal());
                    if (downloadInfo.isNeedIndependentProcess()) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    jSONObject2.put("need_independent_process", i11);
                    if (downloadInfo.getHeadConnectionException() != null) {
                        str7 = downloadInfo.getHeadConnectionException();
                    } else {
                        str7 = str14;
                    }
                    jSONObject2.put("head_connection_error_msg", str7);
                    if (downloadInfo.getExtra() != null) {
                        str8 = downloadInfo.getExtra();
                    } else {
                        str8 = str14;
                    }
                    jSONObject2.put("extra", str8);
                    if (!downloadInfo.isAddListenerToSameTask()) {
                        i15 = 0;
                    }
                    jSONObject2.put("add_listener_to_same_task", i15);
                    if (downloadInfo.getBackUpUrls() != null) {
                        i12 = downloadInfo.getBackUpUrls().size();
                    } else {
                        i12 = 0;
                    }
                    jSONObject2.put("backup_url_count", i12);
                    if (downloadInfo.getBackUpUrls() != null) {
                        i13 = downloadInfo.getCurBackUpUrlIndex();
                    } else {
                        i13 = -1;
                    }
                    jSONObject2.put("cur_backup_url_index", i13);
                    if (downloadInfo.getForbiddenBackupUrls() != null) {
                        str9 = downloadInfo.getForbiddenBackupUrls().toString();
                    } else {
                        str9 = str14;
                    }
                    jSONObject2.put("forbidden_urls", str9);
                    if (TextUtils.isEmpty(downloadInfo.getTaskId())) {
                        str10 = str14;
                    } else {
                        str10 = downloadInfo.getTaskId();
                    }
                    jSONObject2.put("task_id", str10);
                    try {
                        String url = downloadInfo.getUrl();
                        if (!TextUtils.isEmpty(url)) {
                            Uri parse = Uri.parse(url);
                            str11 = parse.getHost();
                            str12 = parse.getPath();
                            str13 = parse.getLastPathSegment();
                            if (!TextUtils.isEmpty(str12) && !TextUtils.isEmpty(str13)) {
                                try {
                                    str12 = str12.substring(0, str12.length() - str13.length());
                                } catch (Throwable unused) {
                                }
                            }
                        } else {
                            str13 = str14;
                            str11 = str13;
                            str12 = str11;
                        }
                        jSONObject2.put("url_host", str11);
                        jSONObject2.put("url_path", str12);
                        jSONObject2.put("url_last_path_segment", str13);
                    } catch (Throwable unused2) {
                    }
                }
                if (baseException != null) {
                    i14 = baseException.getErrorCode();
                }
                jSONObject2.put("error_code", i14);
                if (baseException != null) {
                    str14 = baseException.getErrorMessage();
                }
                jSONObject2.put("error_msg", str14);
                jSONObject2.put("request_log", str5);
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[Catch:{ all -> 0x012c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m62036a(com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g r13, java.lang.String r14, java.lang.String r15, long r16, java.lang.String r18, int r19, java.io.IOException r20, com.p2082ss.android.socialbase.downloader.model.DownloadInfo r21) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2183f.C30439a.m62036a(com.ss.android.socialbase.downloader.g.g, java.lang.String, java.lang.String, long, java.lang.String, int, java.io.IOException, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    /* renamed from: a */
    public static void m62037a(C30472a aVar, DownloadInfo downloadInfo, String str, AbstractC30462i iVar, boolean z, boolean z2, BaseException baseException, long j, long j2, boolean z3, long j3, long j4, long j5) {
        m62040a("download_io", aVar.mo54258a("monitor_download_io", 0), aVar, downloadInfo, str, null, null, iVar, z, z2, baseException, j, j2, z3, j3, j4, j5);
    }
}
