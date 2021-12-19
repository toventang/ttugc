package com.p2082ss.android.ugc.aweme.awemeservice.p2353a;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.common.utility.reflect.C13635a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.p1998c.p2000b.AbstractC27264b;
import com.google.p1998c.p2000b.C27265c;
import com.google.p1998c.p2000b.ConcurrentMapC27275g;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80276bw;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.Closeable;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.g */
public final class C34283g implements AbstractC34277b<String> {

    /* renamed from: a */
    AbstractC27264b<String, Aweme> f81061a = new C27265c().mo45359a(ConcurrentMapC27275g.EnumC27313p.WEAK).mo45358a(200).mo45360a(new C34286i(this)).mo45363c();

    /* renamed from: b */
    private AbstractC27264b<String, Aweme> f81062b = new C27265c().mo45358a(100).mo45360a(new C34285h(this)).mo45363c();

    /* renamed from: c */
    private C80276bw f81063c;

    /* renamed from: d */
    private Map<String, Object> f81064d;

    /* renamed from: e */
    private ExecutorService f81065e;

    static {
        Covode.recordClassIndex(41224);
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: a */
    public final Collection<Aweme> mo60700a() {
        return this.f81062b.mo45355a().values();
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: b */
    public final void mo60702b() {
        try {
            C80313cs.m139234c(m70118a(C17867d.m33078a(), "awemeCache").getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C34283g() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
        a.f95504b = "AwemeLruMemoryAndDiskCache";
        this.f81065e = C40780g.m82242a(a.mo70028a());
        try {
            File a2 = m70118a(C17867d.m33078a(), "awemeCache");
            if (a2.exists()) {
                C80313cs.m139234c(a2.getAbsolutePath());
            }
            C80276bw a3 = C80276bw.m139153a(a2, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppVersionCode());
            this.f81063c = a3;
            Map<String, Object> map = (Map) C13635a.m24534a(a3, "lruEntries");
            this.f81064d = map;
            if (map != null) {
                map.size();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static File m70117a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean mo60703b(String str) {
        try {
            if (this.f81062b.mo45353a(str) == null && this.f81061a.mo45353a(str) == null && !m70122d(str)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Aweme mo60699a(String str) {
        Aweme a = this.f81062b.mo45353a(str);
        if (a == null && (a = this.f81061a.mo45353a(str)) != null) {
            mo60701a(str, a);
            this.f81061a.mo45357b(str);
        }
        if (a == null) {
            a = m70120c(str);
            if (a != null) {
                mo60701a(str, a);
            }
            C51423a.m95784a(4, "AwemeLruCache", "get Aweme from diskCache， awemeId = ".concat(String.valueOf(str)));
        }
        if (a == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                String stackTraceString = Log.getStackTraceString(new Throwable());
                if (stackTraceString.length() > 4096) {
                    stackTraceString = stackTraceString.substring(0, 4096);
                }
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("aid", str);
                C34611o.m70668a("aweme_manager_get_aweme_is_null", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    /* renamed from: c */
    private Aweme m70120c(String str) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Exception e;
        MethodCollector.m26663i(6629);
        C80276bw bwVar = this.f81063c;
        Aweme aweme = null;
        ObjectInputStream objectInputStream2 = null;
        if (bwVar == null) {
            MethodCollector.m26664o(6629);
            return null;
        }
        try {
            C80276bw.C80281c a = bwVar.mo123669a(str);
            if (a == null) {
                C13609b.m24451a((Closeable) null);
                MethodCollector.m26664o(6629);
                return null;
            }
            objectInputStream = new ObjectInputStream(a.f179799a[0]);
            try {
                Aweme aweme2 = (Aweme) objectInputStream.readObject();
                C13609b.m24451a(objectInputStream);
                aweme = aweme2;
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    C13609b.m24451a(objectInputStream);
                    MethodCollector.m26664o(6629);
                    return aweme;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    C13609b.m24451a(objectInputStream2);
                    MethodCollector.m26664o(6629);
                    throw th;
                }
            }
            MethodCollector.m26664o(6629);
            return aweme;
        } catch (Exception e3) {
            e = e3;
            objectInputStream = null;
            e.printStackTrace();
            C13609b.m24451a(objectInputStream);
            MethodCollector.m26664o(6629);
            return aweme;
        } catch (Throwable th3) {
            th = th3;
            C13609b.m24451a(objectInputStream2);
            MethodCollector.m26664o(6629);
            throw th;
        }
    }

    /* renamed from: d */
    private boolean m70122d(String str) {
        Object obj;
        C80276bw bwVar = this.f81063c;
        boolean z = false;
        if (bwVar == null || bwVar.mo123674c()) {
            return false;
        }
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isContainsKeyWithLruEntries()) {
            Map<String, Object> map = this.f81064d;
            if (map == null || (obj = map.get(str)) == null) {
                return false;
            }
            return ((Boolean) C13635a.m24534a(obj, "readable")).booleanValue();
        }
        try {
            C80276bw.C80281c a = this.f81063c.mo123669a(str);
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
    /* renamed from: c */
    public void mo60701a(String str, Aweme aweme) {
        this.f81062b.mo45356a(str, aweme);
    }

    /* renamed from: a */
    private static File m70118a(Context context, String str) {
        return new File(m70117a(context).getPath() + File.separator + str);
    }

    /* renamed from: b */
    public final void mo60709b(String str, Aweme aweme) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(6478);
        C80276bw bwVar = this.f81063c;
        if (bwVar == null) {
            MethodCollector.m26664o(6478);
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
                    MethodCollector.m26664o(6478);
                } catch (Throwable th2) {
                    th = th2;
                    C13609b.m24451a(objectOutputStream);
                    MethodCollector.m26664o(6478);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = objectOutputStream2;
                C13609b.m24451a(objectOutputStream);
                MethodCollector.m26664o(6478);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            C13609b.m24451a(objectOutputStream);
            MethodCollector.m26664o(6478);
        }
        MethodCollector.m26664o(6478);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60708a(final String str, final Aweme aweme) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread() || C16048b.m29633a().mo25421a(true, "enable_async_put_aweme_disk_cache", true)) {
            this.f81065e.submit(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.awemeservice.p2353a.C34283g.RunnableC342841 */

                static {
                    Covode.recordClassIndex(41225);
                }

                public final void run() {
                    try {
                        C34283g.this.mo60709b(str, aweme);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            mo60709b(str, aweme);
        }
    }
}
