package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.AbstractC77868i;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4087b.C77869a;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.j */
public final class C77959j {

    /* renamed from: g */
    public static final C77960a f174895g = new C77960a((byte) 0);

    /* renamed from: a */
    public final AbstractC77868i f174896a = new C77961b(this);

    /* renamed from: b */
    public Context f174897b;

    /* renamed from: c */
    public final int f174898c;

    /* renamed from: d */
    final String f174899d;

    /* renamed from: e */
    final String f174900e;

    /* renamed from: f */
    final boolean f174901f;

    static {
        Covode.recordClassIndex(91048);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.j$a */
    public static final class C77960a {
        static {
            Covode.recordClassIndex(91049);
        }

        private C77960a() {
        }

        public /* synthetic */ C77960a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.j$b */
    public static final class C77961b implements AbstractC77868i {

        /* renamed from: a */
        final /* synthetic */ C77959j f174902a;

        static {
            Covode.recordClassIndex(91050);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.AbstractC77868i
        /* renamed from: b */
        public final BeautyCategoryExtra mo121462b() {
            String valueOf = String.valueOf(this.f174902a.f174898c);
            String flag = EnumC77817a.ALL.getFlag();
            C89219l.m154721d(valueOf, "");
            C89219l.m154721d(flag, "");
            return new BeautyCategoryExtra(valueOf, true, true, false, flag, false, false, false, null, null, null, null, null, false, 16256, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.AbstractC77868i
        /* renamed from: c */
        public final EffectCategoryResponse mo121463c() {
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, 1, null);
            effectCategoryResponse.setId("-10000");
            String string = this.f174902a.f174897b.getResources().getString(R.string.a3p);
            C89219l.m154716b(string, "");
            effectCategoryResponse.setName(string);
            return effectCategoryResponse;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.AbstractC77868i
        /* renamed from: a */
        public final List<C77869a> mo121461a() {
            int i;
            C77959j jVar = this.f174902a;
            ArrayList arrayList = new ArrayList();
            if (jVar.f174901f) {
                i = 35;
            } else {
                i = 60;
            }
            String string = jVar.f174897b.getResources().getString(R.string.y4);
            C89219l.m154716b(string, "");
            arrayList.add(new C77869a(2131232488, "-1000", "-1000", string, jVar.f174899d, i, "Smooth_ALL", (byte) 0));
            if (!jVar.f174901f) {
                String string2 = jVar.f174897b.getResources().getString(R.string.y3);
                C89219l.m154716b(string2, "");
                arrayList.add(new C77869a(2131232489, "-1001", "-1001", string2, jVar.f174900e, 40, "Face_ALL", (byte) 0));
                String string3 = jVar.f174897b.getResources().getString(R.string.xz);
                C89219l.m154716b(string3, "");
                arrayList.add(new C77869a(2131232485, "-1002", "-1002", string3, jVar.f174900e, 30, "Eye_ALL", (byte) 0));
            }
            return arrayList;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77961b(C77959j jVar) {
            this.f174902a = jVar;
        }
    }

    public C77959j(Context context, int i, String str, String str2, boolean z) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f174897b = context;
        this.f174898c = i;
        this.f174899d = str;
        this.f174900e = str2;
        this.f174901f = z;
    }
}
