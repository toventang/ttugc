package com.p2082ss.android.ugc.aweme.specact.popup.p3943b;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.specact.popup.calendar.C75190a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75116a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75125j;
import com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75153e;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.b.d */
public final class C75151d {

    /* renamed from: a */
    public static final C75151d f168976a = new C75151d();

    private C75151d() {
    }

    static {
        Covode.recordClassIndex(88027);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.d$a */
    public static final class C75152a extends AbstractC89220m implements AbstractC89183m<DialogC75175j, C75153e, C89391z> {

        /* renamed from: a */
        public static final C75152a f168977a = new C75152a();

        static {
            Covode.recordClassIndex(88028);
        }

        C75152a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogC75175j jVar, C75153e eVar) {
            DialogC75175j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            C89219l.m154721d(eVar, "");
            jVar2.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m131903a(Activity activity, C75124i iVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(iVar, "");
        C75153e eVar = new C75153e(iVar);
        eVar.f168978a = iVar.f168888h;
        eVar.f168979b = iVar.f168886f;
        eVar.f168981d = new C75153e.C75157c(iVar.f168891k.get(0).f168855a);
        eVar.f168987j = iVar.f168891k.get(0).f168856b;
        eVar.f168988k = new C75153e.C75155a(iVar.f168892l.get(0).f168858a, C75153e.EnumC75156b.YELLOW, null, null, 12);
        eVar.mo118313a(iVar.f168898r);
        new DialogC75175j(activity, eVar).show();
    }

    /* renamed from: c */
    public static void m131905c(Activity activity, C75124i iVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(iVar, "");
        C75153e eVar = new C75153e(iVar);
        eVar.f168978a = iVar.f168888h;
        eVar.f168979b = iVar.f168886f;
        eVar.f168981d = new C75153e.C75157c(iVar.f168891k.get(0).f168855a, C75153e.EnumC75158d.COIN);
        eVar.f168987j = iVar.f168891k.get(0).f168856b;
        eVar.f168988k = new C75153e.C75155a(iVar.f168892l.get(0).f168858a, C75153e.EnumC75156b.YELLOW, null, null, 12);
        eVar.mo118313a(iVar.f168898r);
        new DialogC75175j(activity, eVar).show();
    }

    /* renamed from: d */
    public static void m131906d(Activity activity, C75124i iVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(iVar, "");
        C75153e eVar = new C75153e(iVar);
        eVar.f168978a = iVar.f168888h;
        eVar.f168979b = iVar.f168886f;
        eVar.f168987j = iVar.f168887g;
        eVar.mo118313a(iVar.f168898r);
        if (C75190a.m131925a(activity, C75190a.m131922a(iVar.f168884d, "register"))) {
            String string = activity.getString(R.string.dki);
            C89219l.m154716b(string, "");
            eVar.f168988k = new C75153e.C75155a(string, C75153e.EnumC75156b.SIMPLE, null, null, 12);
            eVar.f168989l = C75152a.f168977a;
            eVar.f168990m = true;
        } else {
            eVar.f168990m = false;
            eVar.f168988k = new C75153e.C75155a(iVar.f168892l.get(0).f168858a, C75153e.EnumC75156b.SIMPLE, C75153e.EnumC75158d.CALENDAR, null, 8);
        }
        new DialogC75175j(activity, eVar).show();
    }

    /* renamed from: e */
    public static void m131907e(Activity activity, C75124i iVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(iVar, "");
        C75153e eVar = new C75153e(iVar);
        eVar.f168978a = iVar.f168888h;
        eVar.f168979b = iVar.f168886f;
        eVar.f168985h = C75153e.EnumC75158d.COIN2;
        eVar.f168987j = iVar.f168891k.get(0).f168856b;
        eVar.f168988k = new C75153e.C75155a(iVar.f168892l.get(0).f168858a, C75153e.EnumC75156b.YELLOW, null, null, 12);
        eVar.mo118313a(iVar.f168898r);
        new DialogC75175j(activity, eVar).show();
    }

    /* renamed from: f */
    public static void m131908f(Activity activity, C75124i iVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(iVar, "");
        C75153e eVar = new C75153e(iVar);
        eVar.f168978a = iVar.f168888h;
        eVar.f168979b = iVar.f168886f;
        eVar.f168981d = new C75153e.C75157c(iVar.f168891k.get(0).f168855a);
        eVar.f168987j = iVar.f168891k.get(0).f168856b;
        eVar.f168988k = new C75153e.C75155a(iVar.f168892l.get(0).f168858a, C75153e.EnumC75156b.YELLOW, null, iVar.f168892l.get(0).f168860c);
        eVar.mo118313a(iVar.f168898r);
        eVar.f168982e = iVar.f168889i;
        eVar.f168983f = iVar.f168890j;
        new DialogC75175j(activity, eVar).show();
    }

    /* renamed from: b */
    public static void m131904b(Activity activity, C75124i iVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(iVar, "");
        C75153e eVar = new C75153e(iVar);
        eVar.f168978a = iVar.f168888h;
        eVar.f168979b = iVar.f168886f;
        eVar.f168980c = iVar.f168887g;
        ArrayList arrayList = new ArrayList();
        if (!iVar.f168891k.isEmpty()) {
            for (C75116a aVar : iVar.f168891k) {
                for (C75125j jVar : aVar.f168857c) {
                    arrayList.add(new C75153e.C75159e(jVar.f168901b, jVar.f168900a, jVar.f168903d));
                }
            }
        }
        Object[] array = arrayList.toArray(new C75153e.C75159e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        eVar.f168986i = (C75153e.C75159e[]) array;
        eVar.f168988k = new C75153e.C75155a(iVar.f168892l.get(0).f168858a, C75153e.EnumC75156b.YELLOW, null, null, 12);
        eVar.mo118313a(iVar.f168898r);
        new DialogC75175j(activity, eVar).show();
    }
}
