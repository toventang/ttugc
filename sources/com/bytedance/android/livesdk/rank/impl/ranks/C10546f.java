package com.bytedance.android.livesdk.rank.impl.ranks;

import android.graphics.Color;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.livesetting.rank.LiveHourlyRankQueryEntranceDelaySetting;
import com.bytedance.android.livesdk.model.message.C9600ad;
import com.bytedance.android.livesdk.model.message.C9601ae;
import com.bytedance.android.livesdk.model.message.C9625ax;
import com.bytedance.android.livesdk.model.message.C9682bo;
import com.bytedance.android.livesdk.model.message.C9684bq;
import com.bytedance.android.livesdk.model.message.C9687bs;
import com.bytedance.android.livesdk.model.message.C9694bz;
import com.bytedance.android.livesdk.model.message.C9725ch;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9087cz;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.C10331a;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.api.p607b.AbstractC10335a;
import com.bytedance.android.livesdk.rank.impl.C10385d;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10370g;
import com.bytedance.android.livesdk.rank.impl.p610c.C10384a;
import com.bytedance.android.livesdk.rank.impl.p611d.C10386a;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.android.livesdk.rank.impl.ranks.C10473a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.f */
public final class C10546f extends AbstractC7501r<C10473a.AbstractC10474a> implements AbstractC10335a, HandlerC11626a.AbstractC11627a, OnMessageListener {

    /* renamed from: a */
    List<C9682bo> f25355a = new ArrayList();

    /* renamed from: b */
    boolean f25356b;

    /* renamed from: c */
    boolean f25357c;

    /* renamed from: d */
    private C9682bo f25358d;

    /* renamed from: e */
    private final HandlerC11626a f25359e = new HandlerC11626a(this);

    /* renamed from: f */
    private boolean f25360f;

    /* renamed from: g */
    private final String f25361g = "#33000000";

    /* renamed from: h */
    private final int f25362h = Color.parseColor("#33000000");

    /* renamed from: i */
    private Room f25363i;

    /* renamed from: j */
    private boolean f25364j;

    /* renamed from: k */
    private AbstractC10339d f25365k = null;

    static {
        Covode.recordClassIndex(12121);
    }

    @Override // com.bytedance.android.livesdk.rank.api.p607b.AbstractC10335a
    /* renamed from: a */
    public final boolean mo17113a() {
        return !this.f25355a.isEmpty() && this.f25364j && m19087g();
    }

