package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.app.Activity;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.powerpermissions.AbstractC17765f;
import com.bytedance.ies.powerpermissions.AbstractC17769i;
import com.bytedance.ies.powerpermissions.C17775m;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46905er;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61515c;
import com.p2082ss.android.ugc.aweme.notification.AbstractC61861b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b;
import com.p2082ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.p2082ss.android.ugc.aweme.relation.dialog.View$OnClickListenerC66900b;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e */
public final class C22832e {

    /* renamed from: c */
    public static final C22835c f53929c = new C22835c((byte) 0);

    /* renamed from: a */
    final Fragment f53930a;

    /* renamed from: b */
    public final C88411a f53931b = new C88411a();

    /* renamed from: d */
    private final SocialRecFriendsConditionViewModel f53932d;

    /* renamed from: e */
    private final ScrollSwitchStateManager f53933e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$e */
    public static final class C22837e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C22837e f53938a = new C22837e();

        static {
            Covode.recordClassIndex(26735);
        }

        C22837e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(26730);
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$c */
    public static final class C22835c {
        static {
            Covode.recordClassIndex(26733);
        }

        private C22835c() {
        }

        public /* synthetic */ C22835c(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public static void m43059b() {
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.SOCIAL_REC_FRIENDS);
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$k */
    public static final class C22852k implements AbstractC17207b.AbstractC17211c {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f53966a;

        /* renamed from: b */
        final /* synthetic */ String f53967b;

        /* renamed from: c */
        final /* synthetic */ C22832e f53968c;

        /* renamed from: d */
        final /* synthetic */ int f53969d;

        /* renamed from: e */
        final /* synthetic */ FriendList f53970e;

        static {
            Covode.recordClassIndex(26750);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            int i = 2;
            if (this.f53969d != 2) {
                i = 1;
            }
            AbstractC0952i supportFragmentManager = this.f53966a.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            View$OnClickListenerC66900b.C66901a.m118662a(supportFragmentManager, this.f53970e, this.f53967b, i);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
            if (list != null) {
                Integer.valueOf(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
            if (list != null) {
                Integer.valueOf(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        C22852k(ActivityC0945e eVar, String str, C22832e eVar2, int i, FriendList friendList) {
            this.f53966a = eVar;
            this.f53967b = str;
            this.f53968c = eVar2;
            this.f53969d = i;
            this.f53970e = friendList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo37162c() {
        Fragment b = this.f53933e.mo89347b();
        if (b instanceof C59014ae) {
            Fragment c = this.f53933e.mo89361c();
            if (c instanceof C50041af) {
                return "homepage_hot";
            }
            if (c instanceof C50403p) {
                return "homepage_follow";
            }
            return "";
        } else if (b instanceof C61515c) {
            return "discovery";
        } else {
            if (b instanceof AbstractC61861b) {
                return "notification_page";
            }
            if (b instanceof C64208b) {
                return "personal_homepage";
            }
            return "";
        }
    }

    /* renamed from: a */
    public final void mo37159a() {
        int i;
        if (this.f53930a.getActivity() != null) {
            C31575b.m65859a();
            int i2 = 1;
            if (C89219l.m154714a((Object) C31575b.f75524a.mo57075k().getLatestLoginMethodName(), (Object) "facebook")) {
                i = 2;
            } else {
                i = 1;
            }
            C66870b.AbstractC66875d a = C66870b.m118585a(i);
            ActivityC0945e activity = this.f53930a.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            if (a.mo105816a(activity) && !a.mo105818b()) {
                C89378p<Boolean, Boolean> a2 = a.mo105815a();
                if (a.mo105819c() == 2) {
                    i2 = 2;
                }
                mo37160a(i2, a2);
            }
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$f */
    public static final class C22838f implements AbstractC17207b.AbstractC17211c {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f53939a;

        /* renamed from: b */
        final /* synthetic */ C22832e f53940b;

        /* renamed from: c */
        final /* synthetic */ int f53941c;

        static {
            Covode.recordClassIndex(26736);
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
        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22838f.mo27201a():void");
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
            if (list != null) {
                Integer.valueOf(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
            if (list != null) {
                Integer.valueOf(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        C22838f(ActivityC0945e eVar, C22832e eVar2, int i) {
            this.f53939a = eVar;
            this.f53940b = eVar2;
            this.f53941c = i;
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$a */
    static final class C22833a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C22832e f53934a;

        static {
            Covode.recordClassIndex(26731);
        }

        C22833a(C22832e eVar) {
            this.f53934a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f53934a.mo37159a();
            }
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$b */
    static final class C22834b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C22832e f53935a;

        static {
            Covode.recordClassIndex(26732);
        }

        C22834b(C22832e eVar) {
            this.f53935a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f53935a.mo37159a();
            }
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$h */
    public static final class C22840h implements AbstractC17765f {

        /* renamed from: a */
        final /* synthetic */ C22832e f53945a;

        /* renamed from: b */
        final /* synthetic */ String f53946b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f53947c;

        static {
            Covode.recordClassIndex(26738);
        }

        /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$h$b */
        static final class C22842b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C22840h f53949a;

            static {
                Covode.recordClassIndex(26740);
            }

            C22842b(C22840h hVar) {
                this.f53949a = hVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    new C23144b(topActivity).mo37640e(R.string.bfr).mo37637b();
                }
                C22832e.m43059b();
            }
        }

        /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$h$a */
        static final class C22841a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C22840h f53948a;

            static {
                Covode.recordClassIndex(26739);
            }

            C22841a(C22840h hVar) {
                this.f53948a = hVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                List friends;
                FriendList friendList = (FriendList) obj;
                if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                    Activity topActivity = ActivityStack.getTopActivity();
                    if (topActivity != null) {
                        new C23144b(topActivity).mo37640e(R.string.atd).mo37637b();
                    }
                    C22832e.m43059b();
                } else if (this.f53948a.f53947c.isFinishing()) {
                    C22832e.m43059b();
                } else {
                    AbstractC0952i supportFragmentManager = this.f53948a.f53947c.getSupportFragmentManager();
                    C89219l.m154716b(supportFragmentManager, "");
                    View$OnClickListenerC66900b.C66901a.m118662a(supportFragmentManager, friendList, this.f53948a.f53946b, 1);
                }
            }
        }

        @Override // com.bytedance.ies.powerpermissions.AbstractC17765f
        /* renamed from: a */
        public final void mo28241a(C17749a... aVarArr) {
            C89219l.m154721d(aVarArr, "");
            int i = C22853f.f53972b[aVarArr[0].f42426b.ordinal()];
            if (i == 1) {
                C51488a.m95920a(this.f53946b, "system", "contact", true, false, "login", "unknown", C51488a.m95925b(), null, 272);
                C51488a.m95930b(this.f53946b, "system", "contact", "login", C51488a.m95927b("unknown", C51488a.m95925b()), "process", null);
                C66870b.m118588b(1, EnumC66892b.CONSENT.getValue());
                C51648a.f118980a.mo87330j().mo87344a();
                C66870b.f150146a.mo105814a(false, 1).mo143254a(new C22841a(this), new C22842b(this));
            } else if (i == 2) {
                C51488a.m95920a(this.f53946b, "system", "contact", false, true, "login", "unknown", C51488a.m95925b(), null, 256);
                C66870b.m118588b(1, EnumC66892b.CONSENT.getValue());
                C51648a.f118980a.mo87330j().mo87344a();
                C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.SOCIAL_REC_FRIENDS);
            } else if (i == 3) {
                C51488a.m95920a(this.f53946b, "system", "contact", false, false, "login", "off", C51488a.m95925b(), null, 256);
                C66870b.m118588b(1, EnumC66892b.CONSENT.getValue());
                C51648a.f118980a.mo87330j().mo87344a();
                C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.SOCIAL_REC_FRIENDS);
            }
        }

        C22840h(C22832e eVar, String str, ActivityC0945e eVar2) {
            this.f53945a = eVar;
            this.f53946b = str;
            this.f53947c = eVar2;
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$i */
    static final class C22843i extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C22832e f53950a;

        /* renamed from: b */
        final /* synthetic */ String f53951b;

        /* renamed from: c */
        final /* synthetic */ C17775m f53952c;

        static {
            Covode.recordClassIndex(26741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22843i(C22832e eVar, String str, C17775m mVar) {
            super(1);
            this.f53950a = eVar;
            this.f53951b = str;
            this.f53952c = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(C46905er.m90207e(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22843i.C228441 */

                /* renamed from: a */
                final /* synthetic */ C22843i f53953a;

                static {
                    Covode.recordClassIndex(26742);
                }

                {
                    this.f53953a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
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
                        com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$i r0 = r10.f53953a
                        java.lang.String r0 = r0.f53951b
                        java.lang.String r5 = com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95925b()
                        java.lang.String r1 = "system"
                        java.lang.String r2 = "contact"
                        java.lang.String r3 = "login"
                        java.lang.String r4 = "unknown"
                        com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95915a(r0, r1, r2, r3, r4, r5)
                        com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$i r0 = r10.f53953a
                        java.lang.String r0 = r0.f53951b
                        java.lang.String r7 = com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95925b()
                        java.lang.String r1 = "authorize"
                        java.lang.String r2 = "contact"
                        r3 = 1
                        r4 = 0
                        java.lang.String r5 = "login"
                        java.lang.String r6 = "unknown"
                        r8 = 0
                        r9 = 272(0x110, float:3.81E-43)
                        com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95920a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$i r0 = r10.f53953a
                        com.bytedance.ies.powerpermissions.m r0 = r0.f53952c
                        if (r0 == 0) goto L_0x0039
                        r0.mo28245a()
                    L_0x0039:
                        h.z r0 = p4600h.C89391z.f203057a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22843i.C228441.invoke(java.lang.Object):java.lang.Object");
                }
            });
            bVar2.mo37419b(C46905er.m90208f(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22843i.C228452 */

                /* renamed from: a */
                final /* synthetic */ C22843i f53954a;

                static {
                    Covode.recordClassIndex(26743);
                }

                {
                    this.f53954a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95920a(this.f53954a.f53951b, "authorize", "contact", false, false, "login", "unknown", C51488a.m95925b(), null, 272);
                    C66870b.m118588b(1, EnumC66892b.CONSENT.getValue());
                    C51648a.f118980a.mo87330j().mo87344a();
                    C22832e.m43059b();
                    C17775m mVar = this.f53954a.f53952c;
                    if (mVar != null) {
                        mVar.mo28247b();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$j */
    public static final class C22846j extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C22832e f53955a;

        /* renamed from: b */
        final /* synthetic */ int f53956b;

        /* renamed from: c */
        final /* synthetic */ String f53957c;

        /* renamed from: d */
        final /* synthetic */ ActivityC0945e f53958d;

        static {
            Covode.recordClassIndex(26744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22846j(C22832e eVar, int i, String str, ActivityC0945e eVar2) {
            super(1);
            this.f53955a = eVar;
            this.f53956b = i;
            this.f53957c = str;
            this.f53958d = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            final C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(C46905er.m90207e(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22846j.C228471 */

                /* renamed from: a */
                final /* synthetic */ C22846j f53959a;

                static {
                    Covode.recordClassIndex(26745);
                }

                {
                    this.f53959a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    final C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    bVar2.f54512a.get(0).mo37428a(new AbstractC89172b<TuxButton, C89391z>(this) {
                        /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22846j.C228471.C228481 */

                        /* renamed from: a */
                        final /* synthetic */ C228471 f53961a;

                        static {
                            Covode.recordClassIndex(26746);
                        }

                        {
                            this.f53961a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
                            String str;
                            String b;
                            TuxButton tuxButton2 = tuxButton;
                            C89219l.m154721d(tuxButton2, "");
                            if (!tuxButton2.f54417a) {
                                int i = 2;
                                if (this.f53961a.f53959a.f53956b == 2) {
                                    str = "facebook";
                                } else {
                                    str = "contact";
                                }
                                if (this.f53961a.f53959a.f53956b == 2) {
                                    b = C51488a.m95909a();
                                } else {
                                    b = C51488a.m95925b();
                                }
                                C51488a.m95920a(this.f53961a.f53959a.f53957c, "user", str, true, false, "login", "on", b, null, 272);
                                C51488a.m95930b(this.f53961a.f53959a.f53957c, "user", str, "login", C51488a.m95927b("on", b), "process", null);
                                aVar2.f54509b = false;
                                tuxButton2.setLoading(true);
                                C66870b.m118588b(this.f53961a.f53959a.f53956b, EnumC66892b.CONSENT.getValue());
                                C51648a.f118980a.mo87330j().mo87344a();
                                C66870b bVar = C66870b.f150146a;
                                if (this.f53961a.f53959a.f53956b != 2) {
                                    i = 1;
                                }
                                bVar.mo105814a(false, i).mo143254a(new AbstractC88433f(this) {
                                    /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22846j.C228471.C228481.C228491 */

                                    /* renamed from: a */
                                    final /* synthetic */ C228481 f53963a;

                                    static {
                                        Covode.recordClassIndex(26747);
                                    }

                                    {
                                        this.f53963a = r1;
                                    }

                                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                                    public final /* synthetic */ void accept(Object obj) {
                                        int i;
                                        List friends;
                                        FriendList friendList = (FriendList) obj;
                                        aVar2.mo37414a().dismiss();
                                        if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                                            Activity topActivity = ActivityStack.getTopActivity();
                                            if (topActivity != null) {
                                                C23144b bVar = new C23144b(topActivity);
                                                if (this.f53963a.f53961a.f53959a.f53956b == 2) {
                                                    i = R.string.gfn;
                                                } else {
                                                    i = R.string.atd;
                                                }
                                                bVar.mo37640e(i).mo37637b();
                                            }
                                            C22832e.m43059b();
                                        } else if (this.f53963a.f53961a.f53959a.f53958d.isFinishing()) {
                                            C22832e.m43059b();
                                        } else {
                                            AbstractC0952i supportFragmentManager = this.f53963a.f53961a.f53959a.f53958d.getSupportFragmentManager();
                                            C89219l.m154716b(supportFragmentManager, "");
                                            View$OnClickListenerC66900b.C66901a.m118662a(supportFragmentManager, friendList, this.f53963a.f53961a.f53959a.f53957c, this.f53963a.f53961a.f53959a.f53956b);
                                        }
                                    }
                                }, new AbstractC88433f(this) {
                                    /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22846j.C228471.C228481.C228502 */

                                    /* renamed from: a */
                                    final /* synthetic */ C228481 f53964a;

                                    static {
                                        Covode.recordClassIndex(26748);
                                    }

                                    {
                                        this.f53964a = r1;
                                    }

                                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                                    public final /* synthetic */ void accept(Object obj) {
                                        aVar2.mo37414a().dismiss();
                                        Activity topActivity = ActivityStack.getTopActivity();
                                        if (topActivity != null) {
                                            new C23144b(topActivity).mo37640e(R.string.bfr).mo37637b();
                                        }
                                        C22832e.m43059b();
                                    }
                                });
                            }
                            return C89391z.f203057a;
                        }
                    });
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37419b(C46905er.m90208f(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e.C22846j.C228512 */

                /* renamed from: a */
                final /* synthetic */ C22846j f53965a;

                static {
                    Covode.recordClassIndex(26749);
                }

                {
                    this.f53965a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    String str;
                    String b;
                    C89219l.m154721d(aVar, "");
                    if (this.f53965a.f53956b == 2) {
                        str = "facebook";
                    } else {
                        str = "contact";
                    }
                    if (this.f53965a.f53956b == 2) {
                        b = C51488a.m95909a();
                    } else {
                        b = C51488a.m95925b();
                    }
                    C51488a.m95920a(this.f53965a.f53957c, "user", str, false, false, "login", "on", b, null, 272);
                    C66870b.m118588b(this.f53965a.f53956b, EnumC66892b.CONSENT.getValue());
                    C51648a.f118980a.mo87330j().mo87344a();
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.SOCIAL_REC_FRIENDS);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m43058a(int i) {
        ActivityC0945e activity = this.f53930a.getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            if (!activity.isFinishing()) {
                C17205a aVar = C17205a.C17206a.f41116a;
                DialogContext.C17204a aVar2 = new DialogContext.C17204a(activity);
                aVar2.f41106a = AbstractC17207b.EnumC17208a.SOCIAL_REC_FRIENDS;
                aVar.mo27209a(aVar2.mo27208a(new C22838f(activity, this, i), true));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$d */
    public static final class C22836d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C22832e f53936a;

        /* renamed from: b */
        final /* synthetic */ int f53937b;

        static {
            Covode.recordClassIndex(26734);
        }

        C22836d(C22832e eVar, int i) {
            this.f53936a = eVar;
            this.f53937b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            FriendList friendList = (FriendList) obj;
            if (friendList != null && (friends = friendList.getFriends()) != null && !friends.isEmpty()) {
                C22832e eVar = this.f53936a;
                int i = this.f53937b;
                ActivityC0945e activity = eVar.f53930a.getActivity();
                if (activity != null) {
                    C89219l.m154716b(activity, "");
                    if ((!activity.isFinishing()) && activity != null) {
                        String c = eVar.mo37162c();
                        C17205a aVar = C17205a.C17206a.f41116a;
                        DialogContext.C17204a aVar2 = new DialogContext.C17204a(activity);
                        aVar2.f41106a = AbstractC17207b.EnumC17208a.SOCIAL_REC_FRIENDS;
                        aVar.mo27209a(aVar2.mo27208a(new C22852k(activity, c, eVar, i, friendList), true));
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$g */
    public static final class C22839g extends AbstractC17769i {

        /* renamed from: b */
        final /* synthetic */ C22832e f53942b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f53943c;

        /* renamed from: d */
        final /* synthetic */ String f53944d;

        static {
            Covode.recordClassIndex(26737);
        }

        @Override // com.bytedance.ies.powerpermissions.AbstractC17769i
        /* renamed from: a */
        public final void mo28242a(C17775m mVar, C17749a... aVarArr) {
            C89219l.m154721d(aVarArr, "");
            int i = C22853f.f53971a[aVarArr[0].f42426b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C22832e eVar = this.f53942b;
                    ActivityC0945e eVar2 = this.f53943c;
                    String str = this.f53944d;
                    ((C23023b) C23028c.m43435a(new C23023b(eVar2).mo37411b(C46905er.m90203a()).mo37413d(C46905er.m90206d()), new C22843i(eVar, str, mVar)).mo37482a(false)).mo37405a().mo37396b().show();
                } else if (i == 3 && mVar != null) {
                    mVar.mo28247b();
                }
            } else if (mVar != null) {
                mVar.mo28247b();
            }
        }

        C22839g(C22832e eVar, ActivityC0945e eVar2, String str) {
            this.f53942b = eVar;
            this.f53943c = eVar2;
            this.f53944d = str;
        }
    }

    /* renamed from: a */
    public final void mo37160a(int i, C89378p<Boolean, Boolean> pVar) {
        boolean booleanValue = pVar.getFirst().booleanValue();
        boolean booleanValue2 = pVar.getSecond().booleanValue();
        if (booleanValue) {
            m43058a(i);
            return;
        }
        AbstractC88412b a = C66870b.f150146a.mo105814a(booleanValue2, i).mo143254a(new C22836d(this, i), C22837e.f53938a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f53931b);
    }

    public C22832e(Fragment fragment, SocialRecFriendsConditionViewModel socialRecFriendsConditionViewModel, ScrollSwitchStateManager scrollSwitchStateManager) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(socialRecFriendsConditionViewModel, "");
        C89219l.m154721d(scrollSwitchStateManager, "");
        this.f53930a = fragment;
        this.f53932d = socialRecFriendsConditionViewModel;
        this.f53933e = scrollSwitchStateManager;
        ActivityC0945e activity = fragment.getActivity();
        if (activity != null) {
            C80375ef.m139355a(socialRecFriendsConditionViewModel.f150179b, activity, new C22833a(this));
            C80375ef.m139355a(socialRecFriendsConditionViewModel.f150178a, activity, new C22834b(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37161a(ActivityC0945e eVar, String str, int i) {
        String a;
        String d;
        C23023b a2 = C23013a.C23015a.m43405a(eVar);
        if (i == 2) {
            a = C46905er.m90204b();
        } else {
            a = C46905er.m90203a();
            if (i != 2) {
                d = C46905er.m90206d();
                ((C23023b) C23028c.m43435a(a2.mo37411b(a).mo37413d(d), new C22846j(this, i, str, eVar)).mo37482a(false)).mo37405a().mo37396b().show();
            }
        }
        d = C46905er.m90205c();
        ((C23023b) C23028c.m43435a(a2.mo37411b(a).mo37413d(d), new C22846j(this, i, str, eVar)).mo37482a(false)).mo37405a().mo37396b().show();
    }
}
