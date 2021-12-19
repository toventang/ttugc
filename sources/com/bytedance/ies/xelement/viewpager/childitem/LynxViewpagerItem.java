package com.bytedance.ies.xelement.viewpager.childitem;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxViewpagerItem extends UIGroup<C28698a> {

    /* renamed from: c */
    public static final C19462a f46123c = new C19462a((byte) 0);

    /* renamed from: a */
    public String f46124a;

    /* renamed from: b */
    public AbstractC19463b f46125b;

    /* renamed from: d */
    private boolean f46126d;

    /* renamed from: com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem$b */
    public interface AbstractC19463b {
        static {
            Covode.recordClassIndex(22307);
        }

        /* renamed from: a */
        void mo31069a(String str);
    }

    static {
        Covode.recordClassIndex(22303);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 114586 && nextKey.equals("tag")) {
                setTag(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem$a */
    public static final class C19462a {
        static {
            Covode.recordClassIndex(22306);
        }

        private C19462a() {
        }

        public /* synthetic */ C19462a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new C28698a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxViewpagerItem(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f46126d = map.containsKey("attach");
        }
    }

    @AbstractC28525m(mo49059a = "tag")
    public final void setTag(String str) {
        C89219l.m154719c(str, "");
        this.f46124a = str;
        AbstractC19463b bVar = this.f46125b;
        if (bVar != null) {
            bVar.mo31069a(str);
        }
    }

    /* renamed from: a */
    public final void mo31125a(boolean z, int i) {
        if (this.f46126d) {
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            C28719c cVar = jVar.f67064e;
            C28725c cVar2 = new C28725c(getSign(), "attach");
            cVar2.mo49838a("attach", Boolean.valueOf(z));
            cVar2.mo49838a("tag", String.valueOf(this.f46124a));
            cVar2.mo49838a("index", Integer.valueOf(i));
            cVar.mo49834a(cVar2);
        }
    }
}
