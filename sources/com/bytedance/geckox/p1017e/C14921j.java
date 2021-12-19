package com.bytedance.geckox.p1017e;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.buffer.impl.C14891a;
import com.bytedance.geckox.buffer.p1014a.C14889a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1015c.C14896a;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.geckox.utils.C15058i;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.j */
public class C14921j extends AbstractC21935d<Pair<AbstractC14888a, UpdatePackage>, Pair<AbstractC14888a, UpdatePackage>> {

    /* renamed from: a */
    private C14905e f36462a;

    static {
        Covode.recordClassIndex(17034);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        this.f36462a = (C14905e) objArr[0];
    }

    /* renamed from: a */
    public static File m27454a(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        String accessKey = updatePackage.getAccessKey();
        String str = C14930f.m27473a().f36475a.get(accessKey);
        if (TextUtils.isEmpty(str)) {
            C14957a.m27543a("can not find the accessKey path");
            return null;
        }
        File file = new File(str, accessKey + File.separator + updatePackage.getChannel());
        if (packageType == 0) {
            return new File(file, updatePackage.getLocalVersion() + File.separator + "res.zip");
        }
        if (packageType != 1) {
            C14957a.m27543a("unknown file type: ".concat(String.valueOf(packageType)));
            return null;
        }
        File file2 = new File(file, updatePackage.getLocalVersion() + File.separator + "res");
        File[] listFiles = file2.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            return listFiles[0];
        }
        C14957a.m27543a("can not found old full single file,:" + file2.getAbsolutePath());
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24020a(AbstractC21931b<Pair<AbstractC14888a, UpdatePackage>> bVar, Pair<AbstractC14888a, UpdatePackage> pair) {
        return m27455a(bVar, pair);
    }

    /* renamed from: a */
    private static Object m27455a(AbstractC21931b<Pair<AbstractC14888a, UpdatePackage>> bVar, Pair<AbstractC14888a, UpdatePackage> pair) {
        File file;
        C14957a.m27543a("start merge patch, channel:", ((UpdatePackage) pair.second).getChannel());
        AbstractC14888a aVar = (AbstractC14888a) pair.first;
        File f = aVar.mo23980f();
        aVar.mo23970a();
        aVar.mo23979e();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File a = m27454a(updatePackage);
        if (a != null) {
            int packageType = updatePackage.getPackageType();
            if (packageType == 0) {
                file = new File(f.getParentFile(), "res.zip");
            } else if (packageType == 1) {
                file = new File(f.getParentFile(), C14911b.m27429a(updatePackage, updatePackage.getFullPackage().getUrlList().get(0)));
            } else {
                throw new RuntimeException("unknown file type: ".concat(String.valueOf(packageType)));
            }
            C15052e.m27712a(file);
            try {
                BsPatch.m27693a(a, f, file.getParentFile(), file.getName());
                C15052e.m27712a(f);
                AbstractC14888a a2 = C14891a.m27370a(file, file.length());
                a2.mo23976b(0);
                try {
                    C15058i.m27725a(new C14889a(a2), updatePackage.getFullPackage().getMd5());
                    try {
                        return bVar.mo35692a(new Pair<>(a2, updatePackage));
                    } finally {
                        a2.mo23979e();
                    }
                } catch (Throwable th) {
                    throw new C14896a("check md5 failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th.getMessage(), th);
                }
            } catch (Exception e) {
                throw new RuntimeException("merge patch failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e.getMessage(), e);
            } catch (Throwable th2) {
                C15052e.m27712a(f);
                throw th2;
            }
        } else {
            throw new RuntimeException("get old file is null");
        }
    }
}
