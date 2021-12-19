package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class AFEvent {

    /* renamed from: ı */
    WeakReference<Context> f6812;

    /* renamed from: Ɩ */
    public String f6813;

    /* renamed from: ǃ */
    public Intent f6814;

    /* renamed from: ȷ */
    boolean f6815;

    /* renamed from: ɨ */
    public int f6816;

    /* renamed from: ɩ */
    AppsFlyerTrackingRequestListener f6817;

    /* renamed from: ɪ */
    private Map<String, Object> f6818;

    /* renamed from: ɹ */
    String f6819;

    /* renamed from: ɾ */
    private final boolean f6820;

    /* renamed from: ɿ */
    private byte[] f6821;

    /* renamed from: Ι */
    Map<String, Object> f6822;

    /* renamed from: ι */
    Context f6823;

    /* renamed from: І */
    String f6824;

    /* renamed from: і */
    String f6825;

    /* renamed from: Ӏ */
    String f6826;

    /* renamed from: ӏ */
    private String f6827;

    static {
        Covode.recordClassIndex(2479);
    }

    public Intent intent() {
        return this.f6814;
    }

    public boolean isEncrypt() {
        return this.f6820;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final boolean mo6255() {
        return this.f6815;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final byte[] mo6256() {
        return this.f6821;
    }

    public AFEvent() {
        this(null, null, null);
    }

    public String key() {
        return this.f6827;
    }

    public Map<String, Object> params() {
        return this.f6818;
    }

    public String urlString() {
        return this.f6825;
    }

    public AFEvent weakContext() {
        this.f6812 = new WeakReference<>(this.f6823);
        this.f6823 = null;
        return this;
    }

    public Context context() {
        Context context = this.f6823;
        if (context != null) {
            return context;
        }
        WeakReference<Context> weakReference = this.f6812;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ */
    public final AFEvent mo6254() {
        if (context() != null) {
            this.f6823 = m6899xf4049152(context());
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public AFEvent context(Context context) {
        this.f6823 = context;
        return this;
    }

    public AFEvent key(String str) {
        this.f6827 = str;
        return this;
    }

    public AFEvent params(Map<String, ?> map) {
        this.f6818 = map;
        return this;
    }

    public AFEvent post(byte[] bArr) {
        this.f6821 = bArr;
        return this;
    }

    public AFEvent urlString(String str) {
        this.f6825 = str;
        return this;
    }

    /* renamed from: com_appsflyer_AFEvent_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m6899xf4049152(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    public String addChannel(String str) {
        String configuredChannel = AppsFlyerLibCore.getInstance().getConfiguredChannel(context());
        if (configuredChannel != null) {
            return Uri.parse(str).buildUpon().appendQueryParameter("channel", configuredChannel).build().toString();
        }
        return str;
    }

    public AFEvent(String str, Boolean bool, Context context) {
        boolean z;
        this.f6826 = str;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.f6820 = z;
        this.f6823 = context;
    }
}
