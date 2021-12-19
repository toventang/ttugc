package com.snapchat.kit.sdk.core.config;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p4640l.AbstractC89716b;
import p4640l.AbstractC89743d;
import p4640l.C89781l;

/* renamed from: com.snapchat.kit.sdk.core.config.f */
public final class C28965f {

    /* renamed from: a */
    public SharedPreferences f68434a;

    /* renamed from: b */
    private int f68435b = EnumC28968a.f68440a;

    /* renamed from: c */
    private ConfigClient f68436c;

    /* renamed from: d */
    private ArrayList<ServerSampleRateCallback> f68437d = new ArrayList<>();

    static {
        Covode.recordClassIndex(35151);
    }

    /* renamed from: b */
    public static boolean m57978b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* access modifiers changed from: protected */
    /* renamed from: com.snapchat.kit.sdk.core.config.f$a */
    public static final class EnumC28968a extends Enum<EnumC28968a> {

        /* renamed from: a */
        public static final int f68440a = 1;

        /* renamed from: b */
        public static final int f68441b = 2;

        /* renamed from: c */
        public static final int f68442c = 3;

        /* renamed from: d */
        private static final /* synthetic */ int[] f68443d = {1, 2, 3};

        static {
            Covode.recordClassIndex(35154);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo50320a() {
        MethodCollector.m26663i(8225);
        this.f68435b = EnumC28968a.f68440a;
        Iterator<ServerSampleRateCallback> it = this.f68437d.iterator();
        while (it.hasNext()) {
            it.next().onServerSampleRateFailure();
        }
        this.f68437d.clear();
        MethodCollector.m26664o(8225);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo50321a(double d) {
        MethodCollector.m26663i(8227);
        this.f68434a.edit().putFloat("com.snapchat.kit.sdk.core.config.skateSampleRate", (float) d).apply();
        this.f68435b = EnumC28968a.f68442c;
        Iterator<ServerSampleRateCallback> it = this.f68437d.iterator();
        while (it.hasNext()) {
            it.next().onServerSampleRateAvailable(d);
        }
        this.f68437d.clear();
        MethodCollector.m26664o(8227);
    }

    /* renamed from: a */
    public final synchronized void mo50322a(ServerSampleRateCallback serverSampleRateCallback) {
        MethodCollector.m26663i(8223);
        if (this.f68435b == EnumC28968a.f68442c) {
            try {
                serverSampleRateCallback.onServerSampleRateAvailable((double) this.f68434a.getFloat("com.snapchat.kit.sdk.core.config.skateSampleRate", 0.0f));
                MethodCollector.m26664o(8223);
            } catch (ClassCastException unused) {
                serverSampleRateCallback.onServerSampleRateFailure();
                MethodCollector.m26664o(8223);
            }
        } else {
            this.f68437d.add(serverSampleRateCallback);
            if (this.f68435b == EnumC28968a.f68441b) {
                MethodCollector.m26664o(8223);
                return;
            }
            this.f68435b = EnumC28968a.f68441b;
            this.f68436c.fetchConfig(new C28960a("query($kitVersion: String!) {config(kitVersion: $kitVersion) {skateConfig{sampleRate}}}", new HashMap<String, Object>() {
                /* class com.snapchat.kit.sdk.core.config.C28965f.C289661 */

                static {
                    Covode.recordClassIndex(35152);
                }

                {
                    put("kitVersion", "1.12.0");
                }
            })).mo144268a(new AbstractC89743d<C28963d<C28961b>>() {
                /* class com.snapchat.kit.sdk.core.config.C28965f.C289672 */

                static {
                    Covode.recordClassIndex(35153);
                }

                @Override // p4640l.AbstractC89743d
                /* renamed from: a */
                public final void mo34286a(AbstractC89716b<C28963d<C28961b>> bVar, Throwable th) {
                    C28965f.this.mo50320a();
                }

                @Override // p4640l.AbstractC89743d
                /* renamed from: a */
                public final void mo34287a(AbstractC89716b<C28963d<C28961b>> bVar, C89781l<C28963d<C28961b>> lVar) {
                    if (lVar == null) {
                        C28965f.this.mo50320a();
                    } else if (!lVar.f203560a.mo144720a()) {
                        C28965f.this.mo50320a();
                    } else {
                        T t = lVar.f203561b;
                        if (t == null) {
                            C28965f.this.mo50320a();
                            return;
                        }
                        if (!(t.f68432a == null || t.f68432a.f68430a == null || t.f68432a.f68430a.f68431a == null || t.f68432a.f68430a.f68431a.f68433a == null)) {
                            Double d = t.f68432a.f68430a.f68431a.f68433a;
                            if (C28965f.m57978b(d.doubleValue())) {
                                C28965f.this.mo50321a(d.doubleValue());
                                return;
                            }
                        }
                        C28965f.this.mo50320a();
                    }
                }
            });
            MethodCollector.m26664o(8223);
        }
    }

    public C28965f(ConfigClient configClient, SharedPreferences sharedPreferences) {
        this.f68436c = configClient;
        this.f68434a = sharedPreferences;
    }
}