    /* renamed from: g */
    private boolean m19087g() {
        Room room = this.f25363i;
        if (room == null) {
            return false;
        }
        if (room.getRoomAuthStatus() == null || this.f25363i.getRoomAuthStatus().getRankState() != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m19085e() {
        for (C9682bo boVar : this.f25355a) {
            if (boVar.f23562e == EnumC10345i.WEEKLY_RANK.getType() && boVar.f23558a) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo17377c() {
        this.f18625x.addMessageListener(EnumC9596a.HOURLY_RANK_MESSAGE.getIntType(), this);
        this.f18625x.addMessageListener(EnumC9596a.HOURLY_RANK_REWARD_MESSAGE.getIntType(), this);
        this.f18625x.addMessageListener(EnumC9596a.MARQUEE_ANNOUNCEMENT_MESSAGE.getIntType(), this);
        this.f18625x.addMessageListener(EnumC9596a.WEEKLY_RANK_REWARD_MESSAGE.getIntType(), this);
    }

    /* renamed from: d */
    private void m19084d() {
        Room room;
        if (this.f18624w != null && !this.f25356b && (room = (Room) this.f18624w.mo28318b(C9093de.class)) != null && room.getOwner() != null) {
            ((AbstractC11181z) ((RankApi) C5805e.m12718a().mo11572a(RankApi.class)).queryRankEntrances(room.getOwner().getId(), room.getId()).mo143271a(new C11191f()).mo143274a(mo13749v())).mo17950a(new C10547g(this), new C10548h(this, room));
        }
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    public final void mo8577b() {
        mo17376b(true);
        this.f18625x.removeMessageListener(EnumC9596a.HOURLY_RANK_MESSAGE.getIntType(), this);
        this.f18625x.removeMessageListener(EnumC9596a.HOURLY_RANK_REWARD_MESSAGE.getIntType(), this);
        this.f18625x.removeMessageListener(EnumC9596a.MARQUEE_ANNOUNCEMENT_MESSAGE.getIntType(), this);
        this.f18625x.removeMessageListener(EnumC9596a.WEEKLY_RANK_REWARD_MESSAGE.getIntType(), this);
        this.f18625x.removeMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
        this.f25359e.removeCallbacksAndMessages(null);
        super.mo8577b();
        if (this.f25363i != null) {
            ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).unregisterRankController(this.f25363i.getId(), this);
        }
        this.f25363i = null;
        this.f25357c = false;
        this.f25355a.clear();
    }

    /* renamed from: f */
    private void m19086f() {
        String str;
        String str2;
        if (!this.f25360f && mo17113a()) {
            this.f25360f = true;
            ((C10473a.AbstractC10474a) this.f38654y).mo17308a();
            C6501b a = C6501b.C6502a.m13948a("livesdk_rank_entrance_show").mo12643a(this.f18624w);
            if (((Boolean) this.f18624w.mo28318b(C9076co.class)).booleanValue()) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            C6501b a2 = a.mo12651a("room_orientation", str);
            if (this.f25357c) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            a2.mo12651a("user_type", str2).mo12655b();
            if (this.f18624w != null) {
                Room room = (Room) this.f18624w.mo28318b(C9093de.class);
                if (room != null) {
                    JSONObject jSONObject = new JSONObject();
                    C3866a.m9474a(jSONObject, "room_id", room.getId());
                    C3866a.m9474a(jSONObject, "user_id", C11115u.m19743a().mo17915b().mo13161c());
                    C3868c.m9492a("ttlive_hourly_rank_entrance", 0, jSONObject);
                }
                this.f18624w.mo28320c(C9087cz.class, true);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.p607b.AbstractC10335a
    /* renamed from: a */
    public final void mo17112a(boolean z) {
        this.f25364j = z;
        if (z) {
            m19086f();
            return;
        }
        mo17376b(false);
        mo17373a(-1, (String) null, (String) null, "hide_by_other_business");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17376b(boolean z) {
        if (this.f25360f) {
            this.f25360f = false;
            ((C10473a.AbstractC10474a) this.f38654y).mo17312a(z);
            if (this.f18624w != null) {
                this.f18624w.mo28320c(C9087cz.class, false);
            }
        }
    }

    /* renamed from: a */
    static List<C9682bo> m19082a(List<C9682bo> list) {
        ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).setRankEntranceList(list);
        ArrayList arrayList = new ArrayList();
        C9682bo boVar = null;
        for (C9682bo boVar2 : list) {
            if (boVar == null) {
                boVar = boVar2;
            }
            if (boVar2.f23563f) {
                arrayList.add(boVar2);
                if (boVar2.f23562e == 1 && boVar2.f23561d != null) {
                    C10384a.m18891a(boVar2.f23561d.f23573f);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(boVar);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17375b(List<C9682bo> list) {
        this.f25359e.removeCallbacksAndMessages(null);
        Iterator<C9682bo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                mo17376b(true);
                this.f25358d = null;
                break;
            } else if (it.next().f23558a) {
                m19086f();
                C9682bo boVar = list.get(0);
                this.f25358d = boVar;
                C9684bq bqVar = boVar.f23561d;
                if (bqVar != null) {
                    if (this.f25358d.f23559b - bqVar.f23568a >= 0) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = Long.valueOf(TimeUnit.SECONDS.toMillis(bqVar.f23569b));
                        this.f25359e.sendMessageDelayed(obtain, TimeUnit.SECONDS.toMillis(this.f25358d.f23559b - bqVar.f23568a));
                    } else if (bqVar.f23568a - this.f25358d.f23559b < bqVar.f23569b) {
                        Message obtain2 = Message.obtain();
                        obtain2.what = 1;
                        obtain2.obj = Long.valueOf(TimeUnit.SECONDS.toMillis(bqVar.f23569b - (bqVar.f23568a - this.f25358d.f23559b)));
                        this.f25359e.sendMessage(obtain2);
                    } else {
                        m19083a(list, bqVar.f23571d);
                    }
                }
                m19083a(list, null);
            }
        }
        this.f25359e.sendEmptyMessageDelayed(4, TimeUnit.SECONDS.toMillis(this.f25358d.f23559b));
    }

    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    public final void handleMsg(Message message) {
        C9682bo boVar;
        List<C10497b> singletonList;
        if (message.what == 1) {
            C9682bo boVar2 = this.f25358d;
            if (boVar2 != null && boVar2.f23561d != null) {
                C9684bq bqVar = this.f25358d.f23561d;
                if (this.f25358d.f23562e == EnumC10345i.HOURLY_RANK.getType()) {
                    singletonList = Collections.singletonList(m19081a(this.f25358d.f23562e, bqVar.f23570c, bqVar.f23571d, bqVar.f23569b, bqVar));
                } else {
                    singletonList = Collections.singletonList(m19080a(this.f25358d.f23562e, bqVar.f23570c, bqVar.f23571d, bqVar.f23569b));
                }
                m19086f();
                ((C10473a.AbstractC10474a) this.f38654y).mo17311a(singletonList);
                this.f25359e.sendEmptyMessageDelayed(2, ((Long) message.obj).longValue());
            }
        } else if (message.what == 2) {
            if (!this.f25355a.isEmpty() && (boVar = this.f25358d) != null && boVar.f23561d != null) {
                m19083a(Collections.singletonList(this.f25358d), this.f25358d.f23561d.f23571d);
            }
        } else if (message.what == 3) {
            m19084d();
        } else if (message.what == 4) {
            C9682bo boVar3 = this.f25358d;
            if (boVar3 == null || boVar3.f23560c == null) {
                mo17376b(true);
                return;
            }
            List<C10497b> singletonList2 = Collections.singletonList(new C10497b(this.f25358d.f23562e, C7557c.m15538a(this.f25358d.f23560c, ""), this.f25362h, Long.MAX_VALUE));
            m19086f();
            ((C10473a.AbstractC10474a) this.f38654y).mo17311a(singletonList2);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        int i;
        long j2;
        int i2;
        List<C9600ad> list;
        String str;
        long j3 = 0;
        if (iMessage instanceof C9687bs) {
            C9687bs bsVar = (C9687bs) iMessage;
            C9682bo boVar = bsVar.f23577a;
            if (boVar != null) {
                for (C9682bo boVar2 : this.f25355a) {
                    if (boVar2.f23562e == boVar.f23562e) {
                        int indexOf = this.f25355a.indexOf(boVar2);
                        if (indexOf != -1) {
                            this.f25355a.remove(indexOf);
                            this.f25355a.add(indexOf, boVar);
                            List<C9682bo> a = m19082a(this.f25355a);
                            Iterator<C9682bo> it = a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (it.next().f23558a) {
                                        break;
                                    }
                                } else {
                                    if (this.f25360f) {
                                        str = "displaying";
                                    } else {
                                        str = "hidden";
                                    }
                                    if (bsVar.f28134O != null) {
                                        j3 = bsVar.f28134O.f28138d;
                                    }
                                    mo17373a(-1, str, String.valueOf(j3), "receive message," + ((C10385d) this.f25365k).getRankDisabledReason());
                                }
                            }
                            mo17375b(a);
                            return;
                        }
                        return;
                    }
                }
            }
        } else if (iMessage instanceof C9601ae) {
            if (!(this.f25363i == null || this.f25355a.isEmpty())) {
                C9601ae aeVar = (C9601ae) iMessage;
                C9600ad adVar = null;
                ArrayList<C9600ad> arrayList = new ArrayList();
                if (aeVar.f23307a == null || aeVar.f23307a.isEmpty()) {
                    list = Collections.emptyList();
                } else {
                    list = Collections.unmodifiableList(aeVar.f23307a);
                }
                for (C9600ad adVar2 : list) {
                    if (adVar2.f23303a == this.f25363i.getOwnerUserId()) {
                        adVar = adVar2;
                    } else {
                        arrayList.add(adVar2);
                    }
                }
                if (adVar != null) {
                    arrayList.add(0, adVar);
                    ((IGiftService) C6193a.m13435a(IGiftService.class)).playGiftVideo(adVar.f23304b, new C10551k(this, arrayList));
                    if (adVar.f23306d != null) {
                        Room room = this.f25363i;
                        if (room != null) {
                            room.getOwner().setBorder(adVar.f23306d);
                        }
                        if (this.f18624w != null) {
                            this.f18624w.mo28315b(C10331a.class, adVar.f23306d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                for (C9600ad adVar3 : arrayList) {
                    this.f18625x.insertMessage(adVar3.f23305c, true);
                }
            }
        } else if (iMessage instanceof C9625ax) {
            if (m19085e() && !((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom()) {
                C9625ax axVar = (C9625ax) iMessage;
                if (!(axVar.f23441f == null || axVar.f23441f.isEmpty())) {
                    for (C9625ax.C9626a aVar : axVar.f23441f) {
                        this.f18625x.insertMessage(aVar.f23442a, true);
                    }
                }
            }
        } else if (iMessage instanceof C9725ch) {
            if (m19085e()) {
                C9725ch chVar = (C9725ch) iMessage;
                if (!(this.f25363i == null || chVar.f23717a != this.f25363i.getOwner().getId() || chVar.f23718f == null)) {
                    this.f25363i.getOwner().setBorder(chVar.f23718f);
                    if (this.f18624w != null) {
                        this.f18624w.mo28315b(C10331a.class, chVar.f23718f);
                    }
                }
            }
        } else if (iMessage instanceof C9694bz) {
            C9694bz bzVar = (C9694bz) iMessage;
            if (bzVar.f23626a == 30) {
                Room room2 = this.f25363i;
                if (!(room2 == null || room2.getRoomAuthStatus() == null)) {
                    this.f25363i.getRoomAuthStatus().setRankState(1);
                    if (!this.f25355a.isEmpty()) {
                        mo17375b(m19082a(this.f25355a));
                    }
                    m19084d();
                }
                Room room3 = this.f25363i;
                if (room3 != null) {
                    j2 = room3.getId();
                } else {
                    j2 = 0;
                }
                long c = C11115u.m19743a().mo17915b().mo13161c();
                Room room4 = this.f25363i;
                if (room4 != null) {
                    j3 = room4.getOwnerUserId();
                }
                Room room5 = this.f25363i;
                if (room5 == null || room5.getRoomAuthStatus() == null) {
                    i2 = 0;
                } else {
                    i2 = this.f25363i.getRoomAuthStatus().getRankState();
                }
                C10386a.m18894a(j2, c, j3, i2);
            } else if (bzVar.f23626a == 31) {
                Room room6 = this.f25363i;
                if (!(room6 == null || room6.getRoomAuthStatus() == null)) {
                    this.f25363i.getRoomAuthStatus().setRankState(2);
                    mo17376b(true);
                }
                Room room7 = this.f25363i;
                if (room7 != null) {
                    j = room7.getId();
                } else {
                    j = 0;
                }
                long c2 = C11115u.m19743a().mo17915b().mo13161c();
                Room room8 = this.f25363i;
                if (room8 != null) {
                    j3 = room8.getOwnerUserId();
                }
                Room room9 = this.f25363i;
                if (room9 == null || room9.getRoomAuthStatus() == null) {
                    i = 0;
                } else {
                    i = this.f25363i.getRoomAuthStatus().getRankState();
                }
                C10386a.m18894a(j, c2, j3, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo10297a(C10473a.AbstractC10474a aVar) {
        long j;
        int i;
        Room room;
        super.mo10297a((AbstractC8094bq) aVar);
        if (this.f18624w != null) {
            this.f25363i = (Room) this.f18624w.mo28318b(C9093de.class);
            this.f25357c = ((Boolean) this.f18624w.mo28318b(C9119ed.class)).booleanValue();
        }
        if (((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom()) {
            mo17112a(false);
        } else {
            mo17112a(true);
        }
        AbstractC10339d dVar = (AbstractC10339d) C6193a.m13435a(AbstractC10339d.class);
        this.f25365k = dVar;
        Room room2 = this.f25363i;
        if (room2 != null) {
            dVar.registerRankController(room2.getId(), this);
        }
        mo17376b(true);
        AbstractC10339d dVar2 = this.f25365k;
        if (dVar2 != null) {
            if (!(dVar2 instanceof C10385d) || (((C10385d) dVar2).matchAgeGate() && ((C10385d) this.f25365k).isRankAreaSupported())) {
                int value = LiveHourlyRankQueryEntranceDelaySetting.INSTANCE.getValue();
                if (value <= 0 || !this.f25357c) {
                    m19084d();
                } else {
                    this.f25359e.sendEmptyMessageDelayed(3, (long) value);
                }
                if (!(this.f18624w == null || (room = (Room) this.f18624w.mo28318b(C9093de.class)) == null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(EnumC10370g.HOURLY_RANK_ENTRANCE.getValue()).append(",").append(EnumC10370g.HOURLY_RANK_LIST.getValue()).append(",").append(EnumC10370g.HOURLY_RANK_BOTTOM.getValue());
                    ((AbstractC11181z) ((RankApi) C5805e.m12718a().mo11572a(RankApi.class)).getScoreDisplayConfig(room.getId(), sb.toString()).mo143271a(new C11191f()).mo143274a(mo13749v())).mo17950a(new C10549i(this), new C10550j(this));
                }
                Room room3 = this.f25363i;
                long j2 = 0;
                if (room3 != null) {
                    j = room3.getId();
                } else {
                    j = 0;
                }
                long c = C11115u.m19743a().mo17915b().mo13161c();
                Room room4 = this.f25363i;
                if (room4 != null) {
                    j2 = room4.getOwnerUserId();
                }
                Room room5 = this.f25363i;
                if (room5 == null || room5.getRoomAuthStatus() == null) {
                    i = 0;
                } else {
                    i = this.f25363i.getRoomAuthStatus().getRankState();
                }
                C10386a.m18894a(j, c, j2, i);
                this.f18625x.addMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
                return;
            }
            mo17373a(-1, (String) null, (String) null, ((C10385d) this.f25365k).getRankDisabledReason());
        }
    }

    /* renamed from: a */
    private void m19083a(List<C9682bo> list, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        for (C9682bo boVar : list) {
            if (boVar.f23560c != null) {
                int i = boVar.f23562e;
                C9698b bVar = boVar.f23560c;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                } else {
                    str2 = "#33000000";
                }
                arrayList.add(m19080a(i, bVar, str2, 5));
            }
        }
        ((C10473a.AbstractC10474a) this.f38654y).mo17311a((List<C10497b>) arrayList);
        m19086f();
    }

    /* renamed from: a */
    private C10497b m19080a(int i, C9698b bVar, String str, long j) {
        int i2;
        long millis;
        if (TextUtils.isEmpty(str)) {
            i2 = this.f25362h;
        } else {
            try {
                i2 = Color.parseColor(str);
            } catch (Exception unused) {
                i2 = this.f25362h;
            }
        }
        Spannable a = C7557c.m15538a(bVar, "");
        if (j == Long.MAX_VALUE) {
            millis = Long.MAX_VALUE;
        } else {
            millis = TimeUnit.SECONDS.toMillis(j);
        }
        return new C10497b(i, a, i2, millis);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17373a(int i, String str, String str2, String str3) {
        long j;
        Room room = this.f25363i;
        long j2 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        long c = C11115u.m19743a().mo17915b().mo13161c();
        Room room2 = this.f25363i;
        if (room2 != null) {
            j2 = room2.getOwnerUserId();
        }
        C10386a.m18893a(i, j, c, j2, str, str2, str3);
    }

    /* renamed from: a */
    private C10497b m19081a(int i, C9698b bVar, String str, long j, C9684bq bqVar) {
        int i2;
        long millis;
        if (TextUtils.isEmpty(str)) {
            i2 = this.f25362h;
        } else {
            try {
                i2 = Color.parseColor(str);
            } catch (Exception unused) {
                i2 = this.f25362h;
            }
        }
        C10387b a = C10387b.m18895a();
        long ownerUserId = this.f25363i.getOwnerUserId();
        long j2 = (long) bqVar.f23572e;
        int i3 = bqVar.f23573f;
        CharSequence a2 = C7557c.m15538a(bVar, "");
        if (a.f25071a != null && a.f25071a.f25054b != null && j2 >= ((long) a.f25071a.f25054b.f25059a) && (a.f25071a.f25055c == null || ((!a.f25071a.f25055c.f25045a || !(ownerUserId == 0 || ownerUserId == C11115u.m19743a().mo17915b().mo13161c())) && !a.mo17279a(a.f25071a.f25055c.f25047c)))) {
            a2 = new SpannableString(C10387b.m18896a(i3, a.f25071a.f25054b.f25060b));
        }
        if (j == Long.MAX_VALUE) {
            millis = Long.MAX_VALUE;
        } else {
            millis = TimeUnit.SECONDS.toMillis(j);
        }
        return new C10497b(i, a2, i2, millis);
    }
}
