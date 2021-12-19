package com.bytedance.android.live.liveinteract.cohost.p263a.p264a;

import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.e */
public interface AbstractC4475e {

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.e$b */
    public static abstract class AbstractC4477b extends C4469d.AbstractC4471b<AbstractC4476a> {

        /* renamed from: d */
        private HashMap f12059d;

        static {
            Covode.recordClassIndex(5053);
        }

        /* renamed from: a */
        public void mo10262a() {
            HashMap hashMap = this.f12059d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            mo10262a();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.e$c */
    public static final class C4478c extends C4469d.AbstractC4472c {

        /* renamed from: b */
        public static final C4479a f12060b = new C4479a((byte) 0);

        /* renamed from: a */
        public Map<String, Long> f12061a;

        static {
            Covode.recordClassIndex(5054);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.e$c$a */
        public static final class C4479a {
            static {
                Covode.recordClassIndex(5055);
            }

            private C4479a() {
            }

            public /* synthetic */ C4479a(byte b) {
                this();
            }
        }

        private C4478c() {
            this.f12061a = C89041ag.m154415a();
        }

        public /* synthetic */ C4478c(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(5051);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.e$a */
    public static abstract class AbstractC4476a extends C4469d.AbstractC4470a<AbstractC4477b> {
        static {
            Covode.recordClassIndex(5052);
        }

        /* renamed from: a */
        public abstract void mo10261a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AbstractC4476a(AbstractC4477b bVar) {
            super(bVar);
            C89219l.m154721d(bVar, "");
        }
    }
}
