package com.bytedance.geckox.settings;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.p1011a.AbstractC14872a;
import com.bytedance.geckox.p1016d.C14904b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1025l.C14967a;
import com.bytedance.geckox.p1026m.AbstractC14969a;
import com.bytedance.geckox.p1026m.C14972c;
import com.bytedance.geckox.policy.p1027a.AbstractC14977b;
import com.bytedance.geckox.policy.p1027a.C14975a;
import com.bytedance.geckox.settings.C15006a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.geckox.settings.p1033a.AbstractC15009b;
import com.bytedance.geckox.settings.p1033a.C15008a;
import com.bytedance.geckox.settings.p1034b.C15014a;
import com.bytedance.geckox.utils.C15067n;
import com.bytedance.geckox.utils.C15068o;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.C21934c;
import com.bytedance.p1603q.C21940h;
import com.bytedance.p1603q.p1604a.C21928c;
import com.bytedance.p1603q.p1604a.C21929d;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.settings.b */
public final class C15010b {

    /* renamed from: a */
    public Context f36669a;

    /* renamed from: b */
    public GeckoGlobalConfig f36670b;

    /* renamed from: c */
    public GlobalConfigSettings f36671c;

    /* renamed from: d */
    public C15008a f36672d;

    /* renamed from: e */
    public int f36673e;

    /* renamed from: f */
    public C15016c f36674f;

    /* renamed from: g */
    public boolean f36675g = true;

    /* renamed from: h */
    public C14975a f36676h;

