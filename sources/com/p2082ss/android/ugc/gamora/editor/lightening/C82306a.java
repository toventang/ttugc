package com.p2082ss.android.ugc.gamora.editor.lightening;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.a */
public final class C82306a {

    /* renamed from: a */
    public static final C82306a f184111a = new C82306a();

    private C82306a() {
    }

    static {
        Covode.recordClassIndex(96140);
    }

    /* renamed from: b */
    public static boolean m142359b() {
        if (!m142357a()) {
            return false;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        return createIAVServiceProxybyMonsterPlugin.getStoryService().mo93868b();
    }

    /* renamed from: a */
    public static boolean m142357a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e() || C63244g.m114602a().mo73255A().mo93901a()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m142361c() {
        if (!m142357a()) {
            return false;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93869c()) {
            return true;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin2, "");
        if (createIAVServiceProxybyMonsterPlugin2.getStoryService().mo93870d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m142360b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.isCommentReply() || m142362c(videoPublishEditModel)) {
            return false;
        }
        Boolean bool = videoPublishEditModel.hasQaSticker;
        C89219l.m154716b(bool, "");
        if (bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m142363d(VideoPublishEditModel videoPublishEditModel) {
        AVChallenge aVChallenge;
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (!(cVar == null || (aVChallenge = cVar.challenge) == null || !aVChallenge.isCommerce)) {
            return true;
        }
        List<AVChallenge> list = videoPublishEditModel.challenges;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (AVChallenge aVChallenge2 : list) {
                if (aVChallenge2.isCommerce) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m142358a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (m142357a() && !videoPublishEditModel.isShoutout() && !C89219l.m154714a((Object) videoPublishEditModel.mShootWay, (Object) C74418d.shootWay) && !C70976bp.m125314j(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m142362c(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        Boolean bool = a.f156493m;
        C89219l.m154716b(bool, "");
        if (!bool.booleanValue() && !m142363d(videoPublishEditModel) && C63253l.f143623a.mo73330z().mo93813a(videoPublishEditModel.commerceData) == null && !C89219l.m154714a((Object) videoPublishEditModel.mShootWay, (Object) "tcm_upload")) {
            return false;
        }
        return true;
    }
}
