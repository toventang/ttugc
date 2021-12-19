package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.google.gson.C27910f;
import com.google.gson.C28023p;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.autoplay.p2346b.C34105h;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41541n;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.c.a */
public final class C42813a {

    /* renamed from: a */
    public static final C42813a f99846a = new C42813a();

    /* renamed from: b */
    private static final C27910f f99847b = new C27910f();

    private C42813a() {
    }

    static {
        Covode.recordClassIndex(50917);
    }

    /* renamed from: a */
    private static Context m85508a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    private static String m85513b(List<? extends RoomInfo> list) {
        try {
            String b = f99847b.mo46674b(list);
            C89219l.m154716b(b, "");
            return b;
        } catch (C28023p unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m85509a(List<? extends Aweme> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (i > 0) {
                sb.append(",");
            }
            sb.append(t2.getAid());
            i = i2;
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: c */
    private static String m85514c(List<? extends RoomInfo> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (i > 0) {
                sb.append(",");
            }
            sb.append(t2.getRoomId());
            i = i2;
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.a$a */
    public static final class C42814a implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ Context f99848a;

        /* renamed from: b */
        final /* synthetic */ long f99849b;

        /* renamed from: c */
        final /* synthetic */ EnterRoomConfig f99850c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f99851d;

        /* renamed from: e */
        final /* synthetic */ List f99852e;

        static {
            Covode.recordClassIndex(50918);
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                Context applicationContext = this.f99848a.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                C42813a.m85510a(applicationContext, this.f99849b, this.f99850c, "from_search_live", this.f99851d, this.f99852e);
            }
        }

        C42814a(Context context, long j, EnterRoomConfig enterRoomConfig, ArrayList arrayList, List list) {
            this.f99848a = context;
            this.f99849b = j;
            this.f99850c = enterRoomConfig;
            this.f99851d = arrayList;
            this.f99852e = list;
        }
    }

    /* renamed from: a */
    public static void m85512a(Aweme aweme, C34105h hVar, EnterRoomConfig enterRoomConfig, C42815b.AbstractC42817b bVar) {
        C67568r rVar;
        EnterRoomConfig.RoomsData roomsData;
        String str;
        Long l;
        Aweme aweme2;
        if (hVar != null && (rVar = hVar.f80638b) != null) {
            String str2 = rVar.f151311f;
            if (str2.length() > 0) {
                Aweme aweme3 = null;
                if (1 != 0 && str2 != null && enterRoomConfig != null && (roomsData = enterRoomConfig.f28233c) != null && (str = roomsData.f28293J) != null && str.length() > 0 && (l = hVar.f80642f) != null) {
                    l.longValue();
                    Activity j = C17873f.m33102j();
                    List<Aweme> list = hVar.f80639c;
                    if (list != null) {
                        aweme2 = list.get(0);
                    } else {
                        aweme2 = null;
                    }
                    List<Aweme> list2 = hVar.f80639c;
                    if (list2 != null) {
                        aweme3 = list2.get(hVar.f80639c.size() - 1);
                    }
                    if (aweme != null) {
                        aweme.getAid();
                        User author = aweme.getAuthor();
                        if (author != null) {
                            author.getUniqueId();
                        }
                    }
                    if (aweme2 != null) {
                        aweme2.getAid();
                        User author2 = aweme2.getAuthor();
                        if (author2 != null) {
                            author2.getUniqueId();
                        }
                    }
                    if (aweme3 != null) {
                        aweme3.getAid();
                        User author3 = aweme3.getAuthor();
                        if (author3 != null) {
                            author3.getUniqueId();
                        }
                    }
                    C42815b bVar2 = new C42815b(rVar.f151311f, hVar.f80642f.longValue(), m85514c(hVar.f80641e), rVar.f151312g, rVar.f151314i, bVar);
                    ILiveOuterService s = LiveOuterService.m107269s();
                    C89219l.m154716b(s, "");
                    s.mo95835i().mo105588a(j, enterRoomConfig, aweme, hVar.f80639c, bVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m85510a(Context context, long j, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, List<? extends RoomInfo> list) {
        Context context2;
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        AbstractC66586a i = s.mo95835i();
        String str2 = null;
        if (context != null) {
            context2 = m85508a(context);
        } else {
            context2 = null;
        }
        if (list != null) {
            str2 = m85513b(list);
        }
        i.mo105586a(context2, j, enterRoomConfig, str, arrayList, str2);
    }

    /* renamed from: a */
    public static void m85511a(Context context, long j, ArrayList<Long> arrayList, List<? extends RoomInfo> list, EnterRoomConfig enterRoomConfig, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(str, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() && C17873f.m33102j() != null) {
            AbstractC34892bo b = C31575b.m65860b();
            IAccountService.C31274d dVar = new IAccountService.C31274d();
            Activity j2 = C17873f.m33102j();
            if (j2 == null) {
                C89219l.m154715b();
            }
            dVar.f74960a = j2;
            dVar.f74964e = new C42814a(context, j, enterRoomConfig, arrayList, list);
            b.showLoginAndRegisterView(dVar.mo57084a());
        }
        m85510a(context, j, enterRoomConfig, str, arrayList, list);
    }

    /* renamed from: a */
    public final void mo73069a(Aweme aweme, C34105h hVar, C42815b.AbstractC42817b bVar, EnterRoomConfig enterRoomConfig, String str, Context context) {
        long j;
        C67568r rVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList<Long> arrayList;
        AbstractC11643g a;
        String str9;
        String str10;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(context, "");
        User author = aweme.getAuthor();
        if (author != null) {
            j = author.roomId;
        } else {
            j = 0;
        }
        List<RoomInfo> list = null;
        if (hVar != null) {
            rVar = hVar.f80638b;
        } else {
            rVar = null;
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
        if (rVar != null) {
            str2 = rVar.f151314i;
        } else {
            str2 = null;
        }
        logData.f28280x = str2;
        EnterRoomConfig.LogData logData2 = enterRoomConfig.f28232b;
        if (rVar != null) {
            str3 = rVar.f151311f;
        } else {
            str3 = null;
        }
        logData2.f28281y = str3;
        EnterRoomConfig.LogData logData3 = enterRoomConfig.f28232b;
        if (rVar != null) {
            str4 = rVar.f151309d;
        } else {
            str4 = null;
        }
        logData3.f28244A = str4;
        EnterRoomConfig.LogData logData4 = enterRoomConfig.f28232b;
        if (rVar != null) {
            str5 = rVar.f151319n;
        } else {
            str5 = null;
        }
        logData4.f28282z = str5;
        EnterRoomConfig.LogData logData5 = enterRoomConfig.f28232b;
        if (rVar != null) {
            str6 = rVar.f151314i;
        } else {
            str6 = null;
        }
        logData5.f28257a = str6;
        EnterRoomConfig.LogData logData6 = enterRoomConfig.f28232b;
        if (author != null) {
            str7 = author.getUid();
        } else {
            str7 = null;
        }
        logData6.f28258b = str7;
        enterRoomConfig.f28232b.f28245B = String.valueOf(j);
        enterRoomConfig.f28233c.f28295L = "live_cell";
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
        if (rVar != null) {
            str8 = rVar.f151312g;
        } else {
            str8 = null;
        }
        roomsData.f28293J = str8;
        LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
        if (newLiveRoomData == null) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            C89219l.m154716b(roomFeedCellStruct, "");
            newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData();
        }
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        AbstractC58593c d = s.mo95830d();
        Object a2 = d.mo12981a("enable_search_live_card_reuse_player", (Object) false);
        C89219l.m154716b(a2, "");
        if (((Boolean) a2).booleanValue() && (a = d.mo12977a(str)) != null && !TextUtils.isEmpty(a.mo12930n())) {
            String n = a.mo12930n();
            if (newLiveRoomData != null) {
                str9 = newLiveRoomData.getMultiStreamData();
            } else {
                str9 = null;
            }
            if (C89219l.m154714a((Object) n, (Object) str9) && a.mo12928l()) {
                enterRoomConfig.f28233c.f28337ar = a.mo12928l();
                a.mo12925h(false);
                EnterRoomConfig.StreamData streamData = enterRoomConfig.f28231a;
                if (newLiveRoomData != null) {
                    str10 = newLiveRoomData.getMultiStreamData();
                } else {
                    str10 = null;
                }
                streamData.f28378e = str10;
                enterRoomConfig.f28233c.f28288E = str;
            }
        }
        if (C41541n.m83478a()) {
            m85512a(aweme, hVar, enterRoomConfig, bVar);
            return;
        }
        if (hVar != null) {
            arrayList = hVar.f80640d;
            list = hVar.f80641e;
        } else {
            arrayList = null;
        }
        m85511a(context, j, arrayList, list, enterRoomConfig, "general_search");
    }
}