    /* renamed from: i */
    public AtomicBoolean f36677i = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17155);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.settings.b$a */
    public class C15013a extends AbstractC14969a {
        static {
            Covode.recordClassIndex(17158);
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: a */
        public final int mo24079a() {
            return 0;
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: b */
        public final void mo24080b() {
            C15010b.this.mo24250a(3);
        }

        private C15013a() {
        }

        /* synthetic */ C15013a(C15010b bVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo24249a() {
        GlobalConfigSettings.GlobalConfig globalConfig;
        GlobalConfigSettings.SettingsPollingConfig checkUpdate;
        GlobalConfigSettings globalConfigSettings = this.f36671c;
        if (globalConfigSettings != null && (globalConfig = globalConfigSettings.getGlobalConfig()) != null && globalConfig.getPollEnable() == 1 && (checkUpdate = globalConfig.getCheckUpdate()) != null) {
            long interval = checkUpdate.getInterval() * 1000;
            C14972c.m27567a().mo24090a(new C15013a(this, (byte) 0), interval, interval);
        }
    }

    /* renamed from: a */
    public final void mo24250a(final int i) {
        C14957a.m27543a("sync global settings start", Integer.valueOf(i));
        C15068o.m27745a().mo24343b().execute(new Runnable() {
            /* class com.bytedance.geckox.settings.C15010b.RunnableC150122 */

            static {
                Covode.recordClassIndex(17157);
            }

            public final void run() {
                Set<IGeckoRegister> a;
                if (C15010b.this.f36677i.compareAndSet(false, true)) {
                    Context context = C15010b.this.f36669a;
                    GeckoGlobalConfig d = C14930f.m27473a().mo24033d();
                    if (!(d == null || (a = C14967a.C14968a.f36559a.mo24084a(IGeckoRegister.class)) == null || a.isEmpty())) {
                        C14957a.m27543a("gecko register start,register count:" + a.size());
                        long currentTimeMillis = System.currentTimeMillis();
                        GeckoGlobalConfig.ENVType env = d.getEnv();
                        for (IGeckoRegister iGeckoRegister : a) {
                            AbstractC14872a aVar = (AbstractC14872a) iGeckoRegister.getClass().getAnnotation(AbstractC14872a.class);
                            if (aVar == null) {
                                env.name();
                                iGeckoRegister.getClass().getName();
                                C14957a.m27544b();
                            } else {
                                String a2 = aVar.mo23956a();
                                String b = aVar.mo23957b();
                                String c = aVar.mo23958c();
                                int i = C15006a.C150071.f36667a[env.ordinal()];
                                if (i == 2) {
                                    a2 = c;
                                } else if (i == 3) {
                                    a2 = b;
                                }
                                if (TextUtils.isEmpty(a2)) {
                                    env.name();
                                    iGeckoRegister.getClass().getName();
                                    C14957a.m27544b();
                                } else {
                                    Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams = iGeckoRegister.registerCustomParams();
                                    if (registerCustomParams != null && !registerCustomParams.isEmpty()) {
                                        C14930f.m27473a().mo24029a(a2, registerCustomParams);
                                    }
                                    String registerRootDir = iGeckoRegister.registerRootDir(context);
                                    if (TextUtils.isEmpty(registerRootDir)) {
                                        env.name();
                                        iGeckoRegister.getClass().getName();
                                        C14957a.m27544b();
                                    } else {
                                        C14930f.m27473a().mo24028a(a2, registerRootDir);
                                    }
                                }
                            }
                        }
                        C14957a.m27543a("gecko register finish,time cost:" + (System.currentTimeMillis() - currentTimeMillis));
                    }
                }
                try {
                    GeckoGlobalConfig geckoGlobalConfig = C15010b.this.f36670b;
                    int i2 = C15010b.this.f36673e;
                    ArrayList arrayList = new ArrayList();
                    C21940h.C21941a a3 = new C21940h.C21941a().mo35698a(C15014a.class);
                    a3.f51929c = new Object[]{geckoGlobalConfig, Integer.valueOf(i2)};
                    arrayList.add(a3.mo35699a());
                    AbstractC21931b a4 = C21934c.m41249a(arrayList);
                    a4.mo35694a("req_type", Integer.valueOf(i));
                    GlobalConfigSettings globalConfigSettings = (GlobalConfigSettings) a4.mo35692a((Object) null);
                    C15010b.this.f36676h.mo24189b();
                    if (globalConfigSettings != null) {
                        C14957a.m27543a("sync global settings success", globalConfigSettings);
                        C15010b.this.f36675g = false;
                        C15010b.this.f36671c = globalConfigSettings;
                        C15010b bVar = C15010b.this;
                        bVar.f36673e = bVar.f36671c.getVersion();
                        Context context2 = C15010b.this.f36669a;
                        GlobalConfigSettings globalConfigSettings2 = C15010b.this.f36671c;
                        C14957a.m27543a("settings cache stored", globalConfigSettings2);
                        if (globalConfigSettings2 != null) {
                            C15067n.m27740a().mo24341a(context2, "gecko_settings", C14904b.f36400a.f36401b.mo46674b(globalConfigSettings2));
                        }
                        C14972c.m27567a().mo24088a(0);
                        C15010b.this.f36672d.mo24248a(globalConfigSettings);
                    } else {
                        if (C15010b.this.f36675g) {
                            C15010b.this.f36675g = false;
                        }
                        C15010b.this.f36672d.mo24247a();
                    }
                    C15010b.this.mo24249a();
                } catch (Throwable th) {
                    C15010b.this.f36672d.mo24247a();
                    throw th;
                }
                C15010b.this.f36672d.mo24247a();
            }
        });
    }

    public C15010b(GeckoGlobalConfig geckoGlobalConfig) {
        String str;
        this.f36670b = geckoGlobalConfig;
        this.f36669a = geckoGlobalConfig.getContext();
        this.f36672d = new C15008a();
        this.f36674f = new C15016c();
        SettingsLocal b = C15016c.m27633b(this.f36669a);
        String name = this.f36670b.getEnv().name();
        String appVersion = this.f36670b.getAppVersion();
        String str2 = null;
        if (b != null) {
            str2 = b.getEnv();
            str = b.getAppVersion();
        } else {
            str = null;
        }
        Context context = this.f36669a;
        SettingsLocal settingsLocal = new SettingsLocal(name, appVersion);
        C14957a.m27543a("settings local cache stored", settingsLocal);
        C15067n.m27740a().mo24341a(context, "gecko_settings_local", C14904b.f36400a.f36401b.mo46674b(settingsLocal));
        if (!name.equals(str2) || !appVersion.equals(str)) {
            C15016c.m27634c(this.f36669a);
        } else {
            GlobalConfigSettings a = C15016c.m27632a(this.f36669a);
            this.f36671c = a;
            if (a != null) {
                this.f36673e = a.getVersion();
            }
        }
        this.f36676h = new C14975a(new AbstractC14977b() {
            /* class com.bytedance.geckox.settings.C15010b.C150111 */

            static {
                Covode.recordClassIndex(17156);
            }

            @Override // com.bytedance.geckox.policy.p1027a.AbstractC14977b
            /* renamed from: a */
            public final void mo24190a() {
                C14957a.m27543a("sync global settings retry");
                C15010b.this.mo24250a(2);
            }
        });
    }

    /* renamed from: a */
    public final void mo24251a(Throwable th) {
        if (th.getCause() instanceof C21929d) {
            this.f36676h.mo24189b();
            C21929d dVar = (C21929d) th.getCause();
            C15008a aVar = this.f36672d;
            int i = dVar.code;
            String message = dVar.getMessage();
            if (aVar.f36668a != null && !aVar.f36668a.isEmpty()) {
                C14957a.m27543a("global settings notify request error");
                for (AbstractC15009b bVar : aVar.f36668a) {
                    bVar.mo24040a(i, message);
                }
            }
            C14957a.m27543a("settings loop stop");
            if (dVar.code == 2103) {
                C15016c.m27634c(this.f36669a);
                this.f36671c = null;
                this.f36673e = 0;
                this.f36675g = false;
                C14972c.m27567a().mo24088a(0);
                this.f36672d.mo24248a(null);
            } else if (this.f36675g) {
                this.f36675g = false;
                mo24249a();
            }
        } else {
            C14957a.m27545c();
            if (th.getCause() instanceof C21928c) {
                C14975a aVar2 = this.f36676h;
                if (aVar2.f36583b.compareAndSet(false, true)) {
                    aVar2.mo24188a();
                }
            }
            this.f36675g = true;
            C14972c.m27567a().mo24088a(0);
        }
    }
}
