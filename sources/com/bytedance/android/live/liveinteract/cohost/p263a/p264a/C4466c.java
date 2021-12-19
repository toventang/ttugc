package com.bytedance.android.live.liveinteract.cohost.p263a.p264a;

import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.c */
public final class C4466c {

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.c$b */
    public static abstract class AbstractC4468b extends C4469d.AbstractC4471b<AbstractC4467a> {

        /* renamed from: d */
        private HashMap f12051d;

        static {
            Covode.recordClassIndex(5044);
        }

        /* renamed from: a */
        public abstract void mo10244a();

        /* renamed from: a */
        public abstract void mo10245a(Throwable th);

        /* renamed from: b */
        public abstract void mo10246b();

        /* renamed from: b */
        public abstract void mo10247b(Throwable th);

        /* renamed from: c */
        public void mo10248c() {
            HashMap hashMap = this.f12051d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            mo10248c();
        }
    }

    static {
        Covode.recordClassIndex(5042);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.c$a */
    public static abstract class AbstractC4467a extends C4469d.AbstractC4470a<AbstractC4468b> {
        static {
            Covode.recordClassIndex(5043);
        }

        /* renamed from: a */
        public abstract void mo10242a(boolean z);

        /* renamed from: b */
        public abstract void mo10243b(boolean z);

        public AbstractC4467a(AbstractC4468b bVar) {
            super(bVar);
        }
    }
}
