package com.p2082ss.android.ugc.aweme.prop.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.cukaie.closet.internal.C14416d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.model.p3458a.C60104a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.prop.C65241a;
import com.p2082ss.android.ugc.aweme.prop.ReuseStickerUpdateSP;
import com.p2082ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity;
import com.p2082ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.p2082ss.android.ugc.aweme.prop.p3607c.C65309a;
import com.p2082ss.android.ugc.aweme.prop.p3607c.C65311c;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.sticker.model.C75446h;
import com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl */
public final class PropReuseServiceImpl implements IPropReuseService {

    /* renamed from: a */
    private final AbstractC89244h f147439a = C89250i.m154773a((AbstractC89171a) C65326d.f147449a);

    static {
        Covode.recordClassIndex(76802);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: b */
    public final Class<? extends Activity> mo104486b() {
        return StickerPropDetailActicity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final AbstractC39100a<Aweme, ?> mo104477a() {
        return new C65311c();
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl$d */
    static final class C65326d extends AbstractC89220m implements AbstractC89171a<StickerPropApi> {

        /* renamed from: a */
        public static final C65326d f147449a = new C65326d();

        static {
            Covode.recordClassIndex(76806);
        }

        C65326d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StickerPropApi invoke() {
            return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(StickerPropApi.class);
        }
    }

    /* renamed from: c */
    public static IPropReuseService m116994c() {
        MethodCollector.m26663i(7799);
        Object a = C81908b.m141854a(IPropReuseService.class, false);
        if (a != null) {
            IPropReuseService iPropReuseService = (IPropReuseService) a;
            MethodCollector.m26664o(7799);
            return iPropReuseService;
        }
        if (C81908b.f183330da == null) {
            synchronized (IPropReuseService.class) {
                try {
                    if (C81908b.f183330da == null) {
                        C81908b.f183330da = new PropReuseServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7799);
                    throw th;
                }
            }
        }
        PropReuseServiceImpl propReuseServiceImpl = (PropReuseServiceImpl) C81908b.f183330da;
        MethodCollector.m26664o(7799);
        return propReuseServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final C75446h mo104479a(String str) {
        C89219l.m154721d(str, "");
        C75446h hVar = ((StickerPropApi) this.f147439a.getValue()).getStickerDetail(str).get();
        C89219l.m154716b(hVar, "");
        return hVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final String mo104480a(Context context) {
        C89219l.m154721d(context, "");
        ReuseStickerUpdateSP reuseStickerUpdateSP = (ReuseStickerUpdateSP) new C14401a(new C14416d()).mo23215a(context, ReuseStickerUpdateSP.class);
        String c = reuseStickerUpdateSP.mo104405c();
        Long valueOf = Long.valueOf(reuseStickerUpdateSP.mo104404b());
        int a = reuseStickerUpdateSP.mo104403a();
        if (TextUtils.isEmpty(c) || valueOf.longValue() == 0 || a == 0 || System.currentTimeMillis() - valueOf.longValue() >= 86400000 || C17867d.m33084e() <= ((long) a)) {
            c = "";
        }
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final boolean mo104485a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (aweme.getStickerEntranceInfo() == null || TextUtils.isEmpty(aweme.getStickerEntranceInfo().name)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final AbstractC41262aa mo104478a(AbstractC39100a<?, ?> aVar, C49812b bVar) {
        C89219l.m154721d(bVar, "");
        return new C65309a(aVar, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl$a */
    public static final class C65323a implements AbstractC78597a {

        /* renamed from: a */
        final /* synthetic */ String f147440a;

        /* renamed from: b */
        final /* synthetic */ String f147441b;

        /* renamed from: c */
        final /* synthetic */ String f147442c;

        static {
            Covode.recordClassIndex(76803);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a
        public final void onIntercept(String str, Effect effect) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(effect, "");
            C39162r.m79460a("shoot", new C33744d().mo59983a("shoot_way", "profile_prop").mo59983a("shoot_entrance", "profile_prop").mo59983a("enter_from", this.f147440a).mo59983a("prop_id", effect.getEffectId()).mo59983a("creation_id", str).mo59983a("author_id", this.f147441b).mo59983a("group_id", this.f147442c).f79943a);
        }

        C65323a(String str, String str2, String str3) {
            this.f147440a = str;
            this.f147441b = str2;
            this.f147442c = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl$b */
    public static final class C65324b implements AbstractC78597a {

        /* renamed from: a */
        final /* synthetic */ String f147443a;

        /* renamed from: b */
        final /* synthetic */ String f147444b;

        /* renamed from: c */
        final /* synthetic */ String f147445c;

        static {
            Covode.recordClassIndex(76804);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a
        public final void onIntercept(String str, Effect effect) {
            String str2 = "";
            C89219l.m154721d(str, str2);
            C89219l.m154721d(effect, str2);
            C33744d a = new C33744d().mo59983a("enter_method", this.f147443a).mo59983a("prop_id", effect.getEffectId());
            if (!TextUtils.isEmpty(this.f147444b)) {
                str2 = C89361p.m154915b(this.f147444b, new String[]{","}).get(0);
            }
            C39162r.m79460a("shoot", a.mo59983a("giphy_id", str2).mo59983a("group_id", this.f147445c).mo59983a("creation_id", str).mo59983a("enter_from", "prop_page").mo59983a("shoot_way", "prop_page").f79943a);
        }

        C65324b(String str, String str2, String str3) {
            this.f147443a = str;
            this.f147444b = str2;
            this.f147445c = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl$c */
    public static final class C65325c implements AbstractC78597a {

        /* renamed from: a */
        final /* synthetic */ String f147446a;

        /* renamed from: b */
        final /* synthetic */ String f147447b;

        /* renamed from: c */
        final /* synthetic */ String f147448c;

        static {
            Covode.recordClassIndex(76805);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a
        public final void onIntercept(String str, Effect effect) {
            String str2 = "";
            C89219l.m154721d(str, str2);
            C89219l.m154721d(effect, str2);
            C33744d a = new C33744d().mo59983a("enter_method", "toolstip_click").mo59983a("prop_id", this.f147446a).mo59983a("group_id", this.f147447b).mo59983a("creation_id", str).mo59983a("enter_from", "prop_page").mo59983a("shoot_way", "reuse_giphy_gif");
            if (!TextUtils.isEmpty(this.f147448c)) {
                str2 = C89361p.m154915b(this.f147448c, new String[]{","}).get(0);
            }
            C39162r.m79460a("shoot", a.mo59983a("giphy_id", str2).f79943a);
        }

        C65325c(String str, String str2, String str3) {
            this.f147446a = str;
            this.f147447b = str2;
            this.f147448c = str3;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final void mo104484a(Context context, List<String> list, C60104a aVar, boolean z) {
        C65241a aVar2;
        int i;
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar, "");
        String str = aVar.f136977b;
        if (str == null || str.length() == 0) {
            aVar2 = new C65241a(context);
        } else {
            aVar2 = new C65241a(context, aVar.f136977b);
        }
        String str2 = aVar.f136976a;
        if (!(str2 == null || str2.length() == 0)) {
            aVar2.f147213k = aVar.f136976a;
        }
        if (aVar.f136986k) {
            aVar2.f147226x = aVar.f136986k;
        }
        aVar2.f147213k = aVar.f136976a;
        aVar2.f147217o = aVar.f136981f;
        if (aVar.f136978c != null) {
            Music music = aVar.f136978c;
            if (music == null) {
                C89219l.m154715b();
            }
            aVar2.mo104408a(music);
        }
        aVar2.f147206d = aVar.f136987l;
        aVar2.f147215m = aVar.f136979d;
        aVar2.f147219q = aVar.f136989n;
        aVar2.f147220r = aVar.f136990o;
        aVar2.f147223u = aVar.f136984i;
        aVar2.f147222t = aVar.f136983h;
        Integer num = aVar.f136988m;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        aVar2.f147193C = i;
        aVar2.f147224v = aVar.f136985j;
        aVar2.f147226x = !z;
        aVar2.mo104412a(z, new ArrayList<>(list), aVar.f136982g, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final void mo104483a(Context context, Aweme aweme, String str, String str2, String str3, String str4, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C65241a aVar = new C65241a(context, "reuse_giphy_gif");
        aVar.f147215m = "prop_auto";
        aVar.f147206d = str2;
        aVar.f147217o = str3;
        aVar.f147219q = new C65325c(str, str4, str2);
        aVar.mo104411a(C89070n.m154525d(str), "homepage_feed", "reuse", false, i, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final void mo104481a(Activity activity, ArrayList<C75445g> arrayList, Music music, String str, String str2, String str3, int i) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(str, "");
        if (arrayList.isEmpty() || CommerceStickerServiceImpl.m75788c().mo65425b().mo65427a(activity, arrayList.get(0), "prop_collection")) {
            return;
        }
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().needLoginBeforeRecord()) {
            C58957c.m108320a(activity, "prop_page", "prop_reuse_icon", (Bundle) null, (AbstractC34543f) null);
            return;
        }
        C65241a aVar = new C65241a(activity, "profile_prop");
        aVar.f147215m = "prop_auto";
        aVar.f147217o = str;
        aVar.f147219q = new C65323a(str, str2, str3);
        if (music != null && (music instanceof Music)) {
            aVar.mo104408a(music);
        }
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().f169545id);
        }
        aVar.mo104411a(new ArrayList<>(arrayList2), "profile_prop", "reuse", false, i, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService
    /* renamed from: a */
    public final void mo104482a(Activity activity, ArrayList<C75445g> arrayList, String str, Music music, String str2, String str3, int i, boolean z) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (arrayList.isEmpty() || CommerceStickerServiceImpl.m75788c().mo65425b().mo65427a(activity, arrayList.get(0), "prop_page")) {
            return;
        }
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().needLoginBeforeRecord()) {
            C58957c.m108320a(activity, "prop_page", "prop_reuse_icon", (Bundle) null, (AbstractC34543f) null);
            return;
        }
        C65241a aVar = new C65241a(activity, "prop_page");
        aVar.f147215m = "prop_auto";
        aVar.f147206d = str;
        aVar.f147217o = str2;
        aVar.f147219q = new C65324b("prop_feed", str, str3);
        if (music != null) {
            aVar.mo104408a(music);
        }
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().f169545id);
        }
        aVar.mo104411a(new ArrayList<>(arrayList2), "prop_page", "reuse", false, i, z);
    }
}
