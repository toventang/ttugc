package com.bytedance.android.livesdk.live.p565b;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowFeedDrawLoopSetting;
import com.bytedance.android.livesdk.model.AbstractC9519af;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.live.b.a */
public final class C9288a extends AbstractC11768h {

    /* renamed from: k */
    public static final C9290b f22697k = new C9290b((byte) 0);

    /* renamed from: a */
    final ArrayList<Room> f22698a;

    /* renamed from: b */
    final ArrayList<EnterRoomConfig> f22699b;

    /* renamed from: c */
    final ArrayList<FeedItem> f22700c;

    /* renamed from: d */
    final HashMap<Long, String> f22701d = new HashMap<>();

    /* renamed from: e */
    final HashMap<String, HashSet<Long>> f22702e = new HashMap<>();

    /* renamed from: f */
    public C2965a f22703f;

    /* renamed from: g */
    long f22704g;

    /* renamed from: h */
    public String f22705h;

    /* renamed from: i */
    public boolean f22706i;

    /* renamed from: j */
    int f22707j;

    /* renamed from: l */
    private DrawRoomListModel f22708l;

    /* renamed from: m */
    private final HashSet<Long> f22709m = new HashSet<>();

    /* renamed from: n */
    private long f22710n;

    /* renamed from: o */
    private String f22711o;

    /* renamed from: p */
    private String f22712p;

    /* renamed from: q */
    private final C88411a f22713q;

    /* renamed from: r */
    private boolean f22714r;

    /* renamed from: s */
    private String f22715s;

    /* renamed from: t */
    private String f22716t;

    /* renamed from: u */
    private String f22717u;

    /* renamed from: v */
    private String f22718v;

    /* renamed from: w */
    private boolean f22719w;

    /* renamed from: x */
    private int f22720x;

    /* renamed from: y */
    private final boolean f22721y;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.live.b.a$e */
    public static final class C9293e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C9293e f22725a = new C9293e();

        static {
            Covode.recordClassIndex(10213);
        }

        C9293e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(10208);
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$b */
    public static final class C9290b {
        static {
            Covode.recordClassIndex(10210);
        }

        private C9290b() {
        }

