package com.bytedance.android.livesdk.p452ao;

import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p450an.C6801d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ao.b */
public class C6805b<T> extends C6800c<T> {
    static {
        Covode.recordClassIndex(7543);
    }

    /* renamed from: b */
    public final T mo13068b() {
        return (T) super.mo13066a();
    }

    @Override // com.bytedance.android.livesdk.p450an.C6800c
    /* renamed from: a */
    public final T mo13066a() {
        T t = (T) C6806c.m14601a(this);
        if (t != null) {
            return t;
        }
        T t2 = (T) C6801d.m14589a(this);
        C6806c.m14603a(this, t2);
        return t2;
    }

    @Override // com.bytedance.android.livesdk.p450an.C6800c
    /* renamed from: a */
    public final void mo13067a(T t) {
        C6806c.m14603a(this, t);
    }

    /* renamed from: b */
    public final void mo13069b(T t) {
        super.mo13067a(t);
    }

    public C6805b(String str, Class<T> cls) {
        super(str, (Class) cls);
    }

    public C6805b(String str, T t) {
        super(str, (Object) t);
    }

    public C6805b(String str, String str2, T t) {
        super(str, str2, t);
    }
}
