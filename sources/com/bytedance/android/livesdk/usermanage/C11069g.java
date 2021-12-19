package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p405s.AbstractC6101c;
import com.bytedance.android.live.p405s.AbstractC6105g;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMuteCommentsDefaultSetting;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9070ci;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usermanage.g */
public final class C11069g {

    /* renamed from: a */
    static final Map<Long, C3265j> f26639a = new LinkedHashMap();

    /* renamed from: b */
    public static final C11069g f26640b = new C11069g();

    private C11069g() {
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$f */
    static final class C11075f implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C3265j f26650a;

        static {
            Covode.recordClassIndex(12696);
        }

        C11075f(C3265j jVar) {
            this.f26650a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            C6806c.m14603a(C11069g.m19696a(), Long.valueOf(this.f26650a.f9352a));
        }
    }

    static {
        Covode.recordClassIndex(12690);
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$c */
    static final class CallableC11072c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f26643a;

        static {
            Covode.recordClassIndex(12693);
        }

        CallableC11072c(long j) {
            this.f26643a = j;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C6805b<Long> a = C11069g.m19696a();
            if (a.mo13066a() == null) {
                C6806c.m14603a(a, Long.valueOf(LiveMuteCommentsDefaultSetting.INSTANCE.getValue()));
            }
            Long a2 = a.mo13066a();
            C89219l.m154716b(a2, "");
            C3265j jVar = new C3265j(a2.longValue());
            C11069g.f26639a.put(Long.valueOf(this.f26643a), jVar);
            DataChannelGlobal.f42558d.mo28328c(C9070ci.class, jVar);
            return jVar;
        }
    }

    /* renamed from: a */
    public static C6805b<Long> m19696a() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        return new C6805b<>("tmp_mute_duration_" + MD5Utils.getMD5String(String.valueOf(b.mo13161c())), Long.TYPE);
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$a */
    static final class C11070a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26641a;

        static {
            Covode.recordClassIndex(12691);
        }

