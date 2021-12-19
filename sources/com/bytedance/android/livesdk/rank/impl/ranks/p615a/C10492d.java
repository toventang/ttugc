package com.bytedance.android.livesdk.rank.impl.ranks.p615a;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.C10430g;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m;
import com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.d */
public final class C10492d implements C10489c.AbstractC10490a {

    /* renamed from: a */
    public C10489c.AbstractC10491b f25253a;

    /* renamed from: b */
    final Map<Integer, CountDownTimerC10428m> f25254b = new LinkedHashMap();

    /* renamed from: c */
    public final long f25255c;

    /* renamed from: d */
    private boolean f25256d = true;

    /* renamed from: e */
    private int f25257e;

    /* renamed from: f */
    private WeeklyRankRegionInfo f25258f;

    /* renamed from: g */
    private final long f25259g;

    /* renamed from: h */
    private final DataChannel f25260h;

    /* renamed from: i */
    private final ArrayList<Integer> f25261i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.d$d */
    public static final class C10496d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10496d f25268a = new C10496d();

        static {
            Covode.recordClassIndex(12071);
        }

        C10496d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12067);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: d */
    public final void mo17330d() {
        this.f25256d = false;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: c */
    public final Map<Integer, CountDownTimerC10428m> mo17329c() {
        return this.f25254b;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: e */
    public final boolean mo17331e() {
        return this.f25256d;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: f */
    public final int mo17332f() {
        return this.f25257e;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: g */
    public final WeeklyRankRegionInfo mo17333g() {
        return this.f25258f;
    }

    /* renamed from: h */
    private static boolean m19022h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: a */
    public final void mo17325a() {
        for (Map.Entry<Integer, CountDownTimerC10428m> entry : this.f25254b.entrySet()) {
            entry.getValue().cancel();
        }
        this.f25254b.clear();
        this.f25253a = null;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: b */
    public final void mo17328b() {
        C10489c.AbstractC10491b bVar = this.f25253a;
        if (bVar != null) {
            bVar.mo17316a();
        }
        if (C3966y.m9669e() != null) {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m19022h();
            }
            if (!C58029j.f132256h) {
                C10489c.AbstractC10491b bVar2 = this.f25253a;
                if (bVar2 != null) {
                    bVar2.mo17318b();
                }
                C10489c.AbstractC10491b bVar3 = this.f25253a;
                if (bVar3 != null) {
                    bVar3.mo17319c();
                    return;
                }
                return;
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC88979t<R> a = ((RankApi) C5805e.m12718a().mo11572a(RankApi.class)).getRankList(this.f25259g, this.f25255c, C89070n.m154551a(this.f25261i, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62), this.f25257e).mo143271a(new C11191f());
        C10489c.AbstractC10491b bVar4 = this.f25253a;
        Objects.requireNonNull(bVar4, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.dialog.RankFragment");
        a.mo143271a(C11195i.m19838a((C10480b) bVar4, EnumC11186b.DESTROY)).mo143254a(new C10493a(this, uptimeMillis), new C10494b(this));
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: a */
    public final void mo17327a(C10489c.AbstractC10491b bVar) {
        C89219l.m154721d(bVar, "");
        this.f25253a = bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.d$b */
    static final class C10494b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10492d f25264a;

        static {
            Covode.recordClassIndex(12069);
        }

        C10494b(C10492d dVar) {
            this.f25264a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C10489c.AbstractC10491b bVar = this.f25264a.f25253a;
            if (bVar != null) {
                bVar.mo17318b();
            }
            C10489c.AbstractC10491b bVar2 = this.f25264a.f25253a;
            if (bVar2 != null) {
                bVar2.mo17320d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.d$c */
    public static final class C10495c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10492d f25265a;

        /* renamed from: b */
        final /* synthetic */ int f25266b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f25267c;

        static {
            Covode.recordClassIndex(12070);
        }

        C10495c(C10492d dVar, int i, AbstractC89172b bVar) {
            this.f25265a = dVar;
            this.f25266b = i;
            this.f25267c = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            if (dVar.statusCode == 0 && (!((RankResponse) dVar.data).getPages().isEmpty()) && ((RankResponse) dVar.data).getPages().get(0).getRankType() == this.f25266b) {
                this.f25265a.mo17334a(((RankResponse) dVar.data).getPages().get(0));
                this.f25267c.invoke(((RankResponse) dVar.data).getPages().get(0));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.d$a */
    static final class C10493a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10492d f25262a;

        /* renamed from: b */
        final /* synthetic */ long f25263b;

        static {
            Covode.recordClassIndex(12068);
        }

        C10493a(C10492d dVar, long j) {
            this.f25262a = dVar;
            this.f25263b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            long j = this.f25262a.f25255c;
            long j2 = this.f25263b;
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "room_id", j);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            C3866a.m9474a(jSONObject, "user_id", b.mo13161c());
            C3868c.m9490a("ttlive_hourly_rank_list_duration", 0, SystemClock.uptimeMillis() - j2, jSONObject);
            C10489c.AbstractC10491b bVar = this.f25262a.f25253a;
            if (bVar != null) {
                bVar.mo17318b();
            }
            if (dVar.statusCode == 0) {
                RankResponse rankResponse = (RankResponse) dVar.data;
                if (rankResponse.getShowIndex() < rankResponse.getPages().size()) {
                    Iterator<T> it = ((RankResponse) dVar.data).getPages().iterator();
                    while (it.hasNext()) {
                        this.f25262a.mo17334a((RankPage) it.next());
                    }
                    C10492d dVar2 = this.f25262a;
                    for (RankPage rankPage : rankResponse.getPages()) {
                        Map<Integer, CountDownTimerC10428m> map = dVar2.f25254b;
                        Integer valueOf = Integer.valueOf(rankPage.getRankType());
                        CountDownTimerC10428m mVar = new CountDownTimerC10428m(((long) rankPage.getCountdown()) * 1000);
                        mVar.start();
                        map.put(valueOf, mVar);
                    }
                    C10489c.AbstractC10491b bVar2 = this.f25262a.f25253a;
                    if (bVar2 != null) {
                        C89219l.m154716b(rankResponse, "");
                        bVar2.mo17317a(rankResponse);
                        return;
                    }
                    return;
                }
                C10489c.AbstractC10491b bVar3 = this.f25262a.f25253a;
                if (bVar3 != null) {
                    bVar3.mo17320d();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17334a(RankPage rankPage) {
        WeeklyRankRegionInfo regionInfo;
        if (rankPage.getRankType() == EnumC10345i.WEEKLY_RANK.getType() && (regionInfo = rankPage.getRegionInfo()) != null) {
            this.f25257e = regionInfo.getCurrentType();
            this.f25258f = regionInfo;
            DataChannel dataChannel = this.f25260h;
            if (dataChannel != null) {
                dataChannel.mo28311a(C10430g.class, regionInfo);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10490a
    /* renamed from: a */
    public final void mo17326a(int i, Fragment fragment, AbstractC89172b<? super RankPage, C89391z> bVar) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(bVar, "");
        ((RankApi) C5805e.m12718a().mo11572a(RankApi.class)).getRankList(this.f25259g, this.f25255c, String.valueOf(i), this.f25257e).mo143271a(new C11191f()).mo143271a(C11195i.m19838a(fragment, EnumC11186b.DESTROY)).mo143254a(new C10495c(this, i, bVar), C10496d.f25268a);
    }

    public C10492d(long j, long j2, DataChannel dataChannel, ArrayList<Integer> arrayList, int i) {
        C89219l.m154721d(arrayList, "");
        this.f25259g = j;
        this.f25255c = j2;
        this.f25260h = dataChannel;
        this.f25261i = arrayList;
        this.f25257e = i;
    }
}
