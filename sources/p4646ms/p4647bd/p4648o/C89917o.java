package p4646ms.p4647bd.p4648o;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p4646ms.p4647bd.p4648o.C89910n;

/* renamed from: ms.bd.o.o */
public class C89917o {

    /* renamed from: a */
    protected final Set<String> f203796a = new HashSet();

    /* renamed from: b */
    protected final C89910n.AbstractC89912b f203797b;

    /* renamed from: c */
    protected final C89910n.AbstractC89911a f203798c;

    /* renamed from: d */
    protected boolean f203799d;

    /* renamed from: e */
    protected boolean f203800e;

    /* renamed from: ms.bd.o.o$a */
    class RunnableC89918a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f203801a;

        /* renamed from: b */
        final /* synthetic */ String f203802b;

        /* renamed from: c */
        final /* synthetic */ String f203803c;

        /* renamed from: d */
        final /* synthetic */ C89917o f203804d;

        static {
            Covode.recordClassIndex(106015);
        }

        public void run() {
            try {
                this.f203804d.m156018a(this.f203801a, this.f203802b, this.f203803c);
                throw null;
            } catch (UnsatisfiedLinkError unused) {
                throw null;
            } catch (C89907m unused2) {
                throw null;
            }
        }
    }

    static {
        Covode.recordClassIndex(106014);
    }

    /* renamed from: a */
    public static void m156019a(String str, Object... objArr) {
        C1764a.m5929a(Locale.US, str, objArr);
    }

    protected C89917o() {
        C89924q qVar = new C89924q();
        C89903l lVar = new C89903l();
        this.f203797b = qVar;
        this.f203798c = lVar;
    }

    /* renamed from: a */
    private static boolean m156021a(File file) {
        MethodCollector.m26663i(3353);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3353);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3353);
        return delete;
    }

    /* renamed from: a */
    public final void mo144461a(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C89910n.m156008a(str)) {
            C1764a.m5929a(Locale.US, "Beginning load of %s...", new Object[]{str});
            m156018a(context, str, null);
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    /* renamed from: b */
    private static File m156022b(Context context, String str, String str2) {
        String a = C89924q.m156034a(str);
        if (C89910n.m156008a(str2)) {
            return new File(context.getDir("lib", 0), a);
        }
        return new File(context.getDir("lib", 0), a + "." + str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v5, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r1 = new p4646ms.p4647bd.p4648o.C89948w(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r0 = r1.mo144474a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b5, code lost:
        r1.close();
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c0, code lost:
        if (r3.hasNext() != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c2, code lost:
        r2 = r3.next();
        mo144461a(r20, r2.substring(3, r2.length() - 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r10.length > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01a8 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ac A[SYNTHETIC, Splitter:B:108:0x01ac] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m156018a(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 520
        */
        throw new UnsupportedOperationException("Method not decompiled: p4646ms.p4647bd.p4648o.C89917o.m156018a(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
