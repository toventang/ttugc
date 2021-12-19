package com.p2082ss.android.ugc.aweme.user.p4197d;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.user.d.b */
public final /* synthetic */ class CallableC80059b implements Callable {

    /* renamed from: a */
    static final Callable f179399a = new CallableC80059b();

    static {
        Covode.recordClassIndex(93290);
    }

    private CallableC80059b() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<ContactModelV2> a = C80241be.m139077a(C17867d.m33078a(), null, false);
        if (C13603b.m24435a((Collection) a)) {
            return null;
        }
        return UploadContactsApi.m95880a(a, null, 1, 1);
    }
}
