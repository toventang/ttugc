package com.bytedance.analytics.p124a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.analytics.a.d */
public final class C2584d implements Serializable, Cloneable {
    public static final C2585a Companion = new C2585a((byte) 0);
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final WeakReference<View> f7797a;

    /* renamed from: b */
    private final AbstractC2586e f7798b;

    static {
        Covode.recordClassIndex(2971);
    }

    public final boolean getRepeatedInsidePage() {
        return false;
    }

    public final boolean getRepeatedWhenBack() {
        return false;
    }

    /* renamed from: com.bytedance.analytics.a.d$a */
    public static final class C2585a {
        static {
            Covode.recordClassIndex(2972);
        }

        public /* synthetic */ C2585a(byte b) {
            this();
        }

        private C2585a() {
        }
    }

    public final WeakReference<View> getViewRef() {
        return this.f7797a;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final String getEventName() {
        return this.f7798b.mo7069a();
    }

    public final int hashCode() {
        return this.f7797a.hashCode();
    }

    public final Map<String, String> getParams() {
        HashMap<String, String> b = this.f7798b.mo7070b();
        if (b == null) {
            return new HashMap();
        }
        return b;
    }

    public final String getBTM_CD() {
        return new StringBuilder().append((Object) this.f7798b.f7799a).append('.').append((Object) this.f7798b.f7800b).toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2584d) || getViewRef().get() != ((C2584d) obj).getViewRef().get()) {
            return false;
        }
        return true;
    }

    public C2584d(WeakReference<View> weakReference, AbstractC2586e eVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(eVar, "");
        this.f7797a = weakReference;
        this.f7798b = eVar;
    }
}
