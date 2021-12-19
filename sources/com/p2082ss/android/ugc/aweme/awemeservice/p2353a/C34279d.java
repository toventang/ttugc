package com.p2082ss.android.ugc.aweme.awemeservice.p2353a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.p1998c.p2000b.AbstractC27264b;
import com.google.p1998c.p2000b.C27265c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80276bw;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.d */
public final class C34279d implements AbstractC34277b<String> {

    /* renamed from: a */
    private AbstractC27264b<String, Aweme> f81054a = new C27265c().mo45358a(100).mo45360a(new C34281e(this)).mo45363c();

    /* renamed from: b */
    private C80276bw f81055b;

    static {
        Covode.recordClassIndex(41220);
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: a */
    public final Collection<Aweme> mo60700a() {
        return this.f81054a.mo45355a().values();
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: b */
    public final void mo60702b() {
        try {
            C80313cs.m139234c(m70102a(C17867d.m33078a(), "awemeCache").getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C34279d() {
        try {
            File a = m70102a(C17867d.m33078a(), "awemeCache");
            if (a.exists()) {
                C80313cs.m139234c(a.getAbsolutePath());
            }
            this.f81055b = C80276bw.m139153a(a, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppVersionCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static File m70101a(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: b */
    private static File m70104b(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: c */
    private Aweme m70106c(String str) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Exception e;
        MethodCollector.m26663i(12124);
        C80276bw bwVar = this.f81055b;
        Aweme aweme = null;
        ObjectInputStream objectInputStream2 = null;
        if (bwVar == null) {
            MethodCollector.m26664o(12124);
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(bwVar.mo123669a(str).f179799a[0]);
            try {
                Aweme aweme2 = (Aweme) objectInputStream.readObject();
                C13609b.m24451a(objectInputStream);
                aweme = aweme2;
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    C13609b.m24451a(objectInputStream);
                    MethodCollector.m26664o(12124);
                    return aweme;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    C13609b.m24451a(objectInputStream2);
                    MethodCollector.m26664o(12124);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            objectInputStream = null;
            e.printStackTrace();
            C13609b.m24451a(objectInputStream);
            MethodCollector.m26664o(12124);
            return aweme;
        } catch (Throwable th3) {
            th = th3;
            C13609b.m24451a(objectInputStream2);
            MethodCollector.m26664o(12124);
            throw th;
        }
        MethodCollector.m26664o(12124);
        return aweme;
    }

    /* renamed from: d */
    private boolean m70107d(String str) {
        C80276bw bwVar = this.f81055b;
        boolean z = false;
        if (bwVar == null || bwVar.mo123674c()) {
            return false;
        }
        try {
            C80276bw.C80281c a = this.f81055b.mo123669a(str);
            if (a != null) {
                z = true;
                a.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Aweme mo60699a(String str) {
        Aweme aweme;
        try {
            aweme = this.f81054a.mo45354a(str, new CallableC34282f(this, str));
        } catch (Exception e) {
            e.printStackTrace();
            aweme = null;
        }
        if (aweme == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                String stackTraceString = Log.getStackTraceString(new Throwable());
                if (stackTraceString.length() > 4096) {
                    stackTraceString = stackTraceString.substring(0, 4096);
                }
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("aid", str);
                C34611o.m70668a("aweme_manager_get_aweme_is_null", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return aweme;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Aweme mo60704a(String str) {
        Aweme c = m70106c(str);
        if (c != null) {
            C80276bw bwVar = this.f81055b;
            if (bwVar != null) {
                try {
                    bwVar.mo123675c(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            mo60701a(str, c);
        }
        return c;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: b */
    public final /* synthetic */ boolean mo60703b(String str) {
        String str2 = str;
        boolean containsKey = this.f81054a.mo45355a().containsKey(str2);
        if (!containsKey) {
            return m70107d(str2);
        }
        return containsKey;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo60701a(String str, Aweme aweme) {
        this.f81054a.mo45356a(str, aweme);
    }

    /* renamed from: a */
    private static File m70102a(Context context, String str) {
        String str2;
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            str2 = m70101a(context).getPath();
        } else {
            str2 = m70104b(context).getPath();
        }
        return new File(str2 + File.separator + str);
    }

    /* renamed from: a */
    public final void mo60705a(String str, Aweme aweme) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(12123);
        C80276bw bwVar = this.f81055b;
        if (bwVar == null) {
            MethodCollector.m26664o(12123);
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            C80276bw.C80278a b = bwVar.mo123672b(str);
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(b.mo123680a(0));
            try {
                objectOutputStream2.writeObject(aweme);
                b.mo123681a();
                C13609b.m24451a(objectOutputStream2);
            } catch (Exception e2) {
                e = e2;
                objectOutputStream = objectOutputStream2;
                try {
                    e.printStackTrace();
                    C13609b.m24451a(objectOutputStream);
                    MethodCollector.m26664o(12123);
                } catch (Throwable th2) {
                    th = th2;
                    C13609b.m24451a(objectOutputStream);
                    MethodCollector.m26664o(12123);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = objectOutputStream2;
                C13609b.m24451a(objectOutputStream);
                MethodCollector.m26664o(12123);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            C13609b.m24451a(objectOutputStream);
            MethodCollector.m26664o(12123);
        }
        MethodCollector.m26664o(12123);
    }
}
