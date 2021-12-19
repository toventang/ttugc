package com.p2082ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.format.DateUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.settingsrequest.PopupSettingManager;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.C68793c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.promote.b */
public class C65227b implements WeakHandler.IHandler {

    /* renamed from: a */
    public static DialogC65230d f147151a;

    /* renamed from: d */
    private static SharedPreferences f147152d;

    /* renamed from: e */
    private static C65227b f147153e;

    /* renamed from: b */
    public WeakHandler f147154b = new WeakHandler(this);

    /* renamed from: c */
    public WeakReference<Activity> f147155c;

    /* renamed from: f */
    private C68793c f147156f;

    static {
        Covode.recordClassIndex(76703);
    }

    private C65227b() {
    }

    /* renamed from: b */
    public static SharedPreferences m116890b() {
        if (f147152d == null) {
            f147152d = C34822d.m71158a(C17867d.m33078a(), "aweme-gdpr-dialog", 0);
        }
        return f147152d;
    }

    /* renamed from: a */
    public static C65227b m116889a() {
        MethodCollector.m26663i(7282);
        if (f147153e == null) {
            synchronized (C65227b.class) {
                try {
                    if (f147153e == null) {
                        f147153e = new C65227b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7282);
                    throw th;
                }
            }
        }
        C65227b bVar = f147153e;
        MethodCollector.m26664o(7282);
        return bVar;
    }

    /* renamed from: c */
    public final void mo104388c() {
        if (m116891d()) {
            DialogC65230d dVar = new DialogC65230d(this.f147155c.get(), "", this.f147156f);
            f147151a = dVar;
            dVar.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.p2082ss.android.ugc.aweme.promote.C65227b.DialogInterface$OnDismissListenerC652281 */

                static {
                    Covode.recordClassIndex(76704);
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    C65227b.f147151a = null;
                }
            });
            f147151a.show();
        }
    }

    /* renamed from: d */
    private boolean m116891d() {
        WeakReference<Activity> weakReference;
        if (this.f147156f == null || (weakReference = this.f147155c) == null || weakReference.get() == null) {
            return false;
        }
        this.f147156f = null;
        String curUserId = C31575b.m65865g().getCurUserId();
        if (DateUtils.isToday(m116890b().getLong("last_pop_time_".concat(String.valueOf(curUserId)), 0))) {
            return false;
        }
        try {
            SharedPreferences.Editor edit = m116890b().edit();
            edit.putLong("last_pop_time_".concat(String.valueOf(curUserId)), System.currentTimeMillis());
            edit.apply();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof C34485a) {
            C34485a aVar = (C34485a) obj;
            Activity activity = this.f147155c.get();
            if (activity != null) {
                new C23144b(activity).mo37635a(aVar.getErrorMsg()).mo37637b();
            }
        } else if (obj instanceof Exception) {
            Activity activity2 = this.f147155c.get();
            if (activity2 != null) {
                new C23144b(activity2).mo37640e(R.string.dcr).mo37637b();
            }
        } else {
            if (obj instanceof C65229c) {
                boolean z = true;
                if (i == 1) {
                    C65229c cVar = (C65229c) obj;
                    if (cVar != null) {
                        if (cVar.f147158a == null || !cVar.f147158a.booleanValue()) {
                            z = false;
                        }
                        String curUserId = C31575b.m65865g().getCurUserId();
                        SharedPreferences.Editor edit = m116890b().edit();
                        edit.putBoolean("joined_".concat(String.valueOf(curUserId)), z);
                        edit.apply();
                        mo104388c();
                        return;
                    }
                    return;
                }
            }
            if (i == 2) {
                this.f147156f = PopupSettingManager.C68764a.f153819a.mo109243a("gdpr_popup");
                mo104388c();
            }
        }
    }
}
