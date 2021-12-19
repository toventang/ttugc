package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1200j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    static {
        Covode.recordClassIndex(1265);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (!C1200j.f3987a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1200j.C1201a());
        }
        Context context2 = getContext();
        C1216w wVar = C1216w.f4006i;
        wVar.f4011e = new Handler();
        wVar.f4012f.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
        Context applicationContext2 = context2.getApplicationContext();
        if (C58003a.f132201c && applicationContext2 == null) {
            applicationContext2 = C58003a.f132199a;
        }
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C1189c() {
            /* class androidx.lifecycle.C1216w.C12193 */

            static {
                Covode.recordClassIndex(1326);
            }

            @Override // androidx.lifecycle.C1189c
            public final void onActivityStopped(Activity activity) {
                C1216w wVar = C1216w.this;
                wVar.f4007a--;
                wVar.mo4030a();
            }

            @Override // androidx.lifecycle.C1189c
            public final void onActivityPaused(Activity activity) {
                C1216w wVar = C1216w.this;
                wVar.f4008b--;
                if (wVar.f4008b == 0) {
                    wVar.f4011e.postDelayed(wVar.f4013g, 700);
                }
            }

            @Override // androidx.lifecycle.C1189c
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ((FragmentC1220x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f4018a = C1216w.this.f4014h;
            }
        });
        return true;
    }
}
