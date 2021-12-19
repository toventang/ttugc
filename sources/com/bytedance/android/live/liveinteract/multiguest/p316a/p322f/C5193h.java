package com.bytedance.android.live.liveinteract.multiguest.p316a.p322f;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.f.h */
public final class C5193h extends C5137b.AbstractC5138a {

    /* renamed from: a */
    private Room f13423a;

    /* renamed from: b */
    private long f13424b = 0;

    /* renamed from: c */
    private String f13425c;

    /* renamed from: d */
    private C7666e f13426d;

    /* renamed from: e */
    private long f13427e;

    static {
        Covode.recordClassIndex(5785);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a
    /* renamed from: b */
    public final long mo10884b() {
        return this.f13424b;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a
    /* renamed from: c */
    public final String mo10885c() {
        return this.f13425c;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a
    /* renamed from: f */
    public final C7666e mo10888f() {
        return this.f13426d;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p369a.C5670a
    /* renamed from: g */
    public final void mo10939g() {
        super.mo10939g();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a
    /* renamed from: a */
    public final User mo10881a() {
        C7666e eVar = this.f13426d;
        if (eVar != null) {
            return eVar.f19001c;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a
    /* renamed from: e */
    public final boolean mo10887e() {
        C7666e eVar = this.f13426d;
        if (eVar == null || eVar.f19004f != 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a
    /* renamed from: d */
    public final boolean mo10886d() {
        long j = this.f13424b;
        if (j == 0 || j != C11115u.m19743a().mo17915b().mo13161c()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m11509h() {
        if (this.f14407f != null) {
            if (this.f13426d == null) {
                ((C5137b.AbstractC5139b) this.f14407f).setVisibility(false);
                return;
            }
            ((C5137b.AbstractC5139b) this.f14407f).setVisibility(true);
            if (this.f13426d.f19001c != null) {
                ((C5137b.AbstractC5139b) this.f14407f).mo10891a(this.f13426d.f19001c);
            }
            mo10882a(this.f13426d.f18999a);
            if (this.f13426d.f19006h > 0) {
                ((C5137b.AbstractC5139b) this.f14407f).mo10889a(this.f13426d.f19007i, mo10886d());
            }
            ((C5137b.AbstractC5139b) this.f14407f).mo10892a(mo10886d());
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.android.live.liveinteract.platform.common.a.b] */
    @Override // com.bytedance.android.live.liveinteract.platform.common.p369a.C5670a
    /* renamed from: a */
    public final /* synthetic */ void mo10938a(C5137b.AbstractC5139b bVar) {
        super.mo10938a(bVar);
        m11509h();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a
    /* renamed from: a */
    public final void mo10882a(long j) {
        if (j >= this.f13427e) {
            this.f13427e = j;
            if (this.f14407f != null) {
                ((C5137b.AbstractC5139b) this.f14407f).mo10890a(this.f13427e);
            }
            if (mo10886d()) {
                C4386c.m10499a().mo10157a(this.f13427e);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5138a
    /* renamed from: a */
    public final void mo10883a(C7666e eVar) {
        C7666e eVar2 = this.f13426d;
        if (eVar2 == null) {
            this.f13426d = eVar;
        } else if (eVar != null && eVar2.f19001c.getId() == eVar.f19001c.getId()) {
            if (eVar.f18999a > eVar2.f18999a) {
                eVar2.f18999a = eVar.f18999a;
            }
            eVar2.f19000b = eVar.f19000b;
            eVar2.f19001c = eVar.f19001c;
            if (eVar.f19002d > eVar2.f19002d) {
                eVar2.f19002d = eVar.f19002d;
            }
            eVar2.f19003e = eVar.f19003e;
            eVar2.f19004f = eVar.f19004f;
            eVar2.f19005g = eVar.f19005g;
            eVar2.f19006h = eVar.f19006h;
        }
        C7666e eVar3 = this.f13426d;
        if (eVar3 != null) {
            this.f13425c = eVar3.mo13898a();
            if (this.f13426d.f19001c != null) {
                this.f13424b = this.f13426d.f19001c.getId();
            }
        }
        m11509h();
    }

    public C5193h(Room room, String str, C7666e eVar) {
        this.f13423a = room;
        this.f13425c = str;
        this.f13426d = eVar;
        if (eVar != null) {
            this.f13425c = eVar.mo13898a();
            if (this.f13426d.f19001c != null) {
                this.f13424b = this.f13426d.f19001c.getId();
            }
        }
    }
}
