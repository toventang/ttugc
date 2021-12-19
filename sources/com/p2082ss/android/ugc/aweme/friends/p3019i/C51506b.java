package com.p2082ss.android.ugc.aweme.friends.p3019i;

import android.app.Activity;
import androidx.core.app.C0569a;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34505b;
import com.p2082ss.android.ugc.aweme.experiment.C46905er;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.p2082ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80310cp;
import com.p2082ss.android.ugc.trill.R;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.friends.i.b */
public final class C51506b {

    /* renamed from: a */
    public static boolean f118699a;

    /* renamed from: b */
    public static final String[] f118700b = {"android.permission.READ_CONTACTS"};

    /* renamed from: c */
    public static final C51506b f118701c = new C51506b();

    private C51506b() {
    }

    static {
        Covode.recordClassIndex(60771);
    }

    /* renamed from: a */
    public static boolean m95978a() {
        try {
            if (C0643b.m2367a(C17867d.m33078a(), "android.permission.READ_CONTACTS") != -1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m95979b() {
        if (!m95978a() || !C79519c.C79520a.f178475a.mo86982a()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.b$a */
    public static final class C51507a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ IFriendsService.AbstractC51641e f118702a;

        /* renamed from: b */
        final /* synthetic */ String f118703b;

        /* renamed from: c */
        final /* synthetic */ String f118704c;

        static {
            Covode.recordClassIndex(60772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51507a(IFriendsService.AbstractC51641e eVar, String str, String str2) {
            super(1);
            this.f118702a = eVar;
            this.f118703b = str;
            this.f118704c = str2;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(C46905er.m90207e(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.C51507a.C515081 */

                /* renamed from: a */
                final /* synthetic */ C51507a f118705a;

                static {
                    Covode.recordClassIndex(60773);
                }

                {
                    this.f118705a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95932b(this.f118705a.f118703b, true);
                    C51488a.m95920a(this.f118705a.f118703b, "user", "contact", true, false, this.f118705a.f118704c, "on", "off", null, 272);
                    C51506b.m95977a(this.f118705a.f118703b, true, "user", "click", "uid", "");
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37419b(C46905er.m90208f(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.C51507a.C515092 */

                /* renamed from: a */
                final /* synthetic */ C51507a f118706a;

                static {
                    Covode.recordClassIndex(60774);
                }

                {
                    this.f118706a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    IFriendsService.AbstractC51641e eVar = this.f118706a.f118702a;
                    if (eVar != null) {
                        eVar.mo87349b();
                    }
                    C51488a.m95932b(this.f118706a.f118703b, false);
                    C51488a.m95920a(this.f118706a.f118703b, "user", "contact", false, false, this.f118706a.f118704c, "on", "off", null, 272);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.b$b */
    public static final class C51510b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f118707a;

        /* renamed from: b */
        final /* synthetic */ boolean f118708b;

        /* renamed from: c */
        final /* synthetic */ Activity f118709c;

        /* renamed from: d */
        final /* synthetic */ IFriendsService.AbstractC51642f f118710d;

        /* renamed from: e */
        final /* synthetic */ IFriendsService.AbstractC51641e f118711e;

        static {
            Covode.recordClassIndex(60775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51510b(String str, boolean z, Activity activity, IFriendsService.AbstractC51642f fVar, IFriendsService.AbstractC51641e eVar) {
            super(1);
            this.f118707a = str;
            this.f118708b = z;
            this.f118709c = activity;
            this.f118710d = fVar;
            this.f118711e = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(C46905er.m90207e(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.C51510b.C515111 */

                /* renamed from: a */
                final /* synthetic */ C51510b f118712a;

                static {
                    Covode.recordClassIndex(60776);
                }

                {
                    this.f118712a = r2;
                }

                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
                    	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                    	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                    	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                    	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                    	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.tux.dialog.p1713b.C23024a r11) {
                    /*
                        r10 = this;
                        java.lang.String r0 = ""
                        p4600h.p4611f.p4613b.C89219l.m154721d(r11, r0)
                        com.ss.android.ugc.aweme.friends.i.b$b r0 = r10.f118712a
                        java.lang.String r2 = r0.f118707a
                        com.ss.android.ugc.aweme.friends.i.b$b r0 = r10.f118712a
                        boolean r1 = r0.f118708b
                        r0 = 1
                        com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95923a(r2, r1, r0)
                        com.ss.android.ugc.aweme.friends.i.b$b r0 = r10.f118712a
                        java.lang.String r0 = r0.f118707a
                        java.lang.String r7 = com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95925b()
                        java.lang.String r1 = "authorize"
                        java.lang.String r2 = "contact"
                        r3 = 1
                        r4 = 0
                        java.lang.String r5 = "click"
                        java.lang.String r6 = "unknown"
                        r8 = 0
                        r9 = 272(0x110, float:3.81E-43)
                        com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95920a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        com.ss.android.ugc.aweme.friends.i.b$b r0 = r10.f118712a
                        java.lang.String r4 = r0.f118707a
                        com.ss.android.ugc.aweme.friends.i.b$b r0 = r10.f118712a
                        android.app.Activity r3 = r0.f118709c
                        com.ss.android.ugc.aweme.friends.i.b$b r0 = r10.f118712a
                        com.ss.android.ugc.aweme.friends.service.IFriendsService$f r2 = r0.f118710d
                        java.lang.Class<com.ss.android.ugc.aweme.friends.a> r0 = com.p2082ss.android.ugc.aweme.friends.AbstractC51435a.class
                        java.lang.Object r0 = com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34505b.m70490a(r3, r0)
                        com.ss.android.ugc.aweme.friends.a r0 = (com.p2082ss.android.ugc.aweme.friends.AbstractC51435a) r0
                        boolean r0 = r0.mo60946a()
                        com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95937c(r4, r0)
                        java.lang.String r9 = com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95925b()
                        java.lang.String r5 = "system"
                        java.lang.String r6 = "contact"
                        java.lang.String r7 = "click"
                        java.lang.String r8 = "unknown"
                        com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95915a(r4, r5, r6, r7, r8, r9)
                        java.lang.String[] r1 = com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.f118700b
                        com.ss.android.ugc.aweme.friends.i.b$c r0 = new com.ss.android.ugc.aweme.friends.i.b$c
                        r0.<init>(r3, r2, r4, r7)
                        com.p2082ss.android.ugc.aweme.p2440ce.C35444b.m72473a(r3, r1, r0)
                        h.z r0 = p4600h.C89391z.f203057a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.C51510b.C515111.invoke(java.lang.Object):java.lang.Object");
                }
            });
            bVar2.mo37419b(C46905er.m90208f(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.C51510b.C515122 */

                /* renamed from: a */
                final /* synthetic */ C51510b f118713a;

                static {
                    Covode.recordClassIndex(60777);
                }

                {
                    this.f118713a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95923a(this.f118713a.f118707a, this.f118713a.f118708b, false);
                    C51488a.m95920a(this.f118713a.f118707a, "authorize", "contact", false, false, "click", "unknown", C51488a.m95925b(), null, 272);
                    IFriendsService.AbstractC51641e eVar = this.f118713a.f118711e;
                    if (eVar != null) {
                        eVar.mo87349b();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.b$d */
    public static final class C51514d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f118718a;

        /* renamed from: b */
        final /* synthetic */ String f118719b;

        /* renamed from: c */
        final /* synthetic */ Activity f118720c;

        /* renamed from: d */
        final /* synthetic */ IFriendsService.AbstractC51641e f118721d;

        static {
            Covode.recordClassIndex(60779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51514d(String str, String str2, Activity activity, IFriendsService.AbstractC51641e eVar) {
            super(1);
            this.f118718a = str;
            this.f118719b = str2;
            this.f118720c = activity;
            this.f118721d = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.epn, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.C51514d.C515151 */

                /* renamed from: a */
                final /* synthetic */ C51514d f118722a;

                static {
                    Covode.recordClassIndex(60780);
                }

                {
                    this.f118722a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95922a(this.f118722a.f118718a, true);
                    C51488a.m95920a(this.f118722a.f118718a, "guide", "contact", true, false, this.f118722a.f118719b, "off", C51488a.m95925b(), null, 272);
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    C89219l.m154716b(curUser, "");
                    Keva.getRepo("cold_boot_for_fb_and_ctx").storeBoolean("click_contact_open_setting".concat(String.valueOf(curUser.getUid())), true);
                    C80310cp.m139213a(this.f118722a.f118720c);
                    new BackFromSettingEvent(this.f118722a.f118718a).post();
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37419b(C46905er.m90208f(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.C51514d.C515162 */

                /* renamed from: a */
                final /* synthetic */ C51514d f118723a;

                static {
                    Covode.recordClassIndex(60781);
                }

                {
                    this.f118723a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95922a(this.f118723a.f118718a, false);
                    C51488a.m95920a(this.f118723a.f118718a, "guide", "contact", false, false, this.f118723a.f118719b, "off", C51488a.m95925b(), null, 272);
                    IFriendsService.AbstractC51641e eVar = this.f118723a.f118721d;
                    if (eVar != null) {
                        eVar.mo87349b();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.b$e */
    public static final class C51517e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ String f118724a;

        /* renamed from: b */
        final /* synthetic */ boolean f118725b;

        /* renamed from: c */
        final /* synthetic */ String f118726c;

        /* renamed from: d */
        final /* synthetic */ String f118727d;

        /* renamed from: e */
        final /* synthetic */ String f118728e;

        static {
            Covode.recordClassIndex(60782);
        }

        C51517e(String str, boolean z, String str2, String str3, String str4) {
            this.f118724a = str;
            this.f118725b = z;
            this.f118726c = str2;
            this.f118727d = str3;
            this.f118728e = str4;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<BaseResponse> iVar) {
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                if (!C89361p.m154872a("error", iVar.mo5545d().message, true)) {
                    final Activity j = C17873f.m33102j();
                    if (j != null && C51506b.f118699a && this.f118725b && ("homepage_hot".equals(this.f118724a) || "homepage_follow".equals(this.f118724a))) {
                        j.runOnUiThread(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.C51517e.RunnableC515181 */

                            static {
                                Covode.recordClassIndex(60783);
                            }

                            public final void run() {
                                new C79459a(j).mo123050a(R.string.atd).mo123053a();
                            }
                        });
                        C51506b.f118699a = false;
                    }
                    C51648a.f118980a.mo87317b(this.f118725b);
                    if (this.f118726c.length() > 0) {
                        C51488a.m95930b(this.f118724a, this.f118726c, "contact", this.f118727d, this.f118728e, "process", null);
                    }
                    return new SyncContactStatusEvent(this.f118724a, true, !this.f118725b).post();
                }
            }
            return new SyncContactStatusEvent(this.f118724a, false, true ^ this.f118725b).post();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.b$c */
    static final class C51513c implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ Activity f118714a;

        /* renamed from: b */
        final /* synthetic */ IFriendsService.AbstractC51642f f118715b;

        /* renamed from: c */
        final /* synthetic */ String f118716c;

        /* renamed from: d */
        final /* synthetic */ String f118717d;

        static {
            Covode.recordClassIndex(60778);
        }

        C51513c(Activity activity, IFriendsService.AbstractC51642f fVar, String str, String str2) {
            this.f118714a = activity;
            this.f118715b = fVar;
            this.f118716c = str;
            this.f118717d = str2;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            boolean a = C0569a.m2183a(this.f118714a, C51506b.f118700b[0]);
            C89219l.m154716b(strArr, "");
            if (strArr.length != 0 && iArr[0] == 0) {
                ((AbstractC51435a) C34505b.m70490a(this.f118714a, AbstractC51435a.class)).mo60945a(false);
                IFriendsService.AbstractC51642f fVar = this.f118715b;
                if (fVar != null) {
                    fVar.mo87350a();
                }
                C51488a.m95924a(this.f118716c, ((AbstractC51435a) C34505b.m70490a(this.f118714a, AbstractC51435a.class)).mo60946a(), true, a);
                C51488a.m95920a(this.f118716c, "system", "contact", true, false, this.f118717d, "unknown", C51488a.m95925b(), null, 272);
                C51506b.m95977a(this.f118716c, true, "system", "click", C51488a.m95927b("unknown", C51488a.m95925b()), "");
                return;
            }
            C51488a.m95924a(this.f118716c, ((AbstractC51435a) C34505b.m70490a(this.f118714a, AbstractC51435a.class)).mo60946a(), false, a);
            C51488a.m95920a(this.f118716c, "system", "contact", false, a, this.f118717d, "unknown", C51488a.m95925b(), null, 256);
            IFriendsService.AbstractC51642f fVar2 = this.f118715b;
            if (fVar2 != null) {
                fVar2.mo87351b();
            }
            ((AbstractC51435a) C34505b.m70490a(this.f118714a, AbstractC51435a.class)).mo60945a(true);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: a */
    public static void m95975a(android.app.Activity r8, java.lang.String r9, com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51641e r10, java.lang.String r11) {
        /*
            r0 = 1
            r2 = r9
            com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95937c(r2, r0)
            java.lang.String r7 = com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95925b()
            java.lang.String r3 = "guide"
            java.lang.String r4 = "contact"
            java.lang.String r6 = "off"
            r5 = r11
            com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95915a(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = com.p2082ss.android.ugc.aweme.experiment.C46905er.m90203a()
            com.bytedance.tux.dialog.b r0 = new com.bytedance.tux.dialog.b
            r0.<init>(r8)
            com.bytedance.tux.dialog.b r1 = r0.mo37411b(r1)
            r0 = 2131828056(0x7f111d58, float:1.9289042E38)
            com.bytedance.tux.dialog.internal.b r1 = r1.mo37483b(r0)
            com.bytedance.tux.dialog.b r1 = (com.bytedance.tux.dialog.C23023b) r1
            com.ss.android.ugc.aweme.friends.i.b$d r0 = new com.ss.android.ugc.aweme.friends.i.b$d
            r0.<init>(r2, r5, r8, r10)
            com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.p1713b.C23028c.m43435a(r1, r0)
            r0 = 0
            com.bytedance.tux.dialog.internal.b r0 = r1.mo37482a(r0)
            com.bytedance.tux.dialog.b r0 = (com.bytedance.tux.dialog.C23023b) r0
            com.bytedance.tux.dialog.a r0 = r0.mo37405a()
            android.app.Dialog r0 = r0.mo37396b()
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b.m95975a(android.app.Activity, java.lang.String, com.ss.android.ugc.aweme.friends.service.IFriendsService$e, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m95977a(String str, boolean z, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        AbstractC51474a.m95881a().syncContactStatus(1, Boolean.valueOf(z)).mo5534a(new C51517e(str, z, str2, str3, str4), C1731i.f5562a, null);
    }
}
