package com.p2082ss.android.common.applog.p2128a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.common.applog.a.b */
public final class C29767b extends AbstractC29766a {
    static {
        Covode.recordClassIndex(36172);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.common.applog.p2128a.AbstractC29766a
    /* renamed from: a */
    public final boolean mo52031a(String str) {
        return this.f70982a.contains(str);
    }

    public C29767b(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        super(hashSet, hashMap);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.common.applog.p2128a.AbstractC29766a
    /* renamed from: a */
    public final boolean mo52033a(HashSet<String> hashSet, String str) {
        return hashSet.contains(str);
    }
}
