package com.bytedance.android.live.liveinteract.multiguest.p316a.p319c;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5193h;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.f */
public final class C5167f {

    /* renamed from: a */
    public C5153d f13379a;

    /* renamed from: b */
    public AbstractC5169a f13380b;

    /* renamed from: c */
    public List<C5137b.AbstractC5138a> f13381c = new ArrayList();

    /* renamed from: d */
    private Room f13382d;

    /* renamed from: e */
    private final C5153d.AbstractC5154a f13383e = new C5153d.AbstractC5154a() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f.C51681 */

        static {
            Covode.recordClassIndex(5760);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10915a() {
            for (C5137b.AbstractC5138a aVar : C5167f.this.f13381c) {
                C7666e a = C5167f.this.f13379a.mo10896a(aVar.mo10885c(), aVar.mo10884b());
                if (a != null) {
                    aVar.mo10883a(a);
                }
            }
            C5167f.this.f13380b.mo10924a();
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10916a(long j, long j2) {
            if (j > 0) {
                for (C5137b.AbstractC5138a aVar : C5167f.this.f13381c) {
                    if (aVar.mo10884b() == j) {
                        aVar.mo10882a(j2);
                        return;
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo10917a(long r6, java.lang.String r8) {
            /*
                r5 = this;
                com.bytedance.android.live.liveinteract.multiguest.a.c.f r0 = com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f.this
                java.util.List<com.bytedance.android.live.liveinteract.multiguest.a.b.b$a> r0 = r0.f13381c
                java.util.Iterator r4 = r0.iterator()
            L_0x0008:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0033
                java.lang.Object r3 = r4.next()
                com.bytedance.android.live.liveinteract.multiguest.a.b.b$a r3 = (com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a) r3
                r1 = 0
                int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0022
                long r1 = r3.mo10884b()
                int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r0 == 0) goto L_0x002c
            L_0x0022:
                java.lang.String r0 = r3.mo10885c()
                boolean r0 = android.text.TextUtils.equals(r0, r8)
                if (r0 == 0) goto L_0x0008
            L_0x002c:
                com.bytedance.android.live.liveinteract.multiguest.a.c.f r0 = com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f.this
                java.util.List<com.bytedance.android.live.liveinteract.multiguest.a.b.b$a> r0 = r0.f13381c
                r0.remove(r3)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f.C51681.mo10917a(long, java.lang.String):void");
        }
    };

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.f$a */
    public interface AbstractC5169a {
        static {
            Covode.recordClassIndex(5761);
        }

        /* renamed from: a */
        void mo10924a();
    }

    static {
        Covode.recordClassIndex(5759);
    }

    /* renamed from: a */
    public final void mo10922a() {
        this.f13379a.mo10902a(this.f13383e);
    }

    /* renamed from: b */
    public final void mo10923b() {
        this.f13379a.mo10905b(this.f13383e);
    }

    /* renamed from: a */
    public final C5137b.AbstractC5138a mo10921a(String str) {
        C7666e a = this.f13379a.mo10896a(str, 0);
        if (LiveLinkListOptiEnableSetting.INSTANCE.getValue() && a == null && C6898g.C6899a.f17285a.mo13195a(str) == C11115u.m19743a().mo17915b().mo13161c()) {
            a = new C7666e();
            a.f19001c = User.from(C11115u.m19743a().mo17915b().mo13147a());
            a.f19008j = str;
        }
        for (C5137b.AbstractC5138a aVar : this.f13381c) {
            if (TextUtils.equals(aVar.mo10885c(), str)) {
                aVar.mo10883a(a);
                return aVar;
            }
        }
        C5193h hVar = new C5193h(this.f13382d, str, a);
        this.f13381c.add(hVar);
        return hVar;
    }

    public C5167f(Room room, C5153d dVar, AbstractC5169a aVar) {
        this.f13382d = room;
        this.f13380b = aVar;
        this.f13379a = dVar;
    }
}
