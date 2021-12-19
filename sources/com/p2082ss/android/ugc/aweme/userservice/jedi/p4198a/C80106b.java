package com.p2082ss.android.ugc.aweme.userservice.jedi.p4198a;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.p2082ss.android.ugc.aweme.base.livedata.C34603a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.userservice.jedi.C80104a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b */
public final class C80106b {

    /* renamed from: a */
    public final ConcurrentHashMap<String, User> f179501a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final AbstractC1214u<FollowStatus> f179502b = new C80110c(this);

    static {
        Covode.recordClassIndex(93346);
    }

    public C80106b() {
        new Handler(Looper.getMainLooper()).post(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.userservice.jedi.p4198a.C80106b.RunnableC801071 */

            /* renamed from: a */
            final /* synthetic */ C80106b f179503a;

            static {
                Covode.recordClassIndex(93347);
            }

            {
                this.f179503a = r1;
            }

            public final void run() {
                C34603a.C34604a.f81659a.mo61063a("#FollowStatus").observeForever(this.f179503a.f179502b);
            }
        });
        C20165b.m38137a(C80104a.f179497b.f179515e).mo33476a(true, new AbstractC20168e[0]).mo143261a(C88925a.m154184d(C88946a.f201989a)).mo143292d(new C80108a(this)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C80109b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$c */
    static final class C80110c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C80106b f179506a;

        static {
            Covode.recordClassIndex(93350);
        }

        C80110c(C80106b bVar) {
            this.f179506a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            FollowStatus followStatus = (FollowStatus) obj;
            if (followStatus != null && (str = followStatus.userId) != null) {
                C80104a.f179496a.mo33456a(str).mo143289d(new C80111a(followStatus, this, followStatus));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$c$a */
        static final class C80111a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ FollowStatus f179507a;

            /* renamed from: b */
            final /* synthetic */ C80110c f179508b;

            /* renamed from: c */
            final /* synthetic */ FollowStatus f179509c;

            static {
                Covode.recordClassIndex(93351);
            }

            C80111a(FollowStatus followStatus, C80110c cVar, FollowStatus followStatus2) {
                this.f179507a = followStatus;
                this.f179508b = cVar;
                this.f179509c = followStatus2;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                User clone;
                User user = (User) ((C20169f) obj).mo33486a();
                if (user != null && (clone = user.clone()) != null) {
                    C89219l.m154716b(clone, "");
                    if (clone.getFollowStatus() != this.f179507a.followStatus) {
                        clone.setFollowStatus(this.f179507a.followStatus);
                        ConcurrentHashMap<String, User> concurrentHashMap = this.f179508b.f179506a.f179501a;
                        String uid = clone.getUid();
                        C89219l.m154716b(uid, "");
                        concurrentHashMap.put(uid, clone);
                        if (clone.getFollowStatus() == 0) {
                            clone.setLivePushNotificationStatus(2);
                        }
                        C80114e eVar = C80104a.f179496a;
                        String uid2 = clone.getUid();
                        C89219l.m154716b(uid2, "");
                        eVar.mo33457a(uid2, clone);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$b */
    static final class C80109b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C80106b f179505a;

        static {
            Covode.recordClassIndex(93349);
        }

        C80109b(C80106b bVar) {
            this.f179505a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            if (!(list == null || list.isEmpty())) {
                for (T t : list) {
                    if (t != null) {
                        new FollowStatusEvent(t).post();
                    }
                    C34603a.C34604a.f81659a.mo61063a("#FollowStatus").postValue(t);
                    if (C76660b.m134243c()) {
                        C77260g.f173332a.mo120157e().mo120175a((FollowStatus) t);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$a */
    static final class C80108a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C80106b f179504a;

        static {
            Covode.recordClassIndex(93348);
        }

        C80108a(C80106b bVar) {
            this.f179504a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            List list = (List) obj;
            C89219l.m154721d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                User user = this.f179504a.f179501a.get(t.getFirst());
                User user2 = (User) t.getSecond();
                if (!(user == null || user2 == null || user.getFollowStatus() == user2.getFollowStatus())) {
                    FollowStatus followStatus = new FollowStatus(user2.getUid(), user2.getFollowStatus());
                    if (user.getFollowStatus() == 0 || user2.getFollowStatus() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    followStatus.isFollowChange = z;
                    arrayList.add(followStatus);
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).updateIMUserFollowStatus(user2);
                }
                this.f179504a.f179501a.put(t.getFirst(), t.getSecond());
            }
            return arrayList;
        }
    }
}
