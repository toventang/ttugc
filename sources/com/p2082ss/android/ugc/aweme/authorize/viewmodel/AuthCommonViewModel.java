package com.p2082ss.android.ugc.aweme.authorize.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1631b.p1633b.AbstractC22335a;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22340b;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22342d;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.p2082ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend;
import com.p2082ss.android.ugc.aweme.authorize.p2342a.C33979a;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62712d;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62713e;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62714f;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62715g;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62697a;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62700d;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62704h;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62706j;
import java.util.Comparator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel */
public final class AuthCommonViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<C22342d> f80480a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<C62700d> f80481b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<List<C62703g>> f80482c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<C22340b> f80483d = new C1213t<>();

    /* renamed from: e */
    public final C1213t<C62706j> f80484e = new C1213t<>();

    /* renamed from: f */
    public final C1213t<C62706j> f80485f = new C1213t<>();

    /* renamed from: g */
    public final C1213t<C62697a> f80486g = new C1213t<>();

    /* renamed from: h */
    public final C1213t<C62704h> f80487h = new C1213t<>();

    /* renamed from: i */
    public final AbstractC22335a.AbstractC22336a f80488i;

    /* renamed from: j */
    public final C22349c.C22350a f80489j;

    /* renamed from: k */
    private final AwemeAuthorizePlatformDepend f80490k;

    static {
        Covode.recordClassIndex(40963);
    }

    /* renamed from: a */
    public final void mo60313a() {
        this.f80490k.mo60271a(new RunnableC34035e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$c */
    public static final class RunnableC34032c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AuthCommonViewModel f80493a;

        /* renamed from: b */
        final /* synthetic */ C22349c.C22350a f80494b;

        static {
            Covode.recordClassIndex(40966);
        }

        RunnableC34032c(AuthCommonViewModel authCommonViewModel, C22349c.C22350a aVar) {
            this.f80493a = authCommonViewModel;
            this.f80494b = aVar;
        }

        public final void run() {
            this.f80493a.f80483d.postValue(this.f80493a.f80488i.mo36679a(this.f80494b, "", ""));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$e */
    public static final class RunnableC34035e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AuthCommonViewModel f80498a;

        static {
            Covode.recordClassIndex(40969);
        }

        RunnableC34035e(AuthCommonViewModel authCommonViewModel) {
            this.f80498a = authCommonViewModel;
        }

        public final void run() {
            this.f80498a.f80480a.postValue(this.f80498a.f80488i.mo36680a(this.f80498a.f80489j, "", "", ""));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$a */
    public static final class C34030a implements AbstractC62713e {

        /* renamed from: a */
        final /* synthetic */ AuthCommonViewModel f80491a;

        static {
            Covode.recordClassIndex(40964);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C34030a(AuthCommonViewModel authCommonViewModel) {
            this.f80491a = authCommonViewModel;
        }

        @Override // com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62713e
        /* renamed from: a */
        public final void mo60317a(C62704h hVar) {
            C89219l.m154721d(hVar, "");
            this.f80491a.f80487h.postValue(hVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$b */
    public static final class C34031b implements AbstractC62714f {

        /* renamed from: a */
        final /* synthetic */ AuthCommonViewModel f80492a;

        static {
            Covode.recordClassIndex(40965);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C34031b(AuthCommonViewModel authCommonViewModel) {
            this.f80492a = authCommonViewModel;
        }

        @Override // com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62714f
        /* renamed from: a */
        public final void mo60318a(C62706j jVar) {
            C89219l.m154721d(jVar, "");
            this.f80492a.f80484e.postValue(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$f */
    public static final class C34036f implements AbstractC62715g {

        /* renamed from: a */
        final /* synthetic */ AuthCommonViewModel f80499a;

        static {
            Covode.recordClassIndex(40970);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C34036f(AuthCommonViewModel authCommonViewModel) {
            this.f80499a = authCommonViewModel;
        }

        @Override // com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62715g
        /* renamed from: a */
        public final void mo60324a(C62706j jVar) {
            C89219l.m154721d(jVar, "");
            this.f80499a.f80485f.postValue(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$d */
    public static final class C34033d implements AbstractC62712d {

        /* renamed from: a */
        final /* synthetic */ AuthCommonViewModel f80495a;

        /* renamed from: b */
        final /* synthetic */ boolean f80496b;

        /* renamed from: c */
        final /* synthetic */ String f80497c;

        static {
            Covode.recordClassIndex(40967);
        }

        @Override // com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62712d
        /* renamed from: b */
        public final void mo60321b(C62700d dVar) {
            C89219l.m154721d(dVar, "");
            this.f80495a.f80481b.postValue(dVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
            if (r0.booleanValue() == false) goto L_0x008f;
         */
        @Override // com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62712d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60320a(com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62700d r7) {
            /*
            // Method dump skipped, instructions count: 210
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel.C34033d.mo60320a(com.ss.android.ugc.aweme.openauthorize.a.d):void");
        }

        /* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$d$a */
        public static final class C34034a<T> implements Comparator {
            static {
                Covode.recordClassIndex(40968);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
                if (r0.booleanValue() == false) goto L_0x0035;
             */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
            @Override // java.util.Comparator
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int compare(T r4, T r5) {
                /*
                    r3 = this;
                    com.ss.android.ugc.aweme.openauthorize.a.g r4 = (com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g) r4
                    java.lang.Boolean r1 = r4.getScopeRequired()
                    r2 = 0
                    r0 = 1
                    if (r1 == 0) goto L_0x0019
                    java.lang.Boolean r0 = r4.getScopeRequired()
                    if (r0 != 0) goto L_0x0013
                    p4600h.p4611f.p4613b.C89219l.m154715b()
                L_0x0013:
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x003f
                L_0x0019:
                    r0 = 1
                L_0x001a:
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                    com.ss.android.ugc.aweme.openauthorize.a.g r5 = (com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g) r5
                    java.lang.Boolean r0 = r5.getScopeRequired()
                    if (r0 == 0) goto L_0x0035
                    java.lang.Boolean r0 = r5.getScopeRequired()
                    if (r0 != 0) goto L_0x002f
                    p4600h.p4611f.p4613b.C89219l.m154715b()
                L_0x002f:
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0036
                L_0x0035:
                    r2 = 1
                L_0x0036:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    int r0 = p4600h.p4602b.C89090a.m154604a(r1, r0)
                    return r0
                L_0x003f:
                    r0 = 0
                    goto L_0x001a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel.C34033d.C34034a.compare(java.lang.Object, java.lang.Object):int");
            }
        }

        C34033d(AuthCommonViewModel authCommonViewModel, boolean z, String str) {
            this.f80495a = authCommonViewModel;
            this.f80496b = z;
            this.f80497c = str;
        }
    }

    /* renamed from: a */
    public final void mo60314a(C22349c.C22350a aVar) {
        C89219l.m154721d(aVar, "");
        this.f80490k.mo60271a(new RunnableC34032c(this, aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$g */
    public static final class C34037g<T> implements Comparator {
        static {
            Covode.recordClassIndex(40971);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if (r0.booleanValue() == false) goto L_0x0035;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(T r4, T r5) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.openauthorize.a.g r4 = (com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g) r4
                java.lang.Boolean r1 = r4.getScopeRequired()
                r2 = 0
                r0 = 1
                if (r1 == 0) goto L_0x0019
                java.lang.Boolean r0 = r4.getScopeRequired()
                if (r0 != 0) goto L_0x0013
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0013:
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x003f
            L_0x0019:
                r0 = 1
            L_0x001a:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                com.ss.android.ugc.aweme.openauthorize.a.g r5 = (com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g) r5
                java.lang.Boolean r0 = r5.getScopeRequired()
                if (r0 == 0) goto L_0x0035
                java.lang.Boolean r0 = r5.getScopeRequired()
                if (r0 != 0) goto L_0x002f
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x002f:
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x0036
            L_0x0035:
                r2 = 1
            L_0x0036:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                int r0 = p4600h.p4602b.C89090a.m154604a(r1, r0)
                return r0
            L_0x003f:
                r0 = 0
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel.C34037g.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: a */
    public final void mo60316a(boolean z, boolean z2) {
        this.f80486g.postValue(new C62697a(z, z2));
    }

    public AuthCommonViewModel(AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend, AbstractC22335a.AbstractC22336a aVar, C22349c.C22350a aVar2) {
        C89219l.m154721d(awemeAuthorizePlatformDepend, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f80490k = awemeAuthorizePlatformDepend;
        this.f80488i = aVar;
        this.f80489j = aVar2;
    }

    /* renamed from: a */
    public final void mo60315a(String str, int i, String str2, String str3, String str4, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C33979a.m69577a(str, i, str2, str3, str4, new C34033d(this, z, str2));
    }
}
