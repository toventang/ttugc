package com.p2082ss.ttvideoengine.p4407a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.vcloud.abrmodule.ISegmentInfo;
import com.bytedance.vcloud.abrmodule.ISegmentItem;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ttvideoengine.a.b */
public final class C86300b implements ISegmentInfo {

    /* renamed from: c */
    private static boolean f192766c;

    /* renamed from: d */
    private static Class<?> f192767d;

    /* renamed from: e */
    private static Method f192768e;

    /* renamed from: f */
    private static Method f192769f;

    /* renamed from: g */
    private static Method f192770g;

    /* renamed from: h */
    private static Method f192771h;

    /* renamed from: i */
    private static Method f192772i;

    /* renamed from: j */
    private static Method f192773j;

    /* renamed from: k */
    private static Method f192774k;

    /* renamed from: a */
    private Object f192775a;

    /* renamed from: b */
    private boolean f192776b;

    /* renamed from: l */
    private Integer f192777l;

    /* renamed from: m */
    private Integer f192778m;

    /* renamed from: n */
    private Integer f192779n;

    /* renamed from: o */
    private Integer f192780o;

    /* renamed from: p */
    private Long f192781p;

    /* renamed from: q */
    private String f192782q;

    static {
        Covode.recordClassIndex(101528);
    }

    /* renamed from: a */
    private static Object m148589a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_ttvideoengine_abr_SegmentInfo_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_ttvideoengine_abr_SegmentInfo_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final long getBitrate() {
        Method method;
        Long l = this.f192781p;
        if (l != null) {
            return l.longValue();
        }
        long j = -1;
        if (!this.f192776b || (method = f192772i) == null) {
            return -1;
        }
        try {
            Long l2 = (Long) m148589a(method, this.f192775a, new Object[0]);
            this.f192781p = l2;
            j = l2.longValue();
            return j;
        } catch (Exception unused) {
            this.f192781p = Long.valueOf(j);
            return j;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getEndIndex() {
        Method method;
        Integer num = this.f192780o;
        if (num != null) {
            return num.intValue();
        }
        if (!this.f192776b || (method = f192771h) == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) m148589a(method, this.f192775a, new Object[0]);
            this.f192780o = num2;
            return num2.intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final String getFileId() {
        Method method;
        String str = this.f192782q;
        if (str != null) {
            return str;
        }
        if (this.f192776b && (method = f192773j) != null) {
            try {
                this.f192782q = (String) m148589a(method, this.f192775a, new Object[0]);
            } catch (Exception unused) {
                this.f192782q = null;
            }
        }
        return this.f192782q;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final List<? extends ISegmentItem> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!this.f192776b || f192774k == null) {
            return arrayList;
        }
        for (int i = 0; getStartIndex() + i <= getEndIndex(); i++) {
            try {
                arrayList.add(new C86301c(m148589a(f192774k, this.f192775a, new Object[]{Integer.valueOf(i)})));
            } catch (Exception unused) {
                return null;
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getMediaType() {
        Method method;
        Integer num = this.f192777l;
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        if (!this.f192776b || (method = f192768e) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) m148589a(method, this.f192775a, new Object[0]);
            this.f192777l = num2;
            i = num2.intValue();
            return i;
        } catch (Exception unused) {
            this.f192777l = Integer.valueOf(i);
            return i;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getStartIndex() {
        Method method;
        Integer num = this.f192779n;
        if (num != null) {
            return num.intValue();
        }
        if (!this.f192776b || (method = f192770g) == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) m148589a(method, this.f192775a, new Object[0]);
            this.f192779n = num2;
            return num2.intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getTotalNum() {
        Method method;
        Integer num = this.f192778m;
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        if (!this.f192776b || (method = f192769f) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) m148589a(method, this.f192775a, new Object[0]);
            this.f192778m = num2;
            i = num2.intValue();
            return i;
        } catch (Exception unused) {
            this.f192778m = Integer.valueOf(i);
            return i;
        }
    }

    public C86300b(Object obj) {
        this.f192775a = obj;
        if (f192767d == null) {
            if (!f192766c) {
                try {
                    Class<?> a = C86640h.m150079a(200, "com.ss.ttm.player.SidxListObject");
                    f192767d = a;
                    f192768e = a.getMethod("getMediaType", new Class[0]);
                    f192769f = f192767d.getMethod("getTotalNum", new Class[0]);
                    f192770g = f192767d.getMethod("getStartIndex", new Class[0]);
                    f192771h = f192767d.getMethod("getEndIndex", new Class[0]);
                    f192772i = f192767d.getMethod("getBitrate", new Class[0]);
                    f192773j = f192767d.getMethod("getFileId", new Class[0]);
                    f192774k = f192767d.getMethod("getItem", Integer.TYPE);
                } catch (Exception unused) {
                    this.f192775a = null;
                    f192766c = true;
                }
            } else {
                this.f192775a = null;
            }
        }
        Object obj2 = this.f192775a;
        if (obj2 != null && obj2.getClass().equals(f192767d)) {
            this.f192776b = true;
        }
    }
}
