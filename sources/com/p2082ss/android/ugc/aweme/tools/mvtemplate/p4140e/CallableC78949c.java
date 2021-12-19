package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2477ci.C36080a;
import com.p2082ss.android.ugc.aweme.photo.PhotoContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.e.c */
public final /* synthetic */ class CallableC78949c implements Callable {

    /* renamed from: a */
    private final List f177443a;

    static {
        Covode.recordClassIndex(92098);
    }

    public CallableC78949c(List list) {
        this.f177443a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<String> list = this.f177443a;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int[] a = C36080a.m73536a(str);
            if (a != null) {
                arrayList.add(PhotoContext.fromUpload(str, a[0], a[1]));
            }
        }
        return arrayList;
    }
}
