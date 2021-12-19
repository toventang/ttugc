package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.l */
public final class C61177l extends AbstractC61087a {
    static {
        Covode.recordClassIndex(71782);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61087a
    /* renamed from: c */
    public final AbstractC88433f<C61198q> mo98636c() {
        return new C61179b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61087a
    /* renamed from: d */
    public final AbstractC88433f<C61197p> mo98637d() {
        return new C61178a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.l$a */
    public static final class C61178a implements AbstractC88433f<C61197p> {

        /* renamed from: a */
        final /* synthetic */ C61177l f138903a;

        /* renamed from: b */
        private int f138904b;

        /* renamed from: c */
        private int f138905c;

        /* renamed from: d */
        private boolean f138906d;

        static {
            Covode.recordClassIndex(71783);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61178a(C61177l lVar) {
            this.f138903a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C61197p pVar) {
            int i;
            C61197p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            int i2 = pVar2.f138940a;
            int i3 = pVar2.f138941b;
            Effect effect = pVar2.f138942c;
            long j = pVar2.f138943d;
            if (i3 == -102) {
                if (!this.f138906d) {
                    this.f138906d = true;
                    C61173h hVar = this.f138903a.f138640b;
                    if (hVar != null) {
                        hVar.mo98715a(effect);
                    }
                }
            } else if (i3 == -104) {
                C61173h hVar2 = this.f138903a.f138640b;
                if (hVar2 != null) {
                    hVar2.mo98718b(effect);
                }
            } else {
                if (-100 == i2) {
                    this.f138904b = i3;
                } else if (-101 == i2) {
                    this.f138905c = i3;
                }
                C61173h hVar3 = this.f138903a.f138640b;
                if (hVar3 != null) {
                    if (this.f138903a.f138643e == null) {
                        i = this.f138905c;
                    } else {
                        i = (this.f138904b + this.f138905c) / 2;
                    }
                    hVar3.mo98713a(i, effect, Long.valueOf(j));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.l$b */
    static final class C61179b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C61177l f138907a;

        static {
            Covode.recordClassIndex(71784);
        }

        C61179b(C61177l lVar) {
            this.f138907a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r3 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
            if (r3.intValue() != -105) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
            r1 = r5.f138907a.f138640b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
            if (r4 == null) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            r0 = r4.getEffectId();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            r1.mo98716a(r0, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            if (r3.intValue() != -105) goto L_0x0010;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.music.ui.q r6 = (com.p2082ss.android.ugc.aweme.music.p3481ui.C61198q) r6
                com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r6.f138948e
                java.lang.Integer r3 = r6.f138949f
                java.lang.String r2 = ""
                if (r3 != 0) goto L_0x0024
            L_0x000a:
                r1 = -105(0xffffffffffffff97, float:NaN)
                if (r4 != 0) goto L_0x002d
                if (r3 != 0) goto L_0x001d
            L_0x0010:
                com.ss.android.ugc.aweme.music.ui.l r0 = r5.f138907a
                com.ss.android.ugc.aweme.music.ui.h r0 = r0.f138640b
                if (r0 == 0) goto L_0x001c
                p4600h.p4611f.p4613b.C89219l.m154716b(r6, r2)
                r0.mo98717b(r6)
            L_0x001c:
                return
            L_0x001d:
                int r0 = r3.intValue()
                if (r0 == r1) goto L_0x003c
                goto L_0x0010
            L_0x0024:
                int r1 = r3.intValue()
                r0 = -103(0xffffffffffffff99, float:NaN)
                if (r1 == r0) goto L_0x0010
                goto L_0x000a
            L_0x002d:
                if (r3 != 0) goto L_0x003c
            L_0x002f:
                com.ss.android.ugc.aweme.music.ui.l r0 = r5.f138907a
                com.ss.android.ugc.aweme.music.ui.h r0 = r0.f138640b
                if (r0 == 0) goto L_0x003b
                p4600h.p4611f.p4613b.C89219l.m154716b(r6, r2)
                r0.mo98714a(r6)
            L_0x003b:
                return
            L_0x003c:
                int r0 = r3.intValue()
                if (r0 != r1) goto L_0x002f
                com.ss.android.ugc.aweme.music.ui.l r0 = r5.f138907a
                com.ss.android.ugc.aweme.music.ui.h r1 = r0.f138640b
                if (r1 == 0) goto L_0x0051
                if (r4 == 0) goto L_0x0052
                java.lang.String r0 = r4.getEffectId()
            L_0x004e:
                r1.mo98716a(r0, r4)
            L_0x0051:
                return
            L_0x0052:
                r0 = 0
                goto L_0x004e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.C61177l.C61179b.accept(java.lang.Object):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61087a
    /* renamed from: a */
    public final void mo98633a(Map<String, String> map, AbstractC61172g gVar) {
        C61173h hVar = this.f138640b;
        if (hVar != null) {
            hVar.mo98719a(gVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61177l(android.content.Context r9, java.lang.String r10, com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel r11) {
        /*
            r8 = this;
            java.lang.String r2 = ""
            r3 = r9
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r2)
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x0022
        L_0x000e:
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r2)
            com.ss.android.ugc.aweme.music.f r2 = new com.ss.android.ugc.aweme.music.f
            r4 = 0
            r5 = 1
            r6 = 1
            java.lang.String r7 = "prop_detail_page"
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 2
            r2.f138135a = r0
            r8.<init>(r1, r10, r11, r2)
            return
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            goto L_0x000e
        L_0x0025:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.C61177l.<init>(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel):void");
    }
}
