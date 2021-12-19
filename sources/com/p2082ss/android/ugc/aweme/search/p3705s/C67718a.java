package com.p2082ss.android.ugc.aweme.search.p3705s;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41505am;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41886h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.search.s.a */
public final class C67718a {
    static {
        Covode.recordClassIndex(79363);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.s.a$a */
    public static final class C67719a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ Aweme f151782a;

        static {
            Covode.recordClassIndex(79364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67719a(Aweme aweme) {
            super(0);
            this.f151782a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (C67718a.m119886c(this.f151782a)) {
                return "static";
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.s.a$b */
    public static final class C67720b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ Aweme f151783a;

        static {
            Covode.recordClassIndex(79365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67720b(Aweme aweme) {
            super(0);
            this.f151783a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String str;
            UrlModel aiDynamicCover;
            String uri;
            UrlModel aiDynamicCoverBak;
            String uri2;
            UrlModel d = C67718a.m119887d(this.f151783a);
            if (d != null) {
                str = d.getUri();
            } else {
                str = null;
            }
            int a = C41886h.m83907a();
            if (a == 1) {
                return "dynamic_1";
            }
            if (a == 2) {
                Video video = this.f151783a.getVideo();
                if (video == null || (aiDynamicCover = video.getAiDynamicCover()) == null || (uri = aiDynamicCover.getUri()) == null || !uri.equals(str)) {
                    return "dynamic_3";
                }
                return "dynamic_1";
            } else if (a != 3) {
                return null;
            } else {
                Video video2 = this.f151783a.getVideo();
                if (video2 == null || (aiDynamicCoverBak = video2.getAiDynamicCoverBak()) == null || (uri2 = aiDynamicCoverBak.getUri()) == null || !uri2.equals(str)) {
                    return "dynamic_6";
                }
                return "dynamic_1";
            }
        }
    }

    /* renamed from: a */
    public static final String m119883a(Aweme aweme) {
        int totalProductAnchors;
        if (aweme == null || (totalProductAnchors = aweme.getTotalProductAnchors()) <= 0) {
            return "";
        }
        if (totalProductAnchors == 1) {
            return "search_video_single_anchor";
        }
        if (totalProductAnchors > 1) {
            return "search_video_multi_anchor";
        }
        return "";
    }

    /* renamed from: b */
    public static final String m119885b(Aweme aweme) {
        int totalProductAnchors;
        if (aweme == null || (totalProductAnchors = aweme.getTotalProductAnchors()) <= 0) {
            return "";
        }
        if (totalProductAnchors == 1) {
            return "yes";
        }
        if (totalProductAnchors > 1) {
            return "no";
        }
        return "";
    }

    /* renamed from: d */
    public static final UrlModel m119887d(Aweme aweme) {
        UrlModel animatedCover;
        if (aweme != null) {
            Video video = aweme.getVideo();
            if (video != null && (animatedCover = video.getAnimatedCover()) != null) {
                return animatedCover;
            }
            Video video2 = aweme.getVideo();
            if (video2 != null) {
                return video2.getDynamicCover();
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m119884a(UrlModel urlModel) {
        List<String> urlList;
        String str;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C89070n.m154583g((List) urlList)) == null || !C80538hl.m139614a(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m119886c(Aweme aweme) {
        Video video;
        Video video2;
        if (!C41505am.m83450a() || aweme == null || (video = aweme.getVideo()) == null || video.getAiCover() == null || (video2 = aweme.getVideo()) == null || video2.isCustomCover()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m119888e(Aweme aweme) {
        UrlModel urlModel;
        Video video;
        Video video2;
        boolean a = m119884a(m119887d(aweme));
        UrlModel urlModel2 = null;
        if (aweme == null || (video2 = aweme.getVideo()) == null) {
            urlModel = null;
        } else {
            urlModel = video2.getAiDynamicCover();
        }
        boolean a2 = m119884a(urlModel);
        if (!(aweme == null || (video = aweme.getVideo()) == null)) {
            urlModel2 = video.getAiDynamicCoverBak();
        }
        boolean a3 = m119884a(urlModel2);
        if (a || a2 || a3) {
            return true;
        }
        return false;
    }
}
