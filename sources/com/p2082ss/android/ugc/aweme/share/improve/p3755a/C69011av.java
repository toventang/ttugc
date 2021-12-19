package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.internal.AbstractC23064b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.p2310al.C33489d;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.av */
public final class C69011av {

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$i */
    public static final class C69024i extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        public static final C69024i f154393a = new C69024i();

        static {
            Covode.recordClassIndex(81338);
        }

        C69024i() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(81325);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$f */
    public static final class DialogInterface$OnDismissListenerC69021f implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC69021f f154386a = new DialogInterface$OnDismissListenerC69021f();

        static {
            Covode.recordClassIndex(81335);
        }

        DialogInterface$OnDismissListenerC69021f() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC81915c.m141874a(new C33489d(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$g */
    public static final class DialogInterface$OnShowListenerC69022g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public static final DialogInterface$OnShowListenerC69022g f154387a = new DialogInterface$OnShowListenerC69022g();

        static {
            Covode.recordClassIndex(81336);
        }

        DialogInterface$OnShowListenerC69022g() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            AbstractC81915c.m141874a(new C33489d(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$b */
    public static final class C69013b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC49691s f154363a;

        /* renamed from: b */
        final /* synthetic */ Aweme f154364b;

        /* renamed from: c */
        final /* synthetic */ String f154365c;

        /* renamed from: d */
        final /* synthetic */ String f154366d;

        /* renamed from: e */
        final /* synthetic */ String f154367e;

        static {
            Covode.recordClassIndex(81327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69013b(AbstractC49691s sVar, Aweme aweme, String str, String str2, String str3) {
            super(1);
            this.f154363a = sVar;
            this.f154364b = aweme;
            this.f154365c = str;
            this.f154366d = str2;
            this.f154367e = str3;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.epg, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69011av.C69013b.C690141 */

                /* renamed from: a */
                final /* synthetic */ C69013b f154368a;

                static {
                    Covode.recordClassIndex(81328);
                }

                {
                    this.f154368a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC49691s sVar = this.f154368a.f154363a;
                    if (sVar != null) {
                        sVar.mo63634a(new C49672ag(2, this.f154368a.f154364b));
                    }
                    C69011av.m121897b(true, this.f154368a.f154364b, this.f154368a.f154365c, this.f154368a.f154366d, this.f154368a.f154367e);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.eph, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69011av.C69013b.C690152 */

                /* renamed from: a */
                final /* synthetic */ C69013b f154369a;

                static {
                    Covode.recordClassIndex(81329);
                }

                {
                    this.f154369a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C69011av.m121897b(false, this.f154369a.f154364b, this.f154369a.f154365c, this.f154369a.f154366d, this.f154369a.f154367e);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$c */
    public static final class C69016c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC49691s f154370a;

        /* renamed from: b */
        final /* synthetic */ Aweme f154371b;

        /* renamed from: c */
        final /* synthetic */ String f154372c;

        /* renamed from: d */
        final /* synthetic */ String f154373d;

        /* renamed from: e */
        final /* synthetic */ String f154374e;

        static {
            Covode.recordClassIndex(81330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69016c(AbstractC49691s sVar, Aweme aweme, String str, String str2, String str3) {
            super(1);
            this.f154370a = sVar;
            this.f154371b = aweme;
            this.f154372c = str;
            this.f154373d = str2;
            this.f154374e = str3;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.epg, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69011av.C69016c.C690171 */

                /* renamed from: a */
                final /* synthetic */ C69016c f154375a;

                static {
                    Covode.recordClassIndex(81331);
                }

                {
                    this.f154375a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC49691s sVar = this.f154375a.f154370a;
                    if (sVar != null) {
                        sVar.mo63634a(new C49672ag(2, this.f154375a.f154371b));
                    }
                    C69011av.m121897b(true, this.f154375a.f154371b, this.f154375a.f154372c, this.f154375a.f154373d, this.f154375a.f154374e);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.eph, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69011av.C69016c.C690182 */

                /* renamed from: a */
                final /* synthetic */ C69016c f154376a;

                static {
                    Covode.recordClassIndex(81332);
                }

                {
                    this.f154376a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C69011av.m121897b(false, this.f154376a.f154371b, this.f154376a.f154372c, this.f154376a.f154373d, this.f154376a.f154374e);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m121893a(Aweme aweme) {
        boolean z;
        String uid;
        String str = "";
        C89219l.m154721d(aweme, str);
        C33743c cVar = new C33743c();
        User author = aweme.getAuthor();
        if (!(author == null || (uid = author.getUid()) == null)) {
            str = uid;
        }
        C33743c a = cVar.mo59976a("author_id", str);
        if (aweme.getVideo() == null) {
            z = true;
        } else {
            z = false;
        }
        C33830n.m70668a("aweme_video_author_info_unmatch", a.mo59971a("video_is_null", Boolean.valueOf(z)).mo59977a());
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$h */
    public static final class C69023h extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC49691s f154388a;

        /* renamed from: b */
        final /* synthetic */ Aweme f154389b;

        /* renamed from: c */
        final /* synthetic */ String f154390c;

        /* renamed from: d */
        final /* synthetic */ String f154391d;

        /* renamed from: e */
        final /* synthetic */ String f154392e;

        static {
            Covode.recordClassIndex(81337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69023h(AbstractC49691s sVar, Aweme aweme, String str, String str2, String str3) {
            super(1);
            this.f154388a = sVar;
            this.f154389b = aweme;
            this.f154390c = str;
            this.f154391d = str2;
            this.f154392e = str3;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            Long l;
            String str;
            TcmConfig i;
            User currentUser;
            C37437a commerceVideoAuthInfo;
            C89219l.m154721d(aVar, "");
            AbstractC49691s sVar = this.f154388a;
            if (sVar != null) {
                sVar.mo63634a(new C49672ag(2, this.f154389b));
            }
            Aweme aweme = this.f154389b;
            if (aweme != null) {
                C69011av.m121897b(true, aweme, this.f154390c, this.f154391d, this.f154392e);
            }
            C33744d a = new C33744d().mo59980a("reason", 10);
            Aweme aweme2 = this.f154389b;
            Integer num = null;
            if (aweme2 == null || (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) == null) {
                l = null;
            } else {
                l = Long.valueOf(commerceVideoAuthInfo.getMissionId());
            }
            C33744d a2 = a.mo59982a("mission_id", l);
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (!(createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null)) {
                num = Integer.valueOf(currentUser.getFollowerCount());
            }
            C33744d a3 = a2.mo59982a("creator_followers", num);
            ITcmService j = TcmServiceImpl.m135859j();
            if (j == null || (i = j.mo121266i()) == null || !i.isTcmCreator()) {
                str = "1";
            } else {
                str = "0";
            }
            C39162r.m79460a("mission_requirement_toast", a3.mo59983a("creator_type", str).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static final boolean m121896a(Integer num) {
        if (num == null) {
            return false;
        }
        if (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 7 || num.intValue() == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$d */
    public static final class DialogInterface$OnClickListenerC69019d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Aweme f154377a;

        /* renamed from: b */
        final /* synthetic */ String f154378b;

        /* renamed from: c */
        final /* synthetic */ String f154379c;

        /* renamed from: d */
        final /* synthetic */ String f154380d;

        static {
            Covode.recordClassIndex(81333);
        }

        DialogInterface$OnClickListenerC69019d(Aweme aweme, String str, String str2, String str3) {
            this.f154377a = aweme;
            this.f154378b = str;
            this.f154379c = str2;
            this.f154380d = str3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C69011av.m121897b(false, this.f154377a, this.f154378b, this.f154379c, this.f154380d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$a */
    public static final class C69012a implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f154361a;

        /* renamed from: b */
        final /* synthetic */ Activity f154362b;

        static {
            Covode.recordClassIndex(81326);
        }

        C69012a(AbstractC89171a aVar, Activity activity) {
            this.f154361a = aVar;
            this.f154362b = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0) {
                if (iArr[0] == 0) {
                    AbstractC89171a aVar = this.f154361a;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
                ShareDependService.C68822a.m121324a().mo109328a(this.f154362b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.av$e */
    public static final class DialogInterface$OnClickListenerC69020e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC49691s f154381a;

        /* renamed from: b */
        final /* synthetic */ Aweme f154382b;

        /* renamed from: c */
        final /* synthetic */ String f154383c;

        /* renamed from: d */
        final /* synthetic */ String f154384d;

        /* renamed from: e */
        final /* synthetic */ String f154385e;

        static {
            Covode.recordClassIndex(81334);
        }

        DialogInterface$OnClickListenerC69020e(AbstractC49691s sVar, Aweme aweme, String str, String str2, String str3) {
            this.f154381a = sVar;
            this.f154382b = aweme;
            this.f154383c = str;
            this.f154384d = str2;
            this.f154385e = str3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC49691s sVar = this.f154381a;
            if (sVar != null) {
                sVar.mo63634a(new C49672ag(2, this.f154382b));
            }
            C69011av.m121897b(true, this.f154382b, this.f154383c, this.f154384d, this.f154385e);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static final void m121890a(Activity activity, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(activity, "");
        if (C80620e.m139781c(activity) == 0) {
            aVar.invoke();
        } else {
            C35444b.m72473a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C69012a(aVar, activity));
        }
    }

    /* renamed from: a */
    public static final boolean m121895a(Aweme aweme, Context context) {
        C89219l.m154721d(context, "");
        if (aweme == null) {
            return false;
        }
        AwemeStatus status = aweme.getStatus();
        if (status == null || status.isAllowShare()) {
            return true;
        }
        AwemeStatus status2 = aweme.getStatus();
        C89219l.m154716b(status2, "");
        if (status2.isInReviewing()) {
            AwemeStatus status3 = aweme.getStatus();
            C89219l.m154716b(status3, "");
            if (status3.isSelfSee()) {
                new C79459a(context).mo123050a(R.string.gg2).mo123053a();
                return false;
            }
        }
        new C79459a(context).mo123050a(R.string.a8v).mo123053a();
        return false;
    }

    /* renamed from: b */
    public static void m121897b(boolean z, Aweme aweme, String str, String str2, String str3) {
        String str4;
        long j;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (C76706a.m134278d(aweme)) {
            str4 = "story";
        } else {
            str4 = UGCMonitor.TYPE_POST;
        }
        Story story = aweme.getStory();
        if (story != null) {
            j = story.getViewerCount();
        } else {
            j = -1;
        }
        C33744d a = new C33744d().mo59983a("group_id", aweme.getAid()).mo59983a("enter_from", str).mo59983a("impr_id", str3).mo59983a("story_type", str4).mo59981a("item_vv", j);
        if (TextUtils.equals(str, "personal_homepage")) {
            a.mo59983a("tab_name", str2);
        }
        if (z) {
            C39162r.m79460a("confirm_delete_video", a.f79943a);
        } else {
            C39162r.m79460a("cancel_delete_video", a.f79943a);
        }
    }

    /* renamed from: a */
    private static void m121891a(Context context, Aweme aweme, AbstractC49691s<C49672ag> sVar, String str, String str2, String str3) {
        QaStruct qaStruct;
        Integer num;
        Integer num2;
        int i;
        C37437a commerceVideoAuthInfo;
        C37437a commerceVideoAuthInfo2;
        Integer valueOf;
        C37437a commerceVideoAuthInfo3;
        String valueOf2;
        String str4 = "";
        C89219l.m154721d(context, str4);
        C89219l.m154721d(aweme, str4);
        C89219l.m154721d(str, str4);
        C89219l.m154721d(str2, str4);
        C89219l.m154721d(str3, str4);
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            Iterator<T> it = interactStickerStructs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                C89219l.m154716b(next, str4);
                if (next.getQaStruct() != null) {
                    qaStruct = next.getQaStruct();
                    break;
                }
            }
        }
        qaStruct = null;
        C17197a.C17200a aVar = new C17197a.C17200a(context);
        if (aweme.getStarAtlasOrderId() > 0) {
            aVar.mo27194b(R.string.b5d);
        } else {
            C37437a commerceVideoAuthInfo4 = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo4 == null || !commerceVideoAuthInfo4.isAdvPromotable()) {
                AwemeStatus status = aweme.getStatus();
                C89219l.m154716b(status, str4);
                if (status.isInReviewing()) {
                    AwemeStatus status2 = aweme.getStatus();
                    C89219l.m154716b(status2, str4);
                    if (status2.isSelfSee() && !aweme.isPrivate()) {
                        C23028c.m43435a((C23023b) new C23023b(context).mo37479a(R.string.epj).mo37483b(R.string.epi), new C69013b(sVar, aweme, str2, str, str3)).mo37405a().mo37396b().show();
                        return;
                    }
                }
                if (!(qaStruct == null || (valueOf2 = String.valueOf(qaStruct.getItemId())) == null)) {
                    str4 = valueOf2;
                }
                if (TextUtils.equals(str4, aweme.getAid()) && QnaService.m117969a().enablePublicQna()) {
                    C23028c.m43435a((C23023b) new C23023b(context).mo37479a(R.string.f31).mo37483b(R.string.f33), new C69016c(sVar, aweme, str2, str, str3)).mo37405a().mo37396b().show();
                    return;
                } else if (C76706a.m134278d(aweme)) {
                    aVar.mo27194b(R.string.b5k);
                } else {
                    if (aweme == null || (commerceVideoAuthInfo3 = aweme.getCommerceVideoAuthInfo()) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(commerceVideoAuthInfo3.getMissionItemStatus());
                    }
                    if (m121896a(num) || !(aweme == null || (commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo()) == null || (valueOf = Integer.valueOf(commerceVideoAuthInfo2.getMissionItemStatus())) == null || (valueOf.intValue() != 5 && valueOf.intValue() != 6))) {
                        C23025b bVar = new C23025b(context);
                        bVar.mo37416a(R.string.d3i, new C69023h(sVar, aweme, str2, str, str3));
                        bVar.mo37418b(R.string.d3h, C69024i.f154393a);
                        AbstractC23064b a = C23013a.C23015a.m43405a(context).mo37479a(R.string.d3l);
                        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
                            num2 = null;
                        } else {
                            num2 = Integer.valueOf(commerceVideoAuthInfo.getMissionItemStatus());
                        }
                        if (m121896a(num2)) {
                            i = R.string.d3j;
                        } else {
                            i = R.string.d3k;
                        }
                        ((C23023b) ((C23023b) a.mo37483b(i)).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
                        return;
                    }
                    aVar.mo27194b(R.string.b58);
                }
            } else {
                aVar.mo27194b(R.string.eys);
            }
        }
        C17197a.C17200a a2 = aVar.mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC69019d(aweme, str2, str, str3), false).mo27190a(R.string.b55, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC69020e(sVar, aweme, str2, str, str3), false);
        a2.f41083n = DialogInterface$OnDismissListenerC69021f.f154386a;
        a2.f41084o = DialogInterface$OnShowListenerC69022g.f154387a;
        a2.mo27193a().mo27184b();
    }

    /* renamed from: a */
    public static /* synthetic */ void m121892a(Context context, Aweme aweme, AbstractC49691s sVar, String str, String str2, String str3, int i) {
        String str4 = str;
        String str5 = str2;
        String str6 = "";
        if ((i & 8) != 0) {
            str4 = str6;
        }
        if ((i & 16) != 0) {
            str5 = str6;
        }
        if ((i & 32) == 0) {
            str6 = str3;
        }
        m121891a(context, aweme, sVar, str4, str5, str6);
    }
}
