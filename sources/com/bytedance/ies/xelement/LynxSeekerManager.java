package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1367d.C19056a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxSeekerManager extends LynxUI<C19056a> {

    /* renamed from: a */
    public static final C18930a f44814a = new C18930a((byte) 0);

    static {
        Covode.recordClassIndex(21665);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            int i = 0;
            if (hashCode != -1992012396) {
                if (hashCode == 261482029 && nextKey.equals("currentDuration")) {
                    if (!readableMap.isNull(nextKey)) {
                        i = readableMap.getInt(nextKey, 0);
                    }
                    setProgress(i);
                }
            } else if (nextKey.equals("duration")) {
                if (!readableMap.isNull(nextKey)) {
                    i = readableMap.getInt(nextKey, 0);
                }
                setDuration(i);
            }
            super.dispatchProperties(vVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxSeekerManager$a */
    public static final class C18930a {
        static {
            Covode.recordClassIndex(21668);
        }

        private C18930a() {
        }

        public /* synthetic */ C18930a(byte b) {
            this();
        }
    }

    public LynxSeekerManager(AbstractC28520j jVar) {
        super(jVar);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ C19056a createView(Context context) {
        C19056a aVar = new C19056a(context);
        aVar.setStateReporter(new C18931b(this));
        return aVar;
    }

    @AbstractC28525m(mo49059a = "currentDuration")
    public final void setProgress(int i) {
        View view = this.mView;
        C89219l.m154709a((Object) view, "");
        ((C19056a) view).setProgress(i);
    }

    @AbstractC28525m(mo49059a = "duration")
    public final void setDuration(int i) {
        View view = this.mView;
        C89219l.m154709a((Object) view, "");
        ((C19056a) view).setEnabled(true);
        View view2 = this.mView;
        C89219l.m154709a((Object) view2, "");
        ((C19056a) view2).setMax(i);
    }

    /* renamed from: com.bytedance.ies.xelement.LynxSeekerManager$b */
    static final class C18931b extends AbstractC89220m implements AbstractC89187q<String, Map<String, ? extends Object>, C19056a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxSeekerManager f44815a;

        static {
            Covode.recordClassIndex(21669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18931b(LynxSeekerManager lynxSeekerManager) {
            super(3);
            this.f44815a = lynxSeekerManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[LOOP:0: B:14:0x0050->B:16:0x0056, LOOP_END] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, com.bytedance.ies.xelement.p1367d.C19056a r10) {
            /*
            // Method dump skipped, instructions count: 136
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxSeekerManager.C18931b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
