package com.bytedance.p802b.p824f.p825a.p826a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.C13129e;
import com.bytedance.p802b.p841k.p843b.C13118b;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.f.a.a.a */
public class C13065a {

    /* renamed from: e */
    private static volatile C13065a f31855e;

    /* renamed from: a */
    public volatile JSONObject f31856a;

    /* renamed from: b */
    public AbstractRunnableC13123a f31857b;

    /* renamed from: c */
    IConfigManager f31858c;

    /* renamed from: d */
    public AbstractRunnableC13123a f31859d;

    /* renamed from: f */
    private volatile boolean f31860f;

    /* renamed from: g */
    private List<AbstractC13069b> f31861g;

    /* renamed from: h */
    private boolean f31862h;

    /* renamed from: i */
    private volatile boolean f31863i;

    static {
        Covode.recordClassIndex(14901);
    }

    private C13065a() {
    }

    /* renamed from: a */
    public static C13065a m23491a() {
        if (f31855e == null) {
            synchronized (C13065a.class) {
                if (f31855e == null) {
                    f31855e = new C13065a();
                }
            }
        }
        return f31855e;
    }

    /* renamed from: b */
    public final synchronized void mo20920b() {
        if (!this.f31860f) {
            this.f31860f = true;
            if (C13037a.m23435c()) {
                this.f31857b = new AbstractRunnableC13123a() {
                    /* class com.bytedance.p802b.p824f.p825a.p826a.C13065a.C130661 */

                    static {
                        Covode.recordClassIndex(14902);
                    }

                    public final void run() {
                        if (!TextUtils.isEmpty(C13037a.m23446n())) {
                            if (C13065a.this.f31856a == null) {
                                C13065a aVar = C13065a.this;
                                if (aVar.f31858c == null) {
                                    aVar.f31858c = (IConfigManager) C21520c.m40424a(IConfigManager.class);
                                }
                                if (aVar.f31858c != null) {
                                    String queryConfig = aVar.f31858c.queryConfig();
                                    try {
                                        if (!TextUtils.isEmpty(queryConfig)) {
                                            aVar.mo20919a(new JSONObject(queryConfig), true);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20944b(C13065a.this.f31857b);
                        }
                    }
                };
                C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20943a(this.f31857b);
            }
            IConfigManager iConfigManager = (IConfigManager) C21520c.m40424a(IConfigManager.class);
            this.f31858c = iConfigManager;
            iConfigManager.registerConfigListener(new AbstractC22715a() {
                /* class com.bytedance.p802b.p824f.p825a.p826a.C13065a.C130672 */

                static {
                    Covode.recordClassIndex(14903);
                }

                @Override // com.bytedance.services.slardar.config.AbstractC22715a
                /* renamed from: d */
                public final void mo20038d() {
                }

                @Override // com.bytedance.services.slardar.config.AbstractC22715a
                /* renamed from: a */
                public final void mo20180a(JSONObject jSONObject, final boolean z) {
                    if (jSONObject != null) {
                        try {
                            if (!C13037a.m23435c() || C13065a.this.f31856a == null || !z) {
                                final JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                C13065a.this.f31859d = new AbstractRunnableC13123a() {
                                    /* class com.bytedance.p802b.p824f.p825a.p826a.C13065a.C130672.C130681 */

                                    static {
                                        Covode.recordClassIndex(14904);
                                    }

                                    public final void run() {
                                        try {
                                            C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20944b(C13065a.this.f31859d);
                                            C13065a.this.f31859d = null;
                                            C13065a.this.mo20919a(jSONObject2, z);
                                        } catch (Exception e) {
                                            C13118b.m23587a("APM-Config", "onConfigChanged", e);
                                        }
                                    }
                                };
                                C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20943a(C13065a.this.f31859d);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20918a(AbstractC13069b bVar) {
        if (this.f31861g == null) {
            this.f31861g = new CopyOnWriteArrayList();
        }
        if (!this.f31861g.contains(bVar)) {
            this.f31861g.add(bVar);
        }
        if (this.f31863i) {
            bVar.mo20917a(this.f31856a);
        }
    }

    /* renamed from: a */
    public final void mo20919a(JSONObject jSONObject, boolean z) {
        if (!C13129e.m23602a(jSONObject)) {
            this.f31856a = jSONObject;
            this.f31862h = z;
            this.f31863i = true;
            List<AbstractC13069b> list = this.f31861g;
            if (list != null) {
                for (AbstractC13069b bVar : list) {
                    try {
                        bVar.mo20917a(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
