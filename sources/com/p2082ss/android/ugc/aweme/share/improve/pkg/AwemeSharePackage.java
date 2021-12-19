package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractPermission;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.ShareExtService;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69119f;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69132a;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69136b;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69140c;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69144d;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69146e;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69149f;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69153g;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69163i;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69167j;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69172k;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69173l;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69176m;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69181n;
import com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69198b;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69315h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3783a.C69659a;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage */
public final class AwemeSharePackage extends KtfDefaultSharePackage {

    /* renamed from: b */
    public static final C69206a f154702b = new C69206a((byte) 0);

    /* renamed from: a */
    public Aweme f154703a;

    static {
        Covode.recordClassIndex(81520);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$a */
    public static final class C69206a {
        static {
            Covode.recordClassIndex(81521);
        }

        private C69206a() {
        }

        public /* synthetic */ C69206a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AwemeSharePackage m122312a(Aweme aweme, Context context, int i, String str, String str2) {
            String str3;
            boolean z;
            String str4;
            UrlModel cover;
            List<String> urlList;
            List<String> list;
            String str5;
            String str6;
            String str7;
            int i2;
            UrlModel urlModel;
            String str8;
            String str9;
            String str10;
            boolean z2;
            String str11;
            String socialInfo;
            AwemeStatus status;
            UrlModel downloadAddr;
            UrlModel originCover;
            List<String> urlList2;
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            aweme.setShareInfo(C69125c.m122231a(aweme.getShareInfo()));
            SharePackage.C69654a a = new SharePackage.C69654a().mo109803a("aweme");
            User author = aweme.getAuthor();
            UrlModel urlModel2 = null;
            if (author == null || (str3 = author.getUid()) == null) {
                str3 = "";
            }
            SharePackage.C69654a b = a.mo109806b(str3);
            String string = context.getString(R.string.u8);
            C89219l.m154716b(string, "");
            SharePackage.C69654a a2 = b.mo109804a("app_name", string);
            ShareInfo shareInfo = aweme.getShareInfo();
            C89219l.m154716b(shareInfo, "");
            String shareTitle = shareInfo.getShareTitle();
            if (shareTitle == null) {
                shareTitle = "";
            }
            SharePackage.C69654a c = a2.mo109807c(shareTitle);
            ShareInfo shareInfo2 = aweme.getShareInfo();
            C89219l.m154716b(shareInfo2, "");
            String shareDesc = shareInfo2.getShareDesc();
            if (shareDesc == null) {
                shareDesc = "";
            }
            SharePackage.C69654a d = c.mo109808d(shareDesc);
            ShareInfo shareInfo3 = aweme.getShareInfo();
            C89219l.m154716b(shareInfo3, "");
            String shareUrl = shareInfo3.getShareUrl();
            if (shareUrl == null) {
                shareUrl = aweme.getShareUrl();
            }
            String c2 = C69124b.m122228c(C69124b.m122226b(shareUrl));
            if (c2 == null) {
                c2 = "";
            }
            AwemeSharePackage awemeSharePackage = new AwemeSharePackage(d.mo109809e(c2));
            awemeSharePackage.mo109571a(aweme);
            Bundle bundle = awemeSharePackage.f155492i;
            bundle.putString("aid", aweme.getAid());
            bundle.putString("is_from_trending_card", aweme.isFromTrendingCard());
            bundle.putString("trending_event_name", aweme.getTrendingName());
            bundle.putString("trending_event_id", aweme.getTrendingId());
            ShareInfo shareInfo4 = aweme.getShareInfo();
            C89219l.m154716b(shareInfo4, "");
            if (shareInfo4.getBoolPersist() == 1) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("bool_persist", z);
            bundle.putInt("page_type", i);
            bundle.putString("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108759a(aweme, i)));
            bundle.putString("enter_from", str);
            bundle.putString("enter_method", "icon");
            Video video = aweme.getVideo();
            if (video == null || (originCover = video.getOriginCover()) == null || (urlList2 = originCover.getUrlList()) == null) {
                str4 = null;
            } else {
                str4 = (String) C89070n.m154583g((List) urlList2);
            }
            if (!C80538hl.m139614a(str4)) {
                Video video2 = aweme.getVideo();
                if (video2 == null || (cover = video2.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                    str4 = null;
                } else {
                    str4 = (String) C89070n.m154583g((List) urlList);
                }
            }
            bundle.putString("thumb_url", str4);
            Video video3 = aweme.getVideo();
            if (video3 == null || (downloadAddr = video3.getDownloadAddr()) == null || (list = downloadAddr.getUrlList()) == null) {
                list = C89086z.INSTANCE;
            }
            bundle.putStringArrayList("video_play_list", new ArrayList<>(list));
            User author2 = aweme.getAuthor();
            if (author2 == null || (str5 = author2.getUid()) == null) {
                str5 = "";
            }
            bundle.putString("uid_for_share", str5);
            User author3 = aweme.getAuthor();
            if (author3 == null || (str6 = author3.getSecUid()) == null) {
                str6 = "";
            }
            bundle.putString("sec_user_id", str6);
            User author4 = aweme.getAuthor();
            if (author4 == null || (str7 = author4.getUid()) == null) {
                str7 = "";
            }
            bundle.putString("author_id", str7);
            bundle.putString("city_info", "");
            bundle.putString("distance_info", "");
            bundle.putString("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(aweme)));
            AwemeStatus status2 = aweme.getStatus();
            if ((status2 == null || status2.getPrivateStatus() != 1) && ((status = aweme.getStatus()) == null || !status.isDelete())) {
                i2 = 0;
            } else {
                i2 = -1;
            }
            bundle.putInt("item_id", i2);
            AwemeStatus status3 = aweme.getStatus();
            if (status3 == null) {
                bundle.putString("item_id_string", aweme.getAid());
            } else if (status3.isDelete()) {
                bundle.putString("item_id_string", "delete");
            } else if (status3.getPrivateStatus() == 1) {
                bundle.putString("item_id_string", "private");
            } else {
                bundle.putString("item_id_string", aweme.getAid());
            }
            Video video4 = aweme.getVideo();
            if (video4 != null) {
                urlModel = video4.getCover();
            } else {
                urlModel = null;
            }
            bundle.putSerializable("video_cover", urlModel);
            User author5 = aweme.getAuthor();
            if (author5 == null || (str8 = author5.getNickname()) == null) {
                str8 = "";
            }
            bundle.putString("add_utm_params", str8);
            User author6 = aweme.getAuthor();
            if (author6 != null) {
                urlModel2 = author6.getAvatarThumb();
            }
            bundle.putSerializable("thumb_for_share", urlModel2);
            bundle.putInt("aweme_type", aweme.getAwemeType());
            bundle.putString("story_collection_id", C76706a.m134276b(aweme));
            bundle.putInt("follow_status", C76598h.m134176a(aweme.getAuthor()));
            User author7 = aweme.getAuthor();
            if (author7 == null || (str9 = author7.getNickname()) == null) {
                str9 = "";
            }
            bundle.putString("author_name", str9);
            User author8 = aweme.getAuthor();
            if (author8 == null || (str10 = author8.getUniqueId()) == null) {
                str10 = "";
            }
            bundle.putString("author_username", str10);
            User author9 = aweme.getAuthor();
            if (author9 != null) {
                z2 = author9.isAdFake();
            } else {
                z2 = false;
            }
            bundle.putBoolean("is_ad_fake", z2);
            if (aweme.isImage()) {
                List<ImageInfo> imageInfos = aweme.getImageInfos();
                if (imageInfos == null || imageInfos.isEmpty()) {
                    bundle.putInt("aweme_width", 124);
                    bundle.putInt("aweme_height", 165);
                } else {
                    ImageInfo imageInfo = (ImageInfo) C89070n.m154579f((List) imageInfos);
                    C89219l.m154716b(imageInfo, "");
                    bundle.putInt("aweme_width", imageInfo.getWidth());
                    bundle.putInt("aweme_height", imageInfo.getHeight());
                    bundle.putSerializable("video_cover", imageInfo.getLabelLarge());
                }
            } else {
                Video video5 = aweme.getVideo();
                if (video5 == null) {
                    bundle.putInt("aweme_width", 124);
                    bundle.putInt("aweme_height", 165);
                } else {
                    bundle.putInt("aweme_width", video5.getWidth());
                    bundle.putInt("aweme_height", video5.getHeight());
                    bundle.putSerializable("video_cover", video5.getOriginCover());
                }
            }
            bundle.putBoolean("is_fullscreen", C41223i.f96336a);
            bundle.putString("request_id", C59208ac.m108763b(awemeSharePackage.mo109569a()));
            Video video6 = aweme.getVideo();
            if (!(video6 == null || video6.getPlayAddr() == null)) {
                Video video7 = aweme.getVideo();
                C89219l.m154716b(video7, "");
                VideoUrlModel playAddr = video7.getPlayAddr();
                C89219l.m154716b(playAddr, "");
                String uri = playAddr.getUri();
                C89219l.m154716b(uri, "");
                List c3 = C89361p.m154921c(uri, new String[]{"_"});
                if (!c3.isEmpty()) {
                    bundle.putString("aweme_vid", (String) C89070n.m154579f(c3));
                }
            }
            if (aweme.getVideo() != null) {
                Video video8 = aweme.getVideo();
                C89219l.m154716b(video8, "");
                bundle.putInt("aweme_width", video8.getWidth());
                Video video9 = aweme.getVideo();
                C89219l.m154716b(video9, "");
                bundle.putInt("aweme_height", video9.getHeight());
                Video video10 = aweme.getVideo();
                C89219l.m154716b(video10, "");
                bundle.putInt("aweme_duration", video10.getDuration());
                Video video11 = aweme.getVideo();
                C89219l.m154716b(video11, "");
                bundle.putInt("aweme_length", video11.getVideoLength());
            }
            bundle.putString("desc", aweme.getDesc());
            User author10 = aweme.getAuthor();
            if (author10 == null || !author10.isStar()) {
                str11 = "0";
            } else {
                str11 = "1";
            }
            bundle.putString("is_star", str11);
            bundle.putInt("is_long_item", 0);
            bundle.putBoolean("is_highlighted", aweme.isHighlighted());
            bundle.putInt("rank_index", aweme.getOriginalPos());
            User author11 = aweme.getAuthor();
            if (!(author11 == null || (socialInfo = author11.getSocialInfo()) == null)) {
                bundle.putString("social_info", socialInfo);
            }
            if (C76706a.m134278d(aweme)) {
                Story story = aweme.getStory();
                if (story != null) {
                    bundle.putLong("expired_at", story.getExpiredAt());
                }
                bundle.putInt("source_type", 2);
            }
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null) {
                bundle.putInt("upvote_permission", interactPermission.getUpvote());
            }
            return awemeSharePackage;
        }

        /* renamed from: a */
        public static /* synthetic */ AwemeSharePackage m122313a(Aweme aweme, Context context, int i, String str, String str2, int i2) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                str = "";
            }
            if ((i2 & 16) != 0) {
                str2 = "";
            }
            return m122312a(aweme, context, i, str, str2);
        }
    }

    /* renamed from: a */
    public final Aweme mo109569a() {
        Aweme aweme = this.f154703a;
        if (aweme == null) {
            C89219l.m154710a("aweme");
        }
        return aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage
    /* renamed from: b */
    public final Aweme mo109575b() {
        Aweme aweme = this.f154703a;
        if (aweme == null) {
            C89219l.m154710a("aweme");
        }
        return aweme;
    }

    /* renamed from: a */
    public final void mo109571a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f154703a = aweme;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$c */
    static final class C69210c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f154710a;

        static {
            Covode.recordClassIndex(81525);
        }

        C69210c(AbstractC89172b bVar) {
            this.f154710a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89172b bVar = this.f154710a;
            C89219l.m154716b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AwemeSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$b */
    public static final class C69207b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC69581b f154704a;

        /* renamed from: b */
        final /* synthetic */ String f154705b;

        static {
            Covode.recordClassIndex(81522);
        }

        C69207b(AbstractC69581b bVar, String str) {
            this.f154704a = bVar;
            this.f154705b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            String a = this.f154704a.mo109548a();
            if (a.hashCode() == 96619420 && a.equals("email")) {
                return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                    /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C69207b.C692081 */

                    /* renamed from: a */
                    final /* synthetic */ C69207b f154706a;

                    static {
                        Covode.recordClassIndex(81523);
                    }

                    {
                        this.f154706a = r1;
                    }

                    @Override // p4560f.p4561a.AbstractC88976q
                    /* renamed from: a */
                    public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                        C89219l.m154721d(oVar, "");
                        String str = str;
                        C89219l.m154716b(str, "");
                        oVar.mo143049a(new C69650k(str, C17867d.m33078a().getString(R.string.f57), this.f154706a.f154705b));
                    }
                });
            }
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C69207b.C692092 */

                /* renamed from: a */
                final /* synthetic */ C69207b f154708a;

                static {
                    Covode.recordClassIndex(81524);
                }

                {
                    this.f154708a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                    C89219l.m154721d(oVar, "");
                    String str = str;
                    C89219l.m154716b(str, "");
                    oVar.mo143049a(new C69650k(str, this.f154708a.f154705b, null, 4));
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final void mo109572a(AbstractC69581b bVar, AbstractC89172b<? super AbstractC69645h, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        String a = C69315h.f154879a.mo109599a(bVar, this.f155487d, this.f155490g);
        if (C69659a.m123052a()) {
            C69125c.m122234b(this.f155491h, this.f155487d, bVar).mo143237a(new C69207b(bVar, a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69210c(bVar2));
            return;
        }
        String a2 = C69125c.m122232a(this.f155491h, this.f155487d, bVar);
        String a3 = bVar.mo109548a();
        if (a3.hashCode() == 96619420 && a3.equals("email")) {
            bVar2.invoke(new C69650k(a2, C17867d.m33078a().getString(R.string.f57), a));
        } else {
            bVar2.invoke(new C69650k(a2, a, null, 4));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109574a(AbstractC69693h hVar, Context context) {
        File file;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        if (C89219l.m154714a((Object) hVar.mo61919c(), (Object) "download")) {
            Context a = C17867d.m33078a();
            if (!TextUtils.isEmpty(null)) {
                file = a.getExternalFilesDir(null);
            } else {
                if (C58016d.f132223d == null || !C58016d.f132224e) {
                    C58016d.f132223d = a.getExternalFilesDir(null);
                }
                file = C58016d.f132223d;
            }
            if (file != null || C69124b.m122227b(context)) {
                return false;
            }
            C69125c.m122233a(context);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage, com.p2082ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage
    /* renamed from: a */
    public final void mo109570a(Context context, AbstractC69581b bVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(context, "");
        Aweme aweme = this.f154703a;
        if (aweme == null) {
            C89219l.m154710a("aweme");
        }
        AwemeStatus status = aweme.getStatus();
        C89219l.m154716b(status, "");
        if (status.isInReviewing()) {
            Aweme aweme2 = this.f154703a;
            if (aweme2 == null) {
                C89219l.m154710a("aweme");
            }
            AwemeStatus status2 = aweme2.getStatus();
            C89219l.m154716b(status2, "");
            if (status2.isSelfSee()) {
                new C79459a(context).mo123050a(R.string.gg2).mo123053a();
                return;
            }
        }
        super.mo109570a(context, bVar, aVar);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        AbstractC69184o lVar;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        ShareDependService.C68822a.m121324a().mo109340a(bVar);
        if (this.f154703a == null) {
            return false;
        }
        if (C89219l.m154714a((Object) bVar.mo109548a(), (Object) "chat_merge") || (bVar instanceof C69119f)) {
            ShareExtService shareExtService = C68863ah.f154028b;
            Aweme aweme = this.f154703a;
            if (aweme == null) {
                C89219l.m154710a("aweme");
            }
            if (!shareExtService.mo109363a(aweme, context)) {
                bVar2.invoke(true);
                return true;
            }
        }
        if (!(!C89219l.m154714a((Object) bVar.mo109548a(), (Object) "chat_merge")) || (bVar instanceof C69119f)) {
            if (bVar instanceof C69198b) {
                this.f155492i.putString("share_form", "url_form");
            }
            return false;
        }
        if (C69157h.C69158a.m122264a(bVar.mo109548a())) {
            Aweme aweme2 = this.f154703a;
            if (aweme2 == null) {
                C89219l.m154710a("aweme");
            }
            ACLCommonShare b = C69157h.C69158a.m122266b(aweme2, bVar.mo109548a());
            if (b != null) {
                C39162r.m79460a("share_video_acl", new C33744d().mo59980a("code", b.getCode()).mo59980a("show_type", b.getShowType()).mo59983a("toast_msg", b.getToastMsg()).mo59983a("extra", b.getExtra()).mo59980a("transcode", b.getTranscode()).mo59982a("mute", Boolean.valueOf(b.getMute())).mo59983a("popup_msg", b.getPopupMsg()).f79943a);
            }
        }
        C89219l.m154721d(bVar, "");
        String a = bVar.mo109548a();
        switch (a.hashCode()) {
            case -1837180097:
                if (a.equals("whatsapp_status")) {
                    lVar = new C69173l(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case -1436108013:
                if (a.equals("messenger")) {
                    lVar = new C69153g(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case -816556504:
                if (a.equals("instagram_story")) {
                    lVar = new C69146e(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 114009:
                if (a.equals("sms")) {
                    lVar = new C69163i(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 3731178:
                if (a.equals("zalo")) {
                    lVar = new C69181n(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 28903346:
                if (a.equals("instagram")) {
                    lVar = new C69144d(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 96619420:
                if (a.equals("email")) {
                    lVar = new C69132a(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 284397090:
                if (a.equals("snapchat")) {
                    lVar = new C69167j(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 486515695:
                if (a.equals("kakaotalk")) {
                    lVar = new C69149f(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 497130182:
                if (a.equals("facebook")) {
                    lVar = new C69140c(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 1620810375:
                if (a.equals("facebook_lite")) {
                    lVar = new C69136b(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            case 1934780818:
                if (a.equals("whatsapp")) {
                    lVar = new C69176m(bVar);
                    break;
                }
                lVar = new C69172k();
                break;
            default:
                lVar = new C69172k();
                break;
        }
        return lVar.mo109562a(context, this, bVar2);
    }
}
