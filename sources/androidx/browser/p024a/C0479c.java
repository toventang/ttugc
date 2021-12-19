package androidx.browser.p024a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.C0578c;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.browser.a.c */
public final class C0479c {

    /* renamed from: a */
    public final Intent f1822a;

    /* renamed from: b */
    public final Bundle f1823b;

    static {
        Covode.recordClassIndex(544);
    }

    /* renamed from: androidx.browser.a.c$a */
    public static final class C0480a {

        /* renamed from: a */
        public final Intent f1824a;

        /* renamed from: b */
        private ArrayList<Bundle> f1825b;

        /* renamed from: c */
        private Bundle f1826c;

        /* renamed from: d */
        private ArrayList<Bundle> f1827d;

        /* renamed from: e */
        private boolean f1828e;

        static {
            Covode.recordClassIndex(545);
        }

        public C0480a() {
            this(null);
        }

        /* renamed from: a */
        public final C0479c mo2041a() {
            ArrayList<Bundle> arrayList = this.f1825b;
            if (arrayList != null) {
                this.f1824a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1827d;
            if (arrayList2 != null) {
                this.f1824a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1824a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1828e);
            return new C0479c(this.f1824a, this.f1826c);
        }

        public C0480a(C0483e eVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f1824a = intent;
            IBinder iBinder = null;
            this.f1825b = null;
            this.f1826c = null;
            this.f1827d = null;
            this.f1828e = true;
            if (eVar != null) {
                intent.setPackage(eVar.f1831b.getPackageName());
            }
            Bundle bundle = new Bundle();
            C0578c.m2197a(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.f1830a.asBinder() : iBinder);
            intent.putExtras(bundle);
        }
    }

    C0479c(Intent intent, Bundle bundle) {
        this.f1822a = intent;
        this.f1823b = bundle;
    }

    /* renamed from: a */
    public final void mo2040a(Context context, Uri uri) {
        this.f1822a.setData(uri);
        C0643b.m2372a(context, this.f1822a, this.f1823b);
    }
}
