package com.p2082ss.android.ugc.gamora.editor;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import com.p2082ss.android.ugc.aweme.services.edit.VideoInfoData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl */
public final class EditVideoInfoServiceImpl implements IEditVideoInfoService {

    /* renamed from: a */
    private final int f183557a = 10;

    /* renamed from: b */
    private final LruCache<String, Long> f183558b = new LruCache<>(10);

    /* renamed from: c */
    private final LruCache<String, VideoInfoData> f183559c = new LruCache<>(10);

    static {
        Covode.recordClassIndex(95841);
    }

    /* renamed from: a */
    public static IEditVideoInfoService m141997a() {
        MethodCollector.m26663i(9884);
        Object a = C81908b.m141854a(IEditVideoInfoService.class, false);
        if (a != null) {
            IEditVideoInfoService iEditVideoInfoService = (IEditVideoInfoService) a;
            MethodCollector.m26664o(9884);
            return iEditVideoInfoService;
        }
        if (C81908b.f183362eF == null) {
            synchronized (IEditVideoInfoService.class) {
                try {
                    if (C81908b.f183362eF == null) {
                        C81908b.f183362eF = new EditVideoInfoServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9884);
                    throw th;
                }
            }
        }
        EditVideoInfoServiceImpl editVideoInfoServiceImpl = (EditVideoInfoServiceImpl) C81908b.f183362eF;
        MethodCollector.m26664o(9884);
        return editVideoInfoServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final VideoInfoData getVideoInfoData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f183559c.get(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final Long getVideoLength(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return this.f183558b.get(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final void setVideoInfoData(String str, VideoInfoData videoInfoData) {
        C89219l.m154721d(videoInfoData, "");
        if (!TextUtils.isEmpty(str)) {
            this.f183559c.put(str, videoInfoData);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final void setVideoLength(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f183558b.put(str, Long.valueOf(j));
        }
    }
}
