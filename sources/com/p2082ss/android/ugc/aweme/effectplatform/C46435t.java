package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.t */
public final class C46435t implements IEffectDownloadProgressListener {

    /* renamed from: a */
    private final IFetchEffectListener f108201a;

    /* renamed from: b */
    private long f108202b;

    /* renamed from: c */
    private long f108203c;

    static {
        Covode.recordClassIndex(55016);
    }

    /* renamed from: b */
    private static boolean m89601b() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean a = m89600a();
        C58029j.f132253e = a;
        return a;
    }

    /* renamed from: a */
    private static boolean m89600a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    private C46435t(IFetchEffectListener iFetchEffectListener) {
        this.f108201a = iFetchEffectListener;
    }

    /* renamed from: a */
    private static JSONObject m89599a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.f108202b = System.currentTimeMillis();
        this.f108203c = 0;
        IFetchEffectListener iFetchEffectListener = this.f108201a;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ce  */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onSuccess(com.p2082ss.android.ugc.effectmanager.effect.model.Effect r16) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effectplatform.C46435t.onSuccess(java.lang.Object):void");
    }

    /* renamed from: a */
    public static C46435t m89598a(IFetchEffectListener iFetchEffectListener, String str) {
        return new C46435t(new C46423n(str, iFetchEffectListener));
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        Object obj;
        String effectId;
        if (m89601b()) {
            StringBuilder append = new StringBuilder().append(exceptionResult.getMsg());
            String str = "";
            if (exceptionResult.getErrorCode() == -1) {
                obj = exceptionResult.getException().getStackTrace();
            } else {
                obj = str;
            }
            String sb = append.append(obj).toString();
            AbstractC63190ap I = C63244g.m114602a().mo73263I();
            C69840ar arVar = new C69840ar();
            if (effect == null) {
                effectId = str;
            } else {
                effectId = effect.getEffectId();
            }
            C69840ar a = arVar.mo110189a("sticker_id", effectId).mo110189a("errorCode", String.valueOf(exceptionResult.getErrorCode())).mo110189a("errorMsg", sb).mo110187a("zip_model", (Integer) 0);
            if (effect != null) {
                str = C63244g.m114602a().mo73261G().mo46674b(effect.getFileUrl());
            }
            I.mo101629a("sticker_download_error_rate", 1, a.mo110189a("url", str).mo110191a());
            JSONObject a2 = new C69840ar().mo110187a("error_code", Integer.valueOf(exceptionResult.getErrorCode())).mo110189a("error_msg", sb).mo110191a();
            C63244g.m114602a().mo73263I().mo101630a("ttlive_download_sticker_all", 1, null, m89599a(a2));
            C63244g.m114602a().mo73263I().mo101629a("ttlive_download_sticker_error", 1, a2);
        }
        C46403b.m89553a(effect, this.f108203c, System.currentTimeMillis() - this.f108202b, -1, exceptionResult);
        IFetchEffectListener iFetchEffectListener = this.f108201a;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        if (this.f108203c == 0) {
            this.f108203c = j;
            C46403b.m89552a(effect, j);
        }
        IFetchEffectListener iFetchEffectListener = this.f108201a;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(effect, i, j);
        }
    }
}
