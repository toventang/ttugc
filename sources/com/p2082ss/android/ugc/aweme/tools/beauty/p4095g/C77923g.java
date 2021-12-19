package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77852b;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.g */
public final class C77923g {

    /* renamed from: c */
    public static final Keva f174811c;

    /* renamed from: d */
    public static final C77924a f174812d = new C77924a((byte) 0);

    /* renamed from: a */
    public final C77971n<C77852b> f174813a = new C77971n<>();

    /* renamed from: b */
    public EnumC77817a f174814b = EnumC77817a.FEMALE;

    /* renamed from: e */
    private final BeautyFilterConfig f174815e;

    /* renamed from: f */
    private final C27910f f174816f;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.g$a */
    public static final class C77924a {
        static {
            Covode.recordClassIndex(91013);
        }

        private C77924a() {
        }

        public /* synthetic */ C77924a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.g$b */
    public static final class C77925b extends C27895a<List<C77852b>> {
        static {
            Covode.recordClassIndex(91014);
        }

        C77925b() {
        }
    }

    static {
        Covode.recordClassIndex(91012);
        Keva repo = Keva.getRepo("ulike_repo");
        C89219l.m154716b(repo, "");
        f174811c = repo;
    }

    /* renamed from: c */
    private final String m136079c() {
        return this.f174815e.getSequenceKey() + this.f174814b.getFlag() + "_key_beauty_sequence";
    }

