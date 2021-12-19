package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18119c;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18121d;
import com.bytedance.ies.ugc.aweme.plugin.p1266b.EnumC18124b;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60200b;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.EnumC60206g;
import com.p2082ss.android.ugc.aweme.multi.p3462ui.CommonAnchorItem;
import com.p2082ss.android.ugc.aweme.poi_api.p3560a.C63129a;
import com.p2082ss.android.ugc.aweme.poi_api.service.AbstractC63132a;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.i */
public final class C60245i extends AbstractC60267o {

    /* renamed from: d */
    public final AbstractC63132a f137309d;

    /* renamed from: e */
    public final String f137310e;

    /* renamed from: f */
    private final C63134c f137311f;

    static {
        Covode.recordClassIndex(70777);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60245i();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.POI.getTYPE();
    }

    /* renamed from: n */
    private final String m109840n() {
        String q = mo97951q();
        if (!C80538hl.m139614a(q) || q == null) {
            return this.f137310e;
        }
        return q;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: h */
    public final String mo97896h() {
        AbstractC63132a aVar = this.f137309d;
        if (aVar != null) {
            return aVar.mo101477b();
        }
        return null;
    }

    public C60245i() {
        AbstractC63132a aVar;
        IPoiService a;
        C63134c cVar = C63134c.f143478d;
        this.f137311f = cVar;
        if (cVar == null || (a = C63134c.m114157a()) == null) {
            aVar = null;
        } else {
            aVar = a.mo101450a();
        }
        this.f137309d = aVar;
        this.f137310e = "video_anchor";
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.i$a */
    static final class C60246a extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60245i f137312a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f137313b;

        /* renamed from: c */
        final /* synthetic */ C33744d f137314c;

        /* renamed from: d */
        final /* synthetic */ Dialog f137315d;

        static {
            Covode.recordClassIndex(70778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60246a(C60245i iVar, ViewGroup viewGroup, C33744d dVar, Dialog dialog) {
            super(1);
            this.f137312a = iVar;
            this.f137313b = viewGroup;
            this.f137314c = dVar;
            this.f137315d = dialog;
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.i$a$a */
        static final class View$OnClickListenerC60247a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C60246a f137316a;

            /* renamed from: b */
            final /* synthetic */ AnchorCommonStruct f137317b;

            static {
                Covode.recordClassIndex(70779);
            }

            View$OnClickListenerC60247a(C60246a aVar, AnchorCommonStruct anchorCommonStruct) {
                this.f137316a = aVar;
                this.f137317b = anchorCommonStruct;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f137316a.f137312a.mo97893d(this.f137316a.f137314c);
                if (this.f137316a.f137312a.mo97926m()) {
                    this.f137316a.f137315d.dismiss();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            MethodCollector.m26663i(7630);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str = "";
            C89219l.m154721d(anchorCommonStruct2, str);
            Context context = this.f137313b.getContext();
            C89219l.m154716b(context, str);
            CommonAnchorItem a = CommonAnchorItem.C60293a.m109980a(context);
            UrlModel thumbnail = anchorCommonStruct2.getThumbnail();
            if (thumbnail != null) {
                a.setIcon(thumbnail);
            }
            AbstractC63132a aVar = this.f137312a.f137309d;
            if (aVar != null) {
                Context context2 = a.getContext();
                C89219l.m154716b(context2, str);
                String a2 = aVar.mo101472a(context2);
                if (a2 != null) {
                    str = a2;
                }
            }
            a.setTitle(str);
            a.setSubTitle(anchorCommonStruct2.getDescription());
            a.setOnClickListener(new View$OnClickListenerC60247a(this, anchorCommonStruct2));
            this.f137313b.addView(a);
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7630);
            return zVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final EnumC60206g mo97888a(List<AnchorCommonStruct> list) {
        C89219l.m154721d(list, "");
        AbstractC63132a aVar = this.f137309d;
        if (aVar == null || !aVar.mo101476a()) {
            return EnumC60206g.NOT_FOUND;
        }
        return super.mo97888a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        AbstractC63132a aVar = this.f137309d;
        if (aVar != null) {
            aVar.mo101478b(mo97949o(), m109840n(), mo97950p());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97869a(AbstractC60200b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo97869a(bVar);
        AbstractC63132a aVar = this.f137309d;
        if (aVar != null) {
            aVar.mo101474a(bVar.mo97883b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        AbstractC63132a aVar = this.f137309d;
        if (aVar != null) {
            aVar.mo101475a(mo97949o(), m109840n(), mo97950p());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        AbstractC63132a aVar;
        IPoiService a;
        C89219l.m154721d(dVar, "");
        if (this.f137311f != null && C63134c.m114160b()) {
            if (this.f137311f == null || (a = C63134c.m114157a()) == null) {
                aVar = null;
            } else {
                aVar = a.mo101450a();
            }
            aVar.mo101473a(mo97864a().mo97886e(), mo97949o(), this.f137310e, mo97950p());
        } else if (this.f137311f != null) {
            Activity e = mo97864a().mo97886e();
            Aweme o = mo97949o();
            String str = this.f137310e;
            String p = mo97950p();
            C89219l.m154721d(e, "");
            C89219l.m154721d(o, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(p, "");
            C89219l.m154721d("VIDEO_ANCHOR", "");
            if (!C63134c.m114160b() && C63129a.m114087a().f143468a) {
                C18119c.C18120a aVar2 = new C18119c.C18120a();
                aVar2.f43150a = "com.ss.android.ugc.aweme.poi";
                aVar2.f43152c = false;
                aVar2.f43154e = C63134c.f143477c;
                C18115a.C18116a a2 = new C18115a.C18116a().mo28874a(0);
                a2.f43126a = false;
                a2.f43135j = C63134c.f143476b;
                a2.f43132g = EnumC18124b.REPLACE;
                aVar2.f43155f = a2.mo28875a();
                aVar2.f43153d = new C63134c.C63135a("VIDEO_ANCHOR", e, o, str, p);
                C18121d.C18122a aVar3 = new C18121d.C18122a();
                aVar3.f43168b = e.getString(R.string.cxw);
                aVar3.f43169c = e.getString(R.string.cxx);
                aVar2.f43157h = aVar3.mo28878a();
                C63134c.f143475a.mo28889a(aVar2.mo28877a());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97890b(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        mo97945a(new C60246a(this, viewGroup, dVar, dialog));
    }
}
