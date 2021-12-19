package com.p2082ss.android.ugc.aweme.feed.assem.digg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p036g.C0692e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.C48317al;
import com.p2082ss.android.ugc.aweme.feed.assem.C48707g;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49526q;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.p2082ss.android.ugc.aweme.feed.helper.C49619e;
import com.p2082ss.android.ugc.aweme.feed.helper.C49648o;
import com.p2082ss.android.ugc.aweme.feed.helper.C49653t;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49957aa;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49959ac;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50323k;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50524a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50535d;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50541i;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59263y;
import com.p2082ss.android.ugc.aweme.metrics.C59264z;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import org.json.JSONObject;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4619j.C89271h;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM */
public final class VideoDiggVM extends FeedBaseViewModel<C48701k> implements AbstractC49991w {

    /* renamed from: k */
    static final /* synthetic */ AbstractC89286i[] f112480k = {new C89225r(VideoDiggVM.class, "context", "getContext()Landroid/content/Context;", 0)};

    /* renamed from: w */
    public static final C48652b f112481w = new C48652b((byte) 0);

    /* renamed from: A */
    private final C12786i f112482A = new C12786i(true, new C48651a(this, null));

    /* renamed from: l */
    public long f112483l;

    /* renamed from: m */
    public boolean f112484m;

    /* renamed from: n */
    public final C49959ac f112485n;

    /* renamed from: v */
    final C50524a f112486v;

    /* renamed from: x */
    private long f112487x;

    /* renamed from: y */
    private int f112488y;

    /* renamed from: z */
    private final C48707g f112489z = new C48707g(C48653c.f112492a);

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$c */
    static final class C48653c extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        public static final C48653c f112492a = new C48653c();

        static {
            Covode.recordClassIndex(57433);
        }

