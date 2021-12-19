package com.p2082ss.android.ugc.aweme.profile.widgets.p3584c.p3585a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63743e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.c.a.a */
public final class C64555a extends AbstractC12769a {

    /* renamed from: l */
    public static final C64557b f146255l = new C64557b((byte) 0);

    /* renamed from: j */
    public TuxButton f146256j;

    /* renamed from: k */
    final List<Integer> f146257k = new ArrayList();

    /* renamed from: m */
    private final C12786i f146258m = new C12786i(bW_(), new C64556a(this, null));

    static {
        Covode.recordClassIndex(76019);
    }

    /* renamed from: a */
    public static String m116500a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "twitter" : "youtube" : "instagram";
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.c.a.a$b */
    public static final class C64557b {
        static {
            Covode.recordClassIndex(76021);
        }

        private C64557b() {
        }

        public /* synthetic */ C64557b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo104135v() {
        C64870a aVar = (C64870a) this.f146258m.getValue();
        if (aVar != null) {
            return aVar.f146660c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.c.a.a$a */
    public static final class C64556a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146259a;

        /* renamed from: b */
        final /* synthetic */ String f146260b;

        static {
            Covode.recordClassIndex(76020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64556a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146259a = aVar;
            this.f146260b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146259a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146260b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3584c.p3585a.C64555a.C64556a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.c.a.a$f */
    static final class C64561f extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64555a f146267a;

        static {
            Covode.recordClassIndex(76025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64561f(C64555a aVar) {
            super(1);
            this.f146267a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            TuxButton tuxButton = this.f146267a.f146256j;
            if (tuxButton != null) {
                tuxButton.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        this.f146256j = (TuxButton) view.findViewById(R.id.sj);
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64562b.f146268a, new C64560e(this));
        if (!mo104135v()) {
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64563c.f146269a, new C64561f(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.c.a.a$d */
    public static final class C64559d extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64555a f146263a;

        /* renamed from: b */
        final /* synthetic */ int f146264b;

        /* renamed from: c */
        final /* synthetic */ User f146265c;

        static {
            Covode.recordClassIndex(76023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64559d(C64555a aVar, int i, User user) {
            super(1);
            this.f146263a = aVar;
            this.f146264b = i;
            this.f146265c = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            C89219l.m154721d(view, "");
            this.f146263a.mo104134a(this.f146264b, this.f146265c);
            C33744d dVar = new C33744d();
            if (C31575b.m65865g().isMe(this.f146265c.getUid())) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            C39162r.m79460a("click_social_account", dVar.mo59983a("enter_from", str).mo59983a("platform", C64555a.m116500a(this.f146264b)).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.c.a.a$c */
    static final class View$OnClickListenerC64558c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64555a f146261a;

        /* renamed from: b */
        final /* synthetic */ User f146262b;

        static {
            Covode.recordClassIndex(76022);
        }

        View$OnClickListenerC64558c(C64555a aVar, User user) {
            this.f146261a = aVar;
            this.f146262b = user;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C64555a aVar = this.f146261a;
            User user = this.f146262b;
            int size = aVar.f146257k.size();
            AbstractC0952i iVar = null;
            String str2 = null;
            if (size == 1) {
                int intValue = aVar.f146257k.get(0).intValue();
                aVar.mo104134a(intValue, user);
                C33744d dVar = new C33744d();
                IAccountUserService g = C31575b.m65865g();
                if (user != null) {
                    str2 = user.getUid();
                }
                if (g.isMe(str2)) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C39162r.m79460a("click_social_account", dVar.mo59983a("enter_from", str).mo59983a("platform", C64555a.m116500a(intValue)).f79943a);
            } else if (size > 1 && aVar.az_() != null && user != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(user.getInsId())) {
                    Context az_ = aVar.az_();
                    if (az_ == null) {
                        C89219l.m154715b();
                    }
                    String string = az_.getString(R.string.d96, user.getInsId());
                    C89219l.m154716b(string, "");
                    arrayList.add(aVar.mo104133a(user, 1, R.raw.icon_instagram, string));
                }
                if (!TextUtils.isEmpty(user.getYoutubeChannelId())) {
                    Context az_2 = aVar.az_();
                    if (az_2 == null) {
                        C89219l.m154715b();
                    }
                    String string2 = az_2.getString(R.string.d97, user.getYoutubeChannelTitle());
                    C89219l.m154716b(string2, "");
                    arrayList.add(aVar.mo104133a(user, 2, R.raw.icon_youtube, string2));
                }
                if (!TextUtils.isEmpty(user.getTwitterId())) {
                    String a = C1764a.m5928a("Twitter: %s", Arrays.copyOf(new Object[]{user.getTwitterName()}, 1));
                    C89219l.m154716b(a, "");
                    arrayList.add(aVar.mo104133a(user, 3, R.raw.icon_twitter, a));
                }
                C23208a b = new C23208a.C23211b().mo37795a(arrayList).mo37800b();
                Fragment a2 = C12777b.m22999a((AbstractC1204m) aVar);
                if (a2 != null) {
                    iVar = a2.getFragmentManager();
                }
                b.show(iVar, "third social");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.c.a.a$e */
    static final class C64560e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64555a f146266a;

        static {
            Covode.recordClassIndex(76024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64560e(C64555a aVar) {
            super(1);
            this.f146266a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            boolean z;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || t.isBlock)) {
                C64555a aVar3 = this.f146266a;
                if (aVar3.f31048h) {
                    boolean g = C80580in.m139694g(t);
                    if (t.isBlock() || (!g && t.isSecret() && (t.getFollowStatus() == 0 || t.getFollowStatus() == 4))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || C63743e.m115268a() || (!aVar3.mo104135v() && C16048b.m29633a().mo25412a(true, "is_hide_social_button", 0) == 1)) {
                        TuxButton tuxButton = aVar3.f146256j;
                        if (tuxButton != null) {
                            tuxButton.setVisibility(8);
                        }
                    } else {
                        aVar3.f146257k.clear();
                        if (!TextUtils.isEmpty(t.getTwitterId())) {
                            aVar3.f146257k.add(3);
                            TuxButton tuxButton2 = aVar3.f146256j;
                            if (tuxButton2 != null) {
                                tuxButton2.setVisibility(0);
                            }
                            TuxButton tuxButton3 = aVar3.f146256j;
                            if (tuxButton3 != null) {
                                tuxButton3.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_twitter));
                            }
                        }
                        if (!TextUtils.isEmpty(t.getYoutubeChannelId())) {
                            aVar3.f146257k.add(2);
                            TuxButton tuxButton4 = aVar3.f146256j;
                            if (tuxButton4 != null) {
                                tuxButton4.setVisibility(0);
                            }
                            TuxButton tuxButton5 = aVar3.f146256j;
                            if (tuxButton5 != null) {
                                tuxButton5.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_youtube));
                            }
                        }
                        if (!TextUtils.isEmpty(t.getInsId())) {
                            aVar3.f146257k.add(1);
                            TuxButton tuxButton6 = aVar3.f146256j;
                            if (tuxButton6 != null) {
                                tuxButton6.setVisibility(0);
                            }
                            TuxButton tuxButton7 = aVar3.f146256j;
                            if (tuxButton7 != null) {
                                tuxButton7.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_instagram));
                            }
                        }
                        if (aVar3.f146257k.size() == 0) {
                            TuxButton tuxButton8 = aVar3.f146256j;
                            if (tuxButton8 != null) {
                                tuxButton8.setVisibility(8);
                            }
                        } else {
                            TuxButton tuxButton9 = aVar3.f146256j;
                            if (tuxButton9 != null) {
                                tuxButton9.setVisibility(0);
                            }
                            TuxButton tuxButton10 = aVar3.f146256j;
                            if (tuxButton10 != null) {
                                tuxButton10.setOnClickListener(new View$OnClickListenerC64558c(aVar3, t));
                            }
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo104134a(int i, User user) {
        Context az_;
        if (user != null && (az_ = az_()) != null) {
            C63867b.f144793a.startThirdSocialActivity(az_, user, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C23208a.C23213d mo104133a(User user, int i, int i2, String str) {
        return (C23208a.C23213d) new C23208a.C23213d().mo37801c(i2).mo37788a(str).mo37787a(new C64559d(this, i, user));
    }
}
