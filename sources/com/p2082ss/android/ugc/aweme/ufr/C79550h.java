package com.p2082ss.android.ugc.aweme.ufr;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.h */
public final class C79550h {

    /* renamed from: a */
    boolean f178525a;

    /* renamed from: b */
    private boolean f178526b = true;

    static {
        Covode.recordClassIndex(92754);
    }

    /* renamed from: c */
    public static boolean m138265c(Map<EnumC79549g, Boolean> map) {
        return C89219l.m154714a((Object) map.get(EnumC79549g.CHECK_ACTUAL_PERMISSION), (Object) false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.h$e */
    public static final class C79555e<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

        /* renamed from: a */
        public static final C79555e f178534a = new C79555e();

        static {
            Covode.recordClassIndex(92759);
        }

        C79555e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C79547e eVar = (C79547e) obj;
            C89219l.m154719c(eVar, "");
            return AbstractC88979t.m154310b(new C79546d(EnumC79549g.SYNC_STATUS, eVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.h$f */
    public static final class C79556f<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

        /* renamed from: a */
        public static final C79556f f178535a = new C79556f();

        static {
            Covode.recordClassIndex(92760);
        }

        C79556f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C79547e eVar = (C79547e) obj;
            C89219l.m154719c(eVar, "");
            return AbstractC88979t.m154310b(new C79546d(EnumC79549g.UPLOAD, eVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.h$a */
    static final class C79551a<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C79550h f178527a;

        /* renamed from: b */
        final /* synthetic */ AbstractC79495a f178528b;

        static {
            Covode.recordClassIndex(92755);
        }

        C79551a(C79550h hVar, AbstractC79495a aVar) {
            this.f178527a = hVar;
            this.f178528b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC88979t<C79546d> a;
            C79547e eVar = (C79547e) obj;
            C89219l.m154719c(eVar, "");
            EnumC79549g gVar = EnumC79549g.REQUEST_ACTUAL_PERMISSION;
            eVar.f178519b = 1;
            AbstractC88979t<C79546d> a2 = C79550h.m138259a(gVar, eVar);
            if (eVar.f178518a) {
                AbstractC79495a aVar = this.f178528b;
                a = C79550h.m138258a(aVar, eVar, this.f178527a.mo123091a(aVar));
            } else {
                a = C79550h.m138257a(this.f178528b, eVar);
            }
            return AbstractC88979t.m154295a(a2, a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.h$b */
    static final class C79552b<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C79550h f178529a;

        /* renamed from: b */
        final /* synthetic */ AbstractC79495a f178530b;

        static {
            Covode.recordClassIndex(92756);
        }

        C79552b(C79550h hVar, AbstractC79495a aVar) {
            this.f178529a = hVar;
            this.f178530b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC88979t<C79546d> a;
            C79547e eVar = (C79547e) obj;
            C89219l.m154719c(eVar, "");
            EnumC79549g gVar = EnumC79549g.REQUEST_UID_PERMISSION;
            eVar.f178519b = 2;
            AbstractC88979t<C79546d> a2 = C79550h.m138259a(gVar, eVar);
            if (eVar.f178518a) {
                AbstractC79495a aVar = this.f178530b;
                a = C79550h.m138258a(aVar, eVar, this.f178529a.mo123091a(aVar));
            } else {
                a = C79550h.m138257a(this.f178530b, eVar);
            }
            return AbstractC88979t.m154295a(a2, a);
        }
    }

    /* renamed from: b */
    private final AbstractC88979t<C79546d> m138262b(AbstractC79495a aVar) {
        AbstractC88979t<C79546d> a = AbstractC88979t.m154296a(aVar.mo123077e(), aVar.mo123078f(), new C79553c(this)).mo143261a(C88392a.m153583a()).mo143267a((AbstractC88434g) new C79554d(this, aVar), false);
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* renamed from: c */
    private final AbstractC88979t<C79546d> m138264c(AbstractC79495a aVar) {
        AbstractC88979t<C79546d> a = AbstractC88979t.m154296a(aVar.mo123077e(), aVar.mo123078f(), new C79557g(this)).mo143261a(C88392a.m153583a()).mo143267a((AbstractC88434g) new C79558h(this, aVar), false);
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* renamed from: b */
    public static boolean m138263b(Map<EnumC79549g, Boolean> map) {
        if (!C89219l.m154714a((Object) map.get(EnumC79549g.CHECK_UID_PERMISSION), (Object) false) || !C89219l.m154714a((Object) map.get(EnumC79549g.CHECK_ACTUAL_PERMISSION), (Object) true)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.h$d */
    public static final class C79554d<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C79550h f178532a;

        /* renamed from: b */
        final /* synthetic */ AbstractC79495a f178533b;

        static {
            Covode.recordClassIndex(92758);
        }

        C79554d(C79550h hVar, AbstractC79495a aVar) {
            this.f178532a = hVar;
            this.f178533b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Map map = (Map) obj;
            C89219l.m154719c(map, "");
            if (C79550h.m138261a(map)) {
                return AbstractC88979t.m154297a(C79550h.m138259a(EnumC79549g.CHECK_UID_PERMISSION, new C79547e(true, 0, 0, null, 14)), C79550h.m138259a(EnumC79549g.CHECK_ACTUAL_PERMISSION, new C79547e(true, 0, 0, null, 14)), this.f178532a.mo123091a(this.f178533b));
            }
            if (C79550h.m138263b(map)) {
                EnumC79549g gVar = EnumC79549g.CHECK_UID_PERMISSION;
                Boolean bool = (Boolean) map.get(EnumC79549g.CHECK_UID_PERMISSION);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    z3 = false;
                }
                AbstractC88979t<C79546d> a = C79550h.m138259a(gVar, new C79547e(z3, 0, 0, null, 14));
                EnumC79549g gVar2 = EnumC79549g.CHECK_ACTUAL_PERMISSION;
                Boolean bool2 = (Boolean) map.get(EnumC79549g.CHECK_ACTUAL_PERMISSION);
                if (bool2 != null) {
                    z4 = bool2.booleanValue();
                } else {
                    z4 = false;
                }
                return AbstractC88979t.m154295a(a, C79550h.m138259a(gVar2, new C79547e(z4, 0, 0, null, 14)));
            } else if (!C79550h.m138265c(map)) {
                return AbstractC88979t.m154310b(new C79546d(EnumC79549g.UNKNOW, new C79547e(false, 0, 0, null, 14)));
            } else {
                EnumC79549g gVar3 = EnumC79549g.CHECK_UID_PERMISSION;
                Boolean bool3 = (Boolean) map.get(EnumC79549g.CHECK_UID_PERMISSION);
                if (bool3 != null) {
                    z = bool3.booleanValue();
                } else {
                    z = false;
                }
                AbstractC88979t<C79546d> a2 = C79550h.m138259a(gVar3, new C79547e(z, 0, 0, null, 14));
                EnumC79549g gVar4 = EnumC79549g.CHECK_ACTUAL_PERMISSION;
                Boolean bool4 = (Boolean) map.get(EnumC79549g.CHECK_ACTUAL_PERMISSION);
                if (bool4 != null) {
                    z2 = bool4.booleanValue();
                } else {
                    z2 = false;
                }
                return AbstractC88979t.m154295a(a2, C79550h.m138259a(gVar4, new C79547e(z2, 0, 0, null, 14)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.h$h */
    public static final class C79558h<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C79550h f178537a;

        /* renamed from: b */
        final /* synthetic */ AbstractC79495a f178538b;

        static {
            Covode.recordClassIndex(92762);
        }

        C79558h(C79550h hVar, AbstractC79495a aVar) {
            this.f178537a = hVar;
            this.f178538b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            AbstractC88979t<R> a;
            Map map = (Map) obj;
            C89219l.m154719c(map, "");
            if (C79550h.m138261a(map)) {
                return AbstractC88979t.m154297a(C79550h.m138259a(EnumC79549g.CHECK_UID_PERMISSION, new C79547e(true, 0, 0, null, 14)), C79550h.m138259a(EnumC79549g.CHECK_ACTUAL_PERMISSION, new C79547e(true, 0, 0, null, 14)), this.f178537a.mo123091a(this.f178538b));
            }
            if (C79550h.m138263b(map)) {
                EnumC79549g gVar = EnumC79549g.CHECK_UID_PERMISSION;
                Boolean bool = (Boolean) map.get(EnumC79549g.CHECK_UID_PERMISSION);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    z3 = false;
                }
                AbstractC88979t<C79546d> a2 = C79550h.m138259a(gVar, new C79547e(z3, 0, 0, null, 14));
                EnumC79549g gVar2 = EnumC79549g.CHECK_ACTUAL_PERMISSION;
                Boolean bool2 = (Boolean) map.get(EnumC79549g.CHECK_ACTUAL_PERMISSION);
                if (bool2 != null) {
                    z4 = bool2.booleanValue();
                } else {
                    z4 = false;
                }
                AbstractC88979t<C79546d> a3 = C79550h.m138259a(gVar2, new C79547e(z4, 0, 0, null, 14));
                C79550h hVar = this.f178537a;
                AbstractC79495a aVar = this.f178538b;
                if (hVar.f178525a) {
                    a = AbstractC88979t.m154295a(C79550h.m138259a(EnumC79549g.REQUEST_UID_PERMISSION, new C79547e(true, 0, 0, null, 14)), C79550h.m138258a(aVar, new C79547e(true, 0, 0, null, 14), hVar.mo123091a(aVar)));
                    C89219l.m154709a((Object) a, "");
                } else {
                    a = aVar.mo123079g().mo143261a(C88392a.m153583a()).mo143267a((AbstractC88434g<? super C79547e, ? extends AbstractC88984x<? extends R>>) new C79552b(hVar, aVar), false);
                    C89219l.m154709a((Object) a, "");
                }
                return AbstractC88979t.m154297a(a2, a3, a);
            } else if (!C79550h.m138265c(map)) {
                return AbstractC88979t.m154310b(new C79546d(EnumC79549g.UNKNOW, new C79547e(false, 0, 0, null, 14)));
            } else {
                EnumC79549g gVar3 = EnumC79549g.CHECK_UID_PERMISSION;
                Boolean bool3 = (Boolean) map.get(EnumC79549g.CHECK_UID_PERMISSION);
                if (bool3 != null) {
                    z = bool3.booleanValue();
                } else {
                    z = false;
                }
                AbstractC88979t<C79546d> a4 = C79550h.m138259a(gVar3, new C79547e(z, 0, 0, null, 14));
                EnumC79549g gVar4 = EnumC79549g.CHECK_ACTUAL_PERMISSION;
                Boolean bool4 = (Boolean) map.get(EnumC79549g.CHECK_ACTUAL_PERMISSION);
                if (bool4 != null) {
                    z2 = bool4.booleanValue();
                } else {
                    z2 = false;
                }
                AbstractC88979t<C79546d> a5 = C79550h.m138259a(gVar4, new C79547e(z2, 0, 0, null, 14));
                C79550h hVar2 = this.f178537a;
                AbstractC79495a aVar2 = this.f178538b;
                AbstractC88979t<R> a6 = aVar2.mo123080h().mo143261a(C88392a.m153583a()).mo143267a((AbstractC88434g<? super C79547e, ? extends AbstractC88984x<? extends R>>) new C79551a(hVar2, aVar2), false);
                C89219l.m154709a((Object) a6, "");
                return AbstractC88979t.m154297a(a4, a5, a6);
            }
        }
    }

    /* renamed from: a */
    public static boolean m138261a(Map<EnumC79549g, Boolean> map) {
        if (!C89219l.m154714a((Object) map.get(EnumC79549g.CHECK_UID_PERMISSION), (Object) true) || !C89219l.m154714a((Object) map.get(EnumC79549g.CHECK_ACTUAL_PERMISSION), (Object) true)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final AbstractC88979t<C79546d> mo123091a(AbstractC79495a aVar) {
        if (this.f178526b) {
            AbstractC88979t<C79546d> a = AbstractC88979t.m154295a(aVar.mo123081i().mo143261a(C88392a.m153583a()).mo143267a((AbstractC88434g<? super C79547e, ? extends AbstractC88984x<? extends R>>) C79556f.f178535a, false), AbstractC88979t.m154310b(new C79546d(EnumC79549g.AUTHORIZED, new C79547e(true, 0, 0, null, 14))));
            C89219l.m154709a((Object) a, "");
            return a;
        }
        AbstractC88979t<C79546d> b = AbstractC88979t.m154310b(new C79546d(EnumC79549g.AUTHORIZED, new C79547e(true, 0, 0, null, 14)));
        C89219l.m154709a((Object) b, "");
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.h$c */
    public static final class C79553c<T1, T2, R> implements AbstractC88430c<C79547e, C79547e, Map<EnumC79549g, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C79550h f178531a;

        static {
            Covode.recordClassIndex(92757);
        }

        C79553c(C79550h hVar) {
            this.f178531a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Map<EnumC79549g, ? extends Boolean> mo9210a(C79547e eVar, C79547e eVar2) {
            C79547e eVar3 = eVar;
            C79547e eVar4 = eVar2;
            C89219l.m154719c(eVar3, "");
            C89219l.m154719c(eVar4, "");
            return C79550h.m138260a(eVar3.f178518a, eVar4.f178518a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.h$g */
    public static final class C79557g<T1, T2, R> implements AbstractC88430c<C79547e, C79547e, Map<EnumC79549g, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C79550h f178536a;

        static {
            Covode.recordClassIndex(92761);
        }

        C79557g(C79550h hVar) {
            this.f178536a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Map<EnumC79549g, ? extends Boolean> mo9210a(C79547e eVar, C79547e eVar2) {
            C79547e eVar3 = eVar;
            C79547e eVar4 = eVar2;
            C89219l.m154719c(eVar3, "");
            C89219l.m154719c(eVar4, "");
            return C79550h.m138260a(eVar3.f178518a, eVar4.f178518a);
        }
    }

    /* renamed from: a */
    public static AbstractC88979t<C79546d> m138257a(AbstractC79495a aVar, C79547e eVar) {
        AbstractC88979t<R> a = aVar.mo123072a(eVar.f178518a, eVar.f178519b).mo143267a((AbstractC88434g<? super C79547e, ? extends AbstractC88984x<? extends R>>) C79555e.f178534a, false);
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* renamed from: a */
    public static AbstractC88979t<C79546d> m138259a(EnumC79549g gVar, C79547e eVar) {
        AbstractC88979t<C79546d> b = AbstractC88979t.m154310b(new C79546d(gVar, eVar));
        C89219l.m154709a((Object) b, "");
        return b;
    }

    /* renamed from: a */
    public static Map<EnumC79549g, Boolean> m138260a(boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z && z2) {
            linkedHashMap.put(EnumC79549g.CHECK_UID_PERMISSION, true);
            linkedHashMap.put(EnumC79549g.CHECK_ACTUAL_PERMISSION, true);
        } else if (z) {
            if (!z2) {
                linkedHashMap.put(EnumC79549g.CHECK_UID_PERMISSION, true);
                linkedHashMap.put(EnumC79549g.CHECK_ACTUAL_PERMISSION, false);
            }
        } else if (z2) {
            linkedHashMap.put(EnumC79549g.CHECK_UID_PERMISSION, false);
            linkedHashMap.put(EnumC79549g.CHECK_ACTUAL_PERMISSION, true);
        } else {
            linkedHashMap.put(EnumC79549g.CHECK_UID_PERMISSION, false);
            linkedHashMap.put(EnumC79549g.CHECK_ACTUAL_PERMISSION, false);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static AbstractC88979t<C79546d> m138258a(AbstractC79495a aVar, C79547e eVar, AbstractC88979t<C79546d> tVar) {
        AbstractC88979t<C79546d> a = AbstractC88979t.m154295a(m138257a(aVar, eVar), tVar);
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* renamed from: a */
    public static AbstractC88979t<C79546d> m138256a(Context context, Class<? extends AbstractC79495a> cls, String str, String str2, String str3) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        AbstractC79495a aVar = (AbstractC79495a) cls.newInstance();
        aVar.mo123073a(context, str, str2, str3, false, true, null);
        C89219l.m154709a((Object) aVar, "");
        return m138257a(aVar, new C79547e(false, 3, 0, null, 12));
    }

    /* renamed from: a */
    public final AbstractC88979t<C79546d> mo123090a(Context context, Class<? extends AbstractC79495a> cls, String str, String str2, String str3, boolean z, boolean z2, boolean z3, Map<String, String> map) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f178526b = z3;
        AbstractC79495a aVar = (AbstractC79495a) cls.newInstance();
        aVar.mo123073a(context, str, str2, str3, z2, z3, map);
        if (!z) {
            C89219l.m154709a((Object) aVar, "");
            return m138262b(aVar);
        }
        this.f178525a = z2;
        C89219l.m154709a((Object) aVar, "");
        return m138264c(aVar);
    }
}
