package com.bytedance.android.live.liveinteract.match.p295b.p296a;

import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.a.a */
public final class C4942a {

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.a.a$a */
    public static final class C4943a extends C4469d.AbstractC4472c {

        /* renamed from: d */
        public static final C4944a f12905d = new C4944a((byte) 0);

        /* renamed from: a */
        public int f12906a;

        /* renamed from: b */
        public long f12907b;

        static {
            Covode.recordClassIndex(5526);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.match.b.a.a$a$a */
        public static final class C4944a {
            static {
                Covode.recordClassIndex(5527);
            }

            private C4944a() {
            }

            public /* synthetic */ C4944a(byte b) {
                this();
            }
        }

        private C4943a() {
        }

        public /* synthetic */ C4943a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.a.a$c */
    public static abstract class AbstractC4946c extends C4469d.AbstractC4471b<AbstractC4945b> {

        /* renamed from: d */
        private HashMap f12908d;

        static {
            Covode.recordClassIndex(5529);
        }

        /* renamed from: a */
        public void mo10669a() {
            HashMap hashMap = this.f12908d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        /* renamed from: a */
        public abstract void mo10670a(Throwable th);

        /* renamed from: b */
        public abstract void mo10671b(Throwable th);

        @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            mo10669a();
        }
    }

    static {
        Covode.recordClassIndex(5525);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.a.a$b */
    public static abstract class AbstractC4945b extends C4469d.AbstractC4470a<AbstractC4946c> {
        static {
            Covode.recordClassIndex(5528);
        }

        /* renamed from: a */
        public abstract void mo10667a(int i, long j);

        /* renamed from: b */
        public abstract void mo10668b(int i, long j);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AbstractC4945b(AbstractC4946c cVar) {
            super(cVar);
            C89219l.m154721d(cVar, "");
        }
    }
}
