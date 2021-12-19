package androidx.media.p067b;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.p010v4.media.MediaBrowserCompat;
import android.support.p010v4.media.session.MediaControllerCompat;
import android.support.p010v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.List;

/* renamed from: androidx.media.b.a */
public final class C1274a extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(1387);
    }

    /* renamed from: androidx.media.b.a$a */
    static class C1275a extends MediaBrowserCompat.C0078b {

        /* renamed from: c */
        public MediaBrowserCompat f4196c;

        /* renamed from: d */
        private final Context f4197d;

        /* renamed from: e */
        private final Intent f4198e;

        /* renamed from: f */
        private final BroadcastReceiver.PendingResult f4199f;

        static {
            Covode.recordClassIndex(1388);
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.C0078b
        /* renamed from: b */
        public final void mo79b() {
            m4048d();
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.C0078b
        /* renamed from: c */
        public final void mo80c() {
            m4048d();
        }

        /* renamed from: d */
        private void m4048d() {
            this.f4196c.mo69a();
            this.f4199f.finish();
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.C0078b
        /* renamed from: a */
        public final void mo78a() {
            try {
                new MediaControllerCompat(this.f4197d, this.f4196c.f245b.mo88e()).mo132a((KeyEvent) this.f4198e.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            m4048d();
        }

        C1275a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f4197d = context;
            this.f4198e = intent;
            this.f4199f = pendingResult;
        }
    }

    /* renamed from: a */
    private static BroadcastReceiver.PendingResult m4044a(C1274a aVar) {
        boolean a;
        try {
            if ("com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(aVar.getClass().getName())) {
                try {
                    a = SettingsManager.m29616a().mo25400a("fire_base_receiver_opt", true);
                } catch (Throwable unused) {
                }
                if (a) {
                    return null;
                }
            }
            return aVar.goAsync();
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName a = m4046a(context, "android.intent.action.MEDIA_BUTTON");
            if (a != null) {
                intent.setComponent(a);
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(intent);
                } else {
                    m4045a(context, intent);
                }
            } else {
                ComponentName a2 = m4046a(context, "android.media.browse.MediaBrowserService");
                if (a2 != null) {
                    BroadcastReceiver.PendingResult a3 = m4044a(this);
                    Context applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    C1275a aVar = new C1275a(applicationContext, intent, a3);
                    MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar);
                    aVar.f4196c = mediaBrowserCompat;
                    mediaBrowserCompat.f245b.mo86c();
                    return;
                }
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m4045a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.p067b.C1274a.m4045a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    private static ComponentName m4046a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    /* renamed from: a */
    public static KeyEvent m4047a(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.f346a.mo132a(keyEvent);
        return keyEvent;
    }

    /* renamed from: a */
    public static PendingIntent m4043a(Context context, ComponentName componentName, long j) {
        int i;
        if (componentName == null) {
            return null;
        }
        if (j == 4) {
            i = 126;
        } else if (j == 2) {
            i = 127;
        } else if (j == 32) {
            i = 87;
        } else if (j == 16) {
            i = 88;
        } else if (j == 1) {
            i = 86;
        } else if (j == 64) {
            i = 90;
        } else if (j == 8) {
            i = 89;
        } else if (j != 512) {
            return null;
        } else {
            i = 85;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return PendingIntent.getBroadcast(context, i, intent, 0);
    }
}
