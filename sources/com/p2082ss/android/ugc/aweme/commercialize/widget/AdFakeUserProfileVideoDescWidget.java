package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37593d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38426i;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50530af;
import com.p2082ss.android.ugc.aweme.feed.widget.C50506a;
import com.p2082ss.android.ugc.aweme.feed.widget.C50516i;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59253r;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74147f;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget */
public final class AdFakeUserProfileVideoDescWidget extends AbsAdProfileWidget implements AbstractC33974au {

    /* renamed from: j */
    public static final C39000a f92125j = new C39000a((byte) 0);

    /* renamed from: k */
    private final AbstractC89244h f92126k = C89250i.m154773a((AbstractC89171a) new C39004d(this));

    static {
        Covode.recordClassIndex(46595);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget$a */
    public static final class C39000a {
        static {
            Covode.recordClassIndex(46596);
        }

        private C39000a() {
        }

        public /* synthetic */ C39000a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget$d */
    static final class C39004d extends AbstractC89220m implements AbstractC89171a<MentionTextView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoDescWidget f92131a;

        static {
            Covode.recordClassIndex(46600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39004d(AdFakeUserProfileVideoDescWidget adFakeUserProfileVideoDescWidget) {
            super(0);
            this.f92131a = adFakeUserProfileVideoDescWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MentionTextView invoke() {
            return this.f92131a.mo66948a(R.id.fca);
        }
    }

    /* renamed from: g */
    private static boolean m79162g() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo67696f() {
        boolean z;
        User author;
        Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
        if (aweme == null || (author = aweme.getAuthor()) == null || !author.isAdFake()) {
            z = false;
        } else {
            z = true;
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
        if ((aweme2 != null && aweme2.isAd()) || !z) {
            return false;
        }
        View view = this.f80271c;
        C89219l.m154716b(view, "");
        new C23144b(view).mo37640e(R.string.o6).mo37637b();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget$b */
    static final class C39001b implements MentionTextView.AbstractC81409f {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoDescWidget f92127a;

        /* renamed from: b */
        final /* synthetic */ String f92128b;

        static {
            Covode.recordClassIndex(46597);
        }

        C39001b(AdFakeUserProfileVideoDescWidget adFakeUserProfileVideoDescWidget, String str) {
            this.f92127a = adFakeUserProfileVideoDescWidget;
            this.f92128b = str;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81409f
        /* renamed from: a */
        public final void mo63408a(TextExtraStruct textExtraStruct) {
            C89219l.m154721d(textExtraStruct, "");
            if (textExtraStruct.isClickable()) {
                this.f92127a.mo67695a(textExtraStruct);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget$c */
    static final class View$OnClickListenerC39002c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoDescWidget f92129a;

        static {
            Covode.recordClassIndex(46598);
        }

        View$OnClickListenerC39002c(AdFakeUserProfileVideoDescWidget adFakeUserProfileVideoDescWidget) {
            this.f92129a = adFakeUserProfileVideoDescWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f92129a.mo67696f()) {
                C38767w.m78666a(this.f92129a.f80270b, ((AbsAdProfileWidget) this.f92129a).f90607a, 37, C390031.f92130a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66950a(C38426i iVar) {
        String desc;
        List<TextExtraStruct> textExtra;
        int a;
        C89219l.m154721d(iVar, "");
        super.mo66950a(iVar);
        Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
        if (!(aweme == null || (desc = aweme.getDesc()) == null)) {
            MentionTextView mentionTextView = (MentionTextView) this.f92126k.getValue();
            if (mentionTextView != null) {
                mentionTextView.setText(desc);
                Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme2 != null && (textExtra = aweme2.getTextExtra()) != null) {
                    for (T t : textExtra) {
                        if (t != null) {
                            if (t.getStart() < 0) {
                                t.setStart(0);
                            }
                            if (t.getEnd() > desc.length()) {
                                t.setEnd(desc.length());
                            }
                        }
                    }
                    if (this.f80270b != null) {
                        Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
                        if (aweme3 == null || !aweme3.isAd()) {
                            a = C50530af.m94718a();
                        } else {
                            a = 200;
                        }
                        mentionTextView.setMaxSize(a);
                        mentionTextView.setSpanSize((float) C34728n.m70949c(15.0d));
                        mentionTextView.setSpanColor(mentionTextView.getCurrentTextColor());
                        mentionTextView.setSpanStyle(1);
                        mentionTextView.setOnSpanClickListener(new C39001b(this, desc));
                        mentionTextView.mo124999a(textExtra, new C74147f(), (MentionTextView.AbstractC81407d) null);
                        if (desc.length() > 0) {
                            Iterator<TextExtraStruct> it = textExtra.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    TextExtraStruct next = it.next();
                                    C89219l.m154716b(next, "");
                                    if (m79161a(next, desc) && next.getType() == 0) {
                                        if (!TextUtils.isEmpty(next.getAwemeId()) || 2 == next.getSubtype()) {
                                            Aweme aweme4 = ((AbsAdProfileWidget) this).f90607a;
                                            if (aweme4 == null) {
                                                C89219l.m154715b();
                                            }
                                            if (aweme4.getDesc().charAt(next.getStart()) == '@') {
                                                Context context = this.f80270b;
                                                C89219l.m154716b(context, "");
                                                float a2 = (float) C13628n.m24504a(this.f80270b);
                                                float b = C13628n.m24520b(this.f80270b, 100.0f);
                                                Context context2 = this.f80270b;
                                                C89219l.m154716b(context2, "");
                                                C37593d dVar = new C37593d(context, a2 - (b + context2.getResources().getDimension(R.dimen.a0z)), C0643b.m2378c(this.f80270b, R.color.a7), -1, next);
                                                dVar.f88862b = C13628n.m24520b(this.f80270b, 12.0f);
                                                dVar.f88863c = C13628n.m24520b(this.f80270b, 2.0f);
                                                dVar.f88861a = C13628n.m24520b(this.f80270b, 13.0f);
                                                mentionTextView.mo124996a(next.getStart(), next.getEnd(), dVar);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            if (C80471gb.m139483a(this.f80270b)) {
                                mentionTextView.setMovementMethod(C50516i.m94696a());
                            } else {
                                mentionTextView.setMovementMethod(C50506a.m94687a());
                            }
                        } catch (IndexOutOfBoundsException e) {
                            C51423a.m95788a("", e);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            View view = this.f80272d;
            if (view != null) {
                view.setOnClickListener(new View$OnClickListenerC39002c(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo67695a(TextExtraStruct textExtraStruct) {
        String str;
        String str2;
        String str3;
        String str4;
        User author;
        String str5;
        String str6;
        Aweme aweme;
        String desc;
        String str7;
        String str8;
        String str9;
        VideoReplyStruct videoReplyStruct;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        AwemeRawAd awemeRawAd;
        String str15;
        String str16;
        User author2;
        if (textExtraStruct != null) {
            String str17 = null;
            if (textExtraStruct.getType() == 1) {
                CommerceChallengeServiceImpl.m75741e().mo65384a(textExtraStruct);
                String uuid = UUID.randomUUID().toString();
                C89219l.m154716b(uuid, "");
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f80270b, "//challenge/detail");
                Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme2 != null) {
                    str13 = aweme2.getAid();
                } else {
                    str13 = null;
                }
                buildRoute.withParam("aweme_id", str13).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", this.f90609i).open(10086);
                MobClick labelName = MobClick.obtain().setEventName("challenge_click").setLabelName(this.f90609i);
                Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme3 != null) {
                    str14 = aweme3.getAid();
                } else {
                    str14 = null;
                }
                C39162r.onEvent(labelName.setValue(str14).setExtValueString(textExtraStruct.getCid()));
                C38189j.m77540o(this.f80270b, ((AbsAdProfileWidget) this).f90607a);
                Aweme aweme4 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme4 != null) {
                    awemeRawAd = aweme4.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("draw_ad", "challenge_click", awemeRawAd).mo28902c();
                C59253r rVar = new C59253r();
                String str18 = this.f90609i;
                if (str18 == null) {
                    str18 = "";
                }
                C59253r rVar2 = (C59253r) rVar.mo96827o(str18).mo96740a(this.f80270b);
                Aweme aweme5 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme5 == null || (author2 = aweme5.getAuthor()) == null || (str15 = author2.getUid()) == null) {
                    str15 = "";
                }
                rVar2.f135339p = str15;
                Aweme aweme6 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme6 != null) {
                    str16 = aweme6.getAid();
                } else {
                    str16 = null;
                }
                rVar2.f135338e = str16;
                C59253r f = rVar2.mo96749g(((AbsAdProfileWidget) this).f90607a);
                f.f135341r = uuid;
                f.f135343t = (String) this.f80273e.mo60195b("playlist_type", "");
                f.f135345v = (String) this.f80273e.mo60195b("playlist_id", "");
                f.f135344u = (String) this.f80273e.mo60195b("playlist_id_key", "");
                C59253r rVar3 = (C59253r) f.mo96801c((String) this.f80273e.mo60195b("tab_name", ""));
                rVar3.f135340q = textExtraStruct.getCid();
                C59253r rVar4 = (C59253r) rVar3.mo96741a("click_in_video_name");
                Aweme aweme7 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme7 != null) {
                    str17 = aweme7.getRequestId();
                }
                rVar4.mo96828p(str17).mo96792f();
                C49907s.m93686a(EnumC48310af.CHALLENGE);
                return;
            }
            if (textExtraStruct.getType() == 0 && (!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype())) {
                Aweme aweme8 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme8 != null) {
                    str6 = aweme8.getDesc();
                } else {
                    str6 = null;
                }
                if (m79161a(textExtraStruct, str6) && (aweme = ((AbsAdProfileWidget) this).f90607a) != null && (desc = aweme.getDesc()) != null && desc.charAt(textExtraStruct.getStart()) == '@') {
                    if (2 == textExtraStruct.getSubtype() || 3 == textExtraStruct.getSubtype()) {
                        Aweme aweme9 = ((AbsAdProfileWidget) this).f90607a;
                        if (aweme9 == null || (videoReplyStruct = aweme9.getVideoReplyStruct()) == null) {
                            str8 = "";
                            str7 = str8;
                            str9 = str7;
                        } else {
                            if (videoReplyStruct.getAwemeId() == 0) {
                                str7 = "";
                            } else {
                                str7 = String.valueOf(videoReplyStruct.getAwemeId());
                            }
                            if (videoReplyStruct.getCommentId() == 0) {
                                str9 = "";
                            } else {
                                str9 = String.valueOf(videoReplyStruct.getCommentId());
                            }
                            str8 = videoReplyStruct.getAliasCommentId() == 0 ? "" : String.valueOf(videoReplyStruct.getAliasCommentId());
                        }
                        if (2 == textExtraStruct.getSubtype()) {
                            C33744d a = new C33744d().mo59983a("enter_from", this.f90609i);
                            Aweme aweme10 = ((AbsAdProfileWidget) this).f90607a;
                            if (aweme10 == null) {
                                C89219l.m154715b();
                            }
                            C33744d a2 = a.mo59983a("group_id", aweme10.getAid());
                            Aweme aweme11 = ((AbsAdProfileWidget) this).f90607a;
                            if (aweme11 == null) {
                                C89219l.m154715b();
                            }
                            C39162r.m79460a("click_comment_chain", a2.mo59983a("author_id", aweme11.getAuthorUid()).mo59983a("to_group_id", str7).mo59983a("reply_comment_id", str9).mo59983a("reply_user_id", textExtraStruct.getUserId()).f79943a);
                        }
                    } else {
                        Aweme aweme12 = ((AbsAdProfileWidget) this).f90607a;
                        if (aweme12 == null || aweme12.getAwemeType() != 51) {
                            Aweme aweme13 = ((AbsAdProfileWidget) this).f90607a;
                            if (aweme13 == null || aweme13.getAwemeType() != 52) {
                                Aweme aweme14 = ((AbsAdProfileWidget) this).f90607a;
                                if (aweme14 != null && aweme14.getAwemeType() == 58) {
                                    C33744d a3 = new C33744d().mo59983a("chain_type", "stitch").mo59983a("enter_from", this.f90609i);
                                    Aweme aweme15 = ((AbsAdProfileWidget) this).f90607a;
                                    if (aweme15 != null) {
                                        str10 = aweme15.getAid();
                                    } else {
                                        str10 = null;
                                    }
                                    C33744d a4 = a3.mo59983a("group_id", str10);
                                    Aweme aweme16 = ((AbsAdProfileWidget) this).f90607a;
                                    if (aweme16 != null) {
                                        str17 = aweme16.getAuthorUid();
                                    }
                                    C39162r.m79460a("click_duet_icon", a4.mo59983a("author_id", str17).mo59983a("to_group_id", textExtraStruct.getAwemeId()).f79943a);
                                }
                            } else {
                                C33744d a5 = new C33744d().mo59983a("enter_from", this.f90609i);
                                Aweme aweme17 = ((AbsAdProfileWidget) this).f90607a;
                                if (aweme17 != null) {
                                    str11 = aweme17.getAid();
                                } else {
                                    str11 = null;
                                }
                                C33744d a6 = a5.mo59983a("group_id", str11);
                                Aweme aweme18 = ((AbsAdProfileWidget) this).f90607a;
                                if (aweme18 != null) {
                                    str17 = aweme18.getAuthorUid();
                                }
                                C39162r.m79460a("click_react_icon", a6.mo59983a("author_id", str17).mo59983a("to_group_id", textExtraStruct.getAwemeId()).f79943a);
                            }
                        } else {
                            C33744d a7 = new C33744d().mo59983a("enter_from", this.f90609i);
                            Aweme aweme19 = ((AbsAdProfileWidget) this).f90607a;
                            if (aweme19 != null) {
                                str12 = aweme19.getAid();
                            } else {
                                str12 = null;
                            }
                            C33744d a8 = a7.mo59983a("group_id", str12);
                            Aweme aweme20 = ((AbsAdProfileWidget) this).f90607a;
                            if (aweme20 != null) {
                                str17 = aweme20.getAuthorUid();
                            }
                            C39162r.m79460a("click_duet_icon", a8.mo59983a("author_id", str17).mo59983a("to_group_id", textExtraStruct.getAwemeId()).mo59983a("chain_type", "duet").f79943a);
                        }
                        str8 = "";
                        str7 = str8;
                        str9 = str7;
                    }
                    if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132256h = m79162g();
                    }
                    if (!C58029j.f132256h) {
                        View view = this.f80271c;
                        C89219l.m154716b(view, "");
                        new C23144b(view).mo37640e(R.string.dcq).mo37637b();
                        return;
                    } else if (2 == textExtraStruct.getSubtype()) {
                        SmartRouter.buildRoute(this.f80270b, "aweme://aweme/detail/").withParam("id", str7).withParam("refer", "click_comment_chain").withParam("cid", str9 + ',' + str8).withParam("video_from", this.f90609i).open();
                        return;
                    } else {
                        SmartRouter.buildRoute(this.f80270b, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.f90609i).withParam("isChain", true).open();
                        return;
                    }
                }
            }
            Aweme aweme21 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme21 != null) {
                str = aweme21.getAid();
            } else {
                str = null;
            }
            C39162r.m79457a(StringSet.name, "video_at", str, textExtraStruct.getUserId());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                Aweme aweme22 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme22 != null) {
                    str5 = aweme22.getRequestId();
                } else {
                    str5 = null;
                }
                jSONObject.put("request_id", str5);
                jSONObject.put("enter_from", this.f90609i);
                jSONObject.put("enter_method", "click_head");
            } catch (Exception e) {
                e.printStackTrace();
            }
            Aweme aweme23 = ((AbsAdProfileWidget) this).f90607a;
            if (!(aweme23 == null || aweme23.getAuthor() == null)) {
                MobClick labelName2 = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage");
                Aweme aweme24 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme24 == null || (author = aweme24.getAuthor()) == null) {
                    str2 = null;
                } else {
                    str2 = author.getUid();
                }
                C39162r.onEvent(labelName2.setValue(str2).setJsonObject(jSONObject));
                C33744d a9 = new C33744d().mo59983a("enter_from", this.f90609i).mo59983a("to_user_id", textExtraStruct.getUserId());
                Aweme aweme25 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme25 != null) {
                    str3 = aweme25.getAid();
                } else {
                    str3 = null;
                }
                C33744d a10 = a9.mo59983a("group_id", str3);
                Aweme aweme26 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme26 != null) {
                    str4 = aweme26.getAuthorUid();
                } else {
                    str4 = null;
                }
                C39162r.m79460a("enter_personal_detail", a10.mo59983a("author_id", str4).mo59983a("enter_method", "video_at").f79943a);
            }
            SmartRoute withParam = SmartRouter.buildRoute(this.f80270b, "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_user_id", textExtraStruct.getSecUid()).withParam("profile_from", "video_at").withParam("enter_from", this.f90609i);
            Aweme aweme27 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme27 != null) {
                str17 = aweme27.getAid();
            }
            withParam.withParam("video_id", str17).open();
        }
    }

    /* renamed from: a */
    private static boolean m79161a(TextExtraStruct textExtraStruct, String str) {
        if (str == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > str.length() || textExtraStruct.getStart() >= str.length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }
}
