package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p405s.AbstractC6095a;
import com.bytedance.android.live.p405s.p406a.C6096a;
import com.bytedance.android.live.p405s.p406a.C6098b;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usermanage.a */
public final class C11051a {

    /* renamed from: a */
    public static final C11051a f26598a = new C11051a();

    private C11051a() {
    }

    static {
        Covode.recordClassIndex(12672);
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.a$b */
    static final class C11053b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26600a;

        static {
            Covode.recordClassIndex(12674);
        }

        C11053b(WeakReference weakReference) {
            this.f26600a = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            AbstractC6095a aVar = (AbstractC6095a) this.f26600a.get();
            if (aVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                aVar.mo11956a((C6098b) null, (Exception) th);
            }
            if (th2 == null) {
                C89219l.m154715b();
            }
            C3049b.C3050a.m8357a("ttlive_fetch_admin", th2).mo12632a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.usermanage.a$d */
    public static final class C11055d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26607a;

        /* renamed from: b */
        final /* synthetic */ boolean f26608b;

        static {
            Covode.recordClassIndex(12676);
        }

        C11055d(WeakReference weakReference, boolean z) {
            this.f26607a = weakReference;
            this.f26608b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C11264f.m19958a(C3966y.m9669e(), th, (int) R.string.gpl);
            AbstractC6095a aVar = (AbstractC6095a) this.f26607a.get();
            if (aVar != null) {
                aVar.mo11958b((Exception) th);
            }
            if (this.f26608b) {
                if (th == null) {
                    C89219l.m154715b();
                }
                C3049b.C3050a.m8357a("ttlive_add_admin", th).mo12632a();
                return;
            }
            if (th == null) {
                C89219l.m154715b();
            }
            C3049b.C3050a.m8357a("ttlive_delete_admin", th).mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.a$a */
    static final class C11052a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26599a;

        static {
            Covode.recordClassIndex(12673);
        }

        C11052a(WeakReference weakReference) {
            this.f26599a = weakReference;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usermanage.C11051a.C11052a.accept(java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.usermanage.a$c */
    public static final class C11054c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26601a;

        /* renamed from: b */
        final /* synthetic */ boolean f26602b;

        /* renamed from: c */
        final /* synthetic */ C6096a f26603c;

        /* renamed from: d */
        final /* synthetic */ long f26604d;

        /* renamed from: e */
        final /* synthetic */ long f26605e;

        /* renamed from: f */
        final /* synthetic */ String f26606f;

        static {
            Covode.recordClassIndex(12675);
        }

        C11054c(WeakReference weakReference, boolean z, C6096a aVar, long j, long j2, String str) {
            this.f26601a = weakReference;
            this.f26602b = z;
            this.f26603c = aVar;
            this.f26604d = j;
            this.f26605e = j2;
            this.f26606f = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            C6497a b;
            AbstractC6095a aVar = (AbstractC6095a) this.f26601a.get();
            if (aVar != null) {
                aVar.mo11957a(this.f26602b, this.f26603c.f15231a);
            }
            boolean z = this.f26602b;
            long j = this.f26603c.f15231a;
            long j2 = this.f26604d;
            long j3 = this.f26605e;
            String str4 = this.f26606f;
            C6501b a = C6501b.C6502a.m13948a("livesdk_admin_click").mo12646a("anchor_id", j2).mo12646a("room_id", j3).mo12646a("user_id", j);
            if (z) {
                str = "set";
            } else {
                str = "cancel";
            }
            C6501b a2 = a.mo12651a("action_type", str);
            if (j == j2) {
                str2 = "anchor";
            } else {
                str2 = "admin";
            }
            C6501b a3 = a2.mo12651a("admin_type", str2).mo12651a("action_page", "moderator_panel").mo12646a("timestamp", System.currentTimeMillis()).mo12651a("action_page", str4);
            if (C11279p.m20022c()) {
                str3 = "live_take_page";
            } else {
                str3 = "live_take_detail";
            }
            a3.mo12658d(str3).mo12655b();
            if (z) {
                b = C3051c.C3052a.m8360b("ttlive_add_admin");
            } else {
                b = C3051c.C3052a.m8360b("ttlive_delete_admin");
            }
            b.mo12628a("user_id", Long.valueOf(j)).mo12628a("anchor_id", Long.valueOf(j2)).mo12632a();
        }
    }

    /* renamed from: a */
    public static void m19686a(AbstractC6095a aVar, boolean z, C6096a aVar2, long j, long j2, String str) {
        int i;
        C89219l.m154721d(aVar, "");
        if (aVar2 != null) {
            WeakReference weakReference = new WeakReference(aVar);
            AdminApi adminApi = (AdminApi) C5805e.m12718a().mo11572a(AdminApi.class);
            if (z) {
                i = 3;
            } else {
                i = 2;
            }
            adminApi.updateAdmin(i, aVar2.f15231a, j, j2).mo143271a(new C11191f()).mo143254a(new C11054c(weakReference, z, aVar2, j, j2, str), new C11055d(weakReference, z));
        }
    }
}
