package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.settings.C68758v;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bf */
public final class C61144bf extends AbstractC61087a {
    static {
        Covode.recordClassIndex(71749);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61087a
    /* renamed from: c */
    public final AbstractC88433f<C61198q> mo98636c() {
        return new C61146b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61087a
    /* renamed from: d */
    public final AbstractC88433f<C61197p> mo98637d() {
        return new C61145a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bf$a */
    public static final class C61145a implements AbstractC88433f<C61197p> {

        /* renamed from: a */
        final /* synthetic */ C61144bf f138830a;

        /* renamed from: b */
        private int f138831b;

        /* renamed from: c */
        private int f138832c;

        /* renamed from: d */
        private boolean f138833d;

        static {
            Covode.recordClassIndex(71750);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61145a(C61144bf bfVar) {
            this.f138830a = bfVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C61197p pVar) {
            int i;
            C61173h hVar;
            C61197p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            int i2 = pVar2.f138940a;
            int i3 = pVar2.f138941b;
            Effect effect = pVar2.f138942c;
            long j = pVar2.f138943d;
            if (i3 != -102) {
                if (i3 == -104 && (hVar = this.f138830a.f138640b) != null) {
                    hVar.mo98718b(effect);
                }
                if (-100 == i2) {
                    this.f138831b = i3;
                } else if (-101 == i2) {
                    this.f138832c = i3;
                }
                C61173h hVar2 = this.f138830a.f138640b;
                if (hVar2 != null) {
                    if (TextUtils.isEmpty(this.f138830a.f138642d)) {
                        i = this.f138831b;
                    } else {
                        i = (this.f138831b + this.f138832c) / 2;
                    }
                    hVar2.mo98713a(i, effect, Long.valueOf(j));
                }
            } else if (!this.f138833d) {
                this.f138833d = true;
                C61173h hVar3 = this.f138830a.f138640b;
                if (hVar3 != null) {
                    hVar3.mo98715a(effect);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bf$b */
    static final class C61146b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C61144bf f138834a;

        static {
            Covode.recordClassIndex(71751);
        }

        C61146b(C61144bf bfVar) {
            this.f138834a = bfVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C61198q qVar = (C61198q) obj;
            String str2 = qVar.f138944a;
            Integer num = qVar.f138946c;
            Effect effect = qVar.f138948e;
            Integer num2 = qVar.f138949f;
            if (num2 != null && num2.intValue() == -105) {
                C61173h hVar = this.f138834a.f138640b;
                if (hVar != null) {
                    if (effect != null) {
                        str = effect.getEffectId();
                    } else {
                        str = null;
                    }
                    hVar.mo98716a(str, effect);
                }
            } else if ((num != null && num.intValue() == -103) || TextUtils.isEmpty(str2)) {
                C61173h hVar2 = this.f138834a.f138640b;
                if (hVar2 != null) {
                    C89219l.m154716b(qVar, "");
                    hVar2.mo98717b(qVar);
                }
            } else {
                C61173h hVar3 = this.f138834a.f138640b;
                if (hVar3 != null) {
                    C89219l.m154716b(qVar, "");
                    hVar3.mo98714a(qVar);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61087a
    /* renamed from: a */
    public final void mo98633a(Map<String, String> map, AbstractC61172g gVar) {
        if (C68758v.m121190a()) {
            C61173h hVar = this.f138640b;
            if (hVar != null) {
                hVar.f138887c = gVar;
            }
            mo98632a(map);
            return;
        }
        C61173h hVar2 = this.f138640b;
        if (hVar2 != null) {
            hVar2.mo98719a(gVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61144bf(android.content.Context r4, java.lang.String r5, com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel r6, com.p2082ss.android.ugc.aweme.music.C60789f r7) {
        /*
            r3 = this;
            java.lang.String r2 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r2)
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r2)
            android.content.Context r1 = r4.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x0017
        L_0x0010:
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r2)
            r3.<init>(r1, r5, r6, r7)
            return
        L_0x0017:
            if (r1 == 0) goto L_0x001a
            goto L_0x0010
        L_0x001a:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.C61144bf.<init>(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, com.ss.android.ugc.aweme.music.f):void");
    }
}
