package com.bytedance.android.livesdk.list;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6538d;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;

public class MultiPlusFeedRoomListProvider extends AbstractC11768h implements AbstractC33974au {

    /* renamed from: a */
    List<Room> f22644a = new ArrayList();

    /* renamed from: b */
    List<EnterRoomConfig> f22645b = new ArrayList();

    /* renamed from: c */
    EnterRoomConfig f22646c;

    /* renamed from: d */
    boolean f22647d;

    /* renamed from: e */
    boolean f22648e;

    /* renamed from: f */
    C2965a f22649f;

    /* renamed from: g */
    final boolean f22650g;

    /* renamed from: h */
    final String f22651h;

    /* renamed from: i */
    final String f22652i;

    /* renamed from: j */
    final Long f22653j;

    /* renamed from: k */
    final List<Room> f22654k = new ArrayList();

    /* renamed from: l */
    List<EnterRoomConfig> f22655l = new ArrayList();

    /* renamed from: m */
    String f22656m;

    /* renamed from: n */
    HashSet<Long> f22657n = new HashSet<>();

    /* renamed from: o */
    final long[] f22658o;

    /* renamed from: p */
    private List<RoomInfo> f22659p = new ArrayList();

    /* renamed from: q */
    private HashMap<Long, String> f22660q = new HashMap<>();

    /* renamed from: r */
    private DrawRoomListModel f22661r;

    /* renamed from: s */
    private final Boolean f22662s;

    /* renamed from: t */
    private final int f22663t;

    /* renamed from: u */
    private final C88411a f22664u = new C88411a();

    /* renamed from: v */
    private int f22665v;

    /* renamed from: w */
    private int f22666w;

