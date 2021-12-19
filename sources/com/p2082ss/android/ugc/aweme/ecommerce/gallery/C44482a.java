package com.p2082ss.android.ugc.aweme.ecommerce.gallery;

import android.content.Context;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a.C44490a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a.C44491b;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44496a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44503d;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.DialogInterface$OnKeyListenerC44515g;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.a */
public final class C44482a {

    /* renamed from: a */
    public static final C44482a f103697a = new C44482a();

    private C44482a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.a$a */
    public static final class C44483a {
        @AbstractC27891c(mo46611a = "title")

        /* renamed from: a */
        public final String f103698a;
        @AbstractC27891c(mo46611a = "url_list")

        /* renamed from: b */
        public final List<String> f103699b;

        static {
            Covode.recordClassIndex(52831);
        }

        private /* synthetic */ C44483a() {
            this(C89086z.INSTANCE);
        }

        private C44483a(List<String> list) {
            C89219l.m154721d(list, "");
            this.f103698a = null;
            this.f103699b = list;
        }
    }

    static {
        Covode.recordClassIndex(52830);
    }

    /* renamed from: a */
    public static /* synthetic */ void m87167a(Context context, int i, int i2, List list, String str, String str2, List list2, C44503d.AbstractC44505b bVar, C44503d.AbstractC44506c cVar, C44490a aVar, int i3) {
        long j;
        C44491b bVar2;
        C44490a aVar2 = aVar;
        if ((i3 & 16) != 0) {
            str = "";
        }
        if ((i3 & 32) != 0) {
            str2 = "";
        }
        if ((i3 & 128) != 0) {
            list2 = null;
        }
        if ((i3 & 512) != 0) {
            bVar = null;
        }
        if ((i3 & 1024) != 0) {
            cVar = null;
        }
        if ((i3 & 8192) != 0) {
            aVar2 = new C44490a();
        }
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C44503d.C44504a aVar3 = new C44503d.C44504a();
        aVar3.f103775i = list;
        aVar3.f103774h = list;
        aVar3.f103776j = list2;
        aVar3.f103777k = aVar2;
        aVar3.f103778l = new C44491b();
        aVar3.f103771e = true;
        aVar3.f103768b = R.drawable.yk;
        aVar3.f103769c = -16777216;
        aVar3.f103780n = true;
        aVar3.f103781o = bVar;
        aVar3.f103783q = null;
        int i4 = 0;
        aVar3.f103782p = false;
        aVar3.f103784r = cVar;
        aVar3.f103772f = str;
        aVar3.f103773g = str2;
        C44503d dVar = new C44503d();
        dVar.f103745a = aVar3.f103767a;
        dVar.f103746b = aVar3.f103768b;
        dVar.f103747c = aVar3.f103769c;
        dVar.f103748d = aVar3.f103770d;
        dVar.f103749e = aVar3.f103771e;
        if (!C13603b.m24435a((Collection) aVar3.f103774h)) {
            dVar.f103765u = aVar3.f103774h.size();
            dVar.f103754j = aVar3.f103774h;
            dVar.f103755k = aVar3.f103775i;
            dVar.f103756l = aVar3.f103776j;
        }
        dVar.f103757m = aVar3.f103777k;
        dVar.f103758n = aVar3.f103778l;
        dVar.f103760p = aVar3.f103780n;
        dVar.f103759o = aVar3.f103779m;
        dVar.f103761q = aVar3.f103782p;
        dVar.f103762r = aVar3.f103781o;
        dVar.f103764t = aVar3.f103783q;
        dVar.f103763s = aVar3.f103784r;
        dVar.f103752h = aVar3.f103773g;
        dVar.f103751g = aVar3.f103772f;
        DialogInterface$OnKeyListenerC44515g gVar = new DialogInterface$OnKeyListenerC44515g(context);
        if (i >= i2) {
            C89219l.m154716b(dVar, "");
            dVar.f103745a = i2 - 1;
        } else if (i < 0) {
            C89219l.m154716b(dVar, "");
            dVar.f103745a = 0;
        } else {
            C89219l.m154716b(dVar, "");
            dVar.f103745a = i;
        }
        dVar.f103750f = i2;
        if (!gVar.f103812d) {
            gVar.f103811c = dVar;
            ArrayList arrayList = new ArrayList();
            gVar.mo75549a(arrayList);
            gVar.f103811c.f103753i = arrayList;
            C44503d dVar2 = gVar.f103811c;
            if (dVar2.f103754j == null || dVar2.f103754j.isEmpty()) {
                throw new IllegalArgumentException("the parameter sourceImageList can't be empty");
            }
            C44503d dVar3 = gVar.f103811c;
            if (gVar.f103811c.f103745a >= 0) {
                i4 = gVar.f103811c.f103745a;
            }
            dVar3.f103745a = i4;
            C44503d dVar4 = gVar.f103811c;
            if (gVar.f103811c.f103748d <= 0) {
                j = 300;
            } else {
                j = gVar.f103811c.f103748d;
            }
            dVar4.f103748d = j;
            C44503d dVar5 = gVar.f103811c;
            if (gVar.f103811c.f103758n == null) {
                bVar2 = new C44491b();
            } else {
                bVar2 = gVar.f103811c.f103758n;
            }
            dVar5.f103758n = bVar2;
            C44507e eVar = gVar.f103810b;
            eVar.f103787c = dVar;
            eVar.f103788d = new C44496a(eVar);
        }
        if (!gVar.f103812d) {
            gVar.f103809a.show();
            gVar.f103812d = true;
        }
    }
}
