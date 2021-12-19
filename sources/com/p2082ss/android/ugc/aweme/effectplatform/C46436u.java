package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.effectplatform.C46425o;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.u */
public final class C46436u implements IFetchPanelInfoListener {

    /* renamed from: d */
    public static final C46437a f108204d = new C46437a((byte) 0);

    /* renamed from: a */
    public Map<String, ? extends Object> f108205a;

    /* renamed from: b */
    public final String f108206b;

    /* renamed from: c */
    public final IFetchPanelInfoListener f108207c;

    /* renamed from: e */
    private final C27252o f108208e;

    static {
        Covode.recordClassIndex(55017);
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.u$a */
    public static final class C46437a {
        static {
            Covode.recordClassIndex(55018);
        }

        private C46437a() {
        }

        public /* synthetic */ C46437a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C46436u m89603a(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchPanelInfoListener, "");
            return new C46436u(str, C46425o.C46426a.m89592a(str, iFetchPanelInfoListener), (byte) 0);
        }
    }

    /* renamed from: a */
    private static JSONObject m89602a(JSONObject jSONObject) {
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

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        Object obj;
        int i;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknown error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
            C89219l.m154716b(msg, "");
        }
        AbstractC63190ap I = C63244g.m114602a().mo73263I();
        C69840ar a = new C69840ar().mo110187a("errorCode", Integer.valueOf(errorCode)).mo110189a("errorDesc", msg).mo110189a("panel", this.f108206b);
        Map<String, ? extends Object> map = this.f108205a;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        I.mo101629a("sticker_list_error_rate", 1, a.mo110187a("is_story", Integer.valueOf(i)).mo110191a());
        JSONObject a2 = new C69840ar().mo110187a("error_code", Integer.valueOf(errorCode)).mo110189a("error_msg", msg).mo110189a("panel_type", this.f108206b).mo110191a();
        C63244g.m114602a().mo73263I().mo101630a("ttlive_load_sticker_list_all", 1, null, m89602a(a2));
        C63244g.m114602a().mo73263I().mo101629a("ttlive_load_sticker_list_error", 1, a2);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.f108207c;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onFail(exceptionResult);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
        Object obj;
        int i;
        long a = this.f108208e.mo45339a(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.f108207c;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onSuccess(panelInfoModel);
        }
        C69840ar a2 = new C69840ar().mo110188a("duration", Long.valueOf(a)).mo110187a("abParam", (Integer) 2).mo110189a("panel", this.f108206b);
        Map<String, ? extends Object> map = this.f108205a;
        Integer num = null;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = obj;
        }
        Integer num2 = num;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        JSONObject a3 = a2.mo110187a("is_story", Integer.valueOf(i)).mo110191a();
        C63244g.m114602a().mo73263I().mo101629a("sticker_list_error_rate", 0, a3);
        C63244g.m114602a().mo73263I().mo101630a("ttlive_load_sticker_list_all", 0, a3, m89602a(new C69840ar().mo110189a("panel_type", this.f108206b).mo110191a()));
    }

    private C46436u(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.f108206b = str;
        this.f108207c = iFetchPanelInfoListener;
        C27252o a = C27252o.m54253a();
        C89219l.m154716b(a, "");
        this.f108208e = a;
    }

    public /* synthetic */ C46436u(String str, IFetchPanelInfoListener iFetchPanelInfoListener, byte b) {
        this(str, iFetchPanelInfoListener);
    }
}
