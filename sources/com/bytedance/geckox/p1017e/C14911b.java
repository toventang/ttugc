package com.bytedance.geckox.p1017e;

import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14871a;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.buffer.impl.C14891a;
import com.bytedance.geckox.buffer.p1014a.C14889a;
import com.bytedance.geckox.buffer.p1014a.C14890b;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1015c.C14899d;
import com.bytedance.geckox.p1015c.C14900e;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.utils.C15044a;
import com.bytedance.geckox.utils.C15058i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.b */
public class C14911b extends AbstractC21935d<Pair<Uri, UpdatePackage>, Pair<AbstractC14888a, UpdatePackage>> {

    /* renamed from: a */
    private C14905e f36439a;

    /* renamed from: b */
    private AbstractC14933a f36440b;

    static {
        Covode.recordClassIndex(17024);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        this.f36439a = (C14905e) objArr[0];
        this.f36440b = (AbstractC14933a) objArr[1];
    }

    /* renamed from: a */
    public static File m27427a(UpdatePackage updatePackage) {
        String accessKey = updatePackage.getAccessKey();
        String str = C14930f.m27473a().f36475a.get(accessKey);
        if (!TextUtils.isEmpty(str)) {
            return new File(str, accessKey + File.separator + updatePackage.getChannel() + File.separator + updatePackage.getVersion() + "--updating");
        }
        throw new C14899d("can not find the accessKey path", null);
    }

    /* renamed from: a */
    private static boolean m27430a(File file) {
        MethodCollector.m26663i(3873);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3873);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3873);
        return delete;
    }

    /* renamed from: a */
    public static String m27429a(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                if (!TextUtils.isEmpty(substring)) {
                    return "res" + File.separator + substring;
                }
                throw new RuntimeException("url path illegal, url:".concat(String.valueOf(str)));
            }
            throw new RuntimeException("url path illegal, url:".concat(String.valueOf(str)));
        }
        throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo24020a(AbstractC21931b<Pair<AbstractC14888a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) {
        int i;
        String str;
        Throwable th;
        C14890b bVar2;
        long j;
        C14890b bVar3;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        if (updatePackage.getUpdateWithPatch()) {
            i = C14871a.m27298a().f36327f;
        } else {
            i = C14871a.m27298a().f36326e;
        }
        if (i <= 0 || ((float) i) <= C15044a.m27702a()) {
            C14957a.m27543a("start download channel:", updatePackage.getChannel(), "pid:" + Process.myPid() + ",thread id:" + Thread.currentThread().getId());
            UpdatePackage.Package r6 = updatePackage.getPackage();
            long length = r6.getLength();
            File a = m27427a(updatePackage);
            a.mkdirs();
            if (updatePackage.getUpdateWithPatch()) {
                str = "patch.tmp";
            } else if (updatePackage.getIsZstd()) {
                str = "res.zst";
            } else {
                int packageType = updatePackage.getPackageType();
                if (packageType == 0) {
                    str = "res.zip";
                } else if (packageType == 1) {
                    str = m27429a(updatePackage, uri);
                } else {
                    throw new RuntimeException("unknown file type: ".concat(String.valueOf(packageType)));
                }
            }
            AbstractC14888a a2 = C14891a.m27370a(new File(a, str), length);
            try {
                bVar2 = bVar3;
                j = 0;
                try {
                    bVar3 = new C14890b(a2, this.f36440b, updatePackage, length);
                    try {
                        this.f36439a.f36406e.mo24082a(uri, bVar2);
                        a2.mo23976b(0);
                        try {
                            C15058i.m27725a(new C14889a(a2), r6.getMd5());
                            try {
                                return bVar.mo35692a(new Pair<>(a2, updatePackage));
                            } finally {
                                try {
                                    a2.mo23979e();
                                } catch (Exception unused) {
                                    C14957a.m27542a();
                                }
                            }
                        } catch (Throwable th2) {
                            m27430a(a2.mo23980f());
                            throw new C14900e(th2.getMessage(), th2);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (bVar2 != null && bVar2.f36368c > j && bVar2.f36368c < bVar2.f36367b) {
                            C15035c.m27678a(2, 21, C1764a.m5928a("download interrupt, ak:%s, channel:%s", new Object[]{bVar2.f36366a.getAccessKey(), bVar2.f36366a.getChannel()}), C1764a.m5928a("pkg_id:%d, currentSize:%d, percent:%d", new Object[]{Long.valueOf(bVar2.f36366a.getPackage().getId()), Long.valueOf(bVar2.f36368c), Integer.valueOf((int) ((bVar2.f36368c * 100) / bVar2.f36367b))}));
                        }
                        a2.mo23979e();
                        m27430a(a2.mo23980f());
                        throw new C14899d(th.getMessage(), th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bVar2 = null;
                    C15035c.m27678a(2, 21, C1764a.m5928a("download interrupt, ak:%s, channel:%s", new Object[]{bVar2.f36366a.getAccessKey(), bVar2.f36366a.getChannel()}), C1764a.m5928a("pkg_id:%d, currentSize:%d, percent:%d", new Object[]{Long.valueOf(bVar2.f36366a.getPackage().getId()), Long.valueOf(bVar2.f36368c), Integer.valueOf((int) ((bVar2.f36368c * 100) / bVar2.f36367b))}));
                    a2.mo23979e();
                    m27430a(a2.mo23980f());
                    throw new C14899d(th.getMessage(), th);
                }
            } catch (Throwable th5) {
                th = th5;
                j = 0;
                bVar2 = null;
                C15035c.m27678a(2, 21, C1764a.m5928a("download interrupt, ak:%s, channel:%s", new Object[]{bVar2.f36366a.getAccessKey(), bVar2.f36366a.getChannel()}), C1764a.m5928a("pkg_id:%d, currentSize:%d, percent:%d", new Object[]{Long.valueOf(bVar2.f36366a.getPackage().getId()), Long.valueOf(bVar2.f36368c), Integer.valueOf((int) ((bVar2.f36368c * 100) / bVar2.f36367b))}));
                a2.mo23979e();
                m27430a(a2.mo23980f());
                throw new C14899d(th.getMessage(), th);
            }
        } else {
            throw new C14899d("cancel download, not available storage:", null);
        }
    }
}
