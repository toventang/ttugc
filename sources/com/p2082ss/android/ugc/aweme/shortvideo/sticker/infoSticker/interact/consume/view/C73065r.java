package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37624c;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.DialogC37628d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.C72937g;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75399b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.r */
public final class C73065r extends AbstractC72946a {

    /* renamed from: a */
    private final C72937g f163961a;

    /* renamed from: l */
    private final AbstractC89244h f163962l;

    /* renamed from: m */
    private DialogC37628d f163963m;

    static {
        Covode.recordClassIndex(85768);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 5;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.r$b */
    public static final class C73067b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73065r f163965a;

        static {
            Covode.recordClassIndex(85770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73067b(C73065r rVar) {
            super(0);
            this.f163965a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC75399b bVar;
            C75391j jVar = this.f163965a.f163697k;
            if (!(jVar == null || (bVar = jVar.f169462q) == null)) {
                bVar.mo80251a();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: a */
    public final View mo115223a() {
        return (FrameLayout) this.f163962l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.r$c */
    static final class C73068c extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ Context f163966a;

        static {
            Covode.recordClassIndex(85771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73068c(Context context) {
            super(0);
            this.f163966a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.m26663i(7477);
            FrameLayout frameLayout = new FrameLayout(this.f163966a);
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            MethodCollector.m26664o(7477);
            return frameLayout;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
        String str;
        String str2;
        String str3;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        LogPbBean logPbBean = new LogPbBean();
        C75391j jVar = this.f163697k;
        if (jVar == null || (str = jVar.f169457l) == null) {
            str = "";
        }
        logPbBean.setImprId(str);
        C33744d dVar = new C33744d();
        C75391j jVar2 = this.f163697k;
        String str4 = null;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f169427a;
        }
        C33744d a = dVar.mo59983a("enter_from", str2);
        C75391j jVar3 = this.f163697k;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f169429c;
        }
        C33744d a2 = a.mo59983a("group_id", str3);
        C75391j jVar4 = this.f163697k;
        if (!(jVar4 == null || (iVar = jVar4.f169463r) == null)) {
            str4 = iVar.f169428b;
        }
        C39162r.m79460a("sticker_click", a2.mo59983a("author_id", str4).mo59983a("sticker_type", "wiki").mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80054a(logPbBean)).f79943a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(6142);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f163695i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f163695i, null, 0, 6);
        tuxTextView.setTextColor(C0643b.m2378c(this.f163695i, R.color.a9));
        tuxTextView.setTuxFont(62);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f163695i.getString(R.string.ca9));
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f163695i);
        autoRTLImageView.setImageResource(R.drawable.b6n);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.m26664o(6142);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C75384i iVar;
        String str7;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C75384i iVar5;
        C75384i iVar6;
        C72937g gVar = this.f163961a;
        if (gVar.mo115330a() != null && !gVar.mo115330a().getAnchors().isEmpty()) {
            LogPbBean logPbBean = new LogPbBean();
            C75391j jVar = gVar.f163648f;
            String str8 = "";
            if (jVar == null || (str = jVar.f169457l) == null) {
                str = str8;
            }
            logPbBean.setImprId(str);
            C33744d dVar = new C33744d();
            C75391j jVar2 = gVar.f163648f;
            if (jVar2 == null || (iVar6 = jVar2.f169463r) == null || (str2 = iVar6.f169429c) == null) {
                str2 = str8;
            }
            C33744d a = dVar.mo59983a("group_id", str2);
            C75391j jVar3 = gVar.f163648f;
            if (jVar3 == null || (iVar5 = jVar3.f169463r) == null || (str3 = iVar5.f169428b) == null) {
                str3 = str8;
            }
            C33744d a2 = a.mo59983a("author_id", str3);
            C75391j jVar4 = gVar.f163648f;
            if (jVar4 == null || (iVar4 = jVar4.f169463r) == null || (str4 = iVar4.f169427a) == null) {
                str4 = str8;
            }
            C39162r.m79460a("sticker_toast_click", a2.mo59983a("enter_from", str4).mo59983a("sticker_type", "wiki").mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80054a(logPbBean)).f79943a);
            List<CreateAnchorInfo> anchors = gVar.mo115330a().getAnchors();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) anchors, 10));
            for (T t : anchors) {
                WikipediaInfo wikipediaInfo = new WikipediaInfo();
                wikipediaInfo.setKeyword(t.getKeyword());
                wikipediaInfo.setLang(t.getLanguage());
                wikipediaInfo.setExtra((WikipediaExtra) new C27910f().mo46670a(t.getContent(), WikipediaExtra.class));
                wikipediaInfo.setAnchorId(t.getThirdId());
                arrayList.add(wikipediaInfo);
            }
            List<WikipediaInfo> n = C89070n.m154594n(arrayList);
            if (n.size() == 1) {
                C37624c.m75876a(gVar.f163645c, n.get(0), gVar.mo115331b(), C89041ag.m154415a());
                C33744d dVar2 = new C33744d();
                C75391j jVar5 = gVar.f163648f;
                if (jVar5 == null || (iVar3 = jVar5.f169463r) == null || (str5 = iVar3.f169427a) == null) {
                    str5 = str8;
                }
                C33744d a3 = dVar2.mo59983a("enter_from", str5).mo59983a("language", n.get(0).getLang()).mo59983a("wiki_entry", n.get(0).getKeyword());
                C75391j jVar6 = gVar.f163648f;
                if (jVar6 == null || (iVar2 = jVar6.f169463r) == null || (str6 = iVar2.f169428b) == null) {
                    str6 = str8;
                }
                C33744d a4 = a3.mo59983a("author_id", str6);
                C75391j jVar7 = gVar.f163648f;
                if (!(jVar7 == null || (iVar = jVar7.f169463r) == null || (str7 = iVar.f169429c) == null)) {
                    str8 = str7;
                }
                C39162r.m79460a("enter_wiki_detail", a4.mo59983a("group_id", str8).f79943a);
            } else if (gVar.f163646d instanceof C73065r) {
                ((C73065r) gVar.f163646d).m128971a(n, gVar.mo115331b());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f163961a.mo115236a(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.r$a */
    public static final class C73066a extends AbstractC89220m implements AbstractC89172b<WikipediaInfo, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73065r f163964a;

        static {
            Covode.recordClassIndex(85769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73066a(C73065r rVar) {
            super(1);
            this.f163964a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(WikipediaInfo wikipediaInfo) {
            String str;
            String str2;
            C75384i iVar;
            String str3;
            C75384i iVar2;
            C75384i iVar3;
            WikipediaInfo wikipediaInfo2 = wikipediaInfo;
            String str4 = "";
            C89219l.m154721d(wikipediaInfo2, str4);
            C33744d dVar = new C33744d();
            C75391j jVar = this.f163964a.f163697k;
            if (jVar == null || (iVar3 = jVar.f169463r) == null || (str = iVar3.f169427a) == null) {
                str = str4;
            }
            C33744d a = dVar.mo59983a("enter_from", str).mo59983a("language", wikipediaInfo2.getLang()).mo59983a("wiki_entry", wikipediaInfo2.getKeyword());
            C75391j jVar2 = this.f163964a.f163697k;
            if (jVar2 == null || (iVar2 = jVar2.f169463r) == null || (str2 = iVar2.f169428b) == null) {
                str2 = str4;
            }
            C33744d a2 = a.mo59983a("author_id", str2);
            C75391j jVar3 = this.f163964a.f163697k;
            if (!(jVar3 == null || (iVar = jVar3.f169463r) == null || (str3 = iVar.f169429c) == null)) {
                str4 = str3;
            }
            C39162r.m79460a("enter_wiki_detail", a2.mo59983a("group_id", str4).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private void m128971a(List<WikipediaInfo> list, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        C75384i iVar;
        String str4;
        C75384i iVar2;
        C75384i iVar3;
        String str5 = "";
        C89219l.m154721d(list, str5);
        C89219l.m154721d(map, str5);
        if (this.f163963m == null) {
            this.f163963m = new DialogC37628d(this.f163695i, list, map, new C73066a(this), new C73067b(this));
        }
        DialogC37628d dVar = this.f163963m;
        if (dVar != null) {
            dVar.show();
        }
        StringBuilder sb = new StringBuilder(str5);
        StringBuilder sb2 = new StringBuilder(str5);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append("wiki,");
            sb2.append(C89219l.m154704a(it.next().getKeyword(), (Object) ","));
        }
        LogPbBean logPbBean = new LogPbBean();
        C75391j jVar = this.f163697k;
        if (jVar == null || (str = jVar.f169457l) == null) {
            str = str5;
        }
        logPbBean.setImprId(str);
        C33744d dVar2 = new C33744d();
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null || (str2 = iVar3.f169427a) == null) {
            str2 = str5;
        }
        C33744d a = dVar2.mo59983a("enter_from", str2);
        C75391j jVar3 = this.f163697k;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null || (str3 = iVar2.f169429c) == null) {
            str3 = str5;
        }
        C33744d a2 = a.mo59983a("group_id", str3).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80054a(logPbBean));
        C75391j jVar4 = this.f163697k;
        if (!(jVar4 == null || (iVar = jVar4.f169463r) == null || (str4 = iVar.f169428b) == null)) {
            str5 = str4;
        }
        C39162r.m79460a("anchor_multiple_show", a2.mo59983a("author_id", str5).mo59983a("sticker_type", "wiki").mo59983a("anchor_types", sb.toString()).mo59983a("anchor_names", sb2.toString()).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return this.f163961a.mo115224a(j, i, f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73065r(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(i, context, view, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163961a = new C72937g(context, this, interactStickerStruct, jVar);
        this.f163962l = C89250i.m154773a((AbstractC89171a) new C73068c(context));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f163961a.mo115225a(j, i, f, f2, bVar);
    }
}
