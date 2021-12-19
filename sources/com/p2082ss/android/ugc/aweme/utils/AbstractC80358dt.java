package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import p4600h.C89379q;
import p4600h.p4603c.AbstractC89124d;

/* renamed from: com.ss.android.ugc.aweme.utils.dt */
public abstract class AbstractC80358dt<T> implements AbstractC89124d<T> {
    static {
        Covode.recordClassIndex(93626);
    }

    /* renamed from: a */
    public abstract void mo122402a(T t);

    /* renamed from: a */
    public abstract void mo122403a(Throwable th);

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4600h.p4603c.AbstractC89124d
    public void resumeWith(Object obj) {
        Throwable r1 = C89379q.m157071exceptionOrNullimpl(obj);
        if (r1 == null) {
            mo122402a(obj);
        } else {
            mo122403a(r1);
        }
    }
}
