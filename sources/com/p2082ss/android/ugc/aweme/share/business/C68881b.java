package com.p2082ss.android.ugc.aweme.share.business;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27540z;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69050g;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69087m;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.p3760e.C69190a;
import com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69199c;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3744b.C68877a;
import com.p2082ss.android.ugc.aweme.share.p3747e.C68919a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69679e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareChannelBar;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3783a.C69659a;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.business.b */
public final class C68881b {

    /* renamed from: a */
    public final int f154064a;

    /* renamed from: b */
    public final String f154065b;

    /* renamed from: c */
    public final String f154066c;

    /* renamed from: d */
    public final String f154067d;

    /* renamed from: e */
    public final String f154068e;

    /* renamed from: f */
    public final String f154069f;

    /* renamed from: g */
    public final String f154070g;

    /* renamed from: h */
    public final String f154071h;

    /* renamed from: i */
    public final String f154072i;

    /* renamed from: j */
    public final String f154073j;

    /* renamed from: k */
    public final String f154074k;

    /* renamed from: l */
    public final String f154075l;

    /* renamed from: m */
    public final String f154076m;

    /* renamed from: n */
    public final String f154077n;

    /* renamed from: o */
    public final Activity f154078o;

    /* renamed from: p */
    public final Fragment f154079p;

    /* renamed from: q */
    public final Aweme f154080q;

    /* renamed from: r */
    public final boolean f154081r;

    /* renamed from: s */
    public final AbstractC49691s<C49672ag> f154082s;

    /* renamed from: t */
    public final Bundle f154083t;

    /* renamed from: u */
    private final AbstractC89244h f154084u = C89250i.m154773a((AbstractC89171a) new C68882a(this));

    /* renamed from: v */
    private final List<String> f154085v;

