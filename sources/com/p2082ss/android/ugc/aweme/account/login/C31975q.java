package com.p2082ss.android.ugc.aweme.account.login;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C27919i;
import com.google.gson.C28024q;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.C40948dc;
import com.p2082ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p2082ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32095c;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32105h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.C80036a;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;
import p4600h.p4621l.C89327q;

/* renamed from: com.ss.android.ugc.aweme.account.login.q */
public final class C31975q {

    /* renamed from: a */
    static boolean f76366a = false;

    /* renamed from: b */
    public static List<BaseLoginMethod> f76367b;

    /* renamed from: c */
    public static volatile boolean f76368c = true;

    /* renamed from: d */
    public static final C31975q f76369d = new C31975q();

    /* renamed from: com.ss.android.ugc.aweme.account.login.q$f */
    public static final class CallableC31982f<V> implements Callable {

        /* renamed from: a */
        public static final CallableC31982f f76374a = new CallableC31982f();

        static {
            Covode.recordClassIndex(38736);
        }

        CallableC31982f() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            return C31975q.f76367b;
        }
    }

    private C31975q() {
    }

    /* renamed from: a */
    public static void m66350a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        boolean z = false;
        for (T t : f76367b) {
            if (C89219l.m154714a((Object) t.getUid(), (Object) str) && t.getLoginMethodName() == LoginMethodName.USER_NAME_PASS) {
                z = true;
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod");
                t.setName(str2);
            }
        }
        if (z) {
            m66361f();
        }
    }

    /* renamed from: a */
    public static boolean m66352a(BaseLoginMethod baseLoginMethod) {
        try {
            if (!(baseLoginMethod instanceof PhoneLoginMethod)) {
                baseLoginMethod = null;
            }
            PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
            if (phoneLoginMethod == null) {
                return true;
            }
            if (phoneLoginMethod.getPhoneNumber() == null) {
                return false;
            }
            return C89219l.m154714a(phoneLoginMethod.isFromReInstallNet(), true) || phoneLoginMethod.getPhoneNumber().getNationalNumber() > 0;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m66351a(boolean z) {
        List<BaseLoginMethod> list = f76367b;
        ArrayList<BaseLoginMethod> arrayList = new ArrayList();
        for (T t : list) {
            if (C89219l.m154714a((Object) t.getUid(), (Object) C36085cj.m73548b())) {
                arrayList.add(t);
            }
        }
        for (BaseLoginMethod baseLoginMethod : arrayList) {
            baseLoginMethod.allowOneKeyLogin(z);
        }
        m66361f();
    }

    /* renamed from: f */
    public static void m66361f() {
        C1731i.m5640b(CallableC31977b.f76371a, C1731i.f5562a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.q$g */
    public static final class CallableC31983g<V> implements Callable {

        /* renamed from: a */
        public static final CallableC31983g f76375a = new CallableC31983g();

        static {
            Covode.recordClassIndex(38737);
        }

        CallableC31983g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (C31975q.f76368c) {
                return C31975q.f76367b;
            }
            C31975q.f76367b = C31975q.m66342a();
            C31975q.m66360e();
            C31975q.f76368c = true;
            return C31975q.f76367b;
        }
    }

    static {
        Covode.recordClassIndex(38729);
        f76367b = new ArrayList();
        f76367b = m66342a();
        m66360e();
    }

    /* renamed from: c */
    public static boolean m66358c() {
        List<BaseLoginMethod> list = f76367b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (C89219l.m154714a((Object) t.isFromReInstallNet(), (Object) true)) {
                arrayList.add(t);
            }
        }
        if (!arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.q$b */
    public static final class CallableC31977b<V> implements Callable {

        /* renamed from: a */
        public static final CallableC31977b f76371a = new CallableC31977b();

        static {
            Covode.recordClassIndex(38731);
        }

        CallableC31977b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC89306h a = C89309k.m154802a(C89070n.m154598r(C31975q.f76367b), (Comparator) new C31978a());
            if (!C36085cj.f85262b.mo57075k().isOneKeyLoginExprimentEnable()) {
                C89219l.m154721d(a, "");
                a = new C89327q(a, 5);
            }
            C31975q.f76367b = C89309k.m154814h(a);
            ((AbstractC32080t) C40948dc.m82454a(C31291a.f74991a, AbstractC32080t.class)).mo58037a(new C27910f().mo46674b(C31975q.f76367b));
            if (C31975q.f76366a) {
                C31975q.f76367b.size();
                for (BaseLoginMethod baseLoginMethod : C31975q.f76367b) {
                    baseLoginMethod.getLoginMethodName();
                    baseLoginMethod.getUid();
                    baseLoginMethod.getExpires();
                    baseLoginMethod.getAllowOneKeyLogin();
                }
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.q$b$a */
        public static final class C31978a<T> implements Comparator {
            static {
                Covode.recordClassIndex(38732);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                long j;
                long time;
                long time2;
                T t3 = t2;
                Long lastActiveTime = t3.getLastActiveTime();
                if (lastActiveTime != null) {
                    j = lastActiveTime.longValue();
                } else {
                    j = -1;
                }
                if (j > 0) {
                    Long lastActiveTime2 = t3.getLastActiveTime();
                    if (lastActiveTime2 == null) {
                        C89219l.m154715b();
                    }
                    time = lastActiveTime2.longValue();
                } else {
                    time = t3.getExpires().getTime() - 2592000000L;
                }
                Long valueOf = Long.valueOf(time);
                T t4 = t;
                Long lastActiveTime3 = t4.getLastActiveTime();
                if (lastActiveTime3 == null || lastActiveTime3.longValue() <= 0) {
                    time2 = t4.getExpires().getTime() - 2592000000L;
                } else {
                    Long lastActiveTime4 = t4.getLastActiveTime();
                    if (lastActiveTime4 == null) {
                        C89219l.m154715b();
                    }
                    time2 = lastActiveTime4.longValue();
                }
                return C89090a.m154604a(valueOf, Long.valueOf(time2));
            }
        }
    }

    /* renamed from: e */
    public static void m66360e() {
        List<BaseLoginMethod> list = f76367b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().isExpired()) {
                    List<BaseLoginMethod> list2 = f76367b;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list2) {
                        T t2 = t;
                        if (!t2.isExpired() || t2.getLoginMethodName() == LoginMethodName.DEFAULT) {
                            arrayList.add(t);
                        }
                    }
                    f76367b = C89070n.m154585g((Collection) arrayList);
                    m66361f();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static List<BaseLoginMethod> m66342a() {
        ArrayList arrayList = new ArrayList();
        C31976a aVar = new C31976a(arrayList);
        C27910f fVar = new C27910f();
        AbstractC28019l a = C28024q.m56139a(((AbstractC32080t) C40948dc.m82454a(C31291a.f74991a, AbstractC32080t.class)).mo58039b("[]"));
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.google.gson.JsonArray");
        Iterator<AbstractC28019l> it = ((C27919i) a).iterator();
        C89219l.m154716b(it, "");
        while (it.hasNext()) {
            AbstractC28019l next = it.next();
            try {
                C89219l.m154716b(next, "");
                AbstractC28019l c = next.mo46789j().mo46803c("loginMethodName");
                C89219l.m154716b(c, "");
                String c2 = c.mo46689c();
                if (C89219l.m154714a((Object) c2, (Object) LoginMethodName.EMAIL_PASS.name()) || C89219l.m154714a((Object) c2, (Object) LoginMethodName.USER_NAME_PASS.name())) {
                    Object a2 = fVar.mo46667a(next, AccountPassLoginMethod.class);
                    C89219l.m154716b(a2, "");
                    aVar.mo57958a((BaseLoginMethod) a2);
                } else if (C89219l.m154714a((Object) c2, (Object) LoginMethodName.PHONE_NUMBER_PASS.name()) || C89219l.m154714a((Object) c2, (Object) LoginMethodName.PHONE_SMS.name())) {
                    Object a3 = fVar.mo46667a(next, PhoneLoginMethod.class);
                    C89219l.m154716b(a3, "");
                    aVar.mo57958a((BaseLoginMethod) a3);
                } else if (C89219l.m154714a((Object) c2, (Object) LoginMethodName.THIRD_PARTY.name())) {
                    Object a4 = fVar.mo46667a(next, TPLoginMethod.class);
                    C89219l.m154716b(a4, "");
                    aVar.mo57958a((BaseLoginMethod) a4);
                } else if (C89219l.m154714a((Object) c2, (Object) LoginMethodName.DEFAULT.name())) {
                    Object a5 = fVar.mo46667a(next, BaseLoginMethod.class);
                    C89219l.m154716b(a5, "");
                    aVar.mo57958a((BaseLoginMethod) a5);
                }
            } catch (C28027t e) {
                e.printStackTrace();
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final BaseLoginMethod m66359d() {
        T next;
        long j;
        long j2;
        long time;
        if (!((AbstractC32080t) C40948dc.m82454a(C31291a.f74991a, AbstractC32080t.class)).mo58040b(true)) {
            return new BaseLoginMethod(null, null, null, null, -1L, null, null, null, null, 495, null);
        }
        m66360e();
        if (f76366a) {
            for (BaseLoginMethod baseLoginMethod : f76367b) {
                baseLoginMethod.getLoginMethodName();
                baseLoginMethod.getUid();
                baseLoginMethod.getExpires();
            }
        }
        Iterator<T> it = f76367b.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                T t = next;
                Long lastActiveTime = t.getLastActiveTime();
                if (lastActiveTime != null) {
                    j = lastActiveTime.longValue();
                } else {
                    j = -1;
                }
                if (j > 0) {
                    Long lastActiveTime2 = t.getLastActiveTime();
                    if (lastActiveTime2 == null) {
                        C89219l.m154715b();
                    }
                    j2 = lastActiveTime2.longValue();
                } else {
                    j2 = t.getExpires().getTime() - 2592000000L;
                }
                do {
                    T next2 = it.next();
                    T t2 = next2;
                    Long lastActiveTime3 = t2.getLastActiveTime();
                    if (lastActiveTime3 == null || lastActiveTime3.longValue() <= 0) {
                        time = t2.getExpires().getTime() - 2592000000L;
                    } else {
                        Long lastActiveTime4 = t2.getLastActiveTime();
                        if (lastActiveTime4 == null) {
                            C89219l.m154715b();
                        }
                        time = lastActiveTime4.longValue();
                    }
                    if (j2 < time) {
                        next = next2;
                        j2 = time;
                    }
                } while (it.hasNext());
            }
        }
        T t3 = next;
        if (t3 == null) {
            return new BaseLoginMethod(null, null, null, null, -1L, null, null, null, null, 495, null);
        }
        return t3;
    }

    /* renamed from: b */
    public static boolean m66357b() {
        List<BaseLoginMethod> list = f76367b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (!TextUtils.isEmpty(t2.getUid()) && ((!C89219l.m154714a((Object) t2.isFromReInstallNet(), (Object) true)) || C89219l.m154714a((Object) t2.isTransToNormal(), (Object) true))) {
                arrayList.add(t);
            }
        }
        if (!arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.q$a */
    public static final class C31976a extends AbstractC89220m implements AbstractC89172b<BaseLoginMethod, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f76370a;

        static {
            Covode.recordClassIndex(38730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31976a(List list) {
            super(1);
            this.f76370a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseLoginMethod baseLoginMethod) {
            mo57958a(baseLoginMethod);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo57958a(BaseLoginMethod baseLoginMethod) {
            C89219l.m154721d(baseLoginMethod, "");
            if (C31975q.m66352a(baseLoginMethod)) {
                if (C31975q.f76366a) {
                    baseLoginMethod.getLoginMethodName();
                }
                this.f76370a.add(baseLoginMethod);
            } else if (C31975q.f76366a) {
                baseLoginMethod.getLoginMethodName();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.q$d */
    public static final class C31980d extends AbstractC89220m implements AbstractC89172b<BaseLoginMethod, Boolean> {

        /* renamed from: a */
        final /* synthetic */ List f76372a;

        static {
            Covode.recordClassIndex(38734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31980d(List list) {
            super(1);
            this.f76372a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            C89219l.m154721d(baseLoginMethod2, "");
            List list = this.f76372a;
            if (list == null) {
                C89219l.m154715b();
            }
            return Boolean.valueOf(!list.contains(baseLoginMethod2.getUid()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.q$h */
    public static final class C31984h extends AbstractC89220m implements AbstractC89172b<BaseLoginMethod, Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseLoginMethod f76376a;

        static {
            Covode.recordClassIndex(38738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31984h(BaseLoginMethod baseLoginMethod) {
            super(1);
            this.f76376a = baseLoginMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            C89219l.m154721d(baseLoginMethod2, "");
            return Boolean.valueOf(C89219l.m154714a((Object) baseLoginMethod2.getUid(), (Object) this.f76376a.getUid()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.q$i */
    static final class C31985i extends AbstractC89220m implements AbstractC89172b<BaseLoginMethod, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f76377a;

        static {
            Covode.recordClassIndex(38739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31985i(String str) {
            super(1);
            this.f76377a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            C89219l.m154721d(baseLoginMethod2, "");
            return Boolean.valueOf(C89219l.m154714a((Object) baseLoginMethod2.getUid(), (Object) this.f76377a));
        }
    }

    /* renamed from: a */
    public static final void m66346a(String str) {
        C89219l.m154721d(str, "");
        C89070n.m154537a((List) f76367b, (AbstractC89172b) new C31985i(str));
        m66361f();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.q$j */
    static final class C31986j extends AbstractC89220m implements AbstractC89172b<BaseLoginMethod, Boolean> {

        /* renamed from: a */
        public static final C31986j f76378a = new C31986j();

        static {
            Covode.recordClassIndex(38740);
        }

        C31986j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(BaseLoginMethod baseLoginMethod) {
            BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
            C89219l.m154721d(baseLoginMethod2, "");
            boolean z = true;
            if (!C89219l.m154714a((Object) baseLoginMethod2.isFromReInstallNet(), (Object) true) || !(!C89219l.m154714a((Object) baseLoginMethod2.isTransToNormal(), (Object) true))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static List<BaseLoginMethod> m66343a(List<String> list) {
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = m66357b();
        AbstractC89306h a = C89309k.m154802a(C89309k.m154799a(C89070n.m154598r(f76367b), (AbstractC89172b) new C31981e(aVar)), (Comparator) new C31979c());
        if (C13603b.m24435a((Collection) list)) {
            return C89309k.m154813g(a);
        }
        return C89309k.m154813g(C89309k.m154799a(a, (AbstractC89172b) new C31980d(list)));
    }

    /* renamed from: b */
    public static List<BaseLoginMethod> m66353b(String str) {
        C89219l.m154721d(str, "");
        List<BaseLoginMethod> list = f76367b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (C89219l.m154714a((Object) t.getUid(), (Object) str)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.q$e */
    public static final class C31981e extends AbstractC89220m implements AbstractC89172b<BaseLoginMethod, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f76373a;

        static {
            Covode.recordClassIndex(38735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31981e(C89233z.C89234a aVar) {
            super(1);
            this.f76373a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
            if (r0.isCommonInfoAvailable() == true) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
            if (r5.isExpired() == false) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            r3 = true;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke(com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r5 = (com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r5
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                h.f.b.z$a r0 = r4.f76373a
                boolean r0 = r0.element
                r3 = 0
                r2 = 1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
                if (r0 == 0) goto L_0x003f
                java.lang.Boolean r0 = r5.isFromReInstallNet()
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r1)
                if (r0 == 0) goto L_0x002a
                java.lang.Boolean r0 = r5.isTransToNormal()
                boolean r3 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r1)
            L_0x0025:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x002a:
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = r5.getLoginMethodName()
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName.DEFAULT
                if (r1 == r0) goto L_0x0025
                com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r0 = r5.getCommonUserInfo()
                if (r0 == 0) goto L_0x0025
                boolean r0 = r0.isCommonInfoAvailable()
                if (r0 != r2) goto L_0x0025
                goto L_0x0051
            L_0x003f:
                com.ss.android.ugc.aweme.an r0 = com.p2082ss.android.ugc.aweme.C36085cj.f85262b
                com.ss.android.ugc.aweme.bn r0 = r0.mo57075k()
                boolean r0 = r0.isTrustedEnvLoginFreshInstallEnable()
                if (r0 == 0) goto L_0x0025
                boolean r0 = r5.isExpired()
                if (r0 != 0) goto L_0x0025
            L_0x0051:
                r3 = 1
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.C31975q.C31981e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m66344a(User user) {
        C89219l.m154721d(user, "");
        List<BaseLoginMethod> list = f76367b;
        ArrayList<BaseLoginMethod> arrayList = new ArrayList();
        for (T t : list) {
            if (C89219l.m154714a((Object) t.getUid(), (Object) user.getUid())) {
                arrayList.add(t);
            }
        }
        for (BaseLoginMethod baseLoginMethod : arrayList) {
            baseLoginMethod.updateUserInfo(user);
        }
        m66361f();
    }

    /* renamed from: b */
    public static final void m66354b(BaseLoginMethod baseLoginMethod) {
        T t;
        String str;
        Integer a;
        String str2;
        Long lastActiveTime;
        String str3 = "";
        C89219l.m154721d(baseLoginMethod, str3);
        if (baseLoginMethod.getLoginMethodName() == LoginMethodName.DEFAULT && (lastActiveTime = baseLoginMethod.getLastActiveTime()) != null && lastActiveTime.longValue() == -1) {
            baseLoginMethod.setLastActiveTime(Long.valueOf(System.currentTimeMillis()));
        }
        Iterator<T> it = f76367b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.getUid(), (Object) baseLoginMethod.getUid())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            baseLoginMethod.setAllowOneKeyLogin(t2.getAllowOneKeyLogin());
        } else {
            C80064f.C80065a f = C80061e.m138802f(C80061e.f179403k.mo123517e());
            if (f == null || (str = f.f179431f) == null) {
                str = str3;
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                if (!(f == null || (str2 = f.f179431f) == null)) {
                    str3 = str2;
                }
                if (!(str3.length() == 0 || (a = C80036a.m138776a(str3, "save_login")) == null || a.intValue() != 1)) {
                    z = true;
                }
            }
            baseLoginMethod.setAllowOneKeyLogin(Boolean.valueOf(z));
        }
        C89070n.m154537a((List) f76367b, (AbstractC89172b) new C31984h(baseLoginMethod));
        f76367b.add(baseLoginMethod);
        if (f76366a) {
            baseLoginMethod.getLoginMethodName();
            baseLoginMethod.getUid();
            new Exception();
        }
        m66361f();
    }

    /* renamed from: a */
    public static final void m66345a(C80053c cVar) {
        if (cVar != null) {
            List<BaseLoginMethod> list = f76367b;
            ArrayList<BaseLoginMethod> arrayList = new ArrayList();
            for (T t : list) {
                if (C89219l.m154714a((Object) t.getUid(), (Object) cVar.f179384a)) {
                    arrayList.add(t);
                }
            }
            for (BaseLoginMethod baseLoginMethod : arrayList) {
                baseLoginMethod.updateUserInfo(cVar);
            }
            m66361f();
        }
    }

    /* renamed from: b */
    public static final void m66356b(List<C32105h> list) {
        long currentTimeMillis;
        Integer num;
        String str;
        String str2;
        C89219l.m154721d(list, "");
        C89070n.m154537a((List) f76367b, (AbstractC89172b) C31986j.f76378a);
        for (C32105h hVar : list) {
            Long l = hVar.f76603c;
            if (l != null) {
                currentTimeMillis = l.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j = currentTimeMillis * 1000;
            String str3 = hVar.f76605e;
            if (str3 == null) {
                C89219l.m154715b();
            }
            String str4 = hVar.f76607g;
            if (str4 == null) {
                C89219l.m154715b();
            }
            CommonUserInfo commonUserInfo = new CommonUserInfo(str3, str4, hVar.f76602b, hVar.f76604d);
            String str5 = hVar.f76602b;
            if (str5 == null) {
                str5 = "";
            }
            BaseLoginMethod baseLoginMethod = new BaseLoginMethod(str5, LoginMethodName.DEFAULT, commonUserInfo, new Date(System.currentTimeMillis() + 2592000000L), Long.valueOf(j), Long.valueOf(j), true, true, null, 256, null);
            if (!(hVar.f76606f == null || (num = hVar.f76606f.f76581a) == null)) {
                if (num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3) {
                    String str6 = hVar.f76602b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    baseLoginMethod = new PhoneLoginMethod(str6, LoginMethodName.PHONE_SMS, new C31940a.C31941a(), commonUserInfo, Long.valueOf(j), Long.valueOf(j), true);
                } else if (num.intValue() == 4 || num.intValue() == 5) {
                    String str7 = hVar.f76602b;
                    if (str7 == null) {
                        str7 = "";
                    }
                    LoginMethodName loginMethodName = LoginMethodName.EMAIL_PASS;
                    String str8 = hVar.f76606f.f76583c;
                    if (str8 == null) {
                        str8 = "";
                    }
                    baseLoginMethod = new AccountPassLoginMethod(str7, loginMethodName, str8, commonUserInfo, Long.valueOf(j), Long.valueOf(j), true);
                } else if (num.intValue() == 6) {
                    C32095c.C32096a aVar = hVar.f76606f.f76585e;
                    if (aVar == null || (str = aVar.f76587a) == null) {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        TPUserInfo tPUserInfo = new TPUserInfo(hVar.f76605e, hVar.f76607g);
                        String str9 = hVar.f76602b;
                        if (str9 == null) {
                            str9 = "";
                        }
                        C32095c.C32096a aVar2 = hVar.f76606f.f76585e;
                        if (aVar2 == null || (str2 = aVar2.f76587a) == null) {
                            str2 = "";
                        }
                        baseLoginMethod = new TPLoginMethod(str9, str2, tPUserInfo, false, commonUserInfo, Long.valueOf(j), Long.valueOf(j), true);
                    }
                }
            }
            baseLoginMethod.setFromReInstallNet(true);
            baseLoginMethod.setTransToNormal(false);
            f76367b.add(baseLoginMethod);
            if (f76366a) {
                baseLoginMethod.getLoginMethodName();
                baseLoginMethod.getUid();
                new Exception();
            }
        }
        m66361f();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.q$c */
    public static final class C31979c<T> implements Comparator {
        static {
            Covode.recordClassIndex(38733);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            long j;
            long time;
            long time2;
            T t3 = t2;
            Long lastActiveTime = t3.getLastActiveTime();
            if (lastActiveTime != null) {
                j = lastActiveTime.longValue();
            } else {
                j = -1;
            }
            if (j > 0) {
                Long lastActiveTime2 = t3.getLastActiveTime();
                if (lastActiveTime2 == null) {
                    C89219l.m154715b();
                }
                time = lastActiveTime2.longValue();
            } else {
                time = t3.getExpires().getTime() - 2592000000L;
            }
            Long valueOf = Long.valueOf(time);
            T t4 = t;
            Long lastActiveTime3 = t4.getLastActiveTime();
            if (lastActiveTime3 == null || lastActiveTime3.longValue() <= 0) {
                time2 = t4.getExpires().getTime() - 2592000000L;
            } else {
                Long lastActiveTime4 = t4.getLastActiveTime();
                if (lastActiveTime4 == null) {
                    C89219l.m154715b();
                }
                time2 = lastActiveTime4.longValue();
            }
            return C89090a.m154604a(valueOf, Long.valueOf(time2));
        }
    }

    /* renamed from: b */
    public static final void m66355b(String str, long j) {
        C89219l.m154721d(str, "");
        for (T t : f76367b) {
            if (C89219l.m154714a((Object) t.getUid(), (Object) str)) {
                t.setLastActiveTime(Long.valueOf(j));
            }
        }
    }

    /* renamed from: a */
    public static void m66349a(String str, C31940a.C31941a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        boolean z = false;
        for (T t : f76367b) {
            if (C89219l.m154714a((Object) t.getUid(), (Object) str) && (t instanceof PhoneLoginMethod)) {
                z = true;
                t.setPhoneNumber(aVar);
            }
        }
        if (z) {
            m66361f();
        }
    }

    /* renamed from: a */
    public static final void m66348a(String str, long j, boolean z) {
        Object next;
        long j2;
        C89219l.m154721d(str, "");
        ArrayList arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod : f76367b) {
            if (C89219l.m154714a((Object) baseLoginMethod.getUid(), (Object) str)) {
                arrayList.add(baseLoginMethod);
            }
        }
        if (!z) {
            if (C36085cj.f85262b.mo57075k().isOneKeyLoginExprimentEnable()) {
                j2 = 15552000000L;
            } else {
                j2 = 2592000000L;
            }
            j += j2;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Date expires = ((BaseLoginMethod) next).getExpires();
                do {
                    Object next2 = it.next();
                    Date expires2 = ((BaseLoginMethod) next2).getExpires();
                    if (expires.compareTo((Object) expires2) < 0) {
                        next = next2;
                        expires = expires2;
                    }
                } while (it.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) next;
        if (baseLoginMethod2 != null) {
            baseLoginMethod2.setExpires(new Date(j));
        }
    }
}
