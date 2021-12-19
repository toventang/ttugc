package com.bytedance.android.live.liveinteract.multilive.anchor.p350a;

import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7676a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.a.a */
public final class C5479a {

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.a.a$b */
    public static abstract class AbstractC5481b extends C4469d.AbstractC4471b<AbstractC5480a> {

        /* renamed from: d */
        private HashMap f14055d;

        static {
            Covode.recordClassIndex(6076);
        }

        /* renamed from: a */
        public abstract void mo11295a();

        /* renamed from: a */
        public abstract void mo11296a(Throwable th);

        /* renamed from: b */
        public void mo11297b() {
            HashMap hashMap = this.f14055d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            mo11297b();
        }
    }

    static {
        Covode.recordClassIndex(6074);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.a.a$a */
    public static abstract class AbstractC5480a extends C4469d.AbstractC4470a<AbstractC5481b> {
        static {
            Covode.recordClassIndex(6075);
        }

        /* renamed from: a */
        public abstract void mo11294a(Long l, Long l2, C7676a aVar);

        public AbstractC5480a(AbstractC5481b bVar) {
            super(bVar);
        }
    }
}
