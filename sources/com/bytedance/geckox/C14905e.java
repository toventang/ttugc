package com.bytedance.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.p1012b.p1013a.C14877a;
import com.bytedance.geckox.p1024k.AbstractC14965c;
import com.bytedance.geckox.p1024k.C14963a;
import com.bytedance.geckox.policy.p1029c.ExecutorC14982a;
import com.bytedance.geckox.statistic.AbstractC15017a;
import com.bytedance.geckox.utils.C15044a;
import com.bytedance.geckox.utils.C15068o;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.geckox.e */
public class C14905e {

    /* renamed from: a */
    public final Context f36402a;

    /* renamed from: b */
    public final Executor f36403b;

    /* renamed from: c */
    public final Executor f36404c;

    /* renamed from: d */
    public final AbstractC15017a f36405d;

    /* renamed from: e */
    public AbstractC14965c f36406e;

    /* renamed from: f */
    public final List<String> f36407f;

    /* renamed from: g */
    public final List<String> f36408g;

    /* renamed from: h */
    public final C14877a f36409h;

    /* renamed from: i */
    public Long f36410i;

    /* renamed from: j */
    public final String f36411j;

    /* renamed from: k */
    public String f36412k;

    /* renamed from: l */
    public final String f36413l;

    /* renamed from: m */
    public final String f36414m;

    /* renamed from: n */
    public final String f36415n;

    /* renamed from: o */
    public final File f36416o;

    /* renamed from: p */
    public final boolean f36417p;

    /* renamed from: q */
    public final boolean f36418q;

    static {
        Covode.recordClassIndex(17018);
    }

    /* renamed from: com.bytedance.geckox.e$a */
    public static class C14906a {

        /* renamed from: a */
        public AbstractC14965c f36419a;

        /* renamed from: b */
        public List<String> f36420b;

        /* renamed from: c */
        public List<String> f36421c;

        /* renamed from: d */
        public Context f36422d;

        /* renamed from: e */
        public Executor f36423e;

        /* renamed from: f */
        public AbstractC15017a f36424f;

        /* renamed from: g */
        public C14877a f36425g;

        /* renamed from: h */
        public Long f36426h;

        /* renamed from: i */
        public String f36427i;

        /* renamed from: j */
        public String f36428j;

        /* renamed from: k */
        public String f36429k;

        /* renamed from: l */
        public File f36430l;

        /* renamed from: m */
        public String f36431m;

        /* renamed from: n */
        public String f36432n;

        /* renamed from: o */
        public boolean f36433o;

        /* renamed from: p */
        public boolean f36434p;

        static {
            Covode.recordClassIndex(17019);
        }

        /* renamed from: a */
        public final C14906a mo24004a() {
            return this;
        }

        /* renamed from: b */
        public final C14905e mo24015b() {
            return new C14905e(this, (byte) 0);
        }

        /* renamed from: b */
        public final C14906a mo24013b(String str) {
            this.f36428j = str;
            return this;
        }

        /* renamed from: c */
        public final C14906a mo24016c(String str) {
            this.f36429k = str;
            return this;
        }

        /* renamed from: d */
        public final C14906a mo24017d(String str) {
            this.f36431m = str;
            return this;
        }

        /* renamed from: a */
        public final C14906a mo24005a(long j) {
            this.f36426h = Long.valueOf(j);
            return this;
        }

        /* renamed from: b */
        public final C14906a mo24014b(String... strArr) {
            this.f36420b = Arrays.asList(strArr);
            return this;
        }

        /* renamed from: a */
        public final C14906a mo24006a(C14877a aVar) {
            this.f36425g = aVar;
            return this;
        }

        public C14906a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f36422d = applicationContext;
        }

        /* renamed from: a */
        public final C14906a mo24007a(AbstractC14965c cVar) {
            this.f36419a = cVar;
            return this;
        }

        /* renamed from: a */
        public final C14906a mo24008a(AbstractC15017a aVar) {
            this.f36424f = aVar;
            return this;
        }

        /* renamed from: a */
        public final C14906a mo24009a(File file) {
            this.f36430l = file;
            return this;
        }

        /* renamed from: a */
        public final C14906a mo24010a(String str) {
            this.f36427i = str;
            return this;
        }

        /* renamed from: a */
        public final C14906a mo24011a(boolean z) {
            this.f36433o = z;
            return this;
        }

        /* renamed from: a */
        public final C14906a mo24012a(String... strArr) {
            if (strArr != null && strArr.length > 0) {
                this.f36421c = Arrays.asList(strArr);
            }
            return this;
        }
    }

    /* renamed from: a */
    public final String mo24003a() {
        return this.f36407f.get(0);
    }

    private C14905e(C14906a aVar) {
        Context context = aVar.f36422d;
        this.f36402a = context;
        if (context != null) {
            List<String> list = aVar.f36420b;
            this.f36407f = list;
            List<String> list2 = aVar.f36421c;
            this.f36408g = list2;
            this.f36409h = aVar.f36425g;
            this.f36410i = aVar.f36426h;
            if (TextUtils.isEmpty(aVar.f36427i)) {
                this.f36411j = C15044a.m27704a(context);
            } else {
                this.f36411j = aVar.f36427i;
            }
            this.f36412k = aVar.f36428j;
            this.f36414m = aVar.f36431m;
            this.f36415n = aVar.f36432n;
            if (aVar.f36430l == null) {
                if (C58016d.f132222c == null || !C58016d.f132224e) {
                    C58016d.f132222c = context.getFilesDir();
                }
                this.f36416o = new File(C58016d.f132222c, "gecko_offline_res_x");
            } else {
                this.f36416o = aVar.f36430l;
            }
            String str = aVar.f36429k;
            this.f36413l = str;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("host is null");
            } else if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("accessKey is empty");
            } else if (list2 == null || list2.isEmpty()) {
                throw new IllegalArgumentException("local accessKey is empty");
            } else if (!list2.containsAll(list)) {
                throw new IllegalArgumentException("local accessKey must contain accessKey");
            } else if (this.f36410i == null) {
                throw new IllegalArgumentException("appId is null");
            } else if (!TextUtils.isEmpty(this.f36412k)) {
                C15068o a = C15068o.m27745a();
                if (a.f36788a == null) {
                    a.f36788a = new ExecutorC14982a();
                }
                this.f36403b = a.f36788a;
                if (aVar.f36423e == null) {
                    this.f36404c = C15068o.m27746a(new ThreadFactory() {
                        /* class com.bytedance.geckox.utils.C15068o.ThreadFactoryC150702 */

                        static {
                            Covode.recordClassIndex(17238);
                        }

                        public final Thread newThread(Runnable runnable) {
                            MethodCollector.m26663i(3625);
                            Thread thread = new Thread(runnable);
                            thread.setName("gecko-check-update-thread");
                            thread.setPriority(3);
                            MethodCollector.m26664o(3625);
                            return thread;
                        }
                    });
                } else {
                    this.f36404c = aVar.f36423e;
                }
                if (aVar.f36419a == null) {
                    this.f36406e = new C14963a();
                } else {
                    this.f36406e = aVar.f36419a;
                }
                this.f36405d = aVar.f36424f;
                this.f36417p = aVar.f36433o;
                this.f36418q = aVar.f36434p;
            } else {
                throw new IllegalArgumentException("deviceId key empty");
            }
        } else {
            throw new IllegalArgumentException("context == null");
        }
    }

    /* synthetic */ C14905e(C14906a aVar, byte b) {
        this(aVar);
    }
}
