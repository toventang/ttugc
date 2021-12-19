package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.feed.C8508c;
import com.bytedance.android.livesdk.feed.p524b.AbstractC8494b;
import com.bytedance.android.livesdk.feed.p524b.AbstractC8495c;
import com.bytedance.android.livesdk.feed.p536l.C8641a;
import com.bytedance.android.livesdk.live.model.C9304c;
import com.bytedance.android.livesdk.livesetting.feed.InboxTopLivesCacheExpiredTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxTopLivesCollectUnreadSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.feed.u */
public final class C8707u {

    /* renamed from: e */
    public static final AbstractC89244h f21472e = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C8709b.f21478a);

    /* renamed from: f */
    public static final C8708a f21473f = new C8708a((byte) 0);

    /* renamed from: a */
    public C8641a f21474a;

    /* renamed from: b */
    public boolean f21475b;

    /* renamed from: c */
    public long f21476c;

    /* renamed from: d */
    public long f21477d;

    /* renamed from: com.bytedance.android.livesdk.feed.u$a */
    public static final class C8708a {
        static {
            Covode.recordClassIndex(9576);
        }

        /* renamed from: a */
        public static C8707u m17008a() {
            return (C8707u) C8707u.f21472e.getValue();
        }

        private C8708a() {
        }

        public /* synthetic */ C8708a(byte b) {
            this();
        }
    }

    private C8707u() {
    }

    /* renamed from: com.bytedance.android.livesdk.feed.u$b */
    static final class C8709b extends AbstractC89220m implements AbstractC89171a<C8707u> {

        /* renamed from: a */
        public static final C8709b f21478a = new C8709b();

        static {
            Covode.recordClassIndex(9577);
        }

        C8709b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C8707u invoke() {
            return new C8707u((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(9575);
    }

    /* renamed from: a */
    public final C8641a mo14987a() {
        List<FeedItem> list;
        C8641a aVar;
        List<FeedItem> list2;
        FeedItem remove;
        List<FeedItem> list3;
        C2965a aVar2 = null;
        if (System.currentTimeMillis() - this.f21477d > ((long) (InboxTopLivesCacheExpiredTimeSetting.INSTANCE.getValue() * 1000))) {
            C8641a aVar3 = this.f21474a;
            if (!(aVar3 == null || (list3 = aVar3.f21360a) == null)) {
                list3.clear();
            }
            return null;
        } else if (this.f21475b) {
            return null;
        } else {
            C8641a aVar4 = this.f21474a;
            int i = 0;
            if (aVar4 == null || (list = aVar4.f21360a) == null || list.size() <= 0 || (aVar = this.f21474a) == null || (list2 = aVar.f21360a) == null || (remove = list2.remove(0)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            do {
                arrayList.add(remove);
                i++;
            } while (i <= 0);
            C8641a aVar5 = this.f21474a;
            if (aVar5 != null) {
                aVar2 = aVar5.f21361b;
            }
            return new C8641a(arrayList, aVar2);
        }
    }

    /* renamed from: b */
    public final String mo14989b() {
        String str;
        List<FeedItem> list;
        C8641a aVar = this.f21474a;
        if (aVar == null || (list = aVar.f21360a) == null) {
            str = "";
        } else {
            Iterator<T> it = list.iterator();
            str = "";
            while (it.hasNext()) {
                StringBuilder append = new StringBuilder().append(str);
                Room room = it.next().getRoom();
                C89219l.m154716b(room, "");
                str = append.append(room.getId()).append(",").toString();
            }
        }
        if (!C89361p.m154876c(str, ",", false)) {
            return str;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(0, str.length() - 1);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: com.bytedance.android.livesdk.feed.u$c */
    public static final class C8710c implements AbstractC8494b {

        /* renamed from: a */
        final /* synthetic */ C8707u f21479a;

        static {
            Covode.recordClassIndex(9578);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C8710c(C8707u uVar) {
            this.f21479a = uVar;
        }

        @Override // com.bytedance.android.livesdk.feed.p524b.AbstractC8494b
        /* renamed from: a */
        public final void mo14814a(List<? extends C9304c> list) {
            List<FeedItem> list2;
            ArrayList arrayList;
            List<FeedItem> list3;
            C8641a aVar = this.f21479a.f21474a;
            int i = 0;
            if (aVar != null) {
                C8641a aVar2 = this.f21479a.f21474a;
                if (aVar2 == null || (list3 = aVar2.f21360a) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (T t : list3) {
                        T t2 = t;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Long.valueOf(it.next().f22741a));
                            }
                            Room room = t2.getRoom();
                            C89219l.m154716b(room, "");
                            if (arrayList2.contains(Long.valueOf(room.getId()))) {
                                arrayList.add(t);
                            }
                        }
                    }
                }
                aVar.f21360a = C89206ad.m154682d(arrayList);
            }
            C8641a aVar3 = this.f21479a.f21474a;
            if (!(aVar3 == null || (list2 = aVar3.f21360a) == null)) {
                i = list2.size();
            }
            this.f21479a.mo14988a(i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.u$d */
    public static final class C8711d implements AbstractC8495c {

        /* renamed from: a */
        final /* synthetic */ C8707u f21480a;

        static {
            Covode.recordClassIndex(9579);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C8711d(C8707u uVar) {
            this.f21480a = uVar;
        }

        @Override // com.bytedance.android.livesdk.feed.p524b.AbstractC8495c
        /* renamed from: a */
        public final void mo13829a(C8641a aVar) {
            if (aVar != null) {
                this.f21480a.f21474a = aVar;
                this.f21480a.f21475b = false;
            }
        }

        @Override // com.bytedance.android.livesdk.feed.p524b.AbstractC8495c
        /* renamed from: a */
        public final void mo13830a(Throwable th) {
            String str;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            C3854a.m9456a(str);
        }
    }

    public /* synthetic */ C8707u(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo14988a(int i) {
        String str;
        C2965a aVar;
        if (InboxTopLivesCollectUnreadSetting.INSTANCE.getValue()) {
            if (i > 0 || !this.f21475b) {
                C8641a aVar2 = this.f21474a;
                if (aVar2 == null || (aVar = aVar2.f21361b) == null || (str = aVar.f8716b) == null) {
                    str = "";
                }
                String b = mo14989b();
                C89219l.m154721d(str, "");
                C89219l.m154721d(b, "");
                ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).collectUnreadRequest(str, b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8508c.C8519k(str), C8508c.C8520l.f21067a);
            }
        }
    }
}
