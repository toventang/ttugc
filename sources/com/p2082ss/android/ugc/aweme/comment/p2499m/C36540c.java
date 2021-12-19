package com.p2082ss.android.ugc.aweme.comment.p2499m;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59210ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.m.c */
public final class C36540c {

    /* renamed from: a */
    public static final C36540c f86503a = new C36540c();

    /* renamed from: a */
    public static final void m74380a(Aweme aweme, String str, String str2, String str3, String str4, Comment comment, String str5, String str6, int i, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, boolean z3, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29) {
        m74379a(aweme, str, str2, str3, str4, comment, str5, str6, i, str7, str8, str9, str10, z, z2, str11, str12, str13, str14, str15, str16, z3, str17, str18, str19, 1, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, null, 0, 32);
    }

    private C36540c() {
    }

    /* renamed from: a */
    public static final void m74389a(String str, String str2, String str3, String str4, String str5, long j) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C33744d a = m74377a(str, str2);
        a.mo59983a("enter_from", str);
        a.mo59983a("group_id", str2);
        a.mo59983a("author_id", str3);
        a.mo59983a("send_user_id", str4);
        a.mo59983a("comment_id", str5);
        a.mo59981a("gift_id", j);
        C39162r.m79460a("show_gift_comment", a.f79943a);
    }

    /* renamed from: a */
    public static final void m74384a(String str, String str2, int i, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C39162r.m79460a(i == 1 ? "favorite_comment" : "cancel_favorite_comment", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str2).mo59983a("comment_id", str3).mo59983a("to_user_id", str4).mo59983a("group_id", str5).f79943a);
    }

    /* renamed from: a */
    public static final void m74387a(String str, String str2, String str3, String str4, long j) {
        C89219l.m154721d(str4, "");
        C39162r.m79460a("comment_latency", new C33744d().mo59983a("enter_from", str3).mo59981a("duration", j).mo59983a("result", str4).mo59983a("author_id", str2).mo59983a("group_id", str).f79943a);
    }

    /* renamed from: a */
    public static final void m74386a(String str, String str2, String str3, String str4, int i) {
        C33744d dVar = new C33744d();
        dVar.mo59983a("enter_method", str).mo59983a("enter_from", str2).mo59983a("group_id", str3).mo59983a("author_id", str4).mo59980a("is_others_video", i);
        C39162r.m79460a("reply_via_video_show", dVar.f79943a);
    }

    /* renamed from: a */
    public static final void m74390a(boolean z, Comment comment, String str, String str2, String str3) {
        String str4;
        C89219l.m154721d(comment, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (z) {
            str4 = "pin_comment";
        } else {
            str4 = "unpin_comment";
        }
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("comment_id", comment.getCid()).mo59983a("author_id", str2);
        User user = comment.getUser();
        C89219l.m154716b(user, "");
        C39162r.m79460a(str4, a.mo59983a("to_user_id", user.getUid()).mo59983a("group_id", str3).f79943a);
    }

    /* renamed from: a */
    public static final void m74385a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C39162r.m79460a("click_pin_comment_popup", new C33744d().mo59983a("enter_from", str).mo59983a("target", str2).mo59983a("author_id", str3).mo59983a("group_id", str4).f79943a);
    }

    static {
        Covode.recordClassIndex(43843);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.m.c$a */
    static final class CallableC36541a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f86504a;

        /* renamed from: b */
        final /* synthetic */ String f86505b;

        /* renamed from: c */
        final /* synthetic */ String f86506c;

        /* renamed from: d */
        final /* synthetic */ long f86507d;

        /* renamed from: e */
        final /* synthetic */ int f86508e;

        /* renamed from: f */
        final /* synthetic */ String f86509f;

        /* renamed from: g */
        final /* synthetic */ String f86510g;

        /* renamed from: h */
        final /* synthetic */ String f86511h;

        /* renamed from: i */
        final /* synthetic */ String f86512i;

        /* renamed from: j */
        final /* synthetic */ String f86513j;

        /* renamed from: k */
        final /* synthetic */ String f86514k;

        /* renamed from: l */
        final /* synthetic */ String f86515l;

        /* renamed from: m */
        final /* synthetic */ User f86516m;

        /* renamed from: n */
        final /* synthetic */ String f86517n;

        /* renamed from: o */
        final /* synthetic */ int f86518o;

        /* renamed from: p */
        final /* synthetic */ int f86519p;

        /* renamed from: q */
        final /* synthetic */ String f86520q;

        /* renamed from: r */
        final /* synthetic */ String f86521r;

        static {
            Covode.recordClassIndex(43844);
        }

        CallableC36541a(String str, String str2, String str3, long j, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, User user, String str11, int i2, int i3, String str12, String str13) {
            this.f86504a = str;
            this.f86505b = str2;
            this.f86506c = str3;
            this.f86507d = j;
            this.f86508e = i;
            this.f86509f = str4;
            this.f86510g = str5;
            this.f86511h = str6;
            this.f86512i = str7;
            this.f86513j = str8;
            this.f86514k = str9;
            this.f86515l = str10;
            this.f86516m = user;
            this.f86517n = str11;
            this.f86518o = i2;
            this.f86519p = i3;
            this.f86520q = str12;
            this.f86521r = str13;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17867d.m33078a();
            C39162r.m79459a("comment_duration", this.f86504a, this.f86505b, this.f86506c, new C33743c().mo59975a("duration", Long.valueOf(this.f86507d)).mo59977a());
            C33744d a = C36540c.m74377a(this.f86504a, this.f86505b).mo59983a("parent_comment_id", this.f86506c).mo59980a("parent_position", this.f86508e).mo59983a("relation_label_type", this.f86509f).mo59983a("label_type", this.f86510g).mo59981a("duration", this.f86507d).mo59983a("relation", this.f86511h);
            String str = this.f86512i;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            C33744d a2 = a.mo59983a("comment_id", str).mo59983a("comment_level", this.f86513j).mo59983a("comment_author_level", this.f86514k).mo59983a("user_level", this.f86515l);
            C89219l.m154716b(a2, str2);
            C33744d a3 = C80409eu.m139390a(a2, this.f86516m);
            if (!TextUtils.isEmpty(this.f86517n)) {
                a3.mo59983a("secondary_comment_id", this.f86517n).mo59980a("secondary_position", this.f86518o);
            }
            int i = this.f86519p;
            if (i != 0) {
                a3.mo59980a("is_long_item", i);
            }
            if (C59208ac.m108762a(this.f86504a)) {
                a3.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(this.f86520q));
                if (!TextUtils.isEmpty(this.f86521r)) {
                    str2 = this.f86521r;
                }
                a3.mo59983a("comment_user_id", str2);
                C39162r.m79461a("comment_duration", C59208ac.m108761a(a3.f79943a));
            } else {
                C39162r.m79460a("comment_duration", a3.f79943a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m74382a(String str, int i) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("tap_video_reply_comment", new C33744d().mo59983a("enter_from", str).mo59980a("is_others_video", i).f79943a);
    }

    /* renamed from: a */
    public static C33744d m74377a(String str, String str2) {
        C33744d dVar = new C33744d();
        dVar.mo59983a("enter_from", str).mo59983a("group_id", str2);
        Aweme b = AwemeService.m70060b().mo60684b(str2);
        if (b != null) {
            dVar.mo59983a("author_id", b.getAuthorUid());
        }
        C89219l.m154716b(dVar, "");
        return dVar;
    }

    /* renamed from: b */
    public static final void m74391b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("delete_video_comment", new C33744d().mo59983a("enter_from", str).mo59983a("target", str2).mo59980a("comment_cnt", 1).f79943a);
    }

    /* renamed from: a */
    public static final void m74383a(String str, int i, Comment comment) {
        String str2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(comment, "");
        if (i == 1) {
            str2 = "favorite_comment";
        } else {
            str2 = "cancel_favorite_comment";
        }
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("comment_id", comment.getCid());
        User user = comment.getUser();
        C89219l.m154716b(user, "");
        C39162r.m79460a(str2, a.mo59983a("to_user_id", user.getUid()).mo59983a("group_id", comment.getAwemeId()).f79943a);
    }

    /* renamed from: a */
    public static final void m74388a(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C39162r.m79460a("click_comment_emoji", m74378a(str, str2, str3, str4, str5, Integer.valueOf(i), logPbBean).f79943a);
    }

    /* renamed from: b */
    public static final void m74392b(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C39162r.m79460a("show_comment_emoji", m74378a(str, str2, str3, str4, str5, Integer.valueOf(i), logPbBean).f79943a);
    }

    /* renamed from: a */
    private static C33744d m74378a(String str, String str2, String str3, String str4, String str5, Integer num, LogPbBean logPbBean) {
        C33744d a = new C33744d().mo59983a("emoji_type", str);
        if (TextUtils.equals(str, "recommend")) {
            a.mo59983a("group_id", str2).mo59983a("author_id", str3).mo59983a("emoji_uri", str5).mo59982a("position", num).mo59982a("log_pb", logPbBean);
        } else if (TextUtils.equals(str, "search")) {
            a.mo59983a("group_id", str2).mo59983a("author_id", str3).mo59983a("search_keyword", str4).mo59983a("emoji_uri", str5).mo59982a("position", num).mo59982a("log_pb", logPbBean);
        }
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final void m74381a(User user, String str, String str2, String str3, int i, String str4, int i2, long j, String str5, int i3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        C89219l.m154721d(str11, "");
        C89219l.m154721d(str12, "");
        C89219l.m154721d(str13, "");
        C1731i.m5640b(new CallableC36541a(str, str2, str3, j, i, str7, str6, str9, str10, str11, str13, str12, user, str4, i2, i3, str5, str8), C39162r.m79452a());
    }

    /* renamed from: a */
    public static /* synthetic */ void m74379a(Aweme aweme, String str, String str2, String str3, String str4, Comment comment, String str5, String str6, int i, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, boolean z3, String str17, String str18, String str19, int i2, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i3, int i4) {
        String str31;
        int i5;
        int i6;
        User user;
        String str32;
        int i7 = i;
        String str33 = str8;
        String str34 = str7;
        String str35 = str4;
        String str36 = str29;
        String str37 = str30;
        String str38 = str16;
        String str39 = str19;
        String str40 = str13;
        String str41 = str25;
        boolean z4 = z;
        String str42 = str21;
        String str43 = str10;
        String str44 = str9;
        boolean z5 = z2;
        String str45 = str17;
        String str46 = str26;
        String str47 = str28;
        int i8 = i2;
        String str48 = str14;
        String str49 = str18;
        String str50 = str27;
        String str51 = str15;
        String str52 = str20;
        String str53 = str11;
        String str54 = str23;
        String str55 = str12;
        String str56 = str24;
        if ((i3 & 256) != 0) {
            i7 = 0;
        }
        String str57 = "";
        if ((i3 & 512) != 0) {
            str34 = str57;
        }
        if ((i3 & 1024) != 0) {
            str33 = str57;
        }
        if ((i3 & 2048) != 0) {
            str44 = str57;
        }
        if ((i3 & 4096) != 0) {
            str43 = str57;
        }
        if ((i3 & 8192) != 0) {
            z4 = false;
        }
        if ((i3 & 16384) != 0) {
            z5 = false;
        }
        if ((32768 & i3) != 0) {
            str53 = str57;
        }
        if ((65536 & i3) != 0) {
            str55 = str57;
        }
        if ((131072 & i3) != 0) {
            str40 = str57;
        }
        if ((262144 & i3) != 0) {
            str48 = str57;
        }
        if ((524288 & i3) != 0) {
            str51 = str57;
        }
        if ((1048576 & i3) != 0) {
            str38 = str57;
        }
        if ((2097152 & i3) != 0) {
            z3 = false;
        }
        if ((4194304 & i3) != 0) {
            str45 = str57;
        }
        if ((16777216 & i3) != 0) {
            str49 = str57;
        }
        if ((33554432 & i3) != 0) {
            str39 = str57;
        }
        if ((67108864 & i3) != 0) {
            i8 = 1;
        }
        if ((134217728 & i3) != 0) {
            str52 = str57;
        }
        if ((268435456 & i3) != 0) {
            str42 = str57;
        }
        if ((536870912 & i3) != 0) {
            str22 = str57;
        }
        if ((1073741824 & i3) != 0) {
            str54 = str57;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            str56 = str57;
        }
        if ((i4 & 1) != 0) {
            str41 = str57;
        }
        if ((i4 & 2) != 0) {
            str46 = str57;
        }
        if ((i4 & 4) != 0) {
            str50 = str57;
        }
        if ((i4 & 8) != 0) {
            str47 = str57;
        }
        if ((i4 & 16) != 0) {
            str36 = str57;
        }
        if ((i4 & 32) != 0) {
            str37 = str57;
        }
        C89219l.m154721d(aweme, str57);
        C89219l.m154721d(str, str57);
        C89219l.m154721d(str2, str57);
        C89219l.m154721d(str3, str57);
        C89219l.m154721d(str6, str57);
        C89219l.m154721d(str45, str57);
        C89219l.m154721d(str49, str57);
        C89219l.m154721d(str39, str57);
        C89219l.m154721d(str52, str57);
        String str58 = "trending_page";
        if (!TextUtils.equals(str2, str58) || str40 == null) {
            str31 = str2;
        } else {
            str31 = str40;
        }
        if (TextUtils.equals(str2, "homepage_fresh_topic")) {
            str31 = "homepage_fresh_topic";
        }
        if (TextUtils.equals(str2, "homepage_fresh_topic") || !z3) {
            str58 = str2;
        }
        C59210ae a = new C59210ae().mo96747a(str58);
        a.f134807v = str31;
        a.f134799d = str34;
        C59210ae f = a.mo96749g(aweme);
        if (i8 == 3) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        f.f134771aa = i5;
        f.f134797b = str3;
        f.f134806u = str43;
        f.f134805t = str44;
        f.f134804s = str33;
        C59210ae aeVar = (C59210ae) f.mo96801c(str53).mo96802d(str55);
        if (str35 == null) {
            str35 = str57;
        }
        aeVar.f134753a = str35;
        if (comment != null) {
            aeVar.f134753a = comment.getCid();
            if (comment.getUser() != null) {
                aeVar.f134773ac = comment.getUser().getUid();
                aeVar.f134772ab = comment.getUser().getFollowStatus();
            }
        }
        aeVar.f134801p = str5;
        aeVar.f134803r = z4;
        aeVar.f134798c = str6;
        aeVar.f134802q = i7;
        int i9 = z5 ? 1 : 0;
        int i10 = z5 ? 1 : 0;
        int i11 = z5 ? 1 : 0;
        aeVar.f134752Z = i9;
        aeVar.f134774ad = str48;
        aeVar.f134775ae = str51;
        C59210ae aeVar2 = (C59210ae) aeVar.mo96750o(str38).mo96800b(Boolean.valueOf(z3));
        aeVar2.f134777ag = str45;
        aeVar2.f134778ah = 0;
        aeVar2.f134779ai = str49;
        aeVar2.f134780aj = str39;
        aeVar2.f134800e = str52;
        if (str42 == null) {
            str42 = str57;
        }
        AbstractC59242h l = aeVar2.mo96810l(str42);
        if (str22 != null) {
            str57 = str22;
        }
        C59210ae aeVar3 = (C59210ae) l.mo96804f(str57);
        C17867d.m33078a();
        if (C46579b.m89902c(str) == 1) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        aeVar3.f134778ah = i6;
        aeVar3.f134781ak = str54;
        aeVar3.f134782al = str56;
        aeVar3.f134776af = C76598h.m134176a(aweme.getAuthor());
        if (comment != null) {
            user = comment.getUser();
        } else {
            user = null;
        }
        aeVar3.f134784an = C76598h.m134176a(user);
        if (C76706a.m134278d(aweme)) {
            str32 = "story";
        } else {
            str32 = UGCMonitor.TYPE_POST;
        }
        aeVar3.f134785ao = str32;
        aeVar3.f134786ap = C76706a.m134276b(aweme);
        aeVar3.f134788ar = str41;
        aeVar3.f134789as = str46;
        aeVar3.f134791au = str47;
        aeVar3.f134792av = str36;
        aeVar3.f134793aw = str37;
        C59210ae aeVar4 = (C59210ae) C79900c.m138667a(aeVar3, aweme, str2);
        if (!(str50 == null || str50.length() == 0)) {
            aeVar4.f134790at = str50;
        }
        Activity j = C17873f.m33102j();
        if (j != null) {
            aeVar4.mo96771n(C50560y.m94791a(str40, FeedParamProvider.C49809a.m93270a(j).getFromGroupId()));
        }
        aeVar4.mo96788a(C80632w.m139800a(aweme, "post_comment", str58)).mo96792f();
    }
}
