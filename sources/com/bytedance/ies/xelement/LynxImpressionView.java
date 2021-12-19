package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public class LynxImpressionView extends UISimpleView<C28698a> {

    /* renamed from: c */
    public static final String f44766c;

    /* renamed from: d */
    public static final C18914a f44767d = new C18914a((byte) 0);

    /* renamed from: a */
    boolean f44768a;

    /* renamed from: b */
    boolean f44769b;

    /* renamed from: e */
    private int f44770e;

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 788775041 && nextKey.equals("impression-percent")) {
                int i = 0;
                if (!readableMap.isNull(nextKey)) {
                    i = readableMap.getInt(nextKey, 0);
                }
                impressionPercent(i);
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxImpressionView$a */
    public static final class C18914a {
        static {
            Covode.recordClassIndex(21634);
        }

        private C18914a() {
        }

        public /* synthetic */ C18914a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(21631);
        String simpleName = LynxImpressionView.class.getSimpleName();
        C89219l.m154709a((Object) simpleName, "");
        f44766c = simpleName;
    }

    @AbstractC28525m(mo49059a = "impression-percent", mo49063e = 0)
    public void impressionPercent(int i) {
        this.f44770e = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxImpressionView(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        C89219l.m154719c(context, "");
        return new C28698a(context);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, ? extends C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f44768a = map.containsKey("impression");
            this.f44769b = map.containsKey("exit");
        }
    }
}
