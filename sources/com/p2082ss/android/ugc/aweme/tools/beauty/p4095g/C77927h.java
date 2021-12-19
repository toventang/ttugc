package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import android.util.Log;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20375am;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautifyInfo;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautifyTag;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.C41101a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b.C41096a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b.C41097b;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b.C41099d;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77852b;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77876c;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77974h;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.data.BeautySyncData;
import com.p2082ss.android.ugc.aweme.tools.beauty.data.C77884a;
import com.p2082ss.android.ugc.aweme.tools.beauty.data.NoneComposer;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4092a.C77887a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77901a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4096h.C77976a;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.android.AbstractC89522b;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h */
public final class C77927h implements AbstractC77967m {

    /* renamed from: a */
    volatile List<BeautyCategory> f174818a = new ArrayList();

    /* renamed from: b */
    final C41099d<Boolean> f174819b = new C41099d<>();

    /* renamed from: c */
    C41099d<List<BeautyComposerInfo>> f174820c = new C41099d<>();

    /* renamed from: d */
    final C77971n<BeautyComposerInfo> f174821d = new C77971n<>();

    /* renamed from: e */
    C41099d<ComposerBeauty> f174822e;

    /* renamed from: f */
    C77903b f174823f;

    /* renamed from: g */
    C41099d<C0484a<String, Integer>> f174824g;

    /* renamed from: h */
    public AbstractC77967m.AbstractC77969b f174825h;

    /* renamed from: i */
    final C77965l f174826i;

    /* renamed from: j */
    public boolean f174827j;

    /* renamed from: k */
    EnumC77817a f174828k;

    /* renamed from: l */
    List<BeautyCategory> f174829l;

    /* renamed from: m */
    C41099d<List<BeautyComposerInfo>> f174830m;

    /* renamed from: n */
    public final C77933d f174831n;

    /* renamed from: o */
    public final AbstractC78055e f174832o;

    /* renamed from: p */
    final BeautyFilterConfig f174833p;

    /* renamed from: q */
    public C27910f f174834q;

    /* renamed from: r */
    private final C77958i f174835r = new C77958i();

    /* renamed from: s */
    private final C41099d<Boolean> f174836s = new C41099d<>();

    /* renamed from: t */
    private Map<String, C77971n<BeautyComposerInfo>> f174837t = new LinkedHashMap();

    /* renamed from: u */
    private final AbstractC89244h f174838u;

    /* renamed from: v */
    private C41099d<C77972o<ComposerBeauty>> f174839v;

    /* renamed from: w */
    private final AbstractC89244h f174840w;

    /* renamed from: x */
    private final C77973p f174841x;

    /* renamed from: y */
    private final AbstractC89516am f174842y;

    /* renamed from: z */
    private boolean f174843z;

    static {
        Covode.recordClassIndex(91016);
    }

    /* renamed from: v */
    private final AbstractC84398d m136095v() {
        return (AbstractC84398d) this.f174838u.getValue();
    }

