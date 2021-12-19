package com.p2082ss.android.socialbase.downloader.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;

/* renamed from: com.ss.android.socialbase.downloader.downloader.e */
public class C30407e extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f72462a = C30407e.class.getSimpleName();

    static {
        Covode.recordClassIndex(36926);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m61762a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.C30407e.m61762a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public void onReceive(final Context context, Intent intent) {
        if (context != null && intent != null) {
            final String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    if (C30434a.m62025a()) {
                        C30434a.m62024a(f72462a, "Received broadcast intent for android.net.conn.CONNECTIVITY_CHANGE");
                    }
                    if (C30399c.f72437i) {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            /* class com.p2082ss.android.socialbase.downloader.downloader.C30407e.RunnableC304081 */

                            static {
                                Covode.recordClassIndex(36927);
                            }

                            public final void run() {
                                try {
                                    Intent intent = new Intent(context, DownloadNotificationService.class);
                                    intent.setAction(action);
                                    m61763a(context, intent);
                                } catch (Throwable unused) {
                                }
                            }

                            /* JADX WARNING: Failed to process nested try/catch */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
                            /* renamed from: a */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            private static android.content.ComponentName m61763a(android.content.Context r9, android.content.Intent r10) {
                                /*
                                // Method dump skipped, instructions count: 114
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.C30407e.RunnableC304081.m61763a(android.content.Context, android.content.Intent):android.content.ComponentName");
                            }
                        }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    try {
                        Intent intent2 = new Intent(context, DownloadNotificationService.class);
                        intent2.setAction(action);
                        m61762a(context, intent2);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
