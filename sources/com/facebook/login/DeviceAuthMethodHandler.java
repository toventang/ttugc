package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.EnumC24020c;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new Parcelable.Creator() {
        /* class com.facebook.login.DeviceAuthMethodHandler.C248251 */

        static {
            Covode.recordClassIndex(29002);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }
    };

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor f58912a;

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final String mo40629a() {
        return "device_auth";
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(29001);
    }

    /* renamed from: b */
    public final void mo40659b() {
        this.f58965c.mo40676a(LoginClient.Result.m47588a(this.f58965c.f58925g, "User canceled log in."));
    }

    /* renamed from: c */
    public static synchronized ScheduledThreadPoolExecutor m47554c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            MethodCollector.m26663i(6351);
            if (f58912a == null) {
                f58912a = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f58912a;
            MethodCollector.m26664o(6351);
        }
        return scheduledThreadPoolExecutor;
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: a */
    public final void mo40657a(Exception exc) {
        this.f58965c.mo40676a(LoginClient.Result.m47589a(this.f58965c.f58925g, null, exc.getMessage(), null));
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final int mo40628a(LoginClient.Request request) {
        ActivityC0945e activity = this.f58965c.f58921c.getActivity();
        if (activity == null || activity.isFinishing()) {
            return 1;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.show(activity.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialog.mo40644a(request);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final void mo40658a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC24020c cVar, Date date, Date date2) {
        this.f58965c.mo40676a(LoginClient.Result.m47587a(this.f58965c.f58925g, new AccessToken(str, str2, str3, collection, collection2, collection3, cVar, date, null, date2)));
    }
}
