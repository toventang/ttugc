package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxBounceView extends UISimpleView<C28698a> {

    /* renamed from: b */
    public static final C18913a f44764b = new C18913a((byte) 0);

    /* renamed from: a */
    public String f44765a = "right";

    static {
        Covode.recordClassIndex(21627);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == -962590849 && nextKey.equals("direction")) {
                setDirection(readableMap.getDynamic(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxBounceView$a */
    public static final class C18913a {
        static {
            Covode.recordClassIndex(21630);
        }

        private C18913a() {
        }

        public /* synthetic */ C18913a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBounceView(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        C89219l.m154719c(context, "");
        return new C28698a(context);
    }

    @AbstractC28525m(mo49059a = "direction", mo49060b = "right")
    public final void setDirection(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        if (aVar.mo48559h() == ReadableType.String) {
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            this.f44765a = e;
        }
    }
}
