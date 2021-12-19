package com.bytedance.android.live.liveinteract.cohost.p263a.p264a;

import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4628j.p4629a.p4630a.C89397d;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.b */
public final class C4462b {

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.b$b */
    public static abstract class AbstractC4464b extends C4469d.AbstractC4471b<AbstractC4463a> {
        static {
            Covode.recordClassIndex(5040);
        }

        /* renamed from: a */
        public abstract void mo10235a(int i);

        /* renamed from: a */
        public abstract void mo10236a(C7611i.C7612a aVar);

        /* renamed from: a */
        public abstract void mo10237a(Throwable th);

        /* renamed from: a */
        public abstract void mo10238a(boolean z);

        /* renamed from: b */
        public abstract void mo10239b();

        /* renamed from: b */
        public abstract void mo10240b(Throwable th);

        /* renamed from: g_ */
        public abstract void mo10241g_();
    }

    static {
        Covode.recordClassIndex(5038);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.b$c */
    public static class C4465c extends C4469d.AbstractC4472c {

        /* renamed from: a */
        public boolean f12050a;

        static {
            Covode.recordClassIndex(5041);
        }

        /* renamed from: a */
        public static C4465c m10549a(boolean z) {
            C4465c cVar = new C4465c();
            cVar.f12050a = z;
            return cVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.b$a */
    public static abstract class AbstractC4463a extends C4469d.AbstractC4470a<AbstractC4464b> {

        /* renamed from: a */
        public boolean f12044a = true;

        /* renamed from: b */
        public int f12045b;

        /* renamed from: c */
        public int f12046c = -1;

        /* renamed from: d */
        public int f12047d = -1;

        /* renamed from: e */
        public C89397d f12048e = new C89397d();

        /* renamed from: f */
        public int f12049f = 0;

        static {
            Covode.recordClassIndex(5039);
        }

        /* renamed from: a */
        public abstract void mo10229a();

        /* renamed from: a */
        public abstract void mo10230a(Room room, EnumC4442m mVar);

        /* renamed from: b */
        public abstract void mo10231b();

        /* renamed from: c */
        public abstract void mo10232c();

        /* renamed from: d */
        public abstract void mo10233d();

        /* renamed from: e */
        public abstract void mo10234e();

        public AbstractC4463a(AbstractC4464b bVar) {
            super(bVar);
        }
    }
}
