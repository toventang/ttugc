package com.bytedance.android.live.liveinteract.cohost.p263a.p264a;

import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9754d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.a */
public final class C4457a {

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.a$b */
    public static abstract class AbstractC4459b extends C4469d.AbstractC4471b<AbstractC4458a> {

        /* renamed from: d */
        private HashMap f12041d;

        static {
            Covode.recordClassIndex(5035);
        }

        /* renamed from: a */
        public abstract void mo10226a();

        /* renamed from: a */
        public abstract void mo10227a(int i, int i2);

        /* renamed from: b */
        public void mo10228b() {
            HashMap hashMap = this.f12041d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            mo10228b();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.a$c */
    public static final class C4460c extends C4469d.AbstractC4472c {

        /* renamed from: b */
        public static final C4461a f12042b = new C4461a((byte) 0);

        /* renamed from: a */
        public C9754d f12043a;

        static {
            Covode.recordClassIndex(5036);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.a$c$a */
        public static final class C4461a {
            static {
                Covode.recordClassIndex(5037);
            }

            private C4461a() {
            }

            public /* synthetic */ C4461a(byte b) {
                this();
            }
        }

        private C4460c() {
        }

        public /* synthetic */ C4460c(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(5033);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.a$a */
    public static abstract class AbstractC4458a extends C4469d.AbstractC4470a<AbstractC4459b> {
        static {
            Covode.recordClassIndex(5034);
        }

        /* renamed from: a */
        public abstract void mo10222a();

        /* renamed from: a */
        public abstract void mo10223a(int i);

        /* renamed from: a */
        public abstract void mo10224a(int i, long j, long j2, long j3);

        /* renamed from: b */
        public abstract void mo10225b();

        public AbstractC4458a(AbstractC4459b bVar) {
            super(bVar);
        }
    }
}
