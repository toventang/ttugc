package com.bytedance.geckox.p1017e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.p1603q.AbstractC21944j;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.geckox.e.d */
public class C14913d extends AbstractC21944j<UpdatePackage, UpdatePackage> {
    static {
        Covode.recordClassIndex(17026);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21944j
    /* renamed from: a */
    public final /* synthetic */ String mo24023a(UpdatePackage updatePackage) {
        File a;
        UpdatePackage updatePackage2 = updatePackage;
        UpdatePackage.Package patch = updatePackage2.getPatch();
        if (patch == null) {
            C14957a.m27543a("no patch, start full update, channel:", updatePackage2.toString());
            return "full";
        }
        List<String> urlList = patch.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            C14957a.m27543a("patch url error, start full update, channel:", updatePackage2.toString());
            return "full";
        } else if (updatePackage2.getIsZstd() || ((a = C14921j.m27454a(updatePackage2)) != null && a.exists())) {
            updatePackage2.setUpdateWithPatch(true);
            C14957a.m27543a("start patch update, channel:", updatePackage2.toString());
            return "patch";
        } else {
            C14957a.m27543a("old file is null, start full update, channel:", updatePackage2.toString());
            updatePackage2.setNotUsePatchReason(3);
            return "full";
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable, java.lang.String] */
    @Override // com.bytedance.p1603q.AbstractC21944j
    /* renamed from: a */
    public final /* synthetic */ String mo24024a(UpdatePackage updatePackage, Throwable th, String str) {
        UpdatePackage updatePackage2 = updatePackage;
        if ("patch".equals(str)) {
            updatePackage2.setUpdateWithPatch(false);
            C14957a.m27543a("start full update", updatePackage2.toString());
            return "full";
        }
        throw new RuntimeException("full update failed, caused by:" + th.getMessage(), th);
    }
}
