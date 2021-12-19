package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.e */
public class C18021e {

    /* renamed from: c */
    private static final long f42893c = TimeUnit.DAYS.toMillis(3);

    /* renamed from: d */
    private static final long f42894d = TimeUnit.DAYS.toMillis(14);

    /* renamed from: g */
    private static boolean f42895g = false;

    /* renamed from: a */
    public C27910f f42896a = new C27910f();

    /* renamed from: b */
    public SharedPreferences f42897b = C34822d.m71158a(C17867d.m33078a(), "awesome_splash", 0);

    /* renamed from: e */
    private volatile Map<String, Aweme> f42898e;

    /* renamed from: f */
    private long f42899f;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo28756c() {
        C1731i.m5640b(new CallableC18025f(this), C1731i.f5562a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo28758e() {
        SharedPreferences sharedPreferences = this.f42897b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("awesome_splash_filter_enable", false);
        }
        return false;
    }

    static {
        Covode.recordClassIndex(20647);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo28755b() {
        SharedPreferences sharedPreferences = this.f42897b;
        if (sharedPreferences != null && sharedPreferences.getBoolean("awesome_splash_preload_json", false)) {
            mo28754a();
        }
    }

    C18021e() {
        C17873f.m33099g().mo143062b(new AbstractC88986z<Boolean>() {
            /* class com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18021e.C180232 */

            static {
                Covode.recordClassIndex(20649);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88986z
            public final /* synthetic */ void onNext(Boolean bool) {
                if (bool.booleanValue() && C16048b.m29633a().mo25421a(true, "awesome_splash_del_when_background_enabled", false)) {
                    C18021e.this.mo28756c();
                }
            }
        });
    }

    /* renamed from: a */
    public final Map<String, Aweme> mo28754a() {
        MethodCollector.m26663i(1141);
        if (this.f42898e == null) {
            synchronized (C18021e.class) {
                try {
                    if (this.f42898e == null) {
                        this.f42898e = m33585g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1141);
                    throw th;
                }
            }
        }
        Map<String, Aweme> map = this.f42898e;
        MethodCollector.m26664o(1141);
        return map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Object mo28759f() {
        SharedPreferences sharedPreferences;
        if (this.f42899f == 0 && (sharedPreferences = this.f42897b) != null) {
            this.f42899f = sharedPreferences.getLong("awesome_splash_last_clean_time", 0);
        }
        long j = this.f42899f;
        if (j == 0 || System.currentTimeMillis() - j >= f42893c) {
            SharedPreferences sharedPreferences2 = this.f42897b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("awesome_splash_last_clean_time", System.currentTimeMillis()).apply();
            }
            m33582d(C17975i.m33467d());
            m33582d(C17975i.m33466c());
        }
        boolean z = false;
        if (mo28754a() == null || mo28754a().size() == 0) {
            mo28757d();
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : mo28754a().keySet()) {
            Aweme aweme = mo28754a().get(str);
            if (aweme != null) {
                if (C37699a.m76205H(aweme)) {
                    aweme.getAid();
                    if (m33584f(aweme.getAid())) {
                        m33578a(aweme.getAid(), C17975i.m33467d());
                        m33578a(aweme.getAid(), C17975i.m33466c());
                    }
                } else {
                    hashMap.put(str, aweme);
                }
            }
            z = true;
        }
        if (!z) {
            return null;
        }
        mo28754a().clear();
        mo28754a().putAll(hashMap);
        mo28757d();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r7.length() >= 3) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090 A[Catch:{ Exception -> 0x0120, OutOfMemoryError -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091 A[Catch:{ Exception -> 0x0120, OutOfMemoryError -> 0x00bc }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.p2082ss.android.ugc.aweme.feed.model.Aweme> m33585g() {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18021e.m33585g():java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo28757d() {
        String[] list;
        MethodCollector.m26663i(1391);
        String b = C17975i.m33463b();
        File file = new File(b + "awemeJson/");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(b + "awemeJson/awemes.json");
        try {
            if ((mo28754a() == null || mo28754a().size() == 0) && C16048b.m29633a().mo25421a(true, "clear_splash_data_optimize_enable_new", false)) {
                if (file2.exists()) {
                    m33579a(file2);
                }
                MethodCollector.m26664o(1391);
                return;
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(this.f42896a.mo46675b(mo28754a(), new C27895a<Map<String, Aweme>>() {
                /* class com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18021e.C180243 */

                static {
                    Covode.recordClassIndex(20650);
                }
            }.type));
            bufferedWriter.close();
            if (C17975i.f42810j && !TextUtils.isEmpty(C17975i.m33466c())) {
                String str = C17975i.m33466c() + "awemeJson/";
                File file3 = new File(str + "awemes.json");
                if (file3.exists()) {
                    m33579a(file3);
                }
                File file4 = new File(str);
                if (file4.exists()) {
                    m33579a(file4);
                }
                File file5 = new File(C17975i.m33466c());
                if (file5.isDirectory() && (list = file5.list()) != null && list.length == 0) {
                    m33579a(file5);
                }
            }
            MethodCollector.m26664o(1391);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            C51423a.m95791b(3, null, "AwesomeSplash OutOfMemoryError:" + e2.toString());
            C51423a.m95790a(e2);
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public final Aweme mo28753a(String str) {
        Aweme aweme = mo28754a().get(str);
        if (C37699a.m76205H(aweme)) {
            return null;
        }
        return aweme;
    }

    /* renamed from: b */
    public static void m33580b(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.exists() && file.isFile()) {
                    file.getName();
                    m33579a(file);
                }
            }
        }
    }

    /* renamed from: c */
    private static String m33581c(String str) {
        MethodCollector.m26663i(1201);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sb2 = sb.toString();
        MethodCollector.m26664o(1201);
        return sb2;
    }

    /* renamed from: d */
    private void m33582d(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.exists() && file.isFile() && System.currentTimeMillis() - file.lastModified() >= f42894d && !m33583e(file.getName())) {
                    file.getName();
                    m33579a(file);
                }
            }
        }
    }

    /* renamed from: e */
    private boolean m33583e(String str) {
        for (Map.Entry<String, Aweme> entry : mo28754a().entrySet()) {
            Aweme value = entry.getValue();
            if (value != null && TextUtils.equals(value.getAid(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m33584f(String str) {
        for (String str2 : mo28754a().keySet()) {
            Aweme aweme = mo28754a().get(str2);
            if (!(aweme == null || !TextUtils.equals(str, aweme.getAid()) || C37699a.m76205H(aweme))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m33579a(File file) {
        MethodCollector.m26663i(1195);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1195);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1195);
        return delete;
    }

    /* renamed from: a */
    private static void m33578a(String str, String str2) {
        File file = new File(str2 + str);
        if (file.exists() && file.isFile()) {
            m33579a(file);
        }
    }
}
