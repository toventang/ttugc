package com.bytedance.awemelobby;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: com.bytedance.awemelobby.b */
public final class C12909b {

    /* renamed from: a */
    public static final C12909b f31428a = new C12909b();

    private C12909b() {
    }

    static {
        Covode.recordClassIndex(14745);
    }

    /* renamed from: com.bytedance.awemelobby.b$a */
    public static final class DialogInterface$OnDismissListenerC12910a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ Activity f31429a;

        /* renamed from: b */
        final /* synthetic */ GoogleApiAvailability f31430b;

        /* renamed from: c */
        final /* synthetic */ int f31431c;

        static {
            Covode.recordClassIndex(14746);
        }

        public DialogInterface$OnDismissListenerC12910a(Activity activity, GoogleApiAvailability googleApiAvailability, int i) {
            this.f31429a = activity;
            this.f31430b = googleApiAvailability;
            this.f31431c = i;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Activity activity = this.f31429a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.bytedance.awemelobby.b$b */
    public static final class DialogInterface$OnCancelListenerC12911b implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ Activity f31432a;

        static {
            Covode.recordClassIndex(14747);
        }

        public DialogInterface$OnCancelListenerC12911b(Activity activity) {
            this.f31432a = activity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Activity activity = this.f31432a;
            if (activity != null) {
                activity.finish();
            }
        }
    }
}
