package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45850a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.android.AbstractC89522b;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.a */
public final class C46079a extends C45850a {

    /* renamed from: c */
    public InnerEffectTextLayoutConfig f107315c;

    /* renamed from: d */
    public Set<C46091h> f107316d;

    /* renamed from: e */
    public final C46090g f107317e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.a$a */
    public static final class C46080a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f107318a;

        /* renamed from: b */
        int f107319b;

        /* renamed from: c */
        final /* synthetic */ C46079a f107320c;

        static {
            Covode.recordClassIndex(54638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46080a(C46079a aVar, AbstractC89124d dVar) {
            super(dVar);
            this.f107320c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f107318a = obj;
            this.f107319b |= Integer.MIN_VALUE;
            return this.f107320c.mo78272a(this);
        }
    }

    static {
        Covode.recordClassIndex(54637);
    }

    public final int hashCode() {
        return this.f106810b.getEffectId().hashCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45850a
    /* renamed from: a */
    public final boolean mo77203a() {
        if (this.f107317e.f107334a || this.f107317e.f107335b || super.mo77203a()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46079a) {
            return C89219l.m154714a((Object) ((C45850a) obj).f106810b.getEffectId(), (Object) this.f106810b.getEffectId());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.a$b */
    public static final class C46081b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f107321a;

        /* renamed from: b */
        final /* synthetic */ C46079a f107322b;

        /* renamed from: c */
        final /* synthetic */ List f107323c;

        /* renamed from: d */
        final /* synthetic */ Context f107324d;

        static {
            Covode.recordClassIndex(54639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46081b(C46079a aVar, List list, Context context, AbstractC89124d dVar) {
            super(2, dVar);
            this.f107322b = aVar;
            this.f107323c = list;
            this.f107324d = context;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46081b(this.f107322b, this.f107323c, this.f107324d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46081b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f107321a;
            if (i == 0) {
                C89382r.m154942a(obj);
                if (!this.f107322b.f107317e.f107334a) {
                    final OuterEffectTextLayoutConfig outerEffectTextLayoutConfig = (OuterEffectTextLayoutConfig) C45866d.m88489b().mo46669a((Reader) new FileReader(this.f107322b.f106810b.getUnzipPath() + File.separator + "effect_text.json"), OuterEffectTextLayoutConfig.class);
                    AbstractC89522b bVar = C31068c.f74429a;
                    C460821 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                        /* class com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46079a.C46081b.C460821 */

                        /* renamed from: a */
                        int f107325a;

                        /* renamed from: b */
                        final /* synthetic */ C46081b f107326b;

                        static {
                            Covode.recordClassIndex(54640);
                        }

                        {
                            this.f107326b = r2;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return 

                            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
                                if (((java.lang.Boolean) r3).booleanValue() != false) goto L_0x0042;
                             */
                            /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
                            /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                            /* renamed from: a */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object mo78272a(p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r6) {
                                /*
                                    r5 = this;
                                    boolean r0 = r6 instanceof com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46079a.C46080a
                                    if (r0 == 0) goto L_0x0044
                                    r4 = r6
                                    com.ss.android.ugc.aweme.editSticker.text.bean.a$a r4 = (com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46079a.C46080a) r4
                                    int r0 = r4.f107319b
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r0 = r0 & r1
                                    if (r0 == 0) goto L_0x0044
                                    int r0 = r4.f107319b
                                    int r0 = r0 - r1
                                    r4.f107319b = r0
                                L_0x0013:
                                    java.lang.Object r3 = r4.f107318a
                                    h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                                    int r0 = r4.f107319b
                                    r1 = 1
                                    if (r0 == 0) goto L_0x002e
                                    if (r0 != r1) goto L_0x004a
                                    p4600h.C89382r.m154942a(r3)
                                L_0x0021:
                                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                                    boolean r0 = r3.booleanValue()
                                    if (r0 != 0) goto L_0x0042
                                L_0x0029:
                                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                                    return r0
                                L_0x002e:
                                    p4600h.C89382r.m154942a(r3)
                                    boolean r0 = r5.mo77203a()
                                    if (r0 != 0) goto L_0x0042
                                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.f106810b
                                    r4.f107319b = r1
                                    java.lang.Object r3 = com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45851b.m88477a(r0, r4)
                                    if (r3 != r2) goto L_0x0021
                                    return r2
                                L_0x0042:
                                    r1 = 0
                                    goto L_0x0029
                                L_0x0044:
                                    com.ss.android.ugc.aweme.editSticker.text.bean.a$a r4 = new com.ss.android.ugc.aweme.editSticker.text.bean.a$a
                                    r4.<init>(r5, r6)
                                    goto L_0x0013
                                L_0x004a:
                                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r0)
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46079a.mo78272a(h.c.d):java.lang.Object");
                            }

                            public /* synthetic */ C46079a(Effect effect, C46090g gVar) {
                                this(effect, new HashSet(), gVar);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            private C46079a(Effect effect, Set<C46091h> set, C46090g gVar) {
                                super(effect);
                                C89219l.m154721d(effect, "");
                                C89219l.m154721d(set, "");
                                C89219l.m154721d(gVar, "");
                                this.f107315c = null;
                                this.f107316d = set;
                                this.f107317e = gVar;
                            }

                            /* renamed from: a */
                            public final Object mo78271a(Context context, List<C46091h> list, AbstractC89124d<? super C89391z> dVar) {
                                Object a = C89624i.m155554a(C89546bf.f203267b, new C46081b(this, list, context, null), dVar);
                                if (a == EnumC89098a.COROUTINE_SUSPENDED) {
                                    return a;
                                }
                                return C89391z.f203057a;
                            }
                        }