        public /* synthetic */ C9290b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final List<Room> mo14902b() {
        return this.f22698a;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: c */
    public final void mo14905c() {
        this.f22709m.clear();
        this.f22702e.clear();
        this.f22699b.clear();
        this.f22698a.clear();
        this.f22713q.mo142944a();
        this.f22706i = false;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14898a() {
        C2965a aVar = this.f22703f;
        if (aVar == null || aVar.hasMore || this.f22698a.size() <= 0 || !C11279p.m20012a(Boolean.valueOf(FollowFeedDrawLoopSetting.INSTANCE.getValue().isEnable())) || this.f22698a.size() < FollowFeedDrawLoopSetting.INSTANCE.getValue().getThreshold() || !LiveFeedDraw.C9301a.m17578c(this.f22717u, this.f22718v)) {
            return this.f22699b.size();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final void mo15392e() {
        String str;
        AbstractC88979t<C5832d<Object>> collectUnreadRequest;
        HashMap<String, HashSet<Long>> hashMap = this.f22702e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, HashSet<Long>> entry : hashMap.entrySet()) {
            entry.getValue().removeAll(this.f22709m);
            if (entry.getValue().size() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            try {
                String str2 = (String) entry2.getKey();
                int a = C89361p.m154885a((CharSequence) entry2.getKey(), "_");
                if (str2 != null) {
                    str = str2.substring(0, a);
                    C89219l.m154716b(str, "");
                    if (this.f22708l == null) {
                        this.f22708l = new DrawRoomListModel();
                    }
                    DrawRoomListModel drawRoomListModel = this.f22708l;
                    if (!(drawRoomListModel == null || (collectUnreadRequest = drawRoomListModel.collectUnreadRequest(this.f22704g, this.f22710n, str, new ArrayList((Collection) entry2.getValue()))) == null)) {
                        collectUnreadRequest.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9289a(str), C9293e.f22725a);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } catch (Exception unused) {
                str = (String) entry2.getKey();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$d */
    static final class C9292d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C9288a f22724a;

        static {
            Covode.recordClassIndex(10212);
        }

        C9292d(C9288a aVar) {
            this.f22724a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.f22724a.f22706i = false;
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final String mo15376b(long j) {
        String str = this.f22701d.get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.live.b.a$a */
    public static final class C9289a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f22722a;

        static {
            Covode.recordClassIndex(10209);
        }

        C9289a(String str) {
            this.f22722a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9453a(3, "DrawRoomListProvider", "Collecting unread room result, extra: " + this.f22722a + ", statusCode: " + ((C5832d) obj).statusCode + '.');
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14899a(EnterRoomConfig enterRoomConfig) {
        long j;
        EnterRoomConfig.RoomsData roomsData;
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.f28233c) == null) {
            j = -1;
        } else {
            j = roomsData.f28301R;
        }
        int size = this.f22699b.size();
        for (int i = 0; i < size; i++) {
            EnterRoomConfig enterRoomConfig2 = this.f22699b.get(i);
            if (enterRoomConfig2.f28233c.f28301R == j && enterRoomConfig2 != null) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15390b(EnterRoomConfig enterRoomConfig) {
        if (this.f22714r && enterRoomConfig != null) {
            enterRoomConfig.f28233c.f28298O = this.f22714r;
            enterRoomConfig.f28233c.f28299P = this.f22715s;
            enterRoomConfig.f28233c.f28300Q = this.f22716t;
            enterRoomConfig.f28233c.f28345az = this.f22719w;
            enterRoomConfig.f28233c.f28312aB = this.f22720x;
            enterRoomConfig.f28233c.f28284A = this.f22711o;
            if (this.f22719w) {
                enterRoomConfig.f28233c.f28306W = "small_picture";
            } else {
                enterRoomConfig.f28233c.f28306W = "full_screen";
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h, com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: c */
    public final Room mo14904c(int i) {
        int size;
        if (this.f22698a.size() > 0 && (size = i % this.f22698a.size()) >= 0 && size < this.f22698a.size()) {
            return this.f22698a.get(size);
        }
        return null;
    }

    /* renamed from: c */
    private final void m17557c(EnterRoomConfig enterRoomConfig) {
        HashMap<Long, String> hashMap;
        if (C89219l.m154714a((Object) C11725f.f28051c, (Object) true) && (hashMap = enterRoomConfig.f28233c.f28313aC) != null) {
            for (Map.Entry<Long, String> entry : hashMap.entrySet()) {
                if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                    HashMap<Long, String> hashMap2 = this.f22701d;
                    Long key = entry.getKey();
                    C89219l.m154716b(key, "");
                    String value = entry.getValue();
                    C89219l.m154716b(value, "");
                    hashMap2.put(key, value);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final EnterRoomConfig mo14900a(int i) {
        int size;
        if (this.f22699b.size() <= 0 || (size = i % this.f22699b.size()) < 0 || size >= this.f22699b.size()) {
            return new EnterRoomConfig();
        }
        EnterRoomConfig enterRoomConfig = this.f22699b.get(size);
        C89219l.m154716b(enterRoomConfig, "");
        return enterRoomConfig;
    }

    /* renamed from: c */
    public final void mo15391c(long j) {
        this.f22709m.add(Long.valueOf(j));
        C3854a.m9453a(3, "DrawRoomListProvider", "Room " + j + " is showing.");
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$c */
    static final class C9291c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C9288a f22723a;

        static {
            Covode.recordClassIndex(10211);
        }

        C9291c(C9288a aVar) {
            this.f22723a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Pair pair = (Pair) obj;
            if (pair == null) {
                this.f22723a.f22706i = false;
                return;
            }
            this.f22723a.f22703f = (C2965a) pair.second;
            C9288a aVar = this.f22723a;
            List list = (List) pair.first;
            C2965a aVar2 = (C2965a) pair.second;
            if (list != null && !list.isEmpty()) {
                HashSet<Long> hashSet = new HashSet<>();
                Iterator<T> it = list.iterator();
                while (true) {
                    Room room = null;
                    if (it.hasNext()) {
                        T next = it.next();
                        if (next.item == null) {
                            try {
                                next.item = next.getRoom();
                                if ((next.type == 1 || next.type == 2) && (next.item instanceof Room)) {
                                    AbstractC9519af afVar = next.item;
                                    if (afVar != null) {
                                        Room room2 = (Room) afVar;
                                        room2.setLog_pb(next.logPb);
                                        User owner = room2.getOwner();
                                        if (owner != null) {
                                            owner.setLogPb(next.logPb);
                                        }
                                        room2.setRequestId(next.resId);
                                        room2.isFromRecommendCard = next.isRecommendCard;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        AbstractC9519af afVar2 = next.item;
                        if (afVar2 instanceof Room) {
                            room = afVar2;
                        }
                        Room room3 = room;
                        if (room3 != null) {
                            long j = aVar.f22704g;
                            User owner2 = room3.getOwner();
                            if (owner2 == null || j != owner2.getLiveRoomId()) {
                                room3.isFromRecommendCard = next.isRecommendCard;
                                aVar.f22698a.add(room3);
                                EnterRoomConfig a = C11760a.m20718a(room3, true);
                                if (C13627m.m24498a(a.f28231a.f28377d) && C13627m.m24498a(a.f28231a.f28375b)) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("roomid", Long.valueOf(a.f28233c.f28301R));
                                    C3868c.m9491a("ttlive_webcast_feed_empty_stream", 0, linkedHashMap);
                                }
                                C89219l.m154716b(a, "");
                                aVar.mo15390b(a);
                                aVar.f22699b.add(a);
                                aVar.f22700c.add(next);
                                hashSet.add(Long.valueOf(room3.getId()));
                                if (C89219l.m154714a((Object) C11725f.f28051c, (Object) true) && !TextUtils.isEmpty(next.debugInfo)) {
                                    HashMap<Long, String> hashMap = aVar.f22701d;
                                    Room room4 = next.getRoom();
                                    C89219l.m154716b(room4, "");
                                    Long valueOf = Long.valueOf(room4.getId());
                                    String str2 = next.debugInfo;
                                    C89219l.m154716b(str2, "");
                                    hashMap.put(valueOf, str2);
                                }
                            } else {
                                C3854a.m9453a(3, "DrawRoomListProvider", "Remove duplicate room " + aVar.f22704g);
                            }
                        }
                    } else if (!(aVar2 == null || (str = aVar2.f8716b) == null || str.length() == 0 || str == null)) {
                        aVar.f22702e.put(str + '_' + aVar.f22707j, hashSet);
                        aVar.f22707j++;
                    }
                }
            }
            this.f22723a.mo18715f();
            this.f22723a.f22706i = false;
        }
    }

    /* renamed from: d */
    private final void m17558d(EnterRoomConfig enterRoomConfig) {
        C2965a aVar;
        String str;
        long j;
        Long g;
        HashSet<Long> hashSet = new HashSet<>();
        this.f22714r = enterRoomConfig.f28233c.f28298O;
        this.f22715s = enterRoomConfig.f28233c.f28299P;
        this.f22716t = enterRoomConfig.f28233c.f28300Q;
        this.f22719w = enterRoomConfig.f28233c.f28345az;
        this.f22720x = enterRoomConfig.f28233c.f28312aB;
        SparseArray<EnterRoomConfig> sparseArray = enterRoomConfig.f28233c.f28285B;
        if (sparseArray != null) {
            int size = sparseArray.size() + 1;
            for (int i = 0; i < size; i++) {
                EnterRoomConfig enterRoomConfig2 = sparseArray.get(i);
                if (enterRoomConfig2 != null) {
                    mo15390b(enterRoomConfig2);
                    this.f22699b.add(enterRoomConfig2);
                    ArrayList<Room> arrayList = this.f22698a;
                    Room room = new Room();
                    room.setId(enterRoomConfig2.f28233c.f28301R);
                    room.setIdStr(String.valueOf(room.getId()));
                    room.isFromRecommendCard = !TextUtils.isEmpty(enterRoomConfig2.f28233c.f28309Z);
                    User user = new User();
                    String str2 = enterRoomConfig2.f28232b.f28258b;
                    if (str2 == null || (g = C89361p.m154865g(str2)) == null) {
                        j = 0;
                    } else {
                        j = g.longValue();
                    }
                    user.setId(j);
                    user.setIdStr(String.valueOf(user.getId()));
                    room.setOwner(user);
                    arrayList.add(room);
                    this.f22700c.add(new FeedItem());
                    hashSet.add(Long.valueOf(enterRoomConfig2.f28233c.f28301R));
                }
            }
            if (!(enterRoomConfig.f28233c.f28368x == null || enterRoomConfig.f28233c.f28367w == -1)) {
                C2965a aVar2 = new C2965a();
                Boolean bool = enterRoomConfig.f28233c.f28368x;
                if (bool == null) {
                    C89219l.m154715b();
                }
                aVar2.hasMore = bool.booleanValue();
                aVar2.f8718d = enterRoomConfig.f28233c.f28367w;
                this.f22703f = aVar2;
            }
            if (!C13627m.m24498a(enterRoomConfig.f28233c.f28366v)) {
                C2965a aVar3 = this.f22703f;
                if (aVar3 != null) {
                    aVar3.f8716b = enterRoomConfig.f28233c.f28366v;
                }
                C2965a aVar4 = this.f22703f;
                String str3 = null;
                if (aVar4 != null) {
                    str3 = aVar4.f8716b;
                }
                if (!(C13627m.m24498a(str3) || (aVar = this.f22703f) == null || (str = aVar.f8716b) == null || str.length() == 0 || str == null)) {
                    this.f22702e.put(str + '_' + this.f22707j, hashSet);
                    this.f22707j++;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: a */
    public final void mo14901a(long j) {
        if (!(C13603b.m24435a((Collection) this.f22698a) || C13603b.m24435a((Collection) this.f22699b) || C13603b.m24435a((Collection) this.f22700c))) {
            int size = this.f22698a.size();
            for (int i = 0; i < size; i++) {
                Room room = this.f22698a.get(i);
                C89219l.m154716b(room, "");
                if (room.getId() == j) {
                    if (this.f22699b.size() > i) {
                        this.f22699b.remove(i);
                    }
                    if (this.f22698a.size() > i) {
                        this.f22698a.remove(i);
                    }
                    if (this.f22700c.size() > i) {
                        this.f22700c.remove(i);
                    }
                    this.f22701d.remove(Long.valueOf(j));
                    mo18715f();
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final void mo14903b(int i) {
        long j;
        String str;
        String sb;
        String str2;
        if (this.f22704g > 0) {
            C2965a aVar = this.f22703f;
            if (aVar == null || aVar.hasMore) {
                if (this.f22708l == null) {
                    this.f22708l = new DrawRoomListModel();
                }
                if (!this.f22706i) {
                    String str3 = this.f22711o;
                    if (!TextUtils.isEmpty(str3) && C89361p.m154908a((CharSequence) str3, (CharSequence) "/webcast/feed/", false)) {
                        if (C11725f.f28051c == null) {
                            AbstractC2953a a = C6193a.m13435a(IHostContext.class);
                            C89219l.m154716b(a, "");
                            C11725f.f28051c = Boolean.valueOf(((IHostContext) a).isOffline());
                        }
                        if (C89219l.m154714a((Object) C11725f.f28051c, (Object) true) && !C89361p.m154908a((CharSequence) str3, (CharSequence) "&debug=true", false)) {
                            str3 = str3 + "&debug=true";
                        }
                    }
                    this.f22711o = str3;
                    DrawRoomListModel drawRoomListModel = this.f22708l;
                    if (drawRoomListModel != null) {
                        C2965a aVar2 = this.f22703f;
                        if (aVar2 != null) {
                            j = aVar2.f8718d;
                        } else {
                            j = 0;
                        }
                        if (this.f22721y) {
                            StringBuilder append = new StringBuilder().append(this.f22705h);
                            C2965a aVar3 = this.f22703f;
                            if (aVar3 == null || aVar3.f8718d == 0) {
                                str2 = "_draw_refresh";
                            } else {
                                str2 = "_draw_loadmore";
                            }
                            sb = append.append(str2).toString();
                        } else {
                            StringBuilder append2 = new StringBuilder().append(this.f22705h);
                            C2965a aVar4 = this.f22703f;
                            if (aVar4 == null || aVar4.f8718d == 0) {
                                str = "_refresh";
                            } else {
                                str = "_loadmore";
                            }
                            sb = append2.append(str).toString();
                        }
                        AbstractC88979t<Pair<List<FeedItem>, C2965a>> roomList = drawRoomListModel.getRoomList(j, sb, this.f22712p, this.f22704g, this.f22710n, this.f22711o);
                        if (roomList != null) {
                            this.f22706i = true;
                            this.f22713q.mo142945a(roomList.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9291c(this), new C9292d(this)));
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h, com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final void mo15389a(Room room) {
        if (room != null) {
            int size = this.f22698a.size();
            for (int i = 0; i < size; i++) {
                Room room2 = this.f22698a.get(i);
                C89219l.m154716b(room2, "");
                if (room2.getId() == room.getId()) {
                    this.f22698a.set(i, room);
                    return;
                }
            }
        }
    }

    public C9288a(EnterRoomConfig enterRoomConfig, String str, String str2, String str3) {
        long j;
        String str4;
        String str5;
        Long g;
        String str6 = "";
        C89219l.m154721d(enterRoomConfig, str6);
        C89219l.m154721d(str, str6);
        C89219l.m154721d(str2, str6);
        C89219l.m154721d(str3, str6);
        ArrayList<Room> arrayList = new ArrayList<>();
        this.f22698a = arrayList;
        ArrayList<EnterRoomConfig> arrayList2 = new ArrayList<>();
        this.f22699b = arrayList2;
        ArrayList<FeedItem> arrayList3 = new ArrayList<>();
        this.f22700c = arrayList3;
        this.f22711o = str6;
        this.f22705h = str6;
        this.f22712p = str6;
        this.f22713q = new C88411a();
        this.f22715s = str6;
        this.f22716t = str6;
        this.f22717u = str6;
        this.f22718v = str6;
        this.f22711o = str;
        this.f22704g = enterRoomConfig.f28233c.f28301R;
        String str7 = enterRoomConfig.f28233c.f28287D;
        if ((str7 == null && (str7 = enterRoomConfig.f28232b.f28258b) == null) || (g = C89361p.m154865g(str7)) == null) {
            j = 0;
        } else {
            j = g.longValue();
        }
        this.f22710n = j;
        this.f22717u = enterRoomConfig.f28233c.f28293J;
        this.f22718v = enterRoomConfig.f28233c.f28295L;
        if (str2.length() == 0) {
            C11870f fVar = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar, str6);
            EnterRoomLinkSession a = fVar.mo19010a();
            C89219l.m154716b(a, str6);
            EnterRoomConfig enterRoomConfig2 = a.f28391b;
            this.f22705h = LiveFeedDraw.C9301a.m17580e(enterRoomConfig2.f28233c.f28293J, enterRoomConfig2.f28233c.f28295L);
            if (TextUtils.isEmpty(enterRoomConfig2.f28233c.f28299P)) {
                str4 = str6;
            } else {
                str4 = enterRoomConfig2.f28233c.f28299P;
            }
            TextUtils.isEmpty(str4);
            if (TextUtils.equals(str4, "homepage_hot")) {
                str5 = "foru_";
            } else {
                str5 = str6;
            }
            String str8 = enterRoomConfig2.f28233c.f28293J;
            str8 = str8 == null ? str6 : str8;
            String str9 = enterRoomConfig2.f28233c.f28295L;
            this.f22705h = LiveFeedDraw.C9301a.m17576a(str8, str9 != null ? str9 : str6);
            this.f22705h = str5 + this.f22705h;
            if (enterRoomConfig2.f28233c.f28345az && LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
                this.f22705h = "drawer_draw";
            }
        } else {
            this.f22705h = str2;
        }
        if (str3.length() == 0) {
            this.f22712p = LiveFeedDraw.C9301a.m17577b(enterRoomConfig.f28233c.f28293J, enterRoomConfig.f28233c.f28295L);
        } else {
            this.f22712p = str3;
        }
        if (enterRoomConfig.f28233c.f28345az && LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            this.f22712p = "97";
        }
        if (C13627m.m24498a(enterRoomConfig.f28232b.f28258b)) {
            enterRoomConfig.f28232b.f28258b = String.valueOf(this.f22710n);
        }
        if (C13627m.m24498a(enterRoomConfig.f28232b.f28257a)) {
            enterRoomConfig.f28232b.f28257a = enterRoomConfig.f28232b.f28257a;
        }
        if (C13627m.m24498a(enterRoomConfig.f28232b.f28263g)) {
            enterRoomConfig.f28232b.f28263g = enterRoomConfig.f28232b.f28263g;
        }
        arrayList2.add(enterRoomConfig);
        Room room = new Room();
        room.setId(this.f22704g);
        room.setIdStr(String.valueOf(this.f22704g));
        User user = new User();
        user.setId(this.f22710n);
        user.setIdStr(String.valueOf(this.f22710n));
        room.setOwner(user);
        arrayList.add(room);
        this.f22721y = !TextUtils.isEmpty(enterRoomConfig.f28233c.f28339at);
        arrayList3.add(new FeedItem());
        m17558d(enterRoomConfig);
        m17557c(enterRoomConfig);
        C3854a.m9453a(3, "DrawRoomListProvider", "Enter room id: " + this.f22704g + ", anchor id: " + this.f22710n + ", request from: " + this.f22705h + ", channel id: " + this.f22712p);
    }
}
