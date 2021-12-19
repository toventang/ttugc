package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.view.a */
public final class C0273a {

    /* renamed from: a */
    public Context f891a;

    static {
        Covode.recordClassIndex(307);
    }

    /* renamed from: b */
    public final boolean mo739b() {
        return this.f891a.getResources().getBoolean(R.bool.a);
    }

    /* renamed from: c */
    public final boolean mo740c() {
        if (this.f891a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo738a() {
        Configuration configuration = this.f891a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    private C0273a(Context context) {
        this.f891a = context;
    }

    /* renamed from: a */
    public static C0273a m938a(Context context) {
        return new C0273a(context);
    }
}
