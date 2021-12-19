package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.legacy.p061a.AbstractC1160a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.concurrent.ExecutorService;

public final class FirebaseInstanceIdReceiver extends AbstractC1160a {

    /* renamed from: a */
    private final ExecutorService f65216a = C27791g.m55574a();

    static {
        Covode.recordClassIndex(33339);
    }

    /* renamed from: a */
    private static BroadcastReceiver.PendingResult m55499a(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver) {
        boolean a;
        try {
            if ("com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(firebaseInstanceIdReceiver.getClass().getName())) {
                try {
                    a = SettingsManager.m29616a().mo25400a("fire_base_receiver_opt", true);
                } catch (Throwable unused) {
                }
                if (a) {
                    return null;
                }
            }
            return firebaseInstanceIdReceiver.goAsync();
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m55500a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        AbstractC27754a bVar;
        Intent intent2;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if ((parcelableExtra instanceof Intent) && (intent2 = (Intent) parcelableExtra) != null) {
                intent = intent2;
            }
            intent.setComponent(null);
            intent.setPackage(context.getPackageName());
            int i = Build.VERSION.SDK_INT;
            if ("google.com/iid".equals(m55500a(intent, "from"))) {
                bVar = new C27805t(this.f65216a);
            } else {
                bVar = new C27786b(context, this.f65216a);
            }
            bVar.mo46406a(intent).mo41873a(this.f65216a, new C27800p(isOrderedBroadcast(), m55499a(this)));
        }
    }
}
