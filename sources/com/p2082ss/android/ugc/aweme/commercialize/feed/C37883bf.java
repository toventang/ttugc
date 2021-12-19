package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.EnumC37642b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48021a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import java.util.HashMap;
import java.util.Map;
import p077b.C1731i;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.bf */
public final class C37883bf implements AbstractC17898b {

    /* renamed from: a */
    public static boolean f89382a;

    /* renamed from: b */
    public static final C37884a f89383b = new C37884a((byte) 0);

    /* renamed from: c */
    private Aweme f89384c;

    static {
        Covode.recordClassIndex(45335);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: f */
    public final void mo28532f(Aweme aweme, Context context) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: g */
    public final void mo28533g(Aweme aweme, Context context) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.bf$a */
    public static final class C37884a {
        static {
            Covode.recordClassIndex(45336);
        }

        private C37884a() {
        }

        public /* synthetic */ C37884a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    public final void mo28523a(Aweme aweme, Context context, boolean z) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        if (z) {
            C38189j.m77534i(context, aweme);
            C18129a.m33746a("draw_ad", "like", aweme.getAwemeRawAd()).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
            return;
        }
        C38189j.m77535j(context, aweme);
        C18129a.m33746a("draw_ad", "like_cancel", aweme.getAwemeRawAd()).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0334, code lost:
        if (r11.equals("web") != false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0337, code lost:
        if (r24 != 2) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x033d, code lost:
        if (com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a.m77085a(r19) == false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x033f, code lost:
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77510b(r23, "click_message", r22, com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77468a(r23, r22, false, (java.util.Map<java.lang.String, java.lang.String>) null));
        com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.m33746a("draw_ad", "click_message", r22.getAwemeRawAd()).mo28897a("anchor_id", m76683b(r22)).mo28897a("room_id", m76680a(r22)).mo28902c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0367, code lost:
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77482a(r23, r22, "button");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x036c, code lost:
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77510b(r23, "click_button", r22, com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77468a(r23, r22, false, (java.util.Map<java.lang.String, java.lang.String>) null));
        com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.m33746a("draw_ad", "click_button", r22.getAwemeRawAd()).mo28897a("anchor_id", m76683b(r22)).mo28897a("room_id", m76680a(r22)).mo28902c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0396, code lost:
        if (r24 != 3) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x039c, code lost:
        if (com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a.m77085a(r19) == false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x039e, code lost:
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77492a(r23, "background_ad", "click_message", r22, com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77468a(r23, r22, false, (java.util.Map<java.lang.String, java.lang.String>) null));
        com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.m33746a("background_ad", "click_message", r22.getAwemeRawAd()).mo28897a("anchor_id", m76683b(r22)).mo28897a("room_id", m76680a(r22)).mo28902c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03c6, code lost:
        r15.put("refer", "button");
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77508b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03ce, code lost:
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77538m(r23, r22);
        com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.m33746a("background_ad", "click_button", r22.getAwemeRawAd()).mo28897a("anchor_id", m76683b(r22)).mo28897a("room_id", m76680a(r22)).mo28902c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03f1, code lost:
        if (r24 != 11) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03f3, code lost:
        r15.put("refer", com.bytedance.ugc.glue.monitor.UGCMonitor.TYPE_PHOTO);
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77508b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03fd, code lost:
        if (r24 != 19) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ff, code lost:
        r15.put("refer", "image");
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77508b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x040b, code lost:
        if (r24 != 14) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x040d, code lost:
        r15.put("refer", com.kakao.usermgmt.StringSet.name);
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77508b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0419, code lost:
        if (r24 == 12) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x041d, code lost:
        if (r24 != 20) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x041f, code lost:
        r15.put("refer", "title");
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77508b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0429, code lost:
        if (r24 == 13) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x042d, code lost:
        if (r24 != 21) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x042f, code lost:
        r15.put("refer", "hot_region");
        com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77508b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x043b, code lost:
        if (r24 != 53) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x043d, code lost:
        com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.m33746a("result_ad", "click", r22.getAwemeRawAd()).mo28897a("anchor_id", m76683b(r22)).mo28897a("room_id", m76680a(r22)).mo28900b("refer", "button").mo28901b();
        com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.m33746a("result_ad", "otherclick", r22.getAwemeRawAd()).mo28897a("anchor_id", m76683b(r22)).mo28897a("room_id", m76680a(r22)).mo28900b("refer", "button").mo28901b();
        r2 = r22.getAwemeRawAd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0483, code lost:
        if (r2 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0485, code lost:
        p4600h.p4611f.p4613b.C89219l.m154716b(r2, "");
        com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj.m77369a("click", r2.getClickTrackUrlList(), r2.getCreativeId(), r2.getLogExtra(), new com.p2082ss.android.ugc.aweme.commercialize.feed.C37883bf.C37885b(r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04a2, code lost:
        if (r24 != 54) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04a4, code lost:
        com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.m33746a("result_ad_bg", "click", r22.getAwemeRawAd()).mo28897a("anchor_id", m76683b(r22)).mo28897a("room_id", m76680a(r22)).mo28900b("refer", "bg_more_button").mo28901b();
        com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.m33746a("result_ad_bg", "otherclick", r22.getAwemeRawAd()).mo28897a("anchor_id", m76683b(r22)).mo28897a("room_id", m76680a(r22)).mo28900b("refer", "bg_more_button").mo28901b();
        r2 = r22.getAwemeRawAd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04ee, code lost:
        if (r2 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04f0, code lost:
        p4600h.p4611f.p4613b.C89219l.m154716b(r2, "");
        com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj.m77369a("click", r2.getClickTrackUrlList(), r2.getCreativeId(), r2.getLogExtra(), new com.p2082ss.android.ugc.aweme.commercialize.feed.C37883bf.C37886c(r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0262, code lost:
        if (r11.equals("counsel") != false) goto L_0x0336;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02c9  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28525a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r22, android.content.Context r23, int r24) {
        /*
        // Method dump skipped, instructions count: 1938
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.C37883bf.mo28525a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, int):boolean");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    public final void mo28524a(Aweme aweme, Context context, boolean z, boolean z2) {
        AwemeRawAd awemeRawAd;
        HashMap hashMap;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        if ((!AbstractC33200b.C33201a.m68064a(aweme) && !C37699a.m76251aW(aweme)) || !z) {
            this.f89384c = aweme;
            C37893d a = C37893d.m76713a();
            String aid = aweme.getAid();
            if (!a.f89402a.contains(aid)) {
                a.f89402a.add(aid);
            }
            C1731i.m5640b(new CallableC37897e(aid), C1731i.f5562a);
            if (C38189j.m77551z(context, aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && !C13627m.m24498a(awemeRawAd.getOpenUrl())) {
                Uri parse = Uri.parse(awemeRawAd.getOpenUrl());
                if ("webcast_room".equals(parse.getHost()) && "ad_link".equals(parse.getQueryParameter("enter_from_merge"))) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("enter_from_merge", "ad_link");
                    hashMap2.put("action_type", "click");
                    String queryParameter = parse.getQueryParameter("enter_method");
                    if (!C13627m.m24498a(queryParameter)) {
                        hashMap2.put("enter_method", queryParameter);
                    }
                    String queryParameter2 = parse.getQueryParameter("user_id");
                    if (!C13627m.m24498a(queryParameter2)) {
                        hashMap2.put("anchor_id", queryParameter2);
                    }
                    String queryParameter3 = parse.getQueryParameter("room_id");
                    if (!C13627m.m24498a(queryParameter3)) {
                        hashMap2.put("room_id", queryParameter3);
                    }
                    String queryParameter4 = parse.getQueryParameter("video_id");
                    if (!C13627m.m24498a(queryParameter4)) {
                        hashMap2.put("video_id", queryParameter4);
                    }
                    String queryParameter5 = parse.getQueryParameter("log_pb");
                    if (!C13627m.m24498a(queryParameter5)) {
                        hashMap2.put("log_pb", queryParameter5);
                    }
                    String queryParameter6 = parse.getQueryParameter("request_id");
                    if (!C13627m.m24498a(queryParameter6)) {
                        hashMap2.put("request_id", queryParameter6);
                    }
                    LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
                    if (newLiveRoomData == null) {
                        hashMap = new HashMap();
                    } else {
                        hashMap = new HashMap();
                        if (newLiveRoomData.roomLayout == 1) {
                            hashMap.put("live_type", "game");
                        } else if (newLiveRoomData.liveTypeAudio) {
                            hashMap.put("live_type", "voice_type");
                        } else if (newLiveRoomData.isThirdParty) {
                            hashMap.put("live_type", "thirdparty");
                        } else {
                            hashMap.put("live_type", "video_live");
                        }
                    }
                    hashMap2.putAll(hashMap);
                    LiveRoomStruct newLiveRoomData2 = aweme.getNewLiveRoomData();
                    HashMap hashMap3 = new HashMap();
                    if (newLiveRoomData2 != null && newLiveRoomData2.withLinkmic && (newLiveRoomData2.liveTypeAudio || newLiveRoomData2.linkMicLayout == 16)) {
                        hashMap3.put("interact_function", "chat_room");
                    }
                    hashMap2.putAll(hashMap3);
                    C39162r.m79460a("livesdk_live_show", hashMap2);
                }
            }
            boolean z3 = C48021a.f111245b;
            if (!aweme.isLive()) {
                if (C37699a.m76199B(aweme) && !C37699a.m76260af(aweme) && z3) {
                    C38189j.m77476a(context, aweme);
                }
                f89382a = true;
            }
            if (z3) {
                if (z2) {
                    C38189j.m77476a(context, aweme);
                }
                C18129a.m33746a("draw_ad", "show_100pct", aweme.getAwemeRawAd()).mo28901b();
                return;
            }
            C38189j.m77476a(context, aweme);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    public final void mo28521a(Aweme aweme, Context context, Aweme aweme2, String str, long j, int i, String str2) {
        C89219l.m154721d(context, "");
        if (str != null && aweme2 != null) {
            if (aweme == null || !TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                m76681a(context, aweme2, str, j, i, str2);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    public final void mo28522a(Aweme aweme, Context context, String str, long j, int i) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        m76681a(context, aweme, str, j, i, null);
    }

    /* renamed from: a */
    private static boolean m76682a(User user) {
        if (user == null || !user.isLive() || !C76657c.m134240a() || user.isBlock()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m76680a(Aweme aweme) {
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

    /* renamed from: b */
    private static String m76683b(Aweme aweme) {
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

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c2  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28517a(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.C37883bf.mo28517a(android.content.Context):void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: c */
    public final void mo28528c(Aweme aweme, Context context) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        C38189j.m77537l(context, aweme);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.bf$b */
    static final class C37885b extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ Aweme f89385a;

        static {
            Covode.recordClassIndex(45337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37885b(Aweme aweme) {
            super(2);
            this.f89385a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(this.f89385a);
            } else {
                a = bVar2.mo66488a(this.f89385a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.bf$c */
    static final class C37886c extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ Aweme f89386a;

        static {
            Covode.recordClassIndex(45338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37886c(Aweme aweme) {
            super(2);
            this.f89386a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(this.f89386a);
            } else {
                a = bVar2.mo66488a(this.f89386a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.bf$d */
    static final class C37887d extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ Aweme f89387a;

        static {
            Covode.recordClassIndex(45339);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37887d(Aweme aweme) {
            super(2);
            this.f89387a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(this.f89387a);
            } else {
                a = bVar2.mo66488a(this.f89387a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.bf$e */
    static final class C37888e extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ Aweme f89388a;

        static {
            Covode.recordClassIndex(45340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37888e(Aweme aweme) {
            super(2);
            this.f89388a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(this.f89388a);
            } else {
                a = bVar2.mo66488a(this.f89388a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: e */
    public final void mo28531e(Aweme aweme, Context context) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        C37866av.f89366a.removeMessages(1048577);
        C37866av.f89367b = null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: d */
    public final void mo28530d(Aweme aweme, Context context) {
        AwemeRawAd awemeRawAd;
        String str = "";
        C89219l.m154721d(aweme, str);
        C89219l.m154721d(context, str);
        if (!C37699a.m76202E(aweme)) {
            if (C37699a.m76221X(aweme)) {
                str = "video";
            }
            C38189j.m77518c(context, aweme, str);
            if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getProfileWithWebview() != 1) {
                C38189j.m77507b(context, aweme, "slide");
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28900b("refer", "slide").mo28902c();
                return;
            }
            C38189j.m77482a(context, aweme, "slide");
        } else if (C37699a.m76203F(aweme)) {
            if (!C37699a.m76296f(aweme.getAwemeRawAd())) {
                C38189j.m77507b(context, aweme, "slide");
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28900b("refer", "slide").mo28902c();
            } else if (C37699a.m76298g(aweme.getAwemeRawAd())) {
                C38189j.m77533h(context, aweme);
                C37866av.m76519a(context, aweme, "slide");
            } else {
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", "slide").mo28901b();
            }
        } else if (C37699a.m76241aM(aweme)) {
            if (C37699a.m76244aP(aweme)) {
                C38189j.m77533h(context, aweme);
                C38189j.m77482a(context, aweme, "slide");
                return;
            }
            C38189j.m77533h(context, aweme);
        } else if (C37699a.m76243aO(aweme)) {
            C38189j.m77533h(context, aweme);
            C37866av.m76519a(context, aweme, "slide");
        } else {
            C38189j.m77507b(context, aweme, "slide");
            C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", "slide").mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: b */
    public final void mo28526b(Aweme aweme, Context context) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        if (!C37699a.m76202E(aweme)) {
            C38189j.m77483a(context, aweme, StringSet.name, (Map<String, Object>) null);
            C18129a.m33746a("draw_ad", "click_source", aweme.getAwemeRawAd()).mo28900b("refer", StringSet.name).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
            if (C37699a.m76222Y(aweme)) {
                C38189j.m77482a(context, aweme, (String) null);
            }
            if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getProfileWithWebview() != 1) {
                C38189j.m77507b(context, aweme, StringSet.name);
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", StringSet.name).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
                return;
            }
            C38189j.m77482a(context, aweme, StringSet.name);
        } else if (C37699a.m76203F(aweme)) {
            if (!C37699a.m76296f(aweme.getAwemeRawAd())) {
                C38189j.m77507b(context, aweme, StringSet.name);
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", StringSet.name).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
            } else if (C37699a.m76298g(aweme.getAwemeRawAd())) {
                C18129a.m33746a("draw_ad", "click", aweme.getAwemeRawAd()).mo28900b("refer", StringSet.name).mo28901b();
            } else {
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", StringSet.name).mo28901b();
            }
        } else if (C37699a.m76243aO(aweme)) {
            C38189j.m77483a(context, aweme, StringSet.name, (Map<String, Object>) null);
            C18129a.m33746a("draw_ad", "click_source", aweme.getAwemeRawAd()).mo28900b("refer", StringSet.name).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
            C38189j.m77482a(context, aweme, StringSet.name);
        } else {
            C38189j.m77507b(context, aweme, StringSet.name);
            C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", StringSet.name).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    public final void mo28518a(Aweme aweme, Context context) {
        HashMap hashMap;
        AwemeRawAd awemeRawAd;
        Integer num;
        AwemeRawAd awemeRawAd2;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        Integer num2 = null;
        String str = TextUtils.isEmpty(null) ? UGCMonitor.TYPE_PHOTO : null;
        if (C38701br.m78512a(aweme, 3)) {
            C38703bs.m78519a(C38701br.m78510a(aweme, "icon"));
        }
        if (!C37699a.m76202E(aweme)) {
            if (C37699a.m76318w(aweme)) {
                C38189j.m77483a(context, aweme, str, (Map<String, Object>) null);
                C18129a.m33746a("draw_ad", "click_source", aweme.getAwemeRawAd()).mo28900b("refer", str).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
                return;
            }
            if (!C37699a.m76221X(aweme) || !m76682a(aweme.getAuthor())) {
                C38189j.m77483a(context, aweme, str, (Map<String, Object>) null);
                C18129a.m33746a("draw_ad", "click_source", aweme.getAwemeRawAd()).mo28900b("refer", str).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
            }
            if (C37699a.m76222Y(aweme) || ((aweme.isAd() && aweme.getAwemeRawAd().liveRoom == 1) || C37699a.m76233aE(aweme))) {
                C38189j.m77482a(context, aweme, str);
            } else if (!aweme.isAd() || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || awemeRawAd2.getProfileWithWebview() != 1) {
                C38189j.m77507b(context, aweme, str);
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", str).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
            } else {
                C38189j.m77482a(context, aweme, UGCMonitor.TYPE_PHOTO);
            }
        } else if (C37699a.m76203F(aweme)) {
            if (!C37699a.m76296f(aweme.getAwemeRawAd())) {
                C38189j.m77507b(context, aweme, str);
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", str).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
            } else if (C37699a.m76298g(aweme.getAwemeRawAd())) {
                C18129a.m33746a("draw_ad", "click", aweme.getAwemeRawAd()).mo28900b("refer", UGCMonitor.TYPE_PHOTO).mo28901b();
            } else {
                C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", UGCMonitor.TYPE_PHOTO).mo28901b();
            }
        } else if (C37699a.m76243aO(aweme)) {
            if (!C37699a.m76221X(aweme) || !m76682a(aweme.getAuthor())) {
                if (C37699a.m76219V(aweme)) {
                    hashMap = new HashMap();
                    AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                    if (awemeRawAd3 != null) {
                        num = Integer.valueOf(awemeRawAd3.getAdAvatarLinkTagStyle());
                    } else {
                        num = null;
                    }
                    hashMap.put("photo_link", num);
                } else {
                    hashMap = null;
                }
                C38189j.m77483a(context, aweme, str, hashMap);
                C18129a.C18130a a = C18129a.m33746a("draw_ad", "click_source", aweme.getAwemeRawAd()).mo28900b("refer", str).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme));
                if (C37699a.m76219V(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    num2 = Integer.valueOf(awemeRawAd.getAdAvatarLinkTagStyle());
                }
                a.mo28897a("photo_link", num2).mo28902c();
            }
            C38189j.m77482a(context, aweme, str);
        } else {
            C38189j.m77507b(context, aweme, str);
            C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", str).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: c */
    public final void mo28529c(Aweme aweme, Context context, int i) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        C38189j.m77505b(context, aweme, i);
        C37438a.m75484d();
        C37438a.m75483c(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: b */
    public final void mo28527b(Aweme aweme, Context context, int i) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        C38189j.m77505b(context, aweme, i);
        C37438a.m75484d();
        C37438a.m75483c(aweme);
        if (f89382a) {
            C18129a.m33746a("draw_ad", "first_play", aweme.getAwemeRawAd()).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28901b();
            f89382a = false;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    public final void mo28520a(Aweme aweme, Context context, EnumC37642b bVar) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        ITalentAdRevenueShareService e = TalentAdRevenueShareServiceImpl.m77931e();
        if (e == null || bVar == null || !e.mo67033c() || aweme.getAwemeRawAd() == null) {
            C38189j.m77510b(context, "music_click", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
            C18129a.m33746a("draw_ad", "music_click", aweme.getAwemeRawAd()).mo28897a("anchor_id", m76683b(aweme)).mo28897a("room_id", m76680a(aweme)).mo28902c();
            return;
        }
        String area = bVar.getAREA();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(awemeRawAd, "");
        e.mo67026a(area, awemeRawAd);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28519a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r13, android.content.Context r14, long r15, int r17) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.C37883bf.mo28519a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, long, int):void");
    }

    /* renamed from: a */
    private static void m76681a(Context context, Aweme aweme, String str, long j, int i, String str2) {
        if (TextUtils.equals(str, aweme.getAid()) && aweme.isAd()) {
            C38189j.m77479a(context, aweme, j, i);
            if (str2 != null && str2.length() != 0) {
                C39162r.m79460a("ad_duration_prediction", new C33744d().mo59981a("real_time", j).mo59983a("predict_time", str2).f79943a);
            }
        }
    }
}
