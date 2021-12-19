package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.p3462ui.CommonAnchorItem;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.e */
public final class C60231e extends AbstractC60267o {
    static {
        Covode.recordClassIndex(70763);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "app_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60231e();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.INDIA_MOVIE.getTYPE();
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.e$c */
    static final class C60234c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60231e f137289a;

        /* renamed from: b */
        final /* synthetic */ SmartImageView f137290b;

        static {
            Covode.recordClassIndex(70766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60234c(C60231e eVar, SmartImageView smartImageView) {
            super(0);
            this.f137289a = eVar;
            this.f137290b = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            UrlModel icon;
            String str;
            AnchorCommonStruct anchorCommonStruct = this.f137289a.f137358h;
            if (anchorCommonStruct == null || (icon = anchorCommonStruct.getIcon()) == null) {
                this.f137290b.setImageResource(2131232152);
            } else {
                List<String> urlList = icon.getUrlList();
                if (urlList == null || (str = urlList.get(0)) == null) {
                    str = "";
                }
                C20766v a = C20761r.m39061a(str);
                a.f49093F = this.f137290b;
                a.mo34186c();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.e$a */
    static final class View$OnClickListenerC60232a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnchorCommonStruct f137284a;

        /* renamed from: b */
        final /* synthetic */ C60231e f137285b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f137286c;

        /* renamed from: d */
        final /* synthetic */ C33744d f137287d;

        static {
            Covode.recordClassIndex(70764);
        }

        View$OnClickListenerC60232a(AnchorCommonStruct anchorCommonStruct, C60231e eVar, ViewGroup viewGroup, C33744d dVar) {
            this.f137284a = anchorCommonStruct;
            this.f137285b = eVar;
            this.f137286c = viewGroup;
            this.f137287d = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137285b.mo97893d(this.f137287d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final void mo97889a(SmartImageView smartImageView) {
        C89219l.m154721d(smartImageView, "");
        mo97943a(smartImageView, new C60234c(this, smartImageView));
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97929b(AnchorCommonStruct anchorCommonStruct) {
        C89219l.m154721d(anchorCommonStruct, "");
        mo97945a(C60233b.f137288a);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.e$b */
    static final class C60233b extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        public static final C60233b f137288a = new C60233b();

        static {
            Covode.recordClassIndex(70765);
        }

        C60233b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            C89219l.m154721d(anchorCommonStruct2, "");
            C59320c cVar = C59320c.C59324a.f135560a;
            C89219l.m154716b(cVar, "");
            cVar.mo96989a().preloadMiniApp(anchorCommonStruct2.getSchema());
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            C59320c cVar = C59320c.C59324a.f135560a;
            C89219l.m154716b(cVar, "");
            IMiniAppService a = cVar.mo96989a();
            Activity e = mo97864a().mo97886e();
            String url = anchorCommonStruct.getUrl();
            C59315a.C59316a aVar = new C59315a.C59316a();
            aVar.f135536b = mo97864a().mo97884c();
            a.openMiniApp(e, url, aVar.mo96936a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97890b(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        MethodCollector.m26663i(8810);
        String str = "";
        C89219l.m154721d(viewGroup, str);
        C89219l.m154721d(dialog, str);
        C89219l.m154721d(dVar, str);
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, str);
            CommonAnchorItem a = CommonAnchorItem.C60293a.m109980a(context);
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null) {
                a.setIcon(thumbnail);
            } else {
                a.setIconRes(2131232152);
            }
            String keyword = anchorCommonStruct.getKeyword();
            if (keyword != null) {
                str = keyword;
            }
            a.setTitle(str);
            a.setSubTitle(anchorCommonStruct.getDescription());
            a.setOnClickListener(new View$OnClickListenerC60232a(anchorCommonStruct, this, viewGroup, dVar));
            viewGroup.addView(a);
            MethodCollector.m26664o(8810);
            return;
        }
        MethodCollector.m26664o(8810);
    }
}