    static {
        Covode.recordClassIndex(81186);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final DialogC81438i mo109450a() {
        return (DialogC81438i) this.f154084u.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$h */
    public static final class C68891h implements AbstractC69575a {

        /* renamed from: a */
        final /* synthetic */ Activity f154102a;

        static {
            Covode.recordClassIndex(81196);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a
        /* renamed from: a */
        public final Activity mo81451a() {
            return this.f154102a;
        }

        public C68891h(Activity activity) {
            this.f154102a = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$a */
    static final class C68882a extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ C68881b f154086a;

        static {
            Covode.recordClassIndex(81187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68882a(C68881b bVar) {
            super(0);
            this.f154086a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f154086a.f154078o);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$e */
    public static final class C68888e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Dialog f154098a;

        static {
            Covode.recordClassIndex(81193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68888e(Dialog dialog) {
            super(0);
            this.f154098a = dialog;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Dialog dialog = this.f154098a;
            if (dialog != null) {
                dialog.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final void mo109455c() {
        try {
            mo109450a().dismiss();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final boolean mo109454b() {
        if (TextUtils.equals(this.f154065b, "homepage_follow") || TextUtils.equals(this.f154065b, "homepage_friends") || TextUtils.equals(this.f154065b, "general_search")) {
            return true;
        }
        if (TextUtils.equals(this.f154065b, "personal_homepage") && TextUtils.isEmpty(this.f154071h)) {
            return true;
        }
        if (!TextUtils.equals(this.f154065b, "others_homepage") || !TextUtils.isEmpty(this.f154071h)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$c */
    public static final class DialogInterface$OnShowListenerC68884c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C68881b f154089a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f154090b;

        static {
            Covode.recordClassIndex(81189);
        }

        public DialogInterface$OnShowListenerC68884c(C68881b bVar, C89233z.C89238e eVar) {
            this.f154089a = bVar;
            this.f154090b = eVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            T t = this.f154090b.element;
            if (t != null) {
                C68881b.m121557a(t.getVisibility(), this.f154089a.f154080q);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$f */
    public static final class DialogInterface$OnShowListenerC68889f implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C68881b f154099a;

        /* renamed from: b */
        final /* synthetic */ DialogC69695i f154100b;

        static {
            Covode.recordClassIndex(81194);
        }

        public DialogInterface$OnShowListenerC68889f(C68881b bVar, DialogC69695i iVar) {
            this.f154099a = bVar;
            this.f154100b = iVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            ShareChannelBar shareChannelBar = (ShareChannelBar) this.f154100b.findViewById(R.id.dyk);
            C89219l.m154716b(shareChannelBar, "");
            C68881b.m121557a(shareChannelBar.getVisibility(), this.f154099a.f154080q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$d */
    public static final class C68885d extends AbstractC69679e {

        /* renamed from: a */
        final /* synthetic */ C68881b f154091a;

        /* renamed from: b */
        final /* synthetic */ C69684e f154092b;

        /* renamed from: c */
        final /* synthetic */ Dialog f154093c;

        static {
            Covode.recordClassIndex(81190);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.business.b$d$a */
        static final class C68886a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C68885d f154094a;

            /* renamed from: b */
            final /* synthetic */ AbstractC69581b f154095b;

            static {
                Covode.recordClassIndex(81191);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C68886a(C68885d dVar, AbstractC69581b bVar) {
                super(1);
                this.f154094a = dVar;
                this.f154095b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                Dialog dialog;
                boolean booleanValue = bool.booleanValue();
                AbstractC69690f fVar = this.f154094a.f154092b.f155560l;
                if (fVar != null) {
                    fVar.mo60844a(this.f154095b, booleanValue, this.f154094a.f154092b.f155557i, this.f154094a.f154091a.f154078o);
                }
                if (C69659a.m123052a()) {
                    this.f154094a.f154091a.mo109455c();
                }
                if (!this.f154095b.mo109555c() && (dialog = this.f154094a.f154093c) != null) {
                    dialog.dismiss();
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69679e
        /* renamed from: a */
        public final void mo60849a(AbstractC69581b bVar) {
            C89219l.m154721d(bVar, "");
            if (C69659a.m123052a()) {
                try {
                    this.f154091a.mo109450a().show();
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
            if (!this.f154092b.f155557i.mo109573a(bVar, this.f154091a.f154078o, new C68886a(this, bVar))) {
                this.f154092b.f155557i.mo109572a(bVar, new C68887b(this, bVar));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.business.b$d$b */
        static final class C68887b extends AbstractC89220m implements AbstractC89172b<AbstractC69645h, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C68885d f154096a;

            /* renamed from: b */
            final /* synthetic */ AbstractC69581b f154097b;

            static {
                Covode.recordClassIndex(81192);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C68887b(C68885d dVar, AbstractC69581b bVar) {
                super(1);
                this.f154096a = dVar;
                this.f154097b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC69645h hVar) {
                Dialog dialog;
                AbstractC69645h hVar2 = hVar;
                C89219l.m154721d(hVar2, "");
                this.f154097b.mo61913a(hVar2, this.f154096a.f154091a.f154078o);
                if (C69659a.m123052a()) {
                    this.f154096a.f154091a.mo109455c();
                }
                AbstractC69690f fVar = this.f154096a.f154092b.f155560l;
                if (fVar != null) {
                    fVar.mo60844a(this.f154097b, true, this.f154096a.f154092b.f155557i, this.f154096a.f154091a.f154078o);
                }
                if (!this.f154097b.mo109555c() && (dialog = this.f154096a.f154093c) != null) {
                    dialog.dismiss();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68885d(C68881b bVar, C69684e eVar, Dialog dialog, Context context, SharePackage sharePackage) {
            super(context, sharePackage);
            this.f154091a = bVar;
            this.f154092b = eVar;
            this.f154093c = dialog;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$g */
    public static final class C68890g extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        public static final C68890g f154101a = new C68890g();

        static {
            Covode.recordClassIndex(81195);
        }

        C68890g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            boolean z;
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (C69190a.C69191a.m122288a().isEmpty() || C89219l.m154714a((Object) bVar2.mo109548a(), (Object) "download")) {
                z = true;
            } else {
                z = C69190a.C69191a.m122288a().contains(bVar2.mo109548a());
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static String m121556a(Aweme aweme) {
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null) {
            int interestLevel = interactionTagInfo.getInterestLevel();
            if (interestLevel == InteractionTagInterestLevel.LOW.getLevel()) {
                return "low_interest";
            }
            if (interestLevel == InteractionTagInterestLevel.HIGH.getLevel()) {
                return "high_interest";
            }
        }
        return "";
    }

    /* renamed from: b */
    private static String m121559b(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) {
                return null;
            }
            return String.valueOf(newLiveRoomData.f114485id);
        } else if (aweme.getAuthor() == null) {
            return null;
        } else {
            User author = aweme.getAuthor();
            C89219l.m154716b(author, "");
            if (author.isLive()) {
                return String.valueOf(aweme.getAuthor().roomId);
            }
            return null;
        }
    }

    /* renamed from: c */
    private static String m121560c(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) {
                return null;
            }
            return String.valueOf(newLiveRoomData.getAnchorId());
        } else if (aweme.getAuthor() == null) {
            return null;
        } else {
            User author = aweme.getAuthor();
            C89219l.m154716b(author, "");
            if (!author.isLive()) {
                return null;
            }
            User author2 = aweme.getAuthor();
            C89219l.m154716b(author2, "");
            return author2.getUid().toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$b */
    public static final class C68883b extends C69692g {

        /* renamed from: a */
        final /* synthetic */ C68881b f154087a;

        /* renamed from: b */
        final /* synthetic */ AwemeSharePackage f154088b;

        static {
            Covode.recordClassIndex(81188);
        }

        public C68883b(C68881b bVar, AwemeSharePackage awemeSharePackage) {
            this.f154087a = bVar;
            this.f154088b = awemeSharePackage;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60845a(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            this.f154087a.f154082s.mo63634a(new C49672ag(28));
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            if (hVar instanceof C69050g) {
                this.f154087a.f154083t.putString("share_form", "url_form");
                this.f154087a.mo109452a(hVar.mo61919c(), true, sharePackage, context, this.f154087a.f154080q);
            }
            if (hVar instanceof C69087m) {
                this.f154087a.mo109452a(hVar.mo61919c(), true, sharePackage, context, this.f154087a.f154080q);
            }
            if (C89219l.m154714a((Object) hVar.mo61919c(), (Object) "live_photo")) {
                this.f154087a.mo109452a(hVar.mo61919c(), true, sharePackage, context, this.f154087a.f154080q);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b, com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g
        /* renamed from: a */
        public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            this.f154087a.f154083t.putString("share_form", this.f154088b.f155492i.getString("share_form"));
            this.f154087a.f154083t.putString("share_url", this.f154088b.f155492i.getString("share_url"));
            this.f154087a.mo109452a(bVar.mo109548a(), z, sharePackage, context, this.f154087a.f154080q);
            C48314ai.m91749b("outside_channel");
            if (z) {
                if (C89219l.m154714a((Object) bVar.mo109548a(), (Object) "copy")) {
                    AbstractC81915c.m141874a(new C68919a(1));
                } else if (!C89219l.m154714a((Object) bVar.mo109548a(), (Object) "chat_merge")) {
                    AbstractC81915c.m141874a(new C68919a(2));
                }
            }
            if ((bVar instanceof C69109b) || (bVar instanceof C69199c)) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", this.f154087a.f154065b);
                bundle.putString("enter_method", "share");
                AbstractC49691s<C49672ag> sVar = this.f154087a.f154082s;
                C49672ag agVar = new C49672ag(62);
                agVar.f114317c = bundle;
                sVar.mo63634a(agVar);
            }
        }
    }

    /* renamed from: a */
    private static AbstractC69581b m121555a(AbstractC69581b bVar, ACLCommonShare aCLCommonShare) {
        return new C69199c(bVar, aCLCommonShare);
    }

    /* renamed from: b */
    private static AbstractC69581b m121558b(AbstractC69581b bVar, ACLCommonShare aCLCommonShare) {
        return new C69199c(bVar, aCLCommonShare);
    }

    /* renamed from: a */
    public static void m121557a(int i, Aweme aweme) {
        if (i == 0) {
            C68877a.C68878a.m121551a("ug_share_video_show", aweme, null);
        }
    }

    /* renamed from: a */
    public final void mo109451a(String str, C69584d dVar, C69684e.C69686b bVar) {
        AbstractC69581b a = C69583c.m122807a(str, dVar);
        if (a != null) {
            ACLCommonShare a2 = C69157h.C69158a.m122258a(this.f154080q, a.mo109548a());
            if (a2 == null || a2.getShowType() != 0) {
                bVar.mo109823a(m121558b(a, a2));
            }
        }
    }

    /* renamed from: b */
    public final void mo109453b(String str, C69584d dVar, C69684e.C69686b bVar) {
        AbstractC69581b a = C69583c.m122807a(str, dVar);
        if (a != null) {
            ACLCommonShare a2 = C69157h.C69158a.m122258a(this.f154080q, a.mo109548a());
            if (a2 == null || a2.getShowType() != 0) {
                bVar.mo109823a(m121555a(a, a2));
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0304  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109452a(java.lang.String r14, boolean r15, com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage r16, android.content.Context r17, com.p2082ss.android.ugc.aweme.feed.model.Aweme r18) {
        /*
        // Method dump skipped, instructions count: 836
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.business.C68881b.mo109452a(java.lang.String, boolean, com.ss.android.ugc.aweme.sharer.ui.SharePackage, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C68881b(Activity activity, Fragment fragment, Aweme aweme, boolean z, AbstractC49691s<C49672ag> sVar, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(bundle, "");
        this.f154078o = activity;
        this.f154079p = fragment;
        this.f154080q = aweme;
        this.f154081r = z;
        this.f154082s = sVar;
        this.f154083t = bundle;
        this.f154064a = bundle.getInt("page_type");
        this.f154065b = bundle.getString("event_type", "");
        this.f154066c = bundle.getString("enter_method", "");
        this.f154067d = bundle.getString("play_list_id", "");
        this.f154068e = bundle.getString("play_list_id_key", "");
        this.f154069f = bundle.getString("play_list_type", "");
        this.f154070g = bundle.getString("tab_name", "");
        this.f154071h = bundle.getString("from", "");
        this.f154072i = bundle.getString("creation_id", "");
        this.f154073j = bundle.getString("tag_id", "");
        this.f154074k = bundle.getString("extra_parent_tag_id", "");
        this.f154075l = bundle.getString("previousPage", "");
        this.f154076m = bundle.getString("previousPagePosition", "");
        this.f154077n = bundle.getString("category_name", "");
        AbstractC27540z of = AbstractC27540z.m55068of("instagram", "instagram_story", "snapchat", "zalo", "whatsapp", "kakaotalk");
        C89219l.m154716b(of, "");
        this.f154085v = of;
    }
}