        C48653c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(57430);
    }

    /* renamed from: l */
    private final C48700j m91992l() {
        return (C48700j) this.f112482A.getValue();
    }

    /* renamed from: a */
    public final void mo80637a(Context context) {
        this.f112489z.mo80661a(f112480k[0], context);
    }

    /* renamed from: i */
    public final Context mo80642i() {
        return (Context) this.f112489z.mo80660a(f112480k[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$b */
    public static final class C48652b {
        static {
            Covode.recordClassIndex(57432);
        }

        private C48652b() {
        }

        public /* synthetic */ C48652b(byte b) {
            this();
        }

        /* renamed from: b */
        public static String m92011b(Aweme aweme) {
            LiveRoomStruct newLiveRoomData;
            C89219l.m154721d(aweme, "");
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

        /* renamed from: a */
        public static String m92010a(Aweme aweme) {
            LiveRoomStruct newLiveRoomData;
            C89219l.m154721d(aweme, "");
            if (aweme.isLive()) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                if (roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) {
                    return null;
                }
                C89219l.m154716b(newLiveRoomData, "");
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
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80639a(String str) {
        Aweme aweme;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        String str8;
        String str9;
        String str10;
        String str11;
        Aweme aweme2;
        C49812b a;
        C49812b a2;
        VideoDiggWidget.AbstractC49543a aVar;
        String str12;
        String str13;
        String str14;
        String str15;
        long j2;
        String str16;
        String str17;
        String str18;
        C49812b a3;
        C49812b a4;
        VideoDiggWidget.AbstractC49543a aVar2;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null) {
            if (!TextUtils.equals("opus", this.f112231p)) {
                mo80642i();
                C39162r.m79456a("like", this.f112231p, aweme.getAid(), 0, mo23343h());
            } else if (this.f112233r) {
                mo80642i();
                C39162r.m79456a("like", "personal_homepage", aweme.getAid(), 0, mo23343h());
            } else {
                mo80642i();
                C39162r.m79456a("like", "others_homepage", aweme.getAid(), 0, mo23343h());
            }
            String a5 = C49619e.m93060a(((FeedBaseViewModel) this).f112230o, this.f112231p, true);
            boolean z = aweme.getBottomBarModel() != null;
            if (aweme.playlist_info != null) {
                str2 = aweme.playlist_info.getMixId();
            } else {
                str2 = "";
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                C59264z zVar = new C59264z();
                String str19 = this.f112231p;
                if (str19 == null) {
                    str19 = "";
                }
                C59264z a6 = zVar.mo96855a(str19);
                a6.f135474e = ((FeedBaseViewModel) this).f112230o;
                a6.f135470a = aweme.getAid();
                C59264z f = a6.mo96749g(aweme);
                f.f135471b = str;
                f.f135472c = !C48317al.m91758d() ? 1 : 0;
                f.f135473d = 0;
                f.mo96792f();
                Context i = mo80642i();
                if (i == null || (str12 = FeedParamProvider.C49809a.m93270a(i).getSearchResultId()) == null) {
                    str12 = "";
                }
                if (TextUtils.isEmpty(str12)) {
                    str12 = C59208ac.m108771e(aweme);
                    C89219l.m154716b(str12, "");
                }
                C59263y yVar = new C59263y();
                yVar.f135468u = 0;
                yVar.f135467t = str;
                C59263y a7 = yVar.mo96852a(a5);
                a7.f135462e = mo80644k().f112551a;
                DataCenter j3 = mo80643j();
                if (j3 != null) {
                    str13 = (String) j3.mo60195b("playlist_type", "");
                } else {
                    str13 = null;
                }
                a7.f135459b = str13;
                DataCenter j4 = mo80643j();
                if (j4 != null) {
                    str14 = (String) j4.mo60195b("playlist_id", "");
                } else {
                    str14 = null;
                }
                a7.f135461d = str14;
                DataCenter j5 = mo80643j();
                if (j5 != null) {
                    str15 = (String) j5.mo60195b("playlist_id_key", "");
                } else {
                    str15 = null;
                }
                a7.f135460c = str15;
                DataCenter j6 = mo80643j();
                AbstractC59242h c = a7.mo96801c(j6 != null ? (String) j6.mo60195b("tab_name", "") : null);
                VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
                C59263y yVar2 = (C59263y) ((C59263y) c.mo96802d(C59208ac.m108764b(videoItemParams2 != null ? videoItemParams2.mAweme : null, ((FeedBaseViewModel) this).f112230o))).mo96749g(aweme).mo96799a(Boolean.valueOf(C50545m.m94765b(aweme)));
                C48700j k = mo80644k();
                if (k == null || (aVar2 = k.f112557g) == null) {
                    j2 = 0;
                } else {
                    j2 = aVar2.mo80546a();
                }
                yVar2.f135469v = j2;
                C59263y o = yVar2.mo96854o(mo80644k().f112554d);
                o.f135465r = mo80644k().f112555e;
                o.f135466s = mo80644k().f112556f;
                Context i2 = mo80642i();
                if (i2 == null || (str16 = FeedParamProvider.C49809a.m93270a(i2).getSearchId()) == null) {
                    str16 = "";
                }
                C59263y yVar3 = (C59263y) o.mo96810l(str16).mo96804f(str12);
                yVar3.f135429X = str2;
                yVar3.f135434ab = a5;
                Context i3 = mo80642i();
                if (i3 == null || (a4 = FeedParamProvider.C49809a.m93270a(i3)) == null) {
                    str17 = null;
                } else {
                    str17 = a4.getLastGroupId();
                }
                yVar3.f135435ac = str17;
                C59263y yVar4 = (C59263y) yVar3.mo96771n(C50560y.m94791a(mo80644k().f112551a, mo80644k().f112552b));
                Context i4 = mo80642i();
                if (i4 == null || (a3 = FeedParamProvider.C49809a.m93270a(i4)) == null) {
                    str18 = null;
                } else {
                    str18 = a3.getNewsId();
                }
                yVar4.f135436ad = str18;
                VideoItemParams videoItemParams3 = (VideoItemParams) mo23342g();
                yVar4.mo96788a(C80632w.m139800a(videoItemParams3 != null ? videoItemParams3.mAweme : null, "like", this.f112231p)).mo96792f();
            } else {
                Context i5 = mo80642i();
                if (i5 == null || (str3 = FeedParamProvider.C49809a.m93270a(i5).getSearchResultId()) == null) {
                    str3 = "";
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = C59208ac.m108771e(aweme);
                    C89219l.m154716b(str3, "");
                }
                DataCenter j7 = mo80643j();
                if (j7 != null) {
                    j7.mo60191a("follow_button_interaction", C50323k.EnumC50325b.LIKE);
                }
                C59263y yVar5 = new C59263y();
                yVar5.f135468u = 1;
                yVar5.f135467t = str;
                C59263y a8 = yVar5.mo96852a(a5);
                Context i6 = mo80642i();
                if (i6 == null || (str4 = FeedParamProvider.C49809a.m93270a(i6).getSearchId()) == null) {
                    str4 = "";
                }
                C59263y yVar6 = (C59263y) a8.mo96810l(str4);
                yVar6.f135462e = mo80644k().f112551a;
                yVar6.f135463p = mo80644k().f112553c;
                yVar6.f135464q = z;
                DataCenter j8 = mo80643j();
                if (j8 != null) {
                    str5 = (String) j8.mo60195b("playlist_type", "");
                } else {
                    str5 = null;
                }
                yVar6.f135459b = str5;
                DataCenter j9 = mo80643j();
                if (j9 != null) {
                    str6 = (String) j9.mo60195b("playlist_id", "");
                } else {
                    str6 = null;
                }
                yVar6.f135461d = str6;
                DataCenter j10 = mo80643j();
                if (j10 != null) {
                    str7 = (String) j10.mo60195b("playlist_id_key", "");
                } else {
                    str7 = null;
                }
                yVar6.f135460c = str7;
                DataCenter j11 = mo80643j();
                AbstractC59242h c2 = yVar6.mo96801c(j11 != null ? (String) j11.mo60195b("tab_name", "") : null);
                VideoItemParams videoItemParams4 = (VideoItemParams) mo23342g();
                C59263y yVar7 = (C59263y) ((C59263y) c2.mo96802d(C59208ac.m108764b(videoItemParams4 != null ? videoItemParams4.mAweme : null, ((FeedBaseViewModel) this).f112230o))).mo96749g(aweme).mo96799a(Boolean.valueOf(C50545m.m94765b(aweme)));
                C48700j k2 = mo80644k();
                if (k2 == null || (aVar = k2.f112557g) == null) {
                    j = 0;
                } else {
                    j = aVar.mo80546a();
                }
                yVar7.f135469v = j;
                C59263y o2 = yVar7.mo96854o(mo80644k().f112554d);
                o2.f135465r = mo80644k().f112555e;
                o2.f135466s = mo80644k().f112556f;
                Context i7 = mo80642i();
                if (i7 == null || (str8 = FeedParamProvider.C49809a.m93270a(i7).getSearchId()) == null) {
                    str8 = "";
                }
                C59263y yVar8 = (C59263y) o2.mo96810l(str8).mo96804f(str3);
                yVar8.f135222V = C76598h.m134176a(aweme.getAuthor());
                if (C76706a.m134281g(aweme)) {
                    str9 = "story";
                } else {
                    str9 = UGCMonitor.TYPE_POST;
                }
                yVar8.f135223W = str9;
                C59263y yVar9 = (C59263y) yVar8.mo96752b_(C76706a.m134276b(aweme));
                yVar9.f135429X = str2;
                yVar9.f135434ab = a5;
                Context i8 = mo80642i();
                if (i8 == null || (a2 = FeedParamProvider.C49809a.m93270a(i8)) == null) {
                    str10 = null;
                } else {
                    str10 = a2.getLastGroupId();
                }
                yVar9.f135435ac = str10;
                Context i9 = mo80642i();
                if (i9 == null || (a = FeedParamProvider.C49809a.m93270a(i9)) == null) {
                    str11 = null;
                } else {
                    str11 = a.getNewsId();
                }
                yVar9.f135436ad = str11;
                AbstractC59242h n = yVar9.mo96771n(C50560y.m94791a(mo80644k().f112551a, mo80644k().f112552b));
                VideoItemParams videoItemParams5 = (VideoItemParams) mo23342g();
                if (videoItemParams5 != null) {
                    aweme2 = videoItemParams5.mAweme;
                } else {
                    aweme2 = null;
                }
                AbstractC59233c a9 = C76598h.m134178a((C59263y) C79900c.m138667a(n, aweme2, a5), aweme);
                VideoItemParams videoItemParams6 = (VideoItemParams) mo23342g();
                a9.mo96788a(C80632w.m139800a(videoItemParams6 != null ? videoItemParams6.mAweme : null, "like", this.f112231p)).mo96792f();
            }
            if (aweme.getAwemeType() != 34) {
                String aid = aweme.getAid();
                C89219l.m154716b(aid, "");
                mo80640a(aid, 1, aweme);
                return;
            }
            C38000g.m77050a().mo65894f(mo80642i(), aweme);
            C18129a.m33746a("draw_ad", "like", aweme.getAwemeRawAd()).mo28897a("anchor_id", C48652b.m92010a(aweme)).mo28897a("room_id", C48652b.m92011b(aweme)).mo28902c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80640a(String str, int i, Aweme aweme) {
        Aweme aweme2;
        Long creativeId;
        Long adId;
        if (!C48317al.m91758d()) {
            C48317al.m91757c();
        }
        if (!TextUtils.isEmpty(this.f112231p) && i == 1) {
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = this.f112231p;
            if (str2 == null) {
                str2 = "";
            }
            C49653t.m93096a(new C49648o(aid, 1, currentTimeMillis, str2));
        }
        if (C49526q.m92767a() != 0) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                if (i == 1) {
                    C48317al.m91755a(C48317al.m91756b() + 1);
                    aweme.setUserDigg(1);
                    AwemeStatistics statistics = aweme.getStatistics();
                    if (statistics != null) {
                        statistics.setDiggCount(this.f112483l);
                    }
                    AbstractC81915c.m141874a(new C49672ag(13, 0));
                    return;
                } else if (i == 0) {
                    C48317al.m91755a(C89271h.m154769b(C48317al.m91756b() - 1, 0));
                    m91991c(aweme);
                    aweme.setUserDigg(0);
                    AwemeStatistics statistics2 = aweme.getStatistics();
                    if (statistics2 != null) {
                        statistics2.setDiggCount(this.f112483l);
                    }
                    AbstractC81915c.m141874a(new C49672ag(13, 1));
                    return;
                } else {
                    return;
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aweme_id", str);
        hashMap.put(StringSet.type, String.valueOf(i));
        hashMap.put("channel_id", String.valueOf(C33721c.m69041a(this.f112231p)));
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        String str3 = null;
        if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null || !aweme2.isAd()) {
            C50535d.m94740a(this.f112231p, null, hashMap);
        } else {
            Context i2 = mo80642i();
            if (i2 != null) {
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                String logExtra = awemeRawAd != null ? awemeRawAd.getLogExtra() : null;
                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                String valueOf = (awemeRawAd2 == null || (adId = awemeRawAd2.getAdId()) == null) ? null : String.valueOf(adId.longValue());
                AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                if (!(awemeRawAd3 == null || (creativeId = awemeRawAd3.getCreativeId()) == null)) {
                    str3 = String.valueOf(creativeId.longValue());
                }
                C50535d.m94739a(i2, logExtra, valueOf, str3, hashMap);
            }
        }
        this.f112485n.mo57616a(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$j */
    public static final class C48662j implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ VideoDiggVM f112511a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f112512b;

        static {
            Covode.recordClassIndex(57442);
        }

        C48662j(VideoDiggVM videoDiggVM, AbstractC89183m mVar) {
            this.f112511a = videoDiggVM;
            this.f112512b = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f112511a.mo80638a(this.f112512b);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48701k(false, (C48702l) null, 7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final DataCenter mo80643j() {
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            return videoItemParams.dataCenter;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C48700j mo80644k() {
        C48700j l = m91992l();
        if (l == null) {
            return new C48700j();
        }
        return l;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$a */
    public static final class C48651a extends AbstractC89220m implements AbstractC89171a<C48700j> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f112490a;

        /* renamed from: b */
        final /* synthetic */ String f112491b;

        static {
            Covode.recordClassIndex(57431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48651a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f112490a = assemViewModel;
            this.f112491b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.assem.digg.j, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.feed.assem.digg.C48700j invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f112490a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.feed.assem.digg.j> r1 = com.p2082ss.android.ugc.aweme.feed.assem.digg.C48700j.class
                java.lang.String r0 = r3.f112491b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.C48651a.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final JSONObject mo23343h() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        int i = ((FeedBaseViewModel) this).f112230o;
        String str = this.f112234s;
        if (str == null) {
            str = "";
        }
        JSONObject a = C50541i.m94754a(aweme, i, str, this.f112231p);
        C89219l.m154716b(a, "");
        return a;
    }

    public VideoDiggVM() {
        C49959ac acVar = new C49959ac();
        this.f112485n = acVar;
        acVar.mo67838a(new C49957aa());
        acVar.mo67839a_(this);
        this.f112486v = new C50524a();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$i */
    static final class C48661i extends AbstractC89220m implements AbstractC89172b<C48701k, C48701k> {

        /* renamed from: a */
        public static final C48661i f112510a = new C48661i();

        static {
            Covode.recordClassIndex(57441);
        }

        C48661i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48701k invoke(C48701k kVar) {
            C48701k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            return C48701k.m92027a(kVar2, false, null, null, 3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$d */
    static final class C48654d extends AbstractC89220m implements AbstractC89172b<C48701k, C48701k> {

        /* renamed from: a */
        final /* synthetic */ VideoDiggVM f112493a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f112494b;

        /* renamed from: c */
        final /* synthetic */ Aweme f112495c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89234a f112496d;

        static {
            Covode.recordClassIndex(57434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48654d(VideoDiggVM videoDiggVM, C89233z.C89237d dVar, Aweme aweme, C89233z.C89234a aVar) {
            super(1);
            this.f112493a = videoDiggVM;
            this.f112494b = dVar;
            this.f112495c = aweme;
            this.f112496d = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48701k invoke(C48701k kVar) {
            C48701k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            return C48701k.m92027a(kVar2, false, this.f112493a.mo80635a(this.f112494b.element, this.f112495c, this.f112496d.element), null, 5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$g */
    static final class C48658g extends AbstractC89220m implements AbstractC89172b<AbstractC89516am, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoDiggVM f112505a;

        static {
            Covode.recordClassIndex(57438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48658g(VideoDiggVM videoDiggVM) {
            super(1);
            this.f112505a = videoDiggVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC89516am amVar) {
            C89219l.m154721d(amVar, "");
            new C79459a(this.f112505a.mo80642i()).mo123050a(R.string.o6).mo123053a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$h */
    static final class C48659h extends AbstractC89220m implements AbstractC89172b<C48701k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoDiggVM f112506a;

        /* renamed from: b */
        final /* synthetic */ long f112507b;

        /* renamed from: c */
        final /* synthetic */ Aweme f112508c;

        static {
            Covode.recordClassIndex(57439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48659h(VideoDiggVM videoDiggVM, long j, Aweme aweme) {
            super(1);
            this.f112506a = videoDiggVM;
            this.f112507b = j;
            this.f112508c = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48701k kVar) {
            C89219l.m154721d(kVar, "");
            this.f112506a.mo20662a(new AbstractC89172b<C48701k, C48701k>(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.C48659h.C486601 */

                /* renamed from: a */
                final /* synthetic */ C48659h f112509a;

                static {
                    Covode.recordClassIndex(57440);
                }

                {
                    this.f112509a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C48701k invoke(C48701k kVar) {
                    C48701k kVar2 = kVar;
                    C89219l.m154721d(kVar2, "");
                    return C48701k.m92027a(kVar2, false, this.f112509a.f112506a.mo80635a(this.f112509a.f112507b, this.f112509a.f112508c, true), new C12776a(Boolean.valueOf(kVar2.f112558a)), 1);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$l */
    static final class C48664l extends AbstractC89220m implements AbstractC89172b<C48701k, C48701k> {

        /* renamed from: a */
        final /* synthetic */ VideoDiggVM f112516a;

        /* renamed from: b */
        final /* synthetic */ Aweme f112517b;

        static {
            Covode.recordClassIndex(57444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48664l(VideoDiggVM videoDiggVM, Aweme aweme) {
            super(1);
            this.f112516a = videoDiggVM;
            this.f112517b = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48701k invoke(C48701k kVar) {
            C48701k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            return C48701k.m92027a(kVar2, false, this.f112516a.mo80636a(this.f112517b), null, 5);
        }
    }

    /* renamed from: b */
    public final void mo80641b(Aweme aweme) {
        mo20662a(new C48664l(this, aweme));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$f */
    static final class C48657f extends AbstractC89220m implements AbstractC89172b<C48701k, C48701k> {

        /* renamed from: a */
        final /* synthetic */ VideoDiggVM f112503a;

        /* renamed from: b */
        final /* synthetic */ long f112504b;

        static {
            Covode.recordClassIndex(57437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48657f(VideoDiggVM videoDiggVM, long j) {
            super(1);
            this.f112503a = videoDiggVM;
            this.f112504b = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48701k invoke(C48701k kVar) {
            Aweme aweme;
            Aweme aweme2;
            C48701k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            VideoDiggVM videoDiggVM = this.f112503a;
            long j = this.f112504b;
            VideoItemParams videoItemParams = (VideoItemParams) videoDiggVM.mo23342g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            VideoItemParams videoItemParams2 = (VideoItemParams) this.f112503a.mo23342g();
            boolean z = true;
            if (videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || aweme2.getUserDigg() != 1) {
                z = false;
            }
            return C48701k.m92027a(kVar2, false, videoDiggVM.mo80635a(j, aweme, z), null, 5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$k */
    static final class C48663k extends AbstractC89220m implements AbstractC89172b<C48701k, C48701k> {

        /* renamed from: a */
        final /* synthetic */ VideoDiggVM f112513a;

        /* renamed from: b */
        final /* synthetic */ long f112514b;

        /* renamed from: c */
        final /* synthetic */ Aweme f112515c;

        static {
            Covode.recordClassIndex(57443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48663k(VideoDiggVM videoDiggVM, long j, Aweme aweme) {
            super(1);
            this.f112513a = videoDiggVM;
            this.f112514b = j;
            this.f112515c = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48701k invoke(C48701k kVar) {
            C48701k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            VideoDiggVM videoDiggVM = this.f112513a;
            long j = this.f112514b;
            Aweme aweme = this.f112515c;
            boolean z = true;
            if (aweme.getUserDigg() != 1) {
                z = false;
            }
            return C48701k.m92027a(kVar2, false, videoDiggVM.mo80635a(j, aweme, z), null, 5);
        }
    }

    /* renamed from: c */
    private static void m91991c(Aweme aweme) {
        if (aweme != null) {
            C39162r.m79460a("unlogin_like_cancel", new C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("group_id", aweme.getAid()).mo59983a("author_id", C59208ac.m108758a(aweme)).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(aweme.getRequestId())).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$e */
    static final class C48655e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f112497a;

        /* renamed from: b */
        final /* synthetic */ VideoDiggVM f112498b;

        /* renamed from: c */
        final /* synthetic */ Aweme f112499c;

        static {
            Covode.recordClassIndex(57435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48655e(VideoDiggVM videoDiggVM, Aweme aweme, AbstractC89124d dVar) {
            super(2, dVar);
            this.f112498b = videoDiggVM;
            this.f112499c = aweme;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C48655e(this.f112498b, this.f112499c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C48655e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f112497a == 0) {
                C89382r.m154942a(obj);
                final boolean z = false;
                if (!this.f112498b.f112484m) {
                    this.f112498b.f112483l++;
                    z = true;
                } else if (this.f112498b.f112484m) {
                    VideoDiggVM videoDiggVM = this.f112498b;
                    videoDiggVM.f112483l--;
                }
                final long a = this.f112498b.mo80634a(z, this.f112499c);
                this.f112498b.mo20662a(new AbstractC89172b<C48701k, C48701k>(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.C48655e.C486561 */

                    /* renamed from: a */
                    final /* synthetic */ C48655e f112500a;

                    static {
                        Covode.recordClassIndex(57436);
                    }

                    {
                        this.f112500a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C48701k invoke(C48701k kVar) {
                        C48701k kVar2 = kVar;
                        C89219l.m154721d(kVar2, "");
                        return C48701k.m92027a(kVar2, false, this.f112500a.f112498b.mo80635a(a, this.f112500a.f112499c, z), null, 5);
                    }
                });
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final C48702l mo80636a(Aweme aweme) {
        long j;
        int i;
        String str;
        AwemeStatistics statistics;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            j = 0;
        } else {
            j = statistics.getDiggCount();
        }
        this.f112483l = j;
        this.f112487x = j;
        boolean z = false;
        if (aweme != null) {
            i = aweme.getUserDigg();
        } else {
            i = 0;
        }
        this.f112488y = i;
        if (aweme != null && aweme.getUserDigg() == 1) {
            z = true;
        }
        long a = mo80634a(z, aweme);
        StringBuilder sb = new StringBuilder("digg aweme ");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C51423a.m95791b(6, "VideoDiggVM", sb.append(str).toString());
        return mo80635a(a, aweme, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w
    /* renamed from: a */
    public final void mo72639a(C0692e<String, Integer> eVar) {
        Aweme aweme;
        C89219l.m154721d(eVar, "");
        DataCenter j = mo80643j();
        if (j != null) {
            j.mo60191a("digg_success", eVar);
        }
        C49672ag agVar = new C49672ag(13, eVar.f2750a);
        Bundle bundle = new Bundle();
        S s = eVar.f2751b;
        if (s == null) {
            s = -1;
        }
        bundle.putInt("user_digged", s.intValue());
        agVar.f114317c = bundle;
        AbstractC81915c.m141874a(agVar);
        C42066d dVar = C42066d.f98067b;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        dVar.mo71244a(aweme, 4);
        SpecActServiceImpl.m131497i().mo118029b("like");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if ((!r0.isLogin()) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010d, code lost:
        if (com.p2082ss.android.ugc.aweme.feed.C48317al.m91756b() >= r4) goto L_0x005e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80638a(p4600h.p4611f.p4612a.AbstractC89183m<? super java.lang.Boolean, ? super com.p2082ss.android.ugc.aweme.feed.model.Aweme, p4600h.C89391z> r9) {
        /*
        // Method dump skipped, instructions count: 547
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.mo80638a(h.f.a.m):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w
    /* renamed from: a */
    public final void mo72644a(Exception exc) {
        Aweme aweme;
        int i;
        C89219l.m154721d(exc, "");
        CaptchaHelperServiceImpl.m72448a();
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        if (!(mo80642i() == null || aweme == null)) {
            AbstractC89568bz unused = C89624i.m155555a(aP_(), null, null, new C48655e(this, aweme, null), 3);
        }
        Context i2 = mo80642i();
        if (this.f112485n.mo84999d() == 1) {
            i = R.string.b6t;
        } else {
            i = R.string.h11;
        }
        C33615a.m68848a(i2, (Throwable) exc, i);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(videoItemParams, "");
        return videoItemParams;
    }

    /* renamed from: a */
    static String m91990a(long j, Aweme aweme) {
        if (!C58956a.m108315a(aweme) && j > 0) {
            return C53437b.m98615a(j);
        }
        return "0";
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C48701k mo80488a(C48701k kVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(videoItemParams, "");
        return new C48701k(C33918a.m69450a(), mo80636a(videoItemParams.mAweme), 4);
    }

    /* renamed from: a */
    public final long mo80634a(boolean z, Aweme aweme) {
        if (aweme != null) {
            this.f112484m = z;
            if (z) {
                if (this.f112488y != 1) {
                    return this.f112487x + 1;
                }
                if (this.f112487x < 1 && !aweme.isDelete()) {
                    this.f112487x = 1;
                }
                return this.f112487x;
            } else if (this.f112488y != 1 || aweme.isDelete()) {
                return this.f112487x;
            } else {
                return this.f112487x - 1;
            }
        } else {
            C51423a.m95791b(6, "VideoDiggVM", "updateDiggView when aweme is null:" + Log.getStackTraceString(new Throwable()));
            return 0;
        }
    }

    /* renamed from: a */
    public final C48702l mo80635a(long j, Aweme aweme, boolean z) {
        boolean z2;
        DataCenter dataCenter;
        if (aweme != null) {
            VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
            if (!(videoItemParams == null || (dataCenter = videoItemParams.dataCenter) == null)) {
                dataCenter.mo60191a("update_diig_view", Boolean.valueOf(z));
            }
            if (j < 0) {
                j = 0;
            }
            if (aweme != null && aweme.isDelete() && j == 0) {
                z2 = false;
                return new C48702l(m91990a(j, aweme), z, z2);
            }
        } else {
            C51423a.m95791b(6, "VideoDiggVM", "updateDiggView when aweme is null:" + Log.getStackTraceString(new Throwable()));
            j = 0;
        }
        z2 = true;
        return new C48702l(m91990a(j, aweme), z, z2);
    }
}
