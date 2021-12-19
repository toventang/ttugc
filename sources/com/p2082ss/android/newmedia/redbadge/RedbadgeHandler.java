package com.p2082ss.android.newmedia.redbadge;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.p2203ug.bus.C30980b;
import com.p2082ss.android.pushmanager.p2172a.C30209b;
import com.p2082ss.android.pushmanager.setting.C30220a;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.redbadge.RedbadgeHandler */
public class RedbadgeHandler extends Service implements WeakHandler.IHandler {

    /* renamed from: a */
    private WeakHandler f71918a;

    /* renamed from: b */
    private Messenger f71919b;

    static {
        Covode.recordClassIndex(36650);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onCreate() {
        super.onCreate();
        this.f71918a = new WeakHandler(this);
        this.f71919b = new Messenger(this.f71918a);
    }

    public IBinder onBind(final Intent intent) {
        C30066d.m60817a().mo53432a(new Runnable() {
            /* class com.p2082ss.android.newmedia.redbadge.RedbadgeHandler.RunnableC301502 */

            static {
                Covode.recordClassIndex(36652);
            }

            public final void run() {
                RedbadgeHandler.this.mo53561a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        }, 0);
        return this.f71919b.getBinder();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53561a(Intent intent) {
        int i;
        if (intent != null) {
            try {
                if ("com.ss.android.redbadge.message".equals(intent.getAction())) {
                    String a = m60972a(intent, "message_data");
                    C30173b a2 = C30173b.m61015a(this);
                    if (a != null && a2.f71934a != null) {
                        if (a2.f71936c) {
                            Logger.debug();
                            JSONObject jSONObject = new JSONObject(a);
                            if (jSONObject.optInt("show") > 0) {
                                String optString = jSONObject.optString("content_type");
                                String optString2 = jSONObject.optString("content");
                                long a3 = C30173b.m61013a(a);
                                if (!C13627m.m24498a(optString) && !C13627m.m24498a(optString2)) {
                                    if (!C30220a.m61144a().f72080a.mo53663b()) {
                                        if ("desktop_red_badge".equals(optString)) {
                                            int i2 = 1;
                                            try {
                                                i = Integer.parseInt(optString2);
                                            } catch (Throwable unused) {
                                                i = new Random().nextInt(5) + 1;
                                            }
                                            if (i > 0) {
                                                C30189e.m61060a().mo53608a(a2.f71934a, i);
                                                a2.f71937d = true;
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("content", optString2);
                                                a2.mo53573a("desktop_red_badge", (long) i, jSONObject2);
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("badge_number", i);
                                                if (!a2.f71936c) {
                                                    i2 = 0;
                                                }
                                                bundle.putInt("red_badge_is_open", i2);
                                                bundle.putString("show_type", "request");
                                                bundle.putLong("rule_id", a3);
                                                C30209b.AbstractC30211b a4 = C30209b.m61099a();
                                                if (a4 != null) {
                                                    a4.mo35468a("red_badge_show", bundle);
                                                }
                                            } else {
                                                C30189e.m61060a().mo53608a(a2.f71934a, 0);
                                                a2.f71937d = false;
                                            }
                                            a2.mo53572a(2);
                                        } else if ("notification".equals(optString)) {
                                            Intent intent2 = new Intent(C30209b.m61099a().mo35470c());
                                            intent2.putExtra(C30209b.m61099a().mo35469b(), optString2);
                                            intent2.setPackage(a2.f71934a.getPackageName());
                                            C30173b.m61014a(a2.f71934a, intent2);
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("content", optString2);
                                            a2.mo53573a("notification", 0, jSONObject3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private static String m60972a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        C30066d.m60817a().mo53432a(new Runnable() {
            /* class com.p2082ss.android.newmedia.redbadge.RedbadgeHandler.RunnableC301491 */

            static {
                Covode.recordClassIndex(36651);
            }

            public final void run() {
                RedbadgeHandler.this.mo53561a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        }, 0);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C30209b.AbstractC30211b bVar = (C30209b.AbstractC30211b) C30980b.m63694a(C30209b.AbstractC30211b.class);
        if (bVar == null || bVar.mo35474g()) {
            return 2;
        }
        return onStartCommand;
    }
}
