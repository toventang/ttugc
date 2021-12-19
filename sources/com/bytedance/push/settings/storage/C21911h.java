package com.bytedance.push.settings.storage;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.AbstractC21896i;
import com.p2082ss.android.common.util.C29843f;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.storage.h */
public final class C21911h implements AbstractC21896i {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, AbstractC21912i> f51897a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, AbstractC21912i> f51898b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25575);
    }

    @Override // com.bytedance.push.settings.AbstractC21896i
    /* renamed from: a */
    public final AbstractC21912i mo35620a(Context context, boolean z, String str) {
        AbstractC21912i iVar;
        if (z) {
            ConcurrentHashMap<String, AbstractC21912i> concurrentHashMap = f51898b;
            AbstractC21912i iVar2 = concurrentHashMap.get(str);
            if (iVar2 != null) {
                return iVar2;
            }
            if (PushProvider.f51865c || C29843f.m60129a(context)) {
                iVar = new C21901c(context, str);
            } else {
                iVar = new C21903d(context, str);
            }
            concurrentHashMap.put(str, iVar);
            return iVar;
        }
        ConcurrentHashMap<String, AbstractC21912i> concurrentHashMap2 = f51897a;
        AbstractC21912i iVar3 = concurrentHashMap2.get(str);
        if (iVar3 != null) {
            return iVar3;
        }
        C21909g gVar = new C21909g(context, str);
        concurrentHashMap2.put(str, gVar);
        return gVar;
    }
}
