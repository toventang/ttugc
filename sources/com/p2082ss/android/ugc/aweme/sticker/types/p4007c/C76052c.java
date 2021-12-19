package com.p2082ss.android.ugc.aweme.sticker.types.p4007c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.c.c */
public final class C76052c {

    /* renamed from: a */
    public static final C76052c f170882a = new C76052c();

    private C76052c() {
    }

    static {
        Covode.recordClassIndex(88996);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.c.c$a */
    public static final class C76053a extends AbstractC76048a {

        /* renamed from: a */
        final /* synthetic */ String f170883a;

        static {
            Covode.recordClassIndex(88997);
        }

        C76053a(String str) {
            this.f170883a = str;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.f170883a);
            C40982q.m82520a("effect_watermark_download_rate", 0, jSONObject);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.f170883a);
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            jSONObject.put("exception", str);
            C40982q.m82520a("effect_watermark_download_rate", 1, jSONObject);
        }
    }

    /* renamed from: a */
    static String m133341a(Effect effect) {
        if (!TextUtils.isEmpty(effect.getExtra())) {
            try {
                return new JSONObject(effect.getExtra()).optString("watermark_for_captured_image");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            throw new IllegalArgumentException("extra cannot be null: stickerId" + effect.getId());
        }
    }
}