        C11070a(WeakReference weakReference) {
            this.f26641a = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            C6099c cVar = (C6099c) obj;
            AbstractC6101c cVar2 = (AbstractC6101c) this.f26641a.get();
            if (cVar2 != null) {
                cVar2.mo11763k_();
            }
            AbstractC6101c cVar3 = (AbstractC6101c) this.f26641a.get();
            if (cVar3 != null) {
                cVar3.mo11758a(cVar, null);
            }
            if (cVar != null) {
                C6497a b = C3051c.C3052a.m8360b("ttlive_fetch_mute");
                if (cVar.f14684b != null) {
                    i = cVar.f14684b.size();
                } else {
                    i = 0;
                }
                b.mo12627a("list_size", Integer.valueOf(i)).mo12632a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$b */
    static final class C11071b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26642a;

        static {
            Covode.recordClassIndex(12692);
        }

        C11071b(WeakReference weakReference) {
            this.f26642a = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            AbstractC6101c cVar = (AbstractC6101c) this.f26642a.get();
            if (cVar != null) {
                cVar.mo11763k_();
            }
            AbstractC6101c cVar2 = (AbstractC6101c) this.f26642a.get();
            if (cVar2 != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                cVar2.mo11758a(null, (Exception) th);
            }
            C89219l.m154716b(th2, "");
            C3049b.C3050a.m8357a("ttlive_fetch_mute", th2).mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$d */
    static final class C11073d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ User f26644a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f26645b;

        /* renamed from: c */
        final /* synthetic */ long f26646c;

        static {
            Covode.recordClassIndex(12694);
        }

        C11073d(User user, WeakReference weakReference, long j) {
            this.f26644a = user;
            this.f26645b = weakReference;
            this.f26646c = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11069g.m19697a(this.f26644a, true);
            AbstractC6105g gVar = (AbstractC6105g) this.f26645b.get();
            if (gVar != null) {
                gVar.mo11761a(true);
            }
            long j = this.f26646c;
            long id = this.f26644a.getId();
            String secUid = this.f26644a.getSecUid();
            C89219l.m154716b(secUid, "");
            C11069g.m19698a(true, j, id, secUid);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$e */
    static final class C11074e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26647a;

        /* renamed from: b */
        final /* synthetic */ long f26648b;

        /* renamed from: c */
        final /* synthetic */ User f26649c;

        static {
            Covode.recordClassIndex(12695);
        }

        C11074e(WeakReference weakReference, long j, User user) {
            this.f26647a = weakReference;
            this.f26648b = j;
            this.f26649c = user;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            C11264f.m19958a(C3966y.m9669e(), th2, (int) R.string.gpl);
            AbstractC6105g gVar = (AbstractC6105g) this.f26647a.get();
            if (gVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                gVar.mo11759a((Exception) th);
            }
            long j = this.f26648b;
            long id = this.f26649c.getId();
            String secUid = this.f26649c.getSecUid();
            C89219l.m154716b(secUid, "");
            C11069g.m19699a(true, th2, j, id, secUid);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$g */
    static final class C11076g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ User f26651a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f26652b;

        /* renamed from: c */
        final /* synthetic */ long f26653c;

        static {
            Covode.recordClassIndex(12697);
        }

        C11076g(User user, WeakReference weakReference, long j) {
            this.f26651a = user;
            this.f26652b = weakReference;
            this.f26653c = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11069g.m19697a(this.f26651a, false);
            AbstractC6105g gVar = (AbstractC6105g) this.f26652b.get();
            if (gVar != null) {
                gVar.mo11761a(false);
            }
            long j = this.f26653c;
            long id = this.f26651a.getId();
            String secUid = this.f26651a.getSecUid();
            C89219l.m154716b(secUid, "");
            C11069g.m19698a(false, j, id, secUid);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$h */
    static final class C11077h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26654a;

        /* renamed from: b */
        final /* synthetic */ long f26655b;

        /* renamed from: c */
        final /* synthetic */ User f26656c;

        static {
            Covode.recordClassIndex(12698);
        }

        C11077h(WeakReference weakReference, long j, User user) {
            this.f26654a = weakReference;
            this.f26655b = j;
            this.f26656c = user;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            C11264f.m19958a(C3966y.m9669e(), th2, (int) R.string.gpl);
            AbstractC6105g gVar = (AbstractC6105g) this.f26654a.get();
            if (gVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                gVar.mo11759a((Exception) th);
            }
            long j = this.f26655b;
            long id = this.f26656c.getId();
            String secUid = this.f26656c.getSecUid();
            C89219l.m154716b(secUid, "");
            C11069g.m19699a(false, th2, j, id, secUid);
        }
    }

    /* renamed from: a */
    public static void m19697a(User user, boolean z) {
        if (user.getUserAttr() == null) {
            user.setUserAttr(new C9542az());
        }
        C9542az userAttr = user.getUserAttr();
        C89219l.m154716b(userAttr, "");
        userAttr.f23191a = z;
    }

    /* renamed from: a */
    public static void m19698a(boolean z, long j, long j2, String str) {
        C6497a b;
        if (z) {
            b = C3051c.C3052a.m8360b("ttlive_add_mute");
        } else {
            b = C3051c.C3052a.m8360b("ttlive_delete_mute");
        }
        b.mo12628a("user_id", Long.valueOf(j2)).mo12629a("sec_user_id", str).mo12628a("room_id", Long.valueOf(j)).mo12632a();
    }

    /* renamed from: a */
    public static void m19699a(boolean z, Throwable th, long j, long j2, String str) {
        C6497a a;
        if (z) {
            if (th == null) {
                C89219l.m154715b();
            }
            a = C3049b.C3050a.m8357a("ttlive_add_mute", th);
        } else {
            if (th == null) {
                C89219l.m154715b();
            }
            a = C3049b.C3050a.m8357a("ttlive_delete_mute", th);
        }
        a.mo12628a("user_id", Long.valueOf(j2)).mo12629a("sec_user_id", str).mo12628a("room_id", Long.valueOf(j)).mo12632a();
    }
}
