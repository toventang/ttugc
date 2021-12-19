package com.p2082ss.android.ugc.aweme.feed.background;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.background.a */
public final class C49283a {
    static {
        Covode.recordClassIndex(58081);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.a$a */
    public static final class C49284a implements AbstractC19186f {

        /* renamed from: a */
        final /* synthetic */ Aweme f113288a;

        static {
            Covode.recordClassIndex(58082);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final String getAlbumName() {
            return "";
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final long getDuration() {
            return -1;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final String getLocalPath() {
            return "";
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final String getPlayUrl() {
            return "";
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final String getId() {
            String aid = this.f113288a.getAid();
            C89219l.m154716b(aid, "");
            return aid;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final PlayModel getPlayModel() {
            return new PlayModel(null, null, null, 7, null);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final String getSongName() {
            String desc = this.f113288a.getDesc();
            if (desc == null) {
                return "";
            }
            return desc;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final String getArtistName() {
            String str;
            User author = this.f113288a.getAuthor();
            if (author == null || ("@" + author.getUniqueId()) == null) {
                return "";
            }
            return str;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f
        public final String getCoverUrl() {
            UrlModel avatarMedium;
            List<String> urlList;
            String str;
            User author = this.f113288a.getAuthor();
            if (author == null || (avatarMedium = author.getAvatarMedium()) == null || (urlList = avatarMedium.getUrlList()) == null || (str = (String) C89070n.m154579f((List) urlList)) == null) {
                return "";
            }
            return str;
        }

        C49284a(Aweme aweme) {
            this.f113288a = aweme;
        }
    }

    /* renamed from: a */
    public static final AbstractC19186f m92317a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        return new C49284a(aweme);
    }

    /* renamed from: b */
    public static final boolean m92318b(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (aweme.isLive() || aweme.isAd()) {
            return true;
        }
        return false;
    }
}
