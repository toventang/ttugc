package com.bytedance.geckox.p1017e;

import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14871a;
import com.bytedance.geckox.C14873b;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.buffer.p1014a.C14889a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.geckox.utils.C15072q;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.bytedance.p1603q.p1604a.C21926a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* renamed from: com.bytedance.geckox.e.q */
public class C14929q extends AbstractC21935d<Pair<AbstractC14888a, UpdatePackage>, Pair<AbstractC14888a, UpdatePackage>> {
    static {
        Covode.recordClassIndex(17042);
    }

    /* renamed from: a */
    private static boolean m27471a(File file) {
        MethodCollector.m26663i(3170);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3170);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3170);
        return delete;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo24020a(AbstractC21931b<Pair<AbstractC14888a, UpdatePackage>> bVar, Pair<AbstractC14888a, UpdatePackage> pair) {
        MethodCollector.m26663i(2932);
        C14957a.m27543a("start unzip, channel:", ((UpdatePackage) pair.second).getChannel());
        AbstractC14888a aVar = (AbstractC14888a) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File parentFile = aVar.mo23980f().getParentFile();
        C21926a e = null;
        int i = 0;
        while (true) {
            try {
                File file = new File(parentFile, updatePackage.getChannel());
                if (file.exists()) {
                    C15052e.m27712a(file);
                }
                if (i < 2) {
                    try {
                        aVar.mo23976b(0);
                        C15072q.m27750a(new C14889a(aVar), parentFile.getAbsolutePath(), updatePackage.getChannel(), i);
                        aVar.mo23970a();
                        File file2 = new File(parentFile, "res");
                        C15052e.m27712a(file2);
                        if (new File(parentFile, updatePackage.getChannel()).renameTo(file2)) {
                            int i2 = C14871a.m27298a().f36328g;
                            if (i2 >= 2 || (i2 == 1 && updatePackage.getIsZstd())) {
                                m27471a(aVar.mo23980f());
                            }
                            if (updatePackage.getIsZstd()) {
                                HashMap hashMap = new HashMap();
                                C14873b.m27303a(file2, file2, hashMap);
                                File file3 = new File(file2.getParentFile(), "modify_time");
                                if (file3.exists()) {
                                    C14873b.m27305a(file3);
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                                try {
                                    objectOutputStream.writeObject(hashMap);
                                    fileOutputStream.close();
                                    objectOutputStream.close();
                                } catch (Throwable th) {
                                    fileOutputStream.close();
                                    objectOutputStream.close();
                                    MethodCollector.m26664o(2932);
                                    throw th;
                                }
                            }
                            Object a = bVar.mo35692a(pair);
                            MethodCollector.m26664o(2932);
                            return a;
                        }
                        RuntimeException runtimeException = new RuntimeException("rename file failed:" + parentFile.getAbsolutePath());
                        MethodCollector.m26664o(2932);
                        throw runtimeException;
                    } catch (C21926a e2) {
                        e = e2;
                        i++;
                    }
                } else {
                    C15052e.m27712a(parentFile);
                    MethodCollector.m26664o(2932);
                    throw e;
                }
            } catch (Exception e3) {
                RuntimeException runtimeException2 = new RuntimeException(C1764a.m5928a("unzip failed, channel:%s, pkg id:%d, msg:%s", new Object[]{updatePackage.getChannel(), Long.valueOf(updatePackage.getPackage().getId()), e3.getMessage()}), e3);
                MethodCollector.m26664o(2932);
                throw runtimeException2;
            }
        }
    }
}
