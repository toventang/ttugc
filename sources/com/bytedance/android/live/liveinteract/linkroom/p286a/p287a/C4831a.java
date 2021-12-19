package com.bytedance.android.live.liveinteract.linkroom.p286a.p287a;

import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.a.a */
public final class C4831a {

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.a.a$b */
    public static abstract class AbstractC4833b extends C4469d.AbstractC4471b<AbstractC4832a> {

        /* renamed from: d */
        private HashMap f12680d;

        static {
            Covode.recordClassIndex(5415);
        }

        /* renamed from: a */
        public abstract void mo10561a();

        /* renamed from: a */
        public abstract void mo10562a(Throwable th);

        /* renamed from: b */
        public void mo10563b() {
            HashMap hashMap = this.f12680d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            mo10563b();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.a.a$c */
    public static final class C4834c extends C4469d.AbstractC4472c {

        /* renamed from: a */
        public static final C4835a f12681a = new C4835a((byte) 0);

        static {
            Covode.recordClassIndex(5416);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.a.a$c$a */
        public static final class C4835a {
            static {
                Covode.recordClassIndex(5417);
            }

            private C4835a() {
            }

            /* renamed from: a */
            public static C4834c m10965a() {
                return new C4834c((byte) 0);
            }

            public /* synthetic */ C4835a(byte b) {
                this();
            }
        }

        private C4834c() {
        }

        public /* synthetic */ C4834c(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(5413);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.a.a$a */
    public static abstract class AbstractC4832a extends C4469d.AbstractC4470a<AbstractC4833b> {
        static {
            Covode.recordClassIndex(5414);
        }

        /* renamed from: a */
        public abstract void mo10560a(long j);

        public AbstractC4832a(AbstractC4833b bVar) {
            super(bVar);
        }
    }
}
