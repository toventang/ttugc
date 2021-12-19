package com.p2082ss.android.ugc.aweme.sticker.types.p3999a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75441c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75446h;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75616b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.a.a */
public final class C75905a {

    /* renamed from: a */
    private Context f170480a;

    /* renamed from: b */
    private AbstractC75616b f170481b;

    /* renamed from: c */
    private Effect f170482c;

    /* renamed from: d */
    private LinearLayout f170483d;

    /* renamed from: e */
    private SimpleDraweeView f170484e;

    /* renamed from: f */
    private TextView f170485f;

    /* renamed from: g */
    private TextView f170486g;

    /* renamed from: h */
    private Map<String, C75441c> f170487h = new HashMap();

    static {
        Covode.recordClassIndex(88845);
    }

    /* renamed from: a */
    private void m133098a(C75441c cVar, boolean z) {
        if (cVar == null) {
            this.f170483d.setVisibility(8);
            return;
        }
        this.f170481b.mo118959a(cVar.getId());
        this.f170483d.setVisibility(0);
        UrlModel screenIcon = cVar.getScreenIcon();
        if (screenIcon != null) {
            this.f170484e.setVisibility(0);
            C84402a.m145183b(this.f170484e, screenIcon);
        } else {
            this.f170484e.setVisibility(8);
        }
        this.f170485f.setText(cVar.getScreenDesc());
        long expireTime = cVar.getExpireTime();
        String format = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date(1000 * expireTime));
        if (expireTime == 0 || TextUtils.isEmpty(format) || !z) {
            this.f170486g.setVisibility(8);
            return;
        }
        this.f170486g.setVisibility(0);
        this.f170486g.setText(this.f170480a.getString(R.string.dmb, format));
    }

    /* renamed from: a */
    public final boolean mo119567a(Effect effect, int i) {
        if (C63238c.f143594u.mo93901a()) {
            this.f170483d.setVisibility(8);
            return false;
        } else if (C72847c.m128639e(effect)) {
            return false;
        } else {
            if (effect == null || i == 0 || !effect.isBusiness()) {
                this.f170483d.setVisibility(8);
                return false;
            } else if (this.f170487h.containsKey(effect.getEffectId())) {
                m133098a(this.f170487h.get(effect.getEffectId()), C72847c.m128636c(effect));
                return true;
            } else {
                this.f170482c = effect;
                String effectId = effect.getEffectId();
                C1731i.m5640b(new CallableC75906b(effectId), C1731i.f5562a).mo5534a(new C75907c(this, effectId, effect), C1731i.f5564c, null);
                return true;
            }
        }
    }

    public C75905a(LinearLayout linearLayout, AbstractC75616b bVar, Context context) {
        this.f170480a = context;
        this.f170481b = bVar;
        this.f170483d = linearLayout;
        this.f170484e = (SimpleDraweeView) linearLayout.findViewById(R.id.aav);
        this.f170485f = (TextView) linearLayout.findViewById(R.id.aau);
        this.f170486g = (TextView) linearLayout.findViewById(R.id.aax);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo119566a(String str, Effect effect, C1731i iVar) {
        if (!TextUtils.equals(this.f170482c.getEffectId(), str)) {
            return null;
        }
        if (iVar.mo5539b() || iVar.mo5544c()) {
            m133098a(this.f170487h.get(str), C72847c.m128636c(effect));
            return null;
        }
        try {
            C75441c cVar = ((C75446h) iVar.mo5545d()).mStickers.get(0).commerceSticker;
            this.f170487h.put(str, cVar);
            m133098a(cVar, C72847c.m128636c(effect));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
