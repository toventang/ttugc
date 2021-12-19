package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.AclType;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.C49926a;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.AbstractC69313f;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69305d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.share.base.C85162b;
import com.p2082ss.android.ugc.trill.share.base.C85173c;
import com.p2082ss.android.ugc.trill.share.base.C85177e;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.h */
public final class C69157h {

    /* renamed from: a */
    public static final C69158a f154623a = new C69158a((byte) 0);

    static {
        Covode.recordClassIndex(81471);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.h$a */
    public static final class C69158a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.h$a$a */
        public interface AbstractC69159a {
            static {
                Covode.recordClassIndex(81473);
            }

            /* renamed from: a */
            void mo109563a();

            /* renamed from: b */
            void mo109564b();
        }

        static {
            Covode.recordClassIndex(81472);
        }

        private C69158a() {
        }

        /* renamed from: a */
        public static boolean m122264a(String str) {
            C89219l.m154721d(str, "");
            switch (str.hashCode()) {
                case -1837180097:
                    return str.equals("whatsapp_status");
                case -816556504:
                    return str.equals("instagram_story");
                case 3731178:
                    return str.equals("zalo");
                case 28903346:
                    return str.equals("instagram");
                case 96619420:
                    return str.equals("email");
                case 284397090:
                    return str.equals("snapchat");
                case 486515695:
                    return str.equals("kakaotalk");
                case 497130182:
                    return str.equals("facebook");
                case 1934780818:
                    return str.equals("whatsapp");
                default:
                    return false;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.h$a$d */
        public static final class C69162d implements AbstractC49927b {

            /* renamed from: a */
            final /* synthetic */ AwemeSharePackage f154629a;

            /* renamed from: b */
            final /* synthetic */ String f154630b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89172b f154631c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89171a f154632d;

            static {
                Covode.recordClassIndex(81476);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
            /* renamed from: a */
            public final void mo84975a() {
                this.f154632d.invoke();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
            /* renamed from: a */
            public final void mo84976a(String str) {
                C89219l.m154721d(str, "");
                this.f154631c.invoke(str);
            }

            C69162d(AwemeSharePackage awemeSharePackage, String str, AbstractC89172b bVar, AbstractC89171a aVar) {
                this.f154629a = awemeSharePackage;
                this.f154630b = str;
                this.f154631c = bVar;
                this.f154632d = aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.h$a$c */
        public static final class C69161c implements AbstractC69313f {

            /* renamed from: a */
            final /* synthetic */ ACLCommonShare f154626a;

            /* renamed from: b */
            final /* synthetic */ C85162b f154627b;

            /* renamed from: c */
            final /* synthetic */ Aweme f154628c;

            static {
                Covode.recordClassIndex(81475);
            }

            @Override // com.p2082ss.android.ugc.aweme.share.p3767m.AbstractC69313f
            /* renamed from: b */
            public final void mo109541b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.share.p3767m.AbstractC69313f
            /* renamed from: a */
            public final void mo109540a() {
                if (this.f154626a.getCode() == 0) {
                    this.f154627b.mo130084a(this.f154628c, "share_download", false);
                }
            }

            C69161c(ACLCommonShare aCLCommonShare, C85162b bVar, Aweme aweme) {
                this.f154626a = aCLCommonShare;
                this.f154627b = bVar;
                this.f154628c = aweme;
            }
        }

        public /* synthetic */ C69158a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.h$a$b */
        public static final class C69160b extends C49926a {

            /* renamed from: a */
            final /* synthetic */ AbstractC49927b f154624a;

            /* renamed from: b */
            final /* synthetic */ Activity f154625b;

            static {
                Covode.recordClassIndex(81474);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.C49926a, com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
            /* renamed from: a */
            public final void mo84976a(String str) {
                if (str != null && str.length() != 0) {
                    this.f154624a.mo84976a(str);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69160b(AbstractC49927b bVar, Activity activity, Context context) {
                super(context);
                this.f154624a = bVar;
                this.f154625b = activity;
            }
        }

        /* renamed from: b */
        private static ACLCommonShare m122265b(Aweme aweme) {
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo != null) {
                return awemeACLShareInfo.getShareThirdPlatform();
            }
            return null;
        }

        /* renamed from: a */
        private static ACLCommonShare m122257a(Aweme aweme) {
            ACLCommonShare shareThirdPlatform;
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null || (shareThirdPlatform = awemeACLShareInfo.getShareThirdPlatform()) == null) {
                return null;
            }
            shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
            return shareThirdPlatform;
        }

        /* renamed from: a */
        public static ACLCommonShare m122258a(Aweme aweme, String str) {
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(str, "");
            if (m122264a(str)) {
                return m122266b(aweme, str);
            }
            return m122257a(aweme);
        }

        /* renamed from: b */
        public static ACLCommonShare m122266b(Aweme aweme, String str) {
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(str, "");
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null) {
                return null;
            }
            ACLCommonShare shareThirdPlatform = awemeACLShareInfo.getShareThirdPlatform();
            if (shareThirdPlatform != null) {
                shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
                return shareThirdPlatform;
            }
            List<ACLCommonShare> platformList = awemeACLShareInfo.getPlatformList();
            if (platformList != null) {
                for (ACLCommonShare aCLCommonShare : platformList) {
                    if (TextUtils.equals(str, aCLCommonShare.getPlatformId())) {
                        aCLCommonShare.setAwemeAclType(AclType.PLATFORM_LIST);
                        return aCLCommonShare;
                    }
                }
            }
            ACLCommonShare shareGeneral = awemeACLShareInfo.getShareGeneral();
            if (shareGeneral != null) {
                shareGeneral.setAwemeAclType(AclType.SHARE_GENERAL);
            }
            return awemeACLShareInfo.getShareGeneral();
        }

        /* renamed from: a */
        private static boolean m122261a(Context context, ACLCommonShare aCLCommonShare) {
            if (aCLCommonShare != null) {
                String toastMsg = aCLCommonShare.getToastMsg();
                if (toastMsg != null && toastMsg.length() > 0) {
                    new C79459a(context).mo123052a(toastMsg).mo123053a();
                }
                if (aCLCommonShare.getCode() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m122263a(Aweme aweme, Context context) {
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(context, "");
            ACLCommonShare a = m122257a(aweme);
            if (a != null && !m122261a(context, a)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static boolean m122262a(Context context, AwemeSharePackage awemeSharePackage, String str, AbstractC69159a aVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(awemeSharePackage, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar, "");
            if (m122265b(awemeSharePackage.mo109569a()) != null) {
                aVar.mo109563a();
                return true;
            }
            ACLCommonShare b = m122266b(awemeSharePackage.mo109569a(), str);
            if (b == null) {
                aVar.mo109564b();
                return false;
            } else if (b.getCode() == 0) {
                aVar.mo109563a();
                return true;
            } else {
                aVar.mo109564b();
                return false;
            }
        }

        /* renamed from: a */
        public static void m122260a(AwemeSharePackage awemeSharePackage, String str, Context context, AbstractC89172b<? super String, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
            String str2 = "";
            C89219l.m154721d(awemeSharePackage, str2);
            C89219l.m154721d(str, str2);
            C89219l.m154721d(context, str2);
            C89219l.m154721d(bVar, str2);
            C89219l.m154721d(aVar, str2);
            Activity a = C69124b.m122223a(context);
            if (a != null) {
                Aweme a2 = awemeSharePackage.mo109569a();
                boolean a3 = C89219l.m154714a((Object) str, (Object) "instagram");
                int i = awemeSharePackage.f155492i.getInt("page_type");
                C69162d dVar = new C69162d(awemeSharePackage, str, bVar, aVar);
                String string = awemeSharePackage.f155492i.getString("enter_from");
                if (string != null) {
                    str2 = string;
                }
                m122259a(a, a2, a3, i, str, dVar, str2);
            }
        }

        /* renamed from: a */
        public static void m122259a(Activity activity, Aweme aweme, boolean z, int i, String str, AbstractC49927b bVar, String str2) {
            ACLCommonShare b;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            if (!C85173c.m146457a(activity, aweme, str)) {
                C85162b bVar2 = new C85162b(activity, z, i, str);
                bVar2.mo130086a(str2);
                bVar2.mo130085a(new C69160b(bVar, activity, activity));
                if (C85177e.m146464a(activity, aweme) && (b = m122266b(aweme, str)) != null) {
                    String popupMsg = b.getPopupMsg();
                    if (popupMsg == null || popupMsg.length() == 0) {
                        String toastMsg = b.getToastMsg();
                        if (!(toastMsg == null || toastMsg.length() == 0)) {
                            new C79459a(activity).mo123052a(toastMsg).mo123053a();
                        }
                        if (b.getCode() == 0) {
                            bVar2.mo130084a(aweme, "share_download", false);
                            return;
                        }
                        return;
                    }
                    C69305d.m122505a(activity, popupMsg, Integer.valueOf(b.getCode()), new C69161c(b, bVar2, aweme));
                }
            }
        }
    }
}
