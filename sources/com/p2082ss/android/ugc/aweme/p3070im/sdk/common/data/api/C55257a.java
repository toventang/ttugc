package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28023p;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2366a.C34483c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3173d.C55074a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.BlockResponse;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.a */
public final class C55257a {

    /* renamed from: a */
    public static final ImApi f126351a;

    /* renamed from: b */
    public static final C55257a f126352b = new C55257a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.a$a */
    public interface AbstractC55258a {
        static {
            Covode.recordClassIndex(65007);
        }

        /* renamed from: a */
        void mo91652a();

        /* renamed from: a */
        void mo91653a(Object obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.a$c */
    public static final class C55260c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f126356a;

        /* renamed from: b */
        int f126357b;

        /* renamed from: c */
        final /* synthetic */ C55257a f126358c;

        static {
            Covode.recordClassIndex(65009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55260c(C55257a aVar, AbstractC89124d dVar) {
            super(dVar);
            this.f126358c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f126356a = obj;
            this.f126357b |= Integer.MIN_VALUE;
            return this.f126358c.mo92256b(null, null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.a$d */
    public static final class C55261d extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f126359a;

        /* renamed from: b */
        int f126360b;

        /* renamed from: c */
        final /* synthetic */ C55257a f126361c;

        static {
            Covode.recordClassIndex(65010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55261d(C55257a aVar, AbstractC89124d dVar) {
            super(dVar);
            this.f126361c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f126359a = obj;
            this.f126360b |= Integer.MIN_VALUE;
            return this.f126361c.mo92255a((String) null, (String) null, this);
        }
    }

    private C55257a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.a$b */
    static final class CallableC55259b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ CharSequence f126353a;

        /* renamed from: b */
        final /* synthetic */ String f126354b;

        /* renamed from: c */
        final /* synthetic */ int f126355c;

        static {
            Covode.recordClassIndex(65008);
        }

        CallableC55259b(CharSequence charSequence, String str, int i) {
            this.f126353a = charSequence;
            this.f126354b = str;
            this.f126355c = i;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                return C55257a.f126351a.block(this.f126353a.toString(), this.f126354b, this.f126355c).get();
            } catch (ExecutionException e) {
                C89219l.m154721d(e, "");
                Throwable cause = e.getCause();
                if (cause instanceof C34485a) {
                    throw ((RuntimeException) cause);
                } else if (!(cause instanceof C28023p)) {
                    Objects.requireNonNull(cause, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                    throw ((Exception) cause);
                } else {
                    throw new C34483c(cause);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(65006);
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C55074a.f126040b).create(ImApi.class);
        C89219l.m154716b(create, "");
        f126351a = (ImApi) create;
    }

    /* renamed from: a */
    public static AbstractC88973n<BlockResponse> m101013a(String str, String str2, int i) {
        AbstractC88973n<BlockResponse> a = f126351a.blockUser(str, str2, i).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo92255a(java.lang.String r6, java.lang.String r7, p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.C55261d
            if (r0 == 0) goto L_0x003e
            r4 = r8
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a$d r4 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.C55261d) r4
            int r0 = r4.f126360b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003e
            int r0 = r4.f126360b
            int r0 = r0 - r1
            r4.f126360b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f126359a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f126360b
            r1 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r1) goto L_0x0044
            p4600h.C89382r.m154942a(r3)
        L_0x0021:
            com.ss.android.ugc.aweme.im.sdk.common.data.model.UserSelfResponse r3 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.UserSelfResponse) r3
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getUser()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser.fromUser(r0)
            return r0
        L_0x002c:
            p4600h.C89382r.m154942a(r3)
            com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.f126351a
            kotlinx.coroutines.av r0 = r0.fetchUserSelf(r6, r7)
            r4.f126360b = r1
            java.lang.Object r3 = r0.mo144106a(r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003e:
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a$d r4 = new com.ss.android.ugc.aweme.im.sdk.common.data.api.a$d
            r4.<init>(r5, r8)
            goto L_0x0013
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.mo92255a(java.lang.String, java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo92256b(java.lang.String r6, java.lang.String r7, p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.C55260c
            if (r0 == 0) goto L_0x003e
            r4 = r8
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a$c r4 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.C55260c) r4
            int r0 = r4.f126357b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003e
            int r0 = r4.f126357b
            int r0 = r0 - r1
            r4.f126357b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f126356a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f126357b
            r1 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r1) goto L_0x0044
            p4600h.C89382r.m154942a(r3)
        L_0x0021:
            com.ss.android.ugc.aweme.im.sdk.common.data.model.UserOtherResponse r3 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.UserOtherResponse) r3
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getUser()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser.fromUser(r0)
            return r0
        L_0x002c:
            p4600h.C89382r.m154942a(r3)
            com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.f126351a
            kotlinx.coroutines.av r0 = r0.fetchUserOther(r6, r7)
            r4.f126357b = r1
            java.lang.Object r3 = r0.mo144106a(r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003e:
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a$c r4 = new com.ss.android.ugc.aweme.im.sdk.common.data.api.a$c
            r4.<init>(r5, r8)
            goto L_0x0013
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.mo92256b(java.lang.String, java.lang.String, h.c.d):java.lang.Object");
    }

    /* renamed from: a */
    public static final void m101014a(Handler handler, CharSequence charSequence, String str, int i, int i2) {
        C89219l.m154721d(charSequence, "");
        C34608n.m70658a().mo61083a(handler, new CallableC55259b(charSequence, str, i), i2);
    }
}
