package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39242c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39243d;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39246g;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39247h;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39261t;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import java.util.LinkedHashSet;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.i */
public final class C39697i {

    /* renamed from: a */
    public static C68348f f93529a;

    /* renamed from: b */
    public static final C39697i f93530b = new C39697i();

    /* renamed from: c */
    private static boolean f93531c;

    /* renamed from: d */
    private static PrivacyUserSettingsResponse f93532d;

    private C39697i() {
    }

    static {
        Covode.recordClassIndex(47420);
    }

    /* renamed from: a */
    public static void m80562a() {
        PrivacyUserSettingsResponse privacyUserSettingsResponse;
        Map map;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        String str;
        C39243d dVar;
        C39243d dVar2;
        C39242c cVar;
        C39247h hVar;
        C39261t tVar;
        C39261t tVar2;
        C39261t tVar3;
        C39261t tVar4;
        C39261t tVar5;
        C39246g gVar;
        C39246g gVar2;
        C39246g gVar3;
        C39246g gVar4;
        C39243d dVar3;
        C39243d dVar4;
        C39242c cVar2;
        C39247h hVar2;
        C39261t tVar6;
        C39261t tVar7;
        C39261t tVar8;
        C39261t tVar9;
        C39261t tVar10;
        C39246g gVar5;
        C39246g gVar6;
        C39246g gVar7;
        C39246g gVar8;
        if (f93531c && (privacyUserSettingsResponse = f93532d) != null && f93529a != null) {
            C39258q privacyUserSettings = privacyUserSettingsResponse.getPrivacyUserSettings();
            C68348f fVar = f93529a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = fVar.f153000v;
            if (privacyUserSettings == null || (gVar8 = privacyUserSettings.f92742a) == null || i != gVar8.f92701a) {
                linkedHashSet.add("download");
            }
            int i2 = fVar.f152997s;
            if (privacyUserSettings == null || (gVar7 = privacyUserSettings.f92742a) == null || i2 != gVar7.f92702b) {
                linkedHashSet.add("duet");
            }
            int i3 = fVar.f152999u;
            if (privacyUserSettings == null || (gVar6 = privacyUserSettings.f92742a) == null || i3 != gVar6.f92703c) {
                linkedHashSet.add("stitch");
            }
            int i4 = fVar.f152996r;
            if (privacyUserSettings == null || (gVar5 = privacyUserSettings.f92742a) == null || i4 != gVar5.f92704d) {
                linkedHashSet.add(UGCMonitor.EVENT_COMMENT);
            }
            int i5 = fVar.f152972ah;
            if (privacyUserSettings == null || (tVar10 = privacyUserSettings.f92743b) == null || i5 != tVar10.f92752a) {
                linkedHashSet.add("sugToContacts");
            }
            int i6 = fVar.f152973ai;
            if (privacyUserSettings == null || (tVar9 = privacyUserSettings.f92743b) == null || i6 != tVar9.f92753b) {
                linkedHashSet.add("sugToFbFriends");
            }
            int i7 = fVar.f152974aj;
            if (privacyUserSettings == null || (tVar8 = privacyUserSettings.f92743b) == null || i7 != tVar8.f92754c) {
                linkedHashSet.add("sugToMutualConnections");
            }
            int i8 = fVar.f152975ak;
            if (privacyUserSettings == null || (tVar7 = privacyUserSettings.f92743b) == null || i8 != tVar7.f92755d) {
                linkedHashSet.add("sugToWhoShareLink");
            }
            int i9 = fVar.f152976al;
            if (privacyUserSettings == null || (tVar6 = privacyUserSettings.f92743b) == null || i9 != tVar6.f92756e) {
                linkedHashSet.add("sugToInterestedUsers");
            }
            int i10 = fVar.f152947J;
            if (privacyUserSettings == null || (hVar2 = privacyUserSettings.f92744c) == null || i10 != hVar2.f92705a) {
                linkedHashSet.add("favoriteList");
            }
            int i11 = fVar.f152977am;
            if (privacyUserSettings == null || (cVar2 = privacyUserSettings.f92745d) == null || i11 != cVar2.f92684a) {
                linkedHashSet.add("followingList");
            }
            int i12 = fVar.f152940C;
            if (privacyUserSettings == null || (dVar4 = privacyUserSettings.f92746e) == null || i12 != dVar4.f92685a) {
                linkedHashSet.add("directMessage");
            }
            int i13 = fVar.f152943F;
            if (privacyUserSettings == null || (dVar3 = privacyUserSettings.f92746e) == null || i13 != dVar3.f92686b) {
                linkedHashSet.add("groupChatInvite");
            }
            boolean isEmpty = linkedHashSet.isEmpty();
            C89378p[] pVarArr = new C89378p[3];
            pVarArr[0] = C89387v.m154943a("diffsKeys", linkedHashSet.toString());
            PrivacyUserSettingsResponse privacyUserSettingsResponse2 = f93532d;
            Map map2 = null;
            if (privacyUserSettingsResponse2 != null) {
                C89378p[] pVarArr2 = new C89378p[14];
                if (privacyUserSettings == null || (gVar4 = privacyUserSettings.f92742a) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(gVar4.f92701a);
                }
                pVarArr2[0] = C89387v.m154943a("download", num);
                if (privacyUserSettings == null || (gVar3 = privacyUserSettings.f92742a) == null) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(gVar3.f92702b);
                }
                pVarArr2[1] = C89387v.m154943a("duet", num2);
                if (privacyUserSettings == null || (gVar2 = privacyUserSettings.f92742a) == null) {
                    num3 = null;
                } else {
                    num3 = Integer.valueOf(gVar2.f92703c);
                }
                pVarArr2[2] = C89387v.m154943a("stitch", num3);
                if (privacyUserSettings == null || (gVar = privacyUserSettings.f92742a) == null) {
                    num4 = null;
                } else {
                    num4 = Integer.valueOf(gVar.f92704d);
                }
                pVarArr2[3] = C89387v.m154943a(UGCMonitor.EVENT_COMMENT, num4);
                if (privacyUserSettings == null || (tVar5 = privacyUserSettings.f92743b) == null) {
                    num5 = null;
                } else {
                    num5 = Integer.valueOf(tVar5.f92752a);
                }
                pVarArr2[4] = C89387v.m154943a("sugToContacts", num5);
                if (privacyUserSettings == null || (tVar4 = privacyUserSettings.f92743b) == null) {
                    num6 = null;
                } else {
                    num6 = Integer.valueOf(tVar4.f92753b);
                }
                pVarArr2[5] = C89387v.m154943a("sugToFbFriends", num6);
                if (privacyUserSettings == null || (tVar3 = privacyUserSettings.f92743b) == null) {
                    num7 = null;
                } else {
                    num7 = Integer.valueOf(tVar3.f92754c);
                }
                pVarArr2[6] = C89387v.m154943a("sugToMutualConnections", num7);
                if (privacyUserSettings == null || (tVar2 = privacyUserSettings.f92743b) == null) {
                    num8 = null;
                } else {
                    num8 = Integer.valueOf(tVar2.f92755d);
                }
                pVarArr2[7] = C89387v.m154943a("sugToWhoShareLink", num8);
                if (privacyUserSettings == null || (tVar = privacyUserSettings.f92743b) == null) {
                    num9 = null;
                } else {
                    num9 = Integer.valueOf(tVar.f92756e);
                }
                pVarArr2[8] = C89387v.m154943a("sugToInterestedUsers", num9);
                if (privacyUserSettings == null || (hVar = privacyUserSettings.f92744c) == null) {
                    num10 = null;
                } else {
                    num10 = Integer.valueOf(hVar.f92705a);
                }
                pVarArr2[9] = C89387v.m154943a("favoriteList", num10);
                if (privacyUserSettings == null || (cVar = privacyUserSettings.f92745d) == null) {
                    num11 = null;
                } else {
                    num11 = Integer.valueOf(cVar.f92684a);
                }
                pVarArr2[10] = C89387v.m154943a("followingList", num11);
                if (privacyUserSettings == null || (dVar2 = privacyUserSettings.f92746e) == null) {
                    num12 = null;
                } else {
                    num12 = Integer.valueOf(dVar2.f92685a);
                }
                pVarArr2[11] = C89387v.m154943a("directMessage", num12);
                if (privacyUserSettings == null || (dVar = privacyUserSettings.f92746e) == null) {
                    num13 = null;
                } else {
                    num13 = Integer.valueOf(dVar.f92686b);
                }
                pVarArr2[12] = C89387v.m154943a("groupChatInvite", num13);
                LogPbBean logPb = privacyUserSettingsResponse2.getLogPb();
                if (logPb != null) {
                    str = logPb.getImprId();
                } else {
                    str = null;
                }
                pVarArr2[13] = C89387v.m154943a("logid", str);
                map = C89041ag.m154421a(pVarArr2);
            } else {
                map = null;
            }
            pVarArr[1] = C89387v.m154943a("privacy", map);
            C68348f fVar2 = f93529a;
            if (fVar2 != null) {
                map2 = C89041ag.m154421a(C89387v.m154943a("downloadSetting", Integer.valueOf(fVar2.f153000v)), C89387v.m154943a("duet", Integer.valueOf(fVar2.f152997s)), C89387v.m154943a("stitch", Integer.valueOf(fVar2.f152999u)), C89387v.m154943a(UGCMonitor.EVENT_COMMENT, Integer.valueOf(fVar2.f152996r)), C89387v.m154943a("sugToContacts", Integer.valueOf(fVar2.f152972ah)), C89387v.m154943a("sugToFbFriends", Integer.valueOf(fVar2.f152973ai)), C89387v.m154943a("sugToMutualConnections", Integer.valueOf(fVar2.f152974aj)), C89387v.m154943a("sugToWhoShareLink", Integer.valueOf(fVar2.f152975ak)), C89387v.m154943a("sugToInterestedUsers", Integer.valueOf(fVar2.f152976al)), C89387v.m154943a("whoCanSeeMyLikeList", Integer.valueOf(fVar2.f152947J)), C89387v.m154943a("followingVisibility", Integer.valueOf(fVar2.f152977am)), C89387v.m154943a("chatSet", Integer.valueOf(fVar2.f152940C)), C89387v.m154943a("groupChatSet", Integer.valueOf(fVar2.f152943F)), C89387v.m154943a("logid", C40043a.m80993a((BaseResponse) fVar2)));
            }
            pVarArr[2] = C89387v.m154943a("user", map2);
            C39617a.m80458a("privacy_user_settings_resp_fail", isEmpty, C89041ag.m154421a(pVarArr));
            m80564a(false);
        }
    }

    /* renamed from: a */
    public static void m80564a(boolean z) {
        f93531c = z;
        f93532d = null;
        f93529a = null;
    }

    /* renamed from: a */
    public static void m80563a(PrivacyUserSettingsResponse privacyUserSettingsResponse) {
        C89219l.m154721d(privacyUserSettingsResponse, "");
        f93532d = privacyUserSettingsResponse;
        m80562a();
    }
}
