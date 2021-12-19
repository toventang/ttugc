package com.bytedance.android.livesdk.feed.repository;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.feed.AbstractC8470a;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8645n;
import com.bytedance.android.livesdk.feed.AbstractC8656r;
import com.bytedance.android.livesdk.feed.C8687t;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4591l.C88960c;

public abstract class BaseFeedRepository implements AbstractC8470a, AbstractC8656r<FeedItem>, AbstractC33974au {

    /* renamed from: a */
    protected AbstractC8645n f21366a;

    /* renamed from: b */
    protected final AbstractC3838b<FeedDataKey, FeedItem> f21367b;

    /* renamed from: c */
    public C88960c<EnumC8657a> f21368c = new C88960c<>();

    /* renamed from: d */
    public C88960c<EnumC8657a> f21369d = new C88960c<>();

    /* renamed from: e */
    private AbstractC8593h f21370e;

    /* renamed from: f */
    private final C88411a f21371f = new C88411a();

    /* renamed from: g */
    private C8687t f21372g;

    static {
        Covode.recordClassIndex(9521);
    }

    /* renamed from: h */
    public abstract FeedDataKey mo14961h();

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            registerFeedRepository();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            unRegisterFeedRepository();
        }
    }

    /* renamed from: a */
    private static boolean mo14935a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean mo14939b() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean a = mo14935a();
        C58029j.f132253e = a;
        return a;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void registerFeedRepository() {
        if (mo14961h() != null) {
            this.f21370e.mo14830a(mo14961h(), this);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void unRegisterFeedRepository() {
        if (this.f21370e.mo14835a(mo14961h())) {
            mo14957f();
            this.f21371f.mo142944a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.repository.BaseFeedRepository$a */
    public enum EnumC8657a {
        START,
        SUCCESS,
        FAIL;

        static {
            Covode.recordClassIndex(9522);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14960a(AbstractC88412b bVar) {
        this.f21371f.mo142945a(bVar);
    }

    /* renamed from: a */
    public final void mo14959a(AbstractC1204m mVar) {
        if (mVar != null) {
            mVar.getLifecycle().mo4012a(this);
        }
    }

    public BaseFeedRepository(AbstractC8593h hVar, AbstractC3838b<FeedDataKey, FeedItem> bVar) {
        this.f21370e = hVar;
        this.f21366a = null;
        this.f21367b = bVar;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8470a
    /* renamed from: b */
    public final void mo14804b(AbstractC8470a.EnumC8471a aVar, String str) {
        if (aVar == AbstractC8470a.EnumC8471a.REFRESH) {
            this.f21368c.onNext(EnumC8657a.SUCCESS);
            if (this.f21366a != null) {
                mo14961h();
                TextUtils.equals(str, "enter_auto");
            }
            C8687t tVar = this.f21372g;
            if (tVar != null) {
                tVar.mo14968a("refresh");
            }
        } else if (aVar == AbstractC8470a.EnumC8471a.LOAD_MORE) {
            this.f21369d.onNext(EnumC8657a.SUCCESS);
            if (this.f21366a != null) {
                mo14961h();
            }
            C8687t tVar2 = this.f21372g;
            if (tVar2 != null) {
                tVar2.mo14968a("load_more");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8470a
    /* renamed from: a */
    public final void mo14802a(AbstractC8470a.EnumC8471a aVar, String str) {
        C8687t tVar = new C8687t();
        this.f21372g = tVar;
        tVar.f21437a = SystemClock.uptimeMillis();
        if (aVar == AbstractC8470a.EnumC8471a.REFRESH) {
            this.f21368c.onNext(EnumC8657a.START);
            if (this.f21366a != null) {
                mo14961h();
                TextUtils.equals(str, "enter_auto");
            }
        } else if (aVar == AbstractC8470a.EnumC8471a.LOAD_MORE) {
            this.f21369d.onNext(EnumC8657a.START);
            C8687t tVar2 = this.f21372g;
            if (tVar2 != null) {
                tVar2.f21437a = SystemClock.uptimeMillis();
            }
            if (this.f21366a != null) {
                mo14961h();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8470a
    /* renamed from: a */
    public final void mo14803a(AbstractC8470a.EnumC8471a aVar, String str, Throwable th) {
        if (aVar == AbstractC8470a.EnumC8471a.REFRESH) {
            this.f21368c.onNext(EnumC8657a.FAIL);
            if (this.f21366a != null) {
                mo14961h();
                TextUtils.equals(str, "enter_auto");
            }
            if (this.f21372g != null) {
                C3966y.m9669e();
                if (mo14939b()) {
                    this.f21372g.mo14969a("refresh", th);
                }
            }
        } else if (aVar == AbstractC8470a.EnumC8471a.LOAD_MORE) {
            this.f21369d.onNext(EnumC8657a.FAIL);
            if (this.f21366a != null) {
                mo14961h();
            }
            if (this.f21372g != null) {
                C3966y.m9669e();
                if (mo14939b()) {
                    this.f21372g.mo14969a("load_more", th);
                }
            }
        }
    }
}
