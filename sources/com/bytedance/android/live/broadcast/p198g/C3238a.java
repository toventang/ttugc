package com.bytedance.android.live.broadcast.p198g;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.live.share.response.BatchShareUsersResult;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.g.a */
public final class C3238a {

    /* renamed from: a */
    public final List<User> f9289a = new ArrayList();

    /* renamed from: b */
    public final List<User> f9290b = new ArrayList();

    /* renamed from: c */
    public boolean f9291c;

    static {
        Covode.recordClassIndex(3719);
    }

    /* renamed from: com.bytedance.android.live.broadcast.g.a$b */
    static final class C3240b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3238a f9294a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88428a f9295b;

        static {
            Covode.recordClassIndex(3721);
        }

        C3240b(C3238a aVar, AbstractC88428a aVar2) {
            this.f9294a = aVar;
            this.f9295b = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f9294a.f9291c = false;
            AbstractC88428a aVar = this.f9295b;
            if (aVar != null) {
                aVar.mo8579a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.g.a$a */
    static final class C3239a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3238a f9292a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88428a f9293b;

        static {
            Covode.recordClassIndex(3720);
        }

        C3239a(C3238a aVar, AbstractC88428a aVar2) {
            this.f9292a = aVar;
            this.f9293b = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<User> recentlySharedUsers;
            List<User> topRankUsers;
            C5832d dVar = (C5832d) obj;
            this.f9292a.f9289a.clear();
            BatchShareUsersResult batchShareUsersResult = (BatchShareUsersResult) dVar.data;
            if (!(batchShareUsersResult == null || (topRankUsers = batchShareUsersResult.getTopRankUsers()) == null)) {
                this.f9292a.f9289a.addAll(topRankUsers);
            }
            this.f9292a.f9290b.clear();
            BatchShareUsersResult batchShareUsersResult2 = (BatchShareUsersResult) dVar.data;
            if (!(batchShareUsersResult2 == null || (recentlySharedUsers = batchShareUsersResult2.getRecentlySharedUsers()) == null)) {
                this.f9292a.f9290b.addAll(recentlySharedUsers);
            }
            this.f9292a.f9291c = false;
            AbstractC88428a aVar = this.f9293b;
            if (aVar != null) {
                aVar.mo8579a();
            }
        }
    }

    /* renamed from: a */
    public final void mo8580a(long j, AbstractC1204m mVar, AbstractC88428a aVar) {
        C89219l.m154721d(mVar, "");
        if (!this.f9291c) {
            this.f9291c = true;
            ((AbstractC11181z) ((ShareApi) C5805e.m12718a().mo11572a(ShareApi.class)).getBatchShareUsers(j).mo143271a(new C11191f()).mo143274a(C11152e.m19790a(mVar))).mo17950a(new C3239a(this, aVar), new C3240b(this, aVar));
        }
    }
}
