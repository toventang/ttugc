package com.bytedance.crash.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13819b;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.util.C14068q;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.crash.runtime.c */
public final class C14000c {

    /* renamed from: a */
    public final C14068q<CrashType, ICrashCallback> f34131a = new C14068q<>();

    /* renamed from: b */
    public final C14068q<CrashType, C13819b> f34132b = new C14068q<>();

    /* renamed from: c */
    public final List<IOOMCallback> f34133c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final List<IOOMCallback> f34134d = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(16065);
    }
}
