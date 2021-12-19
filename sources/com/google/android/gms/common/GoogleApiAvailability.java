package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0595i;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC25398bh;
import com.google.android.gms.common.api.internal.AbstractC25458j;
import com.google.android.gms.common.api.internal.C25399bi;
import com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC25543f;
import com.google.android.gms.common.internal.C25542e;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.C25572u;
import com.google.android.gms.common.internal.C25573v;
import com.google.android.gms.common.util.C25606h;
import com.google.android.gms.common.util.C25609k;
import com.google.android.gms.internal.p1945d.HandlerC25727g;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

public class GoogleApiAvailability extends C25497c {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C25497c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object mLock = new Object();
    private static final GoogleApiAvailability zaao = new GoogleApiAvailability();
    private String zaap;

    /* renamed from: com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m48707x6b0bb659(String str, String str2) {
        return 0;
    }

    static Dialog zaa(Context context, int i, AbstractDialogInterface$OnClickListenerC25543f fVar, DialogInterface.OnCancelListener onCancelListener) {
        return m48705x32de05f9(context, i, fVar, onCancelListener);
    }

    public static GoogleApiAvailability getInstance() {
        return zaao;
    }

    static {
        Covode.recordClassIndex(30724);
    }

    private final String zag() {
        String str;
        MethodCollector.m26663i(10678);
        synchronized (mLock) {
            try {
                str = this.zaap;
            } finally {
                MethodCollector.m26664o(10678);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.common.C25497c
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // com.google.android.gms.common.C25497c
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.C25497c
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    /* access modifiers changed from: package-private */
    public final void zaa(Context context) {
        new HandlerC25332a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.GoogleApiAvailability$a */
    public class HandlerC25332a extends HandlerC25727g {

        /* renamed from: a */
        private final Context f60089a;

        static {
            Covode.recordClassIndex(30725);
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                return;
            }
            int isGooglePlayServicesAvailable = GoogleApiAvailability.this.isGooglePlayServicesAvailable(this.f60089a);
            if (GoogleApiAvailability.this.isUserResolvableError(isGooglePlayServicesAvailable)) {
                GoogleApiAvailability.this.showErrorNotification(this.f60089a, isGooglePlayServicesAvailable);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public HandlerC25332a(android.content.Context r4) {
            /*
                r2 = this;
                com.google.android.gms.common.GoogleApiAvailability.this = r3
                android.os.Looper r0 = android.os.Looper.myLooper()
                if (r0 != 0) goto L_0x0020
                android.os.Looper r0 = android.os.Looper.getMainLooper()
            L_0x000c:
                r2.<init>(r0)
                android.content.Context r1 = r4.getApplicationContext()
                boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
                if (r0 != 0) goto L_0x001a
            L_0x0017:
                r2.f60089a = r1
                return
            L_0x001a:
                if (r1 == 0) goto L_0x001d
                goto L_0x0017
            L_0x001d:
                android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
                goto L_0x0017
            L_0x0020:
                android.os.Looper r0 = android.os.Looper.myLooper()
                goto L_0x000c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.HandlerC25332a.<init>(com.google.android.gms.common.GoogleApiAvailability, android.content.Context):void");
        }
    }

    @Override // com.google.android.gms.common.C25497c
    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public void showErrorNotification(Context context, int i) {
        zaa(context, i, (String) null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo41433a()) {
            return connectionResult.f60083c;
        }
        return getErrorResolutionPendingIntent(context, connectionResult.f60082b, 0);
    }

    public static Dialog zaa(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        MethodCollector.m26663i(10507);
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C25542e.m49281b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zaa(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        MethodCollector.m26664o(10507);
        return create;
    }

    /* renamed from: com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m48706xcc7c186a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10816);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(10816);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final C25399bi zaa(Context context, AbstractC25398bh bhVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C25399bi biVar = new C25399bi(bhVar);
        m48708x875eb5d2(context, biVar, intentFilter);
        biVar.f60272a = context;
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return biVar;
        }
        bhVar.mo41594a();
        biVar.mo41619a();
        return null;
    }

    @Override // com.google.android.gms.common.C25497c
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // com.google.android.gms.common.C25497c
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    /* renamed from: com_google_android_gms_common_GoogleApiAvailability_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m48704x680a7ee(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m48708x875eb5d2(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m48704x680a7ee(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.m48708x875eb5d2(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public final boolean zaa(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zaa(context, connectionResult.f60082b, (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m48711a(context, errorResolutionPendingIntent, i, true), 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, new C25572u(getErrorResolutionIntent(activity, i, "d"), activity, i2), onCancelListener);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zaa(activity, errorDialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: com_google_android_gms_common_GoogleApiAvailability_com_ss_android_ugc_aweme_lancet_GPLancet_zaa */
    public static Dialog m48705x32de05f9(Context context, int i, AbstractDialogInterface$OnClickListenerC25543f fVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 1 || i == 3 || i == 9) {
            return null;
        }
        return GoogleApiAvailability__zaa$___twin___(context, i, fVar, onCancelListener);
    }

    public static Dialog GoogleApiAvailability__zaa$___twin___(Context context, int i, AbstractDialogInterface$OnClickListenerC25543f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder;
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C25542e.m49281b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i == 1) {
            string = resources.getString(R.string.anj);
        } else if (i == 2) {
            string = resources.getString(R.string.anq);
        } else if (i != 3) {
            string = resources.getString(17039370);
        } else {
            string = resources.getString(R.string.ang);
        }
        if (string != null) {
            builder.setPositiveButton(string, fVar);
        }
        String a = C25542e.m49278a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    static void zaa(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC0945e) {
            AbstractC0952i supportFragmentManager = ((ActivityC0945e) activity).getSupportFragmentManager();
            C25506i iVar = new C25506i();
            Dialog dialog2 = (Dialog) C25565r.m49315a(dialog, "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            iVar.f60492a = dialog2;
            if (onCancelListener != null) {
                iVar.f60493b = onCancelListener;
            }
            iVar.show(supportFragmentManager, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC25493b bVar = new DialogFragmentC25493b();
        Dialog dialog3 = (Dialog) C25565r.m49315a(dialog, "Cannot display null dialog");
        dialog3.setOnCancelListener(null);
        dialog3.setOnDismissListener(null);
        bVar.f60475a = dialog3;
        if (onCancelListener != null) {
            bVar.f60476b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    private final void zaa(Context context, int i, String str, PendingIntent pendingIntent) {
        String a;
        String str2;
        int i2;
        if (i == 18) {
            zaa(context);
        } else if (pendingIntent != null) {
            if (i == 6) {
                a = C25542e.m49279a(context, "common_google_play_services_resolution_required_title");
            } else {
                a = C25542e.m49278a(context, i);
            }
            if (a == null) {
                a = context.getResources().getString(R.string.ann);
            }
            if (i == 6 || i == 19) {
                str2 = C25542e.m49280a(context, "common_google_play_services_resolution_required_text", C25542e.m49277a(context));
            } else {
                str2 = C25542e.m49281b(context, i);
            }
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) m48706xcc7c186a(context, "notification");
            C0595i.C0600e eVar = new C0595i.C0600e(context);
            eVar.f2542y = true;
            C0595i.C0600e a2 = eVar.mo2622b(true).mo2613a((CharSequence) a).mo2612a(new C0595i.C0598c().mo2603c(str2));
            if (C25606h.m49414a(context)) {
                C25565r.m49320a(C25609k.m49420b());
                a2.mo2605a(context.getApplicationInfo().icon).f2529l = 2;
                if (C25606h.m49415b(context)) {
                    a2.mo2607a(2131231789, resources.getString(R.string.apg), pendingIntent);
                } else {
                    a2.f2523f = pendingIntent;
                }
            } else {
                C0595i.C0600e a3 = a2.mo2605a(17301642).mo2627d(resources.getString(R.string.ann)).mo2608a(System.currentTimeMillis());
                a3.f2523f = pendingIntent;
                a3.mo2621b(str2);
            }
            if (C25609k.m49423e()) {
                C25565r.m49320a(C25609k.m49423e());
                String zag = zag();
                if (zag == null) {
                    zag = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(zag);
                    String string = context.getResources().getString(R.string.anm);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(zag, string, 4));
                    } else if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                a2.f2508J = zag;
            }
            Notification d = a2.mo2626d();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C25504g.f60487c.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, d);
        } else if (i == 6) {
            m48707x6b0bb659("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final boolean zaa(Activity activity, AbstractC25458j jVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa = zaa(activity, i, new C25573v(getErrorResolutionIntent(activity, i, "d"), jVar), onCancelListener);
        if (zaa == null) {
            return false;
        }
        zaa(activity, zaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
