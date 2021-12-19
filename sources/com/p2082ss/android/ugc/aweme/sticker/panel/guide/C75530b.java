package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75547h;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.b */
public final class C75530b implements AbstractC75546g {

    /* renamed from: b */
    public static final C75535a f169762b = new C75535a((byte) 0);

    /* renamed from: a */
    public AbstractC75547h f169763a;

    /* renamed from: c */
    private final List<AbstractC89187q<Effect, ExtraParams, C27910f, AbstractC75544f>> f169764c;

    /* renamed from: d */
    private final AbstractC89171a<C27910f> f169765d;

    static {
        Covode.recordClassIndex(88454);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.b$a */
    public static final class C75535a {
        static {
            Covode.recordClassIndex(88459);
        }

        private C75535a() {
        }

        public /* synthetic */ C75535a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo119248a(AbstractC89187q<? super Effect, ? super ExtraParams, ? super C27910f, ? extends AbstractC75544f> qVar) {
        C89219l.m154721d(qVar, "");
        this.f169764c.add(qVar);
    }

    private C75530b(AbstractC89171a<C27910f> aVar) {
        this.f169765d = aVar;
        this.f169764c = new ArrayList();
        mo119248a(new AbstractC89187q<Effect, ExtraParams, C27910f, AbstractC75544f>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75530b.C755311 */

            /* renamed from: a */
            final /* synthetic */ C75530b f169766a;

            static {
                Covode.recordClassIndex(88455);
            }

            {
                this.f169766a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ AbstractC75544f invoke(Effect effect, ExtraParams extraParams, C27910f fVar) {
                Effect effect2 = effect;
                ExtraParams extraParams2 = extraParams;
                C89219l.m154721d(effect2, "");
                C89219l.m154721d(fVar, "");
                if (extraParams2 == null || !extraParams2.isGifValid()) {
                    return null;
                }
                return new C75536c(effect2, extraParams2, new AbstractC75547h(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75530b.C755311.C755321 */

                    /* renamed from: a */
                    final /* synthetic */ C755311 f169767a;

                    static {
                        Covode.recordClassIndex(88456);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f169767a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75547h
                    /* renamed from: a */
                    public final void mo119249a(boolean z, Effect effect, AbstractC75547h.EnumC75548a aVar) {
                        C89219l.m154721d(effect, "");
                        C89219l.m154721d(aVar, "");
                        AbstractC75547h hVar = this.f169767a.f169766a.f169763a;
                        if (hVar != null) {
                            hVar.mo119249a(z, effect, aVar);
                        }
                    }
                });
            }
        });
        mo119248a(new AbstractC89187q<Effect, ExtraParams, C27910f, AbstractC75544f>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75530b.C755332 */

            /* renamed from: a */
            final /* synthetic */ C75530b f169768a;

            static {
                Covode.recordClassIndex(88457);
            }

            {
                this.f169768a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ AbstractC75544f invoke(Effect effect, ExtraParams extraParams, C27910f fVar) {
                Effect effect2 = effect;
                ExtraParams extraParams2 = extraParams;
                C89219l.m154721d(effect2, "");
                C89219l.m154721d(fVar, "");
                if (extraParams2 == null || !extraParams2.isLottieValid()) {
                    return null;
                }
                return new C75551k(effect2, extraParams2, new AbstractC75547h(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75530b.C755332.C755341 */

                    /* renamed from: a */
                    final /* synthetic */ C755332 f169769a;

                    static {
                        Covode.recordClassIndex(88458);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f169769a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75547h
                    /* renamed from: a */
                    public final void mo119249a(boolean z, Effect effect, AbstractC75547h.EnumC75548a aVar) {
                        C89219l.m154721d(effect, "");
                        C89219l.m154721d(aVar, "");
                        AbstractC75547h hVar = this.f169769a.f169768a.f169763a;
                        if (hVar != null) {
                            hVar.mo119249a(z, effect, aVar);
                        }
                    }
                });
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75546g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f mo119247a(com.p2082ss.android.ugc.effectmanager.effect.model.Effect r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0008
            com.ss.android.ugc.aweme.sticker.panel.guide.f$a r0 = new com.ss.android.ugc.aweme.sticker.panel.guide.f$a
            r0.<init>()
            return r0
        L_0x0008:
            h.f.a.a<com.google.gson.f> r0 = r4.f169765d
            java.lang.Object r3 = r0.invoke()
            com.google.gson.f r3 = (com.google.gson.C27910f) r3
            java.lang.String r2 = r5.getExtra()
            if (r2 == 0) goto L_0x001c
            int r0 = r2.length()
            if (r0 != 0) goto L_0x004b
        L_0x001c:
            r0 = 1
        L_0x001d:
            r1 = 0
            if (r0 == 0) goto L_0x0042
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.List<h.f.a.q<com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams, com.google.gson.f, com.ss.android.ugc.aweme.sticker.panel.guide.f>> r1 = r4.f169764c
            java.util.Iterator r2 = r1.iterator()
        L_0x0027:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r2.next()
            h.f.a.q r1 = (p4600h.p4611f.p4612a.AbstractC89187q) r1
            java.lang.Object r1 = r1.invoke(r5, r0, r3)
            com.ss.android.ugc.aweme.sticker.panel.guide.f r1 = (com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f) r1
            if (r1 == 0) goto L_0x0027
        L_0x003b:
            return r1
        L_0x003c:
            com.ss.android.ugc.aweme.sticker.panel.guide.a.a r1 = new com.ss.android.ugc.aweme.sticker.panel.guide.a.a
            r1.<init>(r5)
            goto L_0x003b
        L_0x0042:
            java.lang.Class<com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams> r0 = com.p2082ss.android.ugc.aweme.sticker.panel.guide.ExtraParams.class
            java.lang.Object r0 = r3.mo46670a(r2, r0)     // Catch:{ Exception -> 0x0020 }
            com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams r0 = (com.p2082ss.android.ugc.aweme.sticker.panel.guide.ExtraParams) r0     // Catch:{ Exception -> 0x0020 }
            goto L_0x0021
        L_0x004b:
            r0 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75530b.mo119247a(com.ss.android.ugc.effectmanager.effect.model.Effect):com.ss.android.ugc.aweme.sticker.panel.guide.f");
    }

    public /* synthetic */ C75530b(AbstractC89171a aVar, byte b) {
        this(aVar);
    }
}
