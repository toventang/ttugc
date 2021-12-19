package com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33242d;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView */
public abstract class AbstractFeedLynxView implements AbstractC33242d, AbstractC33974au {

    /* renamed from: a */
    public Aweme f79098a;

    /* renamed from: b */
    public AwemeRawAd f79099b;

    /* renamed from: c */
    public AbstractC33214c f79100c;

    /* renamed from: d */
    public boolean f79101d;

    /* renamed from: e */
    protected View f79102e;

    /* renamed from: f */
    public AbstractC16208i f79103f;

    /* renamed from: g */
    protected BulletContainerView f79104g;

    /* renamed from: h */
    public final ViewGroup f79105h;

    /* renamed from: i */
    public final AbstractC33252e f79106i;

    static {
        Covode.recordClassIndex(40131);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo59279a();

    /* renamed from: b */
    public void mo59282b(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract AbstractC35142e mo59283c();

    /* renamed from: f */
    public void mo59286f() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView$a */
    public static final class C33300a implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f79107a;

        /* renamed from: b */
        final /* synthetic */ String f79108b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f79109c = null;

        /* renamed from: d */
        private final String f79110d;

        static {
            Covode.recordClassIndex(40132);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f79110d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f79107a;
        }

        C33300a(String str, JSONObject jSONObject) {
            this.f79108b = str;
            this.f79110d = str;
            this.f79107a = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final BulletContainerView mo59281b() {
        BulletContainerView bulletContainerView = this.f79104g;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        return bulletContainerView;
    }

    /* renamed from: d */
    public final void mo59284d() {
        this.f79101d = false;
        String a = mo59279a();
        if (a != null) {
            Uri.Builder buildUpon = Uri.parse(a).buildUpon();
            buildUpon.appendQueryParameter("initialData", mo59285e().toString());
            AbstractC35142e c = mo59283c();
            if (c != null) {
                String builder = buildUpon.toString();
                C89219l.m154716b(builder, "");
                Bundle bundle = new Bundle();
                Context context = this.f79105h.getContext();
                AbstractC33214c cVar = this.f79100c;
                if (cVar != null) {
                    Aweme aweme = this.f79098a;
                    C89219l.m154716b(context, "");
                    cVar.mo59144a(bundle, aweme, context);
                }
                c.mo61984a(builder, bundle);
            }
        }
    }

    /* renamed from: e */
    public C28022o mo59285e() {
        String str;
        String str2;
        List<String> urlList;
        C28022o oVar = new C28022o();
        AwemeRawAd awemeRawAd = this.f79099b;
        String str3 = null;
        if (awemeRawAd != null) {
            Long adId = awemeRawAd.getAdId();
            if (adId != null) {
                str = String.valueOf(adId.longValue());
            } else {
                str = null;
            }
            oVar.mo46801a("adId", str);
            oVar.mo46801a("creativeId", awemeRawAd.getCreativeIdStr());
            oVar.mo46801a("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                str2 = String.valueOf(groupId.longValue());
            } else {
                str2 = null;
            }
            oVar.mo46801a("groupId", str2);
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            if (!(clickTrackUrlList == null || (urlList = clickTrackUrlList.getUrlList()) == null || urlList.isEmpty())) {
                C27919i iVar = new C27919i();
                Iterator<T> it = urlList.iterator();
                while (it.hasNext()) {
                    iVar.mo46687a((String) it.next());
                }
                oVar.mo46797a("clickTrackUrlList", iVar);
            }
            String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
            if (nativeSiteAdInfo == null) {
                nativeSiteAdInfo = "";
            }
            oVar.mo46801a("pageData", nativeSiteAdInfo);
        }
        Aweme aweme = this.f79098a;
        if (aweme != null) {
            str3 = aweme.getAid();
        }
        oVar.mo46801a("itemId", String.valueOf(str3));
        oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(this.f79105h.getContext()) ? 1 : 0));
        oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
        return oVar;
    }

    /* renamed from: a */
    public void mo59280a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        this.f79098a = aweme;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f79099b = awemeRawAd;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33242d
    /* renamed from: a */
    public final void mo59200a(String str) {
        C89219l.m154721d(str, "");
        AbstractC16208i iVar = this.f79103f;
        if (iVar != null) {
            iVar.onEvent(new C33300a(str, null));
        }
    }

    public AbstractFeedLynxView(ViewGroup viewGroup, AbstractC33252e eVar) {
        AbstractC1196i lifecycle;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(eVar, "");
        this.f79105h = viewGroup;
        this.f79106i = eVar;
        AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
        ActivityC0580d dVar = null;
        this.f79100c = (AbstractC33214c) (!(a instanceof AbstractC33214c) ? null : a);
        View inflate = View.inflate(viewGroup.getContext(), R.layout.af3, null);
        C89219l.m154716b(inflate, "");
        this.f79102e = inflate;
        if (inflate == null) {
            C89219l.m154710a("contentView");
        }
        View findViewById = inflate.findViewById(R.id.zl);
        C89219l.m154716b(findViewById, "");
        this.f79104g = (BulletContainerView) findViewById;
        viewGroup.removeAllViews();
        View view = this.f79102e;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        viewGroup.addView(view);
        Context context = viewGroup.getContext();
        ActivityC0580d dVar2 = context instanceof ActivityC0945e ? context : dVar;
        if (dVar2 != null && (lifecycle = dVar2.getLifecycle()) != null) {
            lifecycle.mo4012a(this);
        }
    }
}
