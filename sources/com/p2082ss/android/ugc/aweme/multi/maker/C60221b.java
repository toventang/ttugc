package com.p2082ss.android.ugc.aweme.multi.maker;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.b */
public final class C60221b extends AbstractC60267o {
    static {
        Covode.recordClassIndex(70753);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: j */
    public final boolean mo97922j() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "app_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60221b();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.DONATION_STICKER.getTYPE();
    }

    /* renamed from: n */
    private final String m109779n() {
        String str;
        boolean z;
        if (this.f137358h == null) {
            return "";
        }
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        String str2 = null;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
            if (anchorCommonStruct2 != null) {
                str2 = anchorCommonStruct2.getExtra();
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.optLong("linked_effect_id", 0) > 0) {
                return String.valueOf(jSONObject.optLong("linked_effect_id"));
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: u */
    private final Integer m109780u() {
        String str;
        boolean z;
        if (this.f137358h != null) {
            AnchorCommonStruct anchorCommonStruct = this.f137358h;
            String str2 = null;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getExtra();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
                    if (anchorCommonStruct2 != null) {
                        str2 = anchorCommonStruct2.getExtra();
                    }
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.optInt("ngo_id", 0) > 0) {
                        return Integer.valueOf(jSONObject.optInt("ngo_id"));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        String str;
        String str2 = "";
        C89219l.m154721d(dVar, str2);
        mo97944a(dVar, true, false);
        SmartRoute withParam = SmartRouter.buildRoute(mo97952r(), "aweme://donation/pannel").withParam("enter_method", "anchor_click").withParam("enter_from", mo97950p()).withParam("aweme_id", mo97949o().getAid());
        String optString = mo97953s().optString("request_id");
        if (optString != null) {
            str2 = optString;
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str2);
        SmartRoute withParam2 = withParam.withParam("log_pb", C48027ac.C48028a.f111257a.mo80054a(logPbBean)).withParam("sticker_id", m109779n()).withParam("ngo_id", m109780u());
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getKeyword();
        } else {
            str = null;
        }
        withParam2.withParam("ngo_name", str).open();
    }
}
