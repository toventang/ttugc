package com.bytedance.ies.xbridge.p1343n.p1345b;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilderAction;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18761c;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18790b;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18794c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.b.c */
public final class C18779c extends AbstractC18761c {
    static {
        Covode.recordClassIndex(21475);
    }

    /* renamed from: com.bytedance.ies.xbridge.n.b.c$a */
    public static final class C18780a implements ShowActionSheetListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC18761c.AbstractC18762a f44557a;

        static {
            Covode.recordClassIndex(21476);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener
        public final void onDismiss() {
            AbstractC18761c.AbstractC18762a aVar = this.f44557a;
            C18794c cVar = new C18794c();
            cVar.f44574a = C18794c.EnumC18796b.DISMISS;
            aVar.mo29805a(cVar, "");
        }

        C18780a(AbstractC18761c.AbstractC18762a aVar) {
            this.f44557a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener
        public final void onSelect(int i) {
            AbstractC18761c.AbstractC18762a aVar = this.f44557a;
            C18794c cVar = new C18794c();
            cVar.f44574a = C18794c.EnumC18796b.SELECT;
            C18794c.C18797c cVar2 = new C18794c.C18797c();
            cVar2.f44578a = Integer.valueOf(i);
            cVar.f44575b = cVar2;
            aVar.mo29805a(cVar, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18761c
    /* renamed from: a */
    public final void mo29804a(C18790b bVar, AbstractC18761c.AbstractC18762a aVar, EnumC18483e eVar) {
        IHostStyleUIDepend iHostStyleUIDepend;
        C18465b bVar2;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null || !(context instanceof ActivityC0945e)) {
            aVar.mo29806a("Context not provided in host");
            return;
        }
        String str = bVar.f44566a;
        String str2 = bVar.f44567b;
        ArrayList arrayList = new ArrayList();
        List<C18790b.C18791a> list = bVar.f44568c;
        if (list == null) {
            C89219l.m154710a("actions");
        }
        for (T t : list) {
            String str3 = t.f44570a;
            if (str3 == null) {
                C89219l.m154710a("title");
            }
            String str4 = t.f44571b;
            String str5 = t.f44572c;
            if (str5 == null) {
                C89219l.m154710a(StringSet.type);
            }
            arrayList.add(new ActionSheetBuilderAction(str3, str4, str5));
        }
        C18780a aVar2 = new C18780a(aVar);
        C18465b bVar3 = (C18465b) mo29616a(C18465b.class);
        Boolean bool = null;
        if (!((bVar3 == null || (iHostStyleUIDepend = bVar3.f44103f) == null) && ((bVar2 = C18465b.f44096l) == null || (iHostStyleUIDepend = bVar2.f44103f) == null))) {
            bool = iHostStyleUIDepend.showActionSheet(new ActionSheetBuilder(context, str, str2, arrayList), aVar2);
        }
        if (true ^ C89219l.m154714a((Object) bool, (Object) true)) {
            aVar.mo29806a("Failed to show actionSheet in host");
        }
    }
}
