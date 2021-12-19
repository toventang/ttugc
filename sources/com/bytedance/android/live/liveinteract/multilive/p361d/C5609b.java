package com.bytedance.android.live.liveinteract.multilive.p361d;

import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5600m;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5601n;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5602o;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.d.b */
public final class C5609b {

    /* renamed from: c */
    public static final C5610a f14251c = new C5610a((byte) 0);
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a */
    public C5271a f14252a;
    @AbstractC4430d(mo10204a = "LINK_USER_INFO_CENTER")

    /* renamed from: b */
    public C5153d f14253b;

    /* renamed from: d */
    private final C5187f.AbstractC5188a f14254d;

    static {
        Covode.recordClassIndex(6206);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.d.b$a */
    public static final class C5610a {
        static {
            Covode.recordClassIndex(6207);
        }

        private C5610a() {
        }

        public /* synthetic */ C5610a(byte b) {
            this();
        }
    }

    public /* synthetic */ C5609b() {
        this(null);
    }

    /* renamed from: a */
    public final List<C5602o> mo11389a() {
        ArrayList arrayList = new ArrayList();
        C5153d dVar = this.f14253b;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        for (C7666e eVar : dVar.f13347b) {
            String str = eVar.f19008j;
            C89219l.m154716b(str, "");
            String str2 = eVar.f19008j;
            C89219l.m154716b(str2, "");
            int b = m12150b(str2);
            C5271a aVar = this.f14252a;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            Boolean bool = aVar.mo11108a().get(eVar.f19008j);
            if (bool == null) {
                bool = false;
            }
            C89219l.m154716b(bool, "");
            arrayList.add(new C5602o(str, b, bool.booleanValue()));
        }
        return arrayList;
    }

    public C5609b(C5187f.AbstractC5188a aVar) {
        this.f14254d = aVar;
        C4431e.f12034a.mo10201a(this);
    }

    /* renamed from: b */
    private final int m12150b(String str) {
        C5187f.AbstractC5188a aVar = this.f14254d;
        if (aVar != null) {
            return aVar.mo10953g(str);
        }
        return -1;
    }

    /* renamed from: a */
    public final C5600m mo11388a(String str) {
        C89219l.m154721d(str, "");
        C5600m mVar = new C5600m();
        mVar.mo11370a();
        mVar.mo11371a("onSyncVideoMuteStatus");
        C5601n nVar = new C5601n();
        List<C5602o> a = mo11389a();
        ArrayList arrayList = new ArrayList();
        for (T t : a) {
            if (!C89219l.m154714a((Object) t.f14243a, (Object) str)) {
                arrayList.add(t);
            }
        }
        nVar.f14242b.addAll(arrayList);
        mVar.f14238b = nVar;
        return mVar;
    }
}
