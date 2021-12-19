package com.p2082ss.android.ugc.aweme.ufr.contact;

import android.content.Context;
import androidx.core.app.ActivityC0580d;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.AbstractC17765f;
import com.bytedance.ies.powerpermissions.AbstractC17769i;
import com.bytedance.ies.powerpermissions.C17770j;
import com.bytedance.ies.powerpermissions.C17773l;
import com.bytedance.ies.powerpermissions.C17775m;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34505b;
import com.p2082ss.android.ugc.aweme.experiment.C46905er;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.C79547e;
import com.p2082ss.android.ugc.aweme.ufr.C79548f;
import com.p2082ss.android.ugc.aweme.ufr.contact.C79542a;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88920g;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88497a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR */
public final class ContactUFR extends AbstractC79495a implements AbstractC1202k {

    /* renamed from: j */
    public static final C79522a f178477j = new C79522a((byte) 0);

    /* renamed from: h */
    public AbstractC88412b f178478h;

    /* renamed from: i */
    public boolean f178479i;

    /* renamed from: k */
    private final C88411a f178480k = new C88411a();

    static {
        Covode.recordClassIndex(92725);
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR$a */
    public static final class C79522a {
        static {
            Covode.recordClassIndex(92726);
        }

        private C79522a() {
        }

        public /* synthetic */ C79522a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: g */
    public final AbstractC88979t<C79547e> mo123079g() {
        AbstractC88979t<C79547e> a = AbstractC88979t.m154294a(new C79526c(this));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: i */
    public final AbstractC88979t<C79547e> mo123081i() {
        AbstractC88979t<C79547e> a = AbstractC88979t.m154294a(C79539h.f178508a);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: f */
    public final AbstractC88979t<C79547e> mo123078f() {
        boolean z;
        if (C0643b.m2367a(C17867d.m33078a(), "android.permission.READ_CONTACTS") != -1) {
            z = true;
        } else {
            z = false;
        }
        AbstractC88979t<C79547e> b = AbstractC88979t.m154310b(new C79547e(z, 0, 0, null, 14));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: h */
    public final AbstractC88979t<C79547e> mo123080h() {
        boolean z;
        if (!this.f178437f || !C89219l.m154714a((Object) "version_update", (Object) mo123075c())) {
            z = false;
        } else {
            z = true;
        }
        AbstractC88979t<C79547e> a = AbstractC88979t.m154294a(new C79523b(this, z));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: e */
    public final AbstractC88979t<C79547e> mo123077e() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    AbstractC88979t<C79547e> b = AbstractC88979t.m154310b(new C79547e(socialPlatformSetting.getSyncStatus(), 0, 0, null, 14));
                    C89219l.m154716b(b, "");
                    return b;
                }
            }
        }
        AbstractC88979t<C79547e> b2 = AbstractC88979t.m154310b(new C79547e(false, 0, 0, null, 14));
        C89219l.m154716b(b2, "");
        return b2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR$b */
    static final class C79523b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ ContactUFR f178481a;

        /* renamed from: b */
        final /* synthetic */ boolean f178482b;

        static {
            Covode.recordClassIndex(92727);
        }

        C79523b(ContactUFR contactUFR, boolean z) {
            this.f178481a = contactUFR;
            this.f178482b = z;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C79547e> vVar) {
            C89219l.m154721d(vVar, "");
            C17773l.C17774a aVar = C17773l.f42440d;
            Context a = this.f178481a.mo123071a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            aVar.mo28243a((ActivityC0945e) a, null).mo28229a("android.permission.READ_CONTACTS").mo28228a(new AbstractC17769i(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79523b.C795241 */

                /* renamed from: b */
                final /* synthetic */ C79523b f178483b;

                static {
                    Covode.recordClassIndex(92728);
                }

                {
                    this.f178483b = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.powerpermissions.AbstractC17769i
                /* renamed from: a */
                public final void mo28242a(C17775m mVar, C17749a... aVarArr) {
                    C89219l.m154721d(aVarArr, "");
                    int i = C79545b.f178514a[aVarArr[0].f42426b.ordinal()];
                    if (i == 1) {
                        vVar.mo143031a(new C79547e(true, 0, 0, null, 14));
                        if (mVar != null) {
                            mVar.mo28247b();
                        }
                    } else if (i != 2) {
                        if (i == 3) {
                            ContactUFR contactUFR = this.f178483b.f178481a;
                            AbstractC88982v vVar = vVar;
                            C89219l.m154716b(vVar, "");
                            C23023b bVar = new C23023b(contactUFR.mo123071a());
                            C51488a.m95918a(contactUFR.mo123075c(), "guide", "contact", contactUFR.mo123076d(), "off", C51488a.m95925b(), contactUFR.f178436e);
                            ((C23023b) C23028c.m43435a((C23023b) bVar.mo37411b(C46905er.m90203a()).mo37483b(R.string.ep4), new C79527d(contactUFR, vVar)).mo37482a(false)).mo37405a().mo37396b().show();
                            if (mVar != null) {
                                mVar.mo28247b();
                            }
                        }
                    } else if (this.f178483b.f178482b) {
                        C51488a.m95918a(this.f178483b.f178481a.mo123075c(), "system", "contact", this.f178483b.f178481a.mo123076d(), "unknown", C51488a.m95925b(), this.f178483b.f178481a.f178436e);
                        if (mVar != null) {
                            mVar.mo28245a();
                        }
                    } else {
                        ContactUFR contactUFR2 = this.f178483b.f178481a;
                        AbstractC88982v vVar2 = vVar;
                        C89219l.m154716b(vVar2, "");
                        C51488a.m95918a(contactUFR2.mo123075c(), "authorize", "contact", contactUFR2.mo123076d(), "unknown", C51488a.m95925b(), contactUFR2.f178436e);
                        ((C23023b) C23028c.m43435a(new C23023b(contactUFR2.mo123071a()).mo37411b(C46905er.m90203a()).mo37413d(C46905er.m90206d()), new C79530e(contactUFR2, mVar, vVar2)).mo37482a(false)).mo37405a().mo37396b().show();
                    }
                }
            }).mo28230a(new AbstractC17765f(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79523b.C795252 */

                /* renamed from: a */
                final /* synthetic */ C79523b f178485a;

                static {
                    Covode.recordClassIndex(92729);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: f.a.v */
                /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: f.a.v */
                /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.powerpermissions.AbstractC17765f
                /* renamed from: a */
                public final void mo28241a(C17749a... aVarArr) {
                    C89219l.m154721d(aVarArr, "");
                    int i = C79545b.f178515b[aVarArr[0].f42426b.ordinal()];
                    if (i == 1) {
                        C51488a.m95920a(this.f178485a.f178481a.mo123075c(), "system", "contact", true, false, this.f178485a.f178481a.mo123076d(), "unknown", C51488a.m95925b(), this.f178485a.f178481a.f178436e, 16);
                        vVar.mo143031a(new C79547e(true, 0, 0, null, 14));
                    } else if (i == 2) {
                        C51488a.m95920a(this.f178485a.f178481a.mo123075c(), "system", "contact", false, false, this.f178485a.f178481a.mo123076d(), "unknown", C51488a.m95925b(), this.f178485a.f178481a.f178436e, 16);
                        vVar.mo143031a(new C79547e(false, 0, 0, null, 14));
                    } else if (i == 3) {
                        C51488a.m95919a(this.f178485a.f178481a.mo123075c(), "system", "contact", false, false, this.f178485a.f178481a.mo123076d(), "off", C51488a.m95925b(), this.f178485a.f178481a.f178436e);
                        vVar.mo143031a(new C79547e(false, 0, 0, null, 14));
                    }
                }

                {
                    this.f178485a = r1;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR$d */
    static final class C79527d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ContactUFR f178488a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88920g f178489b;

        static {
            Covode.recordClassIndex(92731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79527d(ContactUFR contactUFR, AbstractC88920g gVar) {
            super(1);
            this.f178488a = contactUFR;
            this.f178489b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.fos, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79527d.C795281 */

                /* renamed from: a */
                final /* synthetic */ C79527d f178490a;

                static {
                    Covode.recordClassIndex(92732);
                }

                {
                    this.f178490a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    if (C89219l.m154714a((Object) this.f178490a.f178488a.mo123075c(), (Object) "privacy_setting")) {
                        new BackFromSettingEvent("privacy_setting").post();
                    }
                    Context a = this.f178490a.f178488a.mo123071a();
                    if (!(a instanceof ActivityC0945e)) {
                        a = null;
                    }
                    ActivityC0580d dVar = (ActivityC0580d) a;
                    if (dVar != null && (!this.f178490a.f178488a.f178479i)) {
                        dVar.getLifecycle().mo4012a(this.f178490a.f178488a);
                        this.f178490a.f178488a.f178479i = true;
                    }
                    Context a2 = this.f178490a.f178488a.mo123071a();
                    C89219l.m154719c(a2, "");
                    C17770j.m32959b(a2, C17770j.m32958b(a2));
                    C51488a.m95920a(this.f178490a.f178488a.mo123075c(), "guide", "contact", true, false, this.f178490a.f178488a.mo123076d(), "off", C51488a.m95925b(), this.f178490a.f178488a.f178436e, 16);
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    C89219l.m154716b(curUser, "");
                    Keva.getRepo("cold_boot_for_fb_and_ctx").storeBoolean("click_contact_open_setting".concat(String.valueOf(curUser.getUid())), true);
                    this.f178490a.f178489b.mo143031a(new C79547e(false, 1, 0, null, 12));
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37419b(C46905er.m90208f(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79527d.C795292 */

                /* renamed from: a */
                final /* synthetic */ C79527d f178491a;

                static {
                    Covode.recordClassIndex(92733);
                }

                {
                    this.f178491a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95920a(this.f178491a.f178488a.mo123075c(), "guide", "contact", false, false, this.f178491a.f178488a.mo123076d(), "off", C51488a.m95925b(), this.f178491a.f178488a.f178436e, 16);
                    this.f178491a.f178489b.mo143031a(new C79547e(false, 0, 0, null, 14));
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR$e */
    static final class C79530e extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ContactUFR f178492a;

        /* renamed from: b */
        final /* synthetic */ C17775m f178493b;

        /* renamed from: c */
        final /* synthetic */ AbstractC88920g f178494c;

        static {
            Covode.recordClassIndex(92734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79530e(ContactUFR contactUFR, C17775m mVar, AbstractC88920g gVar) {
            super(1);
            this.f178492a = contactUFR;
            this.f178493b = mVar;
            this.f178494c = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(C46905er.m90207e(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79530e.C795311 */

                /* renamed from: a */
                final /* synthetic */ C79530e f178495a;

                static {
                    Covode.recordClassIndex(92735);
                }

                {
                    this.f178495a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95918a(this.f178495a.f178492a.mo123075c(), "system", "contact", this.f178495a.f178492a.mo123076d(), "unknown", C51488a.m95925b(), this.f178495a.f178492a.f178436e);
                    C51488a.m95920a(this.f178495a.f178492a.mo123075c(), "authorize", "contact", true, false, this.f178495a.f178492a.mo123076d(), "unknown", C51488a.m95925b(), this.f178495a.f178492a.f178436e, 16);
                    C17775m mVar = this.f178495a.f178493b;
                    if (mVar != null) {
                        mVar.mo28245a();
                    }
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37419b(C46905er.m90208f(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79530e.C795322 */

                /* renamed from: a */
                final /* synthetic */ C79530e f178496a;

                static {
                    Covode.recordClassIndex(92736);
                }

                {
                    this.f178496a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95920a(this.f178496a.f178492a.mo123075c(), "authorize", "contact", false, false, this.f178496a.f178492a.mo123076d(), "unknown", C51488a.m95925b(), this.f178496a.f178492a.f178436e, 16);
                    C17775m mVar = this.f178496a.f178493b;
                    if (mVar != null) {
                        mVar.mo28247b();
                    }
                    this.f178496a.f178494c.mo143031a(new C79547e(false, 0, 0, null, 14));
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR$f */
    static final class C79533f extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ContactUFR f178497a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88920g f178498b;

        static {
            Covode.recordClassIndex(92737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79533f(ContactUFR contactUFR, AbstractC88920g gVar) {
            super(1);
            this.f178497a = contactUFR;
            this.f178498b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(C46905er.m90207e(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79533f.C795341 */

                /* renamed from: a */
                final /* synthetic */ C79533f f178499a;

                static {
                    Covode.recordClassIndex(92738);
                }

                {
                    this.f178499a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95920a(this.f178499a.f178497a.mo123075c(), "user", "contact", true, false, this.f178499a.f178497a.mo123076d(), "on", "off", this.f178499a.f178497a.f178436e, 16);
                    this.f178499a.f178498b.mo143031a(new C79547e(true, 0, 0, null, 14));
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37419b(C46905er.m90208f(), new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79533f.C795352 */

                /* renamed from: a */
                final /* synthetic */ C79533f f178500a;

                static {
                    Covode.recordClassIndex(92739);
                }

                {
                    this.f178500a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C51488a.m95920a(this.f178500a.f178497a.mo123075c(), "user", "contact", false, false, this.f178500a.f178497a.mo123076d(), "on", "off", this.f178500a.f178497a.f178436e, 16);
                    this.f178500a.f178498b.mo143031a(new C79547e(false, 0, 0, null, 14));
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR$g */
    static final class C79536g<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ ContactUFR f178501a;

        /* renamed from: b */
        final /* synthetic */ boolean f178502b;

        /* renamed from: c */
        final /* synthetic */ int f178503c;

        static {
            Covode.recordClassIndex(92740);
        }

        C79536g(ContactUFR contactUFR, boolean z, int i) {
            this.f178501a = contactUFR;
            this.f178502b = z;
            this.f178503c = i;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C79547e> vVar) {
            C89219l.m154721d(vVar, "");
            this.f178501a.f178478h = AbstractC51474a.m95881a().syncSocialRelationStatusInRx(1, Boolean.valueOf(this.f178502b)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79536g.C795371 */

                /* renamed from: a */
                final /* synthetic */ C79536g f178504a;

                static {
                    Covode.recordClassIndex(92741);
                }

                {
                    this.f178504a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    String str;
                    String str2;
                    vVar.mo143031a(new C79547e(this.f178504a.f178502b, 0, 0, null, 14));
                    C79548f.m138255a(EnumC66622f.CONTACT);
                    if (this.f178504a.f178502b) {
                        String c = this.f178504a.f178501a.mo123075c();
                        if (this.f178504a.f178503c == 1) {
                            str = "system";
                        } else {
                            str = "user";
                        }
                        int i = this.f178504a.f178503c;
                        if (i == 1) {
                            str2 = "both";
                        } else if (i != 2) {
                            str2 = "did";
                        } else {
                            str2 = "uid";
                        }
                        C51488a.m95930b(c, str, "contact", this.f178504a.f178501a.mo123076d(), str2, "process", this.f178504a.f178501a.f178436e);
                    }
                    AbstractC88412b bVar = this.f178504a.f178501a.f178478h;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79536g.C795382 */

                /* renamed from: a */
                final /* synthetic */ C79536g f178506a;

                static {
                    Covode.recordClassIndex(92742);
                }

                {
                    this.f178506a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7
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
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(java.lang.Object r11) {
                    /*
                    // Method dump skipped, instructions count: 121
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79536g.C795382.accept(java.lang.Object):void");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR$h */
    static final class C79539h<T> implements AbstractC88983w {

        /* renamed from: a */
        public static final C79539h f178508a = new C79539h();

        static {
            Covode.recordClassIndex(92743);
        }

        C79539h() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C79547e> vVar) {
            C89219l.m154721d(vVar, "");
            C79542a.C79543a aVar = C79542a.C79543a.f178512a;
            C88466b.m153697a((Object) aVar, "source is null");
            AbstractC88410b a = C88925a.m154165a(new C88497a(aVar));
            C89219l.m154716b(a, "");
            a.mo142941b(C88925a.m154180b(C88946a.f201991c)).mo142937a(C88391a.m153580a(C88392a.f200660a)).mo142935a(new AbstractC88428a() {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79539h.C795401 */

                static {
                    Covode.recordClassIndex(92744);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4560f.p4561a.p4567d.AbstractC88428a
                /* renamed from: a */
                public final void mo8579a() {
                    vVar.mo143031a(new C79547e(true, 0, 0, null, 14));
                }
            }, new AbstractC88433f() {
                /* class com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.C79539h.C795412 */

                static {
                    Covode.recordClassIndex(92745);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    int i;
                    Throwable th = (Throwable) obj;
                    AbstractC88982v vVar = vVar;
                    if (!(th instanceof C34485a)) {
                        th = null;
                    }
                    C34480a aVar = (C34480a) th;
                    if (aVar != null) {
                        i = aVar.getErrorCode();
                    } else {
                        i = -1;
                    }
                    vVar.mo143031a(new C79547e(false, 0, i, null, 10));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.ContactUFR$c */
    static final class C79526c<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ ContactUFR f178487a;

        static {
            Covode.recordClassIndex(92730);
        }

        C79526c(ContactUFR contactUFR) {
            this.f178487a = contactUFR;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C79547e> vVar) {
            C89219l.m154721d(vVar, "");
            ContactUFR contactUFR = this.f178487a;
            C51488a.m95918a(contactUFR.mo123075c(), "user", "contact", contactUFR.mo123076d(), "on", "off", contactUFR.f178436e);
            ((C23023b) C23028c.m43435a(new C23023b(contactUFR.mo123071a()).mo37411b(C46905er.m90203a()).mo37413d(C46905er.m90206d()), new C79533f(contactUFR, vVar)).mo37482a(false)).mo37405a().mo37396b().show();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: a */
    public final AbstractC88979t<C79547e> mo123072a(boolean z, int i) {
        C79519c.C79520a.m138231a(z);
        AbstractC88979t<C79547e> a = AbstractC88979t.m154294a(new C79536g(this, z, i));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (this.f178479i && aVar == AbstractC1196i.EnumC1198a.ON_RESUME && C80241be.m139079a(mo123071a())) {
            this.f178479i = false;
            if (!C89219l.m154714a((Object) mo123075c(), (Object) "privacy_setting") && !C89219l.m154714a((Object) mo123075c(), (Object) "find_friends_page")) {
                ((AbstractC51435a) C34505b.m70490a(mo123071a(), AbstractC51435a.class)).mo60945a(false);
                AbstractC88979t<C79547e> b = mo123072a(true, 0).mo143278b(C88925a.m154180b(C88946a.f201991c));
                AbstractC88433f<? super C79547e> fVar = C88446a.f200698d;
                AbstractC88412b a = b.mo143254a(fVar, (AbstractC88433f<? super Throwable>) fVar);
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f178480k);
                if (this.f178438g) {
                    AbstractC88979t<C79547e> b2 = mo123081i().mo143278b(C88925a.m154180b(C88946a.f201991c));
                    AbstractC88433f<? super C79547e> fVar2 = C88446a.f200698d;
                    AbstractC88412b a2 = b2.mo143254a(fVar2, (AbstractC88433f<? super Throwable>) fVar2);
                    C89219l.m154716b(a2, "");
                    C88934a.m154195a(a2, this.f178480k);
                }
            }
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            this.f178480k.dispose();
            mVar.getLifecycle().mo4013b(this);
        }
    }
}
