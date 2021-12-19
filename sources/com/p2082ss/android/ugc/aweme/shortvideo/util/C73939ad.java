package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.Comparator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ad */
public final class C73939ad {

    /* renamed from: a */
    public static final C73940a f166018a = new C73940a((byte) 0);

    static {
        Covode.recordClassIndex(86689);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ad$a */
    public static final class C73940a {
        static {
            Covode.recordClassIndex(86690);
        }

        private C73940a() {
        }

        public /* synthetic */ C73940a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ad$a$a */
        public static final class C73941a<T> implements Comparator {
            static {
                Covode.recordClassIndex(86691);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                long j;
                long j2;
                T t3 = t;
                C89219l.m154716b(t3, "");
                String segmentBeginTime = t3.getSegmentBeginTime();
                if (segmentBeginTime == null || segmentBeginTime.length() == 0) {
                    j = System.currentTimeMillis();
                } else {
                    String segmentBeginTime2 = t3.getSegmentBeginTime();
                    C89219l.m154716b(segmentBeginTime2, "");
                    j = Long.parseLong(segmentBeginTime2);
                }
                Long valueOf = Long.valueOf(j);
                T t4 = t2;
                C89219l.m154716b(t4, "");
                String segmentBeginTime3 = t4.getSegmentBeginTime();
                if (segmentBeginTime3 == null || segmentBeginTime3.length() == 0) {
                    j2 = System.currentTimeMillis();
                } else {
                    String segmentBeginTime4 = t4.getSegmentBeginTime();
                    C89219l.m154716b(segmentBeginTime4, "");
                    j2 = Long.parseLong(segmentBeginTime4);
                }
                return C89090a.m154604a(valueOf, Long.valueOf(j2));
            }
        }

        /* renamed from: a */
        public static void m130036a(List<CreateAnchorInfo> list, C71872i iVar) {
            String str;
            UrlModel iconUrl;
            List<String> urlList;
            UrlModel iconUrl2;
            List<String> urlList2;
            C89219l.m154721d(list, "");
            C89219l.m154721d(iVar, "");
            MvModel mvModel = iVar.mvInfo;
            String str2 = null;
            if (mvModel != null) {
                str = mvModel.getName();
                if (!(str == null || str.length() == 0)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("add_from", 1);
                        jSONObject.put("third_id", iVar.mvThemeId);
                        MvModel mvModel2 = iVar.mvInfo;
                        if (!(mvModel2 == null || (iconUrl = mvModel2.getIconUrl()) == null || (urlList = iconUrl.getUrlList()) == null)) {
                            if (!urlList.isEmpty()) {
                                MvModel mvModel3 = iVar.mvInfo;
                                if (!(mvModel3 == null || (iconUrl2 = mvModel3.getIconUrl()) == null || (urlList2 = iconUrl2.getUrlList()) == null)) {
                                    str2 = urlList2.get(0);
                                }
                                jSONObject.put("icon_url", str2);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String jSONObject2 = jSONObject.toString();
                    C89219l.m154716b(jSONObject2, "");
                    list.add(new CreateAnchorInfo(29, str, "", "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png", -1L, null, null, null, null, null, 3968, null));
                    return;
                }
            } else {
                str = null;
            }
            C73991bj.m130128a("[addMiscInfoAnchors] : keyword = ".concat(String.valueOf(str)));
        }

        /* JADX WARNING: Removed duplicated region for block: B:82:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0198  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01f7  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x022c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m130035a(java.util.List<com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r33, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r34) {
            /*
            // Method dump skipped, instructions count: 572
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.util.C73939ad.C73940a.m130035a(java.util.List, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
        }
    }
}
