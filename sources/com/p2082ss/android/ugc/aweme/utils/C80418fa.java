package com.p2082ss.android.ugc.aweme.utils;

import android.app.Application;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.HashMap;
import okhttp3.C90200t;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.fa */
public final class C80418fa {

    /* renamed from: a */
    public static final C80418fa f179978a = new C80418fa();

    /* renamed from: b */
    private static final HashMap<String, Integer> f179979b = new HashMap<>();

    private C80418fa() {
    }

    static {
        Covode.recordClassIndex(93686);
    }

    /* renamed from: c */
    private static String m139409c(String str) {
        C63244g.m114602a().mo73291s();
        return str;
    }

    /* renamed from: a */
    public static final String m139407a(C69905c cVar) {
        String str = "";
        C89219l.m154721d(cVar, str);
        String path = cVar.getPath();
        if (path != null) {
            str = path;
        }
        if (cVar.isNeedSetCookie()) {
            str = m139410d(str);
        }
        return m139409c(str);
    }

    /* renamed from: d */
    private static String m139410d(String str) {
        C90200t f;
        C89219l.m154721d(str, "");
        if (C89361p.m154874b(str, "http://", false) || (f = C90200t.m156802f(str)) == null || f.mo145048c("ss_is_p_v_ss") != null) {
            return str;
        }
        C90200t.C90201a j = f.mo145060j();
        j.mo145070c("ss_is_p_v_ss", "1");
        String aVar = j.toString();
        C89219l.m154716b(aVar, "");
        return aVar;
    }

    /* renamed from: a */
    public static final int m139406a(String str) {
        Integer valueOf;
        if (str == null) {
            return 0;
        }
        HashMap<String, Integer> hashMap = f179979b;
        Integer num = hashMap.get(str);
        if (num != null && num.intValue() > 0) {
            return num.intValue();
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            valueOf = Integer.valueOf(iArr[3]);
        } else {
            C40970e.m82485a("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ".concat(String.valueOf(audioFileInfo)));
            valueOf = Integer.valueOf(C63253l.f143623a.mo73306b().mo101542b(str));
        }
        hashMap.put(str, valueOf);
        return valueOf.intValue();
    }

    /* renamed from: b */
    public static int m139408b(String str) {
        int floatValue;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (str != null) {
            try {
                String uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString();
                C89219l.m154716b(uri, "");
                if (C89361p.m154874b(str, uri, false)) {
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                    AbstractC63167ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
                    C89219l.m154716b(applicationService, "");
                    Application c = applicationService.mo93774c();
                    C89219l.m154716b(c, "");
                    mediaMetadataRetriever.setDataSource(c, Uri.parse(str));
                    floatValue = (int) Float.valueOf(mediaMetadataRetriever.extractMetadata(9)).floatValue();
                    mediaMetadataRetriever.release();
                    return floatValue;
                }
            } catch (Exception e) {
                e.printStackTrace();
                mediaMetadataRetriever.release();
                return -1;
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        }
        mediaMetadataRetriever.setDataSource(str);
        floatValue = (int) Float.valueOf(mediaMetadataRetriever.extractMetadata(9)).floatValue();
        try {
            mediaMetadataRetriever.release();
            return floatValue;
        } catch (Exception e3) {
            e3.printStackTrace();
            return floatValue;
        }
    }
}
