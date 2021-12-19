package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60189a;
import com.p2082ss.android.ugc.aweme.multi.EnumC60206g;
import com.p2082ss.android.ugc.aweme.multi.p3462ui.CommonAnchorItem;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.o */
public abstract class AbstractC60267o extends AbstractC60189a {

    /* renamed from: d */
    private final AbstractC89244h f137356d = C89250i.m154773a((AbstractC89171a) C60268a.f137360a);

    /* renamed from: e */
    private final boolean f137357e;

    /* renamed from: h */
    public AnchorCommonStruct f137358h;

    /* renamed from: i */
    public long f137359i = -1;

    static {
        Covode.recordClassIndex(70799);
    }

    /* renamed from: n */
    private final Keva mo97934n() {
        return (Keva) this.f137356d.getValue();
    }

    /* renamed from: b */
    public void mo97929b(AnchorCommonStruct anchorCommonStruct) {
        C89219l.m154721d(anchorCommonStruct, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: h */
    public String mo97896h() {
        return null;
    }

    /* renamed from: l */
    public String mo97925l() {
        return "webview";
    }

    /* renamed from: m */
    public boolean mo97926m() {
        return false;
    }

    /* renamed from: j */
    public boolean mo97922j() {
        return this.f137357e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.maker.o$a */
    public static final class C60268a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C60268a f137360a = new C60268a();

        static {
            Covode.recordClassIndex(70800);
        }

        C60268a() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("anchor_offline_record");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: f */
    public final boolean mo97894f() {
        if (this.f137358h == null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public int mo97924k() {
        return EnumC31359ab.NO_TYPE.getTYPE();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.maker.o$c */
    public static final class C60271c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC60267o f137367a;

        /* renamed from: b */
        final /* synthetic */ SmartImageView f137368b;

        static {
            Covode.recordClassIndex(70803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60271c(AbstractC60267o oVar, SmartImageView smartImageView) {
            super(0);
            this.f137367a = oVar;
            this.f137368b = smartImageView;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137367a.mo97945a(new AbstractC89172b<AnchorCommonStruct, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o.C60271c.C602721 */

                /* renamed from: a */
                final /* synthetic */ C60271c f137369a;

                static {
                    Covode.recordClassIndex(70804);
                }

                {
                    this.f137369a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
                    AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                    C89219l.m154721d(anchorCommonStruct2, "");
                    C20766v a = C20761r.m39060a(C34735v.m70965a(anchorCommonStruct2.getIcon()));
                    a.f49092E = this.f137369a.f137368b;
                    a.mo34186c();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: g */
    public String mo97895g() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
            return "";
        }
        return keyword;
    }

    /* renamed from: o */
    public final Aweme mo97949o() {
        return mo97864a().mo97883b();
    }

    /* renamed from: p */
    public final String mo97950p() {
        return mo97864a().mo97884c();
    }

    /* renamed from: q */
    public final String mo97951q() {
        return mo97864a().mo97885d();
    }

    /* renamed from: r */
    public final Activity mo97952r() {
        return mo97864a().mo97886e();
    }

    /* renamed from: s */
    public final JSONObject mo97953s() {
        return mo97864a().mo97887f();
    }

    /* renamed from: t */
    public final C33744d mo97954t() {
        C33744d dVar = new C33744d();
        String authorUid = mo97949o().getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        C33744d a = dVar.mo59983a("author_id", authorUid);
        String aid = mo97949o().getAid();
        if (aid == null) {
            aid = "";
        }
        C33744d a2 = a.mo59983a("group_id", aid).mo59983a("enter_from", mo97950p()).mo59983a("anchor_type", mo97872b().mo97901b()).mo59983a("anchor_name", mo97872b().mo97902c()).mo59983a("anchor_id", mo97872b().mo97899a()).mo59983a("music_id", C59208ac.m108770d(mo97949o()));
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.maker.o$b */
    public static final class C60269b extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC60267o f137361a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f137362b;

        /* renamed from: c */
        final /* synthetic */ C33744d f137363c;

        /* renamed from: d */
        final /* synthetic */ Dialog f137364d;

        static {
            Covode.recordClassIndex(70801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60269b(AbstractC60267o oVar, ViewGroup viewGroup, C33744d dVar, Dialog dialog) {
            super(1);
            this.f137361a = oVar;
            this.f137362b = viewGroup;
            this.f137363c = dVar;
            this.f137364d = dialog;
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.o$b$a */
        static final class View$OnClickListenerC60270a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C60269b f137365a;

            /* renamed from: b */
            final /* synthetic */ AnchorCommonStruct f137366b;

            static {
                Covode.recordClassIndex(70802);
            }

            View$OnClickListenerC60270a(C60269b bVar, AnchorCommonStruct anchorCommonStruct) {
                this.f137365a = bVar;
                this.f137366b = anchorCommonStruct;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f137365a.f137361a.mo97893d(this.f137365a.f137363c);
                if (this.f137365a.f137361a.mo97926m()) {
                    this.f137365a.f137364d.dismiss();
                }
            }
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            MethodCollector.m26663i(7431);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str = "";
            C89219l.m154721d(anchorCommonStruct2, str);
            Context context = this.f137362b.getContext();
            C89219l.m154716b(context, str);
            CommonAnchorItem a = CommonAnchorItem.C60293a.m109980a(context);
            UrlModel thumbnail = anchorCommonStruct2.getThumbnail();
            if (thumbnail != null) {
                a.setIcon(thumbnail);
            }
            String keyword = anchorCommonStruct2.getKeyword();
            if (keyword != null) {
                str = keyword;
            }
            a.setTitle(str);
            a.setSubTitle(anchorCommonStruct2.getDescription());
            a.setOnClickListener(new View$OnClickListenerC60270a(this, anchorCommonStruct2));
            this.f137362b.addView(a);
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7431);
            return zVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public void mo97889a(SmartImageView smartImageView) {
        C89219l.m154721d(smartImageView, "");
        mo97943a(smartImageView, new C60271c(this, smartImageView));
    }

    /* renamed from: b */
    public final void mo97947b(String str) {
        C89219l.m154721d(str, "");
        mo97934n().storeBoolean(str + '@' + mo97949o().getAid(), true);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: a */
    public EnumC60206g mo97888a(List<AnchorCommonStruct> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.getType() == mo97924k()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == 0) {
            return EnumC60206g.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) arrayList2.get(0);
        list.remove(anchorCommonStruct);
        mo97929b(anchorCommonStruct);
        mo97868a(anchorCommonStruct);
        this.f137358h = anchorCommonStruct;
        if (arrayList2.size() == 1) {
            return EnumC60206g.DONE;
        }
        return EnumC60206g.PROCEED;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: c */
    public void mo97892c(C33744d dVar) {
        String str = "";
        C89219l.m154721d(dVar, str);
        C89219l.m154721d(dVar, str);
        Aweme o = mo97949o();
        String p = mo97950p();
        C39162r.m79460a("multi_anchor_entrance_click", mo97948f(dVar));
        if (mo97922j()) {
            C33744d a = mo97954t().mo59983a("enter_method", mo97951q()).mo59983a("enter_from", p);
            String authorUid = o.getAuthorUid();
            if (authorUid == null) {
                authorUid = str;
            }
            C33744d a2 = a.mo59983a("author_id", authorUid);
            String aid = o.getAid();
            if (aid != null) {
                str = aid;
            }
            C39162r.m79460a("anchor_entrance_click", a2.mo59983a("group_id", str).mo59983a("music_id", C59208ac.m108770d(o)).f79943a);
        }
    }

    /* renamed from: f */
    public final Map<String, String> mo97948f(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        String c = mo97864a().mo97884c();
        Aweme b = mo97864a().mo97883b();
        C33744d a = dVar.mo59983a("enter_from", c);
        String authorUid = b.getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        C33744d a2 = a.mo59983a("author_id", authorUid);
        String aid = b.getAid();
        if (aid == null) {
            aid = "";
        }
        Map<String, String> map = a2.mo59983a("group_id", aid).mo59983a("music_id", C59208ac.m108770d(b)).f79943a;
        C89219l.m154716b(map, "");
        return map;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: b */
    public void mo97891b(C33744d dVar) {
        String str = "";
        C89219l.m154721d(dVar, str);
        String c = mo97864a().mo97884c();
        Aweme b = mo97864a().mo97883b();
        C33744d a = dVar.mo59983a("enter_method", mo97951q()).mo59983a("enter_from", c);
        String authorUid = b.getAuthorUid();
        if (authorUid == null) {
            authorUid = str;
        }
        C33744d a2 = a.mo59983a("author_id", authorUid).mo59983a("music_id", C59208ac.m108770d(b));
        String aid = b.getAid();
        if (aid == null) {
            aid = str;
        }
        C39162r.m79460a("multi_anchor_entrance_show", a2.mo59983a("group_id", aid).f79943a);
        if (mo97922j()) {
            String c2 = mo97864a().mo97884c();
            Aweme b2 = mo97864a().mo97883b();
            C33744d a3 = mo97954t().mo59983a("enter_from", c2);
            String authorUid2 = b2.getAuthorUid();
            if (authorUid2 == null) {
                authorUid2 = str;
            }
            C33744d a4 = a3.mo59983a("author_id", authorUid2).mo59983a("music_id", C59208ac.m108770d(b2));
            String aid2 = b2.getAid();
            if (aid2 != null) {
                str = aid2;
            }
            C39162r.m79460a("anchor_entrance_show", a4.mo59983a("group_id", str).f79943a);
        }
    }

    /* renamed from: a */
    public final void mo97945a(AbstractC89172b<? super AnchorCommonStruct, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            bVar.invoke(anchorCommonStruct);
        }
    }

    /* renamed from: a */
    public final boolean mo97946a(String str) {
        C89219l.m154721d(str, "");
        return mo97934n().getBoolean(str + '@' + mo97949o().getAid(), false);
    }

    /* renamed from: a */
    protected static C33744d m109920a(C33744d dVar, JSONObject jSONObject) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next, "");
            if (C80538hl.m139614a(optString)) {
                dVar.mo59983a(next, optString);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo97943a(SmartImageView smartImageView, AbstractC89171a<C89391z> aVar) {
        UrlModel newStyleBubbleIcon;
        C89219l.m154721d(smartImageView, "");
        C89219l.m154721d(aVar, "");
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct == null || (newStyleBubbleIcon = anchorCommonStruct.getNewStyleBubbleIcon()) == null || !this.f137204b) {
            aVar.invoke();
            return;
        }
        C20766v a = C20761r.m39060a(C34735v.m70965a(newStyleBubbleIcon));
        a.f49092E = smartImageView;
        a.mo34186c();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: b */
    public void mo97890b(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        mo97945a(new C60269b(this, viewGroup, dVar, dialog));
    }

    /* renamed from: a */
    public final void mo97944a(C33744d dVar, boolean z, boolean z2) {
        String str;
        String str2 = "";
        C89219l.m154721d(dVar, str2);
        String c = mo97864a().mo97884c();
        Aweme b = mo97864a().mo97883b();
        String str3 = null;
        if (z) {
            C33744d a = new C33744d().mo59983a("enter_method", mo97951q()).mo59985a(new HashMap<>(dVar.f79943a)).mo59983a("enter_from", c);
            AnchorCommonStruct anchorCommonStruct = this.f137358h;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getKeyword();
            } else {
                str = null;
            }
            C33744d a2 = a.mo59983a("anchor_entry", str);
            String authorUid = b.getAuthorUid();
            if (authorUid == null) {
                authorUid = str2;
            }
            C33744d a3 = a2.mo59983a("author_id", authorUid);
            String aid = b.getAid();
            if (aid == null) {
                aid = str2;
            }
            C39162r.m79460a("enter_multi_anchor_detail", a3.mo59983a("group_id", aid).mo59983a("click_type", mo97925l()).mo59983a("music_id", C59208ac.m108770d(b)).f79943a);
        }
        if (mo97922j() && z && z2) {
            String c2 = mo97864a().mo97884c();
            Aweme b2 = mo97864a().mo97883b();
            C33744d a4 = mo97954t().mo59983a("enter_from", c2);
            AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
            if (anchorCommonStruct2 != null) {
                str3 = anchorCommonStruct2.getKeyword();
            }
            C33744d a5 = a4.mo59983a("anchor_entry", str3);
            String authorUid2 = b2.getAuthorUid();
            if (authorUid2 == null) {
                authorUid2 = str2;
            }
            C33744d a6 = a5.mo59983a("author_id", authorUid2);
            String aid2 = b2.getAid();
            if (aid2 != null) {
                str2 = aid2;
            }
            C39162r.m79460a("enter_anchor_detail", a6.mo59983a("group_id", str2).mo59983a("music_id", C59208ac.m108770d(b2)).f79943a);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m109921a(AbstractC60267o oVar, C33744d dVar, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        oVar.mo97944a(dVar, z, z2);
    }
}
