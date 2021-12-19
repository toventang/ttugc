package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.datatransport.AbstractC25113f;
import com.google.android.datatransport.AbstractC25114g;
import com.google.android.datatransport.C25068b;
import com.google.android.gms.common.util.p1939a.ThreadFactoryC25597b;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.C27695b;
import com.google.firebase.analytics.connector.AbstractC27689a;
import com.google.firebase.iid.C27773ap;
import com.google.firebase.iid.C27809x;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseMessagingService extends AbstractServiceC27862d {
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    /* renamed from: com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m55764x93f59bf7(String str, String str2) {
        return 0;
    }

    /* renamed from: com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m55765x93f59bf8(String str, String str2) {
        return 0;
    }

    /* renamed from: com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m55766x93f59c0a(String str, String str2) {
        return 0;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // com.google.firebase.messaging.AbstractServiceC27862d
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    static {
        Covode.recordClassIndex(33448);
    }

    /* access modifiers changed from: package-private */
    public long getAckTimeoutMillis() {
        return TimeUnit.SECONDS.toMillis(1);
    }

    /* renamed from: com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m55762xe6ad857a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private String getMessageId(Intent intent) {
        String com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m55763x2550e5c8(intent, "google.message_id");
        if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            return m55763x2550e5c8(intent, "message_id");
        }
        return com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.firebase.messaging.AbstractServiceC27862d
    public Intent getStartCommandIntent(Intent intent) {
        return C27773ap.m55533a().f65256c.poll();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC27862d
    public boolean handleIntentOnMainThread(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        handleNotificationOpen(intent);
        return true;
    }

    private AbstractC25631h<Void> ackMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return C25635k.m49512a((Object) null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", str);
        C27809x a = C27809x.m55595a(this);
        return a.mo46456a(new C27809x.C27812c(a.mo46454a(), bundle));
    }

    private boolean alreadyReceivedMessage(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Received duplicate message: ".concat(valueOf);
            } else {
                str2 = new String("Received duplicate message: ");
            }
            m55764x93f59bf7("FirebaseMessaging", str2);
            return true;
        }
    }

    private void dispatchMessage(Intent intent) {
        Bundle com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m55762xe6ad857a(intent);
        if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.remove("androidx.content.wakelockid");
        if (C27877o.m55798a(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras)) {
            C27877o oVar = new C27877o(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            ThreadFactoryC25597b bVar = new ThreadFactoryC25597b("Firebase-Messaging-Network-Io");
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = 1;
            a.f95509g = bVar;
            ExecutorService a2 = C40780g.m82242a(a.mo70028a());
            try {
                if (!new C27861c(this, oVar, a2).mo46559a()) {
                    a2.shutdown();
                    if (C27876n.m55793a(intent)) {
                        C27876n.m55790a("_nf", intent);
                    }
                } else {
                    return;
                }
            } finally {
                a2.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras));
    }

    private void handleMessageIntent(Intent intent) {
        String com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m55763x2550e5c8(intent, "google.message_id");
        AbstractC25631h<Void> ackMessage = ackMessage(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        if (!alreadyReceivedMessage(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            passMessageIntentToSdk(intent);
        }
        try {
            C25635k.m49515a(ackMessage, getAckTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            m55766x93f59c0a("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Message ack failed: ").append(valueOf).toString());
        }
    }

    private void handleNotificationOpen(Intent intent) {
        AbstractC27689a aVar;
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                m55765x93f59bf8("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (C27876n.m55793a(intent)) {
            if ("1".equals(C27876n.m55788a(intent, "google.c.a.tc")) && (aVar = (AbstractC27689a) C27695b.m55376d().mo46325a(AbstractC27689a.class)) != null) {
                String a = C27876n.m55788a(intent, "google.c.a.c_id");
                aVar.mo46319a("fcm", "_ln", a);
                Bundle bundle = new Bundle();
                bundle.putString("source", "Firebase");
                bundle.putString("medium", "notification");
                bundle.putString("campaign", a);
                aVar.mo46318a("fcm", "_cmp", bundle);
            }
            C27876n.m55790a("_no", intent);
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC27862d
    public void handleIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            handleMessageIntent(intent);
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (C27876n.m55793a(intent)) {
                C27876n.m55790a("_nd", intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(m55763x2550e5c8(intent, "token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str = "Unknown intent action: ".concat(valueOf);
            } else {
                str = new String("Unknown intent action: ");
            }
            m55764x93f59bf7("FirebaseMessaging", str);
        }
    }

    private void passMessageIntentToSdk(Intent intent) {
        String str;
        String com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m55763x2550e5c8(intent, "message_type");
        if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "gcm";
        }
        com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.hashCode();
        char c = 65535;
        switch (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.hashCode()) {
            case -2062414158:
                if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("deleted_messages")) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("gcm")) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("send_error")) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("send_event")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                onDeletedMessages();
                return;
            case 1:
                if (C27876n.m55793a(intent)) {
                    C27876n.m55789a(intent, (AbstractC25113f<String>) null);
                }
                if (intent != null && !C27876n.m55794b(intent) && C27876n.m55792a()) {
                    AbstractC25114g gVar = FirebaseMessaging.f65429b;
                    if (gVar != null) {
                        C27876n.m55789a(intent, gVar.mo41063a("FCM_CLIENT_EVENT_LOGGING", C25068b.m48045a("json"), C27869j.f65452a));
                    } else {
                        m55765x93f59bf8("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                    }
                }
                dispatchMessage(intent);
                return;
            case 2:
                onSendError(getMessageId(intent), new C27879q(m55763x2550e5c8(intent, "error")));
                return;
            case 3:
                onMessageSent(m55763x2550e5c8(intent, "google.message_id"));
                return;
            default:
                String valueOf = String.valueOf(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                if (valueOf.length() != 0) {
                    str = "Received message with unknown type: ".concat(valueOf);
                } else {
                    str = new String("Received message with unknown type: ");
                }
                m55766x93f59c0a("FirebaseMessaging", str);
                return;
        }
    }

    /* renamed from: com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m55763x2550e5c8(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