    /* renamed from: d */
    private final List<C77852b> m136080d() {
        String string = f174811c.getString(m136079c(), null);
        C41093a.m82765c("get sequence: ".concat(String.valueOf(string)));
        try {
            return (List) this.f174816f.mo46671a(string, new C77925b().type);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo121577a() {
        MethodCollector.m26663i(8358);
        this.f174813a.clear();
        List<C77852b> d = m136080d();
        if (d != null) {
            C41093a.m82765c("init sequence: ".concat(String.valueOf(d)));
            this.f174813a.addAll(C89070n.m154580f((Iterable) d));
            MethodCollector.m26664o(8358);
            return;
        }
        MethodCollector.m26664o(8358);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo121581b() {
        MethodCollector.m26663i(8519);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                arrayList.addAll(this.f174813a);
            } catch (Throwable th) {
                MethodCollector.m26664o(8519);
                throw th;
            }
        }
        String b = this.f174816f.mo46674b(arrayList);
        C89219l.m154716b(b, "");
        C41093a.m82765c("save sequence:".concat(String.valueOf(b)));
        f174811c.storeString(m136079c(), b);
        MethodCollector.m26664o(8519);
    }

    /* renamed from: a */
    public final void mo121578a(EnumC77817a aVar) {
        C89219l.m154721d(aVar, "");
        this.f174814b = aVar;
    }

    /* renamed from: a */
    public final void mo121579a(C77852b bVar) {
        MethodCollector.m26663i(8517);
        C89219l.m154721d(bVar, "");
        synchronized (this) {
            try {
                this.f174813a.add(bVar);
            } catch (Throwable th) {
                MethodCollector.m26664o(8517);
                throw th;
            }
        }
        mo121581b();
        MethodCollector.m26664o(8517);
    }

    public C77923g(BeautyFilterConfig beautyFilterConfig, C27910f fVar) {
        C89219l.m154721d(beautyFilterConfig, "");
        C89219l.m154721d(fVar, "");
        this.f174815e = beautyFilterConfig;
        this.f174816f = fVar;
        mo121577a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.g$c */
    public static final class C77926c<T> implements Comparator<ComposerBeauty> {

        /* renamed from: a */
        final /* synthetic */ C77923g f174817a;

        static {
            Covode.recordClassIndex(91015);
        }

        C77926c(C77923g gVar) {
            this.f174817a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ComposerBeauty composerBeauty, ComposerBeauty composerBeauty2) {
            return this.f174817a.f174813a.indexOf(new C77852b(composerBeauty.getEffect().getEffectId())) - this.f174817a.f174813a.indexOf(new C77852b(composerBeauty2.getEffect().getEffectId()));
        }
    }

    /* renamed from: a */
    public final synchronized void mo121580a(List<ComposerBeauty> list, AbstractC89172b<? super ComposerBeauty, Boolean> bVar) {
        T t;
        T t2;
        T t3;
        MethodCollector.m26663i(8662);
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        C41093a.m82765c("sort sequence: " + this.f174813a);
        C89070n.m154530a((List) list, (Comparator) new C77926c(this));
        Iterator<ComposerBeauty> it = list.iterator();
        while (true) {
            C77852b bVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            ComposerBeauty next = it.next();
            if (bVar.invoke(next).booleanValue()) {
                Iterator<C77852b> it2 = this.f174813a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C77852b next2 = it2.next();
                    if (C89219l.m154714a((Object) next.getEffect().getEffectId(), (Object) next2.f174660a)) {
                        bVar2 = next2;
                        break;
                    }
                }
                if (bVar2 == null) {
                    it.remove();
                }
            }
        }
        int indexOf = this.f174813a.indexOf(new C77852b("EFFECT_ID_TYPE_FILTER", 2));
        if (indexOf >= 0 && indexOf < this.f174813a.size()) {
            ComposerBeauty composerBeauty = new ComposerBeauty(new Effect(null, 1, null), new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null), new ComposerBeautyExtraBeautify(null, null, 3, null), null, false, false, null, null, null, null, false, false, false, 0, 0, false, false, false, 0, 0, 0, new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null), false, 6291448, null);
            composerBeauty.getEffect().setEffectId("EFFECT_ID_TYPE_FILTER");
            if (indexOf == this.f174813a.size() - 1) {
                list.add(composerBeauty);
                MethodCollector.m26664o(8662);
                return;
            }
            boolean z = false;
            if (indexOf == 0) {
                int size = this.f174813a.size();
                int i = 1;
                while (true) {
                    if (i < size) {
                        if (z) {
                            break;
                        }
                        Object obj = this.f174813a.get(i);
                        C89219l.m154716b(obj, "");
                        C77852b bVar3 = (C77852b) obj;
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                t3 = null;
                                break;
                            }
                            t3 = it3.next();
                            if (C89219l.m154714a((Object) t3.getEffect().getEffectId(), (Object) bVar3.f174660a)) {
                                break;
                            }
                        }
                        T t4 = t3;
                        if (t4 != null) {
                            list.add(list.indexOf(t4), composerBeauty);
                            z = true;
                        }
                        i++;
                    } else if (!z) {
                        list.add(composerBeauty);
                        MethodCollector.m26664o(8662);
                        return;
                    }
                }
            } else {
                int i2 = indexOf - 1;
                while (true) {
                    if (i2 <= 0) {
                        if (z) {
                            break;
                        }
                        Object obj2 = this.f174813a.get(i2);
                        C89219l.m154716b(obj2, "");
                        C77852b bVar4 = (C77852b) obj2;
                        Iterator<T> it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it4.next();
                            if (C89219l.m154714a((Object) t2.getEffect().getEffectId(), (Object) bVar4.f174660a)) {
                                break;
                            }
                        }
                        T t5 = t2;
                        if (t5 != null) {
                            list.add(list.indexOf(t5) + 1, composerBeauty);
                            z = true;
                        }
                        i2++;
                    } else if (!z) {
                        int i3 = indexOf + 1;
                        int size2 = this.f174813a.size();
                        while (true) {
                            if (i3 < size2) {
                                if (z) {
                                    break;
                                }
                                Object obj3 = this.f174813a.get(i3);
                                C89219l.m154716b(obj3, "");
                                C77852b bVar5 = (C77852b) obj3;
                                Iterator<T> it5 = list.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it5.next();
                                    if (C89219l.m154714a((Object) t.getEffect().getEffectId(), (Object) bVar5.f174660a)) {
                                        break;
                                    }
                                }
                                T t6 = t;
                                if (t6 != null) {
                                    list.add(list.indexOf(t6), composerBeauty);
                                    z = true;
                                }
                                i3++;
                            } else if (!z) {
                                list.add(composerBeauty);
                            }
                        }
                    }
                }
            }
        }
        MethodCollector.m26664o(8662);
    }
}
