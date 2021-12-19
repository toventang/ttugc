package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.aweme.storage.AbstractC2368f;
import com.aweme.storage.AbstractC2369g;
import com.aweme.storage.C2367e;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.p1733u.C23435d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import java.io.File;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask */
public final class StorageTask implements AbstractC58264w {

    /* renamed from: a */
    public static volatile boolean f132956a;

    /* renamed from: b */
    public static final C58399a f132957b = new C58399a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask$a */
    public static final class C58399a {
        static {
            Covode.recordClassIndex(68618);
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$a */
        public static final class C58400a implements AbstractC2368f {
            static {
                Covode.recordClassIndex(68619);
            }

            C58400a() {
            }

            @Override // com.aweme.storage.AbstractC2368f
            /* renamed from: a */
            public final void mo6530a(String str, JSONObject jSONObject) {
                C12290b.m22064a(str, jSONObject);
            }

            @Override // com.aweme.storage.AbstractC2368f
            /* renamed from: b */
            public final void mo6531b(String str, JSONObject jSONObject) {
                C12290b.m22066a(str, (JSONObject) null, jSONObject, (JSONObject) null);
            }
        }

        private C58399a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$b */
        public static final class C58401b implements AbstractC2369g {

            /* renamed from: a */
            final /* synthetic */ Context f132958a;

            static {
                Covode.recordClassIndex(68620);
            }

            @Override // com.aweme.storage.AbstractC2369g
            /* renamed from: a */
            public final Set<String> mo6532a() {
                Set<String> b = C73955am.m130061b();
                C89219l.m154716b(b, "");
                return b;
            }

            @Override // com.aweme.storage.AbstractC2369g
            /* renamed from: b */
            public final boolean mo6534b() {
                if (C17873f.m33102j() == null) {
                    return true;
                }
                return false;
            }

            C58401b(Context context) {
                this.f132958a = context;
            }

            @Override // com.aweme.storage.AbstractC2369g
            /* renamed from: a */
            public final void mo6533a(boolean z) {
                Context context = this.f132958a;
                if (context != null) {
                    Context applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    C73955am.f166030a = false;
                    if (applicationContext != null && !C73955am.f166030a) {
                        int i = 1;
                        C73955am.f166030a = true;
                        if (z) {
                            C73955am.m130071d(applicationContext, 20);
                            C73955am.m130075e(applicationContext, 2);
                        }
                        C73955am.m130055a(applicationContext, 2);
                        C73955am.m130054a(2);
                        C73955am.m130062b(applicationContext, 2);
                        C73955am.m130068c(applicationContext, 2);
                        try {
                            File h = C73955am.m130078h(applicationContext);
                            try {
                                File a = C73955am.m130050a(applicationContext, "logs");
                                if (a != null && a.exists() && !TextUtils.equals(a.getAbsolutePath(), h.getAbsolutePath())) {
                                    C2367e.m7205b(a);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            File file = new File(C73955am.m130049a(applicationContext), "logs");
                            if (file.exists() && !TextUtils.equals(file.getAbsolutePath(), h.getAbsolutePath())) {
                                C2367e.m7205b(file);
                            }
                            File a2 = C23435d.m44109a(applicationContext);
                            if (a2 != null) {
                                File file2 = new File(a2, "logs");
                                if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), h.getAbsolutePath())) {
                                    C2367e.m7205b(file2);
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        File file3 = new File(C73955am.m130065c(), "fresco_cache");
                        File file4 = new File(C73955am.m130066c(applicationContext), "picture/fresco_cache");
                        if (file4.exists() && !TextUtils.equals(file4.getAbsolutePath(), file3.getAbsolutePath())) {
                            C2367e.m7205b(file4);
                        }
                        File file5 = new File(C73955am.m130060b(applicationContext), "picture/fresco_cache");
                        if (file5.exists() && !TextUtils.equals(file5.getAbsolutePath(), file3.getAbsolutePath())) {
                            C2367e.m7205b(file5);
                        }
                        File b = C23435d.m44116b(applicationContext);
                        if (b != null) {
                            File file6 = new File(b, "picture/fresco_cache");
                            if (file6.exists() && !TextUtils.equals(file6.getAbsolutePath(), file3.getAbsolutePath())) {
                                C2367e.m7205b(file6);
                            }
                        }
                        File e3 = C80937s.m140453b().mo124062a(AbstractC80918i.EnumC80919a.VideoCache).mo124023e();
                        if (e3 != null) {
                            File file7 = new File(C73955am.m130060b(applicationContext), "cache");
                            if (file7.exists() && !TextUtils.equals(file7.getAbsolutePath(), e3.getAbsolutePath())) {
                                C73955am.m130057a(C73955am.m130051a(file7, 0));
                            }
                            File file8 = new File(C73955am.m130066c(applicationContext), "cache");
                            if (file8.exists() && !TextUtils.equals(file8.getAbsolutePath(), e3.getAbsolutePath())) {
                                C73955am.m130057a(C73955am.m130051a(file8, 0));
                            }
                            File b2 = C23435d.m44116b(applicationContext);
                            if (b2 != null) {
                                File file9 = new File(b2, "cache");
                                if (file9.exists() && !TextUtils.equals(file9.getAbsolutePath(), e3.getAbsolutePath())) {
                                    C73955am.m130057a(C73955am.m130051a(file9, 0));
                                }
                            }
                        }
                        if (z) {
                            long a3 = C2367e.m7202a(C73955am.m130060b(applicationContext).getParent()) + C2367e.m7202a(C73955am.m130066c(applicationContext).getParent());
                            if (C2367e.m7207c(applicationContext)) {
                                C73955am.m130071d(applicationContext, 10);
                            }
                            while (C2367e.m7207c(applicationContext)) {
                                if (C2367e.m7207c(applicationContext)) {
                                    C73955am.m130055a(applicationContext, i);
                                }
                                if (C2367e.m7207c(applicationContext)) {
                                    C73955am.m130075e(applicationContext, i);
                                }
                                if (C2367e.m7207c(applicationContext)) {
                                    C73955am.m130054a(i);
                                }
                                if (C2367e.m7207c(applicationContext)) {
                                    C73955am.m130062b(applicationContext, i);
                                    C73955am.m130068c(applicationContext, i);
                                }
                                i--;
                                if (i < 0) {
                                    break;
                                }
                            }
                            long a4 = C2367e.m7202a(C73955am.m130060b(applicationContext).getParent()) + C2367e.m7202a(C73955am.m130066c(applicationContext).getParent());
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("size", a3 - a4);
                            } catch (JSONException e4) {
                                e4.printStackTrace();
                            }
                            C12290b.m22064a("deep_clean", jSONObject);
                        }
                        C73955am.f166030a = false;
                    }
                }
            }
        }

        public /* synthetic */ C58399a(byte b) {
            this();
        }

        /* renamed from: a */
        public static File m106610a(Context context) {
            if (C58016d.f132221b != null && C58016d.f132224e) {
                return C58016d.f132221b;
            }
            File cacheDir = context.getCacheDir();
            C58016d.f132221b = cacheDir;
            return cacheDir;
        }

        /* renamed from: b */
        public static File m106611b(Context context) {
            if (C58016d.f132222c != null && C58016d.f132224e) {
                return C58016d.f132222c;
            }
            File filesDir = context.getFilesDir();
            C58016d.f132222c = filesDir;
            return filesDir;
        }

        /* renamed from: c */
        public static File m106612c(Context context) {
            if (C58016d.f132220a != null && C58016d.f132224e) {
                return C58016d.f132220a;
            }
            File externalCacheDir = context.getExternalCacheDir();
            C58016d.f132220a = externalCacheDir;
            return externalCacheDir;
        }

        /* renamed from: d */
        public static File m106613d(Context context) {
            if (!TextUtils.isEmpty(null)) {
                return context.getExternalFilesDir(null);
            }
            if (C58016d.f132223d != null && C58016d.f132224e) {
                return C58016d.f132223d;
            }
            File externalFilesDir = context.getExternalFilesDir(null);
            C58016d.f132223d = externalFilesDir;
            return externalFilesDir;
        }
    }

    static {
        Covode.recordClassIndex(68617);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:6|(2:8|(1:10))|11|(2:13|(1:15))|16|(2:18|(1:20))|21|22|(3:28|(1:30)(1:37)|31)|32|(3:39|(1:41)(1:48)|42)|43|(3:50|(1:52)(1:54)|53)|55|56|(1:60)|61|(1:65)|66|67|(1:69)|70|72|73|76|(5:78|(1:90)(1:82)|83|(1:89)(1:87)|88)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0279 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x02d8 */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02e8 A[Catch:{ Exception -> 0x02fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0323  */
    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28600a(android.content.Context r17) {
        /*
        // Method dump skipped, instructions count: 923
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.StorageTask.mo28600a(android.content.Context):void");
    }
}
