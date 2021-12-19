package com.bytedance.geckox.p1017e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.p1603q.AbstractC21925a;

/* renamed from: com.bytedance.geckox.e.c */
public class C14912c extends AbstractC21925a<UpdatePackage, UpdatePackage> {
    static {
        Covode.recordClassIndex(17025);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21925a
    /* renamed from: a */
    public final /* synthetic */ String mo24022a(UpdatePackage updatePackage) {
        UpdatePackage updatePackage2 = updatePackage;
        if (updatePackage2.getIsZstd()) {
            return "branch_zstd";
        }
        int packageType = updatePackage2.getPackageType();
        if (packageType == 0) {
            return "branch_zip";
        }
        if (packageType == 1) {
            return "branch_single_file";
        }
        throw new RuntimeException("unknown file type: ".concat(String.valueOf(packageType)));
    }
}
