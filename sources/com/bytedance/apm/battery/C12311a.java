package com.bytedance.apm.battery;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.battery.p759a.C12313a;
import com.bytedance.apm.battery.p760b.AbstractC12322d;
import com.bytedance.apm.battery.p760b.C12320b;
import com.bytedance.apm.battery.p760b.C12321c;
import com.bytedance.apm.battery.p761c.C12324a;
import com.bytedance.apm.battery.p762d.AbstractC12343g;
import com.bytedance.apm.battery.p762d.C12340d;
import com.bytedance.apm.battery.p762d.C12341e;
import com.bytedance.apm.battery.p762d.C12342f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p772e.C12447a;
import com.bytedance.apm.p779k.AbstractC12513a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.a */
public final class C12311a extends AbstractC12513a {

    /* renamed from: a */
    public final Map<String, AbstractC12343g> f29621a;

    /* renamed from: b */
    public boolean f29622b;

    /* renamed from: c */
    private long f29623c;

    /* renamed from: d */
    private boolean f29624d;

    /* renamed from: e */
    private long f29625e;

    static {
        Covode.recordClassIndex(14116);
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final boolean mo20036b() {
        return true;
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: c */
    public final long mo20037c() {
        return this.f29625e * 60000;
    }

    /* renamed from: com.bytedance.apm.battery.a$a */
    public static final class C12312a {

        /* renamed from: a */
        public static final C12311a f29626a = new C12311a((byte) 0);

        static {
            Covode.recordClassIndex(14117);
        }
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a, com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: d */
    public final void mo20038d() {
        super.mo20038d();
        C12324a.C12327a.f29677a.mo20052a();
    }

    private C12311a() {
        this.f29621a = new ConcurrentHashMap();
        this.f29623c = -1;
        this.f30391p = "battery";
    }

    /* renamed from: f */
    private void m22072f() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f29623c != -1) {
            C12324a.C12327a.f29677a.f29670b = ActivityLifeObserver.getInstance().getTopActivityClassName();
            C12324a.C12327a.f29677a.mo20054a(new C12447a(this.f29624d, currentTimeMillis, "ground_record", currentTimeMillis - this.f29623c));
        }
        this.f29623c = currentTimeMillis;
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: e */
    public final void mo20039e() {
        if (C12397c.m22288e()) {
            String[] strArr = new String[1];
            String str = "onTimer record, current is background? : " + ActivityLifeObserver.getInstance().isForeground();
        }
        m22072f();
        for (AbstractC12343g gVar : this.f29621a.values()) {
            gVar.mo20081m_();
        }
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20032a() {
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 29) {
            this.f29624d = ActivityLifeObserver.getInstance().isForeground();
            this.f29623c = System.currentTimeMillis();
            C12340d dVar = new C12340d();
            C12342f fVar = new C12342f();
            try {
                C12320b bVar = new C12320b();
                bVar.mo20047a("alarm", dVar);
                bVar.mo20047a("power", fVar);
                if (bVar.f29661a.size() != 0) {
                    Class<?> cls = Class.forName("android.os.ServiceManager");
                    char c = 0;
                    Method declaredMethod = cls.getDeclaredMethod("getService", String.class);
                    Field declaredField = cls.getDeclaredField("sCache");
                    declaredField.setAccessible(true);
                    Object obj = null;
                    Map map = (Map) declaredField.get(null);
                    for (Map.Entry<String, AbstractC12322d> entry : bVar.f29661a.entrySet()) {
                        String key = entry.getKey();
                        Object[] objArr = new Object[1];
                        objArr[c] = key;
                        IBinder iBinder = (IBinder) declaredMethod.invoke(obj, objArr);
                        ClassLoader classLoader = cls.getClassLoader();
                        Class[] clsArr = new Class[1];
                        clsArr[c] = IBinder.class;
                        C12321c cVar = new C12321c(iBinder, entry.getValue());
                        IBinder iBinder2 = (IBinder) Proxy.newProxyInstance(classLoader, clsArr, cVar);
                        cVar.f29663b = iBinder2;
                        map.put(key, iBinder2);
                        obj = null;
                        c = 0;
                    }
                }
                C12341e eVar = new C12341e();
                this.f29621a.put("alarm", dVar);
                this.f29621a.put("cpu_active_time", eVar);
                this.f29621a.put("power", fVar);
                C12560b.C12564a.f30567a.mo20384a(this);
                if (C12397c.m22285b() && this.f30389n) {
                    C12324a.C12327a.f29677a.mo20052a();
                }
            } catch (Exception e) {
                if (C12397c.m22288e()) {
                    String[] strArr = new String[1];
                    String str = "hook failed: " + e.getMessage();
                }
                ActivityLifeObserver.getInstance().unregister(this);
                ((IConfigManager) C21520c.m40424a(IConfigManager.class)).unregisterConfigListener(this);
            }
        }
    }

    /* synthetic */ C12311a(byte b) {
        this();
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d, com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20033a(Activity activity) {
        super.mo20033a(activity);
        if (C12397c.m22288e()) {
            new String[]{"onChangeToBack, record data"};
        }
        m22072f();
        for (AbstractC12343g gVar : this.f29621a.values()) {
            gVar.mo20068b();
        }
        this.f29624d = false;
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d, com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final void mo20035b(Activity activity) {
        super.mo20035b(activity);
        if (C12397c.m22288e()) {
            new String[]{"onChangeToFront, record data"};
        }
        m22072f();
        for (AbstractC12343g gVar : this.f29621a.values()) {
            gVar.mo20069c();
        }
        this.f29624d = true;
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20034a(JSONObject jSONObject) {
        this.f29625e = jSONObject.optLong("battery_record_interval", 10);
        boolean z = false;
        int optInt = jSONObject.optInt("enable_upload", 0);
        if (C12397c.m22288e()) {
            String[] strArr = new String[1];
            String str = "mRecordInterval:" + this.f29625e + ",mBatteryCollectEnabled" + optInt;
        }
        if (optInt <= 0 || this.f29625e <= 0) {
            this.f29621a.clear();
            ActivityLifeObserver.getInstance().unregister(this);
            C12560b.C12564a.f30567a.mo20390b(this);
        }
        if (jSONObject.optInt("trace_enable", 0) == 1) {
            z = true;
        }
        this.f29622b = z;
        if (z) {
            C12313a.f29627a = jSONObject.optLong("max_single_wake_lock_hold_time_second", 120) * 1000;
            C12313a.f29628b = (long) jSONObject.optInt("max_total_wake_lock_acquire_count", 5);
            C12313a.f29629c = jSONObject.optLong("max_total_wake_lock_hold_time_second", 240) * 1000;
            C12313a.f29630d = jSONObject.optInt("max_wake_up_alarm_invoke_count", 5);
            C12313a.f29631e = jSONObject.optInt("max_normal_alarm_invoke_count", 10);
            C12313a.f29632f = jSONObject.optLong("max_single_loc_request_time_second", 120) * 1000;
            C12313a.f29633g = jSONObject.optInt("max_total_loc_request_count", 5);
            C12313a.f29634h = jSONObject.optLong("max_total_loc_request_time_second", 240) * 1000;
        }
    }
}
