package com.bytedance.geckox.p1017e;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1015c.C14899d;
import com.bytedance.geckox.p1015c.C14900e;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.p1603q.AbstractC21945k;
import java.util.List;

/* renamed from: com.bytedance.geckox.e.o */
public class C14927o extends AbstractC21945k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: b */
    private int f36472b;

    static {
        Covode.recordClassIndex(17040);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.p1603q.AbstractC21945k
    /* renamed from: a */
    public final /* synthetic */ Pair<Uri, UpdatePackage> mo24026a() {
        IN in = this.f51936a;
        List<String> urlList = in.getPackage().getUrlList();
        int i = this.f36472b;
        this.f36472b = i + 1;
        return new Pair(Uri.parse(urlList.get(i)), in);
    }

    @Override // com.bytedance.p1603q.AbstractC21945k
    /* renamed from: a */
    public final boolean mo24027a(Throwable th) {
        if (!(th instanceof C14899d) && !(th instanceof C14900e)) {
            return false;
        }
        C14957a.m27542a();
        if (this.f36472b >= this.f51936a.getPackage().getUrlList().size()) {
            return false;
        }
        return true;
    }
}
