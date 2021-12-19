package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.s */
public final class C46434s implements IFetchEffectChannelListener {

    /* renamed from: a */
    public Map<String, Object> f108197a;

    /* renamed from: b */
    private IFetchEffectChannelListener f108198b;

    /* renamed from: c */
    private C27252o f108199c = C27252o.m54253a();

    /* renamed from: d */
    private String f108200d;

    static {
        Covode.recordClassIndex(55015);
    }

    /* renamed from: a */
    private static JSONObject m89597a(JSONObject jSONObject) {
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

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknow error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
        }
        int i = 0;
        Map<String, Object> map = this.f108197a;
        if (map != null && map.containsKey("is_story")) {
            i = ((Integer) this.f108197a.get("is_story")).intValue();
        }
        C63244g.m114602a().mo73263I().mo101629a("sticker_list_error_rate", 1, new C69840ar().mo110187a("errorCode", Integer.valueOf(errorCode)).mo110189a("errorDesc", msg).mo110189a("panel", this.f108200d).mo110187a("is_story", Integer.valueOf(i)).mo110191a());
        JSONObject a = new C69840ar().mo110187a("error_code", Integer.valueOf(errorCode)).mo110189a("error_msg", msg).mo110189a("panel_type", this.f108200d).mo110191a();
        C63244g.m114602a().mo73263I().mo101630a("ttlive_load_sticker_list_all", 1, null, m89597a(a));
        C63244g.m114602a().mo73263I().mo101629a("ttlive_load_sticker_list_error", 1, a);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.f108198b;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onFail(exceptionResult);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
        int i;
        long a = this.f108199c.mo45339a(TimeUnit.MILLISECONDS);
        Map<String, Object> map = this.f108197a;
        if (map == null || !map.containsKey("is_story")) {
            i = 0;
        } else {
            i = ((Integer) this.f108197a.get("is_story")).intValue();
        }
        JSONObject a2 = new C69840ar().mo110188a("duration", Long.valueOf(a)).mo110187a("is_story", Integer.valueOf(i)).mo110189a("panel", this.f108200d).mo110191a();
        Map<String, Object> map2 = this.f108197a;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                try {
                    a2.put(str, this.f108197a.get(str).toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        C63244g.m114602a().mo73263I().mo101629a("sticker_list_error_rate", 0, a2);
        C63244g.m114602a().mo73263I().mo101630a("ttlive_load_sticker_list_all", 0, a2, m89597a(new C69840ar().mo110189a("panel_type", this.f108200d).mo110191a()));
        IFetchEffectChannelListener iFetchEffectChannelListener = this.f108198b;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onSuccess(effectChannelResponse);
        }
    }

    private C46434s(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.f108198b = iFetchEffectChannelListener;
        this.f108200d = str;
    }

    /* renamed from: a */
    public static C46434s m89596a(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        return new C46434s(str, new C46419j(str, iFetchEffectChannelListener));
    }
}
