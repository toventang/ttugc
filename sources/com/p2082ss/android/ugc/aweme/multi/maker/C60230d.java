package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34676f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.d */
public final class C60230d extends AbstractC60267o implements AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    private C33744d f137283d;

    static {
        Covode.recordClassIndex(70762);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(156, new RunnableC90250g(C60230d.class, "onWebViewFinish", C40565d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "app_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: m */
    public final boolean mo97926m() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60230d();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.LIVE_EVENT.getTYPE();
    }

    /* renamed from: n */
    private static boolean m109803n() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: u */
    private JSONObject m109804u() {
        String str;
        JSONObject jSONObject = new JSONObject();
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            jSONObject.put("live_event_id", C34676f.C34677a.m70844a(anchorCommonStruct.getSchema()));
            if (!TextUtils.isEmpty(anchorCommonStruct.getExtra())) {
                try {
                    if (new JSONObject(anchorCommonStruct.getExtra()).optBoolean("is_paid_event", false)) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    jSONObject.put("is_free_event", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        m109920a(dVar, m109804u());
        super.mo97891b(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        m109920a(dVar, m109804u());
        super.mo97892c(dVar);
    }

    @AbstractC90264r
    public final void onWebViewFinish(C40565d dVar) {
        Map<String, String> map;
        String str;
        String str2 = "";
        C89219l.m154721d(dVar, str2);
        String str3 = null;
        if (mo97922j()) {
            C33744d a = mo97954t().mo59981a("duration", dVar.f94911a);
            AnchorCommonStruct anchorCommonStruct = this.f137358h;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getSchema();
            } else {
                str = null;
            }
            String a2 = C34676f.C34677a.m70844a(str);
            if (a2 == null) {
                a2 = str2;
            }
            C39162r.m79460a("multi_anchor_stay_time", a.mo59983a("live_event_id", a2).f79943a);
        }
        C33744d t = mo97954t();
        C33744d dVar2 = this.f137283d;
        if (dVar2 == null || (map = dVar2.f79943a) == null) {
            map = C89041ag.m154415a();
        }
        C33744d a3 = t.mo59985a(new HashMap<>(map)).mo59981a("duration", dVar.f94911a);
        AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
        if (anchorCommonStruct2 != null) {
            str3 = anchorCommonStruct2.getSchema();
        }
        String a4 = C34676f.C34677a.m70844a(str3);
        if (a4 != null) {
            str2 = a4;
        }
        C39162r.m79460a("multi_anchor_stay_time", a3.mo59983a("live_event_id", str2).f79943a);
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        String schema;
        String str = "";
        C89219l.m154721d(dVar, str);
        this.f137283d = dVar;
        Activity r = mo97952r();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m109803n();
        }
        if (!C58029j.f132253e) {
            new C23144b(r).mo37640e(R.string.dcp).mo37637b();
            return;
        }
        m109920a(dVar, m109804u());
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
            EventBus.m156966a(EventBus.m156962a(), this);
            String a = C34676f.C34677a.m70844a(schema);
            Bundle bundle = new Bundle();
            bundle.putFloat("bundle_dialog_screen_size", 0.95f);
            StringBuilder sb = new StringBuilder("&live_event_enter_from=anchor&group_id=");
            String aid = mo97949o().getAid();
            if (aid == null) {
                aid = str;
            }
            bundle.putString("bundle_url_extra_param", sb.append(aid).toString());
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, str);
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, str);
            AbstractC58593c d = s.mo95830d();
            if (a != null) {
                str = a;
            }
            d.mo12993a(r, str, currentUserID.toString(), bundle, new C34676f.C34677a.DialogInterface$OnDismissListenerC34678a(System.currentTimeMillis()));
        }
    }
}