    static {
        Covode.recordClassIndex(10192);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final List<Room> mo14902b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22644a);
        arrayList.addAll(this.f22654k);
        return arrayList;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f22664u.mo142944a();
        C6538d.m13982d(null);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14898a() {
        return this.f22659p.size() + this.f22654k.size();
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final String mo15376b(long j) {
        String str = this.f22660q.get(Long.valueOf(j));
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    private void m17512b(EnterRoomConfig enterRoomConfig) {
        if (!(enterRoomConfig == null || enterRoomConfig.f28233c == null || enterRoomConfig.f28233c.f28313aC == null || !C11725f.f28051c.booleanValue())) {
            for (Map.Entry<Long, String> entry : enterRoomConfig.f28233c.f28313aC.entrySet()) {
                this.f22660q.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: d */
    private long[] m17513d(int i) {
        int size = this.f22659p.size();
        long[] jArr = new long[0];
        if (i >= this.f22666w) {
            int min = Math.min(size - i, 30);
            int i2 = (i + min) - 1;
            jArr = new long[min];
            m17511a(jArr, i, i2);
            if (this.f22665v == -1) {
                this.f22665v = i;
            }
            this.f22666w = i2;
        } else if (i <= this.f22665v) {
            int min2 = Math.min(30, i);
            int i3 = (i - min2) + 1;
            jArr = new long[min2];
            m17511a(jArr, i3, i);
            if (this.f22666w == -1) {
                this.f22666w = i;
            }
            this.f22665v = i3;
        }
        return jArr;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h, com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: c */
    public final Room mo14904c(int i) {
        if (i >= 0 && i < mo14898a()) {
            if (i < this.f22644a.size()) {
                if (i >= this.f22665v && i <= this.f22666w) {
                    return this.f22644a.get(i);
                }
                m17510a(m17513d(i), this.f22665v);
                return null;
            } else if (this.f22654k != null && this.f22655l.size() > i - this.f22644a.size()) {
                return this.f22654k.get(i - this.f22644a.size());
            }
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14899a(EnterRoomConfig enterRoomConfig) {
        long j = enterRoomConfig.f28233c.f28301R;
        for (int i = 0; i < mo14898a(); i++) {
            if (i < this.f22659p.size() && j == this.f22659p.get(i).getRoomId()) {
                return i;
            }
            int size = i - this.f22659p.size();
            if (size < this.f22654k.size() && j == this.f22654k.get(size).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final void mo14903b(int i) {
        String str;
        long j;
        if (!this.f22647d) {
            EnterRoomConfig enterRoomConfig = this.f22646c;
            if (enterRoomConfig == null || !"hourly_rank".equals(enterRoomConfig.f28233c.f28295L) || !this.f22646c.f28233c.f28294K) {
                if (this.f22661r == null) {
                    this.f22661r = new DrawRoomListModel();
                }
                if (TextUtils.equals(this.f22646c.f28233c.f28295L, EnumC10345i.WEEKLY_RANK.getRankName()) || TextUtils.equals(this.f22646c.f28233c.f28295L, "weekly_rank_notice")) {
                    str = "weekly_explore";
                } else {
                    str = "hourly_explore";
                }
                if (!TextUtils.isEmpty(this.f22656m) && this.f22656m.contains("/webcast/feed/")) {
                    if (C11725f.f28051c == null) {
                        C11725f.f28051c = Boolean.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline());
                    }
                    if (C11725f.f28051c.booleanValue()) {
                        this.f22656m += "&debug=true";
                    }
                }
                DrawRoomListModel drawRoomListModel = this.f22661r;
                C2965a aVar = this.f22649f;
                if (aVar == null) {
                    j = 0;
                } else {
                    j = aVar.f8718d;
                }
                this.f22664u.mo142945a(drawRoomListModel.getRoomList(j, str + "_draw_loadmore", LiveFeedDraw.getChannelId(str, "draw_loadmore"), this.f22646c.f28233c.f28301R, Long.parseLong(this.f22646c.f28233c.f28287D), this.f22656m).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9278c(this), new C9279d(this)));
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final EnterRoomConfig mo14900a(int i) {
        if (i < this.f22659p.size()) {
            C6538d.m13982d(this.f22646c.f28233c.f28295L);
            if (TextUtils.equals(this.f22646c.f28233c.f28295L, "weekly_rank_notice")) {
                C6538d.m13982d(EnumC10345i.WEEKLY_RANK.getRankName());
            }
        } else {
            C6538d.m13982d("live_merge_content");
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        if (i >= 0 && i < mo14898a()) {
            if (i < this.f22659p.size()) {
                if (i >= this.f22645b.size() || this.f22645b.get(i) == null) {
                    enterRoomConfig.f28233c.f28301R = this.f22659p.get(i).getRoomId();
                    enterRoomConfig.f28232b.f28258b = this.f22659p.get(i).getAnchorId();
                } else {
                    enterRoomConfig = this.f22645b.get(i);
                }
            } else if (i < mo14898a()) {
                if (i < this.f22659p.size() + this.f22655l.size()) {
                    enterRoomConfig = this.f22655l.get(i - this.f22659p.size());
                } else {
                    enterRoomConfig = C11760a.m20717a(this.f22654k.get(i - this.f22659p.size()), enterRoomConfig);
                    this.f22655l.add(enterRoomConfig);
                }
                enterRoomConfig.f28233c.f28293J = this.f22646c.f28233c.f28295L;
                enterRoomConfig.f28233c.f28295L = "draw_loadmore";
            }
            EnterRoomConfig enterRoomConfig2 = this.f22646c;
            if (enterRoomConfig2 != null) {
                if (!TextUtils.isEmpty(enterRoomConfig2.f28232b.f28257a)) {
                    enterRoomConfig.f28232b.f28257a = this.f22646c.f28232b.f28257a;
                }
                if (!TextUtils.isEmpty(this.f22646c.f28232b.f28263g)) {
                    enterRoomConfig.f28232b.f28263g = this.f22646c.f28232b.f28263g;
                }
            }
            enterRoomConfig.f28233c.f28345az = this.f22662s.booleanValue();
            enterRoomConfig.f28233c.f28312aB = this.f22663t;
        }
        return enterRoomConfig;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: a */
    public final void mo14901a(long j) {
        Iterator<Room> it = this.f22644a.iterator();
        while (it.hasNext()) {
            Room next = it.next();
            if (next == null || next.getId() == j) {
                it.remove();
            }
        }
        Iterator<EnterRoomConfig> it2 = this.f22645b.iterator();
        while (it2.hasNext()) {
            EnterRoomConfig next2 = it2.next();
            if (next2 != null && next2.f28233c.f28301R == j) {
                it2.remove();
            }
        }
        Iterator<RoomInfo> it3 = this.f22659p.iterator();
        while (it3.hasNext()) {
            RoomInfo next3 = it3.next();
            if (next3 == null || next3.getRoomId() == j) {
                it3.remove();
            }
        }
        Iterator<Room> it4 = this.f22654k.iterator();
        while (it4.hasNext()) {
            Room next4 = it4.next();
            if (next4 == null || next4.getId() == j) {
                it4.remove();
            }
        }
        Iterator<EnterRoomConfig> it5 = this.f22655l.iterator();
        while (it5.hasNext()) {
            EnterRoomConfig next5 = it5.next();
            if (next5 == null || next5.f28233c.f28301R == j) {
                it5.remove();
            }
        }
        this.f22657n.remove(Long.valueOf(j));
        mo18715f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15375a(List<FeedItem> list) {
        if (list != null && C11725f.f28051c.booleanValue()) {
            for (int i = 0; i < list.size(); i++) {
                FeedItem feedItem = list.get(i);
                if (!(feedItem == null || feedItem.getRoom() == null)) {
                    this.f22660q.put(Long.valueOf(feedItem.getRoom().getId()), feedItem.debugInfo);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m17509a(List<?> list, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            list.add(null);
        }
    }

    /* renamed from: a */
    private void m17510a(long[] jArr, int i) {
        if (jArr != null && jArr.length != 0 && !this.f22648e) {
            this.f22648e = true;
            this.f22664u.mo142945a(C7307f.m15213a(jArr).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9276a(this, i, jArr), new C9277b(this)));
        }
    }

    /* renamed from: a */
    private void m17511a(long[] jArr, int i, int i2) {
        for (int i3 = i; i3 <= i2; i3++) {
            jArr[i3 - i] = this.f22658o[i3];
        }
    }

    public MultiPlusFeedRoomListProvider(AbstractC1196i iVar, List<RoomInfo> list, int i, EnterRoomConfig enterRoomConfig, String str) {
        this.f22646c = enterRoomConfig;
        this.f22659p.addAll(list);
        this.f22656m = str;
        this.f22658o = new long[list.size()];
        m17509a(this.f22644a, list.size());
        m17509a(this.f22645b, list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null) {
                this.f22658o[i2] = list.get(i2).getRoomId();
            } else {
                this.f22658o[i2] = 0;
            }
        }
        this.f22653j = Long.valueOf(this.f22646c.f28233c.f28301R);
        this.f22650g = this.f22646c.f28233c.f28298O;
        this.f22651h = this.f22646c.f28233c.f28299P;
        this.f22652i = this.f22646c.f28233c.f28300Q;
        this.f22662s = Boolean.valueOf(this.f22646c.f28233c.f28345az);
        this.f22663t = this.f22646c.f28233c.f28312aB;
        iVar.mo4012a(this);
        this.f22665v = i;
        this.f22666w = i;
        m17510a(m17513d(i), i);
        m17512b(enterRoomConfig);
    }
}
