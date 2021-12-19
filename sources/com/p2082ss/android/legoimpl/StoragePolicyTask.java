package com.p2082ss.android.legoimpl;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p961e.C14441a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1746v.AbstractC23538b;
import com.bytedance.p1746v.p1747a.C23535b;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.storagehandler.StorageFilter;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.C58079a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40384h;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.legoimpl.StoragePolicyTask */
public final class StoragePolicyTask implements AbstractC58264w {

    /* renamed from: a */
    public final String f71457a = "StoragePolicy";

    /* renamed from: com.ss.android.legoimpl.StoragePolicyTask$DownloadApi */
    public interface DownloadApi {
        static {
            Covode.recordClassIndex(36387);
        }

        @AbstractC22000h
        @AbstractC21991ae
        AbstractC21983b<TypedInput> get(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list, @AbstractC21987aa Map<String, String> map);
    }

    /* renamed from: com.ss.android.legoimpl.StoragePolicyTask$StoragePoster */
    public interface StoragePoster {
        static {
            Covode.recordClassIndex(36388);
        }

        @AbstractC22012t
        AbstractFutureC27655q<String> doPost(@AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput, @AbstractC22007o int i, @AbstractC22004l List<C22027b> list);
    }

    static {
        Covode.recordClassIndex(36386);
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
        return EnumC58151ae.BACKGROUND;
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

    /* renamed from: com.ss.android.legoimpl.StoragePolicyTask$b */
    static final class C29961b implements AbstractC16082i {

        /* renamed from: a */
        final /* synthetic */ StoragePolicyTask f71460a;

        /* renamed from: b */
        final /* synthetic */ Context f71461b;

        static {
            Covode.recordClassIndex(36390);
        }

        C29961b(StoragePolicyTask storagePolicyTask, Context context) {
            this.f71460a = storagePolicyTask;
            this.f71461b = context;
        }

        @Override // com.bytedance.ies.abmock.AbstractC16082i
        /* renamed from: a */
        public final void mo25536a() {
            if (this.f71461b != null) {
                C1731i.m5640b(new CallableC29962a(this), C40780g.m82246c());
            }
        }

        /* renamed from: com.ss.android.legoimpl.StoragePolicyTask$b$a */
        static final class CallableC29962a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C29961b f71462a;

            static {
                Covode.recordClassIndex(36391);
            }

            CallableC29962a(C29961b bVar) {
                this.f71462a = bVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                MethodCollector.m26663i(3945);
                StoragePolicyTask storagePolicyTask = this.f71462a.f71460a;
                Context context = this.f71462a.f71461b;
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_holder_key", C40353e.C40356c.class, AbstractC40384h.f94575a);
                if (!StoragePolicyTask.m60476c() && C58079a.f132320a.mo95584a(86400000) && cVar != null && cVar.f94539a) {
                    C14441a.m26370a().mo23272a(200);
                    StorageFilter.init(".*" + context.getPackageName().replaceAll("\\.", "\\\\.") + ".*/lib/.*\\.so$");
                    StorageFilter.m42816a(new C29960a(storagePolicyTask, context));
                }
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(3945);
                return zVar;
            }
        }
    }

    /* renamed from: c */
    static boolean m60476c() {
        List a;
        try {
            if (Build.VERSION.SDK_INT == 18) {
                return true;
            }
            if (Build.VERSION.SDK_INT < 21) {
                a = C89070n.m154516a(Build.CPU_ABI);
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                C89219l.m154716b(strArr, "");
                a = C89064i.m154463a(strArr);
            }
            if (a.contains("x86") || a.contains("x86_64")) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: com.ss.android.legoimpl.StoragePolicyTask$a */
    public static final class C29960a implements AbstractC23538b {

        /* renamed from: a */
        final /* synthetic */ StoragePolicyTask f71458a;

        /* renamed from: b */
        final /* synthetic */ Context f71459b;

        static {
            Covode.recordClassIndex(36389);
        }

        @Override // com.bytedance.p1746v.AbstractC23538b
        /* renamed from: a */
        public final boolean mo38340a(String str) {
            return StoragePolicyTask.m60475a(this.f71459b, str, null);
        }

        C29960a(StoragePolicyTask storagePolicyTask, Context context) {
            this.f71458a = storagePolicyTask;
            this.f71459b = context;
        }

        @Override // com.bytedance.p1746v.AbstractC23538b
        /* renamed from: a */
        public final boolean mo38341a(String str, String str2) {
            return StoragePolicyTask.m60475a(this.f71459b, str, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r7.substring(r1.length()) == null) goto L_0x002b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
            r2 = com.bytedance.p1746v.p1747a.C23535b.f55752g.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (r2.hasNext() == false) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
            r1 = r2.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
            if (r7.startsWith(r1) == false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
            if (r7.substring(r1.length()) == null) goto L_0x005b;
         */
        @Override // com.bytedance.p1746v.AbstractC23538b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38339a(java.lang.String r7, java.lang.String r8, com.bytedance.p1746v.AbstractC23538b.EnumC23539a r9, boolean r10) {
            /*
            // Method dump skipped, instructions count: 213
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.legoimpl.StoragePolicyTask.C29960a.mo38339a(java.lang.String, java.lang.String, com.bytedance.v.b$a, boolean):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (context != null) {
            C23535b.m44234a(context);
        }
        C58079a.f132320a.mo95582a();
        SettingsManager.m29616a().mo25399a(new C29961b(this, context));
    }

    /* renamed from: a */
    public static boolean m60475a(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        if (!(context.getPackageName() == null || str == null)) {
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_holder_key", C40353e.C40356c.class, AbstractC40384h.f94575a);
                if (C40353e.m81545a(str, cVar)) {
                    C40353e.m81541a(new File(str), new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar), str2);
                }
                if (C40353e.m81549c(str, cVar)) {
                    C40353e.m81541a(new File(str), new RuntimeException(), "exception_handle", C40353e.m81542a(cVar), str2);
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }
}
