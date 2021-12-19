package com.p2082ss.ttvideoengine.p4407a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.vcloud.abrmodule.ISegmentItem;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import java.lang.reflect.Method;

/* renamed from: com.ss.ttvideoengine.a.c */
public final class C86301c implements ISegmentItem {

    /* renamed from: c */
    private static boolean f192783c;

    /* renamed from: d */
    private static Class<?> f192784d;

    /* renamed from: e */
    private static Method f192785e;

    /* renamed from: f */
    private static Method f192786f;

    /* renamed from: g */
    private static Method f192787g;

    /* renamed from: h */
    private static Method f192788h;

    /* renamed from: i */
    private static Method f192789i;

    /* renamed from: a */
    private Object f192790a;

    /* renamed from: b */
    private boolean f192791b;

    /* renamed from: j */
    private Integer f192792j;

    /* renamed from: k */
    private Long f192793k;

    /* renamed from: l */
    private Long f192794l;

    /* renamed from: m */
    private Long f192795m;

    /* renamed from: n */
    private Long f192796n;

    static {
        Covode.recordClassIndex(101529);
    }

    /* renamed from: a */
    private static Object m148590a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_ttvideoengine_abr_SegmentItem_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_ttvideoengine_abr_SegmentItem_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getDuration() {
        Method method;
        Long l = this.f192795m;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.f192791b || (method = f192788h) == null) {
            return -1;
        }
        try {
            Long l2 = (Long) m148590a(method, this.f192790a, new Object[0]);
            this.f192795m = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.f192795m = Long.valueOf(j);
            return j;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final int getIndex() {
        Method method;
        Integer num = this.f192792j;
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        if (!this.f192791b || (method = f192785e) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) m148590a(method, this.f192790a, new Object[0]);
            this.f192792j = num2;
            i = num2.intValue();
            return i;
        } catch (Exception unused) {
            this.f192792j = Integer.valueOf(i);
            return i;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getOffset() {
        Method method;
        Long l = this.f192793k;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.f192791b || (method = f192786f) == null) {
            return -1;
        }
        try {
            Long l2 = (Long) m148590a(method, this.f192790a, new Object[0]);
            this.f192793k = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.f192793k = Long.valueOf(j);
            return j;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getSize() {
        Method method;
        Long l = this.f192796n;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.f192791b || (method = f192789i) == null) {
            return -1;
        }
        try {
            Long l2 = (Long) m148590a(method, this.f192790a, new Object[0]);
            this.f192796n = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.f192796n = Long.valueOf(j);
            return j;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getTimestamp() {
        Method method;
        Long l = this.f192794l;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.f192791b || (method = f192787g) == null) {
            return -1;
        }
        try {
            Long l2 = (Long) m148590a(method, this.f192790a, new Object[0]);
            this.f192794l = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.f192794l = Long.valueOf(j);
            return j;
        }
    }

    public C86301c(Object obj) {
        this.f192790a = obj;
        if (f192784d == null) {
            if (!f192783c) {
                try {
                    Class<?> a = C86640h.m150079a(200, "com.ss.ttm.player.SidxListObject$SidxItem");
                    f192784d = a;
                    f192785e = a.getMethod("getIndex", new Class[0]);
                    f192786f = f192784d.getMethod("getOffset", new Class[0]);
                    f192787g = f192784d.getMethod("getTimestamp", new Class[0]);
                    f192788h = f192784d.getMethod("getDuration", new Class[0]);
                    f192789i = f192784d.getMethod("getSize", new Class[0]);
                } catch (Exception unused) {
                    this.f192790a = null;
                    f192783c = true;
                }
            } else {
                this.f192790a = null;
            }
        }
        Object obj2 = this.f192790a;
        if (obj2 != null && obj2.getClass().equals(f192784d)) {
            this.f192791b = true;
        }
    }
}
