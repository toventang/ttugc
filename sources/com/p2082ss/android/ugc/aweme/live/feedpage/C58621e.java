package com.p2082ss.android.ugc.aweme.live.feedpage;

import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2141e.AbstractC29907c;
import com.p2082ss.android.ugc.aweme.app.C33748g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.live.Live;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.e */
public class C58621e implements AbstractC58619c {

    /* renamed from: a */
    public static final String f133503a = C58621e.class.getSimpleName();

    /* renamed from: b */
    public static final Long f133504b = 0L;

    /* renamed from: i */
    public static AbstractC29907c<C58621e> f133505i = new AbstractC29907c<C58621e>() {
        /* class com.p2082ss.android.ugc.aweme.live.feedpage.C58621e.C586221 */

        static {
            Covode.recordClassIndex(68922);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.p2141e.AbstractC29907c
        /* renamed from: a */
        public final /* synthetic */ C58621e mo52218a() {
            return new C58621e();
        }
    };

    /* renamed from: c */
    public Map<Long, Long> f133506c = new HashMap(20);

    /* renamed from: d */
    public Map<Long, Long> f133507d = new HashMap(20);

    /* renamed from: e */
    public LruCache<Long, Long> f133508e = new LruCache<>(19);

    /* renamed from: f */
    Map<Long, Long> f133509f = new HashMap(40);

    /* renamed from: g */
    LruCache<Long, Long> f133510g = new LruCache<>(40);

    /* renamed from: h */
    public LiveStateApi f133511h = ((LiveStateApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://" + Live.getLiveDomain()).create(LiveStateApi.class));

    /* renamed from: j */
    private RunnableC58623a f133512j = null;

    /* renamed from: k */
    private ArrayDeque<RunnableC58623a> f133513k = new ArrayDeque<>(10);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.feedpage.e$a */
    public final class RunnableC58623a implements Runnable {

        /* renamed from: a */
        public boolean f133514a;

        /* renamed from: b */
        final Long f133515b;

        /* renamed from: c */
        Set<Long> f133516c;

        /* renamed from: d */
        List<AbstractC88433f<Map<Long, Long>>> f133517d;

        /* renamed from: f */
        private final Long f133519f;

        /* renamed from: g */
        private String f133520g;

        static {
            Covode.recordClassIndex(68923);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo96089a() {
            this.f133514a = false;
            m107757a(C58621e.this.f133506c);
            C58621e.this.mo96088a();
        }

        public final void run() {
            this.f133514a = true;
            if (!(this.f133515b == null || this.f133519f == null)) {
                C58621e.this.f133508e.put(this.f133515b, this.f133519f);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            if (this.f133515b.longValue() != 0) {
                Long l = C58621e.this.f133507d.get(Long.valueOf(this.f133515b.longValue()));
                if (l != null) {
                    j = l.longValue();
                }
                if (currentTimeMillis - Long.valueOf(j).longValue() < C58621e.m107746b()) {
                    mo96089a();
                    return;
                }
            }
            this.f133516c = new HashSet(C58621e.this.f133508e.snapshot().keySet());
            StringBuilder sb = new StringBuilder();
            this.f133516c.add(this.f133515b);
            if (!C13603b.m24435a((Collection) this.f133516c)) {
                for (Long l2 : this.f133516c) {
                    sb.append(String.valueOf(l2)).append(",");
                }
            }
            String sb2 = sb.toString();
            if (sb2.endsWith(",")) {
                sb2 = sb2.substring(0, sb2.length() - 1);
            }
            C58621e.this.f133511h.liveStates(sb2, this.f133520g).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C58626h(this, currentTimeMillis), new C58627i(this));
        }

        /* renamed from: a */
        private void m107757a(Map<Long, Long> map) {
            if (!C13603b.m24435a((Collection) this.f133517d)) {
                for (AbstractC88433f<Map<Long, Long>> fVar : this.f133517d) {
                    try {
                        fVar.accept(map);
                    } catch (Exception e) {
                        C51423a.m95792b("LiveStateManager", "onResult:" + Log.getStackTraceString(e));
                    }
                }
            }
        }

        RunnableC58623a(Long l, Long l2, AbstractC88433f<Map<Long, Long>> fVar, String str) {
            ArrayList arrayList = new ArrayList(3);
            this.f133517d = arrayList;
            this.f133515b = l;
            this.f133519f = l2;
            this.f133520g = str;
            arrayList.add(fVar);
        }
    }

    static {
        Covode.recordClassIndex(68921);
    }

    /* renamed from: c */
    private static boolean m107748c() {
        if (C33748g.m69093a()) {
            return false;
        }
        return LiveHostOuterService.m107232p().mo95815g();
    }

    /* renamed from: a */
    public final void mo96088a() {
        RunnableC58623a aVar = this.f133512j;
        if (aVar == null || !aVar.f133514a) {
            RunnableC58623a pollLast = this.f133513k.pollLast();
            this.f133512j = pollLast;
            if (pollLast != null) {
                pollLast.run();
            }
        }
    }

    /* renamed from: d */
    private static boolean m107749d() {
        if (!((Boolean) LiveOuterService.m107269s().mo95830d().mo12981a("enable_refresh_foru_avatar_live_status", (Object) false)).booleanValue() && !m107748c()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static long m107746b() {
        try {
            if (((Boolean) LiveOuterService.m107269s().mo95830d().mo12981a("enable_refresh_foru_avatar_live_status", (Object) false)).booleanValue()) {
                return (long) ((Integer) LiveOuterService.m107269s().mo95830d().mo12981a("mt_refresh_foru_avatar_live_state_interval", (Object) 60000)).intValue();
            }
            return LiveHostOuterService.m107232p().mo95816h();
        } catch (Exception unused) {
            return 60000;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c
    /* renamed from: a */
    public final void mo96083a(long j) {
        this.f133506c.remove(Long.valueOf(j));
        this.f133507d.remove(Long.valueOf(j));
        this.f133508e.remove(Long.valueOf(j));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c
    /* renamed from: b */
    public final void mo96087b(List<FollowFeed> list) {
        LiveRoomStruct newLiveRoomData;
        if (!m107749d() && !C13603b.m24435a((Collection) list)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (FollowFeed followFeed : list) {
                if (followFeed.getFeedType() == 65298) {
                    RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
                    if (!(roomStruct == null || (newLiveRoomData = roomStruct.getNewLiveRoomData()) == null)) {
                        newLiveRoomData.owner.roomId = newLiveRoomData.f114485id;
                        m107745a(currentTimeMillis, newLiveRoomData.owner);
                        m107747b(currentTimeMillis, newLiveRoomData.owner);
                    }
                } else {
                    Aweme aweme = followFeed.getAweme();
                    if (aweme != null) {
                        m107745a(currentTimeMillis, aweme.getAuthor());
                        m107747b(currentTimeMillis, aweme.getAuthor());
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c
    /* renamed from: a */
    public final void mo96086a(List<Aweme> list) {
        if (!(m107749d() || C13603b.m24435a((Collection) list))) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Aweme aweme : list) {
                if ("homepage_follow".equals(Integer.valueOf(aweme.getAwemeType()))) {
                    aweme.getAwemeType();
                }
                if (aweme.getAuthor() != null) {
                    m107745a(currentTimeMillis, aweme.getAuthor());
                }
                m107747b(currentTimeMillis, aweme.getAuthor());
            }
        }
    }

    /* renamed from: b */
    private void m107747b(long j, User user) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            this.f133510g.put(valueOf, Long.valueOf(user.roomId));
            this.f133509f.put(valueOf, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    private void m107745a(long j, User user) {
        if (!m107749d() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            if (user.roomId != 0) {
                this.f133506c.put(valueOf, Long.valueOf(user.roomId));
                this.f133507d.put(valueOf, Long.valueOf(j));
                this.f133508e.put(valueOf, Long.valueOf(user.roomId));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c
    /* renamed from: a */
    public final void mo96084a(User user, AbstractC88433f<Map<Long, Long>> fVar, String str) {
        if (!m107749d() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            RunnableC58623a aVar = this.f133512j;
            if (aVar == null || aVar.f133516c == null || !aVar.f133516c.contains(valueOf)) {
                this.f133513k.addFirst(new RunnableC58623a(valueOf, Long.valueOf(user.roomId), fVar, str));
                mo96088a();
                return;
            }
            this.f133512j.f133517d.add(fVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c
    /* renamed from: a */
    public final void mo96085a(User user, List<User> list, AbstractC88433f<Long> fVar, String str) {
        long j;
        if (user != null) {
            long j2 = 0;
            try {
                j = Long.parseLong(user.getUid());
            } catch (Exception e) {
                e.printStackTrace();
                j = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.f133509f.get(Long.valueOf(j));
            if (l != null) {
                j2 = l.longValue();
            }
            if (currentTimeMillis - Long.valueOf(j2).longValue() < m107746b()) {
                try {
                    fVar.accept(this.f133510g.get(Long.valueOf(j)));
                } catch (Exception e2) {
                    C51423a.m95792b("LiveStateManager", "onResult:" + Log.getStackTraceString(e2));
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(user.getUid()).append(",");
                if (!C13603b.m24435a((Collection) list)) {
                    for (User user2 : list) {
                        sb.append(user2.getUid()).append(",");
                    }
                }
                String sb2 = sb.toString();
                if (sb2.endsWith(",")) {
                    sb2 = sb2.substring(0, sb2.length() - 1);
                }
                this.f133511h.liveStates(sb2, str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C58624f(this, fVar, j, list), C58625g.f133525a);
            }
        }
    }
}