    /* renamed from: w */
    private final C77923g m136096w() {
        return (C77923g) this.f174840w.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121586a(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final boolean mo121599a(BeautyCategory beautyCategory) {
        C89219l.m154721d(beautyCategory, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: k */
    public final void mo121624k(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: l */
    public final void mo121626l(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final List<BeautyCategory> mo121584a() {
        return this.f174818a;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: b */
    public final C41099d<Boolean> mo121600b() {
        return this.f174819b;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: c */
    public final C41099d<List<BeautyComposerInfo>> mo121605c() {
        return this.f174820c;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: d */
    public final C77971n<BeautyComposerInfo> mo121609d() {
        return this.f174821d;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: e */
    public final Map<String, C77971n<BeautyComposerInfo>> mo121611e() {
        return this.f174837t;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: f */
    public final C41099d<ComposerBeauty> mo121613f() {
        return this.f174822e;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: g */
    public final C77903b mo121615g() {
        return this.f174823f;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: h */
    public final C41099d<C0484a<String, Integer>> mo121617h() {
        return this.f174824g;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: i */
    public final C41099d<C77972o<ComposerBeauty>> mo121619i() {
        return this.f174839v;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: j */
    public final EnumC77817a mo121621j() {
        return this.f174828k;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: n */
    public final C41099d<List<BeautyComposerInfo>> mo121629n() {
        return this.f174830m;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: u */
    public final BeautyFilterConfig mo121637u() {
        return this.f174833p;
    }

    /* renamed from: a */
    public final void mo121594a(List<BeautyCategory> list) {
        EnumC77817a defaultGender;
        C89219l.m154721d(list, "");
        this.f174829l = list;
        String flag = this.f174833p.getDefaultGender().getFlag();
        C89219l.m154721d(flag, "");
        String string = C77901a.f174776a.getString("key_last_gender", flag);
        C89219l.m154716b(string, "");
        if (C89219l.m154714a((Object) string, (Object) EnumC77817a.FEMALE.getFlag())) {
            defaultGender = EnumC77817a.FEMALE;
        } else if (C89219l.m154714a((Object) string, (Object) EnumC77817a.MALE.getFlag())) {
            defaultGender = EnumC77817a.MALE;
        } else {
            defaultGender = this.f174833p.getDefaultGender();
        }
        AbstractC77967m.C77968a.m136228a(this, false, defaultGender, 1);
    }

    /* renamed from: a */
    public final void mo121596a(List<BeautyCategory> list, List<ComposerBeauty> list2) {
        T t;
        C77938i iVar = new C77938i(this, list2);
        for (T t2 : list) {
            T t3 = null;
            if (t2.getBeautyCategoryExtra().getExclusive()) {
                Iterator<T> it = t2.getBeautyList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getSelected()) {
                        t3 = next;
                        break;
                    }
                }
                T t4 = t3;
                if (t4 != null) {
                    iVar.mo121639a(t4);
                }
            } else {
                for (T t5 : t2.getBeautyList()) {
                    if (C77878d.m136001c(t5)) {
                        List<ComposerBeauty> childList = t5.getChildList();
                        if (childList != null) {
                            Iterator<T> it2 = childList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it2.next();
                                if (t.getSelected()) {
                                    break;
                                }
                            }
                            T t6 = t;
                            if (t6 != null) {
                                iVar.mo121639a(t6);
                            }
                        }
                    } else if (m136094p(t5)) {
                        iVar.mo121639a(t5);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo121595a(List<ComposerBeauty> list, C77971n<BeautyComposerInfo> nVar) {
        m136096w().mo121580a(list, new C77955w(this));
        boolean z = false;
        for (T t : list) {
            if (C89219l.m154714a((Object) t.getEffect().getEffectId(), (Object) "EFFECT_ID_TYPE_FILTER")) {
                nVar.add(new BeautyComposerInfo("EFFECT_ID_TYPE_FILTER", "", ""));
                if (!t.needFaceDetect()) {
                }
            } else {
                List<BeautyComposerInfo> b = mo121601b((ComposerBeauty) t);
                if ((!b.isEmpty()) && b != null) {
                    t.setAdd2Nodes(true);
                    nVar.addAll(b);
                    if (!t.needFaceDetect()) {
                    }
                }
            }
            z = true;
        }
        C41099d<C77972o<ComposerBeauty>> dVar = this.f174839v;
        C77972o oVar = new C77972o();
        if ((true ^ list.isEmpty()) && list != null) {
            for (T t2 : list) {
                if (t2 != null) {
                    oVar.add(t2);
                }
            }
        }
        C41097b.m82776a(dVar, oVar);
        this.f174832o.mo121653b(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121588a(ComposerBeauty composerBeauty, boolean z) {
        C89219l.m154721d(composerBeauty, "");
        if (C77878d.m135999b(composerBeauty) && !mo121612e(composerBeauty) && composerBeauty.getEnable()) {
            ComposerBeauty b = C77878d.m135998b(composerBeauty, this.f174818a);
            if (b != null) {
                b.setShowDot(!z);
            }
        } else if (C77878d.m136002d(composerBeauty) || mo121612e(composerBeauty) || !composerBeauty.getEnable()) {
            ComposerBeauty b2 = C77878d.m135998b(composerBeauty, this.f174818a);
            if (b2 != null) {
                b2.setShowDot(false);
            }
        } else {
            ComposerBeauty b3 = C77878d.m135998b(composerBeauty, this.f174818a);
            if (b3 != null) {
                b3.setShowDot(false);
            }
            composerBeauty.setShowDot(!z);
            return;
        }
        composerBeauty.setShowDot(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121591a(String str) {
        this.f174832o.mo121647a(this.f174828k, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121592a(String str, AbstractC78051c.AbstractC78052a aVar) {
        C89219l.m154721d(str, "");
        C84386a.m145136a(m136095v(), str, new C77949s(this, str, aVar));
    }

    /* renamed from: a */
    public final List<BeautyComposerInfo> mo121585a(ComposerBeauty composerBeauty, C77876c cVar) {
        boolean p;
        ArrayList arrayList = new ArrayList();
        if (new C77957y(this, cVar).mo121642a(composerBeauty) && C77878d.m136004f(composerBeauty)) {
            if (C77878d.m136003e(composerBeauty)) {
                p = composerBeauty.getSelected();
            } else {
                p = m136094p(composerBeauty);
            }
            if (p) {
                List<BeautyComposerInfo> b = mo121601b(composerBeauty);
                if (!b.isEmpty()) {
                    composerBeauty.setAdd2Nodes(true);
                    this.f174821d.addAll(b);
                    arrayList.addAll(b);
                    m136093o(composerBeauty);
                    this.f174832o.mo121653b(composerBeauty.needFaceDetect());
                }
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121597a(boolean z) {
        this.f174832o.mo110216a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121590a(AbstractC77967m.AbstractC77969b bVar) {
        C89219l.m154721d(bVar, "");
        this.f174825h = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121593a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f174832o.mo121648a(str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final synchronized void mo121598a(boolean z, EnumC77817a aVar) {
        int c;
        List<ComposerBeauty> childList;
        String[] strArr;
        MethodCollector.m26663i(8629);
        C89219l.m154721d(aVar, "");
        int i = 0;
        if (this.f174833p.isConvertKey()) {
            List<BeautyCategory> list = this.f174829l;
            C89219l.m154721d(list, "");
            List<BeautyCategory> g = C89070n.m154585g((Collection) list);
            if (g.isEmpty()) {
                C77901a.f174777b.clear();
            } else if (!C77901a.f174777b.isEmpty()) {
                C41093a.m82765c("data had parse");
            } else {
                for (BeautyCategory beautyCategory : g) {
                    List<ComposerBeauty> beautyList = beautyCategory.getBeautyList();
                    if (beautyList != null) {
                        if (!beautyList.isEmpty()) {
                            if (beautyList != null) {
                                for (T t : beautyList) {
                                    if (t.isCollectionType() && (childList = t.getChildList()) != null && !childList.isEmpty()) {
                                        Iterator<T> it = childList.iterator();
                                        while (it.hasNext()) {
                                            C77901a.C77902a.m136038a(it.next());
                                        }
                                    }
                                    C77901a.C77902a.m136038a(t);
                                }
                            }
                        }
                    }
                }
            }
            if (C77901a.f174776a.getBoolean("key_had_converted_keys", false)) {
                C41093a.m82765c("nothing to convert");
            } else {
                C41093a.m82765c("prepare to convert data");
                Set<String> keySet = C77901a.f174776a.getAll().keySet();
                ArrayList arrayList = new ArrayList();
                for (T t2 : keySet) {
                    if (C89361p.m154929e((CharSequence) t2, (CharSequence) "composer_beauty_manual")) {
                        arrayList.add(t2);
                    }
                }
                ArrayList<String> arrayList2 = arrayList;
                ArrayList<String[]> arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (String str : arrayList2) {
                    C41093a.m82765c("convert data key:".concat(String.valueOf(str)));
                    List c2 = C89361p.m154921c(str, new String[]{"_"});
                    if (c2.size() < 8) {
                        C41093a.m82764b("bad key:".concat(String.valueOf(str)));
                    } else {
                        String str2 = (String) c2.get(i);
                        if (C89219l.m154714a((Object) "live", (Object) str2)) {
                            C41093a.m82764b("not record tag value key:".concat(String.valueOf(str)));
                        } else {
                            String str3 = (String) c2.get(6);
                            String str4 = (String) c2.get(7);
                            for (int i2 = 8; i2 < c2.size(); i2++) {
                                str4 = str4 + '_' + ((String) c2.get(i2));
                            }
                            strArr = new String[]{str, str2, "composer_beauty_manual", str3, str4};
                            arrayList3.add(strArr);
                            i = 0;
                        }
                    }
                    strArr = null;
                    arrayList3.add(strArr);
                    i = 0;
                }
                for (String[] strArr2 : arrayList3) {
                    if (strArr2 != null) {
                        if (strArr2.length != 0) {
                            if (strArr2.length == 5) {
                                String str5 = strArr2[0];
                                BeautySyncData a = C77901a.m136036a(strArr2[3]);
                                if (a != null) {
                                    String str6 = strArr2[1] + '_' + strArr2[2] + '_' + a.getResourceId() + '_' + strArr2[4];
                                    int i3 = C77901a.f174776a.getInt(str5, Integer.MIN_VALUE);
                                    if (i3 != Integer.MIN_VALUE && !C77901a.f174776a.contains(str6)) {
                                        C77901a.f174776a.storeFloat(str6, (float) i3);
                                        C41093a.m82765c("convert key:" + str6 + " val:" + i3);
                                    }
                                }
                            }
                        }
                    }
                }
                C77901a.m136037a(keySet);
                C77901a.f174776a.storeBoolean("key_had_converted_keys", true);
            }
        }
        if (!this.f174825h.mo121536a(this.f174833p, this.f174829l)) {
            MethodCollector.m26664o(8629);
            return;
        }
        if (z && aVar == EnumC77817a.FEMALE && (c = this.f174832o.mo121655c()) < 3) {
            this.f174832o.mo121645a(c + 1);
        }
        if (this.f174843z || this.f174828k != aVar || !this.f174827j) {
            this.f174843z = false;
            C89219l.m154721d(aVar, "");
            this.f174828k = aVar;
            m136096w().mo121578a(aVar);
            m136096w().mo121577a();
            String flag = this.f174828k.getFlag();
            C89219l.m154721d(flag, "");
            C77901a.f174776a.storeString("key_last_gender", flag);
            C41093a.m82765c("curGender:" + this.f174828k.getFlag());
            m136091a(aVar);
            MethodCollector.m26664o(8629);
            return;
        }
        MethodCollector.m26664o(8629);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121587a(ComposerBeauty composerBeauty, AbstractC77967m.AbstractC77970c cVar) {
        Collection collection;
        MethodCollector.m26663i(8640);
        C89219l.m154721d(composerBeauty, "");
        if (this.f174823f.mo121555a(composerBeauty) && C77878d.m136004f(composerBeauty) && (!C77878d.m136003e(composerBeauty) || composerBeauty.getSelected())) {
            List<BeautyComposerInfo> b = mo121601b(composerBeauty);
            if (C77878d.m136003e(composerBeauty)) {
                List<BeautyCategory> list = this.f174818a;
                C89219l.m154721d(composerBeauty, "");
                Object obj = null;
                if (!C77878d.m136003e(composerBeauty)) {
                    collection = new ArrayList();
                } else if (C77878d.m135997a(composerBeauty)) {
                    collection = C77878d.m135994a(composerBeauty, list);
                } else if (C77878d.m135999b(composerBeauty)) {
                    C89219l.m154721d(composerBeauty, "");
                    ArrayList arrayList = new ArrayList();
                    collection = arrayList;
                    if (C77878d.m135999b(composerBeauty)) {
                        ComposerBeauty b2 = C77878d.m135998b(composerBeauty, list);
                        collection = arrayList;
                        if (b2 != null) {
                            List<ComposerBeauty> childList = b2.getChildList();
                            collection = arrayList;
                            if (childList != null) {
                                collection = arrayList;
                                if (!childList.isEmpty()) {
                                    arrayList.addAll(childList);
                                    collection = arrayList;
                                }
                            }
                        }
                    }
                } else if (C77878d.m136002d(composerBeauty)) {
                    collection = C77878d.m136000c(composerBeauty, list);
                } else {
                    collection = new ArrayList();
                }
                if (!(!collection.isEmpty()) || collection == null) {
                    MethodCollector.m26664o(8640);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) next;
                    if (composerBeauty2.getAdd2Nodes() && (!C89219l.m154714a(composerBeauty2, composerBeauty))) {
                        obj = next;
                        break;
                    }
                }
                ComposerBeauty composerBeauty3 = (ComposerBeauty) obj;
                if (composerBeauty3 != null) {
                    composerBeauty3.setAdd2Nodes(false);
                    C77852b bVar = new C77852b(composerBeauty.getEffect().getEffectId(), 1);
                    C89219l.m154721d(bVar, "");
                    C77923g w = m136096w();
                    C89219l.m154721d(bVar, "");
                    synchronized (w) {
                        try {
                            w.f174813a.remove(bVar);
                        } catch (Throwable th) {
                            MethodCollector.m26664o(8640);
                            throw th;
                        }
                    }
                    w.mo121581b();
                    arrayList2.addAll(mo121601b(composerBeauty3));
                    C77972o<ComposerBeauty> value = this.f174839v.getValue();
                    if (value != null) {
                        value.remove(composerBeauty3);
                    }
                }
                composerBeauty.setAdd2Nodes(true);
                mo121589a(new C77852b(composerBeauty.getEffect().getEffectId(), 1));
                cVar.mo121568a(arrayList2, b);
                this.f174821d.removeAll(arrayList2);
                this.f174821d.addAll(b);
                m136093o(composerBeauty);
                this.f174832o.mo121653b(composerBeauty.needFaceDetect());
                MethodCollector.m26664o(8640);
                return;
            }
            composerBeauty.setAdd2Nodes(true);
            mo121589a(new C77852b(composerBeauty.getEffect().getEffectId(), 1));
            cVar.mo121567a(b);
            this.f174821d.addAll(b);
            m136093o(composerBeauty);
            this.f174832o.mo121653b(composerBeauty.needFaceDetect());
        }
        MethodCollector.m26664o(8640);
    }

    /* renamed from: a */
    private final void m136092a(AbstractC89172b<? super ComposerBeauty, C89391z> bVar) {
        for (T t : this.f174818a) {
            if (t.getBeautyCategoryExtra().getExclusive()) {
                Iterator<T> it = t.getBeautyList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getSelected()) {
                        if (next != null) {
                            bVar.invoke(next);
                        }
                    }
                }
            } else {
                for (T t2 : t.getBeautyList()) {
                    if (t2.isCollectionType()) {
                        List<ComposerBeauty> childList = t2.getChildList();
                        if (childList != null) {
                            Iterator<T> it2 = childList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                T next2 = it2.next();
                                if (next2.getSelected()) {
                                    if (next2 != null) {
                                        bVar.invoke(next2);
                                    }
                                }
                            }
                        }
                    } else {
                        bVar.invoke(t2);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$h */
    static final class C77937h extends AbstractC89220m implements AbstractC89171a<AbstractC84398d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f174856a;

        static {
            Covode.recordClassIndex(91026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77937h(AbstractC89171a aVar) {
            super(0);
            this.f174856a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC84398d invoke() {
            return this.f174856a.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: q */
    public final boolean mo121633q() {
        return this.f174832o.mo110217a();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$a */
    static final class C77930a extends AbstractC89220m implements AbstractC89171a<C77923g> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174848a;

        static {
            Covode.recordClassIndex(91019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77930a(C77927h hVar) {
            super(0);
            this.f174848a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77923g invoke() {
            return new C77923g(this.f174848a.f174833p, this.f174848a.f174834q);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: s */
    public final List<ComposerBeauty> mo121635s() {
        return C77878d.m135995a(this.f174818a, new C77939j(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: t */
    public final void mo121636t() {
        this.f174823f.mo121553a().mo70281a().clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: l */
    public final synchronized void mo121625l() {
        MethodCollector.m26663i(8636);
        C41097b.m82776a(this.f174820c, mo121627m());
        MethodCollector.m26664o(8636);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: o */
    public final C41101a mo121631o() {
        int i = 0;
        if (!C77886a.f174752i) {
            return new C41101a(0, 0);
        }
        if (C77886a.f174753j == 2) {
            i = 1;
        }
        return new C41101a(i ^ 1, 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: r */
    public final BeautyMetadata mo121634r() {
        BeautyMetadata beautyMetadata = new BeautyMetadata();
        List<ComposerBeauty> a = C77878d.m135995a(this.f174818a, new C77944o(this));
        beautyMetadata.setBeautyName(C89070n.m154551a(a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C77940k.f174860a, 30));
        beautyMetadata.setBeautyStrength(C89070n.m154551a(a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C77941l(this), 30));
        beautyMetadata.setBeautyId(C89070n.m154551a(a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C77942m.f174862a, 30));
        beautyMetadata.setBeautyRes(C89070n.m154551a(a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C77943n.f174863a, 30));
        return beautyMetadata;
    }

    /* renamed from: m */
    public final C77971n<BeautyComposerInfo> mo121627m() {
        List<BeautyCategory> list = this.f174818a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (mo121604b(t.getCategoryResponse().getId())) {
                arrayList.add(t);
            }
        }
        C77932c cVar = new C77932c(this, arrayList);
        C77971n<BeautyComposerInfo> nVar = new C77971n<>();
        for (BeautyComposerInfo beautyComposerInfo : this.f174821d) {
            if (cVar.mo121638a(beautyComposerInfo)) {
                nVar.add(beautyComposerInfo);
            }
        }
        return nVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: p */
    public final ComposerBeautyBuriedInfoCopy mo121632p() {
        if (this.f174827j) {
            return new ComposerBeautyBuriedInfoCopy(0, 0, 0, null, 12, null);
        }
        C89233z.C89236c cVar = new C89233z.C89236c();
        int i = 0;
        cVar.element = 0;
        C89233z.C89236c cVar2 = new C89233z.C89236c();
        cVar2.element = 0;
        ArrayList arrayList = new ArrayList();
        m136092a(new C77946q(arrayList, new C77945p(this, cVar, cVar2)));
        int i2 = cVar.element;
        if (C77886a.f174759p != null) {
            i = 1;
        }
        return new ComposerBeautyBuriedInfoCopy(i2, i, cVar2.element, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$x */
    public static final class C77956x extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174891a;

        /* renamed from: b */
        final /* synthetic */ ComposerBeauty f174892b;

        static {
            Covode.recordClassIndex(91045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77956x(C77927h hVar, ComposerBeauty composerBeauty) {
            super(0);
            this.f174891a = hVar;
            this.f174892b = composerBeauty;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String effectId = this.f174892b.getEffect().getEffectId();
            int b = this.f174891a.f174823f.mo121556b(this.f174892b);
            C0484a<String, Integer> value = this.f174891a.f174824g.getValue();
            if (value != null) {
                value.put(effectId, Integer.valueOf(b));
            }
            Iterator<T> it = this.f174891a.f174818a.iterator();
            while (it.hasNext()) {
                for (T t : it.next().getBeautyList()) {
                    if (t.isCollectionType()) {
                        List<ComposerBeauty> childList = t.getChildList();
                        if (childList != null) {
                            for (T t2 : childList) {
                                int b2 = this.f174891a.f174823f.mo121556b(t2);
                                if (t2.getDownloadState() != b2) {
                                    t2.setDownloadState(b2);
                                    if (value != null) {
                                        value.put(t2.getEffect().getEffectId(), Integer.valueOf(b2));
                                    }
                                }
                            }
                        }
                    } else {
                        int b3 = this.f174891a.f174823f.mo121556b(t);
                        if (t.getDownloadState() != b3) {
                            t.setDownloadState(b3);
                            if (value != null) {
                                value.put(t.getEffect().getEffectId(), Integer.valueOf(b3));
                            }
                        }
                    }
                }
            }
            this.f174891a.f174824g.setValue(value);
            return C89391z.f203057a;
        }
    }

    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121623k() {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77927h.mo121623k():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$b */
    public static final class C77931b extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        public static final C77931b f174849a = new C77931b();

        static {
            Covode.recordClassIndex(91020);
        }

        C77931b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            m136152a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m136152a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            composerBeauty.setSelected(false);
            composerBeauty.setShowDot(false);
            composerBeauty.setAdd2Nodes(false);
            composerBeauty.setProgressValue(0);
            composerBeauty.setEnable(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$d */
    public static final class C77933d implements AbstractC41085a<C77876c, Void> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174852a;

        static {
            Covode.recordClassIndex(91022);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77933d(C77927h hVar) {
            this.f174852a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: a */
        public final /* synthetic */ void mo70298a(C77876c cVar) {
            C77876c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            this.f174852a.mo121620i(cVar2.f174728a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: b */
        public final /* synthetic */ void mo70300b(C77876c cVar) {
            C77876c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            this.f174852a.mo121620i(cVar2.f174728a);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.f174852a.f174818a.iterator();
            while (it.hasNext()) {
                for (T t : it.next().getBeautyList()) {
                    if (t.isCollectionType()) {
                        List<ComposerBeauty> childList = t.getChildList();
                        if (childList != null) {
                            for (T t2 : childList) {
                                arrayList.addAll(this.f174852a.mo121585a(t2, cVar2));
                                if (C89219l.m154714a((Object) t2.getEffect().getUnzipPath(), (Object) cVar2.f174728a.getEffect().getUnzipPath())) {
                                    C41097b.m82776a(this.f174852a.f174822e, t2);
                                }
                            }
                        }
                    } else {
                        arrayList.addAll(this.f174852a.mo121585a(t, cVar2));
                        if (C89219l.m154714a((Object) t.getEffect().getUnzipPath(), (Object) cVar2.f174728a.getEffect().getUnzipPath())) {
                            C41097b.m82776a(this.f174852a.f174822e, t);
                        }
                    }
                }
            }
            C41097b.m82776a(this.f174852a.f174830m, arrayList);
            C77887a.m136013a(cVar2.f174728a, 0, "success");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Integer, java.lang.Exception] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: a */
        public final /* synthetic */ void mo70299a(C77876c cVar, Integer num, Exception exc) {
            C77876c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            this.f174852a.mo121620i(cVar2.f174728a);
            C77887a.m136013a(cVar2.f174728a, 1, new StringBuilder().append(num).append('_').append(exc).toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$i */
    public static final class C77938i extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174857a;

        /* renamed from: b */
        final /* synthetic */ List f174858b;

        static {
            Covode.recordClassIndex(91027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77938i(C77927h hVar, List list) {
            super(1);
            this.f174857a = hVar;
            this.f174858b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121639a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121639a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            List<BeautyComposerInfo> b = this.f174857a.mo121601b(composerBeauty);
            if ((!b.isEmpty()) && b != null) {
                this.f174858b.add(composerBeauty);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$t */
    public static final class C77952t extends AbstractC89220m implements AbstractC89172b<List<? extends ComposerBeauty>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174887a;

        static {
            Covode.recordClassIndex(91041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77952t(C77927h hVar) {
            super(1);
            this.f174887a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends ComposerBeauty> list) {
            mo121641a(list);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121641a(List<ComposerBeauty> list) {
            T t;
            C89219l.m154721d(list, "");
            Iterator<T> it = list.iterator();
            do {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                t = it.next();
            } while (!t.getExtra().getDefault());
            T t2 = t;
            if (t2 != null) {
                t2.setSelected(true);
                this.f174887a.mo121606c((ComposerBeauty) t2);
                this.f174887a.mo121616g(t2);
            } else if ((!list.isEmpty()) && list != null) {
                list.get(0).setSelected(true);
                this.f174887a.mo121606c(list.get(0));
                this.f174887a.mo121616g(list.get(0));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$u */
    public static final class C77953u extends AbstractC89220m implements AbstractC89172b<List<? extends ComposerBeauty>, C89391z> {

        /* renamed from: a */
        public static final C77953u f174888a = new C77953u();

        static {
            Covode.recordClassIndex(91042);
        }

        C77953u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends ComposerBeauty> list) {
            m136160a(list);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m136160a(List<ComposerBeauty> list) {
            T t;
            C89219l.m154721d(list, "");
            Iterator<T> it = list.iterator();
            do {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                t = it.next();
            } while (!t.getExtra().getDefault());
            T t2 = t;
            if (t2 != null) {
                t2.setSelected(true);
            } else if ((!list.isEmpty()) && list != null) {
                list.get(0).setSelected(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$v */
    public static final class C77954v extends AbstractC89220m implements AbstractC89172b<List<? extends BeautyCategory>, C89391z> {

        /* renamed from: a */
        public static final C77954v f174889a = new C77954v();

        static {
            Covode.recordClassIndex(91043);
        }

        C77954v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends BeautyCategory> list) {
            m136161a(list);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m136161a(List<BeautyCategory> list) {
            T t;
            C89219l.m154721d(list, "");
            Iterator<T> it = list.iterator();
            do {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                t = it.next();
            } while (!t.getBeautyCategoryExtra().getDefault());
            T t2 = t;
            if (t2 != null) {
                t2.setSelected(true);
            } else if ((!list.isEmpty()) && list != null) {
                list.get(0).setSelected(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$c */
    public static final class C77932c extends AbstractC89220m implements AbstractC89172b<BeautyComposerInfo, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174850a;

        /* renamed from: b */
        final /* synthetic */ List f174851b;

        static {
            Covode.recordClassIndex(91021);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77932c(C77927h hVar, List list) {
            super(1);
            this.f174850a = hVar;
            this.f174851b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(BeautyComposerInfo beautyComposerInfo) {
            return Boolean.valueOf(mo121638a(beautyComposerInfo));
        }

        /* renamed from: a */
        public final boolean mo121638a(BeautyComposerInfo beautyComposerInfo) {
            T t;
            C89219l.m154721d(beautyComposerInfo, "");
            if (C89219l.m154714a((Object) beautyComposerInfo.f96060a, (Object) "EFFECT_ID_TYPE_FILTER")) {
                return true;
            }
            for (BeautyCategory beautyCategory : this.f174851b) {
                Iterator<T> it = beautyCategory.getBeautyList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        T next = it.next();
                        if (next.isCollectionType()) {
                            List<ComposerBeauty> childList = next.getChildList();
                            if (childList != null) {
                                Iterator<T> it2 = childList.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it2.next();
                                    if (C89219l.m154714a((Object) t.getEffect().getEffectId(), (Object) beautyComposerInfo.f96062c)) {
                                        break;
                                    }
                                }
                                T t2 = t;
                                if (t2 != null) {
                                    return this.f174850a.mo121630n(t2);
                                }
                            } else {
                                continue;
                            }
                        } else if (C89219l.m154714a((Object) next.getEffect().getEffectId(), (Object) beautyComposerInfo.f96062c)) {
                            return this.f174850a.mo121630n(next);
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$k */
    static final class C77940k extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, CharSequence> {

        /* renamed from: a */
        public static final C77940k f174860a = new C77940k();

        static {
            Covode.recordClassIndex(91029);
        }

        C77940k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            return composerBeauty2.getEffect().getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$m */
    static final class C77942m extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, CharSequence> {

        /* renamed from: a */
        public static final C77942m f174862a = new C77942m();

        static {
            Covode.recordClassIndex(91031);
        }

        C77942m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            return composerBeauty2.getEffect().getEffectId();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$n */
    static final class C77943n extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, CharSequence> {

        /* renamed from: a */
        public static final C77943n f174863a = new C77943n();

        static {
            Covode.recordClassIndex(91032);
        }

        C77943n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            return composerBeauty2.getEffect().getId();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$s */
    public static final class C77949s implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ C77927h f174876a;

        /* renamed from: b */
        final /* synthetic */ String f174877b;

        /* renamed from: c */
        final /* synthetic */ AbstractC78051c.AbstractC78052a f174878c;

        static {
            Covode.recordClassIndex(91038);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C77950a(this, effectChannelResponse, null), 3);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            String str;
            Exception exc;
            String str2 = this.f174877b;
            if (exceptionResult == null || (str = exceptionResult.getMsg()) == null) {
                str = "request fail";
            }
            C77887a.m136014a(str2, 1, str);
            AbstractC78051c.AbstractC78052a aVar = this.f174878c;
            if (aVar != null) {
                if (exceptionResult != null) {
                    exc = exceptionResult.getException();
                } else {
                    exc = null;
                }
                aVar.mo22692a(new Exception(exc));
            }
            if (exceptionResult != null) {
                C41093a.m82763a(exceptionResult.getException());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$s$a */
        public static final class C77950a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            Object f174879a;

            /* renamed from: b */
            Object f174880b;

            /* renamed from: c */
            int f174881c;

            /* renamed from: d */
            final /* synthetic */ C77949s f174882d;

            /* renamed from: e */
            final /* synthetic */ EffectChannelResponse f174883e;

            static {
                Covode.recordClassIndex(91039);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77950a(C77949s sVar, EffectChannelResponse effectChannelResponse, AbstractC89124d dVar) {
                super(2, dVar);
                this.f174882d = sVar;
                this.f174883e = effectChannelResponse;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C77950a(this.f174882d, this.f174883e, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C77950a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$s$a$a */
            public static final class C77951a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                /* renamed from: a */
                int f174884a;

                /* renamed from: b */
                final /* synthetic */ List f174885b;

                /* renamed from: c */
                final /* synthetic */ C77950a f174886c;

                static {
                    Covode.recordClassIndex(91040);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C77951a(List list, AbstractC89124d dVar, C77950a aVar) {
                    super(2, dVar);
                    this.f174885b = list;
                    this.f174886c = aVar;
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                    C89219l.m154721d(dVar, "");
                    return new C77951a(this.f174885b, dVar, this.f174886c);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                    return ((C77951a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final Object invokeSuspend(Object obj) {
                    if (this.f174884a == 0) {
                        C89382r.m154942a(obj);
                        this.f174886c.f174882d.f174876a.f174827j = false;
                        this.f174886c.f174882d.f174876a.mo121594a(this.f174885b);
                        C41093a.m82765c("LJT sendRequest: set categories to allData");
                        C41093a.m82765c("LJT sendRequest: allData size is " + this.f174886c.f174882d.f174876a.f174829l.size());
                        C77887a.m136014a(this.f174886c.f174882d.f174877b, 0, "success");
                        AbstractC78051c.AbstractC78052a aVar = this.f174886c.f174882d.f174878c;
                        if (aVar == null) {
                            return null;
                        }
                        aVar.mo22693a(this.f174885b);
                        return C89391z.f203057a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                List<BeautyCategory> arrayList;
                List<Effect> allCategoryEffects;
                List<EffectCategoryResponse> categoryResponseList;
                List<EffectCategoryResponse> categoryResponseList2;
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f174881c;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    String str = "";
                    EffectChannelResponse effectChannelResponse = this.f174883e;
                    if (!(effectChannelResponse == null || (categoryResponseList2 = effectChannelResponse.getCategoryResponseList()) == null)) {
                        Iterator<T> it = categoryResponseList2.iterator();
                        while (it.hasNext()) {
                            str = str + it.next().getName() + ",";
                        }
                    }
                    StringBuilder sb = new StringBuilder("LJT sendRequest: get EffectChannelResponse: size is: ");
                    EffectChannelResponse effectChannelResponse2 = this.f174883e;
                    C41093a.m82765c(sb.append((effectChannelResponse2 == null || (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) == null) ? null : C89108b.m154610a(categoryResponseList.size())).append(", name:").append(str).toString());
                    EffectChannelResponse effectChannelResponse3 = this.f174883e;
                    if (effectChannelResponse3 != null) {
                        List<EffectCategoryResponse> categoryResponseList3 = effectChannelResponse3.getCategoryResponseList();
                        if ((categoryResponseList3 == null || categoryResponseList3.isEmpty()) && ((allCategoryEffects = effectChannelResponse3.getAllCategoryEffects()) == null || allCategoryEffects.isEmpty())) {
                            C77887a.m136014a(this.f174882d.f174877b, 1, "data is empty");
                            AbstractC78051c.AbstractC78052a aVar2 = this.f174882d.f174878c;
                            if (aVar2 != null) {
                                aVar2.mo22692a(new Exception("data is empty"));
                            }
                            return C89391z.f203057a;
                        }
                        if (effectChannelResponse3.getCategoryResponseList().size() > 0) {
                            arrayList = this.f174882d.f174876a.mo121610d(effectChannelResponse3.getCategoryResponseList());
                        } else {
                            arrayList = new ArrayList<>();
                        }
                        for (BeautyCategory beautyCategory : arrayList) {
                            if (arrayList.isEmpty()) {
                                C41093a.m82765c("LJT sendRequest: response is empty or categories is emptry after conversion");
                            } else {
                                C41093a.m82765c("LJT sendRequest: categories converted from rsp, " + beautyCategory.getCategoryResponse().getName());
                            }
                        }
                        if (this.f174882d.f174876a.f174825h.mo121536a(this.f174882d.f174876a.f174833p, arrayList)) {
                            AbstractC89522b bVar = C41096a.f96058a;
                            C77951a aVar3 = new C77951a(arrayList, null, this);
                            this.f174879a = effectChannelResponse3;
                            this.f174880b = arrayList;
                            this.f174881c = 1;
                            if (C89624i.m155554a(bVar, aVar3, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            this.f174882d.f174876a.f174832o.mo121649a((List<BeautyCategory>) null);
                            this.f174882d.f174876a.mo121623k();
                            C77887a.m136014a(this.f174882d.f174877b, 1, "data is not valid");
                            AbstractC78051c.AbstractC78052a aVar4 = this.f174882d.f174878c;
                            if (aVar4 != null) {
                                aVar4.mo22692a(new Exception("data is not valid!!!"));
                            }
                        }
                    }
                    return C89391z.f203057a;
                } else if (i == 1) {
                    arrayList = (List) this.f174880b;
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f174882d.f174876a.f174832o.mo121649a(arrayList);
                this.f174882d.f174876a.mo121603b(arrayList);
                return C89391z.f203057a;
            }
        }

        C77949s(C77927h hVar, String str, AbstractC78051c.AbstractC78052a aVar) {
            this.f174876a = hVar;
            this.f174877b = str;
            this.f174878c = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$y */
    public static final class C77957y extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174893a;

        /* renamed from: b */
        final /* synthetic */ C77876c f174894b;

        static {
            Covode.recordClassIndex(91046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77957y(C77927h hVar, C77876c cVar) {
            super(1);
            this.f174893a = hVar;
            this.f174894b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            return Boolean.valueOf(mo121642a(composerBeauty));
        }

        /* renamed from: a */
        public final boolean mo121642a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            if (!C89219l.m154714a((Object) this.f174894b.f174729b, (Object) composerBeauty.getEffect().getUnzipPath()) || this.f174893a.mo121612e(composerBeauty) || !this.f174893a.f174823f.mo121555a(composerBeauty)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: c */
    public final void mo121606c(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        mo121588a(composerBeauty, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: f */
    public final void mo121614f(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        this.f174832o.mo121646a(composerBeauty, this.f174828k);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: g */
    public final void mo121616g(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        this.f174832o.mo121652b(composerBeauty, this.f174828k);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: h */
    public final String mo121618h(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        return this.f174832o.mo121644a(this.f174828k, composerBeauty);
    }

    /* renamed from: i */
    public final void mo121620i(ComposerBeauty composerBeauty) {
        C80558hx.m139642a(0, new C77956x(this, composerBeauty));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$g */
    public static final class C77936g<T> implements AbstractC88433f<ArrayList<ComposerBeauty>> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174855a;

        static {
            Covode.recordClassIndex(91025);
        }

        C77936g(C77927h hVar) {
            this.f174855a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(ArrayList<ComposerBeauty> arrayList) {
            ArrayList<ComposerBeauty> arrayList2 = arrayList;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                this.f174855a.f174823f.mo121553a().mo70288b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$j */
    static final class C77939j extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174859a;

        static {
            Covode.recordClassIndex(91028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77939j(C77927h hVar) {
            super(1);
            this.f174859a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            boolean z;
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            if (!this.f174859a.f174823f.mo121555a(composerBeauty2) || !C77878d.m136004f(composerBeauty2)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$l */
    static final class C77941l extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174861a;

        static {
            Covode.recordClassIndex(91030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77941l(C77927h hVar) {
            super(1);
            this.f174861a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            return String.valueOf(this.f174861a.mo121608d(composerBeauty2).f48260a.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$q */
    static final class C77946q extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f174868a;

        /* renamed from: b */
        final /* synthetic */ C77945p f174869b;

        static {
            Covode.recordClassIndex(91035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77946q(ArrayList arrayList, C77945p pVar) {
            super(1);
            this.f174868a = arrayList;
            this.f174869b = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            this.f174868a.add(this.f174869b.invoke(composerBeauty2));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$w */
    public static final class C77955w extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174890a;

        static {
            Covode.recordClassIndex(91044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77955w(C77927h hVar) {
            super(1);
            this.f174890a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            return Boolean.valueOf(this.f174890a.mo121612e(composerBeauty2));
        }
    }

    /* renamed from: o */
    private final void m136093o(ComposerBeauty composerBeauty) {
        C77972o<ComposerBeauty> value = this.f174839v.getValue();
        if (value != null) {
            value.add(composerBeauty);
        }
        C41099d<C77972o<ComposerBeauty>> dVar = this.f174839v;
        C41097b.m82776a(dVar, dVar.getValue());
    }

    /* renamed from: p */
    private final boolean m136094p(ComposerBeauty composerBeauty) {
        if (!composerBeauty.getExtra().getDisableCache() || this.f174833p.getAutoApplyBeauty()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final void mo121589a(C77852b bVar) {
        C89219l.m154721d(bVar, "");
        m136096w().mo121579a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: b */
    public final boolean mo121604b(String str) {
        C89219l.m154721d(str, "");
        return this.f174832o.mo121654b(str, true);
    }

    /* renamed from: j */
    public final boolean mo121622j(ComposerBeauty composerBeauty) {
        if (composerBeauty.getExtra().isNone()) {
            return false;
        }
        if (m136094p(composerBeauty) || composerBeauty.getAdd2Nodes()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$o */
    static final class C77944o extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174864a;

        static {
            Covode.recordClassIndex(91033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77944o(C77927h hVar) {
            super(1);
            this.f174864a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            boolean z = false;
            if (this.f174864a.f174823f.mo121555a(composerBeauty2) && this.f174864a.f174832o.mo121654b(composerBeauty2.getCategoryId(), true) && C77878d.m136004f(composerBeauty2) && composerBeauty2.getEffect().getEffectId().length() > 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private final ComposerBeautyExtra m136087a(Effect effect) {
        boolean z;
        String extra = effect.getExtra();
        if (extra == null || extra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerBeautyExtra composerBeautyExtra = null;
        if (z) {
            return null;
        }
        try {
            composerBeautyExtra = (ComposerBeautyExtra) this.f174834q.mo46670a(effect.getExtra(), ComposerBeautyExtra.class);
            return composerBeautyExtra;
        } catch (Exception e) {
            C41093a.m82762a("parseComposerBeautyExtra ," + Log.getStackTraceString(e));
            return composerBeautyExtra;
        }
    }

    /* renamed from: d */
    public final List<BeautyCategory> mo121610d(List<EffectCategoryResponse> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            BeautyCategoryExtra a = m136089a((EffectCategoryResponse) t);
            if (a != null) {
                arrayList.add(new BeautyCategory(t, a, m136090a(t, a), false, 8, null));
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: e */
    public final boolean mo121612e(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        if (composerBeauty.getExtra().isNone() || mo121608d(composerBeauty).f48262c.booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: m */
    public final void mo121628m(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        if (!this.f174823f.mo121555a(composerBeauty)) {
            this.f174823f.mo121554a(new C77876c(composerBeauty), this.f174831n);
            C77903b bVar = this.f174823f;
            C77876c cVar = new C77876c(composerBeauty);
            C89219l.m154721d(cVar, "");
            bVar.mo121553a().mo70291b(cVar, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$1 */
    public static final class C779281 extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f174844a;

        /* renamed from: b */
        final /* synthetic */ C77927h f174845b;

        static {
            Covode.recordClassIndex(91017);
        }

        {
            this.f174845b = r2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C779281(this.f174845b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C779281) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$1$a */
        public static final class C77929a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super List<BeautyCategory>>, Object> {

            /* renamed from: a */
            int f174846a;

            /* renamed from: b */
            final /* synthetic */ C779281 f174847b;

            static {
                Covode.recordClassIndex(91018);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77929a(C779281 r2, AbstractC89124d dVar) {
                super(2, dVar);
                this.f174847b = r2;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C77929a(this.f174847b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super List<BeautyCategory>> dVar) {
                return ((C77929a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f174846a == 0) {
                    C89382r.m154942a(obj);
                    List<BeautyCategory> b = this.f174847b.f174845b.f174832o.mo121651b();
                    String str = "";
                    if (b != null) {
                        Iterator<T> it = b.iterator();
                        while (it.hasNext()) {
                            str = str + it.next().getCategoryResponse().getName();
                        }
                    }
                    C41093a.m82765c("LJT getPanelDataFromLocal: ".concat(String.valueOf(str)));
                    if (b == null || this.f174847b.f174845b.f174825h.mo121536a(this.f174847b.f174845b.f174833p, b)) {
                        return b;
                    }
                    C41093a.m82765c("LJT getPanelDataFromLocal: panel not valid, local is null");
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f174844a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89531av avVar = C89624i.m155556b(C89561bs.f203280a, C89546bf.f203267b, null, new C77929a(this, null), 2);
                this.f174844a = 1;
                obj = avVar.mo144106a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<BeautyCategory> list = (List) obj;
            if (list != null) {
                this.f174845b.mo121594a(list);
                this.f174845b.f174827j = false;
            } else {
                this.f174845b.mo121623k();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$e */
    public static final class C77934e<T, R> implements AbstractC88434g<ArrayList<ComposerBeauty>, ArrayList<ComposerBeauty>> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174853a;

        static {
            Covode.recordClassIndex(91023);
        }

        C77934e(C77927h hVar) {
            this.f174853a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ ArrayList<ComposerBeauty> apply(ArrayList<ComposerBeauty> arrayList) {
            ArrayList<ComposerBeauty> arrayList2 = arrayList;
            C89219l.m154721d(arrayList2, "");
            ArrayList arrayList3 = new ArrayList();
            for (T t : arrayList2) {
                this.f174853a.mo121620i(t);
                if (!this.f174853a.f174823f.mo121555a(t)) {
                    Iterator<T> it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C89219l.m154714a((Object) next.getEffect().getUnzipPath(), (Object) t.getEffect().getUnzipPath())) {
                            if (next != null) {
                            }
                        }
                    }
                    arrayList3.add(t);
                    this.f174853a.f174823f.mo121554a(new C77876c(t), this.f174853a.f174831n);
                }
            }
            return arrayList3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$f */
    public static final class C77935f<T, R> implements AbstractC88434g<ArrayList<ComposerBeauty>, ArrayList<ComposerBeauty>> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174854a;

        static {
            Covode.recordClassIndex(91024);
        }

        C77935f(C77927h hVar) {
            this.f174854a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ ArrayList<ComposerBeauty> apply(ArrayList<ComposerBeauty> arrayList) {
            ArrayList<ComposerBeauty> arrayList2 = arrayList;
            C89219l.m154721d(arrayList2, "");
            C77903b bVar = this.f174854a.f174823f;
            C89219l.m154721d(arrayList2, "");
            if ((!arrayList2.isEmpty()) && arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new C77876c(it.next()));
                }
                bVar.mo121553a().mo70287a(arrayList3);
            }
            return arrayList2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$p */
    static final class C77945p extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, BeautifyInfo> {

        /* renamed from: a */
        final /* synthetic */ C77927h f174865a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f174866b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f174867c;

        static {
            Covode.recordClassIndex(91034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77945p(C77927h hVar, C89233z.C89236c cVar, C89233z.C89236c cVar2) {
            super(1);
            this.f174865a = hVar;
            this.f174866b = cVar;
            this.f174867c = cVar2;
        }

        /* renamed from: a */
        public final BeautifyInfo invoke(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            ArrayList arrayList = new ArrayList();
            if (this.f174865a.mo121622j(composerBeauty)) {
                List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                if (items != null) {
                    for (T t : items) {
                        arrayList.add(new BeautifyTag(t.getTag(), (float) this.f174865a.mo121608d(composerBeauty).f48260a.intValue()));
                        if (this.f174865a.mo121583a(composerBeauty, t.getTag(), (float) t.getValue()) != ((float) t.getValue())) {
                            this.f174866b.element = 1;
                        }
                    }
                }
                this.f174867c.element = 1;
            }
            return new BeautifyInfo(composerBeauty.getEffect().getEffectId(), arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$r */
    public static final class C77947r extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f174870a;

        /* renamed from: b */
        final /* synthetic */ C77927h f174871b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f174872c;

        /* renamed from: d */
        private /* synthetic */ Object f174873d;

        static {
            Covode.recordClassIndex(91036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77947r(C77927h hVar, ArrayList arrayList, AbstractC89124d dVar) {
            super(2, dVar);
            this.f174871b = hVar;
            this.f174872c = arrayList;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C77947r rVar = new C77947r(this.f174871b, this.f174872c, dVar);
            rVar.f174873d = obj;
            return rVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C77947r) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f174870a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89531av avVar = C89624i.m155556b((AbstractC89516am) this.f174873d, C89546bf.f203267b, null, new C77948a(this, null), 2);
                this.f174870a = 1;
                obj = avVar.mo144106a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f174871b.f174821d.clear();
            this.f174871b.f174821d.addAll((C77971n) obj);
            C41097b.m82776a(this.f174871b.f174820c, this.f174871b.mo121627m());
            return C89391z.f203057a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$r$a */
        public static final class C77948a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C77971n<BeautyComposerInfo>>, Object> {

            /* renamed from: a */
            int f174874a;

            /* renamed from: b */
            final /* synthetic */ C77947r f174875b;

            static {
                Covode.recordClassIndex(91037);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77948a(C77947r rVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f174875b = rVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C77948a(this.f174875b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C77971n<BeautyComposerInfo>> dVar) {
                return ((C77948a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                boolean z;
                T t;
                T t2;
                Object obj2;
                if (this.f174874a == 0) {
                    C89382r.m154942a(obj);
                    C77927h hVar = this.f174875b.f174871b;
                    ArrayList<BeautyCategory> arrayList = this.f174875b.f174872c;
                    for (BeautyCategory beautyCategory : arrayList) {
                        beautyCategory.setSelected(false);
                    }
                    for (BeautyCategory beautyCategory2 : arrayList) {
                        for (T t3 : beautyCategory2.getBeautyList()) {
                            if (t3.isCollectionType()) {
                                List<ComposerBeauty> childList = t3.getChildList();
                                if (childList != null) {
                                    Iterator<T> it = childList.iterator();
                                    while (it.hasNext()) {
                                        C77931b.m136152a(it.next());
                                    }
                                }
                                C77931b.m136152a(t3);
                            } else {
                                C77931b.m136152a(t3);
                            }
                        }
                    }
                    String a = hVar.f174832o.mo121643a(hVar.f174828k);
                    if (a != null) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (C89219l.m154714a((Object) ((BeautyCategory) obj2).getCategoryResponse().getId(), (Object) a)) {
                                break;
                            }
                        }
                        BeautyCategory beautyCategory3 = (BeautyCategory) obj2;
                        if (beautyCategory3 != null) {
                            beautyCategory3.setSelected(true);
                        } else {
                            C77954v.m136161a(arrayList);
                        }
                    } else {
                        C77954v.m136161a(arrayList);
                    }
                    for (BeautyCategory beautyCategory4 : arrayList) {
                        if (beautyCategory4.getBeautyCategoryExtra().getExclusive()) {
                            String b = hVar.f174832o.mo121650b(hVar.f174828k, beautyCategory4.getCategoryResponse().getId());
                            if (b == null || b.length() == 0) {
                                C77953u.m136160a(beautyCategory4.getBeautyList());
                            } else {
                                Iterator<T> it3 = beautyCategory4.getBeautyList().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        t2 = null;
                                        break;
                                    }
                                    t2 = it3.next();
                                    if (C89219l.m154714a((Object) t2.getEffect().getEffectId(), (Object) b)) {
                                        break;
                                    }
                                }
                                T t4 = t2;
                                if (t4 != null) {
                                    t4.setSelected(true);
                                } else {
                                    C77953u.m136160a(beautyCategory4.getBeautyList());
                                }
                            }
                        } else {
                            Iterator<T> it4 = beautyCategory4.getBeautyList().iterator();
                            while (it4.hasNext()) {
                                hVar.mo121606c((ComposerBeauty) it4.next());
                            }
                        }
                    }
                    for (BeautyCategory beautyCategory5 : arrayList) {
                        for (T t5 : beautyCategory5.getBeautyList()) {
                            if (t5.isCollectionType()) {
                                C77952t tVar = new C77952t(hVar);
                                List<ComposerBeauty> childList2 = t5.getChildList();
                                if (!(childList2 == null || childList2.isEmpty() || childList2 == null)) {
                                    String h = hVar.mo121618h(t5);
                                    if (h == null || h.length() == 0) {
                                        tVar.mo121641a(childList2);
                                    } else {
                                        Iterator<T> it5 = childList2.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it5.next();
                                            if (C89219l.m154714a((Object) t.getEffect().getResourceId(), (Object) h)) {
                                                break;
                                            }
                                        }
                                        T t6 = t;
                                        if (t6 != null) {
                                            t6.setSelected(true);
                                            hVar.mo121606c((ComposerBeauty) t6);
                                        } else {
                                            tVar.mo121641a(childList2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C77927h hVar2 = this.f174875b.f174871b;
                    for (BeautyCategory beautyCategory6 : this.f174875b.f174872c) {
                        for (T t7 : beautyCategory6.getBeautyList()) {
                            Effect effect = t7.getEffect();
                            C77965l lVar = hVar2.f174826i;
                            String resourceId = effect.getResourceId();
                            List<String> tags = effect.getTags();
                            if (tags == null) {
                                tags = new ArrayList<>();
                            }
                            String tagsUpdatedAt = effect.getTagsUpdatedAt();
                            C89219l.m154721d(resourceId, "");
                            C89219l.m154721d(tags, "");
                            if (tags.contains("new") && tagsUpdatedAt != null) {
                                C89219l.m154721d(resourceId, "");
                                C89219l.m154721d("0", "");
                                String string = C77901a.f174776a.getString(resourceId, "0");
                                C89219l.m154716b(string, "");
                                if (tagsUpdatedAt.compareTo(string) > 0) {
                                    z = true;
                                    lVar.f174907a.add(resourceId);
                                    t7.setShowRedDot(z);
                                }
                            }
                            z = false;
                            t7.setShowRedDot(z);
                        }
                    }
                    this.f174875b.f174871b.mo121607c(this.f174875b.f174872c);
                    C41097b.m82776a(this.f174875b.f174871b.f174819b, true);
                    ArrayList arrayList2 = new ArrayList();
                    this.f174875b.f174871b.mo121596a(this.f174875b.f174872c, arrayList2);
                    C77971n<BeautyComposerInfo> nVar = new C77971n<>();
                    this.f174875b.f174871b.mo121595a((List<ComposerBeauty>) arrayList2, nVar);
                    return nVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify m136088a(com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtra r5) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77927h.m136088a(com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra):com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify");
    }

    /* renamed from: c */
    public final void mo121607c(List<BeautyCategory> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            for (T t : it.next().getBeautyList()) {
                if (t.isCollectionType()) {
                    List<ComposerBeauty> childList = t.getChildList();
                    if (!(childList == null || childList.isEmpty() || childList == null)) {
                        for (T t2 : childList) {
                            t2.setDownloadState(this.f174823f.mo121556b(t2));
                        }
                    }
                } else {
                    t.setDownloadState(this.f174823f.mo121556b(t));
                }
            }
        }
    }

    /* renamed from: d */
    public final C20375am<Integer, Integer, Boolean> mo121608d(ComposerBeauty composerBeauty) {
        int i;
        boolean z;
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        int i2 = 0;
        if (items == null || items.isEmpty() || items == null) {
            i = 0;
            z = false;
        } else {
            C77974h.C77975a b = C77974h.m136235b(new C77974h.C77975a(items.get(0).getDoubleDirection(), 100, 0, items.get(0).getMax(), items.get(0).getMin(), mo121583a(composerBeauty, items.get(0).getTag(), (float) items.get(0).getValue()), 0, 396));
            composerBeauty.setDefaultProgress(b.f174916h);
            i2 = b.f174916h;
            i = b.f174911c;
            z = b.f174917i;
        }
        return new C20375am<>(Integer.valueOf(i2), Integer.valueOf(i), Boolean.valueOf(z));
    }

    /* renamed from: n */
    public final boolean mo121630n(ComposerBeauty composerBeauty) {
        C77903b bVar = this.f174823f;
        C89219l.m154721d(composerBeauty, "");
        if (C77878d.m135993a(composerBeauty.getEffect().getEffectId()) < 0 || composerBeauty.isLocalItem()) {
            return true;
        }
        boolean c = bVar.f174782a.mo78918c(composerBeauty.getEffect());
        if (c) {
            return c;
        }
        C41093a.m82762a("isDownloaded: " + c + ",effect= " + composerBeauty.getEffect());
        return c;
    }

    /* renamed from: a */
    private final BeautyCategoryExtra m136089a(EffectCategoryResponse effectCategoryResponse) {
        boolean z;
        String extra = effectCategoryResponse.getExtra();
        if (extra == null || extra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C41093a.m82765c("LJT parseBeautyCategoryExtra: " + effectCategoryResponse.getExtra());
            return null;
        }
        try {
            BeautyCategoryExtra beautyCategoryExtra = (BeautyCategoryExtra) this.f174834q.mo46670a(effectCategoryResponse.getExtra(), BeautyCategoryExtra.class);
            C41093a.m82765c("LJT parseBeautyCategoryExtra: ".concat(String.valueOf(beautyCategoryExtra)));
            AbstractC77967m.AbstractC77969b bVar = this.f174825h;
            BeautyFilterConfig beautyFilterConfig = this.f174833p;
            C89219l.m154716b(beautyCategoryExtra, "");
            if (bVar.mo121535a(beautyFilterConfig, beautyCategoryExtra) && this.f174825h.mo121537b(this.f174833p, beautyCategoryExtra)) {
                return beautyCategoryExtra;
            }
            C41093a.m82765c("LJT parseBeautyCategoryExtra: categoryExtra assign null");
            return null;
        } catch (Exception e) {
            C41093a.m82762a("parseBeautyCategoryExtra , " + Log.getStackTraceString(e));
            return null;
        }
    }

    /* renamed from: b */
    public final void mo121603b(List<BeautyCategory> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            for (T t : it.next().getBeautyList()) {
                if (t.isCollectionType()) {
                    List<ComposerBeauty> childList = t.getChildList();
                    if (!(childList == null || childList.isEmpty() || childList == null)) {
                        arrayList.addAll(childList);
                    }
                } else {
                    arrayList.add(t);
                }
            }
        }
        AbstractC88924h.m154135a(arrayList).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143205b(new C77934e(this)).mo143195a(C88392a.m153583a()).mo143205b(new C77935f(this)).mo143195a(C88925a.m154180b(C88946a.f201991c)).mo143202b(new C77936g(this));
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo> mo121601b(com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty r11) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77927h.mo121601b(com.ss.android.ugc.aweme.beauty.ComposerBeauty):java.util.List");
    }

    /* renamed from: a */
    private final synchronized void m136091a(EnumC77817a aVar) {
        MethodCollector.m26663i(8633);
        ArrayList arrayList = new ArrayList();
        C41093a.m82765c("LJT initComposerNodes: start");
        C41093a.m82765c("LJT initComposerNodes: allData size is " + this.f174829l.size());
        for (T t : this.f174829l) {
            C41093a.m82765c("LJT initComposerNodes: add " + t.getCategoryResponse().getName() + " to result");
            C41093a.m82765c("LJT initComposerNodes: panelType is " + t.getBeautyCategoryExtra().getPanelType() + ", genderFlag is: " + aVar.getFlag());
            if (C89219l.m154714a((Object) t.getBeautyCategoryExtra().getPanelType(), (Object) aVar.getFlag()) || C89219l.m154714a((Object) t.getBeautyCategoryExtra().getPanelType(), (Object) EnumC77817a.ALL.getFlag())) {
                arrayList.add(t);
            }
        }
        C41093a.m82765c("LJT initComposerNodes: result size is " + arrayList.size());
        C41093a.m82765c("LJT initComposerNodes: allData size is " + this.f174829l.size());
        if (C89219l.m154714a(this.f174818a, arrayList)) {
            MethodCollector.m26664o(8633);
            return;
        }
        C89219l.m154721d(arrayList, "");
        this.f174818a = arrayList;
        C41093a.m82765c("LJT initComposerNodes: assign result to panelData");
        C41097b.m82776a(this.f174836s, true);
        AbstractC89568bz unused = C89624i.m155555a(this.f174842y, null, null, new C77947r(this, arrayList, null), 3);
        MethodCollector.m26664o(8633);
    }

    /* renamed from: a */
    private final List<ComposerBeauty> m136090a(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra) {
        ArrayList arrayList = new ArrayList();
        for (Effect effect : effectCategoryResponse.getTotalEffects()) {
            ComposerBeauty a = m136086a(effect, effectCategoryResponse.getId(), beautyCategoryExtra.getExclusive(), null, null, null, beautyCategoryExtra);
            if (a != null) {
                arrayList.add(a);
            }
        }
        NoneComposer noneItem = this.f174833p.getNoneItem();
        if (noneItem != null) {
            ComposerBeautyExtra composerBeautyExtra = new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null);
            composerBeautyExtra.setNone(true);
            Effect effect2 = new Effect(null, 1, null);
            effect2.setEffectId(noneItem.getEffectId());
            effect2.setResourceId(noneItem.getResourceId());
            effect2.setName(noneItem.getItemName());
            effect2.setUnzipPath("");
            arrayList.add(0, new ComposerBeauty(effect2, composerBeautyExtra, new ComposerBeautyExtraBeautify(null, null, 3, null), null, false, false, null, null, null, null, false, false, false, 0, 0, false, false, true, noneItem.getIconResId(), 0, 0, new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null), false, 5898232, null));
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: a */
    public final float mo121583a(ComposerBeauty composerBeauty, String str, float f) {
        C89219l.m154721d(composerBeauty, "");
        return this.f174832o.mo110215a(composerBeauty, this.f174828k, str, f);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m
    /* renamed from: b */
    public final void mo121602b(ComposerBeauty composerBeauty, String str, float f) {
        C89219l.m154721d(composerBeauty, "");
        this.f174832o.mo110218b(composerBeauty, this.f174828k, str, f);
    }

    public C77927h(AbstractC78055e eVar, BeautyFilterConfig beautyFilterConfig, C27910f fVar, AbstractC89171a<? extends AbstractC84398d> aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(beautyFilterConfig, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f174832o = eVar;
        this.f174833p = beautyFilterConfig;
        this.f174834q = fVar;
        this.f174838u = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C77937h(aVar));
        this.f174822e = new C41099d<>();
        this.f174823f = new C77903b(m136095v());
        C41099d<C0484a<String, Integer>> dVar = new C41099d<>();
        dVar.setValue(new C0484a<>());
        this.f174824g = dVar;
        this.f174839v = new C41099d<>();
        this.f174825h = new C77884a();
        this.f174840w = C89250i.m154773a((AbstractC89171a) new C77930a(this));
        this.f174826i = new C77965l();
        this.f174841x = new C77973p();
        this.f174827j = true;
        this.f174842y = C77976a.m136236a();
        this.f174828k = EnumC77817a.FEMALE;
        this.f174829l = new ArrayList();
        m136096w().mo121578a(this.f174828k);
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C41096a.f96058a, null, new C779281(this, null), 2);
        this.f174843z = true;
        this.f174830m = new C41099d<>();
        this.f174831n = new C77933d(this);
    }

    /* renamed from: a */
    private final ComposerBeauty m136086a(Effect effect, String str, boolean z, String str2, String str3, String str4, BeautyCategoryExtra beautyCategoryExtra) {
        ComposerBeautyExtraBeautify a;
        C89219l.m154721d(effect, "");
        boolean z2 = true;
        if (1 != effect.getEffectType()) {
            z2 = false;
        }
        if (z2) {
            ArrayList arrayList = new ArrayList();
            List<Effect> childEffects = effect.getChildEffects();
            if (childEffects != null) {
                Iterator<T> it = childEffects.iterator();
                while (it.hasNext()) {
                    ComposerBeauty a2 = m136086a(it.next(), str, z, effect.getEffectId(), effect.getName(), effect.getResourceId(), beautyCategoryExtra);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            ComposerBeauty composerBeauty = new ComposerBeauty(effect, new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null), new ComposerBeautyExtraBeautify(null, null, 3, null), str, z, true, null, null, null, arrayList, false, false, false, 0, 0, false, false, false, 0, 0, 0, beautyCategoryExtra, false, 6290880, null);
            composerBeauty.setDownloadState(this.f174823f.mo121556b(composerBeauty));
            return composerBeauty;
        }
        ComposerBeautyExtra a3 = m136087a(effect);
        if (a3 == null || (a = m136088a(a3)) == null) {
            return null;
        }
        ComposerBeauty composerBeauty2 = new ComposerBeauty(effect, a3, a, str, z, false, str2, str3, str4, null, false, false, false, 0, 0, false, false, false, 0, 0, 0, beautyCategoryExtra, false, 6290944, null);
        composerBeauty2.setDownloadState(this.f174823f.mo121556b(composerBeauty2));
        return composerBeauty2;
    }
}
