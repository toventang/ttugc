package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60106a;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60108c;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60113g;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.q */
public final class C60157q {

    /* renamed from: g */
    public static final C60158a f137131g = new C60158a((byte) 0);

    /* renamed from: a */
    public String f137132a;

    /* renamed from: b */
    public String f137133b = "#A5E6FF";

    /* renamed from: c */
    public final HashMap<String, AbstractC60154n> f137134c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C60148j> f137135d = new HashMap<>();

    /* renamed from: e */
    public UrlModel f137136e;

    /* renamed from: f */
    public UrlModel f137137f;

    static {
        Covode.recordClassIndex(70684);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.q$a */
    public static final class C60158a {
        static {
            Covode.recordClassIndex(70685);
        }

        private C60158a() {
        }

        public /* synthetic */ C60158a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C60157q m109647a(C60107b bVar, HashMap<String, AbstractC60142d> hashMap) {
            AbstractC60142d dVar;
            String info;
            C60148j jVar;
            C60152l lVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(hashMap, "");
            C60157q qVar = new C60157q();
            String navi_id = bVar.getNavi_id();
            if (navi_id != null) {
                qVar.f137132a = navi_id;
            }
            qVar.mo97832a(bVar.getBackground_color());
            List<C60113g> staticImage = bVar.getStaticImage();
            if (staticImage != null && (!staticImage.isEmpty())) {
                qVar.f137136e = staticImage.get(0).getThumbnailUrl();
            }
            List<C60106a> animationList = bVar.getAnimationList();
            if (animationList != null && (!animationList.isEmpty())) {
                qVar.f137137f = animationList.get(0).getUrl();
            }
            List<C60108c> features = bVar.getFeatures();
            if (features != null) {
                for (C60108c cVar : features) {
                    String category = cVar.getCategory();
                    if (!(category == null || (dVar = hashMap.get(category)) == null || (info = cVar.getInfo()) == null)) {
                        try {
                            AbstractC28019l a = C28024q.m56139a(info);
                            C89219l.m154716b(a, "");
                            C28022o j = a.mo46789j();
                            if (j.mo46802b("sticker_id")) {
                                AbstractC28019l c = j.mo46803c("sticker_id");
                                C89219l.m154716b(c, "");
                                String c2 = c.mo46689c();
                                Iterator<AbstractC60154n> it = dVar.mo97819e().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    AbstractC60154n next = it.next();
                                    if (C89219l.m154714a((Object) next.mo97825a(), (Object) c2)) {
                                        String h = dVar.mo97822h();
                                        if (h == null || h.length() == 0) {
                                            qVar.f137134c.put(dVar.mo97815a(), next);
                                        } else {
                                            HashMap<String, AbstractC60154n> hashMap2 = qVar.f137134c;
                                            String h2 = dVar.mo97822h();
                                            if (h2 == null) {
                                                C89219l.m154715b();
                                            }
                                            hashMap2.put(h2, next);
                                        }
                                    }
                                }
                            } else if (j.mo46802b("inspiration_key")) {
                                String lVar2 = j.mo46803c("inspiration_key").toString();
                                C89219l.m154716b(lVar2, "");
                                if (dVar.mo97821g().containsKey(lVar2) && (jVar = dVar.mo97821g().get(lVar2)) != null) {
                                    String h3 = dVar.mo97822h();
                                    if (h3 == null || h3.length() == 0) {
                                        qVar.f137135d.put(dVar.mo97815a(), jVar);
                                    } else {
                                        HashMap<String, C60148j> hashMap3 = qVar.f137135d;
                                        String h4 = dVar.mo97822h();
                                        if (h4 == null) {
                                            C89219l.m154715b();
                                        }
                                        hashMap3.put(h4, jVar);
                                    }
                                }
                            }
                            C89219l.m154716b(dVar, "");
                            C89219l.m154716b(j, "");
                            if (j.mo46802b("color_picker")) {
                                AbstractC28019l c3 = j.mo46803c("color_picker");
                                C89219l.m154716b(c3, "");
                                C28022o j2 = c3.mo46789j();
                                C89219l.m154716b(j2, "");
                                if (j2.mo46802b("key")) {
                                    AbstractC28019l c4 = j2.mo46803c("key");
                                    C89219l.m154716b(c4, "");
                                    String c5 = c4.mo46689c();
                                    C60145g i = dVar.mo97823i();
                                    if (i != null) {
                                        Iterator<C60143e> it2 = i.f137090a.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            C60143e next2 = it2.next();
                                            if (C89219l.m154714a((Object) next2.f137087c, (Object) c5)) {
                                                i.f137091b = next2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (j.mo46802b("flip")) {
                                AbstractC28019l c6 = j.mo46803c("flip");
                                C89219l.m154716b(c6, "");
                                C28022o j3 = c6.mo46789j();
                                C89219l.m154716b(j3, "");
                                if (j3.mo46802b("key")) {
                                    AbstractC28019l c7 = j3.mo46803c("key");
                                    C89219l.m154716b(c7, "");
                                    String c8 = c7.mo46689c();
                                    C60146h j4 = dVar.mo97824j();
                                    if (j4 != null && C89219l.m154714a((Object) j4.f137094c, (Object) c8) && j3.mo46802b("value")) {
                                        AbstractC28019l c9 = j3.mo46803c("value");
                                        C89219l.m154716b(c9, "");
                                        j4.f137093b = c9.mo46694g();
                                    }
                                }
                            }
                            if (j.mo46802b("sliders")) {
                                AbstractC28019l c10 = j.mo46803c("sliders");
                                C89219l.m154716b(c10, "");
                                C27919i k = c10.mo46790k();
                                C89219l.m154716b(k, "");
                                Iterator<AbstractC28019l> it3 = k.iterator();
                                while (it3.hasNext()) {
                                    AbstractC28019l next3 = it3.next();
                                    if ((next3 instanceof C28022o) && ((C28022o) next3).mo46802b("key") && ((C28022o) next3).mo46802b("value")) {
                                        AbstractC28019l c11 = ((C28022o) next3).mo46803c("key");
                                        C89219l.m154716b(c11, "");
                                        String c12 = c11.mo46689c();
                                        AbstractC28019l c13 = ((C28022o) next3).mo46803c("value");
                                        C89219l.m154716b(c13, "");
                                        int g = c13.mo46694g();
                                        if (dVar.mo97820f().containsKey(c12) && (lVar = dVar.mo97820f().get(c12)) != null) {
                                            lVar.f137115a = g;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e) {
                            if (e.getMessage() != null) {
                                Integer.valueOf(0);
                            }
                        } catch (C28027t e2) {
                            if (e2.getMessage() != null) {
                                Integer.valueOf(0);
                            }
                        } catch (IllegalStateException e3) {
                            if (e3.getMessage() != null) {
                                Integer.valueOf(0);
                            }
                        }
                    }
                }
            }
            return qVar;
        }
    }

    /* renamed from: b */
    private final List<C60108c> m109642b() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC60154n nVar : this.f137134c.values()) {
            String a = nVar.mo97827c().mo97815a();
            C89219l.m154716b(nVar, "");
            arrayList.add(new C60108c(a, m109641a(nVar)));
        }
        for (C60148j jVar : this.f137135d.values()) {
            String a2 = jVar.f137100b.mo97815a();
            C89219l.m154716b(jVar, "");
            arrayList.add(new C60108c(a2, m109641a(jVar)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C60107b mo97831a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = this.f137132a;
        String e = C80064f.f179418d.mo123521e();
        String str2 = this.f137133b;
        UrlModel urlModel = this.f137137f;
        if (urlModel != null) {
            arrayList = new ArrayList();
            arrayList.add(new C60106a("anim_1", urlModel));
        } else {
            arrayList = null;
        }
        List<C60108c> b = m109642b();
        if (this.f137136e != null) {
            arrayList2 = new ArrayList();
            arrayList2.add(new C60113g("webp", null, this.f137136e));
        } else {
            arrayList2 = null;
        }
        return new C60107b(str, e, str2, arrayList, b, arrayList2);
    }

    /* renamed from: a */
    public final void mo97832a(String str) {
        C89219l.m154721d(str, "");
        this.f137133b = str;
    }

    /* renamed from: b */
    public final AbstractC60154n mo97833b(String str) {
        C89219l.m154721d(str, "");
        if (this.f137134c.containsKey(str)) {
            return this.f137134c.get(str);
        }
        return null;
    }

    /* renamed from: c */
    public final C60148j mo97834c(String str) {
        C89219l.m154721d(str, "");
        if (this.f137135d.containsKey(str)) {
            return this.f137135d.get(str);
        }
        return null;
    }

    /* renamed from: a */
    private static String m109641a(AbstractC60160s sVar) {
        C60143e eVar;
        C28022o oVar = new C28022o();
        if (sVar instanceof AbstractC60154n) {
            oVar.mo46801a("sticker_id", sVar.mo97825a());
        } else {
            oVar.mo46801a("inspiration_key", sVar.mo97825a());
        }
        AbstractC60142d c = sVar.mo97827c();
        C60145g i = c.mo97823i();
        if (!(i == null || (eVar = i.f137091b) == null)) {
            C28022o oVar2 = new C28022o();
            oVar2.mo46801a("key", eVar.f137087c);
            oVar.mo46797a("color_picker", oVar2);
        }
        C60146h j = c.mo97824j();
        if (j != null) {
            C28022o oVar3 = new C28022o();
            oVar3.mo46801a("key", j.f137094c);
            oVar3.mo46800a("value", Integer.valueOf(j.f137093b));
            oVar.mo46797a("flip", oVar3);
        }
        HashMap<String, C60152l> f = c.mo97820f();
        C27919i iVar = new C27919i();
        for (C60152l lVar : f.values()) {
            C28022o oVar4 = new C28022o();
            oVar4.mo46801a("slider_key", lVar.f137116b);
            oVar4.mo46800a("value", Integer.valueOf(lVar.f137115a));
            iVar.mo46686a(oVar4);
        }
        oVar.mo46797a("sliders", iVar);
        String oVar5 = oVar.toString();
        C89219l.m154716b(oVar5, "");
        return oVar5;
    }
}
