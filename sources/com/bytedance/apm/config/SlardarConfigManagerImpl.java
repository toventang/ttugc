package com.bytedance.apm.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.config.C12426g;
import com.bytedance.apm.core.AbstractC12437c;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.apm.p789q.C12593n;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.C12912a;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.AbstractC22716b;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class SlardarConfigManagerImpl implements IConfigManager {
    private C12426g mSlardarConfigFetcher = new C12426g();

    static {
        Covode.recordClassIndex(14222);
    }

    public JSONObject getConfig() {
        return this.mSlardarConfigFetcher.f30167g;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.f30161a;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public String queryConfig() {
        return this.mSlardarConfigFetcher.mo20226d();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void fetchConfig() {
        C12426g gVar = this.mSlardarConfigFetcher;
        boolean a = gVar.mo20221a();
        if (C12397c.m22285b()) {
            if (gVar.f30169i > System.currentTimeMillis()) {
                a = true;
            }
            gVar.mo20220a(a);
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public JSONObject getConfigJSON(String str) {
        return this.mSlardarConfigFetcher.mo20223b(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getServiceSwitch(String str) {
        return this.mSlardarConfigFetcher.mo20222a(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterConfigListener(AbstractC22715a aVar) {
        C12426g gVar = this.mSlardarConfigFetcher;
        if (aVar != null && gVar.f30173m != null) {
            gVar.f30173m.remove(aVar);
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterResponseConfigListener(AbstractC22716b bVar) {
        if (bVar != null && C12912a.f31433a != null) {
            C12912a.f31433a.remove(bVar);
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getMetricTypeSwitch(String str) {
        C12426g gVar = this.mSlardarConfigFetcher;
        if (gVar.f30164d == null || TextUtils.isEmpty(str) || gVar.f30164d.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getSwitch(String str) {
        C12426g gVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || gVar.f30167g == null) {
            return false;
        }
        return gVar.f30167g.optBoolean(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerResponseConfigListener(AbstractC22716b bVar) {
        if (bVar != null) {
            if (C12912a.f31433a == null) {
                C12912a.f31433a = new CopyOnWriteArrayList();
            }
            if (!C12912a.f31433a.contains(bVar)) {
                C12912a.f31433a.add(bVar);
            }
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getLogTypeSwitch(String str) {
        C12426g gVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (TextUtils.equals(str, "core_exception_monitor")) {
            return gVar.f30162b;
        }
        if (gVar.f30163c == null || gVar.f30163c.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerConfigListener(AbstractC22715a aVar) {
        C12426g gVar = this.mSlardarConfigFetcher;
        if (aVar != null) {
            if (gVar.f30173m == null) {
                gVar.f30173m = new CopyOnWriteArrayList();
            }
            if (!gVar.f30173m.contains(aVar)) {
                gVar.f30173m.add(aVar);
            }
            if (gVar.f30161a) {
                aVar.mo20180a(gVar.f30167g, gVar.f30168h);
                aVar.mo20038d();
            }
        }
    }

    public void forceUpdateFromRemote(AbstractC12437c cVar, List<String> list) {
        C12426g gVar = this.mSlardarConfigFetcher;
        gVar.mo20224b();
        if (cVar != null) {
            gVar.f30166f = cVar;
        }
        if (!C12585h.m22682a(list)) {
            gVar.f30165e = new ArrayList(list);
        }
        gVar.mo20220a(true);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public int getConfigInt(String str, int i) {
        C12426g gVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || gVar.f30167g == null) {
            return i;
        }
        return gVar.f30167g.optInt(str, i);
    }

    public void initParams(boolean z, AbstractC12437c cVar, List<String> list) {
        C12426g gVar = this.mSlardarConfigFetcher;
        gVar.f30171k = z;
        gVar.f30172l = C12397c.m22285b();
        gVar.mo20224b();
        gVar.f30166f = cVar;
        if (!C12585h.m22682a(list)) {
            gVar.f30165e = C12426g.m22365a(list);
        }
        if (!gVar.f30170j) {
            gVar.f30170j = true;
            if (gVar.mo20225c()) {
                C12560b.C12564a.f30567a.mo20384a(gVar);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.apm.setting.update.action");
            C12426g.C124271 r1 = new BroadcastReceiver() {
                /* class com.bytedance.apm.config.C12426g.C124271 */

                static {
                    Covode.recordClassIndex(14235);
                }

                /* renamed from: a */
                private static String m22383a(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }

                public final void onReceive(Context context, Intent intent) {
                    if (intent != null) {
                        try {
                            String a = m22383a(intent, "PROCESS_NAME");
                            String a2 = C12593n.m22697a();
                            if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(a2) && !a.equals(a2)) {
                                C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                                    /* class com.bytedance.apm.config.C12426g.C124271.RunnableC124281 */

                                    static {
                                        Covode.recordClassIndex(14236);
                                    }

                                    public final void run() {
                                        try {
                                            C12426g.this.mo20221a();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                });
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            if (C12397c.f29931a != null) {
                C12426g.m22364a(C12397c.f29931a, r1, intentFilter);
            }
        }
    }
}
