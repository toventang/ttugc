package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.api.BroadcastRoomApi;
import com.bytedance.android.live.broadcast.api.BroadcastUserApi;
import com.bytedance.android.live.broadcast.api.StatusApi;
import com.bytedance.android.live.broadcast.api.StickerReportApi;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.utils.d */
public final class C3719d {

    /* renamed from: a */
    public static final AbstractC89244h f10314a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C3721b.f10317a);

    /* renamed from: b */
    public static final C3720a f10315b = new C3720a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f10316c;

    /* renamed from: e */
    private final ConcurrentHashMap<Class<?>, Object> m9223e() {
        return (ConcurrentHashMap) this.f10316c.getValue();
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.d$a */
    public static final class C3720a {
        static {
            Covode.recordClassIndex(4235);
        }

        /* renamed from: a */
        public static C3719d m9229a() {
            return (C3719d) C3719d.f10314a.getValue();
        }

        private C3720a() {
        }

        public /* synthetic */ C3720a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.d$b */
    static final class C3721b extends AbstractC89220m implements AbstractC89171a<C3719d> {

        /* renamed from: a */
        public static final C3721b f10317a = new C3721b();

        static {
            Covode.recordClassIndex(4236);
        }

        C3721b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C3719d invoke() {
            return new C3719d((byte) 0);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.d$c */
    static final class C3722c extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<Class<?>, Object>> {

        /* renamed from: a */
        public static final C3722c f10318a = new C3722c();

        static {
            Covode.recordClassIndex(4237);
        }

        C3722c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<Class<?>, Object> invoke() {
            return new ConcurrentHashMap();
        }
    }

    private C3719d() {
        this.f10316c = C89250i.m154773a((AbstractC89171a) C3722c.f10318a);
    }

    /* renamed from: a */
    public final BroadcastRoomApi mo9038a() {
        return (BroadcastRoomApi) mo9039a(BroadcastRoomApi.class);
    }

    /* renamed from: b */
    public final BroadcastUserApi mo9040b() {
        return (BroadcastUserApi) mo9039a(BroadcastUserApi.class);
    }

    /* renamed from: c */
    public final StatusApi mo9041c() {
        return (StatusApi) mo9039a(StatusApi.class);
    }

    /* renamed from: d */
    public final StickerReportApi mo9042d() {
        return (StickerReportApi) mo9039a(StickerReportApi.class);
    }

    static {
        Covode.recordClassIndex(4234);
    }

    public /* synthetic */ C3719d(byte b) {
        this();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Class<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> T mo9039a(Class<T> cls) {
        if (!m9223e().contains(cls)) {
            ConcurrentHashMap<Class<?>, Object> e = m9223e();
            Object a = C5805e.m12718a().mo11572a(cls);
            if (a == null) {
                C89219l.m154715b();
            }
            e.putIfAbsent(cls, a);
        }
        return (T) m9223e().get(cls);
    }
}
