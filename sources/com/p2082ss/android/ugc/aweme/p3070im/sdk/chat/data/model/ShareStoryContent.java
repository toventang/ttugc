package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent */
public final class ShareStoryContent extends ShareAwemeContent {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "expired_at")
    private Long expireAt = 0L;
    @AbstractC27891c(mo46611a = "source_type")
    private Integer sourceType = 0;
    private String storyCollectionId = "";

    static {
        Covode.recordClassIndex(63474);
    }

    public static final ShareStoryContent fromAweme(Aweme aweme) {
        return Companion.fromAweme(aweme);
    }

    public static final ShareStoryContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final boolean isStory(BaseContent baseContent) {
        return Companion.isStory(baseContent);
    }

    public static final boolean isStoryExpired(ShareStoryContent shareStoryContent) {
        return Companion.isStoryExpired(shareStoryContent);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent
    public final boolean showQuoteHint() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63475);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final boolean isStory(BaseContent baseContent) {
            C89219l.m154721d(baseContent, "");
            return baseContent instanceof ShareStoryContent;
        }

        private final int getAweType(Integer num) {
            if (num != null && num.intValue() == 1) {
                return 0;
            }
            return 1;
        }

        public final boolean isStoryExpired(ShareStoryContent shareStoryContent) {
            C89219l.m154721d(shareStoryContent, "");
            Long expireAt = shareStoryContent.getExpireAt();
            if (expireAt == null || expireAt.longValue() >= System.currentTimeMillis()) {
                return false;
            }
            return true;
        }

        public final ShareStoryContent fromAweme(Aweme aweme) {
            UrlModel urlModel;
            UrlModel urlModel2;
            float f;
            long j;
            String nickname;
            String str = "";
            C89219l.m154721d(aweme, str);
            ShareStoryContent shareStoryContent = new ShareStoryContent();
            shareStoryContent.user = aweme.getAuthorUid();
            shareStoryContent.secUid = aweme.getSecAuthorUid();
            shareStoryContent.itemId = aweme.getAid();
            shareStoryContent.setStoryCollectionId(C76706a.m134276b(aweme));
            Video video = aweme.getVideo();
            if (video == null || (urlModel = video.getCover()) == null) {
                urlModel = new UrlModel();
            }
            shareStoryContent.coverUrl = urlModel;
            User author = aweme.getAuthor();
            if (author == null || (urlModel2 = author.getAvatarThumb()) == null) {
                urlModel2 = new UrlModel();
            }
            shareStoryContent.contentThumb = urlModel2;
            User author2 = aweme.getAuthor();
            if (!(author2 == null || (nickname = author2.getNickname()) == null)) {
                str = nickname;
            }
            shareStoryContent.contentName = str;
            Video video2 = aweme.getVideo();
            float f2 = 0.0f;
            if (video2 != null) {
                f = (float) video2.getWidth();
            } else {
                f = 0.0f;
            }
            shareStoryContent.width = f;
            Video video3 = aweme.getVideo();
            if (video3 != null) {
                f2 = (float) video3.getHeight();
            }
            shareStoryContent.height = f2;
            shareStoryContent.title = aweme.getDesc();
            Story story = aweme.getStory();
            if (story != null) {
                j = story.getExpiredAt();
            } else {
                j = 0;
            }
            shareStoryContent.setExpireAt(Long.valueOf(j));
            shareStoryContent.setSourceType(1);
            shareStoryContent.awemeType = 40;
            shareStoryContent.type = ShareStoryContent.Companion.getAweType(shareStoryContent.getSourceType());
            return shareStoryContent;
        }

        public final ShareStoryContent fromSharePackage(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            ShareStoryContent shareStoryContent = new ShareStoryContent();
            Bundle bundle = sharePackage.f155492i;
            shareStoryContent.user = bundle.getString("uid_for_share");
            shareStoryContent.secUid = bundle.getString("sec_user_id");
            shareStoryContent.itemId = bundle.getString("item_id_string");
            Serializable serializable = bundle.getSerializable("video_cover");
            UrlModel urlModel = null;
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareStoryContent.coverUrl = (UrlModel) serializable;
            Serializable serializable2 = bundle.getSerializable("thumb_for_share");
            if (serializable2 instanceof UrlModel) {
                urlModel = serializable2;
            }
            shareStoryContent.contentThumb = urlModel;
            shareStoryContent.contentName = bundle.getString("author_name");
            shareStoryContent.width = (float) bundle.getInt("aweme_width");
            shareStoryContent.height = (float) bundle.getInt("aweme_height");
            shareStoryContent.title = bundle.getString("desc");
            shareStoryContent.setExpireAt(Long.valueOf(bundle.getLong("expired_at", 0)));
            shareStoryContent.setSourceType(Integer.valueOf(bundle.getInt("source_type", 0)));
            shareStoryContent.awemeType = 40;
            shareStoryContent.type = ShareStoryContent.Companion.getAweType(shareStoryContent.getSourceType());
            return shareStoryContent;
        }
    }

    public final Long getExpireAt() {
        return this.expireAt;
    }

    public final Integer getSourceType() {
        return this.sourceType;
    }

    public final String getStoryCollectionId() {
        return this.storyCollectionId;
    }

    public ShareStoryContent() {
        this.awemeType = 40;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        long j;
        SharePackage a = PureDataSharePackage.C55965a.m101845a("story_video");
        Bundle bundle = a.f155492i;
        bundle.putInt("aweme_type", getAwemeType());
        bundle.putString("item_id_string", this.itemId);
        bundle.putString("author_id", this.user);
        bundle.putString("author_name", this.contentName);
        bundle.putSerializable("video_cover", getCoverUrl());
        bundle.putSerializable("thumb_for_share", this.contentThumb);
        bundle.putString("desc", this.title);
        Long l = this.expireAt;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        bundle.putLong("expired_at", j);
        bundle.putInt("source_type", 3);
        bundle.putInt("aweme_height", (int) this.height);
        bundle.putInt("aweme_width", (int) this.width);
        bundle.putInt("aweme_type", this.type);
        return a;
    }

    public final void setExpireAt(Long l) {
        this.expireAt = l;
    }

    public final void setSourceType(Integer num) {
        this.sourceType = num;
    }

    public final void setStoryCollectionId(String str) {
        C89219l.m154721d(str, "");
        this.storyCollectionId = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getQuoteHint(Context context) {
        C89219l.m154721d(context, "");
        String string = context.getResources().getString(R.string.cg6);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        if (!C77260g.f173332a.mo120146a()) {
            return super.wrapMsgHint(z, z2, str);
        }
        Context a = C17867d.m33078a();
        if (z || z2) {
            str2 = a.getString(R.string.hcj);
        } else {
            str2 = a.getString(R.string.hci);
        }
        ShareAwemeContent.awemeMsgHint = str2;
        return str2;
    }
}
