package com.p2082ss.android.ttvecamera.p2194c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.c.a */
public final class C30783a {

    /* renamed from: d */
    public static final Map<Integer, EnumC30784a> f73714d;

    /* renamed from: a */
    public List<C30785b> f73715a;

    /* renamed from: b */
    public AbstractC30787d f73716b;

    /* renamed from: c */
    public boolean f73717c;

    /* renamed from: com.ss.android.ttvecamera.c.a$d */
    public interface AbstractC30787d {
        static {
            Covode.recordClassIndex(37412);
        }

        /* renamed from: a */
        EnumC30786c mo55749a(EnumC30784a aVar);

        /* renamed from: a */
        void mo55750a(List<C30785b> list);
    }

    /* renamed from: a */
    public final void mo55747a() {
        this.f73716b.mo55750a(this.f73715a);
        this.f73715a.clear();
    }

    static {
        Covode.recordClassIndex(37408);
        HashMap hashMap = new HashMap();
        f73714d = hashMap;
        hashMap.put(8, EnumC30784a.DEPTH_OUTPUT);
        hashMap.put(1, EnumC30784a.MANUAL_3A);
        hashMap.put(11, EnumC30784a.LOGICAL_MULTI_CAMERA);
    }

    /* renamed from: com.ss.android.ttvecamera.c.a$a */
    public enum EnumC30784a {
        DEPTH_OUTPUT,
        PREVIEW_SIZE,
        FPS_RANGE,
        MANUAL_3A,
        HIGH_SPEED_VIDEO_FPS_RANGE,
        SUPPORT_APERTURES,
        LOGICAL_MULTI_CAMERA;

        static {
            Covode.recordClassIndex(37409);
        }
    }

    /* renamed from: com.ss.android.ttvecamera.c.a$c */
    public enum EnumC30786c {
        UNKNOWN,
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING;

        static {
            Covode.recordClassIndex(37411);
        }
    }

    /* renamed from: a */
    public final EnumC30786c mo55746a(EnumC30784a aVar) {
        return this.f73716b.mo55749a(aVar);
    }

    /* renamed from: a */
    public final void mo55748a(C30785b bVar) {
        List<C30785b> list = this.f73715a;
        if (list != null) {
            list.add(bVar);
        }
    }

    /* renamed from: com.ss.android.ttvecamera.c.a$b */
    public static class C30785b {

        /* renamed from: a */
        public EnumC30784a f73719a;

        /* renamed from: b */
        public EnumC30786c f73720b;

        /* renamed from: c */
        public Object f73721c;

        static {
            Covode.recordClassIndex(37410);
        }

        public C30785b(EnumC30784a aVar, EnumC30786c cVar, Object obj) {
            this.f73719a = aVar;
            this.f73720b = cVar;
            this.f73721c = obj;
        }
    }
}
