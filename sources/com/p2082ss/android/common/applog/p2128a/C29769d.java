package com.p2082ss.android.common.applog.p2128a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.common.applog.a.d */
public class C29769d extends AbstractC29766a {
    static {
        Covode.recordClassIndex(36174);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.common.applog.p2128a.AbstractC29766a
    /* renamed from: a */
    public final boolean mo52031a(String str) {
        if (!this.f70982a.contains(str)) {
            return true;
        }
        return false;
    }

    protected C29769d(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        super(hashSet, hashMap);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.common.applog.p2128a.AbstractC29766a
    /* renamed from: a */
    public final boolean mo52033a(HashSet<String> hashSet, String str) {
        if (!hashSet.contains(str)) {
            return true;
        }
        return false;
    }
}
