package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.p2019b.C27895a;
import com.lynx.tasm.EnumC28856r;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.q */
public final class C60280q extends AbstractC60267o {

    /* renamed from: d */
    public static final C60281a f137383d = new C60281a((byte) 0);

    /* renamed from: e */
    private boolean f137384e;

    static {
        Covode.recordClassIndex(70812);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.q$a */
    public static final class C60281a {
        static {
            Covode.recordClassIndex(70813);
        }

        private C60281a() {
        }

        public /* synthetic */ C60281a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.q$b */
    public static final class C60282b extends C27895a<List<? extends String>> {
        static {
            Covode.recordClassIndex(70814);
        }

        C60282b() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60280q();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.TTCM.getTYPE();
    }

    /* renamed from: n */
    private final void m109959n() {
        String str;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        AbstractC28019l a = C28024q.m56139a(str);
        C89219l.m154716b(a, "");
        C28022o j = a.mo46789j();
        AdLandPagePreloadServiceImpl.m68380f().mo59376a().mo59418c((List) new C27910f().mo46668a(j.mo46803c("gecko_channel"), new C60282b().type));
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        this.f137384e = true;
        dVar.mo59983a("is_ad_signal", mo97872b().mo97900a("is_ad_signal"));
        m109959n();
        super.mo97891b(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        dVar.mo59983a("is_ad_signal", mo97872b().mo97900a("is_ad_signal"));
        super.mo97892c(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        String schema;
        String str;
        C89219l.m154721d(dVar, "");
        dVar.mo59983a("is_ad_signal", mo97872b().mo97900a("is_ad_signal"));
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
            Bundle bundle = new Bundle();
            Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
            AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
            if (anchorCommonStruct2 != null) {
                str = anchorCommonStruct2.getExtra();
            } else {
                str = null;
            }
            repo.storeString("anchor_extra", str);
            repo.storeString("group_id", mo97949o().getGroupId());
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            bundle.putBoolean("need_bottom_out", true);
            Uri parse = Uri.parse(schema);
            C89219l.m154716b(parse, "");
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", EnumC28856r.PART_ON_LAYOUT.mo49985id());
                }
            }
            Uri.Builder buildUpon = parse.buildUpon();
            C28022o oVar = new C28022o();
            oVar.mo46801a("sourcePage", "ttcm_app");
            oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(mo97952r()) ? 1 : 0));
            oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
            buildUpon.appendQueryParameter("lynx_landing_page_data", oVar.toString());
            buildUpon.appendQueryParameter("sourcePage", "ttcm_app");
            Activity r = mo97952r();
            String builder = buildUpon.toString();
            C89219l.m154716b(builder, "");
            C34963b.m71413a(r, builder, null, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97871a(C60202d dVar, AbstractC34673c cVar, AbstractC33504a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        if (!this.f137384e) {
            m109959n();
        }
    }
}
