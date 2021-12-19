package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14894c;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37869ax;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37881be;
import com.p2082ss.android.ugc.aweme.commercialize.p2569i.C38010a;
import com.p2082ss.android.ugc.aweme.commercialize.p2569i.C38012b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.web.C81538c;
import com.p2082ss.android.ugc.aweme.web.C81542d;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.d */
public final class C37670d implements AbstractC33367d {
    static {
        Covode.recordClassIndex(45103);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d
    /* renamed from: a */
    public final void mo59396a() {
        C38012b.m77079a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d
    /* renamed from: a */
    public final void mo59398a(AwemeRawAd awemeRawAd) {
        String str;
        C89219l.m154721d(awemeRawAd, "");
        if (Build.VERSION.SDK_INT >= 21) {
            String g = AdLandPagePreloadServiceImpl.m68380f().mo59391g("feed");
            String channelName = awemeRawAd.getChannelName();
            if (TextUtils.isEmpty(g) || TextUtils.isEmpty(channelName)) {
                str = "";
            } else {
                str = C80333dc.m139277b(g, channelName);
            }
            if (str != null && str.length() != 0) {
                C89219l.m154721d(str, "");
                File file = new File(str, "resource.android.html");
                if (file.exists() && file.isFile()) {
                    Long creativeId = awemeRawAd.getCreativeId();
                    C89219l.m154716b(creativeId, "");
                    long longValue = creativeId.longValue();
                    String absolutePath = file.getAbsolutePath();
                    C89219l.m154716b(absolutePath, "");
                    String webUrl = awemeRawAd.getWebUrl();
                    String a = C81631k.f182525a.mo53731a(g);
                    C89219l.m154716b(a, "");
                    C38010a aVar = new C38010a(a, channelName, "feed");
                    C89219l.m154721d(absolutePath, "");
                    if (Build.VERSION.SDK_INT >= 21) {
                        int incrementAndGet = C38012b.f89823a.incrementAndGet();
                        C1731i.m5631a(500).mo5532a(new C38012b.C38014b(incrementAndGet, absolutePath)).mo5534a(new C38012b.C38015c(incrementAndGet, longValue, webUrl, aVar), C1731i.f5564c, null);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d
    /* renamed from: a */
    public final void mo59400a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            C1731i.m5640b(new C37881be.CallableC37882a(list), C1731i.f5562a);
        }
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            C1731i.m5640b(new C37869ax.CallableC37870a(list), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d
    /* renamed from: a */
    public final boolean mo59402a(String str, String str2) {
        return C80333dc.m139274a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d
    /* renamed from: a */
    public final long mo59395a(long j, long j2) {
        if (j == C38012b.f89826d && C38012b.f89827e != -1) {
            return j2 - C38012b.f89827e;
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d
    /* renamed from: a */
    public final void mo59401a(List<String> list, String str, String str2) {
        C89219l.m154721d(str2, "");
        m76072a(list, str, new C81542d());
    }

    /* renamed from: a */
    private static void m76072a(List<String> list, String str, AbstractC14933a aVar) {
        if (list != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                targetChannel.channelName = it.next();
                arrayList.add(targetChannel);
            }
            if (str != null) {
                hashMap.put(str, arrayList);
                C14894c a = C80333dc.m139270a(str);
                if (a != null) {
                    a.mo24000a(hashMap, aVar);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d
    /* renamed from: a */
    public final void mo59399a(String str, String str2, String str3) {
        C89219l.m154721d(str3, "");
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
        targetChannel.channelName = str;
        arrayList.add(targetChannel);
        if (str2 != null) {
            hashMap.put(str2, arrayList);
            C14894c a = C80333dc.m139270a(str2);
            if (a != null) {
                a.mo24000a(hashMap, new C81542d());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33367d
    /* renamed from: a */
    public final void mo59397a(Aweme aweme, List<String> list, String str, String str2) {
        C89219l.m154721d(str2, "");
        if (aweme != null) {
            m76072a(list, str, new C81538c(aweme));
        }
    }
}
