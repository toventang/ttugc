package com.p2082ss.android.ugc.aweme.video.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionVideoPlayerItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionVideoPlayerListModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.video.p4209c.C80713c;
import com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.util.d */
public final class C81078d {

    /* renamed from: a */
    public static final C81078d f181200a = new C81078d();

    private C81078d() {
    }

    static {
        Covode.recordClassIndex(94400);
    }

    /* renamed from: a */
    public static boolean m140774a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (!TranslatedCaptionCacheServiceImpl.m146355j().mo108895e() || !m140775b(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m140773a(CaptionModel captionModel) {
        if (captionModel == null || captionModel.getCaptionList() == null) {
            return "";
        }
        List<CaptionItemModel> captionList = captionModel.getCaptionList();
        if (captionList == null) {
            C89219l.m154715b();
        }
        if (captionList.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        List<CaptionItemModel> captionList2 = captionModel.getCaptionList();
        if (captionList2 != null) {
            int i = 0;
            for (T t : captionList2) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                arrayList.add(new CaptionVideoPlayerItemModel(Integer.valueOf(i), t2.getLanguageName(), t2.getSubId(), t2.getUrl(), t2.getExpire(), t2.getFormat(), t2.getSubId()));
                i = i2;
            }
        }
        return new C27910f().mo46674b(new CaptionVideoPlayerListModel(arrayList));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m140775b(com.p2082ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.util.C81078d.m140775b(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public static C80713c m140772a(Video video, boolean z) {
        CaptionModel captionModel;
        if (video == null || (captionModel = video.getCaptionModel()) == null || captionModel.getCaptionList() == null) {
            return null;
        }
        List<CaptionItemModel> captionList = video.getCaptionModel().getCaptionList();
        if (captionList == null) {
            C89219l.m154715b();
        }
        if (captionList.isEmpty()) {
            return null;
        }
        CaptionModel captionModel2 = video.getCaptionModel();
        C89219l.m154716b(captionModel2, "");
        return new C80713c(true, m140771a(captionModel2, z), m140773a(video.getCaptionModel()));
    }

    /* renamed from: a */
    private static int m140771a(CaptionModel captionModel, boolean z) {
        CaptionLanguage originalCaptionLanguage = captionModel.getOriginalCaptionLanguage();
        if (!(originalCaptionLanguage == null || captionModel.getCaptionList() == null)) {
            List<CaptionItemModel> captionList = captionModel.getCaptionList();
            if (captionList == null) {
                C89219l.m154715b();
            }
            if (!captionList.isEmpty()) {
                List<CaptionItemModel> captionList2 = captionModel.getCaptionList();
                if (captionList2 == null) {
                    C89219l.m154715b();
                }
                if (captionList2.size() == 1) {
                    List<CaptionItemModel> captionList3 = captionModel.getCaptionList();
                    if (captionList3 == null) {
                        C89219l.m154715b();
                    }
                    return captionList3.get(0).getSubId();
                }
                List<CaptionItemModel> captionList4 = captionModel.getCaptionList();
                if (captionList4 == null) {
                    C89219l.m154715b();
                }
                for (T t : captionList4) {
                    if (z) {
                        if (t.getLanguageId() != originalCaptionLanguage.getLanguageId()) {
                            return t.getSubId();
                        }
                    } else if (t.getLanguageId() == originalCaptionLanguage.getLanguageId()) {
                        return t.getSubId();
                    }
                }
            }
        }
        return -1;
    }
}
