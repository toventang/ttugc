package com.bytedance.android.live.liveinteract.multiguest.p316a.p322f;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5393i;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7665d;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p558h.EnumC8919b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11797b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.f.a */
public final class C5182a extends C5134a.AbstractC5135a {

    /* renamed from: a */
    Room f13402a;

    /* renamed from: b */
    int f13403b = 1;

    /* renamed from: c */
    boolean f13404c;

    /* renamed from: d */
    boolean f13405d;

    /* renamed from: e */
    int f13406e;

    /* renamed from: g */
    private boolean f13407g;

    /* renamed from: h */
    private List<C7665d> f13408h;

    /* renamed from: i */
    private int f13409i;

    /* renamed from: j */
    private int f13410j = 2;

    /* renamed from: k */
    private String f13411k = "";

    /* renamed from: l */
    private C11672a f13412l;

    /* renamed from: m */
    private String f13413m;

    /* renamed from: n */
    private C88411a f13414n = new C88411a();

    static {
        Covode.recordClassIndex(5774);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: a */
    public final int mo10865a() {
        return this.f13403b;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: b */
    public final int mo10871b() {
        return this.f13410j;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: c */
    public final String mo10873c() {
        return this.f13411k;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: e */
    public final boolean mo10875e() {
        return this.f13407g;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: f */
    public final void mo10876f() {
        mo10867a((C5393i) null);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p369a.C5670a
    /* renamed from: g */
    public final void mo10939g() {
        super.mo10939g();
        this.f13414n.mo142944a();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: d */
    public final ImageModel mo10874d() {
        return C11115u.m19743a().mo17915b().mo13147a().getAvatarThumb();
    }

    /* renamed from: h */
    private void m11457h() {
        String str;
        HashMap hashMap = new HashMap();
        Room room = this.f13402a;
        if (room != null) {
            if (room.getStreamType() == EnumC11728i.AUDIO) {
                str = "radio";
            } else {
                str = "video";
            }
            hashMap.put("room_type", str);
        }
        hashMap.put("audience_connection_type", "voice");
        C6501b.C6502a.m13948a("audience_connection_apply").mo12652a((Map<String, String>) hashMap).mo12658d("live_detail").mo12654b("live").mo12656c("click").mo12639a().mo12655b();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: a */
    public final void mo10866a(int i) {
        this.f13403b = i;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: a */
    public final void mo10868a(C11672a aVar) {
        this.f13412l = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.android.live.liveinteract.platform.common.a.b] */
    @Override // com.bytedance.android.live.liveinteract.platform.common.p369a.C5670a
    /* renamed from: a */
    public final /* synthetic */ void mo10938a(C5134a.AbstractC5136b bVar) {
        super.mo10938a(bVar);
        this.f13410j = ((AbstractC11797b) C6193a.m13435a(AbstractC11797b.class)).mo18859b().mo18710c(EnumC8919b.LIVE_INTERACT_BEAUTY_LEVEL);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: b */
    public final void mo10872b(int i) {
        this.f13410j = i;
        ((AbstractC11797b) C6193a.m13435a(AbstractC11797b.class)).mo18859b().mo18707a(EnumC8919b.LIVE_INTERACT_BEAUTY_LEVEL, i);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: a */
    public final void mo10869a(String str) {
        this.f13411k = str;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: a */
    public final void mo10870a(boolean z) {
        long j;
        int i;
        if (this.f13402a != null && !this.f13405d) {
            String str = C6894d.m14753a().f17274u;
            if (z) {
                C4386c.m10499a().f11990k = this.f13403b;
                C4386c.m10499a().f11984e = this.f13410j;
                C4386c.m10499a().f11985f = this.f13412l;
                C4386c.m10499a().f11986g = this.f13411k;
                j = 1;
            } else {
                j = 2;
            }
            C5714i.m12529a(j, this.f13402a.getOwnerUserId(), C6898g.C6899a.f17285a.mo13196a(this.f13402a.getOwnerUserId()));
            this.f13404c = true;
            boolean value = MultiLiveServerAutoJoinChannel.INSTANCE.getValue();
            C88411a aVar = this.f13414n;
            LinkApi linkApi = (LinkApi) C5805e.m12718a().mo11572a(LinkApi.class);
            long id = this.f13402a.getId();
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            aVar.mo142945a(linkApi.linkInRoomGuestReplyAnchor(id, i, this.f13402a.getId(), this.f13402a.getOwnerUserId(), this.f13403b, str, value).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5185d(this, z), new C5186e(this, z)));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5135a
    /* renamed from: a */
    public final void mo10867a(C5393i iVar) {
        int i;
        if (!this.f13404c) {
            this.f13404c = true;
            C4386c a = C4386c.m10499a();
            int i2 = 0;
            if (this.f13407g) {
                C7665d dVar = this.f13408h.get(this.f13409i);
                i2 = dVar.f18997a;
                i = dVar.f18998b;
                a.f11987h = true;
                a.f11988i = i2;
                a.f11989j = i;
                String.valueOf(i2);
            } else {
                a.f11987h = false;
                a.f11988i = 0;
                a.f11989j = 0;
                i = 0;
            }
            C5702a.m12449a("LinkIn_Guest_Apply", "roomId:" + this.f13402a.getId() + "; ownerUid:" + this.f13402a.getOwnerUserId() + "; type:" + this.f13403b);
            C5714i.m12567g();
            HashMap hashMap = new HashMap();
            hashMap.put("link_type", String.valueOf(this.f13403b));
            hashMap.put("guest_supported_vendor", "12");
            hashMap.put("guest_supported_layout", "15");
            hashMap.put("payed_money", String.valueOf(i2));
            hashMap.put("link_duration", String.valueOf(i));
            if (iVar != null) {
                hashMap.put("required_mic_idx", String.valueOf(iVar.f13905a));
                int i3 = iVar.f13906b;
                if (i3 == 11 || i3 == 12) {
                    hashMap.put("layout", "1");
                } else if (i3 == 13 || i3 == 14) {
                    hashMap.put("layout", "0");
                }
            }
            this.f13414n.mo142945a(((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).apply(this.f13402a.getId(), this.f13402a.getOwnerUserId(), hashMap).mo142910a(new C11191f()).mo142915a(new C5183b(this), new C5184c(this)));
            C4386c.m10499a().f11984e = this.f13410j;
            C4386c.m10499a().f11985f = this.f13412l;
            C4386c.m10499a().f11986g = this.f13411k;
            m11457h();
        }
    }

    public C5182a(Room room, boolean z, List<C7665d> list, String str, int i) {
        this.f13402a = room;
        this.f13407g = z;
        this.f13408h = list;
        this.f13413m = str;
        this.f13406e = i;
    }
}
